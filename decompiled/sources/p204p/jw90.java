package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f116610a;

    public jw90(Throwable th) {
        this.f116610a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw90) && wj50.m88271j(this.f116610a, ((jw90) obj).f116610a);
    }

    public final int hashCode() {
        return this.f116610a.hashCode();
    }
}
