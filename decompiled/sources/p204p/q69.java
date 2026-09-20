package p204p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes7.dex */
public final class q69 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185708a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f185708a) {
            case 0:
            case 2:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 1:
                return f * f * f * f * f;
        }
    }
}
