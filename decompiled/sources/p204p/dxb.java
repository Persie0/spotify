package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dxb {

    /* JADX INFO: renamed from: a */
    public final List f53916a;

    /* JADX INFO: renamed from: b */
    public final List f53917b;

    /* JADX INFO: renamed from: c */
    public final String f53918c;

    /* JADX INFO: renamed from: d */
    public final String f53919d;

    /* JADX INFO: renamed from: e */
    public final String f53920e;

    /* JADX INFO: renamed from: f */
    public final String f53921f;

    /* JADX INFO: renamed from: g */
    public final String f53922g;

    /* JADX INFO: renamed from: h */
    public final String f53923h;

    public dxb(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f53916a = list;
        this.f53917b = list2;
        this.f53918c = str;
        this.f53919d = str2;
        this.f53920e = str3;
        this.f53921f = str4;
        this.f53922g = str5;
        this.f53923h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxb)) {
            return false;
        }
        dxb dxbVar = (dxb) obj;
        return wj50.m88271j(this.f53916a, dxbVar.f53916a) && wj50.m88271j(this.f53917b, dxbVar.f53917b) && wj50.m88271j(this.f53918c, dxbVar.f53918c) && wj50.m88271j(this.f53919d, dxbVar.f53919d) && wj50.m88271j(this.f53920e, dxbVar.f53920e) && wj50.m88271j(this.f53921f, dxbVar.f53921f) && wj50.m88271j(this.f53922g, dxbVar.f53922g) && wj50.m88271j(this.f53923h, dxbVar.f53923h);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f53916a.hashCode() * 31, 31, this.f53917b);
        String str = this.f53918c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53919d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f53920e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f53921f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f53922g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f53923h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
