package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ay20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final hnk f21065a;

    public ay20(hnk hnkVar) {
        this.f21065a = hnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay20) && wj50.m88271j(this.f21065a, ((ay20) obj).f21065a);
    }

    public final int hashCode() {
        return this.f21065a.hashCode();
    }
}
