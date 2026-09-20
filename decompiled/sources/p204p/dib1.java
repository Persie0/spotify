package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dib1 implements iib1 {

    /* JADX INFO: renamed from: a */
    public final boolean f49312a;

    public dib1(boolean z) {
        this.f49312a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36072a() {
        return this.f49312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dib1) && this.f49312a == ((dib1) obj).f49312a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49312a);
    }
}
