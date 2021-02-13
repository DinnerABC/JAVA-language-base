package com.patgame;

import java.util.Timer;
import java.util.TimerTask;

public class JudgeSystem extends Animal{
	
	
	public JudgeSystem() {
		
	}
	
	public void Judge() {  //����ֵ���й���
		int last=1;
		
		if(getLevel()<5 ) {  //1-5 50����ֵ����
			last=getLevel();
			while(getExperience()>=50) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=5 && getLevel()<10) {  //5-10 100����ֵ����
			last=getLevel();
			while(getExperience()>=100) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=10 && getLevel()<20 ) {  //10-20 150����ֵ����
			last=getLevel();
			while(getExperience()>=150) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=20) {   //20������ 200����ֵ����
			last=getLevel();
			while(getExperience()>=200) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}
		if(getLevel()>last) {
			System.out.println("����������");
			System.out.println(getName()+" Ŀǰ1�ĵȼ�Ϊ��"+getLevel());
		}
	}
	 
	public void autoReduce() {   //��ʱ��
		Timer timer = new Timer();  
        timer.scheduleAtFixedRate(new TimerTask() {  
                public void run() {  
                    setStrength(getStrength()-5);
                    setMood(getMood()-2);
                    setClear(getClear()-5);
                    setExperience(getExperience()+2);
                    Judge();   //���þ���ֵ���У�10s����һ��
                }  
        }, 1000 , 10000);   //��1�뿪ʼ��10��ѭ��һ�Σ�ռ��һ���߳�
	}
}
