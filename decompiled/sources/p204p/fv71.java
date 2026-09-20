package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fv71 extends gv71 {

    /* JADX INFO: renamed from: a */
    public final long f73726a;

    public fv71(long j) {
        this.f73726a = j;
    }

    @Override // p204p.gv71
    /* JADX INFO: renamed from: a */
    public final long mo40100a() {
        return this.f73726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv71) && this.f73726a == ((fv71) obj).f73726a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73726a);
    }
}
