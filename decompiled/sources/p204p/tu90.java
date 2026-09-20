package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final d850 f223797a;

    public tu90(d850 d850Var) {
        this.f223797a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu90) && wj50.m88271j(this.f223797a, ((tu90) obj).f223797a);
    }

    public final int hashCode() {
        d850 d850Var = this.f223797a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
