package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f98885a;

    public i5c0(boolean z) {
        this.f98885a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5c0) && this.f98885a == ((i5c0) obj).f98885a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98885a);
    }
}
