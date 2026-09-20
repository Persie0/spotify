package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uvk {

    /* JADX INFO: renamed from: a */
    public final long f234459a;

    /* JADX INFO: renamed from: b */
    public final long f234460b;

    /* JADX INFO: renamed from: c */
    public final long f234461c;

    public uvk(long j, long j2, long j3) {
        this.f234459a = j;
        this.f234460b = j2;
        this.f234461c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvk)) {
            return false;
        }
        uvk uvkVar = (uvk) obj;
        return this.f234459a == uvkVar.f234459a && this.f234460b == uvkVar.f234460b && this.f234461c == uvkVar.f234461c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f234461c) + dq60.m36605e(Long.hashCode(this.f234459a) * 31, this.f234460b, 31);
    }
}
