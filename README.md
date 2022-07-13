# Space-station App
SofkaU challenge

# Details
App to display and add information of the most relevant spacecrafts and their classifications.

### To execute the project:

Download zip

```sh
https://github.com/mcamimejia/finapptracker.git
```

Move to the folder

```sh
cd myApp
```

Install dependencies:

```sh
npm install
```

Run SQL Script in your server to have access to the Data Base

```sh
space_station_db.sql
```

Change server credentials to match your server

```sh
space-station/myApp/database/config/config.js  -->

  "development": {
    "username": "root", 
    "password": null, 
    "database": "space_station_db",
    "host": "127.0.0.1",
    "dialect": "mysql"
  },
```

Execute the project

```sh
nodemon bin/www
```