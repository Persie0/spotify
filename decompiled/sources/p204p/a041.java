package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a041 {

    /* JADX INFO: renamed from: a */
    public final int f10989a;

    public a041(int i) {
        this.f10989a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a041) && this.f10989a == ((a041) obj).f10989a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10989a);
    }
}
