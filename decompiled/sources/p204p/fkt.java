package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fkt implements xmt {

    /* JADX INFO: renamed from: a */
    public final dks f70618a;

    /* JADX INFO: renamed from: b */
    public final String f70619b;

    /* JADX INFO: renamed from: c */
    public final String f70620c;

    public fkt(dks dksVar, String str, String str2) {
        this.f70618a = dksVar;
        this.f70619b = str;
        this.f70620c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkt)) {
            return false;
        }
        fkt fktVar = (fkt) obj;
        if (!wj50.m88271j(this.f70618a, fktVar.f70618a) || !wj50.m88271j(this.f70619b, fktVar.f70619b)) {
            return false;
        }
        String str = fktVar.f70620c;
        wp6 wp6Var = hlq.f92726b;
        return wj50.m88271j(this.f70620c, str);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f70618a.hashCode() * 31, 31, this.f70619b);
        wp6 wp6Var = hlq.f92726b;
        return this.f70620c.hashCode() + iM77243b;
    }
}
