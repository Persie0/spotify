package p196j$.sun.nio.p199cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* JADX INFO: renamed from: j$.sun.nio.cs.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1505b extends CharsetEncoder {

    /* JADX INFO: renamed from: a */
    public final C1508e f10600a;

    public C1505b(C1506c c1506c) {
        super(c1506c, 1.0f, 1.0f);
        C1508e c1508e = new C1508e();
        c1508e.f10603a = CoderResult.UNDERFLOW;
        this.f10600a = c1508e;
    }

    /* JADX INFO: renamed from: a */
    public static int m23933a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c <= 255) {
                        if (byteBuffer.hasRemaining()) {
                            byteBuffer.put((byte) c);
                            iPosition++;
                        } else {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                        }
                    } else if (this.f10600a.m23934a(c, charBuffer) < 0) {
                        coderResultUnmappableForLength = this.f10600a.f10603a;
                    } else {
                        if (!this.f10600a.f10604b) {
                            i = 1;
                        }
                        coderResultUnmappableForLength = CoderResult.unmappableForLength(i);
                    }
                    return coderResultUnmappableForLength;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coderResultUnmappableForLength = CoderResult.UNDERFLOW;
            return coderResultUnmappableForLength;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i2 = iLimit2 - iPosition3;
        int i3 = iLimit - iPosition2;
        if (i2 >= i3) {
            i2 = i3;
        }
        try {
            int iM23933a = m23933a(cArrArray, iPosition2, bArrArray, iPosition3, i2);
            int i4 = iPosition2 + iM23933a;
            int i5 = iPosition3 + iM23933a;
            if (iM23933a == i2) {
                coderResultUnmappableForLength2 = i2 < i3 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.f10600a.m23935b(cArrArray[i4], cArrArray, i4, iLimit) < 0) {
                coderResultUnmappableForLength2 = this.f10600a.f10603a;
            } else {
                if (!this.f10600a.f10604b) {
                    i = 1;
                }
                coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i);
            }
            int i6 = i5 - iArrayOffset2;
            return coderResultUnmappableForLength2;
        } finally {
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }
}
