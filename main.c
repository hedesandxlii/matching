#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int N;

// STRUCTS
struct Person {
    char *name;
    int *pref;
};

struct List {
    struct Node *last;    
};

struct Node {
    int value;
    struct Node *next;
};



// METODER
void offer(struct List *list, int thing) {
    struct Node *newNode = malloc(sizeof(struct Node));
    newNode->value=thing;

    if( (*list).last==NULL ) {
	(*list).last=newNode;
	(*newNode).next=newNode;
    } else {
	(*newNode).next = list->last->next;
	list->last->next = newNode;
	(*list).last = list->last->next;
    }
}

int poll(struct List *list) {
    int tmp = list->last->next->value;
    return tmp;
}

struct Person *toPerson(char* arg_name, int arg_pref[]) {
    // allocates mem for result, which will be returned.
    struct Person *result = malloc(sizeof(struct Person));
    (*result).name = arg_name; 
    //Allocates memory for the preference array.
    (*result).pref=malloc(sizeof(int)*(N*2+1));
    int a = 1;

    for(int i = 0; i<N; i++) {  
        (*result).pref[arg_pref[i]] = a++;
    }
    return result;
}

void printPerson(const struct Person* p){
    printf("Name: %s\n", p->name);
    printf("Pref: ");
    // doesnt print the 0th element as it doesn't correspond to a person.
    for(int i = 1; i<=2*N+1; i++){
        printf("%d ", p->pref[i]);
    }    
    printf("\n");
}

void GS(){ }



void main() {
    /*
    N = 3;
    struct Person *persons[2*N];
    int tmp[] = {6, 4, 2}; 
    persons[1] = toPerson("Ross", tmp);

    printPerson(persons[1]);
    */
    
    struct List list;
    offer(&list, 1);
    offer(&list, 2);
    offer(&list, 3);
    printf("first element: %d\n", poll(&list));
}
