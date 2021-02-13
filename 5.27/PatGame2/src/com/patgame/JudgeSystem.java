package com.patgame;

import java.util.Timer;
import java.util.TimerTask;

public class JudgeSystem extends Animal{
	
	
	public JudgeSystem() {
		
	}
	
	public void Judge() {  //经验值裁判功能
		int last=1;
		
		if(getLevel()<5 ) {  //1-5 50经验值升级
			last=getLevel();
			while(getExperience()>=50) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=5 && getLevel()<10) {  //5-10 100经验值升级
			last=getLevel();
			while(getExperience()>=100) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=10 && getLevel()<20 ) {  //10-20 150经验值升级
			last=getLevel();
			while(getExperience()>=150) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}else if(getLevel()>=20) {   //20级以上 200经验值升级
			last=getLevel();
			while(getExperience()>=200) {
				setLevel(getLevel()+1);
				setExperience(0);
				break;
			}
		}
		if(getLevel()>last) {
			System.out.println("我升级啦！");
			System.out.println(getName()+" 目前1的等级为："+getLevel());
		}
	}
	 
	public void autoReduce() {   //计时器
		Timer timer = new Timer();  
        timer.scheduleAtFixedRate(new TimerTask() {  
                public void run() {  
                    setStrength(getStrength()-5);
                    setMood(getMood()-2);
                    setClear(getClear()-5);
                    setExperience(getExperience()+2);
                    Judge();   //调用经验值裁判，10s更新一次
                }  
        }, 1000 , 10000);   //从1秒开始，10秒循环一次，占用一个线程
	}
}
