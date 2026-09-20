package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class mwd1 extends lwd1 {

    /* JADX INFO: renamed from: r */
    public static final swd1 f147771r = swd1.m79536g(null, WindowInsets.CONSUMED);

    public mwd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var, windowInsets);
    }

    @Override // p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: g */
    public dx40 mo51806g(int i) {
        return dx40.m37191d(this.f106406c.getInsets(qwd1.m74053a(i)));
    }

    @Override // p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: h */
    public dx40 mo51807h(int i) {
        return dx40.m37191d(this.f106406c.getInsetsIgnoringVisibility(qwd1.m74053a(i)));
    }

    @Override // p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: q */
    public boolean mo51811q(int i) {
        return this.f106406c.isVisible(qwd1.m74053a(i));
    }

    public mwd1(swd1 swd1Var, mwd1 mwd1Var) {
        super(swd1Var, mwd1Var);
    }

    @Override // p204p.iwd1, p204p.pwd1
    /* JADX INFO: renamed from: d */
    public final void mo51804d(View view) {
    }
}
