package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes10.dex */
public final class xc21 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yc21 f260059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hxi f260060b;

    public xc21(yc21 yc21Var, hxi hxiVar) {
        this.f260059a = yc21Var;
        this.f260060b = hxiVar;
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        MobiusLoop.Controller controller = this.f260059a.f271365t;
        controller.mo15604c(this.f260060b);
        controller.start();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        MobiusLoop.Controller controller = this.f260059a.f271365t;
        controller.stop();
        controller.disconnect();
    }
}
