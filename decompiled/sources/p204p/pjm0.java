package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f178279a;

    /* JADX INFO: renamed from: b */
    public final String f178280b;

    /* JADX INFO: renamed from: c */
    public final String f178281c;

    /* JADX INFO: renamed from: d */
    public final String f178282d;

    /* JADX INFO: renamed from: e */
    public final String f178283e;

    /* JADX INFO: renamed from: f */
    public final List f178284f;

    /* JADX INFO: renamed from: g */
    public final gkm0 f178285g;

    public pjm0(String str, String str2, String str3, String str4, String str5, List list, gkm0 gkm0Var) {
        this.f178279a = str;
        this.f178280b = str2;
        this.f178281c = str3;
        this.f178282d = str4;
        this.f178283e = str5;
        this.f178284f = list;
        this.f178285g = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjm0)) {
            return false;
        }
        pjm0 pjm0Var = (pjm0) obj;
        return wj50.m88271j(this.f178279a, pjm0Var.f178279a) && wj50.m88271j(this.f178280b, pjm0Var.f178280b) && wj50.m88271j(this.f178281c, pjm0Var.f178281c) && wj50.m88271j(this.f178282d, pjm0Var.f178282d) && wj50.m88271j(this.f178283e, pjm0Var.f178283e) && wj50.m88271j(this.f178284f, pjm0Var.f178284f) && wj50.m88271j(this.f178285g, pjm0Var.f178285g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f178279a.hashCode() * 31, 31, this.f178280b), 31, this.f178281c);
        String str = this.f178282d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f178283e;
        return this.f178285g.hashCode() + s571.m77244c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f178284f);
    }
}
