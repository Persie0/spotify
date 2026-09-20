package p204p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class uj4 implements NsdManager.DiscoveryListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f230893a;

    public uj4(sir0 sir0Var) {
        this.f230893a = sir0Var;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        this.f230893a.mo30231j(dqr.f52066a);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        this.f230893a.mo30231j(dqr.f52067b);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        this.f230893a.mo30231j(new aqr(nsdServiceInfo));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getServiceName();
        this.f230893a.mo30231j(new bqr(nsdServiceInfo));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        this.f230893a.mo30231j(new cqr(i));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        this.f230893a.mo30231j(new eqr(i));
    }
}
