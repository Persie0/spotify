package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ylb1 {

    /* JADX INFO: renamed from: a */
    public final int f273974a;

    /* JADX INFO: renamed from: b */
    public final int f273975b;

    public ylb1(int i, int i2) {
        this.f273974a = i;
        this.f273975b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylb1)) {
            return false;
        }
        ylb1 ylb1Var = (ylb1) obj;
        return this.f273974a == ylb1Var.f273974a && this.f273975b == ylb1Var.f273975b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f273975b) + (edb.m38547C(this.f273974a) * 31);
    }
}
