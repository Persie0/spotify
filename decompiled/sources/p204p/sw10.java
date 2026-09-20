package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sw10 {

    /* JADX INFO: renamed from: a */
    public final int f214555a;

    /* JADX INFO: renamed from: b */
    public final long f214556b;

    /* JADX INFO: renamed from: c */
    public final float f214557c;

    public sw10(int i, long j, float f) {
        this.f214555a = i;
        this.f214556b = j;
        this.f214557c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw10)) {
            return false;
        }
        sw10 sw10Var = (sw10) obj;
        return this.f214555a == sw10Var.f214555a && this.f214556b == sw10Var.f214556b && Float.compare(this.f214557c, sw10Var.f214557c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f214557c) + dq60.m36605e(Integer.hashCode(this.f214555a) * 31, this.f214556b, 31);
    }
}
