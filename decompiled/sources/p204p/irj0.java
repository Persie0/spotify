package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class irj0 {

    /* JADX INFO: renamed from: a */
    public final String f105003a;

    /* JADX INFO: renamed from: b */
    public final String f105004b;

    /* JADX INFO: renamed from: c */
    public final String f105005c;

    public irj0(String str, String str2, String str3) {
        this.f105003a = str;
        this.f105004b = str2;
        this.f105005c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irj0)) {
            return false;
        }
        irj0 irj0Var = (irj0) obj;
        return wj50.m88271j(this.f105003a, irj0Var.f105003a) && wj50.m88271j(this.f105004b, irj0Var.f105004b) && wj50.m88271j(this.f105005c, irj0Var.f105005c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f105003a.hashCode() * 31, 31, this.f105004b);
        String str = this.f105005c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
