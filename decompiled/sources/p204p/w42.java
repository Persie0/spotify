package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p000.C1635n;

/* JADX INFO: loaded from: classes.dex */
public final class w42 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f247677a;

    /* JADX INFO: renamed from: b */
    public final b52 f247678b;

    /* JADX INFO: renamed from: c */
    public final r52 f247679c;

    /* JADX INFO: renamed from: d */
    public final Flowable f247680d;

    /* JADX INFO: renamed from: e */
    public final bf0 f247681e;

    /* JADX INFO: renamed from: f */
    public final acm0 f247682f;

    /* JADX INFO: renamed from: g */
    public final nhm f247683g;

    /* JADX INFO: renamed from: h */
    public final gfi0 f247684h;

    /* JADX INFO: renamed from: i */
    public final wpi0 f247685i;

    /* JADX INFO: renamed from: j */
    public final pfm0 f247686j;

    public w42(doh dohVar, b52 b52Var, r52 r52Var, Flowable flowable, bf0 bf0Var, acm0 acm0Var, nhm nhmVar, gfi0 gfi0Var) {
        this.f247677a = dohVar;
        this.f247678b = b52Var;
        this.f247679c = r52Var;
        this.f247680d = flowable;
        this.f247681e = bf0Var;
        this.f247682f = acm0Var;
        this.f247683g = nhmVar;
        this.f247684h = gfi0Var;
        wpi0 wpi0Var = new wpi0(null);
        this.f247685i = wpi0Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f247686j = new pfm0(new qfm0[]{new q040(xgg1.m90667O(), xoc1.f263893G6, null), new sfj0(wpi0Var), new tq9(Collections.singleton("/account/parental-consent"), true), new e6m0(true), new sw91(14, true, false, false), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m87120c(w42 w42Var, xq00 xq00Var, int i) {
        int i2;
        w42 w42Var2;
        b52 b52Var = w42Var.f247678b;
        xq00Var.m91775k0(-741940672);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(w42Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            fbk fbkVar = null;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Flowable flowable = w42Var.f247680d;
            boolean zM91770i = xq00Var.m91770i(w42Var) | xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new C1966i4(28, w42Var, kqi0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49233e(flowable, (gh00) objM91750T2, xq00Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T3;
            Object objM91750T4 = xq00Var.m91750T();
            if (objM91750T4 == obj) {
                objM91750T4 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T4;
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == obj) {
                objM91750T5 = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T5);
            }
            xuk xukVar = (xuk) objM91750T5;
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == obj) {
                objM91750T6 = w42Var.f247683g.m64508a(xukVar, new h90(kqi0Var2, 10), new h90(kqi0Var3, 11));
                xq00Var.m91793t0(objM91750T6);
            }
            a52 a52Var = (a52) objM91750T6;
            if (kqi0Var.getValue() != null) {
                xq00Var.m91771i0(-1251928426);
                Object objM91750T7 = xq00Var.m91750T();
                if (objM91750T7 == obj) {
                    String strM28139g = b52Var.m28139g();
                    Bundle bundleM28138c = b52Var.m28138c();
                    if (bundleM28138c != null) {
                        bundleM28138c.putBoolean("block_navigation", false);
                    } else {
                        bundleM28138c = null;
                    }
                    Object f92Var = new f92(strM28139g, bundleM28138c);
                    xq00Var.m91793t0(f92Var);
                    objM91750T7 = f92Var;
                }
                ih41 ih41VarM85769s = vjf1.m85769s((g92) objM91750T7, xq00Var);
                boolean zM91770i2 = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(ih41VarM85769s);
                Object objM91750T8 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T8 == obj) {
                    objM91750T8 = new s42(ih41VarM85769s, kqi0Var2, fbkVar, 0);
                    xq00Var.m91793t0(objM91750T8);
                }
                hz40.m49237i(ih41VarM85769s, (th00) objM91750T8, xq00Var);
                Object objM91774k = xq00Var.m91774k(oaa0.m66540a());
                Object obj2 = objM91774k instanceof m500 ? (m500) objM91774k : null;
                Bundle bundleM28138c2 = b52Var.m28138c();
                Object string = bundleM28138c2 != null ? bundleM28138c2.getString("pending_deeplink_uri") : null;
                boolean zM91766g = xq00Var.m91766g(string) | xq00Var.m91770i(ih41VarM85769s);
                Object objM91750T9 = xq00Var.m91750T();
                if (zM91766g || objM91750T9 == obj) {
                    objM91750T9 = new C2241p2(string, ih41VarM85769s, fbkVar, 12);
                    xq00Var.m91793t0(objM91750T9);
                }
                hz40.m49237i(string, (th00) objM91750T9, xq00Var);
                boolean zM91770i3 = xq00Var.m91770i(ih41VarM85769s) | xq00Var.m91770i(obj2);
                Object objM91750T10 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T10 == obj) {
                    objM91750T10 = new C1966i4(29, obj2, ih41VarM85769s);
                    xq00Var.m91793t0(objM91750T10);
                }
                hz40.m49232d(obj2, ih41VarM85769s, (gh00) objM91750T10, xq00Var);
                Object objM95943x = zdg1.m95943x(xq00Var);
                boolean zM91770i4 = xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(objM95943x);
                Object objM91750T11 = xq00Var.m91750T();
                if (zM91770i4 || objM91750T11 == obj) {
                    objM91750T11 = new C2241p2(objM95943x, kqi0Var3, fbkVar, 13);
                    xq00Var.m91793t0(objM91750T11);
                }
                hz40.m49237i(objM95943x, (th00) objM91750T11, xq00Var);
                Object objM91750T12 = xq00Var.m91750T();
                if (objM91750T12 == obj) {
                    objM91750T12 = new v42(a52Var, w42Var, xukVar);
                    xq00Var.m91793t0(objM91750T12);
                }
                w42Var2 = w42Var;
                qqg1.m73532b(qaa0.m72435a().mo30068a((v42) objM91750T12), rkk.m75772x(1811350149, new C1635n(objM95943x, ih41VarM85769s, kqi0Var, a52Var, w42Var2, 5), xq00Var), xq00Var, 56);
                xq00Var.m91788r(false);
            } else {
                w42Var2 = w42Var;
                xq00Var.m91771i0(-1246443038);
                xq00Var.m91788r(false);
            }
        } else {
            w42Var2 = w42Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a60(w42Var2, i, 7);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f247686j;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f247677a.m36532a(rkk.m75763o(new u42(this, 3), true, -867944635));
    }
}
