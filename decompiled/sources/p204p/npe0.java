package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class npe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final int f156957a;

    public npe0(int i) {
        this.f156957a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npe0) && this.f156957a == ((npe0) obj).f156957a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f156957a);
    }
}
