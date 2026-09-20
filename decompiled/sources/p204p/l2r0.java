package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l2r0 implements m2r0 {

    /* JADX INFO: renamed from: a */
    public final Long f129068a;

    public l2r0(Long l) {
        this.f129068a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2r0) && wj50.m88271j(this.f129068a, ((l2r0) obj).f129068a);
    }

    public final int hashCode() {
        Long l = this.f129068a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
