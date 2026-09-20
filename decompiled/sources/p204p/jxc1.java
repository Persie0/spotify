package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final String f117096a;

    /* JADX INFO: renamed from: b */
    public final dy1 f117097b;

    public jxc1(String str, dy1 dy1Var) {
        this.f117096a = str;
        this.f117097b = dy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxc1)) {
            return false;
        }
        jxc1 jxc1Var = (jxc1) obj;
        return wj50.m88271j(this.f117096a, jxc1Var.f117096a) && wj50.m88271j(this.f117097b, jxc1Var.f117097b);
    }

    public final int hashCode() {
        return this.f117097b.hashCode() + (this.f117096a.hashCode() * 31);
    }
}
