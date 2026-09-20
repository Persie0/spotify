package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n2f1 {

    /* JADX INFO: renamed from: a */
    public final int f149758a;

    /* JADX INFO: renamed from: b */
    public final long f149759b;

    public n2f1(int i, long j) {
        this.f149758a = i;
        this.f149759b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n2f1)) {
            return false;
        }
        n2f1 n2f1Var = (n2f1) obj;
        return this.f149758a == n2f1Var.f149758a && this.f149759b == n2f1Var.f149759b;
    }

    public final int hashCode() {
        long j = this.f149759b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.f149758a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f149758a);
        sb.append(", eventTimestamp=");
        return ikc0.m50938j(this.f149759b, "}", sb);
    }
}
