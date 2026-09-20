package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ioo0 {

    /* JADX INFO: renamed from: a */
    public final int f104261a;

    /* JADX INFO: renamed from: b */
    public final kts0 f104262b;

    public ioo0(int i, kts0 kts0Var) {
        this.f104261a = i;
        this.f104262b = kts0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioo0)) {
            return false;
        }
        ioo0 ioo0Var = (ioo0) obj;
        return this.f104261a == ioo0Var.f104261a && wj50.m88271j(this.f104262b, ioo0Var.f104262b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f104261a) * 31;
        kts0 kts0Var = this.f104262b;
        return iM38547C + (kts0Var == null ? 0 : kts0Var.hashCode());
    }
}
