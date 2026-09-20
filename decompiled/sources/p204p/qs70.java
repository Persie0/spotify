package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qs70 implements n6d0 {

    /* JADX INFO: renamed from: a */
    public final ss70 f192012a;

    /* JADX INFO: renamed from: b */
    public final int f192013b;

    /* JADX INFO: renamed from: c */
    public final boolean f192014c;

    /* JADX INFO: renamed from: d */
    public final float f192015d;

    /* JADX INFO: renamed from: e */
    public final n6d0 f192016e;

    /* JADX INFO: renamed from: f */
    public final float f192017f;

    /* JADX INFO: renamed from: g */
    public final boolean f192018g;

    /* JADX INFO: renamed from: h */
    public final xuk f192019h;

    /* JADX INFO: renamed from: i */
    public final yqq f192020i;

    /* JADX INFO: renamed from: j */
    public final int f192021j;

    /* JADX INFO: renamed from: k */
    public final gh00 f192022k;

    /* JADX INFO: renamed from: l */
    public final gh00 f192023l;

    /* JADX INFO: renamed from: m */
    public final Object f192024m;

    /* JADX INFO: renamed from: n */
    public final int f192025n;

    /* JADX INFO: renamed from: o */
    public final int f192026o;

    /* JADX INFO: renamed from: p */
    public final int f192027p;

    /* JADX INFO: renamed from: q */
    public final vvl0 f192028q;

    /* JADX INFO: renamed from: r */
    public final int f192029r;

    /* JADX INFO: renamed from: s */
    public final int f192030s;

    public qs70(ss70 ss70Var, int i, boolean z, float f, n6d0 n6d0Var, float f2, boolean z2, xuk xukVar, yqq yqqVar, int i2, gh00 gh00Var, gh00 gh00Var2, List list, int i3, int i4, int i5, vvl0 vvl0Var, int i6, int i7) {
        this.f192012a = ss70Var;
        this.f192013b = i;
        this.f192014c = z;
        this.f192015d = f;
        this.f192016e = n6d0Var;
        this.f192017f = f2;
        this.f192018g = z2;
        this.f192019h = xukVar;
        this.f192020i = yqqVar;
        this.f192021j = i2;
        this.f192022k = gh00Var;
        this.f192023l = gh00Var2;
        this.f192024m = list;
        this.f192025n = i3;
        this.f192026o = i4;
        this.f192027p = i5;
        this.f192028q = vvl0Var;
        this.f192029r = i6;
        this.f192030s = i7;
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: a */
    public final void mo27119a() {
        this.f192016e.mo27119a();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: b */
    public final int mo27120b() {
        return this.f192016e.mo27120b();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: c */
    public final Map mo27121c() {
        return this.f192016e.mo27121c();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: d */
    public final int mo27122d() {
        return this.f192016e.mo27122d();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: e */
    public final gh00 mo31376e() {
        return this.f192016e.mo31376e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: f */
    public final qs70 m73679f(int i, boolean z) {
        ss70 ss70Var;
        ?? r14;
        int i2;
        long j;
        if (this.f192018g) {
            return null;
        }
        ?? r2 = this.f192024m;
        if (r2.isEmpty() || (ss70Var = this.f192012a) == null) {
            return null;
        }
        int i3 = ss70Var.f213515g;
        int i4 = this.f192013b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        rs70 rs70Var = (rs70) g6f.m43741q0(r2);
        rs70 rs70Var2 = (rs70) g6f.m43687A0(r2);
        if (rs70Var.f202216w || rs70Var2.f202216w) {
            return null;
        }
        int i5 = this.f192026o;
        int i6 = this.f192025n;
        vvl0 vvl0Var = this.f192028q;
        if (i < 0) {
            if (Math.min((syg1.m79694m(rs70Var, vvl0Var) + rs70Var.f202208o) - i6, (syg1.m79694m(rs70Var2, vvl0Var) + rs70Var2.f202208o) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - syg1.m79694m(rs70Var, vvl0Var), i5 - syg1.m79694m(rs70Var2, vvl0Var)) <= i) {
            return null;
        }
        int size = r2.size();
        int i7 = 0;
        ?? r3 = r2;
        while (i7 < size) {
            rs70 rs70Var3 = (rs70) r3.get(i7);
            rs70Var3.getClass();
            if (rs70Var3.f202216w) {
                r14 = r3;
                i2 = size;
            } else {
                long j2 = rs70Var3.f202213t;
                long j3 = 4294967295L;
                rs70Var3.f202213t = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = rs70Var3.f202200g.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        zu70 zu70VarM42766a = rs70Var3.f202203j.m42766a(i8, rs70Var3.f202195b);
                        if (zu70VarM42766a != null) {
                            r3 = r3;
                            long j4 = zu70VarM42766a.f286376l;
                            j = j3;
                            zu70VarM42766a.f286376l = (((long) (((int) (j4 & j)) + i)) & j) | (((long) ((int) (j4 >> 32))) << 32);
                        } else {
                            r3 = r3;
                            j = j3;
                        }
                        i8++;
                        r3 = r3;
                        j3 = j;
                        size = size;
                    }
                    r3 = r3;
                }
                r14 = r3;
                i2 = size;
            }
            i7++;
            i4 = i4;
            r3 = r14;
            size = i2;
        }
        return new qs70(this.f192012a, i4, this.f192014c || i > 0, i, this.f192016e, this.f192017f, this.f192018g, this.f192019h, this.f192020i, this.f192021j, this.f192022k, this.f192023l, r3, this.f192025n, this.f192026o, this.f192027p, vvl0Var, this.f192029r, this.f192030s);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73680g() {
        ss70 ss70Var = this.f192012a;
        return ((ss70Var != null ? ss70Var.f213509a : 0) == 0 && this.f192013b == 0) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m73681h() {
        return this.f192014c;
    }

    /* JADX INFO: renamed from: i */
    public final float m73682i() {
        return this.f192015d;
    }

    /* JADX INFO: renamed from: j */
    public final xuk m73683j() {
        return this.f192019h;
    }

    /* JADX INFO: renamed from: k */
    public final yqq m73684k() {
        return this.f192020i;
    }

    /* JADX INFO: renamed from: l */
    public final ss70 m73685l() {
        return this.f192012a;
    }

    /* JADX INFO: renamed from: m */
    public final int m73686m() {
        return this.f192013b;
    }

    /* JADX INFO: renamed from: n */
    public final float m73687n() {
        return this.f192017f;
    }

    /* JADX INFO: renamed from: o */
    public final int m73688o() {
        return this.f192021j;
    }

    /* JADX INFO: renamed from: p */
    public final long m73689p() {
        n6d0 n6d0Var = this.f192016e;
        return (((long) n6d0Var.mo27122d()) << 32) | (((long) n6d0Var.mo27120b()) & 4294967295L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: q */
    public final List m73690q() {
        return this.f192024m;
    }
}
