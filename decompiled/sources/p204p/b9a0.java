package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b9a0 implements daa0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f24806a;

    public b9a0(Throwable th) {
        this.f24806a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9a0) && wj50.m88271j(this.f24806a, ((b9a0) obj).f24806a);
    }

    public final int hashCode() {
        return this.f24806a.hashCode();
    }
}
