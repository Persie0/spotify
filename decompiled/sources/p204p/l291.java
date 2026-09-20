package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class l291 {

    /* JADX INFO: renamed from: a */
    public final String f128950a;

    /* JADX INFO: renamed from: b */
    public final b450 f128951b;

    /* JADX INFO: renamed from: c */
    public final t2b0 f128952c;

    /* JADX INFO: renamed from: d */
    public final int f128953d;

    public l291(String str, b450 b450Var, t2b0 t2b0Var, int i) {
        this.f128950a = str;
        this.f128951b = b450Var;
        this.f128952c = t2b0Var;
        this.f128953d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l291)) {
            return false;
        }
        l291 l291Var = (l291) obj;
        return this.f128950a.equals(l291Var.f128950a) && this.f128951b.equals(l291Var.f128951b) && this.f128952c.equals(l291Var.f128952c) && this.f128953d == l291Var.f128953d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128953d) + ((this.f128952c.hashCode() + stz0.m79353g(this.f128950a.hashCode() * 31, 31, this.f128951b)) * 31);
    }
}
