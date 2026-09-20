package p204p;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class y5g1 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final h5g1 f269429a;

    public y5g1(h5g1 h5g1Var) {
        this.f269429a = h5g1Var;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return Status.f1837e;
    }

    public final String toString() {
        h5g1 h5g1Var = this.f269429a;
        ig31.m50506x(h5g1Var);
        return "OptInOptionsResultImpl[" + (h5g1Var.f87837a == 1) + "]";
    }
}
