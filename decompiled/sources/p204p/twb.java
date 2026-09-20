package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class twb extends jd21 implements zwb {

    /* JADX INFO: renamed from: b */
    public final ho91 f224394b;

    /* JADX INFO: renamed from: c */
    public final wwb f224395c;

    /* JADX INFO: renamed from: d */
    public final boolean f224396d;

    /* JADX INFO: renamed from: e */
    public final gn91 f224397e;

    public twb(ho91 ho91Var, wwb wwbVar, boolean z, gn91 gn91Var) {
        this.f224394b = ho91Var;
        this.f224395c = wwbVar;
        this.f224396d = z;
        this.f224397e = gn91Var;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: A0 */
    public final List mo36061A0() {
        return lau.f131415a;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: B0 */
    public final gn91 mo36062B0() {
        return this.f224397e;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: C0 */
    public final jn91 mo36063C0() {
        return this.f224395c;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: D0 */
    public final boolean mo36064D0() {
        return this.f224396d;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: E0 */
    public final gd70 mo35110H0(ld70 ld70Var) {
        return new twb(this.f224394b.mo48025d(ld70Var), this.f224395c, this.f224396d, this.f224397e);
    }

    @Override // p204p.jd21, p204p.d6a1
    /* JADX INFO: renamed from: G0 */
    public final d6a1 mo35109G0(boolean z) {
        if (z == this.f224396d) {
            return this;
        }
        return new twb(this.f224394b, this.f224395c, z, this.f224397e);
    }

    @Override // p204p.d6a1
    /* JADX INFO: renamed from: H0 */
    public final d6a1 mo35110H0(ld70 ld70Var) {
        return new twb(this.f224394b.mo48025d(ld70Var), this.f224395c, this.f224396d, this.f224397e);
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: J */
    public final bfe0 mo36065J() {
        return ehw.m39005a(1, true, new String[0]);
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: J0 */
    public final jd21 mo35109G0(boolean z) {
        if (z == this.f224396d) {
            return this;
        }
        return new twb(this.f224394b, this.f224395c, z, this.f224397e);
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: K0 */
    public final jd21 mo35111I0(gn91 gn91Var) {
        return new twb(this.f224394b, this.f224395c, this.f224396d, gn91Var);
    }

    @Override // p204p.jd21
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f224394b);
        sb.append(')');
        sb.append(this.f224396d ? "?" : "");
        return sb.toString();
    }
}
