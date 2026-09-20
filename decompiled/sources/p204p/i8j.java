package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i8j extends j8j {

    /* JADX INFO: renamed from: a */
    public final int f99797a;

    public i8j(int i) {
        this.f99797a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8j) && this.f99797a == ((i8j) obj).f99797a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99797a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("ConstraintsNotMet(reason="), this.f99797a, ')');
    }
}
