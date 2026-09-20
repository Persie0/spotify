package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c760 implements e760 {

    /* JADX INFO: renamed from: a */
    public final Throwable f34763a;

    public c760(Throwable th) {
        this.f34763a = th;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m31682a() {
        return this.f34763a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c760) && wj50.m88271j(this.f34763a, ((c760) obj).f34763a);
    }

    public final int hashCode() {
        return this.f34763a.hashCode();
    }
}
