package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n31 {

    /* JADX INFO: renamed from: a */
    public final long f149898a;

    /* JADX INFO: renamed from: b */
    public final long f149899b;

    public n31(long j, long j2) {
        this.f149898a = j;
        this.f149899b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n31)) {
            return false;
        }
        n31 n31Var = (n31) obj;
        return this.f149898a == n31Var.f149898a && this.f149899b == n31Var.f149899b;
    }

    public final int hashCode() {
        return (((int) this.f149898a) * 31) + ((int) this.f149899b);
    }
}
