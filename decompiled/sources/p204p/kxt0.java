package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kxt0 extends nxt0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f127591a;

    public kxt0(Throwable th) {
        this.f127591a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxt0) && wj50.m88271j(this.f127591a, ((kxt0) obj).f127591a);
    }

    public final int hashCode() {
        return this.f127591a.hashCode();
    }
}
