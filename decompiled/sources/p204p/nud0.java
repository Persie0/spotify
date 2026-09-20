package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nud0 {

    /* JADX INFO: renamed from: a */
    public final long f158603a;

    public nud0(long j) {
        this.f158603a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nud0) && this.f158603a == ((nud0) obj).f158603a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f158603a);
    }
}
