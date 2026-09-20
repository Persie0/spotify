package p204p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class kww0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public boolean f127254a;

    /* JADX INFO: renamed from: b */
    public boolean f127255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s18 f127256c;

    public kww0(s18 s18Var) {
        this.f127256c = s18Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        s18.m76918a(this.f127256c).post(new jww0(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        s18.m76918a(this.f127256c).post(new jww0(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.f127254a;
        s18 s18Var = this.f127256c;
        if (z && this.f127255b == zHasCapability) {
            if (zHasCapability) {
                s18.m76918a(s18Var).post(new jww0(this, 1));
            }
        } else {
            this.f127254a = true;
            this.f127255b = zHasCapability;
            s18.m76918a(s18Var).post(new jww0(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        s18.m76918a(this.f127256c).post(new jww0(this, 0));
    }
}
