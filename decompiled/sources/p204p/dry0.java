package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dry0 implements hry0 {

    /* JADX INFO: renamed from: a */
    public final String f52414a;

    /* JADX INFO: renamed from: b */
    public final String f52415b;

    /* JADX INFO: renamed from: c */
    public final int f52416c;

    /* JADX INFO: renamed from: d */
    public final int f52417d;

    public dry0(int i, String str, int i2, String str2) {
        this.f52414a = str;
        this.f52415b = str2;
        this.f52416c = i;
        this.f52417d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dry0)) {
            return false;
        }
        dry0 dry0Var = (dry0) obj;
        return wj50.m88271j(this.f52414a, dry0Var.f52414a) && wj50.m88271j(this.f52415b, dry0Var.f52415b) && this.f52416c == dry0Var.f52416c && this.f52417d == dry0Var.f52417d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52417d) + mt60.m62800g(this.f52416c, s571.m77243b(this.f52414a.hashCode() * 31, 31, this.f52415b), 31);
    }
}
