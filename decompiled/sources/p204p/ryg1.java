package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ryg1 {

    /* JADX INFO: renamed from: a */
    public static final char[] f203920a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public abstract int mo63196a();

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo63197b();

    /* JADX INFO: renamed from: c */
    public abstract int mo63198c();

    /* JADX INFO: renamed from: d */
    public abstract long mo63199d();

    /* JADX INFO: renamed from: e */
    public byte[] mo63200e() {
        return mo63197b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ryg1)) {
            return false;
        }
        ryg1 ryg1Var = (ryg1) obj;
        return mo63196a() == ryg1Var.mo63196a() && mo63201f(ryg1Var);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo63201f(ryg1 ryg1Var);

    public final int hashCode() {
        if (mo63196a() >= 32) {
            return mo63198c();
        }
        byte[] bArrMo63200e = mo63200e();
        int i = bArrMo63200e[0] & 255;
        for (int i2 = 1; i2 < bArrMo63200e.length; i2++) {
            i |= (bArrMo63200e[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrMo63200e = mo63200e();
        int length = bArrMo63200e.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArrMo63200e) {
            char[] cArr = f203920a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
