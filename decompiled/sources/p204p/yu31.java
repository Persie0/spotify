package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yu31 implements av31 {

    /* JADX INFO: renamed from: a */
    public final Throwable f276272a;

    public yu31(Throwable th) {
        this.f276272a = th;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m94649a() {
        return this.f276272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu31) && wj50.m88271j(this.f276272a, ((yu31) obj).f276272a);
    }

    public final int hashCode() {
        return this.f276272a.hashCode();
    }
}
