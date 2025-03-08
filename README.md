Gitbash:
Desktop ->mkdir bridzlab-workspace ->mkdir java-fundamental ->git init (in this java fundamental we have to upload all our files)
git repository ->java-fundamental->terminal(git remote add origin) ->git add FirstProgram.java->git commit -m "Printing a message"->git push origin master

git commit format:-
git commit -m "[Author] Action:Message"
git merge:
git pulll origin main -> git merge branch -> (if conflict) -> nano file -> correct the code -> git add . -> git commit -m

to create new branch = git branch name (unnavigated)
=> git checout -b name (navigated -> will directly take u to that branch)

to switch branch : git switch name
=> git checout name

explaining psvm
public = Access modifier
static = class
void =return type
main =identifier
String =class(Datatype)
args = identiefier
[String[] args ] = argument

interpreter = compiles a code line by line =>Slower (executes one line at a time).
compliler = compiles a code in one go  =>Faster (since the whole code is compiled beforehand).

Access Modifier:
public -> accessible throughout
private-> within same class
default -> within same package
protected -> within sub class (can be in different packages too)

Array=>It is a non primitiive  data type that stores a fixed size sequence of elements of the same type.
