package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jm20 {

    /* JADX INFO: renamed from: a */
    public final th00 f113735a;

    /* JADX INFO: renamed from: b */
    public final ry8 f113736b;

    /* JADX INFO: renamed from: c */
    public final vh00 f113737c;

    public jm20(ry8 ry8Var, th00 th00Var, vh00 vh00Var) {
        this.f113735a = th00Var;
        this.f113736b = ry8Var;
        this.f113737c = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm20)) {
            return false;
        }
        jm20 jm20Var = (jm20) obj;
        return wj50.m88271j(this.f113735a, jm20Var.f113735a) && wj50.m88271j(this.f113736b, jm20Var.f113736b) && wj50.m88271j(this.f113737c, jm20Var.f113737c);
    }

    public final int hashCode() {
        th00 th00Var = this.f113735a;
        return this.f113737c.hashCode() + ((this.f113736b.hashCode() + ((th00Var == null ? 0 : th00Var.hashCode()) * 31)) * 31);
    }
}
