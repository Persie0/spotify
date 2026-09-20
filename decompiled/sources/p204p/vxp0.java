package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class vxp0 {

    /* JADX INFO: renamed from: a */
    public final rwp0 f245804a;

    /* JADX INFO: renamed from: b */
    public final eta0 f245805b;

    public vxp0(rwp0 rwp0Var, eta0 eta0Var) {
        this.f245804a = rwp0Var;
        this.f245805b = eta0Var;
    }

    /* JADX INFO: renamed from: a */
    public final rwp0 m86669a(Object obj) {
        eta0 eta0Var = this.f245805b;
        if (eta0Var instanceof cta0) {
            if (!((cta0) eta0Var).f41821a.accept(obj)) {
                return null;
            }
        } else {
            if (!(eta0Var instanceof dta0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((dta0) eta0Var).m36846a().m75157y(obj)) {
                return null;
            }
        }
        return this.f245804a;
    }

    public vxp0(rwp0 rwp0Var, InterfaceC1698bb interfaceC1698bb) {
        this(rwp0Var, new cta0(interfaceC1698bb));
    }
}
