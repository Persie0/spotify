package p204p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class owd1 extends nwd1 {

    /* JADX INFO: renamed from: s */
    public static final swd1 f170699s = swd1.m79536g(null, WindowInsets.CONSUMED);

    public owd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var, windowInsets);
    }

    @Override // p204p.mwd1, p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: g */
    public dx40 mo51806g(int i) {
        return dx40.m37191d(this.f106406c.getInsets(rwd1.m76511a(i)));
    }

    @Override // p204p.mwd1, p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: h */
    public dx40 mo51807h(int i) {
        return dx40.m37191d(this.f106406c.getInsetsIgnoringVisibility(rwd1.m76511a(i)));
    }

    @Override // p204p.mwd1, p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: q */
    public boolean mo51811q(int i) {
        return this.f106406c.isVisible(rwd1.m76511a(i));
    }

    public owd1(swd1 swd1Var, owd1 owd1Var) {
        super(swd1Var, owd1Var);
    }
}
