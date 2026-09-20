package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pxl {

    /* JADX INFO: renamed from: a */
    public final String f182330a;

    /* JADX INFO: renamed from: b */
    public final int f182331b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f182332c;

    /* JADX INFO: renamed from: d */
    public final String f182333d;

    /* JADX INFO: renamed from: e */
    public final String f182334e;

    /* JADX INFO: renamed from: f */
    public final String f182335f;

    /* JADX INFO: renamed from: g */
    public final qf40 f182336g;

    /* JADX INFO: renamed from: h */
    public final boolean f182337h;

    /* JADX INFO: renamed from: i */
    public final String f182338i;

    /* JADX INFO: renamed from: j */
    public final List f182339j;

    /* JADX INFO: renamed from: k */
    public final String f182340k;

    /* JADX INFO: renamed from: l */
    public final nxl f182341l;

    public pxl(String str, int i, rcm0 rcm0Var, String str2, String str3, String str4, qf40 qf40Var, String str5, List list, String str6, nxl nxlVar, int i2) {
        boolean z = (i2 & 128) == 0;
        str5 = (i2 & 256) != 0 ? null : str5;
        list = (i2 & 512) != 0 ? null : list;
        str6 = (i2 & 1024) != 0 ? null : str6;
        this.f182330a = str;
        this.f182331b = i;
        this.f182332c = rcm0Var;
        this.f182333d = str2;
        this.f182334e = str3;
        this.f182335f = str4;
        this.f182336g = qf40Var;
        this.f182337h = z;
        this.f182338i = str5;
        this.f182339j = list;
        this.f182340k = str6;
        this.f182341l = nxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxl)) {
            return false;
        }
        pxl pxlVar = (pxl) obj;
        return wj50.m88271j(this.f182330a, pxlVar.f182330a) && this.f182331b == pxlVar.f182331b && wj50.m88271j(this.f182332c, pxlVar.f182332c) && wj50.m88271j(this.f182333d, pxlVar.f182333d) && wj50.m88271j(this.f182334e, pxlVar.f182334e) && wj50.m88271j(this.f182335f, pxlVar.f182335f) && wj50.m88271j(this.f182336g, pxlVar.f182336g) && this.f182337h == pxlVar.f182337h && wj50.m88271j(this.f182338i, pxlVar.f182338i) && wj50.m88271j(this.f182339j, pxlVar.f182339j) && wj50.m88271j(this.f182340k, pxlVar.f182340k) && wj50.m88271j(this.f182341l, pxlVar.f182341l);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(yds.m93483m(this.f182332c, mt60.m62800g(this.f182331b, this.f182330a.hashCode() * 31, 31), 31), 31, this.f182333d);
        String str = this.f182334e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f182335f;
        int iM77245d = s571.m77245d(fr0.m42461e(this.f182336g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f182337h);
        String str3 = this.f182338i;
        int iHashCode2 = (iM77245d + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f182339j;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f182340k;
        return this.f182341l.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
