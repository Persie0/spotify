package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.eventsender.Fragment;
import com.spotify.messages.EventSenderStats2NonAuth;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: classes8.dex */
public final class n90 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151673a;

    /* JADX INFO: renamed from: b */
    public final Object f151674b;

    /* JADX INFO: renamed from: c */
    public final Object f151675c;

    /* JADX INFO: renamed from: d */
    public final Object f151676d;

    public /* synthetic */ n90(Object obj, Object obj2, Object obj3, int i) {
        this.f151673a = i;
        this.f151674b = obj;
        this.f151675c = obj2;
        this.f151676d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public Object m63870a(String str, String str2, ibk ibkVar) {
        onq onqVar;
        if (ibkVar instanceof onq) {
            onqVar = (onq) ibkVar;
            int i = onqVar.f167316c;
            if ((i & Integer.MIN_VALUE) != 0) {
                onqVar.f167316c = i - Integer.MIN_VALUE;
            } else {
                onqVar = new onq(this, ibkVar);
            }
        } else {
            onqVar = new onq(this, ibkVar);
        }
        Object objM75179b = onqVar.f167314a;
        int i2 = onqVar.f167316c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75179b);
                rbt0 rbt0Var = (rbt0) this.f151674b;
                onqVar.f167316c = 1;
                objM75179b = rbt0Var.m75179b(str, str2, onqVar);
                yuk yukVar = yuk.f276404a;
                if (objM75179b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75179b);
            }
            if (!((o2x0) objM75179b).f161171a.f149852O0) {
                Logger.m3966b("[Puffin] DeleteCrossDeviceFilterUseCase error response " + this, new Object[0]);
            }
        } catch (IOException e) {
            Logger.m3966b("[Puffin] DeleteCrossDeviceFilterUseCase IOException: " + e, new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (m63870a("WIRED", r6, r0) == r4) goto L25;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m63871e(String str, ibk ibkVar) {
        pnq pnqVar;
        String str2;
        if (ibkVar instanceof pnq) {
            pnqVar = (pnq) ibkVar;
            int i = pnqVar.f179481c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnqVar.f179481c = i - Integer.MIN_VALUE;
            } else {
                pnqVar = new pnq(this, ibkVar);
            }
        } else {
            pnqVar = new pnq(this, ibkVar);
        }
        Object objM96567o = pnqVar.f179479a;
        int i2 = pnqVar.f179481c;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        if (str != null) {
            Single singleM72253g = ((q6u) ((mqr) this.f151675c).f146344c).m72253g(str);
            pnqVar.f179481c = 1;
            objM96567o = zn91.m96567o(singleM72253g, pnqVar);
        } else {
            str2 = "GENERIC";
            pnqVar.f179481c = 2;
        }
        return obj;
        str2 = ((r951) ((m951) objM96567o)).f196919e;
        pnqVar.f179481c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m63872f(zo20 zo20Var, fbk fbkVar) {
        qnq qnqVar;
        if (fbkVar instanceof qnq) {
            qnqVar = (qnq) fbkVar;
            int i = qnqVar.f190682c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnqVar.f190682c = i - Integer.MIN_VALUE;
            } else {
                qnqVar = new qnq(this, fbkVar);
            }
        } else {
            qnqVar = new qnq(this, fbkVar);
        }
        Object obj = qnqVar.f190680a;
        int i2 = qnqVar.f190682c;
        Object obj2 = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return obj2;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj2;
        }
        bga.m29073P(obj);
        if (((n8t0) this.f151676d).m63854a()) {
            jp20 jp20VarMo91521a = zo20Var.mo91521a();
            boolean z = jp20VarMo91521a instanceof hp20;
            Object obj3 = yuk.f276404a;
            if (z) {
                qnqVar.f190682c = 1;
                Object objM63870a = m63870a("BLUETOOTH", ((hp20) jp20VarMo91521a).f93686a, qnqVar);
                if (objM63870a != obj3) {
                    objM63870a = obj2;
                }
                if (objM63870a == obj3) {
                    return obj3;
                }
            } else {
                if (!(jp20VarMo91521a instanceof ip20)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = zo20Var.mo91522b().f12896d;
                qnqVar.f190682c = 2;
                if (m63871e(str, qnqVar) == obj3) {
                    return obj3;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m63873g(ttc0 ttc0Var, fbk fbkVar) {
        x1j0 x1j0Var;
        if (fbkVar instanceof x1j0) {
            x1j0Var = (x1j0) fbkVar;
            int i = x1j0Var.f257216c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1j0Var.f257216c = i - Integer.MIN_VALUE;
            } else {
                x1j0Var = new x1j0(this, fbkVar);
            }
        } else {
            x1j0Var = new x1j0(this, fbkVar);
        }
        Object obj = x1j0Var.f257214a;
        yuk yukVar = yuk.f276404a;
        int i2 = x1j0Var.f257216c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (ttc0Var.f223574b) {
                ((u0d0) this.f151675c).f225452X = true;
            }
            luk lukVar = (luk) this.f151674b;
            qff0 qff0Var = new qff0(ttc0Var, this, null, 11);
            x1j0Var.f257216c = 1;
            if (x0h1.m89557A(lukVar, qff0Var, x1j0Var) == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r2.invoke(r9, r3) == r8) goto L27;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m63874i(xtc0 xtc0Var, fbk fbkVar) {
        ejo0 ejo0Var;
        z650 z650Var;
        xtc0 xtc0Var2 = xtc0Var;
        if (fbkVar instanceof ejo0) {
            ejo0Var = (ejo0) fbkVar;
            int i = ejo0Var.f60264d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ejo0Var.f60264d = i - Integer.MIN_VALUE;
            } else {
                ejo0Var = new ejo0(this, fbkVar);
            }
        } else {
            ejo0Var = new ejo0(this, fbkVar);
        }
        Object obj = ejo0Var.f60262b;
        int i2 = ejo0Var.f60264d;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                xtc0Var2 = ejo0Var.f60261a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        luk lukVar = (luk) this.f151674b;
        oxl0 oxl0Var = new oxl0(xtc0Var2, this, fbkVar2, 17);
        ejo0Var.f60261a = xtc0Var2;
        ejo0Var.f60264d = 1;
        if (x0h1.m89557A(lukVar, oxl0Var, ejo0Var) != yukVar) {
        }
        return yukVar;
        iyo0 iyo0Var = (iyo0) this.f151675c;
        String str = xtc0Var2.f265835a;
        String str2 = xtc0Var2.f265836b;
        Long l = xtc0Var2.f265837c;
        String str3 = xtc0Var2.f265838d;
        String str4 = xtc0Var2.f265839e;
        d850 d850Var = xtc0Var2.f265840f;
        wtc0 wtc0Var = new wtc0(str, str2, null, l, str3, (d850Var == null || (z650Var = d850Var.f46380a) == null) ? null : z650Var.f279709a, null, null, str4, 0, 708);
        ejo0Var.f60261a = null;
        ejo0Var.f60264d = 2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151673a) {
            case 0:
                return m63876k((fbk) obj2);
            case 1:
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) obj;
                lqe1 lqe1Var = (lqe1) obj2;
                ibj ibjVar = lqe1Var.f136033c;
                Integer num = lqe1Var.f136032b;
                if (ibjVar == null) {
                    throw new IllegalArgumentException("YourLibraryResponseListUpdateMapper requires First, container values to be passed");
                }
                int iIntValue = num.intValue();
                b7z b7zVar = lqe1Var.f136031a;
                boolean zBooleanValue = ((Boolean) ((dh3) this.f151676d).invoke(yourLibraryResponse)).booleanValue();
                b450 b450VarM63417Y = zBooleanValue ? b450.f23226d : n0e1.m63417Y(iIntValue, yourLibraryResponse.m98195b() + iIntValue);
                boolean z = false;
                int iM98207t = zBooleanValue ? 0 : yourLibraryResponse.m98199q().m98207t();
                l980 l980Var = (l980) this.f151674b;
                YourLibraryResponseHeader yourLibraryResponseHeaderM98199q = yourLibraryResponse.m98199q();
                boolean z2 = ibjVar instanceof ebj;
                List list = b7zVar.f24439a;
                List list2 = b7zVar.f24440b;
                if (zBooleanValue && yourLibraryResponse.m98200r().isEmpty()) {
                    z = true;
                }
                return new gx80(new o6a0(iM98207t, b450VarM63417Y, bnf1.m29978n(yourLibraryResponse.m98196n()), bnf1.m29978n(yourLibraryResponse.m98200r()), l980Var.mo25890a(z2, z, yourLibraryResponseHeaderM98199q, list2, list), yourLibraryResponse.m98199q().m98204q(), yourLibraryResponse.m98199q().m98205r()), (hcj) ((jcj) this.f151675c).invoke(new icj(zBooleanValue, ibjVar, yourLibraryResponse.m98199q())));
            case 2:
                return m63872f((zo20) obj, (fbk) obj2);
            case 3:
                return m63875j((EventSenderStats2NonAuth) obj, (byte[]) obj2);
            case 4:
                return ((mcu0) this.f151676d).m61498e().flatMapSingle(new li80((Object) this, obj, obj2, 17)).firstOrError();
            case 5:
                xq00 xq00Var = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fxh0 fxh0VarM68493v0 = oyf1.m68493v0(p271.m68893C(2, zsf1.m96830A((fxh0) this.f151674b, 0.0f, uhe0.f230439d, 1)), (qly0) this.f151675c, false, 14);
                    fyf fyfVar = (fyf) this.f151676d;
                    aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                    int iM70356o = pmg1.m70356o(xq00Var);
                    wpn0 wpn0VarM91778m = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM68493v0);
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
                    yhh yhhVar = roh.f201265j;
                    if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iM70356o))) {
                        pi9.m70087l(iM70356o, xq00Var, iM70356o, yhhVar);
                    }
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                    fyfVar.mo24510D0(daf.f47039a, xq00Var, 6);
                    xq00Var.m91788r(true);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                return m63873g((ttc0) obj, (fbk) obj2);
            case 7:
                return m63874i((xtc0) obj, (fbk) obj2);
            case 8:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fxh0 fxh0VarM48273f = hqg1.m48273f(cxh0.f43038a, new rbq((c791) this.f151674b, 4));
                    fyf fyfVar2 = (fyf) this.f151675c;
                    m481 m481Var = (m481) this.f151676d;
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                    int iM70356o2 = pmg1.m70356o(xq00Var2);
                    wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM48273f);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var2.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var2.m91779m0();
                    if (xq00Var2.f264808S) {
                        xq00Var2.m91776l(c2087le2);
                    } else {
                        xq00Var2.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var2);
                    yhh yhhVar2 = roh.f201265j;
                    if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o2))) {
                        pi9.m70087l(iM70356o2, xq00Var2, iM70356o2, yhhVar2);
                    }
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var2);
                    fyfVar2.mo24510D0(m481Var, xq00Var2, 6);
                    xq00Var2.m91788r(true);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            default:
                a6z a6zVar = (a6z) obj;
                Maybe maybeOnErrorComplete = ((Flowable) this.f151675c).m23348j(d3v.f45021t).m23327A().flatMap(new b141(16, this, a6zVar)).doOnSuccess(new eg41(a6zVar, this, (jp20) obj2, 3)).doOnError(cz31.f43439P0).onErrorComplete();
                maybeOnErrorComplete.getClass();
                return new MaybeIgnoreElementCompletable(maybeOnErrorComplete);
        }
    }

    /* JADX INFO: renamed from: j */
    public x1x m63875j(EventSenderStats2NonAuth eventSenderStats2NonAuth, byte[] bArr) {
        long jM91995a = ((xsz0) this.f151675c).m91995a(2, "EventSenderStats2NonAuth", bArr);
        byte[] byteArray = eventSenderStats2NonAuth.toByteArray();
        ((y6x) this.f151676d).getClass();
        ae50<Fragment> ae50VarM9766q = zzg1.m97323v(byteArray, System.currentTimeMillis(), (t4x) this.f151674b).m9766q();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM9766q, 10));
        for (Fragment fragment : ae50VarM9766q) {
            arrayList.add(new pqm0(fragment.getName(), fragment.getData()));
        }
        return new x1x(-100L, "EventSenderStats2NonAuth", gva.m45886d(0, bArr, bArr.length), jM91995a, arrayList, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public Object m63876k(fbk fbkVar) throws Throwable {
        m90 m90Var;
        if (fbkVar instanceof m90) {
            m90Var = (m90) fbkVar;
            int i = m90Var.f141182c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m90Var.f141182c = i - Integer.MIN_VALUE;
            } else {
                m90Var = new m90(this, fbkVar);
            }
        } else {
            m90Var = new m90(this, fbkVar);
        }
        Object obj = m90Var.f141180a;
        int i2 = m90Var.f141182c;
        fbk fbkVar2 = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            luk lukVar = (luk) this.f151674b;
            C2574xj c2574xj = new C2574xj(this, fbkVar2, 1);
            m90Var.f141182c = 1;
            Object objM89557A = x0h1.m89557A(lukVar, c2574xj, m90Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        ((nb50) this.f151675c).m64065a(1, null);
        return w2a1.f247311a;
    }
}
