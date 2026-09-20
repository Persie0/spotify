package p204p;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes11.dex */
public final class tuc {

    /* JADX INFO: renamed from: a */
    public final FileInputStream f223821a;

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f223822b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f223823c;

    /* JADX INFO: renamed from: d */
    public boolean f223824d;

    /* JADX INFO: renamed from: e */
    public char f223825e;

    public tuc(FileInputStream fileInputStream, Charset charset) {
        this.f223821a = fileInputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f223822b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(hua.f95355c.m54335y(8196));
        this.f223823c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX INFO: renamed from: a */
    public final int m81558a(char[] cArr, int i, int i2) throws CharacterCodingException {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        char c2;
        char c3;
        char c4;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "Unexpected arguments: ", ", ", ", ");
            sbM36619s.append(cArr.length);
            throw new IllegalArgumentException(sbM36619s.toString().toString());
        }
        boolean z = true;
        if (this.f223824d) {
            cArr[i] = this.f223825e;
            i++;
            i2--;
            this.f223824d = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (this.f223824d) {
                this.f223824d = false;
                c4 = this.f223825e;
            } else {
                char[] cArr2 = new char[2];
                int iM81558a = m81558a(cArr2, 0, 2);
                if (iM81558a == -1) {
                    c = 65535;
                } else if (iM81558a == 1) {
                    c2 = cArr2[0];
                } else {
                    if (iM81558a != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iM81558a).toString());
                    }
                    this.f223825e = cArr2[1];
                    this.f223824d = true;
                    c3 = cArr2[0];
                }
            }
            if (c != 65535) {
                c = c2;
                c = c3;
                c = c4;
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z2 = false;
        while (true) {
            charsetDecoder = this.f223822b;
            ByteBuffer byteBuffer = this.f223823c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            if (coderResultDecode.isUnderflow()) {
                if (z2 || !charBuffer.hasRemaining()) {
                    z = z2;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f223821a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z = z2;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
