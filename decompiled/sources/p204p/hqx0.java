package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hqx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final lq50 f94266a;

    /* JADX INFO: renamed from: b */
    public final String f94267b;

    public hqx0(lq50 lq50Var) {
        String str = lq50Var.f135951a;
        this.f94266a = lq50Var;
        this.f94267b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqx0)) {
            return false;
        }
        hqx0 hqx0Var = (hqx0) obj;
        return wj50.m88271j(this.f94266a, hqx0Var.f94266a) && wj50.m88271j(this.f94267b, hqx0Var.f94267b);
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f94267b;
    }

    public final int hashCode() {
        return this.f94267b.hashCode() + (this.f94266a.hashCode() * 31);
    }
}
