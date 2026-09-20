package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class re71 {

    /* JADX INFO: renamed from: a */
    public final String f198306a;

    /* JADX INFO: renamed from: b */
    public final int f198307b;

    /* JADX INFO: renamed from: c */
    public final int f198308c;

    /* JADX INFO: renamed from: d */
    public final String f198309d;

    /* JADX INFO: renamed from: e */
    public final f271 f198310e;

    /* JADX INFO: renamed from: f */
    public final boolean f198311f;

    /* JADX INFO: renamed from: g */
    public final boolean f198312g;

    /* JADX INFO: renamed from: h */
    public final int f198313h;

    public re71(String str, int i, int i2, String str2, f271 f271Var, boolean z, boolean z2, int i3) {
        this.f198306a = str;
        this.f198307b = i;
        this.f198308c = i2;
        this.f198309d = str2;
        this.f198310e = f271Var;
        this.f198311f = z;
        this.f198312g = z2;
        this.f198313h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re71)) {
            return false;
        }
        re71 re71Var = (re71) obj;
        return wj50.m88271j(this.f198306a, re71Var.f198306a) && this.f198307b == re71Var.f198307b && this.f198308c == re71Var.f198308c && wj50.m88271j(this.f198309d, re71Var.f198309d) && this.f198310e.equals(re71Var.f198310e) && this.f198311f == re71Var.f198311f && this.f198312g == re71Var.f198312g && this.f198313h == re71Var.f198313h;
    }

    public final int hashCode() {
        return edb.m38547C(this.f198313h) + s571.m77245d(s571.m77245d((this.f198310e.hashCode() + s571.m77243b(mt60.m62800g(this.f198308c, mt60.m62800g(this.f198307b, this.f198306a.hashCode() * 31, 31), 31), 31, this.f198309d)) * 31, 31, this.f198311f), 31, this.f198312g);
    }
}
