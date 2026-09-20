package p204p;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4u0 {

    /* JADX INFO: renamed from: a */
    public static final q32 f258199a = new q32(13);

    /* JADX INFO: renamed from: a */
    public static byte[] m89907a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f258199a.get()).nextBytes(bArr);
        return bArr;
    }
}
