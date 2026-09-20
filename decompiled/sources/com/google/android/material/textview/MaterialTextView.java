package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;
import p204p.h1u0;
import p204p.ttg1;
import p204p.vgg1;
import p204p.wtg1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (ttg1.m81522q(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, h1u0.f86714C);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iM88944s = -1;
            for (int i2 = 0; i2 < 2 && iM88944s < 0; i2++) {
                iM88944s = wtg1.m88944s(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM88944s >= 0) {
                setLineHeight(iM88944s);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(vgg1.m85455K(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (ttg1.m81522q(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = h1u0.f86715D;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int iM88944s = -1;
            for (int i3 = 0; i3 < 2 && iM88944s < 0; i3++) {
                iM88944s = wtg1.m88944s(context2, typedArrayObtainStyledAttributes, iArr2[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM88944s != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, h1u0.f86714C);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iM88944s2 = -1;
                for (int i4 = 0; i4 < 2 && iM88944s2 < 0; i4++) {
                    iM88944s2 = wtg1.m88944s(context3, typedArrayObtainStyledAttributes3, iArr3[i4], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iM88944s2 >= 0) {
                    setLineHeight(iM88944s2);
                }
            }
        }
    }
}
