package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o1a0 implements s1a0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f160681a;

    public o1a0(Throwable th) {
        this.f160681a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1a0) && wj50.m88271j(this.f160681a, ((o1a0) obj).f160681a);
    }

    public final int hashCode() {
        return this.f160681a.hashCode();
    }
}
