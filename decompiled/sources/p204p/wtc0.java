package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class wtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f254911a;

    /* JADX INFO: renamed from: b */
    public final String f254912b;

    /* JADX INFO: renamed from: c */
    public final String f254913c;

    /* JADX INFO: renamed from: d */
    public final Long f254914d;

    /* JADX INFO: renamed from: e */
    public final String f254915e;

    /* JADX INFO: renamed from: f */
    public final String f254916f;

    /* JADX INFO: renamed from: g */
    public final r891 f254917g;

    /* JADX INFO: renamed from: h */
    public final List f254918h;

    /* JADX INFO: renamed from: i */
    public final String f254919i;

    /* JADX INFO: renamed from: j */
    public final int f254920j;

    public wtc0(String str, String str2, String str3, Long l, String str4, String str5, r891 r891Var, List list, String str6, int i, int i2) {
        str3 = (i2 & 4) != 0 ? null : str3;
        l = (i2 & 8) != 0 ? null : l;
        str5 = (i2 & 32) != 0 ? null : str5;
        r891Var = (i2 & 64) != 0 ? null : r891Var;
        list = (i2 & 128) != 0 ? lau.f131415a : list;
        i = (i2 & 512) != 0 ? 0 : i;
        this.f254911a = str;
        this.f254912b = str2;
        this.f254913c = str3;
        this.f254914d = l;
        this.f254915e = str4;
        this.f254916f = str5;
        this.f254917g = r891Var;
        this.f254918h = list;
        this.f254919i = str6;
        this.f254920j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtc0)) {
            return false;
        }
        wtc0 wtc0Var = (wtc0) obj;
        return wj50.m88271j(this.f254911a, wtc0Var.f254911a) && wj50.m88271j(this.f254912b, wtc0Var.f254912b) && wj50.m88271j(this.f254913c, wtc0Var.f254913c) && wj50.m88271j(this.f254914d, wtc0Var.f254914d) && wj50.m88271j(this.f254915e, wtc0Var.f254915e) && wj50.m88271j(this.f254916f, wtc0Var.f254916f) && this.f254917g == wtc0Var.f254917g && wj50.m88271j(this.f254918h, wtc0Var.f254918h) && wj50.m88271j(this.f254919i, wtc0Var.f254919i) && this.f254920j == wtc0Var.f254920j;
    }

    public final int hashCode() {
        int iHashCode = this.f254911a.hashCode() * 31;
        String str = this.f254912b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f254913c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f254914d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f254915e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f254916f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        r891 r891Var = this.f254917g;
        int iM77244c = s571.m77244c((iHashCode6 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f254918h);
        String str5 = this.f254919i;
        int iHashCode7 = (iM77244c + (str5 == null ? 0 : str5.hashCode())) * 31;
        int i = this.f254920j;
        return iHashCode7 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
