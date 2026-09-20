package p204p;

import androidx.glance.appwidget.protobuf.C0056b;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ce50 {

    /* JADX INFO: renamed from: a */
    public static final Charset f37010a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f37011b;

    static {
        Charset.forName("US-ASCII");
        f37010a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f37011b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0056b(bArr, 0, 0, false).mo611e(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m32495a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m32496b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
