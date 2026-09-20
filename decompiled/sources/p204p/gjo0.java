package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gjo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final long f80514a;

    public gjo0(long j) {
        this.f80514a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjo0) && this.f80514a == ((gjo0) obj).f80514a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f80514a);
    }
}
