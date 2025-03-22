from abc import ABC, abstractmethod


class Device(ABC):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    @abstractmethod
    def get_specifications(self):
        pass

    def display_info(self):
        print(f"Nombre: {self.name}")
        print(f"Precio: ${self.price}")
        print(f"Especificaciones: {self.get_specifications()}")
        print("-" * 30)

