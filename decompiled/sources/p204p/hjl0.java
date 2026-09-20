package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hjl0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final String f92069a;

    /* JADX INFO: renamed from: b */
    public final ghl0 f92070b;

    public hjl0(String str, ghl0 ghl0Var) {
        this.f92069a = str;
        this.f92070b = ghl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjl0)) {
            return false;
        }
        hjl0 hjl0Var = (hjl0) obj;
        return wj50.m88271j(this.f92069a, hjl0Var.f92069a) && wj50.m88271j(this.f92070b, hjl0Var.f92070b);
    }

    public final int hashCode() {
        return this.f92070b.hashCode() + (this.f92069a.hashCode() * 31);
    }
}
