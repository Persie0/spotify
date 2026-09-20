package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ro31 {

    /* JADX INFO: renamed from: a */
    public final Long f201062a;

    public ro31(Long l) {
        this.f201062a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro31) && wj50.m88271j(this.f201062a, ((ro31) obj).f201062a);
    }

    public final int hashCode() {
        Long l = this.f201062a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
