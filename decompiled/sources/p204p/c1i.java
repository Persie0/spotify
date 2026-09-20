package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class c1i implements e1i {

    /* JADX INFO: renamed from: A */
    public final String f33098A;

    /* JADX INFO: renamed from: B */
    public final String f33099B;

    /* JADX INFO: renamed from: C */
    public final boolean f33100C;

    /* JADX INFO: renamed from: a */
    public final String f33101a;

    /* JADX INFO: renamed from: b */
    public final String f33102b;

    /* JADX INFO: renamed from: c */
    public final String f33103c;

    /* JADX INFO: renamed from: d */
    public final String f33104d;

    /* JADX INFO: renamed from: e */
    public final String f33105e;

    /* JADX INFO: renamed from: f */
    public final String f33106f;

    /* JADX INFO: renamed from: g */
    public final String f33107g;

    /* JADX INFO: renamed from: h */
    public final int f33108h;

    /* JADX INFO: renamed from: i */
    public final r0i f33109i;

    /* JADX INFO: renamed from: j */
    public final s0i f33110j;

    /* JADX INFO: renamed from: k */
    public final n6f f33111k;

    /* JADX INFO: renamed from: l */
    public final n6f f33112l;

    /* JADX INFO: renamed from: m */
    public final long f33113m;

    /* JADX INFO: renamed from: n */
    public final cjb f33114n;

    /* JADX INFO: renamed from: o */
    public final boolean f33115o;

    /* JADX INFO: renamed from: p */
    public final boolean f33116p;

    /* JADX INFO: renamed from: q */
    public final int f33117q;

    /* JADX INFO: renamed from: r */
    public final rrt f33118r;

    /* JADX INFO: renamed from: s */
    public final boolean f33119s;

    /* JADX INFO: renamed from: t */
    public final boolean f33120t;

    /* JADX INFO: renamed from: u */
    public final boolean f33121u;

    /* JADX INFO: renamed from: v */
    public final int f33122v;

    /* JADX INFO: renamed from: w */
    public final List f33123w;

    /* JADX INFO: renamed from: x */
    public final String f33124x;

    /* JADX INFO: renamed from: y */
    public final boolean f33125y;

    /* JADX INFO: renamed from: z */
    public final String f33126z;

    public c1i(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, r0i r0iVar, s0i s0iVar, n6f n6fVar, n6f n6fVar2, long j, cjb cjbVar, boolean z, boolean z2, int i2, rrt rrtVar, boolean z3, boolean z4, boolean z5, int i3, List list, String str8, boolean z6, String str9, String str10, String str11, boolean z7) {
        this.f33101a = str;
        this.f33102b = str2;
        this.f33103c = str3;
        this.f33104d = str4;
        this.f33105e = str5;
        this.f33106f = str6;
        this.f33107g = str7;
        this.f33108h = i;
        this.f33109i = r0iVar;
        this.f33110j = s0iVar;
        this.f33111k = n6fVar;
        this.f33112l = n6fVar2;
        this.f33113m = j;
        this.f33114n = cjbVar;
        this.f33115o = z;
        this.f33116p = z2;
        this.f33117q = i2;
        this.f33118r = rrtVar;
        this.f33119s = z3;
        this.f33120t = z4;
        this.f33121u = z5;
        this.f33122v = i3;
        this.f33123w = list;
        this.f33124x = str8;
        this.f33125y = z6;
        this.f33126z = str9;
        this.f33098A = str10;
        this.f33099B = str11;
        this.f33100C = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1i)) {
            return false;
        }
        c1i c1iVar = (c1i) obj;
        if (!wj50.m88271j(this.f33101a, c1iVar.f33101a) || !wj50.m88271j(this.f33102b, c1iVar.f33102b) || !wj50.m88271j(this.f33103c, c1iVar.f33103c) || !wj50.m88271j(this.f33104d, c1iVar.f33104d) || !this.f33105e.equals(c1iVar.f33105e) || !wj50.m88271j(this.f33106f, c1iVar.f33106f) || !wj50.m88271j(this.f33107g, c1iVar.f33107g) || this.f33108h != c1iVar.f33108h || !this.f33109i.equals(c1iVar.f33109i) || this.f33110j != c1iVar.f33110j || !wj50.m88271j(this.f33111k, c1iVar.f33111k) || !wj50.m88271j(this.f33112l, c1iVar.f33112l)) {
            return false;
        }
        long j = c1iVar.f33113m;
        int i = n6f.f150872l;
        return as91.m27074b(this.f33113m, j) && wj50.m88271j(this.f33114n, c1iVar.f33114n) && this.f33115o == c1iVar.f33115o && this.f33116p == c1iVar.f33116p && this.f33117q == c1iVar.f33117q && wj50.m88271j(this.f33118r, c1iVar.f33118r) && this.f33119s == c1iVar.f33119s && this.f33120t == c1iVar.f33120t && this.f33121u == c1iVar.f33121u && this.f33122v == c1iVar.f33122v && wj50.m88271j(this.f33123w, c1iVar.f33123w) && wj50.m88271j(this.f33124x, c1iVar.f33124x) && this.f33125y == c1iVar.f33125y && wj50.m88271j(this.f33126z, c1iVar.f33126z) && wj50.m88271j(this.f33098A, c1iVar.f33098A) && wj50.m88271j(this.f33099B, c1iVar.f33099B) && this.f33100C == c1iVar.f33100C;
    }

    @Override // p204p.e1i
    public final String getUri() {
        return this.f33101a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f33101a.hashCode() * 31, 31, this.f33102b), 31, this.f33103c), 31, this.f33104d), 31, this.f33105e), 31, this.f33106f), 31, this.f33107g);
        int i = this.f33108h;
        int iHashCode = (this.f33110j.hashCode() + ((this.f33109i.hashCode() + ((iM77243b + (i == 0 ? 0 : edb.m38547C(i))) * 31)) * 31)) * 31;
        n6f n6fVar = this.f33111k;
        int iHashCode2 = (iHashCode + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        n6f n6fVar2 = this.f33112l;
        int iHashCode3 = (iHashCode2 + (n6fVar2 == null ? 0 : Long.hashCode(n6fVar2.f150873a))) * 31;
        int i2 = n6f.f150872l;
        int iM36605e = dq60.m36605e(iHashCode3, this.f33113m, 31);
        cjb cjbVar = this.f33114n;
        int iM77244c = s571.m77244c(f710.m40938f(this.f33122v, s571.m77245d(s571.m77245d(s571.m77245d((this.f33118r.hashCode() + f710.m40938f(this.f33117q, s571.m77245d(s571.m77245d((iM36605e + (cjbVar == null ? 0 : cjbVar.hashCode())) * 31, 31, this.f33115o), 31, this.f33116p), 31)) * 31, 31, this.f33119s), 31, this.f33120t), 31, this.f33121u), 31), 31, this.f33123w);
        String str = this.f33124x;
        int iM77245d = s571.m77245d((iM77244c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f33125y);
        String str2 = this.f33126z;
        int iHashCode4 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33098A;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33099B;
        return Boolean.hashCode(this.f33100C) + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
