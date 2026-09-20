package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pqx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final gi6 f180442a;

    /* JADX INFO: renamed from: b */
    public final String f180443b;

    public pqx0(gi6 gi6Var, String str) {
        this.f180442a = gi6Var;
        this.f180443b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqx0)) {
            return false;
        }
        pqx0 pqx0Var = (pqx0) obj;
        return wj50.m88271j(this.f180442a, pqx0Var.f180442a) && wj50.m88271j(this.f180443b, pqx0Var.f180443b);
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f180443b;
    }

    public final int hashCode() {
        return this.f180443b.hashCode() + (this.f180442a.hashCode() * 31);
    }
}
