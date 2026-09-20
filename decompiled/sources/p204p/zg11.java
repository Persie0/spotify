package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p003ui.TrackSelectionView;
import com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.p056v1.FullscreenVideoStory;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class zg11 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f282464b;

    public /* synthetic */ zg11(Object obj, int i) {
        this.f282463a = i;
        this.f282464b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f282463a) {
            case 0:
                ((o611) this.f282464b).invoke(yg11.f272450a);
                return;
            case 1:
                dq21 dq21Var = (dq21) this.f282464b;
                hm11 hm11Var = dq21Var.f51800R1;
                if (hm11Var == null) {
                    wj50.m88260d0("logger");
                    throw null;
                }
                d850 d850VarM47916q = hm11Var.m47916q();
                up21 up21Var = dq21Var.f51801S1;
                if (up21Var == null) {
                    wj50.m88260d0("navigator");
                    throw null;
                }
                Bundle bundle = dq21Var.f98701f;
                String string = bundle != null ? bundle.getString("ARGUMENT_URI") : null;
                if (string == null) {
                    string = "";
                }
                up21Var.m83644a(string, zo21.f284641c, d850VarM47916q);
                dq21Var.dismiss();
                return;
            case 2:
                t5q t5qVar = (t5q) this.f282464b;
                ((up21) t5qVar.f217335d).m83644a((String) t5qVar.f217336e, zo21.f284641c, ((hm11) t5qVar.f217334c).m47916q());
                return;
            case 3:
                ((glk) this.f282464b).invoke();
                return;
            case 4:
                ((y341) this.f282464b).m83052i1(false, false);
                return;
            case 5:
                ((v061) this.f282464b).dismiss();
                return;
            case 6:
                yz61 yz61Var = (yz61) this.f282464b;
                kbz kbzVar = yz61Var.f277709Y1;
                if (kbzVar != null) {
                    kbzVar.f121313c.take(1L).flatMapCompletable(zyx.f287714c).subscribe(new y1s0(yz61Var, 24));
                    return;
                } else {
                    wj50.m88260d0("firstCommentFlowRepository");
                    throw null;
                }
            case 7:
                ((oxo) ((rls0) this.f282464b).f200364f).invoke();
                return;
            case 8:
                ((gh00) ((C1778dh) this.f282464b).f48929b).invoke(qe71.f187860a);
                return;
            case 9:
                ((mo4) ((cx21) this.f282464b).f42890c).invoke();
                return;
            case 10:
                j081 j081Var = ((Toolbar) this.f282464b).f344n1;
                lhe0 lhe0Var = j081Var == null ? null : j081Var.f107383b;
                if (lhe0Var != null) {
                    lhe0Var.collapseActionView();
                    return;
                }
                return;
            case 11:
                xfl0 xfl0Var = ((qe1) this.f282464b).f187826b;
                if (xfl0Var != null) {
                    xfl0Var.mo32174f("spotify:aaa:con:t");
                    return;
                }
                return;
            case 12:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f282464b;
                HashMap map = trackSelectionView.f1136g;
                boolean z = true;
                if (view == trackSelectionView.f1132c) {
                    trackSelectionView.f1129M0 = true;
                    map.clear();
                } else if (view == trackSelectionView.f1133d) {
                    trackSelectionView.f1129M0 = false;
                    map.clear();
                } else {
                    trackSelectionView.f1129M0 = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    er81 er81Var = (er81) tag;
                    st81 st81Var = er81Var.f62042a;
                    kf81 kf81Var = st81Var.f213854b;
                    int i = er81Var.f62043b;
                    zq81 zq81Var = (zq81) map.get(kf81Var);
                    if (zq81Var == null) {
                        if (!trackSelectionView.f1138i && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(kf81Var, new zq81(kf81Var, pf40.m69794t(Integer.valueOf(i))));
                    } else {
                        ArrayList arrayList = new ArrayList(zq81Var.f285332b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.f1137h && st81Var.f213855c;
                        if (!z2 && (!trackSelectionView.f1138i || trackSelectionView.f1135f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i));
                            if (arrayList.isEmpty()) {
                                map.remove(kf81Var);
                            } else {
                                map.put(kf81Var, new zq81(kf81Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i));
                                map.put(kf81Var, new zq81(kf81Var, arrayList));
                            } else {
                                map.put(kf81Var, new zq81(kf81Var, pf40.m69794t(Integer.valueOf(i))));
                            }
                        }
                    }
                }
                trackSelectionView.m873a();
                return;
            case 13:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) this.f282464b)).addFlags(268435456));
                    return;
                } catch (Exception e) {
                    Logger.m3967c(e, "Failed to open JIRA ticket link", new Object[0]);
                    return;
                }
            case 14:
                VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) this.f282464b;
                videoControlsOverlayView.getOnActionClicked().invoke(videoControlsOverlayView.getAction());
                return;
            case 15:
                szb1 szb1VarM74322r1 = ((qzb1) this.f282464b).m74322r1();
                upf.m83660D(g0b1.m43282x(xsr.f265652b, new rpk0(szb1VarM74322r1.f215455f, qm0.DISMISSED, szb1VarM74322r1.m79734b(), null, 9)));
                pa9 pa9Var = szb1VarM74322r1.f215458i;
                if (pa9Var != null) {
                    pa9Var.m69455u();
                }
                szb1VarM74322r1.m79733a();
                return;
            case 16:
                yb81 yb81Var = (yb81) this.f282464b;
                ((y0i0) yb81Var.f271102b).m92589g((String) yb81Var.f271103c).m93347a().m69447l();
                dh31 dh31Var = (dh31) yb81Var.f271104d;
                cx21 cx21Var = ((wc51) dh31Var.f48973b).f249959d;
                String strM9060r = ((FullscreenVideoStory) dh31Var.f48974c).m9077n().m9060r();
                kv91 kv91Var = (kv91) cx21Var.f42889b;
                yt91 yt91VarM96903c = ((ahg0) cx21Var.f42891d).f15692b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("story_container", strM9060r, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("video_error", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return;
            case 17:
                ((r6d1) this.f282464b).mo30277c();
                return;
            default:
                view.setEnabled(false);
                rmd1 rmd1Var = (rmd1) this.f282464b;
                rmd1Var.mo75949s1();
                int iOrdinal = rmd1Var.m75945j1().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        rmd1Var.f200521N1.onNext(Boolean.TRUE);
                        rmd1Var.f200508A1.postDelayed(rmd1Var.f200514G1, 3100L);
                        rmd1Var.m75944h1(qmd1.f190203b);
                        rmd1Var.mo13040l1();
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        WebView webView = rmd1Var.f200510C1;
                        if (webView != null) {
                            webView.reload();
                            return;
                        }
                        return;
                    }
                }
                Logger.m3973i("Reload button clicked with incompatible state: " + rmd1Var.m75945j1(), new Object[0]);
                return;
        }
    }
}
