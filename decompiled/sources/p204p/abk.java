package p204p;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.webkit.CookieManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class abk implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14136a;

    /* JADX INFO: renamed from: b */
    public final Object f14137b;

    /* JADX INFO: renamed from: c */
    public Object f14138c;

    /* JADX INFO: renamed from: d */
    public Object f14139d;

    public /* synthetic */ abk(Object obj, Object obj2, Object obj3, int i) {
        this.f14136a = i;
        this.f14137b = obj;
        this.f14138c = obj2;
        this.f14139d = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m25354a(abk abkVar, nbm nbmVar, Uri uri) {
        abkVar.f14139d = nbmVar;
        nbmVar.getClass();
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = nbmVar.f152322d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            return ((nu30) nbmVar.f152319a).m65669C(nbmVar.f152320b, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Boolean bool;
        switch (this.f14136a) {
            case 0:
                pqm0 pqm0Var = (pqm0) obj;
                String str = (String) this.f14138c;
                cbk cbkVar = (cbk) this.f14137b;
                tbp0 tbp0Var = (tbp0) pqm0Var.f180350a;
                Boolean bool2 = null;
                if (((Boolean) pqm0Var.f180351b).booleanValue()) {
                    gf41 gf41VarM85154y = vbg1.m85154y(tbp0Var.f218925a);
                    boolean z = tbp0Var.f218926b;
                    yak yakVar = cbkVar.f36147d;
                    gf41 gf41VarM85154y2 = vbg1.m85154y(str);
                    if (gf41VarM85154y2 != null && !vbg1.m85148n(yakVar.f270929b, gf41VarM85154y2)) {
                        vbg1.m85148n(yakVar.f270930c, gf41VarM85154y2);
                    }
                    if (gf41VarM85154y != null && gf41VarM85154y.m44579i((gf41) this.f14139d) && !z) {
                        yakVar.m93212a(str, tbp0Var.f218927c);
                    }
                    gf41 gf41VarM85154y3 = vbg1.m85154y(str);
                    if (gf41VarM85154y3 == null) {
                        bool = null;
                    } else if (vbg1.m85148n(yakVar.f270929b, gf41VarM85154y3)) {
                        bool = Boolean.TRUE;
                    } else if (vbg1.m85148n(yakVar.f270930c, gf41VarM85154y3)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        bool2 = bool;
                    }
                }
                return Observable.just(new zak(bool2));
            default:
                return new CompletableCreate(new uhc((CookieManager) obj, (String) this.f14138c, (String) this.f14137b, (String) this.f14139d, 8));
        }
    }

    /* JADX INFO: renamed from: b */
    public C2193nx m25355b() {
        kq80 kq80Var = ((esq) this.f14137b).f62457e;
        jg31.m53271i(kq80Var);
        r06 r06Var = (r06) ((ifn) this.f14138c).f101788a.f169275E8.get();
        jg31.m53271i(r06Var);
        return new C2193nx(kq80Var, r06Var);
    }

    /* JADX INFO: renamed from: c */
    public hol0 m25356c() {
        ucc uccVar = (ucc) this.f14137b;
        vgq0 vgq0Var = (vgq0) uccVar.f229003c.get();
        jg31.m53271i(vgq0Var);
        f2k0 f2k0VarM82770a = uccVar.m82770a();
        jg31.m53271i(f2k0VarM82770a);
        pqk0 pqk0Var = new pqk0(f2k0VarM82770a, 18);
        jp11 jp11Var = (jp11) uccVar.f229005e.get();
        jg31.m53271i(jp11Var);
        i97 i97Var = new i97(25);
        f2k0 f2k0VarM82770a2 = uccVar.m82770a();
        jg31.m53271i(f2k0VarM82770a2);
        return new hol0(vgq0Var, pqk0Var, jp11Var, i97Var, f2k0VarM82770a2, 16);
    }

    /* JADX INFO: renamed from: d */
    public cxb m25357d() {
        hde hdeVar = (hde) this.f14137b;
        iqq0 iqq0Var = (iqq0) hdeVar.f90123d.get();
        jg31.m53271i(iqq0Var);
        z9j0 z9j0Var = (z9j0) hdeVar.f90121b.get();
        jg31.m53271i(z9j0Var);
        kde kdeVar = (kde) hdeVar.f90122c.get();
        jg31.m53271i(kdeVar);
        return new cxb(iqq0Var, z9j0Var, kdeVar, 9);
    }

    /* JADX INFO: renamed from: e */
    public Single m25358e(String str) {
        Single singleFlatMap = ((luv0) this.f14139d).m60031d().firstOrError().onErrorReturnItem(Boolean.FALSE).flatMap(new t7j(9, this, str));
        n1m n1mVar = n1m.f149470h;
        return singleFlatMap.map(new bx3(5));
    }

    /* JADX INFO: renamed from: f */
    public vpj m25359f() {
        xvb xvbVar = new xvb((nbm) this.f14139d);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", -16777216);
        bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", -16777216);
        xvbVar.f266341g = bundle;
        xvbVar.m92229s();
        xvbVar.f266339e = ActivityOptions.makeCustomAnimation((Activity) this.f14138c, R.anim.fade_in, R.anim.fade_out);
        return xvbVar.m92223k();
    }

    /* JADX INFO: renamed from: g */
    public nnc m25360g(String str, String str2, String str3, boolean z) {
        bek bekVar = new bek(new bjk(str, str2, str3), new aek(Collections.singletonList(fjk.f70301a), Collections.singletonList(yik.f273132a), null, 4));
        return xtm0.m92074U(fag1.m41173v((pgo) this.f14137b, pag1.m69487w(new rko(t6x0.f217635Z, 1, fgk.f69336N0, new pko(new egk(bekVar, 1)), fgk.f69337O0), fgk.f69338P0), w2a1.f247311a), new oj2((fbk) null, this, z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public Object m25361h(List list, ibk ibkVar) {
        y6m y6mVar;
        String str;
        n4m n4mVar;
        if (ibkVar instanceof y6m) {
            y6mVar = (y6m) ibkVar;
            int i = y6mVar.f269878d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6mVar.f269878d = i - Integer.MIN_VALUE;
            } else {
                y6mVar = new y6m(this, ibkVar);
            }
        } else {
            y6mVar = new y6m(this, ibkVar);
        }
        Object objM76980u = y6mVar.f269876b;
        int i2 = y6mVar.f269878d;
        Object[] objArr = 0;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                if (list.isEmpty()) {
                    return new x6m();
                }
                str = (String) g6f.m43741q0(list);
                if (!((z6m) this.f14138c).m95510a(str)) {
                    return new x6m();
                }
                r2m r2mVar = new r2m(this, str, objArr == true ? 1 : 0, 2);
                y6mVar.f269875a = str;
                y6mVar.f269878d = 1;
                objM76980u = s1h1.m76980u(5000L, r2mVar, y6mVar);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = y6mVar.f269875a;
                bga.m29073P(objM76980u);
            }
            qho qhoVar = (qho) objM76980u;
            if (qhoVar == null) {
                Logger.m3973i("CurationTraitDestinationResolver", "Timed out resolving curation trait for " + str);
            }
            oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
            if (ohoVar != null && (n4mVar = (n4m) ohoVar.f165512a) != null) {
                sjf1 sjf1Var = n4mVar.f150384b;
                ArrayList arrayList = n4mVar.f150385c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof i4m) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((i4m) it.next()).f98543e, arrayList3);
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                x401 x401Var = new x401();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof k4m) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    x401Var.add(((k4m) it2.next()).f119248e);
                }
                if (sjf1Var instanceof k4m) {
                    x401Var.add(((k4m) sjf1Var).f119248e);
                }
                return new x6m(setM43736n1, sjf1Var instanceof k4m ? ((k4m) sjf1Var).f119248e : null, n0e1.m63425d(x401Var), n4mVar);
            }
            return new x6m();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3973i("CurationTraitDestinationResolver", "Failed to resolve curation trait destinations", e2);
            return new x6m();
        }
    }

    public abk(String str, String str2, String str3) {
        this.f14136a = 2;
        this.f14138c = str;
        this.f14137b = str2;
        this.f14139d = str3;
    }

    public abk(m0c1 m0c1Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f14136a = 3;
        this.f14137b = m0c1Var;
    }

    public abk(gl8 gl8Var, Activity activity) {
        this.f14136a = 9;
        this.f14137b = gl8Var;
        this.f14138c = activity;
    }

    public abk(pgo pgoVar, z6m z6mVar) {
        this.f14136a = 8;
        this.f14137b = pgoVar;
        this.f14138c = z6mVar;
        this.f14139d = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(n4m.class)), 1, j3m.f108439d, new pko(j3m.f108441f), j3m.f108440e), j3m.f108442g);
    }

    public abk(pgo pgoVar, fiz fizVar) {
        this.f14136a = 1;
        this.f14137b = pgoVar;
        this.f14138c = fizVar;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f14139d = pag1.m69486v(new rko(new txr(jqv0Var.mo54112b(v140.class)), 2, fgk.f69341S0, new pko(fgk.f69339Q0), fgk.f69342T0), new rko(new txr(jqv0Var.mo54112b(erc1.class)), 2, fgk.f69343U0, new pko(fgk.f69340R0), fgk.f69344V0), xfi.f261015b1);
    }

    public abk(ifn ifnVar, esq esqVar) {
        this.f14136a = 15;
        this.f14137b = esqVar;
        this.f14138c = ifnVar;
        this.f14139d = be21.m28868a(new lgm(this, 28));
    }

    public abk(nen nenVar, l3n l3nVar, orq orqVar) {
        this.f14136a = 10;
        this.f14137b = l3nVar;
        this.f14138c = nenVar;
        this.f14139d = be21.m28868a(new lgm(this, 11));
    }

    public abk(efn efnVar, l3n l3nVar, esq esqVar) {
        this.f14136a = 14;
        this.f14137b = efnVar;
        this.f14138c = esqVar;
        this.f14139d = be21.m28868a(new lgm(this, 26));
    }

    public abk(dgn dgnVar, l3n l3nVar, mrq mrqVar) {
        this.f14136a = 24;
        this.f14137b = l3nVar;
        this.f14138c = dgnVar;
        this.f14139d = new tqm(this, 4);
    }

    public abk(i26 i26Var, st91 st91Var) {
        this.f14136a = 16;
        this.f14137b = i26Var;
        this.f14138c = st91Var;
        this.f14139d = be21.m28868a(new akm(this, 1));
    }

    public abk(ven venVar, l3n l3nVar, trq trqVar) {
        this.f14136a = 13;
        this.f14137b = venVar;
        this.f14138c = trqVar;
        this.f14139d = be21.m28868a(new lgm(this, 19));
    }

    public abk(ven venVar, l3n l3nVar, trq trqVar, byte b) {
        this.f14136a = 28;
        this.f14137b = venVar;
        this.f14138c = trqVar;
        this.f14139d = new tqm(this, 20);
    }

    public abk(ucc uccVar, tcc tccVar) {
        this.f14136a = 19;
        this.f14137b = uccVar;
        int i = 12;
        this.f14138c = b2s.m27972b(new slm(this, 1, i));
        this.f14139d = be21.m28868a(new slm(this, 0, i));
    }

    public abk(yo8 yo8Var, zo8 zo8Var) {
        this.f14136a = 17;
        this.f14137b = yo8Var;
        int i = 4;
        this.f14138c = b2s.m27972b(new slm(this, 1, i));
        this.f14139d = new slm(this, 0, i);
    }

    public abk(op9 op9Var, BlendTasteMatchFragment blendTasteMatchFragment) {
        this.f14136a = 18;
        this.f14137b = op9Var;
        this.f14138c = blendTasteMatchFragment;
        this.f14139d = be21.m28868a(new akm(this, 12));
    }

    public abk(j8s j8sVar, k8s k8sVar) {
        this.f14136a = 27;
        this.f14137b = j8sVar;
        int i = 26;
        this.f14138c = b2s.m27972b(new xrm(this, 0, i));
        this.f14139d = new xrm(this, 1, i);
    }

    public abk(npj npjVar, opj opjVar) {
        this.f14136a = 23;
        this.f14137b = npjVar;
        int i = 22;
        this.f14138c = be21.m28868a(new opm(this, 1, i));
        this.f14139d = be21.m28868a(new opm(this, 0, i));
    }

    public abk(b3d b3dVar, c3d c3dVar) {
        this.f14136a = 20;
        this.f14137b = b3dVar;
        int i = 22;
        this.f14138c = new slm(this, 0, i);
        this.f14139d = b2s.m27972b(new slm(this, 1, i));
    }

    public abk(hde hdeVar, dcm0 dcm0Var) {
        this.f14136a = 21;
        this.f14137b = hdeVar;
        this.f14138c = dcm0Var;
        this.f14139d = new akm(this, 20);
    }

    public abk(qsv qsvVar) {
        this.f14136a = 29;
        this.f14137b = qsvVar;
        int i = 16;
        this.f14138c = be21.m28868a(new yum(this, 0, i));
        this.f14139d = be21.m28868a(new yum(this, 1, i));
    }

    public abk(n82 n82Var, dcm0 dcm0Var) {
        this.f14136a = 11;
        this.f14137b = n82Var;
        this.f14138c = dcm0Var;
        this.f14139d = be21.m28868a(new lgm(this, 16));
    }

    public abk(oam oamVar, pam pamVar, dcm0 dcm0Var) {
        this.f14136a = 26;
        this.f14137b = oamVar;
        int i = 16;
        this.f14138c = b2s.m27972b(new xrm(this, 0, i));
        this.f14139d = new xrm(this, 1, i);
    }

    public abk(nsq nsqVar, ckk ckkVar, dcm0 dcm0Var) {
        this.f14136a = 25;
        this.f14137b = dcm0Var;
        int i = 5;
        this.f14138c = b2s.m27972b(new xrm(this, 0, i));
        this.f14139d = b2s.m27972b(new xrm(this, 1, i));
    }

    public abk(abj abjVar) {
        this.f14136a = 22;
        this.f14137b = abjVar;
        int i = 21;
        this.f14138c = be21.m28868a(new opm(this, 0, i));
        this.f14139d = be21.m28868a(new opm(this, 1, i));
    }

    public abk(jh2 jh2Var, lh2 lh2Var, dcm0 dcm0Var) {
        this.f14136a = 12;
        this.f14137b = dcm0Var;
        int i = 11;
        this.f14138c = new igm(this, 1, i);
        this.f14139d = b2s.m27972b(new igm(this, 0, i));
    }
}
