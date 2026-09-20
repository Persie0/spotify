package p204p;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: renamed from: p.f7 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1850f7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66520a;

    /* JADX INFO: renamed from: b */
    public int f66521b;

    /* JADX INFO: renamed from: c */
    public final Object f66522c;

    /* JADX INFO: renamed from: d */
    public final Object f66523d;

    /* JADX INFO: renamed from: e */
    public Object f66524e;

    /* JADX INFO: renamed from: f */
    public Object f66525f;

    public AbstractC1850f7(qk60 qk60Var) {
        this.f66520a = 0;
        this.f66522c = qk60Var;
        this.f66523d = new yvz0(qk60Var);
        this.f66525f = new StringBuilder();
    }

    /* JADX INFO: renamed from: A */
    public static boolean m40896A(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m40898a(il51 il51Var) {
        return il51Var.f103293g;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m40899w(AbstractC1850f7 abstractC1850f7, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC1850f7.f66521b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        abstractC1850f7.m40929v(i, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public abstract String mo40900B(String str, boolean z);

    /* JADX INFO: renamed from: C */
    public byte m40901C() {
        CharSequence charSequenceMo40932z = mo40932z();
        int i = this.f66521b;
        while (true) {
            int iMo40903E = mo40903E(i);
            if (iMo40903E == -1) {
                this.f66521b = iMo40903E;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo40932z.charAt(iMo40903E);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f66521b = iMo40903E;
                return kjg1.m56587j(cCharAt);
            }
            i = iMo40903E + 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public String m40902D(boolean z) {
        String strM40922o;
        byte bM40901C = m40901C();
        if (z) {
            if (bM40901C != 1 && bM40901C != 0) {
                return null;
            }
            strM40922o = m40924q();
        } else {
            if (bM40901C != 1) {
                return null;
            }
            strM40922o = m40922o();
        }
        this.f66524e = strM40922o;
        return strM40922o;
    }

    /* JADX INFO: renamed from: E */
    public abstract int mo40903E(int i);

    /* JADX INFO: renamed from: F */
    public void m40904F(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte bM40901C = m40901C();
        if (bM40901C != 8 && bM40901C != 6) {
            m40924q();
            return;
        }
        while (true) {
            byte bM40901C2 = m40901C();
            if (bM40901C2 != 1) {
                if (bM40901C2 == 8 || bM40901C2 == 6) {
                    arrayList.add(Byte.valueOf(bM40901C2));
                } else if (bM40901C2 == 9) {
                    if (((Number) g6f.m43687A0(arrayList)).byteValue() != 8) {
                        m40899w(this, "found ] instead of }", 0, null, 6);
                        throw null;
                    }
                    j6f.m52570b0(arrayList);
                } else if (bM40901C2 == 7) {
                    if (((Number) g6f.m43687A0(arrayList)).byteValue() != 6) {
                        m40899w(this, "found } instead of ]", 0, null, 6);
                        throw null;
                    }
                    j6f.m52570b0(arrayList);
                } else if (bM40901C2 == 10) {
                    m40899w(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                    throw null;
                }
                mo40917i();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                m40924q();
            } else {
                mo40916h();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract int mo40905G();

    /* JADX INFO: renamed from: H */
    public String mo40906H(int i, int i2) {
        return mo40932z().subSequence(i, i2).toString();
    }

    /* JADX INFO: renamed from: I */
    public boolean m40907I() {
        int iMo40905G = mo40905G();
        CharSequence charSequenceMo40932z = mo40932z();
        if (iMo40905G >= charSequenceMo40932z.length() || iMo40905G == -1 || charSequenceMo40932z.charAt(iMo40905G) != ',') {
            return false;
        }
        this.f66521b++;
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m40908J(boolean z) {
        int iMo40903E = mo40903E(mo40905G());
        int length = mo40932z().length() - iMo40903E;
        if (length >= 4 && iMo40903E != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == mo40932z().charAt(iMo40903E + i)) {
                }
            }
            if (length <= 4 || kjg1.m56587j(mo40932z().charAt(iMo40903E + 4)) != 0) {
                if (z) {
                    this.f66521b = iMo40903E + 4;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void m40909L(char c) {
        int i = this.f66521b;
        if (i > 0 && c == '\"') {
            try {
                this.f66521b = i - 1;
                String strM40924q = m40924q();
                this.f66521b = i;
                if (wj50.m88271j(strM40924q, "null")) {
                    m40929v(this.f66521b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f66521b = i;
                throw th;
            }
        }
        String strM56595r = kjg1.m56595r(kjg1.m56587j(c));
        int i2 = this.f66521b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m40899w(this, dq60.m36615o("Expected ", strM56595r, ", but had '", (i2 == mo40932z().length() || i3 < 0) ? "EOF" : String.valueOf(mo40932z().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void m40910b() {
        this.f66524e = (Map.Entry) this.f66525f;
        Iterator it = (Iterator) this.f66523d;
        this.f66525f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    /* JADX INFO: renamed from: c */
    public int m40911c(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f66525f).append((char) (m40931y(i + 3, charSequence) + (m40931y(i, charSequence) << 12) + (m40931y(i + 1, charSequence) << 8) + (m40931y(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f66521b = i;
        mo40927t();
        if (this.f66521b + 4 < charSequence.length()) {
            return m40911c(this.f66521b, charSequence);
        }
        m40899w(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void mo40912d(int i, int i2) {
        ((StringBuilder) this.f66525f).append(mo40932z(), i, i2);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo40913e();

    /* JADX INFO: renamed from: f */
    public boolean m40914f() {
        boolean z;
        boolean z2;
        int iMo40905G = mo40905G();
        if (iMo40905G == mo40932z().length()) {
            m40899w(this, "EOF", 0, null, 6);
            throw null;
        }
        if (mo40932z().charAt(iMo40905G) == '\"') {
            iMo40905G++;
            z = true;
        } else {
            z = false;
        }
        int iMo40903E = mo40903E(iMo40905G);
        if (iMo40903E >= mo40932z().length() || iMo40903E == -1) {
            m40899w(this, "EOF", 0, null, 6);
            throw null;
        }
        int i = iMo40903E + 1;
        int iCharAt = mo40932z().charAt(iMo40903E) | ' ';
        if (iCharAt == 102) {
            m40915g(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                m40899w(this, "Expected valid boolean literal prefix, but had '" + m40924q() + '\'', 0, null, 6);
                throw null;
            }
            m40915g(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (this.f66521b == mo40932z().length()) {
            m40899w(this, "EOF", 0, null, 6);
            throw null;
        }
        if (mo40932z().charAt(this.f66521b) == '\"') {
            this.f66521b++;
            return z2;
        }
        m40899w(this, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public void m40915g(int i, String str) {
        if (mo40932z().length() - i < str.length()) {
            m40899w(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (mo40932z().charAt(i + i2) | ' ')) {
                m40899w(this, "Expected valid boolean literal prefix, but had '" + m40924q() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f66521b = str.length() + i;
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo40916h();

    public boolean hasNext() {
        return ((Map.Entry) this.f66525f) != null;
    }

    /* JADX INFO: renamed from: i */
    public abstract byte mo40917i();

    /* JADX INFO: renamed from: j */
    public byte m40918j(byte b) {
        byte bMo40917i = mo40917i();
        if (bMo40917i == b) {
            return bMo40917i;
        }
        String strM56595r = kjg1.m56595r(b);
        int i = this.f66521b;
        int i2 = i > 0 ? i - 1 : i;
        m40899w(this, dq60.m36615o("Expected ", strM56595r, ", but had '", (i == mo40932z().length() || i2 < 0) ? "EOF" : String.valueOf(mo40932z().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo40919k(char c);

    /* JADX INFO: renamed from: l */
    public long m40920l() {
        boolean z;
        boolean z2;
        boolean z3;
        double dPow;
        int iMo40903E = mo40903E(mo40905G());
        if (iMo40903E >= mo40932z().length() || iMo40903E == -1) {
            m40899w(this, "EOF", 0, null, 6);
            throw null;
        }
        if (mo40932z().charAt(iMo40903E) == '\"') {
            iMo40903E++;
            if (iMo40903E == mo40932z().length()) {
                m40899w(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iMo40903E;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == mo40932z().length()) {
                z = z;
                z2 = z5;
                z3 = z6;
                break;
            }
            char cCharAt = mo40932z().charAt(i);
            z = z;
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z5;
                if (cCharAt == '-' && z2) {
                    if (i == iMo40903E) {
                        m40899w(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z2) {
                    z3 = z6;
                    if (cCharAt != '-') {
                        if (kjg1.m56587j(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m40899w(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z2) {
                            j = (j * ((long) 10)) + ((long) i3);
                        } else {
                            j2 = (j2 * ((long) 10)) - ((long) i3);
                            if (j2 > 0) {
                                m40899w(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z5 = z2;
                        z6 = z3;
                    } else {
                        if (i != iMo40903E) {
                            m40899w(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z5 = z2;
                        z6 = true;
                    }
                } else {
                    if (i == iMo40903E) {
                        m40899w(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = true;
                }
            } else {
                if (i == iMo40903E) {
                    m40899w(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iMo40903E;
        if (iMo40903E == i || (z3 && iMo40903E == i - 1)) {
            m40899w(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z) {
            if (!z7) {
                m40899w(this, "EOF", 0, null, 6);
                throw null;
            }
            if (mo40932z().charAt(i) != '\"') {
                m40899w(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.f66521b = i;
        if (z2) {
            double d = j2;
            if (!z4) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z4) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m40899w(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m40899w(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z3) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        m40899w(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public long m40921n() {
        long jM40920l = m40920l();
        if (mo40917i() == 10) {
            return jM40920l;
        }
        int i = this.f66521b;
        int i2 = i > 0 ? i - 1 : i;
        String str = ((il51) this).f103293g;
        m40899w(this, s571.m77251j("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public String m40922o() {
        String str = (String) this.f66524e;
        if (str == null) {
            return mo40916h();
        }
        wj50.m88279p(str);
        this.f66524e = null;
        return str;
    }

    /* JADX INFO: renamed from: p */
    public String m40923p(int i, int i2, CharSequence charSequence) {
        String string;
        StringBuilder sb = (StringBuilder) this.f66525f;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                mo40912d(i, i2);
                int iMo40903E = mo40903E(i2 + 1);
                if (iMo40903E == -1) {
                    m40899w(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iM40911c = iMo40903E + 1;
                char cCharAt2 = mo40932z().charAt(iMo40903E);
                if (cCharAt2 == 'u') {
                    iM40911c = m40911c(iM40911c, mo40932z());
                } else {
                    char c = cCharAt2 < 'u' ? stc.f213883a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        m40899w(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = mo40903E(iM40911c);
                if (i == -1) {
                    m40899w(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    mo40912d(i, i2);
                    i = mo40903E(i2);
                    if (i == -1) {
                        m40899w(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            mo40912d(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = mo40906H(i, i2);
        }
        this.f66521b = i2 + 1;
        return string;
    }

    /* JADX INFO: renamed from: q */
    public String m40924q() {
        String strMo40906H;
        StringBuilder sb = (StringBuilder) this.f66525f;
        String str = (String) this.f66524e;
        if (str != null) {
            wj50.m88279p(str);
            this.f66524e = null;
            return str;
        }
        int iMo40905G = mo40905G();
        if (iMo40905G >= mo40932z().length() || iMo40905G == -1) {
            m40899w(this, "EOF", iMo40905G, null, 4);
            throw null;
        }
        byte bM56587j = kjg1.m56587j(mo40932z().charAt(iMo40905G));
        if (bM56587j == 1) {
            return m40922o();
        }
        if (bM56587j != 0) {
            m40899w(this, "Expected beginning of the string, but got " + mo40932z().charAt(iMo40905G), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (kjg1.m56587j(mo40932z().charAt(iMo40905G)) == 0) {
            iMo40905G++;
            if (iMo40905G >= mo40932z().length()) {
                mo40912d(this.f66521b, iMo40905G);
                int iMo40903E = mo40903E(iMo40905G);
                if (iMo40903E == -1) {
                    this.f66521b = iMo40905G;
                    mo40912d(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iMo40905G = iMo40903E;
                z = true;
            }
        }
        if (z) {
            mo40912d(this.f66521b, iMo40905G);
            String string2 = sb.toString();
            sb.setLength(0);
            strMo40906H = string2;
        } else {
            strMo40906H = mo40906H(this.f66521b, iMo40905G);
        }
        this.f66521b = iMo40905G;
        return strMo40906H;
    }

    /* JADX INFO: renamed from: r */
    public String m40925r() {
        String strM40924q = m40924q();
        if (!wj50.m88271j(strM40924q, "null") || mo40932z().charAt(this.f66521b - 1) == '\"') {
            return strM40924q;
        }
        m40899w(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void remove() {
        ib31 ib31Var = (ib31) this.f66522c;
        if (ib31Var.m50117b().m46980e() != this.f66521b) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = (Map.Entry) this.f66524e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        ib31Var.remove(entry.getKey());
        this.f66524e = null;
        this.f66521b = ib31Var.m50117b().m46980e();
    }

    /* JADX INFO: renamed from: s */
    public void m40926s() {
        this.f66524e = null;
    }

    public String toString() {
        switch (this.f66520a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) mo40932z());
                sb.append("', currentPosition=");
                return edb.m38567p(sb, this.f66521b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m40928u() {
        if (mo40917i() == 10) {
            return;
        }
        m40899w(this, "Expected EOF after parsing, but had " + mo40932z().charAt(this.f66521b - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public void m40929v(int i, String str, String str2) {
        throw new JsonDecodingException(fpg1.m42364t(i, str, ((yvz0) this.f66523d).m94759e(), str2, ((qk60) this.f66522c).f189476m ? fpg1.m42367w(i, mo40932z()).toString() : null));
    }

    /* JADX INFO: renamed from: x */
    public void m40930x(String str) {
        m40929v(wl51.m88463M0(mo40906H(0, this.f66521b), str, 0, 6), dq60.m36608h('\'', "Encountered an unknown key '", str), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public int m40931y(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m40899w(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public abstract CharSequence mo40932z();

    public AbstractC1850f7(ib31 ib31Var, Iterator it) {
        this.f66520a = 1;
        this.f66522c = ib31Var;
        this.f66523d = it;
        this.f66521b = ib31Var.m50117b().m46980e();
        m40910b();
    }

    /* JADX INFO: renamed from: t */
    public void mo40927t() {
    }
}
