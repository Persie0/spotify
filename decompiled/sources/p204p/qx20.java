package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qx20 {

    /* JADX INFO: renamed from: a */
    public final int f193465a;

    public qx20(int i) {
        this.f193465a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx20) && this.f193465a == ((qx20) obj).f193465a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f193465a);
    }
}
