package p204p;

import com.google.android.gms.internal.wearable.zzcf;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class nnf1 {

    /* JADX INFO: renamed from: a */
    public static final Charset f156416a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f156417b;

    static {
        Charset.forName("US-ASCII");
        f156416a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f156417b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new qr8().m73605p();
        } catch (zzcf e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m65206a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static qlf1 m65207b(Object obj, Object obj2) {
        qlf1 qlf1Var = (qlf1) ((vaf1) obj);
        hlf1 hlf1Var = (hlf1) qlf1Var.mo58162b(5, null);
        hlf1Var.m47880b(qlf1Var);
        vaf1 vaf1Var = (vaf1) obj2;
        if (!hlf1Var.f92684a.getClass().isInstance(vaf1Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        hlf1Var.m47880b((qlf1) vaf1Var);
        return hlf1Var.m47882d();
    }
}
