package hero;
public class Hero {
	
	String name; //����
	
	float hp; //Ѫ��
	
	float armor; //����
	
	int moveSpeed; //�ƶ��ٶ�
	
	 //�Ӷ���
    void keng(){
    	System.out.println("�Ӷ��ѣ�");
    }

    //��ȡ����ֵ
    float getArmor(){
    	return armor;
    }
    
    //�����ƶ��ٶ�
    void addSpeed(int speed){
    	//��ԭ���Ļ����������ƶ��ٶ�
    	moveSpeed = moveSpeed + speed;
    }
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		Hero teemo =  new Hero();
		teemo.name = "��Ī";
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