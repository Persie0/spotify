package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dkx implements ekx {

    /* JADX INFO: renamed from: a */
    public final int f50059a;

    public dkx(int i) {
        this.f50059a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkx) && this.f50059a == ((dkx) obj).f50059a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f50059a);
    }
}
