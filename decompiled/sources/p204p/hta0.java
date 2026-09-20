package p204p;

import android.app.DatePickerDialog;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class hta0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f94967b;

    public /* synthetic */ hta0(Object obj, int i) {
        this.f94966a = i;
        this.f94967b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v58, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v11, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v12, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f94966a;
        nau nauVar = nau.f152117a;
        Object obj = this.f94967b;
        switch (i) {
            case 0:
                ((LoginActivity) obj).mo31751N().m28388d();
                return;
            case 1:
                Consumer consumer = (Consumer) ((q58) ((k0a0) obj).f117948b).f185456b;
                if (consumer != null) {
                    consumer.accept(xcc0.f260203a);
                    return;
                }
                return;
            case 2:
                f3d0 f3d0Var = (f3d0) obj;
                int i2 = f3d0Var.f65476E1;
                if (i2 == 2) {
                    f3d0Var.m40653j1(1);
                    return;
                } else {
                    if (i2 == 1) {
                        f3d0Var.m40653j1(2);
                        return;
                    }
                    return;
                }
            case 3:
                ((k3d0) obj).m55239r1();
                throw null;
            case 4:
                ((DatePickerDialog) obj).show();
                return;
            case 5:
                ((MessageInputView) obj).m3085C();
                return;
            case 6:
                w4k0 w4k0Var = (w4k0) obj;
                ((z9j0) w4k0Var.f247843b).mo47342b(xoc1.f263863D0.f243453a, ((x4j0) w4k0Var.f247844c).m89897n(g2j0.f75967h), null);
                return;
            case 7:
                ((NowPlayingActivity) obj).finish();
                return;
            case 8:
                rni0 rni0Var = ((a8k0) obj).f13319i;
                if (rni0Var != null) {
                    rni0Var.invoke();
                    return;
                }
                return;
            case 9:
                x9n0 x9n0Var = (x9n0) obj;
                TextInputLayout textInputLayout = x9n0Var.f257279a;
                EditText editText = textInputLayout.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (x9n0.m90263d(x9n0Var)) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                textInputLayout.m1650k(textInputLayout.f2214G1, textInputLayout.f2216I1);
                return;
            case 10:
                ((PlayIndicatorView) obj).f2765c.invoke(w2a1.f247311a);
                return;
            case 11:
                ((e0m0) obj).invoke();
                return;
            case 12:
                m500 m500VarM49715n0 = ((bjq0) obj).m49715n0();
                if (m500VarM49715n0 != null) {
                    m500VarM49715n0.finish();
                    return;
                }
                return;
            case 13:
                mjq0 mjq0Var = PremiumCheckoutActivity.f3287m1;
                ((MobiusLoopViewModel) ((PremiumCheckoutActivity) obj).f3293e1.getValue()).m15621f(fkq0.f70582a);
                return;
            case 14:
                p9r0 p9r0Var = p9r0.f175292b;
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) obj;
                u9r0 u9r0Var = previewOverlayView.f3720S0;
                if (u9r0Var instanceof r9r0) {
                    ?? r1 = previewOverlayView.f3723V0;
                    if (r1 != 0) {
                        r1.invoke(p9r0.f175291a);
                        return;
                    }
                    return;
                }
                if (u9r0Var instanceof t9r0) {
                    ?? r2 = previewOverlayView.f3723V0;
                    if (r2 != 0) {
                        r2.invoke(p9r0Var);
                        return;
                    }
                    return;
                }
                if (!wj50.m88271j(u9r0Var, s9r0.f207057a)) {
                    if (!wj50.m88271j(u9r0Var, s9r0.f207058b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    ?? r3 = previewOverlayView.f3723V0;
                    if (r3 != 0) {
                        r3.invoke(p9r0Var);
                        return;
                    }
                    return;
                }
            case 15:
                cxq0 cxq0Var = (cxq0) obj;
                vhs0 vhs0Var = (vhs0) cxq0Var.f43081c;
                kv91 kv91Var = vhs0Var.f241554a;
                xxg0 xxg0Var = vhs0Var.f241555b;
                xxg0Var.getClass();
                yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("onboarding_view", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("cta_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((hz0) cxq0Var.f43080b).accept(mgs0.f143620a);
                return;
            case 16:
                ((gst0) obj).invoke();
                return;
            case 17:
                ((PublishSubject) ((abs0) obj).f14180d).onNext(ppt0.f180104a);
                return;
            case 18:
                C2042k7 c2042k7 = new C2042k7((QuickActionView) obj, 8);
                View view2 = (View) (c2042k7.hasNext() ? c2042k7.next() : null);
                if (view2 != null) {
                    view2.performClick();
                    return;
                }
                return;
            case 19:
                sev0 sev0Var = (sev0) obj;
                aaq0 aaq0Var = sev0Var.f208391a;
                kv91 kv91Var2 = (kv91) aaq0Var.f13908b;
                eag0 eag0Var = (eag0) aaq0Var.f13909c;
                yt91 yt91VarM96903c3 = eag0Var.f57667c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c3.m94607a(), eag0Var.f57666b, System.currentTimeMillis()), null);
                Consumer consumer2 = sev0Var.f208394d;
                if (consumer2 != null) {
                    consumer2.accept(kdv0.f121742a);
                    return;
                }
                return;
            case 20:
                ((y5m0) ((xlc0) obj).f263100d).dismiss();
                return;
            case 21:
                uqw0 uqw0Var = (uqw0) obj;
                InputMethodManager inputMethodManager = (InputMethodManager) ((ConstraintLayout) uqw0Var.f233139a.f146367a).getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((ConstraintLayout) uqw0Var.f233139a.f146367a).getWindowToken(), 0);
                }
                uqw0Var.f233140b.accept(opw0.f168036a);
                return;
            case 22:
                ctw0 ctw0Var = (ctw0) obj;
                m500 m500VarM49715n1 = ctw0Var.m49715n0();
                if (m500VarM49715n1 != null) {
                    m500VarM49715n1.setResult(-1);
                }
                m500 m500VarM49715n2 = ctw0Var.m49715n0();
                if (m500VarM49715n2 != null) {
                    m500VarM49715n2.finish();
                    return;
                }
                return;
            case 23:
                String strM83451s = umg1.m83451s(d6n0.f45731d);
                p2y0 p2y0Var = (p2y0) obj;
                p2y0Var.f173472e.mo47342b(strM83451s, p2y0Var.f173473f.m34702i(strM83451s), null);
                return;
            case 24:
                ((foj) ((ezw0) obj).f64487d).invoke();
                return;
            case 25:
                SearchFragment searchFragment = (SearchFragment) obj;
                searchFragment.m3107i1().m79002s();
                z3z0 z3z0VarM3109k1 = searchFragment.m3109k1();
                mnc1 mnc1Var = (mnc1) z3z0VarM3109k1.f279075j.mo33098e();
                if (mnc1Var != null) {
                    z3z0VarM3109k1.m95298e(mnc1Var.f145397a);
                    return;
                }
                return;
            case 26:
                ?? r4 = ((SeeMoreTextView) obj).f3746t;
                if (r4 != 0) {
                    r4.invoke(abz0.f14209c);
                    return;
                }
                return;
            case 27:
                snz0 snz0Var = (snz0) obj;
                d850 d850VarM56459e = snz0Var.f211059c.m56459e();
                Consumer consumer3 = snz0Var.f211060d;
                if (consumer3 != null) {
                    consumer3.accept(new jnz0(d850VarM56459e));
                    return;
                }
                return;
            case 28:
                hqb hqbVar = (hqb) obj;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith(Boolean.TRUE);
                    return;
                }
                return;
            default:
                ((gh00) ((xq3) obj).f264857b).invoke(u801.f227781b);
                return;
        }
    }
}
