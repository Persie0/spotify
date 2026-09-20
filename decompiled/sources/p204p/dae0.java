package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dae0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f47035a;

    public dae0(boolean z) {
        this.f47035a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dae0) && this.f47035a == ((dae0) obj).f47035a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f47035a);
    }
}
