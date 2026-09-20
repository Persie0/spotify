package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zje1 implements bke1 {

    /* JADX INFO: renamed from: a */
    public final Long f283432a;

    public zje1(Long l) {
        this.f283432a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zje1) && wj50.m88271j(this.f283432a, ((zje1) obj).f283432a);
    }

    public final int hashCode() {
        Long l = this.f283432a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
