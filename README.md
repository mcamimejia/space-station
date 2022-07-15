# Space-station App
SofkaU challenge

# Details
App to display and add information of the most relevant spacecrafts and their classifications.

### To execute the app project:

Download zip:

```sh
https://github.com/mcamimejia/space-station.git
```

Move to the folder:

```sh
cd app
```

Install dependencies:

```sh
npm install
```

Run SQL Script in your server to have access to the Data Base:

```sh
space_station_db.sql
```

Change server credentials to match your server:

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

Execute the project:

```sh
nodemon bin/www
```

### To execute the Java console programm:

Run spaceStation folder with Java.

