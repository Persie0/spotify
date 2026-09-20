package p204p;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class ee50 {

    /* JADX INFO: renamed from: a */
    public static final Charset f58680a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f58681b;

    static {
        Charset.forName("US-ASCII");
        f58680a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f58681b = bArr;
        ByteBuffer.wrap(bArr);
        owe.m68166f(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m38645a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m38646b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
