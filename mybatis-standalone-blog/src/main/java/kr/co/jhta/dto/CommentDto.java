package kr.co.jhta.dto;

import java.util.Date;

public class CommentDto {
	private String userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private Date userCreatedDate;
	private int commentNo;
	private String commentWriter;
	private String commentContent;
	private int commentBlogNo;
	private Date commentCommentCreateDate;

	public CommentDto () {
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getCommentBlogNo() {
		return commentBlogNo;
	}

	public void setCommentBlogNo(int commentBlogNo) {
		this.commentBlogNo = commentBlogNo;
	}

	public Date getCommentCommentCreateDate() {
		return commentCommentCreateDate;
	}

	public void setCommentCommentCreateDate(Date commentCommentCreateDate) {
		this.commentCommentCreateDate = commentCommentCreateDate;
	}
	
}
