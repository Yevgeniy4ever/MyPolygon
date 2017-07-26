package org.agoncal.book.javaee7.chapter04;
@Entity
@NamedQueries({
	@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
	@NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'H2G2'")
	})
public class Book{
	@id
	@GeneratedValue
	privaate Long id;
	@NotNull
	private String title;
	private Float price;
	@Size(min 10, max = 2000)
	private String description;
	private String isbn;
	private Integer nbOfPage;
	private Boolean illustrations;
}