package p204p;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class jth {

    /* JADX INFO: renamed from: a */
    public final Context f115886a;

    /* JADX INFO: renamed from: b */
    public final luk f115887b;

    /* JADX INFO: renamed from: c */
    public final luk f115888c;

    /* JADX INFO: renamed from: d */
    public final y1n f115889d;

    /* JADX INFO: renamed from: e */
    public final ew51 f115890e;

    /* JADX INFO: renamed from: f */
    public final xgs f115891f;

    /* JADX INFO: renamed from: g */
    public final boolean f115892g;

    public jth(Context context, luk lukVar, luk lukVar2, y1n y1nVar, ew51 ew51Var, xgs xgsVar, boolean z) {
        this.f115886a = context;
        this.f115887b = lukVar;
        this.f115888c = lukVar2;
        this.f115889d = y1nVar;
        this.f115890e = ew51Var;
        this.f115891f = xgsVar;
        this.f115892g = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m54286a(jth jthVar, String str, ibk ibkVar) {
        ath athVar;
        boolean zBooleanValue;
        jthVar.getClass();
        if (ibkVar instanceof ath) {
            athVar = (ath) ibkVar;
            int i = athVar.f19682c;
            if ((i & Integer.MIN_VALUE) != 0) {
                athVar.f19682c = i - Integer.MIN_VALUE;
            } else {
                athVar = new ath(jthVar, ibkVar);
            }
        } else {
            athVar = new ath(jthVar, ibkVar);
        }
        Object objM90937b = athVar.f19680a;
        int i2 = athVar.f19682c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM90937b);
                xgs xgsVar = jthVar.f115891f;
                athVar.f19682c = 1;
                objM90937b = xgsVar.m90937b(str, athVar);
                yuk yukVar = yuk.f276404a;
                if (objM90937b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM90937b);
            }
            zBooleanValue = ((Boolean) objM90937b).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m54287b(jth jthVar, iy81 iy81Var, izl0 izl0Var, long j, ibk ibkVar) {
        bth bthVar;
        jthVar.getClass();
        if (ibkVar instanceof bth) {
            bthVar = (bth) ibkVar;
            int i = bthVar.f30866f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bthVar.f30866f = i - Integer.MIN_VALUE;
            } else {
                bthVar = new bth(jthVar, ibkVar);
            }
        } else {
            bthVar = new bth(jthVar, ibkVar);
        }
        Object objM40135c = bthVar.f30864d;
        int i2 = bthVar.f30866f;
        if (i2 == 0) {
            bga.m29073P(objM40135c);
            String strM93816v = yif1.m93816v(iy81Var.f106906a);
            if (strM93816v == null) {
                return null;
            }
            ew51 ew51Var = jthVar.f115890e;
            Locale locale = iy81Var.f106908c;
            bthVar.f30861a = iy81Var;
            bthVar.f30862b = izl0Var;
            bthVar.f30863c = j;
            bthVar.f30866f = 1;
            objM40135c = ew51Var.m40135c(strM93816v, locale, bthVar);
            yuk yukVar = yuk.f276404a;
            if (objM40135c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = bthVar.f30863c;
            izl0Var = bthVar.f30862b;
            iy81Var = bthVar.f30861a;
            bga.m29073P(objM40135c);
        }
        long j2 = j;
        List list = (List) objM40135c;
        if (list.isEmpty()) {
            return null;
        }
        Context context = jthVar.f115886a;
        t2b0 t2b0Var = iy81Var.f106907b;
        Integer num = izl0Var.f107257c.f101547a;
        int iIntValue = num != null ? num.intValue() : new Integer(xl81.m91397f(4)).intValue();
        Integer num2 = izl0Var.f107257c.f101548b;
        return new hv51(context, list, t2b0Var, iIntValue, num2 != null ? num2.intValue() : new Integer(xl81.m91394c(4)).intValue(), j2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m54288c(jth jthVar, a691 a691Var, gh00 gh00Var, ibk ibkVar) {
        gth gthVar;
        zz11 zz11Var;
        if (ibkVar instanceof gth) {
            gthVar = (gth) ibkVar;
            int i = gthVar.f84196f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gthVar.f84196f = i - Integer.MIN_VALUE;
            } else {
                gthVar = new gth(jthVar, ibkVar);
            }
        } else {
            gthVar = new gth(jthVar, ibkVar);
        }
        Object obj = gthVar.f84194d;
        int i2 = gthVar.f84196f;
        if (i2 == 0) {
            bga.m29073P(obj);
            zz11Var = new zz11(25);
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zz11 zz11Var2 = gthVar.f84193c;
            gh00Var = gthVar.f84192b;
            a691 a691Var2 = gthVar.f84191a;
            bga.m29073P(obj);
            zz11Var = zz11Var2;
            a691Var = a691Var2;
        }
        while (true) {
            a691Var.getClass();
            if (Looper.myLooper() != a691Var.f12737n) {
                throw new IllegalStateException("Transformer is accessed on the wrong thread.");
            }
            ahp ahpVar = a691Var.f12743t;
            int iM25993b = ahpVar == null ? 0 : ahpVar.m25993b(zz11Var);
            yuk yukVar = yuk.f276404a;
            if (iM25993b == 0) {
                gthVar.f84191a = a691Var;
                gthVar.f84192b = gh00Var;
                gthVar.f84193c = zz11Var;
                gthVar.f84196f = 1;
                if (njg1.m64619l(50L, gthVar) == yukVar) {
                    return yukVar;
                }
            } else {
                gh00Var.invoke(new Float(zz11Var.f287861b / 100.0f));
                if (zz11Var.f287861b >= 100) {
                    return w2a1.f247311a;
                }
                gthVar.f84191a = a691Var;
                gthVar.f84192b = gh00Var;
                gthVar.f84193c = zz11Var;
                gthVar.f84196f = 2;
                if (njg1.m64619l(50L, gthVar) == yukVar) {
                    return yukVar;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m54290h(ArrayList arrayList, izl0 izl0Var) {
        if (arrayList.size() == 1) {
            iy81 iy81Var = (iy81) arrayList.get(0);
            if ((iy81Var instanceof iy81) && izl0Var.f107259e == null && izl0Var.f107258d == null) {
                ieu ieuVar = izl0Var.f107257c;
                t2b0 t2b0Var = iy81Var.f106907b;
                if (t2b0Var.f195112a == 0 && t2b0Var.f195113b == Long.MAX_VALUE && wj50.m88271j(iy81Var.f106908c, Locale.ROOT)) {
                    ieuVar.getClass();
                    if (xl81.m91394c(4) <= 720 && ieuVar.f101547a == null && ieuVar.f101548b == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54291d(ArrayList arrayList) {
        if (this.f115892g && arrayList.size() == 1) {
            iy81 iy81Var = (iy81) arrayList.get(0);
            if (iy81Var instanceof iy81) {
                t2b0 t2b0Var = iy81Var.f106907b;
                if (t2b0Var.f195112a != 0 || t2b0Var.f195113b != Long.MAX_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX INFO: renamed from: e */
    public final Object m54292e(ArrayList arrayList, izl0 izl0Var, String str, mcu mcuVar, gh00 gh00Var, String str2, boolean z, Integer num, gh00 gh00Var2, boolean z2, ibk ibkVar) throws Throwable {
        eth ethVar;
        ?? r1;
        gh00 gh00Var3;
        Integer num2;
        Object objM56684z;
        yuk yukVar;
        String str3;
        izl0 izl0Var2;
        LinkedHashMap linkedHashMap;
        boolean z3;
        iy81 iy81Var;
        String str4;
        long j;
        ?? r2;
        gh00 gh00Var4;
        boolean z4;
        String str5;
        String str6;
        String str7;
        Matrix matrix;
        Context context = this.f115886a;
        if (ibkVar instanceof eth) {
            ethVar = (eth) ibkVar;
            int i = ethVar.f62719N0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ethVar.f62719N0 = i - Integer.MIN_VALUE;
            } else {
                ethVar = new eth(this, ibkVar);
            }
        } else {
            ethVar = new eth(this, ibkVar);
        }
        eth ethVar2 = ethVar;
        Object objM56684z2 = ethVar2.f62717L0;
        int i2 = ethVar2.f62719N0;
        yuk yukVar2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56684z2);
            iy81 iy81Var2 = (iy81) arrayList.get(0);
            t2b0 t2b0Var = iy81Var2.f106907b;
            long j2 = t2b0Var.f195113b - t2b0Var.f195112a;
            if (izl0Var.f107259e == null && izl0Var.f107258d == null) {
                ieu ieuVar = izl0Var.f107257c;
                if (str2 == null && !z) {
                    ieuVar.getClass();
                    if (xl81.m91394c(4) <= 720 && ieuVar.f101547a == null && ieuVar.f101548b == null) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iy81 iy81Var3 = (iy81) it.next();
                                    if (!(iy81Var3 instanceof iy81)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (wj50.m88271j(iy81Var3.f106908c, Locale.ROOT)) {
                                    }
                                }
                            }
                        }
                        r1 = 0;
                    }
                }
                r1 = 1;
            } else {
                r1 = 1;
            }
            String strM77250i = r1 != 0 ? s571.m77250i(izl0Var.f107255a, "_editlist_temp.mp4") : str;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            gh00Var3 = gh00Var;
            fth fthVar = new fth(r1, iy81Var2, this, strM77250i, mcuVar, izl0Var, gh00Var3, gh00Var2, z2, linkedHashMap2, null);
            ethVar2.f62723a = izl0Var;
            ethVar2.f62724b = str;
            ethVar2.f62725c = gh00Var3;
            ethVar2.f62726d = str2;
            num2 = num;
            ethVar2.f62727e = num2;
            ethVar2.f62728f = gh00Var2;
            ethVar2.f62729g = iy81Var2;
            ethVar2.f62730h = strM77250i;
            ethVar2.f62731i = linkedHashMap2;
            ethVar2.f62732t = z;
            ethVar2.f62720X = z2;
            ethVar2.f62721Y = j2;
            ethVar2.f62722Z = r1;
            ethVar2.f62719N0 = 1;
            objM56684z = kk40.m56684z(fthVar, ethVar2);
            yukVar = yukVar2;
            if (objM56684z != yukVar) {
                str3 = strM77250i;
                izl0Var2 = izl0Var;
                linkedHashMap = linkedHashMap2;
                z3 = z;
                iy81Var = iy81Var2;
                str4 = str;
                j = j2;
                r2 = r1;
                gh00Var4 = gh00Var2;
                z4 = z2;
                str5 = str2;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str7 = ethVar2.f62730h;
            try {
                bga.m29073P(objM56684z2);
                xsh xshVar = (xsh) objM56684z2;
                new File(str7).delete();
                return xshVar;
            } catch (Throwable th) {
                th = th;
                new File(str7).delete();
                throw th;
            }
        }
        int i3 = ethVar2.f62722Z;
        long j3 = ethVar2.f62721Y;
        boolean z5 = ethVar2.f62720X;
        z3 = ethVar2.f62732t;
        LinkedHashMap linkedHashMap3 = ethVar2.f62731i;
        String str8 = ethVar2.f62730h;
        iy81 iy81Var4 = ethVar2.f62729g;
        gh00 gh00Var5 = ethVar2.f62728f;
        Integer num3 = ethVar2.f62727e;
        String str9 = ethVar2.f62726d;
        gh00 gh00Var6 = ethVar2.f62725c;
        String str10 = ethVar2.f62724b;
        izl0 izl0Var3 = ethVar2.f62723a;
        bga.m29073P(objM56684z2);
        r2 = i3;
        str5 = str9;
        gh00Var3 = gh00Var6;
        yukVar = yukVar2;
        z4 = z5;
        iy81Var = iy81Var4;
        str4 = str10;
        linkedHashMap = linkedHashMap3;
        izl0Var2 = izl0Var3;
        objM56684z = objM56684z2;
        j = j3;
        num2 = num3;
        gh00Var4 = gh00Var5;
        str3 = str8;
        long j4 = j;
        xsh xshVar2 = (xsh) objM56684z;
        String str11 = str5;
        dne dneVar = izl0Var2.f107259e;
        gh00 gh00Var7 = gh00Var4;
        occ1 occ1Var = izl0Var2.f107258d;
        Integer num4 = num2;
        ieu ieuVar2 = izl0Var2.f107257c;
        if (dneVar != null) {
            Integer num5 = new Integer(0);
            Collection collection = (List) linkedHashMap.get(new Integer(0));
            if (collection == null) {
                collection = lau.f131415a;
            }
            linkedHashMap.put(num5, g6f.m43701O0(new k4t0(dneVar), collection));
        }
        if (r2 != 0) {
            if (linkedHashMap.isEmpty() && occ1Var == null && str11 == null && !z3) {
                ieuVar2.getClass();
                if (xl81.m91394c(4) <= 720 && ieuVar2.f101547a == null && ieuVar2.f101548b == null) {
                    iy81Var.getClass();
                }
            }
            iy81Var.getClass();
            int iIntValue = num4 != null ? num4.intValue() : zdg1.m95928i(new File(str3).length(), j4);
            try {
                List listSingletonList = Collections.singletonList(new iy81(str3, new t2b0(0L, j4), iy81Var.f106908c));
                ieu ieuVar3 = izl0Var2.f107257c;
                if (occ1Var != null) {
                    try {
                        matrix = new Matrix();
                        matrix.postScale(occ1Var.f163897a, occ1Var.f163898b);
                        matrix.postTranslate(occ1Var.f163899c, occ1Var.f163900d);
                    } catch (Throwable th2) {
                        th = th2;
                        str7 = str3;
                        new File(str7).delete();
                        throw th;
                    }
                } else {
                    matrix = null;
                }
                fsh fshVarM95929j = zdg1.m95929j(listSingletonList, ieuVar3, linkedHashMap, z3, true, matrix);
                ffp ffpVarM95931l = zdg1.m95931l(context, ieuVar2, new Integer(iIntValue));
                ieuVar2.getClass();
                mcu mcuVar2 = new mcu(context, new fcp(new t0h1(context, 7)), gh61.f79843a, (Object) null, 22);
                hch hchVar = new hch(12, gh00Var3);
                Map mapSingletonMap = Collections.singletonMap(new Integer(0), Boolean.FALSE);
                ethVar2.f62723a = null;
                ethVar2.f62724b = null;
                ethVar2.f62725c = null;
                ethVar2.f62726d = null;
                ethVar2.f62727e = null;
                ethVar2.f62728f = null;
                ethVar2.f62729g = null;
                ethVar2.f62730h = str3;
                ethVar2.f62731i = null;
                ethVar2.f62732t = z3;
                ethVar2.f62720X = z4;
                ethVar2.f62721Y = j4;
                ethVar2.f62722Z = r2;
                ethVar2.f62719N0 = 2;
                String str12 = str3;
                try {
                    str6 = str12;
                    try {
                        objM56684z2 = kk40.m56684z(new dth(str11, this, gh00Var7, izl0Var2, ffpVarM95931l, mcuVar2, false, z4, str4, mapSingletonMap, fshVarM95929j, hchVar, null), ethVar2);
                        if (objM56684z2 != yukVar) {
                            str7 = str6;
                            xsh xshVar3 = (xsh) objM56684z2;
                            new File(str7).delete();
                            return xshVar3;
                        }
                        return yukVar;
                    } catch (Throwable th3) {
                        th = th3;
                        str7 = str6;
                        new File(str7).delete();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str6 = str12;
                }
            } catch (Throwable th5) {
                th = th5;
                str6 = str3;
            }
        }
        String str13 = str4;
        String str14 = str3;
        if (!wj50.m88271j(str14, str13)) {
            new File(str14).renameTo(new File(str13));
        }
        gh00Var3.invoke(new Float(1.0f));
        if (!z4 || xshVar2.f265592b != null) {
            return xshVar2;
        }
        ki71 ki71VarM43100x = fyg1.m43100x(str13, str11);
        ctb1 ctb1VarM95939t = zdg1.m95939t(str13);
        return new xsh(xshVar2.f265591a, ki71VarM43100x, ctb1VarM95939t != null ? new Integer(ctb1VarM95939t.f41850a) : xshVar2.f265593c, ctb1VarM95939t != null ? new Integer(ctb1VarM95939t.f41851b) : xshVar2.f265594d, xshVar2.f265595e);
    }

    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0245  */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Integer, java.lang.String, java.util.ArrayList, p.fbk, p.gh00, p.izl0, p.jth, p.ya6] */
    /* JADX INFO: renamed from: f */
    public final Object m54293f(jy81 jy81Var, izl0 izl0Var, gh00 gh00Var, ly81 ly81Var, String str, boolean z, Integer num, gh00 gh00Var2, boolean z2, ibk ibkVar) {
        ith ithVar;
        ArrayList<iy81> arrayListM54781a;
        int i;
        ?? r9;
        yuk yukVar;
        ly81 ly81VarM92661a;
        mcu mcuVar;
        boolean zM54291d;
        yuk yukVar2;
        String str2;
        Integer num2;
        boolean z3;
        ya6 ya6Var;
        boolean z4;
        jth jthVar;
        izl0 izl0Var2;
        gh00 gh00Var3;
        int i2;
        String str3;
        gh00 gh00Var4;
        int i3;
        ArrayList arrayList;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        yuk yukVar3;
        gh00 gh00Var5;
        jth jthVar2;
        String str4;
        gh00 gh00Var6;
        boolean z5;
        int i6;
        boolean z6;
        ya6 ya6Var2;
        int i7;
        Object objM89557A;
        yuk yukVar4;
        jth jthVar3;
        int i8;
        boolean z7;
        int i9;
        int i10;
        boolean z8;
        gh00 gh00Var7;
        ysh yshVar;
        gh00 gh00Var8;
        jth jthVar4;
        if (ibkVar instanceof ith) {
            ithVar = (ith) ibkVar;
            int i11 = ithVar.f105563P0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ithVar.f105563P0 = i11 - Integer.MIN_VALUE;
            } else {
                ithVar = new ith(this, ibkVar);
            }
        } else {
            ithVar = new ith(this, ibkVar);
        }
        ith ithVar2 = ithVar;
        Object objM56684z = ithVar2.f105561N0;
        int i12 = ithVar2.f105563P0;
        yuk yukVar5 = yuk.f276404a;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    bga.m29073P(objM56684z);
                    obj2 = objM56684z;
                    return (xsh) obj2;
                }
                if (i12 == 2) {
                    obj = objM56684z;
                    boolean z9 = ithVar2.f105565Y;
                    i4 = ithVar2.f105559L0;
                    i5 = ithVar2.f105566Z;
                    z4 = ithVar2.f105564X;
                    z3 = ithVar2.f105576t;
                    ya6Var = ithVar2.f105575i;
                    String str5 = ithVar2.f105574h;
                    ArrayList arrayList2 = ithVar2.f105573g;
                    jthVar = ithVar2.f105572f;
                    gh00Var3 = ithVar2.f105571e;
                    num2 = ithVar2.f105570d;
                    str3 = ithVar2.f105569c;
                    gh00Var4 = ithVar2.f105568b;
                    izl0 izl0Var3 = ithVar2.f105567a;
                    bga.m29073P(obj);
                    izl0Var2 = izl0Var3;
                    yukVar2 = yukVar5;
                    arrayList = arrayList2;
                    str2 = str5;
                    zM54291d = z9;
                    int i13 = i5;
                    i2 = i4;
                    arrayListM54781a = arrayList;
                    i3 = i13;
                    if (((Boolean) obj).booleanValue()) {
                        yukVar3 = yukVar2;
                        gh00Var5 = gh00Var3;
                        jthVar2 = jthVar;
                        str4 = str2;
                        gh00Var6 = gh00Var4;
                        z5 = z4;
                        i6 = i2;
                        z6 = zM54291d;
                        ya6Var2 = ya6Var;
                        i7 = 0;
                    } else {
                        yukVar3 = yukVar2;
                        gh00Var5 = gh00Var3;
                        jthVar2 = jthVar;
                        str4 = str2;
                        gh00Var6 = gh00Var4;
                        z5 = z4;
                        i6 = i2;
                        z6 = zM54291d;
                        ya6Var2 = ya6Var;
                        i7 = 1;
                    }
                } else if (i12 == 3) {
                    i8 = ithVar2.f105560M0;
                    z8 = ithVar2.f105565Y;
                    int i14 = ithVar2.f105559L0;
                    i9 = ithVar2.f105566Z;
                    boolean z10 = ithVar2.f105564X;
                    z7 = ithVar2.f105576t;
                    ya6 ya6Var3 = ithVar2.f105575i;
                    String str6 = ithVar2.f105574h;
                    jth jthVar5 = ithVar2.f105572f;
                    gh00Var7 = ithVar2.f105571e;
                    String str7 = ithVar2.f105569c;
                    gh00 gh00Var9 = ithVar2.f105568b;
                    izl0 izl0Var4 = ithVar2.f105567a;
                    bga.m29073P(objM56684z);
                    i10 = i14;
                    yukVar4 = yukVar5;
                    jthVar3 = jthVar5;
                    str4 = str6;
                    gh00Var6 = gh00Var9;
                    ya6Var2 = ya6Var3;
                    z5 = z10;
                    str3 = str7;
                    izl0Var2 = izl0Var4;
                    objM89557A = objM56684z;
                    jthVar4 = jthVar3;
                    gh00Var8 = gh00Var7;
                    i3 = i9;
                    z3 = z7;
                    yshVar = (ysh) objM89557A;
                    izl0 izl0Var5 = izl0Var2;
                    String str8 = str3;
                    ya6 ya6Var4 = ya6Var2;
                    gh00 gh00Var10 = gh00Var6;
                    String str9 = str4;
                    fsh fshVar = yshVar.f275779b;
                    ffp ffpVar = yshVar.f275778a;
                    Map map = yshVar.f275780c;
                    ithVar2.f105567a = null;
                    ithVar2.f105568b = null;
                    ithVar2.f105569c = null;
                    ithVar2.f105570d = null;
                    ithVar2.f105571e = null;
                    ithVar2.f105572f = null;
                    ithVar2.f105573g = null;
                    ithVar2.f105574h = null;
                    ithVar2.f105575i = null;
                    ithVar2.f105576t = z3;
                    ithVar2.f105564X = z5;
                    ithVar2.f105566Z = i3;
                    ithVar2.f105559L0 = i10;
                    ithVar2.f105565Y = z8;
                    ithVar2.f105560M0 = i8;
                    ithVar2.f105563P0 = 4;
                    jthVar4.getClass();
                    objM56684z = kk40.m56684z(new dth(str8, jthVar4, gh00Var8, izl0Var5, ffpVar, ya6Var4, false, z5, str9, map, fshVar, gh00Var10, null), ithVar2);
                    if (objM56684z == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56684z);
                }
                return (xsh) objM56684z;
            }
            bga.m29073P(objM56684z);
            arrayListM54781a = jy81Var.m54781a();
            for (iy81 iy81Var : arrayListM54781a) {
                ahw ahwVarM95944y = zdg1.m95944y(iy81Var);
                if (ahwVarM95944y != null) {
                    throw new BetamaxTranscoderException("Invalid media item parameters: " + ahwVarM95944y + " " + iy81Var, null, ahwVarM95944y, 2);
                }
            }
            Object obj3 = null;
            dne dneVar = izl0Var.f107259e;
            ieu ieuVar = izl0Var.f107257c;
            if (dneVar != null) {
                if (ieuVar.f101547a == null) {
                    throw new IllegalArgumentException("Explicit width required when overlayProvider is set");
                }
                if (ieuVar.f101548b == null) {
                    throw new IllegalArgumentException("Explicit height required when overlayProvider is set");
                }
            }
            String str10 = izl0Var.f107255a + ".mp4";
            if (arrayListM54781a.isEmpty()) {
                i = 1;
                break;
            }
            Iterator it = arrayListM54781a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 1;
                    break;
                }
                String str11 = ((iy81) it.next()).f106906a;
                if (!bm51.m29803n0(str11, "content://", false) && !bm51.m29803n0(str11, "file://", false)) {
                    i = 0;
                    break;
                }
            }
            gh61 gh61Var = gh61.f79843a;
            Context context = this.f115886a;
            if (i != 0) {
                ieuVar.getClass();
                yukVar = yukVar5;
                r9 = 0;
                mcuVar = new mcu(context, new fcp(new t0h1(context, 7)), gh61Var, obj3, 22);
            } else {
                r9 = 0;
                yukVar = yukVar5;
                if (ly81Var == null) {
                    y1n y1nVar = this.f115889d;
                    ly81VarM92661a = y1nVar != null ? y1nVar.m92661a(null) : null;
                } else {
                    ly81VarM92661a = ly81Var;
                }
                if (ly81VarM92661a == null) {
                    throw new BetamaxTranscoderException("TranscoderMediaSourceFactory not available", null, null, 6);
                }
                ieuVar.getClass();
                mcuVar = new mcu(context, new fcp(new t0h1(context, 7)), gh61Var, ly81VarM92661a, 22);
            }
            zM54291d = m54291d(arrayListM54781a);
            if (zM54291d) {
                ithVar2.f105567a = r9;
                ithVar2.f105568b = r9;
                ithVar2.f105569c = r9;
                ithVar2.f105570d = r9;
                ithVar2.f105571e = r9;
                ithVar2.f105572f = r9;
                ithVar2.f105573g = r9;
                ithVar2.f105574h = r9;
                ithVar2.f105575i = r9;
                ithVar2.f105576t = z;
                ithVar2.f105564X = z2;
                ithVar2.f105566Z = 0;
                ithVar2.f105559L0 = i;
                ithVar2.f105565Y = zM54291d;
                ithVar2.f105563P0 = 1;
                yukVar2 = yukVar;
                Object objM54292e = m54292e(arrayListM54781a, izl0Var, str10, mcuVar, gh00Var, str, z, num, gh00Var2, z2, ithVar2);
                if (objM54292e != yukVar2) {
                    obj2 = objM54292e;
                    return (xsh) obj2;
                }
            } else {
                yukVar2 = yukVar;
                if (m54290h(arrayListM54781a, izl0Var)) {
                    if (z) {
                        luk lukVar = this.f115888c;
                        dze dzeVar = new dze(this, arrayListM54781a, r9, 8);
                        ithVar2.f105567a = izl0Var;
                        ithVar2.f105568b = gh00Var;
                        ithVar2.f105569c = str;
                        ithVar2.f105570d = num;
                        ithVar2.f105571e = gh00Var2;
                        ithVar2.f105572f = this;
                        ithVar2.f105573g = arrayListM54781a;
                        ithVar2.f105574h = str10;
                        ithVar2.f105575i = mcuVar;
                        ithVar2.f105576t = z;
                        ithVar2.f105564X = z2;
                        ithVar2.f105566Z = 0;
                        ithVar2.f105559L0 = i;
                        ithVar2.f105565Y = zM54291d;
                        ithVar2.f105563P0 = 2;
                        Object objM89557A2 = x0h1.m89557A(lukVar, dzeVar, ithVar2);
                        if (objM89557A2 != yukVar2) {
                            arrayList = arrayListM54781a;
                            i4 = i;
                            str3 = str;
                            gh00Var4 = gh00Var;
                            str2 = str10;
                            num2 = num;
                            z3 = z;
                            ya6Var = mcuVar;
                            z4 = z2;
                            jthVar = this;
                            obj = objM89557A2;
                            gh00Var3 = gh00Var2;
                            i5 = 0;
                            izl0Var2 = izl0Var;
                            int i15 = i5;
                            i2 = i4;
                            arrayListM54781a = arrayList;
                            i3 = i15;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        str2 = str10;
                        num2 = num;
                        z3 = z;
                        ya6Var = mcuVar;
                        z4 = z2;
                        jthVar = this;
                        izl0Var2 = izl0Var;
                        gh00Var3 = gh00Var2;
                        i2 = i;
                        str3 = str;
                        gh00Var4 = gh00Var;
                        i3 = 0;
                    }
                    yukVar3 = yukVar2;
                    gh00Var5 = gh00Var3;
                    jthVar2 = jthVar;
                    str4 = str2;
                    gh00Var6 = gh00Var4;
                    z5 = z4;
                    i6 = i2;
                    z6 = zM54291d;
                    ya6Var2 = ya6Var;
                    i7 = 1;
                } else {
                    str2 = str10;
                    num2 = num;
                    z3 = z;
                    ya6Var = mcuVar;
                    z4 = z2;
                    jthVar = this;
                    izl0Var2 = izl0Var;
                    gh00Var3 = gh00Var2;
                    i2 = i;
                    str3 = str;
                    gh00Var4 = gh00Var;
                    i3 = 0;
                }
                yukVar3 = yukVar2;
                gh00Var5 = gh00Var3;
                jthVar2 = jthVar;
                str4 = str2;
                gh00Var6 = gh00Var4;
                z5 = z4;
                i6 = i2;
                z6 = zM54291d;
                ya6Var2 = ya6Var;
                i7 = 0;
            }
            return yukVar2;
            if (i7 != 0) {
                int i16 = i7;
                yshVar = new ysh(zdg1.m95931l(jthVar2.f115886a, izl0Var2.f107257c, num2), zdg1.m95933n(zdg1.m95934o(((iy81) arrayListM54781a.get(0)).f106906a)), Collections.singletonMap(new Integer(0), Boolean.FALSE));
                i8 = i16;
                gh00Var8 = gh00Var5;
                yukVar4 = yukVar3;
                z8 = z6;
                i10 = i6;
                jthVar4 = jthVar2;
            } else {
                boolean z11 = z6;
                int i17 = i6;
                int i18 = i7;
                ithVar2.f105567a = izl0Var2;
                ithVar2.f105568b = gh00Var6;
                ithVar2.f105569c = str3;
                ithVar2.f105570d = null;
                ithVar2.f105571e = gh00Var5;
                ithVar2.f105572f = jthVar2;
                ithVar2.f105573g = null;
                ithVar2.f105574h = str4;
                ithVar2.f105575i = ya6Var2;
                ithVar2.f105576t = z3;
                ithVar2.f105564X = z5;
                ithVar2.f105566Z = i3;
                ithVar2.f105559L0 = i17;
                ithVar2.f105565Y = z11;
                ithVar2.f105560M0 = i18;
                gh00 gh00Var11 = gh00Var5;
                ithVar2.f105563P0 = 3;
                jth jthVar6 = jthVar2;
                objM89557A = x0h1.m89557A(jthVar2.f115888c, new hth(arrayListM54781a, jthVar6, izl0Var2, num2, z3, null), ithVar2);
                yukVar4 = yukVar3;
                if (objM89557A == yukVar4) {
                    return yukVar4;
                }
                int i19 = i3;
                jthVar3 = jthVar6;
                i8 = i18;
                z7 = z3;
                i9 = i19;
                i10 = i17;
                z8 = z11;
                gh00Var7 = gh00Var11;
                jthVar4 = jthVar3;
                gh00Var8 = gh00Var7;
                i3 = i9;
                z3 = z7;
                yshVar = (ysh) objM89557A;
            }
            izl0 izl0Var6 = izl0Var2;
            String str12 = str3;
            ya6 ya6Var5 = ya6Var2;
            gh00 gh00Var12 = gh00Var6;
            String str13 = str4;
            fsh fshVar2 = yshVar.f275779b;
            ffp ffpVar2 = yshVar.f275778a;
            Map map2 = yshVar.f275780c;
            ithVar2.f105567a = null;
            ithVar2.f105568b = null;
            ithVar2.f105569c = null;
            ithVar2.f105570d = null;
            ithVar2.f105571e = null;
            ithVar2.f105572f = null;
            ithVar2.f105573g = null;
            ithVar2.f105574h = null;
            ithVar2.f105575i = null;
            ithVar2.f105576t = z3;
            ithVar2.f105564X = z5;
            ithVar2.f105566Z = i3;
            ithVar2.f105559L0 = i10;
            ithVar2.f105565Y = z8;
            ithVar2.f105560M0 = i8;
            ithVar2.f105563P0 = 4;
            jthVar4.getClass();
            objM56684z = kk40.m56684z(new dth(str12, jthVar4, gh00Var8, izl0Var6, ffpVar2, ya6Var5, false, z5, str13, map2, fshVar2, gh00Var12, null), ithVar2);
            if (objM56684z == yukVar4) {
                return yukVar4;
            }
            return (xsh) objM56684z;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
