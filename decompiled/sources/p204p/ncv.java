package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ncv {

    /* JADX INFO: renamed from: a */
    public final jcv f152596a;

    /* JADX INFO: renamed from: b */
    public final boolean f152597b;

    /* JADX INFO: renamed from: c */
    public final int f152598c;

    public ncv(jcv jcvVar, tsg1 tsg1Var, boolean z, int i) {
        this.f152596a = jcvVar;
        this.f152597b = z;
        this.f152598c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncv)) {
            return false;
        }
        ncv ncvVar = (ncv) obj;
        return this.f152596a.equals(ncvVar.f152596a) && wj50.m88271j(null, null) && this.f152597b == ncvVar.f152597b && this.f152598c == ncvVar.f152598c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f152598c) + s571.m77245d(((this.f152596a.hashCode() * 31) + 0) * 31, 31, this.f152597b);
    }
}
