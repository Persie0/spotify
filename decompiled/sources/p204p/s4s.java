package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s4s implements mzs0 {

    /* JADX INFO: renamed from: a */
    public final String f205635a;

    /* JADX INFO: renamed from: b */
    public final boolean f205636b;

    /* JADX INFO: renamed from: c */
    public final boolean f205637c;

    /* JADX INFO: renamed from: d */
    public final vq50 f205638d;

    /* JADX INFO: renamed from: e */
    public final ehf1 f205639e;

    public s4s(String str, boolean z, boolean z2, vq50 vq50Var, ehf1 ehf1Var) {
        this.f205635a = str;
        this.f205636b = z;
        this.f205637c = z2;
        this.f205638d = vq50Var;
        this.f205639e = ehf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4s)) {
            return false;
        }
        s4s s4sVar = (s4s) obj;
        return wj50.m88271j(this.f205635a, s4sVar.f205635a) && this.f205636b == s4sVar.f205636b && this.f205637c == s4sVar.f205637c && wj50.m88271j(this.f205638d, s4sVar.f205638d) && wj50.m88271j(this.f205639e, s4sVar.f205639e);
    }

    public final int hashCode() {
        return this.f205639e.hashCode() + ((this.f205638d.hashCode() + s571.m77245d(s571.m77245d(this.f205635a.hashCode() * 31, 31, this.f205636b), 31, this.f205637c)) * 31);
    }

    public s4s(String str, vq50 vq50Var, ehf1 ehf1Var, int i) {
        this(str, true, false, (i & 8) != 0 ? new uq50() : vq50Var, (i & 16) != 0 ? u2l0.f226115b : ehf1Var);
    }
}
