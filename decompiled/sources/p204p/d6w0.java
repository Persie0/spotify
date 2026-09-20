package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d6w0 {

    /* JADX INFO: renamed from: a */
    public final String f45894a;

    /* JADX INFO: renamed from: b */
    public final String f45895b;

    /* JADX INFO: renamed from: c */
    public final Long f45896c;

    /* JADX INFO: renamed from: d */
    public final Long f45897d;

    /* JADX INFO: renamed from: e */
    public final ig40 f45898e;

    /* JADX INFO: renamed from: f */
    public final int f45899f;

    /* JADX INFO: renamed from: g */
    public final boolean f45900g;

    /* JADX INFO: renamed from: h */
    public final qf40 f45901h;

    /* JADX INFO: renamed from: i */
    public final boolean f45902i;

    /* JADX INFO: renamed from: j */
    public final hs00 f45903j;

    /* JADX INFO: renamed from: k */
    public final arg1 f45904k;

    /* JADX INFO: renamed from: l */
    public final qf40 f45905l;

    /* JADX INFO: renamed from: m */
    public final pvf1 f45906m;

    /* JADX INFO: renamed from: n */
    public final boolean f45907n;

    /* JADX INFO: renamed from: o */
    public final String f45908o;

    /* JADX INFO: renamed from: p */
    public final Long f45909p;

    /* JADX INFO: renamed from: q */
    public final long f45910q;

    /* JADX INFO: renamed from: r */
    public final tj31 f45911r;

    /* JADX INFO: renamed from: s */
    public final zam f45912s;

    /* JADX INFO: renamed from: t */
    public final hij f45913t;

    /* JADX INFO: renamed from: u */
    public final w0w0 f45914u;

    /* JADX INFO: renamed from: v */
    public final plq0 f45915v;

    /* JADX INFO: renamed from: w */
    public final z3b1 f45916w;

    /* JADX INFO: renamed from: x */
    public final rhj f45917x;

    public d6w0(String str, String str2, Long l, Long l2, ig40 ig40Var, int i, boolean z, qf40 qf40Var, boolean z2, hs00 hs00Var, arg1 arg1Var, qf40 qf40Var2, pvf1 pvf1Var, boolean z3, String str3, Long l3, long j, tj31 tj31Var, zam zamVar, hij hijVar, w0w0 w0w0Var, plq0 plq0Var, z3b1 z3b1Var, rhj rhjVar, int i2) {
        String str4 = (i2 & 2) != 0 ? null : str2;
        Long l4 = (i2 & 4) != 0 ? null : l;
        Long l5 = (i2 & 8) != 0 ? null : l2;
        ig40 ig40VarM67569s = (i2 & 16) != 0 ? opo.m67569s() : ig40Var;
        int i3 = (i2 & 32) != 0 ? 0 : i;
        boolean z4 = (i2 & 64) != 0 ? false : z;
        qf40 qf40Var3 = (i2 & 128) != 0 ? lv21.f137205b : qf40Var;
        boolean z5 = (i2 & 256) != 0 ? false : z2;
        hs00 hs00Var2 = (i2 & 512) != 0 ? null : hs00Var;
        arg1 arg1Var2 = (i2 & 1024) != 0 ? null : arg1Var;
        qf40 qf40Var4 = (i2 & 2048) != 0 ? null : qf40Var2;
        pvf1 pvf1Var2 = (i2 & 4096) != 0 ? s76.f206285d : pvf1Var;
        boolean z6 = (i2 & 8192) == 0 ? z3 : false;
        String str5 = (i2 & 16384) != 0 ? null : str3;
        Long l6 = (i2 & 32768) != 0 ? null : l3;
        long j2 = (i2 & 65536) != 0 ? 0L : j;
        tj31 tj31Var2 = (i2 & 131072) != 0 ? null : tj31Var;
        zam zamVar2 = (i2 & 262144) != 0 ? null : zamVar;
        hij hijVar2 = (i2 & 524288) != 0 ? null : hijVar;
        w0w0 w0w0Var2 = (i2 & 1048576) != 0 ? null : w0w0Var;
        plq0 plq0Var2 = (i2 & 2097152) != 0 ? null : plq0Var;
        z3b1 z3b1Var2 = (i2 & 4194304) != 0 ? null : z3b1Var;
        rhj rhjVar2 = (i2 & 8388608) != 0 ? null : rhjVar;
        this.f45894a = str;
        this.f45895b = str4;
        this.f45896c = l4;
        this.f45897d = l5;
        this.f45898e = ig40VarM67569s;
        this.f45899f = i3;
        this.f45900g = z4;
        this.f45901h = qf40Var3;
        this.f45902i = z5;
        this.f45903j = hs00Var2;
        this.f45904k = arg1Var2;
        this.f45905l = qf40Var4;
        this.f45906m = pvf1Var2;
        this.f45907n = z6;
        this.f45908o = str5;
        this.f45909p = l6;
        this.f45910q = j2;
        this.f45911r = tj31Var2;
        this.f45912s = zamVar2;
        this.f45913t = hijVar2;
        this.f45914u = w0w0Var2;
        this.f45915v = plq0Var2;
        this.f45916w = z3b1Var2;
        this.f45917x = rhjVar2;
    }

    /* JADX INFO: renamed from: a */
    public final int m35156a(boolean z) {
        qf40 qf40Var = this.f45901h;
        if (qf40Var == null || !qf40Var.isEmpty()) {
            Iterator<E> it = qf40Var.iterator();
            while (it.hasNext()) {
                if (((ksj) it.next()).m57239a().contains("MOGEF-19+")) {
                    return 1;
                }
            }
        }
        return z ? 2 : 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6w0)) {
            return false;
        }
        d6w0 d6w0Var = (d6w0) obj;
        return wj50.m88271j(this.f45894a, d6w0Var.f45894a) && wj50.m88271j(this.f45895b, d6w0Var.f45895b) && wj50.m88271j(this.f45896c, d6w0Var.f45896c) && wj50.m88271j(this.f45897d, d6w0Var.f45897d) && wj50.m88271j(this.f45898e, d6w0Var.f45898e) && this.f45899f == d6w0Var.f45899f && this.f45900g == d6w0Var.f45900g && wj50.m88271j(this.f45901h, d6w0Var.f45901h) && this.f45902i == d6w0Var.f45902i && wj50.m88271j(this.f45903j, d6w0Var.f45903j) && wj50.m88271j(this.f45904k, d6w0Var.f45904k) && wj50.m88271j(this.f45905l, d6w0Var.f45905l) && wj50.m88271j(this.f45906m, d6w0Var.f45906m) && this.f45907n == d6w0Var.f45907n && wj50.m88271j(this.f45908o, d6w0Var.f45908o) && wj50.m88271j(this.f45909p, d6w0Var.f45909p) && this.f45910q == d6w0Var.f45910q && wj50.m88271j(this.f45911r, d6w0Var.f45911r) && wj50.m88271j(this.f45912s, d6w0Var.f45912s) && wj50.m88271j(this.f45913t, d6w0Var.f45913t) && wj50.m88271j(this.f45914u, d6w0Var.f45914u) && wj50.m88271j(this.f45915v, d6w0Var.f45915v) && wj50.m88271j(this.f45916w, d6w0Var.f45916w) && this.f45917x == d6w0Var.f45917x;
    }

    public final int hashCode() {
        int iHashCode = this.f45894a.hashCode() * 31;
        String str = this.f45895b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f45896c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f45897d;
        int iHashCode4 = (this.f45898e.hashCode() + ((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        int i = this.f45899f;
        int iM77245d = s571.m77245d(fr0.m42461e(this.f45901h, s571.m77245d((iHashCode4 + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f45900g), 31), 31, this.f45902i);
        hs00 hs00Var = this.f45903j;
        int iHashCode5 = (iM77245d + (hs00Var == null ? 0 : hs00Var.hashCode())) * 31;
        arg1 arg1Var = this.f45904k;
        int iHashCode6 = (iHashCode5 + (arg1Var == null ? 0 : arg1Var.hashCode())) * 31;
        qf40 qf40Var = this.f45905l;
        int iM77245d2 = s571.m77245d((this.f45906m.hashCode() + ((iHashCode6 + (qf40Var == null ? 0 : qf40Var.hashCode())) * 31)) * 31, 31, this.f45907n);
        String str2 = this.f45908o;
        int iHashCode7 = (iM77245d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f45909p;
        int iM36605e = dq60.m36605e((iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31, this.f45910q, 31);
        tj31 tj31Var = this.f45911r;
        int iHashCode8 = (iM36605e + (tj31Var == null ? 0 : tj31Var.hashCode())) * 31;
        zam zamVar = this.f45912s;
        int iHashCode9 = (iHashCode8 + (zamVar == null ? 0 : zamVar.hashCode())) * 31;
        hij hijVar = this.f45913t;
        int iHashCode10 = (iHashCode9 + (hijVar == null ? 0 : hijVar.hashCode())) * 31;
        w0w0 w0w0Var = this.f45914u;
        int iHashCode11 = (iHashCode10 + (w0w0Var == null ? 0 : w0w0Var.hashCode())) * 31;
        plq0 plq0Var = this.f45915v;
        int iHashCode12 = (iHashCode11 + (plq0Var == null ? 0 : plq0Var.hashCode())) * 31;
        z3b1 z3b1Var = this.f45916w;
        int iHashCode13 = (iHashCode12 + (z3b1Var == null ? 0 : z3b1Var.hashCode())) * 31;
        rhj rhjVar = this.f45917x;
        return iHashCode13 + (rhjVar != null ? rhjVar.hashCode() : 0);
    }
}
