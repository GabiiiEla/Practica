class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        print("Sonido genérico de animal")

    def moverse(self):
        print("El animal se mueve")

    def get_nombre(self):
        return self.nombre

class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.get_nombre()} dice: ¡Guau!")

    def moverse(self):
        print(f"{self.get_nombre()} corre.")

class Gato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.get_nombre()} dice: ¡Miau!")

    def moverse(self):
        print(f"{self.get_nombre()} salta.")

class Pajaro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.get_nombre()} dice: ¡Pío pío!")

    def moverse(self):
        print(f"{self.get_nombre()} vuela.")

firulais = Perro("Loqui-Chiquis")
misifu = Gato("Pushi")
piolin = Pajaro("Piolín")

print(" Sonidos de los Animales ")
firulais.hacer_sonido()
misifu.hacer_sonido()
piolin.hacer_sonido()

print("\n Movimiento de los Animales ")
firulais.moverse()
misifu.moverse()
piolin.moverse()