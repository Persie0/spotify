package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rhp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f199272a;

    /* JADX INFO: renamed from: b */
    public final String f199273b;

    /* JADX INFO: renamed from: c */
    public final String f199274c;

    /* JADX INFO: renamed from: d */
    public final int f199275d;

    /* JADX INFO: renamed from: e */
    public final qz80 f199276e;

    public rhp0(String str, String str2, String str3, int i, qz80 qz80Var) {
        this.f199272a = str;
        this.f199273b = str2;
        this.f199274c = str3;
        this.f199275d = i;
        this.f199276e = qz80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhp0)) {
            return false;
        }
        rhp0 rhp0Var = (rhp0) obj;
        return wj50.m88271j(this.f199272a, rhp0Var.f199272a) && wj50.m88271j(this.f199273b, rhp0Var.f199273b) && wj50.m88271j(this.f199274c, rhp0Var.f199274c) && this.f199275d == rhp0Var.f199275d && wj50.m88271j(this.f199276e, rhp0Var.f199276e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f199272a.hashCode() * 31, 31, this.f199273b);
        String str = this.f199274c;
        int iM62800g = mt60.m62800g(this.f199275d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        qz80 qz80Var = this.f199276e;
        return iM62800g + (qz80Var != null ? qz80Var.hashCode() : 0);
    }
}
