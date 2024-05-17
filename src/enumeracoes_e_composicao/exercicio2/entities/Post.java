package enumeracoes_e_composicao.exercicio2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private List<Comment> comments = new ArrayList<>();
	private String content;
	private int likes;
	private Date moment;

	private String title;

	public Post() {
	}

	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public String getContent() {
		return content;
	}

	public int getLikes() {
		return likes;
	}

	public Date getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(title + "\n");
		stringBuilder.append(likes);
		stringBuilder.append(" Likes - ");
		stringBuilder.append(sdf.format(moment) + "\n");
		stringBuilder.append(content + "\n");
		stringBuilder.append(" - - - Comments - - - \n");

		comments.forEach(comment -> stringBuilder.append(comment.getMessage() + "\n"));

		return stringBuilder.toString();
	}

}
