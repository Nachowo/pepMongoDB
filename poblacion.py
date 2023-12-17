from pymongo import MongoClient

# Conexión a la base de datos (asegúrate de tener MongoDB instalado y corriendo)
client = MongoClient('localhost', 27017)
db = client['tbd']

# Creación e inserción de habilidades
habilidades = [
    {"nombre": "manguerero"},
    {"nombre": "liderazgo"},
    {"nombre": "socorrista"},
    {"nombre": "bombero"},
    {"nombre": "conductor"},
    {"nombre": "primeros auxilios"},
    {"nombre": "rescate"},
    {"nombre": "escalada"},
    {"nombre": "llorar"}
]

db.habilidades.insert_many(habilidades)

# Obtención de las IDs de habilidades
manguerero_id = db.habilidades.find_one({"nombre": "manguerero"})['_id']
liderazgo_id = db.habilidades.find_one({"nombre": "liderazgo"})['_id']
socorrista_id = db.habilidades.find_one({"nombre": "socorrista"})['_id']
bombero_id = db.habilidades.find_one({"nombre": "bombero"})['_id']
conductor_id = db.habilidades.find_one({"nombre": "conductor"})['_id']
primeros_auxilios_id = db.habilidades.find_one({"nombre": "primeros auxilios"})['_id']
rescate_id = db.habilidades.find_one({"nombre": "rescate"})['_id']
escalada_id = db.habilidades.find_one({"nombre": "escalada"})['_id']
llorar_id = db.habilidades.find_one({"nombre": "llorar"})['_id']

# Creación de la colección de voluntarios
voluntarios = [
    {"nombre": "Ricardo Milos", "rut": "12345678-9", "habilidades": [manguerero_id, llorar_id]},
    {"nombre": "Juan Vasquez Jara", "rut": "77777777-7", "habilidades": [bombero_id, conductor_id, primeros_auxilios_id, rescate_id, escalada_id]},
    {"nombre": "Pedro Rodriguez", "rut": "123123123-1", "habilidades": [manguerero_id, liderazgo_id, socorrista_id, bombero_id, conductor_id]},
    {"nombre": "Matias Carvajal", "rut": "98765432-1", "habilidades": [primeros_auxilios_id, rescate_id, escalada_id, bombero_id]},
    {"nombre": "Luisa A", "rut": "11111111-1", "habilidades": [manguerero_id, liderazgo_id, socorrista_id, bombero_id, conductor_id, primeros_auxilios_id]},
    {"nombre": "Maria Fatima", "rut": "22222222-2", "habilidades": [manguerero_id, liderazgo_id, socorrista_id, bombero_id, conductor_id, primeros_auxilios_id, rescate_id]},
    {"nombre": "Jose Miguel Carrera", "rut": "33333333-3", "habilidades": [manguerero_id, liderazgo_id, socorrista_id, bombero_id, conductor_id, primeros_auxilios_id, rescate_id, escalada_id]},
    {"nombre": "Andrea Contreras", "rut": "44444444-4", "habilidades": [manguerero_id, liderazgo_id, socorrista_id, bombero_id, conductor_id, primeros_auxilios_id, rescate_id, escalada_id, llorar_id]},
    {"nombre": "Sebastian Piñera Echeñique", "rut": "55555555-5", "habilidades": [liderazgo_id, socorrista_id, conductor_id, primeros_auxilios_id, rescate_id, escalada_id, llorar_id]},
    {"nombre": "Arturo Vidal", "rut": "66666666-6", "habilidades": [liderazgo_id, conductor_id, primeros_auxilios_id, rescate_id, escalada_id, llorar_id]}
]

db.voluntarios.insert_many(voluntarios)
print("listo")
