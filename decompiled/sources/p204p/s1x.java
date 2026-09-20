package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s1x implements c3x {

    /* JADX INFO: renamed from: a */
    public final Long f204848a;

    public s1x(Long l) {
        this.f204848a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1x) && wj50.m88271j(this.f204848a, ((s1x) obj).f204848a);
    }

    public final int hashCode() {
        Long l = this.f204848a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
