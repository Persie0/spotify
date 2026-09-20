package p204p;

import androidx.car.app.model.Alert;
import com.google.android.recaptcha.internal.zzagk;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s9f1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final r9f1 f206952b = new r9f1(abf1.f14107a);

    /* JADX INFO: renamed from: a */
    public int f206953a = 0;

    static {
        int i = m9f1.f141300a;
    }

    /* JADX INFO: renamed from: a */
    public static int m77577a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m77578b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        m77577a(i, i4, bArr.length);
        m77577a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static s9f1 m77579p(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(edb.m38563l("length (", i, ") must be >= 1"));
        }
        if (i == 1) {
            return (s9f1) it.next();
        }
        int i2 = i >>> 1;
        s9f1 s9f1VarM77579p = m77579p(it, i2);
        s9f1 s9f1VarM77579p2 = m77579p(it, i - i2);
        if (Alert.DURATION_SHOW_INDEFINITELY - s9f1VarM77579p.mo69377e() < s9f1VarM77579p2.mo69377e()) {
            int iMo69377e = s9f1VarM77579p.mo69377e();
            int iMo69377e2 = s9f1VarM77579p2.mo69377e();
            StringBuilder sb = new StringBuilder(String.valueOf(iMo69377e).length() + 31 + String.valueOf(iMo69377e2).length());
            sb.append("ByteString would be too long: ");
            sb.append(iMo69377e);
            sb.append("+");
            sb.append(iMo69377e2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (s9f1VarM77579p2.mo69377e() == 0) {
            return s9f1VarM77579p;
        }
        if (s9f1VarM77579p.mo69377e() == 0) {
            return s9f1VarM77579p2;
        }
        int iMo69377e3 = s9f1VarM77579p2.mo69377e() + s9f1VarM77579p.mo69377e();
        r9f1 r9f1Var = f206952b;
        if (iMo69377e3 < 128) {
            int iMo69377e4 = s9f1VarM77579p.mo69377e();
            int iMo69377e5 = s9f1VarM77579p2.mo69377e();
            int i3 = iMo69377e4 + iMo69377e5;
            byte[] bArr = new byte[i3];
            m77577a(0, iMo69377e4, s9f1VarM77579p.mo69377e());
            m77577a(0, iMo69377e4, i3);
            if (iMo69377e4 > 0) {
                s9f1VarM77579p.mo69380j(bArr, 0, 0, iMo69377e4);
            }
            m77577a(0, iMo69377e5, s9f1VarM77579p2.mo69377e());
            m77577a(iMo69377e4, i3, i3);
            if (iMo69377e5 > 0) {
                s9f1VarM77579p2.mo69380j(bArr, 0, iMo69377e4, iMo69377e5);
            }
            if (i3 == 0) {
                return r9f1Var;
            }
            try {
                return new r9f1(bArr);
            } catch (zzagk e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (s9f1VarM77579p instanceof ubf1) {
            ubf1 ubf1Var = (ubf1) s9f1VarM77579p;
            s9f1 s9f1Var = ubf1Var.f228743d;
            s9f1 s9f1Var2 = ubf1Var.f228744e;
            if (s9f1VarM77579p2.mo69377e() + s9f1Var2.mo69377e() < 128) {
                int iMo69377e6 = s9f1Var2.mo69377e();
                int iMo69377e7 = s9f1VarM77579p2.mo69377e();
                int i4 = iMo69377e6 + iMo69377e7;
                byte[] bArr2 = new byte[i4];
                m77577a(0, iMo69377e6, s9f1Var2.mo69377e());
                m77577a(0, iMo69377e6, i4);
                if (iMo69377e6 > 0) {
                    s9f1Var2.mo69380j(bArr2, 0, 0, iMo69377e6);
                }
                m77577a(0, iMo69377e7, s9f1VarM77579p2.mo69377e());
                m77577a(iMo69377e6, i4, i4);
                if (iMo69377e7 > 0) {
                    s9f1VarM77579p2.mo69380j(bArr2, 0, iMo69377e6, iMo69377e7);
                }
                if (i4 != 0) {
                    try {
                        r9f1Var = new r9f1(bArr2);
                    } catch (zzagk e2) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                    }
                }
                return new ubf1(s9f1Var, r9f1Var);
            }
            if (s9f1Var.mo72366s() > s9f1Var2.mo72366s() && ubf1Var.f228746g > s9f1VarM77579p2.mo72366s()) {
                return new ubf1(s9f1Var, new ubf1(s9f1Var2, s9f1VarM77579p2));
            }
        }
        if (iMo69377e3 >= ubf1.m82726A(Math.max(s9f1VarM77579p.mo72366s(), s9f1VarM77579p2.mo72366s()) + 1)) {
            return new ubf1(s9f1VarM77579p, s9f1VarM77579p2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        riw0.m75606I(s9f1VarM77579p, arrayDeque);
        riw0.m75606I(s9f1VarM77579p2, arrayDeque);
        s9f1 ubf1Var2 = (s9f1) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            ubf1Var2 = new ubf1((s9f1) arrayDeque.pop(), ubf1Var2);
        }
        return ubf1Var2;
    }

    /* JADX INFO: renamed from: w */
    public static r9f1 m77580w(int i, byte[] bArr, int i2) {
        try {
            return m77581x(i, bArr, i2);
        } catch (zzagk e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: x */
    public static r9f1 m77581x(int i, byte[] bArr, int i2) {
        if (i2 == 0) {
            return f206952b;
        }
        m77577a(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new r9f1(bArr2);
    }

    /* JADX INFO: renamed from: d */
    public abstract byte mo69376d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo69377e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s9f1)) {
            return false;
        }
        s9f1 s9f1Var = (s9f1) obj;
        int iMo69377e = mo69377e();
        if (iMo69377e != s9f1Var.mo69377e()) {
            return false;
        }
        if (iMo69377e == 0) {
            return true;
        }
        int i = this.f206953a;
        int i2 = s9f1Var.f206953a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo69384o(s9f1Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract s9f1 mo69378f(int i, int i2);

    public final int hashCode() {
        int iMo69385q = this.f206953a;
        if (iMo69385q == 0) {
            int iMo69377e = mo69377e();
            iMo69385q = mo69385q(iMo69377e, 0, iMo69377e);
            if (iMo69385q == 0) {
                iMo69385q = 1;
            }
            this.f206953a = iMo69385q;
        }
        return iMo69385q;
    }

    /* JADX INFO: renamed from: i */
    public abstract s9f1 mo69379i(int i, int i2);

    /* JADX INFO: renamed from: j */
    public abstract void mo69380j(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    public abstract ByteBuffer mo69381l();

    /* JADX INFO: renamed from: m */
    public abstract void mo69382m(w780 w780Var);

    /* JADX INFO: renamed from: n */
    public abstract String mo69383n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo69384o(s9f1 s9f1Var);

    /* JADX INFO: renamed from: q */
    public abstract int mo69385q(int i, int i2, int i3);

    /* JADX INFO: renamed from: r */
    public abstract v9f1 mo69386r();

    /* JADX INFO: renamed from: s */
    public abstract int mo72366s();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo72367t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return dq60.m36616p(mo69377e() <= 50 ? mjx0.m62022Z(m77584y()) : mjx0.m62022Z(mo69379i(0, 47).m77584y()).concat("..."), "\">", edb.m38571t(mo69377e(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public o0f1 iterator() {
        return new o9f1(this);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m77583v() {
        return mo69377e() == 0;
    }

    /* JADX INFO: renamed from: y */
    public final byte[] m77584y() {
        int iMo69377e = mo69377e();
        if (iMo69377e == 0) {
            return abf1.f14107a;
        }
        byte[] bArr = new byte[iMo69377e];
        mo69380j(bArr, 0, 0, iMo69377e);
        return bArr;
    }

    /* JADX INFO: renamed from: z */
    public final String m77585z() {
        Charset charset = StandardCharsets.UTF_8;
        return m77583v() ? "" : mo69383n();
    }
}
