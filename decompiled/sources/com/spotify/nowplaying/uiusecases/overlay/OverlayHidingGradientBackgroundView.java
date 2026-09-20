package com.spotify.nowplaying.uiusecases.overlay;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.spotify.music.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.mec1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;", "Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/w2a1;", "setColor", "(I)V", "src_main_java_com_spotify_nowplaying_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OverlayHidingGradientBackgroundView extends OverlayHidingFrameLayout {

    /* JADX INFO: renamed from: T0 */
    public final GradientDrawable f6321T0;

    public OverlayHidingGradientBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void setColor(int color) {
        this.f6321T0.setColorFilter(color, PorterDuff.Mode.DST_OVER);
    }

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{context.getColor(R.color.bg_gradient_start_color), context.getColor(R.color.bg_gradient_end_color)});
        this.f6321T0 = gradientDrawable;
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(gradientDrawable);
    }

    public /* synthetic */ OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
