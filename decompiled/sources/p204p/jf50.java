package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class jf50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf50(Object obj, int i) {
        super(1);
        this.f111825a = i;
        this.f111826b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fiz yskVar;
        crk crkVar;
        k270 k270Var;
        switch (this.f111825a) {
            case 0:
                ((ExoPlayer) obj).mo764Y((wz8) this.f111826b);
                return w2a1.f247311a;
            case 1:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                SurfaceHolder surfaceHolder = (SurfaceHolder) this.f111826b;
                if (surfaceHolder.getSurface().isValid()) {
                    exoPlayer.mo43898n(surfaceHolder.getSurface());
                }
                return w2a1.f247311a;
            case 2:
                ExoPlayer exoPlayer2 = (ExoPlayer) obj;
                af50 af50Var = (af50) this.f111826b;
                exoPlayer2.mo43898n(af50Var.f15033a);
                dv9.m37074w(exoPlayer2, af50Var.f15034b);
                return w2a1.f247311a;
            case 3:
                List list = (List) obj;
                zpa1 zpa1Var = (zpa1) this.f111826b;
                if (zpa1Var.f285074q && !list.isEmpty()) {
                    synchronized (zpa1Var.f285051Q) {
                        if (!zpa1Var.f285050P && !zpa1Var.f285056V && !((Boolean) zpa1Var.f285042H.getValue()).booleanValue()) {
                            zv41 zv41Var = zpa1Var.f285042H;
                            Boolean bool = Boolean.TRUE;
                            zv41Var.getClass();
                            zv41Var.m97091m(null, bool);
                            di41 di41VarM89578u = x0h1.m89578u(pic1.m70100a(zpa1Var), null, 2, new w9a1(zpa1Var, list, (fbk) null, 2), 1);
                            zpa1Var.f285057W = di41VarM89578u;
                            di41VarM89578u.start();
                        }
                    }
                }
                return w2a1.f247311a;
            case 4:
                wym wymVar = (wym) ((qcj0) this.f111826b).f187373a.m47311a((m500) ((Activity) obj));
                kcj0 kcj0VarM89380p = wymVar.m89380p();
                son sonVar = (son) wymVar.f256321c;
                return new t2n(kcj0VarM89380p, (kbj0) sonVar.f212085fr.get(), (vcj0) sonVar.f212569y3.get(), (zx3) sonVar.f212057er.get(), (qwx0) sonVar.f211648Q2.get(), 25);
            case 5:
                return new fju(((h36) this.f111826b).f87146b.f60295c, 16).mo26174a(null);
            case 6:
                qu50 qu50Var = (qu50) this.f111826b;
                return new dts(fag1.m41151B(qu50Var.f192563a, qu50Var.f192564b, (lu50) obj), 17);
            case 7:
                Set set = (Set) obj;
                cv50 cv50Var = (cv50) this.f111826b;
                u490 u490Var = cv50Var.f42300d;
                if (u490Var == null || set.isEmpty()) {
                    yskVar = new ysk(nau.f152117a, 27);
                } else {
                    Set<String> set2 = set;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
                    for (String str : set2) {
                        arrayList.add(new va3(u490Var.m82318c(str), str, 21));
                    }
                    yskVar = mvl0.m62953p(new v78((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), 16));
                }
                fbk fbkVar = null;
                return xtm0.m92074U(new zux(yskVar, mvl0.m62953p(new zux(cv50Var.f42301e, new gzr(k0e1.m54985d(((s5p) cv50Var.f42298b).m77297d()), 23), new p82(3, 22, fbkVar), 1)), yu50.f276275h, 1), new hc0(fbkVar, cv50Var, set, 27));
            case 8:
                ?? r2 = ((kv50) this.f111826b).f126778b;
                if (r2 != 0) {
                    r2.invoke(obj);
                }
                return w2a1.f247311a;
            case 9:
                bdn bdnVar = (bdn) ((si31) this.f111826b).f209351a.m90441a((m500) ((Activity) obj));
                return new ay21((Activity) bdnVar.f26152S0, (a660) ((son) bdnVar.f26153T0).f212484um.get());
            case 10:
                ((icp) obj).f100858d = new C1825es((b360) this.f111826b, (fbk) null, 22);
                return w2a1.f247311a;
            case 11:
                ((icp) obj).f100858d = new C1825es((f360) this.f111826b, (fbk) null, 23);
                return w2a1.f247311a;
            case 12:
                return (u6p) ((bdn) ((ri31) this.f111826b).f199431a.m90441a((m500) ((Activity) obj))).f26165b.get();
            case 13:
                return (wek0) ((tmn) ((bdn) ((ui31) this.f111826b).f230592a.m90441a((m500) ((Activity) obj))).f26164a1).get();
            case 14:
                return (ydk0) ((tmn) ((bdn) ((wi31) this.f111826b).f251490a.m90441a((m500) ((Activity) obj))).f26166b1).get();
            case 15:
                MobiusLoop mobiusLoop = ((x560) this.f111826b).f258319Z;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("mobiusLoop");
                throw null;
            case 16:
                jpz0.m54000n((mpz0) obj, ((q660) this.f111826b).f185690a);
                return w2a1.f247311a;
            case 17:
                MobiusLoop mobiusLoop2 = ((x560) this.f111826b).f258319Z;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("mobiusLoop");
                throw null;
            case 18:
                return (ske) ((bdn) ((ti31) this.f111826b).f220546a.m90441a((m500) ((Activity) obj))).f26151R0.get();
            case 19:
                return Boolean.valueOf(((kol0) obj) == ((kol0) this.f111826b));
            case 20:
                g7a g7aVar = (g7a) this.f111826b;
                return fag1.m41151B(g7aVar.f77219b, g7aVar.f77220c, (ks60) obj);
            case 21:
                nk2 nk2Var = ((uw60) obj).f234581b;
                boolean zM88506a = ((wl91) ((iy60) this.f111826b).f106876t).m88506a();
                lv21 lv21Var = lv21.f137205b;
                return new vw60(nk2Var, false, false, lv21Var, "", "", null, 0, 1, null, zM88506a, null, null, lv21Var, null, null, false);
            case 22:
                return ((w070) this.f111826b).f246656b;
            case 23:
                Bundle bundle = (Bundle) obj;
                if (bundle != null && (crkVar = (crk) zn91.m96523K(bundle, "coppa_page_model", crk.class)) != null) {
                    return crkVar;
                }
                drk drkVar = ((e170) this.f111826b).f55128b;
                return new crk(drkVar.f52349a, false, drkVar.f52350b, grk.f83776a);
            case 24:
                return ((i170) this.f111826b).f97431f;
            case 25:
                return ((x170) this.f111826b).f257079b;
            case 26:
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 != null && (k270Var = (k270) zn91.m96523K(bundle2, "parental_controls_model_key", k270.class)) != null) {
                    return k270Var;
                }
                o270 o270Var = ((m270) this.f111826b).f139268b;
                d0n0 d0n0Var = o270Var.f160957a;
                return new k270(d0n0Var.f44012a, d0n0Var.f44013b, o270Var.f160960d, o270Var.f160961e, o270Var.f160958b, o270Var.f160959c);
            case 27:
                Bundle bundle3 = (Bundle) obj;
                ss51 ss51Var = ((s270) this.f111826b).f204917c;
                if (bundle3 == null) {
                    return new uym0(ss51Var.f213492a, ss51Var.f213497f);
                }
                uym0 uym0Var = (uym0) bundle3.getParcelable("model");
                return uym0Var == null ? new uym0(ss51Var.f213492a, ss51Var.f213497f) : uym0Var;
            case 28:
                ((icp) obj).f100858d = new gzy((b670) this.f111826b, null, 9);
                return w2a1.f247311a;
            default:
                return ((m670) this.f111826b).f140401c;
        }
    }
}
