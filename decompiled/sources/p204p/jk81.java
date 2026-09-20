package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jk81 {

    /* JADX INFO: renamed from: a */
    public final long f113241a;

    /* JADX INFO: renamed from: b */
    public final long f113242b;

    public jk81(long j, long j2) {
        this.f113241a = j;
        this.f113242b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk81)) {
            return false;
        }
        jk81 jk81Var = (jk81) obj;
        return this.f113241a == jk81Var.f113241a && this.f113242b == jk81Var.f113242b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f113242b) + (Long.hashCode(this.f113241a) * 31);
    }
}
