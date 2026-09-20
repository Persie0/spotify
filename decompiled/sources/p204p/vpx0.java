package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vpx0 implements arx0 {

    /* JADX INFO: renamed from: a */
    public final cq50 f243801a;

    /* JADX INFO: renamed from: b */
    public final String f243802b;

    /* JADX INFO: renamed from: c */
    public final boolean f243803c;

    /* JADX INFO: renamed from: d */
    public final boolean f243804d;

    public vpx0(cq50 cq50Var, boolean z, boolean z2) {
        String str = cq50Var.f40736a;
        this.f243801a = cq50Var;
        this.f243802b = str;
        this.f243803c = z;
        this.f243804d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpx0)) {
            return false;
        }
        vpx0 vpx0Var = (vpx0) obj;
        return wj50.m88271j(this.f243801a, vpx0Var.f243801a) && wj50.m88271j(this.f243802b, vpx0Var.f243802b) && this.f243803c == vpx0Var.f243803c && this.f243804d == vpx0Var.f243804d;
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f243802b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243804d) + s571.m77245d(s571.m77243b(this.f243801a.hashCode() * 31, 31, this.f243802b), 31, this.f243803c);
    }
}
