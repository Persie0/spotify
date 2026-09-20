package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class okt {

    /* JADX INFO: renamed from: a */
    public final Long f166663a;

    public okt(Long l) {
        this.f166663a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okt) && wj50.m88271j(this.f166663a, ((okt) obj).f166663a);
    }

    public final int hashCode() {
        Long l = this.f166663a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
