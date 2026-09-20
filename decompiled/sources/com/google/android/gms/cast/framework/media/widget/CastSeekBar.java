package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.f1g1;
import p204p.g1u0;
import p204p.qwf1;

/* JADX INFO: loaded from: classes3.dex */
public class CastSeekBar extends View {

    /* JADX INFO: renamed from: a */
    public final qwf1 f1823a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1824b;

    /* JADX INFO: renamed from: c */
    public final float f1825c;

    /* JADX INFO: renamed from: d */
    public final float f1826d;

    /* JADX INFO: renamed from: e */
    public final float f1827e;

    /* JADX INFO: renamed from: f */
    public final Paint f1828f;

    /* JADX INFO: renamed from: g */
    public final int f1829g;

    /* JADX INFO: renamed from: h */
    public final int f1830h;

    /* JADX INFO: renamed from: i */
    public final int f1831i;

    public CastSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1488a(Canvas canvas, int i, int i2, int i3, int i4) {
        Paint paint = this.f1828f;
        paint.setColor(i4);
        float f = 1;
        float f2 = i3;
        float f3 = this.f1827e;
        canvas.drawRect((i / f) * f2, -f3, (i2 / f) * f2, f3, paint);
    }

    public int getMaxProgress() {
        this.f1823a.getClass();
        return 1;
    }

    public int getProgress() {
        this.f1823a.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i;
        int i2;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.f1823a.getClass();
        int iMax = Math.max(0, 0);
        if (iMax > 0) {
            i = iMax;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.m1488a(canvas2, 0, i, measuredWidth, this.f1830h);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i = iMax;
        }
        if (progress > i) {
            castSeekBar.m1488a(canvas2, i, progress, measuredWidth, castSeekBar.f1829g);
            i2 = progress;
        } else {
            i2 = progress;
        }
        if (1 > i2) {
            castSeekBar.m1488a(canvas2, i2, 1, measuredWidth, castSeekBar.f1830h);
        }
        canvas2.restoreToCount(iSave2);
        ArrayList arrayList = castSeekBar.f1824b;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f1828f.setColor(castSeekBar.f1831i);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        isEnabled();
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f1825c + paddingLeft + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.f1826d + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.f1823a.getClass();
        return false;
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1824b = new ArrayList();
        setAccessibilityDelegate(new f1g1(this));
        Paint paint = new Paint(1);
        this.f1828f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1825c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f1826d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f1827e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.f1823a = new qwf1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g1u0.f75725a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f1829g = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.f1830h = context.getResources().getColor(resourceId3);
        this.f1831i = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }
}
