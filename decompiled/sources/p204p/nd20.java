package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class nd20 {

    /* JADX INFO: renamed from: a */
    public static final char[] f152641a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public abstract byte[] mo56150a();

    /* JADX INFO: renamed from: b */
    public abstract int mo56151b();

    /* JADX INFO: renamed from: c */
    public abstract long mo56152c();

    /* JADX INFO: renamed from: d */
    public abstract int mo56153d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo56154e(nd20 nd20Var);

    public final boolean equals(Object obj) {
        if (!(obj instanceof nd20)) {
            return false;
        }
        nd20 nd20Var = (nd20) obj;
        return mo56153d() == nd20Var.mo56153d() && mo56154e(nd20Var);
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo56155f() {
        return mo56150a();
    }

    public final int hashCode() {
        if (mo56153d() >= 32) {
            return mo56151b();
        }
        byte[] bArrMo56155f = mo56155f();
        int i = bArrMo56155f[0] & 255;
        for (int i2 = 1; i2 < bArrMo56155f.length; i2++) {
            i |= (bArrMo56155f[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrMo56155f = mo56155f();
        StringBuilder sb = new StringBuilder(bArrMo56155f.length * 2);
        for (byte b : bArrMo56155f) {
            char[] cArr = f152641a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
