// =========================
// JAVA BASICS
// =========================

// Loop
for(int i=0; i<str.length(); i++)

// If
if(condition) { }

// String
String str = "text";

// Char
char ch = str.charAt(i);

// Increment
count++;
count = count + 1;

// Lowercase (important)
str = str.toLowerCase();

// Length
str.length()

// Conditions
ch >= 'a' && ch <= 'z'   // letter
ch >= '0' && ch <= '9'   // digit
ch == ' '                // space

// NOT condition
!(condition)



// =========================
// GIT BASICS
// =========================

// Check status (see changes)
git status

// Add file to staging
git add filename

// Add all files
git add .

// Commit changes
git commit -m "message"

// Push to GitHub
git push

// Pull latest changes
git pull

// Check commit history
git log



// =========================
// GIT CONCEPTS (IMPORTANT)
// =========================

// Working Directory → where you write code

// Staging Area → where you select files
// (Git Staging in Eclipse)

// Commit → saves snapshot locally

// Push → sends commit to GitHub



// =========================
// IMPORTANT FLOW
// =========================

// Step 1: Edit file
// Step 2: Stage file
// Step 3: Commit
// Step 4: Push

// (Edit → Stage → Commit → Push)



// =========================
// GIT RULES (VERY IMPORTANT)
// =========================

// Push only sends committed changes

// If not committed → NOT visible on GitHub

// You control what goes into commit (staging)



// =========================
// .GITIGNORE
// =========================

// Ignore unwanted files

.classpath
.project
.settings/
bin/

// Prevents future tracking


// =========================
// COMMON MISTAKES
// =========================

// Edit → Push ❌ (wrong)
// Edit → Commit → Push ✅ (correct)

// Adding unwanted files ❌
// Using .gitignore ✅



// =========================
// QA MINDSET (IMPORTANT)
// =========================

// Staging = selecting tested features

// Commit = approved release

// Push = deploy to production (GitHub)

// =========================
// USER INPUT (Scanner)
// =========================

// Import Scanner
import java.util.Scanner;

// Create Scanner object
Scanner sc = new Scanner(System.in);

// Read full line (important)
String str = sc.nextLine();

// Close scanner
sc.close();


// =========================
// STRING CLEANING
// =========================

// Remove spaces from start and end
str = str.trim();

// =========================
// SPLIT STRING
// =========================

// Split string into words
String[] arr = str.split("\\s+");

// \\s+ means:
// split on one or more spaces

// =========================
// ARRAY BASICS
// =========================

// Declare array
String[] arr;

// Length of array
arr.length;


// =========================
// PRINT ARRAY (IMPORTANT)
// =========================

// Cannot print array directly ❌
System.out.println(arr); // WRONG

// Must use loop ✅
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// String loop → use str.length() and charAt(i)
// Array loop → use arr.length and arr[i]

// =========================
// WORD COUNT (SIMPLE WAY)
// =========================

// Number of words = array length
int wordCount = arr.length;



// =========================
// KEY LEARNING (VERY IMPORTANT)
// =========================

// trim() → removes spaces from start/end

// split("\\s+") → handles multiple spaces

// Arrays cannot be printed directly

// nextLine() reads full sentence (not just one word)

=========================
DAY 5 – CHARACTER CLASSIFICATION
=========================
// Day 5: Classified each character using one loop and condition hierarchy
// =========================
// CHARACTER TYPES
// =========================

// Vowels
a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'

// Consonants (letters but not vowels)
a >= 'a' && a <= 'z'

// Digits
a >= '0' && a <= '9'

// Space
a == ' '

// Special Characters
// Anything that is NOT letter, digit, or space



// =========================
// IMPORTANT LOGIC (ORDER MATTERS)
// =========================

// Always check in this order:

// 1. Vowels
// 2. Consonants
// 3. Digits
// 4. Spaces
// 5. Special Characters (else)

// Reason:
// Avoid overlapping conditions



// =========================
// ONE LOOP APPROACH
// =========================

// Use single loop to classify everything

for(int i = 0; i < str.length(); i++) {
    char a = str.charAt(i);
}



// =========================
// LOWERCASE SIMPLIFICATION
// =========================

// Convert once to avoid checking A-Z and a-z
str = str.toLowerCase();



// =========================
// ELSE-IF IMPORTANCE
// =========================

// Use else-if so each character is counted ONLY once

if(...) {
}
else if(...) {
}
else if(...) {
}



// =========================
// KEY LEARNING (VERY IMPORTANT)
// =========================

// Each character should fall into ONLY ONE category

// Order of conditions affects output

// Always simplify problem (like using toLowerCase())

// One loop is more efficient than multiple loops

=========================
DAY 6 – DUPLICATE CHARACTERS
=========================

// Problem:
// Find duplicate characters in a string (print + count)

// =========================
// CORE IDEA
// =========================

// Compare each character with remaining characters

for(int i = 0; i < str.length(); i++) {
    char a = str.charAt(i);
    
    for(int j = i + 1; j < str.length(); j++) {
        // compare a with next characters
    }
}

// =========================
// IMPORTANT CONDITIONS
// =========================

// Skip spaces
if(a == ' ') {
    continue;
}

// =========================
// DUPLICATE CHECK
// =========================

// Check if same character appears later

if(str.charAt(j) == a) {
    isDuplicate = true;
    break; // stop after first match
}

// =========================
// ALREADY CHECKED LOGIC
// =========================

// Avoid counting same character again

for(int k = 0; k < i; k++) {
    if(str.charAt(k) == a) {
        alreadyChecked = true;
        break;
    }
}

// =========================
// RESET VARIABLES (VERY IMPORTANT)
// =========================

// Must reset for every character

boolean alreadyChecked = false;
boolean isDuplicate = false;

// =========================
// CONTINUE USAGE
// =========================

// Skip current iteration and move to next loop

continue;

// Used when:
// - space
// - already checked character

// =========================
// BREAK USAGE
// =========================

// Exit loop immediately

break;

// Used when:
// - duplicate found
// - already checked found

// =========================
// FINAL LOGIC FLOW (VERY IMPORTANT)
// =========================

// 1. Pick character
// 2. Skip space
// 3. Check duplicate (forward loop)
// 4. Check already checked (backward loop)
// 5. If already checked → skip
// 6. If duplicate → count + print

// =========================
// KEY LEARNING (VERY IMPORTANT)
// =========================

// Nested loops help compare characters

// break → stops loop early

// continue → skips current iteration

// Always reset flags inside loop

// Sequence of steps matters a lot

// Avoid duplicate counting using "already checked"
