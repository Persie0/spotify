package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hkf1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f92432a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f92433b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f92434c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f92435d = new int[10];

    /* JADX INFO: renamed from: e */
    public static sd40 f92436e;

    /* JADX INFO: renamed from: f */
    public static sd40 f92437f;

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX INFO: renamed from: A */
    public static mti0 m47784A(byte[] bArr, int i, int i2, da80 da80Var) {
        int i3;
        int iM56414t;
        int i4;
        int i5;
        int i6;
        int iM56414t2;
        int i7;
        int i8;
        int iM56414t3;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int iM69261i;
        int iM69262j;
        int i13;
        xh70 xh70Var;
        int iM56414t4;
        ia70 ia70Var;
        sa8 sa8VarM47811x = m47811x(new kha(bArr, i, i2));
        kha khaVar = new kha(bArr, i + 2, i2);
        int i14 = 4;
        khaVar.m56397D(4);
        int iM56413s = khaVar.m56413s(3);
        int i15 = sa8VarM47811x.f207155b;
        boolean z = i15 != 0 && iM56413s == 7;
        if (da80Var != null) {
            pf40 pf40Var = (pf40) da80Var.f46996b;
            if (pf40Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((jti0) pf40Var.get(Math.min(i15, pf40Var.size() - 1))).f115908a;
            }
        } else {
            i3 = 0;
        }
        kti0 kti0VarM47812y = null;
        if (!z) {
            khaVar.m56396C();
            kti0VarM47812y = m47812y(khaVar, true, iM56413s, null);
        } else if (da80Var != null) {
            i780 i780Var = (i780) da80Var.f46997c;
            int[] iArr = (int[]) i780Var.f99466c;
            pf40 pf40Var2 = (pf40) i780Var.f99465b;
            int i16 = iArr[i3];
            if (pf40Var2.size() > i16) {
                kti0VarM47812y = (kti0) pf40Var2.get(i16);
            }
        }
        khaVar.m56414t();
        if (z) {
            int iM56413s2 = khaVar.m56412r() ? khaVar.m56413s(8) : -1;
            if (da80Var == null || (ia70Var = (ia70) da80Var.f46998d) == null) {
                iM56414t2 = 0;
                i8 = 0;
                iM56414t3 = 0;
                iM56414t = 0;
                i6 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                pf40 pf40Var3 = (pf40) ia70Var.f100166b;
                if (iM56413s2 == -1) {
                    iM56413s2 = ((int[]) ia70Var.f100167c)[i3];
                }
                if (iM56413s2 == -1 || pf40Var3.size() <= iM56413s2) {
                    iM56414t2 = 0;
                    i8 = 0;
                    iM56414t3 = 0;
                    iM56414t = 0;
                    i6 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    lti0 lti0Var = (lti0) pf40Var3.get(iM56413s2);
                    iM56414t = lti0Var.f136803a;
                    i6 = lti0Var.f136806d;
                    i8 = lti0Var.f136807e;
                    iM56414t2 = lti0Var.f136804b;
                    iM56414t3 = lti0Var.f136805c;
                    i7 = i8;
                    i9 = i6;
                }
            }
        } else {
            iM56414t = khaVar.m56414t();
            if (iM56414t == 3) {
                khaVar.m56396C();
            }
            int iM56414t5 = khaVar.m56414t();
            int iM56414t6 = khaVar.m56414t();
            if (khaVar.m56412r()) {
                int iM56414t7 = khaVar.m56414t();
                int iM56414t8 = khaVar.m56414t();
                int iM56414t9 = khaVar.m56414t();
                int iM56414t10 = khaVar.m56414t();
                i5 = iM56414t5 - ((iM56414t7 + iM56414t8) * ((iM56414t == 1 || iM56414t == 2) ? 2 : 1));
                i4 = iM56414t6 - ((iM56414t9 + iM56414t10) * (iM56414t == 1 ? 2 : 1));
            } else {
                i4 = iM56414t6;
                i5 = iM56414t5;
            }
            i6 = i5;
            iM56414t2 = khaVar.m56414t();
            i7 = iM56414t6;
            i8 = i4;
            iM56414t3 = khaVar.m56414t();
            i9 = iM56414t5;
        }
        int iM56414t11 = khaVar.m56414t();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i17 = khaVar.m56412r() ? 0 : iM56413s; i17 <= iM56413s; i17++) {
                khaVar.m56414t();
                iMax = Math.max(khaVar.m56414t(), iMax);
                khaVar.m56414t();
            }
        }
        khaVar.m56414t();
        khaVar.m56414t();
        khaVar.m56414t();
        khaVar.m56414t();
        khaVar.m56414t();
        khaVar.m56414t();
        if (khaVar.m56412r()) {
            boolean zM56412r = z ? khaVar.m56412r() : false;
            int i18 = 6;
            if (zM56412r) {
                khaVar.m56397D(6);
            } else if (khaVar.m56412r()) {
                int i19 = 0;
                while (i19 < i14) {
                    int i20 = 0;
                    while (i20 < i18) {
                        if (khaVar.m56412r()) {
                            int iMin = Math.min(64, 1 << ((i19 << 1) + 4));
                            if (i19 > 1) {
                                khaVar.m56415u();
                            }
                            for (int i21 = 0; i21 < iMin; i21++) {
                                khaVar.m56415u();
                            }
                        } else {
                            khaVar.m56414t();
                        }
                        i20 += i19 == 3 ? 3 : 1;
                        i18 = 6;
                    }
                    i19++;
                    i14 = 4;
                    i18 = 6;
                }
            }
        }
        khaVar.m56397D(2);
        if (khaVar.m56412r()) {
            khaVar.m56397D(8);
            khaVar.m56414t();
            khaVar.m56414t();
            khaVar.m56396C();
        }
        int iM56414t12 = khaVar.m56414t();
        int i22 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i23 = i3;
        int i24 = -1;
        int i25 = -1;
        while (i22 < iM56414t12) {
            if (i22 == 0 || !khaVar.m56412r()) {
                iM56414t4 = khaVar.m56414t();
                int iM56414t13 = khaVar.m56414t();
                int[] iArr3 = new int[iM56414t4];
                int i26 = 0;
                while (i26 < iM56414t4) {
                    iArr3[i26] = (i26 > 0 ? iArr3[i26 - 1] : 0) - (khaVar.m56414t() + 1);
                    khaVar.m56396C();
                    i26++;
                }
                int[] iArr4 = new int[iM56414t13];
                int i27 = 0;
                while (i27 < iM56414t13) {
                    iArr4[i27] = khaVar.m56414t() + 1 + (i27 > 0 ? iArr4[i27 - 1] : 0);
                    khaVar.m56396C();
                    i27++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i24 = iM56414t13;
            } else {
                int i28 = i25 + i24;
                int iM56414t14 = (1 - ((khaVar.m56412r() ? 1 : 0) * 2)) * (khaVar.m56414t() + 1);
                int i29 = i28 + 1;
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 <= i28; i30++) {
                    if (khaVar.m56412r()) {
                        zArr[i30] = true;
                    } else {
                        zArr[i30] = khaVar.m56412r();
                    }
                }
                int[] iArr5 = new int[i29];
                int[] iArr6 = new int[i29];
                int i31 = 0;
                for (int i32 = i24 - 1; i32 >= 0; i32--) {
                    int i33 = iArrCopyOf[i32] + iM56414t14;
                    if (i33 < 0 && zArr[i25 + i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                if (iM56414t14 < 0 && zArr[i28]) {
                    iArr5[i31] = iM56414t14;
                    i31++;
                }
                iM56414t4 = i31;
                for (int i34 = 0; i34 < i25; i34++) {
                    int i35 = iArr2[i34] + iM56414t14;
                    if (i35 < 0 && zArr[i34]) {
                        iArr5[iM56414t4] = i35;
                        iM56414t4++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iM56414t4);
                int i36 = 0;
                for (int i37 = i25 - 1; i37 >= 0; i37--) {
                    int i38 = iArr2[i37] + iM56414t14;
                    if (i38 > 0 && zArr[i37]) {
                        iArr6[i36] = i38;
                        i36++;
                    }
                }
                if (iM56414t14 > 0 && zArr[i28]) {
                    iArr6[i36] = iM56414t14;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < i24; i40++) {
                    int i41 = iArrCopyOf[i40] + iM56414t14;
                    if (i41 > 0 && zArr[i25 + i40]) {
                        iArr6[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i39);
                iArr2 = iArrCopyOf2;
                i24 = i39;
            }
            i25 = iM56414t4;
            i22++;
            iM56414t12 = iM56414t12;
            iMax = iMax;
            iM56414t2 = iM56414t2;
        }
        int i42 = iMax;
        int i43 = iM56414t2;
        if (khaVar.m56412r()) {
            int iM56414t15 = khaVar.m56414t();
            for (int i44 = 0; i44 < iM56414t15; i44++) {
                khaVar.m56397D(iM56414t11 + 5);
            }
        }
        khaVar.m56397D(2);
        float f = 1.0f;
        if (khaVar.m56412r()) {
            if (khaVar.m56412r()) {
                int iM56413s3 = khaVar.m56413s(8);
                if (iM56413s3 == 255) {
                    int iM56413s4 = khaVar.m56413s(16);
                    int iM56413s5 = khaVar.m56413s(16);
                    if (iM56413s4 != 0 && iM56413s5 != 0) {
                        f = iM56413s4 / iM56413s5;
                    }
                } else if (iM56413s3 < 17) {
                    f = f92433b[iM56413s3];
                } else {
                    ei6.m39077n(iM56413s3, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (khaVar.m56412r()) {
                khaVar.m56396C();
            }
            if (khaVar.m56412r()) {
                khaVar.m56397D(3);
                i13 = khaVar.m56412r() ? 1 : 2;
                if (khaVar.m56412r()) {
                    int iM56413s6 = khaVar.m56413s(8);
                    int iM56413s7 = khaVar.m56413s(8);
                    khaVar.m56397D(8);
                    iM69261i = p7f.m69261i(iM56413s6);
                    iM69262j = p7f.m69262j(iM56413s7);
                } else {
                    iM69261i = -1;
                    iM69262j = -1;
                }
            } else if (da80Var == null || (xh70Var = (xh70) da80Var.f46999e) == null) {
                iM69261i = -1;
                iM69262j = -1;
                i13 = -1;
            } else {
                pf40 pf40Var4 = (pf40) xh70Var.f261460b;
                int i45 = ((int[]) xh70Var.f261461c)[i23];
                if (pf40Var4.size() > i45) {
                    nti0 nti0Var = (nti0) pf40Var4.get(i45);
                    int i46 = nti0Var.f158074a;
                    int i47 = nti0Var.f158075b;
                    iM69262j = nti0Var.f158076c;
                    iM69261i = i46;
                    i13 = i47;
                } else {
                    iM69261i = -1;
                    iM69262j = -1;
                    i13 = -1;
                }
            }
            if (khaVar.m56412r()) {
                khaVar.m56414t();
                khaVar.m56414t();
            }
            khaVar.m56396C();
            if (khaVar.m56412r()) {
                i8 *= 2;
            }
            i10 = iM69261i;
            i12 = iM69262j;
            i11 = i13;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new mti0(iM56413s, kti0VarM47812y, iM56414t, i43, iM56414t3, i6, i8, i9, i7, f, i42, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:475:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static da80 m47785B(int i, byte[] bArr, int i2) {
        int[] iArr;
        xh70 xh70Var;
        int iM56413s;
        int iM56413s2;
        int iM56413s3;
        int i3;
        wsv0 wsv0Var;
        boolean[][] zArr;
        int i4;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z;
        int i5;
        boolean zM56412r;
        int i6;
        int i7;
        int i8;
        boolean zM56412r2;
        boolean zM56412r3;
        int iM56414t;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        kha khaVar = new kha(bArr, i, i2);
        m47811x(khaVar);
        khaVar.m56397D(4);
        boolean zM56412r4 = khaVar.m56412r();
        boolean zM56412r5 = khaVar.m56412r();
        int iM56413s4 = khaVar.m56413s(6);
        int i12 = iM56413s4 + 1;
        int iM56413s5 = khaVar.m56413s(3);
        khaVar.m56397D(17);
        kti0 kti0VarM47812y = m47812y(khaVar, true, iM56413s5, null);
        for (int i13 = khaVar.m56412r() ? 0 : iM56413s5; i13 <= iM56413s5; i13++) {
            khaVar.m56414t();
            khaVar.m56414t();
            khaVar.m56414t();
        }
        int iM56413s6 = khaVar.m56413s(6);
        int iM56414t2 = khaVar.m56414t() + 1;
        int i14 = 6;
        i780 i780Var = new i780(pf40.m69794t(kti0VarM47812y), new int[1]);
        boolean z4 = i12 >= 2 && iM56414t2 >= 2;
        boolean z5 = zM56412r4 && zM56412r5;
        int i15 = iM56413s6 + 1;
        boolean z6 = i15 >= i12;
        if (!z4 || !z5 || !z6) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM56414t2, i15);
        int i16 = 1;
        int[] iArr5 = new int[iM56414t2];
        int[] iArr6 = new int[iM56414t2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i17 = 1; i17 < iM56414t2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iM56413s6; i19++) {
                if (khaVar.m56412r()) {
                    iArr4[i17][i18] = i19;
                    iArr6[i17] = i19;
                    i18++;
                }
                iArr5[i17] = i18;
            }
        }
        if (khaVar.m56412r()) {
            khaVar.m56397D(64);
            if (khaVar.m56412r()) {
                khaVar.m56414t();
            }
            int iM56414t3 = khaVar.m56414t();
            int i20 = 0;
            while (i20 < iM56414t3) {
                khaVar.m56414t();
                if (i20 == 0 || khaVar.m56412r()) {
                    boolean zM56412r6 = khaVar.m56412r();
                    boolean zM56412r7 = khaVar.m56412r();
                    z3 = zM56412r6;
                    z2 = zM56412r7;
                    if (zM56412r6 || zM56412r7) {
                        zM56412r = khaVar.m56412r();
                        if (zM56412r) {
                            khaVar.m56397D(19);
                        }
                        khaVar.m56397D(8);
                        if (zM56412r) {
                            khaVar.m56397D(4);
                        }
                        khaVar.m56397D(15);
                        i7 = zM56412r6;
                        i6 = zM56412r7;
                    }
                    i8 = 0;
                    while (i8 <= iM56413s5) {
                        zM56412r2 = khaVar.m56412r();
                        if (!zM56412r2) {
                            zM56412r2 = khaVar.m56412r();
                        }
                        if (zM56412r2) {
                            khaVar.m56414t();
                            zM56412r3 = false;
                        } else {
                            zM56412r3 = khaVar.m56412r();
                        }
                        if (zM56412r3) {
                            iM56414t = 0;
                        } else {
                            iM56414t = khaVar.m56414t();
                        }
                        int[][] iArr7 = iArr4;
                        i9 = i7 + i6;
                        int[] iArr8 = iArr6;
                        i10 = 0;
                        while (i10 < i9) {
                            int i21 = i9;
                            for (i11 = 0; i11 <= iM56414t; i11++) {
                                khaVar.m56414t();
                                khaVar.m56414t();
                                if (zM56412r) {
                                    khaVar.m56414t();
                                    khaVar.m56414t();
                                }
                                khaVar.m56396C();
                            }
                            i10++;
                            i9 = i21;
                        }
                        i8++;
                        i20 = i20;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i20++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM56412r = false;
                i7 = z3;
                i6 = z2;
                i8 = 0;
                while (i8 <= iM56413s5) {
                    zM56412r2 = khaVar.m56412r();
                    if (!zM56412r2) {
                        zM56412r2 = khaVar.m56412r();
                    }
                    if (zM56412r2) {
                        khaVar.m56414t();
                        zM56412r3 = false;
                    } else {
                        zM56412r3 = khaVar.m56412r();
                    }
                    if (zM56412r3) {
                        iM56414t = khaVar.m56414t();
                    } else {
                        iM56414t = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i9 = i7 + i6;
                    int[] iArr10 = iArr6;
                    i10 = 0;
                    while (i10 < i9) {
                        int i22 = i9;
                        while (i11 <= iM56414t) {
                            khaVar.m56414t();
                            khaVar.m56414t();
                            if (zM56412r) {
                                khaVar.m56414t();
                                khaVar.m56414t();
                            }
                            khaVar.m56396C();
                        }
                        i10++;
                        i9 = i22;
                    }
                    i8++;
                    i20 = i20;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i20++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!khaVar.m56412r()) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int i23 = khaVar.f122577e;
        if (i23 > 0) {
            khaVar.m56397D(8 - i23);
        }
        kti0 kti0VarM47812y2 = m47812y(khaVar, false, iM56413s5, kti0VarM47812y);
        boolean zM56412r8 = khaVar.m56412r();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zM56412r9 = khaVar.m56412r();
            zArr3[i25] = zM56412r9;
            if (zM56412r9) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int[] iArr13 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zM56412r8 ? 1 : 0); i26++) {
            iArr13[i26] = khaVar.m56413s(3);
        }
        int[] iArr14 = new int[i24 + 1];
        if (zM56412r8) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr15 = iArr14;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr13[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i24] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i24);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zM56412r10 = khaVar.m56412r();
        int i29 = 1;
        while (i29 < i12) {
            if (zM56412r10) {
                i5 = i29;
                iArr17[i5] = khaVar.m56413s(i14);
            } else {
                i5 = i29;
                iArr17[i5] = i5;
            }
            if (zM56412r8) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr16[i5][i30] = (iArr17[i5] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr16[i5][i33] = khaVar.m56413s(iArr13[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i15];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i12) {
            iArr18[iArr17[i35]] = -1;
            int[] iArr19 = iArr18;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr3[i36]) {
                    if (i36 == i16) {
                        iArr19[iArr17[i35]] = iArr16[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i16 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        z = true;
                        break;
                    }
                    int i39 = i38;
                    if (iArr19[iArr17[i35]] == iArr19[iArr17[i38]]) {
                        z = false;
                        break;
                    }
                    i38 = i39 + 1;
                }
                if (z) {
                    i34++;
                }
            }
            i35++;
            iArr18 = iArr19;
            i16 = 1;
        }
        int[] iArr20 = iArr18;
        int iM56413s7 = khaVar.m56413s(4);
        if (i34 < 2 || iM56413s7 == 0) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int[] iArr21 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr21[i40] = khaVar.m56413s(iM56413s7);
        }
        int[] iArr22 = new int[i15];
        for (int i41 = 0; i41 < i12; i41++) {
            iArr22[Math.min(iArr17[i41], iM56413s6)] = i41;
        }
        jf40 jf40VarM69788m = pf40.m69788m();
        int i42 = 0;
        while (i42 <= iM56413s6) {
            int[] iArr23 = iArr22;
            int i43 = i34;
            int iMin = Math.min(iArr20[i42], i43 - 1);
            jf40VarM69788m.m28985c(new jti0(iArr23[i42], iMin >= 0 ? iArr21[iMin] : -1));
            i42++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i34 = i43;
        }
        int[] iArr24 = iArr17;
        wsv0 wsv0VarM53150g = jf40VarM69788m.m53150g();
        if (((jti0) wsv0VarM53150g.get(0)).f115909b == -1) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > iM56413s6) {
                i44 = -1;
                break;
            }
            if (((jti0) wsv0VarM53150g.get(i44)).f115909b != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        for (int i45 = 1; i45 < i12; i45++) {
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr4[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean zM56412r11 = khaVar.m56412r();
                zArr7[i46] = zM56412r11;
                zArr6[i46] = zM56412r11;
            }
        }
        for (int i47 = 1; i47 < i12; i47++) {
            int i48 = 0;
            while (i48 < iM56413s4) {
                boolean[][] zArr8 = zArr4;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr9 = zArr5[i47];
                    if (zArr9[i49] && zArr5[i49][i48]) {
                        zArr9[i48] = true;
                        break;
                    }
                }
                i48++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i15];
        for (int i50 = 0; i50 < i12; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr10[i50][i52] ? 1 : 0;
            }
            iArr25[iArr24[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i12; i54++) {
            if (iArr25[iArr24[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int[] iArr26 = new int[i12];
        int[] iArr27 = new int[iM56414t2];
        if (khaVar.m56412r()) {
            int i55 = 0;
            while (i55 < i12) {
                int i56 = i55;
                iArr26[i56] = khaVar.m56413s(3);
                i55 = i56 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i12, iM56413s5);
        }
        int i57 = 0;
        while (i57 < iM56414t2) {
            int i58 = i57;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = Math.max(iMax, iArr28[((jti0) wsv0VarM53150g.get(iArr11[i58][i59])).f115908a]);
            }
            iArr27[i58] = iMax + 1;
            i57 = i58 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (khaVar.m56412r()) {
            int i60 = 0;
            while (i60 < iM56413s4) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i12) {
                    if (zArr10[i62][i60]) {
                        khaVar.m56397D(3);
                    }
                    i62++;
                    iM56413s4 = iM56413s4;
                }
                i60 = i61;
            }
        }
        khaVar.m56396C();
        int iM56414t4 = khaVar.m56414t() + 1;
        jf40 jf40VarM69788m2 = pf40.m69788m();
        jf40VarM69788m2.m28985c(kti0VarM47812y);
        if (iM56414t4 > 1) {
            jf40VarM69788m2.m28985c(kti0VarM47812y2);
            for (int i63 = 2; i63 < iM56414t4; i63++) {
                kti0VarM47812y2 = m47812y(khaVar, khaVar.m56412r(), iM56413s5, kti0VarM47812y2);
                jf40VarM69788m2.m28985c(kti0VarM47812y2);
            }
        }
        wsv0 wsv0VarM53150g2 = jf40VarM69788m2.m53150g();
        int iM56414t5 = khaVar.m56414t() + iM56414t2;
        if (iM56414t5 > iM56414t2) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int iM56413s8 = khaVar.m56413s(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM56414t5, i15);
        int[] iArr29 = new int[iM56414t5];
        int i64 = 0;
        int[] iArr30 = new int[iM56414t5];
        int i65 = 0;
        while (i65 < iM56414t2) {
            iArr29[i65] = i64;
            iArr30[i65] = iArr12[i65];
            if (iM56413s8 == 0) {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i4], i64, iArr5[i4], true);
                iArr2[i4] = iArr5[i4];
            } else {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iM56413s8 == 1) {
                    int i66 = iArr12[i4];
                    for (int i67 = 0; i67 < iArr5[i4]; i67++) {
                        zArr2[i4][i67] = iArr11[i4][i67] == i66;
                    }
                    iArr2[i4] = 1;
                } else {
                    i64 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i65 = i4 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i64 = 0;
            i65 = i4 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i15];
        int i68 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i15;
        iArr34[i64] = iM56414t5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i69 = 1;
        int i70 = 0;
        while (i69 < iM56414t5) {
            if (iM56413s8 == i68) {
                for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                    zArr14[i69][i71] = khaVar.m56412r();
                    int i72 = iArr31[i69];
                    boolean z7 = zArr14[i69][i71];
                    iArr31[i69] = i72 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i69] = iArr11[i69][i71];
                    }
                }
            }
            if (i70 == 0) {
                i3 = 0;
                if (iArr11[i69][0] == 0 && zArr14[i69][0]) {
                    for (int i73 = 1; i73 < iArr5[i69]; i73++) {
                        if (iArr11[i69][i73] == i44 && zArr14[i69][i44]) {
                            i70 = i69;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i74 = i3;
            while (i74 < iArr5[i69]) {
                if (iM56414t4 > 1) {
                    zArr15[i69][i74] = zArr14[i69][i74];
                    wsv0Var = wsv0VarM53150g2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM40624c = f2s.m40624c(iM56414t4);
                    if (!zArr[i69][i74]) {
                        int i75 = ((jti0) wsv0VarM53150g.get(iArr11[i69][i74])).f115908a;
                        int i76 = i3;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr12[i75][((jti0) wsv0VarM53150g.get(iArr11[i69][i77])).f115908a]) {
                                zArr[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            khaVar.m56397D(iM40624c);
                        } else {
                            iArr33[i74] = khaVar.m56413s(iM40624c);
                        }
                    }
                } else {
                    wsv0Var = wsv0VarM53150g2;
                    zArr = zArr15;
                }
                i74++;
                wsv0VarM53150g2 = wsv0Var;
                zArr15 = zArr;
            }
            wsv0 wsv0Var2 = wsv0VarM53150g2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i69] == 1 && iArr25[iArr30[i69]] > 0) {
                khaVar.m56396C();
            }
            i69++;
            wsv0VarM53150g2 = wsv0Var2;
            zArr15 = zArr16;
            i68 = 2;
        }
        wsv0 wsv0Var3 = wsv0VarM53150g2;
        boolean[][] zArr17 = zArr15;
        if (i70 == 0) {
            return new da80((wsv0) null, i780Var, (ia70) null, (xh70) null);
        }
        int iM56414t6 = khaVar.m56414t();
        int i78 = iM56414t6 + 1;
        jf40 jf40VarM69789n = pf40.m69789n(i78);
        int[] iArr35 = new int[i12];
        for (int i79 = 0; i79 < i78; i79++) {
            int iM56413s9 = khaVar.m56413s(16);
            int iM56413s10 = khaVar.m56413s(16);
            if (khaVar.m56412r()) {
                iM56413s = khaVar.m56413s(2);
                if (iM56413s == 3) {
                    khaVar.m56396C();
                }
                iM56413s2 = khaVar.m56413s(4);
                iM56413s3 = khaVar.m56413s(4);
            } else {
                iM56413s = 0;
                iM56413s2 = 0;
                iM56413s3 = 0;
            }
            if (khaVar.m56412r()) {
                int iM56414t7 = khaVar.m56414t();
                int iM56414t8 = khaVar.m56414t();
                int iM56414t9 = khaVar.m56414t();
                int iM56414t10 = khaVar.m56414t();
                iM56413s9 -= (iM56414t7 + iM56414t8) * ((iM56413s == 1 || iM56413s == 2) ? 2 : 1);
                iM56413s10 -= (iM56414t9 + iM56414t10) * (iM56413s == 1 ? 2 : 1);
            }
            jf40VarM69789n.m28985c(new lti0(iM56413s, iM56413s2, iM56413s3, iM56413s9, iM56413s10));
        }
        if (i78 <= 1 || !khaVar.m56412r()) {
            for (int i80 = 1; i80 < i12; i80++) {
                iArr35[i80] = Math.min(i80, iM56414t6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM40624c2 = f2s.m40624c(i78);
            for (int i81 = 1; i81 < i12; i81++) {
                iArr35[i81] = khaVar.m56413s(iM40624c2);
            }
        }
        ia70 ia70Var = new ia70(jf40VarM69789n.m53150g(), iArr35);
        khaVar.m56397D(2);
        for (int i82 = 1; i82 < i12; i82++) {
            if (iArr25[iArr24[i82]] == 0) {
                khaVar.m56396C();
            }
        }
        for (int i83 = 1; i83 < iM56414t5; i83++) {
            boolean zM56412r12 = khaVar.m56412r();
            int i84 = 0;
            while (i84 < iArr32[i83]) {
                if ((i84 <= 0 || !zM56412r12) ? i84 == 0 : khaVar.m56412r()) {
                    for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                        if (zArr17[i83][i85]) {
                            khaVar.m56414t();
                        }
                    }
                    khaVar.m56414t();
                    khaVar.m56414t();
                }
                i84++;
            }
        }
        int iM56414t11 = khaVar.m56414t() + 2;
        if (khaVar.m56412r()) {
            khaVar.m56397D(iM56414t11);
        } else {
            for (int i86 = 1; i86 < i12; i86++) {
                for (int i87 = 0; i87 < i86; i87++) {
                    if (zArr10[i86][i87]) {
                        khaVar.m56397D(iM56414t11);
                    }
                }
            }
        }
        int iM56414t12 = khaVar.m56414t();
        for (int i88 = 1; i88 <= iM56414t12; i88++) {
            khaVar.m56397D(8);
        }
        if (khaVar.m56412r()) {
            int i89 = khaVar.f122577e;
            if (i89 > 0) {
                khaVar.m56397D(8 - i89);
            }
            if (!khaVar.m56412r() ? khaVar.m56412r() : true) {
                khaVar.m56396C();
            }
            boolean zM56412r13 = khaVar.m56412r();
            boolean zM56412r14 = khaVar.m56412r();
            if (zM56412r13 || zM56412r14) {
                for (int i90 = 0; i90 < iM56414t2; i90++) {
                    for (int i91 = 0; i91 < iArr32[i90]; i91++) {
                        boolean zM56412r15 = zM56412r13 ? khaVar.m56412r() : false;
                        boolean zM56412r16 = zM56412r14 ? khaVar.m56412r() : false;
                        if (zM56412r15) {
                            khaVar.m56397D(32);
                        }
                        if (zM56412r16) {
                            khaVar.m56397D(18);
                        }
                    }
                }
            }
            boolean zM56412r17 = khaVar.m56412r();
            int iM56413s11 = zM56412r17 ? khaVar.m56413s(4) + 1 : i12;
            jf40 jf40VarM69789n2 = pf40.m69789n(iM56413s11);
            int[] iArr36 = new int[i12];
            for (int i92 = 0; i92 < iM56413s11; i92++) {
                khaVar.m56397D(3);
                int i93 = khaVar.m56412r() ? 1 : 2;
                int iM69261i = p7f.m69261i(khaVar.m56413s(8));
                int iM69262j = p7f.m69262j(khaVar.m56413s(8));
                khaVar.m56397D(8);
                jf40VarM69789n2.m28985c(new nti0(iM69261i, i93, iM69262j));
            }
            if (zM56412r17 && iM56413s11 > 1) {
                for (int i94 = 0; i94 < i12; i94++) {
                    iArr36[i94] = khaVar.m56413s(4);
                }
            }
            xh70Var = new xh70(jf40VarM69789n2.m53150g(), iArr36);
        } else {
            xh70Var = null;
        }
        return new da80(wsv0VarM53150g, new i780(wsv0Var3, iArr33), ia70Var, xh70Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x0216  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0231  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0263  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX INFO: renamed from: C */
    public static pti0 m47786C(int i, byte[] bArr, int i2) {
        int iM56414t;
        int iM56414t2;
        int i3;
        boolean z;
        int i4;
        int iM56414t3;
        boolean z2;
        boolean zM56412r;
        int i5;
        int i6;
        int i7;
        int iM56414t4;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        boolean zM56412r2;
        boolean zM56412r3;
        int iM56413s;
        int iM56413s2;
        int iM56413s3;
        int i15;
        int i16;
        kha khaVar = new kha(bArr, i + 1, i2);
        int iM56413s4 = khaVar.m56413s(8);
        int iM56413s5 = khaVar.m56413s(8);
        int iM56413s6 = khaVar.m56413s(8);
        int iM56414t5 = khaVar.m56414t();
        if (iM56413s4 == 100 || iM56413s4 == 110 || iM56413s4 == 122 || iM56413s4 == 244 || iM56413s4 == 44 || iM56413s4 == 83 || iM56413s4 == 86 || iM56413s4 == 118 || iM56413s4 == 128 || iM56413s4 == 138) {
            iM56414t = khaVar.m56414t();
            boolean zM56412r4 = iM56414t == 3 ? khaVar.m56412r() : false;
            int iM56414t6 = khaVar.m56414t();
            iM56414t2 = khaVar.m56414t();
            khaVar.m56396C();
            if (khaVar.m56412r()) {
                int i17 = iM56414t != 3 ? 8 : 12;
                i3 = 16;
                int i18 = 0;
                while (i18 < i17) {
                    if (khaVar.m56412r()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iM56415u = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iM56415u != 0) {
                                iM56415u = ((khaVar.m56415u() + i20) + 256) % 256;
                            }
                            if (iM56415u != 0) {
                                i20 = iM56415u;
                            }
                        }
                    }
                    i18++;
                }
            } else {
                i3 = 16;
            }
            z = zM56412r4;
            i4 = iM56414t6;
        } else {
            iM56414t = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iM56414t2 = 0;
        }
        int iM56414t7 = khaVar.m56414t() + 4;
        int iM56414t8 = khaVar.m56414t();
        if (iM56414t8 != 0) {
            if (iM56414t8 == 1) {
                boolean zM56412r5 = khaVar.m56412r();
                khaVar.m56415u();
                khaVar.m56415u();
                iM56413s4 = iM56413s4;
                long jM56414t = khaVar.m56414t();
                iM56414t8 = iM56414t8;
                for (int i22 = 0; i22 < jM56414t; i22++) {
                    khaVar.m56414t();
                }
                iM56414t2 = iM56414t2;
                z2 = zM56412r5;
                iM56414t3 = 0;
            } else {
                iM56414t3 = 0;
            }
            khaVar.m56414t();
            khaVar.m56396C();
            int iM56414t9 = khaVar.m56414t() + 1;
            int iM56414t10 = khaVar.m56414t() + 1;
            zM56412r = khaVar.m56412r();
            i5 = 2 - (zM56412r ? 1 : 0);
            int i23 = iM56414t10 * i5;
            if (!zM56412r) {
                khaVar.m56396C();
            }
            khaVar.m56396C();
            i6 = iM56414t9 * 16;
            i7 = i23 * 16;
            if (khaVar.m56412r()) {
                int iM56414t11 = khaVar.m56414t();
                int iM56414t12 = khaVar.m56414t();
                int iM56414t13 = khaVar.m56414t();
                int iM56414t14 = khaVar.m56414t();
                if (iM56414t == 0) {
                    i15 = 1;
                } else {
                    if (iM56414t == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    if (iM56414t == 1) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    i5 *= i16;
                }
                i6 -= (iM56414t11 + iM56414t12) * i15;
                i7 -= (iM56414t13 + iM56414t14) * i5;
            }
            int i24 = i7;
            int i25 = i6;
            int i26 = iM56413s4;
            iM56414t4 = ((i26 != 44 || i26 == 86 || i26 == 100 || i26 == 110 || i26 == 122 || i26 == 244) && (iM56413s5 & 16) != 0) ? 0 : i3;
            i8 = -1;
            f = 1.0f;
            if (khaVar.m56412r()) {
                if (khaVar.m56412r()) {
                    iM56413s = khaVar.m56413s(8);
                    if (iM56413s == 255) {
                        int i27 = i3;
                        iM56413s2 = khaVar.m56413s(i27);
                        iM56413s3 = khaVar.m56413s(i27);
                        if (iM56413s2 != 0 && iM56413s3 != 0) {
                            f = iM56413s2 / iM56413s3;
                        }
                    } else if (iM56413s < 17) {
                        f = f92433b[iM56413s];
                    } else {
                        ei6.m39077n(iM56413s, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (khaVar.m56412r()) {
                    khaVar.m56396C();
                }
                if (khaVar.m56412r()) {
                    khaVar.m56397D(3);
                    if (khaVar.m56412r()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (khaVar.m56412r()) {
                        int iM56413s7 = khaVar.m56413s(8);
                        int iM56413s8 = khaVar.m56413s(8);
                        khaVar.m56397D(8);
                        int iM69261i = p7f.m69261i(iM56413s7);
                        int iM69262j = p7f.m69262j(iM56413s8);
                        i8 = iM69261i;
                        i14 = iM69262j;
                    } else {
                        i14 = -1;
                    }
                } else {
                    i13 = -1;
                    i14 = -1;
                }
                if (khaVar.m56412r()) {
                    khaVar.m56414t();
                    khaVar.m56414t();
                }
                int i28 = i13;
                if (khaVar.m56412r()) {
                    khaVar.m56397D(65);
                }
                zM56412r2 = khaVar.m56412r();
                if (zM56412r2) {
                    m47787D(khaVar);
                }
                zM56412r3 = khaVar.m56412r();
                if (zM56412r3) {
                    m47787D(khaVar);
                }
                if (zM56412r2 || zM56412r3) {
                    khaVar.m56396C();
                }
                khaVar.m56396C();
                if (khaVar.m56412r()) {
                    khaVar.m56396C();
                    khaVar.m56414t();
                    khaVar.m56414t();
                    khaVar.m56414t();
                    khaVar.m56414t();
                    iM56414t4 = khaVar.m56414t();
                    khaVar.m56414t();
                }
                f2 = f;
                i12 = i8;
                i10 = i28;
                i11 = i14;
                i9 = iM56414t4;
            } else {
                i9 = iM56414t4;
                i10 = -1;
                i11 = -1;
                f2 = 1.0f;
                i12 = -1;
            }
            return new pti0(i26, iM56413s5, iM56413s6, iM56414t5, i25, i24, f2, i4, iM56414t2, z, zM56412r, iM56414t7, iM56414t8, iM56414t3, z2, i12, i10, i11, i9);
        }
        iM56414t3 = khaVar.m56414t() + 4;
        z2 = false;
        khaVar.m56414t();
        khaVar.m56396C();
        int iM56414t15 = khaVar.m56414t() + 1;
        int iM56414t16 = khaVar.m56414t() + 1;
        zM56412r = khaVar.m56412r();
        i5 = 2 - (zM56412r ? 1 : 0);
        int i29 = iM56414t16 * i5;
        if (!zM56412r) {
            khaVar.m56396C();
        }
        khaVar.m56396C();
        i6 = iM56414t15 * 16;
        i7 = i29 * 16;
        if (khaVar.m56412r()) {
            int iM56414t17 = khaVar.m56414t();
            int iM56414t18 = khaVar.m56414t();
            int iM56414t19 = khaVar.m56414t();
            int iM56414t110 = khaVar.m56414t();
            if (iM56414t == 0) {
                i15 = 1;
            } else {
                if (iM56414t == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                if (iM56414t == 1) {
                    i16 = 2;
                } else {
                    i16 = 1;
                }
                i5 *= i16;
            }
            i6 -= (iM56414t17 + iM56414t18) * i15;
            i7 -= (iM56414t19 + iM56414t110) * i5;
        }
        int i210 = i7;
        int i211 = i6;
        int i212 = iM56413s4;
        if (i212 != 44) {
        }
        i8 = -1;
        f = 1.0f;
        if (khaVar.m56412r()) {
            if (khaVar.m56412r()) {
                iM56413s = khaVar.m56413s(8);
                if (iM56413s == 255) {
                    int i213 = i3;
                    iM56413s2 = khaVar.m56413s(i213);
                    iM56413s3 = khaVar.m56413s(i213);
                    if (iM56413s2 != 0) {
                        f = iM56413s2 / iM56413s3;
                    }
                } else if (iM56413s < 17) {
                    f = f92433b[iM56413s];
                } else {
                    ei6.m39077n(iM56413s, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (khaVar.m56412r()) {
                khaVar.m56396C();
            }
            if (khaVar.m56412r()) {
                khaVar.m56397D(3);
                if (khaVar.m56412r()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (khaVar.m56412r()) {
                    int iM56413s9 = khaVar.m56413s(8);
                    int iM56413s10 = khaVar.m56413s(8);
                    khaVar.m56397D(8);
                    int iM69261i2 = p7f.m69261i(iM56413s9);
                    int iM69262j2 = p7f.m69262j(iM56413s10);
                    i8 = iM69261i2;
                    i14 = iM69262j2;
                } else {
                    i14 = -1;
                }
            } else {
                i13 = -1;
                i14 = -1;
            }
            if (khaVar.m56412r()) {
                khaVar.m56414t();
                khaVar.m56414t();
            }
            int i214 = i13;
            if (khaVar.m56412r()) {
                khaVar.m56397D(65);
            }
            zM56412r2 = khaVar.m56412r();
            if (zM56412r2) {
                m47787D(khaVar);
            }
            zM56412r3 = khaVar.m56412r();
            if (zM56412r3) {
                m47787D(khaVar);
            }
            if (zM56412r2) {
                khaVar.m56396C();
            } else {
                khaVar.m56396C();
            }
            khaVar.m56396C();
            if (khaVar.m56412r()) {
                khaVar.m56396C();
                khaVar.m56414t();
                khaVar.m56414t();
                khaVar.m56414t();
                khaVar.m56414t();
                iM56414t4 = khaVar.m56414t();
                khaVar.m56414t();
            }
            f2 = f;
            i12 = i8;
            i10 = i214;
            i11 = i14;
            i9 = iM56414t4;
        } else {
            i9 = iM56414t4;
            i10 = -1;
            i11 = -1;
            f2 = 1.0f;
            i12 = -1;
        }
        return new pti0(i212, iM56413s5, iM56413s6, iM56414t5, i211, i210, f2, i4, iM56414t2, z, zM56412r, iM56414t7, iM56414t8, iM56414t3, z2, i12, i10, i11, i9);
    }

    /* JADX INFO: renamed from: D */
    public static void m47787D(kha khaVar) {
        int iM56414t = khaVar.m56414t() + 1;
        khaVar.m56397D(8);
        for (int i = 0; i < iM56414t; i++) {
            khaVar.m56414t();
            khaVar.m56414t();
            khaVar.m56396C();
        }
        khaVar.m56397D(20);
    }

    /* JADX INFO: renamed from: E */
    public static final int m47788E(f2z f2zVar) {
        switch (f2zVar.ordinal()) {
            case 0:
                return R.string.mixing_fx_style_none;
            case 1:
                return R.string.mixing_fx_style_echo;
            case 2:
                return R.string.mixing_fx_style_reverb;
            case 3:
                return R.string.mixing_fx_style_riser;
            case 4:
                return R.string.mixing_fx_style_reverb_riser;
            case 5:
                return R.string.mixing_fx_style_high_pass_filter_in;
            case 6:
                return R.string.mixing_fx_style_high_pass_filter_out;
            case 7:
                return R.string.mixing_fx_style_high_pass_filter_in_high_pass_filter_out;
            case 8:
                return R.string.mixing_fx_style_echo_at_end;
            case 9:
                return R.string.mixing_fx_style_low_pass_filter_in;
            case 10:
                return R.string.mixing_fx_style_low_pass_filter_out;
            case 11:
                return R.string.mixing_fx_style_low_pass_filter_in_low_pass_filter_out;
            case 12:
                return R.string.mixing_fx_style_high_pass_filter_in_low_pass_filter_out;
            case 13:
                return R.string.mixing_fx_style_low_pass_filter_in_high_pass_filter_out;
            case 14:
                return R.string.mixing_fx_style_hp_filter_half_out;
            case 15:
                return R.string.mixing_effects_style_noise_out_end;
            case 16:
                return R.string.mixing_fx_style_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: F */
    public static String m47789F(Context context, int i) {
        Locale locale = Locale.ENGLISH;
        if (i <= 100) {
            String string = context.getString(R.string.waze_distance_now);
            wj50.m88279p(string);
            return string;
        }
        if (i <= 250) {
            return String.format(locale, context.getString(R.string.waze_distance_meters), Arrays.copyOf(new Object[]{250}, 1));
        }
        if (i <= 500) {
            return String.format(locale, context.getString(R.string.waze_distance_meters), Arrays.copyOf(new Object[]{Integer.valueOf(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER)}, 1));
        }
        return i <= 1000 ? String.format(locale, context.getString(R.string.waze_distance_km_fmt), Arrays.copyOf(new Object[]{1}, 1)) : String.format(locale, context.getString(R.string.waze_distance_km_fmt), Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(((double) i) / 1000.0d))}, 1));
    }

    /* JADX INFO: renamed from: G */
    public static int m47790G(byte[] bArr, int i) {
        int i2;
        synchronized (f92434c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f92435d;
                    if (iArr.length <= i4) {
                        f92435d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f92435d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f92435d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public static Next m47791H(yuf0 yuf0Var, fnf0 fnf0Var) {
        return Next.m15606h(yuf0.m94655c(yuf0Var, new xrh0(fnf0Var.f71280a, fnf0Var.f71281b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -9, AudioDriver.SPOTIFY_MAX_VOLUME));
    }

    /* JADX INFO: renamed from: I */
    public static String m47792I(rzf1 rzf1Var) {
        StringBuilder sb = new StringBuilder(rzf1Var.mo40353e());
        for (int i = 0; i < rzf1Var.mo40353e(); i++) {
            byte bMo40350a = rzf1Var.mo40350a(i);
            if (bMo40350a == 34) {
                sb.append("\\\"");
            } else if (bMo40350a == 39) {
                sb.append("\\'");
            } else if (bMo40350a != 92) {
                switch (bMo40350a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo40350a < 32 || bMo40350a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo40350a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo40350a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo40350a & 7) + 48));
                        } else {
                            sb.append((char) bMo40350a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0260  */
    /* JADX WARN: Code duplicated, block: B:67:0x02aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: a */
    public static final void m47793a(h50 h50Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        h50 h50Var2;
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        ?? r1;
        float f;
        cxh0 cxh0Var;
        yhh yhhVar;
        float f2;
        boolean z;
        String str;
        int i2;
        cxh0 cxh0Var2;
        xq00 xq00Var3;
        boolean z2;
        xq00 xq00Var4;
        xq00 xq00Var5;
        boolean z3;
        xq00 xq00Var6;
        int i3;
        float f3;
        xq00 xq00Var7;
        xq00 xq00Var8 = xq00Var;
        Object obj = t6x0.f217647t;
        xq00Var8.m91775k0(-2068419041);
        ug5 ug5Var = xq00Var8.f264811a;
        int i4 = i | (xq00Var8.m91766g(h50Var) ? 4 : 2) | 48 | (xq00Var8.m91770i(gh00Var) ? 256 : 128);
        if (xq00Var8.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            vb9 vb9Var = d7f0.f46142M0;
            float f4 = 8;
            xi5 xi5VarM29370g = bj5.m29370g(f4);
            long j = leu.m58815a(xq00Var8).f112823a.f229874a.f123093a;
            fmx0 fmx0VarM47993b = hmx0.m47993b(f4);
            cxh0 cxh0Var3 = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(cxh0Var3, j, fmx0VarM47993b);
            float f5 = 16;
            fxh0 fxh0VarM96830A = zsf1.m96830A(fxh0VarM64246i, 0.0f, f5, 1);
            Object objM91750T = xq00Var8.m91750T();
            if (objM91750T == obj) {
                objM91750T = tfe.m80656n(xq00Var8);
            }
            voi0 voi0Var = (voi0) objM91750T;
            zbp zbpVar = zbp.f281359f;
            boolean z4 = ((i4 & 14) == 4) | ((i4 & 896) == 256);
            Object objM91750T2 = xq00Var8.m91750T();
            if (z4 || objM91750T2 == obj) {
                objM91750T2 = new c3g(gh00Var, h50Var, 1);
                xq00Var8.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM47245v = hdi.m47245v(fxh0VarM96830A, voi0Var, zbpVar, false, null, null, (eh00) objM91750T2, 28);
            irx0 irx0VarM36744a = drx0.m36744a(xi5VarM29370g, vb9Var, xq00Var8, 0);
            int iHashCode = Long.hashCode(xq00Var8.f264809T);
            wpn0 wpn0VarM91778m = xq00Var8.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var8, fxh0VarM47245v);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var8.m91779m0();
            if (xq00Var8.f264808S) {
                xq00Var8.m91776l(c2087le);
            } else {
                xq00Var8.m91799w0();
            }
            yhh yhhVar2 = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar2, xq00Var8);
            yhh yhhVar3 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar3, xq00Var8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar4 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar4, xq00Var8);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var8);
            yhh yhhVar5 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar5, xq00Var8);
            String str2 = h50Var.f87682a;
            String str3 = h50Var.f87688g;
            String str4 = h50Var.f87685d;
            String str5 = h50Var.f87683b;
            int i5 = h50Var.f87691j;
            int length = str2.length();
            qgj qgjVar = qgj.f188480a;
            if (length <= 0 || i5 == 6) {
                r1 = 0;
                f = f4;
                cxh0Var = cxh0Var3;
                yhhVar = yhhVar4;
                xq00Var8.m91771i0(-1227400377);
                xq00Var8.m91788r(false);
            } else {
                xq00Var8.m91771i0(-1227596607);
                wwu wwuVar = (wwu) njh.f154611a.getOrDefault(str2, snu.f211026c);
                long jM64635b = njh.m64635b(str5);
                f = f4;
                cxh0Var = cxh0Var3;
                r1 = 0;
                yhhVar = yhhVar4;
                y85.m93057b(wwuVar, qgjVar, mi21.m61834r(24, cxh0Var3), jM64635b, 0L, false, xq00Var8, 56, 48);
                xq00Var8.m91788r(false);
            }
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var8, r1);
            int iHashCode2 = Long.hashCode(xq00Var8.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var8.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var8, cr70Var);
            xq00Var8.m91779m0();
            if (xq00Var8.f264808S) {
                xq00Var8.m91776l(c2087le);
            } else {
                xq00Var8.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar2, xq00Var8);
            zsf1.m96835F(wpn0VarM91778m2, r20, xq00Var8);
            AbstractC0000a.m20s(iHashCode2, xq00Var8, yhhVar, xq00Var8, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar5, xq00Var8);
            h50Var2 = h50Var;
            if (h50Var2.f87684c.length() > 0) {
                xq00Var8.m91771i0(843794873);
                irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29370g(f), d7f0.f46141L0, xq00Var8, r1);
                int iHashCode3 = Long.hashCode(xq00Var8.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var8.m91778m();
                cxh0 cxh0Var4 = cxh0Var;
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var8, cxh0Var4);
                xq00Var8.m91779m0();
                if (xq00Var8.f264808S) {
                    xq00Var8.m91776l(r34);
                } else {
                    xq00Var8.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a2, yhhVar2, xq00Var8);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar3, xq00Var8);
                AbstractC0000a.m20s(iHashCode3, xq00Var8, yhhVar, xq00Var8, vlhVar);
                zsf1.m96835F(fxh0VarM48286s3, yhhVar5, xq00Var8);
                if (str2.length() > 0) {
                    i2 = i5;
                    i3 = 6;
                    if (i2 == 6) {
                        xq00Var8.m91771i0(312449240);
                        wwu wwuVar2 = (wwu) njh.f154611a.getOrDefault(str2, snu.f211026c);
                        long jM64635b2 = njh.m64635b(str5);
                        h50Var2 = h50Var2;
                        cxh0Var4 = cxh0Var4;
                        f3 = 1.0f;
                        y85.m93057b(wwuVar2, qgjVar, mi21.m61834r(f5, cxh0Var4), jM64635b2, 0L, false, xq00Var8, 56, 48);
                        qgjVar = qgjVar;
                        xq00Var8.m91788r(r1);
                    } else {
                        f3 = 1.0f;
                    }
                    if (i2 == i3) {
                        xq00Var8.m91771i0(312758279);
                        cxh0 cxh0Var5 = cxh0Var4;
                        str = str5;
                        f2 = f3;
                        cxh0Var2 = cxh0Var5;
                        ahf1.m25932d(h50Var2.f87684c, mi21.m61822f(f3, cxh0Var5), leu.m58818d(xq00Var8).f64974j, leu.m58815a(xq00Var8).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                        xq00 xq00Var9 = xq00Var;
                        xq00Var9.m91788r(r1);
                        xq00Var7 = xq00Var9;
                    } else {
                        f2 = f3;
                        str = str5;
                        cxh0Var2 = cxh0Var4;
                        xq00Var8.m91771i0(313001226);
                        ahf1.m25932d(h50Var2.f87684c, mi21.m61822f(f2, cxh0Var2), leu.m58818d(xq00Var8).f64974j, leu.m58815a(xq00Var8).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                        xq00 xq00Var10 = xq00Var;
                        xq00Var10.m91788r(r1);
                        xq00Var7 = xq00Var10;
                    }
                    z = true;
                    xq00Var7.m91788r(true);
                    xq00Var7.m91788r(r1);
                    xq00Var3 = xq00Var7;
                } else {
                    i2 = i5;
                    i3 = 6;
                    f3 = 1.0f;
                }
                xq00Var8.m91771i0(312680252);
                xq00Var8.m91788r(r1);
                if (i2 == i3) {
                    xq00Var8.m91771i0(312758279);
                    cxh0 cxh0Var6 = cxh0Var4;
                    str = str5;
                    f2 = f3;
                    cxh0Var2 = cxh0Var6;
                    ahf1.m25932d(h50Var2.f87684c, mi21.m61822f(f3, cxh0Var6), leu.m58818d(xq00Var8).f64974j, leu.m58815a(xq00Var8).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                    xq00 xq00Var11 = xq00Var;
                    xq00Var11.m91788r(r1);
                    xq00Var7 = xq00Var11;
                } else {
                    f2 = f3;
                    str = str5;
                    cxh0Var2 = cxh0Var4;
                    xq00Var8.m91771i0(313001226);
                    ahf1.m25932d(h50Var2.f87684c, mi21.m61822f(f2, cxh0Var2), leu.m58818d(xq00Var8).f64974j, leu.m58815a(xq00Var8).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                    xq00 xq00Var12 = xq00Var;
                    xq00Var12.m91788r(r1);
                    xq00Var7 = xq00Var12;
                }
                z = true;
                xq00Var7.m91788r(true);
                xq00Var7.m91788r(r1);
                xq00Var3 = xq00Var7;
            } else {
                f2 = 1.0f;
                h50Var2 = h50Var2;
                z = true;
                str4 = str4;
                str = str5;
                i2 = i5;
                cxh0Var2 = cxh0Var;
                qgjVar = qgjVar;
                xq00Var8.m91771i0(844721277);
                xq00Var8.m91788r(r1);
                xq00Var3 = xq00Var8;
            }
            if (i2 == 6) {
                xq00Var3.m91771i0(844783432);
                if (str4.length() > 0) {
                    xq00Var3.m91771i0(844836690);
                    z3 = z;
                    ahf1.m25932d(h50Var2.f87685d, mi21.m61822f(f2, cxh0Var2), leu.m58818d(xq00Var3).f64974j, leu.m58815a(xq00Var3).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                    xq00 xq00Var13 = xq00Var;
                    xq00Var13.m91788r(r1);
                    xq00Var6 = xq00Var13;
                } else {
                    z3 = z;
                    xq00Var3.m91771i0(845041693);
                    xq00Var3.m91788r(r1);
                    xq00Var6 = xq00Var3;
                }
                xq00Var6.m91788r(r1);
                z2 = z3;
                xq00Var5 = xq00Var6;
            } else {
                z2 = z;
                xq00Var3.m91771i0(845064261);
                if (str4.length() > 0) {
                    xq00Var3.m91771i0(845117519);
                    ahf1.m25932d(h50Var2.f87685d, mi21.m61822f(f2, cxh0Var2), leu.m58818d(xq00Var3).f64974j, leu.m58815a(xq00Var3).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                    xq00 xq00Var14 = xq00Var;
                    xq00Var14.m91788r(r1);
                    xq00Var4 = xq00Var14;
                } else {
                    xq00Var3.m91771i0(845325405);
                    xq00Var3.m91788r(r1);
                    xq00Var4 = xq00Var3;
                }
                xq00Var4.m91788r(r1);
                xq00Var5 = xq00Var4;
            }
            xq00Var5.m91788r(z2);
            if (str3.length() > 0) {
                xq00Var5.m91771i0(-1225686759);
                y85.m93057b((wwu) njh.f154611a.getOrDefault(str3, snu.f211026c), qgjVar, mi21.m61834r(24, cxh0Var2), njh.m64635b(str), 0L, false, xq00Var5, 56, 48);
                xq00Var5.m91788r(r1);
            } else {
                xq00Var5.m91771i0(-1225482841);
                xq00Var5.m91788r(r1);
            }
            xq00Var5.m91788r(z2);
            fxh0Var2 = cxh0Var2;
            xq00Var2 = xq00Var5;
        } else {
            h50Var2 = h50Var;
            xq00Var8.m91757b0();
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var8;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts00(h50Var2, fxh0Var2, gh00Var, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r13v1, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v5, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v11, types: [p.xq00] */
    /* JADX INFO: renamed from: b */
    public static final void m47794b(mp40 mp40Var, fxh0 fxh0Var, gh00 gh00Var, gh00 gh00Var2, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        ?? r13;
        xq00 xq00Var2;
        ?? r4;
        int i2;
        ?? r14;
        int i3;
        ?? r15;
        kq6 kq6Var;
        xq00 xq00Var3 = xq00Var;
        vb9 vb9Var = d7f0.f46141L0;
        ub9 ub9Var = d7f0.f46144O0;
        Object obj = t6x0.f217647t;
        String str = mp40Var.f145868f;
        ArrayList<kq6> arrayList = mp40Var.f145867e;
        xq00Var3.m91775k0(-1066207166);
        ug5 ug5Var = xq00Var3.f264811a;
        int i4 = ((i & 6) == 0 ? (xq00Var3.m91766g(mp40Var) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i4 |= xq00Var3.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= xq00Var3.m91770i(gh00Var2) ? 2048 : 1024;
        }
        int i5 = i4;
        if (xq00Var3.m91752Y(i5 & 1, (i4 & 1171) != 1170)) {
            float f = 16;
            xi5 xi5VarM29370g = bj5.m29370g(f);
            long j = leu.m58815a(xq00Var3).f112823a.f229874a.f123093a;
            float f2 = 8;
            fmx0 fmx0VarM47993b = hmx0.m47993b(f2);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(f, mi21.m61822f(1.0f, nec.m64246i(cxh0Var, j, fmx0VarM47993b)));
            aaf aafVarM87496a = w9f.m87496a(xi5VarM29370g, ub9Var, xq00Var3, 0);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, fxh0VarM96865y);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var3);
            ahf1.m25932d(mp40Var.f145863a, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var3).f64972h, leu.m58815a(xq00Var3).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00 xq00Var4 = xq00Var;
            if (mp40Var.f145864b.length() > 0) {
                xq00Var4.m91771i0(1691856762);
                ahf1.m25932d(mp40Var.f145864b, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var4).f64974j, leu.m58815a(xq00Var4).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00 xq00Var5 = xq00Var;
                xq00Var5.m91788r(false);
                xq00Var2 = xq00Var5;
            } else {
                xq00Var4.m91771i0(1692043382);
                xq00Var4.m91788r(false);
                xq00Var2 = xq00Var4;
            }
            if (arrayList.isEmpty()) {
                r4 = 1;
                i2 = 0;
                xq00Var2.m91771i0(1692697110);
                xq00Var2.m91788r(false);
                r14 = xq00Var2;
            } else {
                xq00Var2.m91771i0(1692103212);
                xq00 xq00Var6 = xq00Var2;
                for (kq6 kq6Var2 : arrayList) {
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(f2), vb9Var, xq00Var6, 0);
                    int iHashCode2 = Long.hashCode(xq00Var6.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var6.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var6, cxh0Var);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    xq00Var6.m91779m0();
                    if (xq00Var6.f264808S) {
                        xq00Var6.m91776l(c2087le2);
                    } else {
                        xq00Var6.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var6);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var6);
                    zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var6);
                    zsf1.m96833D(roh.f201266k, xq00Var6);
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var6);
                    if (kq6Var2.f125223a.length() > 0) {
                        xq00Var6.m91771i0(978213841);
                        kq6Var = kq6Var2;
                        y85.m93057b((wwu) njh.f154611a.getOrDefault(kq6Var2.f125223a, snu.f211026c), qgj.f188480a, mi21.m61834r(f, cxh0Var), njh.m64635b(kq6Var2.f125224b), 0L, false, xq00Var6, 56, 48);
                        xq00Var6.m91788r(false);
                    } else {
                        kq6Var = kq6Var2;
                        xq00Var6.m91771i0(978441009);
                        xq00Var6.m91788r(false);
                    }
                    ahf1.m25932d(kq6Var.f125225c, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var6).f64974j, leu.m58815a(xq00Var6).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                    xq00 xq00Var7 = xq00Var;
                    xq00Var7.m91788r(true);
                    xq00Var6 = xq00Var7;
                }
                r4 = 1;
                i2 = 0;
                xq00Var6.m91788r(false);
                r14 = xq00Var6;
            }
            if (mp40Var.f145866d == 2) {
                r14.m91771i0(1692758614);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29370g(f), vb9Var, r14, i2);
                int iHashCode3 = Long.hashCode(r14.f264809T);
                wpn0 wpn0VarM91778m3 = r14.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(r14, fxh0VarM61822f);
                soh.f211194A.getClass();
                C2087le c2087le3 = roh.f201257b;
                r14.m91779m0();
                if (r14.f264808S) {
                    r14.m91776l(c2087le3);
                } else {
                    r14.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a2, roh.f201262g, r14);
                zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, r14);
                zsf1.m96835F(Integer.valueOf(iHashCode3), roh.f201265j, r14);
                zsf1.m96833D(roh.f201266k, r14);
                zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, r14);
                i3 = i5;
                m47795c(mp40Var, gh00Var, r14, (i3 & 14) | ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
                r14.m91788r(r4);
                r14.m91788r(false);
            } else {
                i3 = i5;
                r14.m91771i0(1692923286);
                fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
                aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(f2), ub9Var, r14, i2);
                int iHashCode4 = Long.hashCode(r14.f264809T);
                wpn0 wpn0VarM91778m4 = r14.m91778m();
                fxh0 fxh0VarM48286s4 = hqg1.m48286s(r14, fxh0VarM61822f2);
                soh.f211194A.getClass();
                C2087le c2087le4 = roh.f201257b;
                r14.m91779m0();
                if (r14.f264808S) {
                    r14.m91776l(c2087le4);
                } else {
                    r14.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, roh.f201262g, r14);
                zsf1.m96835F(wpn0VarM91778m4, roh.f201261f, r14);
                zsf1.m96835F(Integer.valueOf(iHashCode4), roh.f201265j, r14);
                zsf1.m96833D(roh.f201266k, r14);
                zsf1.m96835F(fxh0VarM48286s4, roh.f201259d, r14);
                m47795c(mp40Var, gh00Var, r14, (i3 & 14) | ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
                r14.m91788r(r4);
                r14.m91788r(false);
            }
            if (str.length() > 0) {
                r14.m91771i0(1693131048);
                ?? r10 = (i3 & 7168) == 2048 ? r4 : 0;
                Object objM91750T = r14.m91750T();
                if (r10 != 0 || objM91750T == obj) {
                    objM91750T = new st20(11, gh00Var2);
                    r14.m91793t0(objM91750T);
                }
                j15 j15VarM64634a = njh.m64634a(str, (gh00) objM91750T);
                tsg1.m81422g(mi21.m61822f(1.0f, cxh0Var), (float) r4, njh.m64635b("#1AFFFFFF"), r14, 0, 0);
                ahf1.m25933e(j15VarM64634a, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4080);
                xq00 xq00Var8 = xq00Var;
                xq00Var8.m91788r(false);
                r15 = xq00Var8;
            } else {
                r14.m91771i0(1693544278);
                r14.m91788r(false);
                r15 = r14;
            }
            r15.m91788r(r4);
            fxh0Var2 = cxh0Var;
            r13 = r15;
        } else {
            xq00Var3.m91757b0();
            fxh0Var2 = fxh0Var;
            r13 = xq00Var3;
        }
        pgv0 pgv0VarM91796v = r13.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00((Object) mp40Var, (Object) fxh0Var2, gh00Var, (Object) gh00Var2, i, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:92:0x020d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r29v0, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: c */
    public static final void m47795c(mp40 mp40Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        ?? r0;
        int i3;
        ia7 ia7Var;
        Object obj;
        eh00 eh00Var;
        ia7 ia7Var2;
        int i4;
        int i5;
        ia7 ia7Var3;
        Object obj2;
        eh00 eh00Var2;
        gh00 gh00Var2 = gh00Var;
        ia7 ia7Var4 = t6x0.f217647t;
        xq00Var.m91775k0(400968135);
        int i6 = 2;
        int i7 = 4;
        int i8 = (i & 6) == 0 ? i | (xq00Var.m91766g(mp40Var) ? 4 : 2) : i;
        int i9 = 16;
        int i10 = 32;
        if ((i & 48) == 0) {
            i8 |= xq00Var.m91770i(gh00Var2) ? 32 : 16;
        }
        int i11 = i8;
        ?? r9 = 0;
        int i12 = 1;
        if (xq00Var.m91752Y(i11 & 1, (i11 & 19) != 18)) {
            for (h50 h50Var : mp40Var.f145865c) {
                int i13 = h50Var.f87691j;
                String str = h50Var.f87684c;
                int iM38547C = edb.m38547C(i13);
                cxh0 cxh0Var = cxh0.f43038a;
                if (iM38547C != 0) {
                    if (iM38547C == i12) {
                        ia7 ia7Var5 = ia7Var4;
                        i2 = i6;
                        ?? r1 = r9;
                        i3 = i12;
                        xq00Var.m91771i0(-522845900);
                        fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zsf1.m96865y(i9, cxh0Var));
                        int i14 = (xq00Var.m91766g(h50Var) ? 1 : 0) | ((i11 & ContentType.LONG_FORM_ON_DEMAND) == 32 ? i3 : r1 == true ? 1 : 0);
                        Object objM91750T = xq00Var.m91750T();
                        if (i14 == 0) {
                            ia7Var3 = ia7Var5;
                            if (objM91750T != ia7Var3) {
                                obj2 = objM91750T;
                            }
                            eh00Var2 = (eh00) obj2;
                            if (!wl51.m88460J0(str)) {
                                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            }
                            ia7Var2 = ia7Var3;
                            dyu.m37371c(new peu(new t40(str), eh00Var2), ugu.f230259c, fxh0VarM61822f, null, vvx.m86515p(xq00Var), null, null, null, null, null, rkk.m75772x(463365035, new xyv(2, h50Var), xq00Var), xq00Var, 0, 48, 2008);
                            xq00Var.m91788r(r1);
                            r0 = r1;
                        } else {
                            ia7Var3 = ia7Var5;
                        }
                        c3g c3gVar = new c3g(gh00Var, h50Var, 3);
                        xq00Var.m91793t0(c3gVar);
                        obj2 = c3gVar;
                        eh00Var2 = (eh00) obj2;
                        if (!wl51.m88460J0(str)) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        ia7Var2 = ia7Var3;
                        dyu.m37371c(new peu(new t40(str), eh00Var2), ugu.f230259c, fxh0VarM61822f, null, vvx.m86515p(xq00Var), null, null, null, null, null, rkk.m75772x(463365035, new xyv(2, h50Var), xq00Var), xq00Var, 0, 48, 2008);
                        xq00Var.m91788r(r1);
                        r0 = r1;
                    } else if (iM38547C == i6) {
                        xq00Var.m91771i0(-522469963);
                        fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, zsf1.m96865y(i9, cxh0Var));
                        int i15 = ((i11 & ContentType.LONG_FORM_ON_DEMAND) == i10 ? i12 : r9) | (xq00Var.m91766g(h50Var) ? 1 : 0);
                        Object objM91750T2 = xq00Var.m91750T();
                        Object obj3 = objM91750T2;
                        if (i15 != 0 || objM91750T2 == ia7Var4) {
                            c3g c3gVar2 = new c3g(gh00Var2, h50Var, 4);
                            xq00Var.m91793t0(c3gVar2);
                            obj3 = c3gVar2;
                        }
                        eh00 eh00Var3 = (eh00) obj3;
                        if (wl51.m88460J0(str)) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        ia7 ia7Var6 = ia7Var4;
                        peu peuVar = new peu(new t40(str), eh00Var3);
                        wgu wguVar = wgu.f251150c;
                        rgu rguVarM86515p = vvx.m86515p(xq00Var);
                        fyf fyfVarM75772x = rkk.m75772x(-1688118100, new xyv(3, h50Var), xq00Var);
                        i3 = i12;
                        ia7Var2 = ia7Var6;
                        i2 = i6;
                        boolean z = r9 == true ? 1 : 0;
                        dyu.m37371c(peuVar, wguVar, fxh0VarM61822f2, null, rguVarM86515p, null, null, null, null, null, fyfVarM75772x, xq00Var, 0, 48, 2008);
                        xq00Var.m91788r(z);
                        r0 = z;
                    } else {
                        if (iM38547C != 3 && iM38547C != i7 && iM38547C != 5) {
                            throw lq51.m59703i(-1263806451, xq00Var, r9);
                        }
                        xq00Var.m91771i0(-1263766498);
                        ?? r6 = (i11 & ContentType.LONG_FORM_ON_DEMAND) == i10 ? i12 : r9;
                        Object objM91750T3 = xq00Var.m91750T();
                        Object obj4 = objM91750T3;
                        if (r6 != 0 || objM91750T3 == ia7Var4) {
                            st20 st20Var = new st20(12, gh00Var2);
                            xq00Var.m91793t0(st20Var);
                            obj4 = st20Var;
                        }
                        m47793a(h50Var, null, (gh00) obj4, xq00Var, r9);
                        xq00Var.m91788r(r9);
                        ia7Var2 = ia7Var4;
                        i2 = i6;
                        i5 = i7;
                        i4 = i10;
                        r0 = r9;
                        i3 = i12;
                    }
                    gh00Var2 = gh00Var;
                    i5 = 4;
                    i4 = 32;
                } else {
                    ia7 ia7Var7 = ia7Var4;
                    i2 = i6;
                    r0 = r9;
                    i3 = i12;
                    xq00Var.m91771i0(-523253612);
                    fxh0 fxh0VarM61822f3 = mi21.m61822f(1.0f, zsf1.m96865y(i9, cxh0Var));
                    int i16 = (xq00Var.m91766g(h50Var) ? 1 : 0) | ((i11 & ContentType.LONG_FORM_ON_DEMAND) == 32 ? i3 : r0 == true ? 1 : 0);
                    Object objM91750T4 = xq00Var.m91750T();
                    if (i16 == 0) {
                        ia7Var = ia7Var7;
                        if (objM91750T4 != ia7Var) {
                            obj = objM91750T4;
                        }
                        eh00Var = (eh00) obj;
                        if (!wl51.m88460J0(str)) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        ia7Var2 = ia7Var;
                        i4 = 32;
                        i5 = 4;
                        gh00Var2 = gh00Var;
                        dyu.m37371c(new peu(new t40(str), eh00Var), new tgu(4), fxh0VarM61822f3, null, vvx.m86515p(xq00Var), null, null, null, null, null, rkk.m75772x(1493205556, new xyv(1, h50Var), xq00Var), xq00Var, 0, 48, 2008);
                        xq00Var.m91788r(r0);
                    } else {
                        ia7Var = ia7Var7;
                    }
                    c3g c3gVar3 = new c3g(gh00Var, h50Var, 2);
                    xq00Var.m91793t0(c3gVar3);
                    obj = c3gVar3;
                    eh00Var = (eh00) obj;
                    if (!wl51.m88460J0(str)) {
                        throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                    ia7Var2 = ia7Var;
                    i4 = 32;
                    i5 = 4;
                    gh00Var2 = gh00Var;
                    dyu.m37371c(new peu(new t40(str), eh00Var), new tgu(4), fxh0VarM61822f3, null, vvx.m86515p(xq00Var), null, null, null, null, null, rkk.m75772x(1493205556, new xyv(1, h50Var), xq00Var), xq00Var, 0, 48, 2008);
                    xq00Var.m91788r(r0);
                }
                r9 = r0;
                i7 = i5;
                i10 = i4;
                i12 = i3;
                ia7Var4 = ia7Var2;
                i6 = i2;
                i9 = 16;
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gn40(mp40Var, gh00Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m47796d(m2r0 m2r0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1750069634);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(m2r0Var) : xq00Var.m91770i(m2r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = m2r0Var instanceof l2r0;
            rgu rguVarM86517r = vvx.m86517r(xq00Var);
            String strM54977L = k0e1.m54977L(R.string.bluejay_preset_preview_show, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.bluejay_preset_preview_stop, xq00Var);
            if (!z) {
                strM54977L2 = strM54977L;
            }
            if (wj50.m88271j(m2r0Var, k2r0.f118684a)) {
                xq00Var.m91771i0(-1810245970);
                xq00Var.m91788r(false);
            } else {
                if (!z) {
                    throw lq51.m59703i(-1810247550, xq00Var, false);
                }
                xq00Var.m91771i0(-282968690);
                Long l = ((l2r0) m2r0Var).f129068a;
                if (l == null) {
                    xq00Var.m91771i0(-282948417);
                    xq00Var.m91788r(false);
                    strM54977L = null;
                } else {
                    xq00Var.m91771i0(-282948416);
                    long jLongValue = l.longValue() / ((long) 1000);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int hours = (int) timeUnit.toHours(jLongValue);
                    int minutes = ((int) timeUnit.toMinutes(jLongValue)) - (hours * 60);
                    long j = jLongValue % ((long) 60);
                    strM54977L = k0e1.m54978M(R.string.bluejay_preset_preview_playing_timestamp, new Object[]{hours > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours), Integer.valueOf(minutes), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Long.valueOf(j)}, 2))}, xq00Var);
                    xq00Var.m91788r(false);
                }
                if (strM54977L == null) {
                    strM54977L = AbstractC0000a.m12k(xq00Var, -1810236551, R.string.bluejay_preset_preview_playing, xq00Var, false);
                } else {
                    xq00Var.m91771i0(-1810243340);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(false);
            }
            qqg1.m73532b(s850.f206558c.mo30068a(new ybs(0)), rkk.m75772x(928355906, new x2o0(strM54977L2, eh00Var, z, rguVarM86517r, strM54977L), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sqq0(m2r0Var, eh00Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final vh00 m47797e(st50 st50Var, vco vcoVar, xq00 xq00Var) {
        xq00Var.m91771i0(-552642707);
        if (st50Var == null) {
            xq00Var.m91788r(false);
            return null;
        }
        String strM79234b = st50Var.m79234b(vcoVar, true, xq00Var, 48);
        if (strM79234b == null) {
            xq00Var.m91788r(false);
            return null;
        }
        boolean zM91766g = xq00Var.m91766g(strM79234b) | xq00Var.m91766g(vcoVar);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            objM91750T = new fyf(new vt6(new pt50(st50Var, strM79234b, vcoVar), vcoVar, 1), true, -1428273814);
            xq00Var.m91793t0(objM91750T);
        }
        vh00 vh00Var = (vh00) objM91750T;
        xq00Var.m91788r(false);
        return vh00Var;
    }

    /* JADX INFO: renamed from: f */
    public static final ls50 m47798f(ym41 ym41Var) {
        wl6 wl6Var;
        pob pobVar = ym41Var.f274157b;
        if (pobVar != null) {
            if (pobVar.f179664b || pobVar.f179665c != 3) {
                pobVar = null;
            }
            if (pobVar != null && (wl6Var = pobVar.f179666d) != null) {
                return new ks50(wl6Var.f252474a);
            }
        }
        return js50.f115400a;
    }

    /* JADX INFO: renamed from: g */
    public static final vh00 m47799g(vh00 vh00Var, float f, xq00 xq00Var) {
        xq00Var.m91771i0(-784713520);
        if (ybs.m93300a(f, 0) <= 0) {
            xq00Var.m91788r(false);
            return vh00Var;
        }
        boolean zM91766g = xq00Var.m91766g(vh00Var) | xq00Var.m91760d(f);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            objM91750T = new fyf(new oq5(f, vh00Var, 10), true, 386485609);
            xq00Var.m91793t0(objM91750T);
        }
        vh00 vh00Var2 = (vh00) objM91750T;
        xq00Var.m91788r(false);
        return vh00Var2;
    }

    /* JADX INFO: renamed from: h */
    public static final void m47800h(izx0 izx0Var, juk jukVar) {
        if (((Number) jukVar.mo26605o(0, new nk4(izx0Var, 15))).intValue() == izx0Var.f107302c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + izx0Var.f107301b + ",\n\t\tbut emission happened in " + jukVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: renamed from: i */
    public static void m47801i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m47802j(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m47803k(Object[] objArr, gey geyVar) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (mvl0.m62956s(objArr[i], geyVar)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static u9g0 m47804l(st91 st91Var) {
        return new u9g0(st91Var);
    }

    /* JADX INFO: renamed from: m */
    public static int m47805m(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        c95.m31855u(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m47801i(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m47801i(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m47801i(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m47801i(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public static hkf1 m47806n(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new byh0(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            a9m a9mVar = new a9m();
            a9mVar.f13598g = d;
            a9mVar.f13599h = dArr3;
            return a9mVar;
        }
        uk80 uk80Var = new uk80();
        int length = dArr2[0].length;
        uk80Var.f231259i = new double[length];
        uk80Var.f231257g = dArr;
        uk80Var.f231258h = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return uk80Var;
    }

    /* JADX INFO: renamed from: o */
    public static String m47807o(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                jf40 jf40VarM69788m = pf40.m69788m();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int iM47805m = m47805m(bArr, i2, bArr.length, zArr);
                    if (iM47805m != bArr.length) {
                        jf40VarM69788m.m28985c(Integer.valueOf(iM47805m));
                    }
                    i2 = iM47805m + 3;
                }
                wsv0 wsv0VarM53150g = jf40VarM69788m.m53150g();
                for (int i3 = 0; i3 < wsv0VarM53150g.f254765d; i3++) {
                    if (((Integer) wsv0VarM53150g.get(i3)).intValue() + 3 < length) {
                        kha khaVar = new kha(bArr, ((Integer) wsv0VarM53150g.get(i3)).intValue() + 3, length);
                        sa8 sa8VarM47811x = m47811x(khaVar);
                        if (sa8VarM47811x.f207154a == 33 && sa8VarM47811x.f207155b == 0) {
                            khaVar.m56397D(4);
                            int iM56413s = khaVar.m56413s(3);
                            khaVar.m56396C();
                            kti0 kti0VarM47812y = m47812y(khaVar, true, iM56413s, null);
                            return mwe.m63003a(kti0VarM47812y.f126295a, kti0VarM47812y.f126296b, kti0VarM47812y.f126297c, kti0VarM47812y.f126298d, kti0VarM47812y.f126299e, kti0VarM47812y.f126300f);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static String m47808p(r300 r300Var) {
        String str = r300Var.f195387p;
        String str2 = r300Var.f195383l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return r300Var.f195387p;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m47809v(int i, r300 r300Var, byte[] bArr) {
        int i2;
        if (Objects.equals(r300Var.f195387p, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i2 = b & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(r300Var.f195387p, "video/hevc")) {
            sa8 sa8VarM47811x = m47811x(new kha(bArr, 4, i + 4));
            int i3 = sa8VarM47811x.f207154a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && sa8VarM47811x.f207156c == r300Var.f195359I - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static int m47810w(r300 r300Var) {
        String strM47808p = m47808p(r300Var);
        if (Objects.equals(strM47808p, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strM47808p, "video/hevc") || Objects.equals(strM47808p, "video/vvc")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: x */
    public static sa8 m47811x(kha khaVar) {
        khaVar.m56396C();
        return new sa8(khaVar.m56413s(6), khaVar.m56413s(6), khaVar.m56413s(3) - 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static kti0 m47812y(kha khaVar, boolean z, int i, kti0 kti0Var) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zM56412r;
        int iM56413s;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (kti0Var != null) {
                int i7 = kti0Var.f126295a;
                zM56412r = kti0Var.f126296b;
                iM56413s = kti0Var.f126297c;
                i5 = kti0Var.f126298d;
                iArr2 = kti0Var.f126299e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iM56413s2 = khaVar.m56413s(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (khaVar.m56412r()) {
                    i6 += 88;
                }
                if (khaVar.m56412r()) {
                    i6 += 8;
                }
            }
            khaVar.m56397D(i6);
            if (i > 0) {
                khaVar.m56397D((8 - i) * 2);
            }
            return new kti0(i2, z2, i3, i4, iArr, iM56413s2);
        }
        int iM56413s3 = khaVar.m56413s(2);
        zM56412r = khaVar.m56412r();
        iM56413s = khaVar.m56413s(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (khaVar.m56412r()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = khaVar.m56413s(8);
        }
        i2 = iM56413s3;
        iArr = iArr2;
        z2 = zM56412r;
        i3 = iM56413s;
        i4 = i5;
        int iM56413s4 = khaVar.m56413s(8);
        i6 = 0;
        while (i8 < i) {
            if (khaVar.m56412r()) {
                i6 += 88;
            }
            if (khaVar.m56412r()) {
                i6 += 8;
            }
        }
        khaVar.m56397D(i6);
        if (i > 0) {
            khaVar.m56397D((8 - i) * 2);
        }
        return new kti0(i2, z2, i3, i4, iArr, iM56413s4);
    }

    /* JADX INFO: renamed from: z */
    public static zz11 m47813z(int i, byte[] bArr, int i2) {
        byte b;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        kha khaVar = new kha(bArr, i3, i2 + 1);
        while (khaVar.m56399c(16)) {
            int iM56413s = khaVar.m56413s(8);
            int i4 = 0;
            while (iM56413s == 255) {
                i4 += 255;
                iM56413s = khaVar.m56413s(8);
            }
            int i5 = i4 + iM56413s;
            int iM56413s2 = khaVar.m56413s(8);
            int i6 = 0;
            while (iM56413s2 == 255) {
                i6 += 255;
                iM56413s2 = khaVar.m56413s(8);
            }
            int i7 = i6 + iM56413s2;
            if (i7 == 0 || !khaVar.m56399c(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM56414t = khaVar.m56414t();
                boolean zM56412r = khaVar.m56412r();
                int iM56414t2 = zM56412r ? khaVar.m56414t() : 0;
                int iM56414t3 = khaVar.m56414t();
                int iM56414t4 = -1;
                for (int i8 = 0; i8 <= iM56414t3; i8++) {
                    iM56414t4 = khaVar.m56414t();
                    khaVar.m56414t();
                    int iM56413s3 = khaVar.m56413s(6);
                    if (iM56413s3 == 63) {
                        return null;
                    }
                    khaVar.m56413s(iM56413s3 == 0 ? Math.max(0, iM56414t - 30) : Math.max(0, (iM56413s3 + iM56414t) - 31));
                    if (zM56412r) {
                        int iM56413s4 = khaVar.m56413s(6);
                        if (iM56413s4 == 63) {
                            return null;
                        }
                        khaVar.m56413s(iM56413s4 == 0 ? Math.max(0, iM56414t2 - 30) : Math.max(0, (iM56413s4 + iM56414t2) - 31));
                    }
                    if (khaVar.m56412r()) {
                        khaVar.m56397D(10);
                    }
                }
                return new zz11(iM56414t4, 21);
            }
            khaVar.m56397D(i7 * 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public abstract double mo25150q(double d);

    /* JADX INFO: renamed from: r */
    public abstract void mo25151r(double d, double[] dArr);

    /* JADX INFO: renamed from: s */
    public abstract void mo25152s(double d, float[] fArr);

    /* JADX INFO: renamed from: t */
    public abstract void mo25153t(double d, double[] dArr);

    /* JADX INFO: renamed from: u */
    public abstract double[] mo25154u();
}
