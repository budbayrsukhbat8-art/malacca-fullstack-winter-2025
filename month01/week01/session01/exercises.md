<!-- exercises 01-->
1. git config --global user.name "Sukhbat Budbayar"
2. git config --global user. budbayrsukhbat8@gmail.com
3. git config --global init.defaultBranch main 
4. git config --status 
<!-- exersices 02  -->
1. mkdir folder 01
 cd git-practice
2. git init 
3. git 
4. ls 
<!-- exersices 03  --> 
1. echo "# Git Practice" > README.md 
2. git status 
3. git add README.md 
4. git status 
5. git commit -m "Add readme"
6. git log
<!-- exersices 04 -->
1. touch index.html style.css script.js
2. git add -A
3. git status
4. git commit -m "file 01"
<!-- exercises 5 -->
1. cat > .gitignore << 'E0F'
2. mkdir node_modules 
touch .env
touch error.log
3. git status
4. git add index.html
git commit -m "add .gitignore"
<!-- exercises 06 -->
1. cat > index.html << 'E0F'
2. git status 
3. git add index.html 
git diff --staged 
4. git commit -m "Add html"
<!-- exercises 07 -->
1. git log 
2. git log --oneline
3. git log -n 2
4. git log --
<!-- exercises 08 -->
1. ssh-keygen -t ed25519 -C budbayrsukhbat8@gmail.com
2. eval "$(ssh-agent -s)"
3. ssh-add ~/.ssh/s
<!-- exercises 1.1 -->
1. mkdir git init 
   cd git init
2. git 
3. echo " echo "# Git Review Project" > README.md
4. git status
5. git add -A
6. git commit -m 
7. giit log 
<!-- exercises 1.2 -->
1.cat > index.html << 'EOF'
<!DOCTYPE html>
<html>
<head>
    <title>My App</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Welcome</h1>
</body>
</html>
EOF 
2. git add index.html 
3. git commit -m "feat: Add HTML boilerplate"
4. cat > style.css << 'EOF'
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body {
    font-family: Arial, sans-serif;
}
h1 {
    color: #333;
}
EOF
4. git add style.css 
git commit -m 
5. git log --oneline 
<!-- exercises 2.1 -->
1. git branch
2. git switch branch feature-about
3.  cat > about.html << 'EOF'
<!DOCTYPE html>
<html>
<head>
    <title>About</title>
</head>
<body>
    <h1>About Us</h1>
    <p>This is the about page.</p>
</body>
</html>
EOF
4. git add about.html
it commit -m "feat: Add about page"
5. git branch
<!-- exercises 2.2 -->
1. git switch main
2. ls
3. git repack feature-about
4. ls
5. git log --oneline --all --graph 
<!-- exercises 3.1 -->
1. git switch main
2. cat > index.html << 'EOF'
<!DOCTYPE html>
<html>
<head>
    <title>My App</title>
</head>
<body>
    <h1>Hello from Main!</h1>
</body>
</html>
EOF
git add indix.html
git commit -m "Update heading in main"
3.git switch -c feature-conflict
4. cat > index.html << 'EOF'
<!DOCTYPE html>
<html>
<head>
    <title>My App</title>
</head>
<body>
    <h1>Welcome from Feature!</h1>
</body>
</html>
EOF
git add index.html 
git commit -m "Update heading in main"
5. git switch main
git merge feature-conflict
