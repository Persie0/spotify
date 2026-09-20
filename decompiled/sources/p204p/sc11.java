package p204p;

import com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider$ReachabilityState;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class sc11 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f207631b;

    public /* synthetic */ sc11(niz nizVar, int i) {
        this.f207630a = i;
        this.f207631b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x020a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0257  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:200:0x0316  */
    /* JADX WARN: Code duplicated, block: B:217:0x035a  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:272:0x0438  */
    /* JADX WARN: Code duplicated, block: B:293:0x048b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:312:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:329:0x0520  */
    /* JADX WARN: Code duplicated, block: B:348:0x056d  */
    /* JADX WARN: Code duplicated, block: B:365:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:406:0x063f  */
    /* JADX WARN: Code duplicated, block: B:423:0x068a  */
    /* JADX WARN: Code duplicated, block: B:443:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:469:0x0729  */
    /* JADX WARN: Code duplicated, block: B:486:0x076f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:511:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:528:0x083b  */
    /* JADX WARN: Code duplicated, block: B:549:0x0888  */
    /* JADX WARN: Code duplicated, block: B:566:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:583:0x091e  */
    /* JADX WARN: Code duplicated, block: B:600:0x0969  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x015f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        rc11 rc11Var;
        Object zbu0Var;
        tgj0 tgj0Var;
        wc11 wc11Var;
        xc11 xc11Var;
        ae11 ae11Var;
        jm11 jm11Var;
        tm11 tm11Var;
        uo11 uo11Var;
        ro11 ro11Var;
        mq11 mq11Var;
        qq11 qq11Var;
        Integer numM29807r0;
        zr11 zr11Var;
        cv11 cv11Var;
        h221 h221Var;
        s921 s921Var;
        x921 x921Var;
        z921 z921Var;
        ba21 ba21Var;
        ca21 ca21Var;
        ea21 ea21Var;
        fa21 fa21Var;
        ga21 ga21Var;
        ha21 ha21Var;
        qg21 qg21Var;
        gn21 gn21Var;
        hn21 hn21Var;
        jn21 jn21Var;
        rn21 rn21Var;
        it91 it91VarM83770i;
        bo21 bo21Var;
        do21 do21Var;
        eo21 eo21Var;
        fo21 fo21Var;
        switch (this.f207630a) {
            case 0:
                if (fbkVar instanceof rc11) {
                    rc11Var = (rc11) fbkVar;
                    int i = rc11Var.f197689b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rc11Var.f197689b = i - Integer.MIN_VALUE;
                    } else {
                        rc11Var = new rc11(this, fbkVar);
                    }
                } else {
                    rc11Var = new rc11(this, fbkVar);
                }
                Object obj2 = rc11Var.f197688a;
                int i2 = rc11Var.f197689b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    EsReachabilityProvider$ReachabilityState esReachabilityProvider$ReachabilityState = (EsReachabilityProvider$ReachabilityState) obj;
                    wj50.m88279p(esReachabilityProvider$ReachabilityState);
                    int iM7591r = esReachabilityProvider$ReachabilityState.m7591r();
                    int i3 = iM7591r == 0 ? -1 : e2t0.f55518a[edb.m38547C(iM7591r)];
                    if (i3 == 1) {
                        wd50<slw> wd50VarM7594o = esReachabilityProvider$ReachabilityState.m7590q().m7594o();
                        Set setM43736n1 = null;
                        if (!wd50VarM7594o.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (slw slwVar : wd50VarM7594o) {
                                wj50.m88279p(slwVar);
                                int iOrdinal = slwVar.ordinal();
                                if (iOrdinal == 0) {
                                    tgj0Var = tgj0.f220200a;
                                } else if (iOrdinal == 1) {
                                    tgj0Var = tgj0.f220201b;
                                } else if (iOrdinal == 2) {
                                    tgj0Var = tgj0.f220202c;
                                } else if (iOrdinal == 3) {
                                    tgj0Var = tgj0.f220203d;
                                } else {
                                    if (iOrdinal != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    tgj0Var = null;
                                }
                                if (tgj0Var != null) {
                                    arrayList.add(tgj0Var);
                                }
                            }
                            setM43736n1 = g6f.m43736n1(arrayList);
                        }
                        zbu0Var = new zbu0(setM43736n1);
                    } else if (i3 != 2) {
                        zbu0Var = new ybu0(new mqj0(false, false));
                    } else {
                        zbu0Var = new ybu0(((AbstractCollection) esReachabilityProvider$ReachabilityState.m7589p().m7585p()).contains(unw.FORCED_OFFLINE) ? lqj0.f136072a : new mqj0(!esReachabilityProvider$ReachabilityState.m7588o().m7555s(), !esReachabilityProvider$ReachabilityState.m7588o().m7554r()));
                    }
                    rc11Var.f197689b = 1;
                    Object objEmit = this.f207631b.emit(zbu0Var, rc11Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof wc11) {
                    wc11Var = (wc11) fbkVar;
                    int i4 = wc11Var.f249931b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        wc11Var.f249931b = i4 - Integer.MIN_VALUE;
                    } else {
                        wc11Var = new wc11(this, fbkVar);
                    }
                } else {
                    wc11Var = new wc11(this, fbkVar);
                }
                Object obj3 = wc11Var.f249930a;
                int i5 = wc11Var.f249931b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    wc11Var.f249931b = 1;
                    Object objEmit2 = this.f207631b.emit(boolValueOf, wc11Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof xc11) {
                    xc11Var = (xc11) fbkVar;
                    int i6 = xc11Var.f260047b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        xc11Var.f260047b = i6 - Integer.MIN_VALUE;
                    } else {
                        xc11Var = new xc11(this, fbkVar);
                    }
                } else {
                    xc11Var = new xc11(this, fbkVar);
                }
                Object obj4 = xc11Var.f260046a;
                int i7 = xc11Var.f260047b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    xc11Var.f260047b = 1;
                    Object objEmit3 = this.f207631b.emit(boolValueOf2, xc11Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof ae11) {
                    ae11Var = (ae11) fbkVar;
                    int i8 = ae11Var.f14718b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ae11Var.f14718b = i8 - Integer.MIN_VALUE;
                    } else {
                        ae11Var = new ae11(this, fbkVar);
                    }
                } else {
                    ae11Var = new ae11(this, fbkVar);
                }
                Object obj5 = ae11Var.f14717a;
                int i9 = ae11Var.f14718b;
                if (i9 == 0) {
                    bga.m29073P(obj5);
                    z4m z4mVar = (z4m) obj;
                    re11 re11Var = new re11(z4mVar.f279296a, z4mVar.f279298c);
                    ae11Var.f14718b = 1;
                    Object objEmit4 = this.f207631b.emit(re11Var, ae11Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof jm11) {
                    jm11Var = (jm11) fbkVar;
                    int i10 = jm11Var.f113732b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        jm11Var.f113732b = i10 - Integer.MIN_VALUE;
                    } else {
                        jm11Var = new jm11(this, fbkVar);
                    }
                } else {
                    jm11Var = new jm11(this, fbkVar);
                }
                Object obj6 = jm11Var.f113731a;
                int i11 = jm11Var.f113732b;
                if (i11 == 0) {
                    bga.m29073P(obj6);
                    osj osjVar = ((Boolean) obj).booleanValue() ? osj.f168826b : osj.f168827c;
                    jm11Var.f113732b = 1;
                    Object objEmit5 = this.f207631b.emit(osjVar, jm11Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof tm11) {
                    tm11Var = (tm11) fbkVar;
                    int i12 = tm11Var.f221570b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        tm11Var.f221570b = i12 - Integer.MIN_VALUE;
                    } else {
                        tm11Var = new tm11(this, fbkVar);
                    }
                } else {
                    tm11Var = new tm11(this, fbkVar);
                }
                Object obj7 = tm11Var.f221569a;
                int i13 = tm11Var.f221570b;
                if (i13 == 0) {
                    bga.m29073P(obj7);
                    fd01 fd01VarM83417a = um11.m83417a((a7x0) obj);
                    tm11Var.f221570b = 1;
                    Object objEmit6 = this.f207631b.emit(fd01VarM83417a, tm11Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof uo11) {
                    uo11Var = (uo11) fbkVar;
                    int i14 = uo11Var.f232309b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        uo11Var.f232309b = i14 - Integer.MIN_VALUE;
                    } else {
                        uo11Var = new uo11(this, fbkVar);
                    }
                } else {
                    uo11Var = new uo11(this, fbkVar);
                }
                Object obj8 = uo11Var.f232308a;
                int i15 = uo11Var.f232309b;
                if (i15 == 0) {
                    bga.m29073P(obj8);
                    p2x0 p2x0Var = (p2x0) obj;
                    if (p2x0Var instanceof m2x0) {
                        hz80 hz80Var = (hz80) ((m2x0) p2x0Var).f139474a;
                        ro11Var = new ro11(hz80Var.f96834t, hz80Var.f96833i, hz80Var.f96832h, wj50.m88271j(hz80Var.f96822X.get("is_genpods"), "true"), true);
                    } else {
                        if (!(p2x0Var instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ro11Var = new ro11(new noa1(false, null, null, false, false, 1023), lnn0.f135183b, false, false, false);
                    }
                    uo11Var.f232309b = 1;
                    Object objEmit7 = this.f207631b.emit(ro11Var, uo11Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof mq11) {
                    mq11Var = (mq11) fbkVar;
                    int i16 = mq11Var.f146140b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        mq11Var.f146140b = i16 - Integer.MIN_VALUE;
                    } else {
                        mq11Var = new mq11(this, fbkVar);
                    }
                } else {
                    mq11Var = new mq11(this, fbkVar);
                }
                Object obj9 = mq11Var.f146139a;
                int i17 = mq11Var.f146140b;
                if (i17 == 0) {
                    bga.m29073P(obj9);
                    fd01 fd01VarM65376a = nq11.m65376a((a7x0) obj);
                    mq11Var.f146140b = 1;
                    Object objEmit8 = this.f207631b.emit(fd01VarM65376a, mq11Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof qq11) {
                    qq11Var = (qq11) fbkVar;
                    int i18 = qq11Var.f191429b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        qq11Var.f191429b = i18 - Integer.MIN_VALUE;
                    } else {
                        qq11Var = new qq11(this, fbkVar);
                    }
                } else {
                    qq11Var = new qq11(this, fbkVar);
                }
                Object obj10 = qq11Var.f191428a;
                int i19 = qq11Var.f191429b;
                if (i19 == 0) {
                    bga.m29073P(obj10);
                    String str = (String) obj;
                    Boolean boolValueOf3 = Boolean.valueOf((((str == null || (numM29807r0 = bm51.m29807r0(str)) == null) ? 0 : numM29807r0.intValue()) & 1) != 0);
                    qq11Var.f191429b = 1;
                    Object objEmit9 = this.f207631b.emit(boolValueOf3, qq11Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof zr11) {
                    zr11Var = (zr11) fbkVar;
                    int i20 = zr11Var.f285522b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        zr11Var.f285522b = i20 - Integer.MIN_VALUE;
                    } else {
                        zr11Var = new zr11(this, fbkVar);
                    }
                } else {
                    zr11Var = new zr11(this, fbkVar);
                }
                Object obj11 = zr11Var.f285521a;
                int i21 = zr11Var.f285522b;
                if (i21 == 0) {
                    bga.m29073P(obj11);
                    String str2 = (String) obj;
                    if (str2 == null) {
                        str2 = "spotify:local-files";
                    }
                    zr11Var.f285522b = 1;
                    Object objEmit10 = this.f207631b.emit(str2, zr11Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof cv11) {
                    cv11Var = (cv11) fbkVar;
                    int i22 = cv11Var.f42270b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cv11Var.f42270b = i22 - Integer.MIN_VALUE;
                    } else {
                        cv11Var = new cv11(this, fbkVar);
                    }
                } else {
                    cv11Var = new cv11(this, fbkVar);
                }
                Object obj12 = cv11Var.f42269a;
                int i23 = cv11Var.f42270b;
                if (i23 == 0) {
                    bga.m29073P(obj12);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    cv11Var.f42270b = 1;
                    Object objEmit11 = this.f207631b.emit(boolValueOf4, cv11Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof h221) {
                    h221Var = (h221) fbkVar;
                    int i24 = h221Var.f86856b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        h221Var.f86856b = i24 - Integer.MIN_VALUE;
                    } else {
                        h221Var = new h221(this, fbkVar);
                    }
                } else {
                    h221Var = new h221(this, fbkVar);
                }
                Object obj13 = h221Var.f86855a;
                int i25 = h221Var.f86856b;
                if (i25 == 0) {
                    bga.m29073P(obj13);
                    p2x0 p2x0Var2 = (p2x0) obj;
                    Boolean bool = null;
                    if (!(p2x0Var2 instanceof k2x0)) {
                        if (!(p2x0Var2 instanceof m2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<q121> list = ((nw80) ((m2x0) p2x0Var2).f139474a).f159052f;
                        boolean z = false;
                        if (list == null || !list.isEmpty()) {
                            for (q121 q121Var : list) {
                                if (wj50.m88271j(q121Var.f184163a, "set-transition") && q121Var.f184164b == 1) {
                                    z = true;
                                }
                            }
                        }
                        Boolean boolValueOf5 = Boolean.valueOf(z);
                        if (z) {
                            bool = boolValueOf5;
                        }
                    }
                    if (bool != null) {
                        h221Var.f86856b = 1;
                        Object objEmit12 = this.f207631b.emit(bool, h221Var);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof s921) {
                    s921Var = (s921) fbkVar;
                    int i26 = s921Var.f206828b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        s921Var.f206828b = i26 - Integer.MIN_VALUE;
                    } else {
                        s921Var = new s921(this, fbkVar);
                    }
                } else {
                    s921Var = new s921(this, fbkVar);
                }
                Object obj14 = s921Var.f206827a;
                int i27 = s921Var.f206828b;
                if (i27 == 0) {
                    bga.m29073P(obj14);
                    xul0 xul0VarPlaybackId = ((PlayerState) obj).playbackId();
                    s921Var.f206828b = 1;
                    Object objEmit13 = this.f207631b.emit(xul0VarPlaybackId, s921Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof x921) {
                    x921Var = (x921) fbkVar;
                    int i28 = x921Var.f259262b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        x921Var.f259262b = i28 - Integer.MIN_VALUE;
                    } else {
                        x921Var = new x921(this, fbkVar);
                    }
                } else {
                    x921Var = new x921(this, fbkVar);
                }
                Object obj15 = x921Var.f259261a;
                int i29 = x921Var.f259262b;
                if (i29 == 0) {
                    bga.m29073P(obj15);
                    if (((PlayerState) obj).playbackId().mo49279c()) {
                        x921Var.f259262b = 1;
                        Object objEmit14 = this.f207631b.emit(obj, x921Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof z921) {
                    z921Var = (z921) fbkVar;
                    int i30 = z921Var.f280650b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        z921Var.f280650b = i30 - Integer.MIN_VALUE;
                    } else {
                        z921Var = new z921(this, fbkVar);
                    }
                } else {
                    z921Var = new z921(this, fbkVar);
                }
                Object obj16 = z921Var.f280649a;
                int i31 = z921Var.f280650b;
                if (i31 == 0) {
                    bga.m29073P(obj16);
                    Object objMo49283h = ((PlayerState) obj).playbackId().mo49283h();
                    z921Var.f280650b = 1;
                    Object objEmit15 = this.f207631b.emit(objMo49283h, z921Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof ba21) {
                    ba21Var = (ba21) fbkVar;
                    int i32 = ba21Var.f25074b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ba21Var.f25074b = i32 - Integer.MIN_VALUE;
                    } else {
                        ba21Var = new ba21(this, fbkVar);
                    }
                } else {
                    ba21Var = new ba21(this, fbkVar);
                }
                Object obj17 = ba21Var.f25073a;
                int i33 = ba21Var.f25074b;
                if (i33 == 0) {
                    bga.m29073P(obj17);
                    if (wj50.m88271j((wb50) obj, ub50.f228632a)) {
                        ba21Var.f25074b = 1;
                        Object objEmit16 = this.f207631b.emit(obj, ba21Var);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ca21) {
                    ca21Var = (ca21) fbkVar;
                    int i34 = ca21Var.f35708b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ca21Var.f35708b = i34 - Integer.MIN_VALUE;
                    } else {
                        ca21Var = new ca21(this, fbkVar);
                    }
                } else {
                    ca21Var = new ca21(this, fbkVar);
                }
                Object obj18 = ca21Var.f35707a;
                int i35 = ca21Var.f35708b;
                if (i35 == 0) {
                    bga.m29073P(obj18);
                    wb50 wb50Var = (wb50) obj;
                    if (wj50.m88271j(wb50Var, tb50.f218758a) || wj50.m88271j(wb50Var, sb50.f207357a)) {
                        ca21Var.f35708b = 1;
                        Object objEmit17 = this.f207631b.emit(obj, ca21Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ea21) {
                    ea21Var = (ea21) fbkVar;
                    int i36 = ea21Var.f57572b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ea21Var.f57572b = i36 - Integer.MIN_VALUE;
                    } else {
                        ea21Var = new ea21(this, fbkVar);
                    }
                } else {
                    ea21Var = new ea21(this, fbkVar);
                }
                Object obj19 = ea21Var.f57571a;
                int i37 = ea21Var.f57572b;
                if (i37 == 0) {
                    bga.m29073P(obj19);
                    if (((xul0) obj).mo49279c()) {
                        ea21Var.f57572b = 1;
                        Object objEmit18 = this.f207631b.emit(obj, ea21Var);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof fa21) {
                    fa21Var = (fa21) fbkVar;
                    int i38 = fa21Var.f67418b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        fa21Var.f67418b = i38 - Integer.MIN_VALUE;
                    } else {
                        fa21Var = new fa21(this, fbkVar);
                    }
                } else {
                    fa21Var = new fa21(this, fbkVar);
                }
                Object obj20 = fa21Var.f67417a;
                int i39 = fa21Var.f67418b;
                if (i39 == 0) {
                    bga.m29073P(obj20);
                    if (e72.m37979M((ContextTrack) ((xul0) obj).mo49278b())) {
                        fa21Var.f67418b = 1;
                        Object objEmit19 = this.f207631b.emit(obj, fa21Var);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit19 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof ga21) {
                    ga21Var = (ga21) fbkVar;
                    int i40 = ga21Var.f77958b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        ga21Var.f77958b = i40 - Integer.MIN_VALUE;
                    } else {
                        ga21Var = new ga21(this, fbkVar);
                    }
                } else {
                    ga21Var = new ga21(this, fbkVar);
                }
                Object obj21 = ga21Var.f77957a;
                int i41 = ga21Var.f77958b;
                if (i41 == 0) {
                    bga.m29073P(obj21);
                    xul0 xul0VarTrack = ((PlayerState) obj).track();
                    ga21Var.f77958b = 1;
                    Object objEmit20 = this.f207631b.emit(xul0VarTrack, ga21Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof ha21) {
                    ha21Var = (ha21) fbkVar;
                    int i42 = ha21Var.f89101b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        ha21Var.f89101b = i42 - Integer.MIN_VALUE;
                    } else {
                        ha21Var = new ha21(this, fbkVar);
                    }
                } else {
                    ha21Var = new ha21(this, fbkVar);
                }
                Object obj22 = ha21Var.f89100a;
                int i43 = ha21Var.f89101b;
                if (i43 == 0) {
                    bga.m29073P(obj22);
                    ha21Var.f89101b = 1;
                    Object objEmit21 = this.f207631b.emit(sb50.f207357a, ha21Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof qg21) {
                    qg21Var = (qg21) fbkVar;
                    int i44 = qg21Var.f188352b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        qg21Var.f188352b = i44 - Integer.MIN_VALUE;
                    } else {
                        qg21Var = new qg21(this, fbkVar);
                    }
                } else {
                    qg21Var = new qg21(this, fbkVar);
                }
                Object obj23 = qg21Var.f188351a;
                int i45 = qg21Var.f188352b;
                if (i45 == 0) {
                    bga.m29073P(obj23);
                    kv41 kv41Var = (kv41) obj;
                    if (kv41Var instanceof gqu0) {
                        throw ((gqu0) kv41Var).f83533a;
                    }
                    if (kv41Var instanceof m7z) {
                        throw ((m7z) kv41Var).f140876a;
                    }
                    if (!(kv41Var instanceof zco)) {
                        if (kv41Var instanceof vy91) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj24 = ((zco) kv41Var).f281552a;
                    qg21Var.f188352b = 1;
                    Object objEmit22 = this.f207631b.emit(obj24, qg21Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof gn21) {
                    gn21Var = (gn21) fbkVar;
                    int i46 = gn21Var.f81534b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        gn21Var.f81534b = i46 - Integer.MIN_VALUE;
                    } else {
                        gn21Var = new gn21(this, fbkVar);
                    }
                } else {
                    gn21Var = new gn21(this, fbkVar);
                }
                Object obj25 = gn21Var.f81533a;
                int i47 = gn21Var.f81534b;
                if (i47 == 0) {
                    bga.m29073P(obj25);
                    fgk0 fgk0Var = (fgk0) obj;
                    wj50.m88279p(fgk0Var);
                    Boolean boolValueOf6 = Boolean.valueOf(fgk0Var.f69366b.contains(egk0.f59355b));
                    gn21Var.f81534b = 1;
                    Object objEmit23 = this.f207631b.emit(boolValueOf6, gn21Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof hn21) {
                    hn21Var = (hn21) fbkVar;
                    int i48 = hn21Var.f93159b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hn21Var.f93159b = i48 - Integer.MIN_VALUE;
                    } else {
                        hn21Var = new hn21(this, fbkVar);
                    }
                } else {
                    hn21Var = new hn21(this, fbkVar);
                }
                Object obj26 = hn21Var.f93158a;
                int i49 = hn21Var.f93159b;
                if (i49 == 0) {
                    bga.m29073P(obj26);
                    if (((PlayerState) obj).track().mo49279c()) {
                        hn21Var.f93159b = 1;
                        Object objEmit24 = this.f207631b.emit(obj, hn21Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof jn21) {
                    jn21Var = (jn21) fbkVar;
                    int i50 = jn21Var.f113993b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        jn21Var.f113993b = i50 - Integer.MIN_VALUE;
                    } else {
                        jn21Var = new jn21(this, fbkVar);
                    }
                } else {
                    jn21Var = new jn21(this, fbkVar);
                }
                Object obj27 = jn21Var.f113992a;
                int i51 = jn21Var.f113993b;
                if (i51 == 0) {
                    bga.m29073P(obj27);
                    Object objMo49278b = ((PlayerState) obj).track().mo49278b();
                    jn21Var.f113993b = 1;
                    Object objEmit25 = this.f207631b.emit(objMo49278b, jn21Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof rn21) {
                    rn21Var = (rn21) fbkVar;
                    int i52 = rn21Var.f200705b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        rn21Var.f200705b = i52 - Integer.MIN_VALUE;
                    } else {
                        rn21Var = new rn21(this, fbkVar);
                    }
                } else {
                    rn21Var = new rn21(this, fbkVar);
                }
                Object obj28 = rn21Var.f200704a;
                int i53 = rn21Var.f200705b;
                if (i53 == 0) {
                    bga.m29073P(obj28);
                    ewi ewiVar = (ewi) obj;
                    if (ewiVar instanceof vvi) {
                        it91VarM83770i = uqe1.m83769h(((vvi) ewiVar).f245236a);
                    } else {
                        if (!(ewiVar instanceof zvi)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        it91VarM83770i = uqe1.m83770i(((zvi) ewiVar).f286713b);
                    }
                    rn21Var.f200705b = 1;
                    Object objEmit26 = this.f207631b.emit(it91VarM83770i, rn21Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof bo21) {
                    bo21Var = (bo21) fbkVar;
                    int i54 = bo21Var.f29001b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        bo21Var.f29001b = i54 - Integer.MIN_VALUE;
                    } else {
                        bo21Var = new bo21(this, fbkVar);
                    }
                } else {
                    bo21Var = new bo21(this, fbkVar);
                }
                Object obj29 = bo21Var.f29000a;
                int i55 = bo21Var.f29001b;
                if (i55 == 0) {
                    bga.m29073P(obj29);
                    wn21 wn21Var = new wn21((it91) obj);
                    bo21Var.f29001b = 1;
                    Object objEmit27 = this.f207631b.emit(wn21Var, bo21Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof do21) {
                    do21Var = (do21) fbkVar;
                    int i56 = do21Var.f50926b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        do21Var.f50926b = i56 - Integer.MIN_VALUE;
                    } else {
                        do21Var = new do21(this, fbkVar);
                    }
                } else {
                    do21Var = new do21(this, fbkVar);
                }
                Object obj30 = do21Var.f50925a;
                int i57 = do21Var.f50926b;
                if (i57 == 0) {
                    bga.m29073P(obj30);
                    String str3 = (String) ((ContextTrack) obj).metadata().get(ContextTrack.Metadata.KEY_SKIPPABLE_AD_DELAY);
                    Long lM29808s0 = str3 != null ? bm51.m29808s0(10, str3) : null;
                    Long l = lM29808s0 != null ? new Long(lM29808s0.longValue() * ((long) 1000)) : null;
                    do21Var.f50926b = 1;
                    Object objEmit28 = this.f207631b.emit(l, do21Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof eo21) {
                    eo21Var = (eo21) fbkVar;
                    int i58 = eo21Var.f61278b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        eo21Var.f61278b = i58 - Integer.MIN_VALUE;
                    } else {
                        eo21Var = new eo21(this, fbkVar);
                    }
                } else {
                    eo21Var = new eo21(this, fbkVar);
                }
                Object obj31 = eo21Var.f61277a;
                int i59 = eo21Var.f61278b;
                if (i59 == 0) {
                    bga.m29073P(obj31);
                    Object objMo49283h2 = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h2 != null) {
                        eo21Var.f61278b = 1;
                        Object objEmit29 = this.f207631b.emit(objMo49283h2, eo21Var);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit29 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof fo21) {
                    fo21Var = (fo21) fbkVar;
                    int i60 = fo21Var.f71406b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        fo21Var.f71406b = i60 - Integer.MIN_VALUE;
                    } else {
                        fo21Var = new fo21(this, fbkVar);
                    }
                } else {
                    fo21Var = new fo21(this, fbkVar);
                }
                Object obj32 = fo21Var.f71405a;
                int i61 = fo21Var.f71406b;
                if (i61 == 0) {
                    bga.m29073P(obj32);
                    Boolean boolValueOf7 = Boolean.valueOf(((Long) obj) != null);
                    fo21Var.f71406b = 1;
                    Object objEmit30 = this.f207631b.emit(boolValueOf7, fo21Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ sc11(niz nizVar, lg01 lg01Var, int i) {
        this.f207630a = i;
        this.f207631b = nizVar;
    }
}
