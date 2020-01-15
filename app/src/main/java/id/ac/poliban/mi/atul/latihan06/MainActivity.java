package id.ac.poliban.mi.atul.latihan06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat object inflater
        MenuInflater inflater = getMenuInflater();
        //menempelkan menu ke object inflater
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.miCherryBarb){
            View view = this.getWindow().getDecorView();
            //terlihat file gambar cherry barb sebagai
            //hasil import android drawable importer
            //dikenali dalam source code kita
            view.setBackgroundResource(R.drawable.cherry_barb);
        }
        if(item.getItemId()==R.id.miGuppies){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.guppy);
        }
        if(item.getItemId()==R.id.miMollies){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.black_mollies_1);
        }
        if(item.getItemId()==R.id.miNeonTetra){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.neon_tetra_new);
        }
        if(item.getItemId()==R.id.miOscar){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.oscar);
        }
        if(item.getItemId()==R.id.miPlaties){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.sunburst_platy);
        }
        if(item.getItemId()==R.id.miZebraDanios){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.zebra_danio);
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
