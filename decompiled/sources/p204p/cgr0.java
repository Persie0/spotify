package p204p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class cgr0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgr0(Object obj, int i) {
        super(0);
        this.f37780a = i;
        this.f37781b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eh00
    public final Object invoke() {
        String str;
        switch (this.f37780a) {
            case 0:
                return (ofr0) ((egr0) this.f37781b).f59383b.get();
            case 1:
                return ((Observable) ((r6y0) ((mpr0) this.f37781b).f146078a).f196390o.getValue()).startWithItem(new t6y0()).buffer(2, 1).map(snq0.f211009c);
            case 2:
                h3n h3nVar = (h3n) ((qas0) this.f37781b).f186922b.f287630a.f151567b;
                q1x0 q1x0Var = (q1x0) ((nin) h3nVar.f87273b).f154283a.f169716ff.get();
                jg31.m53271i(q1x0Var);
                ras0 ras0Var = (ras0) ((nin) h3nVar.f87273b).f154283a.f169750hf.get();
                jg31.m53271i(ras0Var);
                return new cjc0(new pas0(q1x0Var, ras0Var), bas0.f25305i);
            case 3:
                return ((nbs0) this.f37781b).f152344d.m25127i();
            case 4:
                return new q4k(null, false, false, false, false, false, false, ybg1.m93283t((vu11) this.f37781b), true, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741055);
            case 5:
                return new q4k(null, true, false, false, false, false, false, bcg1.m28717B((hbs0) this.f37781b), false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741557);
            case 6:
                wcs0 wcs0Var = (wcs0) this.f37781b;
                i2h1 i2h1Var = wcs0Var.f250100c;
                if (i2h1Var instanceof nw71) {
                    str = ((nw71) i2h1Var).f159040c;
                } else {
                    if (!(i2h1Var instanceof ow71)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((ow71) i2h1Var).f170666b;
                }
                String str2 = wcs0Var.f250104g;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = wcs0Var.f250107j;
                if (str3 == null) {
                    str3 = wcs0Var.f250103f;
                }
                boolean z = false;
                boolean z2 = false;
                return new q4k(null, true, false, false, false, false, false, new ray(str, str2, null, new cqj0(237, str3, wcs0Var.f250098a, null, z, z2, false), 20), z, z2, 0 == true ? 1 : 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741557);
            case 7:
                return h1k.m46460a(((scs0) this.f37781b).f207791a);
            case 8:
                return ((x9n) ((C2065kt) this.f37781b).f126084g).m90262a(xoc1.f263839A0, false, Mode.PROMPTABLE_SECTION);
            case 9:
                return new cjc0((dut) ((n8n) ((sps0) this.f37781b).f212939f).get(), hds0.f90189S0);
            case 10:
                q831 q831Var = ((vps0) this.f37781b).f243777g;
                Integer numValueOf = Integer.valueOf(R.string.magpie_copied_to_clipboard);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                return w2a1.f247311a;
            case 11:
                return new cjc0(((ozn) ((kqs0) this.f37781b).f125427f).m68652a(), hds0.f90202b1);
            case 12:
                return ((hgc) this.f37781b).f91116b;
            case 13:
                return new cjc0((dut) ((n8n) ((sps0) this.f37781b).f212939f).get(), jqs0.f114998i);
            case 14:
                ((szn) this.f37781b).getClass();
                return new cjc0(new po31(3), jqs0.f114984Y);
            case 15:
                gts0 gts0Var = (gts0) this.f37781b;
                return new cjc0((dut) gts0Var.f84269c.get(), new fts0(gts0Var, 1));
            case 16:
                return ((urq) ((qyy0) this.f37781b).f194059b).f233424a;
            case 17:
                x03 x03Var = (x03) this.f37781b;
                return new hgo((hgc) x03Var.f256788b, new jrs0(x03Var, 6));
            case 18:
                return new cjc0((dut) ((nus0) this.f37781b).f158709b.get(), jqs0.f114980V0);
            case 19:
                return new cjc0((dut) ((yus0) this.f37781b).f276465b.get(), jqs0.f114988a1);
            case 20:
                return new C1873fu((qik) this.f37781b);
            case 21:
                return (ry8) ((kvs0) this.f37781b).f126938a.get();
            case 22:
                rws0 rws0Var = (rws0) this.f37781b;
                return new cjc0((dut) rws0Var.f203407b.get(), new jrs0(rws0Var, 10));
            case 23:
                return ((x9n) ((pk0) this.f37781b).f178338f).m90262a(xoc1.f263839A0, false, Mode.PROMPTABLE_SECTION);
            case 24:
                return new k5t0(new CosmosCoroutineTransport(new if5((CallbackRouter) ((h0a) this.f37781b).f86188a.get(), 27)));
            case 25:
                a8t0 a8t0Var = (a8t0) this.f37781b;
                bji bjiVar = a8t0Var.f13376b;
                if (bjiVar != null) {
                    return (a8t0) bjiVar.mo29483e(new jzn0(a8t0Var, 6));
                }
                return null;
            case 26:
                n8t0 n8t0Var = (n8t0) this.f37781b;
                bji bjiVar2 = n8t0Var.f151622b;
                if (bjiVar2 != null) {
                    return (n8t0) bjiVar2.mo29483e(new jzn0(n8t0Var, 7));
                }
                return null;
            case 27:
                File file = new File(((eet0) this.f37781b).f58848a.getCacheDir(), "push");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file;
            case 28:
                ka2 ka2Var = (ka2) this.f37781b;
                wft0 wft0Var = (wft0) ((uft0) ka2Var.f120758e);
                hv31 hv31Var = wft0Var.f250895e;
                uft0.f229873a.getClass();
                String strMo48710e = hv31Var.mo48710e(tft0.f220047b, "");
                ((strMo48710e == null || strMo48710e.isEmpty()) ? CompletableEmpty.f7437a : wft0Var.f250894d.m25271g(strMo48710e).m23303t(wft0Var.f250896f).m23296h(new ntb(18)).m23295g(new vv2(wft0Var, 10)).m23299p(Functions.f7232h)).subscribe();
                ((dit0) ka2Var.f120755b).cancel();
                ((dit0) ka2Var.f120756c).cancel();
                return w2a1.f247311a;
            default:
                i8g0 i8g0Var = (i8g0) ((tpc) this.f37781b).f222487S0;
                i8g0Var.getClass();
                yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("back_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
