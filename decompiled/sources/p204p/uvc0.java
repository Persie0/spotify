package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f234422a;

    public uvc0(Throwable th) {
        this.f234422a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvc0) && wj50.m88271j(this.f234422a, ((uvc0) obj).f234422a);
    }

    public final int hashCode() {
        return this.f234422a.hashCode();
    }
}
