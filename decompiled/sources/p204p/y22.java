package p204p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.recaptcha.internal.zzhg;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class y22 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f268442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y22(Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f268441a = i;
        this.f268442b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [p.eh00, p.qe70] */
    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f268441a) {
            case 0:
                return new y22((Context) this.f268442b, fbkVar, 0);
            case 1:
                return new y22((m55) this.f268442b, fbkVar, 1);
            case 2:
                return new y22((xi9) this.f268442b, fbkVar, 2);
            case 3:
                return new y22((cj9) this.f268442b, fbkVar, 3);
            case 4:
                return new y22((pxe) this.f268442b, fbkVar, 4);
            case 5:
                return new y22((zzk) this.f268442b, fbkVar, 5);
            case 6:
                return new y22((xqr) this.f268442b, fbkVar, 6);
            case 7:
                return new y22((Runnable) this.f268442b, fbkVar, 7);
            case 8:
                return new y22((yk0) this.f268442b, fbkVar, 8);
            case 9:
                return new y22((h240) this.f268442b, fbkVar, 9);
            case 10:
                return new y22((sxa0) this.f268442b, fbkVar, 10);
            case 11:
                return new y22(fbkVar, (qe70) this.f268442b);
            case 12:
                return new y22((ywf1) this.f268442b, fbkVar, 12);
            default:
                return new y22((x0g1) this.f268442b, fbkVar, 13);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) throws zzhg {
        switch (this.f268441a) {
            case 0:
                return ((y22) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                y22 y22Var = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                y22Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 2:
                y22 y22Var2 = (y22) create((niz) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                y22Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 3:
                y22 y22Var3 = (y22) create((niz) obj, (fbk) obj2);
                w2a1 w2a1Var3 = w2a1.f247311a;
                y22Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 4:
                y22 y22Var4 = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var4 = w2a1.f247311a;
                y22Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 5:
                return ((y22) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 6:
                return ((y22) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 7:
                y22 y22Var5 = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var5 = w2a1.f247311a;
                y22Var5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 8:
                y22 y22Var6 = (y22) create((woo) obj, (fbk) obj2);
                w2a1 w2a1Var6 = w2a1.f247311a;
                y22Var6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            case 9:
                y22 y22Var7 = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var7 = w2a1.f247311a;
                y22Var7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
            case 10:
                y22 y22Var8 = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var8 = w2a1.f247311a;
                y22Var8.invokeSuspend(w2a1Var8);
                return w2a1Var8;
            case 11:
                y22 y22Var9 = (y22) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var9 = w2a1.f247311a;
                y22Var9.invokeSuspend(w2a1Var9);
                return w2a1Var9;
            case 12:
                return ((y22) create((log1) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((y22) create((log1) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v50, types: [p.eh00, p.qe70] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws zzhg {
        int i = 19;
        int i2 = 15;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (this.f268441a) {
            case 0:
                bga.m29073P(obj);
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo((Context) this.f268442b);
                } catch (Exception e) {
                    syg1.m79704w("Caught getGoogleAdvertisingInfoObject exception: " + e);
                    return null;
                }
            case 1:
                bga.m29073P(obj);
                rr4 rr4Var = (rr4) ((am71) ((m55) this.f268442b).f140132P0.get());
                sr4 sr4VarM76275a = rr4Var.m76275a("uri_parser");
                sr4VarM76275a.m79019k("warm_up", null, true);
                sr4VarM76275a.m79016f("warm_up");
                rr4Var.m76276b(sr4VarM76275a.m79015d());
                return w2a1.f247311a;
            case 2:
                bga.m29073P(obj);
                xi9 xi9Var = (xi9) this.f268442b;
                xi9Var.f261818a.m83134a(Collections.singleton(l5j.f129959b));
                x461 x461VarM64612e = njg1.m64612e((tf60) xi9Var.f261823f.f35578a.mo26595B(gk40.f80712X0));
                xi9Var.f261829l = x461VarM64612e;
                c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(x461VarM64612e, xi9Var.f261822e));
                wzo wzoVar = xi9Var.f261819b;
                wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(new C2373se(k0e1.m54985d(wzoVar.f256636d), i), new of5(xi9Var, objArr3 == true ? 1 : 0, 14)));
                wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(new si9(b0g1.m27790l(k0e1.m54985d(wzoVar.f256637e), qpv0.f191387a.mo54112b(sc8.class)), 0), new kb7(xi9Var)));
                wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(xtm0.m92074U(mvl0.m62953p(new pv4(xi9Var.f261824g, 18)), new C2102lt((fbk) (objArr2 == true ? 1 : 0), (Object) xi9Var, 22)), new C2574xj(xi9Var, objArr == true ? 1 : 0, i2)));
                return w2a1.f247311a;
            case 3:
                bga.m29073P(obj);
                cj9 cj9Var = (cj9) this.f268442b;
                x461 x461VarM64612e2 = njg1.m64612e((tf60) cj9Var.f38530e.f35578a.mo26595B(gk40.f80712X0));
                cj9Var.f38532g = x461VarM64612e2;
                c9k c9kVarM56661c2 = kk40.m56661c(mlg1.m62205A(x461VarM64612e2, cj9Var.f38529d));
                wxf1.m89255l(c9kVarM56661c2, b0g1.m27776L(k0e1.m54985d(cj9Var.f38526a.m66102d()), new of5(cj9Var, objArr6 == true ? 1 : 0, i2)));
                wxf1.m89255l(c9kVarM56661c2, b0g1.m27776L(xtm0.m92074U(mvl0.m62953p(new pv4(cj9Var.f38531f, i)), new C2102lt((fbk) (objArr5 == true ? 1 : 0), (Object) cj9Var, 23)), new C2574xj(cj9Var, objArr4 == true ? 1 : 0, 16)));
                return w2a1.f247311a;
            case 4:
                bga.m29073P(obj);
                whr0 whr0Var = whr0.f251426i;
                cvf1.m34048k().f251432f.mo31986a(((pxe) this.f268442b).f182289c);
                return w2a1.f247311a;
            case 5:
                bga.m29073P(obj);
                zzk zzkVar = (zzk) this.f268442b;
                if (!zzkVar.f288018g) {
                    return null;
                }
                ((wy3) zzkVar.f288012a.f21245a).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - zzkVar.f288016e;
                zzkVar.f288016e = jElapsedRealtime;
                long jM97333f = zzk.m97333f(zzkVar);
                long j2 = jM97333f - zzkVar.f288017f;
                zzkVar.f288017f = jM97333f;
                if (j2 < 0) {
                    j2 = 0;
                }
                return new iyp0(j2 / j, (int) zzkVar.f288014c);
            case 6:
                bga.m29073P(obj);
                Object obj2 = ((xqr) this.f268442b).f265103h;
                xqr xqrVar = (xqr) this.f268442b;
                synchronized (obj2) {
                    if (!xqrVar.f265095Z || xqrVar.f265089L0) {
                        return w2a1.f247311a;
                    }
                    try {
                        xqrVar.m91892D();
                        break;
                    } catch (IOException unused) {
                        xqrVar.f265090M0 = true;
                    }
                    try {
                        if (xqr.m91885g(xqrVar)) {
                            xqrVar.m91893I();
                        }
                        break;
                    } catch (IOException unused2) {
                        xqrVar.f265091N0 = true;
                        xqrVar.f265093X = kif1.m56499h(kif1.m56498g());
                    }
                    return w2a1.f247311a;
                }
            case 7:
                bga.m29073P(obj);
                ((Runnable) this.f268442b).run();
                return w2a1.f247311a;
            case 8:
                bga.m29073P(obj);
                ((z430) yk0.m93956h((yk0) this.f268442b)).m95312a(true);
                return w2a1.f247311a;
            case 9:
                bga.m29073P(obj);
                Iterator it = ((h240) this.f268442b).f86885b.iterator();
                while (it.hasNext()) {
                    ((a240) it.next()).mo24491b();
                }
                return w2a1.f247311a;
            case 10:
                bga.m29073P(obj);
                ((sxa0) this.f268442b).m79590a().invoke();
                return w2a1.f247311a;
            case 11:
                bga.m29073P(obj);
                ((qe70) this.f268442b).invoke();
                return w2a1.f247311a;
            case 12:
                zz11 zz11Var = zz11.f287823d2;
                String strValueOf = "";
                bga.m29073P(obj);
                ywf1 ywf1Var = (ywf1) this.f268442b;
                Cursor cursorQuery = ywf1Var.f276962a.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
                    try {
                        strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
                        break;
                    } catch (Exception unused3) {
                    }
                    cursorQuery.close();
                }
                if (strValueOf.length() == 0) {
                    int i3 = 12;
                    if (Build.VERSION.SDK_INT > 34) {
                        throw new zzhg(zz11Var, zz11.f287847o1, str, i3);
                    }
                    throw new zzhg(zz11Var, zz11.f287848p1, (String) (objArr7 == true ? 1 : 0), i3);
                }
                uff1 uff1VarM29124x = bgf1.m29124x();
                vff1 vff1VarM25853w = agf1.m25853w();
                vff1VarM25853w.m85362j(strValueOf);
                uff1VarM29124x.m82997k(geg1.m44518y(vff1VarM25853w.m52814g()));
                return q3d0.m72089T(ywf1Var, (bgf1) uff1VarM29124x.m52814g());
            default:
                bga.m29073P(obj);
                x0g1 x0g1Var = (x0g1) this.f268442b;
                int i4 = Build.VERSION.SDK_INT;
                uff1 uff1VarM29124x2 = bgf1.m29124x();
                vff1 vff1VarM25853w2 = agf1.m25853w();
                vff1VarM25853w2.m85362j(String.valueOf(i4));
                uff1VarM29124x2.m82997k(geg1.m44518y(vff1VarM25853w2.m52814g()));
                return q3d0.m72089T(x0g1Var, (bgf1) uff1VarM29124x2.m52814g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y22(fbk fbkVar, eh00 eh00Var) {
        super(2, fbkVar);
        this.f268441a = 11;
        this.f268442b = (qe70) eh00Var;
    }
}
