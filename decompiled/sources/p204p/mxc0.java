package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f148020a;

    /* JADX INFO: renamed from: b */
    public final String f148021b;

    /* JADX INFO: renamed from: c */
    public final String f148022c;

    /* JADX INFO: renamed from: d */
    public final String f148023d;

    public mxc0(String str, String str2, String str3, String str4) {
        this.f148020a = str;
        this.f148021b = str2;
        this.f148022c = str3;
        this.f148023d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc0)) {
            return false;
        }
        mxc0 mxc0Var = (mxc0) obj;
        return wj50.m88271j(this.f148020a, mxc0Var.f148020a) && wj50.m88271j(this.f148021b, mxc0Var.f148021b) && wj50.m88271j(this.f148022c, mxc0Var.f148022c) && wj50.m88271j(this.f148023d, mxc0Var.f148023d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f148020a.hashCode() * 31, 31, this.f148021b);
        String str = this.f148022c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148023d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
