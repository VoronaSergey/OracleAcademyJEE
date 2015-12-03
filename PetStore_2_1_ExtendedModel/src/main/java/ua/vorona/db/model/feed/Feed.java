package ua.vorona.db.model.feed;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.Item;

@Entity
public class Feed extends Item {
	private String feedName;
	@OneToOne
	private FeedType feedType;

	public String getFeedName() {
		return feedName;
	}

	public void setFeedName(String feedName) {
		this.feedName = feedName;
	}

	public FeedType getFeedType() {
		return feedType;
	}

	public void setFeedType(FeedType feedType) {
		this.feedType = feedType;
	}
}
