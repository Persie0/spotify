package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ok90 {

    /* JADX INFO: renamed from: a */
    public final String f166304a;

    /* JADX INFO: renamed from: b */
    public final String f166305b;

    /* JADX INFO: renamed from: c */
    public final String f166306c;

    /* JADX INFO: renamed from: d */
    public final String f166307d;

    /* JADX INFO: renamed from: e */
    public final doo f166308e;

    public ok90(String str, String str2, String str3, String str4, doo dooVar) {
        this.f166304a = str;
        this.f166305b = str2;
        this.f166306c = str3;
        this.f166307d = str4;
        this.f166308e = dooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok90)) {
            return false;
        }
        ok90 ok90Var = (ok90) obj;
        return wj50.m88271j(this.f166304a, ok90Var.f166304a) && wj50.m88271j(this.f166305b, ok90Var.f166305b) && wj50.m88271j(this.f166306c, ok90Var.f166306c) && wj50.m88271j(this.f166307d, ok90Var.f166307d) && wj50.m88271j(this.f166308e, ok90Var.f166308e);
    }

    public final int hashCode() {
        return this.f166308e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f166304a.hashCode() * 31, 31, this.f166305b), 31, this.f166306c), 31, this.f166307d);
    }
}
