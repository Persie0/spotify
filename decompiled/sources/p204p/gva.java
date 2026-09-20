package p204p;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class gva implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final cva f84678b = new cva(ee50.f58681b);

    /* JADX INFO: renamed from: c */
    public static final yua f84679c;

    /* JADX INFO: renamed from: a */
    public int f84680a;

    static {
        f84679c = ot3.m67760a() ? new lb5(2) : new hvi0(22);
    }

    /* JADX INFO: renamed from: b */
    public static int m45885b(int i, int i2, int i3) {
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
    public static cva m45886d(int i, byte[] bArr, int i2) {
        m45885b(i, i + i2, bArr.length);
        return new cva(f84679c.mo48891a(i, bArr, i2));
    }

    /* JADX INFO: renamed from: e */
    public static cva m45887e(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m45885b(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new cva(bArr);
    }

    /* JADX INFO: renamed from: f */
    public static cva m45888f(String str) {
        return new cva(str.getBytes(ee50.f58680a));
    }

    /* JADX INFO: renamed from: j */
    public static int m45889j(int i, String str) {
        int i2;
        char cCharAt = str.charAt(i);
        if (cCharAt >= '0' && cCharAt <= '9') {
            i2 = cCharAt - '0';
        } else if (cCharAt < 'A' || cCharAt > 'F') {
            i2 = (cCharAt < 'a' || cCharAt > 'f') ? -1 : cCharAt - 'W';
        } else {
            i2 = cCharAt - '7';
        }
        if (i2 != -1) {
            return i2;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i) + " at index " + i);
    }

    /* JADX INFO: renamed from: l */
    public static cva m45890l(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m45889j(i2 + 1, str) | (m45889j(i2, str) << 4));
        }
        return new cva(bArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo34014a(int i);

    public final int hashCode() {
        int iMo34020q = this.f84680a;
        if (iMo34020q == 0) {
            int size = size();
            iMo34020q = mo34020q(size, size);
            if (iMo34020q == 0) {
                iMo34020q = 1;
            }
            this.f84680a = iMo34020q;
        }
        return iMo34020q;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo34015i(byte[] bArr, int i);

    /* JADX INFO: renamed from: m */
    public abstract byte mo34016m(int i);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo34017n();

    /* JADX INFO: renamed from: o */
    public abstract owe mo34018o();

    /* JADX INFO: renamed from: p */
    public abstract InputStream mo34019p();

    /* JADX INFO: renamed from: q */
    public abstract int mo34020q(int i, int i2);

    /* JADX INFO: renamed from: r */
    public abstract gva mo34021r(int i);

    /* JADX INFO: renamed from: s */
    public final byte[] m45891s() {
        int size = size();
        if (size == 0) {
            return ee50.f58681b;
        }
        byte[] bArr = new byte[size];
        mo34015i(bArr, size);
        return bArr;
    }

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract String mo34022t(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return dq60.m36616p(size() <= 50 ? ztg1.m96918i(this) : s571.m77250i(ztg1.m96918i(mo34021r(47)), "..."), "\">", edb.m38571t(size(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    /* JADX INFO: renamed from: u */
    public final String m45892u() {
        return size() == 0 ? "" : mo34022t(ee50.f58680a);
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo34023v(uwe uweVar);
}
