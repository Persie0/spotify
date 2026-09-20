package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f53365a;

    /* JADX INFO: renamed from: b */
    public final d850 f53366b;

    public dv5(String str, d850 d850Var) {
        this.f53365a = str;
        this.f53366b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv5)) {
            return false;
        }
        dv5 dv5Var = (dv5) obj;
        return wj50.m88271j(this.f53365a, dv5Var.f53365a) && wj50.m88271j(this.f53366b, dv5Var.f53366b);
    }

    public final int hashCode() {
        return this.f53366b.hashCode() + (this.f53365a.hashCode() * 31);
    }
}
