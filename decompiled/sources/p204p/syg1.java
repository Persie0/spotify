package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class syg1 {

    /* JADX INFO: renamed from: a */
    public static int f215246a = 4;

    /* JADX INFO: renamed from: b */
    public static boolean f215247b;

    /* JADX INFO: renamed from: c */
    public static it9 f215248c;

    /* JADX INFO: renamed from: d */
    public static sd40 f215249d;

    /* JADX INFO: renamed from: a */
    public static final void m79682a(int i, String str, String str2, boolean z, boolean z2, boolean z3, gh00 gh00Var, nuc nucVar, fxh0 fxh0Var, if71 if71Var, xq00 xq00Var, int i2) {
        int i3;
        boolean z4;
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        if71 if71Var2;
        int i4;
        if71 if71Var3;
        udu qduVar;
        xq00Var.m91775k0(1294072503);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91762e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91766g(str2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i5 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= xq00Var.m91768h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z4 = z3;
            i5 |= xq00Var.m91768h(z4) ? 131072 : 65536;
        } else {
            z4 = z3;
        }
        int i6 = i5 | (xq00Var.m91770i(gh00Var) ? 1048576 : 524288) | (xq00Var.m91770i(nucVar) ? 8388608 : 4194304);
        if ((100663296 & i2) == 0) {
            fxh0Var2 = fxh0Var;
            i6 |= xq00Var.m91770i(fxh0Var2) ? 67108864 : 33554432;
        } else {
            fxh0Var2 = fxh0Var;
        }
        int i7 = i6 | 268435456;
        if (xq00Var.m91752Y(i7 & 1, (306783379 & i7) != 306783378)) {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                i4 = i7 & (-1879048193);
                if71Var3 = leu.m58818d(xq00Var).f64971g;
            } else {
                xq00Var.m91757b0();
                i4 = i7 & (-1879048193);
                if71Var3 = if71Var;
            }
            xq00Var.m91790s();
            l971 l971VarM86394u = vtg1.m86394u((i4 >> 3) & 14, 2, str, xq00Var);
            int i8 = nucVar.f158586a;
            if (z) {
                xq00Var.m91771i0(88060549);
                xq00Var.m91788r(false);
                qduVar = sdu.f208086a;
            } else {
                xq00Var.m91771i0(88108258);
                qduVar = new qdu(k0e1.m54977L(R.string.edit_playlist_metadata_edit_field_disabled_reason, xq00Var));
                xq00Var.m91788r(false);
            }
            int i9 = i4 << 6;
            m79683b(l971VarM86394u, i, str2, i8, fxh0Var2, qduVar, z2, z4, if71Var3, null, xq00Var, ((i4 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 896) | ((i4 >> 12) & 57344) | (i9 & 3670016) | (i9 & 29360128), 512);
            xq00Var2 = xq00Var;
            boolean zM91770i = xq00Var2.m91770i(l971VarM86394u) | ((i4 & 3670016) == 1048576);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new nf5(l971VarM86394u, gh00Var, (fbk) null, 5);
                xq00Var2.m91793t0(objM91750T);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T, xq00Var2);
            if71Var2 = if71Var3;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            if71Var2 = if71Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fus(i, str, str2, z, z2, z3, gh00Var, nucVar, fxh0Var, if71Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x018b  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0234  */
    /* JADX WARN: Code duplicated, block: B:146:0x024b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0259  */
    /* JADX WARN: Code duplicated, block: B:150:0x025b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:164:0x030d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0336  */
    /* JADX WARN: Code duplicated, block: B:171:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x0355  */
    /* JADX WARN: Code duplicated, block: B:176:0x0370  */
    /* JADX WARN: Code duplicated, block: B:179:0x037f  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX INFO: renamed from: b */
    public static final void m79683b(l971 l971Var, int i, String str, int i2, fxh0 fxh0Var, udu uduVar, boolean z, boolean z2, if71 if71Var, String str2, xq00 xq00Var, int i3, int i4) {
        int i5;
        String str3;
        udu uduVar2;
        boolean z3;
        int i6;
        int i7;
        int i8;
        String str4;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        udu uduVar3;
        String str5;
        boolean z6;
        pgv0 pgv0VarM91796v;
        udu uduVar4;
        boolean z7;
        boolean z8;
        String str6;
        boolean z9;
        int i11;
        Object objM91750T;
        Object obj;
        Object objM91750T2;
        kqi0 kqi0Var;
        boolean z10;
        Object objM91750T3;
        kqi0 kqi0Var2;
        r771 p771Var;
        boolean zM91770i;
        Object objM91750T4;
        int length;
        fxh0 fxh0VarM39673I;
        boolean z11;
        Object objM91750T5;
        boolean zM91770i2;
        Object objM91750T6;
        Object obj2;
        Object objM91750T7;
        kqi0 kqi0Var3;
        boolean zM91770i3;
        Object objM91750T8;
        boolean z12;
        int i12;
        xq00Var.m91775k0(-427457296);
        if ((i3 & 6) == 0) {
            i5 = (xq00Var.m91770i(l971Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= xq00Var.m91762e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            str3 = str;
            i5 |= xq00Var.m91766g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i3 & 3072) == 0) {
            i5 |= xq00Var.m91762e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                uduVar2 = uduVar;
                int i13 = xq00Var.m91770i(uduVar2) ? 131072 : 65536;
                i5 |= i13;
            } else {
                uduVar2 = uduVar;
            }
            i5 |= i13;
        } else {
            uduVar2 = uduVar;
        }
        int i14 = i4 & 64;
        if (i14 == 0) {
            if ((1572864 & i3) == 0) {
                z3 = z;
                i5 |= xq00Var.m91768h(z3) ? 1048576 : 524288;
            }
            i6 = i4 & 128;
            if (i6 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (xq00Var.m91768h(z2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            if ((i3 & 100663296) == 0) {
                if (xq00Var.m91770i(if71Var)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i5 |= i12;
            }
            i8 = i4 & 512;
            if (i8 != 0) {
                i5 |= 805306368;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i3 & 805306368) == 0) {
                    if (xq00Var.m91766g(str4)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i5 |= i9;
                }
            }
            i10 = i5;
            if ((i5 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i10 & 1, z4)) {
                xq00Var.m91761d0();
                if ((i3 & 1) != 0 || xq00Var.m91735E()) {
                    if ((i4 & 32) != 0) {
                        uduVar4 = sdu.f208086a;
                        i10 &= -458753;
                    } else {
                        uduVar4 = uduVar2;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    if (i8 != 0) {
                        str6 = "";
                        z8 = z7;
                    } else {
                        z8 = z7;
                    }
                    z9 = z3;
                    i11 = i10;
                    xq00Var.m91790s();
                    objM91750T = xq00Var.m91750T();
                    obj = t6x0.f217647t;
                    if (objM91750T == obj) {
                        objM91750T = ydj.m93452k(xq00Var);
                    }
                    aqz aqzVar = (aqz) objM91750T;
                    Object[] objArr = new Object[0];
                    objM91750T2 = xq00Var.m91750T();
                    if (objM91750T2 == obj) {
                        objM91750T2 = v8s.f238662X;
                        xq00Var.m91793t0(objM91750T2);
                    }
                    udu uduVar5 = uduVar4;
                    kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T2, xq00Var, 48);
                    Object[] objArr2 = new Object[0];
                    if ((i11 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM91750T3 = xq00Var.m91750T();
                    if (z10 || objM91750T3 == obj) {
                        objM91750T3 = new wih(z9, 1);
                        xq00Var.m91793t0(objM91750T3);
                    }
                    kqi0Var2 = (kqi0) dul.m37018u(objArr2, (eh00) objM91750T3, xq00Var, 0);
                    if (z9 && !((Boolean) kqi0Var2.getValue()).booleanValue()) {
                        kqi0Var2.setValue(Boolean.TRUE);
                    }
                    float f = 8;
                    float f2 = 6;
                    j4m0 j4m0Var = new j4m0(f, f2, f, f2);
                    if (i == 1) {
                        p771Var = q771.f186043b;
                    } else {
                        p771Var = new p771(i, 0, 2);
                    }
                    n0v n0vVar = new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896);
                    fxh0 fxh0VarM69835p = pft0.m69835p(mi21.m61822f(1.0f, fxh0Var), aqzVar);
                    zM91770i = xq00Var.m91770i(kqi0Var);
                    objM91750T4 = xq00Var.m91750T();
                    if (zM91770i || objM91750T4 == obj) {
                        objM91750T4 = new bus(kqi0Var, 0);
                        xq00Var.m91793t0(objM91750T4);
                    }
                    fxh0 fxh0VarM68834o = p1m0.m68834o(fxh0VarM69835p, (gh00) objM91750T4);
                    length = str6.length();
                    fxh0VarM39673I = cxh0.f43038a;
                    if (length > 0) {
                        fxh0VarM39673I = epv0.m39673I(str6, fxh0VarM39673I);
                    }
                    fxh0 fxh0VarMo34315F = fxh0VarM68834o.mo34315F(fxh0VarM39673I);
                    if ((i11 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objM91750T5 = xq00Var.m91750T();
                    if (z11 || objM91750T5 == obj) {
                        objM91750T5 = new cus(i2, 0);
                        xq00Var.m91793t0(objM91750T5);
                    }
                    int i15 = i11 << 3;
                    String str7 = str6;
                    wze1.m89428d(l971Var, fxh0VarMo34315F, uduVar5, str3, null, null, false, false, (uw40) objM91750T5, if71Var, oz60.m68623a(7, 118), null, p771Var, null, null, null, j4m0Var, 0.0f, n0vVar, xq00Var, ((i11 >> 9) & 896) | (i11 & 14) | (i15 & 7168) | (i15 & 1879048192), 0, 387312);
                    Boolean bool = (Boolean) kqi0Var2.getValue();
                    bool.getClass();
                    zM91770i2 = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(aqzVar);
                    objM91750T6 = xq00Var.m91750T();
                    if (zM91770i2) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if (objM91750T6 == obj2) {
                        }
                        hz40.m49237i(bool, (th00) objM91750T6, xq00Var);
                        Object[] objArr3 = new Object[0];
                        objM91750T7 = xq00Var.m91750T();
                        if (objM91750T7 == obj2) {
                            objM91750T7 = v8s.f238679t;
                            xq00Var.m91793t0(objM91750T7);
                        }
                        kqi0Var3 = (kqi0) dul.m37018u(objArr3, (eh00) objM91750T7, xq00Var, 48);
                        Boolean bool2 = (Boolean) kqi0Var.getValue();
                        bool2.getClass();
                        zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
                        objM91750T8 = xq00Var.m91750T();
                        if (!zM91770i3 || objM91750T8 == obj2) {
                            z12 = z8;
                            Object dusVar = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                            xq00Var.m91793t0(dusVar);
                            objM91750T8 = dusVar;
                        } else {
                            z12 = z8;
                        }
                        hz40.m49237i(bool2, (th00) objM91750T8, xq00Var);
                        z5 = z12;
                        uduVar3 = uduVar5;
                        z6 = z9;
                        str5 = str7;
                    }
                    objM91750T6 = new mdr(aqzVar, kqi0Var2, null, 11);
                    xq00Var.m91793t0(objM91750T6);
                    hz40.m49237i(bool, (th00) objM91750T6, xq00Var);
                    Object[] objArr4 = new Object[0];
                    objM91750T7 = xq00Var.m91750T();
                    if (objM91750T7 == obj2) {
                        objM91750T7 = v8s.f238679t;
                        xq00Var.m91793t0(objM91750T7);
                    }
                    kqi0Var3 = (kqi0) dul.m37018u(objArr4, (eh00) objM91750T7, xq00Var, 48);
                    Boolean bool3 = (Boolean) kqi0Var.getValue();
                    bool3.getClass();
                    zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
                    objM91750T8 = xq00Var.m91750T();
                    if (zM91770i3) {
                        z12 = z8;
                        Object dusVar2 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                        xq00Var.m91793t0(dusVar2);
                        objM91750T8 = dusVar2;
                    } else {
                        z12 = z8;
                        Object dusVar3 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                        xq00Var.m91793t0(dusVar3);
                        objM91750T8 = dusVar3;
                    }
                    hz40.m49237i(bool3, (th00) objM91750T8, xq00Var);
                    z5 = z12;
                    uduVar3 = uduVar5;
                    z6 = z9;
                    str5 = str7;
                } else {
                    xq00Var.m91757b0();
                    if ((i4 & 32) != 0) {
                        i10 &= -458753;
                    }
                    z8 = z2;
                    uduVar4 = uduVar2;
                }
                str6 = str4;
                z9 = z3;
                i11 = i10;
                xq00Var.m91790s();
                objM91750T = xq00Var.m91750T();
                obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = ydj.m93452k(xq00Var);
                }
                aqz aqzVar2 = (aqz) objM91750T;
                Object[] objArr5 = new Object[0];
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = v8s.f238662X;
                    xq00Var.m91793t0(objM91750T2);
                }
                udu uduVar6 = uduVar4;
                kqi0Var = (kqi0) dul.m37018u(objArr5, (eh00) objM91750T2, xq00Var, 48);
                Object[] objArr6 = new Object[0];
                if ((i11 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM91750T3 = xq00Var.m91750T();
                if (z10) {
                    objM91750T3 = new wih(z9, 1);
                    xq00Var.m91793t0(objM91750T3);
                } else {
                    objM91750T3 = new wih(z9, 1);
                    xq00Var.m91793t0(objM91750T3);
                }
                kqi0Var2 = (kqi0) dul.m37018u(objArr6, (eh00) objM91750T3, xq00Var, 0);
                if (z9) {
                    kqi0Var2.setValue(Boolean.TRUE);
                }
                float f3 = 8;
                float f4 = 6;
                j4m0 j4m0Var2 = new j4m0(f3, f4, f3, f4);
                if (i == 1) {
                    p771Var = q771.f186043b;
                } else {
                    p771Var = new p771(i, 0, 2);
                }
                n0v n0vVar2 = new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896);
                fxh0 fxh0VarM69835p2 = pft0.m69835p(mi21.m61822f(1.0f, fxh0Var), aqzVar2);
                zM91770i = xq00Var.m91770i(kqi0Var);
                objM91750T4 = xq00Var.m91750T();
                if (zM91770i) {
                    objM91750T4 = new bus(kqi0Var, 0);
                    xq00Var.m91793t0(objM91750T4);
                } else {
                    objM91750T4 = new bus(kqi0Var, 0);
                    xq00Var.m91793t0(objM91750T4);
                }
                fxh0 fxh0VarM68834o2 = p1m0.m68834o(fxh0VarM69835p2, (gh00) objM91750T4);
                length = str6.length();
                fxh0VarM39673I = cxh0.f43038a;
                if (length > 0) {
                    fxh0VarM39673I = epv0.m39673I(str6, fxh0VarM39673I);
                }
                fxh0 fxh0VarMo34315F2 = fxh0VarM68834o2.mo34315F(fxh0VarM39673I);
                if ((i11 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objM91750T5 = xq00Var.m91750T();
                if (z11) {
                    objM91750T5 = new cus(i2, 0);
                    xq00Var.m91793t0(objM91750T5);
                } else {
                    objM91750T5 = new cus(i2, 0);
                    xq00Var.m91793t0(objM91750T5);
                }
                int i16 = i11 << 3;
                String str8 = str6;
                wze1.m89428d(l971Var, fxh0VarMo34315F2, uduVar6, str3, null, null, false, false, (uw40) objM91750T5, if71Var, oz60.m68623a(7, 118), null, p771Var, null, null, null, j4m0Var2, 0.0f, n0vVar2, xq00Var, ((i11 >> 9) & 896) | (i11 & 14) | (i16 & 7168) | (i16 & 1879048192), 0, 387312);
                Boolean bool4 = (Boolean) kqi0Var2.getValue();
                bool4.getClass();
                zM91770i2 = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(aqzVar2);
                objM91750T6 = xq00Var.m91750T();
                if (zM91770i2) {
                    obj2 = obj;
                    if (objM91750T6 == obj2) {
                    }
                    hz40.m49237i(bool4, (th00) objM91750T6, xq00Var);
                    Object[] objArr7 = new Object[0];
                    objM91750T7 = xq00Var.m91750T();
                    if (objM91750T7 == obj2) {
                        objM91750T7 = v8s.f238679t;
                        xq00Var.m91793t0(objM91750T7);
                    }
                    kqi0Var3 = (kqi0) dul.m37018u(objArr7, (eh00) objM91750T7, xq00Var, 48);
                    Boolean bool5 = (Boolean) kqi0Var.getValue();
                    bool5.getClass();
                    zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
                    objM91750T8 = xq00Var.m91750T();
                    if (zM91770i3) {
                        z12 = z8;
                        Object dusVar4 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                        xq00Var.m91793t0(dusVar4);
                        objM91750T8 = dusVar4;
                    } else {
                        z12 = z8;
                        Object dusVar5 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                        xq00Var.m91793t0(dusVar5);
                        objM91750T8 = dusVar5;
                    }
                    hz40.m49237i(bool5, (th00) objM91750T8, xq00Var);
                    z5 = z12;
                    uduVar3 = uduVar6;
                    z6 = z9;
                    str5 = str8;
                } else {
                    obj2 = obj;
                }
                objM91750T6 = new mdr(aqzVar2, kqi0Var2, null, 11);
                xq00Var.m91793t0(objM91750T6);
                hz40.m49237i(bool4, (th00) objM91750T6, xq00Var);
                Object[] objArr8 = new Object[0];
                objM91750T7 = xq00Var.m91750T();
                if (objM91750T7 == obj2) {
                    objM91750T7 = v8s.f238679t;
                    xq00Var.m91793t0(objM91750T7);
                }
                kqi0Var3 = (kqi0) dul.m37018u(objArr8, (eh00) objM91750T7, xq00Var, 48);
                Boolean bool6 = (Boolean) kqi0Var.getValue();
                bool6.getClass();
                zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
                objM91750T8 = xq00Var.m91750T();
                if (zM91770i3) {
                    z12 = z8;
                    Object dusVar6 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                    xq00Var.m91793t0(dusVar6);
                    objM91750T8 = dusVar6;
                } else {
                    z12 = z8;
                    Object dusVar7 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                    xq00Var.m91793t0(dusVar7);
                    objM91750T8 = dusVar7;
                }
                hz40.m49237i(bool6, (th00) objM91750T8, xq00Var);
                z5 = z12;
                uduVar3 = uduVar6;
                z6 = z9;
                str5 = str8;
            } else {
                xq00Var.m91757b0();
                z5 = z2;
                uduVar3 = uduVar2;
                str5 = str4;
                z6 = z3;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new eus(l971Var, i, str, i2, fxh0Var, uduVar3, z6, z5, if71Var, str5, i3, i4);
            }
        }
        i5 |= 1572864;
        z3 = z;
        i6 = i4 & 128;
        if (i6 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            if (xq00Var.m91768h(z2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i5 |= i7;
        }
        if ((i3 & 100663296) == 0) {
            if (xq00Var.m91770i(if71Var)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i5 |= i12;
        }
        i8 = i4 & 512;
        if (i8 != 0) {
            i5 |= 805306368;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i3 & 805306368) == 0) {
                if (xq00Var.m91766g(str4)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
        }
        i10 = i5;
        if ((i5 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq00Var.m91752Y(i10 & 1, z4)) {
            xq00Var.m91761d0();
            if ((i3 & 1) != 0) {
                if ((i4 & 32) != 0) {
                    uduVar4 = sdu.f208086a;
                    i10 &= -458753;
                } else {
                    uduVar4 = uduVar2;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i8 != 0) {
                    str6 = "";
                    z8 = z7;
                } else {
                    z8 = z7;
                    str6 = str4;
                }
            } else {
                if ((i4 & 32) != 0) {
                    uduVar4 = sdu.f208086a;
                    i10 &= -458753;
                } else {
                    uduVar4 = uduVar2;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i8 != 0) {
                    str6 = "";
                    z8 = z7;
                } else {
                    z8 = z7;
                    str6 = str4;
                }
            }
            z9 = z3;
            i11 = i10;
            xq00Var.m91790s();
            objM91750T = xq00Var.m91750T();
            obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = ydj.m93452k(xq00Var);
            }
            aqz aqzVar3 = (aqz) objM91750T;
            Object[] objArr9 = new Object[0];
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = v8s.f238662X;
                xq00Var.m91793t0(objM91750T2);
            }
            udu uduVar7 = uduVar4;
            kqi0Var = (kqi0) dul.m37018u(objArr9, (eh00) objM91750T2, xq00Var, 48);
            Object[] objArr10 = new Object[0];
            if ((i11 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM91750T3 = xq00Var.m91750T();
            if (z10) {
                objM91750T3 = new wih(z9, 1);
                xq00Var.m91793t0(objM91750T3);
            } else {
                objM91750T3 = new wih(z9, 1);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0Var2 = (kqi0) dul.m37018u(objArr10, (eh00) objM91750T3, xq00Var, 0);
            if (z9) {
                kqi0Var2.setValue(Boolean.TRUE);
            }
            float f5 = 8;
            float f6 = 6;
            j4m0 j4m0Var3 = new j4m0(f5, f6, f5, f6);
            if (i == 1) {
                p771Var = q771.f186043b;
            } else {
                p771Var = new p771(i, 0, 2);
            }
            n0v n0vVar3 = new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896);
            fxh0 fxh0VarM69835p3 = pft0.m69835p(mi21.m61822f(1.0f, fxh0Var), aqzVar3);
            zM91770i = xq00Var.m91770i(kqi0Var);
            objM91750T4 = xq00Var.m91750T();
            if (zM91770i) {
                objM91750T4 = new bus(kqi0Var, 0);
                xq00Var.m91793t0(objM91750T4);
            } else {
                objM91750T4 = new bus(kqi0Var, 0);
                xq00Var.m91793t0(objM91750T4);
            }
            fxh0 fxh0VarM68834o3 = p1m0.m68834o(fxh0VarM69835p3, (gh00) objM91750T4);
            length = str6.length();
            fxh0VarM39673I = cxh0.f43038a;
            if (length > 0) {
                fxh0VarM39673I = epv0.m39673I(str6, fxh0VarM39673I);
            }
            fxh0 fxh0VarMo34315F3 = fxh0VarM68834o3.mo34315F(fxh0VarM39673I);
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objM91750T5 = xq00Var.m91750T();
            if (z11) {
                objM91750T5 = new cus(i2, 0);
                xq00Var.m91793t0(objM91750T5);
            } else {
                objM91750T5 = new cus(i2, 0);
                xq00Var.m91793t0(objM91750T5);
            }
            int i17 = i11 << 3;
            String str9 = str6;
            wze1.m89428d(l971Var, fxh0VarMo34315F3, uduVar7, str3, null, null, false, false, (uw40) objM91750T5, if71Var, oz60.m68623a(7, 118), null, p771Var, null, null, null, j4m0Var3, 0.0f, n0vVar3, xq00Var, ((i11 >> 9) & 896) | (i11 & 14) | (i17 & 7168) | (i17 & 1879048192), 0, 387312);
            Boolean bool7 = (Boolean) kqi0Var2.getValue();
            bool7.getClass();
            zM91770i2 = xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(aqzVar3);
            objM91750T6 = xq00Var.m91750T();
            if (zM91770i2) {
                obj2 = obj;
                if (objM91750T6 == obj2) {
                }
                hz40.m49237i(bool7, (th00) objM91750T6, xq00Var);
                Object[] objArr11 = new Object[0];
                objM91750T7 = xq00Var.m91750T();
                if (objM91750T7 == obj2) {
                    objM91750T7 = v8s.f238679t;
                    xq00Var.m91793t0(objM91750T7);
                }
                kqi0Var3 = (kqi0) dul.m37018u(objArr11, (eh00) objM91750T7, xq00Var, 48);
                Boolean bool8 = (Boolean) kqi0Var.getValue();
                bool8.getClass();
                zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
                objM91750T8 = xq00Var.m91750T();
                if (zM91770i3) {
                    z12 = z8;
                    Object dusVar8 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                    xq00Var.m91793t0(dusVar8);
                    objM91750T8 = dusVar8;
                } else {
                    z12 = z8;
                    Object dusVar9 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                    xq00Var.m91793t0(dusVar9);
                    objM91750T8 = dusVar9;
                }
                hz40.m49237i(bool8, (th00) objM91750T8, xq00Var);
                z5 = z12;
                uduVar3 = uduVar7;
                z6 = z9;
                str5 = str9;
            } else {
                obj2 = obj;
            }
            objM91750T6 = new mdr(aqzVar3, kqi0Var2, null, 11);
            xq00Var.m91793t0(objM91750T6);
            hz40.m49237i(bool7, (th00) objM91750T6, xq00Var);
            Object[] objArr12 = new Object[0];
            objM91750T7 = xq00Var.m91750T();
            if (objM91750T7 == obj2) {
                objM91750T7 = v8s.f238679t;
                xq00Var.m91793t0(objM91750T7);
            }
            kqi0Var3 = (kqi0) dul.m37018u(objArr12, (eh00) objM91750T7, xq00Var, 48);
            Boolean bool9 = (Boolean) kqi0Var.getValue();
            bool9.getClass();
            zM91770i3 = xq00Var.m91770i(kqi0Var) | ((i11 & 29360128) == 8388608) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(kqi0Var2);
            objM91750T8 = xq00Var.m91750T();
            if (zM91770i3) {
                z12 = z8;
                Object dusVar10 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                xq00Var.m91793t0(dusVar10);
                objM91750T8 = dusVar10;
            } else {
                z12 = z8;
                Object dusVar11 = new dus(z12, l971Var, kqi0Var, kqi0Var3, kqi0Var2, null, 0);
                xq00Var.m91793t0(dusVar11);
                objM91750T8 = dusVar11;
            }
            hz40.m49237i(bool9, (th00) objM91750T8, xq00Var);
            z5 = z12;
            uduVar3 = uduVar7;
            z6 = z9;
            str5 = str9;
        } else {
            xq00Var.m91757b0();
            z5 = z2;
            uduVar3 = uduVar2;
            str5 = str4;
            z6 = z3;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eus(l971Var, i, str, i2, fxh0Var, uduVar3, z6, z5, if71Var, str5, i3, i4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m79684c(float f, int i, xq00 xq00Var, fxh0 fxh0Var) {
        float f2;
        xq00Var.m91775k0(-649179294);
        int i2 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i | 432;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            gfp gfpVar = leu.f132721a;
            x4b x4bVar = iiu.f102631a;
            f2 = 0.75f;
            dha.m36004a(nec.m64245h(fxh0Var, new xk80(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), h6f.m46715L(new n6f(n6f.m63765b(((giu) x4bVar.f258039d).f80257a, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new n6f(n6f.m63765b(((giu) x4bVar.f258039d).f80257a, 0.75f, 0.0f, 0.0f, 0.0f, 14))), null), null, 0.0f, 6), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
            f2 = f;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1910gu(fxh0Var, f2, i, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m79685d(fyf fyfVar, fyf fyfVar2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1291786621);
        int i2 = (xq00Var.m91766g(fxh0Var) ? 256 : 128) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM61814B = mi21.m61814B(fxh0Var, null, 3);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 54);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61814B);
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
            fyfVar.invoke(xq00Var, 6);
            riw0.m75615i(xq00Var, mi21.m61824h(16, cxh0.f43038a));
            fyfVar2.invoke(xq00Var, 6);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fgc0(fyfVar, fyfVar2, fxh0Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x020e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x023b  */
    /* JADX WARN: Code duplicated, block: B:91:0x023e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    /* JADX WARN: Code duplicated, block: B:95:0x0272  */
    /* JADX WARN: Code duplicated, block: B:97:0x029e  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a6  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0147, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static final void m79686e(String str, fxh0 fxh0Var, String str2, th00 th00Var, wwu wwuVar, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        cxh0 cxh0Var;
        fxh0 fxh0Var3;
        fxh0 fxh0VarM47247x;
        irx0 irx0VarM36744a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        yhh yhhVar;
        yhh yhhVar2;
        yhh yhhVar3;
        vlh vlhVar;
        yhh yhhVar4;
        boolean z;
        yhh yhhVar5;
        vlh vlhVar2;
        yhh yhhVar6;
        C2087le c2087le2;
        yhh yhhVar7;
        yhh yhhVar8;
        float f;
        boolean z2;
        cxh0 cxh0Var2;
        boolean z3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-53427765);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= xq00Var2.m91766g(str2) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= xq00Var2.m91770i(th00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? xq00Var2.m91766g(wwuVar) : xq00Var2.m91770i(wwuVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= xq00Var2.m91770i(eh00Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if (xq00Var2.m91752Y(i5 & 1, (i5 & 4793491) != 4793490)) {
            cxh0 cxh0Var3 = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var3);
            if (eh00Var != null) {
                cxh0Var = cxh0Var3;
                fxh0Var3 = fxh0VarM61822f;
                fxh0VarM47247x = hdi.m47247x(cxh0Var, false, null, null, null, eh00Var, 15);
                if (fxh0VarM47247x == null) {
                }
                fxh0 fxh0VarM96830A = zsf1.m96830A(fxh0Var3.mo34315F(fxh0VarM47247x), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1);
                vb9 vb9Var = d7f0.f46142M0;
                zi5 zi5Var = bj5.f27610a;
                irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224762e), vb9Var, xq00Var2, 0);
                iHashCode = Long.hashCode(xq00Var2.f264809T);
                wpn0VarM91778m = xq00Var2.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                yhhVar = roh.f201262g;
                zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
                yhhVar2 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                yhhVar3 = roh.f201265j;
                zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
                vlhVar = roh.f201266k;
                zsf1.m96833D(vlhVar, xq00Var2);
                yhhVar4 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
                if (th00Var != null) {
                    xq00Var2.m91771i0(-1801578202);
                    z0k0.m95074k((i5 >> 12) & 14, th00Var, xq00Var2, false);
                } else {
                    xq00Var2.m91771i0(-1801417157);
                    xq00Var2.m91788r(false);
                }
                if (str2 != null || wl51.m88460J0(str2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    yhhVar5 = yhhVar2;
                    vlhVar2 = vlhVar;
                    yhhVar6 = yhhVar3;
                    c2087le2 = c2087le;
                    yhhVar7 = yhhVar;
                    yhhVar8 = yhhVar4;
                    xq00Var2.m91771i0(-1800880020);
                    if (1.0f <= 0.0d) {
                        kt40.m57301a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    ahf1.m25932d(str, new cr70(f, true), leu.m58818d(xq00Var2).f64971g, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var2, i5 & 14, 0, 1720);
                    z2 = false;
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(-1801365449);
                    if (1.0f <= 0.0d) {
                        kt40.m57301a("invalid weight; must be greater than zero");
                    }
                    cr70 cr70Var = new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
                    int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cr70Var);
                    xq00Var2.m91779m0();
                    if (xq00Var2.f264808S) {
                        xq00Var2.m91776l(c2087le);
                    } else {
                        xq00Var2.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
                    zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
                    AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
                    zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
                    ahf1.m25932d(str, null, leu.m58818d(xq00Var2).f64971g, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var, i5 & 14, 0, 1722);
                    xq00Var2 = xq00Var;
                    yhhVar5 = yhhVar2;
                    vlhVar2 = vlhVar;
                    c2087le2 = c2087le;
                    yhhVar7 = yhhVar;
                    yhhVar8 = yhhVar4;
                    yhhVar6 = yhhVar3;
                    ahf1.m25932d(str2, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(1), 0, null, xq00Var2, (i5 >> 6) & 14, 0, 1714);
                    xq00Var2.m91788r(true);
                    xq00Var2.m91788r(false);
                    z2 = false;
                }
                if (wwuVar == null) {
                    xq00Var2.m91771i0(-1800646901);
                    xq00Var2.m91788r(z2);
                    cxh0Var2 = cxh0Var;
                    z3 = true;
                } else {
                    xq00Var2.m91771i0(-1800646900);
                    xq00Var2.m91771i0(-1349675146);
                    xq00Var2.m91788r(z2);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, z2);
                    int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
                    wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
                    cxh0Var2 = cxh0Var;
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, cxh0Var2);
                    xq00Var2.m91779m0();
                    if (xq00Var2.f264808S) {
                        xq00Var2.m91776l(c2087le2);
                    } else {
                        xq00Var2.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, yhhVar7, xq00Var2);
                    zsf1.m96835F(wpn0VarM91778m3, yhhVar5, xq00Var2);
                    AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar6, xq00Var2, vlhVar2);
                    zsf1.m96835F(fxh0VarM48286s3, yhhVar8, xq00Var2);
                    y85.m93057b(wwuVar, qgj.f188480a, null, 0L, 0L, false, xq00Var2, 56, 60);
                    z3 = true;
                    xq00Var2.m91788r(true);
                    xq00Var2.m91788r(z2);
                }
                xq00Var2.m91788r(z3);
                fxh0Var2 = cxh0Var2;
            } else {
                cxh0Var = cxh0Var3;
                fxh0Var3 = fxh0VarM61822f;
            }
            fxh0VarM47247x = cxh0Var;
            fxh0 fxh0VarM96830A2 = zsf1.m96830A(fxh0Var3.mo34315F(fxh0VarM47247x), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1);
            vb9 vb9Var2 = d7f0.f46142M0;
            zi5 zi5Var2 = bj5.f27610a;
            irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224762e), vb9Var2, xq00Var2, 0);
            iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0VarM91778m = xq00Var2.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A2);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (ug5Var != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf2, yhhVar3, xq00Var2);
            vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            if (th00Var != null) {
                xq00Var2.m91771i0(-1801578202);
                z0k0.m95074k((i5 >> 12) & 14, th00Var, xq00Var2, false);
            } else {
                xq00Var2.m91771i0(-1801417157);
                xq00Var2.m91788r(false);
            }
            if (str2 != null) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                xq00Var2.m91771i0(-1801365449);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                cr70 cr70Var2 = new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                aaf aafVarM87496a2 = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
                int iHashCode4 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m4 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var2, cr70Var2);
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var2);
                AbstractC0000a.m20s(iHashCode4, xq00Var2, yhhVar3, xq00Var2, vlhVar);
                zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var2);
                ahf1.m25932d(str, null, leu.m58818d(xq00Var2).f64971g, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var, i5 & 14, 0, 1722);
                xq00Var2 = xq00Var;
                yhhVar5 = yhhVar2;
                vlhVar2 = vlhVar;
                c2087le2 = c2087le;
                yhhVar7 = yhhVar;
                yhhVar8 = yhhVar4;
                yhhVar6 = yhhVar3;
                ahf1.m25932d(str2, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(1), 0, null, xq00Var2, (i5 >> 6) & 14, 0, 1714);
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(false);
                z2 = false;
            } else {
                yhhVar5 = yhhVar2;
                vlhVar2 = vlhVar;
                yhhVar6 = yhhVar3;
                c2087le2 = c2087le;
                yhhVar7 = yhhVar;
                yhhVar8 = yhhVar4;
                xq00Var2.m91771i0(-1800880020);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                ahf1.m25932d(str, new cr70(f, true), leu.m58818d(xq00Var2).f64971g, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var2, i5 & 14, 0, 1720);
                z2 = false;
                xq00Var2.m91788r(false);
            }
            if (wwuVar == null) {
                xq00Var2.m91771i0(-1800646901);
                xq00Var2.m91788r(z2);
                cxh0Var2 = cxh0Var;
                z3 = true;
            } else {
                xq00Var2.m91771i0(-1800646900);
                xq00Var2.m91771i0(-1349675146);
                xq00Var2.m91788r(z2);
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, z2);
                int iHashCode5 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m5 = xq00Var2.m91778m();
                cxh0Var2 = cxh0Var;
                fxh0 fxh0VarM48286s5 = hqg1.m48286s(xq00Var2, cxh0Var2);
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le2);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar7, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m5, yhhVar5, xq00Var2);
                AbstractC0000a.m20s(iHashCode5, xq00Var2, yhhVar6, xq00Var2, vlhVar2);
                zsf1.m96835F(fxh0VarM48286s5, yhhVar8, xq00Var2);
                y85.m93057b(wwuVar, qgj.f188480a, null, 0L, 0L, false, xq00Var2, 56, 60);
                z3 = true;
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(z2);
            }
            xq00Var2.m91788r(z3);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fxa0(str, fxh0Var2, str2, th00Var, wwuVar, eh00Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final jgg0 m79687f(nj71 nj71Var, b250 b250Var) {
        st91 st91Var;
        int i;
        oq91 oq91Var;
        gh00 gh00Var;
        Integer numM32959J;
        int iIntValue = (b250Var == null || (numM32959J = cjf1.m32959J(b250Var)) == null) ? 0 : numM32959J.intValue();
        if (b250Var == null || (oq91Var = (oq91) b250Var.mo27941a(jbr0.f110851T0)) == null || (gh00Var = oq91Var.f168139b) == null || (st91Var = (st91) gh00Var.invoke(Integer.valueOf(iIntValue))) == null) {
            st91Var = st91.f213865b;
        }
        zm8 zm8Var = new zm8(21, nj71Var.f154456a, st91Var);
        int iM38547C = edb.m38547C(nj71Var.f154457b);
        int i2 = 2;
        if (iM38547C == 0) {
            i = 2;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        Integer numValueOf = Integer.valueOf(nj71Var.f154458c);
        switch (edb.m38547C(nj71Var.f154459d)) {
            case 0:
                i2 = 6;
                break;
            case 1:
                i2 = 7;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                break;
            case 6:
                i2 = 4;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new jgg0(new s8g0(zm8Var, i, numValueOf, i2), nj71Var.f154460e, nj71Var.f154461f);
    }

    /* JADX INFO: renamed from: g */
    public static final void m79688g(String str) {
        it9 it9Var;
        if (!f215247b || pi9.m70083h(4) > pi9.m70083h(f215246a) || str == null || str.length() <= 0 || (it9Var = f215248c) == null || it9Var == null) {
            return;
        }
        it9Var.m51622m(str, "DEBUG");
    }

    /* JADX INFO: renamed from: h */
    public static final void m79689h(String str) {
        it9 it9Var;
        if (!f215247b || pi9.m70083h(1) > pi9.m70083h(f215246a) || str.length() <= 0 || (it9Var = f215248c) == null || it9Var == null) {
            return;
        }
        it9Var.m51622m(str, SearchEndpointResponseKt.RESULT_ERROR);
    }

    /* JADX INFO: renamed from: i */
    public static final int m79690i() {
        return f215246a;
    }

    /* JADX INFO: renamed from: j */
    public static final t050 m79691j(z8k z8kVar, fkk0 fkk0Var) {
        return ((b9k) z8kVar).m28489g("DevicePredictabilityProximityDetectorDaemon", new ajk0(fkk0Var, 3));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m79692k(ppr pprVar) {
        mpr mprVar = pprVar instanceof mpr ? (mpr) pprVar : null;
        return wj50.m88271j(mprVar != null ? mprVar.f146068a : null, "wrapped");
    }

    /* JADX INFO: renamed from: l */
    public static final void m79693l(String str) {
        it9 it9Var;
        if (str.length() <= 0 || (it9Var = f215248c) == null || it9Var == null) {
            return;
        }
        it9Var.m51622m(str, "INFO");
    }

    /* JADX INFO: renamed from: m */
    public static final int m79694m(rs70 rs70Var, vvl0 vvl0Var) {
        return (int) (vvl0Var == vvl0.f245248a ? rs70Var.f202213t & 4294967295L : rs70Var.f202213t >> 32);
    }

    /* JADX INFO: renamed from: n */
    public static int m79695n(String str) {
        String upperCase;
        if (str != null) {
            try {
                upperCase = str.toUpperCase(Locale.ROOT);
            } catch (IllegalArgumentException unused) {
                return 3;
            }
        } else {
            upperCase = "UNKNOWN";
        }
        return p1v.m68862s(upperCase);
    }

    /* JADX INFO: renamed from: o */
    public static final void m79696o(it9 it9Var) {
        f215248c = it9Var;
    }

    /* JADX INFO: renamed from: p */
    public static final void m79697p() {
        f215247b = true;
    }

    /* JADX INFO: renamed from: q */
    public static final void m79698q() {
        f215246a = 5;
    }

    /* JADX INFO: renamed from: r */
    public static final String m79699r(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: s */
    public static final dlo0 m79700s(ph11 ph11Var) {
        boolean z = ph11Var instanceof oh11;
        dlo0 dlo0Var = dlo0.f50292c;
        if (z) {
            return dlo0Var;
        }
        if (!(ph11Var instanceof nh11)) {
            throw new NoWhenBranchMatchedException();
        }
        nh11 nh11Var = (nh11) ph11Var;
        if (nh11Var.f153842a) {
            return nh11Var.f153843b ? dlo0.f50290a : dlo0.f50291b;
        }
        return dlo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX INFO: renamed from: t */
    public static final nh11 m79701t(PlayerState playerState, qh11 qh11Var) {
        boolean z;
        String str = qh11Var.f188598d;
        if (playerState.isPlaying()) {
            if (!wj50.m88271j(playerState.contextUri(), str)) {
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                if (!wj50.m88271j(contextTrack != null ? contextTrack.uri() : null, str)) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        return new nh11(z, !playerState.isPaused());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final u2e0 m79702u(t2e0 t2e0Var, y2e0 y2e0Var, t5p t5pVar) {
        n2e0 n2e0Var;
        x2e0 x2e0Var;
        x2e0 v2e0Var;
        zbr zbrVar;
        String str;
        o2e0 m2e0Var;
        String str2 = t2e0Var.f216506i;
        String str3 = t2e0Var.f216509l;
        String str4 = t2e0Var.f216504g;
        String str5 = t2e0Var.f216498a;
        un20 un20Var = t2e0Var.f216499b;
        zbr zbrVar2 = y2e0Var != null ? y2e0Var.f268595a : null;
        String str6 = t2e0Var.f216502e;
        if (wl51.m88460J0(str4) || zbrVar2 == null || !zbrVar2.f281388d) {
            if (wl51.m88460J0(str6)) {
                n2e0Var = null;
                x2e0Var = null;
            } else {
                v2e0Var = new v2e0(str6, str3);
            }
            String str7 = t2e0Var.f216503f;
            String str8 = t2e0Var.f216507j;
            if (y2e0Var != null) {
                zbrVar = y2e0Var.f268595a;
            } else {
                zbrVar = n2e0Var;
            }
            str = t2e0Var.f216508k;
            if (!wl51.m88460J0(str2)) {
                if (!wl51.m88460J0(str)) {
                    m2e0Var = new m2e0(str);
                }
                return new u2e0(str5, un20Var, str7, str3, str3, x2e0Var, str8, m2e0Var, new f1k(t2e0Var.f216500c, (String) null, (String) null, (d1k) c1k.f33147a, (eh00) null, (eh00) pec0.f176718a1, false, (String) null, 470), ((p24) t5pVar.f217328b).m68879a());
            }
            n2e0Var = new n2e0(str2, zbrVar == 0 && zbrVar.f281388d);
            m2e0Var = n2e0Var;
            return new u2e0(str5, un20Var, str7, str3, str3, x2e0Var, str8, m2e0Var, new f1k(t2e0Var.f216500c, (String) null, (String) null, (d1k) c1k.f33147a, (eh00) null, (eh00) pec0.f176718a1, false, (String) null, 470), ((p24) t5pVar.f217328b).m68879a());
        }
        v2e0Var = new w2e0(str4, str3, str6);
        n2e0Var = null;
        x2e0Var = v2e0Var;
        String str9 = t2e0Var.f216503f;
        String str10 = t2e0Var.f216507j;
        if (y2e0Var != null) {
            zbrVar = y2e0Var.f268595a;
        } else {
            zbrVar = n2e0Var;
        }
        str = t2e0Var.f216508k;
        if (!wl51.m88460J0(str2)) {
            if (!wl51.m88460J0(str)) {
                m2e0Var = new m2e0(str);
            }
            return new u2e0(str5, un20Var, str9, str3, str3, x2e0Var, str10, m2e0Var, new f1k(t2e0Var.f216500c, (String) null, (String) null, (d1k) c1k.f33147a, (eh00) null, (eh00) pec0.f176718a1, false, (String) null, 470), ((p24) t5pVar.f217328b).m68879a());
        }
        n2e0Var = new n2e0(str2, zbrVar == 0 && zbrVar.f281388d);
        m2e0Var = n2e0Var;
        return new u2e0(str5, un20Var, str9, str3, str3, x2e0Var, str10, m2e0Var, new f1k(t2e0Var.f216500c, (String) null, (String) null, (d1k) c1k.f33147a, (eh00) null, (eh00) pec0.f176718a1, false, (String) null, 470), ((p24) t5pVar.f217328b).m68879a());
    }

    /* JADX INFO: renamed from: v */
    public static final void m79703v(String str) {
        it9 it9Var;
        if (!f215247b || pi9.m70083h(5) > pi9.m70083h(f215246a) || str.length() <= 0 || (it9Var = f215248c) == null || it9Var == null) {
            return;
        }
        it9Var.m51622m(str, "VERBOSE");
    }

    /* JADX INFO: renamed from: w */
    public static final void m79704w(String str) {
        it9 it9Var;
        if (!f215247b || pi9.m70083h(2) > pi9.m70083h(f215246a) || str.length() <= 0 || (it9Var = f215248c) == null || it9Var == null) {
            return;
        }
        it9Var.m51622m(str, "WARN");
    }
}
