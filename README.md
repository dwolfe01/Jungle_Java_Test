 This is a test to evaluate mid level Test First Java developers.
===============================================================
Dr Dolittle can speak to animals.
We are going to ask Dr Dolittle to help us look after our animals.

*Acceptance Criteria 1:
We have a snake and we have a lion.
When the Dr speaks to the lion he says his name is Ralph.
When the Dr speaks to the snake he says his name is Perry.

*Acceptance Criteria 2:
The Dr has a number of foods available to him.
He has a mango which has 500 calories.
He has a beef steak which has 2000 calories.
He has a pizza which has 1500 calories.
He has a deadly nightshade which is poisonous.
When the Dr is asked to he will try to feed ALL the foods to ALL the animals.

*Acceptance Criteria 3:
Each time the animal eats it will count the number of calories consumed.
Dr Dolittle does not know which foods are poisonous.
The animals will die if poisonous food is fed to them; make sure they know not to eat the deadly nightshade.
We can ask Dr Dolittle to tell us about how many calories each animal has consumed; The animal will inform the Dr of how many calories have been consumed.  

*Acceptance Criteria 4:
The snake will not eat any foods that are less than 2000 calories.

*Acceptance Criteria 5:
The Dr should make a note in a file of everything the animals have said to him.
This file should be called "Jungle_Java.txt"

*introduce integration tests to this project                                    
*what are the pros and cons of having lazy-init="true" on the spring configuration
*make sure the aspect stops the animal from eating poisonous food                 
*extend the system to that each Animal can have a list of forbidden foods         
*can we extract anymore code to the Animal superclass?                            
*stop the animals from ever eating too much                                       
*describe how might you schedule the main method in this class to run daily       
*would you modularise the application context?                                    
*introduce hibernate to store the current status of the Zoo to a datasource
