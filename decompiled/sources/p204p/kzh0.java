package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kzh0 {

    /* JADX INFO: renamed from: a */
    public final String f128123a;

    /* JADX INFO: renamed from: b */
    public final int f128124b;

    public kzh0(String str, int i) {
        this.f128123a = str;
        this.f128124b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzh0)) {
            return false;
        }
        kzh0 kzh0Var = (kzh0) obj;
        return wj50.m88271j(this.f128123a, kzh0Var.f128123a) && this.f128124b == kzh0Var.f128124b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128124b) + (this.f128123a.hashCode() * 31);
    }
}
