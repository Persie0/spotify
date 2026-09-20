package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p204p.ase;
import p204p.h1u0;
import p204p.mec1;

/* JADX INFO: loaded from: classes4.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2312a;

    /* JADX INFO: renamed from: b */
    public final int f2313b;

    /* JADX INFO: renamed from: c */
    public final float f2314c;

    /* JADX INFO: renamed from: d */
    public final Paint f2315d;

    /* JADX INFO: renamed from: e */
    public final RectF f2316e;

    /* JADX INFO: renamed from: f */
    public final int f2317f;

    /* JADX INFO: renamed from: g */
    public float f2318g;

    /* JADX INFO: renamed from: h */
    public boolean f2319h;

    /* JADX INFO: renamed from: i */
    public double f2320i;

    /* JADX INFO: renamed from: t */
    public int f2321t;

    public ClockHandView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1666a(float f) {
        float f2 = f % 360.0f;
        this.f2318g = f2;
        this.f2320i = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f2321t * ((float) Math.cos(this.f2320i))) + (getWidth() / 2);
        float fSin = (this.f2321t * ((float) Math.sin(this.f2320i))) + height;
        float f3 = this.f2313b;
        this.f2316e.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f2312a.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((ase) it.next());
            if (Math.abs(clockFaceView.f2310g1 - f2) > 0.001f) {
                clockFaceView.f2310g1 = f2;
                clockFaceView.m1665z();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fCos = (this.f2321t * ((float) Math.cos(this.f2320i))) + f;
        float f2 = height;
        float fSin = (this.f2321t * ((float) Math.sin(this.f2320i))) + f2;
        Paint paint = this.f2315d;
        paint.setStrokeWidth(0.0f);
        int i = this.f2313b;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f2320i);
        double dCos = Math.cos(this.f2320i);
        double d = this.f2321t - i;
        paint.setStrokeWidth(this.f2317f);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f2314c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1666a(this.f2318g);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f2319h = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f2319h;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f2319h;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f2318g != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m1666a(f);
            z3 = true;
        }
        this.f2319h = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2312a = new ArrayList();
        Paint paint = new Paint();
        this.f2315d = paint;
        this.f2316e = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86737k, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f2321t = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2313b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2317f = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2314c = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m1666a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = mec1.f142677a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
