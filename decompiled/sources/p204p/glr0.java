package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class glr0 extends hlr0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f81165a;

    public glr0(Throwable th) {
        this.f81165a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glr0) && wj50.m88271j(this.f81165a, ((glr0) obj).f81165a);
    }

    public final int hashCode() {
        return this.f81165a.hashCode();
    }
}
