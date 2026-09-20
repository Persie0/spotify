package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class za01 {

    /* JADX INFO: renamed from: a */
    public final ya01 f280937a;

    /* JADX INFO: renamed from: b */
    public final boolean f280938b;

    /* JADX INFO: renamed from: c */
    public final String f280939c;

    /* JADX INFO: renamed from: d */
    public final String f280940d;

    /* JADX INFO: renamed from: e */
    public final String f280941e;

    public za01(ya01 ya01Var, boolean z, String str, String str2, String str3) {
        this.f280937a = ya01Var;
        this.f280938b = z;
        this.f280939c = str;
        this.f280940d = str2;
        this.f280941e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za01)) {
            return false;
        }
        za01 za01Var = (za01) obj;
        return wj50.m88271j(this.f280937a, za01Var.f280937a) && this.f280938b == za01Var.f280938b && wj50.m88271j(this.f280939c, za01Var.f280939c) && wj50.m88271j(this.f280940d, za01Var.f280940d) && wj50.m88271j(this.f280941e, za01Var.f280941e);
    }

    public final int hashCode() {
        return this.f280941e.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(this.f280937a.hashCode() * 31, 31, this.f280938b), 31, this.f280939c), 31, this.f280940d);
    }
}
