from factories.device_factory import DeviceFactory
from models.smartphone import Smartphone

class SmartphoneFactory(DeviceFactory):
    def create_device(self):
        return Smartphone("iPhone 16 pro max", 25000, 58, 3240)