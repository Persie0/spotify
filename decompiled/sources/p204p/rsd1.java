package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rsd1 implements tsd1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f202314a;

    public rsd1(Throwable th) {
        this.f202314a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsd1) && wj50.m88271j(this.f202314a, ((rsd1) obj).f202314a);
    }

    public final int hashCode() {
        return this.f202314a.hashCode();
    }
}
