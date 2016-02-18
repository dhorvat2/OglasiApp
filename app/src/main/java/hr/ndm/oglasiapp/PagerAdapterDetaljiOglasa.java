package hr.ndm.oglasiapp;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dario on 18.2.2016..
 */
public class PagerAdapterDetaljiOglasa extends FragmentPagerAdapter {
    final int PAGE_BROJ = 2;
    private String tabNaslovi[] = new String[] { "Ponude", "Komentari"};
    private Context context;

    public PagerAdapterDetaljiOglasa(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_BROJ;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PonudaFragment tab1 = new PonudaFragment();
                return tab1;
            case 1:
                KomentariFragment tab2 = new KomentariFragment();
                return tab2;
            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabNaslovi[position];
    }


}
