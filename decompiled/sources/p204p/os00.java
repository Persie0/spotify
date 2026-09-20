package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class os00 {

    /* JADX INFO: renamed from: a */
    public final rs00 f168697a;

    public os00(rs00 rs00Var) {
        this.f168697a = rs00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os00) && wj50.m88271j(this.f168697a, ((os00) obj).f168697a);
    }

    public final int hashCode() {
        rs00 rs00Var = this.f168697a;
        if (rs00Var == null) {
            return 0;
        }
        return rs00Var.hashCode();
    }
}
