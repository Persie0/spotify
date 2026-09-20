package p204p;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes3.dex */
public final class bg11 extends AbstractC1806e9 {
    public bg11() {
        super(16);
        ((cg11) this.f57320b).f37527p = false;
    }

    /* JADX INFO: renamed from: F1 */
    public final void m29045F1(int i) {
        cg11 cg11Var = (cg11) this.f57320b;
        cg11Var.f37516e = (i & 16777215) | (cg11Var.f37516e & (-16777216));
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: K0 */
    public final AbstractC1806e9 mo29046K0(TypedArray typedArray) {
        cg11 cg11Var = (cg11) this.f57320b;
        super.mo29046K0(typedArray);
        if (typedArray.hasValue(2)) {
            m29045F1(typedArray.getColor(2, cg11Var.f37516e));
        }
        if (typedArray.hasValue(12)) {
            cg11Var.f37515d = typedArray.getColor(12, cg11Var.f37515d);
        }
        return this;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: k1 */
    public final AbstractC1806e9 mo25838k1() {
        return this;
    }
}
