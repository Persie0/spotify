package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wib implements cjb {

    /* JADX INFO: renamed from: a */
    public final int f251602a;

    public wib(int i) {
        this.f251602a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wib) && this.f251602a == ((wib) obj).f251602a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f251602a);
    }
}
