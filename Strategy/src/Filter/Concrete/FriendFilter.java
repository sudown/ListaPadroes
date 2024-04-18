package Filter.Concrete;

import Filter.IFilter;

public class FriendFilter implements IFilter {
  @Override
  public boolean matchQuery(String query) {
    return query.toLowerCase().contains("friend");
  }
}