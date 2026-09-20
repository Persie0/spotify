package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zg81 implements bh81 {

    /* JADX INFO: renamed from: a */
    public final int f282548a;

    /* JADX INFO: renamed from: b */
    public final String f282549b;

    /* JADX INFO: renamed from: c */
    public final String f282550c;

    public zg81(int i, String str, String str2) {
        this.f282548a = i;
        this.f282549b = str;
        this.f282550c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg81)) {
            return false;
        }
        zg81 zg81Var = (zg81) obj;
        return this.f282548a == zg81Var.f282548a && this.f282549b.equals(zg81Var.f282549b) && this.f282550c.equals(zg81Var.f282550c);
    }

    public final int hashCode() {
        int i = this.f282548a;
        return this.f282550c.hashCode() + s571.m77243b((i == 0 ? 0 : edb.m38547C(i)) * 31, 31, this.f282549b);
    }
}
