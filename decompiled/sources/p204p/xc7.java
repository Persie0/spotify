package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xc7 {

    /* JADX INFO: renamed from: a */
    public final String f260114a;

    /* JADX INFO: renamed from: b */
    public final String f260115b;

    /* JADX INFO: renamed from: c */
    public final String f260116c;

    public xc7(String str, String str2, String str3) {
        this.f260114a = str;
        this.f260115b = str2;
        this.f260116c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc7)) {
            return false;
        }
        xc7 xc7Var = (xc7) obj;
        return wj50.m88271j(this.f260114a, xc7Var.f260114a) && wj50.m88271j(this.f260115b, xc7Var.f260115b) && wj50.m88271j(this.f260116c, xc7Var.f260116c);
    }

    public final int hashCode() {
        return this.f260116c.hashCode() + s571.m77243b(this.f260114a.hashCode() * 31, 31, this.f260115b);
    }
}
