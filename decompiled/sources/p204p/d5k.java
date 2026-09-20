package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d5k {

    /* JADX INFO: renamed from: a */
    public final gh00 f45458a;

    /* JADX INFO: renamed from: b */
    public final gh00 f45459b;

    public d5k(gh00 gh00Var, gh00 gh00Var2) {
        this.f45458a = gh00Var;
        this.f45459b = gh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5k)) {
            return false;
        }
        d5k d5kVar = (d5k) obj;
        return wj50.m88271j(this.f45458a, d5kVar.f45458a) && wj50.m88271j(this.f45459b, d5kVar.f45459b);
    }

    public final int hashCode() {
        return this.f45459b.hashCode() + (this.f45458a.hashCode() * 31);
    }
}
