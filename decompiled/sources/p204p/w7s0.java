package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w7s0 implements a8s0 {

    /* JADX INFO: renamed from: a */
    public final z7s0 f248778a;

    public w7s0(z7s0 z7s0Var) {
        this.f248778a = z7s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7s0) && wj50.m88271j(this.f248778a, ((w7s0) obj).f248778a);
    }

    public final int hashCode() {
        z7s0 z7s0Var = this.f248778a;
        if (z7s0Var == null) {
            return 0;
        }
        return z7s0Var.hashCode();
    }
}
