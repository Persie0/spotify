package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hm81 {

    /* JADX INFO: renamed from: a */
    public final String f92857a;

    /* JADX INFO: renamed from: b */
    public final String f92858b;

    /* JADX INFO: renamed from: c */
    public final String f92859c;

    /* JADX INFO: renamed from: d */
    public final String f92860d;

    public hm81(String str, String str2, String str3, String str4) {
        this.f92857a = str;
        this.f92858b = str2;
        this.f92859c = str3;
        this.f92860d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm81)) {
            return false;
        }
        hm81 hm81Var = (hm81) obj;
        return wj50.m88271j(this.f92857a, hm81Var.f92857a) && wj50.m88271j(this.f92858b, hm81Var.f92858b) && wj50.m88271j(this.f92859c, hm81Var.f92859c) && wj50.m88271j(this.f92860d, hm81Var.f92860d);
    }

    public final int hashCode() {
        return this.f92860d.hashCode() + s571.m77243b(s571.m77243b(this.f92857a.hashCode() * 31, 31, this.f92858b), 31, this.f92859c);
    }
}
