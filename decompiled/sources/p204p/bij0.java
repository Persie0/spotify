package p204p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class bij0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f27487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y0i0 f27488b;

    public bij0(sir0 sir0Var, y0i0 y0i0Var) {
        this.f27487a = sir0Var;
        this.f27488b = y0i0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.f27487a.mo30231j(this.f27488b.m92594m(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f27487a.mo30231j(yhj0.f272916a);
    }
}
