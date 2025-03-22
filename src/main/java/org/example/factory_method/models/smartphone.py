from models.device import Device


class Smartphone(Device):
    def __init__(self, name, price, camera_mp, battery_mah):
        super().__init__(name, price)
        self.camera_mp = camera_mp
        self.battery_mah = battery_mah

    def get_specifications(self):
        return f"Cámara: {self.camera_mp}MP, Batería: {self.battery_mah}mAh"