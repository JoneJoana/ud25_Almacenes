# ud25_Almacenes

## T25 - en local - Info Commit 

Proyecto ya creado para hacer deploy en heroku - no hay linea clara de separacion de las unidades 25 y 26. 
posible commit version local : 
```
Update README.md
commit 78a3e5b4845fb0e1a5c6c05f148e98ce4ba9d087
```

## T26 - DEPLOY HEROKU --> ultima version

## API Almacenes

### CAJAS

#### GET
```
ud25-almacenes.herokuapp.com/api/cajas get All

ud25-almacenes.herokuapp.com/api/cajas/{num_ref}  get por numRef

ud25-almacenes.herokuapp.com/api/cajas/almacenes/{almacen}  get por Almacen
```

#### DELETE
```
ud25-almacenes.herokuapp.com/api/cajas/{num_ref} 
```

#### POST
```
ud25-almacenes.herokuapp.com/api/cajas/   RequestBody
```

#### PUT
```
ud25-almacenes.herokuapp.com/api/cajas/{num_ref}   RequestBody
```


### ALMACENES

#### GET
```
ud25-almacenes.herokuapp.com/api/almacenes  get ALL

ud25-almacenes.herokuapp.com/api/almacenes/{id}  get by id
```

#### DELETE
```
ud25-almacenes.herokuapp.com/api/almacenes/{id}  
```

#### POST
```
ud25-almacenes.herokuapp.com/api/almacenes  REQUEST BODY
```

#### PUT 
```
ud25-almacenes.herokuapp.com/api/almacenes/{id}  REQUEST BODY
```
