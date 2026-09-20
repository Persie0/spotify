package p204p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class vj4 implements NsdManager.ResolveListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f241867a;

    public vj4(hqb hqbVar) {
        this.f241867a = hqbVar;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        this.f241867a.resumeWith(new shk0(i));
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        this.f241867a.resumeWith(new uhk0(nsdServiceInfo));
    }
}
