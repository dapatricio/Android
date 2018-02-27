package secretariatecnicadedrogasec.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Actividad_CentrosSalud extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    private DrawerLayout drawerLayout;
    private LinearLayout mainLayout;
    private ListView menuLateral;
    private ViewPager mViewPager;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__centros);



        ActionBar aBar = getSupportActionBar();
        aBar.setHomeAsUpIndicator(R.drawable.menu);
        aBar.setHomeButtonEnabled(true);
        aBar.setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout4);
        mainLayout = (LinearLayout) findViewById(R.id.mainLayout4);
        menuLateral = (ListView) findViewById(R.id.menuLateral);

        String[] opciones = {"Inicio", "Informacion / Videos", "Redes Sociales / Contactanos", "Centros de Salud del Ecuador","Chat en Linea"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(Actividad_CentrosSalud.this, android.R.layout.simple_list_item_1, opciones);
        menuLateral.setAdapter(adp);



        //Ventanas movibles

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager4);
        mViewPager.setAdapter(adapter);

        mViewPager.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("Seleccion \nProvincia / Cuidad").setTabListener(this);
        actionBar.addTab(tab);

        tab = actionBar.newTab().setText("Centros de Salud").setTabListener(this);
        actionBar.addTab(tab);


        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(Actividad_CentrosSalud.this, "Inicio", Toast.LENGTH_SHORT).show();
                        Intent pantalla = new Intent("secretariatecnicadedrogasec.prueba1.actividad_principal");
                        startActivity(pantalla);
                        menuLateral.setItemChecked(0, true);
                        drawerLayout.closeDrawer(menuLateral);

                        break;
                    case 1:
                        Toast.makeText(Actividad_CentrosSalud.this, "Informacion / Videos", Toast.LENGTH_SHORT).show();
                        Intent pantalla2 = new Intent("secretariatecnicadedrogasec.prueba1.actividad_informacion");
                        startActivity(pantalla2);
                        menuLateral.setItemChecked(1, true);
                        drawerLayout.closeDrawer(menuLateral);
                        break;
                    case 2:
                        Toast.makeText(Actividad_CentrosSalud.this, "Redes Sociales / Contactanos", Toast.LENGTH_SHORT).show();
                        Intent pantalla3 = new Intent("secretariatecnicadedrogasec.prueba1.actividad_redes");
                        startActivity(pantalla3);
                        menuLateral.setItemChecked(2, true);
                        drawerLayout.closeDrawer(menuLateral);
                        break;
                    case 3:
                        Toast.makeText(Actividad_CentrosSalud.this, "Centros de Salud Cercanos", Toast.LENGTH_SHORT).show();
                        Intent pantalla4 = new Intent("secretariatecnicadedrogasec.prueba1.actividad_centros");
                        startActivity(pantalla4);
                        menuLateral.setItemChecked(3, true);
                        drawerLayout.closeDrawer(menuLateral);
                        break;
                    case 4:
                        Toast.makeText(Actividad_CentrosSalud.this, "Bienvenido al Chat en Linea", Toast.LENGTH_SHORT).show();
                        Intent pantalla5 = new Intent("secretariatecnicadedrogasec.prueba1.actividad_chat");
                        startActivity(pantalla5);
                        menuLateral.setItemChecked(3, true);
                        drawerLayout.closeDrawer(menuLateral);
                        break;
                    default:
                        return;
                }
            }
        });
    }

    public class seleccionador implements AdapterView.OnItemClickListener{


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }

    //clase manejador
    public class PagerAdapter extends FragmentPagerAdapter {
        FragmentManager fragmentTransaction = getSupportFragmentManager();
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new Fragment_Categorias();
                case 1:
                    return new Fragment_Centros();
                default:
                    return null;
            }
        }
        public int getCount() {
            return 2;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(menuLateral)){
                drawerLayout.closeDrawer(menuLateral);
            }else {
                drawerLayout.openDrawer(menuLateral);
            }
        }

        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //implements on pager selected
    @Override
    public void onPageScrolled(int i, float v, int i2) {

    }

    @Override
    public void onPageSelected(int i) {
        getSupportActionBar().setSelectedNavigationItem(i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }


    //implements tab listener
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    //desactiva el boton de Atras o volver de la app
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode== KeyEvent.KEYCODE_BACK)
            Toast.makeText(getApplicationContext(), "Boton de 'Atras' desabilitado",
                    Toast.LENGTH_LONG).show();

        return false;
        // Disable back button..............
    }


}
