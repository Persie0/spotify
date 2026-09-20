package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u1s0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f225914a;

    public u1s0(Throwable th) {
        this.f225914a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1s0) && wj50.m88271j(this.f225914a, ((u1s0) obj).f225914a);
    }

    public final int hashCode() {
        Throwable th = this.f225914a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }
}
