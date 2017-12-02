package criminalintent.kassandrasalazar.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by KASSANDRA-PC on 30/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
