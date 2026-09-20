package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f167585a;

    public oof0(Boolean bool) {
        this.f167585a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oof0) && wj50.m88271j(this.f167585a, ((oof0) obj).f167585a);
    }

    public final int hashCode() {
        Boolean bool = this.f167585a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
