package Filter.Concrete;

import Filter.IFilter;

public class LongFilter implements IFilter{
    @Override
    public boolean matchQuery(String query) {
        return (query.length() > 60);
    }
}
