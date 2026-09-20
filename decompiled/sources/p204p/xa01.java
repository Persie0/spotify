package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xa01 extends ya01 {

    /* JADX INFO: renamed from: a */
    public final String f259494a;

    /* JADX INFO: renamed from: b */
    public final boolean f259495b;

    /* JADX INFO: renamed from: c */
    public final boolean f259496c;

    public xa01(String str, boolean z, boolean z2) {
        this.f259494a = str;
        this.f259495b = z;
        this.f259496c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa01)) {
            return false;
        }
        xa01 xa01Var = (xa01) obj;
        return wj50.m88271j(this.f259494a, xa01Var.f259494a) && this.f259495b == xa01Var.f259495b && this.f259496c == xa01Var.f259496c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259496c) + s571.m77245d(this.f259494a.hashCode() * 31, 31, this.f259495b);
    }
}
