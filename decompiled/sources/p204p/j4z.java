package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j4z extends k4z {

    /* JADX INFO: renamed from: a */
    public final String f108812a;

    /* JADX INFO: renamed from: b */
    public final String f108813b;

    /* JADX INFO: renamed from: c */
    public final String f108814c;

    public j4z(String str, String str2, String str3) {
        this.f108812a = str;
        this.f108813b = str2;
        this.f108814c = str3;
    }

    @Override // p204p.k4z
    /* JADX INFO: renamed from: a */
    public final String mo49690a() {
        return this.f108812a;
    }

    @Override // p204p.k4z
    /* JADX INFO: renamed from: b */
    public final String mo49691b() {
        return this.f108813b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4z)) {
            return false;
        }
        j4z j4zVar = (j4z) obj;
        return wj50.m88271j(this.f108812a, j4zVar.f108812a) && wj50.m88271j(this.f108813b, j4zVar.f108813b) && wj50.m88271j(this.f108814c, j4zVar.f108814c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(1, s571.m77243b(this.f108812a.hashCode() * 31, 31, this.f108813b), 31);
        String str = this.f108814c;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
