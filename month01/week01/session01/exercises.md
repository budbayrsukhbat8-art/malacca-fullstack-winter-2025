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