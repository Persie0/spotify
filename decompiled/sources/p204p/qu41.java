package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qu41 {

    /* JADX INFO: renamed from: a */
    public final ntt0 f192559a;

    /* JADX INFO: renamed from: b */
    public final Object f192560b;

    public qu41(ntt0 ntt0Var, List list) {
        this.f192559a = ntt0Var;
        this.f192560b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu41)) {
            return false;
        }
        qu41 qu41Var = (qu41) obj;
        return wj50.m88271j(this.f192559a, qu41Var.f192559a) && this.f192560b.equals(qu41Var.f192560b);
    }

    public final int hashCode() {
        ntt0 ntt0Var = this.f192559a;
        return this.f192560b.hashCode() + ((ntt0Var == null ? 0 : ntt0Var.hashCode()) * 31);
    }
}
