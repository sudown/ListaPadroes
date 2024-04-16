using ListaPadroes.interfaces;

namespace ListaPadroes
{
    public class Leaf : Component
    {
        // Constructor
        public Leaf(string name, int weight)
            : base(name, weight)
        {
        }
        public override void Add(Component c)
        {
            Console.WriteLine("Cannot add to a leaf");
        }
        public override void Remove(Component c)
        {
            Console.WriteLine("Cannot remove from a leaf");
        }
        public override void Display(int depth)
        {
            Console.WriteLine($"{new string(' ', depth)}{name}: Peso da parte: {weight}");
        }

        public override int GetWeight()
        {
            return weight;
        }
    }
}
