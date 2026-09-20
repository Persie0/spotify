package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ssh0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213632a;

    public ssh0(int i) {
        this.f213632a = (i & 1) != 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79216a() {
        return this.f213632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssh0) && this.f213632a == ((ssh0) obj).f213632a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77245d(edb.m38547C(1) * 31, 29791, this.f213632a);
    }
}
