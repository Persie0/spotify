package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class jpv {

    /* JADX INFO: renamed from: a */
    public final String f114727a;

    /* JADX INFO: renamed from: b */
    public final String f114728b;

    /* JADX INFO: renamed from: c */
    public final q76 f114729c;

    /* JADX INFO: renamed from: d */
    public final boolean f114730d;

    /* JADX INFO: renamed from: e */
    public final String f114731e;

    /* JADX INFO: renamed from: f */
    public final boolean f114732f;

    /* JADX INFO: renamed from: g */
    public final boolean f114733g;

    /* JADX INFO: renamed from: h */
    public final Set f114734h;

    /* JADX INFO: renamed from: i */
    public final String f114735i;

    /* JADX INFO: renamed from: j */
    public final lmo f114736j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2376sh f114737k;

    public jpv(String str, String str2, q76 q76Var, boolean z, String str3, boolean z2, boolean z3, Set set, String str4, lmo lmoVar, InterfaceC2376sh interfaceC2376sh) {
        this.f114727a = str;
        this.f114728b = str2;
        this.f114729c = q76Var;
        this.f114730d = z;
        this.f114731e = str3;
        this.f114732f = z2;
        this.f114733g = z3;
        this.f114734h = set;
        this.f114735i = str4;
        this.f114736j = lmoVar;
        this.f114737k = interfaceC2376sh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpv)) {
            return false;
        }
        jpv jpvVar = (jpv) obj;
        return wj50.m88271j(this.f114727a, jpvVar.f114727a) && wj50.m88271j(this.f114728b, jpvVar.f114728b) && wj50.m88271j(this.f114729c, jpvVar.f114729c) && this.f114730d == jpvVar.f114730d && wj50.m88271j(this.f114731e, jpvVar.f114731e) && this.f114732f == jpvVar.f114732f && this.f114733g == jpvVar.f114733g && wj50.m88271j(this.f114734h, jpvVar.f114734h) && wj50.m88271j(this.f114735i, jpvVar.f114735i) && wj50.m88271j(this.f114736j, jpvVar.f114736j) && wj50.m88271j(this.f114737k, jpvVar.f114737k);
    }

    public final int hashCode() {
        int iHashCode = this.f114727a.hashCode() * 31;
        String str = this.f114728b;
        int iM77245d = s571.m77245d((this.f114729c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f114730d);
        String str2 = this.f114731e;
        int iM56830b = klh.m56830b(s571.m77245d(s571.m77245d((iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f114732f), 31, this.f114733g), 31, this.f114734h);
        String str3 = this.f114735i;
        int iHashCode2 = (iM56830b + (str3 == null ? 0 : str3.hashCode())) * 31;
        lmo lmoVar = this.f114736j;
        return this.f114737k.hashCode() + ((iHashCode2 + (lmoVar != null ? Long.hashCode(lmoVar.f134995a) : 0)) * 31);
    }
}
