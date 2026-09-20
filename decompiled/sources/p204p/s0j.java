package p204p;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes3.dex */
public final class s0j implements r0j {

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f204421b;

    public s0j(ConnectivityManager connectivityManager) {
        this.f204421b = connectivityManager;
    }

    @Override // p204p.r0j
    /* JADX INFO: renamed from: a */
    public final boolean mo71849a() {
        ConnectivityManager connectivityManager = this.f204421b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
