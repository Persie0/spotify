package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m8h1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f141054a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m61111a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
