package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tf91 {

    /* JADX INFO: renamed from: a */
    public final boolean f219885a;

    /* JADX INFO: renamed from: b */
    public final ov50 f219886b;

    public tf91(boolean z, ov50 ov50Var) {
        this.f219885a = z;
        this.f219886b = ov50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf91)) {
            return false;
        }
        tf91 tf91Var = (tf91) obj;
        return this.f219885a == tf91Var.f219885a && this.f219886b.equals(tf91Var.f219886b);
    }

    public final int hashCode() {
        return this.f219886b.hashCode() + s571.m77245d(Boolean.hashCode(this.f219885a) * 31, 31, true);
    }
}
