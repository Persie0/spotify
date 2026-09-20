package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t8k0 extends nsg1 {

    /* JADX INFO: renamed from: b */
    public final boolean f218097b;

    public t8k0(boolean z) {
        this.f218097b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8k0) && this.f218097b == ((t8k0) obj).f218097b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218097b);
    }
}
