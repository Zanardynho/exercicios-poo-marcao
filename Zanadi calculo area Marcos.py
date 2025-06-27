#calculo area
class Area:
    n1: int
    n2: int

    def __init__(self, n1: int, n2: int) -> None:
      self.n1 = n1 #int(input("Digite um numero da altura! "))
      self.n2 = n2 #int(input("Digite um numero da altura! "))
      print(self.n1*self.n2)

    
class Quadrado(Area):
    lado: int
    
    def __init__(self) -> None:
        lado = int(input("Digite o lado!:" ))
        super().__init__(lado, lado)


teste = Quadrado()
