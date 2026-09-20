package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j741 {

    /* JADX INFO: renamed from: a */
    public final boolean f109485a;

    /* JADX INFO: renamed from: b */
    public final boolean f109486b;

    public /* synthetic */ j741(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j741)) {
            return false;
        }
        j741 j741Var = (j741) obj;
        return this.f109485a == j741Var.f109485a && this.f109486b == j741Var.f109486b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109486b) + (Boolean.hashCode(this.f109485a) * 31);
    }

    public j741(boolean z, boolean z2) {
        this.f109485a = z;
        this.f109486b = z2;
    }
}
