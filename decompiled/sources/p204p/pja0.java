package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final d510 f178216a;

    public pja0(d510 d510Var) {
        this.f178216a = d510Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pja0) && wj50.m88271j(this.f178216a, ((pja0) obj).f178216a);
    }

    public final int hashCode() {
        d510 d510Var = this.f178216a;
        if (d510Var == null) {
            return 0;
        }
        return d510Var.hashCode();
    }
}
