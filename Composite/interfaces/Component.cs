namespace ListaPadroes.interfaces
{
    public abstract class Component
    {
        protected string name;
        protected int weight;
        public Component(string name, int weight)
        {
            this.name = name;
            this.weight = weight;
        }

        public Component(string name)
        {
            this.name = name;
            this.weight = 0;
        }

        public abstract void Add(Component c);
        public abstract void Remove(Component c);
        public abstract void Display(int depth);
        public abstract int GetWeight();
    }

}
