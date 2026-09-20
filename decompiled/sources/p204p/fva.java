package p204p;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class fva implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final bva f73739b = new bva(de50.f47971b);

    /* JADX INFO: renamed from: c */
    public static final xua f73740c;

    /* JADX INFO: renamed from: a */
    public int f73741a;

    static {
        f73740c = nt3.m65594a() ? new jb5(2) : new zhi0(22);
    }

    /* JADX INFO: renamed from: b */
    public static int m42775b(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: d */
    public static bva m42776d(int i, byte[] bArr, int i2) {
        m42775b(i, i + i2, bArr.length);
        return new bva(f73740c.mo52874a(i, bArr, i2));
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo30594a(int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo30595e(byte[] bArr, int i);

    /* JADX INFO: renamed from: f */
    public abstract byte mo30596f(int i);

    public final int hashCode() {
        int i = this.f73741a;
        if (i != 0) {
            return i;
        }
        int size = size();
        bva bvaVar = (bva) this;
        int iMo30597j = bvaVar.mo30597j();
        int i2 = size;
        for (int i3 = iMo30597j; i3 < iMo30597j + size; i3++) {
            i2 = (i2 * 31) + bvaVar.f31316d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f73741a = i2;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m42777i() {
        int size = size();
        if (size == 0) {
            return de50.f47971b;
        }
        byte[] bArr = new byte[size];
        mo30595e(bArr, size);
        return bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new sua(this);
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = ytg1.m94620k(this);
        } else {
            StringBuilder sb = new StringBuilder();
            bva bvaVar = (bva) this;
            int iM42775b = m42775b(0, 47, bvaVar.size());
            sb.append(ytg1.m94620k(iM42775b == 0 ? f73739b : new tua(bvaVar.f31316d, bvaVar.mo30597j(), iM42775b)));
            sb.append("...");
            string = sb.toString();
        }
        return dq60.m36616p(string, "\">", edb.m38571t(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
