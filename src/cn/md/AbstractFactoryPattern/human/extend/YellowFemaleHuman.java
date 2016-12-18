package cn.md.AbstractFactoryPattern.human.extend;

import cn.md.AbstractFactoryPattern.human.impl.AbstractYellowHuman;

/** 
 * <Description> 女性黄种人<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.human.extend <br>
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

	/**
	 * Description: 女黄种人<br> 
	 * @author Jizuz<br> <br>
	 */
	public void sex() {
		System.out.println("该黄种人的性别为女...");
	}

}
