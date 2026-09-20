package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cem0 {

    /* JADX INFO: renamed from: a */
    public final String f37156a;

    /* JADX INFO: renamed from: b */
    public final String f37157b;

    /* JADX INFO: renamed from: c */
    public final String f37158c;

    public cem0(String str, String str2, String str3) {
        this.f37156a = str;
        this.f37157b = str2;
        this.f37158c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cem0)) {
            return false;
        }
        cem0 cem0Var = (cem0) obj;
        return wj50.m88271j(this.f37156a, cem0Var.f37156a) && wj50.m88271j(this.f37157b, cem0Var.f37157b) && wj50.m88271j(this.f37158c, cem0Var.f37158c);
    }

    public final int hashCode() {
        return this.f37158c.hashCode() + s571.m77243b(this.f37156a.hashCode() * 31, 31, this.f37157b);
    }
}
