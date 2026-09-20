package p204p;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class ad00 extends GridLayoutManager {

    /* JADX INFO: renamed from: m1 */
    public final tr50 f14482m1;

    /* JADX INFO: renamed from: n1 */
    public final dw31 f14483n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f14484o1;

    public ad00(int i, int i2, Context context, bdv bdvVar) {
        super(i2);
        this.f14482m1 = new tr50(bdvVar, i);
        this.f14483n1 = new dw31(bdvVar, i2);
        this.f14484o1 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        this.f1161k1 = this.f14483n1;
        recyclerView.m1011i(this.f14482m1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public final void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
        super.mo941i0(recyclerView, vjv0Var);
        this.f1161k1 = new uz10();
        tr50 tr50Var = this.f14482m1;
        recyclerView.m1022o0(tr50Var);
        tr50Var.f222982d++;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public final void mo908o0(RecyclerView recyclerView, int i, int i2) {
        super.mo908o0(recyclerView, i, i2);
        this.f14482m1.f222982d++;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: p0 */
    public final void mo909p0(RecyclerView recyclerView) {
        super.mo909p0(recyclerView);
        this.f14482m1.f222982d++;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q */
    public final boolean mo951q() {
        return this.f14484o1 && super.mo951q();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public final void mo910q0(RecyclerView recyclerView, int i, int i2) {
        super.mo910q0(recyclerView, i, i2);
        this.f14482m1.f222982d++;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r */
    public final boolean mo953r() {
        return this.f14484o1 && super.mo953r();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public final void mo911r0(RecyclerView recyclerView, int i, int i2) {
        super.mo911r0(recyclerView, i, i2);
        this.f14482m1.f222982d++;
    }
}
