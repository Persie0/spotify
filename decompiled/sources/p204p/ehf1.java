package p204p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.DragEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.p002ui.text.font.FontWeight;
import com.comscore.streaming.ContentType;
import com.google.android.gms.internal.play_billing.zzgc;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p000.C1635n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ehf1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f59580a;

    /* JADX INFO: renamed from: A */
    public static int m38927A(int i, byte[] bArr, int i2, int i3, dcg1 dcg1Var, n9f1 n9f1Var) throws zzgc {
        if ((i >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM38931E = m38931E(bArr, i2, n9f1Var);
            dcg1Var.m35655c(i, Long.valueOf(n9f1Var.f151792b));
            return iM38931E;
        }
        if (i4 == 1) {
            dcg1Var.m35655c(i, Long.valueOf(m38934H(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM38928B = m38928B(bArr, i2, n9f1Var);
            int i5 = n9f1Var.f151791a;
            if (i5 < 0) {
                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iM38928B) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                dcg1Var.m35655c(i, rzf1.f204149b);
            } else {
                dcg1Var.m35655c(i, rzf1.m76784m(iM38928B, bArr, i5));
            }
            return iM38928B + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzgc("Protocol message contained an invalid tag (zero).");
            }
            dcg1Var.m35655c(i, Integer.valueOf(m38958x(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        dcg1 dcg1VarM35653b = dcg1.m35653b();
        int i7 = n9f1Var.f151794d + 1;
        n9f1Var.f151794d = i7;
        if (i7 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM38928B2 = m38928B(bArr, i2, n9f1Var);
            int i9 = n9f1Var.f151791a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM38928B2;
                break;
            }
            i2 = m38927A(i9, bArr, iM38928B2, i3, dcg1VarM35653b, n9f1Var);
            i8 = i9;
        }
        n9f1Var.f151794d--;
        if (i2 > i3 || i8 != i6) {
            throw new zzgc("Failed to parse the message.");
        }
        dcg1Var.m35655c(i, dcg1VarM35653b);
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public static int m38928B(byte[] bArr, int i, n9f1 n9f1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m38929C(b, bArr, i2, n9f1Var);
        }
        n9f1Var.f151791a = b;
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public static int m38929C(int i, byte[] bArr, int i2, n9f1 n9f1Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            n9f1Var.f151791a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            n9f1Var.f151791a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            n9f1Var.f151791a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            n9f1Var.f151791a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                n9f1Var.f151791a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m38930D(int i, byte[] bArr, int i2, int i3, l4g1 l4g1Var, n9f1 n9f1Var) {
        v3g1 v3g1Var = (v3g1) l4g1Var;
        int iM38928B = m38928B(bArr, i2, n9f1Var);
        v3g1Var.m84566a(n9f1Var.f151791a);
        while (iM38928B < i3) {
            int iM38928B2 = m38928B(bArr, iM38928B, n9f1Var);
            if (i != n9f1Var.f151791a) {
                break;
            }
            iM38928B = m38928B(bArr, iM38928B2, n9f1Var);
            v3g1Var.m84566a(n9f1Var.f151791a);
        }
        return iM38928B;
    }

    /* JADX INFO: renamed from: E */
    public static int m38931E(byte[] bArr, int i, n9f1 n9f1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            n9f1Var.f151792b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        n9f1Var.f151792b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: F */
    public static int m38932F(Object obj, w9g1 w9g1Var, byte[] bArr, int i, int i2, int i3, n9f1 n9f1Var) throws zzgc {
        x8g1 x8g1Var = (x8g1) w9g1Var;
        int i4 = n9f1Var.f151794d + 1;
        n9f1Var.f151794d = i4;
        if (i4 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM90199q = x8g1Var.m90199q(obj, bArr, i, i2, i3, n9f1Var);
        n9f1Var.f151794d--;
        n9f1Var.f151793c = obj;
        return iM90199q;
    }

    /* JADX INFO: renamed from: G */
    public static int m38933G(Object obj, w9g1 w9g1Var, byte[] bArr, int i, int i2, n9f1 n9f1Var) throws zzgc {
        int iM38929C = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM38929C = m38929C(i3, bArr, iM38929C, n9f1Var);
            i3 = n9f1Var.f151791a;
        }
        int i4 = iM38929C;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = n9f1Var.f151794d + 1;
        n9f1Var.f151794d = i5;
        if (i5 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        w9g1Var.mo28476b(obj, bArr, i4, i6, n9f1Var);
        n9f1Var.f151794d--;
        n9f1Var.f151793c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: H */
    public static long m38934H(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: a */
    public static final void m38935a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        eh00 eh00Var2;
        xq00Var.m91775k0(2096348329);
        int i2 = (xq00Var.m91768h(false) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            c1v c1vVarM61774v = mhf1.m61774v((i2 & 14) | 432, 0, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00Var2 = eh00Var;
            ejg1.m39208y(rkk.m75772x(2069111353, new C1635n(k0e1.m54977L(R.string.chat_section_footer_at_capacity_tooltip, xq00Var), c1vVarM61774v, eh00Var2, (xuk) objM91750T, k0e1.m54977L(R.string.chat_section_footer_at_capacity_info_description, xq00Var)), xq00Var), xq00Var, 48);
            fxh0Var = cxh0.f43038a;
        } else {
            eh00Var2 = eh00Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(eh00Var2, fxh0Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m38936b(abd abdVar, boolean z, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, fxh0 fxh0Var, eh00 eh00Var4, String str, String str2, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        String str3 = str;
        String str4 = str2;
        xq00Var.m91775k0(2050282418);
        int i2 = i | (xq00Var.m91770i(abdVar) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var3) ? 16384 : 8192) | 196608 | (xq00Var.m91770i(eh00Var4) ? 1048576 : 524288) | 12582912 | (xq00Var.m91766g(str3) ? 67108864 : 33554432) | (xq00Var.m91766g(str4) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z2 = abdVar instanceof zad;
            cxh0 cxh0Var = cxh0.f43038a;
            if (z2) {
                xq00Var.m91771i0(-1068570796);
                int i3 = (i2 & 1022) | ((i2 >> 9) & 7168) | 221184;
                int i4 = i2 >> 6;
                m38943i((zad) abdVar, z, eh00Var, eh00Var4, str3, str4, xq00Var, i3 | (3670016 & i4) | (i4 & 29360128));
                str3 = str3;
                str4 = str4;
                xq00Var.m91788r(false);
            } else {
                if (!(abdVar instanceof yad)) {
                    throw lq51.m59703i(-1068572192, xq00Var, false);
                }
                xq00Var.m91771i0(1234466379);
                int iM38547C = edb.m38547C(((yad) abdVar).f270873a);
                if (iM38547C == 0) {
                    xq00Var.m91771i0(-1068554521);
                    int i5 = ((i2 >> 9) & 14) | 48;
                    int i6 = i2 >> 18;
                    m38939e((i6 & 7168) | i5 | (i6 & 896), str3, str4, eh00Var2, xq00Var);
                    xq00Var.m91788r(false);
                } else {
                    if (iM38547C != 1) {
                        throw lq51.m59703i(-1068557161, xq00Var, false);
                    }
                    xq00Var.m91771i0(-1068546009);
                    m38938d((i2 >> 12) & 126, eh00Var3, xq00Var, cxh0Var);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new go6(abdVar, z, eh00Var, eh00Var2, eh00Var3, fxh0Var2, eh00Var4, str3, str4, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m38937c(int i, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(-779414560);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, fxh0Var), leu.m58816b(xq00Var).f117233e.f137887c, 0.0f, leu.m58816b(xq00Var).f117233e.f137887c, leu.m58816b(xq00Var).f117230b.f224761d, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            dha.m36004a(nec.m64246i(mi21.m61824h(1, zsf1.m96832C(mi21.m61822f(1.0f, cxh0.f43038a), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 7)), leu.m58815a(xq00Var).f112826d.f50025b, kxf1.f127485a), xq00Var, 0);
            rbz.m75196n((i2 >> 3) & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vad(fxh0Var, fyfVar, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m38938d(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        eh00 eh00Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1738016549);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.chat_section_footer_free_ended_body, xq00Var);
            eh00Var2 = eh00Var;
            fxh0Var2 = fxh0Var;
            m38937c(48, rkk.m75772x(1975475061, new yx9(strM54977L, 9), xq00Var), xq00Var, hdi.m47247x(fxh0Var2, false, strM54977L, new tix0(0), null, eh00Var2, 9));
        } else {
            eh00Var2 = eh00Var;
            fxh0Var2 = fxh0Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wi1(eh00Var2, fxh0Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m38939e(int i, String str, String str2, eh00 eh00Var, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(-1639682600);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var.m91770i(cxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            m38937c(((i2 >> 3) & 14) | 48, rkk.m75772x(2059885682, new wad(str, str2, eh00Var, 0), xq00Var), xq00Var, cxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new bx5(eh00Var, str, str2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m38940f(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        Uri uri;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-335863584);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91766g(str2) ? 256 : 128;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM97185e = zxc.m97185e(0.4f, mi21.m61822f(1.0f, cxh0Var));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM97185e);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            int i3 = i2;
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                objM91750T = uri;
                xq00Var2.m91793t0(objM91750T);
            }
            Uri uri2 = (Uri) objM91750T;
            wj50.m88279p(uri2);
            fxh0Var2 = cxh0Var;
            kgg1.m56339b(uri2, null, tfu.f220050c, str2 == null ? "" : str2, null, 0L, 0L, false, xq00Var2, 384, 242);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, fxh0Var2));
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(nec.m64246i(r9g1.m75068p(mi21.m61824h(36, new cr70(1.0f, true)), hmx0.m47993b(18)), leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, kxf1.f127485a), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46172h, false);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(k0e1.m54977L(R.string.chat_section_input_placeholder, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xad(fxh0Var2, str, str2, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m38941g(gfu0 gfu0Var, voc1 voc1Var, n1k n1kVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1394480880);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(gfu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(voc1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(n1kVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = gfu0Var.f79474c;
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(epv0.m39673I("ShareCardLoading", mi21.m61822f(1.0f, p271.m68908k(fxh0Var2, z))), 0.0f, leu.m58816b(xq00Var).f117230b.f224760c, 0.0f, leu.m58816b(xq00Var).f117230b.f224760c, 5);
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224759b), d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            pzg1.m71743d(gfu0Var.f79473b, null, xq00Var, 0, 2);
            fxh0 fxh0VarM61842z = mi21.m61842z(fxh0Var2, null, 1);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61842z);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ihf1.m50620d(voc1Var, gfu0Var, n1kVar, null, xq00Var, ((i3 >> 3) & 14) | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i3 & 896), 8);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(gfu0Var, voc1Var, n1kVar, fxh0Var2, i, 15);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m38942h(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1299329212);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.premium_early_access_banner_content_description, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean zM91766g = xq00Var.m91766g(strM54977L);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new k5n0(strM54977L, 27);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("premium-early-access-banner-tag", zoz0.m96644b(fxh0VarM61822f, false, (gh00) objM91750T));
            sju sjuVar = sju.f209931e;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            zn91.m96545d(fxh0VarM39673I, null, kxf1.f127485a, sjuVar, new j4m0(f, f, f, f), null, false, null, null, new peu(u40.f226523c, eh00Var), null, h1h.f86627a, xq00Var, 0, 48, 1506);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m38943i(zad zadVar, boolean z, eh00 eh00Var, eh00 eh00Var2, String str, String str2, xq00 xq00Var, int i) {
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        xq00Var.m91775k0(-1837511230);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(zadVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(eh00Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91768h(false) ? 16384 : 8192;
        }
        int i5 = 196608 & i;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i5 == 0) {
            i2 |= xq00Var.m91770i(cxh0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str3 = str;
            i2 |= xq00Var.m91766g(str3) ? 1048576 : 524288;
        } else {
            str3 = str;
        }
        if ((12582912 & i) == 0) {
            str4 = str2;
            i2 |= xq00Var.m91766g(str4) ? 8388608 : 4194304;
        } else {
            str4 = str2;
        }
        int i6 = i2;
        if (xq00Var.m91752Y(i6 & 1, (4793491 & i6) != 4793490)) {
            String strM54977L = k0e1.m54977L(R.string.chat_section_footer_premium_included_title, xq00Var);
            if (zadVar.f281040b == 2) {
                i3 = -1938390643;
                i4 = R.string.chat_section_footer_premium_unavailable_body;
            } else {
                i3 = -1938302417;
                i4 = R.string.chat_section_footer_premium_available_body;
            }
            m38937c(((i6 >> 15) & 14) | 48, rkk.m75772x(730584156, new C2361s3(strM54977L, AbstractC0000a.m12k(xq00Var, i3, i4, xq00Var, false), str3, str4, zadVar, k0e1.m54977L(R.string.chat_section_footer_at_capacity_tooltip, xq00Var), eh00Var2, eh00Var, z), xq00Var), xq00Var, cxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ms1(zadVar, z, eh00Var, eh00Var2, str, str2, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m38944j(o2x0 o2x0Var) {
        String strM78534b = o2x0Var.f161171a.f149862f.m78534b("etag");
        return strM78534b == null ? "" : strM78534b;
    }

    /* JADX INFO: renamed from: k */
    public static final void m38945k() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    /* JADX INFO: renamed from: l */
    public static hr81 m38946l() {
        hr81 hr81Var = new hr81(18, (byte) 0);
        hr81Var.f94378e = new HashMap();
        hr81Var.f94379f = new ArrayList();
        return hr81Var;
    }

    /* JADX INFO: renamed from: m */
    public static chg0 m38947m(Integer num, st91 st91Var) {
        return new chg0(num, st91Var);
    }

    /* JADX INFO: renamed from: n */
    public static final f1v m38948n(uxu uxuVar, xq00 xq00Var) {
        FontWeight fontWeight = FontWeight.f528f;
        if71 if71Var = new if71(0L, uxuVar.f235051j, fontWeight, yds.m93481k(5, fontWeight, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        FontWeight fontWeight2 = FontWeight.f527e;
        if71 if71Var2 = new if71(0L, uxuVar.f235050i, fontWeight2, yds.m93481k(4, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        if71 if71Var3 = new if71(0L, uxuVar.f235049h, fontWeight2, yds.m93481k(4, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        if71 if71Var4 = new if71(0L, uxuVar.f235048g, fontWeight2, yds.m93481k(4, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        if71 if71Var5 = new if71(0L, uxuVar.f235047f, fontWeight2, yds.m93481k(4, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        if71 if71Var6 = new if71(0L, uxuVar.f235046e, fontWeight2, yds.m93481k(4, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113);
        FontWeight fontWeight3 = FontWeight.f524b;
        return new f1v(if71Var, if71Var2, if71Var3, if71Var4, if71Var5, if71Var6, new if71(0L, uxuVar.f235045d, fontWeight3, yds.m93481k(2, fontWeight3, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235045d, fontWeight2, yds.m93481k(3, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235045d, fontWeight3, yds.m93481k(1, fontWeight3, 2, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235044c, fontWeight3, yds.m93481k(2, fontWeight3, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235044c, fontWeight2, yds.m93481k(3, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235044c, fontWeight3, yds.m93481k(1, fontWeight3, 2, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235043b, fontWeight3, yds.m93481k(2, fontWeight3, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235043b, fontWeight2, yds.m93481k(3, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235042a, fontWeight3, yds.m93481k(2, fontWeight3, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113), new if71(0L, uxuVar.f235042a, fontWeight2, yds.m93481k(3, fontWeight2, 1, xq00Var), 0L, 0L, 0, 0, 0L, null, 0, 16777113));
    }

    /* JADX INFO: renamed from: o */
    public static final int m38949o(boolean z, boolean z2) {
        if (z2) {
            return 2;
        }
        return z ? 1 : 3;
    }

    /* JADX INFO: renamed from: p */
    public static final fxh0 m38950p(uu70 uu70Var, ae00 ae00Var, boolean z, vvl0 vvl0Var) {
        return new qu70(uu70Var, ae00Var, z, vvl0Var);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m38951q(AppCompatEditText appCompatEditText, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && mec1.m61555g(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                appCompatEditText.toString();
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return y65.m92947a(dragEvent, appCompatEditText, activity);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m38952r(AppCompatEditText appCompatEditText, int i) {
        jij jijVar;
        iij iijVar;
        t1j t1jVar;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 31 || mec1.m61555g(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                t1jVar = new t1j(primaryClip, 1);
            } else {
                jijVar = new jij();
                jijVar.f112766b = primaryClip;
                jijVar.f112767c = 1;
            }
            if (i != 16908322) {
                iijVar = jijVar;
                iijVar = t1jVar;
                i3 = 1;
            }
            iijVar = jijVar;
            iijVar = t1jVar;
            iijVar.setFlags(i3);
            mec1.m61558j(appCompatEditText, iijVar.build());
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final List m38953s(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str = ((fl31) obj).f70678a;
            if (str != null) {
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c == gn80.ARTIST) {
                    arrayList.add(obj);
                }
            }
            arrayList2.add(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String str2 = ((fl31) obj2).f70678a;
            wj50.m88279p(str2);
            Object objM75735i = linkedHashMap.get(str2);
            if (objM75735i == null) {
                objM75735i = rkh0.m75735i(str2, linkedHashMap);
            }
            ((List) objM75735i).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            String str4 = ((fl31) g6f.m43741q0(list2)).f70679b;
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList4.add(((fl31) it.next()).f70680c.f80987a);
            }
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                gl31 gl31Var = ((fl31) it2.next()).f70680c;
                String str5 = gl31Var.f80987a;
                ArrayList arrayList6 = gl31Var.f80988b;
                ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((hl31) it3.next()).f92608a);
                }
                arrayList5.add(new vix0(str5, arrayList7));
            }
            arrayList3.add(new yjk(str4, arrayList4, str3, arrayList5));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            String str6 = ((fl31) obj3).f70679b;
            Object objM75735i2 = linkedHashMap2.get(str6);
            if (objM75735i2 == null) {
                objM75735i2 = rkh0.m75735i(str6, linkedHashMap2);
            }
            ((List) objM75735i2).add(obj3);
        }
        ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str7 = (String) entry2.getKey();
            List list3 = (List) entry2.getValue();
            ArrayList arrayList9 = new ArrayList(i6f.m49804T(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList9.add(((fl31) it4.next()).f70680c.f80987a);
            }
            ArrayList arrayList10 = new ArrayList(i6f.m49804T(list3, 10));
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                gl31 gl31Var2 = ((fl31) it5.next()).f70680c;
                String str8 = gl31Var2.f80987a;
                ArrayList arrayList11 = gl31Var2.f80988b;
                ArrayList arrayList12 = new ArrayList(i6f.m49804T(arrayList11, 10));
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    arrayList12.add(((hl31) it6.next()).f92608a);
                }
                arrayList10.add(new vix0(str8, arrayList12));
            }
            arrayList8.add(new yjk(str7, arrayList9, null, arrayList10));
        }
        return g6f.m43728j1(g6f.m43700N0(arrayList8, arrayList3));
    }

    /* JADX INFO: renamed from: t */
    public static final we40 m38954t(l1m0 l1m0Var) {
        int iOrdinal = l1m0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return we40.f250430c;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return we40.f250428a;
    }

    /* JADX INFO: renamed from: u */
    public static final int m38955u(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 2;
        }
        if (iM38547C == 1) {
            return 4;
        }
        if (iM38547C == 2) {
            return 1;
        }
        if (iM38547C == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    public static void m38956v(dd41 dd41Var, Parcel parcel) {
        parcel.writeString(dd41Var != null ? dd41Var.m35694A() : null);
    }

    /* JADX INFO: renamed from: w */
    public static int m38957w(byte[] bArr, int i, n9f1 n9f1Var) throws zzgc {
        int iM38928B = m38928B(bArr, i, n9f1Var);
        int i2 = n9f1Var.f151791a;
        if (i2 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iM38928B) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            n9f1Var.f151793c = rzf1.f204149b;
            return iM38928B;
        }
        n9f1Var.f151793c = rzf1.m76784m(iM38928B, bArr, i2);
        return iM38928B + i2;
    }

    /* JADX INFO: renamed from: x */
    public static int m38958x(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: y */
    public static int m38959y(w9g1 w9g1Var, int i, byte[] bArr, int i2, int i3, l4g1 l4g1Var, n9f1 n9f1Var) throws zzgc {
        r3g1 r3g1VarZze = w9g1Var.zze();
        w9g1 w9g1Var2 = w9g1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        n9f1 n9f1Var2 = n9f1Var;
        int iM38933G = m38933G(r3g1VarZze, w9g1Var2, bArr2, i2, i4, n9f1Var2);
        w9g1Var2.zzf(r3g1VarZze);
        n9f1Var2.f151793c = r3g1VarZze;
        l4g1Var.add(r3g1VarZze);
        while (iM38933G < i4) {
            n9f1 n9f1Var3 = n9f1Var2;
            int i5 = i4;
            int iM38928B = m38928B(bArr2, iM38933G, n9f1Var3);
            if (i != n9f1Var3.f151791a) {
                break;
            }
            byte[] bArr3 = bArr2;
            w9g1 w9g1Var3 = w9g1Var2;
            r3g1 r3g1VarZze2 = w9g1Var3.zze();
            iM38933G = m38933G(r3g1VarZze2, w9g1Var3, bArr3, iM38928B, i5, n9f1Var3);
            w9g1Var2 = w9g1Var3;
            bArr2 = bArr3;
            i4 = i5;
            n9f1Var2 = n9f1Var3;
            w9g1Var2.zzf(r3g1VarZze2);
            n9f1Var2.f151793c = r3g1VarZze2;
            l4g1Var.add(r3g1VarZze2);
        }
        return iM38933G;
    }

    /* JADX INFO: renamed from: z */
    public static int m38960z(byte[] bArr, int i, l4g1 l4g1Var, n9f1 n9f1Var) throws zzgc {
        v3g1 v3g1Var = (v3g1) l4g1Var;
        int iM38928B = m38928B(bArr, i, n9f1Var);
        int i2 = n9f1Var.f151791a + iM38928B;
        while (iM38928B < i2) {
            iM38928B = m38928B(bArr, iM38928B, n9f1Var);
            v3g1Var.m84566a(n9f1Var.f151791a);
        }
        if (iM38928B == i2) {
            return iM38928B;
        }
        throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
