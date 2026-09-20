package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o9a1 {

    /* JADX INFO: renamed from: a */
    public final String f162988a;

    /* JADX INFO: renamed from: b */
    public final String f162989b;

    /* JADX INFO: renamed from: c */
    public final String f162990c;

    /* JADX INFO: renamed from: d */
    public final String f162991d;

    public o9a1(String str, String str2, String str3, String str4) {
        this.f162988a = str;
        this.f162989b = str2;
        this.f162990c = str3;
        this.f162991d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9a1)) {
            return false;
        }
        o9a1 o9a1Var = (o9a1) obj;
        return wj50.m88271j(this.f162988a, o9a1Var.f162988a) && wj50.m88271j(this.f162989b, o9a1Var.f162989b) && wj50.m88271j(this.f162990c, o9a1Var.f162990c) && wj50.m88271j(this.f162991d, o9a1Var.f162991d);
    }

    public final int hashCode() {
        return this.f162991d.hashCode() + s571.m77243b(s571.m77243b(this.f162988a.hashCode() * 31, 31, this.f162989b), 31, this.f162990c);
    }
}
