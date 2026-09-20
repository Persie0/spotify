package p204p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d180 {

    /* JADX INFO: renamed from: a */
    public int f44186a;

    /* JADX INFO: renamed from: b */
    public final Object f44187b;

    /* JADX INFO: renamed from: c */
    public final Object f44188c;

    /* JADX WARN: Multi-variable type inference failed */
    public d180(pv91 pv91Var, int i, xh00 xh00Var) {
        this.f44187b = pv91Var;
        this.f44186a = i;
        this.f44188c = (qe70) xh00Var;
    }

    /* JADX INFO: renamed from: b */
    public static d180 m34594b(AbstractC0110a abstractC0110a, int i) {
        if (i == 0) {
            return new xvl0(abstractC0110a);
        }
        if (i == 1) {
            return new yvl0(abstractC0110a);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo33691a(yyx0 yyx0Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo33692c(yyx0 yyx0Var);

    /* JADX INFO: renamed from: d */
    public abstract int mo34595d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo34596e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo34597f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo34598g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo34599h();

    /* JADX INFO: renamed from: i */
    public abstract int mo34600i();

    /* JADX INFO: renamed from: j */
    public abstract int mo34601j();

    /* JADX INFO: renamed from: k */
    public abstract int mo34602k();

    /* JADX INFO: renamed from: l */
    public abstract int mo34603l();

    /* JADX INFO: renamed from: m */
    public abstract int mo34604m();

    /* JADX INFO: renamed from: n */
    public abstract int mo34605n();

    /* JADX INFO: renamed from: o */
    public int m34606o() {
        if (Integer.MIN_VALUE == this.f44186a) {
            return 0;
        }
        return mo34605n() - this.f44186a;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo34607p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo34608q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo34609r(int i);

    /* JADX INFO: renamed from: s */
    public abstract void mo33693s();

    /* JADX INFO: renamed from: t */
    public void m34610t() {
        this.f44186a = mo34605n();
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo33694u(yyx0 yyx0Var);

    /* JADX INFO: renamed from: v */
    public abstract void mo33695v();

    /* JADX INFO: renamed from: w */
    public abstract void mo33696w(yyx0 yyx0Var);

    /* JADX INFO: renamed from: x */
    public abstract ezo mo33697x(yyx0 yyx0Var);

    public d180(int i, String str, String str2) {
        this.f44186a = i;
        this.f44187b = str;
        this.f44188c = str2;
    }

    public d180(AbstractC0110a abstractC0110a) {
        this.f44186a = Integer.MIN_VALUE;
        this.f44188c = new Rect();
        this.f44187b = abstractC0110a;
    }
}
