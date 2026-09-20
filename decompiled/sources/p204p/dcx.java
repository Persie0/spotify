package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dcx extends gcx {

    /* JADX INFO: renamed from: a */
    public final d510 f47652a;

    public dcx(d510 d510Var) {
        this.f47652a = d510Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcx) && wj50.m88271j(this.f47652a, ((dcx) obj).f47652a);
    }

    public final int hashCode() {
        d510 d510Var = this.f47652a;
        if (d510Var == null) {
            return 0;
        }
        return d510Var.hashCode();
    }
}
