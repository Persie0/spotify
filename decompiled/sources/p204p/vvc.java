package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vvc extends yvc {

    /* JADX INFO: renamed from: a */
    public final d850 f245201a;

    public vvc(d850 d850Var) {
        this.f245201a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvc) && wj50.m88271j(this.f245201a, ((vvc) obj).f245201a);
    }

    public final int hashCode() {
        d850 d850Var = this.f245201a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
