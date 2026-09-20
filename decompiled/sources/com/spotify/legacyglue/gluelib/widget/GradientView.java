package com.spotify.legacyglue.gluelib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p204p.mec1;
import p204p.s2u0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class GradientView extends View {

    /* JADX INFO: renamed from: a */
    public GradientDrawable f5068a;

    /* JADX INFO: renamed from: b */
    public final int[] f5069b;

    /* JADX INFO: renamed from: c */
    public GradientDrawable.Orientation f5070c;

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (isInEditMode()) {
            this.f5069b = new int[]{-16777216, -1};
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s2u0.f205072a);
            this.f5069b = new int[]{typedArrayObtainStyledAttributes.getColor(0, -16777216), typedArrayObtainStyledAttributes.getColor(1, -1)};
            i = (int) typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        setAngle(i);
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f5068a == null) {
            this.f5068a = new GradientDrawable(this.f5070c, this.f5069b);
        }
        this.f5068a.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5068a == null) {
            this.f5068a = new GradientDrawable(this.f5070c, this.f5069b);
        }
        this.f5068a.setBounds(0, 0, i3 - i, i4 - i2);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAngle(int i) {
        int i2 = i / 90;
        if (i2 == 0) {
            this.f5070c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else if (i2 == 1) {
            this.f5070c = GradientDrawable.Orientation.BOTTOM_TOP;
        } else if (i2 == 2) {
            this.f5070c = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if (i2 != 3) {
            this.f5070c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            this.f5070c = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        this.f5068a = null;
    }

    public void setEndColor(int i) {
        this.f5069b[1] = i;
        this.f5068a = null;
    }

    public void setStartColor(int i) {
        this.f5069b[0] = i;
        this.f5068a = null;
    }

    public GradientView(Context context) {
        super(context);
        this.f5070c = GradientDrawable.Orientation.LEFT_RIGHT;
        this.f5069b = new int[]{-16777216, -1};
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(null);
    }
}
