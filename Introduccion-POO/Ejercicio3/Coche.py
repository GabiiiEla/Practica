'''
3. Crea una clase Coche con marca, modelo y velocidad
   a) Agrega un método acelerar () que aumente la velocidad en 10
   b) Agrega un método frenar () que disminuya la velocidad en 5
   c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
'''
class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad = self.velocidad + 10
        print(f"El coche {self.marca} {self.modelo} ha acelerado. Velocidad actual: {self.velocidad}")

    def frenar(self):
        self.velocidad = self.velocidad - 5
        print(f"El coche {self.marca} {self.modelo} ha frenado. Velocidad actual: {self.velocidad}")

coche1 = Coche("Toyota", "Corolla", 0)
coche2 = Coche("Mercedes", "GLE", 0)


print("Coche 1 ")
coche1.acelerar()
coche1.acelerar()
coche1.frenar()

print("\nCoche 2 ")
coche2.acelerar()
coche2.frenar()
coche2.acelerar()
coche2.frenar()

print(f"\nVelocidad final del coche 1 ({coche1.marca} {coche1.modelo}): {coche1.velocidad}")
print(f"Velocidad final del coche 2 ({coche2.marca} {coche2.modelo}): {coche2.velocidad}")
