fun main(args: Array<String>) {
    // Ask the user to guss the secret number
    print("Guess a number between 0 and 10 : ")
    // This is secret number
    var secetNumber = 1
    // use try and catch to make sure user can only guess numbers
    try {
        var guess = readLine() !!.toInt()
        if (guess in 0..10) {

            // if user guesses correctly display a message to tell them they have guessed correctly
            if (secetNumber == guess) {
                println("You Get It")
            }
            //  else user guesses incorrectly  display a message to tell them they have guessed incorrectly
            else {
                println("Wrong guess. The answer was $secetNumber ")

            }
        }

        // catch if user enter secret number wrong display a message
    }catch (e: Exception){
        println("Please Enter Number only.")
        // Display a message to the users that the game is over
    }finally {
        print("Game Over")
    }

}