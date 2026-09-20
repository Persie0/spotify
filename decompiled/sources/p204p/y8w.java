package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y8w implements hwf {

    /* JADX INFO: renamed from: a */
    public final w64 f270394a;

    /* JADX INFO: renamed from: b */
    public final boolean f270395b;

    /* JADX INFO: renamed from: c */
    public final v64 f270396c;

    public y8w(w64 w64Var, boolean z, v64 v64Var) {
        this.f270394a = w64Var;
        this.f270395b = z;
        this.f270396c = v64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8w)) {
            return false;
        }
        y8w y8wVar = (y8w) obj;
        return this.f270394a == y8wVar.f270394a && this.f270395b == y8wVar.f270395b && this.f270396c == y8wVar.f270396c;
    }

    public final int hashCode() {
        return this.f270396c.hashCode() + s571.m77245d(this.f270394a.hashCode() * 31, 31, this.f270395b);
    }
}
