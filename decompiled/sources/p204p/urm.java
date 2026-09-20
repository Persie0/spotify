package p204p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class urm implements v94 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233402a;

    /* JADX INFO: renamed from: b */
    public final Object f233403b;

    /* JADX INFO: renamed from: c */
    public final Object f233404c;

    /* JADX INFO: renamed from: d */
    public final Object f233405d;

    public urm(men0 men0Var) {
        this.f233402a = 25;
        this.f233404c = men0Var;
        int i = 2;
        this.f233403b = new zbn(this, 0, i);
        this.f233405d = new zbn(this, 1, i);
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        switch (this.f233402a) {
            case 28:
                bjq0 bjq0Var = (bjq0) obj;
                son sonVar = (son) this.f233403b;
                g1e g1eVar = (g1e) sonVar.f211776Um.get();
                bjq0 bjq0Var2 = (bjq0) this.f233404c;
                m500 m500Var = (m500) ((otn) this.f233405d).f169701f.f246642a;
                vbu0 vbu0Var = new vbu0(m500Var, 5);
                e1e e1eVar = null;
                try {
                    Bundle bundle = bjq0Var2.f98701f;
                    if (bundle != null) {
                        e1eVar = (e1e) zn91.m96523K(bundle, "KEY_IN_APP_INTERNAL_WEBVIEW_CHECKOUT_SOURCE", e1e.class);
                    }
                } catch (ClassCastException unused) {
                }
                if (e1eVar == null) {
                    e1eVar = u0e.f225466b;
                }
                bjq0Var.f27757T1 = j3q0.m52314z(g1eVar, bjq0Var2, vbu0Var, m500Var, e1eVar, (bjq0) this.f233404c);
                bjq0Var.f27756S1 = (jyx0) sonVar.f212294ni.get();
                break;
            default:
                PageActivityProxy pageActivityProxy = (PageActivityProxy) obj;
                son sonVar2 = (son) this.f233405d;
                pageActivityProxy.f113056Y0 = (zsr) sonVar2.f211919a.f18590j0.get();
                pageActivityProxy.f3283Z0 = (k5m0) ((h4t0) this.f233403b).get();
                pageActivityProxy.f3284a1 = (v4t0) sonVar2.f211430Ho.get();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c07 m83855a() {
        u12 u12Var = (u12) this.f233404c;
        Scheduler scheduler = (Scheduler) ((t7q) u12Var.f225646Y).f217871b;
        jg31.m53272j(scheduler);
        Flowable flowable = (Flowable) u12Var.f225648b;
        jg31.m53271i(flowable);
        Activity activity = (Activity) u12Var.f225655i;
        jg31.m53271i(activity);
        wb11 wb11Var = (wb11) u12Var.f225654h;
        jg31.m53271i(wb11Var);
        c06 c06Var = new c06(activity, wb11Var, (xz6) ((h4t0) this.f233403b).get());
        zxx0 zxx0Var = (zxx0) u12Var.f225651e;
        jg31.m53271i(zxx0Var);
        return new c07(scheduler, flowable, c06Var, zxx0Var);
    }

    /* JADX INFO: renamed from: b */
    public g4s m83856b() {
        c07 c07VarM83855a = m83855a();
        u12 u12Var = (u12) this.f233404c;
        Scheduler scheduler = (Scheduler) ((t7q) u12Var.f225646Y).f217872c;
        jg31.m53272j(scheduler);
        Activity activity = (Activity) u12Var.f225655i;
        jg31.m53271i(activity);
        b4s b4sVar = new b4s(activity);
        z9j0 z9j0Var = (z9j0) u12Var.f225656t;
        jg31.m53271i(z9j0Var);
        kv91 kv91Var = (kv91) u12Var.f225650d;
        jg31.m53271i(kv91Var);
        return new g4s(c07VarM83855a, scheduler, b4sVar, z9j0Var, new at91(kv91Var, new k5h0(st91.f213865b)));
    }

    /* JADX INFO: renamed from: c */
    public fas m83857c() {
        u12 u12Var = (u12) this.f233404c;
        y3l0 y3l0Var = (y3l0) u12Var.f225652f;
        jg31.m53271i(y3l0Var);
        wt80 wt80Var = (wt80) u12Var.f225649c;
        jg31.m53271i(wt80Var);
        c07 c07VarM83855a = m83855a();
        luk lukVar = ((l5s) u12Var.f225645X).f129998a;
        jg31.m53272j(lukVar);
        zxx0 zxx0Var = (zxx0) u12Var.f225651e;
        jg31.m53271i(zxx0Var);
        mcu0 mcu0Var = (mcu0) u12Var.f225653g;
        jg31.m53271i(mcu0Var);
        return new fas(y3l0Var, wt80Var, c07VarM83855a, lukVar, new ltx0(zxx0Var, new C2642z9(mcu0Var, 9)));
    }

    /* JADX INFO: renamed from: d */
    public c06 m83858d() {
        wbo0 wbo0Var = (wbo0) this.f233404c;
        i4t0 i4t0Var = wbo0Var.f249834h;
        hc50 hc50Var = (hc50) i4t0Var.get();
        jg31.m53271i(hc50Var);
        i4t0 i4t0Var2 = wbo0Var.f249830d;
        RetrofitMaker retrofitMaker = (RetrofitMaker) i4t0Var2.get();
        jg31.m53271i(retrofitMaker);
        grm0 grm0VarM73645r = qrl0.m73645r(hc50Var, retrofitMaker);
        hc50 hc50Var2 = (hc50) i4t0Var.get();
        jg31.m53271i(hc50Var2);
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) i4t0Var2.get();
        jg31.m53271i(retrofitMaker2);
        grm0 grm0VarM73646s = qrl0.m73646s(hc50Var2, retrofitMaker2);
        hv31 hv31Var = (hv31) wbo0Var.f249831e.get();
        jg31.m53271i(hv31Var);
        ajq0 ajq0Var = (ajq0) wbo0Var.f249832f.get();
        jg31.m53271i(ajq0Var);
        return new c06(grm0VarM73645r, grm0VarM73646s, ajq0Var, hv31Var);
    }

    /* JADX INFO: renamed from: e */
    public viy0 m83859e() {
        Bundle bundle = ((i8y) this.f233405d).f98701f;
        uzq uzqVar = bundle != null ? (uzq) bundle.getParcelable("ARG_SOURCE") : null;
        int i = uzqVar == null ? -1 : j8y.f110044a[uzqVar.ordinal()];
        if (i != 1) {
            return i != 2 ? viy0.UNKNOWN : viy0.CHOOSER_LOGIN;
        }
        return viy0.CHOOSER_SIGNUP;
    }

    public urm(nen nenVar, l3n l3nVar) {
        this.f233402a = 20;
        this.f233404c = nenVar;
        this.f233405d = l3nVar;
        this.f233403b = b2s.m27972b(new w4n(this, 18));
    }

    public urm(uen uenVar, l3n l3nVar) {
        this.f233402a = 17;
        this.f233404c = uenVar;
        this.f233403b = l3nVar;
        this.f233405d = new w4n(this, 3);
    }

    public urm(l3n l3nVar, cu50 cu50Var) {
        this.f233402a = 22;
        this.f233404c = cu50Var;
        this.f233405d = l3nVar;
        this.f233403b = be21.m28868a(new w4n(this, 26));
    }

    public urm(len lenVar, l3n l3nVar, esq esqVar) {
        this.f233402a = 24;
        this.f233404c = l3nVar;
        this.f233403b = lenVar;
        this.f233405d = new n8n(this, 2);
    }

    public urm(men menVar, l3n l3nVar, mrq mrqVar) {
        this.f233402a = 4;
        this.f233404c = l3nVar;
        this.f233403b = menVar;
        this.f233405d = new tqm(this, 16);
    }

    public urm(men menVar, l3n l3nVar, esq esqVar) {
        this.f233402a = 16;
        this.f233404c = l3nVar;
        this.f233405d = menVar;
        this.f233403b = be21.m28868a(new e0n(this, 27));
    }

    public urm(men menVar, esq esqVar) {
        this.f233402a = 27;
        this.f233404c = menVar;
        this.f233405d = esqVar;
        this.f233403b = be21.m28868a(new n8n(this, 17));
    }

    public urm(e60 e60Var) {
        this.f233402a = 0;
        this.f233404c = e60Var;
        int i = 27;
        this.f233403b = b2s.m27972b(new opm(this, 0, i));
        this.f233405d = b2s.m27972b(new opm(this, 1, i));
    }

    public urm(abk abkVar) {
        this.f233402a = 2;
        this.f233404c = abkVar;
        int i = 13;
        this.f233403b = be21.m28868a(new xrm(this, 0, i));
        this.f233405d = be21.m28868a(new xrm(this, 1, i));
    }

    public urm(ut30 ut30Var) {
        this.f233402a = 9;
        this.f233404c = ut30Var;
        int i = 24;
        this.f233403b = b2s.m27972b(new ezm(this, 0, i));
        this.f233405d = b2s.m27972b(new ezm(this, 1, i));
    }

    public urm(g8y g8yVar, i8y i8yVar) {
        this.f233402a = 7;
        this.f233404c = g8yVar;
        this.f233405d = i8yVar;
        this.f233403b = b2s.m27972b(new tqm(this, 27));
    }

    public urm(psv psvVar) {
        this.f233402a = 6;
        this.f233404c = psvVar;
        int i = 17;
        this.f233403b = be21.m28868a(new yum(this, 0, i));
        this.f233405d = be21.m28868a(new yum(this, 1, i));
    }

    public urm(x070 x070Var, xg9 xg9Var) {
        this.f233402a = 11;
        this.f233404c = x070Var;
        this.f233405d = xg9Var;
        this.f233403b = be21.m28868a(new e0n(this, 26));
    }

    public urm(ebe0 ebe0Var, gbe0 gbe0Var) {
        this.f233402a = 19;
        this.f233404c = ebe0Var;
        this.f233405d = gbe0Var;
        this.f233403b = be21.m28868a(new w4n(this, 13));
    }

    public urm(oen oenVar, l3n l3nVar, cu50 cu50Var) {
        this.f233402a = 1;
        this.f233404c = oenVar;
        int i = 3;
        this.f233405d = new xrm(this, 1, i);
        this.f233403b = be21.m28868a(new xrm(this, 0, i));
    }

    public urm(dgn dgnVar, l3n l3nVar, esq esqVar) {
        this.f233402a = 10;
        this.f233404c = dgnVar;
        int i = 26;
        this.f233405d = new ezm(this, 0, i);
        this.f233403b = be21.m28868a(new ezm(this, 1, i));
    }

    public urm(sdj0 sdj0Var, tdj0 tdj0Var) {
        this.f233402a = 23;
        this.f233404c = sdj0Var;
        int i = 9;
        this.f233403b = be21.m28868a(new a7n(this, 1, i));
        this.f233405d = be21.m28868a(new a7n(this, 0, i));
    }

    public urm(j5i0 j5i0Var, k5i0 k5i0Var, dcm0 dcm0Var) {
        this.f233402a = 21;
        this.f233404c = j5i0Var;
        int i = 6;
        this.f233403b = be21.m28868a(new a7n(this, 0, i));
        this.f233405d = be21.m28868a(new a7n(this, 1, i));
    }

    public urm(u12 u12Var) {
        this.f233402a = 3;
        this.f233404c = u12Var;
        int i = 24;
        this.f233403b = be21.m28868a(new xrm(this, 0, i));
        this.f233405d = be21.m28868a(new xrm(this, 1, i));
    }

    public urm(ch70 ch70Var) {
        this.f233402a = 15;
        this.f233404c = ch70Var;
        int i = 16;
        this.f233403b = b2s.m27972b(new c2n(this, 1, i));
        this.f233405d = b2s.m27972b(new c2n(this, 0, i));
    }

    public urm(i120 i120Var, j120 j120Var, dcm0 dcm0Var) {
        this.f233402a = 8;
        this.f233404c = i120Var;
        this.f233405d = dcm0Var;
        this.f233403b = be21.m28868a(new e0n(this, 13));
    }

    public urm(s170 s170Var, t170 t170Var, dcm0 dcm0Var) {
        this.f233402a = 12;
        this.f233404c = dcm0Var;
        int i = 6;
        this.f233405d = new c2n(this, 1, i);
        this.f233403b = b2s.m27972b(new c2n(this, 0, i));
    }

    public urm(q270 q270Var, c3o0 c3o0Var, dcm0 dcm0Var) {
        this.f233402a = 13;
        this.f233404c = dcm0Var;
        int i = 9;
        this.f233405d = new c2n(this, 1, i);
        this.f233403b = b2s.m27972b(new c2n(this, 0, i));
    }

    public urm(w370 w370Var, j791 j791Var, dcm0 dcm0Var) {
        this.f233402a = 14;
        this.f233404c = dcm0Var;
        int i = 11;
        this.f233405d = new c2n(this, 1, i);
        this.f233403b = b2s.m27972b(new c2n(this, 0, i));
    }

    public urm(xva0 xva0Var, ikh ikhVar, yva0 yva0Var, dcm0 dcm0Var) {
        this.f233402a = 18;
        this.f233404c = dcm0Var;
        int i = 4;
        this.f233405d = new e5n(this, 1, i);
        this.f233403b = b2s.m27972b(new e5n(this, 0, i));
    }

    public urm(wbo0 wbo0Var, ikh ikhVar, xbo0 xbo0Var, dcm0 dcm0Var) {
        this.f233402a = 26;
        this.f233404c = wbo0Var;
        this.f233403b = dcm0Var;
        this.f233405d = new n8n(this, 12);
    }

    public urm(ikh ikhVar, a6v a6vVar, dcm0 dcm0Var) {
        this.f233402a = 5;
        this.f233404c = a6vVar;
        this.f233405d = dcm0Var;
        this.f233403b = b2s.m27972b(new tqm(this, 22));
    }

    public urm(son sonVar, PageActivityProxy pageActivityProxy) {
        this.f233402a = 29;
        this.f233405d = sonVar;
        this.f233404c = pageActivityProxy;
        this.f233403b = b2s.m27972b(new q8n(8, sonVar, this));
    }

    public urm(son sonVar, otn otnVar, bjq0 bjq0Var) {
        this.f233402a = 28;
        this.f233403b = sonVar;
        this.f233405d = otnVar;
        this.f233404c = bjq0Var;
    }
}
