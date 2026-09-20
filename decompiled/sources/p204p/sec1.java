package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sec1 {

    /* JADX INFO: renamed from: a */
    public final Object f208274a;

    /* JADX INFO: renamed from: b */
    public final Object f208275b;

    public sec1(Object obj, Object obj2) {
        this.f208274a = obj;
        this.f208275b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sec1)) {
            return false;
        }
        sec1 sec1Var = (sec1) obj;
        return wj50.m88271j(this.f208274a, sec1Var.f208274a) && wj50.m88271j(this.f208275b, sec1Var.f208275b);
    }

    public final int hashCode() {
        return this.f208275b.hashCode() + (this.f208274a.hashCode() * 31);
    }
}
