package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sk40 implements vk40 {

    /* JADX INFO: renamed from: a */
    public final String f210013a;

    /* JADX INFO: renamed from: b */
    public final String f210014b;

    /* JADX INFO: renamed from: c */
    public final cc20 f210015c;

    public sk40(String str, String str2, cc20 cc20Var) {
        this.f210013a = str;
        this.f210014b = str2;
        this.f210015c = cc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk40)) {
            return false;
        }
        sk40 sk40Var = (sk40) obj;
        return wj50.m88271j(this.f210013a, sk40Var.f210013a) && wj50.m88271j(this.f210014b, sk40Var.f210014b) && wj50.m88271j(this.f210015c, sk40Var.f210015c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f210013a.hashCode() * 31, 31, this.f210014b);
        cc20 cc20Var = this.f210015c;
        return iM77243b + (cc20Var == null ? 0 : cc20Var.hashCode());
    }
}
