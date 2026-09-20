package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kd71 {

    /* JADX INFO: renamed from: a */
    public final String f121628a;

    /* JADX INFO: renamed from: b */
    public final boolean f121629b;

    /* JADX INFO: renamed from: c */
    public final String f121630c;

    public kd71(String str, int i, String str2, boolean z) {
        z = (i & 2) != 0 ? false : z;
        str2 = (i & 4) != 0 ? null : str2;
        this.f121628a = str;
        this.f121629b = z;
        this.f121630c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd71)) {
            return false;
        }
        kd71 kd71Var = (kd71) obj;
        return wj50.m88271j(this.f121628a, kd71Var.f121628a) && this.f121629b == kd71Var.f121629b && wj50.m88271j(this.f121630c, kd71Var.f121630c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f121628a.hashCode() * 31, 31, this.f121629b);
        String str = this.f121630c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
