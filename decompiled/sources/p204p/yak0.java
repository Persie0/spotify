package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class yak0 {

    /* JADX INFO: renamed from: a */
    public final MotionLayout f270931a;

    /* JADX INFO: renamed from: b */
    public final MotionLayout f270932b;

    /* JADX INFO: renamed from: c */
    public final View f270933c;

    /* JADX INFO: renamed from: d */
    public final Context f270934d;

    /* JADX INFO: renamed from: e */
    public final View f270935e;

    /* JADX INFO: renamed from: f */
    public final dbk0 f270936f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f270937g;

    /* JADX INFO: renamed from: h */
    public final float f270938h;

    /* JADX INFO: renamed from: i */
    public final float f270939i;

    /* JADX INFO: renamed from: j */
    public final float f270940j;

    /* JADX INFO: renamed from: k */
    public final float f270941k;

    /* JADX INFO: renamed from: l */
    public final float f270942l;

    public yak0(MotionLayout motionLayout, MotionLayout motionLayout2, FrameLayout frameLayout, Context context, y54 y54Var, View view, dbk0 dbk0Var) {
        this.f270931a = motionLayout;
        this.f270932b = motionLayout2;
        this.f270933c = frameLayout;
        this.f270934d = context;
        this.f270935e = view;
        this.f270936f = dbk0Var;
        this.f270938h = context.getResources().getDimension(R.dimen.encore_corner_radius_larger_2);
        this.f270939i = context.getResources().getDimension(R.dimen.encore_corner_radius_larger_3);
        this.f270940j = context.getResources().getDimension(R.dimen.encore_corner_radius_base);
        this.f270941k = context.getResources().getDimension(R.dimen.encore_corner_radius_larger_2);
        this.f270942l = context.getResources().getDimension(R.dimen.encore_border_width_thick);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_tighter_2);
        int i = y54Var.m92828b() ? 0 : dimensionPixelSize;
        dimensionPixelSize = y54Var.m92831e() ? 0 : dimensionPixelSize;
        c7j c7jVarM330E = motionLayout2.m330E(R.id.default_size);
        if (c7jVarM330E != null) {
            c7jVarM330E.m31745u(R.id.video_surface, 3, i);
            c7jVarM330E.m31745u(R.id.video_surface, 4, i);
            c7jVarM330E.m31745u(R.id.video_surface, 6, i);
            motionLayout2.m342Q(R.id.default_size, c7jVarM330E);
        }
        c7j c7jVarM330E2 = motionLayout2.m330E(R.id.large_size);
        if (c7jVarM330E2 != null) {
            c7jVarM330E2.m31745u(R.id.video_surface, 3, dimensionPixelSize);
            c7jVarM330E2.m31745u(R.id.video_surface, 4, dimensionPixelSize);
            c7jVarM330E2.m31745u(R.id.video_surface, 6, dimensionPixelSize);
            motionLayout2.m342Q(R.id.large_size, c7jVarM330E2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m93213a() {
        Context context = this.f270934d;
        return context.getResources().getDimensionPixelSize(context.getResources().getConfiguration().fontScale >= 1.5f ? R.dimen.floating_now_playing_bar_scaled_font_height : R.dimen.floating_now_playing_bar_height);
    }

    /* JADX INFO: renamed from: b */
    public final void m93214b(float f) {
        float f2 = this.f270938h;
        float fM38555d = edb.m38555d(this.f270939i, f2, f, f2);
        Drawable background = this.f270931a.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(fM38555d);
        }
        View view = this.f270933c;
        Drawable background2 = view != null ? view.getBackground() : null;
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadius((this.f270942l / 2) + fM38555d);
        }
        float f3 = this.f270940j;
        float fM38555d2 = edb.m38555d(this.f270941k, f3, f, f3);
        Drawable background3 = this.f270935e.getBackground();
        GradientDrawable gradientDrawable3 = background3 instanceof GradientDrawable ? (GradientDrawable) background3 : null;
        if (gradientDrawable3 != null) {
            gradientDrawable3.setCornerRadius(fM38555d2);
        }
    }
}
