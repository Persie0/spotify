package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sta1 implements vta1 {

    /* JADX INFO: renamed from: a */
    public final long f213878a;

    public sta1(long j) {
        this.f213878a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sta1) && mu71.m62836c(this.f213878a, ((sta1) obj).f213878a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f213878a);
    }
}
