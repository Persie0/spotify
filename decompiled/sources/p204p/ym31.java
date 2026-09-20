package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ym31 {

    /* JADX INFO: renamed from: a */
    public final long f274147a;

    /* JADX INFO: renamed from: b */
    public final String f274148b;

    /* JADX INFO: renamed from: c */
    public final qf40 f274149c;

    public ym31(long j, String str, qf40 qf40Var) {
        this.f274147a = j;
        this.f274148b = str;
        this.f274149c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym31)) {
            return false;
        }
        ym31 ym31Var = (ym31) obj;
        long j = ym31Var.f274147a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f274147a, j) && wj50.m88271j(this.f274148b, ym31Var.f274148b) && wj50.m88271j(this.f274149c, ym31Var.f274149c);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return this.f274149c.hashCode() + s571.m77243b(Long.hashCode(this.f274147a) * 31, 31, this.f274148b);
    }
}
