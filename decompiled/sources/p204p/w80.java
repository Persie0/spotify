package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w80 {

    /* JADX INFO: renamed from: a */
    public final String f248817a;

    /* JADX INFO: renamed from: b */
    public final int f248818b;

    /* JADX INFO: renamed from: c */
    public final int f248819c;

    public w80(String str, int i, int i2) {
        this.f248817a = str;
        this.f248818b = i;
        this.f248819c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return wj50.m88271j(this.f248817a, w80Var.f248817a) && this.f248818b == w80Var.f248818b && this.f248819c == w80Var.f248819c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f248819c) + mt60.m62800g(this.f248818b, this.f248817a.hashCode() * 31, 31);
    }
}
