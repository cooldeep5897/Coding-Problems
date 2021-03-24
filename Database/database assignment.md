DATABASE ASSIGNMENT

Database description: 
DATABASE -MEALS.
COLLECTIONS :-
Users
Information about all the users on our app.
{
   "firstName":"Bhavesh",
   "lastName":"Sharma",
   "password":"ABNCxTY",
   "calories_per_day":1800, // Maximum calorie per day as set by user.
   "phone":"012345678",
   "email":"bhavesh@gmail.com",
   "username":"bhaveshs" // unique value.
}
Meal
Information about the meals added by different users in our app. A user can add as many meals as he wants in a day. Each meal item will have the following info.
{
   "datetime":"2020-12-20T16:00:00Z",// Date and time of meal consumed.
   "food ":"pasta", // Name of food.
   "calorie":300, // Calorie contained in the food.
   "_id":"123", // Unique Id for the entry.
   "username": "bhavesh" // User for which the entry is added.
}








Query Description: 	Write a query to add users to our database. Username while adding a new user should be unique.

Query:	
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> db.users.insert({firstName:"kuldeep",lastname:"joshi",password:"abcde",totalcalories:"1500",
phone:"9235999999",email:"kuldeep@gmail.com",username:"kuldeepj"});

Response: 
WriteResult({ "nInserted" : 1 })

If try to insert same again 

Response: 
WriteResult({
        "nInserted" : 0,
        "writeError" : {
                "code" : 11000,
                "errmsg" : "E11000 duplicate key error collection: meals.users index: username_1 dup key: { username: \"kuldeepj\" }"
        }
})


Query Description: 	Write a query to delete user from our database based on the username(cooldeep).

Query:	
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> 	db.users.remove( { username:"cooldeep" });


Response: 
WriteResult({ "nRemoved" : 1 })


Query Description: 	Write a query to update user fields like password, calories per day, phone based on username(bhavesh).

Query:	
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> db.users.update({"username":"bhavesh"},{$set:{"totalcalories":"2300"}});


Response: 
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })





Query Description: Write a query to add a meal for a specific user based on the username (bhavesh). Meal should have information as described in the meal object above.
Query:	
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> db.meal.insert({food:"paratha",calorie:"500",_id:"124",username:"bhavesh",datetime:"2020-12-22T12:32:21"});


Response: 
WriteResult({ "nInserted" : 1 })



Query Description: 	Write a query to delete meal based on _id (123).

Query:	
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> 	db.meal.remove( { _id:"123" });

Response: 
WriteResult({ "nRemoved" : 1 })


Query Description: 	Write a query to list all meals for a specific user (bhavesh).

Query:	MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> db.meal.find({"username":"bhavesh"});

Response: 
{ "_id" : "1", "food" : "pasta", "calorie" : "200", "username" : "bhavesh", "datetime" : "2020-12-20T10:35:38" }

{ "_id" : "2", "food" : "smoothie", "calorie" : "500", "username" : "bhavesh", "datetime" : "2020-12-20T14:35:38" }

{ "_id" : "3", "food" : "chicken", "calorie" : "1100", "username" : "bhavesh", "datetime" : "2020-12-20T15:35:38" }
{ "_id" : "4", "food" : "burger", "calorie" : "100", "username" : "bhavesh", "datetime" : "2020-12-21T12:32:21" }

{ "_id" : "5", "food" : "lassi", "calorie" : "100", "username" : "bhavesh", "datetime" : "2020-12-21T04:32:21" }

{ "_id" : "6", "food" : "paneer", "calorie" : "400", "username" : "bhavesh", "datetime" : "2020-12-21T15:35:38" }

{ "_id" : "124", "food" : "paratha", "calorie" : "500", "username" : "bhavesh", "datetime" : "2020-12-22T12:32:21" }



Query Description: 	Write a query to list all meals for a specific user (bhavesh), on a given date (2020-12-20), ordered by time.

Query: 
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY> db.meal.find({$and:[{"username":"bhavesh"},{"datetime":/2020-12-20/}]}).sort({"datetime":1});

Response: 
{ "_id" : "1", "food" : "pasta", "calorie" : "200", "username" : "bhavesh", "datetime" : "2020-12-20T10:35:38" }
{ "_id" : "2", "food" : "smoothie", "calorie" : "500", "username" : "bhavesh", "datetime" : "2020-12-20T14:35:38" }
{ "_id" : "3", "food" : "chicken", "calorie" : "1100", "username" : "bhavesh", "datetime" : "2020-12-20T15:35:38" }


Query Description: 	Write a query to delete all meals for a specific user as identified by the username (bhavesh).

Query: 
MongoDB Enterprise atlas-3cqejl-shard-0:PRIMARY>	
db.meal.remove( { username:"bhavesh" });

Response: 
WriteResult({ "nRemoved" : 7 }) 

