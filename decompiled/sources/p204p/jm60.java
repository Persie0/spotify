package p204p;

import java.io.EOFException;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public final class jm60 extends yl60 {

    /* JADX INFO: renamed from: L0 */
    public static final iva f113769L0;

    /* JADX INFO: renamed from: Y */
    public static final iva f113770Y;

    /* JADX INFO: renamed from: Z */
    public static final iva f113771Z;

    /* JADX INFO: renamed from: X */
    public String f113772X;

    /* JADX INFO: renamed from: f */
    public final vuu0 f113773f;

    /* JADX INFO: renamed from: g */
    public final npa f113774g;

    /* JADX INFO: renamed from: h */
    public int f113775h;

    /* JADX INFO: renamed from: i */
    public long f113776i;

    /* JADX INFO: renamed from: t */
    public int f113777t;

    static {
        iva ivaVar = new iva(kk40.m56679u("'\\"));
        ivaVar.f106180c = "'\\";
        f113770Y = ivaVar;
        iva ivaVar2 = new iva(kk40.m56679u("\"\\"));
        ivaVar2.f106180c = "\"\\";
        f113771Z = ivaVar2;
        iva ivaVar3 = new iva(kk40.m56679u("{}[]:, \n\t\r\f/\\;#="));
        ivaVar3.f106180c = "{}[]:, \n\t\r\f/\\;#=";
        f113769L0 = ivaVar3;
        kk40.m56679u("\n\r");
        kk40.m56679u("*/");
    }

    public jm60(vuu0 vuu0Var) {
        this.f273922b = new int[32];
        this.f273923c = new String[32];
        this.f273924d = new int[32];
        this.f113775h = 0;
        this.f113773f = vuu0Var;
        this.f113774g = vuu0Var.f245080b;
        m94154r(6);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0200  */
    /* JADX WARN: Code duplicated, block: B:230:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX INFO: renamed from: B */
    public final int m53750B() throws el60, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cM65309h;
        char c;
        int i2;
        int i3;
        int i4;
        byte bM65309h;
        char c2;
        int[] iArr = this.f273922b;
        int i5 = this.f273921a - 1;
        int i6 = iArr[i5];
        npa npaVar = this.f113774g;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM53754J = m53754J(true);
            npaVar.readByte();
            if (iM53754J != 44) {
                if (iM53754J == 59) {
                    m53772z();
                    throw null;
                }
                if (iM53754J == 93) {
                    this.f113775h = 4;
                    return 4;
                }
                m94155y("Unterminated array");
                throw null;
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int iM53754J2 = m53754J(true);
                    npaVar.readByte();
                    if (iM53754J2 != 44) {
                        if (iM53754J2 == 59) {
                            m53772z();
                            throw null;
                        }
                        if (iM53754J2 == 125) {
                            this.f113775h = 2;
                            return 2;
                        }
                        m94155y("Unterminated object");
                        throw null;
                    }
                }
                int iM53754J3 = m53754J(true);
                if (iM53754J3 == 34) {
                    npaVar.readByte();
                    this.f113775h = 13;
                    return 13;
                }
                if (iM53754J3 == 39) {
                    npaVar.readByte();
                    m53772z();
                    throw null;
                }
                if (iM53754J3 != 125) {
                    m53772z();
                    throw null;
                }
                if (i6 == 5) {
                    m94155y("Expected name");
                    throw null;
                }
                npaVar.readByte();
                this.f113775h = 2;
                return 2;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM53754J4 = m53754J(true);
                npaVar.readByte();
                if (iM53754J4 != 58) {
                    if (iM53754J4 != 61) {
                        m94155y("Expected ':'");
                        throw null;
                    }
                    m53772z();
                    throw null;
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else {
                if (i6 == 7) {
                    if (m53754J(false) == -1) {
                        this.f113775h = 18;
                        return 18;
                    }
                    m53772z();
                    throw null;
                }
                if (i6 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM53754J5 = m53754J(true);
        if (iM53754J5 == 34) {
            npaVar.readByte();
            this.f113775h = 9;
            return 9;
        }
        if (iM53754J5 == 39) {
            m53772z();
            throw null;
        }
        if (iM53754J5 != 44 && iM53754J5 != 59) {
            if (iM53754J5 == 91) {
                npaVar.readByte();
                this.f113775h = 3;
                return 3;
            }
            if (iM53754J5 != 93) {
                if (iM53754J5 == 123) {
                    npaVar.readByte();
                    this.f113775h = 1;
                    return 1;
                }
                byte bM65309h2 = npaVar.m65309h(0L);
                vuu0 vuu0Var = this.f113773f;
                if (bM65309h2 == 116 || bM65309h2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bM65309h2 != 102 && bM65309h2 != 70) {
                        if (bM65309h2 == 110 || bM65309h2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        boolean z = true;
                        long j2 = j;
                        c = 0;
                        i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            i3 = i2 + 1;
                            if (vuu0Var.request(i3)) {
                                bM65309h = npaVar.m65309h(i2);
                                if (bM65309h != 43) {
                                    if (bM65309h != 69 || bM65309h == 101) {
                                        c2 = 6;
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else if (bM65309h == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            c = 1;
                                            z2 = true;
                                        } else {
                                            if (c != 5) {
                                                i4 = 0;
                                            }
                                            c = c2;
                                        }
                                        i2 = i3;
                                    } else if (bM65309h != 46) {
                                        if (bM65309h >= 48 && bM65309h <= 57) {
                                            if (c == 1 || c == 0) {
                                                c2 = 6;
                                                j2 = -(bM65309h + MessagePack.Code.INT8);
                                                c = 2;
                                            } else {
                                                if (c == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bM65309h + MessagePack.Code.INT8));
                                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                        j2 = j3;
                                                    }
                                                } else if (c == 3) {
                                                    c = 4;
                                                } else {
                                                    c2 = 6;
                                                    if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                }
                                                c2 = 6;
                                                i2 = i3;
                                            }
                                            i2 = i3;
                                        } else if (!m53752G(bM65309h)) {
                                        }
                                        i4 = 0;
                                    } else {
                                        c2 = 6;
                                        if (c == 2) {
                                            c = 3;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (m53752G(npaVar.m65309h(j))) {
                                        m53772z();
                                        throw null;
                                    }
                                    m94155y("Expected value");
                                    throw null;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (m53752G(npaVar.m65309h(j))) {
                                        m94155y("Expected value");
                                        throw null;
                                    }
                                    m53772z();
                                    throw null;
                                }
                                c = c2;
                                i2 = i3;
                            }
                            if (c != 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != j || !z2))) {
                                if (!z2) {
                                    j2 = -j2;
                                }
                                this.f113776i = j2;
                                npaVar.skip(i2);
                                i4 = 16;
                                this.f113775h = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.f113777t = i2;
                                i4 = 17;
                                this.f113775h = 17;
                            } else {
                                i4 = 0;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m53752G(npaVar.m65309h(j))) {
                                m94155y("Expected value");
                                throw null;
                            }
                            m53772z();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i7 = 1;
                while (true) {
                    if (i7 >= length) {
                        if (!vuu0Var.request(length + 1) || !m53752G(npaVar.m65309h(length))) {
                            npaVar.skip(length);
                            this.f113775h = i;
                            break;
                        }
                    } else {
                        int i8 = i7 + 1;
                        if (vuu0Var.request(i8) && ((cM65309h = npaVar.m65309h(i7)) == str2.charAt(i7) || cM65309h == str.charAt(i7))) {
                            i7 = i8;
                        }
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                boolean z3 = true;
                long j4 = j;
                c = 0;
                i2 = 0;
                boolean z4 = false;
                while (true) {
                    i3 = i2 + 1;
                    if (vuu0Var.request(i3)) {
                        bM65309h = npaVar.m65309h(i2);
                        if (bM65309h != 43) {
                            if (bM65309h != 69) {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            } else {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m53752G(npaVar.m65309h(j))) {
                                m94155y("Expected value");
                                throw null;
                            }
                            m53772z();
                            throw null;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i4 = 0;
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m53752G(npaVar.m65309h(j))) {
                                m94155y("Expected value");
                                throw null;
                            }
                            m53772z();
                            throw null;
                        }
                        c = c2;
                        i2 = i3;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.f113777t = i2;
                        i4 = 17;
                        this.f113775h = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.f113777t = i2;
                        i4 = 17;
                        this.f113775h = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (m53752G(npaVar.m65309h(j))) {
                        m94155y("Expected value");
                        throw null;
                    }
                    m53772z();
                    throw null;
                }
            }
            if (i6 == 1) {
                npaVar.readByte();
                this.f113775h = 4;
                return 4;
            }
        }
        if (i6 == 1 || i6 == 2) {
            m53772z();
            throw null;
        }
        m94155y("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public final int m53751D(String str, po10 po10Var) {
        int length = ((String[]) po10Var.f179559b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) po10Var.f179559b)[i])) {
                this.f113775h = 0;
                this.f273923c[this.f273921a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m53752G(int i) throws el60 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m53772z();
        throw null;
    }

    /* JADX INFO: renamed from: I */
    public final String m53753I() {
        String strM53755K;
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 14) {
            strM53755K = m53756L();
        } else if (iM53750B == 13) {
            strM53755K = m53755K(f113771Z);
        } else if (iM53750B == 12) {
            strM53755K = m53755K(f113770Y);
        } else {
            if (iM53750B != 15) {
                throw new scf("Expected a name but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
            }
            strM53755K = this.f113772X;
        }
        this.f113775h = 0;
        this.f273923c[this.f273921a - 1] = strM53755K;
        return strM53755K;
    }

    /* JADX INFO: renamed from: J */
    public final int m53754J(boolean z) throws el60, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            vuu0 vuu0Var = this.f113773f;
            if (!vuu0Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            npa npaVar = this.f113774g;
            byte bM65309h = npaVar.m65309h(j);
            if (bM65309h != 10 && bM65309h != 32 && bM65309h != 13 && bM65309h != 9) {
                npaVar.skip(j);
                if (bM65309h == 47) {
                    if (vuu0Var.request(2L)) {
                        m53772z();
                        throw null;
                    }
                } else if (bM65309h == 35) {
                    m53772z();
                    throw null;
                }
                return bM65309h;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: K */
    public final String m53755K(iva ivaVar) throws el60, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jMo45424o0 = this.f113773f.mo45424o0(ivaVar);
            if (jMo45424o0 == -1) {
                m94155y("Unterminated string");
                throw null;
            }
            npa npaVar = this.f113774g;
            if (npaVar.m65309h(jMo45424o0) != 92) {
                if (sb == null) {
                    String strM65317z = npaVar.m65317z(jMo45424o0, vuc.f244913a);
                    npaVar.readByte();
                    return strM65317z;
                }
                sb.append(npaVar.m65317z(jMo45424o0, vuc.f244913a));
                npaVar.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(npaVar.m65317z(jMo45424o0, vuc.f244913a));
            npaVar.readByte();
            sb.append(m53757M());
        }
    }

    /* JADX INFO: renamed from: L */
    public final String m53756L() {
        long jMo45424o0 = this.f113773f.mo45424o0(f113769L0);
        npa npaVar = this.f113774g;
        if (jMo45424o0 == -1) {
            return npaVar.mo45428s1();
        }
        npaVar.getClass();
        return npaVar.m65317z(jMo45424o0, vuc.f244913a);
    }

    /* JADX INFO: renamed from: M */
    public final char m53757M() throws el60, EOFException {
        int i;
        vuu0 vuu0Var = this.f113773f;
        if (!vuu0Var.request(1L)) {
            m94155y("Unterminated escape sequence");
            throw null;
        }
        npa npaVar = this.f113774g;
        byte b = npaVar.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m94155y("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!vuu0Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m94153g());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bM65309h = npaVar.m65309h(i2);
            char c2 = (char) (c << 4);
            if (bM65309h >= 48 && bM65309h <= 57) {
                i = bM65309h + MessagePack.Code.INT8;
            } else if (bM65309h >= 97 && bM65309h <= 102) {
                i = bM65309h - 87;
            } else {
                if (bM65309h < 65 || bM65309h > 70) {
                    m94155y("\\u".concat(npaVar.m65317z(4L, vuc.f244913a)));
                    throw null;
                }
                i = bM65309h + MessagePack.Code.EXT32;
            }
            c = (char) (i + c2);
        }
        npaVar.skip(4L);
        return c;
    }

    /* JADX INFO: renamed from: N */
    public final void m53758N(iva ivaVar) throws el60, EOFException {
        while (true) {
            long jMo45424o0 = this.f113773f.mo45424o0(ivaVar);
            if (jMo45424o0 == -1) {
                m94155y("Unterminated string");
                throw null;
            }
            npa npaVar = this.f113774g;
            if (npaVar.m65309h(jMo45424o0) != 92) {
                npaVar.skip(jMo45424o0 + 1);
                return;
            } else {
                npaVar.skip(jMo45424o0 + 1);
                m53757M();
            }
        }
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: a */
    public final void mo53759a() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 3) {
            m94154r(1);
            this.f273924d[this.f273921a - 1] = 0;
            this.f113775h = 0;
        } else {
            throw new scf("Expected BEGIN_ARRAY but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: c */
    public final void mo53760c() {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 1) {
            m94154r(3);
            this.f113775h = 0;
        } else {
            throw new scf("Expected BEGIN_OBJECT but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f113775h = 0;
        this.f273922b[0] = 8;
        this.f273921a = 1;
        this.f113774g.m65306c();
        this.f113773f.close();
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: e */
    public final void mo53761e() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B != 4) {
            throw new scf("Expected END_ARRAY but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
        int i = this.f273921a;
        this.f273921a = i - 1;
        int[] iArr = this.f273924d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f113775h = 0;
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: f */
    public final void mo53762f() {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B != 2) {
            throw new scf("Expected END_OBJECT but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
        int i = this.f273921a;
        int i2 = i - 1;
        this.f273921a = i2;
        this.f273923c[i2] = null;
        int[] iArr = this.f273924d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f113775h = 0;
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: h */
    public final boolean mo53763h() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        return (iM53750B == 2 || iM53750B == 4 || iM53750B == 18) ? false : true;
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: i */
    public final boolean mo53764i() {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 5) {
            this.f113775h = 0;
            int[] iArr = this.f273924d;
            int i = this.f273921a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM53750B == 6) {
            this.f113775h = 0;
            int[] iArr2 = this.f273924d;
            int i2 = this.f273921a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new scf("Expected a boolean but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: k */
    public final double mo53765k() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 16) {
            this.f113775h = 0;
            int[] iArr = this.f273924d;
            int i = this.f273921a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f113776i;
        }
        if (iM53750B == 17) {
            long j = this.f113777t;
            npa npaVar = this.f113774g;
            npaVar.getClass();
            this.f113772X = npaVar.m65317z(j, vuc.f244913a);
        } else if (iM53750B == 9) {
            this.f113772X = m53755K(f113771Z);
        } else if (iM53750B == 8) {
            this.f113772X = m53755K(f113770Y);
        } else if (iM53750B == 10) {
            this.f113772X = m53756L();
        } else if (iM53750B != 11) {
            throw new scf("Expected a double but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
        this.f113775h = 11;
        try {
            double d = Double.parseDouble(this.f113772X);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new el60("JSON forbids NaN and infinities: " + d + " at path " + m94153g());
            }
            this.f113772X = null;
            this.f113775h = 0;
            int[] iArr2 = this.f273924d;
            int i2 = this.f273921a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new scf("Expected a double but was " + this.f113772X + " at path " + m94153g());
        }
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: n */
    public final int mo53766n() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 16) {
            long j = this.f113776i;
            int i = (int) j;
            if (j == i) {
                this.f113775h = 0;
                int[] iArr = this.f273924d;
                int i2 = this.f273921a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new scf("Expected an int but was " + this.f113776i + " at path " + m94153g());
        }
        if (iM53750B == 17) {
            long j2 = this.f113777t;
            npa npaVar = this.f113774g;
            npaVar.getClass();
            this.f113772X = npaVar.m65317z(j2, vuc.f244913a);
        } else if (iM53750B == 9 || iM53750B == 8) {
            String strM53755K = iM53750B == 9 ? m53755K(f113771Z) : m53755K(f113770Y);
            this.f113772X = strM53755K;
            try {
                int i3 = Integer.parseInt(strM53755K);
                this.f113775h = 0;
                int[] iArr2 = this.f273924d;
                int i4 = this.f273921a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM53750B != 11) {
            throw new scf("Expected an int but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
        this.f113775h = 11;
        try {
            double d = Double.parseDouble(this.f113772X);
            int i5 = (int) d;
            if (i5 != d) {
                throw new scf("Expected an int but was " + this.f113772X + " at path " + m94153g());
            }
            this.f113772X = null;
            this.f113775h = 0;
            int[] iArr3 = this.f273924d;
            int i6 = this.f273921a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new scf("Expected an int but was " + this.f113772X + " at path " + m94153g());
        }
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: o */
    public final String mo53767o() {
        String strM65317z;
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 10) {
            strM65317z = m53756L();
        } else if (iM53750B == 9) {
            strM65317z = m53755K(f113771Z);
        } else if (iM53750B == 8) {
            strM65317z = m53755K(f113770Y);
        } else if (iM53750B == 11) {
            strM65317z = this.f113772X;
            this.f113772X = null;
        } else if (iM53750B == 16) {
            strM65317z = Long.toString(this.f113776i);
        } else {
            if (iM53750B != 17) {
                throw new scf("Expected a string but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
            }
            long j = this.f113777t;
            npa npaVar = this.f113774g;
            npaVar.getClass();
            strM65317z = npaVar.m65317z(j, vuc.f244913a);
        }
        this.f113775h = 0;
        int[] iArr = this.f273924d;
        int i = this.f273921a - 1;
        iArr[i] = iArr[i] + 1;
        return strM65317z;
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: p */
    public final int mo53768p() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        switch (iM53750B) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: s */
    public final int mo53769s(po10 po10Var) throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B < 12 || iM53750B > 15) {
            return -1;
        }
        if (iM53750B == 15) {
            return m53751D(this.f113772X, po10Var);
        }
        int iMo45415H0 = this.f113773f.mo45415H0((hvl0) po10Var.f179560c);
        if (iMo45415H0 != -1) {
            this.f113775h = 0;
            this.f273923c[this.f273921a - 1] = ((String[]) po10Var.f179559b)[iMo45415H0];
            return iMo45415H0;
        }
        String str = this.f273923c[this.f273921a - 1];
        String strM53753I = m53753I();
        int iM53751D = m53751D(strM53753I, po10Var);
        if (iM53751D == -1) {
            this.f113775h = 15;
            this.f113772X = strM53753I;
            this.f273923c[this.f273921a - 1] = str;
        }
        return iM53751D;
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: t */
    public final void mo53770t() throws el60, EOFException {
        int iM53750B = this.f113775h;
        if (iM53750B == 0) {
            iM53750B = m53750B();
        }
        if (iM53750B == 14) {
            long jMo45424o0 = this.f113773f.mo45424o0(f113769L0);
            npa npaVar = this.f113774g;
            if (jMo45424o0 == -1) {
                jMo45424o0 = npaVar.f156904b;
            }
            npaVar.skip(jMo45424o0);
        } else if (iM53750B == 13) {
            m53758N(f113771Z);
        } else if (iM53750B == 12) {
            m53758N(f113770Y);
        } else if (iM53750B != 15) {
            throw new scf("Expected a name but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
        }
        this.f113775h = 0;
        this.f273923c[this.f273921a - 1] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f113773f + ")";
    }

    @Override // p204p.yl60
    /* JADX INFO: renamed from: x */
    public final void mo53771x() {
        int i = 0;
        do {
            int iM53750B = this.f113775h;
            if (iM53750B == 0) {
                iM53750B = m53750B();
            }
            if (iM53750B == 3) {
                m94154r(1);
            } else {
                if (iM53750B == 1) {
                    m94154r(3);
                } else if (iM53750B == 4) {
                    i--;
                    if (i < 0) {
                        throw new scf("Expected a value but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
                    }
                    this.f273921a--;
                } else if (iM53750B == 2) {
                    i--;
                    if (i < 0) {
                        throw new scf("Expected a value but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
                    }
                    this.f273921a--;
                } else {
                    npa npaVar = this.f113774g;
                    if (iM53750B == 14 || iM53750B == 10) {
                        long jMo45424o0 = this.f113773f.mo45424o0(f113769L0);
                        if (jMo45424o0 == -1) {
                            jMo45424o0 = npaVar.f156904b;
                        }
                        npaVar.skip(jMo45424o0);
                    } else if (iM53750B == 9 || iM53750B == 13) {
                        m53758N(f113771Z);
                    } else if (iM53750B == 8 || iM53750B == 12) {
                        m53758N(f113770Y);
                    } else if (iM53750B == 17) {
                        npaVar.skip(this.f113777t);
                    } else if (iM53750B == 18) {
                        throw new scf("Expected a value but was " + klh.m56827C(mo53768p()) + " at path " + m94153g());
                    }
                }
                this.f113775h = 0;
            }
            i++;
            this.f113775h = 0;
        } while (i != 0);
        int[] iArr = this.f273924d;
        int i2 = this.f273921a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f273923c[i2] = "null";
    }

    /* JADX INFO: renamed from: z */
    public final void m53772z() throws el60 {
        m94155y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
