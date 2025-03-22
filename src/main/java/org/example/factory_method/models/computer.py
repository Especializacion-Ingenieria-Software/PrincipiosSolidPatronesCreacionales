from models.device import Device
class Computer(Device):
    def __init__(self, name, price, processor, ram_gb, storage_gb):
        super().__init__(name, price)
        self.processor = processor
        self.ram_gb = ram_gb
        self.storage_gb = storage_gb

    def get_specifications(self):
        return f"Procesador: {self.processor}, RAM: {self.ram_gb}GB, Almacenamiento: {self.storage_gb}GB"