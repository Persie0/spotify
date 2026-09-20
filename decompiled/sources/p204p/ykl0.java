package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ykl0 {

    /* JADX INFO: renamed from: a */
    public final int f273748a;

    /* JADX INFO: renamed from: b */
    public final boolean f273749b;

    /* JADX INFO: renamed from: c */
    public final eh00 f273750c;

    public ykl0(eh00 eh00Var, boolean z, int i) {
        this.f273748a = i;
        this.f273749b = z;
        this.f273750c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykl0)) {
            return false;
        }
        ykl0 ykl0Var = (ykl0) obj;
        return this.f273748a == ykl0Var.f273748a && this.f273749b == ykl0Var.f273749b && wj50.m88271j(this.f273750c, ykl0Var.f273750c);
    }

    public final int hashCode() {
        return this.f273750c.hashCode() + s571.m77245d(edb.m38547C(this.f273748a) * 31, 31, this.f273749b);
    }
}
