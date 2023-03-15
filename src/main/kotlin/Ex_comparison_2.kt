fun main(args: Array<String>) {
    print("Enter your marks")
    var mark:Int = readLine()!!.toInt()

    if (mark > 79 ){
        print("A.Congratulations!")
    }
    else if (mark > 69 ){
        print("A-. Good")
    }
    else if (mark > 59 ){
        print("B. Put in more effort")
    }
    else if (mark > 100){
        print("ERROR!!")
    }
    else {

        print("E. You need to retake the test")
    }



}

