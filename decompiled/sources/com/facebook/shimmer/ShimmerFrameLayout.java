package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p204p.ag11;
import p204p.bg11;
import p204p.cg11;
import p204p.d1u0;
import p204p.fg11;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Paint f1663a;

    /* JADX INFO: renamed from: b */
    public final fg11 f1664b;

    /* JADX INFO: renamed from: c */
    public boolean f1665c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f1663a = new Paint();
        this.f1664b = new fg11();
        this.f1665c = true;
        m1426a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1426a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f1664b.setCallback(this);
        if (attributeSet == null) {
            m1427b(new ag11().m38149G0());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d1u0.f44361a, 0, 0);
        try {
            m1427b(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new bg11() : new ag11()).mo29046K0(typedArrayObtainStyledAttributes).m38149G0());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1427b(cg11 cg11Var) {
        boolean zIsStarted;
        fg11 fg11Var = this.f1664b;
        fg11Var.f69179f = cg11Var;
        if (cg11Var != null) {
            fg11Var.f69175b.setXfermode(new PorterDuffXfermode(fg11Var.f69179f.f37527p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        fg11Var.m41563b();
        if (fg11Var.f69179f != null) {
            ValueAnimator valueAnimator = fg11Var.f69178e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                fg11Var.f69178e.cancel();
                fg11Var.f69178e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            cg11 cg11Var2 = fg11Var.f69179f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (cg11Var2.f37531t / cg11Var2.f37530s) + 1.0f);
            fg11Var.f69178e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(fg11Var.f69179f.f37529r);
            fg11Var.f69178e.setRepeatCount(fg11Var.f69179f.f37528q);
            ValueAnimator valueAnimator2 = fg11Var.f69178e;
            cg11 cg11Var3 = fg11Var.f69179f;
            valueAnimator2.setDuration(cg11Var3.f37530s + cg11Var3.f37531t);
            fg11Var.f69178e.addUpdateListener(fg11Var.f69174a);
            if (zIsStarted) {
                fg11Var.f69178e.start();
            }
        }
        fg11Var.invalidateSelf();
        if (cg11Var == null || !cg11Var.f37525n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f1663a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1428c(boolean z) {
        if (this.f1665c) {
            return;
        }
        this.f1665c = true;
        if (z) {
            m1429d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1429d() {
        fg11 fg11Var = this.f1664b;
        ValueAnimator valueAnimator = fg11Var.f69178e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && fg11Var.getCallback() != null) {
                fg11Var.f69178e.start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f1665c) {
            this.f1664b.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1430e() {
        fg11 fg11Var = this.f1664b;
        ValueAnimator valueAnimator = fg11Var.f69178e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        fg11Var.f69178e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1664b.m41562a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1430e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1664b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1664b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1663a = new Paint();
        this.f1664b = new fg11();
        this.f1665c = true;
        m1426a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1663a = new Paint();
        this.f1664b = new fg11();
        this.f1665c = true;
        m1426a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1663a = new Paint();
        this.f1664b = new fg11();
        this.f1665c = true;
        m1426a(context, attributeSet);
    }
}
