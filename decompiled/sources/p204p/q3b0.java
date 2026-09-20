package p204p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q3b0 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f184830a;

    /* JADX INFO: renamed from: b */
    public final float f184831b;

    public q3b0(float[] fArr) {
        this.f184830a = fArr;
        this.f184831b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f184830a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f184831b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return edb.m38555d(fArr[iMin + 1], f4, f3, f4);
    }
}
