package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c9a0 implements eaa0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f35435a;

    public c9a0(Throwable th) {
        this.f35435a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9a0) && wj50.m88271j(this.f35435a, ((c9a0) obj).f35435a);
    }

    public final int hashCode() {
        return this.f35435a.hashCode();
    }
}
