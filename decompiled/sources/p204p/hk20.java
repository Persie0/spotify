package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hk20 {

    /* JADX INFO: renamed from: a */
    public final er40 f92325a;

    public hk20(er40 er40Var) {
        this.f92325a = er40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk20) && wj50.m88271j(this.f92325a, ((hk20) obj).f92325a);
    }

    public final int hashCode() {
        er40 er40Var = this.f92325a;
        if (er40Var == null) {
            return 0;
        }
        return er40Var.hashCode();
    }
}
