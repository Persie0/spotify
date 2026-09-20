package p204p;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ckc0 {

    /* JADX INFO: renamed from: a */
    public gr81 f38916a;

    /* JADX INFO: renamed from: b */
    public at8 f38917b;

    /* JADX INFO: renamed from: c */
    public bkc0 f38918c;

    /* JADX INFO: renamed from: a */
    public abstract void mo33114a();

    /* JADX WARN: Code duplicated, block: B:140:0x02e7  */
    /* JADX INFO: renamed from: b */
    public final hr81 m33115b(o09[] o09VarArr, lf81 lf81Var, vsd0 vsd0Var, qp71 qp71Var) {
        String str;
        int[] iArr;
        lf81[] lf81VarArr;
        int[][][] iArr2;
        int[] iArr3;
        wsv0 wsv0VarM69794t;
        String languageTag;
        Pair pairM75414n;
        CaptioningManager captioningManager;
        Locale locale;
        boolean z;
        Context context;
        int[] iArr4;
        lf81 lf81Var2 = lf81Var;
        int i = 1;
        int[] iArr5 = new int[o09VarArr.length + 1];
        int length = o09VarArr.length + 1;
        kf81[][] kf81VarArr = new kf81[length][];
        int[][][] iArr6 = new int[o09VarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = lf81Var2.f132853a;
            kf81VarArr[i2] = new kf81[i3];
            iArr6[i2] = new int[i3][];
        }
        int length2 = o09VarArr.length;
        int[] iArr7 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr7[i4] = o09VarArr[i4].mo65996S();
        }
        int i5 = 0;
        while (i5 < lf81Var2.f132853a) {
            kf81 kf81VarM58848a = lf81Var2.m58848a(i5);
            int i6 = kf81VarM58848a.f122101c == 5 ? i : 0;
            int length3 = o09VarArr.length;
            int i7 = i;
            int i8 = 0;
            int i9 = 0;
            while (i8 < o09VarArr.length) {
                o09 o09Var = o09VarArr[i8];
                int i10 = i;
                int iMax = 0;
                for (int i11 = 0; i11 < kf81VarM58848a.f122099a; i11++) {
                    iMax = Math.max(iMax, o09Var.mo38840R(kf81VarM58848a.f122102d[i11]) & 7);
                }
                int i12 = iArr5[i8] == 0 ? i10 : 0;
                if (iMax > i9 || (iMax == i9 && i6 != 0 && i7 == 0 && i12 != 0)) {
                    i7 = i12;
                    i9 = iMax;
                    length3 = i8;
                }
                i8++;
                i = i10;
            }
            int i13 = i;
            if (length3 == o09VarArr.length) {
                iArr4 = new int[kf81VarM58848a.f122099a];
            } else {
                o09 o09Var2 = o09VarArr[length3];
                int[] iArr8 = new int[kf81VarM58848a.f122099a];
                for (int i14 = 0; i14 < kf81VarM58848a.f122099a; i14++) {
                    iArr8[i14] = o09Var2.mo38840R(kf81VarM58848a.f122102d[i14]);
                }
                iArr4 = iArr8;
            }
            int i15 = iArr5[length3];
            kf81VarArr[length3][i15] = kf81VarM58848a;
            iArr6[length3][i15] = iArr4;
            iArr5[length3] = i15 + 1;
            i5++;
            lf81Var2 = lf81Var;
            i = i13;
        }
        int i16 = i;
        lf81[] lf81VarArr2 = new lf81[o09VarArr.length];
        String[] strArr = new String[o09VarArr.length];
        int[] iArr9 = new int[o09VarArr.length];
        for (int i17 = 0; i17 < o09VarArr.length; i17++) {
            int i18 = iArr5[i17];
            lf81VarArr2[i17] = new lf81((kf81[]) h0b1.m46297Y(i18, kf81VarArr[i17]));
            iArr6[i17] = (int[][]) h0b1.m46297Y(i18, iArr6[i17]);
            strArr[i17] = o09VarArr[i17].mo838i();
            iArr9[i17] = o09VarArr[i17].f160288b;
        }
        bkc0 bkc0Var = new bkc0(iArr9, lf81VarArr2, iArr7, iArr6, new lf81((kf81[]) h0b1.m46297Y(iArr5[o09VarArr.length], kf81VarArr[o09VarArr.length])));
        req reqVar = (req) this;
        reqVar.f198411h = Thread.currentThread();
        if (reqVar.f198414k == null && (context = reqVar.f198407d) != null) {
            reqVar.f198414k = Boolean.valueOf(h0b1.m46292T(context));
        }
        int i19 = 6;
        if (reqVar.f198410g.f142817A0 && Build.VERSION.SDK_INT >= 32 && reqVar.f198412i == null) {
            reqVar.f198412i = new uw31(reqVar.f198407d, new kep(reqVar, i19), reqVar.f198414k);
        }
        int i20 = bkc0Var.f27898a;
        vjx[] vjxVarArr = new vjx[i20];
        req.m75407g(bkc0Var, reqVar.f198410g, vjxVarArr);
        req.m75405e(bkc0Var, reqVar.f198410g, vjxVarArr);
        req.m75406f(bkc0Var, reqVar.f198410g, vjxVarArr);
        meq meqVar = reqVar.f198410g;
        Context context2 = reqVar.f198407d;
        int i21 = bkc0Var.f27898a;
        Pair pairM75409i = req.m75409i(vjxVarArr, i16);
        if (pairM75409i == null) {
            int i22 = 0;
            while (true) {
                if (i22 >= i21) {
                    z = false;
                    break;
                }
                if (2 == iArr9[i22] && lf81VarArr2[i22].f132853a > 0) {
                    z = true;
                    break;
                }
                i22++;
            }
            pairM75409i = req.m75414n(1, bkc0Var, iArr6, new heq(z, reqVar, meqVar, iArr7), new C2109m(10));
            if (pairM75409i != null) {
                vjxVarArr[((Integer) pairM75409i.second).intValue()] = (vjx) pairM75409i.first;
            }
        }
        if (pairM75409i == null) {
            str = null;
        } else {
            vjx vjxVar = (vjx) pairM75409i.first;
            str = vjxVar.f242078a.f122102d[vjxVar.f242079b[0]].f195375d;
        }
        Pair pairM75409i2 = req.m75409i(vjxVarArr, 2);
        Pair pairM75409i3 = req.m75409i(vjxVarArr, 4);
        if (pairM75409i2 == null && pairM75409i3 == null) {
            Pair pairM75414n2 = meqVar.f52263w.f30019a == 2 ? null : req.m75414n(2, bkc0Var, iArr6, new geq(meqVar, str, iArr7, (!meqVar.f52251k || context2 == null) ? null : h0b1.m46275C(context2), 0), new C2109m(9));
            Pair pairM75414n3 = ((meqVar.f52236E || pairM75414n2 == null) && meqVar.f52263w.f30019a != 2) ? req.m75414n(4, bkc0Var, iArr6, new feq(meqVar), new C2109m(8)) : null;
            if (pairM75414n3 != null) {
                vjxVarArr[((Integer) pairM75414n3.second).intValue()] = (vjx) pairM75414n3.first;
            } else if (pairM75414n2 != null) {
                vjxVarArr[((Integer) pairM75414n2.second).intValue()] = (vjx) pairM75414n2.first;
            }
        }
        if (req.m75409i(vjxVarArr, 3) == null) {
            if (meqVar.f52263w.f30019a == 2) {
                pairM75414n = null;
            } else {
                if (!meqVar.f52233B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    languageTag = null;
                } else {
                    String str2 = h0b1.f86200a;
                    languageTag = locale.toLanguageTag();
                }
                pairM75414n = req.m75414n(3, bkc0Var, iArr6, new jt4(meqVar, str, languageTag, 6), new C2109m(11));
            }
            if (pairM75414n != null) {
                vjxVarArr[((Integer) pairM75414n.second).intValue()] = (vjx) pairM75414n.first;
            }
        }
        int iM65984a = o09.m65984a(0, 0, 0, 0);
        if (meqVar.f52263w.f30019a == 2) {
            iArr = iArr9;
            lf81VarArr = lf81VarArr2;
            iArr2 = iArr6;
        } else {
            fg40 fg40Var = new fg40(4);
            int i23 = 0;
            while (i23 < i20) {
                vjx vjxVar2 = vjxVarArr[i23];
                if (vjxVar2 != null) {
                    kf81 kf81Var = vjxVar2.f242078a;
                    if (meqVar.f142821E0.get(i23) || meqVar.f52240I.contains(Integer.valueOf(kf81Var.f122101c))) {
                        iArr3 = iArr9;
                    } else {
                        fg40Var.m41574g(kf81Var.f122100b);
                        int i24 = 0;
                        while (true) {
                            int[] iArr10 = vjxVar2.f242079b;
                            iArr3 = iArr9;
                            if (i24 < iArr10.length) {
                                String str3 = kf81Var.f122102d[iArr10[i24]].f195385n;
                                if (str3 != null) {
                                    fg40Var.m41574g(str3);
                                }
                                i24++;
                                iArr9 = iArr3;
                            }
                        }
                    }
                } else {
                    iArr3 = iArr9;
                }
                i23++;
                iArr9 = iArr3;
            }
            iArr = iArr9;
            hg40 hg40VarM41576i = fg40Var.m41576i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i25 = 0;
            while (i25 < i21) {
                if (iArr[i25] == 5) {
                    lf81 lf81Var3 = lf81VarArr2[i25];
                    int i26 = 0;
                    while (i26 < lf81Var3.f132853a) {
                        kf81 kf81VarM58848a2 = lf81Var3.m58848a(i26);
                        arrayList.add(kf81VarM58848a2);
                        int i27 = i25;
                        int[] iArr11 = (int[]) iArr6[i25][i26].clone();
                        lf81[] lf81VarArr3 = lf81VarArr2;
                        int[][][] iArr12 = iArr6;
                        for (int i28 = 0; i28 < iArr11.length; i28++) {
                            String str4 = kf81VarM58848a2.f122102d[i28].f195385n;
                            if (str4 != null && !hg40VarM41576i.contains(str4)) {
                                iArr11[i28] = iM65984a;
                            }
                        }
                        arrayList2.add(iArr11);
                        i26++;
                        lf81VarArr2 = lf81VarArr3;
                        i25 = i27;
                        iArr6 = iArr12;
                    }
                }
                i25++;
                lf81VarArr2 = lf81VarArr2;
                iArr6 = iArr6;
            }
            lf81VarArr = lf81VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            kf81[] kf81VarArr2 = new kf81[size];
            c95.m31855u(arrayList.size() == size);
            arrayList.toArray(kf81VarArr2);
            lf81 lf81Var4 = new lf81(kf81VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr13 = new int[size2][];
            c95.m31855u(arrayList2.size() == size2);
            arrayList2.toArray(iArr13);
            for (int i29 = 0; i29 < i21; i29++) {
                if (iArr[i29] == 5) {
                    vjx vjxVarM75413m = req.m75413m(lf81Var4, iArr13, meqVar);
                    vjxVarArr[i29] = vjxVarM75413m;
                    if (vjxVarM75413m == null) {
                        break;
                    }
                    Arrays.fill(iArr13[lf81Var4.m58849b(vjxVarM75413m.f242078a)], iM65984a);
                }
            }
        }
        for (int i30 = 0; i30 < i21; i30++) {
            int i31 = iArr[i30];
            if (i31 != 2 && i31 != 1) {
                if (i31 != 3 && i31 != 4) {
                    if (i31 != 5 && vjxVarArr[i30] == null) {
                        vjxVarArr[i30] = req.m75413m(lf81VarArr[i30], iArr2[i30], meqVar);
                    }
                }
            }
        }
        req.m75407g(bkc0Var, reqVar.f198410g, vjxVarArr);
        req.m75405e(bkc0Var, reqVar.f198410g, vjxVarArr);
        req.m75406f(bkc0Var, reqVar.f198410g, vjxVarArr);
        wjx wjxVar = reqVar.f198408e;
        at8 at8Var = reqVar.f38917b;
        at8Var.getClass();
        xjx[] xjxVarArrMo57636b = wjxVar.mo57636b(vjxVarArr, at8Var);
        qkw0[] qkw0VarArr = new qkw0[i20];
        for (int i32 = 0; i32 < i20; i32++) {
            qkw0VarArr[i32] = (reqVar.f198410g.f142821E0.get(i32) || reqVar.f198410g.f52240I.contains(Integer.valueOf(bkc0Var.f27899b[i32])) || (bkc0Var.f27899b[i32] != -2 && xjxVarArrMo57636b[i32] == null)) ? null : qkw0.f189660c;
        }
        reqVar.f198410g.getClass();
        meq meqVar2 = reqVar.f198410g;
        if (meqVar2.f52263w.f30019a != 0) {
            int i33 = 0;
            int i34 = 0;
            int i35 = -1;
            while (true) {
                if (i34 >= bkc0Var.f27898a) {
                    if (i33 != 1) {
                        break;
                    }
                    int i36 = meqVar2.f52263w.f30020b ? 1 : 2;
                    qkw0 qkw0Var = qkw0VarArr[i35];
                    qkw0VarArr[i35] = new qkw0(i36, qkw0Var != null && qkw0Var.f189662b);
                    break;
                }
                int i37 = bkc0Var.f27899b[i34];
                xjx xjxVar = xjxVarArrMo57636b[i34];
                if (i37 != 1 && xjxVar != null) {
                    break;
                }
                if (i37 == 1 && xjxVar != null && xjxVar.length() == 1) {
                    if (req.m75412l(meqVar2, iArr2[i34][bkc0Var.f27900c[i34].m58849b(xjxVar.mo34618n())][xjxVar.mo34614f(0)], xjxVar.mo34621s())) {
                        i33++;
                        i35 = i34;
                    }
                }
                i34++;
            }
        }
        Pair pairCreate = Pair.create(qkw0VarArr, xjxVarArrMo57636b);
        xjx[] xjxVarArr = (xjx[]) pairCreate.second;
        int length4 = xjxVarArr.length;
        List[] listArr = new List[length4];
        for (int i38 = 0; i38 < xjxVarArr.length; i38++) {
            xjx xjxVar2 = xjxVarArr[i38];
            if (xjxVar2 != null) {
                wsv0VarM69794t = pf40.m69794t(xjxVar2);
            } else {
                kf40 kf40Var = pf40.f176960b;
                wsv0VarM69794t = wsv0.f254763e;
            }
            listArr[i38] = wsv0VarM69794t;
        }
        jf40 jf40Var = new jf40(4);
        int i39 = 0;
        while (true) {
            int i40 = bkc0Var.f27898a;
            lf81[] lf81VarArr4 = bkc0Var.f27900c;
            if (i39 >= i40) {
                break;
            }
            lf81 lf81Var5 = lf81VarArr4[i39];
            int i41 = 0;
            while (i41 < lf81Var5.f132853a) {
                kf81 kf81VarM58848a3 = lf81Var5.m58848a(i41);
                int i42 = lf81VarArr4[i39].m58848a(i41).f122099a;
                int[] iArr14 = new int[i42];
                int i43 = 0;
                for (int i44 = 0; i44 < i42; i44++) {
                    if ((bkc0Var.f27902e[i39][i41][i44] & 7) == 4) {
                        iArr14[i43] = i44;
                        i43++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr14, i43);
                List[] listArr2 = listArr;
                int iMin = 16;
                String str5 = null;
                int i45 = 0;
                boolean z2 = false;
                int i46 = 0;
                while (i45 < iArrCopyOf.length) {
                    String str6 = lf81VarArr4[i39].m58848a(i41).f122102d[iArrCopyOf[i45]].f195387p;
                    int i47 = i46 + 1;
                    if (i46 == 0) {
                        str5 = str6;
                    } else {
                        z2 = (!Objects.equals(str5, str6)) | z2;
                    }
                    iMin = Math.min(iMin, bkc0Var.f27902e[i39][i41][i45] & 24);
                    i45++;
                    i46 = i47;
                }
                if (z2) {
                    iMin = Math.min(iMin, bkc0Var.f27901d[i39]);
                }
                boolean z3 = iMin != 0;
                int i48 = kf81VarM58848a3.f122099a;
                int[] iArr15 = new int[i48];
                boolean[] zArr = new boolean[i48];
                int i49 = 0;
                while (i49 < kf81VarM58848a3.f122099a) {
                    iArr15[i49] = bkc0Var.f27902e[i39][i41][i49] & 7;
                    int i50 = 0;
                    boolean z4 = false;
                    while (i50 < length4) {
                        List list = listArr2[i50];
                        int i51 = length4;
                        int i52 = i39;
                        int i53 = 0;
                        while (i53 < list.size()) {
                            xjx xjxVar3 = (xjx) list.get(i53);
                            int i54 = i53;
                            if (xjxVar3.mo34618n().equals(kf81VarM58848a3) && xjxVar3.mo34617m(i49) != -1) {
                                z4 = true;
                                break;
                            }
                            i53 = i54 + 1;
                        }
                        i50++;
                        length4 = i51;
                        i39 = i52;
                    }
                    zArr[i49] = z4;
                    i49++;
                    i39 = i39;
                }
                jf40Var.m28985c(new st81(kf81VarM58848a3, z3, iArr15, zArr));
                i41++;
                listArr = listArr2;
                length4 = length4;
                i39 = i39;
            }
            i39++;
            length4 = length4;
        }
        lf81 lf81Var6 = bkc0Var.f27903f;
        for (int i55 = 0; i55 < lf81Var6.f132853a; i55++) {
            kf81 kf81VarM58848a4 = lf81Var6.m58848a(i55);
            int[] iArr16 = new int[kf81VarM58848a4.f122099a];
            Arrays.fill(iArr16, 0);
            jf40Var.m28985c(new st81(kf81VarM58848a4, false, iArr16, new boolean[kf81VarM58848a4.f122099a]));
        }
        return new hr81((qkw0[]) pairCreate.first, (xjx[]) pairCreate.second, new tt81(jf40Var.m53150g()), bkc0Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo33116c(dr81 dr81Var);
}
