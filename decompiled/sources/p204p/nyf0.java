package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nyf0 implements tyf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f159805a;

    public nyf0(d850 d850Var) {
        this.f159805a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyf0) && wj50.m88271j(this.f159805a, ((nyf0) obj).f159805a);
    }

    public final int hashCode() {
        d850 d850Var = this.f159805a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
