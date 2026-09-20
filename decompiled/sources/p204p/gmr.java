package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gmr {

    /* JADX INFO: renamed from: a */
    public final int f81449a;

    public gmr(int i) {
        this.f81449a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmr) && this.f81449a == ((gmr) obj).f81449a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f81449a);
    }
}
