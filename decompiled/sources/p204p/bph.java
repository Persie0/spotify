package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bph {

    /* JADX INFO: renamed from: a */
    public final View f29454a;

    /* JADX INFO: renamed from: b */
    public final hsh f29455b;

    /* JADX INFO: renamed from: c */
    public final hc80 f29456c;

    /* JADX INFO: renamed from: d */
    public final h9y0 f29457d;

    /* JADX INFO: renamed from: e */
    public final ijc1 f29458e;

    /* JADX INFO: renamed from: f */
    public final vd40 f29459f;

    /* JADX INFO: renamed from: g */
    public final i1x0 f29460g;

    /* JADX INFO: renamed from: h */
    public final Configuration f29461h;

    /* JADX INFO: renamed from: i */
    public final kqi0 f29462i;

    /* JADX INFO: renamed from: j */
    public final st3 f29463j;

    /* JADX INFO: renamed from: k */
    public final ht4 f29464k;

    /* JADX INFO: renamed from: l */
    public final vy3 f29465l;

    /* JADX INFO: renamed from: m */
    public final uy3 f29466m;

    /* JADX INFO: renamed from: n */
    public final azz f29467n;

    /* JADX INFO: renamed from: o */
    public final kqi0 f29468o;

    /* JADX INFO: renamed from: p */
    public final jc20 f29469p;

    /* JADX INFO: renamed from: q */
    public final zt4 f29470q;

    /* JADX INFO: renamed from: r */
    public final np70 f29471r;

    /* JADX INFO: renamed from: s */
    public final fz70 f29472s;

    /* JADX INFO: renamed from: t */
    public final srb f29473t;

    /* JADX INFO: renamed from: u */
    public int f29474u;

    /* JADX INFO: renamed from: v */
    public final che f29475v;

    /* JADX INFO: renamed from: w */
    public final aph f29476w;

    public bph(bph bphVar, View view, hsh hshVar, hc80 hc80Var, h9y0 h9y0Var, ijc1 ijc1Var) {
        vd40 vd40Var;
        Configuration configuration;
        kqi0 kqi0VarM77645B;
        st3 st3Var;
        ht4 ht4Var;
        vy3 vy3Var;
        uy3 uy3Var;
        azz u6j0Var;
        kqi0 kqi0VarM77644A;
        zt4 zt4Var;
        srb srbVar;
        np70 np70Var;
        i1x0 i1x0Var;
        View view2;
        boolean zM88271j = wj50.m88271j((bphVar == null || (view2 = bphVar.f29454a) == null) ? null : view2.getContext(), view.getContext());
        this.f29454a = view;
        this.f29455b = hshVar;
        this.f29456c = hc80Var;
        this.f29457d = h9y0Var;
        this.f29458e = ijc1Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            vd40Var = bphVar.f29459f;
        } else {
            vd40Var = new vd40();
        }
        this.f29459f = vd40Var;
        this.f29460g = (bphVar == null || (i1x0Var = bphVar.f29460g) == null) ? new i1x0() : i1x0Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            configuration = bphVar.f29461h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f29461h = configuration;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            kqi0VarM77645B = bphVar.f29462i;
        } else {
            kqi0VarM77645B = sam.m77645B(new Configuration(configuration));
        }
        this.f29462i = kqi0VarM77645B;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            st3Var = bphVar.f29463j;
        } else {
            st3Var = new st3(view.getContext());
        }
        this.f29463j = st3Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            ht4Var = bphVar.f29464k;
        } else {
            ht4Var = new ht4(view.getContext());
        }
        this.f29464k = ht4Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            vy3Var = bphVar.f29465l;
        } else {
            vy3Var = new vy3(view.getContext());
        }
        this.f29465l = vy3Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            uy3Var = bphVar.f29466m;
        } else {
            uy3Var = new uy3(vy3Var);
        }
        this.f29466m = uy3Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            u6j0Var = bphVar.f29467n;
        } else {
            view.getContext();
            u6j0Var = new u6j0(20);
        }
        this.f29467n = u6j0Var;
        if (zM88271j) {
            wj50.m88279p(bphVar);
            kqi0VarM77644A = bphVar.f29468o;
        } else {
            kqi0VarM77644A = sam.m77644A(vbg1.m85150p(view.getContext()), kxq0.f127575g);
        }
        this.f29468o = kqi0VarM77644A;
        this.f29469p = view == (bphVar != null ? bphVar.f29454a : null) ? bphVar.f29469p : new ado0(view);
        if (zM88271j) {
            wj50.m88279p(bphVar);
            zt4Var = bphVar.f29470q;
        } else {
            zt4Var = new zt4(ViewConfiguration.get(view.getContext()));
        }
        this.f29470q = zt4Var;
        this.f29471r = (bphVar == null || (np70Var = bphVar.f29471r) == null) ? new np70() : np70Var;
        this.f29472s = new fz70();
        this.f29473t = (bphVar == null || (srbVar = bphVar.f29473t) == null) ? new srb() : srbVar;
        this.f29475v = new che(this, 24);
        this.f29476w = new aph(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m30117a(oz3 oz3Var, th00 th00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(123858079);
        int i2 = i | (xq00Var.m91770i(oz3Var) ? 4 : 2) | (xq00Var.m91770i(th00Var) ? 32 : 16) | (xq00Var.m91770i(this) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object tag = oz3Var.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof pq60) && !(tag instanceof cr60))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = oz3Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof pq60) || (tag2 instanceof cr60))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(xq00Var.m91732B());
                xq00Var.f264827q = true;
                xq00Var.f264792C = true;
                xq00Var.f264813c.m68077b();
                xq00Var.f264797H.m68077b();
                wu21 wu21Var = xq00Var.f264798I;
                ou21 ou21Var = wu21Var.f255070a;
                wu21Var.f255074e = ou21Var.f170155t;
                wu21Var.f255075f = ou21Var.f170145X;
            }
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            h9y0 h9y0Var = this.f29457d;
            if (objM91750T == ia7Var) {
                objM91750T = s800.m77432f(oz3Var, h9y0Var);
                xq00Var.m91793t0(objM91750T);
            }
            jwr jwrVar = (jwr) objM91750T;
            boolean zM91770i = xq00Var.m91770i(jwrVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new vgf(jwrVar, 19);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49233e(w2a1.f247311a, (gh00) objM91750T2, xq00Var);
            bns bnsVar = wsh.f254632w;
            boolean zBooleanValue = ((Boolean) xq00Var.m91774k(bnsVar)).booleanValue() | oz3Var.getScrollCaptureInProgress$ui();
            boolean zM91766g = xq00Var.m91766g(oz3Var.getView());
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == ia7Var) {
                objM91750T3 = new hoc1(oz3Var.getView());
                xq00Var.m91793t0(objM91750T3);
            }
            qqg1.m73533c(new c4t0[]{sda0.f207965a.mo30068a(this.f29456c), rea0.f198327a.mo30068a(h9y0Var), AndroidCompositionLocals_androidKt.f504d.mo30068a(this.f29459f), AndroidCompositionLocals_androidKt.f505e.mo30068a(this.f29460g), AndroidCompositionLocals_androidKt.f502b.mo30068a(oz3Var.getContext()), qz40.f194111a.mo30068a(set), AndroidCompositionLocals_androidKt.f501a.mo30068a(oz3Var.getConfiguration()), g8y0.f77630a.mo30068a(jwrVar), AndroidCompositionLocals_androidKt.f506f.mo30068a(oz3Var.getView()), bnsVar.mo30068a(Boolean.valueOf(zBooleanValue)), wsh.f254629t.mo30068a(oz3Var.getViewConfiguration()), eb30.f57801a.mo30068a((hoc1) objM91750T3)}, rkk.m75772x(1317454175, new vk5(oz3Var, this, th00Var, 2), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qic(this, oz3Var, th00Var, i, 23);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m30118b() {
        int i = this.f29474u - 1;
        this.f29474u = i;
        if (i < 0) {
            this.f29474u = 0;
        }
        if (this.f29474u == 0) {
            View view = this.f29454a;
            Context context = view.getContext();
            aph aphVar = this.f29476w;
            context.unregisterComponentCallbacks(aphVar);
            fz70 fz70Var = this.f29472s;
            if (fz70Var.f74938b == null) {
                fz70Var.f74937a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(aphVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30119c() {
        int i = this.f29474u + 1;
        this.f29474u = i;
        if (i == 1) {
            View view = this.f29454a;
            Context context = view.getContext();
            aph aphVar = this.f29476w;
            context.registerComponentCallbacks(aphVar);
            m30120d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            fz70 fz70Var = this.f29472s;
            fz70Var.f74939c.setValue(Boolean.valueOf(zHasWindowFocus));
            yum0 yum0Var = fz70Var.f74938b;
            che cheVar = this.f29475v;
            if (yum0Var == null) {
                fz70Var.f74937a = cheVar;
            }
            if (yum0Var != null) {
                yum0Var.setValue(cheVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(aphVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m30120d(Configuration configuration) {
        int iUpdateFrom = this.f29461h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f29459f.f240312a.entrySet().iterator();
            while (it.hasNext()) {
                td40 td40Var = (td40) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (td40Var == null || Configuration.needNewResources(iUpdateFrom, td40Var.f219225b)) {
                    it.remove();
                }
            }
            this.f29462i.setValue(new Configuration(configuration));
            i1x0 i1x0Var = this.f29460g;
            synchronized (i1x0Var) {
                i1x0Var.f97616a.m81195c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f29468o.setValue(vbg1.m85150p(this.f29454a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                fz70 fz70Var = this.f29472s;
                che cheVar = this.f29475v;
                yum0 yum0Var = fz70Var.f74938b;
                if (yum0Var != null) {
                    yum0Var.setValue(cheVar.invoke());
                }
            }
        }
    }
}
