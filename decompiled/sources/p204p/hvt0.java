package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hvt0 {

    /* JADX INFO: renamed from: a */
    public final int f95791a;

    /* JADX INFO: renamed from: b */
    public final String f95792b;

    public hvt0(int i, String str) {
        this.f95791a = i;
        this.f95792b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvt0)) {
            return false;
        }
        hvt0 hvt0Var = (hvt0) obj;
        return this.f95791a == hvt0Var.f95791a && wj50.m88271j(this.f95792b, hvt0Var.f95792b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f95791a) * 31;
        String str = this.f95792b;
        return iM38547C + (str == null ? 0 : str.hashCode());
    }
}
