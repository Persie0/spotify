package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x7f0 implements a8f0 {

    /* JADX INFO: renamed from: a */
    public final int f258888a;

    public x7f0(int i) {
        this.f258888a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7f0) && this.f258888a == ((x7f0) obj).f258888a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f258888a);
    }
}
