package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qqx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final qq50 f191672a;

    /* JADX INFO: renamed from: b */
    public final String f191673b;

    public qqx0(qq50 qq50Var) {
        String str = qq50Var.f191491a;
        this.f191672a = qq50Var;
        this.f191673b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqx0)) {
            return false;
        }
        qqx0 qqx0Var = (qqx0) obj;
        return wj50.m88271j(this.f191672a, qqx0Var.f191672a) && wj50.m88271j(this.f191673b, qqx0Var.f191673b);
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f191673b;
    }

    public final int hashCode() {
        return this.f191673b.hashCode() + (this.f191672a.hashCode() * 31);
    }
}
