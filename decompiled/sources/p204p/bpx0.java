package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bpx0 implements cpx0 {

    /* JADX INFO: renamed from: a */
    public final hys f29620a;

    /* JADX INFO: renamed from: b */
    public final int f29621b;

    public bpx0(hys hysVar, int i) {
        this.f29620a = hysVar;
        this.f29621b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpx0)) {
            return false;
        }
        bpx0 bpx0Var = (bpx0) obj;
        return wj50.m88271j(this.f29620a, bpx0Var.f29620a) && this.f29621b == bpx0Var.f29621b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f29621b) + (this.f29620a.hashCode() * 31);
    }
}
