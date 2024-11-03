package it.scopped.superreports.api.report;

import org.bukkit.entity.Player;

import java.util.concurrent.CompletableFuture;

public interface IReportsManager {
	void createAndSendReport(Player sender, Player suspect, String reason);

	CompletableFuture<IReportData> getReport(int reportId);
}