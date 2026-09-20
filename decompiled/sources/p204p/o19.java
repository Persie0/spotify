package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o19 extends FrameLayout {

    /* JADX INFO: renamed from: t */
    public static final eef f160650t = new eef(2);

    /* JADX INFO: renamed from: a */
    public n19 f160651a;

    /* JADX INFO: renamed from: b */
    public m19 f160652b;

    /* JADX INFO: renamed from: c */
    public int f160653c;

    /* JADX INFO: renamed from: d */
    public final float f160654d;

    /* JADX INFO: renamed from: e */
    public final float f160655e;

    /* JADX INFO: renamed from: f */
    public final int f160656f;

    /* JADX INFO: renamed from: g */
    public final int f160657g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f160658h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f160659i;

    public o19(Context context, AttributeSet attributeSet) {
        super(vgg1.m85455K(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h1u0.f86721J);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32548l(this, dimensionPixelSize);
        }
        this.f160653c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f160654d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(wtg1.m88942q(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(bga.m29072O(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f160655e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f160656f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f160657g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f160650t);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(vtg1.m86393t(vtg1.m86387n(this, R.attr.colorSurface), vtg1.m86387n(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f160658h;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = mec1.f142677a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f160655e;
    }

    public int getAnimationMode() {
        return this.f160653c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f160654d;
    }

    public int getMaxInlineActionWidth() {
        return this.f160657g;
    }

    public int getMaxWidth() {
        return this.f160656f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m19 m19Var = this.f160652b;
        if (m19Var != null) {
            ((k19) m19Var).m55053a();
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        aec1.m25717c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        m19 m19Var = this.f160652b;
        if (m19Var != null) {
            k19 k19Var = (k19) m19Var;
            p19 p19Var = k19Var.f118255a;
            bwt0 bwt0VarM30706t = bwt0.m30706t();
            j19 j19Var = p19Var.f173006o;
            synchronized (bwt0VarM30706t.f31729b) {
                z = true;
                if (!bwt0VarM30706t.m30721v(j19Var)) {
                    j831 j831Var = (j831) bwt0VarM30706t.f31732e;
                    if (!(j831Var != null && j831Var.f109784a.get() == j19Var)) {
                        z = false;
                    }
                }
            }
            if (z) {
                p19.f172990p.post(new n10(k19Var, 16));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n19 n19Var = this.f160651a;
        if (n19Var != null) {
            p19 p19Var = (p19) ((egb1) n19Var).f59299b;
            p19Var.f172994c.setOnLayoutChangeListener(null);
            p19Var.m68779e();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f160656f;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f160653c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f160658h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f160658h);
            drawable.setTintMode(this.f160659i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f160658h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f160659i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f160659i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(m19 m19Var) {
        this.f160652b = m19Var;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f160650t);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(n19 n19Var) {
        this.f160651a = n19Var;
    }
}
