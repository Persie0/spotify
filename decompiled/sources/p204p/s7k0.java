package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s7k0 {

    /* JADX INFO: renamed from: a */
    public final String f206393a;

    /* JADX INFO: renamed from: b */
    public final er70 f206394b;

    /* JADX INFO: renamed from: c */
    public final boolean f206395c;

    public s7k0(String str, er70 er70Var, boolean z) {
        this.f206393a = str;
        this.f206394b = er70Var;
        this.f206395c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7k0)) {
            return false;
        }
        s7k0 s7k0Var = (s7k0) obj;
        return wj50.m88271j(this.f206393a, s7k0Var.f206393a) && wj50.m88271j(this.f206394b, s7k0Var.f206394b) && this.f206395c == s7k0Var.f206395c;
    }

    public final int hashCode() {
        int iHashCode = this.f206393a.hashCode() * 31;
        er70 er70Var = this.f206394b;
        return Boolean.hashCode(this.f206395c) + ((iHashCode + (er70Var == null ? 0 : er70Var.hashCode())) * 31);
    }
}
