package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yn00 {

    /* JADX INFO: renamed from: a */
    public final xn00 f274365a;

    /* JADX INFO: renamed from: b */
    public final d0u0 f274366b;

    /* JADX INFO: renamed from: c */
    public final rt31 f274367c;

    public yn00(xn00 xn00Var, d0u0 d0u0Var, rt31 rt31Var) {
        this.f274365a = xn00Var;
        this.f274366b = d0u0Var;
        this.f274367c = rt31Var;
    }

    /* JADX INFO: renamed from: a */
    public final xn00 m94211a() {
        return this.f274365a;
    }

    /* JADX INFO: renamed from: b */
    public final rt31 m94212b() {
        return this.f274367c;
    }

    /* JADX INFO: renamed from: c */
    public final d0u0 m94213c() {
        return this.f274366b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn00)) {
            return false;
        }
        yn00 yn00Var = (yn00) obj;
        return wj50.m88271j(this.f274365a, yn00Var.f274365a) && wj50.m88271j(this.f274366b, yn00Var.f274366b) && wj50.m88271j(this.f274367c, yn00Var.f274367c);
    }

    public final int hashCode() {
        return this.f274367c.hashCode() + ((this.f274366b.hashCode() + (this.f274365a.hashCode() * 31)) * 31);
    }
}
