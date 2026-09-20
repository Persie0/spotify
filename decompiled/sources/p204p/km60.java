package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class km60 extends rm60 {

    /* JADX INFO: renamed from: Z */
    private static final String[] f124060Z = new String[128];

    /* JADX INFO: renamed from: X */
    private String f124061X = ":";

    /* JADX INFO: renamed from: Y */
    private String f124062Y;

    /* JADX INFO: renamed from: t */
    private final fqa f124063t;

    /* JADX INFO: renamed from: p.km60$a */
    /* JADX INFO: loaded from: classes11.dex */
    public class C2058a implements ai21 {
        public C2058a() {
        }

        @Override // p204p.ai21
        /* JADX INFO: renamed from: U0 */
        public void mo25160U0(npa npaVar, long j) {
            km60.this.f124063t.mo25160U0(npaVar, j);
        }

        @Override // p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (km60.this.m75914y() != 9) {
                throw new AssertionError();
            }
            km60 km60Var = km60.this;
            int i = km60Var.f200455a;
            km60Var.f200455a = i - 1;
            int[] iArr = km60Var.f200458d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
        }

        @Override // p204p.ai21, java.io.Flushable
        public void flush() {
            km60.this.f124063t.flush();
        }

        @Override // p204p.ai21
        /* JADX INFO: renamed from: m */
        public au71 mo25161m() {
            return au71.f19881d;
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f124060Z[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f124060Z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public km60(fqa fqaVar) {
        if (fqaVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f124063t = fqaVar;
        m75902B(6);
    }

    /* JADX INFO: renamed from: V */
    private void m56876V() {
        int iM75914y = m75914y();
        if (iM75914y == 5) {
            this.f124063t.writeByte(44);
        } else if (iM75914y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m56879e0();
        m75903D(4);
    }

    /* JADX INFO: renamed from: X */
    private void m56877X() {
        int iM75914y = m75914y();
        int i = 2;
        if (iM75914y == 1) {
            m56879e0();
        } else if (iM75914y == 2) {
            this.f124063t.writeByte(44);
            m56879e0();
        } else if (iM75914y == 4) {
            this.f124063t.mo42406b0(this.f124061X);
            i = 5;
        } else {
            if (iM75914y == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i = 7;
            if (iM75914y != 6) {
                if (iM75914y != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f200460f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        m75903D(i);
    }

    /* JADX INFO: renamed from: c0 */
    private rm60 m56878c0(int i, int i2, char c) {
        int iM75914y = m75914y();
        if (iM75914y != i2 && iM75914y != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f124062Y != null) {
            throw new IllegalStateException("Dangling name: " + this.f124062Y);
        }
        int i3 = this.f200455a;
        int i4 = ~this.f200463i;
        if (i3 == i4) {
            this.f200463i = i4;
            return this;
        }
        int i5 = i3 - 1;
        this.f200455a = i5;
        this.f200457c[i5] = null;
        int[] iArr = this.f200458d;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (iM75914y == i2) {
            m56879e0();
        }
        this.f124063t.writeByte(c);
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    private void m56879e0() {
        if (this.f200459e == null) {
            return;
        }
        this.f124063t.writeByte(10);
        int i = this.f200455a;
        for (int i2 = 1; i2 < i; i2++) {
            this.f124063t.mo42406b0(this.f200459e);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private rm60 m56880g0(int i, int i2, char c) {
        int i3;
        int i4 = this.f200455a;
        int i5 = this.f200463i;
        if (i4 == i5 && ((i3 = this.f200456b[i4 - 1]) == i || i3 == i2)) {
            this.f200463i = ~i5;
            return this;
        }
        m56877X();
        m75907f();
        m75902B(i);
        this.f200458d[this.f200455a - 1] = 0;
        this.f124063t.writeByte(c);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: h0 */
    public static void m56881h0(fqa fqaVar, String str) {
        String str2;
        String[] strArr = f124060Z;
        fqaVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        fqaVar.mo42407j1(i, i2, str);
                    }
                    fqaVar.mo42406b0(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    fqaVar.mo42407j1(i, i2, str);
                }
                fqaVar.mo42406b0(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            fqaVar.mo42407j1(i, length, str);
        }
        fqaVar.writeByte(34);
    }

    /* JADX INFO: renamed from: i0 */
    private void m56882i0() {
        if (this.f124062Y != null) {
            m56876V();
            m56881h0(this.f124063t, this.f124062Y);
            this.f124062Y = null;
        }
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: G */
    public void mo56883G(String str) {
        super.mo56883G(str);
        this.f124061X = !str.isEmpty() ? ": " : ":";
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: K */
    public rm60 mo56884K(double d) {
        if (!this.f200460f && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(Double.toString(d));
        }
        m56882i0();
        m56877X();
        this.f124063t.mo42406b0(Double.toString(d));
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: L */
    public rm60 mo56885L(long j) {
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(Long.toString(j));
        }
        m56882i0();
        m56877X();
        this.f124063t.mo42406b0(Long.toString(j));
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: M */
    public rm60 mo56886M(Number number) {
        if (number == null) {
            return mo56895t();
        }
        String string = number.toString();
        if (!this.f200460f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(string);
        }
        m56882i0();
        m56877X();
        this.f124063t.mo42406b0(string);
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: N */
    public rm60 mo56887N(String str) {
        if (str == null) {
            return mo56895t();
        }
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(str);
        }
        m56882i0();
        m56877X();
        m56881h0(this.f124063t, str);
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: P */
    public rm60 mo56888P(boolean z) {
        if (this.f200462h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m75910n());
        }
        m56882i0();
        m56877X();
        this.f124063t.mo42406b0(z ? "true" : "false");
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: Q */
    public fqa mo56889Q() {
        if (this.f200462h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + m75910n());
        }
        m56882i0();
        m56877X();
        m75902B(9);
        return kif1.m56499h(new C2058a());
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: a */
    public rm60 mo56890a() {
        if (!this.f200462h) {
            m56882i0();
            return m56880g0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m75910n());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f124063t.close();
        int i = this.f200455a;
        if (i > 1 || (i == 1 && this.f200456b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f200455a = 0;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: e */
    public rm60 mo56891e() {
        if (!this.f200462h) {
            m56882i0();
            return m56880g0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m75910n());
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f200455a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f124063t.flush();
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: g */
    public rm60 mo56892g() {
        return m56878c0(1, 2, ']');
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: i */
    public rm60 mo56893i() {
        this.f200462h = false;
        return m56878c0(3, 5, '}');
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: s */
    public rm60 mo56894s(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f200455a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iM75914y = m75914y();
        if ((iM75914y != 3 && iM75914y != 5) || this.f124062Y != null || this.f200462h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f124062Y = str;
        this.f200457c[this.f200455a - 1] = str;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: t */
    public rm60 mo56895t() {
        if (this.f200462h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m75910n());
        }
        if (this.f124062Y != null) {
            if (!this.f200461g) {
                this.f124062Y = null;
                return this;
            }
            m56882i0();
        }
        m56877X();
        this.f124063t.mo42406b0("null");
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
