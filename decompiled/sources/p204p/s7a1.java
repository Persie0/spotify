package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s7a1 implements t7a1 {

    /* JADX INFO: renamed from: a */
    public final String f206315a;

    /* JADX INFO: renamed from: b */
    public final String f206316b;

    /* JADX INFO: renamed from: c */
    public final String f206317c;

    public s7a1(String str, String str2, String str3) {
        this.f206315a = str;
        this.f206316b = str2;
        this.f206317c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a1)) {
            return false;
        }
        s7a1 s7a1Var = (s7a1) obj;
        return wj50.m88271j(this.f206315a, s7a1Var.f206315a) && wj50.m88271j(this.f206316b, s7a1Var.f206316b) && wj50.m88271j(this.f206317c, s7a1Var.f206317c);
    }

    public final int hashCode() {
        return this.f206317c.hashCode() + s571.m77243b(this.f206315a.hashCode() * 31, 31, this.f206316b);
    }
}
