// See https://aka.ms/new-console-template for more information
using ListaPadroes;

Composite Carro = new Composite("Carro");

Composite Carroceria = new Composite("Carroceria");

Leaf ParaLamas = new Leaf("Para-lamas", 1);
Leaf Portas = new Leaf("Portas", 1);
Leaf Paineis = new Leaf("Paineis", 1);
Leaf PortaMalas = new Leaf("Porta malas", 1);
Leaf Capo = new Leaf("Capo", 1);

Composite Chassi = new Composite("Chassi");

Leaf Suspensao = new Leaf("Suspenão", 1);
Composite TremDeForca = new Composite("Trem de forca");

Leaf Motor = new Leaf("Motor", 1);
Leaf Transmissao = new Leaf("Transmissao", 1);
Leaf Diferencial = new Leaf("Diferencial", 1);
Leaf Rodas = new Leaf("Rodas", 1);

Carroceria.Add(ParaLamas);
Carroceria.Add(Portas);
Carroceria.Add(Paineis);
Carroceria.Add(PortaMalas);
Carroceria.Add(Capo);

TremDeForca.Add(Motor);
TremDeForca.Add(Transmissao);
TremDeForca.Add(Diferencial);
TremDeForca.Add(Rodas);

Chassi.Add(Suspensao);
Chassi.Add(TremDeForca);

Carro.Add(Carroceria);
Carro.Add(Chassi);

Carro.Display(0);