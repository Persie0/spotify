package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b27 implements c27 {

    /* JADX INFO: renamed from: a */
    public final Long f22509a;

    public b27(Long l) {
        this.f22509a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b27) && wj50.m88271j(this.f22509a, ((b27) obj).f22509a);
    }

    public final int hashCode() {
        Long l = this.f22509a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
