package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.ci */
/* JADX INFO: loaded from: classes.dex */
public final class C1742ci implements InterfaceC2415th {

    /* JADX INFO: renamed from: b */
    public final String f38159b;

    /* JADX INFO: renamed from: c */
    public final String f38160c;

    /* JADX INFO: renamed from: d */
    public final String f38161d;

    /* JADX INFO: renamed from: e */
    public final int f38162e;

    /* JADX INFO: renamed from: f */
    public final List f38163f;

    /* JADX INFO: renamed from: g */
    public final Boolean f38164g;

    /* JADX INFO: renamed from: h */
    public final fmg1 f38165h;

    /* JADX INFO: renamed from: i */
    public final r040 f38166i;

    public C1742ci(String str, String str2, String str3, int i, List list, Boolean bool, fmg1 fmg1Var, r040 r040Var) {
        this.f38159b = str;
        this.f38160c = str2;
        this.f38161d = str3;
        this.f38162e = i;
        this.f38163f = list;
        this.f38164g = bool;
        this.f38165h = fmg1Var;
        this.f38166i = r040Var;
    }

    /* JADX INFO: renamed from: c */
    public static C1742ci m32822c(C1742ci c1742ci, String str, String str2, String str3, List list, Boolean bool, fmg1 fmg1Var, r040 r040Var, int i) {
        if ((i & 1) != 0) {
            str = c1742ci.f38159b;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = c1742ci.f38160c;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c1742ci.f38161d;
        }
        String str6 = str3;
        int i2 = c1742ci.f38162e;
        if ((i & 16) != 0) {
            list = c1742ci.f38163f;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = c1742ci.f38164g;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            fmg1Var = c1742ci.f38165h;
        }
        fmg1 fmg1Var2 = fmg1Var;
        r040 r040Var2 = (i & 128) != 0 ? c1742ci.f38166i : r040Var;
        c1742ci.getClass();
        return new C1742ci(str4, str5, str6, i2, list2, bool2, fmg1Var2, r040Var2);
    }

    /* JADX INFO: renamed from: b */
    public final String m32823b() {
        String str = this.f38160c;
        return str == null ? this.f38159b : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1742ci)) {
            return false;
        }
        C1742ci c1742ci = (C1742ci) obj;
        return wj50.m88271j(this.f38159b, c1742ci.f38159b) && wj50.m88271j(this.f38160c, c1742ci.f38160c) && wj50.m88271j(this.f38161d, c1742ci.f38161d) && this.f38162e == c1742ci.f38162e && wj50.m88271j(this.f38163f, c1742ci.f38163f) && wj50.m88271j(this.f38164g, c1742ci.f38164g) && wj50.m88271j(this.f38165h, c1742ci.f38165h) && wj50.m88271j(this.f38166i, c1742ci.f38166i);
    }

    public final int hashCode() {
        String str = this.f38159b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38160c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38161d;
        int iM77244c = s571.m77244c(f710.m40938f(this.f38162e, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f38163f);
        Boolean bool = this.f38164g;
        return this.f38166i.hashCode() + ((this.f38165h.hashCode() + ((iM77244c + (bool != null ? bool.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM38573v = edb.m38573v("AccessoryImpl(name=", this.f38159b, ", alias=", this.f38160c, ", accessoryClass=");
        sbM38573v.append(this.f38161d);
        sbM38573v.append(", transportType=");
        sbM38573v.append(xl81.m91411t(this.f38162e));
        sbM38573v.append(", supportedFeatures=");
        sbM38573v.append(this.f38163f);
        sbM38573v.append(", activeAudioRoute=");
        sbM38573v.append(this.f38164g);
        sbM38573v.append(", categorizationStatus=");
        sbM38573v.append(this.f38165h);
        sbM38573v.append(", identifier=");
        sbM38573v.append(this.f38166i);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }

    public /* synthetic */ C1742ci(String str, String str2, String str3, int i, List list, Boolean bool, C2457uh c2457uh, r040 r040Var, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, i, (i2 & 16) != 0 ? lau.f131415a : list, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? C2495vh.f241375c : c2457uh, r040Var);
    }
}
