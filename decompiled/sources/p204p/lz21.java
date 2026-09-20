package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final boolean f138245a;

    public lz21(boolean z) {
        this.f138245a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz21) && this.f138245a == ((lz21) obj).f138245a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138245a);
    }
}
