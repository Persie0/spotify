package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ehb0 implements fhb0 {

    /* JADX INFO: renamed from: a */
    public final int f59535a;

    /* JADX INFO: renamed from: b */
    public final boolean f59536b;

    public ehb0(int i, boolean z) {
        this.f59535a = i;
        this.f59536b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehb0)) {
            return false;
        }
        ehb0 ehb0Var = (ehb0) obj;
        return this.f59535a == ehb0Var.f59535a && this.f59536b == ehb0Var.f59536b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59536b) + (Integer.hashCode(this.f59535a) * 31);
    }
}
