package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u2k {

    /* JADX INFO: renamed from: a */
    public final String f226109a;

    /* JADX INFO: renamed from: b */
    public final boolean f226110b;

    /* JADX INFO: renamed from: c */
    public final Integer f226111c;

    public u2k(Integer num, String str, boolean z) {
        this.f226109a = str;
        this.f226110b = z;
        this.f226111c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2k)) {
            return false;
        }
        u2k u2kVar = (u2k) obj;
        return wj50.m88271j(this.f226109a, u2kVar.f226109a) && this.f226110b == u2kVar.f226110b && wj50.m88271j(this.f226111c, u2kVar.f226111c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f226109a.hashCode() * 31, 31, this.f226110b);
        Integer num = this.f226111c;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
