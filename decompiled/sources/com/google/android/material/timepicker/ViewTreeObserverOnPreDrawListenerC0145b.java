package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC0145b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f2325a;

    public ViewTreeObserverOnPreDrawListenerC0145b(ClockFaceView clockFaceView) {
        this.f2325a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2325a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2298U0.f2313b) - clockFaceView.f2305b1;
        if (height != clockFaceView.f139762S0) {
            clockFaceView.f139762S0 = height;
            clockFaceView.m60742x();
            ClockHandView clockHandView = clockFaceView.f2298U0;
            clockHandView.f2321t = clockFaceView.f139762S0;
            clockHandView.invalidate();
        }
        return true;
    }
}
