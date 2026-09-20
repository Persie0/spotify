package p204p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes11.dex */
public final class r1f1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z1f1 f194846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f194847b;

    public r1f1(z1f1 z1f1Var, hqb hqbVar) {
        this.f194846a = z1f1Var;
        this.f194847b = hqbVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        System.currentTimeMillis();
        z1f1 z1f1Var = this.f194846a;
        z1f1Var.f278309c = networkCapabilities;
        z1f1.m95105d(z1f1Var, networkCapabilities, this.f194847b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f194846a.m95106b();
        super.onLost(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f194846a.m95106b();
        hqb hqbVar = this.f194847b;
        boolean zIsActive = hqbVar.isActive();
        Boolean boolValueOf = Boolean.valueOf(zIsActive);
        if (!zIsActive) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            hqbVar.resumeWith(null);
        }
        super.onUnavailable();
    }
}
