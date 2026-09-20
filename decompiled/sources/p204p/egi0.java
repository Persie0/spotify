package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class egi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f59349a;

    /* JADX INFO: renamed from: b */
    public final dgi0 f59350b;

    public egi0(boolean z, dgi0 dgi0Var) {
        this.f59349a = z;
        this.f59350b = dgi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egi0)) {
            return false;
        }
        egi0 egi0Var = (egi0) obj;
        return this.f59349a == egi0Var.f59349a && wj50.m88271j(this.f59350b, egi0Var.f59350b);
    }

    public final int hashCode() {
        return this.f59350b.hashCode() + (Boolean.hashCode(this.f59349a) * 31);
    }
}
