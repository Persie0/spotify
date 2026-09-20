package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lm31 implements nm31 {

    /* JADX INFO: renamed from: a */
    public final String f134773a;

    /* JADX INFO: renamed from: b */
    public final int f134774b;

    public lm31(String str, int i) {
        this.f134773a = str;
        this.f134774b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm31)) {
            return false;
        }
        lm31 lm31Var = (lm31) obj;
        return wj50.m88271j(this.f134773a, lm31Var.f134773a) && this.f134774b == lm31Var.f134774b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134774b) + (this.f134773a.hashCode() * 31);
    }
}
