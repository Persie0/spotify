package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ms91 implements ns91 {

    /* JADX INFO: renamed from: a */
    public final String f146736a;

    /* JADX INFO: renamed from: b */
    public final Long f146737b;

    public ms91(Long l, String str) {
        this.f146736a = str;
        this.f146737b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms91)) {
            return false;
        }
        ms91 ms91Var = (ms91) obj;
        return wj50.m88271j(this.f146736a, ms91Var.f146736a) && wj50.m88271j(this.f146737b, ms91Var.f146737b);
    }

    public final int hashCode() {
        int iHashCode = this.f146736a.hashCode() * 31;
        Long l = this.f146737b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
