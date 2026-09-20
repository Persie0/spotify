package p204p;

import com.google.crypto.tink.shaded.protobuf.C0154c;
import java.io.IOException;

/* JADX INFO: renamed from: p.o8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2205o8 {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public abstract int mo1800a();

    /* JADX INFO: renamed from: b */
    public final String m66413b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m66414c() {
        try {
            int iMo1800a = mo1800a();
            byte[] bArr = new byte[iMo1800a];
            C0154c c0154c = new C0154c(bArr, iMo1800a);
            mo1801d(c0154c);
            if (iMo1800a - c0154c.f2357h == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m66413b("byte array"), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1801d(C0154c c0154c);
}
