package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class is81 {

    /* JADX INFO: renamed from: a */
    public final String f105189a;

    /* JADX INFO: renamed from: b */
    public final String f105190b;

    public is81(String str, String str2) {
        this.f105189a = str;
        this.f105190b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is81)) {
            return false;
        }
        is81 is81Var = (is81) obj;
        return wj50.m88271j(this.f105189a, is81Var.f105189a) && wj50.m88271j(this.f105190b, is81Var.f105190b);
    }

    public final int hashCode() {
        return this.f105190b.hashCode() + (this.f105189a.hashCode() * 31);
    }
}
