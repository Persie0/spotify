package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w611 implements y611 {

    /* JADX INFO: renamed from: a */
    public final d850 f248232a;

    public w611(d850 d850Var) {
        this.f248232a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w611) && wj50.m88271j(this.f248232a, ((w611) obj).f248232a);
    }

    public final int hashCode() {
        d850 d850Var = this.f248232a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
