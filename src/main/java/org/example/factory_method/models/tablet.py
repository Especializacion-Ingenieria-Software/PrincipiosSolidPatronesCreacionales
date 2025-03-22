from models.device import Device


class Tablet(Device):
    def __init__(self, name, price, screen_size, has_stylus):
        super().__init__(name, price)
        self.screen_size = screen_size
        self.has_stylus = has_stylus

    def get_specifications(self):
        stylus = "Sí" if self.has_stylus else "No"
        return f"Tamaño de pantalla: {self.screen_size}\", Stylus incluido: {stylus}"