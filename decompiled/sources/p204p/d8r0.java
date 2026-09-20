package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d8r0 implements h8r0 {

    /* JADX INFO: renamed from: a */
    public final long f46505a;

    /* JADX INFO: renamed from: b */
    public final float f46506b;

    public d8r0(long j, float f) {
        this.f46505a = j;
        this.f46506b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8r0)) {
            return false;
        }
        d8r0 d8r0Var = (d8r0) obj;
        return this.f46505a == d8r0Var.f46505a && Float.compare(this.f46506b, d8r0Var.f46506b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46506b) + (Long.hashCode(this.f46505a) * 31);
    }
}
