package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e0k0 implements k0k0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f54986a;

    public e0k0(Throwable th) {
        this.f54986a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0k0) && wj50.m88271j(this.f54986a, ((e0k0) obj).f54986a);
    }

    public final int hashCode() {
        return this.f54986a.hashCode();
    }
}
