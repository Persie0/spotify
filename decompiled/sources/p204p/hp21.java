package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hp21 {

    /* JADX INFO: renamed from: a */
    public final boolean f93688a;

    /* JADX INFO: renamed from: b */
    public final long f93689b;

    public hp21(boolean z, long j) {
        this.f93688a = z;
        this.f93689b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp21)) {
            return false;
        }
        hp21 hp21Var = (hp21) obj;
        return this.f93688a == hp21Var.f93688a && cks.m33185d(this.f93689b, hp21Var.f93689b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f93688a) * 31;
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f93689b) + iHashCode;
    }
}
