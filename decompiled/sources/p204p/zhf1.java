package p204p;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zhf1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final nhf1 f282915b = new nhf1(nnf1.f156417b);

    /* JADX INFO: renamed from: a */
    public int f282916a;

    static {
        int i = ccf1.f36400a;
    }

    /* JADX INFO: renamed from: f */
    public static int m96128f(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: i */
    public static nhf1 m96129i(int i, byte[] bArr, int i2) {
        m96128f(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new nhf1(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo29246a(int i);

    /* JADX INFO: renamed from: b */
    public abstract byte mo29247b(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo29248d();

    /* JADX INFO: renamed from: e */
    public abstract void mo29249e(byte[] bArr, int i);

    public final int hashCode() {
        int i = this.f282916a;
        if (i != 0) {
            return i;
        }
        int iMo29248d = mo29248d();
        nhf1 nhf1Var = (nhf1) this;
        int i2 = iMo29248d;
        for (int i3 = 0; i3 < iMo29248d; i3++) {
            i2 = (i2 * 31) + nhf1Var.f154001c[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f282916a = i2;
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
        int iMo29248d = mo29248d();
        if (mo29248d() <= 50) {
            strConcat = ahf1.m25948t(this);
        } else {
            nhf1 nhf1Var = (nhf1) this;
            int iM96128f = m96128f(0, 47, nhf1Var.mo29248d());
            strConcat = ahf1.m25948t(iM96128f == 0 ? f282915b : new bhf1(nhf1Var.f154001c, iM96128f)).concat("...");
        }
        return dq60.m36616p(strConcat, "\">", edb.m38571t(iMo29248d, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
