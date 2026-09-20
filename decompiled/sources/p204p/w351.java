package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w351 implements y351 {

    /* JADX INFO: renamed from: a */
    public final String f247491a;

    /* JADX INFO: renamed from: b */
    public final String f247492b;

    /* JADX INFO: renamed from: c */
    public final String f247493c;

    public w351(String str, String str2, String str3) {
        this.f247491a = str;
        this.f247492b = str2;
        this.f247493c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static w351 m87104a(w351 w351Var, String str) {
        String str2 = w351Var.f247491a;
        String str3 = w351Var.f247492b;
        w351Var.getClass();
        return new w351(str2, str3, str);
    }

    /* JADX INFO: renamed from: b */
    public final String m87105b() {
        return this.f247493c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w351)) {
            return false;
        }
        w351 w351Var = (w351) obj;
        return wj50.m88271j(this.f247491a, w351Var.f247491a) && wj50.m88271j(this.f247492b, w351Var.f247492b) && wj50.m88271j(this.f247493c, w351Var.f247493c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f247491a.hashCode() * 31, 31, this.f247492b);
        String str = this.f247493c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
