package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y3e0 extends a4e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f268902a;

    /* JADX INFO: renamed from: b */
    public final String f268903b;

    /* JADX INFO: renamed from: c */
    public final b250 f268904c;

    public y3e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f268902a = ezs0Var;
        this.f268903b = str;
        this.f268904c = b250Var;
    }

    @Override // p204p.a4e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo24692a() {
        return this.f268902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3e0)) {
            return false;
        }
        y3e0 y3e0Var = (y3e0) obj;
        return wj50.m88271j(this.f268902a, y3e0Var.f268902a) && wj50.m88271j(this.f268903b, y3e0Var.f268903b) && wj50.m88271j(this.f268904c, y3e0Var.f268904c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f268903b;
    }

    public final int hashCode() {
        return this.f268904c.hashCode() + s571.m77243b(this.f268902a.hashCode() * 31, 31, this.f268903b);
    }
}
