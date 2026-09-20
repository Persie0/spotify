package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qg51 extends j9g1 {

    /* JADX INFO: renamed from: e */
    public final String f188383e;

    /* JADX INFO: renamed from: f */
    public final String f188384f;

    /* JADX INFO: renamed from: g */
    public final String f188385g;

    public qg51(String str, String str2, String str3) {
        this.f188383e = str;
        this.f188384f = str2;
        this.f188385g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg51)) {
            return false;
        }
        qg51 qg51Var = (qg51) obj;
        return wj50.m88271j(this.f188383e, qg51Var.f188383e) && wj50.m88271j(this.f188384f, qg51Var.f188384f) && wj50.m88271j(this.f188385g, qg51Var.f188385g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f188383e.hashCode() * 31, 31, this.f188384f);
        String str = this.f188385g;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
