package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s2d1 {

    /* JADX INFO: renamed from: a */
    public final String f204992a;

    /* JADX INFO: renamed from: b */
    public final String f204993b;

    /* JADX INFO: renamed from: c */
    public final String f204994c;

    /* JADX INFO: renamed from: d */
    public final d850 f204995d;

    public s2d1(String str, String str2, String str3, d850 d850Var) {
        this.f204992a = str;
        this.f204993b = str2;
        this.f204994c = str3;
        this.f204995d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2d1)) {
            return false;
        }
        s2d1 s2d1Var = (s2d1) obj;
        return wj50.m88271j(this.f204992a, s2d1Var.f204992a) && wj50.m88271j(this.f204993b, s2d1Var.f204993b) && wj50.m88271j(this.f204994c, s2d1Var.f204994c) && wj50.m88271j(this.f204995d, s2d1Var.f204995d);
    }

    public final int hashCode() {
        return this.f204995d.hashCode() + s571.m77243b(s571.m77243b(this.f204992a.hashCode() * 31, 31, this.f204993b), 31, this.f204994c);
    }
}
