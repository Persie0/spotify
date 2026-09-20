package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ewk implements gwk {

    /* JADX INFO: renamed from: a */
    public final long f63565a;

    /* JADX INFO: renamed from: b */
    public final long f63566b;

    /* JADX INFO: renamed from: c */
    public final long f63567c;

    /* JADX INFO: renamed from: d */
    public final long f63568d;

    public ewk(long j, long j2, long j3, long j4) {
        this.f63565a = j;
        this.f63566b = j2;
        this.f63567c = j3;
        this.f63568d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewk)) {
            return false;
        }
        ewk ewkVar = (ewk) obj;
        return this.f63565a == ewkVar.f63565a && this.f63566b == ewkVar.f63566b && this.f63567c == ewkVar.f63567c && this.f63568d == ewkVar.f63568d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63568d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f63565a) * 31, this.f63566b, 31), this.f63567c, 31);
    }
}
