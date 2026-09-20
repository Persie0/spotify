package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ho50 {

    /* JADX INFO: renamed from: a */
    public final boolean f93460a;

    /* JADX INFO: renamed from: b */
    public final boolean f93461b;

    public ho50(boolean z, boolean z2) {
        this.f93460a = z;
        this.f93461b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho50)) {
            return false;
        }
        ho50 ho50Var = (ho50) obj;
        return this.f93460a == ho50Var.f93460a && this.f93461b == ho50Var.f93461b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93461b) + (Boolean.hashCode(this.f93460a) * 31);
    }
}
