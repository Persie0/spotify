package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes9.dex */
public final class smr0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MobiusLoop.Controller f210723a;

    public smr0(MobiusLoop.Controller controller) {
        this.f210723a = controller;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f210723a.disconnect();
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f210723a.start();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f210723a.stop();
    }
}
