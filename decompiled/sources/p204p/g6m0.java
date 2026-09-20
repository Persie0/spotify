package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class g6m0 implements r7i0, t9p0 {

    /* JADX INFO: renamed from: a */
    public final qe70 f77068a;

    /* JADX INFO: renamed from: b */
    public final qe70 f77069b;

    /* JADX INFO: renamed from: c */
    public final qe70 f77070c;

    /* JADX WARN: Multi-variable type inference failed */
    public g6m0(gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var) {
        this.f77068a = (qe70) gh00Var;
        this.f77069b = (qe70) gh00Var2;
        this.f77070c = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    @Override // p204p.r7i0, p204p.t9p0
    /* JADX INFO: renamed from: a */
    public final void mo32673a(s9p0 s9p0Var) {
        r7i0 r7i0Var = (r7i0) this.f77070c.invoke();
        if (r7i0Var != null) {
            r7i0Var.mo32673a(s9p0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    @Override // p204p.r7i0, p204p.t9p0
    /* JADX INFO: renamed from: b */
    public final boolean mo32674b(s9p0 s9p0Var) {
        r7i0 r7i0Var = (r7i0) this.f77070c.invoke();
        if (r7i0Var != null) {
            return r7i0Var.mo32674b(s9p0Var);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.r7i0
    /* JADX INFO: renamed from: c */
    public final s9p0 mo43757c(boolean z) {
        return (s9p0) this.f77069b.invoke(Boolean.valueOf(z));
    }

    @Override // p204p.r7i0
    /* JADX INFO: renamed from: d */
    public final void mo43758d() {
        throw new IllegalStateException("This multiplayer session is bound to the page and cannot be ended manually.");
    }

    @Override // p204p.t9p0
    /* JADX INFO: renamed from: e */
    public final s9p0 mo32675e(String str, boolean z) {
        return mo43757c(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.t9p0
    /* JADX INFO: renamed from: f */
    public final n040 mo32676f(Context context) {
        return (n040) this.f77068a.invoke(context);
    }
}
