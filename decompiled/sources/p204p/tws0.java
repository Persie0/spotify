package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tws0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final gxs0 f224475a;

    /* JADX INFO: renamed from: b */
    public final String f224476b;

    /* JADX INFO: renamed from: c */
    public final b250 f224477c;

    public tws0(gxs0 gxs0Var, String str, b250 b250Var) {
        this.f224475a = gxs0Var;
        this.f224476b = str;
        this.f224477c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tws0)) {
            return false;
        }
        tws0 tws0Var = (tws0) obj;
        return wj50.m88271j(this.f224475a, tws0Var.f224475a) && wj50.m88271j(this.f224476b, tws0Var.f224476b) && wj50.m88271j(this.f224477c, tws0Var.f224477c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f224476b;
    }

    public final int hashCode() {
        return this.f224477c.hashCode() + s571.m77243b(this.f224475a.hashCode() * 31, 31, this.f224476b);
    }
}
