package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ixw0 implements kxw0 {

    /* JADX INFO: renamed from: a */
    public final long f106780a;

    /* JADX INFO: renamed from: b */
    public final int f106781b;

    /* JADX INFO: renamed from: c */
    public final String f106782c;

    public ixw0(long j, int i, String str) {
        this.f106780a = j;
        this.f106781b = i;
        this.f106782c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixw0)) {
            return false;
        }
        ixw0 ixw0Var = (ixw0) obj;
        return this.f106780a == ixw0Var.f106780a && this.f106781b == ixw0Var.f106781b && wj50.m88271j(this.f106782c, ixw0Var.f106782c);
    }

    public final int hashCode() {
        return this.f106782c.hashCode() + mt60.m62800g(this.f106781b, Long.hashCode(this.f106780a) * 31, 31);
    }
}
