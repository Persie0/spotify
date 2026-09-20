package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xx71 {

    /* JADX INFO: renamed from: a */
    public final String f266899a;

    /* JADX INFO: renamed from: b */
    public final boolean f266900b;

    public xx71(String str, boolean z) {
        this.f266899a = str;
        this.f266900b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx71)) {
            return false;
        }
        xx71 xx71Var = (xx71) obj;
        return wj50.m88271j(this.f266899a, xx71Var.f266899a) && this.f266900b == xx71Var.f266900b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266900b) + (this.f266899a.hashCode() * 31);
    }
}
