package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t84 {

    /* JADX INFO: renamed from: a */
    public final boolean f217956a;

    /* JADX INFO: renamed from: b */
    public final boolean f217957b;

    public t84(boolean z, boolean z2) {
        this.f217956a = z;
        this.f217957b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t84)) {
            return false;
        }
        t84 t84Var = (t84) obj;
        return this.f217956a == t84Var.f217956a && this.f217957b == t84Var.f217957b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217957b) + (Boolean.hashCode(this.f217956a) * 31);
    }
}
