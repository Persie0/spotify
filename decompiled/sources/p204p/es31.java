package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class es31 {

    /* JADX INFO: renamed from: a */
    public final int f62272a;

    public es31(int i) {
        this.f62272a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es31) && this.f62272a == ((es31) obj).f62272a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f62272a);
    }
}
