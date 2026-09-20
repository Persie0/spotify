package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t4m extends v4m {

    /* JADX INFO: renamed from: a */
    public final int f217045a;

    public t4m(int i) {
        this.f217045a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4m) && this.f217045a == ((t4m) obj).f217045a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f217045a);
    }
}
