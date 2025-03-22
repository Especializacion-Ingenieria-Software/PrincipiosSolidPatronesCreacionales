from factories.smartphone_factory import SmartphoneFactory
from factories.computer_factory import ComputerFactory
from factories.tablet_factory import TabletFactory


def client_code(factory):
    device = factory.get_device()
    device.display_info()


if __name__ == "__main__":
    print(" smartphone:")
    client_code(SmartphoneFactory())

    print("omputadora:")
    client_code(ComputerFactory())

    print("tablet:")
    client_code(TabletFactory())