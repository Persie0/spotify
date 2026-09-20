package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tsw extends n2x {

    /* JADX INFO: renamed from: a */
    public final boolean f223438a;

    public tsw(boolean z) {
        this.f223438a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsw) && this.f223438a == ((tsw) obj).f223438a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223438a);
    }
}
