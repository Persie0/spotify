package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a191 {

    /* JADX INFO: renamed from: a */
    public final String f11361a;

    /* JADX INFO: renamed from: b */
    public final boolean f11362b;

    /* JADX INFO: renamed from: c */
    public final boolean f11363c;

    /* JADX INFO: renamed from: d */
    public final boolean f11364d;

    /* JADX INFO: renamed from: e */
    public final boolean f11365e;

    public /* synthetic */ a191() {
        this("", false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a191)) {
            return false;
        }
        a191 a191Var = (a191) obj;
        return wj50.m88271j(this.f11361a, a191Var.f11361a) && this.f11362b == a191Var.f11362b && this.f11363c == a191Var.f11363c && this.f11364d == a191Var.f11364d && this.f11365e == a191Var.f11365e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11365e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f11361a.hashCode() * 31, 31, this.f11362b), 31, this.f11363c), 31, this.f11364d);
    }

    public a191(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f11361a = str;
        this.f11362b = z;
        this.f11363c = z2;
        this.f11364d = z3;
        this.f11365e = z4;
    }
}
