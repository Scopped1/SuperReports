package it.scopped.superreports.report;

import it.scopped.superreports.api.report.IReportData;
import it.scopped.superreports.code.CodeGenerator;

public class ReportData implements IReportData {

	private final int id;

	private final String sender;
	private final String suspect;

	private final String reason;

	public ReportData(String sender, String suspect, String reason) {
		this.id = CodeGenerator.generate();

		this.sender = sender;
		this.suspect = suspect;

		this.reason = reason;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getSender() {
		return this.sender;
	}

	@Override
	public String getSuspect() {
		return this.suspect;
	}

	@Override
	public String getReason() {
		return this.reason;
	}
}