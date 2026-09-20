package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sfp0 {

    /* JADX INFO: renamed from: a */
    public final String f208623a;

    /* JADX INFO: renamed from: b */
    public final String f208624b;

    public sfp0(String str, String str2) {
        this.f208623a = str;
        this.f208624b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfp0)) {
            return false;
        }
        sfp0 sfp0Var = (sfp0) obj;
        return wj50.m88271j(this.f208623a, sfp0Var.f208623a) && wj50.m88271j(this.f208624b, sfp0Var.f208624b);
    }

    public final int hashCode() {
        String str = this.f208623a;
        return this.f208624b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
