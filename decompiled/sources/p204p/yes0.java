package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final long f272053a;

    /* JADX INFO: renamed from: b */
    public final String f272054b;

    /* JADX INFO: renamed from: c */
    public final boolean f272055c;

    public yes0(long j, String str, boolean z) {
        this.f272053a = j;
        this.f272054b = str;
        this.f272055c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yes0)) {
            return false;
        }
        yes0 yes0Var = (yes0) obj;
        return this.f272053a == yes0Var.f272053a && wj50.m88271j(this.f272054b, yes0Var.f272054b) && this.f272055c == yes0Var.f272055c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f272053a) * 31;
        String str = this.f272054b;
        return Boolean.hashCode(this.f272055c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
