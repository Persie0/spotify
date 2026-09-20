package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.material.timepicker.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C0149f extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TimePickerView f2328a;

    public C0149f(TimePickerView timePickerView) {
        this.f2328a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f2322S0;
        this.f2328a.getClass();
        return false;
    }
}
