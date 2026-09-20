package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class usb {

    /* JADX INFO: renamed from: a */
    public final String f233575a;

    /* JADX INFO: renamed from: b */
    public final int f233576b;

    /* JADX INFO: renamed from: c */
    public final int f233577c;

    /* JADX INFO: renamed from: d */
    public final String f233578d;

    /* JADX INFO: renamed from: e */
    public final String f233579e;

    public usb(int i, int i2, String str, String str2, String str3) {
        this.f233575a = str;
        this.f233576b = i;
        this.f233577c = i2;
        this.f233578d = str2;
        this.f233579e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb)) {
            return false;
        }
        usb usbVar = (usb) obj;
        return wj50.m88271j(this.f233575a, usbVar.f233575a) && this.f233576b == usbVar.f233576b && this.f233577c == usbVar.f233577c && wj50.m88271j(this.f233578d, usbVar.f233578d) && wj50.m88271j(this.f233579e, usbVar.f233579e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f233577c, mt60.m62800g(this.f233576b, this.f233575a.hashCode() * 31, 31), 31);
        String str = this.f233578d;
        int iHashCode = (iM62800g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f233579e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
