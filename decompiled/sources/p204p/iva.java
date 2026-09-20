package p204p;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class iva implements Serializable, Comparable {

    /* JADX INFO: renamed from: d */
    public static final iva f106177d = new iva(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final byte[] f106178a;

    /* JADX INFO: renamed from: b */
    public transient int f106179b;

    /* JADX INFO: renamed from: c */
    public transient String f106180c;

    public iva(byte[] bArr) {
        this.f106178a = bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int m51742g(iva ivaVar, iva ivaVar2) {
        ivaVar.getClass();
        return ivaVar.mo51749f(ivaVar2.mo51750h(), 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ iva m51743o(iva ivaVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return ivaVar.mo51756n(i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        iva ivaVar = new iva(bArr);
        Field declaredField = iva.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, ivaVar.f106178a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f106178a.length);
        objectOutputStream.write(this.f106178a);
    }

    /* JADX INFO: renamed from: a */
    public String mo51744a() {
        byte[] bArr = this.f106178a;
        byte[] bArr2 = AbstractC1649a.f10968a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return kk40.m56657S(bArr3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(iva ivaVar) {
        int iMo51747d = mo51747d();
        int iMo51747d2 = ivaVar.mo51747d();
        int iMin = Math.min(iMo51747d, iMo51747d2);
        for (int i = 0; i < iMin; i++) {
            int iMo51751i = mo51751i(i) & 255;
            int iMo51751i2 = ivaVar.mo51751i(i) & 255;
            if (iMo51751i != iMo51751i2) {
                return iMo51751i < iMo51751i2 ? -1 : 1;
            }
        }
        if (iMo51747d == iMo51747d2) {
            return 0;
        }
        return iMo51747d < iMo51747d2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: c */
    public iva mo51746c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f106178a, 0, mo51747d());
        byte[] bArrDigest = messageDigest.digest();
        wj50.m88279p(bArrDigest);
        return new iva(bArrDigest);
    }

    /* JADX INFO: renamed from: d */
    public int mo51747d() {
        return this.f106178a.length;
    }

    /* JADX INFO: renamed from: e */
    public String mo51748e() {
        byte[] bArr = this.f106178a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = exb.f63733c;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iva) {
            iva ivaVar = (iva) obj;
            int iMo51747d = ivaVar.mo51747d();
            byte[] bArr = this.f106178a;
            if (iMo51747d == bArr.length && ivaVar.mo51754l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int mo51749f(byte[] bArr, int i) {
        int length = this.f106178a.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!dul.m37005h(iMax, 0, bArr.length, this.f106178a, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo51750h() {
        return this.f106178a;
    }

    public int hashCode() {
        int i = this.f106179b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f106178a);
        this.f106179b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public byte mo51751i(int i) {
        return this.f106178a[i];
    }

    /* JADX INFO: renamed from: j */
    public int mo51752j(byte[] bArr) {
        for (int iMin = Math.min(dul.m37022y(-1234567890, this), this.f106178a.length - bArr.length); -1 < iMin; iMin--) {
            if (dul.m37005h(iMin, 0, bArr.length, this.f106178a, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo51753k(int i, iva ivaVar, int i2) {
        return ivaVar.mo51754l(0, this.f106178a, i, i2);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo51754l(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f106178a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && dul.m37005h(i, i2, i3, bArr2, bArr);
    }

    /* JADX INFO: renamed from: m */
    public String mo51755m(Charset charset) {
        return new String(this.f106178a, charset);
    }

    /* JADX INFO: renamed from: n */
    public iva mo51756n(int i, int i2) {
        int iM37022y = dul.m37022y(i2, this);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f106178a;
        if (iM37022y > bArr.length) {
            throw new IllegalArgumentException(edb.m38567p(new StringBuilder("endIndex > length("), this.f106178a.length, ')').toString());
        }
        if (iM37022y - i >= 0) {
            return (i == 0 && iM37022y == bArr.length) ? this : new iva(bk5.m29639x0(i, bArr, iM37022y));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX INFO: renamed from: p */
    public iva mo51757p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f106178a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new iva(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public byte[] mo51758q() {
        byte[] bArr = this.f106178a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: r */
    public final String m51759r() {
        String str = this.f106180c;
        if (str != null) {
            return str;
        }
        String strM56657S = kk40.m56657S(mo51750h());
        this.f106180c = strM56657S;
        return strM56657S;
    }

    /* JADX INFO: renamed from: s */
    public void mo51760s(npa npaVar, int i) {
        exb.m40214l(this, npaVar, i);
    }

    public String toString() {
        byte[] bArr = this.f106178a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int iM40210h = exb.m40210h(bArr);
        if (iM40210h != -1) {
            String strM51759r = m51759r();
            String strM29801l0 = bm51.m29801l0(bm51.m29801l0(bm51.m29801l0(strM51759r.substring(0, iM40210h), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (iM40210h >= strM51759r.length()) {
                return dq60.m36608h(']', "[text=", strM29801l0);
            }
            return "[size=" + this.f106178a.length + " text=" + strM29801l0 + "…]";
        }
        if (this.f106178a.length <= 64) {
            return "[hex=" + mo51748e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.f106178a.length);
        sb.append(" hex=");
        int iM37022y = dul.m37022y(64, this);
        byte[] bArr2 = this.f106178a;
        if (iM37022y > bArr2.length) {
            throw new IllegalArgumentException(edb.m38567p(new StringBuilder("endIndex > length("), this.f106178a.length, ')').toString());
        }
        if (iM37022y < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb.append((iM37022y == bArr2.length ? this : new iva(bk5.m29639x0(0, bArr2, iM37022y))).mo51748e());
        sb.append("…]");
        return sb.toString();
    }
}
