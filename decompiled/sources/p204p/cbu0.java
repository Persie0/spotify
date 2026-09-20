package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cbu0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2205o8 f36230a;

    /* JADX INFO: renamed from: b */
    public final String f36231b;

    /* JADX INFO: renamed from: c */
    public final Object[] f36232c;

    /* JADX INFO: renamed from: d */
    public final int f36233d;

    public cbu0(AbstractC2205o8 abstractC2205o8, String str, Object[] objArr) {
        this.f36230a = abstractC2205o8;
        this.f36231b = str;
        this.f36232c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36233d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f36233d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
