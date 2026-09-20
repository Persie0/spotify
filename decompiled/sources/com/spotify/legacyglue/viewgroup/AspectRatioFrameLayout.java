package com.spotify.legacyglue.viewgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import p204p.w2u0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f5097a;

    /* JADX INFO: renamed from: b */
    public final boolean f5098b;

    /* JADX INFO: renamed from: c */
    public final boolean f5099c;

    /* JADX INFO: renamed from: d */
    public boolean f5100d;

    /* JADX INFO: renamed from: e */
    public int f5101e;

    /* JADX INFO: renamed from: f */
    public int f5102f;

    public AspectRatioFrameLayout(Context context) {
        super(context);
        this.f5097a = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        if (defaultSize == 0 && defaultSize2 == 0) {
            Logger.m3973i("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, i2);
            return;
        }
        if (defaultSize == 0) {
            defaultSize = Math.round(defaultSize2 * this.f5097a) + this.f5101e;
        } else if (defaultSize2 == 0) {
            defaultSize2 = Math.round(defaultSize / this.f5097a) + this.f5102f;
        } else if (this.f5097a > defaultSize / defaultSize2) {
            if (!this.f5100d || View.MeasureSpec.getMode(i2) != 1073741824 || !this.f5099c) {
                defaultSize2 = Math.round((defaultSize - this.f5101e) / this.f5097a);
            }
        } else if (!this.f5100d || View.MeasureSpec.getMode(i) != 1073741824 || !this.f5098b) {
            defaultSize = Math.round((defaultSize2 - this.f5102f) * this.f5097a);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    public void setAspectRatio(float f) {
        this.f5097a = f;
    }

    public void setExtraHeight(int i) {
        this.f5102f = i;
    }

    public void setExtraWidth(int i) {
        this.f5101e = i;
    }

    public void setRespectExactMeasures(boolean z) {
        this.f5100d = z;
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5097a = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w2u0.f247429a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f5097a = typedArrayObtainStyledAttributes.getFloat(index, this.f5097a);
            } else if (index == 1) {
                this.f5098b = typedArrayObtainStyledAttributes.getBoolean(index, this.f5098b);
            } else if (index == 0) {
                this.f5099c = typedArrayObtainStyledAttributes.getBoolean(index, this.f5099c);
            } else if (index == 5) {
                this.f5100d = typedArrayObtainStyledAttributes.getBoolean(index, this.f5100d);
            } else if (index == 4) {
                this.f5101e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5101e);
            } else if (index == 3) {
                this.f5102f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5102f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
