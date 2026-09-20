package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.superconnect.p162v1.WritingStatusNotification;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class gd1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f78700b;

    public /* synthetic */ gd1(niz nizVar, int i) {
        this.f78699a = i;
        this.f78700b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x022a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0271  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:195:0x0300  */
    /* JADX WARN: Code duplicated, block: B:212:0x0347  */
    /* JADX WARN: Code duplicated, block: B:231:0x0390  */
    /* JADX WARN: Code duplicated, block: B:252:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:282:0x0443  */
    /* JADX WARN: Code duplicated, block: B:301:0x048c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:334:0x0508  */
    /* JADX WARN: Code duplicated, block: B:353:0x054c  */
    /* JADX WARN: Code duplicated, block: B:372:0x0595  */
    /* JADX WARN: Code duplicated, block: B:389:0x05df  */
    /* JADX WARN: Code duplicated, block: B:408:0x062c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0674  */
    /* JADX WARN: Code duplicated, block: B:442:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:459:0x070a  */
    /* JADX WARN: Code duplicated, block: B:478:0x0751  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:507:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:524:0x0814  */
    /* JADX WARN: Code duplicated, block: B:548:0x0868  */
    /* JADX WARN: Code duplicated, block: B:572:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:591:0x0900  */
    /* JADX WARN: Code duplicated, block: B:614:0x095b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0174  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        fd1 fd1Var;
        id1 id1Var;
        aj1 aj1Var;
        kj1 kj1Var;
        qj1 qj1Var;
        hm1 hm1Var;
        lm1 lm1Var;
        String str;
        bs1 bs1Var;
        i22 i22Var;
        o22 o22Var;
        q82 q82Var;
        da2 da2Var;
        ea2 ea2Var;
        ha2 ha2Var;
        gd2 gd2Var;
        qf2 qf2Var;
        ni2 ni2Var;
        xj2 xj2Var;
        String str2;
        zm2 zm2Var;
        qn2 qn2Var;
        do2 do2Var;
        so2 so2Var;
        uo2 uo2Var;
        fp2 fp2Var;
        yx2 yx2Var;
        oy2 oy2Var;
        az2 az2Var;
        cz2 cz2Var;
        List list;
        rz2 rz2Var;
        wz2 wz2Var;
        switch (this.f78699a) {
            case 0:
                if (fbkVar instanceof fd1) {
                    fd1Var = (fd1) fbkVar;
                    int i = fd1Var.f68292b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        fd1Var.f68292b = i - Integer.MIN_VALUE;
                    } else {
                        fd1Var = new fd1(this, fbkVar);
                    }
                } else {
                    fd1Var = new fd1(this, fbkVar);
                }
                Object obj2 = fd1Var.f68291a;
                int i2 = fd1Var.f68292b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Boolean boolValueOf = Boolean.valueOf(ohoVar != null ? ((Boolean) ohoVar.f165512a).booleanValue() : false);
                    fd1Var.f68292b = 1;
                    Object objEmit = this.f78700b.emit(boolValueOf, fd1Var);
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
                if (fbkVar instanceof id1) {
                    id1Var = (id1) fbkVar;
                    int i3 = id1Var.f100915b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        id1Var.f100915b = i3 - Integer.MIN_VALUE;
                    } else {
                        id1Var = new id1(this, fbkVar);
                    }
                } else {
                    id1Var = new id1(this, fbkVar);
                }
                Object obj3 = id1Var.f100914a;
                int i4 = id1Var.f100915b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    dd1 dd1Var = (dd1) obj;
                    ty80 ty80Var = dd1Var.f47689a;
                    Boolean boolValueOf2 = Boolean.valueOf((ty80Var.f224879h || dd1Var.f47690b || !ty80Var.f224877f.f271278w.f156638b) ? false : true);
                    id1Var.f100915b = 1;
                    Object objEmit2 = this.f78700b.emit(boolValueOf2, id1Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof aj1) {
                    aj1Var = (aj1) fbkVar;
                    int i5 = aj1Var.f16131b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aj1Var.f16131b = i5 - Integer.MIN_VALUE;
                    } else {
                        aj1Var = new aj1(this, fbkVar);
                    }
                } else {
                    aj1Var = new aj1(this, fbkVar);
                }
                Object obj4 = aj1Var.f16130a;
                int i6 = aj1Var.f16131b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    if (obj instanceof zfd1) {
                        aj1Var.f16131b = 1;
                        Object objEmit3 = this.f78700b.emit(obj, aj1Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof kj1) {
                    kj1Var = (kj1) fbkVar;
                    int i7 = kj1Var.f123194b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kj1Var.f123194b = i7 - Integer.MIN_VALUE;
                    } else {
                        kj1Var = new kj1(this, fbkVar);
                    }
                } else {
                    kj1Var = new kj1(this, fbkVar);
                }
                Object obj5 = kj1Var.f123193a;
                int i8 = kj1Var.f123194b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    uu41 uu41Var = ohoVar2 != null ? (uu41) ohoVar2.f165512a : null;
                    if (uu41Var != null) {
                        kj1Var.f123194b = 1;
                        Object objEmit4 = this.f78700b.emit(uu41Var, kj1Var);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit4 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof qj1) {
                    qj1Var = (qj1) fbkVar;
                    int i9 = qj1Var.f189126b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qj1Var.f189126b = i9 - Integer.MIN_VALUE;
                    } else {
                        qj1Var = new qj1(this, fbkVar);
                    }
                } else {
                    qj1Var = new qj1(this, fbkVar);
                }
                Object obj6 = qj1Var.f189125a;
                int i10 = qj1Var.f189126b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    qho qhoVar3 = (qho) obj;
                    oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    pqm0 pqm0Var = ohoVar3 != null ? (pqm0) ohoVar3.f165512a : null;
                    if (pqm0Var != null) {
                        qj1Var.f189126b = 1;
                        Object objEmit5 = this.f78700b.emit(pqm0Var, qj1Var);
                        yuk yukVar5 = yuk.f276404a;
                        if (objEmit5 == yukVar5) {
                            return yukVar5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof hm1) {
                    hm1Var = (hm1) fbkVar;
                    int i11 = hm1Var.f92793b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        hm1Var.f92793b = i11 - Integer.MIN_VALUE;
                    } else {
                        hm1Var = new hm1(this, fbkVar);
                    }
                } else {
                    hm1Var = new hm1(this, fbkVar);
                }
                Object obj7 = hm1Var.f92792a;
                int i12 = hm1Var.f92793b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    bm1 bm1Var = new bm1(((a6f) obj).f12786b);
                    hm1Var.f92793b = 1;
                    Object objEmit6 = this.f78700b.emit(bm1Var, hm1Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof lm1) {
                    lm1Var = (lm1) fbkVar;
                    int i13 = lm1Var.f134737b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        lm1Var.f134737b = i13 - Integer.MIN_VALUE;
                    } else {
                        lm1Var = new lm1(this, fbkVar);
                    }
                } else {
                    lm1Var = new lm1(this, fbkVar);
                }
                Object obj8 = lm1Var.f134736a;
                int i14 = lm1Var.f134737b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    List<aa3> list2 = (List) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
                    for (aa3 aa3Var : list2) {
                        if (aa3Var instanceof z93) {
                            str = ((z93) aa3Var).f280652a;
                        } else {
                            if (!(aa3Var instanceof y93)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = yl1.f273875b;
                        }
                        arrayList.add(str);
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    lm1Var.f134737b = 1;
                    Object objEmit7 = this.f78700b.emit(setM43736n1, lm1Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof bs1) {
                    bs1Var = (bs1) fbkVar;
                    int i15 = bs1Var.f30211b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bs1Var.f30211b = i15 - Integer.MIN_VALUE;
                    } else {
                        bs1Var = new bs1(this, fbkVar);
                    }
                } else {
                    bs1Var = new bs1(this, fbkVar);
                }
                Object obj9 = bs1Var.f30210a;
                int i16 = bs1Var.f30211b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    if (((xf11) obj) == xf11.f260814c) {
                        bs1Var.f30211b = 1;
                        Object objEmit8 = this.f78700b.emit(obj, bs1Var);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof i22) {
                    i22Var = (i22) fbkVar;
                    int i17 = i22Var.f97693b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        i22Var.f97693b = i17 - Integer.MIN_VALUE;
                    } else {
                        i22Var = new i22(this, fbkVar);
                    }
                } else {
                    i22Var = new i22(this, fbkVar);
                }
                Object obj10 = i22Var.f97692a;
                int i18 = i22Var.f97693b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    Boolean boolValueOf3 = Boolean.valueOf(((ty80) obj).m81955a());
                    i22Var.f97693b = 1;
                    Object objEmit9 = this.f78700b.emit(boolValueOf3, i22Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof o22) {
                    o22Var = (o22) fbkVar;
                    int i19 = o22Var.f160916b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        o22Var.f160916b = i19 - Integer.MIN_VALUE;
                    } else {
                        o22Var = new o22(this, fbkVar);
                    }
                } else {
                    o22Var = new o22(this, fbkVar);
                }
                Object obj11 = o22Var.f160915a;
                int i20 = o22Var.f160916b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf4 = Boolean.valueOf(((ty80) obj).f224877f.f271278w.f156638b);
                    o22Var.f160916b = 1;
                    Object objEmit10 = this.f78700b.emit(boolValueOf4, o22Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof q82) {
                    q82Var = (q82) fbkVar;
                    int i21 = q82Var.f186218b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        q82Var.f186218b = i21 - Integer.MIN_VALUE;
                    } else {
                        q82Var = new q82(this, fbkVar);
                    }
                } else {
                    q82Var = new q82(this, fbkVar);
                }
                Object obj12 = q82Var.f186217a;
                int i22 = q82Var.f186218b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    Boolean boolValueOf5 = Boolean.valueOf(((pe01) obj).f176584a);
                    q82Var.f186218b = 1;
                    Object objEmit11 = this.f78700b.emit(boolValueOf5, q82Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof da2) {
                    da2Var = (da2) fbkVar;
                    int i23 = da2Var.f46960b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        da2Var.f46960b = i23 - Integer.MIN_VALUE;
                    } else {
                        da2Var = new da2(this, fbkVar);
                    }
                } else {
                    da2Var = new da2(this, fbkVar);
                }
                Object obj13 = da2Var.f46959a;
                int i24 = da2Var.f46960b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    if (((PlayerState) obj).track().mo49279c()) {
                        da2Var.f46960b = 1;
                        Object objEmit12 = this.f78700b.emit(obj, da2Var);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof ea2) {
                    ea2Var = (ea2) fbkVar;
                    int i25 = ea2Var.f57568b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ea2Var.f57568b = i25 - Integer.MIN_VALUE;
                    } else {
                        ea2Var = new ea2(this, fbkVar);
                    }
                } else {
                    ea2Var = new ea2(this, fbkVar);
                }
                Object obj14 = ea2Var.f57567a;
                int i26 = ea2Var.f57568b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    Object objMo49278b = ((PlayerState) obj).track().mo49278b();
                    ea2Var.f57568b = 1;
                    Object objEmit13 = this.f78700b.emit(objMo49278b, ea2Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof ha2) {
                    ha2Var = (ha2) fbkVar;
                    int i27 = ha2Var.f89093b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ha2Var.f89093b = i27 - Integer.MIN_VALUE;
                    } else {
                        ha2Var = new ha2(this, fbkVar);
                    }
                } else {
                    ha2Var = new ha2(this, fbkVar);
                }
                Object obj15 = ha2Var.f89092a;
                int i28 = ha2Var.f89093b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    if (((Boolean) obj).booleanValue()) {
                        ha2Var.f89093b = 1;
                        Object objEmit14 = this.f78700b.emit(obj, ha2Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof gd2) {
                    gd2Var = (gd2) fbkVar;
                    int i29 = gd2Var.f78710b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        gd2Var.f78710b = i29 - Integer.MIN_VALUE;
                    } else {
                        gd2Var = new gd2(this, fbkVar);
                    }
                } else {
                    gd2Var = new gd2(this, fbkVar);
                }
                Object obj16 = gd2Var.f78709a;
                int i30 = gd2Var.f78710b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    if (obj instanceof cd2) {
                        gd2Var.f78710b = 1;
                        Object objEmit15 = this.f78700b.emit(obj, gd2Var);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit15 == yukVar15) {
                            return yukVar15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof qf2) {
                    qf2Var = (qf2) fbkVar;
                    int i31 = qf2Var.f188098b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        qf2Var.f188098b = i31 - Integer.MIN_VALUE;
                    } else {
                        qf2Var = new qf2(this, fbkVar);
                    }
                } else {
                    qf2Var = new qf2(this, fbkVar);
                }
                Object obj17 = qf2Var.f188097a;
                int i32 = qf2Var.f188098b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
                    int iHashCode = upperCase.hashCode();
                    bdb1 bdb1Var = bdb1.f26073c;
                    if (iHashCode == -1402997159) {
                        upperCase.equals("VERIFICATION_NEEDED");
                    } else if (iHashCode != -1211756856) {
                        if (iHashCode == 175259132 && upperCase.equals("INELIGIBLE")) {
                            bdb1Var = bdb1.f26072b;
                        }
                    } else if (upperCase.equals("VERIFIED")) {
                        bdb1Var = bdb1.f26071a;
                    }
                    qf2Var.f188098b = 1;
                    Object objEmit16 = this.f78700b.emit(bdb1Var, qf2Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ni2) {
                    ni2Var = (ni2) fbkVar;
                    int i33 = ni2Var.f154161b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ni2Var.f154161b = i33 - Integer.MIN_VALUE;
                    } else {
                        ni2Var = new ni2(this, fbkVar);
                    }
                } else {
                    ni2Var = new ni2(this, fbkVar);
                }
                Object obj18 = ni2Var.f154160a;
                int i34 = ni2Var.f154161b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        ni2Var.f154161b = 1;
                        Object objEmit17 = this.f78700b.emit(obj, ni2Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof xj2) {
                    xj2Var = (xj2) fbkVar;
                    int i35 = xj2Var.f262020b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        xj2Var.f262020b = i35 - Integer.MIN_VALUE;
                    } else {
                        xj2Var = new xj2(this, fbkVar);
                    }
                } else {
                    xj2Var = new xj2(this, fbkVar);
                }
                Object obj19 = xj2Var.f262019a;
                int i36 = xj2Var.f262020b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    vk40 vk40Var = (vk40) obj;
                    if (vk40Var instanceof uk40) {
                        str2 = ((uk40) vk40Var).f231217b;
                    } else if (vk40Var instanceof sk40) {
                        str2 = ((sk40) vk40Var).f210014b;
                    } else {
                        if (!(vk40Var instanceof tk40) && vk40Var != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = null;
                    }
                    xj2Var.f262020b = 1;
                    Object objEmit18 = this.f78700b.emit(str2, xj2Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof zm2) {
                    zm2Var = (zm2) fbkVar;
                    int i37 = zm2Var.f284130b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        zm2Var.f284130b = i37 - Integer.MIN_VALUE;
                    } else {
                        zm2Var = new zm2(this, fbkVar);
                    }
                } else {
                    zm2Var = new zm2(this, fbkVar);
                }
                Object obj20 = zm2Var.f284129a;
                int i38 = zm2Var.f284130b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    PlayerState playerState = (PlayerState) obj;
                    wj50.m88279p(playerState);
                    if (wl51.m88460J0(hdi.m47210B(playerState))) {
                        playerState = null;
                    }
                    zm2Var.f284130b = 1;
                    Object objEmit19 = this.f78700b.emit(playerState, zm2Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof qn2) {
                    qn2Var = (qn2) fbkVar;
                    int i39 = qn2Var.f190458b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qn2Var.f190458b = i39 - Integer.MIN_VALUE;
                    } else {
                        qn2Var = new qn2(this, fbkVar);
                    }
                } else {
                    qn2Var = new qn2(this, fbkVar);
                }
                Object obj21 = qn2Var.f190457a;
                int i40 = qn2Var.f190458b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        qn2Var.f190458b = 1;
                        Object objEmit20 = this.f78700b.emit(obj, qn2Var);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof do2) {
                    do2Var = (do2) fbkVar;
                    int i41 = do2Var.f50920b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        do2Var.f50920b = i41 - Integer.MIN_VALUE;
                    } else {
                        do2Var = new do2(this, fbkVar);
                    }
                } else {
                    do2Var = new do2(this, fbkVar);
                }
                Object obj22 = do2Var.f50919a;
                int i42 = do2Var.f50920b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    s7d s7dVar = new s7d((bo2) obj);
                    do2Var.f50920b = 1;
                    Object objEmit21 = this.f78700b.emit(s7dVar, do2Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof so2) {
                    so2Var = (so2) fbkVar;
                    int i43 = so2Var.f211080b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        so2Var.f211080b = i43 - Integer.MIN_VALUE;
                    } else {
                        so2Var = new so2(this, fbkVar);
                    }
                } else {
                    so2Var = new so2(this, fbkVar);
                }
                Object obj23 = so2Var.f211079a;
                int i44 = so2Var.f211080b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    t7d t7dVar = new t7d(((Boolean) obj).booleanValue());
                    so2Var.f211080b = 1;
                    Object objEmit22 = this.f78700b.emit(t7dVar, so2Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof uo2) {
                    uo2Var = (uo2) fbkVar;
                    int i45 = uo2Var.f232312b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        uo2Var.f232312b = i45 - Integer.MIN_VALUE;
                    } else {
                        uo2Var = new uo2(this, fbkVar);
                    }
                } else {
                    uo2Var = new uo2(this, fbkVar);
                }
                Object obj24 = uo2Var.f232311a;
                int i46 = uo2Var.f232312b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    WritingStatusNotification writingStatusNotification = (WritingStatusNotification) obj;
                    if (writingStatusNotification != null) {
                        uo2Var.f232312b = 1;
                        Object objEmit23 = this.f78700b.emit(writingStatusNotification, uo2Var);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit23 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof fp2) {
                    fp2Var = (fp2) fbkVar;
                    int i47 = fp2Var.f71697b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        fp2Var.f71697b = i47 - Integer.MIN_VALUE;
                    } else {
                        fp2Var = new fp2(this, fbkVar);
                    }
                } else {
                    fp2Var = new fp2(this, fbkVar);
                }
                Object obj25 = fp2Var.f71696a;
                int i48 = fp2Var.f71697b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    ep2 ep2Var = new ep2((erc1) obj);
                    fp2Var.f71697b = 1;
                    Object objEmit24 = this.f78700b.emit(ep2Var, fp2Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof yx2) {
                    yx2Var = (yx2) fbkVar;
                    int i49 = yx2Var.f277114b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        yx2Var.f277114b = i49 - Integer.MIN_VALUE;
                    } else {
                        yx2Var = new yx2(this, fbkVar);
                    }
                } else {
                    yx2Var = new yx2(this, fbkVar);
                }
                Object obj26 = yx2Var.f277113a;
                int i50 = yx2Var.f277114b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf6 = Boolean.valueOf(((ty80) obj).m81955a());
                    yx2Var.f277114b = 1;
                    Object objEmit25 = this.f78700b.emit(boolValueOf6, yx2Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof oy2) {
                    oy2Var = (oy2) fbkVar;
                    int i51 = oy2Var.f171643b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        oy2Var.f171643b = i51 - Integer.MIN_VALUE;
                    } else {
                        oy2Var = new oy2(this, fbkVar);
                    }
                } else {
                    oy2Var = new oy2(this, fbkVar);
                }
                Object obj27 = oy2Var.f171642a;
                int i52 = oy2Var.f171643b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    pf40<ContextTrack> pf40VarNextTracks = ((PlayerState) obj).nextTracks();
                    boolean z = false;
                    if (!pf40VarNextTracks.isEmpty()) {
                        for (ContextTrack contextTrack : pf40VarNextTracks) {
                            wj50.m88279p(contextTrack);
                            if (e72.m37988V(contextTrack)) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolValueOf7 = Boolean.valueOf(z);
                    oy2Var.f171643b = 1;
                    Object objEmit26 = this.f78700b.emit(boolValueOf7, oy2Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof az2) {
                    az2Var = (az2) fbkVar;
                    int i53 = az2Var.f21399b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        az2Var.f21399b = i53 - Integer.MIN_VALUE;
                    } else {
                        az2Var = new az2(this, fbkVar);
                    }
                } else {
                    az2Var = new az2(this, fbkVar);
                }
                Object obj28 = az2Var.f21398a;
                int i54 = az2Var.f21399b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    CharSequence charSequence = (CharSequence) ((ty80) obj).f224877f.f271272q.get("copyrights");
                    Boolean boolValueOf8 = Boolean.valueOf(!(charSequence == null || wl51.m88460J0(charSequence)));
                    az2Var.f21399b = 1;
                    Object objEmit27 = this.f78700b.emit(boolValueOf8, az2Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof cz2) {
                    cz2Var = (cz2) fbkVar;
                    int i55 = cz2Var.f43423b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        cz2Var.f43423b = i55 - Integer.MIN_VALUE;
                    } else {
                        cz2Var = new cz2(this, fbkVar);
                    }
                } else {
                    cz2Var = new cz2(this, fbkVar);
                }
                Object obj29 = cz2Var.f43422a;
                int i56 = cz2Var.f43423b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    as21 as21Var = (as21) obj;
                    Integer num = null;
                    yr21 yr21Var = as21Var instanceof yr21 ? (yr21) as21Var : null;
                    if (yr21Var != null && (list = yr21Var.f275371a) != null) {
                        num = new Integer(list.size());
                    }
                    if (num != null) {
                        cz2Var.f43423b = 1;
                        Object objEmit28 = this.f78700b.emit(num, cz2Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof rz2) {
                    rz2Var = (rz2) fbkVar;
                    int i57 = rz2Var.f204036b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        rz2Var.f204036b = i57 - Integer.MIN_VALUE;
                    } else {
                        rz2Var = new rz2(this, fbkVar);
                    }
                } else {
                    rz2Var = new rz2(this, fbkVar);
                }
                Object obj30 = rz2Var.f204035a;
                int i58 = rz2Var.f204036b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    if (obj instanceof su50) {
                        rz2Var.f204036b = 1;
                        Object objEmit29 = this.f78700b.emit(obj, rz2Var);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit29 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof wz2) {
                    wz2Var = (wz2) fbkVar;
                    int i59 = wz2Var.f256440b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        wz2Var.f256440b = i59 - Integer.MIN_VALUE;
                    } else {
                        wz2Var = new wz2(this, fbkVar);
                    }
                } else {
                    wz2Var = new wz2(this, fbkVar);
                }
                Object obj31 = wz2Var.f256439a;
                int i60 = wz2Var.f256440b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                as21 as21Var2 = (as21) obj;
                ArrayList arrayList2 = new ArrayList();
                if ((as21Var2 instanceof yr21) && ((yr21) as21Var2).f275371a.isEmpty()) {
                    arrayList2.add(new sec1(w2a1Var, w2a1Var));
                }
                wz2Var.f256440b = 1;
                Object objEmit30 = this.f78700b.emit(arrayList2, wz2Var);
                yuk yukVar30 = yuk.f276404a;
                return objEmit30 == yukVar30 ? yukVar30 : w2a1Var;
        }
    }
}
