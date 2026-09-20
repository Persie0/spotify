package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uzy0 implements m0z0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f235660a;

    public uzy0(Throwable th) {
        this.f235660a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzy0) && wj50.m88271j(this.f235660a, ((uzy0) obj).f235660a);
    }

    public final int hashCode() {
        return this.f235660a.hashCode();
    }
}
