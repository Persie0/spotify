package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tw70 implements mv70 {

    /* JADX INFO: renamed from: a */
    public final int f224325a;

    /* JADX INFO: renamed from: b */
    public final List f224326b;

    /* JADX INFO: renamed from: c */
    public final boolean f224327c;

    /* JADX INFO: renamed from: d */
    public final jb3 f224328d;

    /* JADX INFO: renamed from: e */
    public final vb9 f224329e;

    /* JADX INFO: renamed from: f */
    public final ko70 f224330f;

    /* JADX INFO: renamed from: g */
    public final boolean f224331g;

    /* JADX INFO: renamed from: h */
    public final int f224332h;

    /* JADX INFO: renamed from: i */
    public final int f224333i;

    /* JADX INFO: renamed from: j */
    public final int f224334j;

    /* JADX INFO: renamed from: k */
    public final long f224335k;

    /* JADX INFO: renamed from: l */
    public final Object f224336l;

    /* JADX INFO: renamed from: m */
    public final Object f224337m;

    /* JADX INFO: renamed from: n */
    public final fv70 f224338n;

    /* JADX INFO: renamed from: o */
    public final long f224339o;

    /* JADX INFO: renamed from: p */
    public int f224340p;

    /* JADX INFO: renamed from: q */
    public final int f224341q;

    /* JADX INFO: renamed from: r */
    public final int f224342r;

    /* JADX INFO: renamed from: s */
    public final int f224343s;

    /* JADX INFO: renamed from: t */
    public boolean f224344t;

    /* JADX INFO: renamed from: u */
    public int f224345u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public int f224346v;

    /* JADX INFO: renamed from: w */
    public int f224347w;

    /* JADX INFO: renamed from: x */
    public final int[] f224348x;

    public tw70(int i, List list, boolean z, jb3 jb3Var, vb9 vb9Var, ko70 ko70Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, fv70 fv70Var, long j2) {
        this.f224325a = i;
        this.f224326b = list;
        this.f224327c = z;
        this.f224328d = jb3Var;
        this.f224329e = vb9Var;
        this.f224330f = ko70Var;
        this.f224331g = z2;
        this.f224332h = i2;
        this.f224333i = i3;
        this.f224334j = i4;
        this.f224335k = j;
        this.f224336l = obj;
        this.f224337m = obj2;
        this.f224338n = fv70Var;
        this.f224339o = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            t5o0 t5o0Var = (t5o0) list.get(i6);
            boolean z3 = this.f224327c;
            i5 += z3 ? t5o0Var.f217323b : t5o0Var.f217322a;
            iMax = Math.max(iMax, !z3 ? t5o0Var.f217323b : t5o0Var.f217322a);
        }
        this.f224341q = i5;
        int i7 = i5 + this.f224334j;
        this.f224342r = i7 >= 0 ? i7 : 0;
        this.f224343s = iMax;
        this.f224348x = new int[this.f224326b.size() * 2];
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: a */
    public final void mo62902a(int i, int i2, int i3, int i4) {
        m81649n(i, i3, i4);
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: b */
    public final int mo62903b() {
        return this.f224326b.size();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: c */
    public final boolean mo62904c() {
        return this.f224344t;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: d */
    public final int mo62905d() {
        return 1;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: e */
    public final long mo62906e() {
        return this.f224339o;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: f */
    public final boolean mo62907f() {
        return this.f224327c;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: g */
    public final int mo62908g() {
        return this.f224342r;
    }

    @Override // p204p.mv70
    public final int getIndex() {
        return this.f224325a;
    }

    @Override // p204p.mv70
    public final Object getKey() {
        return this.f224336l;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: h */
    public final Object mo62909h(int i) {
        return ((t5o0) this.f224326b.get(i)).mo30025g();
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: i */
    public final void mo62910i() {
        this.f224344t = true;
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: j */
    public final long mo62911j(int i) {
        if (i == 0 && this.f224326b.size() == 0) {
            if (this.f224327c) {
                return (4294967295L & ((long) this.f224340p)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) this.f224340p) << 32);
        }
        int i2 = i * 2;
        int[] iArr = this.f224348x;
        int i3 = iArr[i2];
        return (4294967295L & ((long) iArr[i2 + 1])) | (((long) i3) << 32);
    }

    @Override // p204p.mv70
    /* JADX INFO: renamed from: k */
    public final int mo62912k() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final int m81647l(long j) {
        return (int) (this.f224327c ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: m */
    public final void m81648m(s5o0 s5o0Var, boolean z) {
        rx10 rx10Var;
        if (this.f224345u == Integer.MIN_VALUE) {
            pt40.m70891a("position() should be called first");
        }
        List list = this.f224326b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t5o0 t5o0Var = (t5o0) list.get(i);
            int i2 = this.f224346v;
            boolean z2 = this.f224327c;
            int i3 = i2 - (z2 ? t5o0Var.f217323b : t5o0Var.f217322a);
            int i4 = this.f224347w;
            long jMo62911j = mo62911j(i);
            zu70 zu70VarM42766a = this.f224338n.m42766a(i, this.f224336l);
            if (zu70VarM42766a != null) {
                if (z) {
                    zu70VarM42766a.f286382r = jMo62911j;
                } else {
                    long j = zu70VarM42766a.f286382r;
                    int i5 = zu70.f286364t;
                    fzg1.m43211n();
                    if (!y350.m92729b(j, zu70.f286363s)) {
                        jMo62911j = zu70VarM42766a.f286382r;
                    }
                    long jM92731d = y350.m92731d(jMo62911j, ((y350) zu70VarM42766a.f286381q.getValue()).f268755a);
                    if ((m81647l(jMo62911j) <= i3 && m81647l(jM92731d) <= i3) || (m81647l(jMo62911j) >= i4 && m81647l(jM92731d) >= i4)) {
                        zu70VarM42766a.m97005b();
                    }
                    jMo62911j = jM92731d;
                }
                rx10Var = zu70VarM42766a.f286378n;
            } else {
                rx10Var = null;
            }
            if (this.f224331g) {
                jMo62911j = z2 ? (((long) ((int) (jMo62911j >> 32))) << 32) | (4294967295L & ((long) ((this.f224345u - ((int) (jMo62911j & 4294967295L))) - (z2 ? t5o0Var.f217323b : t5o0Var.f217322a)))) : (((long) ((int) (jMo62911j & 4294967295L))) & 4294967295L) | (((long) ((this.f224345u - ((int) (jMo62911j >> 32))) - (z2 ? t5o0Var.f217323b : t5o0Var.f217322a))) << 32);
            }
            long jM92731d2 = y350.m92731d(jMo62911j, this.f224335k);
            if (!z && zu70VarM42766a != null) {
                zu70VarM42766a.f286377m = jM92731d2;
            }
            if (z2) {
                if (rx10Var != null) {
                    s5o0Var.getClass();
                    s5o0.m77284a(s5o0Var, t5o0Var);
                    t5o0Var.mo30019b0(y350.m92731d(jM92731d2, t5o0Var.f217326e), 0.0f, rx10Var);
                } else {
                    s5o0.m77292s(s5o0Var, t5o0Var, jM92731d2);
                }
            } else if (rx10Var != null) {
                s5o0.m77290o(s5o0Var, t5o0Var, jM92731d2, rx10Var);
            } else {
                s5o0.m77289m(s5o0Var, t5o0Var, jM92731d2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m81649n(int i, int i2, int i3) {
        int i4;
        this.f224340p = i;
        boolean z = this.f224327c;
        this.f224345u = z ? i3 : i2;
        List list = this.f224326b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            t5o0 t5o0Var = (t5o0) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f224348x;
            if (z) {
                jb3 jb3Var = this.f224328d;
                if (jb3Var == null) {
                    throw mt60.m62801h("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = jb3Var.mo52864a(t5o0Var.f217322a, i2, this.f224330f);
                iArr[i6 + 1] = i;
                i4 = t5o0Var.f217323b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                vb9 vb9Var = this.f224329e;
                if (vb9Var == null) {
                    throw mt60.m62801h("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = vb9Var.m85124a(t5o0Var.f217323b, i3);
                i4 = t5o0Var.f217322a;
            }
            i += i4;
        }
        this.f224346v = -this.f224332h;
        this.f224347w = this.f224345u + this.f224333i;
    }
}
