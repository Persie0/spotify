package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jxw0 implements kxw0 {

    /* JADX INFO: renamed from: a */
    public final long f117239a;

    public jxw0(long j) {
        this.f117239a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxw0) && this.f117239a == ((jxw0) obj).f117239a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f117239a);
    }
}
