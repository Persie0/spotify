package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ssa0 {

    /* JADX INFO: renamed from: a */
    public final String f213554a;

    /* JADX INFO: renamed from: b */
    public final String f213555b;

    public ssa0(String str, String str2) {
        this.f213554a = str;
        this.f213555b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssa0)) {
            return false;
        }
        ssa0 ssa0Var = (ssa0) obj;
        return wj50.m88271j(this.f213554a, ssa0Var.f213554a) && wj50.m88271j(this.f213555b, ssa0Var.f213555b);
    }

    public final int hashCode() {
        return this.f213555b.hashCode() + (this.f213554a.hashCode() * 31);
    }
}
