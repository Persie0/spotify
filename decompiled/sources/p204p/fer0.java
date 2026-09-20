package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fer0 {

    /* JADX INFO: renamed from: a */
    public final Object f68820a;

    /* JADX INFO: renamed from: b */
    public final byte[] f68821b;

    /* JADX INFO: renamed from: c */
    public final su60 f68822c;

    /* JADX INFO: renamed from: d */
    public final hzl0 f68823d;

    public fer0(Object obj, byte[] bArr, su60 su60Var, hzl0 hzl0Var) {
        this.f68820a = obj;
        this.f68821b = Arrays.copyOf(bArr, bArr.length);
        this.f68822c = su60Var;
        this.f68823d = hzl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m41485a() {
        byte[] bArr = this.f68821b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
