package p204p;

import com.google.protobuf.Empty;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class oyq0 implements Function, Predicate, tn61, qo91, lir, Function4, com.spotify.mobius.functions.Function, BiPredicate, BiFunction, z591, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171871a;

    /* JADX INFO: renamed from: b */
    public static final oyq0 f171861b = new oyq0(0);

    /* JADX INFO: renamed from: c */
    public static final oyq0 f171863c = new oyq0(1);

    /* JADX INFO: renamed from: d */
    public static final oyq0 f171864d = new oyq0(2);

    /* JADX INFO: renamed from: e */
    public static final oyq0 f171865e = new oyq0(3);

    /* JADX INFO: renamed from: f */
    public static final oyq0 f171866f = new oyq0(4);

    /* JADX INFO: renamed from: g */
    public static final oyq0 f171867g = new oyq0(5);

    /* JADX INFO: renamed from: h */
    public static final oyq0 f171868h = new oyq0(6);

    /* JADX INFO: renamed from: i */
    public static final oyq0 f171869i = new oyq0(7);

    /* JADX INFO: renamed from: t */
    public static final oyq0 f171870t = new oyq0(8);

    /* JADX INFO: renamed from: X */
    public static final oyq0 f171854X = new oyq0(9);

    /* JADX INFO: renamed from: Y */
    public static final oyq0 f171856Y = new oyq0(10);

    /* JADX INFO: renamed from: Z */
    public static final oyq0 f171858Z = new oyq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final oyq0 f171842L0 = new oyq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final oyq0 f171843M0 = new oyq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final oyq0 f171844N0 = new oyq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final oyq0 f171845O0 = new oyq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final oyq0 f171846P0 = new oyq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final oyq0 f171847Q0 = new oyq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final oyq0 f171848R0 = new oyq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final oyq0 f171849S0 = new oyq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final oyq0 f171850T0 = new oyq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final oyq0 f171851U0 = new oyq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final oyq0 f171852V0 = new oyq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final oyq0 f171853W0 = new oyq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final oyq0 f171855X0 = new oyq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final oyq0 f171857Y0 = new oyq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final oyq0 f171859Z0 = new oyq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final /* synthetic */ oyq0 f171860a1 = new oyq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final oyq0 f171862b1 = new oyq0(28);

    public /* synthetic */ oyq0(int i) {
        this.f171871a = i;
    }

    /* JADX INFO: renamed from: m */
    public static void m68561m(Object obj) {
        throw new cvk("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: A */
    public kd70 mo55443A(zwb zwbVar) {
        return (kd70) ((nwb) zwbVar).f159078b;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: B */
    public int mo55445B(zwb zwbVar) {
        return 1;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: C */
    public int mo55447C(en91 en91Var) {
        if (en91Var instanceof kgx0) {
            return mo55488g0((kd70) en91Var);
        }
        if (en91Var instanceof qi5) {
            return ((qi5) en91Var).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + en91Var + ", " + qpv0.f191387a.mo54112b(en91Var.getClass())).toString());
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: E */
    public boolean mo55451E(kn91 kn91Var) {
        return kn91Var instanceof up60;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: F */
    public kd70 mo55453F(kd70 kd70Var) {
        m68561m(kd70Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: G */
    public boolean mo55455G(kd70 kd70Var) {
        return !wj50.m88271j(mo55508r(mo55474Y(kd70Var)), mo55508r(mo55465O(kd70Var)));
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: H */
    public kn91 mo55457H(kd70 kd70Var) {
        kgx0 kgx0VarMo55496k0 = mo55496k0(kd70Var);
        if (kgx0VarMo55496k0 == null) {
            kgx0VarMo55496k0 = mo55474Y(kd70Var);
        }
        return mo55508r(kgx0VarMo55496k0);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: I */
    public en91 mo55459I(kgx0 kgx0Var) {
        return (en91) kgx0Var;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: J */
    public boolean mo55460J(kd70 kd70Var) {
        kgx0 kgx0VarMo55496k0 = mo55496k0(kd70Var);
        return (kgx0VarMo55496k0 != null ? m68562j(kgx0VarMo55496k0) : null) != null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: K */
    public boolean mo55461K(fn91 fn91Var) {
        xr60 xr60Var = ((yr60) fn91Var).f275407a;
        xr60 xr60Var2 = xr60.f265273c;
        return wj50.m88271j(xr60Var, xr60.f265273c);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: L */
    public boolean mo55462L(kgx0 kgx0Var) {
        return m68562j(kgx0Var) != null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: M */
    public ghz mo55463M(kd70 kd70Var) {
        if (!(kd70Var instanceof AbstractC1969i7) || ((AbstractC1969i7) kd70Var).mo32817N() == null) {
            return null;
        }
        return (ghz) kd70Var;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: N */
    public ywb mo55464N(zwb zwbVar) {
        return ((nwb) zwbVar).f159079c;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: O */
    public kgx0 mo55465O(kd70 kd70Var) {
        ghz ghzVarMo55463M = mo55463M(kd70Var);
        if (ghzVarMo55463M != null) {
            return ((AbstractC1969i7) ghzVarMo55463M).mo32820Q();
        }
        kgx0 kgx0VarMo55496k0 = mo55496k0(kd70Var);
        wj50.m88279p(kgx0VarMo55496k0);
        return kgx0VarMo55496k0;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: P */
    public boolean mo55466P(kd70 kd70Var) {
        return ((sr60) mo55474Y(kd70Var)).mo27066q() != ((sr60) mo55465O(kd70Var)).mo27066q();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: Q */
    public boolean mo55467Q(zwb zwbVar) {
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: R */
    public int mo55468R(kn91 kn91Var) {
        if (kn91Var instanceof up60) {
            return pwb.m71228m((up60) kn91Var).size();
        }
        return 0;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: S */
    public zwb mo55469S(ld21 ld21Var) {
        if (ld21Var instanceof zwb) {
            return (zwb) ld21Var;
        }
        return null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: U */
    public kgx0 mo55471U(kgx0 kgx0Var, boolean z) {
        return ((AbstractC1969i7) kgx0Var).mo32819P(z);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: W */
    public int mo55472W(fn91 fn91Var) {
        int i = ((yr60) fn91Var).f275407a.f265274a;
        if (i == 0) {
            return 2;
        }
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 3;
        }
        if (iM38547C == 1) {
            return 1;
        }
        if (iM38547C == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: X */
    public boolean mo55473X(kn91 kn91Var, kn91 kn91Var2) {
        return kn91Var.equals(kn91Var2);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: Y */
    public kgx0 mo55474Y(kd70 kd70Var) {
        ghz ghzVarMo55463M = mo55463M(kd70Var);
        if (ghzVarMo55463M != null) {
            return ((AbstractC1969i7) ghzVarMo55463M).mo32817N();
        }
        kgx0 kgx0VarMo55496k0 = mo55496k0(kd70Var);
        wj50.m88279p(kgx0VarMo55496k0);
        return kgx0VarMo55496k0;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: Z */
    public boolean mo55475Z(kn91 kn91Var) {
        return !(kn91Var instanceof owb);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: a */
    public zwb mo55476a(kgx0 kgx0Var) {
        qkq qkqVarM68562j = m68562j(kgx0Var);
        if (qkqVarM68562j == null) {
            return mo55469S((ld21) kgx0Var);
        }
        m68561m(qkqVarM68562j);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: a0 */
    public kgx0 mo55477a0(kgx0 kgx0Var) {
        List listMo27065K;
        int i;
        sr60 sr60Var = (sr60) kgx0Var;
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        up60 up60Var = kq60VarMo27067y instanceof up60 ? (up60) kq60VarMo27067y : null;
        if (up60Var != null && ((listMo27065K = sr60Var.mo27065K()) == null || !listMo27065K.isEmpty())) {
            Iterator it = listMo27065K.iterator();
            while (it.hasNext()) {
                if (((xr60) it.next()).f265274a != 1) {
                    List listM71228m = pwb.m71228m(up60Var);
                    if (listM71228m.size() != listMo27065K.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(i6f.m49804T(listMo27065K, 10));
                    Iterator it2 = listMo27065K.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        xr60 xr60VarM81324l = (xr60) it2.next();
                        int i2 = xr60VarM81324l.f265274a;
                        if (i2 != 1) {
                            sr60 sr60Var2 = xr60VarM81324l.f265275b;
                            if (i2 != 2) {
                                sr60Var2 = null;
                            }
                            xr60 xr60Var = xr60.f265273c;
                            xr60VarM81324l = tqg1.m81324l(new nwb(sr60Var2, new owb(xr60VarM81324l), false));
                        }
                        arrayList.add(xr60VarM81324l);
                    }
                    zr60 zr60Var = zr60.f285551b;
                    zr60 zr60Var2 = new zr60(kkc0.m56705r0(g6f.m43746s1(pwb.m71228m(up60Var), arrayList)));
                    int size = listMo27065K.size();
                    for (i = 0; i < size; i++) {
                        xr60 xr60Var2 = (xr60) listMo27065K.get(i);
                        if (xr60Var2.f265274a != 1) {
                            List upperBounds = ((ur60) listM71228m.get(i)).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                sr60 sr60Var3 = zr60Var2.m96756a(1, (sr60) it3.next()).f265275b;
                                wj50.m88279p(sr60Var3);
                                arrayList2.add(sr60Var3);
                            }
                            if (xr60Var2.f265274a == 3) {
                                sr60 sr60Var4 = xr60Var2.f265275b;
                                wj50.m88279p(sr60Var4);
                                arrayList2.add(sr60Var4);
                            }
                            ((nwb) ((xr60) arrayList.get(i)).f265275b).f159079c.f170685b = arrayList2;
                        }
                    }
                    boolean zMo27066q = sr60Var.mo27066q();
                    List annotations = sr60Var.getAnnotations();
                    boolean z = sr60Var instanceof AbstractC1969i7;
                    AbstractC1969i7 abstractC1969i7 = z ? (AbstractC1969i7) sr60Var : null;
                    sr60 sr60VarMo32821g = abstractC1969i7 != null ? abstractC1969i7.mo32821g() : null;
                    AbstractC1969i7 abstractC1969i8 = z ? (AbstractC1969i7) sr60Var : null;
                    return new tc21(up60Var, arrayList, zMo27066q, annotations, sr60VarMo32821g, false, false, false, abstractC1969i8 != null ? abstractC1969i8.mo32812A() : null, null);
                }
            }
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f171871a) {
            case 0:
                Boolean bool = (Boolean) g6f.m43745s0(((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 1:
                return Boolean.valueOf(dxf1.m37244s("apply-child-content-restrictions", (Map) obj));
            case 2:
                return p1j0.f173119a;
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 11:
            case 14:
            case 20:
            case 21:
            case 22:
            default:
                return (byte[]) obj;
            case 7:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    d0w d0wVar = (d0w) entry.getValue();
                    int i = d0wVar.f44068E;
                    linkedHashMap.put(key, (i == 3 || i == 4 || !d0wVar.f44083o) ? ghl.f79947a : q350.m72056k((b5q0) d0wVar.f44067D.mo30169a(b5q0.class)) ? hhl.f91413a : ihl.f102315a);
                }
                return kkc0.m56706s0(linkedHashMap);
            case 8:
                return new b6y0(false, "", "");
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                return new s6x0(new c6x0((Throwable) obj));
            case 13:
                return ((k621) obj).f119625b;
            case 15:
                return new u331(Boolean.valueOf(((o221) obj).f160925c));
            case 16:
                return th31.f220315a;
            case 17:
                int i2 = Flowable.f7192a;
                return FlowableNever.f7888b;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StatusResponseOuterClass$StatusResponse.m21630p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 19:
                f97 f97Var = (f97) obj;
                ArrayList<f0u0> arrayList = f97Var.f67184c.f174897a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (f0u0 f0u0Var : arrayList) {
                    arrayList2.add(new n881(cjf1.m32958I(f0u0Var.f64715a), cjf1.m32958I(f0u0Var.f64716b), f0u0Var.f64718d, f0u0Var.f64719e));
                }
                jg90 jg90Var = f97Var.f67185d.f138751g;
                return new o881(jg90Var.f112112a, jg90Var.f112113b, jg90Var.f112114c, arrayList2);
            case 23:
                return Boolean.valueOf(((g0j) obj).f75382b);
        }
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: b */
    public int mo55478b(do91 do91Var) {
        int iM38547C = edb.m38547C(((ur60) do91Var).f233242d);
        if (iM38547C == 0) {
            return 3;
        }
        if (iM38547C == 1) {
            return 1;
        }
        if (iM38547C == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ boolean mo55479b0(kd70 kd70Var) {
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: c */
    public fn91 mo55480c(ywb ywbVar) {
        return new yr60(((owb) ywbVar).f170684a);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: c0 */
    public boolean mo55481c0(kn91 kn91Var) {
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: d */
    public boolean mo55482d(zwb zwbVar) {
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: d0 */
    public kd70 mo55483d0(kd70 kd70Var) {
        m68561m(kd70Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: e */
    public Collection mo55484e(kgx0 kgx0Var) {
        m68561m(kgx0Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: e0 */
    public /* bridge */ boolean mo55485e0(kgx0 kgx0Var, kgx0 kgx0Var2) {
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: f */
    public l0y0 mo55486f(kgx0 kgx0Var) {
        zr60 zr60Var = zr60.f285551b;
        return new mpv0(uqg1.m83796q((sr60) kgx0Var));
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b(z71.m95528c((z71) obj, null, null, null, false, false, false, null, new npm0(3), orn0.f168627d, null, 11071));
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: g0 */
    public int mo55488g0(kd70 kd70Var) {
        return ((sr60) kd70Var).mo27065K().size();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: h */
    public kgx0 mo55489h(ghz ghzVar) {
        return ((AbstractC1969i7) ghzVar).mo32817N();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: i */
    public kgx0 mo55491i(ghz ghzVar) {
        return ((AbstractC1969i7) ghzVar).mo32820Q();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: i0 */
    public do91 mo55492i0(kn91 kn91Var, int i) {
        return (ur60) pwb.m71228m((up60) kn91Var).get(i);
    }

    /* JADX INFO: renamed from: j */
    public qkq m68562j(kgx0 kgx0Var) {
        if ((kgx0Var instanceof AbstractC1969i7) && ((AbstractC1969i7) kgx0Var).mo32813C()) {
            return (qkq) kgx0Var;
        }
        return null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: k */
    public boolean mo55495k(kgx0 kgx0Var) {
        gd70 gd70Var;
        if (!(kgx0Var instanceof AbstractC1969i7) || !(((AbstractC1969i7) kgx0Var).mo27067y() instanceof dhw)) {
            zwq zwqVar = kgx0Var instanceof zwq ? (zwq) kgx0Var : null;
            if (zwqVar == null || (gd70Var = zwqVar.f287046b) == null || !qug1.m73946p(gd70Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: k0 */
    public kgx0 mo55496k0(kd70 kd70Var) {
        if (mo55463M(kd70Var) != null) {
            return null;
        }
        return (kgx0) kd70Var;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: l */
    public boolean mo55497l(kgx0 kgx0Var) {
        mo55508r(kgx0Var);
        return false;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: l0 */
    public boolean mo55498l0(kgx0 kgx0Var) {
        if (!mo55457H(kgx0Var).equals(gsj0.f83979b)) {
            return false;
        }
        m68561m(kgx0Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: m0 */
    public boolean mo55499m0(kgx0 kgx0Var) {
        return mo55508r(kgx0Var) instanceof up60;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: n */
    public fn91 mo55500n(kd70 kd70Var) {
        m68561m(kd70Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: n0 */
    public fn91 mo55501n0(kd70 kd70Var, int i) {
        return new yr60((xr60) ((sr60) kd70Var).mo27065K().get(i));
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: o */
    public kd70 mo55502o(fn91 fn91Var) {
        return (kd70) ((yr60) fn91Var).f275407a.f265275b;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: o0 */
    public boolean mo55503o0(do91 do91Var, kn91 kn91Var) {
        m68561m(do91Var);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: p */
    public boolean mo55504p(kgx0 kgx0Var) {
        kgx0 kgx0VarMo55496k0 = mo55496k0(kgx0Var);
        return (kgx0VarMo55496k0 != null ? mo55476a(kgx0VarMo55496k0) : null) != null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: p0 */
    public boolean mo55505p0(kn91 kn91Var) {
        return kn91Var.equals(qpv0.f191387a.mo54112b(Object.class));
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: q */
    public Collection mo55506q(kn91 kn91Var) {
        if (kn91Var instanceof up60) {
            List listMo29112f = ((up60) kn91Var).mo29112f();
            ArrayList arrayList = new ArrayList(i6f.m49804T(listMo29112f, 10));
            Iterator it = listMo29112f.iterator();
            while (it.hasNext()) {
                arrayList.add((kd70) ((sr60) it.next()));
            }
            return arrayList;
        }
        if (kn91Var instanceof ur60) {
            List upperBounds = ((ur60) kn91Var).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(upperBounds, 10));
            Iterator it2 = upperBounds.iterator();
            while (it2.hasNext()) {
                arrayList2.add((kd70) ((sr60) it2.next()));
            }
            return arrayList2;
        }
        if (!(kn91Var instanceof owb)) {
            StringBuilder sbM80652j = tfe.m80652j("Unsupported type constructor: ", kn91Var, " (");
            sbM80652j.append(kn91Var.getClass().getName());
            sbM80652j.append(')');
            throw new IllegalStateException(sbM80652j.toString().toString());
        }
        ArrayList arrayList3 = ((owb) kn91Var).f170685b;
        if (arrayList3 == null) {
            wj50.m88260d0("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add((kd70) ((sr60) it3.next()));
        }
        return arrayList4;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: r */
    public kn91 mo55508r(kgx0 kgx0Var) {
        Class<?> componentType;
        if (kgx0Var instanceof nwb) {
            return ((nwb) kgx0Var).f159079c;
        }
        AbstractC1969i7 abstractC1969i7 = (AbstractC1969i7) kgx0Var;
        if (abstractC1969i7.mo32814G()) {
            return gsj0.f83979b;
        }
        kq60 kq60VarMo27067y = abstractC1969i7.mo27067y();
        cq60 cq60Var = kq60VarMo27067y instanceof cq60 ? (cq60) kq60VarMo27067y : null;
        if (cq60Var != null && (componentType = cq60Var.f40745b.getComponentType()) != null && !componentType.isPrimitive()) {
            return (kn91) qpv0.f191387a.mo54112b(Object[].class);
        }
        kq60 kq60VarMo32812A = abstractC1969i7.mo32812A();
        if (kq60VarMo32812A == null) {
            kq60VarMo32812A = abstractC1969i7.mo27067y();
        }
        return (kn91) kq60VarMo32812A;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: r0 */
    public fn91 mo55509r0(en91 en91Var, int i) {
        if (en91Var instanceof ld21) {
            return mo55501n0((kd70) en91Var, i);
        }
        if (en91Var instanceof qi5) {
            return (fn91) ((qi5) en91Var).get(i);
        }
        throw new IllegalStateException(("unknown type argument list type: " + en91Var + ", " + qpv0.f191387a.mo54112b(en91Var.getClass())).toString());
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: s */
    public fn91 mo55510s(kgx0 kgx0Var, int i) {
        if (i < 0 || i >= mo55488g0(kgx0Var)) {
            return null;
        }
        return mo55501n0(kgx0Var, i);
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        switch (this.f171871a) {
            case 9:
                return !((d4z0) obj).f45272a.equals(((d4z0) obj2).f45272a);
            default:
                return ((zl81) obj).f283946a == ((zl81) obj2).f283946a;
        }
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: u */
    public boolean mo55514u(kd70 kd70Var) {
        return ((sr60) kd70Var).mo27066q();
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: v */
    public boolean mo55515v(kn91 kn91Var) {
        if (!(kn91Var instanceof cq60)) {
            return false;
        }
        cq60 cq60Var = (cq60) kn91Var;
        return (cq60Var.m33609g0() != oth0.FINAL || cq60Var.m33606d0() == xfe.ENUM_CLASS || cq60Var.m33606d0() == xfe.ENUM_ENTRY || cq60Var.m33606d0() == xfe.ANNOTATION_CLASS) ? false : true;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: w */
    public kd70 mo55517w(ArrayList arrayList) {
        m68561m(this);
        throw null;
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: x */
    public boolean mo55519x(kn91 kn91Var) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return new hb01((db01) obj, ((Integer) obj2).intValue() > 0, (z901) obj4, (ua01) obj3);
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: z */
    public boolean mo55522z(kn91 kn91Var) {
        return kn91Var.equals(gsj0.f83979b);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f171871a) {
            case 3:
                return !((s431) obj).f205436i.isEmpty();
            default:
                Boolean bool = (Boolean) obj;
                wj50.m88279p(bool);
                return bool.booleanValue();
        }
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: T */
    public void mo55470T(kd70 kd70Var) {
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: h0 */
    public void mo55490h0(kgx0 kgx0Var) {
    }

    @Override // p204p.qo91
    /* JADX INFO: renamed from: q0 */
    public void mo55507q0(kgx0 kgx0Var) {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f171871a) {
            case 22:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
            case 23:
            default:
                return new pqm0((List) obj, (xul0) obj2);
            case 24:
                return new pqm0(((xul0) obj).mo49283h(), ((xul0) obj2).mo49283h());
        }
    }
}
