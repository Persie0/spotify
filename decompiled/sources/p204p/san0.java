package p204p;

import android.R;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class san0 extends FrameLayout implements re0, job {

    /* JADX INFO: renamed from: c */
    public static final int[] f207241c = {R.attr.state_active};

    /* JADX INFO: renamed from: d */
    public static final int[] f207242d = {-16842910};

    /* JADX INFO: renamed from: a */
    public boolean f207243a;

    /* JADX INFO: renamed from: b */
    public boolean f207244b;

    @Override // p204p.job
    /* JADX INFO: renamed from: a */
    public final boolean mo12577a() {
        return this.f207244b;
    }

    @Override // p204p.re0
    public final boolean isActive() {
        return this.f207243a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f207243a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f207241c);
        }
        if (this.f207244b) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, f207242d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p204p.re0
    public void setActive(boolean z) {
        this.f207243a = z;
        refreshDrawableState();
    }

    @Override // p204p.job
    public void setAppearsDisabled(boolean z) {
        this.f207244b = z;
        refreshDrawableState();
    }
}
