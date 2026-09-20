package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d3q0 {

    /* JADX INFO: renamed from: a */
    public final int f44986a;

    /* JADX INFO: renamed from: b */
    public final boolean f44987b;

    /* JADX INFO: renamed from: c */
    public final int f44988c;

    public d3q0(int i, boolean z, int i2) {
        this.f44986a = i;
        this.f44987b = z;
        this.f44988c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3q0)) {
            return false;
        }
        d3q0 d3q0Var = (d3q0) obj;
        return this.f44986a == d3q0Var.f44986a && this.f44987b == d3q0Var.f44987b && this.f44988c == d3q0Var.f44988c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f44988c) + s571.m77245d(edb.m38547C(this.f44986a) * 31, 31, this.f44987b);
    }
}
