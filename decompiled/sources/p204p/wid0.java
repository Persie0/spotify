package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wid0 implements cjd0 {

    /* JADX INFO: renamed from: a */
    public final int f251608a;

    public wid0(int i) {
        this.f251608a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wid0) && this.f251608a == ((wid0) obj).f251608a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f251608a);
    }
}
