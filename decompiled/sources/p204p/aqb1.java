package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class aqb1 implements owt, i0c1 {

    /* JADX INFO: renamed from: L0 */
    public final ConstraintLayout f18173L0;

    /* JADX INFO: renamed from: X */
    public final wg61 f18174X;

    /* JADX INFO: renamed from: Y */
    public final xir f18175Y;

    /* JADX INFO: renamed from: Z */
    public npb1 f18176Z;

    /* JADX INFO: renamed from: a */
    public final vh21 f18177a;

    /* JADX INFO: renamed from: b */
    public final e940 f18178b;

    /* JADX INFO: renamed from: c */
    public final Context f18179c;

    /* JADX INFO: renamed from: d */
    public final gh00 f18180d;

    /* JADX INFO: renamed from: e */
    public final iv0 f18181e;

    /* JADX INFO: renamed from: f */
    public final y3m f18182f;

    /* JADX INFO: renamed from: g */
    public final zu0 f18183g;

    /* JADX INFO: renamed from: h */
    public final long f18184h;

    /* JADX INFO: renamed from: i */
    public final r3m f18185i;

    /* JADX INFO: renamed from: t */
    public final wg61 f18186t;

    public aqb1(vh21 vh21Var, e940 e940Var, Context context, agy agyVar, gh00 gh00Var, iv0 iv0Var, y3m y3mVar) {
        this.f18177a = vh21Var;
        this.f18178b = e940Var;
        this.f18179c = context;
        this.f18180d = gh00Var;
        this.f18181e = iv0Var;
        this.f18182f = y3mVar;
        String str = null;
        boolean z = false;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.video_card_view, (ViewGroup) null, false);
        int i = R.id.artwork_related_video;
        AppCompatImageView appCompatImageView = (AppCompatImageView) vie1.m85629k(viewInflate, R.id.artwork_related_video);
        if (appCompatImageView != null) {
            i = R.id.auxiliary_action_container;
            FrameLayout frameLayout = (FrameLayout) vie1.m85629k(viewInflate, R.id.auxiliary_action_container);
            if (frameLayout != null) {
                i = R.id.button_context_menu;
                ContextMenuButton contextMenuButton = (ContextMenuButton) vie1.m85629k(viewInflate, R.id.button_context_menu);
                if (contextMenuButton != null) {
                    i = R.id.content_restriction_badge;
                    ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) vie1.m85629k(viewInflate, R.id.content_restriction_badge);
                    if (contentRestrictionBadgeView != null) {
                        i = R.id.duration_label;
                        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.duration_label);
                        if (textView != null) {
                            i = R.id.media_slot;
                            CardView cardView = (CardView) vie1.m85629k(viewInflate, R.id.media_slot);
                            if (cardView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i = R.id.placeholder;
                                TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.placeholder);
                                if (textView2 != null) {
                                    i = R.id.play_indicator;
                                    PlayButtonView playButtonView = (PlayButtonView) vie1.m85629k(viewInflate, R.id.play_indicator);
                                    if (playButtonView != null) {
                                        i = R.id.subtitle;
                                        TextView textView3 = (TextView) vie1.m85629k(viewInflate, R.id.subtitle);
                                        if (textView3 != null) {
                                            i = R.id.subtitle_slot;
                                            if (((LinearLayout) vie1.m85629k(viewInflate, R.id.subtitle_slot)) != null) {
                                                i = R.id.title;
                                                TextView textView4 = (TextView) vie1.m85629k(viewInflate, R.id.title);
                                                if (textView4 != null) {
                                                    i = R.id.title_subtitle_box;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.title_subtitle_box);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.video;
                                                        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) vie1.m85629k(viewInflate, R.id.video);
                                                        if (videoSurfaceView != null) {
                                                            this.f18183g = new zu0(constraintLayout, appCompatImageView, frameLayout, contextMenuButton, contentRestrictionBadgeView, textView, cardView, constraintLayout, textView2, playButtonView, textView3, textView4, constraintLayout2, videoSurfaceView, 24);
                                                            this.f18184h = 300L;
                                                            this.f18185i = new r3m(true, new sgu(18, null, koa1.f124725V0, null, null, 26), false);
                                                            this.f18186t = new wg61(new vpb1(this, 1));
                                                            this.f18174X = new wg61(new vpb1(this, 2));
                                                            this.f18175Y = xir.m91157c(xir.m91158d(dlr0.f50328V0, xir.m91155a(new vaa1(this, 4))), xir.m91158d(new zcq(wpb1.f253720h, 1), xir.m91155a(new b741(this, 23))), xir.m91158d(new zcq(xpb1.f264591h, 1), new xir(nlr0.f155142U0, new dz31(this, 23))));
                                                            this.f18173L0 = constraintLayout;
                                                            videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                                                            videoSurfaceView.setBufferingThrobberEnabled(false);
                                                            playButtonView.mo2820d(new jeo0(z, new cgo0(false), str, 4));
                                                            vpb1 vpb1Var = new vpb1(this, 0);
                                                            rlv0 rlv0Var = new rlv0();
                                                            rlv0 rlv0Var2 = new rlv0();
                                                            ltr ltrVar = new ltr(rlv0Var, new ntp(rlv0Var, rlv0Var2, constraintLayout, 3), vpb1Var, 5);
                                                            rlv0Var2.f200373a = ltrVar;
                                                            constraintLayout.addOnAttachStateChangeListener(ltrVar);
                                                            return;
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

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        npb1 npb1Var;
        npb1 npb1Var2 = (npb1) obj;
        npb1 npb1Var3 = this.f18176Z;
        if (!wj50.m88271j(npb1Var3 != null ? npb1Var3.f156914f : null, npb1Var2.f156914f) || (npb1Var = this.f18176Z) == null || npb1Var.f156921m != npb1Var2.f156921m) {
            this.f18178b.mo24607c((AppCompatImageView) this.f18183g.f286300c);
        }
        this.f18176Z = npb1Var2;
        this.f18175Y.m91159e(npb1Var2);
    }

    @Override // p204p.i0c1
    /* JADX INFO: renamed from: b */
    public final void mo26765b() {
        m26769f(300L);
    }

    @Override // p204p.i0c1
    /* JADX INFO: renamed from: c */
    public final void mo26766c() {
        npb1 npb1Var = this.f18176Z;
        boolean z = false;
        if (npb1Var != null && npb1Var.f156921m) {
            z = true;
        }
        zu0 zu0Var = this.f18183g;
        if (((AppCompatImageView) zu0Var.f286300c).getAlpha() != 1.0f || z) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = ((AppCompatImageView) zu0Var.f286300c).animate().alpha(0.0f);
        long j = this.f18184h;
        viewPropertyAnimatorAlpha.setDuration(j).start();
        ((VideoSurfaceView) zu0Var.f286294M0).animate().setDuration(j).alpha(1.0f).setDuration(j).start();
    }

    /* JADX INFO: renamed from: d */
    public final void m26767d(vh21 vh21Var, npb1 npb1Var) {
        if (npb1Var.f156921m || npb1Var.f156924p) {
            return;
        }
        vh21Var.mo34628f(this);
        vh21Var.mo34625c((VideoSurfaceView) this.f18183g.f286294M0, npb1Var.f156912d, npb1Var.f156915g, npb1Var.f156916h, npb1Var.f156913e, npb1Var.f156926r);
    }

    /* JADX INFO: renamed from: e */
    public final void m26768e(npb1 npb1Var) {
        qsj qsjVar;
        String string;
        String str = npb1Var.f156909a;
        psj psjVar = npb1Var.f156920l;
        String str2 = npb1Var.f156911c;
        boolean z = npb1Var.f156910b;
        zu0 zu0Var = this.f18183g;
        TextView textView = (TextView) zu0Var.f286297Z;
        ContextMenuButton contextMenuButton = (ContextMenuButton) zu0Var.f286302e;
        ConstraintLayout constraintLayout = (ConstraintLayout) zu0Var.f286293L0;
        TextView textView2 = (TextView) zu0Var.f286296Y;
        textView.setMaxLines(z ? 2 : 1);
        ((TextView) zu0Var.f286307t).setMinLines(textView2.getMaxLines() + textView.getMaxLines());
        textView.setText(str);
        textView2.setText(str2);
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) zu0Var.f286303f;
        int iOrdinal = psjVar.ordinal();
        if (iOrdinal == 0) {
            qsjVar = qsj.f192127a;
        } else if (iOrdinal == 1) {
            qsjVar = qsj.f192128b;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qsjVar = qsj.f192130d;
        }
        contentRestrictionBadgeView.mo2820d(qsjVar);
        String str3 = npb1Var.f156909a;
        boolean zM88460J0 = wl51.m88460J0(str3);
        Context context = this.f18179c;
        if (zM88460J0) {
            string = context.getString(R.string.video_preview_card_content_description_fallback);
        } else {
            string = wl51.m88460J0(str2) ? context.getString(R.string.video_preview_card_content_description_title_only, str3) : context.getString(R.string.video_preview_card_content_description, str3, str2);
        }
        wj50.m88279p(string);
        ((ConstraintLayout) zu0Var.f286306i).setContentDescription(string);
        constraintLayout.setContentDescription(null);
        contextMenuButton.setEnabled(true);
        contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(R.string.show_context_menu_content_description_video, str3));
        String str4 = npb1Var.f156913e;
        String str5 = npb1Var.f156918j;
        boolean z2 = npb1Var.f156921m;
        String str6 = npb1Var.f156925q;
        boolean z3 = npb1Var.f156927s;
        this.f18173L0.setOnClickListener(new ypb1(this, str4, str5, psjVar, 0));
        ((VideoSurfaceView) zu0Var.f286294M0).setOnClickListener(new ypb1(this, str4, str5, psjVar, 1));
        ((PlayButtonView) zu0Var.f286295X).setOnClickListener(new ypb1(this, str4, str5, psjVar, 2));
        contextMenuButton.setOnClickListener(new zpb1(this, str4, z2, z3));
        if (str6.length() > 0) {
            constraintLayout.setOnClickListener(new lt7((Object) this, (Object) str4, (Object) str6, 25));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m26769f(long j) {
        zu0 zu0Var = this.f18183g;
        if (((AppCompatImageView) zu0Var.f286300c).getAlpha() == 0.0f) {
            ((AppCompatImageView) zu0Var.f286300c).animate().alpha(1.0f).setDuration(j).start();
            ((VideoSurfaceView) zu0Var.f286294M0).animate().alpha(0.0f).setDuration(j).start();
        }
    }

    @Override // p204p.owt
    public final View getView() {
        return this.f18173L0;
    }
}
