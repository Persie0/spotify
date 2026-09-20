package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x2x0 {

    /* JADX INFO: renamed from: a */
    public final long f257592a;

    /* JADX INFO: renamed from: b */
    public final String f257593b;

    public x2x0(long j, String str) {
        this.f257592a = j;
        this.f257593b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2x0)) {
            return false;
        }
        x2x0 x2x0Var = (x2x0) obj;
        return this.f257592a == x2x0Var.f257592a && wj50.m88271j(this.f257593b, x2x0Var.f257593b);
    }

    public final int hashCode() {
        return this.f257593b.hashCode() + (Long.hashCode(this.f257592a) * 31);
    }
}
