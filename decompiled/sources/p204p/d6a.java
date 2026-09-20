package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d6a {

    /* JADX INFO: renamed from: a */
    public final String f45633a;

    /* JADX INFO: renamed from: b */
    public final boolean f45634b;

    /* JADX INFO: renamed from: c */
    public final ok11 f45635c;

    /* JADX INFO: renamed from: d */
    public final z2q0 f45636d;

    public d6a(String str, boolean z, ok11 ok11Var, z2q0 z2q0Var) {
        this.f45633a = str;
        this.f45634b = z;
        this.f45635c = ok11Var;
        this.f45636d = z2q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6a)) {
            return false;
        }
        d6a d6aVar = (d6a) obj;
        return wj50.m88271j(this.f45633a, d6aVar.f45633a) && this.f45634b == d6aVar.f45634b && wj50.m88271j(this.f45635c, d6aVar.f45635c) && wj50.m88271j(this.f45636d, d6aVar.f45636d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f45633a.hashCode() * 31, 31, this.f45634b);
        ok11 ok11Var = this.f45635c;
        int iHashCode = (iM77245d + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        z2q0 z2q0Var = this.f45636d;
        return iHashCode + (z2q0Var != null ? z2q0Var.hashCode() : 0);
    }
}
