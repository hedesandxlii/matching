#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int N;

struct Person {
    char *name;
    int *pref;
};

struct Person *toPerson(char* arg_name, int arg_id, int arg_pref[]) {
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

void GS(){

}



void main() {
    N = 3;
    struct Person *persons[2*N];
    int tmp[] = {6, 4, 2}; 
    persons[0] = addPerson("Ross", 1, tmp);
    printPerson(persons[0]);
}
