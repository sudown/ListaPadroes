using ListaPadroes.interfaces;

namespace ListaPadroes
{
    public class Composite : Component
    {
        private readonly List<Component> children = new List<Component>();
        public Composite(string name, int weight) : base(name, weight)
        {}

        public Composite(string name) : base(name)
        {}

        public override void Add(Component component)
        {
            children.Add(component);
        }
        public override void Remove(Component component)
        {
            children.Remove(component);
        }
        public override void Display(int depth)
        {
            int totalWeight = GetWeight();
            Console.WriteLine($"{new string(' ', depth)}{name}: Peso total: {totalWeight}");
            foreach (Component component in children)
            {
                component.Display(depth + 2);
            }
        }

        public override int GetWeight()
        {
            int totalWeight = weight;
            foreach (Component component in children)
                totalWeight += component.GetWeight();
            return totalWeight;
        }
    }
}
