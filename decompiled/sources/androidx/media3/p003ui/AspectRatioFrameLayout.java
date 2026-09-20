package androidx.media3.p003ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p204p.ba6;
import p204p.ca6;
import p204p.g3u0;

/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f1115d = 0;

    /* JADX INFO: renamed from: a */
    public final ca6 f1116a;

    /* JADX INFO: renamed from: b */
    public float f1117b;

    /* JADX INFO: renamed from: c */
    public int f1118c;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f1118c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f1117b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f1117b / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        ca6 ca6Var = this.f1116a;
        if (fAbs <= 0.01f) {
            if (ca6Var.f35753b) {
                return;
            }
            ca6Var.f35753b = true;
            ((AspectRatioFrameLayout) ca6Var.f35754c).post(ca6Var);
            return;
        }
        int i3 = this.f1118c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f1117b;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.f1117b;
                    } else {
                        f2 = this.f1117b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f1117b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.f1117b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f1117b;
            measuredWidth = (int) (f4 * f);
        }
        if (!ca6Var.f35753b) {
            ca6Var.f35753b = true;
            ((AspectRatioFrameLayout) ca6Var.f35754c).post(ca6Var);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f1117b != f) {
            this.f1117b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f1118c != i) {
            this.f1118c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1118c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g3u0.f76284a, 0, 0);
            try {
                this.f1118c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f1116a = new ca6(this);
    }

    public void setAspectRatioListener(ba6 ba6Var) {
    }
}
