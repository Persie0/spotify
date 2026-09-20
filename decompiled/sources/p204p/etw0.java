package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class etw0 {

    /* JADX INFO: renamed from: a */
    public final String f62815a;

    /* JADX INFO: renamed from: b */
    public final String f62816b;

    public etw0(String str, String str2) {
        this.f62815a = str;
        this.f62816b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etw0)) {
            return false;
        }
        etw0 etw0Var = (etw0) obj;
        return wj50.m88271j(this.f62815a, etw0Var.f62815a) && wj50.m88271j(this.f62816b, etw0Var.f62816b);
    }

    public final int hashCode() {
        int iHashCode = this.f62815a.hashCode() * 31;
        String str = this.f62816b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
