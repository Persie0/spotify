package p204p;

import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes5.dex */
public final class lw51 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mw51 f137454a;

    public lw51(mw51 mw51Var) {
        this.f137454a = mw51Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: q */
    public final void mo37788q(fv51 fv51Var, long j, long j2) {
        mw51 mw51Var = this.f137454a;
        mw51Var.f147719d = fv51Var;
        mw51Var.f147717b.onNext(Optional.ofNullable(fv51Var));
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: r */
    public final void mo37789r(nbc0 nbc0Var, long j) {
        List list = nbc0Var.f152239a;
        mw51 mw51Var = this.f137454a;
        mw51Var.f147718c = list;
        mw51Var.f147716a.onNext(Boolean.valueOf(!list.isEmpty()));
    }
}
