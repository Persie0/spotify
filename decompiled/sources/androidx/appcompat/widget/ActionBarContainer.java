package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.h3u0;
import p204p.mec1;
import p204p.ony0;
import p204p.s10;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f95a;

    /* JADX INFO: renamed from: b */
    public View f96b;

    /* JADX INFO: renamed from: c */
    public View f97c;

    /* JADX INFO: renamed from: d */
    public Drawable f98d;

    /* JADX INFO: renamed from: e */
    public Drawable f99e;

    /* JADX INFO: renamed from: f */
    public Drawable f100f;

    /* JADX INFO: renamed from: g */
    public final boolean f101g;

    /* JADX INFO: renamed from: h */
    public boolean f102h;

    /* JADX INFO: renamed from: i */
    public final int f103i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f98d;
        if (drawable != null && drawable.isStateful()) {
            this.f98d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f99e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f99e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f100f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f100f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f98d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f99e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f100f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f96b = findViewById(R.id.action_bar);
        this.f97c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f95a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f101g) {
            Drawable drawable = this.f100f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f98d == null) {
                z2 = false;
            } else if (this.f96b.getVisibility() == 0) {
                this.f98d.setBounds(this.f96b.getLeft(), this.f96b.getTop(), this.f96b.getRight(), this.f96b.getBottom());
            } else {
                View view = this.f97c;
                if (view == null || view.getVisibility() != 0) {
                    this.f98d.setBounds(0, 0, 0, 0);
                } else {
                    this.f98d.setBounds(this.f97c.getLeft(), this.f97c.getTop(), this.f97c.getRight(), this.f97c.getBottom());
                }
            }
            this.f102h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f96b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f103i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f96b == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f98d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f98d);
        }
        this.f98d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f96b;
            if (view != null) {
                this.f98d.setBounds(view.getLeft(), this.f96b.getTop(), this.f96b.getRight(), this.f96b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f101g ? !(this.f98d != null || this.f99e != null) : this.f100f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f100f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f100f);
        }
        this.f100f = drawable;
        boolean z = this.f101g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f100f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f98d != null || this.f99e != null) : this.f100f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f99e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f99e);
        }
        this.f99e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f102h && this.f99e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f101g ? !(this.f98d != null || this.f99e != null) : this.f100f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f95a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f98d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f99e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f100f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f98d;
        boolean z = this.f101g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f99e && this.f102h) {
            return true;
        }
        return (drawable == this.f100f && z) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        s10 s10Var = new s10(this, 0);
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(s10Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87321a);
        this.f98d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f99e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f103i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f101g = true;
            this.f100f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f101g ? !(this.f98d != null || this.f99e != null) : this.f100f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(ony0 ony0Var) {
    }
}
