package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class da31 extends sjv0 {

    /* JADX INFO: renamed from: a */
    public boolean f46968a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jl80 f46969b;

    public da31(jl80 jl80Var) {
        this.f46969b = jl80Var;
    }

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: a */
    public final void mo35393a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f46968a) {
            this.f46968a = false;
            this.f46969b.m53665o();
        }
    }

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: f */
    public final void mo35394f(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f46968a = true;
    }
}
