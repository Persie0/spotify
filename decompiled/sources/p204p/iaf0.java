package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iaf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final String f100244b;

    /* JADX INFO: renamed from: c */
    public final Long f100245c;

    public iaf0(Long l, String str) {
        super(false);
        this.f100244b = str;
        this.f100245c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaf0)) {
            return false;
        }
        iaf0 iaf0Var = (iaf0) obj;
        return wj50.m88271j(this.f100244b, iaf0Var.f100244b) && wj50.m88271j(this.f100245c, iaf0Var.f100245c);
    }

    public final int hashCode() {
        int iHashCode = this.f100244b.hashCode() * 31;
        Long l = this.f100245c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
