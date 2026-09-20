package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z611 implements d711 {

    /* JADX INFO: renamed from: a */
    public final d850 f279676a;

    public z611(d850 d850Var) {
        this.f279676a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z611) && wj50.m88271j(this.f279676a, ((z611) obj).f279676a);
    }

    public final int hashCode() {
        d850 d850Var = this.f279676a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
