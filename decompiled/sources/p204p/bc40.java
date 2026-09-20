package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bc40 implements dc40 {

    /* JADX INFO: renamed from: a */
    public final pgm0 f25774a;

    public bc40(pgm0 pgm0Var) {
        this.f25774a = pgm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc40) && this.f25774a.equals(((bc40) obj).f25774a);
    }

    public final int hashCode() {
        return this.f25774a.hashCode();
    }
}
