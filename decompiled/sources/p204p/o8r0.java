package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o8r0 extends l8r0 {

    /* JADX INFO: renamed from: a */
    public final int f162857a;

    public o8r0(int i) {
        this.f162857a = i;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        return this.f162857a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8r0) && this.f162857a == ((o8r0) obj).f162857a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162857a);
    }
}
