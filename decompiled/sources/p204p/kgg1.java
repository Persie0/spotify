package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.icu.text.BreakIterator;
import android.net.Uri;
import android.view.View;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class kgg1 {

    /* JADX INFO: renamed from: a */
    public static final gey[] f122397a = {new gey("usage_and_diagnostics_listener", -1, 1, true), new gey("usage_and_diagnostics_consents", -1, 1, true), new gey("usage_and_diagnostics_check_consents", -1, 1, true), new gey("usage_and_diagnostics_settings_access", -1, 1, true), new gey("el_capitan", -1, 1, false)};

    /* JADX INFO: renamed from: A */
    public static final vr91 m56335A(String str) {
        int i;
        zn91.m96584x(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (wj50.m88282u(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iM91398g = 119304647;
        while (i < length) {
            int iM96513A = zn91.m96513A(str.charAt(i), 10);
            if (iM96513A < 0) {
                return null;
            }
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, iM91398g ^ Integer.MIN_VALUE) > 0) {
                if (iM91398g != 119304647) {
                    return null;
                }
                iM91398g = xl81.m91398g();
                if (Integer.compare(i2 ^ Integer.MIN_VALUE, iM91398g ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iM96513A + i3;
            if (Integer.compare(i4 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return vr91.m86278a(i2);
    }

    /* JADX INFO: renamed from: B */
    public static final as91 m56336B(String str) {
        zn91.m96584x(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (wj50.m88282u(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jM91402k = 512409557603043100L;
        while (i < length) {
            int iM96513A = zn91.m96513A(str.charAt(i), 10);
            if (iM96513A < 0) {
                return null;
            }
            if (Long.compare(j2 ^ Long.MIN_VALUE, jM91402k ^ Long.MIN_VALUE) > 0) {
                if (jM91402k != 512409557603043100L) {
                    return null;
                }
                jM91402k = xl81.m91402k(j);
                if (Long.compare(j2 ^ Long.MIN_VALUE, jM91402k ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (((long) iM96513A) & 4294967295L) + j3;
            if (Long.compare(j4 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return as91.m27073a(j2);
    }

    /* JADX INFO: renamed from: C */
    public static void m56337C(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(s571.m77248g(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m56338a(qe10 qe10Var, int i, int i2, fyf fyfVar, xq00 xq00Var, int i3, int i4) {
        int i5;
        xq00Var.m91775k0(-1883910253);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (xq00Var.m91766g(qe10Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= xq00Var.m91762e(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= xq00Var.m91762e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= xq00Var.m91766g(fyfVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            if (i6 != 0) {
                qe10Var = oe10.f164317a;
            }
            if (i7 != 0) {
                i = 0;
            }
            if (i8 != 0) {
                i2 = 0;
            }
            u9f u9fVar = u9f.f228153h;
            xq00Var.m91773j0(578571862);
            xq00Var.m91773j0(-548224868);
            if (!(xq00Var.f264811a instanceof tg5)) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91767g0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(u9fVar);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(qe10Var, b7e.f24238V0, xq00Var);
            zsf1.m96835F(ib3.m50113a(i2), b7e.f24239W0, xq00Var);
            zsf1.m96835F(kb3.m55923a(i), b7e.f24241X0, xq00Var);
            fyfVar.mo24510D0(caf.f35811a, xq00Var, Integer.valueOf(((i5 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 6));
            xq00Var.m91788r(true);
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
        }
        qe10 qe10Var2 = qe10Var;
        int i9 = i;
        int i10 = i2;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v9f(qe10Var2, i9, i10, fyfVar, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:128:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x018d A[PHI: r4
      0x018d: PHI (r4v12 java.lang.String) = (r4v11 java.lang.String), (r4v17 java.lang.String) binds: [B:129:0x017f, B:134:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:158:0x0208  */
    /* JADX WARN: Code duplicated, block: B:164:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0220  */
    /* JADX WARN: Code duplicated, block: B:167:0x0224  */
    /* JADX WARN: Code duplicated, block: B:168:0x0226  */
    /* JADX WARN: Code duplicated, block: B:170:0x022c  */
    /* JADX WARN: Code duplicated, block: B:171:0x023f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0245  */
    /* JADX WARN: Code duplicated, block: B:177:0x026d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0272  */
    /* JADX WARN: Code duplicated, block: B:180:0x0287  */
    /* JADX WARN: Code duplicated, block: B:182:0x029d  */
    /* JADX WARN: Code duplicated, block: B:184:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:188:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:190:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:191:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:195:0x0324  */
    /* JADX WARN: Code duplicated, block: B:198:0x0336  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX INFO: renamed from: b */
    public static final void m56339b(Uri uri, fxh0 fxh0Var, tfu tfuVar, String str, String str2, long j, long j2, boolean z, xq00 xq00Var, int i, int i2) {
        int i3;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        String str3;
        int i7;
        int i8;
        String str4;
        int i9;
        long jM60224n;
        int i10;
        boolean z2;
        int i11;
        boolean z3;
        boolean z4;
        fxh0 fxh0Var2;
        tfu tfuVar2;
        long j3;
        String str5;
        long j4;
        String str6;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var3;
        tfu tfuVar3;
        String str7;
        long jM60224n2;
        int i12;
        long j5;
        boolean z5;
        fxh0 fxh0Var4;
        tfu tfuVar4;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objM91750T;
        String str8;
        int i13;
        long jM56535a;
        boolean zM91764f;
        Object objM91750T2;
        long j6;
        float f;
        long j7;
        boolean z9;
        u7q u7qVar;
        diu diuVar;
        int i14;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-583366815);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(uri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                i3 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (tfuVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = tfuVar.ordinal();
                }
                if (xq00Var.m91762e(iOrdinal)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    str3 = str;
                    if (xq00Var.m91766g(str3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        str4 = str2;
                        if (xq00Var.m91766g(str4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i & 196608) == 0) {
                        jM60224n = j;
                        if ((i2 & 32) == 0 || !xq00Var.m91764f(jM60224n)) {
                            i14 = 65536;
                        } else {
                            i14 = 131072;
                        }
                        i3 |= i14;
                    } else {
                        jM60224n = j;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= 524288;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & 12582912) == 0) {
                            if (xq00Var.m91768h(z2)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                    }
                    z3 = true;
                    if ((i3 & 4793491) != 4793490) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z4)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0 || xq00Var.m91735E()) {
                            if (i15 != 0) {
                                fxh0Var3 = cxh0.f43038a;
                            } else {
                                fxh0Var3 = fxh0Var;
                            }
                            if (i4 != 0) {
                                tfuVar3 = tfu.f220051d;
                            } else {
                                tfuVar3 = tfuVar;
                            }
                            if (i6 != 0) {
                                str3 = "";
                            }
                            str7 = i8 == 0 ? str4 : "";
                            if ((i2 & 32) != 0) {
                                int i16 = n6f.f150872l;
                                jM60224n = ly5.m60224n();
                                i3 &= -458753;
                            }
                            int i17 = n6f.f150872l;
                            jM60224n2 = ly5.m60224n();
                            i12 = i3 & (-3670017);
                            j5 = jM60224n;
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            fxh0Var4 = fxh0Var3;
                            tfuVar4 = tfuVar3;
                        } else {
                            xq00Var.m91757b0();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            fxh0Var4 = fxh0Var;
                            jM60224n2 = j2;
                            i12 = i3 & (-3670017);
                            j5 = jM60224n;
                            z5 = z2;
                            tfuVar4 = tfuVar;
                            str7 = str4;
                        }
                        xq00Var.m91790s();
                        if ((i12 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if ((57344 & i12) == 16384) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objM91750T = xq00Var.m91750T();
                        if (z8 || objM91750T == ia7Var) {
                            objM91750T = null;
                            if (wl51.m88460J0(str7)) {
                                str8 = null;
                            } else {
                                str8 = str7;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(str8);
                                objM91750T = str8.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
                            } else {
                                if (wl51.m88460J0(str3)) {
                                    str8 = null;
                                } else {
                                    str8 = str3;
                                }
                                if (str8 != null) {
                                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                                    characterInstance2.setText(str8);
                                    objM91750T = str8.substring(0, characterInstance2.next()).toUpperCase(Locale.ROOT);
                                }
                            }
                            xq00Var.m91793t0(objM91750T);
                        }
                        String str9 = (String) objM91750T;
                        int i18 = i12 >> 6;
                        i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i18 & ContentType.LONG_FORM_ON_DEMAND);
                        int i19 = i12;
                        jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                        tfu tfuVar5 = tfuVar4;
                        boolean z10 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                        if ((((i13 & 896) ^ 384) > 256 || !xq00Var.m91764f(j5)) && (i13 & 384) != 256) {
                        }
                        zM91764f = z10 | z3 | xq00Var.m91764f(jM56535a);
                        objM91750T2 = xq00Var.m91750T();
                        if (zM91764f || objM91750T2 == ia7Var) {
                            if (j5 != 16) {
                                jM56535a = j5;
                            } else if (!wl51.m88460J0(str7)) {
                                n6f[] n6fVarArr = l9f.f131080a;
                                int iAbs = Math.abs(str7.hashCode());
                                n6f[] n6fVarArr2 = l9f.f131080a;
                                jM56535a = n6fVarArr2[iAbs % n6fVarArr2.length].f150873a;
                            } else if (!wl51.m88460J0(str3)) {
                                n6f[] n6fVarArr3 = l9f.f131080a;
                                int iAbs2 = Math.abs(str3.hashCode());
                                n6f[] n6fVarArr4 = l9f.f131080a;
                                jM56535a = n6fVarArr4[iAbs2 % n6fVarArr4.length].f150873a;
                            }
                            objM91750T2 = new n6f(jM56535a);
                            xq00Var.m91793t0(objM91750T2);
                        }
                        j6 = ((n6f) objM91750T2).f150873a;
                        xq00Var.m91771i0(2025223330);
                        if (jM60224n2 != 16) {
                            j7 = jM60224n2;
                            z9 = false;
                        } else {
                            n6f[] n6fVarArr5 = l9f.f131080a;
                            xq00Var.m91771i0(-1246266282);
                            if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                                x4b x4bVar = iiu.f102631a;
                                u7qVar = (u7q) x4bVar.f258038c;
                                diuVar = (diu) x4bVar.f258037b;
                                if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                                    j7 = diuVar.f49477b;
                                } else {
                                    j7 = diuVar.f49478c;
                                }
                            } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                                j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                            } else {
                                f = 255;
                                if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                                    j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                                } else {
                                    j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                                }
                            }
                            z9 = false;
                            xq00Var.m91788r(false);
                        }
                        xq00Var.m91788r(z9);
                        m56340c(uri, tfuVar5, str9, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i19 & 14) | ((i19 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i18) | ((i19 << 15) & 3670016));
                        tfuVar2 = tfuVar5;
                        fxh0Var2 = fxh0Var4;
                        str5 = str7;
                        j4 = jM60224n2;
                        z2 = z5;
                        j3 = j5;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var2 = fxh0Var;
                        tfuVar2 = tfuVar;
                        j3 = jM60224n;
                        str5 = str4;
                        j4 = j2;
                    }
                    str6 = str3;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
                    }
                }
                i3 |= 24576;
                str4 = str2;
                if ((i & 196608) == 0) {
                    jM60224n = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jM60224n = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (xq00Var.m91768h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z4)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i110 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i111 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    } else {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i112 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i113 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    }
                    xq00Var.m91790s();
                    if ((i12 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objM91750T = xq00Var.m91750T();
                    if (z8) {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                            characterInstance3.setText(str8);
                            objM91750T = str8.substring(0, characterInstance3.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                                characterInstance4.setText(str8);
                                objM91750T = str8.substring(0, characterInstance4.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance5 = BreakIterator.getCharacterInstance();
                            characterInstance5.setText(str8);
                            objM91750T = str8.substring(0, characterInstance5.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance6 = BreakIterator.getCharacterInstance();
                                characterInstance6.setText(str8);
                                objM91750T = str8.substring(0, characterInstance6.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    }
                    String str10 = (String) objM91750T;
                    int i114 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i114 & ContentType.LONG_FORM_ON_DEMAND);
                    int i115 = i12;
                    jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                    tfu tfuVar6 = tfuVar4;
                    boolean z11 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                    z3 = ((i13 & 896) ^ 384) > 256 ? false : false;
                    zM91764f = z11 | z3 | xq00Var.m91764f(jM56535a);
                    objM91750T2 = xq00Var.m91750T();
                    if (zM91764f) {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr6 = l9f.f131080a;
                            int iAbs3 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr7 = l9f.f131080a;
                            jM56535a = n6fVarArr7[iAbs3 % n6fVarArr7.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr8 = l9f.f131080a;
                            int iAbs4 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr9 = l9f.f131080a;
                            jM56535a = n6fVarArr9[iAbs4 % n6fVarArr9.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    } else {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr10 = l9f.f131080a;
                            int iAbs5 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr11 = l9f.f131080a;
                            jM56535a = n6fVarArr11[iAbs5 % n6fVarArr11.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr12 = l9f.f131080a;
                            int iAbs6 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr13 = l9f.f131080a;
                            jM56535a = n6fVarArr13[iAbs6 % n6fVarArr13.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    }
                    j6 = ((n6f) objM91750T2).f150873a;
                    xq00Var.m91771i0(2025223330);
                    if (jM60224n2 != 16) {
                        j7 = jM60224n2;
                        z9 = false;
                    } else {
                        n6f[] n6fVarArr14 = l9f.f131080a;
                        xq00Var.m91771i0(-1246266282);
                        if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                            x4b x4bVar2 = iiu.f102631a;
                            u7qVar = (u7q) x4bVar2.f258038c;
                            diuVar = (diu) x4bVar2.f258037b;
                            if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                                j7 = diuVar.f49478c;
                            } else {
                                j7 = diuVar.f49477b;
                            }
                        } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        } else {
                            f = 255;
                            if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                                j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                            } else {
                                j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                            }
                        }
                        z9 = false;
                        xq00Var.m91788r(false);
                    }
                    xq00Var.m91788r(z9);
                    m56340c(uri, tfuVar6, str10, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i115 & 14) | ((i115 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i114) | ((i115 << 15) & 3670016));
                    tfuVar2 = tfuVar6;
                    fxh0Var2 = fxh0Var4;
                    str5 = str7;
                    j4 = jM60224n2;
                    z2 = z5;
                    j3 = j5;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    tfuVar2 = tfuVar;
                    j3 = jM60224n;
                    str5 = str4;
                    j4 = j2;
                }
                str6 = str3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
                }
            }
            i3 |= 3072;
            str3 = str;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (xq00Var.m91766g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 196608) == 0) {
                    jM60224n = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jM60224n = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (xq00Var.m91768h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z4)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i116 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i117 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    } else {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i118 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i119 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    }
                    xq00Var.m91790s();
                    if ((i12 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objM91750T = xq00Var.m91750T();
                    if (z8) {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance7 = BreakIterator.getCharacterInstance();
                            characterInstance7.setText(str8);
                            objM91750T = str8.substring(0, characterInstance7.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance8 = BreakIterator.getCharacterInstance();
                                characterInstance8.setText(str8);
                                objM91750T = str8.substring(0, characterInstance8.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance9 = BreakIterator.getCharacterInstance();
                            characterInstance9.setText(str8);
                            objM91750T = str8.substring(0, characterInstance9.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance10 = BreakIterator.getCharacterInstance();
                                characterInstance10.setText(str8);
                                objM91750T = str8.substring(0, characterInstance10.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    }
                    String str11 = (String) objM91750T;
                    int i1110 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1110 & ContentType.LONG_FORM_ON_DEMAND);
                    int i1111 = i12;
                    jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                    tfu tfuVar7 = tfuVar4;
                    boolean z12 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zM91764f = z12 | z3 | xq00Var.m91764f(jM56535a);
                    objM91750T2 = xq00Var.m91750T();
                    if (zM91764f) {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr15 = l9f.f131080a;
                            int iAbs7 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr16 = l9f.f131080a;
                            jM56535a = n6fVarArr16[iAbs7 % n6fVarArr16.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr17 = l9f.f131080a;
                            int iAbs8 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr18 = l9f.f131080a;
                            jM56535a = n6fVarArr18[iAbs8 % n6fVarArr18.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    } else {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr19 = l9f.f131080a;
                            int iAbs9 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr110 = l9f.f131080a;
                            jM56535a = n6fVarArr110[iAbs9 % n6fVarArr110.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr111 = l9f.f131080a;
                            int iAbs10 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr112 = l9f.f131080a;
                            jM56535a = n6fVarArr112[iAbs10 % n6fVarArr112.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    }
                    j6 = ((n6f) objM91750T2).f150873a;
                    xq00Var.m91771i0(2025223330);
                    if (jM60224n2 != 16) {
                        j7 = jM60224n2;
                        z9 = false;
                    } else {
                        n6f[] n6fVarArr113 = l9f.f131080a;
                        xq00Var.m91771i0(-1246266282);
                        if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                            x4b x4bVar3 = iiu.f102631a;
                            u7qVar = (u7q) x4bVar3.f258038c;
                            diuVar = (diu) x4bVar3.f258037b;
                            if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                                j7 = diuVar.f49478c;
                            } else {
                                j7 = diuVar.f49477b;
                            }
                        } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        } else {
                            f = 255;
                            if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                                j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                            } else {
                                j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                            }
                        }
                        z9 = false;
                        xq00Var.m91788r(false);
                    }
                    xq00Var.m91788r(z9);
                    m56340c(uri, tfuVar7, str11, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i1111 & 14) | ((i1111 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i1110) | ((i1111 << 15) & 3670016));
                    tfuVar2 = tfuVar7;
                    fxh0Var2 = fxh0Var4;
                    str5 = str7;
                    j4 = jM60224n2;
                    z2 = z5;
                    j3 = j5;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    tfuVar2 = tfuVar;
                    j3 = jM60224n;
                    str5 = str4;
                    j4 = j2;
                }
                str6 = str3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            if ((i & 196608) == 0) {
                jM60224n = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jM60224n = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (xq00Var.m91768h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z4)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i1112 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i1113 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                } else {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i1114 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i1115 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                }
                xq00Var.m91790s();
                if ((i12 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((57344 & i12) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objM91750T = xq00Var.m91750T();
                if (z8) {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance11 = BreakIterator.getCharacterInstance();
                        characterInstance11.setText(str8);
                        objM91750T = str8.substring(0, characterInstance11.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance12 = BreakIterator.getCharacterInstance();
                            characterInstance12.setText(str8);
                            objM91750T = str8.substring(0, characterInstance12.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance13 = BreakIterator.getCharacterInstance();
                        characterInstance13.setText(str8);
                        objM91750T = str8.substring(0, characterInstance13.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance14 = BreakIterator.getCharacterInstance();
                            characterInstance14.setText(str8);
                            objM91750T = str8.substring(0, characterInstance14.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                }
                String str12 = (String) objM91750T;
                int i1116 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1116 & ContentType.LONG_FORM_ON_DEMAND);
                int i1117 = i12;
                jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                tfu tfuVar8 = tfuVar4;
                boolean z13 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zM91764f = z13 | z3 | xq00Var.m91764f(jM56535a);
                objM91750T2 = xq00Var.m91750T();
                if (zM91764f) {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr114 = l9f.f131080a;
                        int iAbs11 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr115 = l9f.f131080a;
                        jM56535a = n6fVarArr115[iAbs11 % n6fVarArr115.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr116 = l9f.f131080a;
                        int iAbs12 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr117 = l9f.f131080a;
                        jM56535a = n6fVarArr117[iAbs12 % n6fVarArr117.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr118 = l9f.f131080a;
                        int iAbs13 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr119 = l9f.f131080a;
                        jM56535a = n6fVarArr119[iAbs13 % n6fVarArr119.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr1110 = l9f.f131080a;
                        int iAbs14 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr1111 = l9f.f131080a;
                        jM56535a = n6fVarArr1111[iAbs14 % n6fVarArr1111.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                }
                j6 = ((n6f) objM91750T2).f150873a;
                xq00Var.m91771i0(2025223330);
                if (jM60224n2 != 16) {
                    j7 = jM60224n2;
                    z9 = false;
                } else {
                    n6f[] n6fVarArr1112 = l9f.f131080a;
                    xq00Var.m91771i0(-1246266282);
                    if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                        x4b x4bVar4 = iiu.f102631a;
                        u7qVar = (u7q) x4bVar4.f258038c;
                        diuVar = (diu) x4bVar4.f258037b;
                        if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                            j7 = diuVar.f49478c;
                        } else {
                            j7 = diuVar.f49477b;
                        }
                    } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                        j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                    } else {
                        f = 255;
                        if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                        } else {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        }
                    }
                    z9 = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z9);
                m56340c(uri, tfuVar8, str12, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i1117 & 14) | ((i1117 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i1116) | ((i1117 << 15) & 3670016));
                tfuVar2 = tfuVar8;
                fxh0Var2 = fxh0Var4;
                str5 = str7;
                j4 = jM60224n2;
                z2 = z5;
                j3 = j5;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                tfuVar2 = tfuVar;
                j3 = jM60224n;
                str5 = str4;
                j4 = j2;
            }
            str6 = str3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (tfuVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = tfuVar.ordinal();
            }
            if (xq00Var.m91762e(iOrdinal)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                str3 = str;
                if (xq00Var.m91766g(str3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (xq00Var.m91766g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 196608) == 0) {
                    jM60224n = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jM60224n = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (xq00Var.m91768h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z4)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i1118 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i1119 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    } else {
                        if (i15 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var;
                        }
                        if (i4 != 0) {
                            tfuVar3 = tfu.f220051d;
                        } else {
                            tfuVar3 = tfuVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i11110 = n6f.f150872l;
                            jM60224n = ly5.m60224n();
                            i3 &= -458753;
                        }
                        int i11111 = n6f.f150872l;
                        jM60224n2 = ly5.m60224n();
                        i12 = i3 & (-3670017);
                        j5 = jM60224n;
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        fxh0Var4 = fxh0Var3;
                        tfuVar4 = tfuVar3;
                    }
                    xq00Var.m91790s();
                    if ((i12 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objM91750T = xq00Var.m91750T();
                    if (z8) {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance15 = BreakIterator.getCharacterInstance();
                            characterInstance15.setText(str8);
                            objM91750T = str8.substring(0, characterInstance15.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance16 = BreakIterator.getCharacterInstance();
                                characterInstance16.setText(str8);
                                objM91750T = str8.substring(0, characterInstance16.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = null;
                        if (wl51.m88460J0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance17 = BreakIterator.getCharacterInstance();
                            characterInstance17.setText(str8);
                            objM91750T = str8.substring(0, characterInstance17.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (wl51.m88460J0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance18 = BreakIterator.getCharacterInstance();
                                characterInstance18.setText(str8);
                                objM91750T = str8.substring(0, characterInstance18.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        xq00Var.m91793t0(objM91750T);
                    }
                    String str13 = (String) objM91750T;
                    int i11112 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i11112 & ContentType.LONG_FORM_ON_DEMAND);
                    int i11113 = i12;
                    jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                    tfu tfuVar9 = tfuVar4;
                    boolean z14 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zM91764f = z14 | z3 | xq00Var.m91764f(jM56535a);
                    objM91750T2 = xq00Var.m91750T();
                    if (zM91764f) {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr1113 = l9f.f131080a;
                            int iAbs15 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr1114 = l9f.f131080a;
                            jM56535a = n6fVarArr1114[iAbs15 % n6fVarArr1114.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr1115 = l9f.f131080a;
                            int iAbs16 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr1116 = l9f.f131080a;
                            jM56535a = n6fVarArr1116[iAbs16 % n6fVarArr1116.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    } else {
                        if (j5 != 16) {
                            jM56535a = j5;
                        } else if (!wl51.m88460J0(str7)) {
                            n6f[] n6fVarArr1117 = l9f.f131080a;
                            int iAbs17 = Math.abs(str7.hashCode());
                            n6f[] n6fVarArr1118 = l9f.f131080a;
                            jM56535a = n6fVarArr1118[iAbs17 % n6fVarArr1118.length].f150873a;
                        } else if (!wl51.m88460J0(str3)) {
                            n6f[] n6fVarArr1119 = l9f.f131080a;
                            int iAbs18 = Math.abs(str3.hashCode());
                            n6f[] n6fVarArr11110 = l9f.f131080a;
                            jM56535a = n6fVarArr11110[iAbs18 % n6fVarArr11110.length].f150873a;
                        }
                        objM91750T2 = new n6f(jM56535a);
                        xq00Var.m91793t0(objM91750T2);
                    }
                    j6 = ((n6f) objM91750T2).f150873a;
                    xq00Var.m91771i0(2025223330);
                    if (jM60224n2 != 16) {
                        j7 = jM60224n2;
                        z9 = false;
                    } else {
                        n6f[] n6fVarArr11111 = l9f.f131080a;
                        xq00Var.m91771i0(-1246266282);
                        if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                            x4b x4bVar5 = iiu.f102631a;
                            u7qVar = (u7q) x4bVar5.f258038c;
                            diuVar = (diu) x4bVar5.f258037b;
                            if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                                j7 = diuVar.f49478c;
                            } else {
                                j7 = diuVar.f49477b;
                            }
                        } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        } else {
                            f = 255;
                            if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                                j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                            } else {
                                j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                            }
                        }
                        z9 = false;
                        xq00Var.m91788r(false);
                    }
                    xq00Var.m91788r(z9);
                    m56340c(uri, tfuVar9, str13, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i11113 & 14) | ((i11113 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i11112) | ((i11113 << 15) & 3670016));
                    tfuVar2 = tfuVar9;
                    fxh0Var2 = fxh0Var4;
                    str5 = str7;
                    j4 = jM60224n2;
                    z2 = z5;
                    j3 = j5;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    tfuVar2 = tfuVar;
                    j3 = jM60224n;
                    str5 = str4;
                    j4 = j2;
                }
                str6 = str3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            if ((i & 196608) == 0) {
                jM60224n = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jM60224n = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (xq00Var.m91768h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z4)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i11114 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i11115 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                } else {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i11116 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i11117 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                }
                xq00Var.m91790s();
                if ((i12 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((57344 & i12) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objM91750T = xq00Var.m91750T();
                if (z8) {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance19 = BreakIterator.getCharacterInstance();
                        characterInstance19.setText(str8);
                        objM91750T = str8.substring(0, characterInstance19.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance110 = BreakIterator.getCharacterInstance();
                            characterInstance110.setText(str8);
                            objM91750T = str8.substring(0, characterInstance110.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance111 = BreakIterator.getCharacterInstance();
                        characterInstance111.setText(str8);
                        objM91750T = str8.substring(0, characterInstance111.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance112 = BreakIterator.getCharacterInstance();
                            characterInstance112.setText(str8);
                            objM91750T = str8.substring(0, characterInstance112.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                }
                String str14 = (String) objM91750T;
                int i11118 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i11118 & ContentType.LONG_FORM_ON_DEMAND);
                int i11119 = i12;
                jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                tfu tfuVar10 = tfuVar4;
                boolean z15 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zM91764f = z15 | z3 | xq00Var.m91764f(jM56535a);
                objM91750T2 = xq00Var.m91750T();
                if (zM91764f) {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr11112 = l9f.f131080a;
                        int iAbs19 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr11113 = l9f.f131080a;
                        jM56535a = n6fVarArr11113[iAbs19 % n6fVarArr11113.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr11114 = l9f.f131080a;
                        int iAbs110 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr11115 = l9f.f131080a;
                        jM56535a = n6fVarArr11115[iAbs110 % n6fVarArr11115.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr11116 = l9f.f131080a;
                        int iAbs111 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr11117 = l9f.f131080a;
                        jM56535a = n6fVarArr11117[iAbs111 % n6fVarArr11117.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr11118 = l9f.f131080a;
                        int iAbs112 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr11119 = l9f.f131080a;
                        jM56535a = n6fVarArr11119[iAbs112 % n6fVarArr11119.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                }
                j6 = ((n6f) objM91750T2).f150873a;
                xq00Var.m91771i0(2025223330);
                if (jM60224n2 != 16) {
                    j7 = jM60224n2;
                    z9 = false;
                } else {
                    n6f[] n6fVarArr111110 = l9f.f131080a;
                    xq00Var.m91771i0(-1246266282);
                    if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                        x4b x4bVar6 = iiu.f102631a;
                        u7qVar = (u7q) x4bVar6.f258038c;
                        diuVar = (diu) x4bVar6.f258037b;
                        if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                            j7 = diuVar.f49478c;
                        } else {
                            j7 = diuVar.f49477b;
                        }
                    } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                        j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                    } else {
                        f = 255;
                        if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                        } else {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        }
                    }
                    z9 = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z9);
                m56340c(uri, tfuVar10, str14, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i11119 & 14) | ((i11119 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i11118) | ((i11119 << 15) & 3670016));
                tfuVar2 = tfuVar10;
                fxh0Var2 = fxh0Var4;
                str5 = str7;
                j4 = jM60224n2;
                z2 = z5;
                j3 = j5;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                tfuVar2 = tfuVar;
                j3 = jM60224n;
                str5 = str4;
                j4 = j2;
            }
            str6 = str3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
            }
        }
        i3 |= 3072;
        str3 = str;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                if (xq00Var.m91766g(str4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i & 196608) == 0) {
                jM60224n = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jM60224n = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (xq00Var.m91768h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z4)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i111110 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i111111 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                } else {
                    if (i15 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if (i4 != 0) {
                        tfuVar3 = tfu.f220051d;
                    } else {
                        tfuVar3 = tfuVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i111112 = n6f.f150872l;
                        jM60224n = ly5.m60224n();
                        i3 &= -458753;
                    }
                    int i111113 = n6f.f150872l;
                    jM60224n2 = ly5.m60224n();
                    i12 = i3 & (-3670017);
                    j5 = jM60224n;
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fxh0Var4 = fxh0Var3;
                    tfuVar4 = tfuVar3;
                }
                xq00Var.m91790s();
                if ((i12 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((57344 & i12) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objM91750T = xq00Var.m91750T();
                if (z8) {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance113 = BreakIterator.getCharacterInstance();
                        characterInstance113.setText(str8);
                        objM91750T = str8.substring(0, characterInstance113.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance114 = BreakIterator.getCharacterInstance();
                            characterInstance114.setText(str8);
                            objM91750T = str8.substring(0, characterInstance114.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = null;
                    if (wl51.m88460J0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance115 = BreakIterator.getCharacterInstance();
                        characterInstance115.setText(str8);
                        objM91750T = str8.substring(0, characterInstance115.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (wl51.m88460J0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance116 = BreakIterator.getCharacterInstance();
                            characterInstance116.setText(str8);
                            objM91750T = str8.substring(0, characterInstance116.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    xq00Var.m91793t0(objM91750T);
                }
                String str15 = (String) objM91750T;
                int i111114 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i111114 & ContentType.LONG_FORM_ON_DEMAND);
                int i111115 = i12;
                jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
                tfu tfuVar11 = tfuVar4;
                boolean z16 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zM91764f = z16 | z3 | xq00Var.m91764f(jM56535a);
                objM91750T2 = xq00Var.m91750T();
                if (zM91764f) {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr111111 = l9f.f131080a;
                        int iAbs113 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr111112 = l9f.f131080a;
                        jM56535a = n6fVarArr111112[iAbs113 % n6fVarArr111112.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr111113 = l9f.f131080a;
                        int iAbs114 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr111114 = l9f.f131080a;
                        jM56535a = n6fVarArr111114[iAbs114 % n6fVarArr111114.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    if (j5 != 16) {
                        jM56535a = j5;
                    } else if (!wl51.m88460J0(str7)) {
                        n6f[] n6fVarArr111115 = l9f.f131080a;
                        int iAbs115 = Math.abs(str7.hashCode());
                        n6f[] n6fVarArr111116 = l9f.f131080a;
                        jM56535a = n6fVarArr111116[iAbs115 % n6fVarArr111116.length].f150873a;
                    } else if (!wl51.m88460J0(str3)) {
                        n6f[] n6fVarArr111117 = l9f.f131080a;
                        int iAbs116 = Math.abs(str3.hashCode());
                        n6f[] n6fVarArr111118 = l9f.f131080a;
                        jM56535a = n6fVarArr111118[iAbs116 % n6fVarArr111118.length].f150873a;
                    }
                    objM91750T2 = new n6f(jM56535a);
                    xq00Var.m91793t0(objM91750T2);
                }
                j6 = ((n6f) objM91750T2).f150873a;
                xq00Var.m91771i0(2025223330);
                if (jM60224n2 != 16) {
                    j7 = jM60224n2;
                    z9 = false;
                } else {
                    n6f[] n6fVarArr111119 = l9f.f131080a;
                    xq00Var.m91771i0(-1246266282);
                    if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                        x4b x4bVar7 = iiu.f102631a;
                        u7qVar = (u7q) x4bVar7.f258038c;
                        diuVar = (diu) x4bVar7.f258037b;
                        if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                            j7 = diuVar.f49478c;
                        } else {
                            j7 = diuVar.f49477b;
                        }
                    } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                        j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                    } else {
                        f = 255;
                        if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                            j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                        } else {
                            j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                        }
                    }
                    z9 = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z9);
                m56340c(uri, tfuVar11, str15, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i111115 & 14) | ((i111115 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i111114) | ((i111115 << 15) & 3670016));
                tfuVar2 = tfuVar11;
                fxh0Var2 = fxh0Var4;
                str5 = str7;
                j4 = jM60224n2;
                z2 = z5;
                j3 = j5;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                tfuVar2 = tfuVar;
                j3 = jM60224n;
                str5 = str4;
                j4 = j2;
            }
            str6 = str3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
            }
        }
        i3 |= 24576;
        str4 = str2;
        if ((i & 196608) == 0) {
            jM60224n = j;
            if ((i2 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i3 |= i14;
        } else {
            jM60224n = j;
        }
        if ((i & 1572864) == 0) {
            i3 |= 524288;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                if (xq00Var.m91768h(z2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
        }
        z3 = true;
        if ((i3 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z4)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var;
                }
                if (i4 != 0) {
                    tfuVar3 = tfu.f220051d;
                } else {
                    tfuVar3 = tfuVar;
                }
                if (i6 != 0) {
                    str3 = "";
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    int i111116 = n6f.f150872l;
                    jM60224n = ly5.m60224n();
                    i3 &= -458753;
                }
                int i111117 = n6f.f150872l;
                jM60224n2 = ly5.m60224n();
                i12 = i3 & (-3670017);
                j5 = jM60224n;
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                fxh0Var4 = fxh0Var3;
                tfuVar4 = tfuVar3;
            } else {
                if (i15 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var;
                }
                if (i4 != 0) {
                    tfuVar3 = tfu.f220051d;
                } else {
                    tfuVar3 = tfuVar;
                }
                if (i6 != 0) {
                    str3 = "";
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    int i111118 = n6f.f150872l;
                    jM60224n = ly5.m60224n();
                    i3 &= -458753;
                }
                int i111119 = n6f.f150872l;
                jM60224n2 = ly5.m60224n();
                i12 = i3 & (-3670017);
                j5 = jM60224n;
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                fxh0Var4 = fxh0Var3;
                tfuVar4 = tfuVar3;
            }
            xq00Var.m91790s();
            if ((i12 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((57344 & i12) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objM91750T = xq00Var.m91750T();
            if (z8) {
                objM91750T = null;
                if (wl51.m88460J0(str7)) {
                    str8 = str7;
                } else {
                    str8 = null;
                }
                if (str8 != null) {
                    BreakIterator characterInstance117 = BreakIterator.getCharacterInstance();
                    characterInstance117.setText(str8);
                    objM91750T = str8.substring(0, characterInstance117.next()).toUpperCase(Locale.ROOT);
                } else {
                    if (wl51.m88460J0(str3)) {
                        str8 = str3;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance118 = BreakIterator.getCharacterInstance();
                        characterInstance118.setText(str8);
                        objM91750T = str8.substring(0, characterInstance118.next()).toUpperCase(Locale.ROOT);
                    }
                }
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = null;
                if (wl51.m88460J0(str7)) {
                    str8 = str7;
                } else {
                    str8 = null;
                }
                if (str8 != null) {
                    BreakIterator characterInstance119 = BreakIterator.getCharacterInstance();
                    characterInstance119.setText(str8);
                    objM91750T = str8.substring(0, characterInstance119.next()).toUpperCase(Locale.ROOT);
                } else {
                    if (wl51.m88460J0(str3)) {
                        str8 = str3;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance1110 = BreakIterator.getCharacterInstance();
                        characterInstance1110.setText(str8);
                        objM91750T = str8.substring(0, characterInstance1110.next()).toUpperCase(Locale.ROOT);
                    }
                }
                xq00Var.m91793t0(objM91750T);
            }
            String str16 = (String) objM91750T;
            int i1111110 = i12 >> 6;
            i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1111110 & ContentType.LONG_FORM_ON_DEMAND);
            int i1111111 = i12;
            jM56535a = leu.m58815a(xq00Var).f112823a.f229874a.m56535a();
            tfu tfuVar12 = tfuVar4;
            boolean z17 = ((((i13 & 14) ^ 6) <= 4 && xq00Var.m91766g(str7)) || (i13 & 6) == 4) | ((((i13 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var.m91766g(str3)) || (i13 & 48) == 32);
            if (((i13 & 896) ^ 384) > 256) {
            }
            zM91764f = z17 | z3 | xq00Var.m91764f(jM56535a);
            objM91750T2 = xq00Var.m91750T();
            if (zM91764f) {
                if (j5 != 16) {
                    jM56535a = j5;
                } else if (!wl51.m88460J0(str7)) {
                    n6f[] n6fVarArr1111110 = l9f.f131080a;
                    int iAbs117 = Math.abs(str7.hashCode());
                    n6f[] n6fVarArr1111111 = l9f.f131080a;
                    jM56535a = n6fVarArr1111111[iAbs117 % n6fVarArr1111111.length].f150873a;
                } else if (!wl51.m88460J0(str3)) {
                    n6f[] n6fVarArr1111112 = l9f.f131080a;
                    int iAbs118 = Math.abs(str3.hashCode());
                    n6f[] n6fVarArr1111113 = l9f.f131080a;
                    jM56535a = n6fVarArr1111113[iAbs118 % n6fVarArr1111113.length].f150873a;
                }
                objM91750T2 = new n6f(jM56535a);
                xq00Var.m91793t0(objM91750T2);
            } else {
                if (j5 != 16) {
                    jM56535a = j5;
                } else if (!wl51.m88460J0(str7)) {
                    n6f[] n6fVarArr1111114 = l9f.f131080a;
                    int iAbs119 = Math.abs(str7.hashCode());
                    n6f[] n6fVarArr1111115 = l9f.f131080a;
                    jM56535a = n6fVarArr1111115[iAbs119 % n6fVarArr1111115.length].f150873a;
                } else if (!wl51.m88460J0(str3)) {
                    n6f[] n6fVarArr1111116 = l9f.f131080a;
                    int iAbs1110 = Math.abs(str3.hashCode());
                    n6f[] n6fVarArr1111117 = l9f.f131080a;
                    jM56535a = n6fVarArr1111117[iAbs1110 % n6fVarArr1111117.length].f150873a;
                }
                objM91750T2 = new n6f(jM56535a);
                xq00Var.m91793t0(objM91750T2);
            }
            j6 = ((n6f) objM91750T2).f150873a;
            xq00Var.m91771i0(2025223330);
            if (jM60224n2 != 16) {
                j7 = jM60224n2;
                z9 = false;
            } else {
                n6f[] n6fVarArr1111118 = l9f.f131080a;
                xq00Var.m91771i0(-1246266282);
                if (bk5.m29621l0(l9f.f131080a, new n6f(j6))) {
                    x4b x4bVar8 = iiu.f102631a;
                    u7qVar = (u7q) x4bVar8.f258038c;
                    diuVar = (diu) x4bVar8.f258037b;
                    if (as91.m27074b(j6, u7qVar.m82535g().f69968b)) {
                        j7 = diuVar.f49478c;
                    } else {
                        j7 = diuVar.f49477b;
                    }
                } else if (as91.m27074b(j6, leu.m58815a(xq00Var).f112823a.f229874a.m56535a())) {
                    j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                } else {
                    f = 255;
                    if ((((((int) (n6f.m63770g(j6) * f)) * 299) + (((int) (n6f.m63769f(j6) * f)) * 587)) + (((int) (n6f.m63767d(j6) * f)) * 114)) / 1000 >= 128) {
                        j7 = ((diu) iiu.f102631a.f258037b).f49478c;
                    } else {
                        j7 = ((diu) iiu.f102631a.f258037b).f49477b;
                    }
                }
                z9 = false;
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z9);
            m56340c(uri, tfuVar12, str16, new pk31(j6), j7, z5, fxh0Var4, xq00Var, (i1111111 & 14) | ((i1111111 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (458752 & i1111110) | ((i1111111 << 15) & 3670016));
            tfuVar2 = tfuVar12;
            fxh0Var2 = fxh0Var4;
            str5 = str7;
            j4 = jM60224n2;
            z2 = z5;
            j3 = j5;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            tfuVar2 = tfuVar;
            j3 = jM60224n;
            str5 = str4;
            j4 = j2;
        }
        str6 = str3;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rfu(uri, fxh0Var2, tfuVar2, str6, str5, j3, j4, z2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m56340c(Uri uri, tfu tfuVar, String str, pk31 pk31Var, long j, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1591255345);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(tfuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(pk31Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91764f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91768h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            iyg1.m51914a(r9g1.m75068p(sam.m77668g(mi21.m61834r(tfuVar.m80707a(xq00Var), fxh0Var), leu.f132721a.m44635a()), hmx0.f93097a), null, rkk.m75772x(-371701851, new sfu(tfuVar, str, j, pk31Var, z, uri), xq00Var), xq00Var, 3072, 6);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new svl(uri, tfuVar, str, pk31Var, j, z, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m56341d(uyi0 uyi0Var, Object obj, fxh0 fxh0Var, ob3 ob3Var, Map map, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, gh00 gh00Var4, gh00 gh00Var5, xq00 xq00Var, int i) {
        int i2;
        Map map2;
        ob3 ob3Var2;
        fxh0 fxh0Var2;
        gh00 gh00Var6;
        gh00 gh00Var7;
        gh00 gh00Var8;
        gh00 gh00Var9;
        Map map3;
        fxh0 fxh0Var3;
        ob3 ob3Var3;
        gh00 gh00Var10;
        gh00 gh00Var11;
        gh00 gh00Var12;
        gh00 gh00Var13;
        xq00Var.m91775k0(-1476019057);
        int i3 = i | (xq00Var.m91770i(uyi0Var) ? 4 : 2) | 316370304;
        int i4 = (xq00Var.m91770i(gh00Var5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var;
            ob3Var3 = ob3Var;
            map3 = map;
            gh00Var10 = gh00Var;
            gh00Var11 = gh00Var2;
            gh00Var12 = gh00Var3;
            gh00Var13 = gh00Var4;
        } else {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                wb9 wb9Var = d7f0.f46166e;
                pni0 pni0Var = pni0.f179394S0;
                pni0 pni0Var2 = pni0.f179395T0;
                i2 = i3 & (-2113929217);
                cxh0 cxh0Var = cxh0.f43038a;
                map2 = nau.f152117a;
                ob3Var2 = wb9Var;
                fxh0Var2 = cxh0Var;
                gh00Var6 = pni0Var;
                gh00Var7 = gh00Var6;
                gh00Var8 = pni0Var2;
                gh00Var9 = gh00Var8;
            } else {
                xq00Var.m91757b0();
                i2 = i3 & (-2113929217);
                fxh0Var2 = fxh0Var;
                ob3Var2 = ob3Var;
                map2 = map;
                gh00Var6 = gh00Var;
                gh00Var8 = gh00Var2;
                gh00Var7 = gh00Var3;
                gh00Var9 = gh00Var4;
            }
            xq00Var.m91790s();
            boolean zM91766g = ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91766g(null) | xq00Var.m91766g(obj);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                syi0 syi0Var = new syi0(uyi0Var.m84258k(), obj, map2);
                gh00Var5.invoke(syi0Var);
                objM91750T = syi0Var.m79705c();
                xq00Var.m91793t0(objM91750T);
            }
            m56343f(uyi0Var, (ryi0) objM91750T, fxh0Var2, ob3Var2, gh00Var6, gh00Var8, gh00Var7, gh00Var9, xq00Var, (i2 & 8078) | 100884480);
            map3 = map2;
            fxh0Var3 = fxh0Var2;
            ob3Var3 = ob3Var2;
            gh00Var10 = gh00Var6;
            gh00Var11 = gh00Var8;
            gh00Var12 = gh00Var7;
            gh00Var13 = gh00Var9;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vyi0(uyi0Var, obj, fxh0Var3, ob3Var3, map3, gh00Var10, gh00Var11, gh00Var12, gh00Var13, gh00Var5, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m56342e(uyi0 uyi0Var, String str, fxh0 fxh0Var, ob3 ob3Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, gh00 gh00Var4, gh00 gh00Var5, xq00 xq00Var, int i) {
        int i2;
        ob3 ob3Var2;
        fxh0 fxh0Var2;
        gh00 gh00Var6;
        gh00 gh00Var7;
        gh00 gh00Var8;
        gh00 gh00Var9;
        fxh0 fxh0Var3;
        ob3 ob3Var3;
        gh00 gh00Var10;
        gh00 gh00Var11;
        gh00 gh00Var12;
        gh00 gh00Var13;
        xq00Var.m91775k0(1840250294);
        int i3 = i | (xq00Var.m91770i(uyi0Var) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | 844852608;
        char c = xq00Var.m91770i(gh00Var5) ? (char) 4 : (char) 2;
        if ((306783379 & i3) == 306783378 && (c & 3) == 2 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var;
            ob3Var3 = ob3Var;
            gh00Var10 = gh00Var;
            gh00Var11 = gh00Var2;
            gh00Var12 = gh00Var3;
            gh00Var13 = gh00Var4;
        } else {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                wb9 wb9Var = d7f0.f46166e;
                pni0 pni0Var = pni0.f179397V0;
                pni0 pni0Var2 = pni0.f179398W0;
                i2 = i3 & (-264241153);
                ob3Var2 = wb9Var;
                fxh0Var2 = cxh0.f43038a;
                gh00Var6 = pni0Var;
                gh00Var7 = gh00Var6;
                gh00Var8 = pni0Var2;
                gh00Var9 = gh00Var8;
            } else {
                xq00Var.m91757b0();
                i2 = i3 & (-264241153);
                fxh0Var2 = fxh0Var;
                ob3Var2 = ob3Var;
                gh00Var6 = gh00Var;
                gh00Var8 = gh00Var2;
                gh00Var7 = gh00Var3;
                gh00Var9 = gh00Var4;
            }
            xq00Var.m91790s();
            boolean z = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((c & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                syi0 syi0Var = new syi0(uyi0Var.m84258k(), str);
                gh00Var5.invoke(syi0Var);
                objM91750T = syi0Var.m79705c();
                xq00Var.m91793t0(objM91750T);
            }
            m56343f(uyi0Var, (ryi0) objM91750T, fxh0Var2, ob3Var2, gh00Var6, gh00Var8, gh00Var7, gh00Var9, xq00Var, (i2 & 8078) | 100884480);
            fxh0Var3 = fxh0Var2;
            ob3Var3 = ob3Var2;
            gh00Var10 = gh00Var6;
            gh00Var11 = gh00Var8;
            gh00Var12 = gh00Var7;
            gh00Var13 = gh00Var9;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wsc(uyi0Var, str, fxh0Var3, ob3Var3, gh00Var10, gh00Var11, gh00Var12, gh00Var13, gh00Var5, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m56343f(uyi0 uyi0Var, ryi0 ryi0Var, fxh0 fxh0Var, ob3 ob3Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, gh00 gh00Var4, xq00 xq00Var, int i) {
        int i2;
        ryi0 ryi0Var2;
        fxh0 fxh0Var2;
        ob3 ob3Var2;
        gh00 gh00Var5;
        gh00 gh00Var6;
        elh elhVar;
        kqi0 kqi0Var;
        xq00 xq00Var2;
        fbk fbkVar;
        boolean z;
        hhr hhrVar;
        hhr hhrVar2;
        boolean z2;
        int i3;
        c791 c791Var;
        Map map;
        elh elhVar2;
        kqi0 kqi0Var2;
        xq00Var.m91775k0(-1964664536);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(uyi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ryi0Var2 = ryi0Var;
            i2 |= xq00Var.m91770i(ryi0Var2) ? 32 : 16;
        } else {
            ryi0Var2 = ryi0Var;
        }
        if ((i & 384) == 0) {
            fxh0Var2 = fxh0Var;
            i2 |= xq00Var.m91766g(fxh0Var2) ? 256 : 128;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if ((i & 3072) == 0) {
            ob3Var2 = ob3Var;
            i2 |= xq00Var.m91766g(ob3Var2) ? 2048 : 1024;
        } else {
            ob3Var2 = ob3Var;
        }
        if ((i & 24576) == 0) {
            gh00Var5 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var5) ? 16384 : 8192;
        } else {
            gh00Var5 = gh00Var;
        }
        if ((196608 & i) == 0) {
            gh00Var6 = gh00Var2;
            i2 |= xq00Var.m91770i(gh00Var6) ? 131072 : 65536;
        } else {
            gh00Var6 = gh00Var2;
        }
        if ((i & 1572864) == 0) {
            i2 |= xq00Var.m91770i(gh00Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= xq00Var.m91770i(gh00Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= xq00Var.m91770i(null) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
            xq00Var2 = xq00Var;
        } else {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            hc80 hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            ijc1 ijc1VarM41514a = ffa0.m41514a(xq00Var);
            if (ijc1VarM41514a == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            uyi0Var.m84248E(ijc1VarM41514a.mo34134w());
            uyi0Var.m84245B(ryi0Var);
            aaj0 aaj0VarM38302b = uyi0Var.m84258k().m38302b("composable");
            elh elhVar3 = aaj0VarM38302b instanceof elh ? (elh) aaj0VarM38302b : null;
            if (elhVar3 == null) {
                pgv0 pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new azi0(uyi0Var, ryi0Var2, fxh0Var2, ob3Var2, gh00Var5, gh00Var6, gh00Var3, gh00Var4, i, 1);
                    return;
                }
                return;
            }
            kqi0 kqi0VarM77671j = sam.m77671j(elhVar3.m39388k(), xq00Var, 0);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = stf1.m79253m(0.0f);
                xq00Var.m91793t0(objM91750T);
            }
            uum0 uum0Var = (uum0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T2;
            boolean z3 = ((List) kqi0VarM77671j.getValue()).size() > 1;
            boolean zM91766g = xq00Var.m91766g(kqi0VarM77671j) | xq00Var.m91766g(elhVar3);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == obj) {
                elh elhVar4 = elhVar3;
                objM91750T3 = new uyf0(4, elhVar4, uum0Var, kqi0VarM77671j, kqi0Var3, (fbk) null);
                elhVar = elhVar4;
                kqi0Var = kqi0VarM77671j;
                xq00Var.m91793t0(objM91750T3);
            } else {
                elh elhVar5 = elhVar3;
                kqi0Var = kqi0VarM77671j;
                elhVar = elhVar5;
            }
            tw41.m81628b(0, (th00) objM91750T3, xq00Var, z3);
            boolean zM91770i = xq00Var.m91770i(uyi0Var) | xq00Var.m91770i(hc80Var);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i || objM91750T4 == obj) {
                objM91750T4 = new sxh0(8, uyi0Var, hc80Var);
                xq00Var.m91793t0(objM91750T4);
            }
            hz40.m49233e(hc80Var, (gh00) objM91750T4, xq00Var);
            c8y0 c8y0VarM59893o = ltf1.m59893o(xq00Var);
            kqi0 kqi0VarM77671j2 = sam.m77671j(uyi0Var.m84261n(), xq00Var, 0);
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == obj) {
                objM91750T5 = sam.m77674m(new ye90(kqi0VarM77671j2, 15));
                xq00Var.m91793t0(objM91750T5);
            }
            rv41 rv41Var = (rv41) objM91750T5;
            uxi0 uxi0Var = (uxi0) g6f.m43689C0((List) rv41Var.getValue());
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == obj) {
                objM91750T6 = new LinkedHashMap();
                xq00Var.m91793t0(objM91750T6);
            }
            Map map2 = (Map) objM91750T6;
            xq00Var.m91771i0(653353748);
            if (uxi0Var != null) {
                boolean zM91766g2 = xq00Var.m91766g(elhVar) | ((((3670016 & i2) ^ 1572864) > 1048576 && xq00Var.m91766g(gh00Var3)) || (i2 & 1572864) == 1048576) | ((57344 & i2) == 16384);
                Object objM91750T7 = xq00Var.m91750T();
                if (zM91766g2 || objM91750T7 == obj) {
                    z2 = true;
                    i3 = i2;
                    bzi0 bzi0Var = new bzi0(elhVar, gh00Var3, gh00Var, kqi0Var3, 0);
                    xq00Var.m91793t0(bzi0Var);
                    objM91750T7 = bzi0Var;
                } else {
                    i3 = i2;
                    z2 = true;
                }
                gh00 gh00Var7 = (gh00) objM91750T7;
                boolean zM91766g3 = xq00Var.m91766g(elhVar) | (((((29360128 & i3) ^ 12582912) <= 8388608 || !xq00Var.m91766g(gh00Var4)) && (i3 & 12582912) != 8388608) ? false : z2) | ((458752 & i3) == 131072 ? z2 : false);
                Object objM91750T8 = xq00Var.m91750T();
                if (zM91766g3 || objM91750T8 == obj) {
                    bzi0 bzi0Var2 = new bzi0(elhVar, gh00Var4, gh00Var2, kqi0Var3, 1);
                    xq00Var.m91793t0(bzi0Var2);
                    objM91750T8 = bzi0Var2;
                }
                gh00 gh00Var8 = (gh00) objM91750T8;
                boolean z4 = (234881024 & i3) == 67108864 ? z2 : false;
                Object objM91750T9 = xq00Var.m91750T();
                if (z4 || objM91750T9 == obj) {
                    objM91750T9 = new e9f0(16);
                    xq00Var.m91793t0(objM91750T9);
                }
                gh00 gh00Var9 = (gh00) objM91750T9;
                Boolean bool = Boolean.TRUE;
                boolean zM91766g4 = xq00Var.m91766g(elhVar);
                Object objM91750T10 = xq00Var.m91750T();
                if (zM91766g4 || objM91750T10 == obj) {
                    objM91750T10 = new sxh0(9, rv41Var, elhVar);
                    xq00Var.m91793t0(objM91750T10);
                }
                hz40.m49233e(bool, (gh00) objM91750T10, xq00Var);
                Object objM91750T11 = xq00Var.m91750T();
                if (objM91750T11 == obj) {
                    objM91750T11 = new jez0(uxi0Var);
                    xq00Var.m91793t0(objM91750T11);
                }
                jez0 jez0Var = (jez0) objM91750T11;
                c791 c791VarM47205u = hdg1.m47205u(jez0Var, "entry", xq00Var, 56, 0);
                if (m56344g(kqi0Var3)) {
                    xq00Var.m91771i0(-1218592968);
                    Float fValueOf = Float.valueOf(uum0Var.m84031v());
                    boolean zM91766g5 = xq00Var.m91766g(kqi0Var) | xq00Var.m91770i(jez0Var);
                    Object objM91750T12 = xq00Var.m91750T();
                    if (zM91766g5 || objM91750T12 == obj) {
                        fbkVar = null;
                        objM91750T12 = new tpf0(jez0Var, kqi0Var, uum0Var, fbkVar, 22);
                        xq00Var.m91793t0(objM91750T12);
                    } else {
                        fbkVar = null;
                    }
                    hz40.m49237i(fValueOf, (th00) objM91750T12, xq00Var);
                    xq00Var.m91788r(false);
                    c791Var = c791VarM47205u;
                } else {
                    fbkVar = null;
                    xq00Var.m91771i0(-1218337931);
                    boolean zM91770i2 = xq00Var.m91770i(jez0Var) | xq00Var.m91770i(uxi0Var) | xq00Var.m91766g(c791VarM47205u);
                    Object objM91750T13 = xq00Var.m91750T();
                    if (zM91770i2 || objM91750T13 == obj) {
                        c791Var = c791VarM47205u;
                        objM91750T13 = new q0a0(jez0Var, uxi0Var, c791Var, fbkVar, 24);
                        xq00Var.m91793t0(objM91750T13);
                    } else {
                        c791Var = c791VarM47205u;
                    }
                    hz40.m49237i(uxi0Var, (th00) objM91750T13, xq00Var);
                    xq00Var.m91788r(false);
                }
                boolean zM91770i3 = xq00Var.m91770i(map2) | xq00Var.m91766g(elhVar) | xq00Var.m91766g(gh00Var7) | xq00Var.m91766g(gh00Var8) | xq00Var.m91766g(gh00Var9);
                Object objM91750T14 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T14 == obj) {
                    elh elhVar6 = elhVar;
                    objM91750T14 = new yyi0(map2, elhVar6, gh00Var7, gh00Var8, gh00Var9, rv41Var, kqi0Var3);
                    map = map2;
                    elhVar2 = elhVar6;
                    kqi0Var2 = kqi0Var3;
                    xq00Var.m91793t0(objM91750T14);
                } else {
                    elhVar2 = elhVar;
                    map = map2;
                    kqi0Var2 = kqi0Var3;
                }
                c791 c791Var2 = c791Var;
                bx4.m30753b(c791Var2, fxh0Var, (gh00) objM91750T14, ob3Var, pni0.f179396U0, rkk.m75772x(820763100, new zyi0(c8y0VarM59893o, kqi0Var2, rv41Var), xq00Var), xq00Var, ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 221184 | (i3 & 7168));
                xq00Var2 = xq00Var;
                Object objMo38160Z0 = c791Var2.f34827a.mo38160Z0();
                Object value = c791Var2.f34830d.getValue();
                boolean zM91766g6 = xq00Var2.m91766g(c791Var2) | xq00Var2.m91766g(elhVar2) | xq00Var2.m91770i(map);
                Object objM91750T15 = xq00Var2.m91750T();
                if (zM91766g6 || objM91750T15 == obj) {
                    kbi0 kbi0Var = new kbi0(3, c791Var2, map, rv41Var, elhVar2, null);
                    xq00Var2.m91793t0(kbi0Var);
                    objM91750T15 = kbi0Var;
                }
                hz40.m49236h(objMo38160Z0, value, (th00) objM91750T15, xq00Var2);
                z = false;
            } else {
                xq00Var2 = xq00Var;
                fbkVar = null;
                z = false;
            }
            xq00Var2.m91788r(z);
            aaj0 aaj0VarM38302b2 = uyi0Var.m84258k().m38302b("dialog");
            if (aaj0VarM38302b2 instanceof hhr) {
                hhrVar2 = (hhr) aaj0VarM38302b2;
            } else {
                hhrVar = fbkVar;
            }
            if (hhrVar == 0) {
                pgv0 pgv0VarM91796v2 = xq00Var2.m91796v();
                if (pgv0VarM91796v2 == null) {
                    hhrVar = hhrVar2;
                    return;
                } else {
                    hhrVar = hhrVar2;
                    pgv0VarM91796v2.f177419d = new azi0(uyi0Var, ryi0Var, fxh0Var, ob3Var, gh00Var, gh00Var2, gh00Var3, gh00Var4, i, 2);
                    return;
                }
            }
            hhrVar = hhrVar2;
            bga.m29079a(hhrVar, xq00Var2, 0);
        }
        pgv0 pgv0VarM91796v3 = xq00Var2.m91796v();
        if (pgv0VarM91796v3 != null) {
            pgv0VarM91796v3.f177419d = new azi0(uyi0Var, ryi0Var, fxh0Var, ob3Var, gh00Var, gh00Var2, gh00Var3, gh00Var4, i, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m56344g(kqi0 kqi0Var) {
        return ((Boolean) kqi0Var.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static final void m56345h(w3m w3mVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        udu qduVar;
        xq00Var.m91775k0(989427364);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(w3mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zM87112c = w3mVar.m87112c();
            AbstractC1895gf abstractC1895gfM74677b = w3mVar.m87111b() instanceof r3m ? ((r3m) w3mVar.m87111b()).m74677b() : ugu.f230259c;
            if (w3mVar.m87110a()) {
                xq00Var.m91771i0(1651937830);
                qduVar = new qdu(k0e1.m54977L(R.string.curation_button_disabled_reason, xq00Var));
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1651936344);
                xq00Var.m91788r(false);
                qduVar = sdu.f208086a;
            }
            rgu rguVarM86517r = vvx.m86517r(xq00Var);
            u3m u3mVarM87111b = w3mVar.m87111b();
            r3m r3mVar = u3mVarM87111b instanceof r3m ? (r3m) u3mVarM87111b : null;
            fxh0 fxh0VarM96830A = (r3mVar == null || !r3mVar.m74676a()) ? fxh0Var : zsf1.m96830A(fxh0Var, 16, 0.0f, 2);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new j3b(2, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37372d(zM87112c, (gh00) objM91750T, abstractC1895gfM74677b, fxh0VarM96830A, null, qduVar, rguVarM86517r, null, null, null, rkk.m75772x(-492814042, new s3y0(w3mVar, 0), xq00Var), null, rkk.m75772x(454223844, new s3y0(w3mVar, 1), xq00Var), xq00Var, 0, 390, 2960);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ylw0(i, 5, w3mVar, gh00Var, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object m56346i(i7t0 i7t0Var, int i, ibk ibkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
        hqbVar.m48222q();
        d0k[] d0kVarArr = bmu0.f28619a;
        if (d0kVarArr.length <= 0) {
            i7t0Var.subscribe(new fb8(hqbVar, i));
            return hqbVar.m48221p();
        }
        d0k d0kVar = d0kVarArr[0];
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static void m56347j(x561 x561Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                x561Var.mo38273v(i);
            } else if (obj instanceof byte[]) {
                x561Var.mo38271q((byte[]) obj, i);
            } else if (obj instanceof Float) {
                x561Var.mo38270l1(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                x561Var.mo38270l1(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                x561Var.mo38272u(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                x561Var.mo38272u(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                x561Var.mo38272u(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                x561Var.mo38272u(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                x561Var.mo38269L0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                x561Var.mo38272u(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m56348k(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX INFO: renamed from: l */
    public static long[] m56349l(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        c95.m31840f(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX INFO: renamed from: m */
    public static long m56350m(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: n */
    public static final Bitmap m56351n(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: o */
    public static int m56352o(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m56353p(hpv0 hpv0Var) {
        if (hpv0Var instanceof br60) {
            Field fieldM61884s = mif1.m61884s(hpv0Var);
            if (!(fieldM61884s != null ? fieldM61884s.isAccessible() : true)) {
                return false;
            }
            Method methodM61885t = mif1.m61885t(hpv0Var.mo32428b());
            if (!(methodM61885t != null ? methodM61885t.isAccessible() : true)) {
                return false;
            }
            Method methodM61885t2 = mif1.m61885t(((br60) hpv0Var).mo26918c());
            if (!(methodM61885t2 != null ? methodM61885t2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldM61884s2 = mif1.m61884s(hpv0Var);
            if (!(fieldM61884s2 != null ? fieldM61884s2.isAccessible() : true)) {
                return false;
            }
            Method methodM61885t3 = mif1.m61885t(hpv0Var.mo32428b());
            if (!(methodM61885t3 != null ? methodM61885t3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m56354q(String str) {
        Set set = dd41.f47702f;
        return r46.m74709B(str, gn80.SHOW_EPISODE, gn80.SHOW_EPISODE_AUTOPLAY, gn80.SHOW_EPISODE_AUTOPLAY_WITH_TIMESTAMP, gn80.SHOW_EPISODE_SCROLL, gn80.SHOW_EPISODE_TIMESTAMP, gn80.EPISODE_AUTOPLAY, gn80.EPISODE_PREVIEW_PLAYER, gn80.EPISODE_PREVIEW_PLAYLIST);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m56355r(String str) {
        Set set = dd41.f47702f;
        return r46.m74709B(str, gn80.TRACK, gn80.TRACK_AUTOPLAY);
    }

    /* JADX INFO: renamed from: s */
    public static final fxh0 m56356s(fxh0 fxh0Var) {
        return fxh0Var.mo34315F(ft60.f73121a);
    }

    /* JADX INFO: renamed from: t */
    public static lpv0 m56357t(eab eabVar, eh00 eh00Var) {
        if (eh00Var != null) {
            return new lpv0(eabVar, eh00Var);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    /* JADX INFO: renamed from: u */
    public static j561 m56358u(j561 j561Var) {
        if ((j561Var instanceof l561) || (j561Var instanceof k561)) {
            return j561Var;
        }
        return j561Var instanceof Serializable ? new k561(j561Var) : new l561(j561Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public static final cbm0 m56359v(String str) {
        switch (str.hashCode()) {
            case -1977284186:
                if (str.equals("podcasts-following-chip")) {
                    AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                    return xgg1.m90767c2();
                }
                break;
            case -1667493181:
                if (str.equals("podcasts-videos-chip")) {
                    AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                    return xgg1.m90774d2();
                }
                break;
            case -1664534946:
                if (str.equals("video-chip")) {
                    AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
                    return xgg1.m90795g2();
                }
                break;
            case -826681612:
                if (str.equals("music-chip")) {
                    AtomicReferenceArray atomicReferenceArray4 = cbm0.f36163e;
                    return xgg1.m90739Y1();
                }
                break;
            case -465439259:
                if (str.equals("audiobooks-chip")) {
                    AtomicReferenceArray atomicReferenceArray5 = cbm0.f36163e;
                    return xgg1.m90732X1();
                }
                break;
            case -396085910:
                if (str.equals("podcasts-chip")) {
                    AtomicReferenceArray atomicReferenceArray6 = cbm0.f36163e;
                    return xgg1.m90760b2();
                }
                break;
            case 0:
                if (str.equals("")) {
                    AtomicReferenceArray atomicReferenceArray7 = cbm0.f36163e;
                    return xgg1.m90725W1();
                }
                break;
            case 699650036:
                if (str.equals("trending-chip")) {
                    AtomicReferenceArray atomicReferenceArray8 = cbm0.f36163e;
                    return xgg1.m90781e2();
                }
                break;
            case 1305885844:
                if (str.equals("wrapped-chip")) {
                    AtomicReferenceArray atomicReferenceArray9 = cbm0.f36163e;
                    return xgg1.m90802h2();
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    AtomicReferenceArray atomicReferenceArray10 = cbm0.f36163e;
                    return xgg1.m90725W1();
                }
                break;
            case 1642972848:
                if (str.equals("music-following-chip")) {
                    AtomicReferenceArray atomicReferenceArray11 = cbm0.f36163e;
                    return xgg1.m90746Z1();
                }
                break;
            case 2034336249:
                if (str.equals("music-videos-chip")) {
                    AtomicReferenceArray atomicReferenceArray12 = cbm0.f36163e;
                    return xgg1.m90753a2();
                }
                break;
        }
        AtomicReferenceArray atomicReferenceArray13 = cbm0.f36163e;
        return xgg1.m90788f2();
    }

    /* JADX INFO: renamed from: w */
    public static final int m56360w(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    /* JADX INFO: renamed from: x */
    public static final byte[] m56361x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m56350m(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: y */
    public static final void m56362y(rp60 rp60Var) {
        lbb caller;
        lbb lbbVarMo25533o;
        if (rp60Var instanceof br60) {
            qr60 qr60Var = (qr60) rp60Var;
            Field fieldM61884s = mif1.m61884s(qr60Var);
            if (fieldM61884s != null) {
                fieldM61884s.setAccessible(true);
            }
            Method methodM61885t = mif1.m61885t(qr60Var.mo32428b());
            if (methodM61885t != null) {
                methodM61885t.setAccessible(true);
            }
            Method methodM61885t2 = mif1.m61885t(((br60) rp60Var).mo26918c());
            if (methodM61885t2 != null) {
                methodM61885t2.setAccessible(true);
                return;
            }
            return;
        }
        if (rp60Var instanceof qr60) {
            qr60 qr60Var2 = (qr60) rp60Var;
            Field fieldM61884s2 = mif1.m61884s(qr60Var2);
            if (fieldM61884s2 != null) {
                fieldM61884s2.setAccessible(true);
            }
            Method methodM61885t3 = mif1.m61885t(qr60Var2.mo32428b());
            if (methodM61885t3 != null) {
                methodM61885t3.setAccessible(true);
                return;
            }
            return;
        }
        if (rp60Var instanceof jr60) {
            Field fieldM61884s3 = mif1.m61884s(((jr60) rp60Var).mo27343g());
            if (fieldM61884s3 != null) {
                fieldM61884s3.setAccessible(true);
            }
            Method methodM61885t4 = mif1.m61885t((oq60) rp60Var);
            if (methodM61885t4 != null) {
                methodM61885t4.setAccessible(true);
                return;
            }
            return;
        }
        if (rp60Var instanceof uq60) {
            Field fieldM61884s4 = mif1.m61884s(((uq60) rp60Var).mo27343g());
            if (fieldM61884s4 != null) {
                fieldM61884s4.setAccessible(true);
            }
            Method methodM61885t5 = mif1.m61885t((oq60) rp60Var);
            if (methodM61885t5 != null) {
                methodM61885t5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(rp60Var instanceof oq60)) {
            throw new UnsupportedOperationException("Unknown callable: " + rp60Var + " (" + rp60Var.getClass() + ')');
        }
        oq60 oq60Var = (oq60) rp60Var;
        Method methodM61885t6 = mif1.m61885t(oq60Var);
        if (methodM61885t6 != null) {
            methodM61885t6.setAccessible(true);
        }
        cpv0 cpv0VarM52043b = j0b1.m52043b(rp60Var);
        Object objMo32243l = (cpv0VarM52043b == null || (lbbVarMo25533o = cpv0VarM52043b.mo25533o()) == null) ? null : lbbVarMo25533o.mo32243l();
        AccessibleObject accessibleObject = objMo32243l instanceof AccessibleObject ? (AccessibleObject) objMo32243l : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        cpv0 cpv0VarM52043b2 = j0b1.m52043b(oq60Var);
        Member memberMo32243l = (cpv0VarM52043b2 == null || (caller = cpv0VarM52043b2.getCaller()) == null) ? null : caller.mo32243l();
        Constructor constructor = memberMo32243l instanceof Constructor ? (Constructor) memberMo32243l : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m56363z(String str) {
        return str == null || str.isEmpty();
    }
}
