package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class njt {

    /* JADX INFO: renamed from: a */
    public final String f154655a;

    /* JADX INFO: renamed from: b */
    public final d850 f154656b;

    public njt(String str, d850 d850Var) {
        this.f154655a = str;
        this.f154656b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njt)) {
            return false;
        }
        njt njtVar = (njt) obj;
        return wj50.m88271j(this.f154655a, njtVar.f154655a) && wj50.m88271j(this.f154656b, njtVar.f154656b);
    }

    public final int hashCode() {
        return this.f154656b.hashCode() + (this.f154655a.hashCode() * 31);
    }
}
