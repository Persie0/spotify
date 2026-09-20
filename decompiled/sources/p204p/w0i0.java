package p204p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class w0i0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f246743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0i0(Object obj, int i) {
        super(0);
        this.f246742a = i;
        this.f246743b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i;
        Object yskVar;
        switch (this.f246742a) {
            case 0:
                return ((p0i0) ((wg61) ((y0i0) this.f246743b).f267989b).getValue()).m68703c(Map.class);
            case 1:
                x3i0 x3i0Var = (x3i0) this.f246743b;
                gh00 gh00Var = x3i0Var.f257819L0;
                if (gh00Var != null) {
                    gh00Var.invoke(new v3i0(x3i0Var.getNumSelectedItems()));
                }
                return w2a1.f247311a;
            case 2:
                return ((srm) ((ik40) this.f246743b).f103011g).m79118a();
            case 3:
                ddi0 ddi0Var = (ddi0) this.f246743b;
                try {
                    Activity activity = ddi0Var.f47831a;
                    Activity activity2 = ddi0Var.f47831a;
                    ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity2.getComponentName(), 0);
                    String str = activityInfo.targetActivity;
                    if (str != null && !wl51.m88460J0(str)) {
                        return new ComponentName(activity2, activityInfo.targetActivity);
                    }
                    return null;
                } catch (PackageManager.NameNotFoundException e) {
                    na6.m63959g("Activity not resolved", e);
                    return null;
                }
            case 4:
                kvu kvuVar = kvu.f126953c;
                oyp0 oyp0Var = (oyp0) ((z9p) this.f246743b).f280843b;
                switch (((mlq0) ((hvj0) oyp0Var.f171833c).f95743b).m62242d()) {
                    case CONTROL:
                        i = R.string.premium_destination_tab_title_premium;
                        break;
                    case UPGRADE:
                        i = R.string.premium_destination_tab_title_upgrade;
                        break;
                    case GET_PREMIUM:
                        i = R.string.premium_destination_tab_title_get_premium;
                        break;
                    case TRY_PREMIUM:
                        i = R.string.premium_destination_tab_title_try_premium;
                        break;
                    case SUBSCRIBE:
                        i = R.string.premium_destination_tab_title_subscribe;
                        break;
                    case PLANS:
                        i = R.string.premium_destination_tab_title_plans;
                        break;
                    case PREMIUM_PLANS:
                        i = R.string.premium_destination_tab_title_premium_plans;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new wei0(kvuVar, Integer.valueOf(i).intValue(), xoc1.f264033Z1, new y3j0(zei0.f282042h, d3i0.f44898V0, hzh0.f96952i), t5j0.f217311d, Collections.singleton(k0e1.f118017X), bzf1.m31029u(nxf1.m65828g(new mep0(oyp0Var, null, 7)), kk40.m56661c(xsr.f265652b), hf11.m47320a(3, 0L), Boolean.FALSE), 64);
            case 5:
                cfi0 cfi0Var = (cfi0) this.f246743b;
                wei0 wei0Var = cfi0Var.f37383b;
                z3j0 z3j0VarM32655a = wei0Var != null ? cfi0.m32655a(cfi0Var, wei0Var) : null;
                wei0 wei0Var2 = cfi0Var.f37384c;
                z3j0 z3j0VarM32655a2 = wei0Var2 != null ? cfi0.m32655a(cfi0Var, wei0Var2) : null;
                wei0 wei0Var3 = cfi0Var.f37385d;
                z3j0 z3j0VarM32655a3 = wei0Var3 != null ? cfi0.m32655a(cfi0Var, wei0Var3) : null;
                wei0 wei0Var4 = cfi0Var.f37386e;
                z3j0 z3j0VarM32655a4 = wei0Var4 != null ? cfi0.m32655a(cfi0Var, wei0Var4) : null;
                wei0 wei0Var5 = cfi0Var.f37387f;
                return new c4j0(z3j0VarM32655a, z3j0VarM32655a2, z3j0VarM32655a3, z3j0VarM32655a4, wei0Var5 != null ? cfi0.m32655a(cfi0Var, wei0Var5) : null);
            case 6:
                efi0 efi0Var = (efi0) this.f246743b;
                nuu0 nuu0Var = efi0Var.f59054b.f247848b;
                oyp0 oyp0Var2 = efi0Var.f59055c;
                fbk fbkVar = null;
                if (((lmq0) oyp0Var2.f171834d).f135007a.m62240b()) {
                    rwx0 rwx0Var = (rwx0) ((qwx0) oyp0Var2.f171832b);
                    yskVar = g0g1.m43302g(k0e1.m54985d(rwx0Var.f203428a.map(mmq0.f145218b).distinctUntilChanged()), k0e1.m54985d(rwx0Var.m76590a("payment-state", "").map(a7j0.f13081h)), k0e1.m54985d(!((mlq0) ((iry0) oyp0Var2.f171835e).f105071b).m62241c() ? Observable.just(Boolean.FALSE) : rwx0Var.m76590a("tablet-free", "false").map(blr0.f28252R0).onErrorReturnItem(Boolean.FALSE).distinctUntilChanged()), new zri(4, 3, fbkVar));
                } else {
                    yskVar = new ysk(Boolean.FALSE, 27);
                }
                return new zux(nuu0Var, yskVar, new sgp(efi0Var, fbkVar, 1), 1);
            case 7:
                tfi0 tfi0Var = (tfi0) this.f246743b;
                return tfi0Var.f219992U1.mo28243l(tfi0Var);
            case 8:
                agi0 agi0Var = (agi0) this.f246743b;
                lv31 lv31VarEdit = ((cb41) agi0Var.f15409c).f36009a.edit();
                lv31VarEdit.m60053f(cb41.f36007c);
                lv31VarEdit.m60053f(cb41.f36008d);
                lv31VarEdit.m60054g();
                fb41 fb41Var = agi0Var.f15408b;
                qlg1.m73214s(fb41Var.f67721i.f35578a, null);
                fb41Var.f67723k.m60129c();
                d501 d501VarM36181a = fb41Var.f67713a.m36181a();
                if (d501VarM36181a != null) {
                    wia wiaVar = (wia) d501VarM36181a.f45295b;
                    Context context = wiaVar.f251588d;
                    irt0 irt0Var = new irt0(context, 10);
                    irt0Var.f105055i = context;
                    wiaVar.f251590f.m94761g(irt0Var);
                }
                return w2a1.f247311a;
            case 9:
                z63 z63Var = (z63) this.f246743b;
                d8n d8nVar = (d8n) z63Var.f279686d;
                z9j0 z9j0Var = (z9j0) z63Var.f279687e;
                d8nVar.getClass();
                return new cjc0(new k98(z9j0Var, 5), new ybi0(z63Var, 3));
            case 10:
                ohi0 ohi0Var = (ohi0) this.f246743b;
                bji bjiVar = ohi0Var.f165469c;
                if (bjiVar != null) {
                    return (ohi0) bjiVar.mo29483e(new c3f(ohi0Var, 20));
                }
                return null;
            case 11:
                vhi0 vhi0Var = (vhi0) this.f246743b;
                bji bjiVar2 = vhi0Var.f241527b;
                if (bjiVar2 != null) {
                    return (vhi0) bjiVar2.mo29483e(new c3f(vhi0Var, 21));
                }
                return null;
            case 12:
                whi0 whi0Var = (whi0) this.f246743b;
                bji bjiVar3 = whi0Var.f251357b;
                if (bjiVar3 != null) {
                    return (whi0) bjiVar3.mo29483e(new c3f(whi0Var, 22));
                }
                return null;
            case 13:
                xhi0 xhi0Var = (xhi0) this.f246743b;
                bji bjiVar4 = xhi0Var.f261651w0;
                if (bjiVar4 != null) {
                    return (xhi0) bjiVar4.mo29483e(new c3f(xhi0Var, 23));
                }
                return null;
            case 14:
                aii0 aii0Var = (aii0) this.f246743b;
                bji bjiVar5 = aii0Var.f15996e;
                if (bjiVar5 != null) {
                    return (aii0) bjiVar5.mo29483e(new c3f(aii0Var, 24));
                }
                return null;
            case 15:
                eii0 eii0Var = (eii0) this.f246743b;
                bji bjiVar6 = eii0Var.f59892b;
                if (bjiVar6 != null) {
                    return (eii0) bjiVar6.mo29483e(new c3f(eii0Var, 25));
                }
                return null;
            case 16:
                return (rjc) ((RetrofitMaker) ((vxx) this.f246743b).f245849b).createWebgateService(rjc.class, "music-quiz-npv-share");
            case 17:
                return new d8y(((pli0) this.f246743b).f178746a);
            case 18:
                i0d i0dVar = (i0d) ((xmi0) this.f246743b).f263380b.f88731a.f247852b;
                voc1 voc1VarM58014g = ((l3n) i0dVar.f97204b).m58014g();
                ven venVar = (ven) i0dVar.f97205c;
                otn otnVar = venVar.f240774b;
                oj81 oj81Var = (oj81) otnVar.f169758i6.get();
                jg31.m53271i(oj81Var);
                bu50 bu50Var = (bu50) i0dVar.f97206d;
                u190 u190Var = bu50Var.f31019a;
                jg31.m53271i(u190Var);
                q831 q831Var = (q831) venVar.f240773a.f211468Ja.get();
                jg31.m53271i(q831Var);
                wek0 wek0Var = (wek0) otnVar.f169521U4.get();
                jg31.m53271i(wek0Var);
                ekn eknVar = (ekn) otnVar.f169610Za.get();
                jg31.m53271i(eknVar);
                cxe cxeVar = new cxe(u190Var, q831Var, wek0Var, eknVar, i0dVar.m49368m());
                ws50 ws50Var = bu50Var.f31023e;
                jg31.m53271i(ws50Var);
                return new gvt(new bjc0(w9h1.m87517y(new wa30(new sef0(voc1VarM58014g, oj81Var, cxeVar, ws50Var, otnVar.m67827C(), i0dVar.m49368m()), ((l3n) i0dVar.f97204b).m58014g()), null, null, 3), wmi0.f252901h));
            case 19:
                gni0 gni0Var = (gni0) this.f246743b;
                return new cjc0(gni0Var.f82720d.m80859a(new fni0(gni0Var.f82717a, gni0Var), new ww0(3, 16, null)), uii0.f230691O0);
            case 20:
                ((zri0) this.f246743b).f285696c.invoke();
                return w2a1.f247311a;
            case 21:
                ((bvi0) this.f246743b).f31371Z.setValue(null);
                return w2a1.f247311a;
            case 22:
                return Integer.valueOf(((lvi0) this.f246743b).f137312S0.getContext().getColor(R.color.default_endless_background));
            case 23:
                uwi0 uwi0Var = (uwi0) this.f246743b;
                ReentrantLock reentrantLock = uwi0Var.f234662b;
                reentrantLock.lock();
                try {
                    uwi0Var.f234661a = null;
                    return w2a1.f247311a;
                } finally {
                    reentrantLock.unlock();
                }
            case 24:
                uyi0 uyi0Var = (uyi0) this.f246743b;
                return new czi0(uyi0Var.f235265a, uyi0Var.f235286v);
            case 25:
                NavHostFragment navHostFragment = (NavHostFragment) this.f246743b;
                Context contextM49717p0 = navHostFragment.m49717p0();
                if (contextM49717p0 == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                uyi0 uyi0Var2 = new uyi0(contextM49717p0);
                uyi0Var2.m84247D(navHostFragment);
                uyi0Var2.m84248E(navHostFragment.mo34134w());
                ygr ygrVar = new ygr(navHostFragment.m49702X0(), navHostFragment.m49716o0());
                eaj0 eaj0Var = uyi0Var2.f235286v;
                eaj0Var.m38301a(ygrVar);
                Context contextM49702X0 = navHostFragment.m49702X0();
                c700 c700VarM49716o0 = navHostFragment.m49716o0();
                int i2 = navHostFragment.f98684W0;
                if (i2 == 0 || i2 == -1) {
                    i2 = R.id.nav_host_fragment_container;
                }
                eaj0Var.m38301a(new u700(contextM49702X0, c700VarM49716o0, i2));
                Bundle bundleM41108a = ((f9y0) navHostFragment.f98721u1.f136904c).m41108a("android-support-nav:fragment:navControllerState");
                if (bundleM41108a != null) {
                    uyi0Var2.m84270y(bundleM41108a);
                }
                ((f9y0) navHostFragment.f98721u1.f136904c).m41110c("android-support-nav:fragment:navControllerState", new kwr(uyi0Var2, 2));
                Bundle bundleM41108a2 = ((f9y0) navHostFragment.f98721u1.f136904c).m41108a("android-support-nav:fragment:graphId");
                if (bundleM41108a2 != null) {
                    navHostFragment.f1153C1 = bundleM41108a2.getInt("android-support-nav:fragment:graphId");
                }
                ((f9y0) navHostFragment.f98721u1.f136904c).m41110c("android-support-nav:fragment:graphId", new kwr(navHostFragment, 3));
                int i3 = navHostFragment.f1153C1;
                wg61 wg61Var = uyi0Var2.f235263C;
                if (i3 != 0) {
                    uyi0Var2.m84246C(((czi0) wg61Var.getValue()).m34452b(i3), null);
                } else {
                    Bundle bundle = navHostFragment.f98701f;
                    int i4 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i4 != 0) {
                        uyi0Var2.m84246C(((czi0) wg61Var.getValue()).m34452b(i4), bundle2);
                    }
                }
                return uyi0Var2;
            case 26:
                ((v5j0) this.f246743b).m84730c();
                return w2a1.f247311a;
            case 27:
                return new fin0(new noa0(1, (MobiusLoop) ((w6j0) this.f246743b).f248409h.getValue(), MobiusLoop.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0, 0, 17));
            case 28:
                ((z9j0) ((s8j0) this.f246743b).f206660f).mo47345e();
                return w2a1.f247311a;
            default:
                return (ll61) ((daj0) this.f246743b).f47058e.get();
        }
    }
}
