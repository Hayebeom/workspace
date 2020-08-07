package kr.co.jhta.vo;

import java.util.Date;

public class Comment {

	private int no;
	private String writer;
	private String content;
	private int blogNo;
	private Date commentCreateDate;
	
	public Comment() {
		
	}

	public Comment(int no, String writer, String content, int blogNo) {
		super();
		this.no = no;
		this.writer = writer;
		this.content = content;
		this.blogNo = blogNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}

	public Date getCommentCreateDate() {
		return commentCreateDate;
	}

	public void setCommentCreateDate(Date commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}
	
}
