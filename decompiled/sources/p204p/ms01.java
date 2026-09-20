package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ms01 {

    /* JADX INFO: renamed from: a */
    public final String f146659a;

    /* JADX INFO: renamed from: b */
    public final eh00 f146660b;

    public ms01(String str, eh00 eh00Var) {
        this.f146659a = str;
        this.f146660b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms01)) {
            return false;
        }
        ms01 ms01Var = (ms01) obj;
        return wj50.m88271j(this.f146659a, ms01Var.f146659a) && wj50.m88271j(this.f146660b, ms01Var.f146660b);
    }

    public final int hashCode() {
        return this.f146660b.hashCode() + (this.f146659a.hashCode() * 31);
    }
}
