package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bui0 extends gui0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31144a;

    /* JADX INFO: renamed from: b */
    public final int f31145b;

    public bui0(boolean z, int i) {
        this.f31144a = z;
        this.f31145b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bui0)) {
            return false;
        }
        bui0 bui0Var = (bui0) obj;
        return this.f31144a == bui0Var.f31144a && this.f31145b == bui0Var.f31145b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f31145b) + (Boolean.hashCode(this.f31144a) * 31);
    }
}
