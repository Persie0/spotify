package p204p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class dwd1 extends hwd1 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f53682c;

    public dwd1() {
        this.f53682c = cwd1.m34120a();
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: b */
    public swd1 mo30680b() {
        m48936a();
        swd1 swd1VarM79536g = swd1.m79536g(null, this.f53682c.build());
        swd1VarM79536g.f214650a.mo51812r(this.f95924b);
        return swd1VarM79536g;
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: d */
    public void mo37153d(dx40 dx40Var) {
        this.f53682c.setMandatorySystemGestureInsets(dx40Var.m37192e());
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: e */
    public void mo30681e(dx40 dx40Var) {
        this.f53682c.setStableInsets(dx40Var.m37192e());
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: f */
    public void mo37154f(dx40 dx40Var) {
        this.f53682c.setSystemGestureInsets(dx40Var.m37192e());
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: g */
    public void mo30682g(dx40 dx40Var) {
        this.f53682c.setSystemWindowInsets(dx40Var.m37192e());
    }

    @Override // p204p.hwd1
    /* JADX INFO: renamed from: h */
    public void mo37155h(dx40 dx40Var) {
        this.f53682c.setTappableElementInsets(dx40Var.m37192e());
    }

    public dwd1(swd1 swd1Var) {
        WindowInsets.Builder builderM34120a;
        super(swd1Var);
        WindowInsets windowInsetsM79541f = swd1Var.m79541f();
        if (windowInsetsM79541f != null) {
            builderM34120a = cwd1.m34121b(windowInsetsM79541f);
        } else {
            builderM34120a = cwd1.m34120a();
        }
        this.f53682c = builderM34120a;
    }
}
