package p204p;

import android.os.Bundle;
import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes11.dex */
public final class vpr implements hr91 {

    /* JADX INFO: renamed from: X */
    public final mpr f243753X;

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller f243754a;

    /* JADX INFO: renamed from: b */
    public final cnh0 f243755b;

    /* JADX INFO: renamed from: c */
    public final o72 f243756c;

    /* JADX INFO: renamed from: d */
    public final wop f243757d;

    /* JADX INFO: renamed from: e */
    public final s8j f243758e;

    /* JADX INFO: renamed from: f */
    public final qpr f243759f;

    /* JADX INFO: renamed from: g */
    public final ppr f243760g;

    /* JADX INFO: renamed from: h */
    public final btv0 f243761h;

    /* JADX INFO: renamed from: i */
    public final View f243762i;

    /* JADX INFO: renamed from: t */
    public final iwr f243763t = new iwr();

    public vpr(rmm0 rmm0Var, MobiusLoop.Controller controller, cnh0 cnh0Var, o72 o72Var, wop wopVar, s8j s8jVar, qpr qprVar, ppr pprVar, btv0 btv0Var, qro qroVar, hc80 hc80Var, onp onpVar, ComposeView composeView) {
        this.f243754a = controller;
        this.f243755b = cnh0Var;
        this.f243756c = o72Var;
        this.f243757d = wopVar;
        this.f243758e = s8jVar;
        this.f243759f = qprVar;
        this.f243760g = pprVar;
        this.f243761h = btv0Var;
        this.f243762i = composeView;
        this.f243753X = pprVar instanceof mpr ? (mpr) pprVar : null;
        rmm0Var.mo29873e().getLifecycle().mo31986a(new upr(this));
        hc80Var.getLifecycle().mo31986a(onpVar);
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f243762i;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        fpr fprVar = (fpr) this.f243754a.mo15602a();
        Integer num = fprVar.f71955a;
        if (num == null) {
            num = fprVar.f71956b;
        }
        bundle.putParcelable("discoveryFeedModel", fpr.m42381c(fprVar, null, num, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048532));
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        mpr mprVar = this.f243753X;
        if (mprVar != null) {
        }
        qpr qprVar = this.f243759f;
        ppr pprVar = this.f243760g;
        qprVar.f191368a = pprVar;
        this.f243758e.m77512d(pprVar.mo53972c(), pprVar.getContextUri());
        o72 o72Var = this.f243756c;
        MobiusLoop.Controller controller = this.f243754a;
        controller.mo15604c(o72Var);
        controller.start();
        this.f243757d.f253526a.onNext(Boolean.TRUE);
    }

    @Override // p204p.hr91
    public final void stop() {
        mpr mprVar = this.f243753X;
        if (mprVar != null) {
        }
        MobiusLoop.Controller controller = this.f243754a;
        controller.stop();
        controller.disconnect();
        controller.mo15603b(fpr.m42381c((fpr) controller.mo15602a(), null, null, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048551));
        this.f243757d.f253526a.onNext(Boolean.FALSE);
        this.f243763t.m51847a();
    }
}
