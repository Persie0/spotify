package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v820 {

    /* JADX INFO: renamed from: a */
    public final yqx0 f238356a;

    /* JADX INFO: renamed from: b */
    public final int f238357b;

    public v820(yqx0 yqx0Var, int i) {
        this.f238356a = yqx0Var;
        this.f238357b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v820)) {
            return false;
        }
        v820 v820Var = (v820) obj;
        return wj50.m88271j(this.f238356a, v820Var.f238356a) && this.f238357b == v820Var.f238357b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f238357b) + (this.f238356a.hashCode() * 31);
    }
}
