Obrazec – Registration Form (Android)

A simple Android app written in Java that shows a registration form and, on button click, displays a summary of the entered data in a dialog. Created as an assignment for the course Razvoj mobilnih aplikacij (Mobile Application Development), Task 2.

Features
Registration form with the fields: Username, Full name, Country, Email, Phone number and Password
Gender selection (Male / Female) using RadioGroup and RadioButton
Checkbox "Agree with Terms & Conditions"
Create account button that opens an AlertDialog titled Registration Details
Multi-line summary of all entered data, including Terms Accepted: Yes/No
Whole form is wrapped in a ScrollView, so it works on small screens and with the keyboard open
Project structure
app/src/main/
├── java/com/example/regobr/MainActivity.java   # form logic and dialog
└── res/layout/activity_main.xml                # form UI
How it works
On click of Create account, MainActivity reads the text from every EditText with getText().toString().
The selected gender is read with RadioGroup.getCheckedRadioButtonId() (shows Not selected if nothing is chosen).
The checkbox state is read with CheckBox.isChecked() and shown as Yes or No.
All values are combined into one multi-line message and displayed with AlertDialog.Builder.
Example output
Username: john123
Full name: John Smith
Country: Slovenia
Email: john@example.com
Phone number: 041123456
Password: ********
Gender: Male
Terms Accepted: Yes
Requirements
Android Studio (recent version)
Android SDK, minimum API level as set in the project
Android emulator or a physical Android phone
Running the app
Clone the repository:
   git clone https://github.com/aljo08/Obrazec.git
Open the project in Android Studio (File → Open).
Wait for the Gradle sync to finish.
Select a device and click Run.
Running on a physical phone
Enable Developer options (tap Build number 7 times in Settings → About phone).
Turn on USB debugging (or Wireless debugging on Android 11+).
Connect the phone, confirm the debugging prompt and select it in the device drop-down in Android Studio.
Screenshots

Add screenshots of the form and the dialog here, for example:

![Form](screenshots/Screenshot-podatki)
![Dialog](screenshots/Screenshot-results)
Author

Student project – Mobile Application Development, Task 2.
