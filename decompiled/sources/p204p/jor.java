package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jor extends uor {

    /* JADX INFO: renamed from: a */
    public final boolean f114499a;

    /* JADX INFO: renamed from: b */
    public final long f114500b;

    /* JADX INFO: renamed from: c */
    public final long f114501c;

    public jor(long j, long j2, boolean z) {
        this.f114499a = z;
        this.f114500b = j;
        this.f114501c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jor)) {
            return false;
        }
        jor jorVar = (jor) obj;
        return this.f114499a == jorVar.f114499a && this.f114500b == jorVar.f114500b && this.f114501c == jorVar.f114501c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f114501c) + dq60.m36605e(Boolean.hashCode(this.f114499a) * 31, this.f114500b, 31);
    }
}
