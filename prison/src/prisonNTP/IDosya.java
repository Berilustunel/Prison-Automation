package prisonNTP;

import java.util.List;

public interface IDosya {
    void create(List<String> s);
    List<String> read();
    void delete(int id);
}
