//exp-2:Write a C program that contains a string (char pointer) with a value \Hello World’. The program should AND or and XOR each character in this string with 127 and display the result 
#include<stdio.h>
#include<string.h>
int main(){
char *str="Hello World";
int length,i;
char ch;
length=strlen(str);
printf("Original string:%s\n\n",str);
printf("Encrypted string with AND:\n");
for(i=0;i<length;i++){
    ch= str[i]&127;
    printf("%c",ch);
}
printf("\nEncrypted string with XOR:\n");
for(i=0;i<length;i++){
    ch=str[i]^127;
    printf("%c",ch);
}
return 0;
}
