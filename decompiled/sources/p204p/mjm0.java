package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f144292a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f144293b;

    public mjm0(String str, gkm0 gkm0Var) {
        this.f144292a = str;
        this.f144293b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjm0)) {
            return false;
        }
        mjm0 mjm0Var = (mjm0) obj;
        return wj50.m88271j(this.f144292a, mjm0Var.f144292a) && wj50.m88271j(this.f144293b, mjm0Var.f144293b);
    }

    public final int hashCode() {
        return this.f144293b.hashCode() + (this.f144292a.hashCode() * 31);
    }
}
