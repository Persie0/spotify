package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zka1 implements bla1 {

    /* JADX INFO: renamed from: a */
    public final String f283695a;

    /* JADX INFO: renamed from: b */
    public final Long f283696b;

    public zka1(Long l, String str) {
        this.f283695a = str;
        this.f283696b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zka1)) {
            return false;
        }
        zka1 zka1Var = (zka1) obj;
        return wj50.m88271j(this.f283695a, zka1Var.f283695a) && wj50.m88271j(this.f283696b, zka1Var.f283696b);
    }

    public final int hashCode() {
        int iHashCode = this.f283695a.hashCode() * 31;
        Long l = this.f283696b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
