package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class my70 implements mv70 {

    /* JADX INFO: renamed from: a */
    public final int f148333a;

    /* JADX INFO: renamed from: b */
    public final Object f148334b;

    /* JADX INFO: renamed from: c */
    public final List f148335c;

    /* JADX INFO: renamed from: d */
    public final boolean f148336d;

    /* JADX INFO: renamed from: e */
    public final int f148337e;

    /* JADX INFO: renamed from: f */
    public final int f148338f;

    /* JADX INFO: renamed from: g */
    public final int f148339g;

    /* JADX INFO: renamed from: h */
    public final int f148340h;

    /* JADX INFO: renamed from: i */
    public final Object f148341i;

    /* JADX INFO: renamed from: j */
    public final fv70 f148342j;

    /* JADX INFO: renamed from: k */
    public final long f148343k;

    /* JADX INFO: renamed from: l */
    public boolean f148344l = true;

    /* JADX INFO: renamed from: m */
    public final int f148345m;

    /* JADX INFO: renamed from: n */
    public final int f148346n;

    /* JADX INFO: renamed from: o */
    public int f148347o;

    /* JADX INFO: renamed from: p */
    public int f148348p;

    /* JADX INFO: renamed from: q */
    public int f148349q;

    /* JADX INFO: renamed from: r */
    public boolean f148350r;

    /* JADX INFO: renamed from: s */
    public final long f148351s;

    /* JADX INFO: renamed from: t */
    public long f148352t;

    public my70(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, fv70 fv70Var, long j) {
        int i7;
        long j2;
        long j3;
        this.f148333a = i;
        this.f148334b = obj;
        this.f148335c = list;
        this.f148336d = z;
        this.f148337e = i3;
        this.f148338f = i4;
        this.f148339g = i5;
        this.f148340h = i6;
        this.f148341i = obj2;
        this.f148342j = fv70Var;
        this.f148343k = j;
        int i8 = 1;
        int i9 = 0;
        if (!list.isEmpty()) {
            t5o0 t5o0Var = (t5o0) list.get(0);
            i7 = z ? t5o0Var.f217323b : t5o0Var.f217322a;
            int iM46714K = h6f.m46714K(list);
            if (1 <= iM46714K) {
                int i10 = 1;
                while (true) {
                    t5o0 t5o0Var2 = (t5o0) list.get(i10);
                    int i11 = this.f148336d ? t5o0Var2.f217323b : t5o0Var2.f217322a;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == iM46714K) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.f148345m = i7;
        int i12 = i7 + i2;
        this.f148346n = i12 < 0 ? 0 : i12;
        List list2 = this.f148335c;
        if (!list2.isEmpty()) {
            t5o0 t5o0Var3 = (t5o0) list2.get(0);
            int i13 = this.f148336d ? t5o0Var3.f217322a : t5o0Var3.f217323b;
            int iM46714K2 = h6f.m46714K(list2);
            if (1 <= iM46714K2) {
                while (true) {
                    t5o0 t5o0Var4 = (t5o0) list2.get(i8);
                    int i14 = this.f148336d ? t5o0Var4.f217322a : t5o0Var4.f217323b;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == iM46714K2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.f148347o = Integer.MIN_VALUE;
        if (this.f148336d) {
            j2 = ((long) i9) << 32;
            j3 = this.f148345m;
        } else {
            j2 = ((long) this.f148345m) << 32;
            j3 = i9;
        }
        this.f148351s = (j3 & 4294967295L) | j2;
        this.f148352t = 0L;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: a */
    public final void mo62902a(int i, int i2, int i3, int i4) {
        if (this.f148336d) {
            i3 = i4;
        }
        m63157n(i, i2, i3);
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: b */
    public final int mo62903b() {
        return this.f148335c.size();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: c */
    public final boolean mo62904c() {
        return this.f148350r;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: d */
    public final int mo62905d() {
        return this.f148338f;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: e */
    public final long mo62906e() {
        return this.f148343k;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: f */
    public final boolean mo62907f() {
        return this.f148336d;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: g */
    public final int mo62908g() {
        return this.f148346n;
    }

    @Override // p204p.mv70
    public final int getIndex() {
        return this.f148333a;
    }

    @Override // p204p.mv70
    public final Object getKey() {
        return this.f148334b;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: h */
    public final Object mo62909h(int i) {
        return ((t5o0) this.f148335c.get(i)).mo30025g();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: i */
    public final void mo62910i() {
        this.f148350r = true;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: j */
    public final long mo62911j(int i) {
        return this.f148352t;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: k */
    public final int mo62912k() {
        return this.f148337e;
    }

    /* JADX INFO: renamed from: l */
    public final int m63155l(long j) {
        return (int) (this.f148336d ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: m */
    public final int m63156m() {
        return (int) (!this.f148336d ? this.f148352t >> 32 : this.f148352t & 4294967295L);
    }

    /* JADX INFO: renamed from: n */
    public final void m63157n(int i, int i2, int i3) {
        long j;
        this.f148347o = i3;
        this.f148348p = -this.f148339g;
        this.f148349q = i3 + this.f148340h;
        if (this.f148336d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.f148352t = j;
    }
}
