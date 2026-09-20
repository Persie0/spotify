package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j09 {

    /* JADX INFO: renamed from: a */
    public int f107385a;

    /* JADX INFO: renamed from: b */
    public int f107386b;

    /* JADX INFO: renamed from: c */
    public int[] f107387c;

    /* JADX INFO: renamed from: d */
    public int f107388d;

    /* JADX INFO: renamed from: e */
    public int f107389e;

    /* JADX INFO: renamed from: f */
    public int f107390f;

    public j09(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f107387c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        bcg1.m28727h(context, attributeSet, i, i2);
        int[] iArr = h1u0.f86730d;
        bcg1.m28728i(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f107385a = wtg1.m88944s(context, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        this.f107386b = Math.min(wtg1.m88944s(context, typedArrayObtainStyledAttributes, 7, 0), this.f107385a / 2);
        this.f107389e = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f107390f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f107387c = new int[]{vtg1.m86386m(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f107387c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f107387c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f107388d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            this.f107388d = this.f107387c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f107388d = vtg1.m86385l(this.f107388d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo44471a();
}
