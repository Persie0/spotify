package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k291 {

    /* JADX INFO: renamed from: a */
    public final int f118581a;

    /* JADX INFO: renamed from: b */
    public final xb71 f118582b;

    /* JADX INFO: renamed from: c */
    public final rbu0 f118583c;

    public k291(int i, xb71 xb71Var, rbu0 rbu0Var) {
        this.f118581a = i;
        this.f118582b = xb71Var;
        this.f118583c = rbu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k291)) {
            return false;
        }
        k291 k291Var = (k291) obj;
        return this.f118581a == k291Var.f118581a && wj50.m88271j(this.f118582b, k291Var.f118582b) && wj50.m88271j(this.f118583c, k291Var.f118583c);
    }

    public final int hashCode() {
        return this.f118583c.hashCode() + ((this.f118582b.hashCode() + (Integer.hashCode(this.f118581a) * 31)) * 31);
    }
}
