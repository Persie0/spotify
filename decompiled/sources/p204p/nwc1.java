package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final String f159095a;

    /* JADX INFO: renamed from: b */
    public final dy1 f159096b;

    public nwc1(String str, dy1 dy1Var) {
        this.f159095a = str;
        this.f159096b = dy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwc1)) {
            return false;
        }
        nwc1 nwc1Var = (nwc1) obj;
        return wj50.m88271j(this.f159095a, nwc1Var.f159095a) && wj50.m88271j(this.f159096b, nwc1Var.f159096b);
    }

    public final int hashCode() {
        return this.f159096b.hashCode() + (this.f159095a.hashCode() * 31);
    }
}
