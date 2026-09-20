package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r18 {

    /* JADX INFO: renamed from: a */
    public final long f194797a;

    /* JADX INFO: renamed from: b */
    public final t28 f194798b;

    /* JADX INFO: renamed from: c */
    public final t08 f194799c;

    public r18(long j, t28 t28Var, t08 t08Var) {
        this.f194797a = j;
        if (t28Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f194798b = t28Var;
        this.f194799c = t08Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m74471a() {
        return this.f194797a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r18) {
            r18 r18Var = (r18) obj;
            if (this.f194797a == r18Var.f194797a && this.f194798b.equals(r18Var.f194798b) && this.f194799c.equals(r18Var.f194799c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f194797a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f194798b.hashCode()) * 1000003) ^ this.f194799c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f194797a + ", transportContext=" + this.f194798b + ", event=" + this.f194799c + "}";
    }
}
