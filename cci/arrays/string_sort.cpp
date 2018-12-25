// Implement an algorithm to determine if a string has all unique characters.

#include <iostream>
#include <string>

using namespace std;

// With addition data Structure
bool a_ds(string str){
    bool charArray[128];
    
    for(int i = 0; i < 128; i++)
    {
        charArray[i] = false;
    }
    
    for(char s:str)
    { 
        if (charArray[int(s)])
            return false;
        else
            charArray[int(s)] = true;
    }
    
    return true;
}



// No additional data structure

// Merge sort array
string merge(string str){
    if(str.length() < 1)
        return str;
    
    int mid = str.length() / 2;

    return "";
}

string merge_sort(string str){

    return "hhhjhj";
}

void n_ds(string str){
    
}


int main(){
    string str;
    getline(cin, str);
    if(a_ds(str))
        cout << "String is unique" << endl;
    else
        cout << "String is not unique" << endl;
    return 0;
}