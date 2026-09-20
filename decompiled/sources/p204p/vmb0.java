package p204p;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutFragmentContainerView;
import com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class vmb0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f242753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmb0(Object obj, int i) {
        super(0);
        this.f242752a = i;
        this.f242753b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Boolean, p.fbk] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.uek0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [p.uek0] */
    @Override // p204p.eh00
    public final Object invoke() {
        hv31 hv31Var;
        int i = 18;
        int i2 = 3;
        ?? r4 = 0;
        r4 = 0;
        switch (this.f242752a) {
            case 0:
                wmb0 wmb0Var = (wmb0) this.f242753b;
                return wmb0Var.f252771b.f243033b.m54360d(wmb0Var.f252770a);
            case 1:
                return Boolean.valueOf(!((qnb0) this.f242753b).f190551c.isEmpty());
            case 2:
                float f = 20;
                return Float.valueOf(((float) Math.rint(((uum0) this.f242753b).m84031v() * f)) / f);
            case 3:
                return (kv91) ((tsb0) this.f242753b).f223274a.get();
            case 4:
                return b9m.m28505e(((twb0) this.f242753b).f224401a.getContext());
            case 5:
                return new mxb0((rxb0) this.f242753b);
            case 6:
                return new View(((vxb0) this.f242753b).f245703a.getContext());
            case 7:
                MainLayout mainLayout = ((zxb0) this.f242753b).f287270a;
                MainLayoutFragmentContainerView fragmentContainer = mainLayout.getFragmentContainer();
                ViewGroup fragmentOverlayContainer = mainLayout.getFragmentOverlayContainer();
                Resources resources = mainLayout.getContext().getResources();
                ThreadLocal threadLocal = u1x0.f225931a;
                return new c0m0(fragmentContainer, fragmentOverlayContainer, resources.getColor(R.color.gray_7, null), mainLayout.getContext().getResources().getColor(R.color.opacity_black_70, null));
            case 8:
                ayb0 ayb0Var = (ayb0) this.f242753b;
                er70 er70Var = ayb0Var.f21186a;
                if (!ayb0Var.f21187b) {
                    er70Var = null;
                }
                if (er70Var != null && (hv31Var = (hv31) er70Var.get()) != null) {
                    r4 = (uek0) ayb0.f21185g.get(Integer.valueOf(hv31Var.mo48717l(ayb0.f21183e, -1)));
                }
                if (r4 == 0) {
                    r4 = ayb0.f21184f;
                }
                return jag1.m52819d(r4);
            case 9:
                return b9m.m28505e(((myb0) this.f242753b).f148383a.getContext());
            case 10:
                return ((Activity) ((li80) this.f242753b).f133740b).getString(R.string.settings_item_mainnavigation_example_separator);
            case 11:
                return opo.m67570t(((b0c0) this.f242753b).f21838f, njg1.m64613f());
            case 12:
                ((w5c0) this.f242753b).f248055a.mo47345e();
                return w2a1.f247311a;
            case 13:
                ((b8c0) this.f242753b).f24559a.mo47345e();
                return w2a1.f247311a;
            case 14:
                return (kv91) ((w4n) ((d670) this.f242753b).f45617b).get();
            case 15:
                return new msb1(6, Boolean.valueOf(((g9c0) this.f242753b).f77729e), r4, r4);
            case 16:
                return new msb1(5, r4, Boolean.valueOf(((f9c0) this.f242753b).f67220e), r4);
            case 17:
                return new msb1(i2, r4, r4, Boolean.valueOf(((h9c0) this.f242753b).f88921e));
            case 18:
                return (kv91) ((w4n) ((li80) this.f242753b).f133740b).get();
            case 19:
                smc0 smc0Var = (smc0) this.f242753b;
                bji bjiVar = smc0Var.f210624b;
                if (bjiVar != null) {
                    return (smc0) bjiVar.mo29483e(new c3f(smc0Var, i));
                }
                return null;
            case 20:
                ooc0 ooc0Var = (ooc0) this.f242753b;
                rrc0 rrc0Var = ooc0Var.f167531T1;
                if (rrc0Var == null) {
                    wj50.m88260d0("marqueeUbiLogger");
                    throw null;
                }
                String str = ooc0Var.f167534W1;
                if (str == null) {
                    wj50.m88260d0("adId");
                    throw null;
                }
                rrc0Var.m76285c(3, "https://sponsored-recommendations.spotify.com/", str);
                m500 m500VarM49715n0 = ooc0Var.m49715n0();
                if (m500VarM49715n0 != null) {
                    int i3 = LearnMoreWebActivity.f5430e1;
                    ooc0Var.m49711g1(new Intent(m500VarM49715n0, (Class<?>) LearnMoreWebActivity.class));
                }
                return w2a1.f247311a;
            case 21:
                qrc0 qrc0Var = (qrc0) this.f242753b;
                qrc0Var.f191810i.m72305j(qrc0Var.f191817p);
                return w2a1.f247311a;
            case 22:
                u0d0 u0d0Var = ((s0d0) this.f242753b).f204357k;
                u0d0Var.f225453Y = false;
                u0d0Var.f225454Z = false;
                return w2a1.f247311a;
            case 23:
                return new DispatcherWorker((luk) ((hjb0) this.f242753b).f92009c);
            case 24:
                sdo sdoVar = (sdo) this.f242753b;
                Single singleCompose = Single.create(new zi5(8)).compose(isy.f105333M0);
                nlv0 nlv0Var = new nlv0();
                return ((BehaviorSubject) sdoVar.f208051e).debounce(1000L, TimeUnit.MILLISECONDS, (Scheduler) sdoVar.f208050d).observeOn((Scheduler) sdoVar.f208049c).distinctUntilChanged((BiPredicate) new w090(new lgc(nlv0Var, 2), 12)).switchMap(new li80(singleCompose, sdoVar, nlv0Var, i));
            case 25:
                ((z04) this.f242753b).run();
                return w2a1.f247311a;
            case 26:
                jhd0 jhd0Var = (jhd0) this.f242753b;
                dhd0 dhd0Var = jhd0Var.m53397m().f79643a;
                dhd0Var.m76119E();
                tnd0 tnd0Var = dhd0Var.f201564x;
                tnd0 tnd0VarM76117C = tnd0Var != null ? dhd0Var.m76117C(tnd0Var) : null;
                if (tnd0VarM76117C == null) {
                    return null;
                }
                jhd0Var.f112404k.getClass();
                return wxi.m89304a(tnd0VarM76117C);
            case 27:
                t0c0 t0c0Var = ((yjd0) this.f242753b).f273348d.f241955c;
                if (t0c0Var != null) {
                    t0c0Var.invoke();
                }
                return w2a1.f247311a;
            case 28:
                ymd0 ymd0Var = (ymd0) this.f242753b;
                c9k c9kVar = ymd0Var.f274231g;
                if (c9kVar != null) {
                    x0h1.m89578u(c9kVar, null, 0, new aab0(ymd0Var, (fbk) r4, 16), 3);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("scope");
                throw null;
            default:
                ((ind0) this.f242753b).mo36151b();
                return w2a1.f247311a;
        }
    }
}
