package com.spotify.encoreconsumermobile.elements.playbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ago0;
import p204p.alf1;
import p204p.bgo0;
import p204p.cec1;
import p204p.cgo0;
import p204p.dgo0;
import p204p.dtz;
import p204p.eee;
import p204p.ego0;
import p204p.fzg1;
import p204p.gee;
import p204p.ggo0;
import p204p.gh00;
import p204p.h6j;
import p204p.hgo0;
import p204p.iqg1;
import p204p.jeo0;
import p204p.jgo0;
import p204p.kgo0;
import p204p.lgo0;
import p204p.lzj;
import p204p.mec1;
import p204p.mgo0;
import p204p.moi0;
import p204p.ngo0;
import p204p.oqs;
import p204p.tc41;
import p204p.tn40;
import p204p.vc41;
import p204p.wg61;
import p204p.wl51;
import p204p.xde;
import p204p.xfo0;
import p204p.yfo0;
import p204p.zde;
import p204p.zfo0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/playbutton/PlayButtonView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getPlayButtonHeightWithoutBadge", "()I", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lp/mgo0;", "style", "Lp/w2a1;", "setButtonAppearance", "(Lp/mgo0;)V", "viewSizeRes", "setEpisodeTrailerHeaderStyle", "(I)V", "Lp/tc41;", "shuffleDrawable", "lockedDrawable", "src_main_java_com_spotify_encoreconsumermobile_elements_playbutton-playbutton"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayButtonView extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final ImageView f3685R0;

    /* JADX INFO: renamed from: S0 */
    public final ImageView f3686S0;

    /* JADX INFO: renamed from: T0 */
    public tc41 f3687T0;

    /* JADX INFO: renamed from: U0 */
    public tc41 f3688U0;

    /* JADX INFO: renamed from: V0 */
    public tc41 f3689V0;

    /* JADX INFO: renamed from: W0 */
    public final tn40 f3690W0;

    /* JADX INFO: renamed from: X0 */
    public final Drawable f3691X0;

    /* JADX INFO: renamed from: Y0 */
    public final Drawable f3692Y0;

    /* JADX INFO: renamed from: Z0 */
    public final Drawable f3693Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f3694a1;

    /* JADX INFO: renamed from: b1 */
    public mgo0 f3695b1;

    public PlayButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setButtonAppearance(mgo0 style) {
        int i = 0;
        if ((style instanceof ggo0) || (style instanceof xfo0)) {
            m9633D();
        } else if (style instanceof bgo0) {
            m9636z(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_small));
        } else if (style instanceof cgo0) {
            m9636z(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_button_size_large), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_small));
        } else if (style instanceof kgo0) {
            m9636z(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_very_small_view_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_very_small_button_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_very_small));
        } else if (style instanceof lgo0) {
            m9636z(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_very_small_view_large_tap_area_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_very_small_button_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_very_small));
        } else if (style instanceof dgo0) {
            setEpisodeTrailerHeaderStyle(R.dimen.encore_play_button_small_view_size);
        } else if (style instanceof ego0) {
            setEpisodeTrailerHeaderStyle(R.dimen.encore_play_and_pause_button_size_large);
        } else {
            boolean z = style instanceof jgo0;
            ImageView imageView = this.f3685R0;
            if (z) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_home_playable_card_shortcut_view_size);
                int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = dimensionPixelSize;
                layoutParams.width = dimensionPixelSize;
                setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.height = dimensionPixelSize2;
                layoutParams2.width = dimensionPixelSize2;
                imageView.setLayoutParams(layoutParams2);
                m9634E(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_very_small), R.color.encore_button_white);
                imageView.setBackground(this.f3693Z0);
            } else if (style instanceof ago0) {
                m9636z(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_button_size_large), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size), getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_small));
            } else if (style instanceof yfo0) {
                m9633D();
            } else if (style instanceof hgo0) {
                int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size);
                int dimensionPixelSize4 = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_small);
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                layoutParams3.height = dimensionPixelSize3;
                layoutParams3.width = dimensionPixelSize3;
                setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                layoutParams4.height = dimensionPixelSize3;
                layoutParams4.width = dimensionPixelSize3;
                imageView.setLayoutParams(layoutParams4);
                m9634E(dimensionPixelSize4, R.color.encore_button_black);
                imageView.setBackground(this.f3692Y0);
            } else if (style instanceof zfo0) {
                int dimensionPixelSize5 = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_button_size_extra_large);
                ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
                layoutParams5.height = dimensionPixelSize5;
                layoutParams5.width = dimensionPixelSize5;
                setLayoutParams(layoutParams5);
                ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                layoutParams6.height = dimensionPixelSize5;
                layoutParams6.width = dimensionPixelSize5;
                imageView.setLayoutParams(layoutParams6);
                m9634E(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_extra_large), R.color.encore_button_white);
                imageView.setBackground(getContext().getResources().getDrawable(R.drawable.play_button_semi_transparent_black_round_background, null));
            } else {
                i = 8;
            }
        }
        setVisibility(i);
        this.f3695b1 = style;
    }

    private final void setEpisodeTrailerHeaderStyle(int viewSizeRes) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_small_view_size);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(viewSizeRes);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize2;
        layoutParams.width = dimensionPixelSize2;
        setLayoutParams(layoutParams);
        ImageView imageView = this.f3685R0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = dimensionPixelSize;
        layoutParams2.width = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
        m9634E(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_small), R.color.encore_button_black);
        Drawable drawable = getContext().getDrawable(R.drawable.play_button_episode_trailer_header_style_background);
        if (drawable == null) {
            throw new IllegalStateException("Could not find drawable");
        }
        drawable.setTintList(lzj.m60387w(getContext(), R.color.encore_tertiary_button_green));
        imageView.setBackground(drawable);
    }

    /* JADX INFO: renamed from: B */
    public final void m9631B(int i, tc41 tc41Var, boolean z) {
        int i2 = z ? 0 : 4;
        ImageView imageView = this.f3686S0;
        imageView.setVisibility(i2);
        ColorStateList colorStateListM60387w = lzj.m60387w(imageView.getContext(), i);
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32546j(imageView, colorStateListM60387w);
        imageView.setImageDrawable(tc41Var);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(jeo0 jeo0Var) {
        boolean z;
        mgo0 mgo0Var = jeo0Var.f111636b;
        mgo0 mgo0Var2 = this.f3695b1;
        if (mgo0Var2 == null || mgo0Var2.getClass() != mgo0Var.getClass()) {
            setButtonAppearance(mgo0Var);
        }
        boolean z2 = jeo0Var.f111635a;
        this.f3694a1 = z2;
        boolean z3 = mgo0Var instanceof xfo0;
        Drawable drawable = this.f3690W0;
        if ((!z3 || !((xfo0) mgo0Var).f261050b) && (!((z = mgo0Var instanceof ago0)) || !((ago0) mgo0Var).f15458c)) {
            if ((mgo0Var instanceof bgo0) && ((bgo0) mgo0Var).f26980a) {
                drawable = this.f3689V0;
            } else if ((mgo0Var instanceof cgo0) && ((cgo0) mgo0Var).f37753a) {
                drawable = this.f3689V0;
            } else if (z && ((ago0) mgo0Var).f15457b) {
                drawable = this.f3689V0;
            } else if ((mgo0Var instanceof hgo0) && ((hgo0) mgo0Var).f91186a) {
                drawable = this.f3689V0;
            } else {
                drawable = z2 ? this.f3688U0 : this.f3687T0;
            }
        }
        this.f3685R0.setImageDrawable(drawable);
        Resources resources = getResources();
        String str = jeo0Var.f111637c;
        if (str == null) {
            str = "";
        }
        setContentDescription(wl51.m88491o1(fzg1.m43210m(resources, jeo0Var, str)).toString());
        boolean z4 = this.f3694a1;
        wg61 wg61Var = new wg61(new ngo0(this, 1));
        wg61 wg61Var2 = new wg61(new ngo0(this, 0));
        boolean z5 = false;
        if (mgo0Var instanceof ggo0) {
            ggo0 ggo0Var = (ggo0) mgo0Var;
            if (ggo0Var.f79710b) {
                m9631B(R.color.encore_lock_badge_bg, (tc41) wg61Var2.getValue(), true);
                return;
            }
            if (!z4 && ggo0Var.f79709a) {
                z5 = true;
            }
            m9631B(R.color.encore_shuffle_badge_bg, (tc41) wg61Var.getValue(), z5);
            return;
        }
        if (z3) {
            if (!z4 && ((xfo0) mgo0Var).f261049a) {
                z5 = true;
            }
            m9631B(R.color.encore_lock_badge_bg, (tc41) wg61Var2.getValue(), z5);
            return;
        }
        if (!(mgo0Var instanceof yfo0)) {
            this.f3686S0.setVisibility(4);
            return;
        }
        if (!z4 && ((yfo0) mgo0Var).f272305a) {
            z5 = true;
        }
        m9631B(R.color.encore_lock_badge_bg, (tc41) wg61Var2.getValue(), z5);
    }

    /* JADX INFO: renamed from: D */
    public final void m9633D() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_large_view_size);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_button_size_large);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        setLayoutParams(layoutParams);
        ImageView imageView = this.f3685R0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = dimensionPixelSize2;
        layoutParams2.width = dimensionPixelSize2;
        imageView.setLayoutParams(layoutParams2);
        m9634E(getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_and_pause_icon_large), R.color.encore_play_button_header_icon);
        imageView.setBackground(this.f3691X0);
    }

    /* JADX INFO: renamed from: E */
    public final void m9634E(int i, int i2) {
        this.f3687T0 = iqg1.m51376r(getContext(), vc41.PLAY, i2, i);
        this.f3688U0 = iqg1.m51376r(getContext(), vc41.PAUSE, i2, i);
        this.f3689V0 = iqg1.m51376r(getContext(), vc41.LOCKED_ACTIVE, i2, i);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new dtz(this, gh00Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final int getPlayButtonHeightWithoutBadge() {
        return this.f3685R0.getHeight();
    }

    /* JADX INFO: renamed from: x */
    public final void m9635x() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.button_play_and_pause);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(null);
        imageView.setImportantForAccessibility(2);
        imageView.setDuplicateParentStateEnabled(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        h6j h6jVar = new h6j(0, 0);
        h6jVar.f88145i = 0;
        h6jVar.f88151l = 0;
        h6jVar.f88164t = 0;
        h6jVar.f88166v = 0;
        addView(imageView, h6jVar);
        int i = (int) ((20 * getResources().getDisplayMetrics().density) + 0.5f);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R.id.button_badge);
        imageView2.setClickable(false);
        imageView2.setFocusable(false);
        imageView2.setContentDescription(null);
        imageView2.setImportantForAccessibility(2);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setScaleType(scaleType);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView2.setBackground(gradientDrawable);
        h6j h6jVar2 = new h6j(i, i);
        h6jVar2.f88151l = 0;
        h6jVar2.f88166v = 0;
        addView(imageView2, h6jVar2);
    }

    /* JADX INFO: renamed from: z */
    public final void m9636z(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
        ImageView imageView = this.f3685R0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        imageView.setLayoutParams(layoutParams2);
        m9634E(i3, R.color.encore_button_black);
        imageView.setBackground(this.f3692Y0);
    }

    public PlayButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Trace.beginSection("ECM:PlayButtonView:inflate");
        try {
            if (((Boolean) moi0.f145683c.getValue()).booleanValue()) {
                m9635x();
            } else {
                View.inflate(context, R.layout.play_button_view, this);
            }
            Trace.endSection();
            ImageView imageView = (ImageView) mec1.m61562n(this, R.id.button_badge);
            this.f3686S0 = imageView;
            alf1.m26332o(imageView).m72126a();
            ImageView imageView2 = (ImageView) mec1.m61562n(this, R.id.button_play_and_pause);
            this.f3685R0 = imageView2;
            alf1.m26332o(imageView2).m72126a();
            Drawable drawable = context.getDrawable(R.drawable.play_button_episode_style_background);
            if (drawable != null) {
                drawable.setTintList(lzj.m60387w(context, R.color.encore_button_white));
                this.f3692Y0 = drawable;
                Drawable drawable2 = context.getDrawable(R.drawable.play_button_header_style_background);
                if (drawable2 != null) {
                    drawable2.setTintList(lzj.m60387w(context, R.color.encore_play_button_bg));
                    this.f3691X0 = drawable2;
                    Drawable drawable3 = context.getDrawable(R.drawable.play_button_shortcut_home_style_background);
                    if (drawable3 != null) {
                        drawable3.setTintList(lzj.m60387w(context, R.color.encore_play_button_shortcut_home_bg));
                        this.f3693Z0 = drawable3;
                        imageView2.setBackground(drawable2);
                        int i2 = eee.f58757M0;
                        gee geeVar = new gee(context, attributeSet, i);
                        geeVar.f79103g = context.getResources().getDimensionPixelSize(R.dimen.encore_loading_indicator_size);
                        geeVar.f107385a = context.getResources().getDimensionPixelSize(R.dimen.encore_loading_indicator_thickness);
                        xde xdeVar = new xde(geeVar);
                        xdeVar.f260468c = 1;
                        this.f3690W0 = new tn40(context, geeVar, xdeVar, new zde(geeVar));
                        return;
                    }
                    throw new IllegalStateException("Could not find drawable");
                }
                throw new IllegalStateException("Could not find drawable");
            }
            throw new IllegalStateException("Could not find drawable");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public /* synthetic */ PlayButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
