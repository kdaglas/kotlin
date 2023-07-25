import kotlin.math.sqrt

/**
 * 1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a
 */

fun quadraticEquation() {
    // from the equation x2+10x+25 = 0
    // values acquired are
    val a = 1
    val b = 10
    val c = 25

    val rootFormular = b*b-4*a*c

    val x1 = (-b + sqrt(rootFormular.toFloat()))/2*a
    val x2 = (-b - sqrt(rootFormular.toFloat()))/2*a

    println("x2+10x+25 = 0")
    println("The values of x from the above equation are: x1 = $x1 and x2 = $x2")
}

/**
 * 2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
 * Find the time it will take to move a distance of 5km
 * Hint - acceleration = speed/time
 * speed = distance/time
 */

fun timeCovered() {
    val speed = 1000 //m/s
    val acceleration = 25 //m/s2
    val distance = 5 //km

    val meterDistance = 5*1000 //m
    val time = meterDistance / speed

    println("The speed of 1000m/s")
    println("The distance to cover 5km")
    println("The time taken to cover 5km at a speed of 1000m/s is $time seconds")
}

/**
 * 3. A person has four option of choosing between;
 * pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
 * if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
 * if cake, they'll go to cakely. Write
 * -a program using an if statement that captures the persons choice and prints the
 * selected restaurant
 */

fun chosenRestaurant() {
    print("Enter food chosen: ")
    val foodChosen = readln()

    val restaurant = arrayOf("pizza hut", "kfc", "foodhub", "cakely")

    if(foodChosen=="pizza") {
        var chosenRestaurant = restaurant.get(0)
        println("Go to $chosenRestaurant")
    } else if(foodChosen=="chicken") {
        var chosenRestaurant = restaurant.get(1)
        println("Go to $chosenRestaurant")
    } else if(foodChosen=="pancakes") {
        var chosenRestaurant = restaurant.get(2)
        println("Go to $chosenRestaurant")
    } else if(foodChosen=="cake") {
        var chosenRestaurant = restaurant.get(3)
        println("Go to $chosenRestaurant")
    } else {
        println("Please choose between `pizza`, `chicken`, `pancakes` or `cake`")
    }
}

/**
 * -same program using a when statement
 */

fun chosenRestaurant2() {
    print("Enter food chosen: ")
    val foodChosen = readln()

    val restaurant = arrayOf("pizza hut", "kfc", "foodhub", "cakely")

    when(foodChosen) {
        "pizza" -> println("Go to " + restaurant.get(0))
        "chicken" -> println("Go to " + restaurant.get(1))
        "pancakes" -> println("Go to " + restaurant.get(2))
        "cake" -> println("Go to " + restaurant.get(3))
        else -> println("Please choose between `pizza`, `chicken`, `pancakes` or `cake`")
    }
}

/**
 * 4. Solve the equation x3+7x2+10x = 0 - x = (-b+-Sqrt(b2-4ac))/2a
 */

fun cubicEquation() {
    // from the equation x3+7x2+10x = 0
    // derived equation x(x2+7x+10) = 0
    // values acquired are
    val a = 1
    val b = 7
    val c = 10

    val rootFormular = b*b-4*a*c

    val x0 = 0
    val x1 = (-b + sqrt(rootFormular.toFloat()))/2*a
    val x2 = (-b - sqrt(rootFormular.toFloat()))/2*a

    println("x2+7x+10 = 0")
    println("The values of x from the above equation are: x0 = $x0, x1 = $x1 and x2 = $x2")
}

/**
 * 5. A person is moving to his village with a car moving at 20km/h and He has many
 * alternative routes.
 * If he uses route1, he'll move a distance of 5000km
 * If he uses route2, he'll move a distance of 25000km
 * If he uses route3, he'll move a distance of 50000km
 * If he uses another, he'll move a distance of 10000km
 *
 * Find the time it will take him to reach the village using the separate routes
 * -using an if statement
 */

fun alternativeRoute() {
    var speed = 20 //km/hr

    print("Enter route chosen: ")
    val routeChosen = readln()

    if(routeChosen=="route1") {
        var distanceCovered = 5000 //km
        var time = distanceCovered/speed
        println("Time taken to reach the village for Route1 is $time hours")
    } else if(routeChosen=="route2") {
        var distanceCovered = 25000 //km
        var time = distanceCovered/speed
        println("Time taken to reach the village for Route2 is $time hours")
    } else if(routeChosen=="route3") {
        var distanceCovered = 50000 //km
        var time = distanceCovered/speed
        println("Time taken to reach the village for Route3 is $time hours")
    } else {
        var distanceCovered = 10000 //km
        var time = distanceCovered/speed
        println("Time taken to reach the village for another route is $time hours")
    }
}

/**
 * -using a when statement
 */

fun alternativeRoute2() {
    var speed = 20 //km/hr

    print("Enter route chosen: ")
    val routeChosen = readln()

    when(routeChosen) {
        "route1" -> {
            var distanceCovered = 5000 //km
            var time = distanceCovered/speed
            println("Time taken to reach the village for Route1 is $time hours")
        }
        "route2" -> {
            var distanceCovered = 25000 //km
            var time = distanceCovered/speed
            println("Time taken to reach the village for Route2 is $time hours")
        }
        "route3" -> {
            var distanceCovered = 50000 //km
            var time = distanceCovered/speed
            println("Time taken to reach the village for Route3 is $time hours")
        }
        else -> {
            var distanceCovered = 10000 //km
            var time = distanceCovered/speed
            println("Time taken to reach the village for another route is $time hours")
        }
    }
}
