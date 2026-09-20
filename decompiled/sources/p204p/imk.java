package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class imk implements mmk {

    /* JADX INFO: renamed from: a */
    public final boolean f103722a;

    /* JADX INFO: renamed from: b */
    public final String f103723b;

    public imk(boolean z, String str) {
        this.f103722a = z;
        this.f103723b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imk)) {
            return false;
        }
        imk imkVar = (imk) obj;
        return this.f103722a == imkVar.f103722a && wj50.m88271j(this.f103723b, imkVar.f103723b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f103722a) * 31;
        String str = this.f103723b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
