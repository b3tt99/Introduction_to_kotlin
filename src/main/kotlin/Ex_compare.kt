fun main(args: Array<String>) {

    //Build a simple program
    //*544#

    print("Select an option")
    var code:Int = readLine()!!.toInt()

    if (code == 0){
        print("Sh20=1GB for 1hr")
    }
    else if (code == 1 ){
        print("Data Deals")
    }
    else if (code == 2){
        print("Daily Bundles")
    }
    else if (code == 3){
        print("Weekly Bundles")
    }
    else if (code == 4) {
        print("GO MONTHLY")
    }
    else if (code == 5){
        print("No expiry")
    }
    else if (code == 6){
        print("Video Bundles")
    }
    else if (code == 7){
        print("Okoa Data")
    }
    else if (code == 8){
        print("Lipa Mdogo")
    }
    else if (code == 9){
        print("Data Plus New")
    }
    else if (code == 10){
        print("Hot Minutes")
    }

    else {

        print("Invalid choice.Try again.")
    }



}