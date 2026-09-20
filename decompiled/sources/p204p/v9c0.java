package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v9c0 extends z9c0 {

    /* JADX INFO: renamed from: a */
    public final lcc1 f238910a;

    /* JADX INFO: renamed from: b */
    public final boolean f238911b;

    public v9c0(lcc1 lcc1Var, boolean z) {
        this.f238910a = lcc1Var;
        this.f238911b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c0)) {
            return false;
        }
        v9c0 v9c0Var = (v9c0) obj;
        return this.f238910a == v9c0Var.f238910a && this.f238911b == v9c0Var.f238911b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238911b) + (this.f238910a.hashCode() * 31);
    }
}
