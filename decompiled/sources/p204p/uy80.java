package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uy80 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f235205a;

    /* JADX INFO: renamed from: b */
    public final long f235206b;

    /* JADX INFO: renamed from: c */
    public final long f235207c;

    /* JADX INFO: renamed from: d */
    public final String f235208d;

    /* JADX INFO: renamed from: e */
    public final tzk f235209e;

    /* JADX INFO: renamed from: f */
    public final String f235210f;

    /* JADX INFO: renamed from: g */
    public final String f235211g;

    /* JADX INFO: renamed from: h */
    public final String f235212h;

    /* JADX INFO: renamed from: i */
    public final Map f235213i;

    /* JADX INFO: renamed from: j */
    public final noa1 f235214j;

    /* JADX INFO: renamed from: k */
    public final Long f235215k;

    public uy80(String str, long j, long j2, String str2, tzk tzkVar, String str3, String str4, String str5, Map map, noa1 noa1Var, Long l) {
        this.f235205a = str;
        this.f235206b = j;
        this.f235207c = j2;
        this.f235208d = str2;
        this.f235209e = tzkVar;
        this.f235210f = str3;
        this.f235211g = str4;
        this.f235212h = str5;
        this.f235213i = map;
        this.f235214j = noa1Var;
        this.f235215k = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy80)) {
            return false;
        }
        uy80 uy80Var = (uy80) obj;
        return wj50.m88271j(this.f235205a, uy80Var.f235205a) && this.f235206b == uy80Var.f235206b && this.f235207c == uy80Var.f235207c && wj50.m88271j(this.f235208d, uy80Var.f235208d) && wj50.m88271j(this.f235209e, uy80Var.f235209e) && wj50.m88271j(this.f235210f, uy80Var.f235210f) && wj50.m88271j(this.f235211g, uy80Var.f235211g) && wj50.m88271j(this.f235212h, uy80Var.f235212h) && wj50.m88271j(this.f235213i, uy80Var.f235213i) && wj50.m88271j(this.f235214j, uy80Var.f235214j) && wj50.m88271j(this.f235215k, uy80Var.f235215k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f235209e.hashCode() + s571.m77243b(dq60.m36605e(dq60.m36605e(this.f235205a.hashCode() * 31, this.f235206b, 31), this.f235207c, 31), 31, this.f235208d)) * 31, 31, this.f235210f);
        String str = this.f235211g;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f235212h;
        int iHashCode2 = (this.f235214j.hashCode() + edb.m38557f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f235213i)) * 31;
        Long l = this.f235215k;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
