package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class CourtReservation {

    private String courtNumber;

	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private List<String> members;
	private String owner;
	private boolean paid;

	public CourtReservation(String courtNumber, LocalDateTime startDateTime, LocalDateTime endDateTime, List<String> members, String owner, boolean paid) {
		this.courtNumber = courtNumber;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.members = members;
		this.owner = owner;
		this.paid = paid;
	}
}
