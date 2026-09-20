package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p53 implements q53 {

    /* JADX INFO: renamed from: a */
    public final long f174057a;

    public p53(long j) {
        this.f174057a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p53) && this.f174057a == ((p53) obj).f174057a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f174057a);
    }
}
