package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes9.dex */
public final class wmf implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MobiusLoop.Controller f252849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cnf f252850b;

    public wmf(MobiusLoop.Controller controller, cnf cnfVar) {
        this.f252849a = controller;
        this.f252850b = cnfVar;
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        MobiusLoop.Controller controller = this.f252849a;
        if (((kmf) controller.mo15602a()).m56900c()) {
            this.f252850b.f39999a.m85992c((kmf) controller.mo15602a());
        }
        controller.stop();
        controller.disconnect();
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        cnf cnfVar = this.f252850b;
        MobiusLoop.Controller controller = this.f252849a;
        controller.mo15604c(cnfVar);
        controller.start();
    }
}
