package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yj9 {

    /* JADX INFO: renamed from: a */
    public final uj9 f273322a;

    /* JADX INFO: renamed from: b */
    public final uj9 f273323b;

    /* JADX INFO: renamed from: c */
    public final int f273324c;

    public yj9(uj9 uj9Var, uj9 uj9Var2, int i) {
        this.f273322a = uj9Var;
        this.f273323b = uj9Var2;
        this.f273324c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj9)) {
            return false;
        }
        yj9 yj9Var = (yj9) obj;
        return wj50.m88271j(this.f273322a, yj9Var.f273322a) && wj50.m88271j(this.f273323b, yj9Var.f273323b) && this.f273324c == yj9Var.f273324c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273324c) + ((this.f273323b.hashCode() + (this.f273322a.hashCode() * 31)) * 31);
    }
}
