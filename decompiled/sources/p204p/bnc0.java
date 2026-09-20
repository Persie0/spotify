package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bnc0 {

    /* JADX INFO: renamed from: a */
    public final zmc0 f28804a;

    /* JADX INFO: renamed from: b */
    public final long f28805b;

    /* JADX INFO: renamed from: c */
    public final long f28806c;

    public bnc0(zmc0 zmc0Var, long j, long j2) {
        this.f28804a = zmc0Var;
        this.f28805b = j;
        this.f28806c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnc0)) {
            return false;
        }
        bnc0 bnc0Var = (bnc0) obj;
        return wj50.m88271j(this.f28804a, bnc0Var.f28804a) && this.f28805b == bnc0Var.f28805b && this.f28806c == bnc0Var.f28806c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28806c) + dq60.m36605e(this.f28804a.hashCode() * 31, this.f28805b, 31);
    }
}
