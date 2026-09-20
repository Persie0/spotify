package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o1z0 extends q3d0 {

    /* JADX INFO: renamed from: c */
    public final int f160895c;

    public o1z0(int i) {
        this.f160895c = i;
    }

    /* JADX INFO: renamed from: V */
    public final int m66090V() {
        return this.f160895c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1z0) && this.f160895c == ((o1z0) obj).f160895c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f160895c);
    }
}
