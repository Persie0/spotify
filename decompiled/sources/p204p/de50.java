package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class de50 {

    /* JADX INFO: renamed from: a */
    public static final Charset f47970a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f47971b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f47971b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.m1678f();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m35764a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m35765b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0156e m35766c(Object obj, Object obj2) {
        AbstractC0156e abstractC0156e = (AbstractC0156e) ((AbstractC2205o8) obj);
        m110 m110Var = (m110) abstractC0156e.mo1803f(5);
        m110Var.m60484d();
        m110.m60481e(m110Var.f138791b, abstractC0156e);
        AbstractC2205o8 abstractC2205o8 = (AbstractC2205o8) obj2;
        if (!m110Var.f138790a.getClass().isInstance(abstractC2205o8)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        m110Var.m60484d();
        m110.m60481e(m110Var.f138791b, (AbstractC0156e) abstractC2205o8);
        return m110Var.m60483c();
    }
}
