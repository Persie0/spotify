package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.C1398e;

/* JADX INFO: loaded from: classes.dex */
public final class hxt {

    /* JADX INFO: renamed from: w */
    public static final up60 f96286w;

    /* JADX INFO: renamed from: x */
    public static final up60 f96287x;

    /* JADX INFO: renamed from: a */
    public final qy8 f96288a;

    /* JADX INFO: renamed from: b */
    public gw41 f96289b;

    /* JADX INFO: renamed from: c */
    public final Object f96290c;

    /* JADX INFO: renamed from: d */
    public final fpc1 f96291d;

    /* JADX INFO: renamed from: e */
    public lt60 f96292e;

    /* JADX INFO: renamed from: f */
    public Object f96293f;

    /* JADX INFO: renamed from: g */
    public final gh00 f96294g;

    /* JADX INFO: renamed from: h */
    public final loi0 f96295h;

    /* JADX INFO: renamed from: i */
    public final bvt f96296i;

    /* JADX INFO: renamed from: j */
    public final owt f96297j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f96298k;

    /* JADX INFO: renamed from: l */
    public Object f96299l;

    /* JADX INFO: renamed from: m */
    public Object f96300m;

    /* JADX INFO: renamed from: n */
    public boolean f96301n;

    /* JADX INFO: renamed from: o */
    public boolean f96302o;

    /* JADX INFO: renamed from: p */
    public boolean f96303p;

    /* JADX INFO: renamed from: q */
    public boolean f96304q;

    /* JADX INFO: renamed from: r */
    public hc80 f96305r;

    /* JADX INFO: renamed from: s */
    public final fxt f96306s;

    /* JADX INFO: renamed from: t */
    public final View f96307t;

    /* JADX INFO: renamed from: u */
    public u4l0 f96308u;

    /* JADX INFO: renamed from: v */
    public eh00 f96309v;

    static {
        new ia7(9);
        jqv0 jqv0Var = qpv0.f191387a;
        f96286w = jqv0Var.mo54112b(axt.class);
        f96287x = jqv0Var.mo54112b(bxt.class);
    }

