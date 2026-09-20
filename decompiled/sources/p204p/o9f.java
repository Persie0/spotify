package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class o9f {

    /* JADX INFO: renamed from: a */
    public final long f163015a;

    /* JADX INFO: renamed from: b */
    public final long f163016b;

    /* JADX INFO: renamed from: c */
    public final long f163017c;

    /* JADX INFO: renamed from: d */
    public final long f163018d;

    /* JADX INFO: renamed from: e */
    public final long f163019e;

    /* JADX INFO: renamed from: f */
    public final long f163020f;

    /* JADX INFO: renamed from: g */
    public final long f163021g;

    /* JADX INFO: renamed from: h */
    public final long f163022h;

    public o9f() {
        long jM75434d = rfg1.m75434d(4288397311L);
        long jM75434d2 = rfg1.m75434d(4283205865L);
        long jM75434d3 = rfg1.m75434d(4284743336L);
        long jM75434d4 = rfg1.m75434d(4294944672L);
        long j = n6f.f150862b;
        long jM75434d5 = rfg1.m75434d(4280690214L);
        long jM75434d6 = rfg1.m75434d(4284507232L);
        long jM75434d7 = rfg1.m75434d(4282532682L);
        this.f163015a = jM75434d;
        this.f163016b = jM75434d2;
        this.f163017c = jM75434d3;
        this.f163018d = jM75434d4;
        this.f163019e = j;
        this.f163020f = jM75434d5;
        this.f163021g = jM75434d6;
        this.f163022h = jM75434d7;
    }

    /* JADX INFO: renamed from: a */
    public final long m66460a() {
        return this.f163020f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9f)) {
            return false;
        }
        o9f o9fVar = (o9f) obj;
        long j = o9fVar.f163015a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f163015a, j) && as91.m27074b(this.f163016b, o9fVar.f163016b) && as91.m27074b(this.f163017c, o9fVar.f163017c) && as91.m27074b(this.f163018d, o9fVar.f163018d) && as91.m27074b(this.f163019e, o9fVar.f163019e) && as91.m27074b(this.f163020f, o9fVar.f163020f) && as91.m27074b(this.f163021g, o9fVar.f163021g) && as91.m27074b(this.f163022h, o9fVar.f163022h);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f163022h) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f163015a) * 31, this.f163016b, 31), this.f163017c, 31), this.f163018d, 31), this.f163019e, 31), this.f163020f, 31), this.f163021g, 31);
    }

    public final String toString() {
        String strM63771h = n6f.m63771h(this.f163015a);
        String strM63771h2 = n6f.m63771h(this.f163016b);
        String strM63771h3 = n6f.m63771h(this.f163017c);
        String strM63771h4 = n6f.m63771h(this.f163018d);
        String strM63771h5 = n6f.m63771h(this.f163019e);
        String strM63771h6 = n6f.m63771h(this.f163020f);
        String strM63771h7 = n6f.m63771h(this.f163021g);
        String strM63771h8 = n6f.m63771h(this.f163022h);
        StringBuilder sbM38573v = edb.m38573v("Colors(primary=", strM63771h, ", secondary=", strM63771h2, ", positive=");
        klh.m56844p(sbM38573v, strM63771h3, ", negative=", strM63771h4, ", background=");
        klh.m56844p(sbM38573v, strM63771h5, ", surface=", strM63771h6, ", outline=");
        return klh.m56837i(sbM38573v, strM63771h7, ", outlineVariant=", strM63771h8, ")");
    }
}
