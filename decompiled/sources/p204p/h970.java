package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h970 {

    /* JADX INFO: renamed from: a */
    public final int f88887a;

    /* JADX INFO: renamed from: b */
    public final int f88888b;

    /* JADX INFO: renamed from: c */
    public final int f88889c;

    public h970(int i, int i2, int i3) {
        this.f88887a = i;
        this.f88888b = i2;
        this.f88889c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h970)) {
            return false;
        }
        h970 h970Var = (h970) obj;
        return this.f88887a == h970Var.f88887a && this.f88888b == h970Var.f88888b && this.f88889c == h970Var.f88889c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88889c) + mt60.m62800g(this.f88888b, Integer.hashCode(this.f88887a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f88887a);
        sb.append('.');
        sb.append(this.f88888b);
        sb.append('.');
        sb.append(this.f88889c);
        return sb.toString();
    }
}
