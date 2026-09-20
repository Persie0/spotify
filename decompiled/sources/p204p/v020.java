package p204p;

import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import com.spotify.connectivity.hosts.esperanto.proto.EsHosts$Hosts;
import com.spotify.jam.internal.socialconnect.models.JoinRequestStatusUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class v020 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f235890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f235891b;

    public /* synthetic */ v020(niz nizVar, int i) {
        this.f235890a = i;
        this.f235891b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x024f  */
    /* JADX WARN: Code duplicated, block: B:171:0x028c  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:207:0x0314  */
    /* JADX WARN: Code duplicated, block: B:224:0x035f  */
    /* JADX WARN: Code duplicated, block: B:241:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:284:0x044d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:307:0x049f  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:349:0x053a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0584  */
    /* JADX WARN: Code duplicated, block: B:390:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:407:0x0621  */
    /* JADX WARN: Code duplicated, block: B:428:0x0670  */
    /* JADX WARN: Code duplicated, block: B:445:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:462:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:482:0x0741  */
    /* JADX WARN: Code duplicated, block: B:499:0x0789  */
    /* JADX WARN: Code duplicated, block: B:522:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:574:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:595:0x093c  */
    /* JADX WARN: Code duplicated, block: B:612:0x0987  */
    /* JADX WARN: Code duplicated, block: B:631:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:648:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        u020 u020Var;
        Object t3a0Var;
        Object obj2;
        l420 l420Var;
        q420 q420Var;
        d720 d720Var;
        j720 j720Var;
        x720 x720Var;
        i820 i820Var;
        d820 d820Var;
        s730 s730Var;
        ff20 ff20Var;
        li20 li20Var;
        ik20 ik20Var;
        rk20 rk20Var;
        vk20 vk20Var;
        pl20 pl20Var;
        ul20 ul20Var;
        vl20 vl20Var;
        mm20 mm20Var;
        vm20 vm20Var;
        pp20 pp20Var;
        rp20 rp20Var;
        yw20 yw20Var;
        m930 m930Var;
        n930 n930Var;
        na30 na30Var;
        Object obj3;
        va30 va30Var;
        Object sa30Var;
        za30 za30Var;
        lb30 lb30Var;
        s6x0 s6x0Var;
        dc30 dc30Var;
        qc30 qc30Var;
        Object ny31Var;
        Object obj4;
        rc30 rc30Var;
        tc30 tc30Var;
        switch (this.f235890a) {
            case 0:
                if (fbkVar instanceof u020) {
                    u020Var = (u020) fbkVar;
                    int i = u020Var.f225352b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u020Var.f225352b = i - Integer.MIN_VALUE;
                    } else {
                        u020Var = new u020(this, fbkVar);
                    }
                } else {
                    u020Var = new u020(this, fbkVar);
                }
                Object obj5 = u020Var.f225351a;
                int i2 = u020Var.f225352b;
                if (i2 == 0) {
                    bga.m29073P(obj5);
                    e120 e120Var = (e120) obj;
                    if (e120Var instanceof d120) {
                        obj2 = o3a0.f161331a;
                    } else {
                        if (e120Var instanceof c120) {
                            t3a0Var = new m3a0(opo.m67574x(((c120) e120Var).f32953a));
                        } else {
                            if (!(e120Var instanceof b120)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            t3a0Var = new t3a0(((b120) e120Var).f22185a);
                        }
                        obj2 = t3a0Var;
                    }
                    u020Var.f225352b = 1;
                    Object objEmit = this.f235891b.emit(obj2, u020Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof l420) {
                    l420Var = (l420) fbkVar;
                    int i3 = l420Var.f129481b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        l420Var.f129481b = i3 - Integer.MIN_VALUE;
                    } else {
                        l420Var = new l420(this, fbkVar);
                    }
                } else {
                    l420Var = new l420(this, fbkVar);
                }
                Object obj6 = l420Var.f129480a;
                int i4 = l420Var.f129481b;
                if (i4 == 0) {
                    bga.m29073P(obj6);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    l420Var.f129481b = 1;
                    Object objEmit2 = this.f235891b.emit(objMo49283h, l420Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof q420) {
                    q420Var = (q420) fbkVar;
                    int i5 = q420Var.f185029b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q420Var.f185029b = i5 - Integer.MIN_VALUE;
                    } else {
                        q420Var = new q420(this, fbkVar);
                    }
                } else {
                    q420Var = new q420(this, fbkVar);
                }
                Object obj7 = q420Var.f185028a;
                int i6 = q420Var.f185029b;
                if (i6 == 0) {
                    bga.m29073P(obj7);
                    Double d = (Double) obj;
                    if (d != null) {
                        q420Var.f185029b = 1;
                        Object objEmit3 = this.f235891b.emit(d, q420Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof d720) {
                    d720Var = (d720) fbkVar;
                    int i7 = d720Var.f45955b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        d720Var.f45955b = i7 - Integer.MIN_VALUE;
                    } else {
                        d720Var = new d720(this, fbkVar);
                    }
                } else {
                    d720Var = new d720(this, fbkVar);
                }
                Object obj8 = d720Var.f45954a;
                int i8 = d720Var.f45955b;
                if (i8 == 0) {
                    bga.m29073P(obj8);
                    r620 r620Var = new r620(((Boolean) obj).booleanValue());
                    d720Var.f45955b = 1;
                    Object objEmit4 = this.f235891b.emit(r620Var, d720Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof j720) {
                    j720Var = (j720) fbkVar;
                    int i9 = j720Var.f109467b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        j720Var.f109467b = i9 - Integer.MIN_VALUE;
                    } else {
                        j720Var = new j720(this, fbkVar);
                    }
                } else {
                    j720Var = new j720(this, fbkVar);
                }
                Object obj9 = j720Var.f109466a;
                int i10 = j720Var.f109467b;
                if (i10 == 0) {
                    bga.m29073P(obj9);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    j720Var.f109467b = 1;
                    Object objEmit5 = this.f235891b.emit(boolValueOf, j720Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof x720) {
                    x720Var = (x720) fbkVar;
                    int i11 = x720Var.f258793b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        x720Var.f258793b = i11 - Integer.MIN_VALUE;
                    } else {
                        x720Var = new x720(this, fbkVar);
                    }
                } else {
                    x720Var = new x720(this, fbkVar);
                }
                Object obj10 = x720Var.f258792a;
                int i12 = x720Var.f258793b;
                if (i12 == 0) {
                    bga.m29073P(obj10);
                    by50 by50Var = (by50) obj;
                    if (by50Var != null) {
                        zx50 zx50Var = by50Var.f32082h;
                        ArrayList arrayList = by50Var.f32077c;
                        tx50 tx50VarM45750l = gue.m45750l(arrayList);
                        tx50 tx50Var = zx50Var.f287209b;
                        String str = tx50VarM45750l.f224566b;
                        String str2 = tx50Var.f224568d;
                        uku ukuVar = new uku(8, 0L, str2 == null ? "" : str2, tx50Var.f224567c, tx50Var.f224566b);
                        ArrayList<tx50> arrayList2 = new ArrayList();
                        for (Object obj11 : arrayList) {
                            if (!wj50.m88271j(((tx50) obj11).f224565a, tx50Var.f224565a)) {
                                arrayList2.add(obj11);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                        for (tx50 tx50Var2 : arrayList2) {
                            String str3 = tx50Var2.f224568d;
                            arrayList3.add(new uku(8, 0L, str3 == null ? "" : str3, tx50Var2.f224567c, tx50Var2.f224566b));
                        }
                        boolean z = zx50Var.f287215h;
                        boolean z2 = tx50Var.f224570f;
                        boolean z3 = tx50Var.f224569e;
                        int i13 = 0;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((tx50) it.next()).f224570f && (i13 = i13 + 1) < 0) {
                                    h6f.m46721R();
                                    throw null;
                                }
                            }
                        }
                        i820Var = new i820(true, str, arrayList3, ukuVar, z, z2, z3, i13, zx50Var.f287216i);
                    } else {
                        i820Var = new i820(false, null, lau.f131415a, null, false, false, false, 0, false);
                    }
                    x720Var.f258793b = 1;
                    Object objEmit6 = this.f235891b.emit(i820Var, x720Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof d820) {
                    d820Var = (d820) fbkVar;
                    int i14 = d820Var.f46333b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        d820Var.f46333b = i14 - Integer.MIN_VALUE;
                    } else {
                        d820Var = new d820(this, fbkVar);
                    }
                } else {
                    d820Var = new d820(this, fbkVar);
                }
                Object obj12 = d820Var.f46332a;
                int i15 = d820Var.f46333b;
                if (i15 == 0) {
                    bga.m29073P(obj12);
                    t730 t730Var = (t730) obj;
                    rak0 rak0Var = (t730Var == null || (s730Var = t730Var.f217667a) == null) ? null : new rak0(s730Var);
                    d820Var.f46333b = 1;
                    Object objEmit7 = this.f235891b.emit(rak0Var, d820Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ff20) {
                    ff20Var = (ff20) fbkVar;
                    int i16 = ff20Var.f68886b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ff20Var.f68886b = i16 - Integer.MIN_VALUE;
                    } else {
                        ff20Var = new ff20(this, fbkVar);
                    }
                } else {
                    ff20Var = new ff20(this, fbkVar);
                }
                Object obj13 = ff20Var.f68885a;
                int i17 = ff20Var.f68886b;
                if (i17 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf2 = Boolean.valueOf(((gi20) obj).f80016c);
                    ff20Var.f68886b = 1;
                    Object objEmit8 = this.f235891b.emit(boolValueOf2, ff20Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof li20) {
                    li20Var = (li20) fbkVar;
                    int i18 = li20Var.f133696b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        li20Var.f133696b = i18 - Integer.MIN_VALUE;
                    } else {
                        li20Var = new li20(this, fbkVar);
                    }
                } else {
                    li20Var = new li20(this, fbkVar);
                }
                Object obj14 = li20Var.f133695a;
                int i19 = li20Var.f133696b;
                if (i19 == 0) {
                    bga.m29073P(obj14);
                    gi20 gi20Var = (gi20) obj;
                    if (gi20Var == null) {
                        gi20Var = gi20.f80013h;
                    }
                    li20Var.f133696b = 1;
                    Object objEmit9 = this.f235891b.emit(gi20Var, li20Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof ik20) {
                    ik20Var = (ik20) fbkVar;
                    int i20 = ik20Var.f102951b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ik20Var.f102951b = i20 - Integer.MIN_VALUE;
                    } else {
                        ik20Var = new ik20(this, fbkVar);
                    }
                } else {
                    ik20Var = new ik20(this, fbkVar);
                }
                Object obj15 = ik20Var.f102950a;
                int i21 = ik20Var.f102951b;
                if (i21 == 0) {
                    bga.m29073P(obj15);
                    hk20 hk20Var = new hk20((er40) obj);
                    ik20Var.f102951b = 1;
                    Object objEmit10 = this.f235891b.emit(hk20Var, ik20Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof rk20) {
                    rk20Var = (rk20) fbkVar;
                    int i22 = rk20Var.f199954b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        rk20Var.f199954b = i22 - Integer.MIN_VALUE;
                    } else {
                        rk20Var = new rk20(this, fbkVar);
                    }
                } else {
                    rk20Var = new rk20(this, fbkVar);
                }
                Object obj16 = rk20Var.f199953a;
                int i23 = rk20Var.f199954b;
                if (i23 == 0) {
                    bga.m29073P(obj16);
                    nh20 nh20Var = ((gi20) obj).f80018e;
                    rk20Var.f199954b = 1;
                    Object objEmit11 = this.f235891b.emit(nh20Var, rk20Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof vk20) {
                    vk20Var = (vk20) fbkVar;
                    int i24 = vk20Var.f242114b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        vk20Var.f242114b = i24 - Integer.MIN_VALUE;
                    } else {
                        vk20Var = new vk20(this, fbkVar);
                    }
                } else {
                    vk20Var = new vk20(this, fbkVar);
                }
                Object obj17 = vk20Var.f242113a;
                int i25 = vk20Var.f242114b;
                if (i25 == 0) {
                    bga.m29073P(obj17);
                    x76 x76Var = ((Boolean) obj).booleanValue() ? new x76() : null;
                    vk20Var.f242114b = 1;
                    Object objEmit12 = this.f235891b.emit(x76Var, vk20Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof pl20) {
                    pl20Var = (pl20) fbkVar;
                    int i26 = pl20Var.f178615b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        pl20Var.f178615b = i26 - Integer.MIN_VALUE;
                    } else {
                        pl20Var = new pl20(this, fbkVar);
                    }
                } else {
                    pl20Var = new pl20(this, fbkVar);
                }
                Object obj18 = pl20Var.f178614a;
                int i27 = pl20Var.f178615b;
                if (i27 == 0) {
                    bga.m29073P(obj18);
                    Integer num = new Integer(((el20) obj).f60571b);
                    pl20Var.f178615b = 1;
                    Object objEmit13 = this.f235891b.emit(num, pl20Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof ul20) {
                    ul20Var = (ul20) fbkVar;
                    int i28 = ul20Var.f231416b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ul20Var.f231416b = i28 - Integer.MIN_VALUE;
                    } else {
                        ul20Var = new ul20(this, fbkVar);
                    }
                } else {
                    ul20Var = new ul20(this, fbkVar);
                }
                Object obj19 = ul20Var.f231415a;
                int i29 = ul20Var.f231416b;
                if (i29 == 0) {
                    bga.m29073P(obj19);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Boolean bool = ohoVar != null ? (Boolean) ohoVar.f165512a : null;
                    if (bool != null) {
                        ul20Var.f231416b = 1;
                        Object objEmit14 = this.f235891b.emit(bool, ul20Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof vl20) {
                    vl20Var = (vl20) fbkVar;
                    int i30 = vl20Var.f242368b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        vl20Var.f242368b = i30 - Integer.MIN_VALUE;
                    } else {
                        vl20Var = new vl20(this, fbkVar);
                    }
                } else {
                    vl20Var = new vl20(this, fbkVar);
                }
                Object obj20 = vl20Var.f242367a;
                int i31 = vl20Var.f242368b;
                if (i31 == 0) {
                    bga.m29073P(obj20);
                    Boolean boolValueOf3 = Boolean.valueOf(((ty80) obj).m81955a());
                    vl20Var.f242368b = 1;
                    Object objEmit15 = this.f235891b.emit(boolValueOf3, vl20Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof mm20) {
                    mm20Var = (mm20) fbkVar;
                    int i32 = mm20Var.f145032b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        mm20Var.f145032b = i32 - Integer.MIN_VALUE;
                    } else {
                        mm20Var = new mm20(this, fbkVar);
                    }
                } else {
                    mm20Var = new mm20(this, fbkVar);
                }
                Object obj21 = mm20Var.f145031a;
                int i33 = mm20Var.f145032b;
                if (i33 == 0) {
                    bga.m29073P(obj21);
                    Boolean boolValueOf4 = Boolean.valueOf(((eyp0) obj) == null);
                    mm20Var.f145032b = 1;
                    Object objEmit16 = this.f235891b.emit(boolValueOf4, mm20Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof vm20) {
                    vm20Var = (vm20) fbkVar;
                    int i34 = vm20Var.f242683b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        vm20Var.f242683b = i34 - Integer.MIN_VALUE;
                    } else {
                        vm20Var = new vm20(this, fbkVar);
                    }
                } else {
                    vm20Var = new vm20(this, fbkVar);
                }
                Object obj22 = vm20Var.f242682a;
                int i35 = vm20Var.f242683b;
                if (i35 == 0) {
                    bga.m29073P(obj22);
                    Boolean bool2 = ((gi20) obj).f80020g;
                    Boolean boolValueOf5 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    vm20Var.f242683b = 1;
                    Object objEmit17 = this.f235891b.emit(boolValueOf5, vm20Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof pp20) {
                    pp20Var = (pp20) fbkVar;
                    int i36 = pp20Var.f179872b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        pp20Var.f179872b = i36 - Integer.MIN_VALUE;
                    } else {
                        pp20Var = new pp20(this, fbkVar);
                    }
                } else {
                    pp20Var = new pp20(this, fbkVar);
                }
                Object obj23 = pp20Var.f179871a;
                int i37 = pp20Var.f179872b;
                if (i37 == 0) {
                    bga.m29073P(obj23);
                    InterfaceC2415th accessory = ((AccessoryStateManager$Event) obj).getAccessory();
                    if ((accessory != null ? ((C1742ci) accessory).f38162e : 0) == 4) {
                        pp20Var.f179872b = 1;
                        Object objEmit18 = this.f235891b.emit(obj, pp20Var);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof rp20) {
                    rp20Var = (rp20) fbkVar;
                    int i38 = rp20Var.f201403b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        rp20Var.f201403b = i38 - Integer.MIN_VALUE;
                    } else {
                        rp20Var = new rp20(this, fbkVar);
                    }
                } else {
                    rp20Var = new rp20(this, fbkVar);
                }
                Object obj24 = rp20Var.f201402a;
                int i39 = rp20Var.f201403b;
                if (i39 == 0) {
                    bga.m29073P(obj24);
                    AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
                    boolean z4 = accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected;
                    yuk yukVar19 = yuk.f276404a;
                    niz nizVar = this.f235891b;
                    if (z4) {
                        rp20Var.f201403b = 1;
                        if (nizVar.emit(op20.f167738a, rp20Var) == yukVar19) {
                            return yukVar19;
                        }
                    } else if (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Disconnected) {
                        rp20Var.f201403b = 2;
                        if (nizVar.emit(op20.f167739b, rp20Var) == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i39 != 1 && i39 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof yw20) {
                    yw20Var = (yw20) fbkVar;
                    int i40 = yw20Var.f276833b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        yw20Var.f276833b = i40 - Integer.MIN_VALUE;
                    } else {
                        yw20Var = new yw20(this, fbkVar);
                    }
                } else {
                    yw20Var = new yw20(this, fbkVar);
                }
                Object obj25 = yw20Var.f276832a;
                int i41 = yw20Var.f276833b;
                if (i41 == 0) {
                    bga.m29073P(obj25);
                    Boolean boolValueOf6 = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
                    yw20Var.f276833b = 1;
                    Object objEmit19 = this.f235891b.emit(boolValueOf6, yw20Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit19 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof m930) {
                    m930Var = (m930) fbkVar;
                    int i42 = m930Var.f141204b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        m930Var.f141204b = i42 - Integer.MIN_VALUE;
                    } else {
                        m930Var = new m930(this, fbkVar);
                    }
                } else {
                    m930Var = new m930(this, fbkVar);
                }
                Object obj26 = m930Var.f141203a;
                int i43 = m930Var.f141204b;
                if (i43 == 0) {
                    bga.m29073P(obj26);
                    b930 b930Var = new b930((ya60) obj);
                    m930Var.f141204b = 1;
                    Object objEmit20 = this.f235891b.emit(b930Var, m930Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit20 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof n930) {
                    n930Var = (n930) fbkVar;
                    int i44 = n930Var.f151694b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        n930Var.f151694b = i44 - Integer.MIN_VALUE;
                    } else {
                        n930Var = new n930(this, fbkVar);
                    }
                } else {
                    n930Var = new n930(this, fbkVar);
                }
                Object obj27 = n930Var.f151693a;
                int i45 = n930Var.f151694b;
                if (i45 == 0) {
                    bga.m29073P(obj27);
                    JoinRequestStatusUpdate joinRequestStatusUpdate = (JoinRequestStatusUpdate) obj;
                    c930 c930Var = new c930(joinRequestStatusUpdate.status, joinRequestStatusUpdate.requestQueue);
                    n930Var.f151694b = 1;
                    Object objEmit21 = this.f235891b.emit(c930Var, n930Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit21 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof na30) {
                    na30Var = (na30) fbkVar;
                    int i46 = na30Var.f151926b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        na30Var.f151926b = i46 - Integer.MIN_VALUE;
                    } else {
                        na30Var = new na30(this, fbkVar);
                    }
                } else {
                    na30Var = new na30(this, fbkVar);
                }
                Object obj28 = na30Var.f151925a;
                int i47 = na30Var.f151926b;
                if (i47 == 0) {
                    bga.m29073P(obj28);
                    t730 t730Var2 = (t730) obj;
                    if (t730Var2 == null || (obj3 = t730Var2.f217668b) == null) {
                        obj3 = n730.f151064a;
                    }
                    na30Var.f151926b = 1;
                    Object objEmit22 = this.f235891b.emit(obj3, na30Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit22 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof va30) {
                    va30Var = (va30) fbkVar;
                    int i48 = va30Var.f239110b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        va30Var.f239110b = i48 - Integer.MIN_VALUE;
                    } else {
                        va30Var = new va30(this, fbkVar);
                    }
                } else {
                    va30Var = new va30(this, fbkVar);
                }
                Object obj29 = va30Var.f239109a;
                int i49 = va30Var.f239110b;
                if (i49 == 0) {
                    bga.m29073P(obj29);
                    t730 t730Var3 = (t730) obj;
                    if (t730Var3 == null) {
                        sa30Var = ra30.f197178a;
                    } else {
                        r730 r730Var = t730Var3.f217668b;
                        if (wj50.m88271j(r730Var, n730.f151064a)) {
                            sa30Var = ra30.f197178a;
                        } else {
                            if (!(r730Var instanceof q730)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q730 q730Var = (q730) r730Var;
                            if (q730Var.f186022b.f174553a.isEmpty()) {
                                sa30Var = ra30.f197178a;
                            } else {
                                qa30 qa30VarM79836q = t0j.m79836q(q730Var);
                                sa30Var = new sa30(qa30VarM79836q.f186731a, qa30VarM79836q.f186732b, qa30VarM79836q.f186733c, qa30VarM79836q.f186734d);
                            }
                        }
                    }
                    va30Var.f239110b = 1;
                    Object objEmit23 = this.f235891b.emit(sa30Var, va30Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit23 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof za30) {
                    za30Var = (za30) fbkVar;
                    int i50 = za30Var.f280976b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        za30Var.f280976b = i50 - Integer.MIN_VALUE;
                    } else {
                        za30Var = new za30(this, fbkVar);
                    }
                } else {
                    za30Var = new za30(this, fbkVar);
                }
                Object obj30 = za30Var.f280975a;
                int i51 = za30Var.f280976b;
                if (i51 == 0) {
                    bga.m29073P(obj30);
                    t730 t730Var4 = (t730) obj;
                    r730 r730Var2 = t730Var4 != null ? t730Var4.f217668b : null;
                    q730 q730Var2 = r730Var2 instanceof q730 ? (q730) r730Var2 : null;
                    Integer num2 = new Integer(q730Var2 != null ? q730Var2.f186022b.f174553a.size() : 0);
                    za30Var.f280976b = 1;
                    Object objEmit24 = this.f235891b.emit(num2, za30Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit24 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof lb30) {
                    lb30Var = (lb30) fbkVar;
                    int i52 = lb30Var.f131540b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        lb30Var.f131540b = i52 - Integer.MIN_VALUE;
                    } else {
                        lb30Var = new lb30(this, fbkVar);
                    }
                } else {
                    lb30Var = new lb30(this, fbkVar);
                }
                Object obj31 = lb30Var.f131539a;
                int i53 = lb30Var.f131540b;
                if (i53 == 0) {
                    bga.m29073P(obj31);
                    qho qhoVar2 = (qho) obj;
                    if (qhoVar2 instanceof nho) {
                        s6x0Var = new s6x0(new c6x0(new Exception(((nho) qhoVar2).f154041a.getMessage())));
                    } else if (qhoVar2 instanceof oho) {
                        s6x0Var = new s6x0(((oho) qhoVar2).f165512a);
                    } else {
                        if (!wj50.m88271j(qhoVar2, pho.f177693a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s6x0Var = null;
                    }
                    if (s6x0Var != null) {
                        lb30Var.f131540b = 1;
                        Object objEmit25 = this.f235891b.emit(s6x0Var, lb30Var);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit25 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof dc30) {
                    dc30Var = (dc30) fbkVar;
                    int i54 = dc30Var.f47412b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        dc30Var.f47412b = i54 - Integer.MIN_VALUE;
                    } else {
                        dc30Var = new dc30(this, fbkVar);
                    }
                } else {
                    dc30Var = new dc30(this, fbkVar);
                }
                Object obj32 = dc30Var.f47411a;
                int i55 = dc30Var.f47412b;
                if (i55 == 0) {
                    bga.m29073P(obj32);
                    String strM7517n = ((EsHosts$Hosts) obj).m7517n();
                    dc30Var.f47412b = 1;
                    Object objEmit26 = this.f235891b.emit(strM7517n, dc30Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit26 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof qc30) {
                    qc30Var = (qc30) fbkVar;
                    int i56 = qc30Var.f187246b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        qc30Var.f187246b = i56 - Integer.MIN_VALUE;
                    } else {
                        qc30Var = new qc30(this, fbkVar);
                    }
                } else {
                    qc30Var = new qc30(this, fbkVar);
                }
                Object obj33 = qc30Var.f187245a;
                int i57 = qc30Var.f187246b;
                if (i57 == 0) {
                    bga.m29073P(obj33);
                    ra21 ra21Var = (ra21) obj;
                    if (ra21Var instanceof oa21) {
                        obj4 = null;
                    } else if (ra21Var instanceof na21) {
                        obj4 = ly31.f137949a;
                    } else if (ra21Var instanceof ka21) {
                        obj4 = ky31.f127644a;
                    } else {
                        if (ra21Var instanceof pa21) {
                            ny31Var = new my31(((pa21) ra21Var).f175370a);
                        } else {
                            if (!(ra21Var instanceof qa21)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ny31Var = new ny31(((qa21) ra21Var).f186722a);
                        }
                        obj4 = ny31Var;
                    }
                    if (obj4 != null) {
                        qc30Var.f187246b = 1;
                        Object objEmit27 = this.f235891b.emit(obj4, qc30Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit27 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof rc30) {
                    rc30Var = (rc30) fbkVar;
                    int i58 = rc30Var.f197715b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        rc30Var.f197715b = i58 - Integer.MIN_VALUE;
                    } else {
                        rc30Var = new rc30(this, fbkVar);
                    }
                } else {
                    rc30Var = new rc30(this, fbkVar);
                }
                Object obj34 = rc30Var.f197714a;
                int i59 = rc30Var.f197715b;
                if (i59 == 0) {
                    bga.m29073P(obj34);
                    la21 la21Var = new la21(new IllegalStateException("Bluetooth input route was lost"));
                    rc30Var.f197715b = 1;
                    Object objEmit28 = this.f235891b.emit(la21Var, rc30Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit28 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof tc30) {
                    tc30Var = (tc30) fbkVar;
                    int i60 = tc30Var.f219000b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        tc30Var.f219000b = i60 - Integer.MIN_VALUE;
                    } else {
                        tc30Var = new tc30(this, fbkVar);
                    }
                } else {
                    tc30Var = new tc30(this, fbkVar);
                }
                Object obj35 = tc30Var.f218999a;
                int i61 = tc30Var.f219000b;
                if (i61 == 0) {
                    bga.m29073P(obj35);
                    if (obj instanceof oa21) {
                        tc30Var.f219000b = 1;
                        Object objEmit29 = this.f235891b.emit(obj, tc30Var);
                        yuk yukVar30 = yuk.f276404a;
                        if (objEmit29 == yukVar30) {
                            return yukVar30;
                        }
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                }
                return w2a1.f247311a;
        }
    }
}
