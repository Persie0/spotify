package p204p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class lwd1 extends kwd1 {

    /* JADX INFO: renamed from: o */
    public dx40 f137544o;

    /* JADX INFO: renamed from: p */
    public dx40 f137545p;

    /* JADX INFO: renamed from: q */
    public dx40 f137546q;

    public lwd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var, windowInsets);
        this.f137544o = null;
        this.f137545p = null;
        this.f137546q = null;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: i */
    public dx40 mo60117i() {
        if (this.f137545p == null) {
            this.f137545p = dx40.m37191d(this.f106406c.getMandatorySystemGestureInsets());
        }
        return this.f137545p;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: k */
    public dx40 mo60118k() {
        if (this.f137544o == null) {
            this.f137544o = dx40.m37191d(this.f106406c.getSystemGestureInsets());
        }
        return this.f137544o;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: m */
    public dx40 mo60119m() {
        if (this.f137546q == null) {
            this.f137546q = dx40.m37191d(this.f106406c.getTappableElementInsets());
        }
        return this.f137546q;
    }

    @Override // p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: n */
    public swd1 mo51809n(int i, int i2, int i3, int i4) {
        return swd1.m79536g(null, this.f106406c.inset(i, i2, i3, i4));
    }

    public lwd1(swd1 swd1Var, lwd1 lwd1Var) {
        super(swd1Var, lwd1Var);
        this.f137544o = null;
        this.f137545p = null;
        this.f137546q = null;
    }

    @Override // p204p.jwd1, p204p.pwd1
    /* JADX INFO: renamed from: u */
    public void mo54435u(dx40 dx40Var) {
    }
}
