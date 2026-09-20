package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes9.dex */
public final class b241 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MobiusLoop.Controller f22497a;

    public b241(MobiusLoop.Controller controller) {
        this.f22497a = controller;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f22497a.disconnect();
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f22497a.start();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f22497a.stop();
    }
}
