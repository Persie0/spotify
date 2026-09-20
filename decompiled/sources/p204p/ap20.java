package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ap20 extends gp20 {

    /* JADX INFO: renamed from: a */
    public final zo20 f17816a;

    /* JADX INFO: renamed from: b */
    public final boolean f17817b;

    public ap20(zo20 zo20Var, boolean z) {
        this.f17816a = zo20Var;
        this.f17817b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap20)) {
            return false;
        }
        ap20 ap20Var = (ap20) obj;
        return wj50.m88271j(this.f17816a, ap20Var.f17816a) && this.f17817b == ap20Var.f17817b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17817b) + (this.f17816a.hashCode() * 31);
    }
}
