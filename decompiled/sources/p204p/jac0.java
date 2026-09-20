package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class jac0 implements kac0 {

    /* JADX INFO: renamed from: a */
    public final List f110429a;

    public jac0(qf40 qf40Var) {
        this.f110429a = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jac0) && wj50.m88271j(this.f110429a, ((jac0) obj).f110429a);
    }

    public final int hashCode() {
        return this.f110429a.hashCode();
    }
}
