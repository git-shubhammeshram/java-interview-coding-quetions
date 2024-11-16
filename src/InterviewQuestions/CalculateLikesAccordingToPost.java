package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateLikesAccordingToPost {

	private int userId;
	private int likes;
	private String content;


	public CalculateLikesAccordingToPost(int userId, int likes, String content) {
		this.userId = userId;
		this.likes = likes;
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "CalculateTotalLikesPerUser{" +
				"userId=" + userId +
				", likes=" + likes +
				", content='" + content + '\'' +
				'}';
	}

	public static void main(String[] args) {

		List<CalculateLikesAccordingToPost> users = Arrays.asList(
				new CalculateLikesAccordingToPost(1, 50, "First Post By User:1"),
                new CalculateLikesAccordingToPost(2, 30, "Second Post By User:2"),
                new CalculateLikesAccordingToPost(1, 20, "Third Post By User:1"),
                new CalculateLikesAccordingToPost(3, 70, "Fourth Post By User:3"),
				new CalculateLikesAccordingToPost(2, 10, "Fifth Post By User:2"),
				new CalculateLikesAccordingToPost(3, 100, "Sixth Post By User:")
		);

	/*	Map<Integer, Integer> collect = users.stream()
				.collect(Collectors.groupingBy(CalculateTotalLikesPerUser::getUserId, Collectors.summingInt(CalculateTotalLikesPerUser::getLikes)));

        collect.forEach((userId, totalLikes) -> {
            System.out.println("User: " + userId + " - Total Likes: " + totalLikes);
        });*/


		Map<Integer, Integer> collect = users.stream()
				.collect(Collectors.groupingBy(CalculateLikesAccordingToPost::getUserId, Collectors.summingInt(CalculateLikesAccordingToPost::getLikes)));

		List<Map.Entry<Integer, Integer>> result = collect.entrySet()
				.stream().filter(entry -> entry.getValue() > 50).toList();
		result.forEach(entry ->

				System.out.println("USER ID: " + entry.getKey() +"   Total Likes: " + entry.getValue())

		);

	}
}
