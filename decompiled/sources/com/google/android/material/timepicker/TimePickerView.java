package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.azp;
import p204p.c7j;
import p204p.mec1;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ int f2322S0 = 0;

    /* JADX INFO: renamed from: R0 */
    public final MaterialButtonToggleGroup f2323R0;

    public TimePickerView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1667x();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m1667x();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1667x() {
        if (this.f2323R0.getVisibility() == 0) {
            c7j c7jVar = new c7j();
            c7jVar.m31736f(this);
            WeakHashMap weakHashMap = mec1.f142677a;
            c7jVar.m31735e(R.id.material_clock_display, getLayoutDirection() == 0 ? 2 : 1);
            c7jVar.m31733b(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewOnClickListenerC0147d viewOnClickListenerC0147d = new ViewOnClickListenerC0147d(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f2323R0 = materialButtonToggleGroup;
        materialButtonToggleGroup.f2073d.add(new C0148e());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        WeakHashMap weakHashMap = mec1.f142677a;
        chip.setAccessibilityLiveRegion(2);
        chip2.setAccessibilityLiveRegion(2);
        azp azpVar = new azp(new GestureDetector(getContext(), new C0149f(this)), 6);
        chip.setOnTouchListener(azpVar);
        chip2.setOnTouchListener(azpVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0147d);
        chip2.setOnClickListener(viewOnClickListenerC0147d);
    }
}
