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
