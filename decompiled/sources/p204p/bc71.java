package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bc71 {

    /* JADX INFO: renamed from: c */
    public static final bc71 f25794c = new bc71(2, false);

    /* JADX INFO: renamed from: d */
    public static final bc71 f25795d = new bc71(1, true);

    /* JADX INFO: renamed from: a */
    public final int f25796a;

    /* JADX INFO: renamed from: b */
    public final boolean f25797b;

    public bc71(int i, boolean z) {
        this.f25796a = i;
        this.f25797b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc71)) {
            return false;
        }
        bc71 bc71Var = (bc71) obj;
        return this.f25796a == bc71Var.f25796a && this.f25797b == bc71Var.f25797b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25797b) + (Integer.hashCode(this.f25796a) * 31);
    }

    public final String toString() {
        if (equals(f25794c)) {
            return "TextMotion.Static";
        }
        return equals(f25795d) ? "TextMotion.Animated" : "Invalid";
    }
}
