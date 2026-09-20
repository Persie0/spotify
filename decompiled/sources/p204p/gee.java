package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class gee extends j09 {

    /* JADX INFO: renamed from: g */
    public int f79103g;

    /* JADX INFO: renamed from: h */
    public final int f79104h;

    /* JADX INFO: renamed from: i */
    public final int f79105i;

    public gee(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        bcg1.m28727h(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = h1u0.f86735i;
        bcg1.m28728i(context, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.f79103g = Math.max(wtg1.m88944s(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), this.f107385a * 2);
        this.f79104h = wtg1.m88944s(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        this.f79105i = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p204p.j09
    /* JADX INFO: renamed from: a */
    public final void mo44471a() {
    }
}
