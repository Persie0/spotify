package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fyf implements th00, vh00, xh00, zh00, bi00, ci00, di00, ei00, fh00, hh00, jh00, kh00, lh00, mh00, nh00, oh00, ph00, rh00, sh00 {

    /* JADX INFO: renamed from: a */
    public final int f74719a;

    /* JADX INFO: renamed from: b */
    public final boolean f74720b;

    /* JADX INFO: renamed from: c */
    public Object f74721c;

    /* JADX INFO: renamed from: d */
    public pgv0 f74722d;

    /* JADX INFO: renamed from: e */
    public ArrayList f74723e;

    public fyf(Object obj, boolean z, int i) {
        this.f74719a = i;
        this.f74720b = z;
        this.f74721c = obj;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final /* bridge */ /* synthetic */ Object mo24510D0(Object obj, Object obj2, Object obj3) {
        return m43072n(obj, (xq00) obj2, ((Number) obj3).intValue());
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final /* bridge */ /* synthetic */ Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        return m43071l(obj, obj2, (xq00) obj3, ((Number) obj4).intValue());
    }

    @Override // p204p.di00
    /* JADX INFO: renamed from: N */
    public final /* bridge */ /* synthetic */ Object mo36068N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m43067g(obj, obj2, obj3, obj4, obj5, obj6, (xq00) obj7, ((Number) obj8).intValue());
    }

    /* JADX INFO: renamed from: a */
    public final Object m43064a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = i | (xq00Var.m91766g(this) ? rkk.m75767s(0) : rkk.m75743A(0));
        Object obj = this.f74721c;
        zn91.m96579u(2, obj);
        Object objInvoke = ((th00) obj).invoke(xq00Var, Integer.valueOf(iM75767s));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kb7(this);
        }
        return objInvoke;
    }

    @Override // p204p.bi00
    /* JADX INFO: renamed from: c0 */
    public final /* bridge */ /* synthetic */ Object mo27353c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m43069j(obj, obj2, obj3, obj4, (xq00) obj5, ((Number) obj6).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final Object m43065e(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, xq00 xq00Var, final int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(9) : rkk.m75743A(9);
        Object obj10 = this.f74721c;
        zn91.m96579u(11, obj10);
        Object objMo38486p = ((hh00) obj10).mo38486p(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, xq00Var, Integer.valueOf(i | iM75767s));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.cyf
                @Override // p204p.th00
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).intValue();
                    this.f43254a.m43065e(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (xq00) obj11, fyg1.m43076B(i) | 1);
                    return w2a1.f247311a;
                }
            };
        }
        return objMo38486p;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final /* bridge */ /* synthetic */ Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m43070k(obj, obj2, obj3, (xq00) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: f */
    public final Object m43066f(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, xq00 xq00Var, final int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(8) : rkk.m75743A(8);
        Object obj9 = this.f74721c;
        zn91.m96579u(10, obj9);
        Object objMo38484h1 = ((fh00) obj9).mo38484h1(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, xq00Var, Integer.valueOf(i | iM75767s));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.eyf
                @Override // p204p.th00
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).intValue();
                    this.f64072a.m43066f(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (xq00) obj10, fyg1.m43076B(i) | 1);
                    return w2a1.f247311a;
                }
            };
        }
        return objMo38484h1;
    }

    /* JADX INFO: renamed from: g */
    public final Object m43067g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(6) : rkk.m75743A(6);
        Object obj7 = this.f74721c;
        zn91.m96579u(8, obj7);
        Object objMo36068N = ((di00) obj7).mo36068N(obj, obj2, obj3, obj4, obj5, obj6, xq00Var, Integer.valueOf(i | iM75767s));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dyf(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return objMo36068N;
    }

    @Override // p204p.fh00
    /* JADX INFO: renamed from: h1 */
    public final /* bridge */ /* synthetic */ Object mo38484h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return m43066f(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (xq00) obj9, ((Number) obj10).intValue());
    }

    /* JADX INFO: renamed from: i */
    public final Object m43068i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(5) : rkk.m75743A(5);
        Object obj6 = this.f74721c;
        zn91.m96579u(7, obj6);
        Object objMo32824n0 = ((ci00) obj6).mo32824n0(obj, obj2, obj3, obj4, obj5, xq00Var, Integer.valueOf(i | iM75767s));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new byf(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objMo32824n0;
    }

    @Override // p204p.th00
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m43064a(((Number) obj2).intValue(), (xq00) obj);
    }

    /* JADX INFO: renamed from: j */
    public final Object m43069j(Object obj, Object obj2, Object obj3, Object obj4, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(4) : rkk.m75743A(4);
        Object obj5 = this.f74721c;
        zn91.m96579u(6, obj5);
        Object objMo27353c0 = ((bi00) obj5).mo27353c0(obj, obj2, obj3, obj4, xq00Var, Integer.valueOf(iM75767s | i));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new n39(this, obj, obj2, obj3, obj4, i);
        }
        return objMo27353c0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m43070k(Object obj, Object obj2, Object obj3, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(3) : rkk.m75743A(3);
        Object obj4 = this.f74721c;
        zn91.m96579u(5, obj4);
        Object objMo25195e1 = ((zh00) obj4).mo25195e1(obj, obj2, obj3, xq00Var, Integer.valueOf(iM75767s | i));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y73(this, obj, obj2, obj3, i);
        }
        return objMo25195e1;
    }

    /* JADX INFO: renamed from: l */
    public final Object m43071l(Object obj, Object obj2, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(2) : rkk.m75743A(2);
        Object obj3 = this.f74721c;
        zn91.m96579u(4, obj3);
        Object objMo24818M = ((xh00) obj3).mo24818M(obj, obj2, xq00Var, Integer.valueOf(iM75767s | i));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(this, obj, obj2, i);
        }
        return objMo24818M;
    }

    /* JADX INFO: renamed from: n */
    public final Object m43072n(Object obj, xq00 xq00Var, int i) {
        xq00Var.m91775k0(this.f74719a);
        m43073o(xq00Var);
        int iM75767s = xq00Var.m91766g(this) ? rkk.m75767s(1) : rkk.m75743A(1);
        Object obj2 = this.f74721c;
        zn91.m96579u(3, obj2);
        Object objMo24510D0 = ((vh00) obj2).mo24510D0(obj, xq00Var, Integer.valueOf(iM75767s | i));
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new l15(this, obj, i, 2);
        }
        return objMo24510D0;
    }

    @Override // p204p.ci00
    /* JADX INFO: renamed from: n0 */
    public final /* bridge */ /* synthetic */ Object mo32824n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m43068i(obj, obj2, obj3, obj4, obj5, (xq00) obj6, ((Number) obj7).intValue());
    }

    /* JADX INFO: renamed from: o */
    public final void m43073o(xq00 xq00Var) {
        pgv0 pgv0VarM91734D;
        if (!this.f74720b || (pgv0VarM91734D = xq00Var.m91734D()) == null) {
            return;
        }
        xq00Var.getClass();
        pgv0VarM91734D.m69930g();
        if (rkk.m75773y(this.f74722d, pgv0VarM91734D)) {
            this.f74722d = pgv0VarM91734D;
            return;
        }
        ArrayList arrayList = this.f74723e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f74723e = arrayList2;
            arrayList2.add(pgv0VarM91734D);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (rkk.m75773y((pgv0) arrayList.get(i), pgv0VarM91734D)) {
                arrayList.set(i, pgv0VarM91734D);
                return;
            }
        }
        arrayList.add(pgv0VarM91734D);
    }

    @Override // p204p.hh00
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ Object mo38486p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return m43065e(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (xq00) obj10, ((Number) obj11).intValue());
    }

    /* JADX INFO: renamed from: q */
    public final void m43074q(ai00 ai00Var) {
        if (wj50.m88271j(this.f74721c, ai00Var)) {
            return;
        }
        boolean z = this.f74721c == null;
        this.f74721c = ai00Var;
        if (z || !this.f74720b) {
            return;
        }
        pgv0 pgv0Var = this.f74722d;
        if (pgv0Var != null) {
            pgv0Var.m69925b();
            this.f74722d = null;
        }
        ArrayList arrayList = this.f74723e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pgv0) arrayList.get(i)).m69925b();
            }
            arrayList.clear();
        }
    }
}
