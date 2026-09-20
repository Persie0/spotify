package p204p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class e000 {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f54820a = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public static final void m37475a(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(i, new int[]{R.attr.fontFamily});
            Typeface typefaceM60325C = lzj.m60325C(textView.getContext(), typedArrayObtainStyledAttributes.getResourceId(0, 0), 1);
            if (typefaceM60325C != null) {
                textView.setTypeface(typefaceM60325C);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX INFO: renamed from: b */
    public static final void m37476b(TextView textView, AttributeSet attributeSet, int i) {
        boolean z;
        SparseIntArray sparseIntArray;
        int resourceId;
        int i2;
        Context context = textView.getContext();
        if (attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i3 = 0; i3 < attributeCount; i3++) {
                if (attributeSet.getAttributeNameResource(i3) != 16842804 || (resourceId = attributeSet.getAttributeResourceValue(i3, 0)) == 0) {
                }
            }
            if (attributeSet == null || i == 0) {
                z = false;
            } else {
                z = true;
            }
            sparseIntArray = f54820a;
            if (z || (i2 = sparseIntArray.get(i, -1)) == -1) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance}, i, 0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (z) {
                    sparseIntArray.put(i, resourceId);
                }
            } else {
                resourceId = i2;
            }
        } else {
            if (attributeSet == null) {
                z = false;
            } else {
                z = false;
            }
            sparseIntArray = f54820a;
            if (z) {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance}, i, 0);
                resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                typedArrayObtainStyledAttributes2.recycle();
                if (z) {
                    sparseIntArray.put(i, resourceId);
                }
            } else {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance}, i, 0);
                resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
                typedArrayObtainStyledAttributes3.recycle();
                if (z) {
                    sparseIntArray.put(i, resourceId);
                }
            }
        }
        m37475a(textView, resourceId);
    }
}
