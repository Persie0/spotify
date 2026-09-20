package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f0w implements j7f0 {

    /* JADX INFO: renamed from: a */
    public final uzk f64723a;

    /* JADX INFO: renamed from: b */
    public final String f64724b;

    /* JADX INFO: renamed from: c */
    public final String f64725c;

    /* JADX INFO: renamed from: d */
    public final boolean f64726d;

    /* JADX INFO: renamed from: e */
    public final boolean f64727e;

    /* JADX INFO: renamed from: f */
    public final hto0 f64728f;

    /* JADX INFO: renamed from: g */
    public final boolean f64729g;

    /* JADX INFO: renamed from: h */
    public final int f64730h;

    /* JADX INFO: renamed from: i */
    public final Integer f64731i;

    /* JADX INFO: renamed from: j */
    public final boolean f64732j;

    /* JADX INFO: renamed from: k */
    public final Long f64733k;

    /* JADX INFO: renamed from: l */
    public final boolean f64734l;

    /* JADX INFO: renamed from: m */
    public final int f64735m;

    /* JADX INFO: renamed from: n */
    public final a0w f64736n;

    /* JADX INFO: renamed from: o */
    public final zzv f64737o;

    /* JADX INFO: renamed from: p */
    public final c0w f64738p;

    public f0w(uzk uzkVar, String str, String str2, boolean z, boolean z2, hto0 hto0Var, boolean z3, int i, Integer num, boolean z4, Long l, boolean z5, int i2, a0w a0wVar, zzv zzvVar, c0w c0wVar) {
        this.f64723a = uzkVar;
        this.f64724b = str;
        this.f64725c = str2;
        this.f64726d = z;
        this.f64727e = z2;
        this.f64728f = hto0Var;
        this.f64729g = z3;
        this.f64730h = i;
        this.f64731i = num;
        this.f64732j = z4;
        this.f64733k = l;
        this.f64734l = z5;
        this.f64735m = i2;
        this.f64736n = a0wVar;
        this.f64737o = zzvVar;
        this.f64738p = c0wVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m40508a(int i) {
        String strM84311c = this.f64723a.m84311c(i);
        return strM84311c.length() == 0 ? this.f64736n.f11179d.m84311c(i) : strM84311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0w)) {
            return false;
        }
        f0w f0wVar = (f0w) obj;
        return wj50.m88271j(this.f64723a, f0wVar.f64723a) && wj50.m88271j(this.f64724b, f0wVar.f64724b) && wj50.m88271j(this.f64725c, f0wVar.f64725c) && this.f64726d == f0wVar.f64726d && this.f64727e == f0wVar.f64727e && this.f64728f == f0wVar.f64728f && this.f64729g == f0wVar.f64729g && this.f64730h == f0wVar.f64730h && wj50.m88271j(this.f64731i, f0wVar.f64731i) && this.f64732j == f0wVar.f64732j && wj50.m88271j(this.f64733k, f0wVar.f64733k) && this.f64734l == f0wVar.f64734l && this.f64735m == f0wVar.f64735m && wj50.m88271j(this.f64736n, f0wVar.f64736n) && this.f64737o == f0wVar.f64737o && this.f64738p == f0wVar.f64738p;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f64723a.hashCode() * 31, 31, this.f64724b);
        String str = this.f64725c;
        int iM62800g = mt60.m62800g(this.f64730h, s571.m77245d((this.f64728f.hashCode() + s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64726d), 31, this.f64727e)) * 31, 31, this.f64729g), 31);
        Integer num = this.f64731i;
        int iM77245d = s571.m77245d((iM62800g + (num == null ? 0 : num.hashCode())) * 31, 31, this.f64732j);
        Long l = this.f64733k;
        int iM62800g2 = mt60.m62800g(this.f64735m, s571.m77245d((iM77245d + (l == null ? 0 : l.hashCode())) * 31, 31, this.f64734l), 31);
        a0w a0wVar = this.f64736n;
        return this.f64738p.hashCode() + ((this.f64737o.hashCode() + ((iM62800g2 + (a0wVar != null ? a0wVar.hashCode() : 0)) * 31)) * 31);
    }
}
