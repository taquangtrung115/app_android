package com.example.appcooking.data;

import android.content.Context;

import com.example.appcooking.Model.Category;
import com.example.appcooking.Model.Food;
import com.example.appcooking.R;

import java.util.ArrayList;

public class Input {
    private Context context;
    Food food = new Food();
    public Input(Context context)
    {
        this.context = context;
    }
    public ArrayList<Food> getMockData(){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name1),context.getString(R.string.cach_lam1),R.drawable.bunbohue));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name2),context.getString(R.string.cach_lam2),R.drawable.bunrieucua));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name3),context.getString(R.string.cach_lam3),R.drawable.bunbanthaihaisan));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name4),context.getString(R.string.cach_lam4),R.drawable.bunmiquang));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name5),context.getString(R.string.cach_lam5),R.drawable.bunmangvit));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name6),context.getString(R.string.cach_lam6),R.drawable.buncha));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name7),context.getString(R.string.cach_lam7),R.drawable.canhbohamdaungu));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name8),context.getString(R.string.cach_lam8),R.drawable.canhvitnauchao));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name9),context.getString(R.string.cach_lam9),R.drawable.bongthapcam));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name10),context.getString(R.string.cach_lam10),R.drawable.canhrongbien));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name11),context.getString(R.string.cach_lam11),R.drawable.canhthitbo));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name12),context.getString(R.string.cach_lam12),R.drawable.chaoqin));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name13),context.getString(R.string.cach_lam13),R.drawable.chaobocau));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name14),context.getString(R.string.cach_lam14),R.drawable.chaosingapore));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name15),context.getString(R.string.cach_lam15),R.drawable.chaoga));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name16),context.getString(R.string.cach_lam16),R.drawable.chaoluon));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name17),context.getString(R.string.cach_lam17),R.drawable.chaotom));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name18),context.getString(R.string.cach_lam18),R.drawable.chebuoi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name19),context.getString(R.string.cach_lam19),R.drawable.chechuoi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name20),context.getString(R.string.cach_lam20),R.drawable.chehatdac));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name21),context.getString(R.string.cach_lam21),R.drawable.chehatke));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name22),context.getString(R.string.cach_lam22),R.drawable.chekhucbach));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name23),context.getString(R.string.cach_lam23),R.drawable.boluclac));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name24),context.getString(R.string.cach_lam24),R.drawable.canhgachienncmam));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name25),context.getString(R.string.cach_lam25),R.drawable.comchienhaisan));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name26),context.getString(R.string.cach_lam26),R.drawable.comchientrung));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name28),context.getString(R.string.cach_lam28),R.drawable.mucchienncmam));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name29),context.getString(R.string.cach_lam29),R.drawable.goibanhtrangcuon));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name30),context.getString(R.string.cach_lam30),R.drawable.goikimchi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name31),context.getString(R.string.cach_lam31),R.drawable.goibocop));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name32),context.getString(R.string.cach_lam32),R.drawable.goimuc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name33),context.getString(R.string.cach_lam33),R.drawable.goisua));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name34),context.getString(R.string.cach_lam34),R.drawable.hapcachephapbia));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name35),context.getString(R.string.cach_lam35),R.drawable.hapcalochap));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name36),context.getString(R.string.cach_lam36),R.drawable.hapcamehap));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name37),context.getString(R.string.cach_lam37),R.drawable.hapgahapmuoi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name38),context.getString(R.string.cach_lam38),R.drawable.haptomhumhap));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name39),context.getString(R.string.cach_lam39),R.drawable.khocanuc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name40),context.getString(R.string.cach_lam40),R.drawable.khobokho));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name41),context.getString(R.string.cach_lam41),R.drawable.khocalockhonghe));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name42),context.getString(R.string.cach_lam42),R.drawable.khocakhotop));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name43),context.getString(R.string.cach_lam43),R.drawable.khoheokho));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name44),context.getString(R.string.cach_lam44),R.drawable.khogakho));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name45),context.getString(R.string.cach_lam45),R.drawable.laugalagiang));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name46),context.getString(R.string.cach_lam46),R.drawable.laudeham));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name47),context.getString(R.string.cach_lam47),R.drawable.laugalae));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name48),context.getString(R.string.cach_lam48),R.drawable.lauthai));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name49),context.getString(R.string.cach_lam49),R.drawable.mutkhoaitay));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name50),context.getString(R.string.cach_lam50),R.drawable.muttao));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name51),context.getString(R.string.cach_lam51),R.drawable.mutbidao));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name52),context.getString(R.string.cach_lam52),R.drawable.mutkhoailang));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name53),context.getString(R.string.cach_lam53),R.drawable.chebuoi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name54),context.getString(R.string.cach_lam54),R.drawable.chechuoi));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name55),context.getString(R.string.cach_lam55),R.drawable.nuongbobittet));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name56),context.getString(R.string.cach_lam56),R.drawable.nuongcagiaybac));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name57),context.getString(R.string.cach_lam57),R.drawable.nuongmuc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name58),context.getString(R.string.cach_lam58),R.drawable.nuongsolong));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name59),context.getString(R.string.cach_lam59),R.drawable.nuongvit));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name60),context.getString(R.string.cach_lam60),R.drawable.nuongcaloc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name61),context.getString(R.string.cach_lam61),R.drawable.xaolongheo));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name62),context.getString(R.string.cach_lam62),R.drawable.xaomiy));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name63),context.getString(R.string.cach_lam63),R.drawable.xaobachtuoc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name64),context.getString(R.string.cach_lam64),R.drawable.xaocatim));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name65),context.getString(R.string.cach_lam65),R.drawable.xaomuc));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name66),context.getString(R.string.cach_lam66),R.drawable.xoiga));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name67),context.getString(R.string.cach_lam67),R.drawable.xoichienphong));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name68),context.getString(R.string.cach_lam68),R.drawable.xoikhoaimon));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name69),context.getString(R.string.cach_lam69),R.drawable.xoitraxanh));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name70),context.getString(R.string.cach_lam70),R.drawable.xoicaro));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name71),context.getString(R.string.cach_lam71),R.drawable.avbanhducman));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name72),context.getString(R.string.cach_lam72),R.drawable.avgoicuonthitheo));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name73),context.getString(R.string.cach_lam73),R.drawable.avkhoga));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name74),context.getString(R.string.cach_lam74),R.drawable.avnemchua));
        return  tmp;
    }
    public ArrayList<Category> getMockDataCategory(){
        ArrayList<Category> tmp = new ArrayList<>();
        tmp.add(new Category("Bún",R.drawable.bunbohue));
        tmp.add(new Category("Canh",R.drawable.canhthitbo));
        tmp.add(new Category("Chiên",R.drawable.canhgachienncmam));
        tmp.add(new Category("Cháo",R.drawable.chaosingapore));
        tmp.add(new Category("Ăn Vặt",R.drawable.avkhoga));
        tmp.add(new Category("Chè",R.drawable.chekhucbach));
        tmp.add(new Category("Gỏi",R.drawable.goisua));
        tmp.add(new Category("Hấp",R.drawable.hapgahapmuoi));
        tmp.add(new Category("Kho",R.drawable.khoheokho));
        tmp.add(new Category("Lẩu",R.drawable.laugalagiang));
        tmp.add(new Category("Mứt",R.drawable.mutbidao));
        tmp.add(new Category("Nướng",R.drawable.nuongsolong));
        tmp.add(new Category("Xào",R.drawable.xaolongheo));
        tmp.add(new Category("Xôi",R.drawable.xoiga));
        return tmp;

    }
    public static ArrayList<Food> foodHistory = new ArrayList<>();
    public  void addFoodHistory(Food food){
        if (foodHistory.indexOf(food)>0){
            foodHistory.add(0,food);
        }
    }

    public static ArrayList<Food> getFoodHistory() {
        return foodHistory;
    }
}
