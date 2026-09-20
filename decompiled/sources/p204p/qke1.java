package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qke1 implements uke1 {

    /* JADX INFO: renamed from: a */
    public final String f189541a;

    /* JADX INFO: renamed from: b */
    public final String f189542b;

    /* JADX INFO: renamed from: c */
    public final boolean f189543c;

    /* JADX INFO: renamed from: d */
    public final Long f189544d;

    public qke1(Long l, String str, String str2, boolean z) {
        this.f189541a = str;
        this.f189542b = str2;
        this.f189543c = z;
        this.f189544d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qke1)) {
            return false;
        }
        qke1 qke1Var = (qke1) obj;
        return wj50.m88271j(this.f189541a, qke1Var.f189541a) && wj50.m88271j(this.f189542b, qke1Var.f189542b) && this.f189543c == qke1Var.f189543c && wj50.m88271j(this.f189544d, qke1Var.f189544d);
    }

    public final int hashCode() {
        int iHashCode = this.f189541a.hashCode() * 31;
        String str = this.f189542b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f189543c);
        Long l = this.f189544d;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
