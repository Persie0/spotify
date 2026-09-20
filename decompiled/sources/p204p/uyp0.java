package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uyp0 extends vyp0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f235350a;

    public uyp0(Throwable th) {
        this.f235350a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyp0) && wj50.m88271j(this.f235350a, ((uyp0) obj).f235350a);
    }

    public final int hashCode() {
        return this.f235350a.hashCode();
    }
}
