package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uw51 implements ax51 {

    /* JADX INFO: renamed from: a */
    public final wwu f234576a;

    /* JADX INFO: renamed from: b */
    public final int f234577b;

    public uw51(wwu wwuVar, int i) {
        this.f234576a = wwuVar;
        this.f234577b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw51)) {
            return false;
        }
        uw51 uw51Var = (uw51) obj;
        return wj50.m88271j(this.f234576a, uw51Var.f234576a) && this.f234577b == uw51Var.f234577b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f234577b) + (this.f234576a.hashCode() * 31);
    }
}
