//La creación de la base de dato y colecciones ocurre de manera implicita al usar los siguientes comandos
//en la consola

//Selecciona (y si no existe crea la BD) tbd
use tbd


//Crea y/o inserta las habilidades la colección de habilidades
db.habilidades.insertMany([
    {  
        "nombre": "manguerero"
    },
    {
        "nombre": "liderazgo"
    },
    {
        "nombre": "socorrista"
    },
    {
        "nombre": "bombero"
    },
    {
        "nombre": "conductor"
    },
    {
        "nombre": "primeros auxilios"
    },
    {
        "nombre": "rescate"
    },
    {
        "nombre": "escalada"
    },
    {
        "nombre": "llorar"
    }
    

])

//Obtención de las id de las habilidades para asignarlas a los voluntarios
var manguerero = db.habilidades.findOne({nombre: "manguerero"})._id
var liderazgo = db.habilidades.findOne({nombre: "liderazgo"})._id
var socorrista = db.habilidades.findOne({nombre: "socorrista"})._id
var bombero = db.habilidades.findOne({nombre: "bombero"})._id
var conductor = db.habilidades.findOne({nombre: "conductor"})._id
var primerosAuxilios = db.habilidades.findOne({nombre: "primeros auxilios"})._id
var rescate = db.habilidades.findOne({nombre: "rescate"})._id
var escalada = db.habilidades.findOne({nombre: "escalada"})._id
var llorar = db.habilidades.findOne({nombre: "llorar"})._id

//Crea la colección voluntarios
db.voluntarios.insertMany([
    {
        "nombre": "Ricardo Milos",
        "rut": "12345678-9",
        "habilidades": [manguerero, llorar]
    },
    {
        "nombre": "Juan Vasquez Jara",
        "rut": "77777777-7",
        "habilidades": [bombero, conductor, primerosAuxilios, rescate, escalada]
    },
    {
        "nombre": "Pedro Rodriguez",
        "rut": "123123123-1",
        "habilidades": [manguerero, liderazgo, socorrista, bombero, conductor]
    },
    {
        "nombre": "Matias Carvajal",
        "rut": "98765432-1",
        "habilidades": [primerosAuxilios, rescate, escalada, bombero]
    },
    {
        "Nombre": "Luisa A",
        "rut": "11111111-1",
        "habilidades": [manguerero, liderazgo, socorrista, bombero, conductor, primerosAuxilios]
    },
    {
        "Nombre": "Maria Fatima",
        "rut": "22222222-2",
        "habilidades": [manguerero, liderazgo, socorrista, bombero, conductor, primerosAuxilios, rescate]
    },
    {
        "Nombre": "Jose Miguel Carrera",
        "rut": "33333333-3",
        "habilidades": [manguerero, liderazgo, socorrista, bombero, conductor, primerosAuxilios, rescate, escalada]
    },
    {
        "Nombre": "Andrea Contreras",
        "rut": "44444444-4",
        "habilidades": [manguerero, liderazgo, socorrista, bombero, conductor, primerosAuxilios, rescate, escalada, llorar]
    },
    {
        "nombre": "Sebastian Piñera Echeñique",
        "rut": "55555555-5",
        "habilidades": [ liderazgo, socorrista, conductor, primerosAuxilios, rescate, escalada, llorar]
    },
    {
        "nombre": "Arturo Vidal",
        "rut": "66666666-6",
        "habilidades": [ liderazgo,conductor, primerosAuxilios, rescate, escalada, llorar]
    }
])