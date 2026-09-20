package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dde1 extends fde1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f47817a;

    public dde1(Throwable th) {
        this.f47817a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dde1) && wj50.m88271j(this.f47817a, ((dde1) obj).f47817a);
    }

    public final int hashCode() {
        return this.f47817a.hashCode();
    }
}
