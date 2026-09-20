package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class x7i0 implements a8i0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f258927a;

    public x7i0(Exception exc) {
        this.f258927a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7i0) && wj50.m88271j(this.f258927a, ((x7i0) obj).f258927a);
    }

    public final int hashCode() {
        return this.f258927a.hashCode();
    }
}
