package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final boolean f159982a;

    public nz21(boolean z) {
        this.f159982a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz21) && this.f159982a == ((nz21) obj).f159982a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159982a);
    }
}
