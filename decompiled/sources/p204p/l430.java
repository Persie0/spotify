package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l430 {

    /* JADX INFO: renamed from: a */
    public final String f129489a;

    /* JADX INFO: renamed from: b */
    public final String f129490b;

    /* JADX INFO: renamed from: c */
    public final d850 f129491c;

    public l430(String str, String str2, d850 d850Var) {
        this.f129489a = str;
        this.f129490b = str2;
        this.f129491c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l430)) {
            return false;
        }
        l430 l430Var = (l430) obj;
        return wj50.m88271j(this.f129489a, l430Var.f129489a) && wj50.m88271j(this.f129490b, l430Var.f129490b) && wj50.m88271j(this.f129491c, l430Var.f129491c);
    }

    public final int hashCode() {
        return this.f129491c.hashCode() + s571.m77243b(this.f129489a.hashCode() * 31, 31, this.f129490b);
    }
}
