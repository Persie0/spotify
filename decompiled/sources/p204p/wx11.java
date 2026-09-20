package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wx11 {

    /* JADX INFO: renamed from: a */
    public final pv91 f255908a;

    /* JADX INFO: renamed from: b */
    public final qe70 f255909b;

    /* JADX WARN: Multi-variable type inference failed */
    public wx11(pv91 pv91Var, th00 th00Var) {
        this.f255908a = pv91Var;
        this.f255909b = (qe70) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx11)) {
            return false;
        }
        wx11 wx11Var = (wx11) obj;
        return this.f255908a.equals(wx11Var.f255908a) && this.f255909b.equals(wx11Var.f255909b);
    }

    public final int hashCode() {
        return this.f255909b.hashCode() + (this.f255908a.hashCode() * 31);
    }
}
