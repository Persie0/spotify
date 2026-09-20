package p204p;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ava implements Iterable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final ava f20130c = new ava(ce50.f37011b);

    /* JADX INFO: renamed from: d */
    public static final wua f20131d;

    /* JADX INFO: renamed from: a */
    public int f20132a = 0;

    /* JADX INFO: renamed from: b */
    public final byte[] f20133b;

    static {
        f20131d = mt3.m62787a() ? new m95(2) : new l45(2);
    }

    public ava(byte[] bArr) {
        bArr.getClass();
        this.f20133b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m27229b(int i, int i2, int i3) {
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
    public static ava m27230d(int i, byte[] bArr, int i2) {
        m27229b(i, i + i2, bArr.length);
        return new ava(f20131d.mo58114a(i, bArr, i2));
    }

    /* JADX INFO: renamed from: a */
    public byte mo27231a(int i) {
        return this.f20133b[i];
    }

    /* JADX INFO: renamed from: e */
    public int mo27232e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ava) || size() != ((ava) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ava)) {
            return obj.equals(this);
        }
        ava avaVar = (ava) obj;
        int i = this.f20132a;
        int i2 = avaVar.f20132a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > avaVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > avaVar.size()) {
            StringBuilder sbM56838j = klh.m56838j(size, "Ran off end of other: 0, ", ", ");
            sbM56838j.append(avaVar.size());
            throw new IllegalArgumentException(sbM56838j.toString());
        }
        byte[] bArr = avaVar.f20133b;
        int iMo27232e = mo27232e() + size;
        int iMo27232e2 = mo27232e();
        int iMo27232e3 = avaVar.mo27232e();
        while (iMo27232e2 < iMo27232e) {
            if (this.f20133b[iMo27232e2] != bArr[iMo27232e3]) {
                return false;
            }
            iMo27232e2++;
            iMo27232e3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo27233f(int i) {
        return this.f20133b[i];
    }

    public final int hashCode() {
        int i = this.f20132a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iMo27232e = mo27232e();
        int i2 = size;
        for (int i3 = iMo27232e; i3 < iMo27232e + size; i3++) {
            i2 = (i2 * 31) + this.f20133b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f20132a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new sua(this);
    }

    public int size() {
        return this.f20133b.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = wtg1.m88941p(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iM27229b = m27229b(0, 47, size());
            sb.append(wtg1.m88941p(iM27229b == 0 ? f20130c : new vua(this.f20133b, mo27232e(), iM27229b)));
            sb.append("...");
            string = sb.toString();
        }
        return dq60.m36616p(string, "\">", edb.m38571t(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
