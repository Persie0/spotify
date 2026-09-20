package p204p;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class dwl implements a791 {

    /* JADX INFO: renamed from: a */
    public final ob91 f53722a;

    /* JADX INFO: renamed from: b */
    public final ec40 f53723b;

    public dwl(ob91 ob91Var, ec40 ec40Var) {
        this.f53722a = ob91Var;
        this.f53723b = ec40Var;
    }

    @Override // p204p.a791
    /* JADX INFO: renamed from: a */
    public final void mo24930a() {
        ob91 ob91Var = this.f53722a;
        Drawable drawableMo66627h = ob91Var.mo66627h();
        ec40 ec40Var = this.f53723b;
        p340 p340VarMo38473j = ec40Var.mo38473j();
        boolean z = ec40Var instanceof ny51;
        vul vulVar = new vul(drawableMo66627h, p340VarMo38473j != null ? ufc1.m82966d(p340VarMo38473j, ob91Var.getView().getResources()) : null, ec40Var.getRequest().f239415q, (z && ((ny51) ec40Var).f159724g) ? false : true);
        if (z) {
            ob91Var.mo48985d(ufc1.m82967e(vulVar));
        } else {
            if (!(ec40Var instanceof fgw)) {
                throw new NoWhenBranchMatchedException();
            }
            ob91Var.mo48984a(ufc1.m82967e(vulVar));
        }
    }
}
