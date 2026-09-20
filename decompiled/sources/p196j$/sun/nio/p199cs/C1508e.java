package p196j$.sun.nio.p199cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* JADX INFO: renamed from: j$.sun.nio.cs.e */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1508e {

    /* JADX INFO: renamed from: a */
    public CoderResult f10603a;

    /* JADX INFO: renamed from: b */
    public boolean f10604b;

    /* JADX INFO: renamed from: a */
    public final int m23934a(char c, CharBuffer charBuffer) {
        if (!Character.isHighSurrogate(c)) {
            if (Character.isLowSurrogate(c)) {
                this.f10603a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f10604b = false;
            this.f10603a = null;
            return c;
        }
        if (!charBuffer.hasRemaining()) {
            this.f10603a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c2 = charBuffer.get();
        if (!Character.isLowSurrogate(c2)) {
            this.f10603a = CoderResult.malformedForLength(1);
            return -1;
        }
        int codePoint = Character.toCodePoint(c, c2);
        this.f10604b = true;
        this.f10603a = null;
        return codePoint;
    }

    /* JADX INFO: renamed from: b */
    public final int m23935b(char c, char[] cArr, int i, int i2) {
        if (!Character.isHighSurrogate(c)) {
            if (Character.isLowSurrogate(c)) {
                this.f10603a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f10604b = false;
            this.f10603a = null;
            return c;
        }
        if (i2 - i < 2) {
            this.f10603a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c2 = cArr[i + 1];
        if (!Character.isLowSurrogate(c2)) {
            this.f10603a = CoderResult.malformedForLength(1);
            return -1;
        }
        int codePoint = Character.toCodePoint(c, c2);
        this.f10604b = true;
        this.f10603a = null;
        return codePoint;
    }
}
