package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ayu {

    /* JADX INFO: renamed from: a */
    public final long f21355a;

    /* JADX INFO: renamed from: b */
    public final ch01 f21356b;

    public ayu(long j, ch01 ch01Var) {
        this.f21355a = j;
        this.f21356b = ch01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayu)) {
            return false;
        }
        ayu ayuVar = (ayu) obj;
        long j = ayuVar.f21355a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f21355a, j) && this.f21356b.equals(ayuVar.f21356b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return this.f21356b.hashCode() + (Long.hashCode(this.f21355a) * 31);
    }
}
