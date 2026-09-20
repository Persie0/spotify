package p204p;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;

/* JADX INFO: loaded from: classes8.dex */
public final class vze1 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public qe70 f246457a = qse1.f192081e;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ZoomableView f246458b;

    public vze1(ZoomableView zoomableView) {
        this.f246458b = zoomableView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ZoomableView zoomableView = this.f246458b;
        View view = zoomableView.f6300U0;
        if (view == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() * zoomableView.f6301V0;
        zoomableView.f6301V0 = scaleFactor;
        float fMax = Math.max(1.0f, Math.min(scaleFactor, 5.0f));
        zoomableView.f6301V0 = fMax;
        view.setScaleX(fMax);
        view.setScaleY(zoomableView.f6301V0);
        ZoomableView.m15993x(zoomableView, view);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ZoomableView zoomableView = this.f246458b;
        this.f246457a = new C2580xm(zoomableView, (int) zoomableView.f6301V0, 25);
        zoomableView.f6298S0.invoke();
        zoomableView.getParent().requestDisallowInterceptTouchEvent(true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [p.gh00, p.qe70] */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
        ?? r3 = this.f246457a;
        ZoomableView zoomableView = this.f246458b;
        r3.invoke(Integer.valueOf((int) zoomableView.f6301V0));
        this.f246457a = qse1.f192080d;
        zoomableView.getParent().requestDisallowInterceptTouchEvent(false);
    }
}
