package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cvh {

    /* JADX INFO: renamed from: a */
    public final String f42429a;

    /* JADX INFO: renamed from: b */
    public final String f42430b;

    /* JADX INFO: renamed from: c */
    public final String f42431c;

    public cvh(String str, String str2, String str3) {
        this.f42429a = str;
        this.f42430b = str2;
        this.f42431c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvh)) {
            return false;
        }
        cvh cvhVar = (cvh) obj;
        return wj50.m88271j(this.f42429a, cvhVar.f42429a) && wj50.m88271j(this.f42430b, cvhVar.f42430b) && wj50.m88271j(this.f42431c, cvhVar.f42431c);
    }

    public final int hashCode() {
        int iHashCode = this.f42429a.hashCode() * 31;
        String str = this.f42430b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42431c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
