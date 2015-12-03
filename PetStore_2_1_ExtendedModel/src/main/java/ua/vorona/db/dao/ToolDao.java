package ua.vorona.db.dao;

import ua.vorona.db.model.Tool;

public interface ToolDao {

	void create(Tool tool);

	Tool read(long id);

	boolean update(Tool tool);

	boolean delete(Tool tool);
}
