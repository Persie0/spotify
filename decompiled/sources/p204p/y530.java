package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final int f269314a;

    /* JADX INFO: renamed from: b */
    public final int f269315b;

    public y530(int i, int i2) {
        this.f269314a = i;
        this.f269315b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m92825a() {
        return this.f269314a;
    }

    /* JADX INFO: renamed from: b */
    public final int m92826b() {
        return this.f269315b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y530)) {
            return false;
        }
        y530 y530Var = (y530) obj;
        return this.f269314a == y530Var.f269314a && this.f269315b == y530Var.f269315b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f269315b) + (edb.m38547C(this.f269314a) * 31);
    }
}
