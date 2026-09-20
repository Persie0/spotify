package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Arrays;
import p204p.ase;
import p204p.h1u0;
import p204p.lzj;
import p204p.m3u0;
import p204p.mec1;
import p204p.wtg1;
import p204p.yic1;

/* JADX INFO: loaded from: classes4.dex */
class ClockFaceView extends m3u0 implements ase {

    /* JADX INFO: renamed from: U0 */
    public final ClockHandView f2298U0;

    /* JADX INFO: renamed from: V0 */
    public final Rect f2299V0;

    /* JADX INFO: renamed from: W0 */
    public final RectF f2300W0;

    /* JADX INFO: renamed from: X0 */
    public final SparseArray f2301X0;

    /* JADX INFO: renamed from: Y0 */
    public final C0146c f2302Y0;

    /* JADX INFO: renamed from: Z0 */
    public final int[] f2303Z0;

    /* JADX INFO: renamed from: a1 */
    public final float[] f2304a1;

    /* JADX INFO: renamed from: b1 */
    public final int f2305b1;

    /* JADX INFO: renamed from: c1 */
    public final int f2306c1;

    /* JADX INFO: renamed from: d1 */
    public final int f2307d1;

    /* JADX INFO: renamed from: e1 */
    public final int f2308e1;

    /* JADX INFO: renamed from: f1 */
    public final String[] f2309f1;

    /* JADX INFO: renamed from: g1 */
    public float f2310g1;

    /* JADX INFO: renamed from: h1 */
    public final ColorStateList f2311h1;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) yic1.m93704m(1, this.f2309f1.length, 1, false).f273079b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1665z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f2308e1 / Math.max(Math.max(this.f2306c1 / displayMetrics.heightPixels, this.f2307d1 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX INFO: renamed from: z */
    public final void m1665z() {
        RadialGradient radialGradient;
        RectF rectF = this.f2298U0.f2316e;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f2301X0;
            if (i >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i);
            if (textView != null) {
                Rect rect = this.f2299V0;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.f2300W0;
                rectF2.set(rect);
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f2303Z0, this.f2304a1, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i++;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2299V0 = new Rect();
        this.f2300W0 = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f2301X0 = sparseArray;
        this.f2304a1 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86736j, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM88942q = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 1);
        this.f2311h1 = colorStateListM88942q;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2298U0 = clockHandView;
        this.f2305b1 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM88942q.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM88942q.getDefaultColor());
        this.f2303Z0 = new int[]{colorForState, colorForState, colorStateListM88942q.getDefaultColor()};
        clockHandView.f2312a.add(this);
        int defaultColor = lzj.m60387w(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM88942q2 = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM88942q2 != null ? colorStateListM88942q2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0145b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2302Y0 = new C0146c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2309f1 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f2309f1.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2309f1.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f2309f1[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                mec1.m61564p(textView, this.f2302Y0);
                textView.setTextColor(this.f2311h1);
            }
        }
        this.f2306c1 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2307d1 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2308e1 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
