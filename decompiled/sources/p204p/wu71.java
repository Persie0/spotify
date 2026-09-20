package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wu71 implements xu71 {

    /* JADX INFO: renamed from: a */
    public final String f255118a;

    /* JADX INFO: renamed from: b */
    public final String f255119b;

    /* JADX INFO: renamed from: c */
    public final int f255120c;

    public wu71(String str, String str2, int i) {
        this.f255118a = str;
        this.f255119b = str2;
        this.f255120c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu71)) {
            return false;
        }
        wu71 wu71Var = (wu71) obj;
        return wj50.m88271j(this.f255118a, wu71Var.f255118a) && wj50.m88271j(this.f255119b, wu71Var.f255119b) && this.f255120c == wu71Var.f255120c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255120c) + s571.m77243b(this.f255118a.hashCode() * 31, 31, this.f255119b);
    }
}
