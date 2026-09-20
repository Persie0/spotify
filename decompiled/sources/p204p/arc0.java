package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class arc0 extends erc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f19016a;

    public arc0(boolean z) {
        this.f19016a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arc0) && this.f19016a == ((arc0) obj).f19016a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19016a);
    }
}
