package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f207939a;

    /* JADX INFO: renamed from: b */
    public final int f207940b;

    /* JADX INFO: renamed from: c */
    public final int f207941c;

    public sd8(String str, int i, int i2) {
        this.f207939a = str;
        this.f207940b = i;
        this.f207941c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd8)) {
            return false;
        }
        sd8 sd8Var = (sd8) obj;
        return wj50.m88271j(this.f207939a, sd8Var.f207939a) && this.f207940b == sd8Var.f207940b && this.f207941c == sd8Var.f207941c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207941c) + mt60.m62800g(this.f207940b, this.f207939a.hashCode() * 31, 31);
    }
}
