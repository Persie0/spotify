package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sxf1 {
    protected transient int zza;

    /* JADX INFO: renamed from: a */
    public abstract void mo74644a(v0g1 v0g1Var);

    /* JADX INFO: renamed from: b */
    public final byte[] m79593b() {
        try {
            int iMo74646d = mo74646d();
            byte[] bArr = new byte[iMo74646d];
            v0g1 v0g1Var = new v0g1(bArr, iMo74646d);
            mo74644a(v0g1Var);
            if (iMo74646d - v0g1Var.f235996f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(s571.m77251j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo74645c(w9g1 w9g1Var);

    /* JADX INFO: renamed from: d */
    public abstract int mo74646d();
}
