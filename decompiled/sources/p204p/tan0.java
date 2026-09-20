package p204p;

import android.R;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class tan0 extends RelativeLayout implements re0, job {

    /* JADX INFO: renamed from: c */
    public static final int[] f218638c = {R.attr.state_active};

    /* JADX INFO: renamed from: d */
    public static final int[] f218639d = {-16842910};

    /* JADX INFO: renamed from: a */
    public boolean f218640a;

    /* JADX INFO: renamed from: b */
    public boolean f218641b;

    @Override // p204p.job
    /* JADX INFO: renamed from: a */
    public final boolean mo12577a() {
        return this.f218641b;
    }

    @Override // p204p.re0
    public final boolean isActive() {
        return this.f218640a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f218640a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f218638c);
        }
        if (this.f218641b) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, f218639d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p204p.re0
    public void setActive(boolean z) {
        this.f218640a = z;
        refreshDrawableState();
    }

    @Override // p204p.job
    public void setAppearsDisabled(boolean z) {
        this.f218641b = z;
        refreshDrawableState();
    }
}
