package p204p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class c3d0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ int f33649e1;

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ f3d0 f33650f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3d0(f3d0 f3d0Var, int i, int i2) {
        super(i);
        this.f33650f1 = f3d0Var;
        this.f33649e1 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public final void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        d531 d531Var = new d531(recyclerView.getContext(), 0);
        d531Var.f103318a = i;
        m1108T0(d531Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: V0 */
    public final void mo927V0(zjv0 zjv0Var, int[] iArr) {
        int i = this.f33649e1;
        f3d0 f3d0Var = this.f33650f1;
        if (i == 0) {
            iArr[0] = f3d0Var.f65479H1.getWidth();
            iArr[1] = f3d0Var.f65479H1.getWidth();
        } else {
            iArr[0] = f3d0Var.f65479H1.getHeight();
            iArr[1] = f3d0Var.f65479H1.getHeight();
        }
    }
}
