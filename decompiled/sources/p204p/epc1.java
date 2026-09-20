package p204p;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class epc1 extends dpc1 {
    @Override // p204p.wj50
    /* JADX INFO: renamed from: F */
    public final float mo39655F(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p204p.wj50
    /* JADX INFO: renamed from: X */
    public final void mo39656X(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p204p.dpc1, p204p.wj50
    /* JADX INFO: renamed from: Y */
    public final void mo36566Y(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p204p.dpc1
    /* JADX INFO: renamed from: l0 */
    public final void mo36567l0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p204p.dpc1
    /* JADX INFO: renamed from: m0 */
    public final void mo36568m0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p204p.dpc1
    /* JADX INFO: renamed from: n0 */
    public final void mo36569n0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
