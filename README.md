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
         
            ]
        }
        ```
        
3. `/parkingLots` GET
   
      - response:
   
        ```json
        {        
          [
            {
                "id": 1,
                "name": "oocl parkinglot",
                "size": 100,
                "remain": 100,
                "parkingBoyId": 1
            }
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
    
  5. `/parkingBoys/1` PUT
     - request:
      ```json
      {
      	"parkingLotId":1
      }
      ```
     - response
      ```json
      {
          "message": "add parkingLot in parkingBoy successfully"
      }
      ```