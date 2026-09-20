package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sxw implements z1x {

    /* JADX INFO: renamed from: a */
    public final boolean f215060a;

    public sxw(boolean z) {
        this.f215060a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxw) && this.f215060a == ((sxw) obj).f215060a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215060a);
    }
}