    public hxt(Context context, ViewGroup viewGroup, qy8 qy8Var, gw41 gw41Var, Object obj, lvt lvtVar, rb20 rb20Var, int i) throws Throwable {
        rb20 rb20Var2;
        Object obj2 = (i & 16) != 0 ? null : obj;
        fpc1 fpc1Var = new fpc1();
        if ((i & 128) != 0) {
            n5q n5qVar = xsr.f265651a;
            rb20Var2 = pvb0.f181680a;
        } else {
            rb20Var2 = rb20Var;
        }
        this.f96288a = qy8Var;
        this.f96289b = gw41Var;
        this.f96290c = obj2;
        this.f96291d = fpc1Var;
        this.f96293f = obj2;
        this.f96294g = m49043e(qy8Var);
        loi0 loi0Var = new loi0();
        this.f96295h = loi0Var;
        System.identityHashCode(this);
        int i2 = 3;
        this.f96296i = new bvt(qy8Var, rb20Var2, new gxt(this, 0), new i7p(this, 1), new i7p(this, 2), new i7p(this, i2), new i7p(this, 4));
        try {
            owt owtVarMo39576a = qy8Var.mo24632c().mo39576a(context, viewGroup, new rwt(loi0Var), new j20(this, 22));
            this.f96297j = owtVarMo39576a;
            this.f96298k = new ArrayList();
            fxt fxtVar = new fxt(this);
            this.f96306s = fxtVar;
            View view = owtVarMo39576a.getView();
            joc1.m53878e(view, fxtVar);
            view.addOnAttachStateChangeListener(new ay1(this, 9));
            p3h1.m69034t(lvtVar, view, new mqr(i2, view, this));
            this.f96307t = view;
            this.f96309v = v8s.f238656R0;
        } catch (Exception e) {
            m49042c(this, e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m49040a(View view, hxt hxtVar) {
        Bundle bundleMo31970d;
        SparseArray<Parcelable> sparseParcelableArray;
        u4l0 u4l0Var;
        g2q g2qVarM75604G;
        qy8 qy8Var = hxtVar.f96288a;
        if (hxtVar.f96301n) {
            return;
        }
        hxtVar.f96301n = true;
        qy8Var.mo29380b();
        hxtVar.f96289b.mo31974h();
        hxtVar.f96297j.getView();
        if (hxtVar.f96293f == null || !((u4l0Var = hxtVar.f96308u) == null || ((m12) u4l0Var.f226773c).m60496J())) {
            hxtVar.m49047h();
        } else {
            paq paqVarMo31977k = hxtVar.f96289b.mo31977k();
            if (paqVarMo31977k != null) {
                String strMo31974h = hxtVar.f96289b.mo31974h();
                Object obj = hxtVar.f96293f;
                wj50.m88279p(obj);
                hxtVar.f96289b = paqVarMo31977k.m69495a(strMo31974h, obj, qy8Var.getBehavior().mo42334c(), new i7p(hxtVar, 5));
            }
            Object obj2 = hxtVar.f96293f;
            wj50.m88279p(obj2);
            u4l0 u4l0VarM41823h = fjf1.m41823h(qy8Var, obj2, hxtVar.f96289b, new vas(hxtVar, 5));
            hxtVar.m49049j();
            hxtVar.f96308u = u4l0VarM41823h;
            joc1.m53878e(view, hxtVar.f96306s);
            hxtVar.m49047h();
            b250 b250VarM30652c = hxtVar.f96296i.m30652c();
            if (b250VarM30652c != null && (g2qVarM75604G = riw0.m75604G(b250VarM30652c)) != null) {
                g2qVarM75604G.m43410o(qy8Var.mo29380b(), hxtVar.f96289b.mo31974h());
            }
        }
        View view2 = hxtVar.f96307t;
        if (view2.isSaveEnabled() && (bundleMo31970d = hxtVar.f96289b.mo31970d()) != null && (sparseParcelableArray = bundleMo31970d.getSparseParcelableArray("view_state")) != null) {
            view2.restoreHierarchyState(sparseParcelableArray);
        }
        hxtVar.m49048i(view);
    }

    /* JADX INFO: renamed from: b */
    public static final void m49041b(hxt hxtVar, u4l0 u4l0Var) {
        m12 m12Var = (m12) u4l0Var.f226773c;
        if (m12Var.m60496J()) {
            zuj0.m97049l(qpv0.f191387a.mo54112b(((qy8) u4l0Var.f226772b).getClass()));
            throw null;
        }
        hxtVar.f96302o = true;
        hxtVar.f96298k.add(m12Var.m60504S(new ziq(hxtVar, u4l0Var, u4l0Var, 13)));
    }

    /* JADX INFO: renamed from: c */
    public static void m49042c(hxt hxtVar, Exception exc) throws Throwable {
        Object obj = hxtVar.f96293f;
        u4l0 u4l0Var = hxtVar.f96308u;
        zuj0.m97047j(exc, obj, u4l0Var != null ? ((m12) u4l0Var.f226773c).m60498M() : null, hxtVar.f96288a.mo29380b());
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static gh00 m49043e(qy8 qy8Var) {
        boolean z = qy8Var instanceof bjc0;
        if (!z) {
            return z ? m49043e(((bjc0) qy8Var).f27659a) : awt.f20670N0;
        }
        bjc0 bjc0Var = (bjc0) qy8Var;
        gh00 gh00VarM49043e = m49043e(bjc0Var.f27659a);
        gh00 gh00Var = bjc0Var.f27660b;
        zn91.m96579u(1, gh00Var);
        return new C1398e(9, gh00Var, gh00VarM49043e);
    }

    /* JADX INFO: renamed from: d */
    public final void m49044d(gw41 gw41Var) {
        if (!this.f96301n) {
            this.f96289b = gw41Var;
            return;
        }
        Object obj = this.f96293f;
        wj50.m88279p(obj);
        u4l0 u4l0VarM41823h = fjf1.m41823h(this.f96288a, obj, gw41Var, new vas(this, 4));
        m49049j();
        this.f96308u = u4l0VarM41823h;
        m49047h();
        m49048i(this.f96307t);
    }

    /* JADX INFO: renamed from: f */
    public final void m49045f(Object obj, gw41 gw41Var) {
        m49049j();
        this.f96295h.f135435b.clear();
        this.f96289b = gw41Var;
        m49046g(obj);
        if (this.f96308u == null && this.f96290c == null) {
            return;
        }
        m49044d(gw41Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m49046g(Object obj) {
        u4l0 u4l0Var;
        this.f96293f = obj;
        if (this.f96290c == null && this.f96308u == null && obj != null) {
            m49044d(this.f96289b);
            return;
        }
        u4l0 u4l0Var2 = this.f96308u;
        if (u4l0Var2 == null || ((m12) u4l0Var2.f226773c).m60496J() || obj == null || (u4l0Var = this.f96308u) == null) {
            return;
        }
        ((m12) u4l0Var.f226773c).m60503R(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m49047h() {
        View view = this.f96307t;
        if (!view.isAttachedToWindow()) {
            this.f96304q = true;
            return;
        }
        this.f96304q = false;
        bvt bvtVar = this.f96296i;
        c9k c9kVar = bvtVar.f31437k;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        c9k c9kVarM56661c = kk40.m56661c(bvtVar.f31428b);
        wpi0 wpi0Var = joc1.f114387a;
        bvtVar.f31438l = joc1.m53875b(c9kVarM56661c, view);
        x0h1.m89578u(c9kVarM56661c, null, 0, new t8s(bvtVar, null, 3), 3);
        bvtVar.f31437k = c9kVarM56661c;
    }

    /* JADX INFO: renamed from: i */
    public final void m49048i(View view) {
        if (view.isAttachedToWindow() && this.f96301n && !this.f96302o) {
            if (view.getParent() == null) {
                view.postOnAnimation(new ti3(view, this));
                return;
            }
            bvt bvtVar = this.f96296i;
            bvtVar.f31434h = null;
            bvtVar.f31435i = false;
            u4l0 u4l0Var = this.f96308u;
            if (u4l0Var != null) {
                u4l0 u4l0Var2 = ((m12) u4l0Var.f226773c).m60496J() ? null : u4l0Var;
                if (u4l0Var2 != null) {
                    m49041b(this, u4l0Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m49049j() {
        this.f96291d.m42326b();
        bvt bvtVar = this.f96296i;
        c9k c9kVar = bvtVar.f31437k;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        bvtVar.f31437k = null;
        ArrayList arrayList = this.f96298k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bwr) it.next()).dispose();
        }
        arrayList.clear();
        u4l0 u4l0Var = this.f96308u;
        if (u4l0Var != null) {
            u4l0 u4l0Var2 = ((m12) u4l0Var.f226773c).m60496J() ? null : u4l0Var;
            if (u4l0Var2 != null) {
                ((m12) u4l0Var2.f226773c).m60493G();
            }
        }
        this.f96302o = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m49050k(Object obj, lt60 lt60Var, th00 th00Var) {
        lt60 lt60Var2 = this.f96292e;
        boolean z = false;
        boolean z2 = lt60Var2 == null;
        if (!z2 && !wj50.m88271j(lt60Var2, lt60Var)) {
            z = true;
        }
        this.f96292e = lt60Var;
        if (lt60Var instanceof ht60) {
            m49046g(obj);
            return;
        }
        boolean z3 = lt60Var instanceof it60;
        qy8 qy8Var = this.f96288a;
        if (z3) {
            it60 it60Var = (it60) lt60Var;
            gw41 gw41VarM69495a = it60Var.f105444a.m69495a(it60Var.f105445b, qy8Var.getBehavior().mo42334c(), null, new vvs(this, obj, lt60Var, th00Var, 3));
            if (z || !wj50.m88271j(gw41VarM69495a.mo31974h(), this.f96289b.mo31974h())) {
                m49045f(obj, gw41VarM69495a);
                return;
            } else {
                m49046g(obj);
                return;
            }
        }
        if (!(lt60Var instanceof kt60)) {
            if (!(lt60Var instanceof jt60)) {
                throw new NoWhenBranchMatchedException();
            }
            m49045f(obj, this.f96289b);
        } else if (z2 || z) {
            m49045f(obj, qy8Var.getBehavior().mo42333b(qy8Var.getBehavior().mo42335d(obj), null, String.valueOf(((kt60) lt60Var).f126165a)));
        } else {
            m49046g(obj);
        }
    }
}
