package p204p;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import androidx.compose.p002ui.graphics.ColorFilter;
import com.spotify.music.R;
import com.spotify.recents.uiusecases.singleartworkwithbadge.SingleArtworkWithBadgeView;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class o611 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f162189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o611(Object obj, int i) {
        super(1);
        this.f162188a = i;
        this.f162189b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fiz yskVar;
        int i = 9;
        int i2 = 27;
        int i3 = 6;
        int i4 = 4;
        int i5 = 1;
        Long lValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (this.f162188a) {
            case 0:
                a1c1 a1c1Var = a1c1.f11382a;
                ntd0 ntd0Var = (ntd0) this.f162189b;
                a1c1Var.getClass();
                lpz0 lpz0Var = a1c1.f11384c;
                qr60 qr60Var = a1c1.f11383b[0];
                lpz0Var.getClass();
                ((mpz0) obj).mo62511a(lpz0Var, ntd0Var);
                return w2a1.f247311a;
            case 1:
                b811 b811Var = (b811) obj;
                bmh bmhVar = (bmh) this.f162189b;
                String strM49210j = hyv.m49210j(b811Var.f24453a);
                yea0 yea0Var = b811Var.f24458f;
                rv01 rv01Var = b811Var.f24456d;
                if ((rv01Var instanceof av01) && (yea0Var == null || (yea0Var.f271952a instanceof uea0))) {
                    yskVar = new nzx0(new ld01((Object) bmhVar, (Object) new tv01(strM49210j, b811Var.f24455c, i4), (fbk) (objArr2 == true ? 1 : 0), 6));
                } else {
                    yskVar = new ysk(pug1.m71090v(rv01Var, yea0Var), i2);
                }
                return new zux(yskVar, ((gmx) bmhVar.f28527c).f81493a, new jl0(3, 19, objArr == true ? 1 : 0), i5);
            case 2:
                ajo ajoVar = (ajo) obj;
                clq0 clq0Var = (clq0) this.f162189b;
                ajoVar.m26168a(((aon) clq0Var.f39340b).m26610a("clip-playback-handler"));
                ajoVar.m26168a((hof) clq0Var.f39342d);
                return w2a1.f247311a;
            case 3:
                wh11 wh11Var = (wh11) this.f162189b;
                int iOrdinal = ((yg11) obj).ordinal();
                if (iOrdinal == 0) {
                    wh11Var.f251226a.invoke(jh11.f112310a);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wh11Var.f251226a.invoke(kh11.f122499a);
                }
                return w2a1.f247311a;
            case 4:
                mi11 mi11Var = (mi11) obj;
                ri11 ri11Var = (ri11) this.f162189b;
                return uyg1.m84236y(new ji11((ebf0) ri11Var.f199418a.getValue(), null, gbu.f78413a), mi11Var, ri11Var.f199422e, ri11Var.f199427t != null ? f2h1.m40598m(mi11Var.m61810a()) : 0);
            case 5:
                String str = (String) obj;
                k5m0 k5m0Var = ((bm11) this.f162189b).f28352D1;
                if (k5m0Var != null) {
                    k5m0.m55541i(k5m0Var, str, null, null, false, 14);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("pageActivityNavigator");
                throw null;
            case 6:
                ((icp) obj).f100858d = new e1n0((qce0) this.f162189b, objArr3 == true ? 1 : 0, 8);
                return w2a1.f247311a;
            case 7:
                return ((qwf) ((oo11) this.f162189b).f167444e).mo26174a(null);
            case 8:
                if (kp11.f124955a[((lp11) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                w4k0 w4k0Var = (w4k0) this.f162189b;
                ybn ybnVar = (ybn) w4k0Var.f247844c;
                kv91 kv91Var = (kv91) ybnVar.f271220c;
                gag0 gag0Var = (gag0) ybnVar.f271219b;
                yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("discover_more", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                ((z9j0) w4k0Var.f247843b).mo63651f(new p6j0("spotify:find", "", false, false, 0, 0, true, null, null, new n6j0(kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:find")), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null))));
                return w2a1.f247311a;
            case 9:
                return new k701(Integer.valueOf(R.string.campfire_setting_show_suggestions_dialog_title), Integer.valueOf(R.string.campfire_setting_show_suggestions_dialog_message), Integer.valueOf(R.string.campfire_setting_show_suggestions_dialog_confirm), new vak0(this.f162189b, (fbk) (objArr4 == true ? 1 : 0), 26), new j701(new f6w0(i4, i4), new jhy0(i, si11.f209331a1), i401.f98384c));
            case 10:
                return new k701(Integer.valueOf(R.string.campfire_setting_show_up_in_suggestions_dialog_title), Integer.valueOf(R.string.campfire_setting_show_up_in_suggestions_dialog_message), Integer.valueOf(R.string.campfire_setting_show_up_in_suggestions_dialog_confirm), new vak0(this.f162189b, (fbk) (objArr5 == true ? 1 : 0), i2), new j701(new f6w0(5, i4), new jhy0(i, xr11.f265223d), i401.f98384c));
            case 11:
                bu11 bu11Var = (bu11) obj;
                au11 au11Var = (au11) this.f162189b;
                Object value = au11Var.f19811a.f42642Y.getValue();
                if (value != null) {
                    return ybg1.m93284u(bu11Var, new r2y((ebf0) value, null, null, null, Boolean.FALSE, null, 1, null), au11Var.f19814d, au11Var.f19798N0);
                }
                throw new IllegalArgumentException("No metadata when initializing ShowcaseElement");
            case 12:
                ((cqx) obj).m33646a(((bu11) this.f162189b).f30992i, lar0.class, false);
                return w2a1.f247311a;
            case 13:
                ((iu11) this.f162189b).getClass();
                return (Map) xr11.f265226g.invoke((gt11) obj);
            case 14:
                ((wga) ((twz0) this.f162189b).f224528e).invoke((String) obj);
                return w2a1.f247311a;
            case 15:
                return (Map) ((uu11) this.f162189b).f234079s.invoke((ht11) obj);
            case 16:
                dv11 dv11Var = (dv11) this.f162189b;
                kv91 kv91Var2 = (kv91) dv11Var.f53340a.get();
                st91 st91Var = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-settings-shuffle";
                yt91VarM50626j.f276052f = "0.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91 yt91VarM96903c2 = yt91VarM50626j.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("algorithm_section", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("learn_more_link", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/shuffle-play/")), yt91VarM96903c3.m94607a(), st91Var, System.currentTimeMillis()), null);
                v0y.m84416d((v0y) dv11Var.f53341b.get(), "https://support.spotify.com/article/shuffle-play/", false, 6);
                return w2a1.f247311a;
            case 17:
                mqq0 mqq0Var = (mqq0) obj;
                pv11 pv11Var = (pv11) this.f162189b;
                if (mqq0Var.equals(lqq0.f136117b)) {
                    z9j0 z9j0Var = pv11Var.f181574Y1;
                    if (z9j0Var == null) {
                        wj50.m88260d0("navigator");
                        throw null;
                    }
                    z9j0Var.mo47346g(p5j.f174177a);
                    pv11Var.dismiss();
                } else {
                    if (!mqq0Var.equals(lqq0.f136116a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tk80 tk80Var = pv11Var.f181573X1;
                    if (tk80Var == null) {
                        wj50.m88260d0("contentViewBinder");
                        throw null;
                    }
                    tk80Var.m81001a();
                    pv11Var.dismiss();
                }
                return w2a1.f247311a;
            case 18:
                ((Number) obj).intValue();
                return ((zw11) this.f162189b).f286879d.mo24361d();
            case 19:
                boolean zMo24641c = ((mx11) this.f162189b).f147930g.mo24641c();
                boolean zBooleanValue = ((Boolean) ((hx11) obj).f96115b.getValue()).booleanValue();
                lau lauVar = lau.f131415a;
                xhy0 xhy0Var = new xhy0();
                xhy0Var.f261731a = 0;
                return new ix11(lauVar, false, zMo24641c, zBooleanValue, xhy0Var);
            case 20:
                ((icp) obj).f100858d = new r4w0((pas0) this.f162189b, objArr6 == true ? 1 : 0, i3);
                return w2a1.f247311a;
            case 21:
                ((b621) this.f162189b).m49699V0().setTitle((String) obj);
                return w2a1.f247311a;
            case 22:
                return ((kju) ((oo11) this.f162189b).f167444e).mo26174a(null);
            case 23:
                fdx0 fdx0Var = (fdx0) obj;
                rc21 rc21Var = (rc21) this.f162189b;
                fdx0Var.m41390m(rc21Var.f197696M0);
                fdx0Var.m41391o(rc21Var.f197697N0);
                fdx0Var.m41380b(rc21Var.f197698O0);
                fdx0Var.m41396v(rc21Var.f197699P0);
                fdx0Var.m41397w(rc21Var.f197700Q0);
                fdx0Var.m41392p(rc21Var.f197701R0);
                fdx0Var.m41387i(0.0f);
                fdx0Var.m41388k(0.0f);
                fdx0Var.m41389l(rc21Var.f197702S0);
                fdx0Var.m41383e(rc21Var.f197703T0);
                fdx0Var.m41395u(rc21Var.f197704U0);
                fdx0Var.m41393r(rc21Var.f197705V0);
                fdx0Var.m41384f(rc21Var.f197706W0);
                fdx0Var.m41386h(null);
                fdx0Var.m41381c(rc21Var.f197707X0);
                fdx0Var.m41394s(rc21Var.f197708Y0);
                fdx0Var.m41385g(rc21Var.f197709Z0);
                fdx0Var.m41382d(rc21Var.f197710a1);
                ColorFilter colorFilter = rc21Var.f197711b1;
                if (!wj50.m88271j(fdx0Var.f68600T0, colorFilter)) {
                    fdx0Var.f68606a |= 262144;
                    fdx0Var.f68600T0 = colorFilter;
                }
                return w2a1.f247311a;
            case 24:
                m0r m0rVar = (m0r) obj;
                e3f collectionDrawableProvider = ((SingleArtworkWithBadgeView) this.f162189b).getCollectionDrawableProvider();
                if (collectionDrawableProvider != null) {
                    return ((g3f) collectionDrawableProvider).m43486b(m0rVar);
                }
                na6.m63971s("CollectionDrawableProvider not set");
                return new ColorDrawable(0);
            case 25:
                oe21 oe21Var = (oe21) this.f162189b;
                if (((kme) obj) instanceof lme) {
                    ((wy3) oe21Var.f164324a).getClass();
                    lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
                }
                oe21Var.f164326c = lValueOf;
                return w2a1.f247311a;
            case 26:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    zv41 zv41Var = ((bh21) this.f162189b).f27064g;
                    m7z m7zVar = new m7z(th);
                    zv41Var.getClass();
                    zv41Var.m97091m(null, m7zVar);
                }
                Object obj2 = bh21.f27057k;
                bh21 bh21Var = (bh21) this.f162189b;
                synchronized (obj2) {
                    bh21.f27056j.remove(bh21Var.m29191c().getAbsolutePath());
                }
                return w2a1.f247311a;
            case 27:
                Resources resources = ((wo8) this.f162189b).f253399b.getResources();
                return new qo41(resources.getString(R.string.skip_limit_upsell_title), resources.getString(R.string.skip_limit_upsell_subtitle), resources.getString(R.string.skip_limit_upsell_explore_premium), resources.getString(R.string.skip_limit_upsell_dismiss));
            case 28:
                pjf1.m70155l((icp) obj, new la01((cn21) this.f162189b, 18));
                return w2a1.f247311a;
            default:
                ((icp) obj).f100858d = new fop0(this.f162189b, (fbk) (objArr7 == true ? 1 : 0), 15);
                return w2a1.f247311a;
        }
    }
}
