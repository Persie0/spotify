package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i09 extends ProgressBar {

    /* JADX INFO: renamed from: L0 */
    public final h09 f97157L0;

    /* JADX INFO: renamed from: a */
    public final gl80 f97158a;

    /* JADX INFO: renamed from: b */
    public int f97159b;

    /* JADX INFO: renamed from: c */
    public final boolean f97160c;

    /* JADX INFO: renamed from: d */
    public final int f97161d;

    /* JADX INFO: renamed from: e */
    public b15 f97162e;

    /* JADX INFO: renamed from: f */
    public boolean f97163f;

    /* JADX INFO: renamed from: g */
    public int f97164g;

    /* JADX INFO: renamed from: h */
    public final g09 f97165h;

    /* JADX INFO: renamed from: i */
    public final g09 f97166i;

    /* JADX INFO: renamed from: t */
    public final h09 f97167t;

    public i09(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.f97163f = false;
        this.f97164g = 4;
        this.f97165h = new g09(this, 0);
        this.f97166i = new g09(this, 1);
        this.f97167t = new h09(this, 0);
        this.f97157L0 = new h09(this, 1);
        Context context2 = getContext();
        gl80 gl80Var = new gl80(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        bcg1.m28727h(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = h1u0.f86744r;
        bcg1.m28728i(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        gl80Var.f81019g = typedArrayObtainStyledAttributes.getInt(0, 1);
        gl80Var.f81020h = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        gl80Var.mo44471a();
        gl80Var.f81021i = gl80Var.f81020h == 1;
        this.f97158a = gl80Var;
        bcg1.m28727h(context2, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr2 = h1u0.f86730d;
        bcg1.m28728i(context2, attributeSet, iArr2, i, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        typedArrayObtainStyledAttributes2.getInt(5, -1);
        this.f97161d = Math.min(typedArrayObtainStyledAttributes2.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes2.recycle();
        this.f97162e = new b15();
        this.f97160c = true;
    }

    private tgs getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f221881Y;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f87632Y;
    }

    /* JADX INFO: renamed from: a */
    public void mo1624a(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f97159b = i;
            this.f97163f = true;
            if (getIndeterminateDrawable().isVisible()) {
                b15 b15Var = this.f97162e;
                ContentResolver contentResolver = getContext().getContentResolver();
                b15Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f221882Z.mo29744K();
                    return;
                }
            }
            getIndeterminateDrawable();
            this.f97167t.mo24427a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49314b() {
        WeakHashMap weakHashMap = mec1.f142677a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f97158a.f107390f;
    }

    public int[] getIndicatorColor() {
        return this.f97158a.f107387c;
    }

    public int getShowAnimationBehavior() {
        return this.f97158a.f107389e;
    }

    public int getTrackColor() {
        return this.f97158a.f107388d;
    }

    public int getTrackCornerRadius() {
        return this.f97158a.f107386b;
    }

    public int getTrackThickness() {
        return this.f97158a.f107385a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f221882Z.mo29743G(this.f97167t);
        }
        h4r progressDrawable = getProgressDrawable();
        h09 h09Var = this.f97157L0;
        if (progressDrawable != null) {
            h4r progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f59394f == null) {
                progressDrawable2.f59394f = new ArrayList();
            }
            if (!progressDrawable2.f59394f.contains(h09Var)) {
                progressDrawable2.f59394f.add(h09Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            tn40 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f59394f == null) {
                indeterminateDrawable.f59394f = new ArrayList();
            }
            if (!indeterminateDrawable.f59394f.contains(h09Var)) {
                indeterminateDrawable.f59394f.add(h09Var);
            }
        }
        if (m49314b()) {
            if (this.f97161d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f97166i);
        removeCallbacks(this.f97165h);
        ((egs) getCurrentDrawable()).m38879e(false, false, false);
        tn40 indeterminateDrawable = getIndeterminateDrawable();
        h09 h09Var = this.f97157L0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().m38881g(h09Var);
            getIndeterminateDrawable().f221882Z.mo29746S();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m38881g(h09Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
            tgs currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int iMo80779e = currentDrawingDelegate.mo80779e();
            int iMo80778d = currentDrawingDelegate.mo80778d();
            setMeasuredDimension(iMo80779e < 0 ? getMeasuredWidth() : iMo80779e + getPaddingLeft() + getPaddingRight(), iMo80778d < 0 ? getMeasuredHeight() : iMo80778d + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f97160c) {
            ((egs) getCurrentDrawable()).m38879e(m49314b(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f97160c) {
            ((egs) getCurrentDrawable()).m38879e(m49314b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(b15 b15Var) {
        this.f97162e = b15Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f59391c = b15Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f59391c = b15Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f97158a.f107390f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            egs egsVar = (egs) getCurrentDrawable();
            if (egsVar != null) {
                egsVar.m38879e(false, false, false);
            }
            super.setIndeterminate(z);
            egs egsVar2 = (egs) getCurrentDrawable();
            if (egsVar2 != null) {
                egsVar2.m38879e(m49314b(), false, false);
            }
            if ((egsVar2 instanceof tn40) && m49314b()) {
                ((tn40) egsVar2).f221882Z.mo29745Q();
            }
            this.f97163f = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof tn40)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((egs) drawable).m38879e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vtg1.m86386m(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f97158a.f107387c = iArr;
        getIndeterminateDrawable().f221882Z.mo29748x();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        mo1624a(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof h4r)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            h4r h4rVar = (h4r) drawable;
            h4rVar.m38879e(false, false, false);
            super.setProgressDrawable(h4rVar);
            h4rVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f97158a.f107389e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        gl80 gl80Var = this.f97158a;
        if (gl80Var.f107388d != i) {
            gl80Var.f107388d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        gl80 gl80Var = this.f97158a;
        if (gl80Var.f107386b != i) {
            gl80Var.f107386b = Math.min(i, gl80Var.f107385a / 2);
        }
    }

    public void setTrackThickness(int i) {
        gl80 gl80Var = this.f97158a;
        if (gl80Var.f107385a != i) {
            gl80Var.f107385a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f97164g = i;
    }

    @Override // android.widget.ProgressBar
    public tn40 getIndeterminateDrawable() {
        return (tn40) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public h4r getProgressDrawable() {
        return (h4r) super.getProgressDrawable();
    }
}
