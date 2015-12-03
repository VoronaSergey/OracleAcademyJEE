package ua.vorona.db.repository;

public interface SqlSpecification extends BaseSpecification{
	
	String toSqlClauses();
}
