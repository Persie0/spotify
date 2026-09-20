package com.spotify.appendix.contentviewstate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.spotify.music.R;
import p204p.g05;
import p204p.l8a0;
import p204p.naa0;
import p204p.og6;
import p204p.zu3;

/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends FrameLayout {

    /* JADX INFO: renamed from: Q0 */
    public static final og6 f2973Q0 = new og6(15);

    /* JADX INFO: renamed from: L0 */
    public int f2974L0;

    /* JADX INFO: renamed from: M0 */
    public final zu3 f2975M0;

    /* JADX INFO: renamed from: N0 */
    public final naa0 f2976N0;

    /* JADX INFO: renamed from: O0 */
    public final naa0 f2977O0;

    /* JADX INFO: renamed from: P0 */
    public final g05 f2978P0;

    /* JADX INFO: renamed from: a */
    public View f2979a;

    /* JADX INFO: renamed from: b */
    public l8a0 f2980b;

    /* JADX INFO: renamed from: c */
    public int f2981c;

    /* JADX INFO: renamed from: d */
    public final int f2982d;

    /* JADX INFO: renamed from: e */
    public final int f2983e;

    /* JADX INFO: renamed from: f */
    public final int f2984f;

    /* JADX INFO: renamed from: g */
    public int f2985g;

    /* JADX INFO: renamed from: h */
    public View f2986h;

    /* JADX INFO: renamed from: i */
    public AlphaAnimation f2987i;

    /* JADX INFO: renamed from: t */
    public AlphaAnimation f2988t;

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2975M0 = new zu3(this, 10);
        this.f2976N0 = new naa0(this, 0);
        this.f2977O0 = new naa0(this, 1);
        this.f2978P0 = new g05(this);
        this.f2980b = f2973Q0;
        this.f2981c = getResources().getInteger(R.integer.loading_view_delay_before_showing);
        this.f2982d = getResources().getInteger(R.integer.loading_view_duration_fade_in);
        this.f2983e = getResources().getInteger(R.integer.loading_view_duration_fade_out);
        this.f2984f = getResources().getInteger(R.integer.loading_view_duration_content_crossfade);
        this.f2974L0 = 1;
    }

    /* JADX INFO: renamed from: a */
    public static void m3272a(LoadingView loadingView) {
        if (loadingView.f2986h == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(loadingView.f2984f);
        alphaAnimation.setInterpolator(loadingView.getContext(), android.R.interpolator.decelerate_quad);
        loadingView.f2986h.startAnimation(alphaAnimation);
        loadingView.f2986h.setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m3273b() {
        removeCallbacks(this.f2975M0);
        removeCallbacks(this.f2976N0);
        removeCallbacks(this.f2977O0);
        setAnimation(null);
        this.f2979a.setAnimation(null);
        View view = this.f2986h;
        if (view != null) {
            view.setAnimation(null);
        }
        setVisibility(8);
        this.f2979a.setVisibility(4);
        this.f2974L0 = 1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2979a = findViewById(R.id.progress);
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        this.f2985g = i;
        return super.onSetAlpha(i);
    }

    public void setDelayBeforeShowing(int i) {
        this.f2981c = i;
    }

    public void setListener(l8a0 l8a0Var) {
        if (l8a0Var == null) {
            this.f2980b = f2973Q0;
        } else {
            this.f2980b = l8a0Var;
        }
    }

    public void setTargetContentView(View view) {
        this.f2986h = view;
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context) {
        this(context, null, 0);
    }
}
