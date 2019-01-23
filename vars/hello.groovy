def call(String name){
 echo "Hello ${name}"
}

def now(String src, String dest){
 Files.copy(${src}, ${dest})
}
