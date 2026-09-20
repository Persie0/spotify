package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e3q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f55868a;

    /* JADX INFO: renamed from: b */
    public final int f55869b;

    public e3q0(boolean z, int i) {
        this.f55868a = z;
        this.f55869b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3q0)) {
            return false;
        }
        e3q0 e3q0Var = (e3q0) obj;
        return this.f55868a == e3q0Var.f55868a && this.f55869b == e3q0Var.f55869b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f55869b) + (Boolean.hashCode(this.f55868a) * 31);
    }
}
