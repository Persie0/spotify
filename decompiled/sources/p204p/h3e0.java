package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h3e0 extends j3e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f87217a;

    /* JADX INFO: renamed from: b */
    public final String f87218b;

    /* JADX INFO: renamed from: c */
    public final b250 f87219c;

    public h3e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f87217a = ezs0Var;
        this.f87218b = str;
        this.f87219c = b250Var;
    }

    @Override // p204p.j3e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo46522a() {
        return this.f87217a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3e0)) {
            return false;
        }
        h3e0 h3e0Var = (h3e0) obj;
        return wj50.m88271j(this.f87217a, h3e0Var.f87217a) && wj50.m88271j(this.f87218b, h3e0Var.f87218b) && wj50.m88271j(this.f87219c, h3e0Var.f87219c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f87218b;
    }

    public final int hashCode() {
        return this.f87219c.hashCode() + s571.m77243b(this.f87217a.hashCode() * 31, 31, this.f87218b);
    }
}
