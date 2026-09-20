package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eje0 {

    /* JADX INFO: renamed from: a */
    public final int f60212a;

    public eje0(int i) {
        this.f60212a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eje0) && this.f60212a == ((eje0) obj).f60212a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60212a);
    }
}
