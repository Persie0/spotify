package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class col {

    /* JADX INFO: renamed from: a */
    public final long f40290a;

    /* JADX INFO: renamed from: b */
    public final long f40291b;

    public col(long j, long j2) {
        this.f40290a = j;
        this.f40291b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof col)) {
            return false;
        }
        col colVar = (col) obj;
        return this.f40290a == colVar.f40290a && this.f40291b == colVar.f40291b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40291b) + (Long.hashCode(this.f40290a) * 31);
    }
}
