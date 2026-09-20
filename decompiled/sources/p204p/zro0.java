package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zro0 implements aso0 {

    /* JADX INFO: renamed from: a */
    public final String f285713a;

    /* JADX INFO: renamed from: b */
    public final String f285714b;

    /* JADX INFO: renamed from: c */
    public final String f285715c;

    public zro0(String str, String str2, String str3) {
        this.f285713a = str;
        this.f285714b = str2;
        this.f285715c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zro0)) {
            return false;
        }
        zro0 zro0Var = (zro0) obj;
        return wj50.m88271j(this.f285713a, zro0Var.f285713a) && wj50.m88271j(this.f285714b, zro0Var.f285714b) && wj50.m88271j(this.f285715c, zro0Var.f285715c);
    }

    public final int hashCode() {
        return this.f285715c.hashCode() + s571.m77243b(this.f285713a.hashCode() * 31, 31, this.f285714b);
    }
}
