package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class p6t0 implements t6t0, r121 {

    /* JADX INFO: renamed from: a */
    public final UUID f174476a;

    /* JADX INFO: renamed from: b */
    public final String f174477b;

    /* JADX INFO: renamed from: c */
    public final String f174478c;

    /* JADX INFO: renamed from: d */
    public final String f174479d;

    /* JADX INFO: renamed from: e */
    public final String f174480e;

    /* JADX INFO: renamed from: f */
    public final ybf0 f174481f;

    /* JADX INFO: renamed from: g */
    public final List f174482g;

    /* JADX INFO: renamed from: h */
    public final long f174483h;

    /* JADX INFO: renamed from: i */
    public final long f174484i;

    /* JADX INFO: renamed from: j */
    public final long f174485j;

    /* JADX INFO: renamed from: k */
    public final String f174486k;

    /* JADX INFO: renamed from: l */
    public final String f174487l;

    /* JADX INFO: renamed from: m */
    public final Long f174488m;

    /* JADX INFO: renamed from: n */
    public final String f174489n;

    /* JADX INFO: renamed from: o */
    public final String f174490o;

    /* JADX INFO: renamed from: p */
    public final UUID f174491p;

    /* JADX INFO: renamed from: q */
    public final String f174492q;

    public p6t0(UUID uuid, String str, String str2, String str3, String str4, ybf0 ybf0Var, ArrayList arrayList, long j, long j2, long j3, String str5, String str6, Long l, String str7, String str8) {
        this.f174476a = uuid;
        this.f174477b = str;
        this.f174478c = str2;
        this.f174479d = str3;
        this.f174480e = str4;
        this.f174481f = ybf0Var;
        this.f174482g = arrayList;
        this.f174483h = j;
        this.f174484i = j2;
        this.f174485j = j3;
        this.f174486k = str5;
        this.f174487l = str6;
        this.f174488m = l;
        this.f174489n = str7;
        this.f174490o = str8;
        this.f174491p = uuid;
        this.f174492q = str;
    }

    @Override // p204p.r121
    /* JADX INFO: renamed from: a */
    public final m221 mo66363a() {
        return m221.METRIC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6t0)) {
            return false;
        }
        p6t0 p6t0Var = (p6t0) obj;
        return wj50.m88271j(this.f174476a, p6t0Var.f174476a) && wj50.m88271j(this.f174477b, p6t0Var.f174477b) && wj50.m88271j(this.f174478c, p6t0Var.f174478c) && wj50.m88271j(this.f174479d, p6t0Var.f174479d) && wj50.m88271j(this.f174480e, p6t0Var.f174480e) && wj50.m88271j(this.f174481f, p6t0Var.f174481f) && wj50.m88271j(this.f174482g, p6t0Var.f174482g) && this.f174483h == p6t0Var.f174483h && this.f174484i == p6t0Var.f174484i && this.f174485j == p6t0Var.f174485j && wj50.m88271j(this.f174486k, p6t0Var.f174486k) && wj50.m88271j(this.f174487l, p6t0Var.f174487l) && wj50.m88271j(this.f174488m, p6t0Var.f174488m) && wj50.m88271j(this.f174489n, p6t0Var.f174489n) && wj50.m88271j(this.f174490o, p6t0Var.f174490o);
    }

    @Override // p204p.r121
    public final UUID getId() {
        return this.f174491p;
    }

    @Override // p204p.r121
    public final String getKey() {
        return this.f174492q;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f174476a.hashCode() * 31, 31, this.f174477b), 31, this.f174478c), 31, this.f174479d), 31, this.f174480e);
        ybf0 ybf0Var = this.f174481f;
        int iHashCode = (iM77243b + (ybf0Var == null ? 0 : ybf0Var.hashCode())) * 31;
        List list = this.f174482g;
        int iM77243b2 = s571.m77243b(dq60.m36605e(dq60.m36605e(dq60.m36605e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, this.f174483h, 31), this.f174484i, 31), this.f174485j, 31), 31, this.f174486k);
        String str = this.f174487l;
        int iHashCode2 = (iM77243b2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f174488m;
        int iM77243b3 = s571.m77243b((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f174489n);
        String str2 = this.f174490o;
        return iM77243b3 + (str2 != null ? str2.hashCode() : 0);
    }
}
