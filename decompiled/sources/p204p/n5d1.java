package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f150527a;

    /* JADX INFO: renamed from: b */
    public final boolean f150528b;

    public n5d1(String str, boolean z) {
        this.f150527a = str;
        this.f150528b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d1)) {
            return false;
        }
        n5d1 n5d1Var = (n5d1) obj;
        return wj50.m88271j(this.f150527a, n5d1Var.f150527a) && this.f150528b == n5d1Var.f150528b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150528b) + (this.f150527a.hashCode() * 31);
    }
}
