package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qxw extends n2x {

    /* JADX INFO: renamed from: a */
    public final boolean f193756a;

    public qxw(boolean z) {
        this.f193756a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxw) && this.f193756a == ((qxw) obj).f193756a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193756a);
    }
}
