package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class wly0 implements cmj {

    /* JADX INFO: renamed from: a */
    public RecyclerView f252643a;

    /* JADX INFO: renamed from: b */
    public boolean f252644b;

    @Override // p204p.cmj
    /* JADX INFO: renamed from: a */
    public final void mo33382a(RecyclerView recyclerView) {
        this.f252643a = recyclerView;
    }

    @Override // p204p.cmj
    /* JADX INFO: renamed from: b */
    public final boolean mo33383b(bmj bmjVar) {
        this.f252644b = true;
        return true;
    }

    @Override // p204p.cmj
    /* JADX INFO: renamed from: c */
    public final void mo33384c(bmj bmjVar) {
        RecyclerView recyclerView;
        if (this.f252644b && (recyclerView = this.f252643a) != null) {
            recyclerView.mo1035v0(0);
        }
        this.f252644b = false;
    }
}
