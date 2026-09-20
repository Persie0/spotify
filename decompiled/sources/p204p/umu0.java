package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class umu0 {

    /* JADX INFO: renamed from: a */
    public final String f231953a;

    /* JADX INFO: renamed from: b */
    public final long f231954b;

    /* JADX INFO: renamed from: c */
    public final long f231955c;

    public umu0(long j, String str, long j2) {
        this.f231953a = str;
        this.f231954b = j;
        this.f231955c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umu0)) {
            return false;
        }
        umu0 umu0Var = (umu0) obj;
        return wj50.m88271j(this.f231953a, umu0Var.f231953a) && this.f231954b == umu0Var.f231954b && this.f231955c == umu0Var.f231955c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f231955c) + dq60.m36605e(this.f231953a.hashCode() * 31, this.f231954b, 31);
    }
}
