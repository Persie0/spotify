package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gf81 {

    /* JADX INFO: renamed from: a */
    public final boolean f79302a;

    /* JADX INFO: renamed from: b */
    public final String f79303b;

    /* JADX INFO: renamed from: c */
    public final bk81 f79304c;

    /* JADX INFO: renamed from: d */
    public final int f79305d;

    /* JADX INFO: renamed from: e */
    public final byte[] f79306e;

    public gf81(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        c95.m31843i((i == 0) ^ (bArr2 == null));
        this.f79302a = z;
        this.f79303b = str;
        this.f79305d = i;
        this.f79306e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    yif1.m93819w0("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f79304c = new bk81(i4, bArr, i2, i3);
    }
}
