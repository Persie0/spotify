package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gwm0 {

    /* JADX INFO: renamed from: a */
    public final int f85046a;

    /* JADX INFO: renamed from: b */
    public final emr0 f85047b;

    /* JADX INFO: renamed from: c */
    public final int f85048c;

    public gwm0(int i, emr0 emr0Var, int i2) {
        this.f85046a = i;
        this.f85047b = emr0Var;
        this.f85048c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwm0)) {
            return false;
        }
        gwm0 gwm0Var = (gwm0) obj;
        return this.f85046a == gwm0Var.f85046a && this.f85047b.equals(gwm0Var.f85047b) && this.f85048c == gwm0Var.f85048c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f85048c) + ((this.f85047b.hashCode() + (edb.m38547C(this.f85046a) * 31)) * 31);
    }
}
