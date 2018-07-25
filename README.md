1. `/parkingBoys` POST

   - request:

     ```json
     {
         "name":"a",
         "age":21,
         "gender":"man"
     }
     ```

     

   - response:

     ```json
     {
         "parkingBoy":{
             "id":1,
             "name":"a",
             "age":21,
             "gender":"man"
             },
         "message":"add parkingBoy successfully"
     }
     ```

2. `/parkingBoys` GET
   
      - response:
   
        ```json
        {
          [
            	{
                    "id":1, 
                    "name":"a", 
                    "age":21, 
                    "parkingLots":[
            			{"parkingLotName":"a1", "size":20, "remain":13},
            			{"parkingLotName":"b1", "size":20, "remain":13},
            			{"parkingLotName":"c1", "size":20, "remain":13},
            		]
                },
            	{
                    "id":2, 
                    "name":"b", 
                    "age":25, 
                    "parkingLots":[
            			{"parkingLotName":"a2", "size":20, "remain":13},
            			{"parkingLotName":"b2", "size":20, "remain":13},
            			{"parkingLotName":"c2", "size":20, "remain":13},
            		]
                },
            	{
                    "id":3, 
                    "name":"c", 
                    "age":21, 
                    "parkingLots":[]
                },
            	
            ]
        }
        ```
        
3. `/parkingLots` GET
   
      - response:
   
        ```json
        {
            [
            	{"parkingLotName":"a", "size":20, "remain":13, "parkingBoyId":1},
            	{"parkingLotName":"b", "size":20, "remain":13, "parkingBoyId":1},
            	{"parkingLotName":"c", "size":20, "remain":13, "parkingBoyId":1},
            	{"parkingLotName":"d", "size":20, "remain":20, "parkingBoyId":1}
            ]
        }
        ```   
4. `/parkingLots` POST
    - request:
    ```json
    {
     "name":"oocl parkinglot",
     "size":20,
     "remain":20
    }
    ```
    - response
    ```json
    {
        "parkingLot": {
            "id": 1,
            "name": "oocl parkinglot",
            "size": 100,
            "remain": 100,
            "parkingBoy": null
        },
        "message": "add parkingLot successfully"
    }
    ```