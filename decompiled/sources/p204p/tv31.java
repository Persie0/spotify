package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tv31 {

    /* JADX INFO: renamed from: a */
    public final boolean f224038a;

    /* JADX INFO: renamed from: b */
    public final boolean f224039b;

    public tv31(boolean z, boolean z2) {
        this.f224038a = z;
        this.f224039b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv31)) {
            return false;
        }
        tv31 tv31Var = (tv31) obj;
        return this.f224038a == tv31Var.f224038a && this.f224039b == tv31Var.f224039b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224039b) + (Boolean.hashCode(this.f224038a) * 31);
    }
}
