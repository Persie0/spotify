package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class noj0 implements a791 {

    /* JADX INFO: renamed from: a */
    public final ob91 f156722a;

    /* JADX INFO: renamed from: b */
    public final ec40 f156723b;

    public noj0(ob91 ob91Var, ec40 ec40Var) {
        this.f156722a = ob91Var;
        this.f156723b = ec40Var;
    }

    @Override // p204p.a791
    /* JADX INFO: renamed from: a */
    public final void mo24930a() {
        ec40 ec40Var = this.f156723b;
        boolean z = ec40Var instanceof ny51;
        ob91 ob91Var = this.f156722a;
        if (z) {
            ob91Var.mo48985d(((ny51) ec40Var).f159718a);
        } else {
            if (!(ec40Var instanceof fgw)) {
                throw new NoWhenBranchMatchedException();
            }
            ob91Var.mo48984a(((fgw) ec40Var).f69410a);
        }
    }
}
