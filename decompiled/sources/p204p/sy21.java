package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final yz21 f215111a;

    public sy21(yz21 yz21Var) {
        this.f215111a = yz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy21) && wj50.m88271j(this.f215111a, ((sy21) obj).f215111a);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (this.f215111a.hashCode() * 31);
    }
}
