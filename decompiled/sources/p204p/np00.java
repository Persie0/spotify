package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class np00 implements tp00 {

    /* JADX INFO: renamed from: a */
    public final String f156836a;

    /* JADX INFO: renamed from: b */
    public final long f156837b;

    public np00(String str, long j) {
        this.f156836a = str;
        this.f156837b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np00)) {
            return false;
        }
        np00 np00Var = (np00) obj;
        return wj50.m88271j(this.f156836a, np00Var.f156836a) && this.f156837b == np00Var.f156837b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f156837b) + (this.f156836a.hashCode() * 31);
    }
}
