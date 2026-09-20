package p204p;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.artist.creatorartist.ExpandableEllipsizeTextView;
import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ryp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f203943b;

    public /* synthetic */ ryp(Object obj, int i) {
        this.f203942a = i;
        this.f203943b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v19, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        voc1 voc1Var;
        String str;
        int i = this.f203942a;
        nau nauVar = nau.f152117a;
        int i2 = 0;
        Object obj = this.f203943b;
        switch (i) {
            case 0:
                ((j20) ((bzo) obj).f32543b).invoke(t3q0.f216827a);
                return;
            case 1:
                ((tdq) obj).f219456e.invoke(aq81.f18142g);
                return;
            case 2:
                ((lmr) obj).mo38842a();
                return;
            case 3:
                kis kisVar = (kis) obj;
                kis.m56524d(kisVar, (AutoCompleteTextView) kisVar.f257279a.getEditText());
                return;
            case 4:
                ((b7t) obj).invoke(view);
                return;
            case 5:
                trt trtVar = (trt) obj;
                trtVar.m81359r1().mo59114a(new sbq0("samsung_effortless_login_sheet", "samsung_effortless_login_dismissed", n850.f151357c, "none"));
                i6m0 i6m0Var = trtVar.f223111R1;
                if (i6m0Var == null) {
                    wj50.m88260d0("ubiLogger");
                    throw null;
                }
                kbh0 kbh0Var = trtVar.f223112S1;
                if (kbh0Var == null) {
                    wj50.m88260d0("eventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c = kbh0Var.f121205a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                ((zz8) i6m0Var).mo57452p(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                trtVar.dismiss();
                return;
            case 6:
                ((j4v) obj).m83052i1(false, false);
                return;
            case 7:
                ((x60) obj).invoke();
                return;
            case 8:
                Bundle bundle = new Bundle();
                bundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new yiy0(i2, 3));
                ((ErrorFragment) obj).m49720s0().m31633h0("ALLBOARDING_SCREEN_RESPONSE", bundle);
                return;
            case 9:
                rgw rgwVar = (rgw) obj;
                ?? r1 = rgwVar.f199036X1;
                if (r1 == 0) {
                    wj50.m88260d0("primaryAction");
                    throw null;
                }
                r1.invoke();
                rgwVar.dismiss();
                return;
            case 10:
                ((Action) obj).run();
                return;
            case 11:
                ExpandableEllipsizeTextView expandableEllipsizeTextView = (ExpandableEllipsizeTextView) obj;
                expandableEllipsizeTextView.setShouldExpandText(!expandableEllipsizeTextView.f2998i);
                expandableEllipsizeTextView.m3275t();
                return;
            case 12:
                rqc rqcVar = ((u100) obj).f225635e;
                if (rqcVar != null) {
                    wj50.m88279p(view);
                    rqcVar.invoke(view);
                    return;
                }
                return;
            case 13:
                gk10 gk10Var = (gk10) obj;
                ((mcq) gk10Var.f80670a).m61470e();
                gk10Var.f80672c.m95284b();
                return;
            case 14:
                vn10 vn10Var = (vn10) obj;
                ?? r2 = vn10Var.f242970R1;
                if (r2 != 0) {
                    r2.invoke();
                }
                vn10Var.m67381t1();
                vn10Var.m83052i1(false, false);
                return;
            case 15:
                ((p200) obj).invoke();
                return;
            case 16:
                ((p200) obj).invoke();
                return;
            case 17:
                int i3 = gq20.f83329Q1;
                m500 m500VarM49715n0 = ((gq20) obj).m49715n0();
                if (m500VarM49715n0 != null) {
                    m500VarM49715n0.finish();
                    return;
                }
                return;
            case 18:
                sir0 sir0Var = (sir0) obj;
                sir0Var.mo30231j(ey20.f63928a);
                sir0Var.mo30210A(null);
                return;
            case 19:
                ((gh00) ((C2636z3) obj).f278725d).invoke(o540.f161860a);
                return;
            case 20:
                ((etz) obj).m39995o().dismiss();
                return;
            case 21:
                m760 m760Var = (m760) obj;
                by50 by50Var = (by50) m760Var.f140682h.f141817b.current().getValue();
                if (by50Var != null) {
                    m760Var.f140683i.m40332a(by50Var, iz50.f107152h);
                    return;
                }
                return;
            case 22:
                ((DatePickerDialog) ((c170) obj).f33013t).show();
                return;
            case 23:
                lyz lyzVar = (lyz) obj;
                nui0 nui0Var = (nui0) lyzVar.f138147e;
                b370 b370Var = ((oui0) lyzVar.f138146d).f170302d;
                nui0Var.getClass();
                v270 v270Var = v270.f236557a;
                if (b370Var.equals(v270Var) || (b370Var instanceof y270)) {
                    voc1Var = xoc1.f264146n3;
                } else {
                    if (!(b370Var instanceof x270) && !(b370Var instanceof z270)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    voc1Var = xoc1.f263874E3;
                }
                String str2 = voc1Var.f243453a;
                kv91 kv91Var = nui0Var.f158656a;
                yt91 yt91VarM96903c2 = nui0Var.f158657b.f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("next_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str2 != null ? str2.toString() : null;
                if (string == null) {
                    string = "";
                }
                d850 d850VarMo57453r = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                v170 v170Var = (v170) lyzVar.f138145c;
                v170Var.f236272d = w170.m86976c(v170Var.f236272d, null, wl51.m88491o1(((EditText) ((kkx0) lyzVar.f138149g).f123727c).getText().toString()).toString(), null, null, null, null, false, false, 0, null, null, null, 8189);
                Bundle bundle2 = new Bundle();
                bundle2.putString("birthday", v170Var.f236272d.f246999c);
                bundle2.putString("maxBirthday", v170Var.f236272d.f247001e);
                bundle2.putString("minBirthday", v170Var.f236272d.f247002f);
                voc1 voc1Var2 = xoc1.f264146n3;
                bundle2.putParcelable("pages", v170Var.m84452d(voc1Var2));
                bundle2.putParcelable("flow_type", v170Var.f236272d.f246995Y);
                b370 b370Var2 = v170Var.f236272d.f246995Y;
                if (wj50.m88271j(b370Var2, v270Var)) {
                    str = voc1Var2.f243453a;
                } else {
                    if (!(b370Var2 instanceof x270)) {
                        if (!(b370Var2 instanceof a370)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ParentalConsent flows should use AccountCreationFlowManager");
                    }
                    str = xoc1.f263874E3.f243453a;
                }
                v170Var.f236269a.m51124c(str, d850VarMo57453r, bundle2);
                return;
            case 24:
                wz70 wz70Var = (wz70) obj;
                uz70 uz70Var = wz70Var.f256516X1;
                if (uz70Var == null) {
                    wj50.m88260d0("listener");
                    throw null;
                }
                kx1 kx1Var = (kx1) uz70Var;
                i6m0 i6m0Var2 = kx1Var.f127294F1;
                if (i6m0Var2 == null) {
                    wj50.m88260d0("pageBoundUbiLogger");
                    throw null;
                }
                bbg0 bbg0Var = kx1Var.f127303O1;
                if (bbg0Var == null) {
                    wj50.m88260d0("ubiEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c3 = bbg0Var.f25561b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("learn_more_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                ((zz8) i6m0Var2).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                wz70Var.dismiss();
                return;
            case 25:
                a080.m24329v1((a080) obj);
                return;
            case 26:
                ((u180) obj).m83052i1(false, false);
                return;
            case 27:
                ((w180) obj).m49699V0().onBackPressed();
                return;
            case 28:
                ((pal0) obj).mo36741c();
                return;
            default:
                ((AlertDialog) obj).dismiss();
                return;
        }
    }
}
