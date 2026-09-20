package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final String f196884a;

    /* JADX INFO: renamed from: b */
    public final d850 f196885b;

    public r901(String str, d850 d850Var) {
        this.f196884a = str;
        this.f196885b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r901)) {
            return false;
        }
        r901 r901Var = (r901) obj;
        return wj50.m88271j(this.f196884a, r901Var.f196884a) && wj50.m88271j(this.f196885b, r901Var.f196885b);
    }

    public final int hashCode() {
        return this.f196885b.hashCode() + (this.f196884a.hashCode() * 31);
    }
}
