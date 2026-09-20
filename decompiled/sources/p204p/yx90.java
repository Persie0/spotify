package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yx90 implements ay90 {

    /* JADX INFO: renamed from: a */
    public final String f277181a;

    /* JADX INFO: renamed from: b */
    public final String f277182b;

    /* JADX INFO: renamed from: c */
    public final int f277183c;

    /* JADX INFO: renamed from: d */
    public final ey90 f277184d;

    public yx90(String str, String str2, int i, ey90 ey90Var) {
        this.f277181a = str;
        this.f277182b = str2;
        this.f277183c = i;
        this.f277184d = ey90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx90)) {
            return false;
        }
        yx90 yx90Var = (yx90) obj;
        return wj50.m88271j(this.f277181a, yx90Var.f277181a) && wj50.m88271j(this.f277182b, yx90Var.f277182b) && this.f277183c == yx90Var.f277183c && this.f277184d.equals(yx90Var.f277184d);
    }

    public final int hashCode() {
        return this.f277184d.hashCode() + f710.m40938f(this.f277183c, s571.m77243b(this.f277181a.hashCode() * 31, 31, this.f277182b), 31);
    }
}
