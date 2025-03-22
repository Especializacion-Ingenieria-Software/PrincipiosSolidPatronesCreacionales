from factories.device_factory import DeviceFactory
from models.tablet import Tablet

class TabletFactory(DeviceFactory):
    def create_device(self):
        return Tablet("samsung", 15000, 14.0, True)