package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q1w implements hwf {

    /* JADX INFO: renamed from: a */
    public final w64 f184417a;

    /* JADX INFO: renamed from: b */
    public final boolean f184418b;

    /* JADX INFO: renamed from: c */
    public final boolean f184419c;

    /* JADX INFO: renamed from: d */
    public final boolean f184420d;

    public q1w(w64 w64Var, boolean z, boolean z2, boolean z3) {
        this.f184417a = w64Var;
        this.f184418b = z;
        this.f184419c = z2;
        this.f184420d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1w)) {
            return false;
        }
        q1w q1wVar = (q1w) obj;
        return this.f184417a == q1wVar.f184417a && this.f184418b == q1wVar.f184418b && this.f184419c == q1wVar.f184419c && this.f184420d == q1wVar.f184420d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184420d) + s571.m77245d(s571.m77245d(this.f184417a.hashCode() * 31, 31, this.f184418b), 31, this.f184419c);
    }
}
