package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bne {

    /* JADX INFO: renamed from: a */
    public final String f28811a;

    /* JADX INFO: renamed from: b */
    public final long f28812b;

    /* JADX INFO: renamed from: c */
    public final long f28813c;

    public bne(long j, String str, long j2) {
        this.f28811a = str;
        this.f28812b = j;
        this.f28813c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bne)) {
            return false;
        }
        bne bneVar = (bne) obj;
        return wj50.m88271j(this.f28811a, bneVar.f28811a) && this.f28812b == bneVar.f28812b && this.f28813c == bneVar.f28813c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28813c) + dq60.m36605e(this.f28811a.hashCode() * 31, this.f28812b, 31);
    }
}
