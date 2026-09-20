package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.recaptcha.internal.zzaez;
import com.spotify.music.R;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipBackgroundView;
import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class w780 implements u780, qio {

    /* JADX INFO: renamed from: f */
    public static final m95 f248596f = new m95(19);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248597a;

    /* JADX INFO: renamed from: b */
    public int f248598b;

    /* JADX INFO: renamed from: c */
    public int f248599c;

    /* JADX INFO: renamed from: d */
    public Object f248600d;

    /* JADX INFO: renamed from: e */
    public Object f248601e;

    public /* synthetic */ w780(char c, int i) {
        this.f248597a = i;
    }

    /* JADX INFO: renamed from: f */
    public static int m87318f(int i, int i2) {
        return m87320h(i2) + m87325m(i);
    }

    /* JADX INFO: renamed from: g */
    public static int m87319g(int i, int i2) {
        return m87320h(i2) + m87325m(i);
    }

    /* JADX INFO: renamed from: h */
    public static int m87320h(int i) {
        if (i >= 0) {
            return m87323k(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: i */
    public static int m87321i(int i, AbstractC2155n8 abstractC2155n8) {
        return m87322j(abstractC2155n8) + m87325m(i);
    }

    /* JADX INFO: renamed from: j */
    public static int m87322j(AbstractC2155n8 abstractC2155n8) {
        int iMo24390a = abstractC2155n8.mo24390a();
        return m87323k(iMo24390a) + iMo24390a;
    }

    /* JADX INFO: renamed from: k */
    public static int m87323k(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: l */
    public static int m87324l(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: m */
    public static int m87325m(int i) {
        return m87323k(i << 3);
    }

    /* JADX INFO: renamed from: q0 */
    public static int m87326q0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: r0 */
    public static int m87327r0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: y */
    public static w780 m87328y(OutputStream outputStream, int i) {
        return new w780(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: A */
    public Object m87329A(long j, boolean z) {
        Object objM87332D = null;
        long j2 = Long.MAX_VALUE;
        while (this.f248599c > 0) {
            long j3 = j - ((long[]) this.f248600d)[this.f248598b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM87332D = m87332D();
            j2 = j3;
        }
        return objM87332D;
    }

    /* JADX INFO: renamed from: B */
    public synchronized Object m87330B() {
        return this.f248599c == 0 ? null : m87332D();
    }

    /* JADX INFO: renamed from: C */
    public synchronized Object m87331C(long j) {
        return m87329A(j, true);
    }

    /* JADX INFO: renamed from: D */
    public Object m87332D() {
        c95.m31855u(this.f248599c > 0);
        Object[] objArr = (Object[]) this.f248601e;
        int i = this.f248598b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f248598b = (i + 1) % objArr.length;
        this.f248599c--;
        return obj;
    }

    /* JADX INFO: renamed from: E */
    public int m87333E(int i) {
        m87361d(i);
        int iPreceding = ((BreakIterator) this.f248601e).preceding(i);
        return (m87382u(iPreceding) && m87378q(iPreceding) && !m87381t(iPreceding)) ? m87333E(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: F */
    public void m87334F() throws IOException {
        OutputStream outputStream = (OutputStream) this.f248601e;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write((byte[]) this.f248600d, 0, this.f248599c);
        this.f248599c = 0;
    }

    /* JADX INFO: renamed from: G */
    public void m87335G(int i, int i2, String str) {
        if (i > i2) {
            nt40.m65597a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            nt40.m65597a("start must be non-negative, but was " + i);
        }
        sq00 sq00Var = (sq00) this.f248601e;
        if (sq00Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f248600d).length() - i2, 64);
            int i3 = i - iMin;
            ((String) this.f248600d).getChars(i3, i, cArr, 0);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            ((String) this.f248600d).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            sq00 sq00Var2 = new sq00(0);
            sq00Var2.f212978b = iMax;
            sq00Var2.f212979c = cArr;
            sq00Var2.f212980d = length;
            sq00Var2.f212981e = i4;
            this.f248601e = sq00Var2;
            this.f248598b = i3;
            this.f248599c = i5;
            return;
        }
        int i6 = this.f248598b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > sq00Var.f212978b - sq00Var.m78931a()) {
            this.f248600d = toString();
            this.f248601e = null;
            this.f248598b = -1;
            this.f248599c = -1;
            m87335G(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > sq00Var.m78931a()) {
            int iM78931a = length2 - sq00Var.m78931a();
            int i9 = sq00Var.f212978b;
            do {
                i9 *= 2;
            } while (i9 - sq00Var.f212978b < iM78931a);
            char[] cArr2 = new char[i9];
            bk5.m29631q0(sq00Var.f212979c, cArr2, 0, 0, sq00Var.f212980d);
            int i10 = sq00Var.f212978b;
            int i11 = sq00Var.f212981e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            bk5.m29631q0(sq00Var.f212979c, cArr2, i13, i11, i12 + i11);
            sq00Var.f212979c = cArr2;
            sq00Var.f212978b = i9;
            sq00Var.f212981e = i13;
        }
        int i14 = sq00Var.f212980d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = sq00Var.f212979c;
            bk5.m29631q0(cArr3, cArr3, sq00Var.f212981e - i15, i8, i14);
            sq00Var.f212980d = i7;
            sq00Var.f212981e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM78931a2 = sq00Var.m78931a() + i7;
            int iM78931a3 = sq00Var.m78931a() + i8;
            int i16 = sq00Var.f212981e;
            char[] cArr4 = sq00Var.f212979c;
            bk5.m29631q0(cArr4, cArr4, sq00Var.f212980d, i16, iM78931a2);
            sq00Var.f212980d += iM78931a2 - i16;
            sq00Var.f212981e = iM78931a3;
        } else {
            sq00Var.f212981e = sq00Var.m78931a() + i8;
            sq00Var.f212980d = i7;
        }
        str.getChars(0, str.length(), sq00Var.f212979c, sq00Var.f212980d);
        sq00Var.f212980d = str.length() + sq00Var.f212980d;
    }

    /* JADX INFO: renamed from: H */
    public void m87336H(String str) {
        String strM35799p = def0.m35799p(str);
        c95.m31845k(strM35799p == null || def0.m35794k(strM35799p), "Not an audio MIME type: %s", strM35799p);
        this.f248600d = strM35799p;
    }

    /* JADX INFO: renamed from: I */
    public void m87337I(int i) {
        this.f248598b = i;
    }

    /* JADX INFO: renamed from: J */
    public void m87338J(int i) {
        this.f248599c = i;
    }

    /* JADX INFO: renamed from: K */
    public void m87339K(TextDirectionHeuristic textDirectionHeuristic) {
        this.f248601e = textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: L */
    public void m87340L(String str) {
        String strM35799p = def0.m35799p(str);
        c95.m31845k(strM35799p == null || def0.m35798o(strM35799p), "Not a video MIME type: %s", strM35799p);
        this.f248601e = strM35799p;
    }

    /* JADX INFO: renamed from: M */
    public synchronized int m87341M() {
        return this.f248599c;
    }

    /* JADX INFO: renamed from: N */
    public void m87342N(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m87385x(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m87385x(i4, i6, i3, 2);
        int i7 = i - 1;
        m87385x(i7, i5, i3, 3);
        m87385x(i7, i6, i3, 4);
        m87385x(i7, i2, i3, 5);
        m87385x(i, i5, i3, 6);
        m87385x(i, i6, i3, 7);
        m87385x(i, i2, i3, 8);
    }

    /* JADX INFO: renamed from: O */
    public void m87343O(int i, int i2) throws IOException {
        m87356a0(i, 0);
        m87345Q(i2);
    }

    /* JADX INFO: renamed from: P */
    public void m87344P(int i, int i2) throws IOException {
        m87356a0(i, 0);
        m87345Q(i2);
    }

    /* JADX INFO: renamed from: Q */
    public void m87345Q(int i) throws IOException {
        if (i >= 0) {
            m87353Y(i);
        } else {
            m87354Z(i);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m87346R(int i, AbstractC2155n8 abstractC2155n8) throws IOException {
        m87356a0(i, 2);
        m87347S(abstractC2155n8);
    }

    /* JADX INFO: renamed from: S */
    public void m87347S(AbstractC2155n8 abstractC2155n8) throws IOException {
        m87353Y(abstractC2155n8.mo24390a());
        abstractC2155n8.mo24393d(this);
    }

    /* JADX INFO: renamed from: T */
    public void m87348T(int i) throws IOException {
        byte b = (byte) i;
        if (this.f248599c == this.f248598b) {
            m87334F();
        }
        byte[] bArr = (byte[]) this.f248600d;
        int i2 = this.f248599c;
        this.f248599c = i2 + 1;
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: U */
    public void m87349U(hva hvaVar) throws IOException {
        int size = hvaVar.size();
        byte[] bArr = (byte[]) this.f248600d;
        int i = this.f248598b;
        int i2 = this.f248599c;
        int i3 = i - i2;
        if (i3 >= size) {
            hvaVar.m48764d(0, bArr, i2, size);
            this.f248599c += size;
            return;
        }
        hvaVar.m48764d(0, bArr, i2, i3);
        int i4 = size - i3;
        this.f248599c = i;
        m87334F();
        if (i4 <= i) {
            hvaVar.m48764d(i3, bArr, 0, i4);
            this.f248599c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f248601e;
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= hvaVar.size()) {
            if (i4 > 0) {
                hvaVar.mo48774r(outputStream, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* JADX INFO: renamed from: V */
    public void m87350V(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f248600d;
        int i = this.f248598b;
        int i2 = this.f248599c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.f248599c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.f248599c = i;
        m87334F();
        if (i4 > i) {
            ((OutputStream) this.f248601e).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f248599c = i4;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m87351W(int i) throws IOException {
        m87348T(i & 255);
        m87348T((i >> 8) & 255);
        m87348T((i >> 16) & 255);
        m87348T((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: X */
    public void m87352X(long j) throws IOException {
        m87348T(((int) j) & 255);
        m87348T(((int) (j >> 8)) & 255);
        m87348T(((int) (j >> 16)) & 255);
        m87348T(((int) (j >> 24)) & 255);
        m87348T(((int) (j >> 32)) & 255);
        m87348T(((int) (j >> 40)) & 255);
        m87348T(((int) (j >> 48)) & 255);
        m87348T(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: Y */
    public void m87353Y(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m87348T((i & 127) | 128);
            i >>>= 7;
        }
        m87348T(i);
    }

    /* JADX INFO: renamed from: Z */
    public void m87354Z(long j) throws IOException {
        while (((-128) & j) != 0) {
            m87348T((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m87348T((int) j);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87355a(long j, Object obj) {
        int i = this.f248599c;
        if (i > 0) {
            if (j <= ((long[]) this.f248600d)[((this.f248598b + i) - 1) % ((Object[]) this.f248601e).length]) {
                m87363e();
            }
        }
        m87373n();
        int i2 = this.f248598b;
        int i3 = this.f248599c;
        Object[] objArr = (Object[]) this.f248601e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.f248600d)[length] = j;
        objArr[length] = obj;
        this.f248599c = i3 + 1;
    }

    /* JADX INFO: renamed from: a0 */
    public void m87356a0(int i, int i2) throws IOException {
        m87353Y((i << 3) | i2);
    }

    /* JADX INFO: renamed from: b */
    public jfq0 m87357b() {
        return new jfq0((TextPaint) this.f248600d, (TextDirectionHeuristic) this.f248601e, this.f248598b, this.f248599c);
    }

    /* JADX INFO: renamed from: b0 */
    public void m87358b0(int i, int i2) throws zzaez {
        m87370k0((i << 3) | i2);
    }

    /* JADX INFO: renamed from: c */
    public p591 m87359c() {
        return new p591(this.f248598b, (String) this.f248600d, this.f248599c, (String) this.f248601e);
    }

    /* JADX INFO: renamed from: c0 */
    public void m87360c0(int i, int i2) throws zzaez {
        m87370k0(i << 3);
        m87369j0(i2);
    }

    /* JADX INFO: renamed from: d */
    public void m87361d(int i) {
        int i2 = this.f248598b;
        int i3 = this.f248599c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM36619s = dq60.m36619s(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbM36619s.append(i3);
        sbM36619s.append(']');
        nt40.m65597a(sbM36619s.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public void m87362d0(int i, int i2) throws zzaez {
        m87370k0(i << 3);
        m87370k0(i2);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m87363e() {
        this.f248598b = 0;
        this.f248599c = 0;
        Arrays.fill((Object[]) this.f248601e, (Object) null);
    }

    /* JADX INFO: renamed from: e0 */
    public void m87364e0(int i, int i2) throws zzaez {
        m87370k0((i << 3) | 5);
        m87371l0(i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m87365f0(int i, long j) throws zzaez {
        m87370k0(i << 3);
        m87372m0(j);
    }

    /* JADX INFO: renamed from: g0 */
    public void m87366g0(int i, long j) throws zzaez {
        m87370k0((i << 3) | 1);
        m87374n0(j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m87367h0(int i, String str) throws zzaez {
        m87370k0((i << 3) | 2);
        byte[] bArr = (byte[]) this.f248601e;
        int i2 = this.f248599c;
        try {
            int iM87326q0 = m87326q0(str.length() * 3);
            int iM87326q1 = m87326q0(str.length());
            if (iM87326q1 != iM87326q0) {
                int i3 = lcf1.f131931a;
                m87370k0(l0y0.m57818D(str));
                int i4 = this.f248599c;
                this.f248599c = lcf1.m58709b(str, bArr, i4, bArr.length - i4);
                return;
            }
            int i5 = i2 + iM87326q1;
            this.f248599c = i5;
            int iM58709b = lcf1.m58709b(str, bArr, i5, bArr.length - i5);
            this.f248599c = i2;
            m87370k0((iM58709b - i2) - iM87326q1);
            this.f248599c = iM58709b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaez("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m87368i0(int i, s9f1 s9f1Var) throws zzaez {
        m87370k0((i << 3) | 2);
        m87370k0(s9f1Var.mo69377e());
        s9f1Var.mo69382m(this);
    }

    /* JADX INFO: renamed from: j0 */
    public void m87369j0(int i) throws zzaez {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            m87370k0(i);
            return;
        }
        int i2 = this.f248599c;
        try {
            byte[] bArr = (byte[]) this.f248601e;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.f248599c = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new zzaez(i2, this.f248598b, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m87370k0(int i) throws zzaez {
        IndexOutOfBoundsException indexOutOfBoundsException;
        byte[] bArr = (byte[]) this.f248601e;
        int i2 = this.f248599c;
        int i3 = i & (-128);
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.f248599c = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.f248599c = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.f248599c = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.f248599c = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.f248599c = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
                throw new zzaez(i3, this.f248598b, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m87371l0(int i) throws zzaez {
        int i2 = this.f248599c;
        try {
            byte[] bArr = (byte[]) this.f248601e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f248599c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaez(i2, this.f248598b, 4, e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m87372m0(long j) throws zzaez {
        byte[] bArr = (byte[]) this.f248601e;
        long j2 = j & (-128);
        int i = this.f248599c;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.f248599c = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.f248599c = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.f248599c = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.f248599c = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.f248599c = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.f248599c = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.f248599c = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.f248599c = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.f248599c = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.f248599c = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzaez(i, this.f248598b, 1, e);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m87373n() {
        int length = ((Object[]) this.f248601e).length;
        if (this.f248599c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f248598b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.f248600d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f248601e, this.f248598b, objArr, 0, i3);
        int i4 = this.f248598b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.f248600d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f248601e, 0, objArr, i3, this.f248598b);
        }
        this.f248600d = jArr;
        this.f248601e = objArr;
        this.f248598b = 0;
    }

    /* JADX INFO: renamed from: n0 */
    public void m87374n0(long j) throws zzaez {
        int i = this.f248599c;
        try {
            byte[] bArr = (byte[]) this.f248601e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f248599c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaez(i, this.f248598b, 8, e);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m87375o() throws IOException {
        if (((OutputStream) this.f248601e) != null) {
            m87334F();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m87376o0(int i, byte[] bArr, int i2) throws zzaez {
        try {
            System.arraycopy(bArr, i, (byte[]) this.f248601e, this.f248599c, i2);
            this.f248599c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaez(this.f248599c, this.f248598b, i2, e);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m87377p() {
        sq00 sq00Var = (sq00) this.f248601e;
        if (sq00Var == null) {
            return ((String) this.f248600d).length();
        }
        return (sq00Var.f212978b - sq00Var.m78931a()) + (((String) this.f248600d).length() - (this.f248599c - this.f248598b));
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public uio mo30418p0() {
        return new wjp((String) this.f248601e, this.f248598b, this.f248599c, (xyx) this.f248600d);
    }

    /* JADX INFO: renamed from: q */
    public boolean m87378q(int i) {
        CharSequence charSequence = (CharSequence) this.f248600d;
        int i2 = this.f248598b + 1;
        if (i > this.f248599c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!p7u.m69298d()) {
                    return false;
                }
                p7u p7uVarM69297a = p7u.m69297a();
                if (p7uVarM69297a.m69300c() != 1 || p7uVarM69297a.m69299b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m87379r(int i) {
        int i2 = this.f248598b + 1;
        if (i > this.f248599c || i2 > i) {
            return false;
        }
        return th1.m80809k(Character.codePointBefore((CharSequence) this.f248600d, i));
    }

    /* JADX INFO: renamed from: s */
    public boolean m87380s(int i) {
        m87361d(i);
        if (!((BreakIterator) this.f248601e).isBoundary(i)) {
            return false;
        }
        if (m87382u(i) && m87382u(i - 1) && m87382u(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f248600d).length() - 1 || !(m87381t(i) || m87381t(i + 1));
    }

    /* JADX INFO: renamed from: t */
    public boolean m87381t(int i) {
        CharSequence charSequence = (CharSequence) this.f248600d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (wj50.m88271j(unicodeBlockOf, unicodeBlock) && wj50.m88271j(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return wj50.m88271j(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && wj50.m88271j(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public String toString() {
        switch (this.f248597a) {
            case 5:
                sq00 sq00Var = (sq00) this.f248601e;
                if (sq00Var == null) {
                    return (String) this.f248600d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f248600d, 0, this.f248598b);
                sb.append(sq00Var.f212979c, 0, sq00Var.f212980d);
                char[] cArr = sq00Var.f212979c;
                int i = sq00Var.f212981e;
                sb.append(cArr, i, sq00Var.f212978b - i);
                String str = (String) this.f248600d;
                sb.append((CharSequence) str, this.f248599c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m87382u(int i) {
        CharSequence charSequence = (CharSequence) this.f248600d;
        int i2 = this.f248598b;
        if (i >= this.f248599c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!p7u.m69298d()) {
                return false;
            }
            p7u p7uVarM69297a = p7u.m69297a();
            if (p7uVarM69297a.m69300c() != 1 || p7uVarM69297a.m69299b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m87383v(int i) {
        int i2 = this.f248598b;
        if (i >= this.f248599c || i2 > i) {
            return false;
        }
        return th1.m80809k(Character.codePointAt((CharSequence) this.f248600d, i));
    }

    /* JADX INFO: renamed from: w */
    public c7j m87384w(List list, pal0 pal0Var) {
        c7j c7jVar = new c7j();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
        }
        int i = this.f248598b;
        mcu mcuVar = (mcu) this.f248601e;
        ConstraintLayout constraintLayout = (ConstraintLayout) mcuVar.f142249b;
        wg61 wg61Var = (wg61) mcuVar.f142250c;
        wg61 wg61Var2 = (wg61) mcuVar.f142251d;
        View viewFindViewById = constraintLayout.findViewById(R.id.library_filter_chip_clear_button);
        if (viewFindViewById == null) {
            Context context = constraintLayout.getContext();
            Resources resources = constraintLayout.getResources();
            Drawable drawable = context.getDrawable(R.drawable.library_clear_chips_background);
            Drawable drawable2 = context.getDrawable(R.drawable.encore_icon_x_16);
            wj50.m88279p(drawable2);
            Drawable drawableMutate = drawable2.mutate();
            drawableMutate.setTint(context.getColor(R.color.white));
            drawableMutate.setBounds(0, 0, ((Number) wg61Var2.getValue()).intValue(), ((Number) wg61Var2.getValue()).intValue());
            float fIntValue = ((Number) wg61Var2.getValue()).intValue() / ((Number) wg61Var.getValue()).intValue();
            float fIntValue2 = ((Number) ((wg61) mcuVar.f142252e).getValue()).intValue() / ((Number) wg61Var.getValue()).intValue();
            s10 s10Var = new s10(drawableMutate, fIntValue);
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
            LayerDrawable layerDrawable = new LayerDrawable(new s10[]{new s10(drawable, fIntValue2), s10Var});
            View libraryChipBackgroundView = new LibraryChipBackgroundView(context, null, 0, 6, null);
            int color = context.getColor(R.color.opacity_black_30);
            r3r0 r3r0Var = new r3r0();
            r3r0Var.f195563a = stg1.m79276q(color, 10);
            r3r0Var.addState(new int[]{android.R.attr.state_pressed}, layerDrawable);
            r3r0Var.addState(new int[0], layerDrawable);
            libraryChipBackgroundView.setBackground(r3r0Var);
            libraryChipBackgroundView.setId(R.id.library_filter_chip_clear_button);
            libraryChipBackgroundView.setTag(R.id.library_filter_type_button, Boolean.TRUE);
            libraryChipBackgroundView.setContentDescription(resources.getString(R.string.filter_row_library_clear_button_content_description));
            libraryChipBackgroundView.setMinimumHeight(((Number) wg61Var.getValue()).intValue());
            alf1.m26332o(libraryChipBackgroundView).m72126a();
            libraryChipBackgroundView.setAlpha(0.0f);
            constraintLayout.addView(libraryChipBackgroundView);
            viewFindViewById = libraryChipBackgroundView;
        }
        viewFindViewById.setOnClickListener(new ryp(pal0Var, 28));
        c7jVar.m31740l(R.id.library_filter_chip_clear_button).f258686e.f269825c = i;
        c7jVar.m31739i(R.id.library_filter_chip_clear_button, i);
        c7jVar.m31737g(R.id.library_filter_chip_clear_button, 6, 0, 6);
        c7jVar.m31737g(R.id.library_filter_chip_clear_button, 3, 0, 3);
        c7jVar.m31737g(R.id.library_filter_chip_clear_button, 4, 0, 4);
        c7jVar.m31745u(R.id.library_filter_chip_clear_button, 6, this.f248599c);
        c7jVar.m31746v(R.id.library_filter_chip_clear_button, 4);
        c7jVar.m31740l(R.id.library_filter_chip_clear_button).f258684c.f13063d = 0.0f;
        viewFindViewById.setOnClickListener(null);
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw ikc0.m50937i(it2);
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            ikc0.m50942n(it3.next());
            ikc0.m50942n(g6f.m43745s0(arrayList));
            uqg1.m83801y((ConstraintLayout) this.f248600d);
            throw null;
        }
        Iterator it4 = g6f.m43704R0(arrayList).iterator();
        if (!it4.hasNext()) {
            return c7jVar;
        }
        ikc0.m50942n(it4.next());
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public void m87385x(int i, int i2, int i3, int i4) {
        int i5 = this.f248599c;
        if (i < 0) {
            int i6 = this.f248598b;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.f248601e)[(i * i5) + i2] = (byte) ((((CharSequence) this.f248600d).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    /* JADX INFO: renamed from: z */
    public int m87386z(int i) {
        m87361d(i);
        int iFollowing = ((BreakIterator) this.f248601e).following(i);
        return (m87382u(iFollowing + (-1)) && m87382u(iFollowing) && !m87381t(iFollowing)) ? m87386z(iFollowing) : iFollowing;
    }

    public w780(byte[] bArr, int i) {
        this.f248597a = 13;
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(s571.m77247f(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
        }
        this.f248601e = bArr;
        this.f248599c = 0;
        this.f248598b = i;
    }

    public w780(ConstraintLayout constraintLayout) {
        this.f248597a = 0;
        this.f248600d = constraintLayout;
        constraintLayout.getResources().getDimensionPixelSize(R.dimen.library_chip_horizontal_margin);
        constraintLayout.getResources().getDimensionPixelSize(R.dimen.library_chip_horizontal_reduced_margin);
        this.f248598b = constraintLayout.getResources().getDimensionPixelSize(R.dimen.library_clear_chips_button_size);
        constraintLayout.getResources().getDimensionPixelSize(R.dimen.library_chip_min_height);
        this.f248601e = new mcu(constraintLayout);
        new LinkedHashMap();
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.library_chips_row_padding_start);
        WeakHashMap weakHashMap = mec1.f142677a;
        this.f248599c = constraintLayout.getPaddingStart() != dimensionPixelSize ? dimensionPixelSize : 0;
    }

    public w780(CharSequence charSequence, int i, Locale locale) {
        this.f248597a = 12;
        this.f248600d = charSequence;
        if (charSequence.length() < 0) {
            nt40.m65597a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            nt40.m65597a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f248601e = wordInstance;
        this.f248598b = Math.max(0, -50);
        this.f248599c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new iuc(i, charSequence));
    }

    public w780(String str, int i, int i2) {
        this.f248597a = 4;
        this.f248600d = str;
        this.f248599c = i;
        this.f248598b = i2;
        byte[] bArr = new byte[i * i2];
        this.f248601e = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public w780(int i, byte b) {
        this.f248597a = i;
        switch (i) {
            case 10:
                this.f248600d = new long[10];
                this.f248601e = new Object[10];
                break;
            default:
                this.f248600d = new xyx(17);
                this.f248598b = 8000;
                this.f248599c = 8000;
                break;
        }
    }

    public w780(OutputStream outputStream, byte[] bArr) {
        this.f248597a = 2;
        this.f248601e = outputStream;
        this.f248600d = bArr;
        this.f248599c = 0;
        this.f248598b = bArr.length;
    }

    public w780(TextPaint textPaint) {
        this.f248597a = 6;
        this.f248600d = textPaint;
        this.f248598b = 1;
        this.f248599c = 1;
        this.f248601e = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public w780(int i, int i2, juk jukVar, fiz fizVar) {
        this.f248597a = 9;
        this.f248600d = fizVar;
        this.f248598b = i;
        this.f248599c = i2;
        this.f248601e = jukVar;
    }

    public w780(int i, int i2, float[] fArr, float[] fArr2) {
        this.f248597a = 7;
        this.f248598b = i;
        c95.m31843i(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f248600d = fArr;
        this.f248601e = fArr2;
        this.f248599c = i2;
    }

    public w780(w780 w780Var) {
        this.f248597a = 8;
        float[] fArr = (float[]) w780Var.f248600d;
        this.f248598b = fArr.length / 3;
        this.f248600d = mjx0.m62038p(fArr);
        this.f248601e = mjx0.m62038p((float[]) w780Var.f248601e);
        int i = w780Var.f248599c;
        if (i == 1) {
            this.f248599c = 5;
        } else if (i != 2) {
            this.f248599c = 4;
        } else {
            this.f248599c = 6;
        }
    }

    public w780(int i) {
        this.f248597a = 1;
        this.f248600d = new gf81[i];
        this.f248599c = 0;
    }
}
