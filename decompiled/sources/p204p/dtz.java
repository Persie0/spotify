package p204p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.follow.FollowButtonView;
import com.spotify.encoreconsumermobile.elements.heart.HeartButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.hide.HideButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.music.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class dtz implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52921c;

    public /* synthetic */ dtz(int i, Object obj, Object obj2) {
        this.f52919a = i;
        this.f52920b = obj;
        this.f52921c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v87, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v31, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v85, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gb80 lifecycle;
        Context contextM49717p0;
        switch (this.f52919a) {
            case 0:
                etz etzVar = (etz) this.f52920b;
                wj50.m88279p(view);
                hc80 hc80VarM40067h = eug1.m40067h(view);
                fbk fbkVar = null;
                ub80 ub80VarM58232p = (hc80VarM40067h == null || (lifecycle = hc80VarM40067h.getLifecycle()) == null) ? null : l5h1.m58232p(lifecycle);
                if (ub80VarM58232p != null) {
                    x0h1.m89578u(ub80VarM58232p, null, 0, new dmx(etzVar, (String) this.f52921c, fbkVar, 14), 3);
                    return;
                }
                return;
            case 1:
                FollowButtonView followButtonView = (FollowButtonView) this.f52920b;
                if (!followButtonView.isActivated()) {
                    followButtonView.performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                }
                ((qe70) this.f52921c).invoke(Boolean.valueOf(followButtonView.isActivated()));
                return;
            case 2:
                xq3 xq3Var = (xq3) this.f52921c;
                gh00 gh00Var = (gh00) xq3Var.f264857b;
                fvz fvzVar = (fvz) this.f52920b;
                if (fvzVar.f73903d) {
                    gh00Var.invoke(new cvz(false));
                    if (fvzVar.f73904e) {
                        ((hu7) xq3Var.f264858c).m48607a(fvzVar.f73900a, i4y.f98631N0, new nry(xq3Var, 4));
                        return;
                    } else {
                        gh00Var.invoke(new cvz(true));
                        xq3.m91811b(xq3Var);
                        return;
                    }
                }
                ((EncoreButton) xq3Var.f264860e).performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                gh00Var.invoke(bvz.f31483a);
                Integer numValueOf = Integer.valueOf(R.string.podcast_follow_toast_liked_show_your_library);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                ((q831) xq3Var.f264859d).m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                return;
            case 3:
                String str = (String) this.f52921c;
                if (str != null) {
                    ((z9j0) ((sdo) this.f52920b).f208052f).mo47346g(mjd.m61971g(str));
                    return;
                }
                return;
            case 4:
                gk10 gk10Var = (gk10) this.f52920b;
                ((mcq) gk10Var.f80670a).m61470e();
                vn80 vn80Var = (vn80) this.f52921c;
                gk10Var.f80672c.m95283a(vn80Var);
                gk10Var.f80675f.m83204a(vn80Var);
                return;
            case 5:
                soy0 soy0Var = (soy0) this.f52920b;
                da20 da20Var = (da20) this.f52921c;
                a6e a6eVar = (a6e) soy0Var.m45324A(da20Var.m36323m());
                wj50.m88279p(a6eVar);
                soy0.m78843D(soy0Var, a6eVar, da20Var.m36323m());
                return;
            case 6:
                ((qe70) this.f52921c).invoke(Boolean.valueOf(((HeartButton) this.f52920b).f3668f));
                return;
            case 7:
                ((qe70) this.f52920b).invoke(Boolean.valueOf(((HideButton) this.f52921c).isHidden));
                return;
            case 8:
                or20 or20Var = (or20) ((u010) this.f52920b).f225346c;
                mr20 mr20Var = (mr20) this.f52921c;
                x0h1.m89578u(or20Var.f168427b, null, 0, new nr20(or20Var, mr20Var.f146407b, mr20Var.f146406a, null, 1), 3);
                return;
            case 9:
                sir0 sir0Var = (sir0) this.f52920b;
                sir0Var.mo30231j(new dy20(((xy20) this.f52921c).f267185a));
                sir0Var.mo30210A(null);
                return;
            case 10:
                if (((k730) this.f52920b).f119933n1.f6301V0 > 1.0f) {
                    return;
                }
                ((vw90) this.f52921c).m86536E();
                return;
            case 11:
                he90 he90Var = (he90) this.f52920b;
                x0h1.m89578u((xuk) he90Var.f90382f, null, 0, new g090(he90Var, (d850) this.f52921c, null, 13), 3);
                return;
            case 12:
                xfl0 xfl0Var = ((qe1) this.f52920b).f187826b;
                if (xfl0Var != null) {
                    xfl0Var.mo32175l(((sg90) this.f52921c).f208793i.f192571d);
                    return;
                }
                return;
            case 13:
                ((vwe0) this.f52920b).f245484T0.invoke((jve0) this.f52921c);
                return;
            case 14:
                ((zwe0) this.f52920b).f286973T0.invoke((nve0) this.f52921c);
                return;
            case 15:
                ugz ugzVar = (ugz) this.f52920b;
                x0h1.m89578u(n5h1.m63737m((m500) ugzVar.f230290b), (luk) ugzVar.f230293e, 0, new sqc0(ugzVar, (String) this.f52921c, (fbk) null, 23), 2);
                return;
            case 16:
                sif0 sif0Var = (sif0) this.f52920b;
                k3g0 k3g0Var = (k3g0) sif0Var.f209497Z.getValue();
                gag0 gag0VarM55241b = k3g0Var.m55241b(10);
                kv91 kv91Var = (kv91) k3g0Var.f118908a.get();
                yt91 yt91VarM96903c = gag0VarM55241b.f78050c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("action_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), gag0VarM55241b.f78049b, System.currentTimeMillis()), null);
                x0h1.m89578u((c9k) this.f52921c, null, 0, new fif0(sif0Var, null, 0), 3);
                sif0Var.f209501d.m72300d();
                return;
            case 17:
                bmx bmxVar = (bmx) this.f52920b;
                ((q831) bmxVar.f28645c).m72305j(new g631(null, ((m500) bmxVar.f28644b).getString(R.string.home_snackbar_feedback_undo_hide), null, null, null, null, null, null, false));
                cqj0 cqj0Var = (cqj0) this.f52921c;
                bqj0 bqj0Var = new bqj0(bmxVar, cqj0Var, 1);
                String str2 = cqj0Var.f40904b;
                if (wl51.m88460J0(str2)) {
                    return;
                }
                bqj0Var.invoke(str2);
                return;
            case 18:
                zsj0 zsj0Var = (zsj0) this.f52920b;
                a9i0 a9i0Var = zsj0Var.f285954a;
                String str3 = (String) this.f52921c;
                kv91 kv91Var2 = (kv91) a9i0Var.f13579b;
                rdg0 rdg0Var = (rdg0) a9i0Var.f13580c;
                String strConcat = "spotify:chat:".concat(str3);
                rdg0Var.getClass();
                dv91 dv91Var = new dv91("hit", 1);
                String string = strConcat != null ? strConcat.toString() : null;
                if (string == null) {
                    string = "";
                }
                d850 d850VarMo57453r = kv91Var2.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), rdg0Var.f198139a, st91.f213865b, System.currentTimeMillis()), null);
                z9j0 z9j0Var = (z9j0) ((ixj0) zsj0Var.f285956c.get()).f106707a.get();
                String strConcat2 = "spotify:chat:".concat(str3);
                n6j0 n6j0Var = new n6j0(d850VarMo57453r);
                if (strConcat2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo63651f(new p6j0(strConcat2, "", false, false, 0, 0, false, null, null, n6j0Var));
                return;
            case 19:
                EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) this.f52921c;
                cyj0 cyj0Var = (cyj0) this.f52920b;
                if (!cyj0Var.f43305c2 && (contextM49717p0 = cyj0Var.m49717p0()) != null) {
                    ih10 ih10VarM31832a0 = c95.m31832a0(contextM49717p0, contextM49717p0.getString(R.string.comments_notification_dialog_title), contextM49717p0.getString(R.string.comments_notification_dialog_description));
                    String string2 = contextM49717p0.getString(R.string.comments_notification_turn_on);
                    ja5 ja5Var = new ja5(15, cyj0Var, contextM49717p0);
                    ih10VarM31832a0.f102113a = string2;
                    ih10VarM31832a0.f102115c = ja5Var;
                    String string3 = contextM49717p0.getString(R.string.comments_notification_not_now);
                    nmb nmbVar = new nmb(cyj0Var, 21);
                    ih10VarM31832a0.f102114b = string3;
                    ih10VarM31832a0.f102116d = nmbVar;
                    ih10VarM31832a0.m50574b().m58942b();
                }
                cyj0Var.f43307e2 = true;
                encoreProgressIndicatorButton.setEnabled(false);
                x0h1.m89578u(l5h1.m58232p(cyj0Var.getLifecycle()), null, 0, new q0a0(cyj0Var, encoreProgressIndicatorButton, null, 28), 3);
                return;
            case 20:
                a9i0 a9i0Var2 = (a9i0) this.f52920b;
                kv91 kv91Var3 = (kv91) a9i0Var2.f13579b;
                yt91 yt91VarM96903c2 = ((j8g0) a9i0Var2.f13580c).f109936b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("learn_more_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:on-demand-trial:plan-overview")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((qe70) this.f52921c).invoke(view);
                return;
            case 21:
                pan0 pan0Var = (pan0) this.f52920b;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) ((ype) this.f52921c).f274918g;
                if (onClickListener != null) {
                    onClickListener.onClick(pan0Var, -1);
                }
                pan0Var.dismiss();
                return;
            case 22:
                PlayButtonView playButtonView = (PlayButtonView) this.f52920b;
                mgo0 mgo0Var = playButtonView.f3695b1;
                if ((mgo0Var instanceof bgo0) && ((bgo0) mgo0Var).f26980a) {
                    lzj.m60344V(playButtonView);
                }
                ((qe70) this.f52921c).invoke(Boolean.valueOf(playButtonView.f3694a1));
                return;
            case 23:
                gh00 gh00Var2 = (gh00) this.f52921c;
                iip0 iip0Var = (iip0) this.f52920b;
                if (iip0Var instanceof gip0) {
                    gip0 gip0Var = (gip0) iip0Var;
                    gh00Var2.invoke(new whp0(gip0Var.f80227a, gip0Var.f80228b));
                    return;
                } else {
                    if (!(iip0Var instanceof hip0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hip0 hip0Var = (hip0) iip0Var;
                    gh00Var2.invoke(new xhp0(hip0Var.f91855a, hip0Var.f91856b, hip0Var.f91857c));
                    return;
                }
            case 24:
                x4b x4bVar = (x4b) this.f52920b;
                sur0 sur0Var = (sur0) this.f52921c;
                String str4 = sur0Var.f214194c;
                String strM61971g = sur0Var.f214196e;
                z9j0 z9j0Var2 = (z9j0) x4bVar.f258037b;
                if (strM61971g == null) {
                    strM61971g = mjd.m61971g(str4);
                }
                d850 d850VarM47969a = ((hme0) x4bVar.f258039d).m47969a(strM61971g, true);
                if (d850VarM47969a != null) {
                    z9j0Var2.mo47342b(strM61971g, d850VarM47969a, null);
                    return;
                } else {
                    z9j0Var2.mo47346g(strM61971g);
                    return;
                }
            case 25:
                ((rfs0) this.f52920b).f198728b.accept((ths0) this.f52921c);
                return;
            case 26:
                ((vhs0) this.f52920b).m85574a();
                ((zis0) this.f52921c).f283239b.accept(ags0.f15494a);
                return;
            case 27:
                hjw0 hjw0Var = (hjw0) this.f52920b;
                x0h1.m89578u(n5h1.m63737m(hjw0Var.f92281a), null, 0, new hrt0(hjw0Var, (String) this.f52921c, null, 26), 3);
                return;
            case 28:
                znw0.m96599a((znw0) this.f52920b, ((lnw0) this.f52921c).f135238a);
                return;
            default:
                znw0.m96599a((znw0) this.f52920b, ((knw0) this.f52921c).f124480a);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtz(FollowButtonView followButtonView, gh00 gh00Var) {
        this.f52919a = 1;
        this.f52920b = followButtonView;
        this.f52921c = (qe70) gh00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtz(HeartButton heartButton, gh00 gh00Var) {
        this.f52919a = 6;
        this.f52920b = heartButton;
        this.f52921c = (qe70) gh00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtz(PlayButtonView playButtonView, gh00 gh00Var) {
        this.f52919a = 22;
        this.f52920b = playButtonView;
        this.f52921c = (qe70) gh00Var;
    }

    public /* synthetic */ dtz(Object obj, Object obj2, boolean z, int i) {
        this.f52919a = i;
        this.f52921c = obj;
        this.f52920b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtz(gh00 gh00Var, HideButton hideButton) {
        this.f52919a = 7;
        this.f52920b = (qe70) gh00Var;
        this.f52921c = hideButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtz(a9i0 a9i0Var, gh00 gh00Var) {
        this.f52919a = 20;
        this.f52920b = a9i0Var;
        this.f52921c = (qe70) gh00Var;
    }
}
