//experiment -1:Write a C program that contains a string (char pointer) with a value \Hello World’. The program should XOR each character in this string with 0 and displays the result. 
#include<stdio.h>
#include<conio.h>
#include<string.h>
int main(){
char *str="Hello World";
int length,i;
char ch;
clrscr();
length=strlen(str);
ch=str[i]^0;
printf("%c",ch);
}
getch();
return 0;
}
