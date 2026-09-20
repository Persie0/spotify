package p204p;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.adsdisplay.display.videooverlay.videocontrols.VideoControlsOverlayView;
import com.spotify.adsdisplay.uiusecases.adtag.AdTagView;
import com.spotify.adsinternal.playback.video.CountdownBarView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m24212d2 = {"Lp/qzb1;", "Lp/sur;", "Lp/d600;", "Lp/uzb1;", "<init>", "()V", "p/mzb1", "src_main_java_com_spotify_adsdisplay_display-display"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class qzb1 extends sur implements d600, uzb1 {

    /* JADX INFO: renamed from: R1 */
    public szb1 f194168R1;

    /* JADX INFO: renamed from: S1 */
    public qyy0 f194169S1;

    /* JADX INFO: renamed from: U1 */
    public ObjectAnimator f194171U1;

    /* JADX INFO: renamed from: V1 */
    public final pzb1 f194172V1;

    /* JADX INFO: renamed from: X1 */
    public final pzb1 f194174X1;

    /* JADX INFO: renamed from: c2 */
    public static final /* synthetic */ qr60[] f194167c2 = {new spi0(qzb1.class, ContextTrack.Metadata.KEY_ADVERTISER, "getAdvertiser()Ljava/lang/String;", 0), new spi0(qzb1.class, "tagline", "getTagline()Ljava/lang/String;", 0), new spi0(qzb1.class, "mainButton", "getMainButton()Ljava/lang/String;", 0), new spi0(qzb1.class, "showMainButton", "getShowMainButton()Z", 0), new spi0(qzb1.class, "videoButton", "getVideoButton()Lcom/spotify/adsdisplay/display/videooverlay/videocontrols/VideoControlsOverlayAction;", 0), new spi0(qzb1.class, "forceShowOverlay", "getForceShowOverlay()Z", 0)};

    /* JADX INFO: renamed from: b2 */
    public static final mzb1 f194166b2 = new mzb1();

    /* JADX INFO: renamed from: T1 */
    public final wg61 f194170T1 = new wg61(new nzb1(this));

    /* JADX INFO: renamed from: W1 */
    public final pzb1 f194173W1 = new pzb1(this, 1);

    /* JADX INFO: renamed from: Y1 */
    public final pzb1 f194175Y1 = new pzb1(this, 3);

    /* JADX INFO: renamed from: Z1 */
    public final pzb1 f194176Z1 = new pzb1(this, 4);

    /* JADX INFO: renamed from: a2 */
    public final pzb1 f194177a2 = new pzb1(this, 5);

    public qzb1() {
        boolean z = false;
        this.f194172V1 = new pzb1(this, 0, z);
        this.f194174X1 = new pzb1(this, 2, z);
    }

    @Override // p204p.sur, p204p.p0m0
    /* JADX INFO: renamed from: G */
    public final void mo37906G(int[] iArr) {
        qyy0 qyy0Var = this.f194169S1;
        if (qyy0Var != null) {
            VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) qyy0Var.f194056Y;
            Handler handler = videoControlsOverlayView.f2710a;
            n081 n081Var = videoControlsOverlayView.f2718i;
            handler.removeCallbacks(n081Var);
            if (!videoControlsOverlayView.getForceShowOverlay()) {
                handler.postDelayed(n081Var, 2000L);
            }
            if (videoControlsOverlayView.f2717h) {
                videoControlsOverlayView.m2769g();
            }
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_video_overlay, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.advertisement_tag;
        if (((AdTagView) vie1.m85629k(viewInflate, R.id.advertisement_tag)) != null) {
            i = R.id.advertiser_info_container;
            if (((LinearLayout) vie1.m85629k(viewInflate, R.id.advertiser_info_container)) != null) {
                i = R.id.advertiser_text_view;
                TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.advertiser_text_view);
                if (textView != null) {
                    i = R.id.bottom_scrim;
                    View viewM85629k = vie1.m85629k(viewInflate, R.id.bottom_scrim);
                    if (viewM85629k != null) {
                        i = R.id.close_button;
                        ClearButtonView clearButtonView = (ClearButtonView) vie1.m85629k(viewInflate, R.id.close_button);
                        if (clearButtonView != null) {
                            i = R.id.content_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.content_layout);
                            if (constraintLayout != null) {
                                i = R.id.countdown_bar;
                                CountdownBarView countdownBarView = (CountdownBarView) vie1.m85629k(viewInflate, R.id.countdown_bar);
                                if (countdownBarView != null) {
                                    i = R.id.main_button;
                                    PrimaryButtonView primaryButtonView = (PrimaryButtonView) vie1.m85629k(viewInflate, R.id.main_button);
                                    if (primaryButtonView != null) {
                                        i = R.id.progress_bar;
                                        ProgressBar progressBar = (ProgressBar) vie1.m85629k(viewInflate, R.id.progress_bar);
                                        if (progressBar != null) {
                                            i = R.id.tagline_text_view;
                                            TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.tagline_text_view);
                                            if (textView2 != null) {
                                                i = R.id.top_scrim;
                                                View viewM85629k2 = vie1.m85629k(viewInflate, R.id.top_scrim);
                                                if (viewM85629k2 != null) {
                                                    i = R.id.video_controls_overlay;
                                                    VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) vie1.m85629k(viewInflate, R.id.video_controls_overlay);
                                                    if (videoControlsOverlayView != null) {
                                                        i = R.id.video_surface;
                                                        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) vie1.m85629k(viewInflate, R.id.video_surface);
                                                        if (videoSurfaceView != null) {
                                                            this.f194169S1 = new qyy0(frameLayout, textView, viewM85629k, clearButtonView, constraintLayout, countdownBarView, primaryButtonView, progressBar, textView2, viewM85629k2, videoControlsOverlayView, videoSurfaceView, 17);
                                                            return frameLayout;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f194169S1 = null;
        super.mo878I0();
    }

    @Override // p204p.p0m0
    /* JADX INFO: renamed from: Q */
    public final void mo37908Q() {
        szb1 szb1VarM74322r1 = m74322r1();
        upf.m83660D(g0b1.m43282x(xsr.f265652b, new rpk0(szb1VarM74322r1.f215455f, qm0.DISMISSED, szb1VarM74322r1.m79734b(), null, 9)));
        pa9 pa9Var = szb1VarM74322r1.f215458i;
        if (pa9Var != null) {
            pa9Var.m69455u();
        }
        szb1VarM74322r1.m79733a();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        szb1 szb1VarM74322r1 = m74322r1();
        y800 y800Var = (y800) m49724w0();
        y800Var.m93034b();
        y800Var.f270161e.mo31986a(szb1VarM74322r1);
        qyy0 qyy0Var = this.f194169S1;
        if (qyy0Var == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) qyy0Var.f194063f;
        ((FrameLayout) qyy0Var.f194059b).setOnClickListener(new zg11(this, 15));
        constraintLayout.setClipToOutline(true);
        ((ClearButtonView) qyy0Var.f194062e).mo2821c(new ozb1(this, 0));
        ((PrimaryButtonView) qyy0Var.f194065h).mo2821c(new ozb1(this, 1));
        ((VideoControlsOverlayView) qyy0Var.f194056Y).setOnActionClicked(new ozb1(this, 2));
        ((VideoSurfaceView) qyy0Var.f194057Z).setOnTouchListener(new q0m0(constraintLayout, this));
    }

    /* JADX INFO: renamed from: r1 */
    public final szb1 m74322r1() {
        szb1 szb1Var = this.f194168R1;
        if (szb1Var != null) {
            return szb1Var;
        }
        wj50.m88260d0("presenter");
        throw null;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m74323s1(psb1 psb1Var) {
        this.f194176Z1.m39516c(f194167c2[4], this, psb1Var);
    }

    @Override // p204p.sur, p204p.p0m0
    /* JADX INFO: renamed from: d */
    public final void mo37911d() {
    }

    @Override // p204p.sur, p204p.p0m0
    /* JADX INFO: renamed from: h */
    public final void mo37914h() {
    }
}
