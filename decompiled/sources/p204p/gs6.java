package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gs6 implements is6 {

    /* JADX INFO: renamed from: a */
    public final Throwable f83885a;

    public gs6(Throwable th) {
        this.f83885a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs6) && wj50.m88271j(this.f83885a, ((gs6) obj).f83885a);
    }

    public final int hashCode() {
        return this.f83885a.hashCode();
    }
}
