fun main(args: Array<String>) {

    print("Enter your Age")
    var age:Int = readLine()!!.toInt()


    if (age >= 18){
        print("Welcome to the Club")
    }else {

        print("Sorry we don't admit underage")
    }
}