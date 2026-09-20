package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vuq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final d850 f245062a;

    public vuq0(d850 d850Var) {
        this.f245062a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuq0) && wj50.m88271j(this.f245062a, ((vuq0) obj).f245062a);
    }

    public final int hashCode() {
        d850 d850Var = this.f245062a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
