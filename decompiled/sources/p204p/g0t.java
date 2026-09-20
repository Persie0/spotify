package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g0t implements h0t {

    /* JADX INFO: renamed from: a */
    public final int f75431a;

    public g0t(int i) {
        this.f75431a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0t) && this.f75431a == ((g0t) obj).f75431a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f75431a);
    }
}
