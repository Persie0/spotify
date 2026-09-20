package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l340 {

    /* JADX INFO: renamed from: a */
    public final String f129202a;

    /* JADX INFO: renamed from: b */
    public final String f129203b;

    /* JADX INFO: renamed from: c */
    public final int f129204c;

    /* JADX INFO: renamed from: d */
    public final int f129205d;

    public l340(int i, String str, int i2, String str2) {
        this.f129202a = str;
        this.f129203b = str2;
        this.f129204c = i;
        this.f129205d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l340)) {
            return false;
        }
        l340 l340Var = (l340) obj;
        return wj50.m88271j(this.f129202a, l340Var.f129202a) && wj50.m88271j(this.f129203b, l340Var.f129203b) && this.f129204c == l340Var.f129204c && this.f129205d == l340Var.f129205d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129205d) + mt60.m62800g(this.f129204c, s571.m77243b(this.f129202a.hashCode() * 31, 31, this.f129203b), 31);
    }
}
