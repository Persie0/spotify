package p204p;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q831 implements rte0 {

    /* JADX INFO: renamed from: a */
    public final qse0 f186227a;

    /* JADX INFO: renamed from: b */
    public final luk f186228b;

    /* JADX INFO: renamed from: c */
    public final d631 f186229c;

    /* JADX INFO: renamed from: d */
    public final vmn f186230d;

    /* JADX INFO: renamed from: e */
    public final px0 f186231e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f186232f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public k831 f186233g;

    /* JADX INFO: renamed from: h */
    public final zv41 f186234h;

    /* JADX INFO: renamed from: i */
    public final nuu0 f186235i;

    /* JADX INFO: renamed from: j */
    public final gq0 f186236j;

    /* JADX INFO: renamed from: k */
    public final c9k f186237k;

    public q831(qse0 qse0Var, d631 d631Var, vmn vmnVar, px0 px0Var, luk lukVar) {
        this.f186227a = qse0Var;
        this.f186228b = lukVar;
        this.f186229c = d631Var;
        this.f186230d = vmnVar;
        this.f186231e = px0Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f186234h = zv41VarM52819d;
        nuu0 nuu0VarM31021m = bzf1.m31021m(zv41VarM52819d);
        this.f186235i = nuu0VarM31021m;
        this.f186236j = new gq0(nuu0VarM31021m, 15);
        this.f186237k = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), lukVar));
        d631Var.f45564d = new ono0(this, 28);
    }

    /* JADX INFO: renamed from: a */
    public static final View m72296a(q831 q831Var, cwf cwfVar, int i) {
        View viewFindViewById;
        List listM44518y;
        View viewM72297e;
        c700 c700VarMo15683g0;
        q831Var.getClass();
        View view = null;
        m500 m500Var = cwfVar instanceof m500 ? (m500) cwfVar : null;
        if (m500Var == null || (c700VarMo15683g0 = m500Var.mo15683g0()) == null) {
            viewFindViewById = null;
            break;
        }
        List listM43704R0 = g6f.m43704R0(c700VarMo15683g0.f34668c.m89877x());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM43704R0) {
            if (obj instanceof ugr) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                viewFindViewById = null;
                break;
            }
            View view2 = ((ugr) it.next()).f98706h1;
            viewFindViewById = view2 != null ? view2.findViewById(R.id.snackbarContainer) : null;
        } while (viewFindViewById == null);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        Window window = cwfVar.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            C2042k7 c2042k7 = new C2042k7(viewGroup, 8);
            if (c2042k7.hasNext()) {
                Object next = c2042k7.next();
                if (c2042k7.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    while (c2042k7.hasNext()) {
                        arrayList2.add(c2042k7.next());
                    }
                    listM44518y = arrayList2;
                } else {
                    listM44518y = geg1.m44518y(next);
                }
            } else {
                listM44518y = lau.f131415a;
            }
            Iterator it2 = new mdx0(listM44518y).iterator();
            do {
                kdx0 kdx0Var = (kdx0) it2;
                if (kdx0Var.hasNext()) {
                    viewM72297e = m72297e((View) kdx0Var.next());
                }
            } while (viewM72297e == null);
            view = viewM72297e;
        }
        return view == null ? cwfVar.findViewById(i) : view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static View m72297e(View view) {
        View viewM72297e;
        View snackbarContainer;
        h631 h631Var = view instanceof h631 ? (h631) view : null;
        if (h631Var != null && (snackbarContainer = h631Var.getSnackbarContainer()) != null) {
            return snackbarContainer;
        }
        View view2 = view.getId() == R.id.snackbarContainer ? view : null;
        if (view2 != null) {
            return view2;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = new ek5(viewGroup, 8).iterator();
            do {
                C2042k7 c2042k7 = (C2042k7) it;
                if (c2042k7.hasNext()) {
                    viewM72297e = m72297e((View) c2042k7.next());
                }
            } while (viewM72297e == null);
            return viewM72297e;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static void m72298k(q831 q831Var, m931 m931Var, pte0 pte0Var, ase0 ase0Var, cwf cwfVar, gh00 gh00Var, dds0 dds0Var, n631 n631Var, int i) {
        gh00 o831Var = (i & 16) != 0 ? new o831(q831Var, cwfVar, 1) : gh00Var;
        Object obj = (i & 32) != 0 ? i401.f98363L0 : dds0Var;
        q831Var.getClass();
        x461 x461VarM64613f = njg1.m64613f();
        uf60 uf60VarM73202g = qlg1.m73202g();
        x461VarM64613f.mo26599N(new lp21(uf60VarM73202g, 9));
        c9k c9kVar = q831Var.f186237k;
        n5q n5qVar = xsr.f265651a;
        x0h1.m89578u(c9kVar, mlg1.m62205A(uf60VarM73202g, pvb0.f181680a.f197428f), 0, new vx01(cwfVar, x461VarM64613f, null, 25), 2);
        luk lukVar = q831Var.f186228b;
        lukVar.getClass();
        x0h1.m89578u(kk40.m56661c(cct.m32296A(lukVar, x461VarM64613f)), null, 0, new mm0(q831Var, pte0Var, ase0Var, obj, o831Var, m931Var, n631Var, cwfVar, null, 10), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m72299b(b631 b631Var) {
        m72304i(new l831(this, b631Var, 0));
    }

    @Override // p204p.rte0
    /* JADX INFO: renamed from: c */
    public final fiz mo37621c() {
        return this.f186236j;
    }

    /* JADX INFO: renamed from: d */
    public final void m72300d() {
        c631 c631VarM37499a;
        e0r0 e0r0Var = (e0r0) this.f186235i.f158717a.getValue();
        if (e0r0Var == null || (c631VarM37499a = e0r0Var.m37499a()) == null) {
            return;
        }
        c631VarM37499a.m31506g();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72301f() {
        View viewFindViewById;
        cwf cwfVar = (cwf) this.f186229c.f45563c.f158717a.getValue();
        if (cwfVar != null) {
            viewFindViewById = cwfVar.findViewById(R.id.snackbarContainer);
            if (viewFindViewById == null) {
                viewFindViewById = cwfVar.findViewById(R.id.content);
            }
        } else {
            viewFindViewById = null;
        }
        return viewFindViewById != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m72302g(g631 g631Var) {
        if (g631Var.f76891i) {
            return;
        }
        this.f186231e.m71327j(g631Var);
        o631 o631Var = new o631("Snackbar is not shown because no resumed activity could be found! Was the Snackbar shown from the background?", kfj.m56289p());
        na6.m63972t(o631Var.getMessage(), o631Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m72303h(b631 b631Var) {
        m72304i(new l831(this, b631Var, 1));
    }

    /* JADX INFO: renamed from: i */
    public final void m72304i(eh00 eh00Var) {
        if (wj50.m88271j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            eh00Var.invoke();
            return;
        }
        na6.m63957e("This method should be called from the UI Thread.");
        x0h1.m89578u(this.f186237k, null, 0, new y22(null, eh00Var), 3);
    }

    /* JADX INFO: renamed from: j */
    public final void m72305j(g631 g631Var) {
        cwf cwfVar = (cwf) this.f186229c.f45563c.f158717a.getValue();
        if (cwfVar == null) {
            m72302g(g631Var);
            return;
        }
        int i = o631.f162197b;
        n631 n631VarM56289p = kfj.m56289p();
        o831 o831Var = new o831(this, cwfVar, 0);
        m72298k(this, this.f186230d.m86019a(g631Var), nte0.f158057a, new ase0(new yre0(true), ure0.f233341a), cwfVar, o831Var, null, n631VarM56289p, 32);
    }

    /* JADX INFO: renamed from: l */
    public final void m72306l(g631 g631Var, View view) {
        cwf cwfVar = (cwf) this.f186229c.f45563c.f158717a.getValue();
        if (cwfVar == null) {
            m72302g(g631Var);
            return;
        }
        ptw0 ptw0Var = new ptw0(view);
        int i = o631.f162197b;
        n631 n631VarM56289p = kfj.m56289p();
        m72298k(this, this.f186230d.m86019a(g631Var), nte0.f158057a, new ase0(new yre0(true), ure0.f233341a), cwfVar, ptw0Var, null, n631VarM56289p, 32);
    }

    /* JADX INFO: renamed from: m */
    public final void m72307m(g631 g631Var) {
        k831 k831Var;
        if (g631Var != null) {
            int i = o631.f162197b;
            k831Var = new k831(g631Var, kfj.m56289p());
        } else {
            k831Var = null;
        }
        this.f186233g = k831Var;
    }
}
