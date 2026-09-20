package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xoq0 {

    /* JADX INFO: renamed from: a */
    public final smq0 f264354a;

    /* JADX INFO: renamed from: b */
    public final int f264355b;

    public xoq0(smq0 smq0Var, int i) {
        this.f264354a = smq0Var;
        this.f264355b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoq0)) {
            return false;
        }
        xoq0 xoq0Var = (xoq0) obj;
        return wj50.m88271j(this.f264354a, xoq0Var.f264354a) && this.f264355b == xoq0Var.f264355b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264355b) + (this.f264354a.hashCode() * 31);
    }
}
