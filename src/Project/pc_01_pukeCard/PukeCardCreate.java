package Project.pc_01_pukeCard;

import java.util.*;

public class PukeCardCreate {
    public static void main(String[] args) {
        //1.1 买牌：定义双列集合存储 牌编号和牌号      规则：编号越小，牌越小
        Map<Integer,String> pokers = new HashMap<>();
        //1.2 定义单列集合存储编号
        List<Integer> list = new ArrayList<>();

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♣","♠","♦"};
        int num = 0;
        //构造牌
        for(String number : numbers){
            for(String color:colors){
                String poker = color+number;
                pokers.put(num,poker);
                list.add(num);
                num++;
            }
        }
        //添加大小王
        pokers.put(num,"小王");
        list.add(num++);
        pokers.put(num,"大王");
        list.add(num);

        System.out.println("所有的牌:"+pokers);
        System.out.println("牌的编号："+list);

        //2.洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后,编号为："+list);
        //3.发牌
        //3.1定义4个集合，分别表示3个玩家，底牌
        List<Integer> ahao = new ArrayList<>();
        List<Integer> GD = new ArrayList<>();
        List<Integer> eason = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        //3.2具体的发牌动作，将索引和3取模，决定发给谁
        for(int i = 0;i<list.size();i++){
            Integer pokerNum = list.get(i);
            if(i>=list.size()-3){
                dipai.add(pokerNum);
            }else if(i%3 == 0){
                ahao.add(pokerNum);
            }
            else if(i%3 == 1){
                GD.add(pokerNum);
            }
            else if(i%3 == 2){
                eason.add(pokerNum);
            }
        }
        //3.查看玩家，底牌的编号
        /*System.out.println("ahao: "+ ahao);
        System.out.println("GD: "+ GD);
        System.out.println("eason: "+ eason);
        System.out.println("dipai: "+ dipai);*/
        //4.查看具体的牌

        System.out.println("ahao: "+ printPoker(ahao,pokers));
        System.out.println("GD: "+ printPoker(GD,pokers));
        System.out.println("eason: "+ printPoker(eason,pokers));
        System.out.println("dipai: "+ printPoker(dipai,pokers));
    }

    public static String printPoker(List<Integer> nums, Map<Integer, String> pokers){
        Collections.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(Integer num:nums){
            String poker = pokers.get(num);
            sb.append(poker+" ");
        }
        String str = sb.toString();
        return str.trim();
    }
}
