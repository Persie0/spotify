package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class vj7 extends i500 {

    /* JADX INFO: renamed from: A1 */
    public final nc5 f241883A1;

    /* JADX INFO: renamed from: B1 */
    public gj11 f241884B1;

    /* JADX INFO: renamed from: C1 */
    public hj11 f241885C1;

    /* JADX INFO: renamed from: D1 */
    public b5t0 f241886D1;

    /* JADX INFO: renamed from: E1 */
    public if0 f241887E1;

    /* JADX INFO: renamed from: F1 */
    public uc3 f241888F1;

    /* JADX INFO: renamed from: G1 */
    public nrl f241889G1;

    /* JADX INFO: renamed from: H1 */
    public fiz f241890H1;

    /* JADX INFO: renamed from: I1 */
    public ubq0 f241891I1;

    /* JADX INFO: renamed from: J1 */
    public v1e f241892J1;

    /* JADX INFO: renamed from: K1 */
    public prl f241893K1;

    /* JADX INFO: renamed from: L1 */
    public zaq0 f241894L1;

    /* JADX INFO: renamed from: M1 */
    public vo50 f241895M1;

    /* JADX INFO: renamed from: N1 */
    public mab0 f241896N1;

    /* JADX INFO: renamed from: P1 */
    public fuo f241898P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f241899Q1;

    /* JADX INFO: renamed from: R1 */
    public final a500 f241900R1;

    /* JADX INFO: renamed from: S1 */
    public final a500 f241901S1;

    /* JADX INFO: renamed from: O1 */
    public final CompositeDisposable f241897O1 = new CompositeDisposable();

    /* JADX INFO: renamed from: T1 */
    public int f241902T1 = 1;

    public vj7(nc5 nc5Var) {
        this.f241883A1 = nc5Var;
        int i = 0;
        this.f241900R1 = (a500) mo34131f0(new qj7(this, i), new o5m0(5));
        this.f241901S1 = (a500) mo34131f0(new uj7(this, i), new o5m0(5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h1 */
    public static final Object m85745h1(vj7 vj7Var, ibk ibkVar) {
        sj7 sj7Var;
        if (ibkVar instanceof sj7) {
            sj7Var = (sj7) ibkVar;
            int i = sj7Var.f209767c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj7Var.f209767c = i - Integer.MIN_VALUE;
            } else {
                sj7Var = new sj7(vj7Var, ibkVar);
            }
        } else {
            sj7Var = new sj7(vj7Var, ibkVar);
        }
        Object objM86755t = sj7Var.f209765a;
        int i2 = sj7Var.f209767c;
        String str = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                fiz fizVar = vj7Var.f241890H1;
                if (fizVar == null) {
                    wj50.m88260d0("sessionRuntimeDependencies");
                    throw null;
                }
                ysk yskVarM46157w = gyf1.m46157w(new pv4(fizVar, 13), jwg1.m54449D(1, ils.SECONDS));
                sj7Var.f209767c = 1;
                objM86755t = vyf1.m86755t(yskVarM46157w, sj7Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
            return ((s201) objM86755t).f204870a;
        } catch (TimeoutCancellationException unused) {
            ubq0 ubq0Var = vj7Var.f241891I1;
            if (ubq0Var == null) {
                wj50.m88260d0("preAuthUbiTracker");
                throw null;
            }
            ubq0Var.mo59114a(new pbq0("authenticated", "session_properties_timeout", 12, str));
            return null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f241883A1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_authenticated, viewGroup, false);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f241897O1.m23396g();
        this.f98702f1 = true;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        bundle.putBoolean("onboardingDestination", this.f241899Q1);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        if (bundle == null) {
            String string = m49701W0().getString("referringDeeplink");
            if (hc1.m47087p(string) == null && string != null && string.length() != 0) {
                this.f241898P1 = new fuo(string, m49701W0().getString("referrer"));
            }
        } else {
            this.f241899Q1 = bundle.getBoolean("onboardingDestination");
        }
        x0h1.m89578u(n5h1.m63737m(this), null, 0, new jr4(this, null, 18), 3);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m85746i1() {
        Single singleOnErrorReturnItem;
        if (m49701W0().getBoolean("isAfterRegistration")) {
            m85748k1();
            return;
        }
        zaq0 zaq0Var = this.f241894L1;
        if (zaq0Var == null) {
            wj50.m88260d0("postAuthenticationAccountSelectionProvider");
            throw null;
        }
        zaq0Var.f281108e.getClass();
        Single singleFlatMap = ((rwx0) zaq0Var.f281104a).f203428a.filter(hsy.f94849c1).map(isy.f105352b1).map(jsy.f115622c1).firstOrError().flatMap(new xuk0(zaq0Var, 17));
        Boolean bool = Boolean.FALSE;
        Single singleOnErrorReturnItem2 = singleFlatMap.onErrorReturnItem(bool);
        gj11 gj11Var = this.f241884B1;
        if (gj11Var == null) {
            wj50.m88260d0("shouldShowAllBoardingAfterLoginUseCase");
            throw null;
        }
        nrl nrlVar = this.f241889G1;
        if (nrlVar == null) {
            wj50.m88260d0("sourceIntentRepository");
            throw null;
        }
        String dataString = nrlVar.m65483c().getDataString();
        gj11Var.f80332c.getClass();
        if (gj11Var.f80331b.m85121s(dataString)) {
            singleOnErrorReturnItem = Single.just(bool);
            wj50.m88279p(singleOnErrorReturnItem);
        } else {
            singleOnErrorReturnItem = ((rwx0) gj11Var.f80330a).m76591b("taste-onboarding-signin-eligible").firstOrError().map(tnq0.f222022L0).onErrorReturnItem(bool);
            wj50.m88279p(singleOnErrorReturnItem);
        }
        this.f241897O1.mo23393b(Single.zip(singleOnErrorReturnItem2, singleOnErrorReturnItem, new qgj0(this, 28)).subscribe(new C2428tu(this, 5)));
    }

    /* JADX INFO: renamed from: j1 */
    public final void m85747j1(pj7 pj7Var) {
        Uri uri;
        int i;
        int iOrdinal = pj7Var.ordinal();
        Map map = null;
        if (iOrdinal == 0) {
            if (m49699V0().getIntent().getBooleanExtra("extra_finish_on_auth", false)) {
                m49699V0().finishAndRemoveTask();
                return;
            }
            b5t0 b5t0Var = this.f241886D1;
            if (b5t0Var == null) {
                wj50.m88260d0("psesApi");
                throw null;
            }
            if ((!b5t0Var.m28202a().f34288k && grg1.m45503r()) || m49699V0().getIntent().getBooleanExtra("skipHomeNavigation", false)) {
                m500 m500VarM49699V0 = m49699V0();
                if (m500VarM49699V0.getIntent().getBooleanExtra("startMainActivityAfterLogin", true)) {
                    m500VarM49699V0.runOnUiThread(new uqf1(6, this, m500VarM49699V0));
                }
                m500VarM49699V0.runOnUiThread(new n10(m500VarM49699V0, 12));
                return;
            }
            if0 if0Var = this.f241887E1;
            if (if0Var != null) {
                if0Var.m50411c(new zzq(this.f241898P1, false, m49701W0().getBoolean("isAfterRegistration"), 2));
                return;
            } else {
                wj50.m88260d0("zeroNavigator");
                throw null;
            }
        }
        a500 a500Var = this.f241900R1;
        if (iOrdinal == 1) {
            if (this.f241894L1 == null) {
                wj50.m88260d0("postAuthenticationAccountSelectionProvider");
                throw null;
            }
            Context contextM49702X0 = m49702X0();
            nrl nrlVar = this.f241889G1;
            if (nrlVar == null) {
                wj50.m88260d0("sourceIntentRepository");
                throw null;
            }
            Intent intentM65483c = nrlVar.m65483c();
            int i2 = AccountSelectionActivity.f4095g1;
            a500Var.mo24737a(zmg1.m96444k(contextM49702X0, intentM65483c));
            m500 m500VarM49715n0 = m49715n0();
            if (m500VarM49715n0 != null) {
                m500VarM49715n0.overridePendingTransition(R.anim.nav_slide_in_right, R.anim.nav_slide_out_left);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            this.f241899Q1 = true;
            uc3 uc3Var = this.f241888F1;
            if (uc3Var == null) {
                wj50.m88260d0("allBoardingIntentBuilder");
                throw null;
            }
            a500Var.mo24737a(uc3Var.m82730a(m49699V0(), EntryPoint.SIGNUP));
            m500 m500VarM49715n1 = m49715n0();
            if (m500VarM49715n1 != null) {
                m500VarM49715n1.overridePendingTransition(R.anim.nav_slide_in_right, R.anim.nav_slide_out_left);
                return;
            }
            return;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ubq0 ubq0Var = this.f241891I1;
        if (ubq0Var == null) {
            wj50.m88260d0("preAuthUbiTracker");
            throw null;
        }
        String str = "authenticated";
        ubq0Var.mo59114a(new qbq0(str, 4, map, "premium_upsell_launched"));
        v1e v1eVar = this.f241892J1;
        if (v1eVar == null) {
            wj50.m88260d0("checkoutWebViewLauncher");
            throw null;
        }
        Context contextM49702X1 = m49702X0();
        mab0 mab0Var = this.f241896N1;
        if (mab0Var == null) {
            wj50.m88260d0("premiumUpsellURI");
            throw null;
        }
        int iM38547C = edb.m38547C(this.f241902T1);
        if (iM38547C == 0) {
            throw new IllegalStateException("Upsell cannot be disabled when trying to start");
        }
        if (iM38547C == 1) {
            uri = Uri.parse("https://spotify.com/signup/welcome-to-spotify");
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uri = Uri.parse("https://spotify.com/signup/your-listening-experience");
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("source", "mobile").appendQueryParameter("forward_url", "https://www.spotify.com/mobile/close").appendQueryParameter("flow_id", ((dt81) mab0Var.f141550b).m36835a()).build();
        uriBuild.toString();
        int iM38547C2 = edb.m38547C(this.f241902T1);
        if (iM38547C2 == 0) {
            throw new IllegalStateException("Upsell cannot be disabled when trying to start");
        }
        if (iM38547C2 == 1) {
            i = R.string.premium_upsell_title_variant_1;
        } else {
            if (iM38547C2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.premium_upsell_title_variant_2;
        }
        this.f241901S1.mo24737a(v1eVar.m84461a(contextM49702X1, new q1e(x0e.f256868b, new l1e(m49722u0(i)), uriBuild)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX INFO: renamed from: k1 */
    public final void m85748k1() {
        pj7 pj7Var;
        if (this.f241902T1 != 1) {
            pj7Var = pj7.f178193d;
        } else {
            b5t0 b5t0Var = this.f241886D1;
            if (b5t0Var == null) {
                wj50.m88260d0("psesApi");
                throw null;
            }
            if (b5t0Var.m28202a().f34286i) {
                pj7Var = pj7.f178190a;
            } else {
                if (this.f241895M1 == null) {
                    wj50.m88260d0("isParentalConsentDeeplinkUseCase");
                    throw null;
                }
                fuo fuoVar = this.f241898P1;
                String strM42742a = fuoVar != null ? fuoVar.m42742a() : null;
                if (strM42742a == null || !wl51.m88496t0(strM42742a, "https://www.spotify.com/account/parental-consent", false)) {
                    hj11 hj11Var = this.f241885C1;
                    if (hj11Var == null) {
                        wj50.m88260d0("shouldShowAllBoardingAfterSignupUseCase");
                        throw null;
                    }
                    nrl nrlVar = this.f241889G1;
                    if (nrlVar == null) {
                        wj50.m88260d0("sourceIntentRepository");
                        throw null;
                    }
                    if (hj11Var.f91940a.m85121s(nrlVar.m65483c().getDataString())) {
                        pj7Var = pj7.f178190a;
                    } else {
                        pj7Var = pj7.f178192c;
                    }
                } else {
                    pj7Var = pj7.f178190a;
                }
            }
        }
        m85747j1(pj7Var);
    }
}
