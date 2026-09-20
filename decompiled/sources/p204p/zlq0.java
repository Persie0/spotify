package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zlq0 {

    /* JADX INFO: renamed from: a */
    public final String f284054a;

    /* JADX INFO: renamed from: b */
    public final String f284055b;

    /* JADX INFO: renamed from: c */
    public final hjv0 f284056c;

    public zlq0(String str, String str2, hjv0 hjv0Var) {
        this.f284054a = str;
        this.f284055b = str2;
        this.f284056c = hjv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlq0)) {
            return false;
        }
        zlq0 zlq0Var = (zlq0) obj;
        return wj50.m88271j(this.f284054a, zlq0Var.f284054a) && wj50.m88271j(this.f284055b, zlq0Var.f284055b) && wj50.m88271j(this.f284056c, zlq0Var.f284056c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f284054a.hashCode() * 31, 31, this.f284055b);
        hjv0 hjv0Var = this.f284056c;
        return iM77243b + (hjv0Var == null ? 0 : hjv0Var.hashCode());
    }
}
