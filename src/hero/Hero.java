package hero;
public class Hero {
	
	String name; //姓名
	
	float hp; //血量
	
	float armor; //护甲
	
	int moveSpeed; //移动速度
	
	 //坑队友
    void keng(){
    	System.out.println("坑队友！");
    }

    //获取护甲值
    float getArmor(){
    	return armor;
    }
    
    //增加移动速度
    void addSpeed(int speed){
    	//在原来的基础上增加移动速度
    	moveSpeed = moveSpeed + speed;
    }
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		Hero teemo =  new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
		garen.keng();
		garen.addSpeed(500);
		garen.getArmor();
		
		teemo.keng();
		teemo.addSpeed(200);
		teemo.getArmor();
		

		System.out.println(teemo.armor);
		System.out.println(garen.armor);
		System.out.println(teemo.moveSpeed);
		System.out.println(garen.moveSpeed);
		
	}	
	
}