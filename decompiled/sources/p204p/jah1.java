package p204p;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class jah1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final jah1 f110469c = new jah1(rbh1.f197603b);

    /* JADX INFO: renamed from: a */
    public int f110470a = 0;

    /* JADX INFO: renamed from: b */
    public final byte[] f110471b;

    static {
        int i = bah1.f25203a;
    }

    public jah1(byte[] bArr) {
        bArr.getClass();
        this.f110471b = bArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m52841e(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException(s571.m77248g(i, "End index: 47 >= ", new StringBuilder(String.valueOf(47).length() + 15 + String.valueOf(i).length())));
    }

    /* JADX INFO: renamed from: a */
    public byte mo41178a(int i) {
        return this.f110471b[i];
    }

    /* JADX INFO: renamed from: b */
    public byte mo41179b(int i) {
        return this.f110471b[i];
    }

    /* JADX INFO: renamed from: d */
    public int mo41180d() {
        return this.f110471b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jah1) && mo41180d() == ((jah1) obj).mo41180d()) {
            if (mo41180d() == 0) {
                return true;
            }
            if (!(obj instanceof jah1)) {
                return obj.equals(this);
            }
            jah1 jah1Var = (jah1) obj;
            int i = this.f110470a;
            int i2 = jah1Var.f110470a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iMo41180d = mo41180d();
                if (iMo41180d > jah1Var.mo41180d()) {
                    int iMo41180d2 = mo41180d();
                    StringBuilder sb = new StringBuilder(String.valueOf(iMo41180d).length() + 18 + String.valueOf(iMo41180d2).length());
                    sb.append("Length too large: ");
                    sb.append(iMo41180d);
                    sb.append(iMo41180d2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iMo41180d <= jah1Var.mo41180d()) {
                    byte[] bArr = jah1Var.f110471b;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < iMo41180d) {
                        if (this.f110471b[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int iMo41180d3 = jah1Var.mo41180d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iMo41180d).length() + 27 + String.valueOf(iMo41180d3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iMo41180d);
                sb2.append(", ");
                sb2.append(iMo41180d3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f110470a;
        if (i != 0) {
            return i;
        }
        int iMo41180d = mo41180d();
        Charset charset = rbh1.f197602a;
        int i2 = iMo41180d;
        for (int i3 = 0; i3 < iMo41180d; i3++) {
            i2 = (i2 * 31) + this.f110471b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f110470a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new sua(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo41180d = mo41180d();
        if (mo41180d() <= 50) {
            strConcat = zuj0.m97037B(this);
        } else {
            m52841e(mo41180d());
            strConcat = zuj0.m97037B(new fah1(this.f110471b)).concat("...");
        }
        return dq60.m36616p(strConcat, "\">", edb.m38571t(iMo41180d, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
