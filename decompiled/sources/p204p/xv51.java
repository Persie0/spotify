package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xv51 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final int f266287a;

    public xv51(int i) {
        this.f266287a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv51) && this.f266287a == ((xv51) obj).f266287a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f266287a);
    }
}
