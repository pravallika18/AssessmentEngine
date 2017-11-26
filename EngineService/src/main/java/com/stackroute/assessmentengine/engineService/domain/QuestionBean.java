package com.stackroute.assessmentengine.engineService.domain;

import java.util.List;

public class QuestionBean {
	    private String noOfQuestions;
	    
	   

		private String msg;
	    
        public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		private String examId;

	    private String studentId;

	    private String questionId;

	    private String question;

	    private List<String> Options;

	    private String correctAnswer;

	    private String userAnswer;
	    
		private String questionType;

	    private String subject;

	    private String level;

	    private String complexity;

	    private String marksAllotted;

	    private String timeTakenInSeconds;

	    private String questionStartTime;

	    private String questionEndTime;

	    private String examStartTime;

	    private String examEndTime;

	    private String marksAttained;

	    public QuestionBean() {
	    	
	    }

	    public String getExamId() {
			return examId;
		}

		public void setExamId(String examId) {
			this.examId = examId;
		}

		public String getStudentId() {
			return studentId;
		}

		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		public String getQuestionId() {
			return questionId;
		}

		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}
		 public String getNoOfQuestions() {
				return noOfQuestions;
			}

			public void setNoOfQuestions(String noOfQuestions) {
				this.noOfQuestions = noOfQuestions;
			}
		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public List<String> getOptions() {
			return Options;
		}

		public void setOptions(List<String> options) {
			this.Options = options;
		}

		public String getCorrectAnswer() {
			return correctAnswer;
		}

		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}

		public String getUserAnswer() {
			return userAnswer;
		}

		public void setUserAnswer(String userAnswer) {
			this.userAnswer = userAnswer;
		}

		public String getQuestionType() {
			return questionType;
		}

		public void setQuestionType(String questionType) {
			this.questionType = questionType;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getComplexity() {
			return complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getMarksAllotted() {
			return marksAllotted;
		}

		public void setMarksAllotted(String marksAlloted) {
			this.marksAllotted = marksAlloted;
		}

		public String getTimeTakenInSeconds() {
			return timeTakenInSeconds;
		}

		public void setTimeTakenInSeconds(String timeTakenInSeconds) {
			this.timeTakenInSeconds = timeTakenInSeconds;
		}

		public String getQuestionStartTime() {
			return questionStartTime;
		}

		public void setQuestionStartTime(String questionStartTime) {
			this.questionStartTime = questionStartTime;
		}

		public String getQuestionEndTime() {
			return questionEndTime;
		}

		public void setQuestionEndTime(String questionEndTime) {
			this.questionEndTime = questionEndTime;
		}

		public String getExamStartTime() {
			return examStartTime;
		}

		public void setExamStartTime(String examStartTime) {
			this.examStartTime = examStartTime;
		}

		public String getExamEndTime() {
			return examEndTime;
		}

		public void setExamEndTime(String examEndTime) {
			this.examEndTime = examEndTime;
		}

		public String getMarksAttained() {
			return marksAttained;
		}

		public void setMarksAttained(String marksAttained) {
			this.marksAttained = marksAttained;
		}

		public QuestionBean(String examId, String studentId, String questionId, String question,
				List<String> Options, String correctAnswer, String userAnswer, String questionType,
				String subject, String level, String complexity, String marksAlloted, String timeTakenInSeconds,
				String questionStartTime, String questionEndTime, String examStartTime, String examEndTime,
				String marksAttained,String noofquestions) {
			super();
			this.examId = examId;
			this.studentId = studentId;
			this.questionId = questionId;
			this.question = question;
			this.Options = Options;
			this.correctAnswer = correctAnswer;
			this.userAnswer = userAnswer;
			this.questionType = questionType;
			this.subject = subject;
			this.level = level;
			this.complexity = complexity;
			this.marksAllotted = marksAlloted;
			this.timeTakenInSeconds = timeTakenInSeconds;
			this.questionStartTime = questionStartTime;
			this.questionEndTime = questionEndTime;
			this.examStartTime = examStartTime; 	
			this.examEndTime = examEndTime;
			this.marksAttained = marksAttained;
			this.noOfQuestions=noofquestions;
		}
		public QuestionBean(String k)
		{
			this.msg=k;
		}

		@Override
		public String toString() {
			return "QuestionBean [noOfQuestions=" + noOfQuestions + ", msg=" + msg + ", examId=" + examId
					+ ", studentId=" + studentId + ", questionId=" + questionId + ", question=" + question
					+ ", Options=" + Options + ", correctAnswer=" + correctAnswer + ", userAnswer=" + userAnswer
					+ ", questionType=" + questionType + ", subject=" + subject + ", level=" + level + ", complexity="
					+ complexity + ", marksAllotted=" + marksAllotted + ", timeTakenInSeconds=" + timeTakenInSeconds
					+ ", questionStartTime=" + questionStartTime + ", questionEndTime=" + questionEndTime
					+ ", examStartTime=" + examStartTime + ", examEndTime=" + examEndTime + ", marksAttained="
					+ marksAttained + "]";
		}

		
	

}
