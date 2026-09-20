package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import androidx.datastore.preferences.protobuf.AbstractC0048e;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge50 {

    /* JADX INFO: renamed from: a */
    public static final Charset f79023a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f79024b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f79024b = bArr;
        ByteBuffer.wrap(bArr);
        ptc.m70920q0(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m44454a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m44455b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0048e m44456c(Object obj, Object obj2) {
        AbstractC0048e abstractC0048e = (AbstractC0048e) ((AbstractC0044a) obj);
        o110 o110Var = (o110) abstractC0048e.mo521d(5);
        o110Var.m66039d();
        o110.m66036e(o110Var.f160565b, abstractC0048e);
        AbstractC0044a abstractC0044a = (AbstractC0044a) obj2;
        if (!o110Var.f160564a.getClass().isInstance(abstractC0044a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        o110Var.m66039d();
        o110.m66036e(o110Var.f160565b, (AbstractC0048e) abstractC0044a);
        return o110Var.m66038c();
    }
}
