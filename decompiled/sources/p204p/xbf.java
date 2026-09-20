package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xbf implements zbf {

    /* JADX INFO: renamed from: a */
    public final String f259902a;

    /* JADX INFO: renamed from: b */
    public final String f259903b;

    /* JADX INFO: renamed from: c */
    public final d850 f259904c;

    public xbf(String str, String str2, d850 d850Var) {
        this.f259902a = str;
        this.f259903b = str2;
        this.f259904c = d850Var;
    }

    @Override // p204p.zbf
    /* JADX INFO: renamed from: b */
    public final d850 mo77730b() {
        return this.f259904c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbf)) {
            return false;
        }
        xbf xbfVar = (xbf) obj;
        return wj50.m88271j(this.f259902a, xbfVar.f259902a) && wj50.m88271j(this.f259903b, xbfVar.f259903b) && wj50.m88271j(this.f259904c, xbfVar.f259904c);
    }

    public final int hashCode() {
        return this.f259904c.hashCode() + s571.m77243b(this.f259902a.hashCode() * 31, 31, this.f259903b);
    }
}
