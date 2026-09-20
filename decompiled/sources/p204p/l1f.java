package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final int f128710a;

    public l1f(int i) {
        this.f128710a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1f) && this.f128710a == ((l1f) obj).f128710a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128710a);
    }
}
