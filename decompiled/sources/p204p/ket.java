package p204p;

import android.view.View;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$MapTimestampResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class ket implements Function, r1m0, Init, Function5, BiFunction, a4a, t6l0, Function4, Predicate, giv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121976a;

    /* JADX INFO: renamed from: b */
    public static final ket f121965b = new ket(0);

    /* JADX INFO: renamed from: c */
    public static final ket f121967c = new ket(1);

    /* JADX INFO: renamed from: d */
    public static final ket f121969d = new ket(2);

    /* JADX INFO: renamed from: e */
    public static final ket f121970e = new ket(3);

    /* JADX INFO: renamed from: f */
    public static final ket f121971f = new ket(4);

    /* JADX INFO: renamed from: g */
    public static final ket f121972g = new ket(5);

    /* JADX INFO: renamed from: h */
    public static final ket f121973h = new ket(6);

    /* JADX INFO: renamed from: i */
    public static final ket f121974i = new ket(7);

    /* JADX INFO: renamed from: t */
    public static final ket f121975t = new ket(8);

    /* JADX INFO: renamed from: X */
    public static final ket f121958X = new ket(9);

    /* JADX INFO: renamed from: Y */
    public static final ket f121960Y = new ket(10);

    /* JADX INFO: renamed from: Z */
    public static final ket f121962Z = new ket(11);

    /* JADX INFO: renamed from: L0 */
    public static final ket f121946L0 = new ket(12);

    /* JADX INFO: renamed from: M0 */
    public static final ket f121947M0 = new ket(13);

    /* JADX INFO: renamed from: N0 */
    public static final ket f121948N0 = new ket(14);

    /* JADX INFO: renamed from: O0 */
    public static final ket f121949O0 = new ket(15);

    /* JADX INFO: renamed from: P0 */
    public static final ket f121950P0 = new ket(16);

    /* JADX INFO: renamed from: Q0 */
    public static final ket f121951Q0 = new ket(17);

    /* JADX INFO: renamed from: R0 */
    public static final ket f121952R0 = new ket(18);

    /* JADX INFO: renamed from: S0 */
    public static final ket f121953S0 = new ket(19);

    /* JADX INFO: renamed from: T0 */
    public static final ket f121954T0 = new ket(20);

    /* JADX INFO: renamed from: U0 */
    public static final ket f121955U0 = new ket(21);

    /* JADX INFO: renamed from: V0 */
    public static final ket f121956V0 = new ket(22);

    /* JADX INFO: renamed from: W0 */
    public static final ket f121957W0 = new ket(23);

    /* JADX INFO: renamed from: X0 */
    public static final ket f121959X0 = new ket(24);

    /* JADX INFO: renamed from: Y0 */
    public static final ket f121961Y0 = new ket(25);

    /* JADX INFO: renamed from: Z0 */
    public static final ket f121963Z0 = new ket(26);

    /* JADX INFO: renamed from: a1 */
    public static final ket f121964a1 = new ket(27);

    /* JADX INFO: renamed from: b1 */
    public static final ket f121966b1 = new ket(28);

    /* JADX INFO: renamed from: c1 */
    public static final ket f121968c1 = new ket(29);

    public /* synthetic */ ket(int i) {
        this.f121976a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m56231a(qo91 qo91Var, kgx0 kgx0Var) {
        kd70 kd70VarMo55502o;
        return qo91Var.mo55497l(kgx0Var) || ((kgx0Var instanceof zwb) && (kd70VarMo55502o = qo91Var.mo55502o(qo91Var.mo55480c(qo91Var.mo55464N((zwb) kgx0Var)))) != null && qo91Var.mo55497l(qo91Var.mo55465O(kd70VarMo55502o)));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m56232b(qo91 qo91Var, kqp kqpVar, kgx0 kgx0Var, kgx0 kgx0Var2, boolean z) {
        Collection<kd70> collectionMo55484e = qo91Var.mo55484e(kgx0Var);
        if ((collectionMo55484e instanceof Collection) && collectionMo55484e.isEmpty()) {
            return false;
        }
        for (kd70 kd70Var : collectionMo55484e) {
            if (wj50.m88271j(qo91Var.mo55457H(kd70Var), qo91Var.mo55508r(kgx0Var2))) {
                return true;
            }
            if (z && m56239k(f121967c, kqpVar, kgx0Var2, kd70Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static List m56233c(kqp kqpVar, qo91 qo91Var, kgx0 kgx0Var, kn91 kn91Var) {
        l0y0 l0y0VarMo55486f;
        in91 in91Var = in91.f103933e;
        qo91Var.getClass();
        if (qo91Var.mo55451E(kn91Var) || !qo91Var.mo55499m0(kgx0Var)) {
            if (!qo91Var.mo55515v(kn91Var)) {
                xw21 xw21Var = new xw21();
                kqpVar.m57119c();
                qo91 qo91Var2 = (qo91) kqpVar.f125371d;
                ArrayDeque arrayDeque = (ArrayDeque) kqpVar.f125374g;
                wj50.m88279p(arrayDeque);
                zw21 zw21Var = (zw21) kqpVar.f125375h;
                wj50.m88279p(zw21Var);
                arrayDeque.push(kgx0Var);
                while (!arrayDeque.isEmpty()) {
                    kgx0 kgx0Var2 = (kgx0) arrayDeque.pop();
                    wj50.m88279p(kgx0Var2);
                    if (zw21Var.add(kgx0Var2)) {
                        kgx0 kgx0VarMo55477a0 = qo91Var.mo55477a0(kgx0Var2);
                        if (kgx0VarMo55477a0 == null) {
                            kgx0VarMo55477a0 = kgx0Var2;
                        }
                        if (qo91Var.mo55473X(qo91Var.mo55508r(kgx0VarMo55477a0), kn91Var)) {
                            xw21Var.add(kgx0VarMo55477a0);
                            l0y0VarMo55486f = in91Var;
                        } else {
                            l0y0VarMo55486f = qo91Var.mo55488g0(kgx0VarMo55477a0) == 0 ? in91.f103932d : qo91Var2.mo55486f(kgx0VarMo55477a0);
                        }
                        if (l0y0VarMo55486f.equals(in91Var)) {
                            l0y0VarMo55486f = null;
                        }
                        if (l0y0VarMo55486f != null) {
                            Iterator it = qo91Var2.mo55506q(qo91Var2.mo55508r(kgx0Var2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(l0y0VarMo55486f.mo51125C(kqpVar, (kd70) it.next()));
                            }
                        }
                    }
                }
                kqpVar.m57117a();
                return xw21Var;
            }
            if (qo91Var.mo55473X(qo91Var.mo55508r(kgx0Var), kn91Var)) {
                kgx0 kgx0VarMo55477a1 = qo91Var.mo55477a0(kgx0Var);
                if (kgx0VarMo55477a1 != null) {
                    kgx0Var = kgx0VarMo55477a1;
                }
                return Collections.singletonList(kgx0Var);
            }
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: d */
    public static List m56234d(kqp kqpVar, qo91 qo91Var, kgx0 kgx0Var, kn91 kn91Var) {
        List listM56233c = m56233c(kqpVar, qo91Var, kgx0Var, kn91Var);
        if (listM56233c.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM56233c) {
                en91 en91VarMo55459I = qo91Var.mo55459I((kgx0) obj);
                int iMo55447C = qo91Var.mo55447C(en91VarMo55459I);
                int i = 0;
                while (true) {
                    if (i >= iMo55447C) {
                        arrayList.add(obj);
                        break;
                    }
                    kd70 kd70VarMo55502o = qo91Var.mo55502o(qo91Var.mo55509r0(en91VarMo55459I, i));
                    if ((kd70VarMo55502o != null ? qo91Var.mo55463M(kd70VarMo55502o) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listM56233c;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m56235g(kqp kqpVar, kd70 kd70Var, kd70 kd70Var2) {
        bkg1 bkg1Var = (bkg1) kqpVar.f125372e;
        ekg1 ekg1Var = (ekg1) kqpVar.f125373f;
        qo91 qo91Var = (qo91) kqpVar.f125371d;
        if (kd70Var == kd70Var2) {
            return true;
        }
        if (m56237i(qo91Var, kd70Var) && m56237i(qo91Var, kd70Var2)) {
            kd70 kd70VarMo29708y = bkg1Var.mo29708y(ekg1Var.mo39299v(kd70Var));
            kd70 kd70VarMo29708y2 = bkg1Var.mo29708y(ekg1Var.mo39299v(kd70Var2));
            kgx0 kgx0VarMo55474Y = qo91Var.mo55474Y(kd70VarMo29708y);
            if (!qo91Var.mo55473X(qo91Var.mo55457H(kd70VarMo29708y), qo91Var.mo55457H(kd70VarMo29708y2))) {
                return false;
            }
            if (qo91Var.mo55488g0(kgx0VarMo55474Y) == 0) {
                return qo91Var.mo55466P(kd70VarMo29708y) || qo91Var.mo55466P(kd70VarMo29708y2) || qo91Var.mo55514u(kgx0VarMo55474Y) == qo91Var.mo55514u(qo91Var.mo55474Y(kd70VarMo29708y2));
            }
        }
        ket ketVar = f121967c;
        return m56239k(ketVar, kqpVar, kd70Var, kd70Var2) && m56239k(ketVar, kqpVar, kd70Var2, kd70Var);
    }

    /* JADX INFO: renamed from: h */
    public static do91 m56236h(qo91 qo91Var, kd70 kd70Var, kd70 kd70Var2) {
        kd70 kd70VarMo55502o;
        int iMo55488g0 = qo91Var.mo55488g0(kd70Var);
        int i = 0;
        while (true) {
            if (i >= iMo55488g0) {
                return null;
            }
            fn91 fn91VarMo55501n0 = qo91Var.mo55501n0(kd70Var, i);
            fn91 fn91Var = qo91Var.mo55461K(fn91VarMo55501n0) ? null : fn91VarMo55501n0;
            if (fn91Var != null && (kd70VarMo55502o = qo91Var.mo55502o(fn91Var)) != null) {
                boolean z = qo91Var.mo55504p(qo91Var.mo55474Y(kd70VarMo55502o)) && qo91Var.mo55504p(qo91Var.mo55474Y(kd70Var2));
                if (kd70VarMo55502o.equals(kd70Var2) || (z && wj50.m88271j(qo91Var.mo55457H(kd70VarMo55502o), qo91Var.mo55457H(kd70Var2)))) {
                    return qo91Var.mo55492i0(qo91Var.mo55457H(kd70Var), i);
                }
                do91 do91VarM56236h = m56236h(qo91Var, kd70VarMo55502o, kd70Var2);
                if (do91VarM56236h != null) {
                    return do91VarM56236h;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m56237i(qo91 qo91Var, kd70 kd70Var) {
        if (!qo91Var.mo55475Z(qo91Var.mo55457H(kd70Var))) {
            return false;
        }
        qo91Var.mo55470T(kd70Var);
        return (qo91Var.mo55460J(kd70Var) || qo91Var.mo55479b0(kd70Var) || qo91Var.mo55455G(kd70Var)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m56238j(kqp kqpVar, qo91 qo91Var, en91 en91Var, kgx0 kgx0Var) {
        boolean zM56239k;
        kn91 kn91VarMo55508r = qo91Var.mo55508r(kgx0Var);
        int iMo55447C = qo91Var.mo55447C(en91Var);
        int iMo55468R = qo91Var.mo55468R(kn91VarMo55508r);
        if (iMo55447C == iMo55468R && iMo55447C == qo91Var.mo55488g0(kgx0Var)) {
            for (int i = 0; i < iMo55468R; i++) {
                fn91 fn91VarMo55501n0 = qo91Var.mo55501n0(kgx0Var, i);
                kd70 kd70VarMo55502o = qo91Var.mo55502o(fn91VarMo55501n0);
                if (kd70VarMo55502o != null) {
                    fn91 fn91VarMo55509r0 = qo91Var.mo55509r0(en91Var, i);
                    qo91Var.mo55472W(fn91VarMo55509r0);
                    kd70 kd70VarMo55502o2 = qo91Var.mo55502o(fn91VarMo55509r0);
                    wj50.m88279p(kd70VarMo55502o2);
                    int iMo55478b = qo91Var.mo55478b(qo91Var.mo55492i0(kn91VarMo55508r, i));
                    int iMo55472W = qo91Var.mo55472W(fn91VarMo55501n0);
                    if (iMo55478b == 3) {
                        iMo55478b = iMo55472W;
                    } else if (iMo55472W != 3 && iMo55478b != iMo55472W) {
                        iMo55478b = 0;
                    }
                    if (iMo55478b == 0) {
                        return kqpVar.f125368a;
                    }
                    if (iMo55478b == 3) {
                        m56240l(qo91Var, kd70VarMo55502o2, kd70VarMo55502o);
                        m56240l(qo91Var, kd70VarMo55502o, kd70VarMo55502o2);
                    }
                    int i2 = kqpVar.f125370c;
                    if (i2 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + kd70VarMo55502o2).toString());
                    }
                    kqpVar.f125370c = i2 + 1;
                    int iM38547C = edb.m38547C(iMo55478b);
                    ket ketVar = f121967c;
                    if (iM38547C == 0) {
                        zM56239k = m56239k(ketVar, kqpVar, kd70VarMo55502o, kd70VarMo55502o2);
                    } else if (iM38547C == 1) {
                        zM56239k = m56239k(ketVar, kqpVar, kd70VarMo55502o2, kd70VarMo55502o);
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM56239k = m56235g(kqpVar, kd70VarMo55502o2, kd70VarMo55502o);
                    }
                    kqpVar.f125370c--;
                    if (!zM56239k) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m56239k(ket ketVar, kqp kqpVar, kd70 kd70Var, kd70 kd70Var2) {
        if (kd70Var == kd70Var2) {
            return true;
        }
        kqpVar.getClass();
        return f121967c.m56241f(kqpVar, (qo91) kqpVar.f125371d, kd70Var, kd70Var2);
    }

    /* JADX INFO: renamed from: l */
    public static void m56240l(qo91 qo91Var, kd70 kd70Var, kd70 kd70Var2) {
        kgx0 kgx0VarMo55496k0 = qo91Var.mo55496k0(kd70Var);
        if (kgx0VarMo55496k0 instanceof zwb) {
            zwb zwbVar = (zwb) kgx0VarMo55496k0;
            if (!qo91Var.mo55482d(zwbVar) && qo91Var.mo55461K(qo91Var.mo55480c(qo91Var.mo55464N(zwbVar))) && qo91Var.mo55445B(zwbVar) == 1) {
                qo91Var.mo55457H(kd70Var2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws Throwable {
        int i;
        switch (this.f121976a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return AdDetectionOuterClass$MapTimestampResponse.m2288q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.MapTimestampResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 18:
            case 24:
            default:
                g4x g4xVar = (g4x) obj;
                return new g4x(g4xVar.f76544a, g4xVar.f76545b);
            case 4:
                return kg2.f122279a;
            case 6:
                return Boolean.valueOf(((zk4) obj).f283633c);
            case 9:
                return ((wq7) obj).f253938b;
            case 10:
                return new w48((n3z) obj);
            case 11:
                x6x0 x6x0Var = (x6x0) obj;
                r5x0 r5x0Var = x6x0Var instanceof r5x0 ? (r5x0) x6x0Var : null;
                return (r5x0Var == null || !((i = r5x0Var.f196142b) == 12 || i == 2 || i == 6)) ? Single.just(x6x0Var) : Single.error(new be9(x6x0Var));
            case 15:
                return new q1f((pu41) obj);
            case 16:
                n2x0 n2x0Var = ((o2x0) obj).f161171a;
                if (n2x0Var.f149852O0) {
                    return w2a1.f247311a;
                }
                throw new IllegalStateException(s571.m77246e(n2x0Var.f149860d, "Failed to create comment - Status: "));
            case 17:
                return ((e301) obj).f55571a;
            case 19:
                return ((gmr0) obj).f81451b;
            case 20:
                return nau.f152117a;
            case 21:
                Map map = (Map) obj;
                boolean z = true;
                if (!map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((y5f) ((Map.Entry) it.next()).getValue()).f269417a) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                return (dvl0) ((pqm0) obj).f180351b;
            case 23:
                eyl0 eyl0Var = (eyl0) obj;
                if (eyl0Var instanceof dyl0) {
                    return (tl11) ((dyl0) eyl0Var).f54411a;
                }
                if (eyl0Var instanceof byl0) {
                    throw ((byl0) eyl0Var).f32271a;
                }
                throw new NoWhenBranchMatchedException();
            case 25:
                return new i0s((api) ((xul0) obj).mo49283h());
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function5
    /* JADX INFO: renamed from: e */
    public Object mo23410e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return g6f.m43700N0((List) obj5, g6f.m43700N0((List) obj4, g6f.m43700N0((List) obj3, g6f.m43700N0((List) obj2, (List) obj))));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x020f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0272  */
    /* JADX WARN: Code duplicated, block: B:212:0x036c  */
    /* JADX WARN: Code duplicated, block: B:215:0x037d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0388  */
    /* JADX WARN: Code duplicated, block: B:221:0x038b  */
    /* JADX WARN: Code duplicated, block: B:223:0x039c  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:229:0x03be  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:234:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:245:0x0421  */
    /* JADX WARN: Code duplicated, block: B:248:0x042d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0441  */
    /* JADX WARN: Code duplicated, block: B:255:0x0450  */
    /* JADX WARN: Code duplicated, block: B:257:0x045a  */
    /* JADX WARN: Code duplicated, block: B:259:0x045f  */
    /* JADX WARN: Code duplicated, block: B:263:0x046c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0486  */
    /* JADX WARN: Code duplicated, block: B:270:0x049b  */
    /* JADX WARN: Code duplicated, block: B:271:0x049d  */
    /* JADX WARN: Code duplicated, block: B:275:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:281:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:285:0x04d5 A[LOOP:7: B:279:0x04b5->B:285:0x04d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [p.qo91] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX INFO: renamed from: f */
    public boolean m56241f(kqp kqpVar, qo91 qo91Var, kd70 kd70Var, kd70 kd70Var2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z;
        List<kgx0> listM56233c;
        in91 in91Var;
        ArrayList<kgx0> arrayList;
        int i;
        int size;
        kn91 kn91VarMo55508r;
        ArrayDeque arrayDeque;
        zw21 zw21Var;
        kgx0 kgx0Var;
        in91 in91Var2;
        Iterator it;
        kgx0 kgx0VarMo51125C;
        qi5 qi5Var;
        int iMo55468R;
        ?? r6;
        boolean zM56238j;
        boolean zM56238j2;
        fn91 fn91VarMo55510s;
        kd70 kd70VarMo55502o;
        kgx0 kgx0VarMo55496k0;
        boolean z2;
        ekg1 ekg1Var = (ekg1) kqpVar.f125373f;
        kd70 kd70VarMo39299v = ekg1Var.mo39299v(kd70Var);
        bkg1 bkg1Var = (bkg1) kqpVar.f125372e;
        kd70 kd70VarMo29708y = bkg1Var.mo29708y(kd70VarMo39299v);
        kd70 kd70VarMo29708y2 = bkg1Var.mo29708y(ekg1Var.mo39299v(kd70Var2));
        kgx0 kgx0VarMo55474Y = qo91Var.mo55474Y(kd70VarMo29708y);
        kgx0 kgx0VarMo55465O = qo91Var.mo55465O(kd70VarMo29708y2);
        boolean z3 = false;
        if (!qo91Var.mo55495k(kgx0VarMo55474Y) && !qo91Var.mo55495k(kgx0VarMo55465O)) {
            qo91Var.mo55507q0(kgx0VarMo55474Y);
            qo91Var.mo55490h0(kgx0VarMo55474Y);
            qo91Var.mo55490h0(kgx0VarMo55465O);
            zwb zwbVarMo55476a = qo91Var.mo55476a(kgx0VarMo55465O);
            kd70 kd70VarMo55443A = zwbVarMo55476a != null ? qo91Var.mo55443A(zwbVarMo55476a) : null;
            if (zwbVarMo55476a != null && kd70VarMo55443A != null) {
                if (qo91Var.mo55514u(kgx0VarMo55465O)) {
                    kd70VarMo55443A = qo91Var.mo55483d0(kd70VarMo55443A);
                } else if (qo91Var.mo55462L(kgx0VarMo55465O)) {
                    kd70VarMo55443A = qo91Var.mo55453F(kd70VarMo55443A);
                }
                if (m56239k(this, kqpVar, kgx0VarMo55474Y, kd70VarMo55443A)) {
                    boolValueOf = Boolean.TRUE;
                }
            }
            kn91 kn91VarMo55508r2 = qo91Var.mo55508r(kgx0VarMo55465O);
            if (qo91Var.mo55519x(kn91VarMo55508r2)) {
                qo91Var.mo55514u(kgx0VarMo55465O);
                Collection collectionMo55506q = qo91Var.mo55506q(kn91VarMo55508r2);
                if (!(collectionMo55506q instanceof Collection) || !collectionMo55506q.isEmpty()) {
                    Iterator it2 = collectionMo55506q.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = true;
                            break;
                        }
                        if (!m56239k(f121967c, kqpVar, kgx0VarMo55474Y, (kd70) it2.next())) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                kn91 kn91VarMo55508r3 = qo91Var.mo55508r(kgx0VarMo55474Y);
                if (kgx0VarMo55474Y instanceof zwb) {
                    do91 do91VarM56236h = m56236h(qo91Var, kgx0VarMo55465O, kgx0VarMo55474Y);
                    boolValueOf = (do91VarM56236h == null && qo91Var.mo55503o0(do91VarM56236h, qo91Var.mo55508r(kgx0VarMo55465O))) ? Boolean.TRUE : null;
                } else if (qo91Var.mo55519x(kn91VarMo55508r3)) {
                    Collection collectionMo55506q2 = qo91Var.mo55506q(kn91VarMo55508r3);
                    if ((collectionMo55506q2 instanceof Collection) && collectionMo55506q2.isEmpty()) {
                        do91 do91VarM56236h2 = m56236h(qo91Var, kgx0VarMo55465O, kgx0VarMo55474Y);
                        if (do91VarM56236h2 == null) {
                        }
                    } else {
                        Iterator it3 = collectionMo55506q2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                do91 do91VarM56236h3 = m56236h(qo91Var, kgx0VarMo55465O, kgx0VarMo55474Y);
                                if (do91VarM56236h3 == null) {
                                }
                            } else if (!(((kd70) it3.next()) instanceof zwb)) {
                            }
                        }
                    }
                }
            }
        } else if (kqpVar.f125368a) {
            boolValueOf = Boolean.TRUE;
        } else if (!qo91Var.mo55514u(kgx0VarMo55474Y) || qo91Var.mo55514u(kgx0VarMo55465O)) {
            if (!qo91Var.mo55495k(kgx0VarMo55474Y)) {
                kgx0VarMo55474Y = qo91Var.mo55471U(kgx0VarMo55474Y, false);
            }
            if (!qo91Var.mo55495k(kgx0VarMo55465O)) {
                kgx0VarMo55465O = qo91Var.mo55471U(kgx0VarMo55465O, false);
            }
            boolValueOf = Boolean.valueOf(akg1.m26238w(qo91Var, kgx0VarMo55474Y, kgx0VarMo55465O));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        kgx0 kgx0VarMo55474Y2 = qo91Var.mo55474Y(kd70VarMo29708y);
        kgx0 kgx0VarMo55465O2 = qo91Var.mo55465O(kd70VarMo29708y2);
        in91 in91Var3 = in91.f103933e;
        in91 in91Var4 = in91.f103932d;
        qo91 qo91Var2 = (qo91) kqpVar.f125371d;
        if (!qo91Var2.mo55514u(kgx0VarMo55465O2) && !qo91Var2.mo55479b0(kgx0VarMo55474Y2) && !qo91Var2.mo55462L(kgx0VarMo55474Y2) && ((!(kgx0VarMo55474Y2 instanceof zwb) || !qo91Var2.mo55467Q((zwb) kgx0VarMo55474Y2)) && !qjg1.m72919k(kqpVar, kgx0VarMo55474Y2, in91Var4))) {
            if (qo91Var2.mo55462L(kgx0VarMo55465O2) || qjg1.m72919k(kqpVar, kgx0VarMo55465O2, in91.f103934f) || qo91Var2.mo55499m0(kgx0VarMo55474Y2)) {
                return false;
            }
            kn91 kn91VarMo55508r4 = qo91Var2.mo55508r(kgx0VarMo55465O2);
            if (!qjg1.m72920l(kqpVar, kgx0VarMo55474Y2, kn91VarMo55508r4)) {
                kqpVar.m57119c();
                ArrayDeque arrayDeque2 = (ArrayDeque) kqpVar.f125374g;
                wj50.m88279p(arrayDeque2);
                zw21 zw21Var2 = (zw21) kqpVar.f125375h;
                wj50.m88279p(zw21Var2);
                arrayDeque2.push(kgx0VarMo55474Y2);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        kqpVar.m57117a();
                        return false;
                    }
                    kgx0 kgx0Var2 = (kgx0) arrayDeque2.pop();
                    wj50.m88279p(kgx0Var2);
                    if (zw21Var2.add(kgx0Var2)) {
                        in91 in91Var5 = qo91Var2.mo55514u(kgx0Var2) ? in91Var3 : in91Var4;
                        if (in91Var5.equals(in91Var3)) {
                            in91Var5 = null;
                        }
                        if (in91Var5 == null) {
                            continue;
                        } else {
                            Iterator it4 = qo91Var2.mo55506q(qo91Var2.mo55508r(kgx0Var2)).iterator();
                            while (it4.hasNext()) {
                                kgx0 kgx0VarMo51125C2 = in91Var5.mo51125C(kqpVar, (kd70) it4.next());
                                if (qjg1.m72920l(kqpVar, kgx0VarMo51125C2, kn91VarMo55508r4)) {
                                    kqpVar.m57117a();
                                    break loop0;
                                }
                                arrayDeque2.add(kgx0VarMo51125C2);
                            }
                        }
                    }
                }
            }
        }
        if (!qo91Var.mo55497l(kgx0VarMo55474Y2) && !qo91Var.mo55497l(kgx0VarMo55465O2)) {
            bool = null;
        } else if (m56231a(qo91Var, kgx0VarMo55474Y2) && m56231a(qo91Var, kgx0VarMo55465O2)) {
            bool = Boolean.TRUE;
        } else if (qo91Var.mo55497l(kgx0VarMo55474Y2)) {
            if (m56232b(qo91Var, kqpVar, kgx0VarMo55474Y2, kgx0VarMo55465O2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (qo91Var.mo55497l(kgx0VarMo55465O2)) {
            kn91 kn91VarMo55508r5 = qo91Var.mo55508r(kgx0VarMo55474Y2);
            if (kn91VarMo55508r5 instanceof jj50) {
                Collection collectionMo55506q3 = qo91Var.mo55506q(kn91VarMo55508r5);
                if (!(collectionMo55506q3 instanceof Collection) || !collectionMo55506q3.isEmpty()) {
                    Iterator it5 = collectionMo55506q3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            kgx0 kgx0VarMo55496k1 = qo91Var.mo55496k0((kd70) it5.next());
                            if (kgx0VarMo55496k1 != null && qo91Var.mo55497l(kgx0VarMo55496k1)) {
                            }
                        } else if (!m56232b(qo91Var, kqpVar, kgx0VarMo55465O2, kgx0VarMo55474Y2, true)) {
                            bool = null;
                        }
                    }
                } else if (!m56232b(qo91Var, kqpVar, kgx0VarMo55465O2, kgx0VarMo55474Y2, true)) {
                    bool = null;
                }
            } else if (!m56232b(qo91Var, kqpVar, kgx0VarMo55465O2, kgx0VarMo55474Y2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        kn91 kn91VarMo55508r6 = qo91Var.mo55508r(kgx0VarMo55465O2);
        if ((qo91Var.mo55473X(qo91Var.mo55508r(kgx0VarMo55474Y2), kn91VarMo55508r6) && qo91Var.mo55468R(kn91VarMo55508r6) == 0) || qo91Var.mo55505p0(qo91Var.mo55508r(kgx0VarMo55465O2))) {
            return true;
        }
        if (!qo91Var2.mo55499m0(kgx0VarMo55474Y2)) {
            if (qo91Var2.mo55451E(kn91VarMo55508r6) || qo91Var2.mo55481c0(kn91VarMo55508r6)) {
                xw21<kgx0> xw21Var = new xw21();
                kqpVar.m57119c();
                ArrayDeque arrayDeque3 = (ArrayDeque) kqpVar.f125374g;
                wj50.m88279p(arrayDeque3);
                zw21 zw21Var3 = (zw21) kqpVar.f125375h;
                wj50.m88279p(zw21Var3);
                arrayDeque3.push(kgx0VarMo55474Y2);
                while (!arrayDeque3.isEmpty()) {
                    kgx0 kgx0Var3 = (kgx0) arrayDeque3.pop();
                    wj50.m88279p(kgx0Var3);
                    if (zw21Var3.add(kgx0Var3)) {
                        if (qo91Var2.mo55499m0(kgx0Var3)) {
                            xw21Var.add(kgx0Var3);
                            in91Var = in91Var3;
                        } else {
                            in91Var = in91Var4;
                        }
                        if (in91Var.equals(in91Var3)) {
                            in91Var = null;
                        }
                        if (in91Var != null) {
                            Iterator it6 = qo91Var2.mo55506q(qo91Var2.mo55508r(kgx0Var3)).iterator();
                            while (it6.hasNext()) {
                                arrayDeque3.add(in91Var.mo51125C(kqpVar, (kd70) it6.next()));
                                z3 = z3;
                            }
                        }
                    }
                }
                z = z3;
                kqpVar.m57117a();
                ArrayList arrayList2 = new ArrayList();
                for (kgx0 kgx0Var4 : xw21Var) {
                    wj50.m88279p(kgx0Var4);
                    j6f.m52564V(m56234d(kqpVar, qo91Var2, kgx0Var4, kn91VarMo55508r6), arrayList2);
                }
                listM56233c = arrayList2;
            } else {
                listM56233c = m56233c(kqpVar, qo91Var2, kgx0VarMo55474Y2, kn91VarMo55508r6);
            }
            listM56233c.size();
            i = 10;
            arrayList = new ArrayList(i6f.m49804T(listM56233c, 10));
            for (kgx0 kgx0Var5 : listM56233c) {
                kgx0VarMo55496k0 = qo91Var.mo55496k0(bkg1Var.mo29708y(kgx0Var5));
                if (kgx0VarMo55496k0 == null) {
                    kgx0Var5 = kgx0VarMo55496k0;
                }
                arrayList.add(kgx0Var5);
            }
            size = arrayList.size();
            if (size != 0) {
                kn91VarMo55508r = qo91Var.mo55508r(kgx0VarMo55474Y2);
                if (qo91Var.mo55451E(kn91VarMo55508r)) {
                    return qo91Var.mo55522z(kn91VarMo55508r);
                }
                if (qo91Var.mo55522z(qo91Var.mo55508r(kgx0VarMo55474Y2))) {
                    return true;
                }
                kqpVar.m57119c();
                arrayDeque = (ArrayDeque) kqpVar.f125374g;
                wj50.m88279p(arrayDeque);
                zw21Var = (zw21) kqpVar.f125375h;
                wj50.m88279p(zw21Var);
                arrayDeque.push(kgx0VarMo55474Y2);
                while (!arrayDeque.isEmpty()) {
                    kgx0Var = (kgx0) arrayDeque.pop();
                    wj50.m88279p(kgx0Var);
                    if (!zw21Var.add(kgx0Var)) {
                        if (qo91Var.mo55499m0(kgx0Var)) {
                            in91Var2 = in91Var3;
                        } else {
                            in91Var2 = in91Var4;
                        }
                        if (in91Var2.equals(in91Var3)) {
                            in91Var2 = null;
                        }
                        if (in91Var2 == null) {
                            continue;
                        } else {
                            it = qo91Var2.mo55506q(qo91Var2.mo55508r(kgx0Var)).iterator();
                            while (it.hasNext()) {
                                kgx0VarMo51125C = in91Var2.mo51125C(kqpVar, (kd70) it.next());
                                if (qo91Var.mo55522z(qo91Var.mo55508r(kgx0VarMo51125C))) {
                                    kqpVar.m57117a();
                                    return true;
                                }
                                arrayDeque.add(kgx0VarMo51125C);
                            }
                        }
                    }
                }
                kqpVar.m57117a();
                return z;
            }
            if (size != 1) {
                return m56238j(kqpVar, qo91Var, qo91Var.mo55459I((kgx0) g6f.m43739p0(arrayList)), kgx0VarMo55465O2);
            }
            qi5Var = new qi5(qo91Var.mo55468R(kn91VarMo55508r6));
            iMo55468R = qo91Var.mo55468R(kn91VarMo55508r6);
            r6 = z;
            while (true) {
                if (r6 < iMo55468R) {
                    zM56238j = m56238j(kqpVar, qo91Var, qi5Var, kgx0VarMo55465O2);
                    break;
                }
                if (qo91Var.mo55478b(qo91Var.mo55492i0(kn91VarMo55508r6, r6)) != 2) {
                    zM56238j = z;
                    break;
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, i));
                for (kgx0 kgx0Var6 : arrayList) {
                    fn91VarMo55510s = qo91Var.mo55510s(kgx0Var6, r6);
                    if (fn91VarMo55510s == null) {
                        if (qo91Var.mo55472W(fn91VarMo55510s) != 3) {
                            fn91VarMo55510s = null;
                        }
                        if (fn91VarMo55510s == null && (kd70VarMo55502o = qo91Var.mo55502o(fn91VarMo55510s)) != null) {
                            arrayList3.add(kd70VarMo55502o);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + kgx0Var6 + ", subType: " + kgx0VarMo55474Y2 + ", superType: " + kgx0VarMo55465O2).toString());
                }
                qi5Var.add(qo91Var.mo55500n(qo91Var.mo55517w(arrayList3)));
                i = 10;
                r6++;
            }
            if (zM56238j) {
                return true;
            }
            zM56238j2 = z;
            for (kgx0 kgx0Var7 : arrayList) {
                if (zM56238j2) {
                    zM56238j2 = m56238j(kqpVar, qo91Var, qo91Var.mo55459I(kgx0Var7), kgx0VarMo55465O2);
                }
            }
            return zM56238j2;
        }
        listM56233c = m56234d(kqpVar, qo91Var2, kgx0VarMo55474Y2, kn91VarMo55508r6);
        z = false;
        listM56233c.size();
        i = 10;
        arrayList = new ArrayList(i6f.m49804T(listM56233c, 10));
        while (r10.hasNext()) {
            kgx0VarMo55496k0 = qo91Var.mo55496k0(bkg1Var.mo29708y(kgx0Var5));
            if (kgx0VarMo55496k0 == null) {
                kgx0Var5 = kgx0VarMo55496k0;
            }
            arrayList.add(kgx0Var5);
        }
        size = arrayList.size();
        if (size != 0) {
            kn91VarMo55508r = qo91Var.mo55508r(kgx0VarMo55474Y2);
            if (qo91Var.mo55451E(kn91VarMo55508r)) {
                return qo91Var.mo55522z(kn91VarMo55508r);
            }
            if (qo91Var.mo55522z(qo91Var.mo55508r(kgx0VarMo55474Y2))) {
                return true;
            }
            kqpVar.m57119c();
            arrayDeque = (ArrayDeque) kqpVar.f125374g;
            wj50.m88279p(arrayDeque);
            zw21Var = (zw21) kqpVar.f125375h;
            wj50.m88279p(zw21Var);
            arrayDeque.push(kgx0VarMo55474Y2);
            while (!arrayDeque.isEmpty()) {
                kgx0Var = (kgx0) arrayDeque.pop();
                wj50.m88279p(kgx0Var);
                if (!zw21Var.add(kgx0Var)) {
                    if (qo91Var.mo55499m0(kgx0Var)) {
                        in91Var2 = in91Var3;
                    } else {
                        in91Var2 = in91Var4;
                    }
                    if (in91Var2.equals(in91Var3)) {
                        in91Var2 = null;
                    }
                    if (in91Var2 == null) {
                        continue;
                    } else {
                        it = qo91Var2.mo55506q(qo91Var2.mo55508r(kgx0Var)).iterator();
                        while (it.hasNext()) {
                            kgx0VarMo51125C = in91Var2.mo51125C(kqpVar, (kd70) it.next());
                            if (qo91Var.mo55522z(qo91Var.mo55508r(kgx0VarMo51125C))) {
                                kqpVar.m57117a();
                                return true;
                            }
                            arrayDeque.add(kgx0VarMo51125C);
                        }
                    }
                }
            }
            kqpVar.m57117a();
            return z;
        }
        if (size != 1) {
            return m56238j(kqpVar, qo91Var, qo91Var.mo55459I((kgx0) g6f.m43739p0(arrayList)), kgx0VarMo55465O2);
        }
        qi5Var = new qi5(qo91Var.mo55468R(kn91VarMo55508r6));
        iMo55468R = qo91Var.mo55468R(kn91VarMo55508r6);
        r6 = z;
        while (true) {
            if (r6 < iMo55468R) {
                zM56238j = m56238j(kqpVar, qo91Var, qi5Var, kgx0VarMo55465O2);
                break;
            }
            if (qo91Var.mo55478b(qo91Var.mo55492i0(kn91VarMo55508r6, r6)) != 2) {
                zM56238j = z;
                break;
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList, i));
            while (r11.hasNext()) {
                fn91VarMo55510s = qo91Var.mo55510s(kgx0Var6, r6);
                if (fn91VarMo55510s == null) {
                    if (qo91Var.mo55472W(fn91VarMo55510s) != 3) {
                        fn91VarMo55510s = null;
                    }
                    if (fn91VarMo55510s == null) {
                    }
                }
                throw new IllegalStateException(("Incorrect type: " + kgx0Var6 + ", subType: " + kgx0VarMo55474Y2 + ", superType: " + kgx0VarMo55465O2).toString());
            }
            qi5Var.add(qo91Var.mo55500n(qo91Var.mo55517w(arrayList4)));
            i = 10;
            r6++;
        }
        if (zM56238j) {
            return true;
        }
        zM56238j2 = z;
        while (r3.hasNext()) {
            if (zM56238j2) {
                zM56238j2 = m56238j(kqpVar, qo91Var, qo91Var.mo55459I(kgx0Var7), kgx0VarMo55465O2);
            }
        }
        return zM56238j2;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f121976a) {
            case 5:
                hn3 hn3Var = (hn3) obj;
                return hn3Var instanceof gn3 ? First.m15575c(hn3Var, Collections.singleton(new bm3(((gn3) hn3Var).f81536a))) : First.m15574b(hn3Var);
            default:
                return First.m15574b((h3t) obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f121976a) {
            case 24:
                return ((xul0) obj).mo49279c();
            default:
                return ((e7w) obj) instanceof d7w;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        pwd1 pwd1Var = swd1Var.f214650a;
        view.setPadding(view.getPaddingLeft(), pwd1Var.mo51806g(519).f53849b, view.getPaddingRight(), pwd1Var.mo51806g(519).f53851d);
        return swd1.f214649b;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return new uj6(((Boolean) obj4).booleanValue(), ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((r57) obj, (String) obj2);
    }
}
