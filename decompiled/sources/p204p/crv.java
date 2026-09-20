package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class crv implements erv {

    /* JADX INFO: renamed from: a */
    public final int f41412a;

    public crv(int i) {
        this.f41412a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crv) && this.f41412a == ((crv) obj).f41412a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41412a);
    }
}
