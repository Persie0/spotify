package p204p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.messaging.tooltipsimpl.TooltipContentView;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;
import com.spotify.nowplayingmodes.adsmode.p115ui.overlay.AdsOverlayControlsLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class k12 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f118187b;

    public /* synthetic */ k12(Object obj, int i) {
        this.f118186a = i;
        this.f118187b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m55045a(MotionEvent motionEvent) {
        v951 v951Var = (v951) this.f118187b;
        float width = v951Var.getWidth() / 3.0f;
        float f = 2.0f * width;
        float x = motionEvent.getX();
        if (x <= width) {
            v951Var.m84944a(cc51.f36318c);
        } else if (x >= f) {
            v951Var.m84944a(cc51.f36319d);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f118186a) {
            case 1:
                m55045a(motionEvent);
                return true;
            case 2:
            default:
                return super.onDoubleTap(motionEvent);
            case 3:
                motionEvent.getX();
                motionEvent.getY();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f118186a) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f118186a) {
            case 1:
                if (motionEvent == null || motionEvent2.getY() - motionEvent.getY() <= 200.0f) {
                    return false;
                }
                ((v951) this.f118187b).m84944a(cc51.f36320e);
                return true;
            case 2:
                if (motionEvent == null || motionEvent2.getY() - motionEvent.getY() <= 80.0f) {
                    return false;
                }
                eh00 eh00Var = ((TooltipContentView) this.f118187b).f5527R0;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f118186a) {
            case 4:
                ZoomableView zoomableView = (ZoomableView) this.f118187b;
                View view = zoomableView.f6300U0;
                if (view == null || zoomableView.f6301V0 == 1.0f) {
                    return false;
                }
                zoomableView.getParent().requestDisallowInterceptTouchEvent(true);
                view.setTranslationX(view.getTranslationX() - f);
                view.setTranslationY(view.getTranslationY() - f2);
                ZoomableView.m15993x(zoomableView, view);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.f118186a) {
            case 0:
                AdsOverlayControlsLayout adsOverlayControlsLayout = (AdsOverlayControlsLayout) this.f118187b;
                g0m0 g0m0Var = adsOverlayControlsLayout.f6361U0;
                if (g0m0Var != g0m0.f75395a && g0m0Var != g0m0.f75397c) {
                    return true;
                }
                if (AdsOverlayControlsLayout.m16018e(adsOverlayControlsLayout, adsOverlayControlsLayout.getLeft() + q3d0.m72083N(motionEvent.getX()), adsOverlayControlsLayout.getTop() + q3d0.m72083N(motionEvent.getY()))) {
                    return false;
                }
                View view = adsOverlayControlsLayout.f6356P0;
                if (view == null || view.getVisibility() != 0) {
                    adsOverlayControlsLayout.mo15997c(true);
                    AdsOverlayControlsLayout.m16017d(adsOverlayControlsLayout, false);
                    return true;
                }
                adsOverlayControlsLayout.mo15995a(true);
                AdsOverlayControlsLayout.m16017d(adsOverlayControlsLayout, true);
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f118186a) {
            case 1:
                m55045a(motionEvent);
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
