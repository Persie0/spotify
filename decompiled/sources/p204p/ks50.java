package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ks50 implements ls50 {

    /* JADX INFO: renamed from: a */
    public final int f125840a;

    public ks50(int i) {
        this.f125840a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks50) && this.f125840a == ((ks50) obj).f125840a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125840a);
    }
}
