package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class l590 {

    /* JADX INFO: renamed from: a */
    public final int f129858a;

    /* JADX INFO: renamed from: b */
    public final int f129859b;

    /* JADX INFO: renamed from: c */
    public final int f129860c;

    public l590(int i, int i2, int i3) {
        this.f129858a = i;
        this.f129859b = i2;
        this.f129860c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l590)) {
            return false;
        }
        l590 l590Var = (l590) obj;
        return this.f129858a == l590Var.f129858a && this.f129859b == l590Var.f129859b && this.f129860c == l590Var.f129860c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129860c) + mt60.m62800g(this.f129859b, Integer.hashCode(this.f129858a) * 31, 31);
    }
}
