/**
 * 
 */
package action;

import java.util.ArrayList;
import java.util.List;

import bean.Group;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *<p>Title:GropAction</p>
 * @comment:
 * @author Zhixin Zhang
 * @date 2015年7月21日 上午8:42:13
 */
public class GropAction extends ActionSupport implements ModelDriven<Group>{
	private Group group=new Group();

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("jhjwe"+group.getId());
		List list=new ArrayList();
		list.add("football");
		list.add("basketball");
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Group getModel() {
		// TODO Auto-generated method stub
		if(group==null) group=null;
		return group;
	}
	
}
