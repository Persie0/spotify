package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class zy5 implements InterfaceC2207oa, SingleTransformer, vd50, zmk, Function, dt70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287493a;

    public /* synthetic */ zy5(int i) {
        this.f287493a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final z4l0 m97220a(z4l0 z4l0Var, xja xjaVar) {
        y4l0 y4l0VarM95347a = z4l0Var.m95347a();
        ArrayList arrayList = y4l0VarM95347a.f269174c;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (pnd1.class.isInstance((hc50) it.next())) {
                break;
            }
            i++;
        }
        if (i < 0) {
            throw new IllegalStateException(s571.m77251j("Expected interceptor ", pnd1.class.getSimpleName(), " not found").toString());
        }
        arrayList.set(i, xjaVar);
        return new z4l0(y4l0VarM95347a);
    }

    /* JADX INFO: renamed from: b */
    public static zy90 m97221b(int i, Boolean bool, zy90 zy90Var) {
        List<yt90> list = zy90Var.f287523b.f138006a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (yt90 xt90Var : list) {
            if (xt90Var instanceof xt90) {
                hs90 hs90Var = ((xt90) xt90Var).f265803b;
                xt90Var = new xt90(hs90.m48418a(hs90Var, i == 0 ? hs90Var.f94639e : i, bool != null ? bool.booleanValue() : hs90Var.f94640f, 15));
            }
            arrayList.add(xt90Var);
        }
        return zy90.m97230a(zy90Var, new ly90(arrayList), false, null, false, 32765);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zy90 m97222c(int i, Boolean bool, zy90 zy90Var) {
        int i2 = (i & 1) != 0 ? 0 : 7;
        if ((i & 2) != 0) {
            bool = null;
        }
        return m97221b(i2, bool, zy90Var);
    }

    /* JADX INFO: renamed from: d */
    public static bnm0 m97223d(cbm0 cbm0Var) {
        return m97224e(cbm0Var, null);
    }

    /* JADX INFO: renamed from: e */
    public static bnm0 m97224e(cbm0 cbm0Var, fnm0 fnm0Var) {
        return new bnm0(f710.m40939g(cbm0Var, fnm0Var, 4));
    }

    /* JADX INFO: renamed from: f */
    public static bnm0 m97225f(zmm0 zmm0Var) {
        return new bnm0(zmm0Var.mo24811c());
    }

    /* JADX INFO: renamed from: h */
    public static bnm0 m97227h() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(Observable.just(new tmm0(xgg1.m90610F5(), (fnm0) null, (fnm0) null)));
    }

    /* JADX INFO: renamed from: i */
    public static String m97228i() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: j */
    public static zz11 m97229j(int i) {
        return new zz11(i, 19);
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        return single.flatMap(ket.f121962Z).compose(new kq11(30, 1000L, 5)).onErrorResumeNext(let.f132705Z);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.THIS_IS_ARTIST;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:102:0x013a  */
    /* JADX WARN: Code duplicated, block: B:145:0x019c A[PHI: r2
      0x019c: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:159:0x01c1, B:144:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x019f  */
    /* JADX WARN: Code duplicated, block: B:175:0x01e5 A[PHI: r5
      0x01e5: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:162:0x01cc, B:167:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:199:?, code lost:
    
        return new p204p.w510(r8, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.f269510c == p204p.xfr.f261070S0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        r8 = p204p.bvg1.m30631s(r1);
        r10 = p204p.bvg1.m30600A(r1);
        r11 = p204p.bvg1.m30636x(r1);
        r12 = p204p.bvg1.m30638z(r1);
        r6 = r6.f239170a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r6.f54889d != r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        r6 = r6.f54890e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        r6 = r6.f73412a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:
    
        if (r6 != 3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        r3 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r7 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        if (r7.m37480b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        r1 = r7.f54890e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
    
        r3 = r1.f73417f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b8, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bb, code lost:
    
        r1 = r1.f269509b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c1, code lost:
    
        if (r1.length() <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c3, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c5, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c6, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
    
        r14 = r2;
     */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo98394apply(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        long jM33187f;
        vzk vzkVar;
        String str5;
        String str6;
        String str7;
        String string;
        e07 e07Var;
        boolean z;
        fu6 fu6Var;
        int i2;
        int i3 = 3;
        int i4 = 1;
        switch (this.f287493a) {
            case 7:
                fv31 fv31Var = ryo.f203940b;
                gbu gbuVar = gbu.f78413a;
                Set setMo48707b = ((hv31) obj).mo48707b(fv31Var, gbuVar);
                return setMo48707b == null ? gbuVar : setMo48707b;
            case 10:
                d0w d0wVar = ((d7w) ((e7w) obj)).f46281a;
                dpx dpxVar = d0wVar.f44067D;
                boolean zM72056k = q350.m72056k((b5q0) dpxVar.mo30169a(b5q0.class));
                String str8 = d0wVar.f44069a;
                xj11 xj11Var = d0wVar.f44094z;
                if (xj11Var == null || (str = xj11Var.f261993a) == null) {
                    str = "";
                }
                if (xj11Var == null || (str7 = xj11Var.f261996d) == null) {
                    str2 = "";
                } else {
                    int length = str7.length() - 1;
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 <= length) {
                        boolean z3 = wj50.m88282u(str7.charAt(!z2 ? i5 : length), 32) <= 0;
                        if (z2) {
                            if (z3) {
                                length--;
                            } else {
                                string = str7.subSequence(i5, length + 1).toString();
                                if (string == null) {
                                    str2 = "";
                                } else {
                                    str2 = string;
                                }
                            }
                        } else if (z3) {
                            i5++;
                        } else {
                            z2 = true;
                        }
                    }
                    string = str7.subSequence(i5, length + 1).toString();
                    if (string == null) {
                        str2 = "";
                    } else {
                        str2 = string;
                    }
                }
                String str9 = (xj11Var == null || (str6 = xj11Var.f261997e) == null) ? "" : str6;
                String str10 = (xj11Var == null || (vzkVar = xj11Var.f262002j) == null || (str5 = vzkVar.f246475a) == null) ? "" : str5;
                vzk vzkVar2 = d0wVar.f44072d;
                if (xj11Var != null) {
                    vzk vzkVar3 = xj11Var.f262002j;
                    String str11 = vzkVar2.f246477c;
                    str3 = vzkVar2.f246475a;
                    String str12 = vzkVar3.f246477c;
                    String str13 = vzkVar3.f246475a;
                    boolean z4 = (str11 == null || str11.length() == 0 || str11.equals(str13) || str11.equals(str12)) ? false : true;
                    boolean z5 = (str3 == null || str3.length() == 0 || str3.equals(str13) || str3.equals(str12)) ? false : true;
                    if (z4) {
                        str4 = str11;
                    } else if (z5) {
                        str4 = str3;
                    } else {
                        str4 = null;
                    }
                } else {
                    String str14 = vzkVar2.f246477c;
                    str3 = vzkVar2.f246475a;
                    boolean z6 = str14 != null && str14.length() > 0;
                    boolean z7 = str3.length() > 0;
                    if (z6) {
                        str4 = str14;
                    } else if (z7) {
                        str4 = str3;
                    } else {
                        str4 = null;
                    }
                }
                boolean z8 = d0wVar.f44081m;
                int iM38547C = edb.m38547C(d0wVar.f44068E);
                if (iM38547C == 0) {
                    i = i4;
                } else if (iM38547C != 1) {
                    if (iM38547C != 2) {
                        i4 = 4;
                        if (iM38547C != 3) {
                            i3 = 5;
                            if (iM38547C != 4) {
                                if (iM38547C != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = 6;
                            }
                        } else {
                            i = i4;
                        }
                    }
                    i = i3;
                } else {
                    i = 2;
                }
                k3w k3wVar = new k3w(zM72056k, str8, str, str2, str9, str10, str4, z8, i, d0wVar.f44065B, d0wVar.f44090v);
                boolean zM72056k2 = q350.m72056k((b5q0) dpxVar.mo30169a(b5q0.class));
                Integer num = d0wVar.f44086r;
                if (num != null) {
                    int iIntValue = d0wVar.f44085q - num.intValue();
                    hvi0 hvi0Var = cks.f39079b;
                    jM33187f = cks.m33187f(jwg1.m54449D(iIntValue, ils.SECONDS));
                } else {
                    jM33187f = 0;
                }
                return new ijo0(k3wVar, zM72056k2, jM33187f);
            case 12:
                y5p y5pVar = (y5p) ((xul0) obj).mo49283h();
                if (y5pVar != null) {
                    vaa0 vaa0Var = y5pVar.f269498B;
                    e07 e07Var2 = vaa0Var.f239170a;
                    nzl0 nzl0Var = e07Var2.f54889d;
                    nzl0 nzl0Var2 = nzl0.BLUETOOTH;
                    if (nzl0Var == nzl0Var2) {
                        if (e07Var2 == null) {
                            if (y5pVar.f269523p.length() != 0) {
                                if (y5pVar.f269522o.length() != 0) {
                                }
                                break;
                            }
                            String strM30631s = bvg1.m30631s(y5pVar);
                            String strM30600A = bvg1.m30600A(y5pVar);
                            e07Var = vaa0Var.f239170a;
                            if (e07Var.f54889d != nzl0Var2) {
                                z = false;
                            } else {
                                fu6Var = e07Var.f54890e;
                                if (fu6Var != null) {
                                    i2 = fu6Var.f73412a;
                                } else {
                                    i2 = 0;
                                }
                                if (i2 == 3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            return new x510(strM30631s, strM30600A, z);
                        }
                        fu6 fu6Var2 = e07Var2.f54890e;
                        if ((fu6Var2 == null || fu6Var2.f73414c.length() != 0) && (fu6Var2 == null || fu6Var2.f73413b.length() != 0)) {
                            if ((fu6Var2 != null ? fu6Var2.f73412a : 0) != 7) {
                            }
                        }
                        String strM30631s2 = bvg1.m30631s(y5pVar);
                        String strM30600A2 = bvg1.m30600A(y5pVar);
                        e07Var = vaa0Var.f239170a;
                        if (e07Var.f54889d != nzl0Var2) {
                            z = false;
                        } else {
                            fu6Var = e07Var.f54890e;
                            if (fu6Var != null) {
                                i2 = fu6Var.f73412a;
                            } else {
                                i2 = 0;
                            }
                            if (i2 == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        return new x510(strM30631s2, strM30600A2, z);
                    }
                }
                return y510.f269305a;
            default:
                throw ei6.m39072i(obj);
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        oje ojeVar;
        switch (this.f287493a) {
            case 2:
                if (i != 0) {
                    ojeVar = i != 1 ? null : oje.CAMPAIGN_CARD_RESERVED_SHARE_V1;
                } else {
                    ojeVar = oje.CLIENT_CAPABILITY_UNSPECIFIED;
                }
                return ojeVar == null ? oje.UNRECOGNIZED : ojeVar;
            default:
                o511 o511VarM66266a = o511.m66266a(i);
                return o511VarM66266a == null ? o511.UNRECOGNIZED : o511VarM66266a;
        }
    }

    @Override // p204p.dt70
    public Object create() {
        mt30 builder = ((nt30) zs30.f285834a.m39930a()).toBuilder();
        wr30.Companion.getClass();
        return builder.mo51487f(tr30.m81338a().mo39252h(nj30.f154428c).mo39249e()).mo51484c();
    }

    public /* synthetic */ zy5(Object obj, int i) {
        this.f287493a = i;
    }

    public /* synthetic */ zy5(son sonVar, otn otnVar, int i) {
        this.f287493a = i;
    }

    public zy5(u96 u96Var) {
        this.f287493a = 3;
        u96Var.getClass();
    }
}
