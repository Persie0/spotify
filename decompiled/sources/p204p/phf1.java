package p204p;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.facebook.FacebookException;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class phf1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f177647a;

    /* JADX WARN: Code duplicated, block: B:100:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0116  */
    /* JADX WARN: Code duplicated, block: B:106:0x011c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x013b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0145  */
    /* JADX WARN: Code duplicated, block: B:120:0x014e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0161  */
    /* JADX WARN: Code duplicated, block: B:142:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x01da  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:174:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0230  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:186:0x0304  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    /* JADX INFO: renamed from: a */
    public static final void m69982a(String str, fxh0 fxh0Var, if71 if71Var, long j, h171 h171Var, int i, boolean z, pl80 pl80Var, rx7 rx7Var, float f, FontWeight fontWeight, gh00 gh00Var, xq00 xq00Var, int i2, int i3) {
        int i4;
        fxh0 fxh0Var2;
        long j2;
        int i5;
        h171 h171Var2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        pl80 ol80Var;
        boolean z3;
        boolean z4;
        long j3;
        rx7 rx7Var2;
        FontWeight fontWeight2;
        gh00 gh00Var2;
        pl80 pl80Var2;
        fxh0 fxh0Var3;
        h171 h171Var3;
        int i10;
        float f2;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var4;
        long j4;
        h171 h171Var4;
        rx7 rx7Var3;
        int i11;
        float f3;
        FontWeight fontWeight3;
        Object objM91750T;
        int i12;
        float f4;
        h171 h171Var5;
        int i13;
        FontWeight fontWeight4;
        rx7 rx7Var4;
        long j5;
        gh00 gh00Var3;
        fxh0 fxh0Var5;
        int i14;
        xq00Var.m91775k0(761955737);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91766g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                fxh0Var2 = fxh0Var;
                i4 |= xq00Var.m91770i(fxh0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (xq00Var.m91770i(if71Var)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i4 |= i14;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    int i16 = xq00Var.m91764f(j2) ? 2048 : 1024;
                    i4 |= i16;
                } else {
                    j2 = j;
                }
                i4 |= i16;
            } else {
                j2 = j;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    h171Var2 = h171Var;
                    if (xq00Var.m91766g(h171Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        i7 = i;
                        int i17 = xq00Var.m91762e(i7) ? 131072 : 65536;
                        i4 |= i17;
                    } else {
                        i7 = i;
                    }
                    i4 |= i17;
                } else {
                    i7 = i;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & 1572864) == 0) {
                        if (xq00Var.m91768h(z2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ol80Var = pl80Var;
                        int i18 = xq00Var.m91770i(ol80Var) ? 8388608 : 4194304;
                        i4 |= i18;
                    } else {
                        ol80Var = pl80Var;
                    }
                    i4 |= i18;
                } else {
                    ol80Var = pl80Var;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !xq00Var.m91770i(rx7Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !xq00Var.m91760d(f)) ? 268435456 : 536870912;
                }
                int i19 = (((i3 & 1024) == 0 || !xq00Var.m91770i(fontWeight)) ? (char) 2 : (char) 4) | '0';
                if ((i4 & 306783379) == 306783378 || (i19 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq00Var.m91752Y(i4 & 1, z3)) {
                    xq00Var.m91761d0();
                    if ((i2 & 1) != 0 || xq00Var.m91735E()) {
                        if (i15 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                            i4 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if (i5 != 0) {
                            h171Var4 = null;
                        } else {
                            h171Var4 = h171Var2;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            i7 = 1;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 128) != 0) {
                            ol80Var = new ol80(2);
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                            rx7Var3 = px7.f182224a;
                        } else {
                            rx7Var3 = rx7Var;
                        }
                        if ((i3 & 512) != 0) {
                            gfp gfpVar = leu.f132721a;
                            Object obj = gmu.f81477a.f146343b;
                            i11 = (-1879048193) & i4;
                            f3 = 96.0f;
                        } else {
                            i11 = i4;
                            f3 = f;
                        }
                        if ((i3 & 1024) != 0) {
                            gfp gfpVar2 = leu.f132721a;
                            fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                        } else {
                            fontWeight3 = fontWeight;
                        }
                        objM91750T = xq00Var.m91750T();
                        i12 = 1;
                        if (objM91750T == t6x0.f217647t) {
                            objM91750T = g1v.f75745b;
                            xq00Var.m91793t0(objM91750T);
                        }
                        f4 = f3;
                        h171Var5 = h171Var4;
                        z4 = z2;
                        i13 = i11;
                        fontWeight4 = fontWeight3;
                        rx7Var4 = rx7Var3;
                        pl80Var2 = ol80Var;
                        j5 = j4;
                        gh00Var3 = (gh00) objM91750T;
                    } else {
                        xq00Var.m91757b0();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        f4 = f;
                        fontWeight4 = fontWeight;
                        gh00Var3 = gh00Var;
                        i13 = i4;
                        fxh0Var4 = fxh0Var2;
                        h171Var5 = h171Var2;
                        i12 = 1;
                        rx7Var4 = rx7Var;
                        long j6 = j2;
                        pl80Var2 = ol80Var;
                        z4 = z2;
                        j5 = j6;
                    }
                    i10 = i7;
                    xq00Var.m91790s();
                    if (Build.VERSION.SDK_INT >= 29 || !qfc1.m72700j(str)) {
                        fxh0Var5 = fxh0Var4;
                        xq00Var.m91771i0(522217386);
                        int i20 = i13 << 3;
                        ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i20 & 234881024) | (65534 & i13) | 196608 | (i20 & 3670016) | (i20 & 29360128), (i13 >> 24) & 14, 512);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(521820896);
                        int i21 = fontWeight4.f533a;
                        i000 i000VarM63428e0 = n0e1.m63428e0(f4);
                        j000 j000VarM63426d0 = n0e1.m63426d0(i21);
                        fxh0 fxh0Var6 = fxh0Var4;
                        h000[] h000VarArr = new h000[2];
                        h000VarArr[0] = i000VarM63428e0;
                        h000VarArr[i12] = j000VarM63426d0;
                        czz[] czzVarArr = new czz[i12];
                        czzVarArr[0] = k0e1.m54983b(new k000(h000VarArr));
                        if71 if71VarM50418a = if71.m50418a(if71Var, 0L, 0L, null, null, null, g0b1.m43263d(czzVarArr), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777183);
                        int i22 = i13 << 3;
                        fxh0Var5 = fxh0Var6;
                        ahf1.m25932d(str, fxh0Var5, if71VarM50418a, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (64638 & i13) | 196608 | (i22 & 3670016) | (i22 & 29360128) | (i22 & 234881024), (i13 >> 24) & 14, 512);
                        xq00Var.m91788r(false);
                    }
                    fxh0Var3 = fxh0Var5;
                    gh00Var2 = gh00Var3;
                    rx7Var2 = rx7Var4;
                    fontWeight2 = fontWeight4;
                    f2 = f4;
                    h171Var3 = h171Var5;
                    j3 = j5;
                } else {
                    xq00Var.m91757b0();
                    long j7 = j2;
                    z4 = z2;
                    j3 = j7;
                    rx7Var2 = rx7Var;
                    fontWeight2 = fontWeight;
                    gh00Var2 = gh00Var;
                    pl80Var2 = ol80Var;
                    fxh0Var3 = fxh0Var2;
                    h171Var3 = h171Var2;
                    i10 = i7;
                    f2 = f;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new h1v(str, fxh0Var3, if71Var, j3, h171Var3, i10, z4, pl80Var2, rx7Var2, f2, fontWeight2, gh00Var2, i2, i3);
                }
            }
            i4 |= 24576;
            h171Var2 = h171Var;
            if ((i2 & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    i7 = i;
                    if (xq00Var.m91762e(i7)) {
                    }
                    i4 |= i17;
                } else {
                    i7 = i;
                }
                i4 |= i17;
            } else {
                i7 = i;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 1572864) == 0) {
                    if (xq00Var.m91768h(z2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ol80Var = pl80Var;
                    if (xq00Var.m91770i(ol80Var)) {
                    }
                    i4 |= i18;
                } else {
                    ol80Var = pl80Var;
                }
                i4 |= i18;
            } else {
                ol80Var = pl80Var;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !xq00Var.m91770i(rx7Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !xq00Var.m91760d(f)) ? 268435456 : 536870912;
            }
            int i110 = (((i3 & 1024) == 0 || !xq00Var.m91770i(fontWeight)) ? (char) 2 : (char) 4) | '0';
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (xq00Var.m91752Y(i4 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                        i4 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if (i5 != 0) {
                        h171Var4 = null;
                    } else {
                        h171Var4 = h171Var2;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 128) != 0) {
                        ol80Var = new ol80(2);
                        i4 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                        rx7Var3 = px7.f182224a;
                    } else {
                        rx7Var3 = rx7Var;
                    }
                    if ((i3 & 512) != 0) {
                        gfp gfpVar3 = leu.f132721a;
                        Object obj2 = gmu.f81477a.f146343b;
                        i11 = (-1879048193) & i4;
                        f3 = 96.0f;
                    } else {
                        i11 = i4;
                        f3 = f;
                    }
                    if ((i3 & 1024) != 0) {
                        gfp gfpVar4 = leu.f132721a;
                        fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objM91750T = xq00Var.m91750T();
                    i12 = 1;
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = g1v.f75745b;
                        xq00Var.m91793t0(objM91750T);
                    }
                    f4 = f3;
                    h171Var5 = h171Var4;
                    z4 = z2;
                    i13 = i11;
                    fontWeight4 = fontWeight3;
                    rx7Var4 = rx7Var3;
                    pl80Var2 = ol80Var;
                    j5 = j4;
                    gh00Var3 = (gh00) objM91750T;
                } else {
                    if (i15 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                        i4 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if (i5 != 0) {
                        h171Var4 = null;
                    } else {
                        h171Var4 = h171Var2;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 128) != 0) {
                        ol80Var = new ol80(2);
                        i4 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                        rx7Var3 = px7.f182224a;
                    } else {
                        rx7Var3 = rx7Var;
                    }
                    if ((i3 & 512) != 0) {
                        gfp gfpVar5 = leu.f132721a;
                        Object obj3 = gmu.f81477a.f146343b;
                        i11 = (-1879048193) & i4;
                        f3 = 96.0f;
                    } else {
                        i11 = i4;
                        f3 = f;
                    }
                    if ((i3 & 1024) != 0) {
                        gfp gfpVar6 = leu.f132721a;
                        fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objM91750T = xq00Var.m91750T();
                    i12 = 1;
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = g1v.f75745b;
                        xq00Var.m91793t0(objM91750T);
                    }
                    f4 = f3;
                    h171Var5 = h171Var4;
                    z4 = z2;
                    i13 = i11;
                    fontWeight4 = fontWeight3;
                    rx7Var4 = rx7Var3;
                    pl80Var2 = ol80Var;
                    j5 = j4;
                    gh00Var3 = (gh00) objM91750T;
                }
                i10 = i7;
                xq00Var.m91790s();
                if (Build.VERSION.SDK_INT >= 29) {
                    fxh0Var5 = fxh0Var4;
                    xq00Var.m91771i0(522217386);
                    int i23 = i13 << 3;
                    ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i23 & 234881024) | (65534 & i13) | 196608 | (i23 & 3670016) | (i23 & 29360128), (i13 >> 24) & 14, 512);
                    xq00Var.m91788r(false);
                } else {
                    fxh0Var5 = fxh0Var4;
                    xq00Var.m91771i0(522217386);
                    int i24 = i13 << 3;
                    ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i24 & 234881024) | (65534 & i13) | 196608 | (i24 & 3670016) | (i24 & 29360128), (i13 >> 24) & 14, 512);
                    xq00Var.m91788r(false);
                }
                fxh0Var3 = fxh0Var5;
                gh00Var2 = gh00Var3;
                rx7Var2 = rx7Var4;
                fontWeight2 = fontWeight4;
                f2 = f4;
                h171Var3 = h171Var5;
                j3 = j5;
            } else {
                xq00Var.m91757b0();
                long j8 = j2;
                z4 = z2;
                j3 = j8;
                rx7Var2 = rx7Var;
                fontWeight2 = fontWeight;
                gh00Var2 = gh00Var;
                pl80Var2 = ol80Var;
                fxh0Var3 = fxh0Var2;
                h171Var3 = h171Var2;
                i10 = i7;
                f2 = f;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new h1v(str, fxh0Var3, if71Var, j3, h171Var3, i10, z4, pl80Var2, rx7Var2, f2, fontWeight2, gh00Var2, i2, i3);
            }
        }
        i4 |= 48;
        fxh0Var2 = fxh0Var;
        if ((i2 & 384) == 0) {
            if (xq00Var.m91770i(if71Var)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i4 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j2 = j;
                if (xq00Var.m91764f(j2)) {
                }
                i4 |= i16;
            } else {
                j2 = j;
            }
            i4 |= i16;
        } else {
            j2 = j;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                h171Var2 = h171Var;
                if (xq00Var.m91766g(h171Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i2 & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    i7 = i;
                    if (xq00Var.m91762e(i7)) {
                    }
                    i4 |= i17;
                } else {
                    i7 = i;
                }
                i4 |= i17;
            } else {
                i7 = i;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 1572864) == 0) {
                    if (xq00Var.m91768h(z2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ol80Var = pl80Var;
                    if (xq00Var.m91770i(ol80Var)) {
                    }
                    i4 |= i18;
                } else {
                    ol80Var = pl80Var;
                }
                i4 |= i18;
            } else {
                ol80Var = pl80Var;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !xq00Var.m91770i(rx7Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !xq00Var.m91760d(f)) ? 268435456 : 536870912;
            }
            int i111 = (((i3 & 1024) == 0 || !xq00Var.m91770i(fontWeight)) ? (char) 2 : (char) 4) | '0';
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (xq00Var.m91752Y(i4 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                        i4 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if (i5 != 0) {
                        h171Var4 = null;
                    } else {
                        h171Var4 = h171Var2;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 128) != 0) {
                        ol80Var = new ol80(2);
                        i4 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                        rx7Var3 = px7.f182224a;
                    } else {
                        rx7Var3 = rx7Var;
                    }
                    if ((i3 & 512) != 0) {
                        gfp gfpVar7 = leu.f132721a;
                        Object obj4 = gmu.f81477a.f146343b;
                        i11 = (-1879048193) & i4;
                        f3 = 96.0f;
                    } else {
                        i11 = i4;
                        f3 = f;
                    }
                    if ((i3 & 1024) != 0) {
                        gfp gfpVar8 = leu.f132721a;
                        fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objM91750T = xq00Var.m91750T();
                    i12 = 1;
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = g1v.f75745b;
                        xq00Var.m91793t0(objM91750T);
                    }
                    f4 = f3;
                    h171Var5 = h171Var4;
                    z4 = z2;
                    i13 = i11;
                    fontWeight4 = fontWeight3;
                    rx7Var4 = rx7Var3;
                    pl80Var2 = ol80Var;
                    j5 = j4;
                    gh00Var3 = (gh00) objM91750T;
                } else {
                    if (i15 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                        i4 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if (i5 != 0) {
                        h171Var4 = null;
                    } else {
                        h171Var4 = h171Var2;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 128) != 0) {
                        ol80Var = new ol80(2);
                        i4 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                        rx7Var3 = px7.f182224a;
                    } else {
                        rx7Var3 = rx7Var;
                    }
                    if ((i3 & 512) != 0) {
                        gfp gfpVar9 = leu.f132721a;
                        Object obj5 = gmu.f81477a.f146343b;
                        i11 = (-1879048193) & i4;
                        f3 = 96.0f;
                    } else {
                        i11 = i4;
                        f3 = f;
                    }
                    if ((i3 & 1024) != 0) {
                        gfp gfpVar10 = leu.f132721a;
                        fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                    } else {
                        fontWeight3 = fontWeight;
                    }
                    objM91750T = xq00Var.m91750T();
                    i12 = 1;
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = g1v.f75745b;
                        xq00Var.m91793t0(objM91750T);
                    }
                    f4 = f3;
                    h171Var5 = h171Var4;
                    z4 = z2;
                    i13 = i11;
                    fontWeight4 = fontWeight3;
                    rx7Var4 = rx7Var3;
                    pl80Var2 = ol80Var;
                    j5 = j4;
                    gh00Var3 = (gh00) objM91750T;
                }
                i10 = i7;
                xq00Var.m91790s();
                if (Build.VERSION.SDK_INT >= 29) {
                    fxh0Var5 = fxh0Var4;
                    xq00Var.m91771i0(522217386);
                    int i25 = i13 << 3;
                    ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i25 & 234881024) | (65534 & i13) | 196608 | (i25 & 3670016) | (i25 & 29360128), (i13 >> 24) & 14, 512);
                    xq00Var.m91788r(false);
                } else {
                    fxh0Var5 = fxh0Var4;
                    xq00Var.m91771i0(522217386);
                    int i26 = i13 << 3;
                    ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i26 & 234881024) | (65534 & i13) | 196608 | (i26 & 3670016) | (i26 & 29360128), (i13 >> 24) & 14, 512);
                    xq00Var.m91788r(false);
                }
                fxh0Var3 = fxh0Var5;
                gh00Var2 = gh00Var3;
                rx7Var2 = rx7Var4;
                fontWeight2 = fontWeight4;
                f2 = f4;
                h171Var3 = h171Var5;
                j3 = j5;
            } else {
                xq00Var.m91757b0();
                long j9 = j2;
                z4 = z2;
                j3 = j9;
                rx7Var2 = rx7Var;
                fontWeight2 = fontWeight;
                gh00Var2 = gh00Var;
                pl80Var2 = ol80Var;
                fxh0Var3 = fxh0Var2;
                h171Var3 = h171Var2;
                i10 = i7;
                f2 = f;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new h1v(str, fxh0Var3, if71Var, j3, h171Var3, i10, z4, pl80Var2, rx7Var2, f2, fontWeight2, gh00Var2, i2, i3);
            }
        }
        i4 |= 24576;
        h171Var2 = h171Var;
        if ((i2 & 196608) == 0) {
            if ((i3 & 32) == 0) {
                i7 = i;
                if (xq00Var.m91762e(i7)) {
                }
                i4 |= i17;
            } else {
                i7 = i;
            }
            i4 |= i17;
        } else {
            i7 = i;
        }
        i8 = i3 & 64;
        if (i8 != 0) {
            i4 |= 1572864;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 1572864) == 0) {
                if (xq00Var.m91768h(z2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
        }
        if ((i2 & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                ol80Var = pl80Var;
                if (xq00Var.m91770i(ol80Var)) {
                }
                i4 |= i18;
            } else {
                ol80Var = pl80Var;
            }
            i4 |= i18;
        } else {
            ol80Var = pl80Var;
        }
        if ((i2 & 100663296) != 0) {
            i4 |= ((i3 & 256) == 0 || !xq00Var.m91770i(rx7Var)) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !xq00Var.m91760d(f)) ? 268435456 : 536870912;
        }
        int i112 = (((i3 & 1024) == 0 || !xq00Var.m91770i(fontWeight)) ? (char) 2 : (char) 4) | '0';
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (xq00Var.m91752Y(i4 & 1, z3)) {
            xq00Var.m91761d0();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if ((i3 & 8) != 0) {
                    j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                    i4 &= -7169;
                } else {
                    j4 = j2;
                }
                if (i5 != 0) {
                    h171Var4 = null;
                } else {
                    h171Var4 = h171Var2;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i7 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i3 & 128) != 0) {
                    ol80Var = new ol80(2);
                    i4 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                    rx7Var3 = px7.f182224a;
                } else {
                    rx7Var3 = rx7Var;
                }
                if ((i3 & 512) != 0) {
                    gfp gfpVar11 = leu.f132721a;
                    Object obj6 = gmu.f81477a.f146343b;
                    i11 = (-1879048193) & i4;
                    f3 = 96.0f;
                } else {
                    i11 = i4;
                    f3 = f;
                }
                if ((i3 & 1024) != 0) {
                    gfp gfpVar12 = leu.f132721a;
                    fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                } else {
                    fontWeight3 = fontWeight;
                }
                objM91750T = xq00Var.m91750T();
                i12 = 1;
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = g1v.f75745b;
                    xq00Var.m91793t0(objM91750T);
                }
                f4 = f3;
                h171Var5 = h171Var4;
                z4 = z2;
                i13 = i11;
                fontWeight4 = fontWeight3;
                rx7Var4 = rx7Var3;
                pl80Var2 = ol80Var;
                j5 = j4;
                gh00Var3 = (gh00) objM91750T;
            } else {
                if (i15 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if ((i3 & 8) != 0) {
                    j4 = ((n6f) xq00Var.m91774k(xju.f262232a)).f150873a;
                    i4 &= -7169;
                } else {
                    j4 = j2;
                }
                if (i5 != 0) {
                    h171Var4 = null;
                } else {
                    h171Var4 = h171Var2;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i7 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i3 & 128) != 0) {
                    ol80Var = new ol80(2);
                    i4 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                    rx7Var3 = px7.f182224a;
                } else {
                    rx7Var3 = rx7Var;
                }
                if ((i3 & 512) != 0) {
                    gfp gfpVar13 = leu.f132721a;
                    Object obj7 = gmu.f81477a.f146343b;
                    i11 = (-1879048193) & i4;
                    f3 = 96.0f;
                } else {
                    i11 = i4;
                    f3 = f;
                }
                if ((i3 & 1024) != 0) {
                    gfp gfpVar14 = leu.f132721a;
                    fontWeight3 = (FontWeight) ((sdo) gmu.f81477a.f146344c).f208048b;
                } else {
                    fontWeight3 = fontWeight;
                }
                objM91750T = xq00Var.m91750T();
                i12 = 1;
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = g1v.f75745b;
                    xq00Var.m91793t0(objM91750T);
                }
                f4 = f3;
                h171Var5 = h171Var4;
                z4 = z2;
                i13 = i11;
                fontWeight4 = fontWeight3;
                rx7Var4 = rx7Var3;
                pl80Var2 = ol80Var;
                j5 = j4;
                gh00Var3 = (gh00) objM91750T;
            }
            i10 = i7;
            xq00Var.m91790s();
            if (Build.VERSION.SDK_INT >= 29) {
                fxh0Var5 = fxh0Var4;
                xq00Var.m91771i0(522217386);
                int i27 = i13 << 3;
                ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i27 & 234881024) | (65534 & i13) | 196608 | (i27 & 3670016) | (i27 & 29360128), (i13 >> 24) & 14, 512);
                xq00Var.m91788r(false);
            } else {
                fxh0Var5 = fxh0Var4;
                xq00Var.m91771i0(522217386);
                int i28 = i13 << 3;
                ahf1.m25932d(str, fxh0Var5, if71Var, j5, h171Var5, gh00Var3, i10, z4, pl80Var2, 0, rx7Var4, xq00Var, (i28 & 234881024) | (65534 & i13) | 196608 | (i28 & 3670016) | (i28 & 29360128), (i13 >> 24) & 14, 512);
                xq00Var.m91788r(false);
            }
            fxh0Var3 = fxh0Var5;
            gh00Var2 = gh00Var3;
            rx7Var2 = rx7Var4;
            fontWeight2 = fontWeight4;
            f2 = f4;
            h171Var3 = h171Var5;
            j3 = j5;
        } else {
            xq00Var.m91757b0();
            long j10 = j2;
            z4 = z2;
            j3 = j10;
            rx7Var2 = rx7Var;
            fontWeight2 = fontWeight;
            gh00Var2 = gh00Var;
            pl80Var2 = ol80Var;
            fxh0Var3 = fxh0Var2;
            h171Var3 = h171Var2;
            i10 = i7;
            f2 = f;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new h1v(str, fxh0Var3, if71Var, j3, h171Var3, i10, z4, pl80Var2, rx7Var2, f2, fontWeight2, gh00Var2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m69983b(int i, int i2, int i3, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(113022781);
        int i4 = i3 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91762e(i2) ? 32 : 16) | (xq00Var.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            String strM54978M = k0e1.m54978M(R.string.music_quiz_round_indicator, new Object[]{wl51.m88467Q0(2, String.valueOf(i))}, xq00Var);
            g15 g15VarM42471o = fr0.m42471o(1240719572, xq00Var);
            int iM43338n = g15VarM42471o.m43338n(new ew31(leu.m58815a(xq00Var).f112824b.f138757a, 0L, leu.m58818d(xq00Var).f64975k.f101704a.f63412c, leu.m58818d(xq00Var).f64969e.f101704a.f63413d, (FontSynthesis) null, leu.m58818d(xq00Var).f64969e.f101704a.f63415f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
            try {
                g15VarM42471o.m43331g(strM54978M);
                g15VarM42471o.m43335k(iM43338n);
                int iM43338n2 = g15VarM42471o.m43338n(new ew31(((hiu) iiu.f102631a.f258040e).f91880k, 0L, leu.m58818d(xq00Var).f64975k.f101704a.f63412c, leu.m58818d(xq00Var).f64975k.f101704a.f63413d, (FontSynthesis) null, leu.m58818d(xq00Var).f64969e.f101704a.f63415f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
                try {
                    g15VarM42471o.m43331g(" /" + wl51.m88467Q0(2, String.valueOf(i2)));
                    ahf1.m25933e(tfe.m80653k(g15VarM42471o, iM43338n2, xq00Var, false), zsf1.m96865y(leu.m58816b(xq00Var).f117233e.f137887c, fxh0Var), leu.m58818d(xq00Var).f64969e, 0L, new h171(5), null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4072);
                } catch (Throwable th) {
                    g15VarM42471o.m43335k(iM43338n2);
                    throw th;
                }
            } catch (Throwable th2) {
                g15VarM42471o.m43335k(iM43338n);
                throw th2;
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s7c(i, i2, i3, 14, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m69984c(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1479118350);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (xq00Var.m91770i(fxh0Var) ? 4 : 2);
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0Var3 = i4 != 0 ? cxh0Var : fxh0Var;
            fxh0 fxh0VarM39673I = epv0.m39673I("PremiumSignifier", fxh0Var3);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            y85.m93057b(kvu.f126953c, qgj.f188480a, epv0.m39673I("PremiumSignifierIcon", mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var)), leu.m58815a(xq00Var).f112825c.f221220c, 0L, false, xq00Var, kvu.f126954d | 48, 48);
            riw0.m75615i(xq00Var, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224759b, cxh0Var));
            ahf1.m25932d(k0e1.m54977L(R.string.premium_signifier_text, xq00Var), epv0.m39673I("PremiumSignifierText", cxh0Var), leu.m58818d(xq00Var).f64978n, leu.m58815a(xq00Var).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var.m91788r(true);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dxa0(fxh0Var2, i, i2, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final nzs0 m69985d(sdd sddVar, rdd rddVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        rv01 rv01Var;
        xcl0 xcl0Var = sddVar.f207984a;
        rv01 rv01Var2 = sddVar.f207994k;
        mcd mcdVarM70001t = m70001t(xcl0Var, z7);
        mcd mcdVarM70001t2 = m70001t(rddVar.f198094a, z7);
        boolean z8 = mcdVarM70001t2 != null && (!mcdVarM70001t2.equals(mcdVarM70001t) || rv01Var2 == null);
        xcl0 xcl0Var2 = rddVar.f198094a;
        boolean z9 = z ? rddVar.f198097d : false;
        boolean z10 = z3 ? rddVar.f198096c : false;
        boolean z11 = rddVar.f198098e;
        int i = z4 ? rddVar.f198095b : 1;
        if (mcdVarM70001t2 == null) {
            rv01Var = null;
        } else {
            if (z8) {
                rv01Var2 = zu01.f286314a;
            }
            rv01Var = rv01Var2;
        }
        sdd sddVarM70002u = m70002u(sdd.m77831a(sddVar, xcl0Var2, z9, z2, z10, z11, i, null, false, null, null, rv01Var, 960), z5, z6);
        if (!z8) {
            mcdVarM70001t2 = null;
        }
        return new nzs0(sddVarM70002u, mcdVarM70001t2);
    }

    /* JADX INFO: renamed from: e */
    public static void m69986e(Application application, final String str) {
        if (!p8y.f175096q.get()) {
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }
        if (!pp3.f179880c) {
            if (n95.m63887h() == null) {
                m95.m61180o();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM63887h = n95.m63887h();
            if (scheduledThreadPoolExecutorM63887h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutorM63887h.execute(new RunnableC2034k(4));
        }
        poa1 poa1Var = poa1.f179658a;
        if (!p2l.f173365a.contains(poa1.class)) {
            try {
                if (!poa1.f179660c.get()) {
                    poa1.f179658a.m70485b();
                }
            } catch (Throwable th) {
                p2l.m68953a(poa1.class, th);
            }
        }
        Set set = p2l.f173365a;
        if (!set.contains(p8y.class)) {
            try {
                final Context applicationContext = application.getApplicationContext();
                if (applicationContext != null) {
                    final int i = 0;
                    if (!jty.m54319b("app_events_killswitch", p8y.m69344b(), false)) {
                        p8y.m69345c().execute(new Runnable() { // from class: p.n8y
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        Context context = applicationContext;
                                        String str2 = str;
                                        p8y p8yVar = p8y.f175080a;
                                        if (p2l.f173365a.contains(p8yVar)) {
                                            return;
                                        }
                                        try {
                                            nr6 nr6VarM43305j = g0g1.m43305j(context);
                                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                            String strConcat = str2.concat("ping");
                                            long j = sharedPreferences.getLong(strConcat, 0L);
                                            try {
                                                o95 o95Var = o95.f162945a;
                                                String strM69992k = phf1.m69992k(context);
                                                zn91.m96564m0();
                                                JSONObject jSONObjectM69358a = p95.m69358a(o95Var, nr6VarM43305j, strM69992k, context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false), context);
                                                String strM61179n = m95.m61179n();
                                                if (strM61179n != null) {
                                                    jSONObjectM69358a.put("install_referrer", strM61179n);
                                                }
                                                String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str2}, 1));
                                                p8y.f175099t.getClass();
                                                String str4 = dx10.f53819j;
                                                dx10 dx10VarM48883s = hvi0.m48883s(null, str3, jSONObjectM69358a, null);
                                                if (j == 0 && dx10VarM48883s.m37181c().f85147c == null) {
                                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                    editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                    editorEdit.apply();
                                                    iq3 iq3Var = tra0.f223025b;
                                                    synchronized (p8y.f175081b) {
                                                    }
                                                    return;
                                                }
                                                return;
                                            } catch (JSONException e) {
                                                throw new FacebookException("An error occurred while publishing install.", e);
                                            }
                                        } catch (Exception unused) {
                                            return;
                                        } catch (Throwable th2) {
                                            p2l.m68953a(p8yVar, th2);
                                            return;
                                        }
                                    default:
                                        Context context2 = applicationContext;
                                        String str5 = str;
                                        Set set2 = p2l.f173365a;
                                        if (set2.contains(ial0.class)) {
                                            return;
                                        }
                                        try {
                                            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                            String strConcat2 = str5.concat("pingForOnDevice");
                                            if (sharedPreferences2.getLong(strConcat2, 0L) == 0) {
                                                new0 new0Var = new0.f153138b;
                                                if (!set2.contains(new0.class)) {
                                                    try {
                                                        new0.f153138b.m64310c(str5, 1, lau.f131415a);
                                                    } catch (Throwable th3) {
                                                        p2l.m68953a(new0.class, th3);
                                                    }
                                                    break;
                                                }
                                                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                editorEdit2.apply();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            p2l.m68953a(ial0.class, th4);
                                            return;
                                        }
                                }
                            }
                        });
                    }
                    if (hgy.m47481b(fgy.OnDeviceEventProcessing) && ial0.m50092a() && !set.contains(ial0.class)) {
                        try {
                            final Context contextM69343a = p8y.m69343a();
                            final int i2 = 1;
                            p8y.m69345c().execute(new Runnable() { // from class: p.n8y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            Context context = contextM69343a;
                                            String str2 = str;
                                            p8y p8yVar = p8y.f175080a;
                                            if (p2l.f173365a.contains(p8yVar)) {
                                                return;
                                            }
                                            try {
                                                nr6 nr6VarM43305j = g0g1.m43305j(context);
                                                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                String strConcat = str2.concat("ping");
                                                long j = sharedPreferences.getLong(strConcat, 0L);
                                                try {
                                                    o95 o95Var = o95.f162945a;
                                                    String strM69992k = phf1.m69992k(context);
                                                    zn91.m96564m0();
                                                    JSONObject jSONObjectM69358a = p95.m69358a(o95Var, nr6VarM43305j, strM69992k, context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false), context);
                                                    String strM61179n = m95.m61179n();
                                                    if (strM61179n != null) {
                                                        jSONObjectM69358a.put("install_referrer", strM61179n);
                                                    }
                                                    String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str2}, 1));
                                                    p8y.f175099t.getClass();
                                                    String str4 = dx10.f53819j;
                                                    dx10 dx10VarM48883s = hvi0.m48883s(null, str3, jSONObjectM69358a, null);
                                                    if (j == 0 && dx10VarM48883s.m37181c().f85147c == null) {
                                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                        editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                        editorEdit.apply();
                                                        iq3 iq3Var = tra0.f223025b;
                                                        synchronized (p8y.f175081b) {
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                } catch (JSONException e) {
                                                    throw new FacebookException("An error occurred while publishing install.", e);
                                                }
                                            } catch (Exception unused) {
                                                return;
                                            } catch (Throwable th2) {
                                                p2l.m68953a(p8yVar, th2);
                                                return;
                                            }
                                        default:
                                            Context context2 = contextM69343a;
                                            String str5 = str;
                                            Set set2 = p2l.f173365a;
                                            if (set2.contains(ial0.class)) {
                                                return;
                                            }
                                            try {
                                                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                String strConcat2 = str5.concat("pingForOnDevice");
                                                if (sharedPreferences2.getLong(strConcat2, 0L) == 0) {
                                                    new0 new0Var = new0.f153138b;
                                                    if (!set2.contains(new0.class)) {
                                                        try {
                                                            new0.f153138b.m64310c(str5, 1, lau.f131415a);
                                                        } catch (Throwable th3) {
                                                            p2l.m68953a(new0.class, th3);
                                                        }
                                                        break;
                                                    }
                                                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                                    editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                    editorEdit2.apply();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th4) {
                                                p2l.m68953a(ial0.class, th4);
                                                return;
                                            }
                                    }
                                }
                            });
                        } catch (Throwable th2) {
                            p2l.m68953a(ial0.class, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                p2l.m68953a(p8y.class, th3);
            }
        }
        mf0.m61602d(application, str);
        if (hgy.m47481b(fgy.GPSPACAProcessing)) {
            k2m0 k2m0Var = k2m0.f118665a;
            if (!p2l.f173365a.contains(k2m0Var)) {
                try {
                    if (!k2m0.f118667c) {
                        k2m0.m55195a();
                    }
                    if (k2m0.f118666b) {
                        k2m0Var.m55196b(str, "fb_mobile_app_install");
                    }
                } catch (Throwable th4) {
                    p2l.m68953a(k2m0Var, th4);
                }
            }
        }
        if (hgy.m47481b(fgy.GPSARATriggers)) {
            aq10.f18053a.m26740d(str, new v85("unknown", "MOBILE_INSTALL_EVENT", null, null, false, mf0.m61601c(), mf0.m61600b(), null));
        }
    }

    /* JADX INFO: renamed from: f */
    public static nu91 m69987f() {
        return new nu91();
    }

    /* JADX INFO: renamed from: g */
    public static iul m69988g(Context context, xre xreVar, boolean z, eh00 eh00Var) {
        aos aosVar;
        File file = new File(context.getCacheDir(), "cronet-cache");
        file.mkdirs();
        AtomicReference atomicReference = new AtomicReference(null);
        int i = 4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(4);
        wj50.m88279p(scheduledExecutorServiceNewScheduledThreadPool);
        iul iulVar = new iul(atomicReference, scheduledExecutorServiceNewScheduledThreadPool, file, xreVar, eh00Var, z);
        vj10 vj10Var = gul.f84501a;
        ev61 ev61Var = new ev61();
        y7h1 y7h1Var = ev61Var.f63172a;
        synchronized (gul.f84502b) {
            aosVar = gul.f84503c;
        }
        if (aosVar != null) {
            ev61Var.m40097b(null);
        } else {
            new Thread(new RunnableC2650zh(context, ev61Var, false, i)).start();
        }
        y7h1Var.mo1512d(scheduledExecutorServiceNewScheduledThreadPool, new hul(context, z, file, atomicReference));
        y7h1Var.mo1511c(scheduledExecutorServiceNewScheduledThreadPool, hcp0.f89854M0);
        return iulVar;
    }

    /* JADX INFO: renamed from: h */
    public static final String m69989h(List list) {
        StringBuilder sb = new StringBuilder(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            sb.append((String) list.get(i));
            i++;
            if (i < list.size()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final float m69990i(int i, int i2, boolean z) {
        return z ? m69991j(i, i2) + 100 : m69991j(i, i2);
    }

    /* JADX INFO: renamed from: j */
    public static final float m69991j(int i, int i2) {
        return (i * CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER) + i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000d, B:8:0x0013, B:15:0x0033, B:17:0x0039, B:24:0x005b, B:23:0x0058, B:14:0x0030, B:20:0x0054, B:11:0x002c), top: B:37:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0039, please report this as an issue */
    /* JADX INFO: renamed from: k */
    public static String m69992k(Context context) {
        String str;
        if (n95.m63886e() == null) {
            synchronized (n95.m63888i()) {
                if (n95.m63886e() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!p2l.f173365a.contains(n95.class)) {
                        try {
                            n95.f151711e = string;
                        } catch (Throwable th) {
                            p2l.m68953a(n95.class, th);
                        }
                        if (n95.m63886e() == null) {
                            str = "XZ" + UUID.randomUUID();
                            if (!p2l.f173365a.contains(n95.class)) {
                                n95.f151711e = str;
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", n95.m63886e()).apply();
                        }
                    } else if (n95.m63886e() == null) {
                        str = "XZ" + UUID.randomUUID();
                        if (!p2l.f173365a.contains(n95.class)) {
                            try {
                                n95.f151711e = str;
                            } catch (Throwable th2) {
                                p2l.m68953a(n95.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", n95.m63886e()).apply();
                    }
                }
            }
        }
        String strM63886e = n95.m63886e();
        if (strM63886e != null) {
            return strM63886e;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: l */
    public static File[] m69993l(Context context) {
        return context.getExternalMediaDirs();
    }

    /* JADX INFO: renamed from: m */
    public static int m69994m() {
        return m95.m61178m();
    }

    /* JADX INFO: renamed from: n */
    public static void m69995n(Context context, String str) {
        p8y p8yVar = p8y.f175080a;
        if (dwa1.m37142c()) {
            n95 n95Var = new n95(context, str);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM63887h = n95.m63887h();
            if (scheduledThreadPoolExecutorM63887h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutorM63887h.execute(new fr2(8, context, n95Var));
        }
    }

    /* JADX INFO: renamed from: o */
    public static final fxh0 m69996o(fxh0 fxh0Var, lr60 lr60Var, cw70 cw70Var, vvl0 vvl0Var, boolean z, boolean z2) {
        return fxh0Var.mo34315F(new fw70(lr60Var, cw70Var, vvl0Var, z, z2));
    }

    /* JADX INFO: renamed from: p */
    public static final r9b0 m69997p(Context context, int i) {
        r9b0 r9b0Var = new r9b0();
        u8b0 u8b0Var = z8b0.m95573f(i, context, z8b0.m95578k(context, i)).f35791a;
        if (u8b0Var == null) {
            throw new IllegalArgumentException("Lottie composition cannot be null");
        }
        r9b0Var.m75033n(u8b0Var);
        qlo qloVar = x0b1.f256851a;
        r9b0Var.f196992c = !(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
        return r9b0Var;
    }

    /* JADX INFO: renamed from: q */
    public static u6h0 m69998q(String str) {
        return new u6h0(str);
    }

    /* JADX INFO: renamed from: r */
    public static egb1 m69999r(Context context) {
        return new egb1(context);
    }

    /* JADX INFO: renamed from: s */
    public static final int m70000s(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return R.attr.encoreListRowBordered;
        }
        if (iM38547C == 1) {
            return R.attr.encoreListRowContrasting;
        }
        if (iM38547C == 2) {
            return R.attr.encoreListRowElevated;
        }
        if (iM38547C == 3) {
            return R.attr.encoreListRowNaked;
        }
        if (iM38547C == 4) {
            return R.attr.encoreListRowTinted;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    public static final mcd m70001t(xcl0 xcl0Var, boolean z) {
        ocl0 ocl0Var = xcl0Var instanceof ocl0 ? (ocl0) xcl0Var : null;
        yea0 yea0Var = ocl0Var != null ? ocl0Var.f163956f : null;
        if (z && ocl0Var != null && !(ocl0Var.f163955e instanceof ucl0) && (yea0Var == null || (yea0Var.f271952a instanceof uea0))) {
            return new mcd(hyv.m49210j(ocl0Var.f163951a), ocl0Var.f163953c);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final sdd m70002u(sdd sddVar, boolean z, boolean z2) {
        qf40 qf40VarM67574x;
        if (z) {
            ro80 ro80VarM44508o = geg1.m44508o();
            if (sddVar.f207985b) {
                ro80VarM44508o.add(lcd.f131901a);
            }
            if (sddVar.f207989f != 1) {
                ro80VarM44508o.add(lcd.f131902b);
            }
            if (sddVar.f207986c) {
                if (z2) {
                    ro80VarM44508o.add(lcd.f131903c);
                }
                ro80VarM44508o.add(lcd.f131904d);
            }
            qf40VarM67574x = opo.m67574x(geg1.m44506m(ro80VarM44508o));
        } else {
            qf40VarM67574x = lv21.f137205b;
        }
        qf40 qf40Var = qf40VarM67574x;
        return sdd.m77831a(sddVar, null, false, false, false, false, 0, qf40Var, sddVar.f207991h && !qf40Var.isEmpty() && sddVar.f207984a == null, null, null, null, 1855);
    }

    /* JADX INFO: renamed from: v */
    public static int m70003v(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
