package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final d850 f219520a;

    public tdv0(d850 d850Var) {
        this.f219520a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdv0) && wj50.m88271j(this.f219520a, ((tdv0) obj).f219520a);
    }

    public final int hashCode() {
        d850 d850Var = this.f219520a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
