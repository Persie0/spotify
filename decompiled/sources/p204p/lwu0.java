package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lwu0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f137638a;

    /* JADX INFO: renamed from: b */
    public final long f137639b;

    public lwu0(boolean z, long j) {
        this.f137638a = z;
        this.f137639b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwu0)) {
            return false;
        }
        lwu0 lwu0Var = (lwu0) obj;
        return this.f137638a == lwu0Var.f137638a && this.f137639b == lwu0Var.f137639b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f137639b) + (Boolean.hashCode(this.f137638a) * 31);
    }
}
