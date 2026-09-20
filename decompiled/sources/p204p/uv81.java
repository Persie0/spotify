package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uv81 {

    /* JADX INFO: renamed from: a */
    public final long f234392a;

    /* JADX INFO: renamed from: b */
    public final long f234393b;

    /* JADX INFO: renamed from: c */
    public final long f234394c;

    public uv81(long j, long j2, long j3) {
        this.f234392a = j;
        this.f234393b = j2;
        this.f234394c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv81)) {
            return false;
        }
        uv81 uv81Var = (uv81) obj;
        return this.f234392a == uv81Var.f234392a && this.f234393b == uv81Var.f234393b && this.f234394c == uv81Var.f234394c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f234394c) + dq60.m36605e(Long.hashCode(this.f234392a) * 31, this.f234393b, 31);
    }
}
