package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ebo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f58108a;

    /* JADX INFO: renamed from: b */
    public final d850 f58109b;

    public ebo0(String str, d850 d850Var) {
        this.f58108a = str;
        this.f58109b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebo0)) {
            return false;
        }
        ebo0 ebo0Var = (ebo0) obj;
        return wj50.m88271j(this.f58108a, ebo0Var.f58108a) && wj50.m88271j(this.f58109b, ebo0Var.f58109b);
    }

    public final int hashCode() {
        return this.f58109b.hashCode() + (this.f58108a.hashCode() * 31);
    }
}
