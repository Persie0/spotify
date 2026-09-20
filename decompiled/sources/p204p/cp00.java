package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cp00 implements ep00 {

    /* JADX INFO: renamed from: a */
    public final long f40383a;

    /* JADX INFO: renamed from: b */
    public final int f40384b;

    public cp00(int i, long j) {
        this.f40383a = j;
        this.f40384b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp00)) {
            return false;
        }
        cp00 cp00Var = (cp00) obj;
        return this.f40383a == cp00Var.f40383a && this.f40384b == cp00Var.f40384b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40384b) + (Long.hashCode(this.f40383a) * 31);
    }
}
