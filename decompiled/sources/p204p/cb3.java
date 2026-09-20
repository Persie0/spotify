package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cb3 {

    /* JADX INFO: renamed from: a */
    public final d850 f36000a;

    public cb3(d850 d850Var) {
        this.f36000a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb3) && wj50.m88271j(this.f36000a, ((cb3) obj).f36000a);
    }

    public final int hashCode() {
        d850 d850Var = this.f36000a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
