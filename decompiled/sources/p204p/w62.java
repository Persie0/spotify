package p204p;

import android.content.Context;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class w62 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f248234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w62(Object obj, int i) {
        super(0);
        this.f248233a = i;
        this.f248234b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        xfr xfrVar;
        int i = this.f248233a;
        nau nauVar = nau.f152117a;
        int i2 = 2;
        int i3 = 3;
        int i4 = 5;
        int i5 = 6;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i6 = 8;
        int i7 = 1;
        int i8 = 4;
        fbk fbkVar = null;
        Object obj = this.f248234b;
        switch (i) {
            case 0:
                return (kv91) ((lgm) obj).get();
            case 1:
                cxe cxeVar = ((uc2) obj).f228924B1;
                if (cxeVar == null) {
                    wj50.m88260d0("actions");
                    throw null;
                }
                kv91 kv91Var = (kv91) cxeVar.f43012b;
                yt91 yt91VarM96903c = ((l9g0) cxeVar.f43014d).f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("go_back_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                ((if0) cxeVar.f43011a).m50413e(new j0r(true), true);
                return w2a1Var;
            case 2:
                ((ck2) ((aj2) ((pn2) obj).f179287a.get())).m33047C();
                return w2a1Var;
            case 3:
                ((yum0) obj).setValue(null);
                return w2a1Var;
            case 4:
                y5p y5pVarM77300j = ((s5p) ((voi) obj)).m77300j();
                if (y5pVarM77300j == null || (xfrVar = y5pVarM77300j.f269510c) == null) {
                    xfrVar = xfr.f261078a;
                }
                return xfrVar.name();
            case 5:
                return new cjc0((en2) obj, ip2.f104346U0);
            case 6:
                return z2h1.m95219z(new bjc0((zy2) obj, ip2.f104348W0), mi21.m61822f(1.0f, cxh0Var), null, 4);
            case 7:
                abk abkVar = (abk) ((rhm) obj).f199256a.f133244b;
                z9j0 z9j0Var = (z9j0) ((ven) abkVar.f14137b).f240774b.f169565X.get();
                jg31.m53271i(z9j0Var);
                kq80 kq80Var = ((trq) abkVar.f14138c).f223106b;
                jg31.m53271i(kq80Var);
                ven venVar = (ven) abkVar.f14137b;
                otn otnVar = venVar.f240774b;
                oz5 oz5Var = (oz5) otnVar.f169538V5.get();
                jg31.m53271i(oz5Var);
                son sonVar = venVar.f240773a;
                e940 e940Var = (e940) sonVar.f211626P7.get();
                jg31.m53271i(e940Var);
                qmr0 qmr0Var = (qmr0) sonVar.f211777Un.get();
                jg31.m53271i(qmr0Var);
                u7y u7yVar = new u7y(e940Var, qmr0Var);
                r06 r06Var = (r06) otnVar.f169275E8.get();
                jg31.m53271i(r06Var);
                return new cjc0(new C1790du(z9j0Var, kq80Var, oz5Var, u7yVar, r06Var), lz2.f138216R0);
            case 8:
                f13 f13Var = (f13) obj;
                ydi ydiVar = (ydi) ((shm) f13Var.f64776d).f209236a.f133244b;
                Context context = (Context) ((xen) ydiVar.f271774b).f260746b.f212437t1.f246642a;
                jg31.m53271i(context);
                boolean zM83800x = uqg1.m83800x(context);
                xen xenVar = (xen) ydiVar.f271774b;
                qwx0 qwx0Var = (qwx0) xenVar.f260746b.f211648Q2.get();
                jg31.m53271i(qwx0Var);
                bji bjiVar = (bji) xenVar.f260746b.f212567y1.get();
                jg31.m53271i(bjiVar);
                return new cjc0(new cx0(zM83800x, qwx0Var, new pd4(false, false, bjiVar)), new qse1(f13Var, i6));
            case 9:
                l13 l13Var = (l13) obj;
                return new cjc0(l13Var.f128602c.m80859a(new k13(l13Var.f128600a), new C2278q2(l13Var, fbkVar, i5)), new h13(l13Var, i7));
            case 10:
                return (cq6) ((C1778dh) obj).f48930c;
            case 11:
                n23 n23Var = (n23) obj;
                n6i n6iVar = (n6i) ((bim) n23Var.f149614d).f27511a.f133244b;
                z9j0 z9j0Var2 = (z9j0) ((bfn) n6iVar.f150891b).f26745a.f169565X.get();
                jg31.m53271i(z9j0Var2);
                eju ejuVar = (eju) ((bfn) n6iVar.f150891b).f26745a.f170025z1.get();
                jg31.m53271i(ejuVar);
                return z2h1.m95219z(new bjc0(new b7v0(z9j0Var2, ejuVar, 5), new k23(n23Var, i7)), mi21.m61822f(1.0f, cxh0Var), null, 4);
            case 12:
                l43 l43Var = (l43) obj;
                return z2h1.m95219z(new bjc0(l43Var.f129486c.m64581a(), new k23(l43Var, i8)), mi21.m61822f(1.0f, cxh0Var), null, 4);
            case 13:
                z53 z53Var = (z53) obj;
                oim oimVar = (oim) z53Var.f279457d;
                az1 az1Var = (az1) z53Var.f279460g;
                vpj vpjVar = (vpj) oimVar.f165835a.f133244b;
                eju ejuVar2 = (eju) ((jen) vpjVar.f243701b).f111629b.f170025z1.get();
                jg31.m53271i(ejuVar2);
                dju djuVar = ejuVar2.f60295c;
                rn81 rn81Var = new rn81(djuVar, new fju(djuVar, 13));
                jen jenVar = (jen) vpjVar.f243701b;
                qwx0 qwx0Var2 = (qwx0) jenVar.f111628a.f211648Q2.get();
                jg31.m53271i(qwx0Var2);
                bji bjiVar2 = (bji) jenVar.f111628a.f212567y1.get();
                jg31.m53271i(bjiVar2);
                return new gvt(new bjc0(new h63(rn81Var, az1Var, qwx0Var2, new pd4(false, false, bjiVar2)), new k23(z53Var, i5)));
            case 14:
                z63 z63Var = (z63) obj;
                abk abkVar2 = (abk) ((pim) z63Var.f279687e).f177984a.f133244b;
                z9j0 z9j0Var3 = (z9j0) ((efn) abkVar2.f14137b).f59072a.f169565X.get();
                jg31.m53271i(z9j0Var3);
                st91 st91Var = ((esq) abkVar2.f14138c).f62458f;
                eju ejuVar3 = (eju) ((efn) abkVar2.f14137b).f59072a.f170025z1.get();
                jg31.m53271i(ejuVar3);
                return z2h1.m95219z(new bjc0(new b7v0(z9j0Var3, st91Var, ejuVar3), new k23(z63Var, i6)), mi21.m61822f(1.0f, cxh0Var), null, 4);
            case 15:
                ((ya3) obj).f270745e.getClass();
                return new ba3();
            case 16:
                rk0 rk0Var = (rk0) obj;
                ps3 ps3VarM96222a = ((zim) rk0Var.f199936d).m96222a();
                ps3VarM96222a.m70754e();
                Observable observable = (Observable) ((nt70) rk0Var.f199934b).invoke();
                ArrayList arrayList = (ArrayList) ps3VarM96222a.f180733j;
                int i9 = 21;
                arrayList.add(observable.map(new z4y(imr0.f103771a, i9)));
                fiz fizVar = (fiz) ((vlp) rk0Var.f199935c).invoke();
                dau dauVar = dau.f47107a;
                arrayList.add(k0e1.m54988g(fizVar, dauVar).map(new e45(15)));
                arrayList.add(k0e1.m54988g((fiz) ((C2445u9) rk0Var.f199938f).invoke(), dauVar).map(new z4y(ep50.f61550a, i9)));
                arrayList.add(k0e1.m54988g(((k210) rk0Var.f199941i).f118467a, dauVar).map(new z4y(i210.f97690a, i9)));
                return RxEventSources.m15655a(ps3VarM96222a.m70751b(kg3.f122286h).doOnError(C1710bm.f28314N0), ((Observable) ((C2445u9) rk0Var.f199937e).invoke()).doOnError(C1710bm.f28315O0).map(p4h1.f173949f), ((Observable) ((C1771da) rk0Var.f199939g).invoke()).doOnError(C1710bm.f28316P0).map(o5h1.f161998f), ((Observable) ((C1771da) rk0Var.f199940h).invoke()).doOnError(C1710bm.f28317Q0).map(z9h1.f280804e), k0e1.m54988g(new C2417tj(22, new kmx((lqi0) rk0Var.f199942t, i6), rk0Var), dauVar));
            case 17:
                MobiusLoop mobiusLoop = ((oj3) ((tj3) obj).f220813c).f165947h;
                if (mobiusLoop != null) {
                    mobiusLoop.m15600a(new rc3("back"));
                }
                return w2a1Var;
            case 18:
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((nn3) obj).f156318a.getResources().getAssets().open("app_remote_allow_list.csv"), vuc.f244913a), 8192);
                    try {
                        Map mapM56707t0 = kkc0.m56707t0(new j691(g63.f76855S0, btz0.m30480D(g63.f76854R0, btz0.m30478B(new tl80(bufferedReader)))));
                        bufferedReader.close();
                        return mapM56707t0;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            n0e1.m63430g(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    m6b.m60995j("Failed to read app-remote allow list file: ", e.getMessage());
                    return nauVar;
                }
            case 19:
                qt3 qt3Var = (qt3) obj;
                bji bjiVar3 = qt3Var.f192269c;
                if (bjiVar3 != null) {
                    return (qt3) bjiVar3.mo29483e(new dz1(qt3Var, i7));
                }
                return null;
            case 20:
                tt3 tt3Var = (tt3) obj;
                bji bjiVar4 = tt3Var.f223492b;
                if (bjiVar4 != null) {
                    return (tt3) bjiVar4.mo29483e(new dz1(tt3Var, i2));
                }
                return null;
            case 21:
                ut3 ut3Var = (ut3) obj;
                bji bjiVar5 = ut3Var.f233750c;
                if (bjiVar5 != null) {
                    return (ut3) bjiVar5.mo29483e(new dz1(ut3Var, i3));
                }
                return null;
            case 22:
                vt3 vt3Var = (vt3) obj;
                bji bjiVar6 = vt3Var.f244540c;
                if (bjiVar6 != null) {
                    return (vt3) bjiVar6.mo29483e(new dz1(vt3Var, i8));
                }
                return null;
            case 23:
                wt3 wt3Var = (wt3) obj;
                bji bjiVar7 = wt3Var.f254814b;
                if (bjiVar7 != null) {
                    return (wt3) bjiVar7.mo29483e(new dz1(wt3Var, i4));
                }
                return null;
            case 24:
                xt3 xt3Var = (xt3) obj;
                wy91 wy91Var = xt3Var.f265740b;
                if (wy91Var != null) {
                    return (xt3) wy91Var.mo29483e(new dz1(xt3Var, i5));
                }
                return null;
            case 25:
                yt3 yt3Var = (yt3) obj;
                bji bjiVar8 = yt3Var.f275944m;
                if (bjiVar8 != null) {
                    return (yt3) bjiVar8.mo29483e(new dz1(yt3Var, 7));
                }
                return null;
            case 26:
                eu3 eu3Var = (eu3) obj;
                bji bjiVar9 = eu3Var.f62863c;
                if (bjiVar9 != null) {
                    return (eu3) bjiVar9.mo29483e(new dz1(eu3Var, i6));
                }
                return null;
            case 27:
                gu3 gu3Var = (gu3) obj;
                bji bjiVar10 = gu3Var.f84368h;
                if (bjiVar10 != null) {
                    return (gu3) bjiVar10.mo29483e(new dz1(gu3Var, 9));
                }
                return null;
            case 28:
                hu3 hu3Var = (hu3) obj;
                bji bjiVar11 = hu3Var.f95249h;
                if (bjiVar11 != null) {
                    return (hu3) bjiVar11.mo29483e(new dz1(hu3Var, 10));
                }
                return null;
            default:
                iu3 iu3Var = (iu3) obj;
                bji bjiVar12 = iu3Var.f105850c;
                if (bjiVar12 != null) {
                    return (iu3) bjiVar12.mo29483e(new dz1(iu3Var, 11));
                }
                return null;
        }
    }
}
