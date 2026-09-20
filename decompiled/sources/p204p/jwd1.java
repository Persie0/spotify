package p204p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class jwd1 extends iwd1 {

    /* JADX INFO: renamed from: n */
    public dx40 f116630n;

    public jwd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var, windowInsets);
        this.f116630n = null;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: b */
    public swd1 mo54431b() {
        return swd1.m79536g(null, this.f106406c.consumeStableInsets());
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: c */
    public swd1 mo54432c() {
        return swd1.m79536g(null, this.f106406c.consumeSystemWindowInsets());
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: j */
    public final dx40 mo54433j() {
        if (this.f116630n == null) {
            WindowInsets windowInsets = this.f106406c;
            this.f116630n = dx40.m37189b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f116630n;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: o */
    public boolean mo54434o() {
        return this.f106406c.isConsumed();
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: u */
    public void mo54435u(dx40 dx40Var) {
        this.f116630n = dx40Var;
    }

    public jwd1(swd1 swd1Var, jwd1 jwd1Var) {
        super(swd1Var, jwd1Var);
        this.f116630n = null;
        this.f116630n = jwd1Var.f116630n;
    }
}
