package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class erv0 {

    /* JADX INFO: renamed from: a */
    public final int f62210a;

    /* JADX INFO: renamed from: b */
    public final int f62211b;

    public erv0(int i, int i2) {
        this.f62210a = i;
        this.f62211b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erv0)) {
            return false;
        }
        erv0 erv0Var = (erv0) obj;
        return this.f62210a == erv0Var.f62210a && this.f62211b == erv0Var.f62211b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f62211b) + (edb.m38547C(this.f62210a) * 31);
    }
}
