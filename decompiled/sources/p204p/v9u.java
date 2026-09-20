package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v9u {

    /* JADX INFO: renamed from: a */
    public final String f239034a;

    /* JADX INFO: renamed from: b */
    public final String f239035b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f239036c;

    /* JADX INFO: renamed from: d */
    public final dv9 f239037d;

    public v9u(String str, String str2, rcm0 rcm0Var, dv9 dv9Var) {
        this.f239034a = str;
        this.f239035b = str2;
        this.f239036c = rcm0Var;
        this.f239037d = dv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9u)) {
            return false;
        }
        v9u v9uVar = (v9u) obj;
        return wj50.m88271j(this.f239034a, v9uVar.f239034a) && wj50.m88271j(this.f239035b, v9uVar.f239035b) && wj50.m88271j(this.f239036c, v9uVar.f239036c) && wj50.m88271j(this.f239037d, v9uVar.f239037d);
    }

    public final int hashCode() {
        return this.f239037d.hashCode() + yds.m93483m(this.f239036c, s571.m77243b(this.f239034a.hashCode() * 31, 31, this.f239035b), 31);
    }
}
