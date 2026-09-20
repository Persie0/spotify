package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nu0 {

    /* JADX INFO: renamed from: a */
    public final String f158466a;

    /* JADX INFO: renamed from: b */
    public final int f158467b;

    /* JADX INFO: renamed from: c */
    public final int f158468c;

    /* JADX INFO: renamed from: d */
    public final boolean f158469d;

    /* JADX INFO: renamed from: e */
    public final boolean f158470e;

    public nu0(int i, int i2, String str, boolean z, boolean z2) {
        this.f158466a = str;
        this.f158467b = i;
        this.f158468c = i2;
        this.f158469d = z;
        this.f158470e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return wj50.m88271j(this.f158466a, nu0Var.f158466a) && this.f158467b == nu0Var.f158467b && this.f158468c == nu0Var.f158468c && this.f158469d == nu0Var.f158469d && this.f158470e == nu0Var.f158470e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158470e) + s571.m77245d(mt60.m62800g(this.f158468c, mt60.m62800g(this.f158467b, this.f158466a.hashCode() * 31, 31), 31), 31, this.f158469d);
    }
}
