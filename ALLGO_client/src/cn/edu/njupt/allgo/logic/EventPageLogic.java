package cn.edu.njupt.allgo.logic;


public interface EventPageLogic {

	/**
	 * 得到活动补充和评论
	 */
	public void getEventDetails (int eid);
	
	/**
	 * 发送评论
	 */
	public void sendComment(String comment ,int uid,int eid,String uname , int replyuid ,String replyuname);
	
	/**
	 * 加入活动
	 */
	public void follow(int eid);
	
	/**
	 * 取消加入
	 */
	public void unfollow(int eid);
	
	public void sendAdd(int uid ,int eid ,String text);
	
	public void destroyEvent(int uid ,int eid);
	
}
