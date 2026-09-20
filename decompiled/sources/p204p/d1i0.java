package p204p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class d1i0 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aqs f44302b;

    public /* synthetic */ d1i0(aqs aqsVar, int i) {
        this.f44301a = i;
        this.f44302b = aqsVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dMo26896c;
        switch (this.f44301a) {
            case 0:
                dMo26896c = this.f44302b.mo26896c(f);
                break;
            case 1:
                dMo26896c = this.f44302b.mo26896c(f);
                break;
            default:
                dMo26896c = this.f44302b.mo26896c(f);
                break;
        }
        return (float) dMo26896c;
    }
}
