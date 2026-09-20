package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ow0 implements qw0 {

    /* JADX INFO: renamed from: a */
    public final long f170598a;

    public ow0(long j) {
        this.f170598a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow0) && this.f170598a == ((ow0) obj).f170598a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170598a);
    }
}
