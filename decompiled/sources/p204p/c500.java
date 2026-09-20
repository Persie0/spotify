package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c500 extends q0f1 {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ i500 f34042Z;

    public c500(i500 i500Var) {
        this.f34042Z = i500Var;
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: L */
    public final View mo31451L(int i) {
        i500 i500Var = this.f34042Z;
        View view = i500Var.f98706h1;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + i500Var + " does not have a view");
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: M */
    public final boolean mo31452M() {
        return this.f34042Z.f98706h1 != null;
    }
}
