package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x5d0 implements a6d0 {

    /* JADX INFO: renamed from: a */
    public final String f258387a;

    /* JADX INFO: renamed from: b */
    public final nmr f258388b;

    public x5d0(String str, nmr nmrVar) {
        this.f258387a = str;
        this.f258388b = nmrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5d0)) {
            return false;
        }
        x5d0 x5d0Var = (x5d0) obj;
        return wj50.m88271j(this.f258387a, x5d0Var.f258387a) && wj50.m88271j(this.f258388b, x5d0Var.f258388b);
    }

    public final int hashCode() {
        return this.f258388b.f156251a.hashCode() + (this.f258387a.hashCode() * 31);
    }
}
