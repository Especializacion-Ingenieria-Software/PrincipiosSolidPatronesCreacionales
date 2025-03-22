from abc import ABC, abstractmethod
class DeviceFactory(ABC):
    @abstractmethod
    def create_device(self):
        pass

    def get_device(self):
        device = self.create_device()
        return device