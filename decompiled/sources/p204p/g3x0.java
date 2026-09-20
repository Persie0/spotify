package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g3x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final dks f76291a;

    /* JADX INFO: renamed from: b */
    public final String f76292b;

    /* JADX INFO: renamed from: c */
    public final String f76293c;

    public g3x0(dks dksVar, String str, String str2) {
        this.f76291a = dksVar;
        this.f76292b = str;
        this.f76293c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3x0)) {
            return false;
        }
        g3x0 g3x0Var = (g3x0) obj;
        return wj50.m88271j(this.f76291a, g3x0Var.f76291a) && wj50.m88271j(this.f76292b, g3x0Var.f76292b) && wj50.m88271j(this.f76293c, g3x0Var.f76293c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f76291a.hashCode() * 31, 31, this.f76292b);
        String str = this.f76293c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
