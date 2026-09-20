package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rs70 implements mv70 {

    /* JADX INFO: renamed from: a */
    public final int f202194a;

    /* JADX INFO: renamed from: b */
    public final Object f202195b;

    /* JADX INFO: renamed from: c */
    public final int f202196c;

    /* JADX INFO: renamed from: d */
    public final ko70 f202197d;

    /* JADX INFO: renamed from: e */
    public final int f202198e;

    /* JADX INFO: renamed from: f */
    public final int f202199f;

    /* JADX INFO: renamed from: g */
    public final List f202200g;

    /* JADX INFO: renamed from: h */
    public final long f202201h;

    /* JADX INFO: renamed from: i */
    public final Object f202202i;

    /* JADX INFO: renamed from: j */
    public final fv70 f202203j;

    /* JADX INFO: renamed from: k */
    public final long f202204k;

    /* JADX INFO: renamed from: l */
    public final int f202205l;

    /* JADX INFO: renamed from: m */
    public final int f202206m;

    /* JADX INFO: renamed from: n */
    public final int f202207n;

    /* JADX INFO: renamed from: o */
    public final int f202208o;

    /* JADX INFO: renamed from: p */
    public int f202209p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    public int f202210q;

    /* JADX INFO: renamed from: r */
    public int f202211r;

    /* JADX INFO: renamed from: s */
    public final long f202212s;

    /* JADX INFO: renamed from: t */
    public long f202213t;

    /* JADX INFO: renamed from: u */
    public int f202214u;

    /* JADX INFO: renamed from: v */
    public int f202215v;

    /* JADX INFO: renamed from: w */
    public boolean f202216w;

    public rs70(int i, Object obj, int i2, int i3, ko70 ko70Var, int i4, int i5, List list, long j, Object obj2, fv70 fv70Var, long j2, int i6, int i7) {
        this.f202194a = i;
        this.f202195b = obj;
        this.f202196c = i2;
        this.f202197d = ko70Var;
        this.f202198e = i4;
        this.f202199f = i5;
        this.f202200g = list;
        this.f202201h = j;
        this.f202202i = obj2;
        this.f202203j = fv70Var;
        this.f202204k = j2;
        this.f202205l = i6;
        this.f202206m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((t5o0) list.get(i8)).f217323b);
        }
        this.f202207n = iMax;
        int i9 = i3 + iMax;
        this.f202208o = i9 >= 0 ? i9 : 0;
        this.f202212s = (((long) this.f202196c) << 32) | (((long) iMax) & 4294967295L);
        this.f202213t = 0L;
        this.f202214u = -1;
        this.f202215v = -1;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: a */
    public final void mo62902a(int i, int i2, int i3, int i4) {
        m76313m(i, i2, i3, i4, -1, -1);
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: b */
    public final int mo62903b() {
        return this.f202200g.size();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: c */
    public final boolean mo62904c() {
        return this.f202216w;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: d */
    public final int mo62905d() {
        return this.f202206m;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: e */
    public final long mo62906e() {
        return this.f202204k;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: f */
    public final boolean mo62907f() {
        return true;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: g */
    public final int mo62908g() {
        return this.f202208o;
    }

    @Override // p204p.mv70
    public final int getIndex() {
        return this.f202194a;
    }

    @Override // p204p.mv70
    public final Object getKey() {
        return this.f202195b;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: h */
    public final Object mo62909h(int i) {
        return ((t5o0) this.f202200g.get(i)).mo30025g();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: i */
    public final void mo62910i() {
        this.f202216w = true;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: j */
    public final long mo62911j(int i) {
        return this.f202213t;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: k */
    public final int mo62912k() {
        return this.f202205l;
    }

    /* JADX INFO: renamed from: l */
    public final void m76312l(s5o0 s5o0Var, boolean z) {
        rx10 rx10Var;
        if (this.f202209p == Integer.MIN_VALUE) {
            pt40.m70891a("position() should be called first");
        }
        List list = this.f202200g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t5o0 t5o0Var = (t5o0) list.get(i);
            int i2 = this.f202210q - t5o0Var.f217323b;
            int i3 = this.f202211r;
            long j = this.f202213t;
            zu70 zu70VarM42766a = this.f202203j.m42766a(i, this.f202195b);
            if (zu70VarM42766a != null) {
                if (z) {
                    zu70VarM42766a.f286382r = j;
                } else {
                    long jM92731d = y350.m92731d(!y350.m92729b(zu70VarM42766a.f286382r, zu70.f286363s) ? zu70VarM42766a.f286382r : j, ((y350) zu70VarM42766a.f286381q.getValue()).f268755a);
                    int i4 = (int) (j & 4294967295L);
                    if ((i4 <= i2 && ((int) (jM92731d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jM92731d & 4294967295L)) >= i3)) {
                        zu70VarM42766a.m97005b();
                    }
                    j = jM92731d;
                }
                rx10Var = zu70VarM42766a.f286378n;
            } else {
                rx10Var = null;
            }
            long jM92731d2 = y350.m92731d(j, this.f202201h);
            if (!z && zu70VarM42766a != null) {
                zu70VarM42766a.f286377m = jM92731d2;
            }
            if (rx10Var != null) {
                s5o0Var.getClass();
                s5o0.m77284a(s5o0Var, t5o0Var);
                t5o0Var.mo30019b0(y350.m92731d(jM92731d2, t5o0Var.f217326e), 0.0f, rx10Var);
            } else {
                s5o0.m77292s(s5o0Var, t5o0Var, jM92731d2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m76313m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f202209p = i4;
        if (this.f202197d == ko70.f124557b) {
            i2 = (i3 - i2) - this.f202196c;
        }
        this.f202213t = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.f202214u = i5;
        this.f202215v = i6;
        this.f202210q = -this.f202198e;
        this.f202211r = i4 + this.f202199f;
    }
}
