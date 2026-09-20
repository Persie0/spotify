package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f38618a;

    /* JADX INFO: renamed from: b */
    public final String f38619b;

    /* JADX INFO: renamed from: c */
    public final String f38620c;

    /* JADX INFO: renamed from: d */
    public final List f38621d;

    /* JADX INFO: renamed from: e */
    public final gkm0 f38622e;

    public cjm0(String str, String str2, String str3, List list, gkm0 gkm0Var) {
        this.f38618a = str;
        this.f38619b = str2;
        this.f38620c = str3;
        this.f38621d = list;
        this.f38622e = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjm0)) {
            return false;
        }
        cjm0 cjm0Var = (cjm0) obj;
        return wj50.m88271j(this.f38618a, cjm0Var.f38618a) && wj50.m88271j(this.f38619b, cjm0Var.f38619b) && wj50.m88271j(this.f38620c, cjm0Var.f38620c) && wj50.m88271j(this.f38621d, cjm0Var.f38621d) && wj50.m88271j(this.f38622e, cjm0Var.f38622e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f38618a.hashCode() * 31, 31, this.f38619b);
        String str = this.f38620c;
        return this.f38622e.hashCode() + s571.m77244c((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f38621d);
    }
}
