package com.example.coffeehousedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView GV_menu , GV_offer, GV_Update, GV_CoffeeLover;

    ArrayList<News_Menu_Item> array_list_news_menu_item;
    News_Menu_Item news_menu_item;
    News_Menu_Adapter news_menu_adapter;

    ArrayList<News_Offer_Item> array_list_news_offer_item;
    News_Offer_Item news_offer_item;
    News_Offer_Adapter news_offer_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV_menu = findViewById(R.id.GV_menu);
        GV_offer = findViewById(R.id.GV_Offer);
        GV_Update = findViewById(R.id.GV_Update);
        GV_CoffeeLover = findViewById(R.id.GV_CoffeeLover);

        array_list_news_menu_item = new ArrayList<>();
        Menu();
        news_menu_adapter = new News_Menu_Adapter(this , array_list_news_menu_item);
        GV_menu.setAdapter(news_menu_adapter);

        array_list_news_offer_item = new ArrayList<>();
        Offer();
        news_offer_adapter = new News_Offer_Adapter( this, array_list_news_offer_item);
        GV_offer.setAdapter(news_offer_adapter);

        array_list_news_offer_item = new ArrayList<>();
        Update();
        news_offer_adapter = new News_Offer_Adapter( this, array_list_news_offer_item);
        GV_Update.setAdapter(news_offer_adapter);

        array_list_news_offer_item = new ArrayList<>();
        CoffeeLover();
        news_offer_adapter = new News_Offer_Adapter( this, array_list_news_offer_item);
        GV_CoffeeLover.setAdapter(news_offer_adapter);
    }

    private void Menu()
    {
        //  Menu 1
        news_menu_item = new News_Menu_Item();
        news_menu_item.setId(1);
        news_menu_item.setImage(R.drawable.image_earn_points);
        news_menu_item.setTitle("Tích điểm");
        array_list_news_menu_item.add(news_menu_item);

        //  Menu 2
        news_menu_item = new News_Menu_Item();
        news_menu_item.setId(2);
        news_menu_item.setImage(R.drawable.image_order);
        news_menu_item.setTitle("Đặt hàng");
        array_list_news_menu_item.add(news_menu_item);

        //  Menu 3
        news_menu_item = new News_Menu_Item();
        news_menu_item.setId(3);
        news_menu_item.setImage(R.drawable.image_coupon);
        news_menu_item.setTitle("Coupon");
        array_list_news_menu_item.add(news_menu_item);
    }

    private void Offer()
    {
        //  Product 1
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(1);
        news_offer_item.setImage(R.drawable.image_offers_01);
        news_offer_item.setTitle("Giảm 50%, thèm gì gọi nhé \nNhà mang tới liền");
        news_offer_item.setContent("Hòa vào không khí siêu sale \ncuối năm, mời team mình \nnghỉ tay gọi món yêu thích, N...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 2
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(2);
        news_offer_item.setImage(R.drawable.image_offers_02);
        news_offer_item.setTitle("Nhà mời cà phê đậm đà, chỉ 12K");
        news_offer_item.setContent("Tuần mới chỉ thật sự tươi tỉnh \nkhi có một tách cà phê đậm đà \nkề bên. Biết vậy nên Nhà mời...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 3
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(3);
        news_offer_item.setImage(R.drawable.image_offers_03);
        news_offer_item.setTitle("Nhà mời 20%, PICKUP nha");
        news_offer_item.setContent("Trải nghiệm ngay tính năng \nPICKUP của Nhà với ưu đãi \nGIẢM 20% cho đơn hàng chỉ ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 4
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(4);
        news_offer_item.setImage(R.drawable.image_offers_04);
        news_offer_item.setTitle("Bánh ngon Nhà mời, chỉ 19.000đ!");
        news_offer_item.setContent("Cuối năm bận rộn thi cử, chạy \nsố, chiến \"deadline\" nhưng \nkhông được bỏ bữa nha ấy n...");
        array_list_news_offer_item.add(news_offer_item);
    }

    private void Update(){
        //  Product 1
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(1);
        news_offer_item.setImage(R.drawable.image_update_01);
        news_offer_item.setTitle("Nhà Riverside Vũ Tông Phan - Hà Nội vui khai trương lin...");
        news_offer_item.setContent("Người ta dậy thì thành công, còn chúng mình dậy thì thì nhớ mang chiếc áo đủ ấm, ghé ng...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 2
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(2);
        news_offer_item.setImage(R.drawable.image_update_02);
        news_offer_item.setTitle("Taste of Xmas - Chạm vị Giáng sinh");
        news_offer_item.setContent("Năm nay tại Nhà, \"vị\" Giáng \nsinh mà bạn yêu thích, mong \nchờ từ trước đến nay vẫn sẽ ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 3
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(3);
        news_offer_item.setImage(R.drawable.image_update_03);
        news_offer_item.setTitle("Trời se lạnh, thưởng thức ngay những món nóng của ...");
        news_offer_item.setContent("Chớm đầu Đông, những cơn \nmưa bất chợt làm trời se lạnh \nlà thời điểm tuyệt vời để nhâ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 4
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(4);
        news_offer_item.setImage(R.drawable.image_update_04);
        news_offer_item.setTitle("Cùng Nhà Trải Nghiệm \"PICK UP\"");
        news_offer_item.setContent("Trải nghiệm \"PICK UP\" ngay \nChủ động đến lấy, không chờ đợi!");
        array_list_news_offer_item.add(news_offer_item);
    }

    private void CoffeeLover(){
        //  Product 1
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(1);
        news_offer_item.setImage(R.drawable.image_coffee_lover_01);
        news_offer_item.setTitle("Bản sắc nơi đất trồng, Một Hành Trình Tìm Về Nguyên ...");
        news_offer_item.setContent("Cùng Nhà bắt đầu hành trình đầu tiên cùng travel blogger Nhị Đặng lên đường \"Cà phê ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 2
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(2);
        news_offer_item.setImage(R.drawable.image_coffee_lover_02);
        news_offer_item.setTitle("Hương vị Cà phê mới tại Nhà Signature");
        news_offer_item.setContent("Nhà Signature - nơi những \nhương vị nguyên bản tạo nên \ntrải nghiệm khác biệt. Tháng ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 3
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(3);
        news_offer_item.setImage(R.drawable.image_coffee_lover_03);
        news_offer_item.setTitle("Costa Rica - Tách \"Hand \nBrew\" Mới, Bạn Đã Thử Ch...");
        news_offer_item.setContent("Tạo khác biệt từ chất nguyên \nbản. Thước phim \"Khác biệt\" \ndưới đây là món quà được lấ...");
        array_list_news_offer_item.add(news_offer_item);

        //  Product 4
        news_offer_item = new News_Offer_Item();
        news_offer_item.setId(4);
        news_offer_item.setImage(R.drawable.image_coffee_lover_04);
        news_offer_item.setTitle("Hương Vị \"Handbrew\" Mới - \nBạn Đã Thử Chưa?");
        news_offer_item.setContent("Costa Rica - Tách Hand Brew \nđượm vị cho mùa hè của bạn \nthêm phần ngọt ngào. Hạt cà ...");
        array_list_news_offer_item.add(news_offer_item);
    }
}