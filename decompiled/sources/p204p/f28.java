package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f28 {

    /* JADX INFO: renamed from: a */
    public final g28 f65127a;

    /* JADX INFO: renamed from: b */
    public final i28 f65128b;

    /* JADX INFO: renamed from: c */
    public final h28 f65129c;

    public f28(g28 g28Var, i28 i28Var, h28 h28Var) {
        this.f65127a = g28Var;
        this.f65128b = i28Var;
        this.f65129c = h28Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f28) {
            f28 f28Var = (f28) obj;
            if (this.f65127a.equals(f28Var.f65127a) && this.f65128b.equals(f28Var.f65128b) && this.f65129c.equals(f28Var.f65129c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f65127a.hashCode() ^ 1000003) * 1000003) ^ this.f65128b.hashCode()) * 1000003) ^ this.f65129c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f65127a + ", osData=" + this.f65128b + ", deviceData=" + this.f65129c + "}";
    }
}
