# Spring MVC - Circle exercise

This is a simple Spring Boot MVC software that calculates different attributes of a circle.

## How to start?

### Get ready for the exercise

Just clone this repo like this:

```
git clone https://github.com/java-2023-03/java-spring-circle.git java-spring-circle/exercise
```

This will give you the code base you need to start this exercise.

### Let's start

1. Create the package ```de.brightslearning.circle```!

2. Create a new Spring Boot Application (Class) named ```CircularCalculatorApplication```! It should have a ```main``` method that starts the application!

3. Create a bean named ```de.brightslearning.circle.model.Circle```! It should

* have four private attributes (choose a proper data type that allows to store floating point numbers)
    * radius
    * surface
    * diameter
    * circumference
* have all the necessary constructors
* Getters and setters for all of its attributes
* a ```reset``` method that sets all attributes back to ```null```
* a default ```toString``` method

4. Create a service bean named ```de.brightslearning.circle.service.CircleService```! It should have all the necessary constructors.

5. Create three methods within the ```de.brightslearning.circle.service.CircleService``` bean! They all take a ```Circle``` as argument and return the calculated value using a proper data type.

* Create the ```calculateSurface``` method that calculates the surface of a circle ($radius * radius * PI$)
* Create the ```calculateDiameter``` method that calculates the diameter of a circle ($radius * 2$)
* Create the ```calculateCircumference``` method that calculates the circumference of a circle ($2 * radius * PI$)

6. Create a controller class named ```de.brightslearning.circle.controller.CircleController```!

7. Create a constructor for the ```de.brightslearning.circle.controller.CircleController``` class that injects the ```ApplicationContext``` and the ```de.brightslearning.circle.service.CircleService```!

8. Create the ```index``` method! It should

* respond to a GET request to ```/```
* get the ```Circle``` bean from the application context and inject it into the ```Model```. If the bean is not initialized already, it should be created with the value ```0``` for all of its attributes (you may use the ```getBean``` method to do this).
* return the ```/index``` template

9. Create the ```calculcate``` method! It should

* respond to a POST request to ```/calculate```
* take the ```@ModelAttribute``` circle of type ```Circle``` from the request
* take ```redirectAttributes``` as an argument of type ```RedirectAttributes```
* calculate the surface, diameter and circumference of the given circle (use a new ```Circle``` object to store these values)
* add the results as flash attribute (```addFlashAttribute()```) to the ```redirectAttributes``` (name: ```result```)
* redirect to ```/```

10. Modify the ```index``` method to take the ```@ModelAttribute``` ```result``` of type ```Circle```. If ```result``` is not ```null``` it should be added to the ```Model``` (name: ```result```). 

11. Create a method named ```reset```! It should

* respond to a GET request to ```/reset```
* call the ```Circle.reset()``` method
* redirect to ```/```

END 

## How to get the solution?

### Clone the solution
You are done with this exercise? All you have to do is to clone the "solution" branch of this repo.

```
git clone --branch solution https://github.com/java-2023-03/java-spring-circle.git java-spring-circle/solution

```

### Switch to the solution

If you just want to switch from your local files to the solution you should

1. Stash your local changes

```
git stash
```

2. Switch to the "solution" branch

```
git switch solution
```

If you want to get your local changes back you should

1. Switch back to the "master" branch

```
git switch master
```

2. Unstash your local changes

```
git stash pop
```
