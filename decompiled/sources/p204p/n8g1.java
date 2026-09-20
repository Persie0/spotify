package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n8g1 extends j5u0 {

    /* JADX INFO: renamed from: a */
    public static final n8g1 f151535a = new n8g1();

    @Override // p204p.j5u0
    /* JADX INFO: renamed from: a */
    public final Object mo52475a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
