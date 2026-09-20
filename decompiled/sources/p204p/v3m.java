package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v3m {

    /* JADX INFO: renamed from: a */
    public final String f236903a;

    /* JADX INFO: renamed from: b */
    public final String f236904b;

    /* JADX INFO: renamed from: c */
    public final u3m f236905c;

    /* JADX INFO: renamed from: d */
    public final p3m f236906d;

    /* JADX INFO: renamed from: e */
    public final String f236907e;

    /* JADX INFO: renamed from: f */
    public final String f236908f;

    /* JADX INFO: renamed from: g */
    public final eh00 f236909g;

    public v3m(String str, String str2, u3m u3mVar, p3m p3mVar, String str3, String str4, eh00 eh00Var) {
        this.f236903a = str;
        this.f236904b = str2;
        this.f236905c = u3mVar;
        this.f236906d = p3mVar;
        this.f236907e = str3;
        this.f236908f = str4;
        this.f236909g = eh00Var;
    }

    /* JADX INFO: renamed from: a */
    public static v3m m84621a(v3m v3mVar, eh00 eh00Var) {
        String str = v3mVar.f236903a;
        String str2 = v3mVar.f236904b;
        u3m u3mVar = v3mVar.f236905c;
        p3m p3mVar = v3mVar.f236906d;
        String str3 = v3mVar.f236907e;
        String str4 = v3mVar.f236908f;
        v3mVar.getClass();
        return new v3m(str, str2, u3mVar, p3mVar, str3, str4, eh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3m)) {
            return false;
        }
        v3m v3mVar = (v3m) obj;
        return wj50.m88271j(this.f236903a, v3mVar.f236903a) && wj50.m88271j(this.f236904b, v3mVar.f236904b) && wj50.m88271j(this.f236905c, v3mVar.f236905c) && wj50.m88271j(this.f236906d, v3mVar.f236906d) && wj50.m88271j(this.f236907e, v3mVar.f236907e) && wj50.m88271j(this.f236908f, v3mVar.f236908f) && wj50.m88271j(this.f236909g, v3mVar.f236909g);
    }

    public final int hashCode() {
        int iHashCode = (this.f236906d.hashCode() + ((this.f236905c.hashCode() + s571.m77243b(this.f236903a.hashCode() * 31, 31, this.f236904b)) * 31)) * 31;
        String str = this.f236907e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f236908f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        eh00 eh00Var = this.f236909g;
        return iHashCode3 + (eh00Var != null ? eh00Var.hashCode() : 0);
    }

    public /* synthetic */ v3m(String str, String str2, u3m u3mVar, p3m p3mVar, String str3, eh00 eh00Var, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? q3m.f184898a : u3mVar, (i & 8) != 0 ? m3m.f139684a : p3mVar, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : "", (i & 64) != 0 ? null : eh00Var);
    }
}
