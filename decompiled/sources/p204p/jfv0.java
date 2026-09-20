package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jfv0 extends kfv0 {

    /* JADX INFO: renamed from: a */
    public final String f111977a;

    /* JADX INFO: renamed from: b */
    public final int f111978b;

    public jfv0(String str, int i) {
        this.f111977a = str;
        this.f111978b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfv0)) {
            return false;
        }
        jfv0 jfv0Var = (jfv0) obj;
        return wj50.m88271j(this.f111977a, jfv0Var.f111977a) && this.f111978b == jfv0Var.f111978b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f111978b) + (this.f111977a.hashCode() * 31);
    }
}
