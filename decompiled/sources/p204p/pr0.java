package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f180458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f180459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr0(int i, Object obj, Object obj2) {
        super(0);
        this.f180457a = i;
        this.f180458b = obj;
        this.f180459c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Type inference failed for: r0v110, types: [p.gh00, p.ri00] */
    /* JADX WARN: Type inference failed for: r0v130, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v65, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        Object obj;
        switch (this.f180457a) {
            case 0:
                kr0 kr0Var = ((wr0) this.f180458b).f254223m;
                fh0 fh0Var = (fh0) this.f180459c;
                kr0.m57130a(kr0Var, jr0.BACK_PRESSED, fh0Var.f69516t, geg1.m44518y(fh0Var.f69506a), null, 52);
                return w2a1.f247311a;
            case 1:
                return new pgj0(((zu0) this.f180458b).m96988u(2), (cxx) ((er70) this.f180459c).get(), 12);
            case 2:
                ((jn6) this.f180458b).f114024c.add((String) this.f180459c);
                return w2a1.f247311a;
            case 3:
                return dvg1.m37116r((jb5) this.f180458b, (bm8) this.f180459c);
            case 4:
                fw8 fw8Var = (fw8) this.f180458b;
                c4d1 c4d1VarM70915a = ((pt8) fw8Var.f74017a).m70915a();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from((Context) this.f180459c);
                c4d1VarM70915a.getClass();
                ajd1 ajd1Var = new ajd1(layoutInflaterFrom);
                ((edd1) c4d1VarM70915a.f33927b).invoke(ajd1Var);
                ViewGroup viewGroupM26152b = ajd1Var.m26152b();
                if (viewGroupM26152b.getParent() != null) {
                    na6.m63957e("Banner factory returned view that already has parent, className=" + qpv0.f191387a.mo54112b(((pt8) fw8Var.f74017a).m70915a().getClass()).mo29110D());
                    ViewParent parent = viewGroupM26152b.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(viewGroupM26152b);
                    }
                }
                return viewGroupM26152b;
            case 5:
                return frz0.m42525j(((ow00) this.f180458b).m68149a((kun0) this.f180459c), jun0.f116125a);
            case 6:
                ((lgb) this.f180458b).f133193b.m54222l((kgb) this.f180459c);
                return w2a1.f247311a;
            case 7:
                flw0 flw0VarM55441a = ((k5k) this.f180458b).m55441a();
                if (flw0VarM55441a != null) {
                    flw0VarM55441a.m42036v();
                }
                ((gh00) this.f180459c).invoke(i5k.f98979a);
                return w2a1.f247311a;
            case 8:
                ((n6q) this.f180458b).f150939d.remove((qe70) this.f180459c);
                return w2a1.f247311a;
            case 9:
                fin finVar = (fin) this.f180458b;
                fin.m41751a(finVar).m82537j();
                ((le5) fin.m41752b(finVar)).m58774a(zas0.NATIVE);
                ((xba) ((pdt) this.f180459c)).dismiss();
                return w2a1.f247311a;
            case 10:
                return Integer.valueOf(((List) ((si20) u010.m82078b((u010) this.f180458b)).invoke()).indexOf((dvt) this.f180459c));
            case 11:
                ((fx70) this.f180458b).f74286a = true;
                return ((qe70) this.f180459c).invoke();
            case 12:
                ((nj7) this.f180458b).mo61930a();
                return s1h1.m76973n((jx70) this.f180459c);
            case 13:
                ((gb80) this.f180458b).mo31988d((C2531wf) this.f180459c);
                return w2a1.f247311a;
            case 14:
                ?? r2 = this.f180458b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(r2, 10));
                int i = 0;
                for (Object obj2 : r2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str = (String) obj2;
                    wj50.m88279p(str);
                    if (i >= 0) {
                        ?? r5 = this.f180459c;
                        if (i < r5.size()) {
                            obj = r5.get(i);
                        } else {
                            obj = -1;
                        }
                    } else {
                        obj = -1;
                    }
                    arrayList.add(new ut80(str, ((Number) obj).intValue()));
                    i = i2;
                }
                return arrayList;
            case 15:
                mu80 mu80Var = (mu80) this.f180458b;
                k2t0 k2t0Var = mu80Var.f147268b;
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) this.f180459c;
                return qu80.m73886a(((ge00) k2t0Var).m44440b(playlistGetResponse.m97673o()), Integer.valueOf(mu80.m62838c(mu80Var, playlistGetResponse.m97674q())));
            case 16:
                ((eh00) this.f180458b).invoke();
                ((rxa0) this.f180459c).m76611b().invoke();
                return w2a1.f247311a;
            case 17:
                gh00 gh00Var = (gh00) this.f180459c;
                bwf0 bwf0Var = (bwf0) this.f180458b;
                if (bwf0Var.m30687c()) {
                    gh00Var.invoke(wvf0.f255488a);
                } else if (bwf0Var.m30686b()) {
                    gh00Var.invoke(wvf0.f255489b);
                } else if (bwf0Var.m30685a()) {
                    gh00Var.invoke(wvf0.f255491d);
                } else {
                    gh00Var.invoke(wvf0.f255490c);
                }
                return w2a1.f247311a;
            case 18:
                edi0 edi0Var = (edi0) this.f180458b;
                Context context = (Context) this.f180459c;
                edi0Var.getClass();
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    wj50.m88279p(packageInfo);
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new AssertionError(edb.m38566o("Could not load package or application info for package ", edi0Var.f58523a, ": ", e.getMessage()));
                }
            case 19:
                ((LinkedHashSet) this.f180458b).add(new y2k0(((pj31) this.f180459c).f178135b, 1));
                return w2a1.f247311a;
            case 20:
                vh00 vh00Var = (vh00) this.f180458b;
                fcm0 fcm0Var = (fcm0) this.f180459c;
                return (obm0) vh00Var.mo24510D0(fcm0Var.f68148b, fcm0Var.f68156j, fcm0Var.f68147a);
            case 21:
                ((jfm0) this.f180458b).mo31539c((u0p) this.f180459c);
                return w2a1.f247311a;
            case 22:
                return (q4k) ((ri00) this.f180458b).invoke((qno0) this.f180459c);
            case 23:
                ViewGroup viewGroup2 = (ViewGroup) this.f180458b;
                wj50.m88279p(viewGroup2);
                rh10 rh10VarM80816b = th10.m80816b(viewGroup2.getContext(), viewGroup2);
                ll9 ll9Var = (ll9) this.f180459c;
                sh10 sh10Var = (sh10) rh10VarM80816b;
                sh10Var.getView().setBackground(null);
                ll9.m59302a(ll9Var).addView(sh10Var.getView());
                return sh10Var;
            case 24:
                kqi0 kqi0Var = (kqi0) this.f180459c;
                aa71 aa71VarM51585i = isu0.m51585i(kqi0Var);
                if (aa71VarM51585i != null) {
                    ((gl40) this.f180458b).m45087b(aa71VarM51585i);
                    isu0.m51584h(kqi0Var);
                }
                return w2a1.f247311a;
            case 25:
                ts21 ts21VarM69502i = pas0.m69502i((pas0) this.f180458b);
                st21 st21Var = (st21) this.f180459c;
                tu21 tu21VarM79228b = st21Var.m79228b();
                String strM79227a = st21Var.m79227a();
                MobiusLoop mobiusLoop = ts21VarM69502i.f223196g;
                if (mobiusLoop != null) {
                    mobiusLoop.m15600a(new yt21(strM79227a, tu21VarM79228b));
                }
                return w2a1.f247311a;
            case 26:
                return ((mv31) this.f180458b).m62893n().getString(((fv31) this.f180459c).f73630a, "");
            case 27:
                ((qe70) this.f180458b).invoke((r5y) this.f180459c);
                return w2a1.f247311a;
            default:
                return q681.m72219b((q681) this.f180458b).mo60201a(((ofx) this.f180459c).f164926i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr0(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f180457a = i;
        this.f180458b = obj;
        this.f180459c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pr0(n6q n6qVar, gh00 gh00Var) {
        super(0);
        this.f180457a = 8;
        this.f180458b = n6qVar;
        this.f180459c = (qe70) gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pr0(gh00 gh00Var, r5y r5yVar) {
        super(0);
        this.f180457a = 27;
        this.f180458b = (qe70) gh00Var;
        this.f180459c = r5yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pr0(gh00 gh00Var, qno0 qno0Var) {
        super(0);
        this.f180457a = 22;
        this.f180458b = (ri00) gh00Var;
        this.f180459c = qno0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pr0(fx70 fx70Var, eh00 eh00Var) {
        super(0);
        this.f180457a = 11;
        this.f180458b = fx70Var;
        this.f180459c = (qe70) eh00Var;
    }
}
