package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dip0 {

    /* JADX INFO: renamed from: a */
    public final int f49459a;

    /* JADX INFO: renamed from: b */
    public final String f49460b;

    /* JADX INFO: renamed from: c */
    public final iip0 f49461c;

    public dip0(int i, String str, iip0 iip0Var) {
        this.f49459a = i;
        this.f49460b = str;
        this.f49461c = iip0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dip0)) {
            return false;
        }
        dip0 dip0Var = (dip0) obj;
        return this.f49459a == dip0Var.f49459a && wj50.m88271j(this.f49460b, dip0Var.f49460b) && wj50.m88271j(this.f49461c, dip0Var.f49461c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(this.f49459a) * 31, 31, this.f49460b);
        iip0 iip0Var = this.f49461c;
        return iM77243b + (iip0Var == null ? 0 : iip0Var.hashCode());
    }
}
