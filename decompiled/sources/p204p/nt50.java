package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nt50 {

    /* JADX INFO: renamed from: a */
    public final ry8 f157983a;

    /* JADX INFO: renamed from: b */
    public final th00 f157984b;

    /* JADX INFO: renamed from: c */
    public final vh00 f157985c;

    public nt50(ry8 ry8Var, th00 th00Var, vh00 vh00Var) {
        this.f157983a = ry8Var;
        this.f157984b = th00Var;
        this.f157985c = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt50)) {
            return false;
        }
        nt50 nt50Var = (nt50) obj;
        return wj50.m88271j(this.f157983a, nt50Var.f157983a) && wj50.m88271j(this.f157984b, nt50Var.f157984b) && wj50.m88271j(this.f157985c, nt50Var.f157985c);
    }

    public final int hashCode() {
        int iHashCode = this.f157983a.hashCode() * 31;
        th00 th00Var = this.f157984b;
        return this.f157985c.hashCode() + ((iHashCode + (th00Var == null ? 0 : th00Var.hashCode())) * 31);
    }
}
