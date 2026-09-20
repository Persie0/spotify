package p204p;

import android.R;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public class oan0 extends ConstraintLayout implements re0, job {

    /* JADX INFO: renamed from: T0 */
    public static final int[] f163368T0 = {R.attr.state_active};

    /* JADX INFO: renamed from: U0 */
    public static final int[] f163369U0 = {-16842910};

    /* JADX INFO: renamed from: R0 */
    public boolean f163370R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f163371S0;

    @Override // p204p.job
    /* JADX INFO: renamed from: a */
    public final boolean mo12577a() {
        return this.f163371S0;
    }

    @Override // p204p.re0
    public final boolean isActive() {
        return this.f163370R0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f163370R0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f163368T0);
        }
        if (this.f163371S0) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, f163369U0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p204p.re0
    public void setActive(boolean z) {
        this.f163370R0 = z;
        refreshDrawableState();
    }

    @Override // p204p.job
    public void setAppearsDisabled(boolean z) {
        this.f163371S0 = z;
        refreshDrawableState();
    }
}
