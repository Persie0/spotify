package p204p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto$ObserveInvalidationResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class cgm0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f37748b;

    public /* synthetic */ cgm0(niz nizVar, int i) {
        this.f37747a = i;
        this.f37748b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0229  */
    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:215:0x0344  */
    /* JADX WARN: Code duplicated, block: B:232:0x038a  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:266:0x041b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:285:0x0460  */
    /* JADX WARN: Code duplicated, block: B:302:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:333:0x0532  */
    /* JADX WARN: Code duplicated, block: B:350:0x0579  */
    /* JADX WARN: Code duplicated, block: B:374:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:391:0x061f  */
    /* JADX WARN: Code duplicated, block: B:412:0x066f  */
    /* JADX WARN: Code duplicated, block: B:433:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:450:0x0707  */
    /* JADX WARN: Code duplicated, block: B:469:0x074e  */
    /* JADX WARN: Code duplicated, block: B:488:0x0795  */
    /* JADX WARN: Code duplicated, block: B:505:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:524:0x0828  */
    /* JADX WARN: Code duplicated, block: B:549:0x0887  */
    /* JADX WARN: Code duplicated, block: B:566:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        bgm0 bgm0Var;
        vgm0 vgm0Var;
        lhm0 lhm0Var;
        Object objM43736n1;
        fmm0 fmm0Var;
        imm0 imm0Var;
        jmm0 jmm0Var;
        kmm0 kmm0Var;
        lmm0 lmm0Var;
        mmm0 mmm0Var;
        nmm0 nmm0Var;
        omm0 omm0Var;
        f1n0 f1n0Var;
        y1n0 y1n0Var;
        p4n0 p4n0Var;
        r4n0 r4n0Var;
        v7n0 v7n0Var;
        x7n0 x7n0Var;
        p8n0 p8n0Var;
        t8n0 t8n0Var;
        xin0 xin0Var;
        Object obj2;
        yin0 yin0Var;
        zin0 zin0Var;
        ajn0 ajn0Var;
        mon0 mon0Var;
        qon0 qon0Var;
        arn0 arn0Var;
        zrn0 zrn0Var;
        asn0 asn0Var;
        bsn0 bsn0Var;
        csn0 csn0Var;
        switch (this.f37747a) {
            case 0:
                if (fbkVar instanceof bgm0) {
                    bgm0Var = (bgm0) fbkVar;
                    int i = bgm0Var.f26970b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bgm0Var.f26970b = i - Integer.MIN_VALUE;
                    } else {
                        bgm0Var = new bgm0(this, fbkVar);
                    }
                } else {
                    bgm0Var = new bgm0(this, fbkVar);
                }
                Object obj3 = bgm0Var.f26969a;
                int i2 = bgm0Var.f26970b;
                if (i2 == 0) {
                    bga.m29073P(obj3);
                    z5v0 z5v0Var = new z5v0((u8v0) obj);
                    bgm0Var.f26970b = 1;
                    Object objEmit = this.f37748b.emit(z5v0Var, bgm0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof vgm0) {
                    vgm0Var = (vgm0) fbkVar;
                    int i3 = vgm0Var.f241276b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vgm0Var.f241276b = i3 - Integer.MIN_VALUE;
                    } else {
                        vgm0Var = new vgm0(this, fbkVar);
                    }
                } else {
                    vgm0Var = new vgm0(this, fbkVar);
                }
                Object obj4 = vgm0Var.f241275a;
                int i4 = vgm0Var.f241276b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((knm0) obj) instanceof hnm0);
                    vgm0Var.f241276b = 1;
                    Object objEmit2 = this.f37748b.emit(boolValueOf, vgm0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof lhm0) {
                    lhm0Var = (lhm0) fbkVar;
                    int i5 = lhm0Var.f133602b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lhm0Var.f133602b = i5 - Integer.MIN_VALUE;
                    } else {
                        lhm0Var = new lhm0(this, fbkVar);
                    }
                } else {
                    lhm0Var = new lhm0(this, fbkVar);
                }
                Object obj5 = lhm0Var.f133601a;
                int i6 = lhm0Var.f133602b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    as21 as21Var = (as21) obj;
                    if (as21Var instanceof yr21) {
                        objM43736n1 = g6f.m43736n1(((yr21) as21Var).f275372b);
                    } else {
                        if (!wj50.m88271j(as21Var, zr21.f285528a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM43736n1 = gbu.f78413a;
                    }
                    lhm0Var.f133602b = 1;
                    Object objEmit3 = this.f37748b.emit(objM43736n1, lhm0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof fmm0) {
                    fmm0Var = (fmm0) fbkVar;
                    int i7 = fmm0Var.f71084b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        fmm0Var.f71084b = i7 - Integer.MIN_VALUE;
                    } else {
                        fmm0Var = new fmm0(this, fbkVar);
                    }
                } else {
                    fmm0Var = new fmm0(this, fbkVar);
                }
                Object obj6 = fmm0Var.f71083a;
                int i8 = fmm0Var.f71084b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    if (((tam0) obj) != tam0.f218633a) {
                        fmm0Var.f71084b = 1;
                        Object objEmit4 = this.f37748b.emit(obj, fmm0Var);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit4 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof imm0) {
                    imm0Var = (imm0) fbkVar;
                    int i9 = imm0Var.f103752b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        imm0Var.f103752b = i9 - Integer.MIN_VALUE;
                    } else {
                        imm0Var = new imm0(this, fbkVar);
                    }
                } else {
                    imm0Var = new imm0(this, fbkVar);
                }
                Object obj7 = imm0Var.f103751a;
                int i10 = imm0Var.f103752b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    Boolean boolValueOf2 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
                    imm0Var.f103752b = 1;
                    Object objEmit5 = this.f37748b.emit(boolValueOf2, imm0Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof jmm0) {
                    jmm0Var = (jmm0) fbkVar;
                    int i11 = jmm0Var.f113907b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        jmm0Var.f113907b = i11 - Integer.MIN_VALUE;
                    } else {
                        jmm0Var = new jmm0(this, fbkVar);
                    }
                } else {
                    jmm0Var = new jmm0(this, fbkVar);
                }
                Object obj8 = jmm0Var.f113906a;
                int i12 = jmm0Var.f113907b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    if (((tam0) obj) != tam0.f218633a) {
                        jmm0Var.f113907b = 1;
                        Object objEmit6 = this.f37748b.emit(obj, jmm0Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof kmm0) {
                    kmm0Var = (kmm0) fbkVar;
                    int i13 = kmm0Var.f124179b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        kmm0Var.f124179b = i13 - Integer.MIN_VALUE;
                    } else {
                        kmm0Var = new kmm0(this, fbkVar);
                    }
                } else {
                    kmm0Var = new kmm0(this, fbkVar);
                }
                Object obj9 = kmm0Var.f124178a;
                int i14 = kmm0Var.f124179b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    if (((tam0) obj) != tam0.f218633a) {
                        kmm0Var.f124179b = 1;
                        Object objEmit7 = this.f37748b.emit(obj, kmm0Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof lmm0) {
                    lmm0Var = (lmm0) fbkVar;
                    int i15 = lmm0Var.f134992b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        lmm0Var.f134992b = i15 - Integer.MIN_VALUE;
                    } else {
                        lmm0Var = new lmm0(this, fbkVar);
                    }
                } else {
                    lmm0Var = new lmm0(this, fbkVar);
                }
                Object obj10 = lmm0Var.f134991a;
                int i16 = lmm0Var.f134992b;
                if (i16 == 0) {
                    bga.m29073P(obj10);
                    Boolean boolValueOf3 = Boolean.valueOf(((knm0) obj) instanceof hnm0);
                    lmm0Var.f134992b = 1;
                    Object objEmit8 = this.f37748b.emit(boolValueOf3, lmm0Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof mmm0) {
                    mmm0Var = (mmm0) fbkVar;
                    int i17 = mmm0Var.f145184b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mmm0Var.f145184b = i17 - Integer.MIN_VALUE;
                    } else {
                        mmm0Var = new mmm0(this, fbkVar);
                    }
                } else {
                    mmm0Var = new mmm0(this, fbkVar);
                }
                Object obj11 = mmm0Var.f145183a;
                int i18 = mmm0Var.f145184b;
                if (i18 == 0) {
                    bga.m29073P(obj11);
                    tam0 tam0Var = (tam0) obj;
                    tam0Var.getClass();
                    Boolean boolValueOf4 = Boolean.valueOf(tam0Var == tam0.f218634b);
                    mmm0Var.f145184b = 1;
                    Object objEmit9 = this.f37748b.emit(boolValueOf4, mmm0Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof nmm0) {
                    nmm0Var = (nmm0) fbkVar;
                    int i19 = nmm0Var.f155494b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        nmm0Var.f155494b = i19 - Integer.MIN_VALUE;
                    } else {
                        nmm0Var = new nmm0(this, fbkVar);
                    }
                } else {
                    nmm0Var = new nmm0(this, fbkVar);
                }
                Object obj12 = nmm0Var.f155493a;
                int i20 = nmm0Var.f155494b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    tam0 tam0Var2 = (tam0) obj;
                    tam0Var2.getClass();
                    Boolean boolValueOf5 = Boolean.valueOf(tam0Var2 == tam0.f218634b);
                    nmm0Var.f155494b = 1;
                    Object objEmit10 = this.f37748b.emit(boolValueOf5, nmm0Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof omm0) {
                    omm0Var = (omm0) fbkVar;
                    int i21 = omm0Var.f167061b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        omm0Var.f167061b = i21 - Integer.MIN_VALUE;
                    } else {
                        omm0Var = new omm0(this, fbkVar);
                    }
                } else {
                    omm0Var = new omm0(this, fbkVar);
                }
                Object obj13 = omm0Var.f167060a;
                int i22 = omm0Var.f167061b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    knm0 knm0VarM55913d = kaz.m55913d(((Boolean) obj).booleanValue());
                    omm0Var.f167061b = 1;
                    Object objEmit11 = this.f37748b.emit(knm0VarM55913d, omm0Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof f1n0) {
                    f1n0Var = (f1n0) fbkVar;
                    int i23 = f1n0Var.f64936b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        f1n0Var.f64936b = i23 - Integer.MIN_VALUE;
                    } else {
                        f1n0Var = new f1n0(this, fbkVar);
                    }
                } else {
                    f1n0Var = new f1n0(this, fbkVar);
                }
                Object obj14 = f1n0Var.f64935a;
                int i24 = f1n0Var.f64936b;
                if (i24 == 0) {
                    bga.m29073P(obj14);
                    PlayerState playerState = (PlayerState) obj;
                    b1n0 b1n0Var = new b1n0(hdi.m47210B(playerState), playerState.isPaused() ? 2 : playerState.isPlaying() ? 1 : 3);
                    f1n0Var.f64936b = 1;
                    Object objEmit12 = this.f37748b.emit(b1n0Var, f1n0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof y1n0) {
                    y1n0Var = (y1n0) fbkVar;
                    int i25 = y1n0Var.f268340b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        y1n0Var.f268340b = i25 - Integer.MIN_VALUE;
                    } else {
                        y1n0Var = new y1n0(this, fbkVar);
                    }
                } else {
                    y1n0Var = new y1n0(this, fbkVar);
                }
                Object obj15 = y1n0Var.f268339a;
                int i26 = y1n0Var.f268340b;
                if (i26 == 0) {
                    bga.m29073P(obj15);
                    t2y t2yVar = new t2y((PlayerState) obj);
                    y1n0Var.f268340b = 1;
                    Object objEmit13 = this.f37748b.emit(t2yVar, y1n0Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof p4n0) {
                    p4n0Var = (p4n0) fbkVar;
                    int i27 = p4n0Var.f173987b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        p4n0Var.f173987b = i27 - Integer.MIN_VALUE;
                    } else {
                        p4n0Var = new p4n0(this, fbkVar);
                    }
                } else {
                    p4n0Var = new p4n0(this, fbkVar);
                }
                Object obj16 = p4n0Var.f173986a;
                int i28 = p4n0Var.f173987b;
                if (i28 == 0) {
                    bga.m29073P(obj16);
                    List list = (List) obj;
                    wj50.m88279p(list);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj17 : list) {
                        api apiVar = (api) obj17;
                        if (apiVar.getType() != xfr.f261068Q0 && apiVar.getType() != xfr.f261067P0 && !apiVar.mo26697m() && apiVar.isActive() && bm51.m29797h0(apiVar.mo26684F(), d6n0.f45731d, true)) {
                            arrayList.add(obj17);
                        }
                    }
                    p4n0Var.f173987b = 1;
                    Object objEmit14 = this.f37748b.emit(arrayList, p4n0Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof r4n0) {
                    r4n0Var = (r4n0) fbkVar;
                    int i29 = r4n0Var.f195812b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        r4n0Var.f195812b = i29 - Integer.MIN_VALUE;
                    } else {
                        r4n0Var = new r4n0(this, fbkVar);
                    }
                } else {
                    r4n0Var = new r4n0(this, fbkVar);
                }
                Object obj18 = r4n0Var.f195811a;
                int i30 = r4n0Var.f195812b;
                if (i30 == 0) {
                    bga.m29073P(obj18);
                    Boolean boolValueOf6 = Boolean.valueOf(!((List) obj).isEmpty());
                    r4n0Var.f195812b = 1;
                    Object objEmit15 = this.f37748b.emit(boolValueOf6, r4n0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof v7n0) {
                    v7n0Var = (v7n0) fbkVar;
                    int i31 = v7n0Var.f238284b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        v7n0Var.f238284b = i31 - Integer.MIN_VALUE;
                    } else {
                        v7n0Var = new v7n0(this, fbkVar);
                    }
                } else {
                    v7n0Var = new v7n0(this, fbkVar);
                }
                Object obj19 = v7n0Var.f238283a;
                int i32 = v7n0Var.f238284b;
                if (i32 == 0) {
                    bga.m29073P(obj19);
                    if (((String) obj) != null) {
                        v7n0Var.f238284b = 1;
                        Object objEmit16 = this.f37748b.emit(obj, v7n0Var);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof x7n0) {
                    x7n0Var = (x7n0) fbkVar;
                    int i33 = x7n0Var.f258952b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        x7n0Var.f258952b = i33 - Integer.MIN_VALUE;
                    } else {
                        x7n0Var = new x7n0(this, fbkVar);
                    }
                } else {
                    x7n0Var = new x7n0(this, fbkVar);
                }
                Object obj20 = x7n0Var.f258951a;
                int i34 = x7n0Var.f258952b;
                if (i34 == 0) {
                    bga.m29073P(obj20);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    x7n0Var.f258952b = 1;
                    Object objEmit17 = this.f37748b.emit(objMo49283h, x7n0Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof p8n0) {
                    p8n0Var = (p8n0) fbkVar;
                    int i35 = p8n0Var.f175009b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        p8n0Var.f175009b = i35 - Integer.MIN_VALUE;
                    } else {
                        p8n0Var = new p8n0(this, fbkVar);
                    }
                } else {
                    p8n0Var = new p8n0(this, fbkVar);
                }
                Object obj21 = p8n0Var.f175008a;
                int i36 = p8n0Var.f175009b;
                if (i36 == 0) {
                    bga.m29073P(obj21);
                    x8n0 x8n0Var = (x8n0) obj;
                    sou0 sou0Var = new sou0(x8n0Var.f259190c, x8n0Var.f259191d);
                    p8n0Var.f175009b = 1;
                    Object objEmit18 = this.f37748b.emit(sou0Var, p8n0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof t8n0) {
                    t8n0Var = (t8n0) fbkVar;
                    int i37 = t8n0Var.f218114b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        t8n0Var.f218114b = i37 - Integer.MIN_VALUE;
                    } else {
                        t8n0Var = new t8n0(this, fbkVar);
                    }
                } else {
                    t8n0Var = new t8n0(this, fbkVar);
                }
                Object obj22 = t8n0Var.f218113a;
                int i38 = t8n0Var.f218114b;
                if (i38 == 0) {
                    bga.m29073P(obj22);
                    Object objMo49283h2 = ((xul0) obj).mo49283h();
                    t8n0Var.f218114b = 1;
                    Object objEmit19 = this.f37748b.emit(objMo49283h2, t8n0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof xin0) {
                    xin0Var = (xin0) fbkVar;
                    int i39 = xin0Var.f261918b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        xin0Var.f261918b = i39 - Integer.MIN_VALUE;
                    } else {
                        xin0Var = new xin0(this, fbkVar);
                    }
                } else {
                    xin0Var = new xin0(this, fbkVar);
                }
                Object obj23 = xin0Var.f261917a;
                int i40 = xin0Var.f261918b;
                if (i40 == 0) {
                    bga.m29073P(obj23);
                    t730 t730Var = (t730) obj;
                    if (t730Var == null || (obj2 = t730Var.f217668b) == null) {
                        obj2 = n730.f151064a;
                    }
                    xin0Var.f261918b = 1;
                    Object objEmit20 = this.f37748b.emit(obj2, xin0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof yin0) {
                    yin0Var = (yin0) fbkVar;
                    int i41 = yin0Var.f273172b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        yin0Var.f273172b = i41 - Integer.MIN_VALUE;
                    } else {
                        yin0Var = new yin0(this, fbkVar);
                    }
                } else {
                    yin0Var = new yin0(this, fbkVar);
                }
                Object obj24 = yin0Var.f273171a;
                int i42 = yin0Var.f273172b;
                if (i42 == 0) {
                    bga.m29073P(obj24);
                    if (((r730) obj) instanceof q730) {
                        yin0Var.f273172b = 1;
                        Object objEmit21 = this.f37748b.emit(obj, yin0Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof zin0) {
                    zin0Var = (zin0) fbkVar;
                    int i43 = zin0Var.f283203b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        zin0Var.f283203b = i43 - Integer.MIN_VALUE;
                    } else {
                        zin0Var = new zin0(this, fbkVar);
                    }
                } else {
                    zin0Var = new zin0(this, fbkVar);
                }
                Object obj25 = zin0Var.f283202a;
                int i44 = zin0Var.f283203b;
                if (i44 == 0) {
                    bga.m29073P(obj25);
                    t730 t730Var2 = (t730) obj;
                    r730 r730Var = t730Var2 != null ? t730Var2.f217668b : null;
                    zin0Var.f283203b = 1;
                    Object objEmit22 = this.f37748b.emit(r730Var, zin0Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof ajn0) {
                    ajn0Var = (ajn0) fbkVar;
                    int i45 = ajn0Var.f16294b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ajn0Var.f16294b = i45 - Integer.MIN_VALUE;
                    } else {
                        ajn0Var = new ajn0(this, fbkVar);
                    }
                } else {
                    ajn0Var = new ajn0(this, fbkVar);
                }
                Object obj26 = ajn0Var.f16293a;
                int i46 = ajn0Var.f16294b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                ajn0Var.f16294b = 1;
                Object objEmit23 = this.f37748b.emit(w2a1Var, ajn0Var);
                yuk yukVar23 = yuk.f276404a;
                return objEmit23 == yukVar23 ? yukVar23 : w2a1Var;
            case 23:
                if (fbkVar instanceof mon0) {
                    mon0Var = (mon0) fbkVar;
                    int i47 = mon0Var.f145711b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        mon0Var.f145711b = i47 - Integer.MIN_VALUE;
                    } else {
                        mon0Var = new mon0(this, fbkVar);
                    }
                } else {
                    mon0Var = new mon0(this, fbkVar);
                }
                Object obj27 = mon0Var.f145710a;
                int i48 = mon0Var.f145711b;
                if (i48 == 0) {
                    bga.m29073P(obj27);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PermissionsEsperanto$ObserveInvalidationResponse permissionsEsperanto$ObserveInvalidationResponseM97852o = PermissionsEsperanto$ObserveInvalidationResponse.m97852o(bArr);
                        mon0Var.f145711b = 1;
                        Object objEmit24 = this.f37748b.emit(permissionsEsperanto$ObserveInvalidationResponseM97852o, mon0Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.ObserveInvalidationResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof qon0) {
                    qon0Var = (qon0) fbkVar;
                    int i49 = qon0Var.f191012b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        qon0Var.f191012b = i49 - Integer.MIN_VALUE;
                    } else {
                        qon0Var = new qon0(this, fbkVar);
                    }
                } else {
                    qon0Var = new qon0(this, fbkVar);
                }
                Object obj28 = qon0Var.f191011a;
                int i50 = qon0Var.f191012b;
                if (i50 == 0) {
                    bga.m29073P(obj28);
                    val0 val0Var = new val0(((PermissionsEsperanto$ObserveInvalidationResponse) obj).m97853n());
                    qon0Var.f191012b = 1;
                    Object objEmit25 = this.f37748b.emit(val0Var, qon0Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof arn0) {
                    arn0Var = (arn0) fbkVar;
                    int i51 = arn0Var.f19103b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        arn0Var.f19103b = i51 - Integer.MIN_VALUE;
                    } else {
                        arn0Var = new arn0(this, fbkVar);
                    }
                } else {
                    arn0Var = new arn0(this, fbkVar);
                }
                Object obj29 = arn0Var.f19102a;
                int i52 = arn0Var.f19103b;
                if (i52 == 0) {
                    bga.m29073P(obj29);
                    Boolean boolValueOf7 = Boolean.valueOf(wj50.m88271j(((gv31) obj).f84602a, Boolean.TRUE));
                    arn0Var.f19103b = 1;
                    Object objEmit26 = this.f37748b.emit(boolValueOf7, arn0Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof zrn0) {
                    zrn0Var = (zrn0) fbkVar;
                    int i53 = zrn0Var.f285711b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        zrn0Var.f285711b = i53 - Integer.MIN_VALUE;
                    } else {
                        zrn0Var = new zrn0(this, fbkVar);
                    }
                } else {
                    zrn0Var = new zrn0(this, fbkVar);
                }
                Object obj30 = zrn0Var.f285710a;
                int i54 = zrn0Var.f285711b;
                if (i54 == 0) {
                    bga.m29073P(obj30);
                    if (((Boolean) obj).booleanValue()) {
                        zrn0Var.f285711b = 1;
                        Object objEmit27 = this.f37748b.emit(obj, zrn0Var);
                        yuk yukVar27 = yuk.f276404a;
                        if (objEmit27 == yukVar27) {
                            return yukVar27;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof asn0) {
                    asn0Var = (asn0) fbkVar;
                    int i55 = asn0Var.f19474b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        asn0Var.f19474b = i55 - Integer.MIN_VALUE;
                    } else {
                        asn0Var = new asn0(this, fbkVar);
                    }
                } else {
                    asn0Var = new asn0(this, fbkVar);
                }
                Object obj31 = asn0Var.f19473a;
                int i56 = asn0Var.f19474b;
                if (i56 == 0) {
                    bga.m29073P(obj31);
                    if (((e301) obj).f55572b) {
                        asn0Var.f19474b = 1;
                        Object objEmit28 = this.f37748b.emit(obj, asn0Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof bsn0) {
                    bsn0Var = (bsn0) fbkVar;
                    int i57 = bsn0Var.f30360b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bsn0Var.f30360b = i57 - Integer.MIN_VALUE;
                    } else {
                        bsn0Var = new bsn0(this, fbkVar);
                    }
                } else {
                    bsn0Var = new bsn0(this, fbkVar);
                }
                Object obj32 = bsn0Var.f30359a;
                int i58 = bsn0Var.f30360b;
                if (i58 == 0) {
                    bga.m29073P(obj32);
                    ((Boolean) obj).getClass();
                    bsn0Var.f30360b = 1;
                    Object objEmit29 = this.f37748b.emit(esn0.APP_OPENED, bsn0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof csn0) {
                    csn0Var = (csn0) fbkVar;
                    int i59 = csn0Var.f41659b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        csn0Var.f41659b = i59 - Integer.MIN_VALUE;
                    } else {
                        csn0Var = new csn0(this, fbkVar);
                    }
                } else {
                    csn0Var = new csn0(this, fbkVar);
                }
                Object obj33 = csn0Var.f41658a;
                int i60 = csn0Var.f41659b;
                if (i60 == 0) {
                    bga.m29073P(obj33);
                    csn0Var.f41659b = 1;
                    Object objEmit30 = this.f37748b.emit(esn0.SIGNED_IN, csn0Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ cgm0(niz nizVar, Object obj, int i) {
        this.f37747a = i;
        this.f37748b = nizVar;
    }
}
