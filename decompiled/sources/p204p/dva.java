package p204p;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class dva implements Iterable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final dva f53402c = new dva(ge50.f79024b);

    /* JADX INFO: renamed from: d */
    public static final zua f53403d;

    /* JADX INFO: renamed from: a */
    public int f53404a = 0;

    /* JADX INFO: renamed from: b */
    public final byte[] f53405b;

    static {
        f53403d = pt3.m70890a() ? new vb5(2) : new u6j0(22);
    }

    public dva(byte[] bArr) {
        bArr.getClass();
        this.f53405b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static dva m37078a(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) >= 0) {
            return new dva(f53403d.mo82449a(i, bArr, i2));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(edb.m38563l("Beginning index: ", i, " < 0"));
        }
        if (i3 < i) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "Beginning index larger than ending index: ", i3, ", "));
        }
        throw new IndexOutOfBoundsException(s571.m77247f(i3, "End index: ", length, " >= "));
    }

    /* JADX INFO: renamed from: b */
    public int m37079b() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m37080d() {
        return this.f53404a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dva) || size() != ((dva) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof dva)) {
            return obj.equals(this);
        }
        dva dvaVar = (dva) obj;
        int iM37080d = m37080d();
        int iM37080d2 = dvaVar.m37080d();
        if (iM37080d != 0 && iM37080d2 != 0 && iM37080d != iM37080d2) {
            return false;
        }
        int size = size();
        if (size > dvaVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > dvaVar.size()) {
            StringBuilder sbM56838j = klh.m56838j(size, "Ran off end of other: 0, ", ", ");
            sbM56838j.append(dvaVar.size());
            throw new IllegalArgumentException(sbM56838j.toString());
        }
        byte[] bArr = dvaVar.f53405b;
        int iM37079b = m37079b() + size;
        int iM37079b2 = m37079b();
        int iM37079b3 = dvaVar.m37079b();
        while (iM37079b2 < iM37079b) {
            if (this.f53405b[iM37079b2] != bArr[iM37079b3]) {
                return false;
            }
            iM37079b2++;
            iM37079b3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f53404a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iM37079b = m37079b();
        int i2 = size;
        for (int i3 = iM37079b; i3 < iM37079b + size; i3++) {
            i2 = (i2 * 31) + this.f53405b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f53404a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new sua(this);
    }

    public int size() {
        return this.f53405b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
