package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ssj implements ysj {

    /* JADX INFO: renamed from: a */
    public final int f213633a;

    public ssj(int i) {
        this.f213633a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssj) && this.f213633a == ((ssj) obj).f213633a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213633a);
    }
}
