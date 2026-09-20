package p204p;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class eij0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f59895a = 0;

    static {
        gaz.m44194g("NetworkStateTracker");
    }

    /* JADX INFO: renamed from: a */
    public static final aij0 m39105a(ConnectivityManager connectivityManager) {
        boolean zM29704v;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesM29701s = bkg1.m29701s(connectivityManager, ekg1.m39297t(connectivityManager));
            zM29704v = networkCapabilitiesM29701s != null ? bkg1.m29704v(networkCapabilitiesM29701s) : false;
        } catch (SecurityException unused) {
            gaz.m44190b().getClass();
        }
        return new aij0(z, zM29704v, dwg1.m37166j(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
