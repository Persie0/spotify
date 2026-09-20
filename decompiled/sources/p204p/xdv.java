package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xdv implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f260544a;

    public xdv(int i) {
        this.f260544a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdv) && this.f260544a == ((xdv) obj).f260544a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f260544a);
    }
}
