package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h6b1 {

    /* JADX INFO: renamed from: a */
    public final String f88060a;

    /* JADX INFO: renamed from: b */
    public final l6b1 f88061b;

    public h6b1(String str, l6b1 l6b1Var) {
        this.f88060a = str;
        this.f88061b = l6b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6b1)) {
            return false;
        }
        h6b1 h6b1Var = (h6b1) obj;
        return wj50.m88271j(this.f88060a, h6b1Var.f88060a) && this.f88061b.equals(h6b1Var.f88061b);
    }

    public final int hashCode() {
        return this.f88061b.hashCode() + (this.f88060a.hashCode() * 961);
    }
}
