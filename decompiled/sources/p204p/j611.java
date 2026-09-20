package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j611 {

    /* JADX INFO: renamed from: a */
    public final String f109192a;

    /* JADX INFO: renamed from: b */
    public final String f109193b;

    /* JADX INFO: renamed from: c */
    public final String f109194c;

    public j611(String str, String str2, String str3) {
        this.f109192a = str;
        this.f109193b = str2;
        this.f109194c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m52506a() {
        return this.f109194c;
    }

    /* JADX INFO: renamed from: b */
    public final String m52507b() {
        return this.f109192a;
    }

    /* JADX INFO: renamed from: c */
    public final String m52508c() {
        return this.f109193b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j611)) {
            return false;
        }
        j611 j611Var = (j611) obj;
        return wj50.m88271j(this.f109192a, j611Var.f109192a) && wj50.m88271j(this.f109193b, j611Var.f109193b) && wj50.m88271j(this.f109194c, j611Var.f109194c);
    }

    public final int hashCode() {
        return this.f109194c.hashCode() + s571.m77243b(this.f109192a.hashCode() * 31, 31, this.f109193b);
    }
}
