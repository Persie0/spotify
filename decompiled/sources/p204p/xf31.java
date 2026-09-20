package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xf31 extends ag31 {

    /* JADX INFO: renamed from: a */
    public final String f260824a;

    /* JADX INFO: renamed from: b */
    public final String f260825b;

    public xf31(String str, String str2) {
        this.f260824a = str;
        this.f260825b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf31)) {
            return false;
        }
        xf31 xf31Var = (xf31) obj;
        return wj50.m88271j(this.f260824a, xf31Var.f260824a) && wj50.m88271j(this.f260825b, xf31Var.f260825b);
    }

    public final int hashCode() {
        return this.f260825b.hashCode() + (this.f260824a.hashCode() * 31);
    }
}
