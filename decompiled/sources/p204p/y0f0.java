package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y0f0 extends d1f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f267978a;

    public y0f0(boolean z) {
        this.f267978a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0f0) && this.f267978a == ((y0f0) obj).f267978a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267978a);
    }
}
