package p204p;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class req extends ckc0 {

    /* JADX INFO: renamed from: l */
    public static final tvl0 f198406l = new ttf(new C2109m(7));

    /* JADX INFO: renamed from: d */
    public final Context f198407d;

    /* JADX INFO: renamed from: e */
    public final wjx f198408e;

    /* JADX INFO: renamed from: f */
    public meq f198409f;

    /* JADX INFO: renamed from: g */
    public meq f198410g;

    /* JADX INFO: renamed from: h */
    public volatile Thread f198411h;

    /* JADX INFO: renamed from: i */
    public uw31 f198412i;

    /* JADX INFO: renamed from: j */
    public xs6 f198413j;

    /* JADX INFO: renamed from: k */
    public Boolean f198414k;

    public req(dr81 dr81Var, wjx wjxVar, Context context) {
        meq meqVar;
        this.f198407d = context != null ? context.getApplicationContext() : null;
        this.f198408e = wjxVar;
        if (dr81Var instanceof meq) {
            meqVar = (meq) dr81Var;
        } else {
            meq meqVar2 = meq.f142797F0;
            meqVar2.getClass();
            leq leqVar = new leq(meqVar2);
            leqVar.m33728d(dr81Var);
            meqVar = new meq(leqVar);
        }
        this.f198409f = meqVar;
        this.f198410g = meqVar;
        this.f198413j = xs6.f265509i;
        if (meqVar.f142817A0 && context == null) {
            yif1.m93819w0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m75404d(r300 r300Var, pf40 pf40Var) {
        for (int i = 0; i < pf40Var.size(); i++) {
            for (int i2 = 0; i2 < r300Var.f195374c.size(); i2++) {
                if (((ee70) r300Var.f195374c.get(i2)).f58701b.equals(pf40Var.get(i))) {
                    return i;
                }
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: e */
    public static void m75405e(bkc0 bkc0Var, meq meqVar, vjx[] vjxVarArr) {
        int i = bkc0Var.f27898a;
        for (int i2 = 0; i2 < i; i2++) {
            lf81 lf81Var = bkc0Var.f27900c[i2];
            Map map = (Map) meqVar.f142820D0.get(i2);
            if (map != null && map.containsKey(lf81Var)) {
                Map map2 = (Map) meqVar.f142820D0.get(i2);
                if (map2 != null && map2.get(lf81Var) != null) {
                    throw new ClassCastException();
                }
                vjxVarArr[i2] = null;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m75406f(bkc0 bkc0Var, meq meqVar, vjx[] vjxVarArr) {
        for (int i = 0; i < bkc0Var.f27898a; i++) {
            int i2 = bkc0Var.f27899b[i];
            if (meqVar.f142821E0.get(i) || meqVar.f52240I.contains(Integer.valueOf(i2))) {
                vjxVarArr[i] = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m75407g(bkc0 bkc0Var, meq meqVar, vjx[] vjxVarArr) {
        int i = bkc0Var.f27898a;
        lf81[] lf81VarArr = bkc0Var.f27900c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            m75408h(lf81VarArr[i2], meqVar, map);
        }
        m75408h(bkc0Var.f27903f, meqVar, map);
        for (int i3 = 0; i3 < i; i3++) {
            zq81 zq81Var = (zq81) map.get(Integer.valueOf(bkc0Var.f27899b[i3]));
            if (zq81Var != null) {
                kf81 kf81Var = zq81Var.f285331a;
                pf40 pf40Var = zq81Var.f285332b;
                vjxVarArr[i3] = (pf40Var.isEmpty() || lf81VarArr[i3].m58849b(kf81Var) == -1) ? null : new vjx(0, kf81Var, k0e1.m54979N(pf40Var));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m75408h(lf81 lf81Var, dr81 dr81Var, HashMap map) {
        for (int i = 0; i < lf81Var.f132853a; i++) {
            zq81 zq81Var = (zq81) dr81Var.f52239H.get(lf81Var.m58848a(i));
            if (zq81Var != null) {
                kf81 kf81Var = zq81Var.f285331a;
                zq81 zq81Var2 = (zq81) map.get(Integer.valueOf(kf81Var.f122101c));
                if (zq81Var2 == null || (zq81Var2.f285332b.isEmpty() && !zq81Var.f285332b.isEmpty())) {
                    map.put(Integer.valueOf(kf81Var.f122101c), zq81Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static Pair m75409i(vjx[] vjxVarArr, int i) {
        for (int i2 = 0; i2 < vjxVarArr.length; i2++) {
            vjx vjxVar = vjxVarArr[i2];
            if (vjxVar != null && vjxVar.f242078a.f122101c == i) {
                return Pair.create(vjxVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m75410j(r300 r300Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(r300Var.f195375d)) {
            return 4;
        }
        String strM75411k = m75411k(str);
        String strM75411k2 = m75411k(r300Var.f195375d);
        if (strM75411k2 == null || strM75411k == null) {
            return (z && strM75411k2 == null) ? 1 : 0;
        }
        if (strM75411k2.startsWith(strM75411k) || strM75411k.startsWith(strM75411k2)) {
            return 3;
        }
        String str2 = h0b1.f86200a;
        return strM75411k2.split("-", 2)[0].equals(strM75411k.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: k */
    public static String m75411k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m75412l(meq meqVar, int i, r300 r300Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        br81 br81Var = meqVar.f52263w;
        if (br81Var.f30021c && (i & 2048) == 0) {
            return false;
        }
        if (br81Var.f30020b) {
            boolean z = (r300Var.f195364N == 0 && r300Var.f195365O == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX INFO: renamed from: m */
    public static vjx m75413m(lf81 lf81Var, int[][] iArr, meq meqVar) {
        if (meqVar.f52263w.f30019a != 2) {
            int i = 0;
            kf81 kf81Var = null;
            keq keqVar = null;
            for (int i2 = 0; i2 < lf81Var.f132853a; i2++) {
                kf81 kf81VarM58848a = lf81Var.m58848a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < kf81VarM58848a.f122099a; i3++) {
                    if (o09.m65985u(iArr2[i3], meqVar.f142818B0)) {
                        keq keqVar2 = new keq(iArr2[i3], kf81VarM58848a.f122102d[i3]);
                        if (keqVar != null) {
                            if (ytf.f276111a.mo88921d(keqVar2.f121932b, keqVar.f121932b).mo88921d(keqVar2.f121931a, keqVar.f121931a).mo88923f() > 0) {
                                kf81Var = kf81VarM58848a;
                                i = i3;
                                keqVar = keqVar2;
                            }
                        } else {
                            kf81Var = kf81VarM58848a;
                            i = i3;
                            keqVar = keqVar2;
                        }
                    }
                }
            }
            if (kf81Var != null) {
                return new vjx(0, kf81Var, new int[]{i});
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static Pair m75414n(int i, bkc0 bkc0Var, int[][][] iArr, oeq oeqVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM69794t;
        bkc0 bkc0Var2 = bkc0Var;
        ArrayList arrayList = new ArrayList();
        int i3 = bkc0Var2.f27898a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == bkc0Var2.f27899b[i4]) {
                lf81 lf81Var = bkc0Var2.f27900c[i4];
                for (int i5 = 0; i5 < lf81Var.f132853a; i5++) {
                    kf81 kf81VarM58848a = lf81Var.m58848a(i5);
                    wsv0 wsv0VarMo41483b = oeqVar.mo41483b(i4, kf81VarM58848a, iArr[i4][i5]);
                    int i6 = kf81VarM58848a.f122099a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        peq peqVar = (peq) wsv0VarMo41483b.get(i7);
                        int iMo50397a = peqVar.mo50397a();
                        if (zArr[i7] || iMo50397a == 0) {
                            i2 = i3;
                        } else {
                            if (iMo50397a == 1) {
                                randomAccessM69794t = pf40.m69794t(peqVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(peqVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    peq peqVar2 = (peq) wsv0VarMo41483b.get(i8);
                                    int i9 = i3;
                                    if (peqVar2.mo50397a() == 2 && peqVar.mo50398b(peqVar2)) {
                                        arrayList2.add(peqVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessM69794t = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessM69794t);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            bkc0Var2 = bkc0Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((peq) list.get(i10)).f176832c;
        }
        peq peqVar3 = (peq) list.get(0);
        return Pair.create(new vjx(0, peqVar3.f176831b, iArr2), Integer.valueOf(peqVar3.f176830a));
    }

    @Override // p204p.ckc0
    /* JADX INFO: renamed from: a */
    public final void mo33114a() {
        uw31 uw31Var;
        if (this.f198411h != null) {
            c95.m31856v(Thread.currentThread().equals(this.f198411h), "DefaultTrackSelector is accessed on the wrong thread.");
        }
        if (Build.VERSION.SDK_INT >= 32 && (uw31Var = this.f198412i) != null) {
            uw31Var.m84088e();
            this.f198412i = null;
        }
        this.f38916a = null;
        this.f38917b = null;
    }

    @Override // p204p.ckc0
    /* JADX INFO: renamed from: c */
    public final void mo33116c(dr81 dr81Var) {
        if (dr81Var instanceof meq) {
            m75415o((meq) dr81Var);
        }
        leq leqVar = new leq(this.f198409f);
        leqVar.m33728d(dr81Var);
        m75415o(new meq(leqVar));
    }

    /* JADX INFO: renamed from: o */
    public final void m75415o(meq meqVar) {
        meqVar.getClass();
        boolean zEquals = this.f198409f.equals(meqVar);
        this.f198409f = meqVar;
        if (zEquals) {
            return;
        }
        if (meqVar.f142817A0 && this.f198407d == null) {
            yif1.m93819w0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        gr81 gr81Var = this.f38916a;
        if (gr81Var != null) {
            gr81Var.mo45474g(meqVar);
        }
    }

    public req(Context context) {
        this(context, new kxq0(29));
    }

    public req(Context context, kxq0 kxq0Var) {
        this(meq.f142797F0, kxq0Var, context);
    }
}
