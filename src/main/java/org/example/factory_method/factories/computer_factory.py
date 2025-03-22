from factories.device_factory import DeviceFactory
from models.computer import Computer


class ComputerFactory(DeviceFactory):
    def create_device(self):
        return Computer("MacBook Pro", 200, "Apple M1", 16, 1000)