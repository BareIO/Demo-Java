/**
 * This C++ program simulates a simple login system.
 * It checks if the provided PIN and username match the predefined credentials.
 * If the credentials are correct, it displays a welcome message; otherwise, it displays an error message.
 */

#include <iostream>
using namespace std;

int main(){
    int pass = 1234, pin;  // predefined PIN and user input PIN
    string username = "cabdiqani", name;  // predefined username and user input username

    // Prompt user to enter PIN and username
    cout << "Enter your PIN: ";
    cin >> pin;
    cout << "Enter your username: ";
    cin >> name;

    // Check if PIN and username match the predefined credentials
    if(pin == pass && username == name){
        // Display welcome message if credentials are correct
        cout << "Welcome!\n";
    }
    else{
        // Display error message if credentials are incorrect
        cout << "Wrong PIN or username.\n";
    }
}