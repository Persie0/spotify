package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class sho extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f209241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sho(Object obj, int i) {
        super(0);
        this.f209240a = i;
        this.f209241b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // p204p.eh00
    public final Object invoke() {
        ?? arrayList;
        switch (this.f209240a) {
            case 0:
                return (ConnectivityManager) ((uho) this.f209241b).f230490a.getSystemService(ConnectivityManager.class);
            case 1:
                vzn vznVar = (vzn) this.f209241b;
                return xtm0.m92074U((fiz) vznVar.f246487b, new eud((fbk) null, vznVar, 12));
            case 2:
                List<rko> list = ((tjo) this.f209241b).f220970a;
                ArrayList arrayList2 = new ArrayList();
                for (rko rkoVar : list) {
                    tko tkoVar = new tko(rkoVar.f200128a, rkoVar.f200129b == 1);
                    wag1 wag1Var = rkoVar.f200131d;
                    if (wag1Var instanceof qko) {
                        List list2 = ((qko) wag1Var).f189625e.f192575a;
                        arrayList = new ArrayList(i6f.m49804T(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new tko(((pu60) it.next()).f181374b, true));
                        }
                    } else {
                        if (!(wag1Var instanceof pko)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList = lau.f131415a;
                    }
                    j6f.m52564V(g6f.m43700N0(arrayList, Collections.singletonList(tkoVar)), arrayList2);
                }
                return arrayList2;
            case 3:
                return new cjc0((k98) ((z13) this.f209241b).f278218c, kko.f123669t);
            case 4:
                noo nooVar = (noo) this.f209241b;
                return new cjc0(nooVar.f156761e.m73847a(nooVar.f156762f), new cxl(nooVar, 15));
            case 5:
                return new cjc0((en2) this.f209241b, kko.f123654Y);
            case 6:
                qoo qooVar = (qoo) this.f209241b;
                bji bjiVar = qooVar.f191021h;
                if (bjiVar != null) {
                    return (qoo) bjiVar.mo29483e(new c3f(qooVar, 7));
                }
                return null;
            case 7:
                fpo fpoVar = (fpo) this.f209241b;
                wy91 wy91Var = fpoVar.f71936b;
                if (wy91Var != null) {
                    return (fpo) wy91Var.mo29483e(new c3f(fpoVar, 8));
                }
                return null;
            case 8:
                ((xto) this.f209241b).f265898c.setValue(Boolean.FALSE);
                return w2a1.f247311a;
            case 9:
                luk lukVar = ((avo) this.f209241b).f20227d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return opo.m67570t(lukVar, x461VarM64613f);
            case 10:
                kvo kvoVar = (kvo) this.f209241b;
                fbk fbkVar = null;
                return mvl0.m62953p(new zux(mvl0.m62955r(new yqi(k0e1.m54985d(((s5p) kvoVar.f126914a).m77297d()), 13), kko.f123646R0, mvl0.f147608b), new vjz(new ysk(new si9(kvoVar.f126915b.m87082c(), 1), 3), new gc0(2, 15, fbkVar)), new ysl(kvoVar, fbkVar, 4), 1));
            case 11:
                x28 x28Var = (x28) this.f209241b;
                return ((Flowable) x28Var.f257387f).m23348j((wu40) ((kc5) x28Var.f257385d).f121372h);
            case 12:
                qxo qxoVar = (qxo) this.f209241b;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((twy) qxoVar.f193719e).f224510b;
                if (!(((sl6) qxoVar.f193718d) instanceof rl6)) {
                    return constraintLayout;
                }
                RoundedConstraintLayout roundedConstraintLayout = new RoundedConstraintLayout(constraintLayout.getContext(), null, 0, 6, null);
                roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                constraintLayout.setMinHeight(qxoVar.f193716b);
                roundedConstraintLayout.addView(constraintLayout);
                roundedConstraintLayout.setCornerRadius(constraintLayout.getContext().getResources().getDimension(R.dimen.rounded_row_corner_radius));
                return roundedConstraintLayout;
            case 13:
                return (gc8) ((er70) ((df8) this.f209241b).f48511b).get();
            case 14:
                return (vh8) ((tzo) this.f209241b).f225277a.get();
            case 15:
                h0p h0pVar = (h0p) this.f209241b;
                return h0pVar.f86325c.mo45277a(h0pVar.f86323a.getResources());
            case 16:
                qzn qznVar = (qzn) this.f209241b;
                ActivityInfo activityInfo = ((ResolveInfo) qznVar.f194230c).activityInfo;
                if (wj50.m88271j(activityInfo != null ? activityInfo.packageName : null, "android")) {
                    return null;
                }
                return ((ResolveInfo) qznVar.f194230c).loadLabel(((Activity) qznVar.f194229b).getPackageManager()).toString();
            case 17:
                return opo.m67570t(((n3p) this.f209241b).f150094d, njg1.m64613f());
            case 18:
                ((jac) this.f209241b).mo47359b();
                return w2a1.f247311a;
            case 19:
                return opo.m67570t(((t3p) this.f209241b).f216817f, njg1.m64613f());
            case 20:
                return opo.m67570t(((w3p) this.f209241b).f247620b, njg1.m64613f());
            case 21:
                vo10 vo10VarM93826a = ((yip) ((x3p) this.f209241b).f257849b.get()).m93826a();
                ro10 ro10Var = vo10VarM93826a instanceof ro10 ? (ro10) vo10VarM93826a : null;
                if (ro10Var != null) {
                    return Long.valueOf(ro10Var.f201038a);
                }
                return null;
            case 22:
                return Boolean.valueOf(((ujh) ((o6p) this.f209241b).f162371b).m83284g());
            case 23:
                ((mmb) this.f209241b).m62298o(0);
                return w2a1.f247311a;
            case 24:
                return opo.m67570t(((l7p) this.f209241b).f130709c, njg1.m64613f());
            case 25:
                Context context = ((w9p) this.f209241b).f249217a;
                Drawable drawable = context.getDrawable(R.drawable.encore_icon_artist);
                if (drawable == null) {
                    throw new IllegalArgumentException("Icon drawable resource must be valid");
                }
                int iM86386m = vtg1.m86386m(context, R.attr.baseTextSubdued, 0);
                int iM86386m2 = vtg1.m86386m(context, R.attr.baseBackgroundElevatedBase, 0);
                drawable.setTint(iM86386m);
                return new s10(drawable, 0.33f, iM86386m2, 2);
            case 26:
                dgl dglVar = new dgl(lbp.f131695h, 1);
                qbp qbpVar = (qbp) this.f209241b;
                return xir.m91157c(xir.m91158d(dglVar, xir.m91155a(new t5p(qbpVar, 3))), xir.m91158d(new dgl(mbp.f141953h, 1), xir.m91155a(new c9a(qbpVar, 29))), xir.m91158d(new dgl(nbp.f152328h, 1), xir.m91155a(new bco(qbpVar, 9))), xir.m91158d(new dgl(obp.f163690h, 1), xir.m91155a(new k1n(qbpVar, 10))), xir.m91158d(new dgl(pbp.f175886h, 1), xir.m91155a(new bzo(qbpVar, 5))), xir.m91158d(new dgl(fbp.f67869h, 1), xir.m91155a(new d9p(qbpVar, 2))), xir.m91158d(new dgl(gbp.f78366h, 1), xir.m91155a(new jwo(qbpVar, 4))), xir.m91158d(new dgl(hbp.f89567h, 1), xir.m91155a(new ibp(qbpVar, 0))), xir.m91158d(new dgl(jbp.f110835h, 1), xir.m91155a(new j3p(qbpVar, 4))), xir.m91158d(new dgl(kbp.f121239h, 1), xir.m91155a(new qro(qbpVar, 6))));
            case 27:
                kc5 kc5Var = (kc5) this.f209241b;
                mb80 mb80Var = (mb80) kc5Var.f121369e;
                xv41 xv41VarAvailable = mb80Var.f141818c.available();
                xv41 xv41VarCurrent = mb80Var.f141817b.current();
                yqi yqiVar = new yqi(k0e1.m54985d(((s5p) ((voi) kc5Var.f121366b)).m77299i()), 17);
                boolean zM93291b = ((ybn) kc5Var.f121368d).m93291b();
                lau lauVar = lau.f131415a;
                return bzf1.m31029u(gyf1.m46146l(g0g1.m43301f(xv41VarAvailable, xv41VarCurrent, yqiVar, zM93291b ? ((jzo) kc5Var.f121367c).f117766h : new ysk(lauVar, 27), new mk0(kc5Var, null, 8)), 500L), (c9k) kc5Var.f121372h, hf11.m47320a(3, 0L), ((p7o) kc5Var.f121371g).m69290i(lauVar, null, lauVar, lauVar, nau.f152117a, 1));
            case 28:
                return (ggo) this.f209241b;
            default:
                return (bjc0) this.f209241b;
        }
    }
}
