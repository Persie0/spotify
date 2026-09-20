package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sbf implements zbf {

    /* JADX INFO: renamed from: a */
    public final d850 f207466a;

    public sbf(d850 d850Var) {
        this.f207466a = d850Var;
    }

    @Override // p204p.zbf
    /* JADX INFO: renamed from: b */
    public final d850 mo77730b() {
        return this.f207466a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbf) && wj50.m88271j(this.f207466a, ((sbf) obj).f207466a);
    }

    public final int hashCode() {
        return this.f207466a.hashCode();
    }
}
