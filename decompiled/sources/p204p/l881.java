package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l881 {

    /* JADX INFO: renamed from: a */
    public final boolean f130823a;

    /* JADX INFO: renamed from: b */
    public final k46 f130824b;

    public l881(boolean z, k46 k46Var) {
        this.f130823a = z;
        this.f130824b = k46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l881)) {
            return false;
        }
        l881 l881Var = (l881) obj;
        return this.f130823a == l881Var.f130823a && wj50.m88271j(this.f130824b, l881Var.f130824b);
    }

    public final int hashCode() {
        return this.f130824b.hashCode() + (Boolean.hashCode(this.f130823a) * 31);
    }
}
