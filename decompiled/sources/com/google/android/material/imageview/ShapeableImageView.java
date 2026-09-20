package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import p204p.dh01;
import p204p.eh01;
import p204p.ei01;
import p204p.fi01;
import p204p.h1u0;
import p204p.lzj;
import p204p.n3d0;
import p204p.o0i;
import p204p.vgg1;
import p204p.wtg1;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements ei01 {

    /* JADX INFO: renamed from: L0 */
    public n3d0 f2124L0;

    /* JADX INFO: renamed from: M0 */
    public dh01 f2125M0;

    /* JADX INFO: renamed from: N0 */
    public float f2126N0;

    /* JADX INFO: renamed from: O0 */
    public final Path f2127O0;

    /* JADX INFO: renamed from: P0 */
    public final int f2128P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f2129Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f2130R0;

    /* JADX INFO: renamed from: S0 */
    public final int f2131S0;

    /* JADX INFO: renamed from: T0 */
    public final int f2132T0;

    /* JADX INFO: renamed from: U0 */
    public final int f2133U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f2134V0;

    /* JADX INFO: renamed from: d */
    public final o0i f2135d;

    /* JADX INFO: renamed from: e */
    public final RectF f2136e;

    /* JADX INFO: renamed from: f */
    public final RectF f2137f;

    /* JADX INFO: renamed from: g */
    public final Paint f2138g;

    /* JADX INFO: renamed from: h */
    public final Paint f2139h;

    /* JADX INFO: renamed from: i */
    public final Path f2140i;

    /* JADX INFO: renamed from: t */
    public ColorStateList f2141t;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1622e() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m1623f(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.f2136e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        dh01 dh01Var = this.f2125M0;
        o0i o0iVar = this.f2135d;
        Path path = this.f2140i;
        o0iVar.m66016b(dh01Var, 1.0f, rectF, null, path);
        Path path2 = this.f2127O0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f2137f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f2131S0;
    }

    public final int getContentPaddingEnd() {
        int i = this.f2133U0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m1622e() ? this.f2128P0 : this.f2130R0;
    }

    public int getContentPaddingLeft() {
        int i = this.f2133U0;
        int i2 = this.f2132T0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m1622e() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!m1622e() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f2128P0;
    }

    public int getContentPaddingRight() {
        int i = this.f2133U0;
        int i2 = this.f2132T0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m1622e() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m1622e() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f2130R0;
    }

    public final int getContentPaddingStart() {
        int i = this.f2132T0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m1622e() ? this.f2130R0 : this.f2128P0;
    }

    public int getContentPaddingTop() {
        return this.f2129Q0;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public dh01 getShapeAppearanceModel() {
        return this.f2125M0;
    }

    public ColorStateList getStrokeColor() {
        return this.f2141t;
    }

    public float getStrokeWidth() {
        return this.f2126N0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f2127O0, this.f2139h);
        if (this.f2141t == null) {
            return;
        }
        float f = this.f2126N0;
        Paint paint = this.f2138g;
        paint.setStrokeWidth(f);
        int colorForState = this.f2141t.getColorForState(getDrawableState(), this.f2141t.getDefaultColor());
        if (this.f2126N0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f2140i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f2134V0 && isLayoutDirectionResolved()) {
            this.f2134V0 = true;
            if (!isPaddingRelative() && this.f2132T0 == Integer.MIN_VALUE && this.f2133U0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1623f(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p204p.ei01
    public void setShapeAppearanceModel(dh01 dh01Var) {
        this.f2125M0 = dh01Var;
        n3d0 n3d0Var = this.f2124L0;
        if (n3d0Var != null) {
            n3d0Var.setShapeAppearanceModel(dh01Var);
        }
        m1623f(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f2141t = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(lzj.m60387w(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f2126N0 != f) {
            this.f2126N0 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.f2135d = eh01.f59439a;
        this.f2140i = new Path();
        this.f2134V0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f2139h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2136e = new RectF();
        this.f2137f = new RectF();
        this.f2127O0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h1u0.f86720I, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        this.f2141t = wtg1.m88942q(context2, typedArrayObtainStyledAttributes, 9);
        this.f2126N0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2128P0 = dimensionPixelSize;
        this.f2129Q0 = dimensionPixelSize;
        this.f2130R0 = dimensionPixelSize;
        this.f2131S0 = dimensionPixelSize;
        this.f2128P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f2129Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f2130R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f2131S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f2132T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f2133U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2138g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f2125M0 = dh01.m35958b(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).m74257d();
        setOutlineProvider(new fi01(this));
    }
}
