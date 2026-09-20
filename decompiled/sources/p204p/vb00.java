package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vb00 {

    /* JADX INFO: renamed from: a */
    public final boolean f239355a;

    public vb00(boolean z) {
        this.f239355a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb00) && this.f239355a == ((vb00) obj).f239355a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239355a);
    }
}
