package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r5v0 extends gwg1 {

    /* JADX INFO: renamed from: b */
    public final Throwable f196136b;

    public r5v0(Throwable th) {
        this.f196136b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5v0) && wj50.m88271j(this.f196136b, ((r5v0) obj).f196136b);
    }

    public final int hashCode() {
        return this.f196136b.hashCode();
    }
}
