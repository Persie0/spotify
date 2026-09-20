package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jr80 implements sr80 {

    /* JADX INFO: renamed from: a */
    public final int f115106a;

    public jr80(int i) {
        this.f115106a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr80) && this.f115106a == ((jr80) obj).f115106a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115106a);
    }
}
