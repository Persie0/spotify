package com.spotify.nowplaying.uiusecases.carousel.horizontalvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.h3o0;
import p204p.ine1;
import p204p.k12;
import p204p.n0e1;
import p204p.vze1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/nowplaying/uiusecases/carousel/horizontalvideo/ZoomableView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "Lp/w2a1;", "setZoomingView", "(Landroid/view/View;)V", "Lp/h3o0;", "logger", "setPinchToZoomLogger", "(Lp/h3o0;)V", "Lkotlin/Function0;", "onZoomStart", "setOnZoomStartListener", "(Lp/eh00;)V", "src_main_java_com_spotify_nowplaying_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ZoomableView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public h3o0 f6297R0;

    /* JADX INFO: renamed from: S0 */
    public eh00 f6298S0;

    /* JADX INFO: renamed from: T0 */
    public final GestureDetector f6299T0;

    /* JADX INFO: renamed from: U0 */
    public View f6300U0;

    /* JADX INFO: renamed from: V0 */
    public float f6301V0;

    /* JADX INFO: renamed from: W0 */
    public final ScaleGestureDetector f6302W0;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomableView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: x */
    public static final void m15993x(ZoomableView zoomableView, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f = width;
        float f2 = zoomableView.f6301V0;
        float f3 = (f * f2) - f;
        float f4 = 2;
        float f5 = f3 / f4;
        float f6 = height;
        float f7 = ((f2 * f6) - f6) / f4;
        view.setTranslationX(n0e1.m63436m(view.getTranslationX(), -f5, f5));
        view.setTranslationY(n0e1.m63436m(view.getTranslationY(), -f7, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        if (motionEvent == null) {
            return true;
        }
        this.f6302W0.onTouchEvent(motionEvent);
        this.f6299T0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.f6302W0.onTouchEvent(motionEvent) || this.f6299T0.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setOnZoomStartListener(eh00 onZoomStart) {
        this.f6298S0 = onZoomStart;
    }

    public final void setPinchToZoomLogger(h3o0 logger) {
        this.f6297R0 = logger;
    }

    public final void setZoomingView(View view) {
        this.f6300U0 = view;
    }

    public ZoomableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6298S0 = ine1.f103965f;
        vze1 vze1Var = new vze1(this);
        this.f6299T0 = new GestureDetector(context, new k12(this, 4));
        this.f6301V0 = 1.0f;
        this.f6302W0 = new ScaleGestureDetector(context, vze1Var);
    }

    public /* synthetic */ ZoomableView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
