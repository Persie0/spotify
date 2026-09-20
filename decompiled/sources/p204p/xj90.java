package p204p;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class xj90 extends hva {

    /* JADX INFO: renamed from: b */
    public final byte[] f262074b;

    /* JADX INFO: renamed from: c */
    public int f262075c = 0;

    public xj90(byte[] bArr) {
        this.f262074b = bArr;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: e */
    public void mo48765e(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f262074b, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hva) || size() != ((hva) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof xj90) {
            return m91210s((xj90) obj, 0, size());
        }
        if (obj instanceof ukx0) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(dq60.m36616p("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: f */
    public final int mo48766f() {
        return 0;
    }

    public final int hashCode() {
        int iMo48769m = this.f262075c;
        if (iMo48769m == 0) {
            int size = size();
            iMo48769m = mo48769m(size, 0, size);
            if (iMo48769m == 0) {
                iMo48769m = 1;
            }
            this.f262075c = iMo48769m;
        }
        return iMo48769m;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: i */
    public final boolean mo48767i() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new sua(this);
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: j */
    public final boolean mo48768j() {
        byte[] bArr = this.f262074b;
        return ebg1.m38386o(0, bArr, bArr.length) == 0;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: m */
    public final int mo48769m(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f262074b[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // p204p.hva
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo48770n(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.f262074b;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return ebg1.m38384m(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return ebg1.m38384m(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return (b6 << 16) ^ ((b5 << 8) ^ b2);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return ebg1.m38386o(i2, bArr, i6);
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: o */
    public final int mo48771o() {
        return this.f262075c;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: p */
    public final String mo48772p() {
        byte[] bArr = this.f262074b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: r */
    public final void mo48774r(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f262074b, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m91210s(xj90 xj90Var, int i, int i2) {
        byte[] bArr = xj90Var.f262074b;
        int length = bArr.length;
        byte[] bArr2 = this.f262074b;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = xj90Var.f262074b.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new IllegalArgumentException(s571.m77248g(length3, ", ", sb2));
    }

    @Override // p204p.hva
    public int size() {
        return this.f262074b.length;
    }
}
