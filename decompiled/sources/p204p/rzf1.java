package p204p;

import com.google.android.gms.internal.play_billing.zzgc;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rzf1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final vzf1 f204149b = new vzf1(a5g1.f12517b);

    /* JADX INFO: renamed from: a */
    public int f204150a = 0;

    static {
        int i = dyf1.f54334a;
    }

    /* JADX INFO: renamed from: l */
    public static int m76783l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(edb.m38563l("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Beginning index larger than ending index: ", i2, ", "));
        }
        throw new IndexOutOfBoundsException(s571.m77247f(i2, "End index: ", i3, " >= "));
    }

    /* JADX INFO: renamed from: m */
    public static vzf1 m76784m(int i, byte[] bArr, int i2) {
        try {
            m76783l(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new vzf1(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m76785n(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        m76783l(i, i4, bArr.length);
        m76783l(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo40350a(int i);

    /* JADX INFO: renamed from: b */
    public abstract byte mo40351b(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo40352d(int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract int mo40353e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rzf1)) {
            return false;
        }
        rzf1 rzf1Var = (rzf1) obj;
        int iMo40353e = mo40353e();
        if (iMo40353e != rzf1Var.mo40353e()) {
            return false;
        }
        if (iMo40353e == 0) {
            return true;
        }
        int i = this.f204150a;
        int i2 = rzf1Var.f204150a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo40356j(rzf1Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract rzf1 mo40354f(int i, int i2);

    public final int hashCode() {
        int iMo40352d = this.f204150a;
        if (iMo40352d == 0) {
            int iMo40353e = mo40353e();
            iMo40352d = mo40352d(iMo40353e, iMo40353e);
            if (iMo40352d == 0) {
                iMo40352d = 1;
            }
            this.f204150a = iMo40352d;
        }
        return iMo40352d;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo40355i(v0g1 v0g1Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new sua(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo40356j(rzf1 rzf1Var);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return dq60.m36616p(mo40353e() <= 50 ? hkf1.m47792I(this) : hkf1.m47792I(mo40354f(0, 47)).concat("..."), "\">", edb.m38571t(mo40353e(), "<ByteString@", hexString, " size=", " contents=\""));
    }
}
