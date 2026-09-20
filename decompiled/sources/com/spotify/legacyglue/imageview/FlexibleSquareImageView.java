package com.spotify.legacyglue.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import p204p.c95;
import p204p.t2u0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class FlexibleSquareImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: d */
    public final float f5078d;

    public FlexibleSquareImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax = (int) Math.max(View.MeasureSpec.getSize(i) * this.f5078d, getSuggestedMinimumWidth());
        setMeasuredDimension(iMax, iMax);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2u0.f216627a, i, 0);
        c95.m31843i(typedArrayObtainStyledAttributes.hasValue(0));
        this.f5078d = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
