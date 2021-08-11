# songr

This is a Website that views songs' Albums with some details.

**In command line :**

1. Install postgres => $ brew install postgresql
2. $ pg_ctl -D /home/linuxbrew/.linuxbrew/var/postgres start
3. $ echo 'alias pgstart="pg_ctl -D /home/linuxbrew/.linuxbrew/var/postgres start"' >> ~/.profile

   $ echo 'alias pgstop="pg_ctl -D /home/linuxbrew/.linuxbrew/var/postgres stop"' >> ~/.profile
4. $ createdb <dbName> 
5. $ psql


6. $ pgstart then $ /c <dbName> => you are now connected to your database.

7. go to application.properties file => copy and paste this

  ```
  spring.jpa.database=POSTGRESQL
  spring.datasource.platform=postgres
  spring.datasource.url=jdbc:postgresql://localhost:5432/<dbName>
  spring.datasource.username= <add a user name>
  spring.datasource.password= <add a password>
  spring.jpa.hibernate.ddl-auto=create-drop
```

To go to the home page use -> "/" in the URL

To go to the hello page use -> "/hello" in the URL

To go to the capitalize page use -> "/capitalize?word=<type anything, it'll be capitalized>" in the URL

To go to the album page use -> "/albums" in the URL

You can add new albums by filling and submitting the form

