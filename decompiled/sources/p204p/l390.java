package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l390 {

    /* JADX INFO: renamed from: a */
    public final String f129239a;

    /* JADX INFO: renamed from: b */
    public final String f129240b;

    /* JADX INFO: renamed from: c */
    public final String f129241c;

    public l390(String str, String str2, String str3) {
        this.f129239a = str;
        this.f129240b = str2;
        this.f129241c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l390)) {
            return false;
        }
        l390 l390Var = (l390) obj;
        return wj50.m88271j(this.f129239a, l390Var.f129239a) && wj50.m88271j(this.f129240b, l390Var.f129240b) && wj50.m88271j(this.f129241c, l390Var.f129241c);
    }

    public final int hashCode() {
        return this.f129241c.hashCode() + s571.m77243b(this.f129239a.hashCode() * 31, 31, this.f129240b);
    }
}
