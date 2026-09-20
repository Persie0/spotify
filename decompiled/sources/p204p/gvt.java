package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gvt implements hvt {

    /* JADX INFO: renamed from: a */
    public final bjc0 f84823a;

    public gvt(bjc0 bjc0Var) {
        this.f84823a = bjc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvt) && this.f84823a.equals(((gvt) obj).f84823a);
    }

    public final int hashCode() {
        return this.f84823a.hashCode();
    }
}
