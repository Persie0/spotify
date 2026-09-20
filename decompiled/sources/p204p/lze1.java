package p204p;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class lze1 extends mze1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final hze1 f138356a;

    public lze1(hze1 hze1Var) {
        this.f138356a = hze1Var;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: a */
    public final hze1 mo60301a(z050 z050Var) {
        return this.f138356a;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: b */
    public final ize1 mo60302b(lba0 lba0Var) {
        return null;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: c */
    public final List mo60303c(lba0 lba0Var) {
        return Collections.singletonList(this.f138356a);
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: d */
    public final boolean mo60304d(z050 z050Var) {
        return false;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: e */
    public final boolean mo60305e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof lze1;
        hze1 hze1Var = this.f138356a;
        if (z) {
            return hze1Var.equals(((lze1) obj).f138356a);
        }
        if (obj instanceof ro41) {
            ro41 ro41Var = (ro41) obj;
            if (ro41Var.mo60305e() && hze1Var.equals(ro41Var.mo60301a(z050.f277960f))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.mze1
    /* JADX INFO: renamed from: f */
    public final boolean mo60306f(lba0 lba0Var, hze1 hze1Var) {
        return this.f138356a.equals(hze1Var);
    }

    public final int hashCode() {
        int i = this.f138356a.f96910b;
        return ((i + 31) ^ (i + 31)) ^ 1;
    }

    public final String toString() {
        return "FixedRules:" + this.f138356a;
    }
}
