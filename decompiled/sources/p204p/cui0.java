package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cui0 extends gui0 {

    /* JADX INFO: renamed from: a */
    public final int f42133a;

    public cui0(int i) {
        this.f42133a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cui0) && this.f42133a == ((cui0) obj).f42133a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f42133a);
    }
}
