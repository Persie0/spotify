package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b181 {

    /* JADX INFO: renamed from: a */
    public final String f22243a;

    /* JADX INFO: renamed from: b */
    public final String f22244b;

    /* JADX INFO: renamed from: c */
    public final st91 f22245c;

    public b181(String str, String str2, st91 st91Var) {
        this.f22243a = str;
        this.f22244b = str2;
        this.f22245c = st91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b181)) {
            return false;
        }
        b181 b181Var = (b181) obj;
        return wj50.m88271j(this.f22243a, b181Var.f22243a) && wj50.m88271j(this.f22244b, b181Var.f22244b) && wj50.m88271j(this.f22245c, b181Var.f22245c);
    }

    public final int hashCode() {
        return this.f22245c.f213866a.hashCode() + s571.m77243b(this.f22243a.hashCode() * 31, 31, this.f22244b);
    }
}
