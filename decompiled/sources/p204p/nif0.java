package p204p;

import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class nif0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f154258b;

    public /* synthetic */ nif0(niz nizVar, int i) {
        this.f154257a = i;
        this.f154258b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x018d  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b  */
    /* JADX WARN: Code duplicated, block: B:171:0x026f  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:211:0x030b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0352  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:280:0x0408  */
    /* JADX WARN: Code duplicated, block: B:304:0x045c  */
    /* JADX WARN: Code duplicated, block: B:321:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:344:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:363:0x0540  */
    /* JADX WARN: Code duplicated, block: B:390:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:423:0x0626  */
    /* JADX WARN: Code duplicated, block: B:440:0x0670  */
    /* JADX WARN: Code duplicated, block: B:457:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:474:0x0703  */
    /* JADX WARN: Code duplicated, block: B:488:0x0742  */
    /* JADX WARN: Code duplicated, block: B:499:0x076a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:516:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:533:0x0802  */
    /* JADX WARN: Code duplicated, block: B:550:0x084c  */
    /* JADX WARN: Code duplicated, block: B:574:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:598:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:615:0x0946  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x013e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        mif0 mif0Var;
        oif0 oif0Var;
        pif0 pif0Var;
        rif0 rif0Var;
        yif0 yif0Var;
        ajf0 ajf0Var;
        djf0 djf0Var;
        ejf0 ejf0Var;
        boolean z;
        vpf0 vpf0Var;
        rrf0 rrf0Var;
        zsf0 zsf0Var;
        etf0 etf0Var;
        api apiVar;
        api apiVar2;
        api apiVar3;
        htf0 htf0Var;
        Object ohoVar;
        quf0 quf0Var;
        ruf0 ruf0Var;
        suf0 suf0Var;
        tuf0 tuf0Var;
        uuf0 uuf0Var;
        nvf0 nvf0Var;
        yjj0 yjj0Var;
        jzf0 jzf0Var;
        n0g0 n0g0Var;
        l3g0 l3g0Var;
        n3g0 n3g0Var;
        w6g0 w6g0Var;
        Object r6g0Var;
        a7g0 a7g0Var;
        c7g0 c7g0Var;
        boh0 boh0Var;
        jyh0 jyh0Var;
        mzh0 mzh0Var;
        switch (this.f154257a) {
            case 0:
                if (fbkVar instanceof mif0) {
                    mif0Var = (mif0) fbkVar;
                    int i = mif0Var.f144013b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mif0Var.f144013b = i - Integer.MIN_VALUE;
                    } else {
                        mif0Var = new mif0(this, fbkVar);
                    }
                } else {
                    mif0Var = new mif0(this, fbkVar);
                }
                Object obj2 = mif0Var.f144012a;
                int i2 = mif0Var.f144013b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ty80 ty80Var = (ty80) obj;
                    pqm0 pqm0Var = new pqm0(new Integer(ty80Var.f224873b), Boolean.valueOf(ty80Var.f224877f.f271265j));
                    mif0Var.f144013b = 1;
                    Object objEmit = this.f154258b.emit(pqm0Var, mif0Var);
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
                if (fbkVar instanceof oif0) {
                    oif0Var = (oif0) fbkVar;
                    int i3 = oif0Var.f165807b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oif0Var.f165807b = i3 - Integer.MIN_VALUE;
                    } else {
                        oif0Var = new oif0(this, fbkVar);
                    }
                } else {
                    oif0Var = new oif0(this, fbkVar);
                }
                Object obj3 = oif0Var.f165806a;
                int i4 = oif0Var.f165807b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((uvf0) obj).equals(qvf0.f193007a));
                    oif0Var.f165807b = 1;
                    Object objEmit2 = this.f154258b.emit(boolValueOf, oif0Var);
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
                if (fbkVar instanceof pif0) {
                    pif0Var = (pif0) fbkVar;
                    int i5 = pif0Var.f177933b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pif0Var.f177933b = i5 - Integer.MIN_VALUE;
                    } else {
                        pif0Var = new pif0(this, fbkVar);
                    }
                } else {
                    pif0Var = new pif0(this, fbkVar);
                }
                Object obj4 = pif0Var.f177932a;
                int i6 = pif0Var.f177933b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    qho qhoVar = (qho) obj;
                    oho ohoVar2 = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Boolean boolValueOf2 = Boolean.valueOf(ohoVar2 != null ? ((Boolean) ohoVar2.f165512a).booleanValue() : false);
                    pif0Var.f177933b = 1;
                    Object objEmit3 = this.f154258b.emit(boolValueOf2, pif0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof rif0) {
                    rif0Var = (rif0) fbkVar;
                    int i7 = rif0Var.f199536b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        rif0Var.f199536b = i7 - Integer.MIN_VALUE;
                    } else {
                        rif0Var = new rif0(this, fbkVar);
                    }
                } else {
                    rif0Var = new rif0(this, fbkVar);
                }
                Object obj5 = rif0Var.f199535a;
                int i8 = rif0Var.f199536b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar3 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    i490 i490Var = ohoVar3 != null ? (i490) ohoVar3.f165512a : null;
                    if (i490Var != null) {
                        rif0Var.f199536b = 1;
                        Object objEmit4 = this.f154258b.emit(i490Var, rif0Var);
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
                if (fbkVar instanceof yif0) {
                    yif0Var = (yif0) fbkVar;
                    int i9 = yif0Var.f273111b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yif0Var.f273111b = i9 - Integer.MIN_VALUE;
                    } else {
                        yif0Var = new yif0(this, fbkVar);
                    }
                } else {
                    yif0Var = new yif0(this, fbkVar);
                }
                Object obj6 = yif0Var.f273110a;
                int i10 = yif0Var.f273111b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf3 = Boolean.valueOf(((uvf0) obj).m84056b());
                    yif0Var.f273111b = 1;
                    Object objEmit5 = this.f154258b.emit(boolValueOf3, yif0Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof ajf0) {
                    ajf0Var = (ajf0) fbkVar;
                    int i11 = ajf0Var.f16265b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ajf0Var.f16265b = i11 - Integer.MIN_VALUE;
                    } else {
                        ajf0Var = new ajf0(this, fbkVar);
                    }
                } else {
                    ajf0Var = new ajf0(this, fbkVar);
                }
                Object obj7 = ajf0Var.f16264a;
                int i12 = ajf0Var.f16265b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    Boolean boolValueOf4 = Boolean.valueOf(wrf0.m88858b(((ty80) obj).f224877f.f271272q));
                    ajf0Var.f16265b = 1;
                    Object objEmit6 = this.f154258b.emit(boolValueOf4, ajf0Var);
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
                if (fbkVar instanceof djf0) {
                    djf0Var = (djf0) fbkVar;
                    int i13 = djf0Var.f49682b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        djf0Var.f49682b = i13 - Integer.MIN_VALUE;
                    } else {
                        djf0Var = new djf0(this, fbkVar);
                    }
                } else {
                    djf0Var = new djf0(this, fbkVar);
                }
                Object obj8 = djf0Var.f49681a;
                int i14 = djf0Var.f49682b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    Boolean boolValueOf5 = Boolean.valueOf(((uvf0) obj).m84056b());
                    djf0Var.f49682b = 1;
                    Object objEmit7 = this.f154258b.emit(boolValueOf5, djf0Var);
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
                if (fbkVar instanceof ejf0) {
                    ejf0Var = (ejf0) fbkVar;
                    int i15 = ejf0Var.f60217b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ejf0Var.f60217b = i15 - Integer.MIN_VALUE;
                    } else {
                        ejf0Var = new ejf0(this, fbkVar);
                    }
                } else {
                    ejf0Var = new ejf0(this, fbkVar);
                }
                Object obj9 = ejf0Var.f60216a;
                int i16 = ejf0Var.f60217b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    ybv ybvVar = ((ty80) obj).f224877f;
                    if (wrf0.m88858b(ybvVar.f271272q)) {
                        boolean z2 = ybvVar.f271265j;
                        Map map = ybvVar.f271272q;
                        if (z2 || !Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    ejf0Var.f60217b = 1;
                    Object objEmit8 = this.f154258b.emit(boolValueOf6, ejf0Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof vpf0) {
                    vpf0Var = (vpf0) fbkVar;
                    int i17 = vpf0Var.f243683b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vpf0Var.f243683b = i17 - Integer.MIN_VALUE;
                    } else {
                        vpf0Var = new vpf0(this, fbkVar);
                    }
                } else {
                    vpf0Var = new vpf0(this, fbkVar);
                }
                Object obj10 = vpf0Var.f243682a;
                int i18 = vpf0Var.f243683b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    upf0 upf0Var = new upf0((p2x0) obj);
                    vpf0Var.f243683b = 1;
                    Object objEmit9 = this.f154258b.emit(upf0Var, vpf0Var);
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
                if (fbkVar instanceof rrf0) {
                    rrf0Var = (rrf0) fbkVar;
                    int i19 = rrf0Var.f202040b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        rrf0Var.f202040b = i19 - Integer.MIN_VALUE;
                    } else {
                        rrf0Var = new rrf0(this, fbkVar);
                    }
                } else {
                    rrf0Var = new rrf0(this, fbkVar);
                }
                Object obj11 = rrf0Var.f202039a;
                int i20 = rrf0Var.f202040b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf7 = Boolean.valueOf(((uvf0) obj).equals(qvf0.f193007a));
                    rrf0Var.f202040b = 1;
                    Object objEmit10 = this.f154258b.emit(boolValueOf7, rrf0Var);
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
                if (fbkVar instanceof zsf0) {
                    zsf0Var = (zsf0) fbkVar;
                    int i21 = zsf0Var.f285936b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        zsf0Var.f285936b = i21 - Integer.MIN_VALUE;
                    } else {
                        zsf0Var = new zsf0(this, fbkVar);
                    }
                } else {
                    zsf0Var = new zsf0(this, fbkVar);
                }
                Object obj12 = zsf0Var.f285935a;
                int i22 = zsf0Var.f285936b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    Boolean boolValueOf8 = Boolean.valueOf(((uvf0) obj).m84055a());
                    zsf0Var.f285936b = 1;
                    Object objEmit11 = this.f154258b.emit(boolValueOf8, zsf0Var);
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
                if (fbkVar instanceof etf0) {
                    etf0Var = (etf0) fbkVar;
                    int i23 = etf0Var.f62705b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        etf0Var.f62705b = i23 - Integer.MIN_VALUE;
                    } else {
                        etf0Var = new etf0(this, fbkVar);
                    }
                } else {
                    etf0Var = new etf0(this, fbkVar);
                }
                Object obj13 = etf0Var.f62704a;
                int i24 = etf0Var.f62705b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    xul0 xul0Var = (xul0) obj;
                    String strM30600A = (!xul0Var.mo49279c() || (apiVar = (api) xul0Var.mo49283h()) == null || !apiVar.isActive() || (apiVar2 = (api) xul0Var.mo49283h()) == null || apiVar2.mo26697m() || (apiVar3 = (api) xul0Var.mo49283h()) == null || apiVar3.mo26698n()) ? null : bvg1.m30600A((api) xul0Var.mo49278b());
                    etf0Var.f62705b = 1;
                    Object objEmit12 = this.f154258b.emit(strM30600A, etf0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof htf0) {
                    htf0Var = (htf0) fbkVar;
                    int i25 = htf0Var.f95007b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        htf0Var.f95007b = i25 - Integer.MIN_VALUE;
                    } else {
                        htf0Var = new htf0(this, fbkVar);
                    }
                } else {
                    htf0Var = new htf0(this, fbkVar);
                }
                Object obj14 = htf0Var.f95006a;
                int i26 = htf0Var.f95007b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                qho qhoVar3 = (qho) obj;
                if (qhoVar3 instanceof pho) {
                    ohoVar = pho.f177693a;
                } else if (qhoVar3 instanceof nho) {
                    ohoVar = new nho(((nho) qhoVar3).f154041a);
                } else {
                    if (!(qhoVar3 instanceof oho)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ohoVar = new oho(w2a1Var, null);
                }
                htf0Var.f95007b = 1;
                Object objEmit13 = this.f154258b.emit(ohoVar, htf0Var);
                yuk yukVar13 = yuk.f276404a;
                return objEmit13 == yukVar13 ? yukVar13 : w2a1Var;
            case 13:
                if (fbkVar instanceof quf0) {
                    quf0Var = (quf0) fbkVar;
                    int i27 = quf0Var.f192700b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        quf0Var.f192700b = i27 - Integer.MIN_VALUE;
                    } else {
                        quf0Var = new quf0(this, fbkVar);
                    }
                } else {
                    quf0Var = new quf0(this, fbkVar);
                }
                Object obj15 = quf0Var.f192699a;
                int i28 = quf0Var.f192700b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    qho qhoVar4 = (qho) obj;
                    qhoVar4.getClass();
                    if (!(qhoVar4 instanceof pho)) {
                        quf0Var.f192700b = 1;
                        Object objEmit14 = this.f154258b.emit(obj, quf0Var);
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
                if (fbkVar instanceof ruf0) {
                    ruf0Var = (ruf0) fbkVar;
                    int i29 = ruf0Var.f202840b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ruf0Var.f202840b = i29 - Integer.MIN_VALUE;
                    } else {
                        ruf0Var = new ruf0(this, fbkVar);
                    }
                } else {
                    ruf0Var = new ruf0(this, fbkVar);
                }
                Object obj16 = ruf0Var.f202839a;
                int i30 = ruf0Var.f202840b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    qho qhoVar5 = (qho) obj;
                    oho ohoVar4 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                    gh71 gh71Var = ohoVar4 != null ? (gh71) ohoVar4.f165512a : null;
                    ruf0Var.f202840b = 1;
                    Object objEmit15 = this.f154258b.emit(gh71Var, ruf0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof suf0) {
                    suf0Var = (suf0) fbkVar;
                    int i31 = suf0Var.f214067b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        suf0Var.f214067b = i31 - Integer.MIN_VALUE;
                    } else {
                        suf0Var = new suf0(this, fbkVar);
                    }
                } else {
                    suf0Var = new suf0(this, fbkVar);
                }
                Object obj17 = suf0Var.f214066a;
                int i32 = suf0Var.f214067b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    puf0 puf0Var = new puf0((ouf0) obj, null);
                    suf0Var.f214067b = 1;
                    Object objEmit16 = this.f154258b.emit(puf0Var, suf0Var);
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
                if (fbkVar instanceof tuf0) {
                    tuf0Var = (tuf0) fbkVar;
                    int i33 = tuf0Var.f223852b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        tuf0Var.f223852b = i33 - Integer.MIN_VALUE;
                    } else {
                        tuf0Var = new tuf0(this, fbkVar);
                    }
                } else {
                    tuf0Var = new tuf0(this, fbkVar);
                }
                Object obj18 = tuf0Var.f223851a;
                int i34 = tuf0Var.f223852b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    qho qhoVar6 = (qho) obj;
                    oho ohoVar5 = qhoVar6 instanceof oho ? (oho) qhoVar6 : null;
                    ouf0 ouf0Var = ohoVar5 != null ? (ouf0) ohoVar5.f165512a : null;
                    if (ouf0Var != null) {
                        tuf0Var.f223852b = 1;
                        Object objEmit17 = this.f154258b.emit(ouf0Var, tuf0Var);
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
                if (fbkVar instanceof uuf0) {
                    uuf0Var = (uuf0) fbkVar;
                    int i35 = uuf0Var.f234188b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        uuf0Var.f234188b = i35 - Integer.MIN_VALUE;
                    } else {
                        uuf0Var = new uuf0(this, fbkVar);
                    }
                } else {
                    uuf0Var = new uuf0(this, fbkVar);
                }
                Object obj19 = uuf0Var.f234187a;
                int i36 = uuf0Var.f234188b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    qho qhoVar7 = (qho) obj;
                    oho ohoVar6 = qhoVar7 instanceof oho ? (oho) qhoVar7 : null;
                    ouf0 ouf0Var2 = ohoVar6 != null ? (ouf0) ohoVar6.f165512a : null;
                    if (ouf0Var2 != null) {
                        uuf0Var.f234188b = 1;
                        Object objEmit18 = this.f154258b.emit(ouf0Var2, uuf0Var);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof nvf0) {
                    nvf0Var = (nvf0) fbkVar;
                    int i37 = nvf0Var.f158885b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nvf0Var.f158885b = i37 - Integer.MIN_VALUE;
                    } else {
                        nvf0Var = new nvf0(this, fbkVar);
                    }
                } else {
                    nvf0Var = new nvf0(this, fbkVar);
                }
                Object obj20 = nvf0Var.f158884a;
                int i38 = nvf0Var.f158885b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    Boolean bool = (Boolean) obj;
                    if (bool == null) {
                        yjj0Var = yjj0.f273379b;
                    } else if (bool.equals(Boolean.TRUE)) {
                        yjj0Var = yjj0.f273380c;
                    } else {
                        if (!bool.equals(Boolean.FALSE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yjj0Var = yjj0.f273381d;
                    }
                    nvf0Var.f158885b = 1;
                    Object objEmit19 = this.f154258b.emit(yjj0Var, nvf0Var);
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
                if (fbkVar instanceof jzf0) {
                    jzf0Var = (jzf0) fbkVar;
                    int i39 = jzf0Var.f117722b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        jzf0Var.f117722b = i39 - Integer.MIN_VALUE;
                    } else {
                        jzf0Var = new jzf0(this, fbkVar);
                    }
                } else {
                    jzf0Var = new jzf0(this, fbkVar);
                }
                Object obj21 = jzf0Var.f117721a;
                int i40 = jzf0Var.f117722b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    izf0 izf0Var = new izf0((p2x0) obj);
                    jzf0Var.f117722b = 1;
                    Object objEmit20 = this.f154258b.emit(izf0Var, jzf0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof n0g0) {
                    n0g0Var = (n0g0) fbkVar;
                    int i41 = n0g0Var.f149052b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        n0g0Var.f149052b = i41 - Integer.MIN_VALUE;
                    } else {
                        n0g0Var = new n0g0(this, fbkVar);
                    }
                } else {
                    n0g0Var = new n0g0(this, fbkVar);
                }
                Object obj22 = n0g0Var.f149051a;
                int i42 = n0g0Var.f149052b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    Boolean boolValueOf9 = Boolean.valueOf(((YourLibraryResponse) obj).m98196n().size() >= 1);
                    n0g0Var.f149052b = 1;
                    Object objEmit21 = this.f154258b.emit(boolValueOf9, n0g0Var);
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
                if (fbkVar instanceof l3g0) {
                    l3g0Var = (l3g0) fbkVar;
                    int i43 = l3g0Var.f129331b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        l3g0Var.f129331b = i43 - Integer.MIN_VALUE;
                    } else {
                        l3g0Var = new l3g0(this, fbkVar);
                    }
                } else {
                    l3g0Var = new l3g0(this, fbkVar);
                }
                Object obj23 = l3g0Var.f129330a;
                int i44 = l3g0Var.f129331b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    if (((Boolean) obj).booleanValue()) {
                        l3g0Var.f129331b = 1;
                        Object objEmit22 = this.f154258b.emit(obj, l3g0Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit22 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof n3g0) {
                    n3g0Var = (n3g0) fbkVar;
                    int i45 = n3g0Var.f150052b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        n3g0Var.f150052b = i45 - Integer.MIN_VALUE;
                    } else {
                        n3g0Var = new n3g0(this, fbkVar);
                    }
                } else {
                    n3g0Var = new n3g0(this, fbkVar);
                }
                Object obj24 = n3g0Var.f150051a;
                int i46 = n3g0Var.f150052b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    qho qhoVar8 = (qho) obj;
                    oho ohoVar7 = qhoVar8 instanceof oho ? (oho) qhoVar8 : null;
                    i490 i490Var2 = ohoVar7 != null ? (i490) ohoVar7.f165512a : null;
                    if (i490Var2 != null) {
                        n3g0Var.f150052b = 1;
                        Object objEmit23 = this.f154258b.emit(i490Var2, n3g0Var);
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
                Object objEmit24 = this.f154258b.emit((r6g0) obj, fbkVar);
                return objEmit24 == yuk.f276404a ? objEmit24 : w2a1.f247311a;
            case 24:
                if (fbkVar instanceof w6g0) {
                    w6g0Var = (w6g0) fbkVar;
                    int i47 = w6g0Var.f248377b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        w6g0Var.f248377b = i47 - Integer.MIN_VALUE;
                    } else {
                        w6g0Var = new w6g0(this, fbkVar);
                    }
                } else {
                    w6g0Var = new w6g0(this, fbkVar);
                }
                Object obj25 = w6g0Var.f248376a;
                int i48 = w6g0Var.f248377b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    xun0 xun0Var = (xun0) obj;
                    if (xun0Var instanceof run0) {
                        r6g0Var = t6g0.f217551a;
                    } else if (xun0Var instanceof sun0) {
                        r6g0Var = u6g0.f227347a;
                    } else if (xun0Var instanceof vun0) {
                        vun0 vun0Var = (vun0) xun0Var;
                        r6g0Var = new r6g0(vun0Var.f245029b, vun0Var.f245030c, vun0Var.f245031d, vun0Var.f245032e);
                    } else {
                        boolean z3 = xun0Var instanceof wun0;
                        q6g0 q6g0Var = q6g0.f185803a;
                        if (z3 || (xun0Var instanceof uun0)) {
                            r6g0Var = q6g0Var;
                        } else {
                            if (!(xun0Var instanceof tun0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r6g0Var = p6g0.f174391a;
                        }
                    }
                    w6g0Var.f248377b = 1;
                    Object objEmit25 = this.f154258b.emit(r6g0Var, w6g0Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit25 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof a7g0) {
                    a7g0Var = (a7g0) fbkVar;
                    int i49 = a7g0Var.f13049b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        a7g0Var.f13049b = i49 - Integer.MIN_VALUE;
                    } else {
                        a7g0Var = new a7g0(this, fbkVar);
                    }
                } else {
                    a7g0Var = new a7g0(this, fbkVar);
                }
                Object obj26 = a7g0Var.f13048a;
                int i50 = a7g0Var.f13049b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    e301 e301Var = (e301) obj;
                    if (e301Var.f55572b && e301Var.f55571a.length() > 0) {
                        a7g0Var.f13049b = 1;
                        Object objEmit26 = this.f154258b.emit(obj, a7g0Var);
                        yuk yukVar25 = yuk.f276404a;
                        if (objEmit26 == yukVar25) {
                            return yukVar25;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof c7g0) {
                    c7g0Var = (c7g0) fbkVar;
                    int i51 = c7g0Var.f34896b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        c7g0Var.f34896b = i51 - Integer.MIN_VALUE;
                    } else {
                        c7g0Var = new c7g0(this, fbkVar);
                    }
                } else {
                    c7g0Var = new c7g0(this, fbkVar);
                }
                Object obj27 = c7g0Var.f34895a;
                int i52 = c7g0Var.f34896b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    String str = ((e301) obj).f55571a;
                    c7g0Var.f34896b = 1;
                    Object objEmit27 = this.f154258b.emit(str, c7g0Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit27 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof boh0) {
                    boh0Var = (boh0) fbkVar;
                    int i53 = boh0Var.f29180b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        boh0Var.f29180b = i53 - Integer.MIN_VALUE;
                    } else {
                        boh0Var = new boh0(this, fbkVar);
                    }
                } else {
                    boh0Var = new boh0(this, fbkVar);
                }
                Object obj28 = boh0Var.f29179a;
                int i54 = boh0Var.f29180b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    ade1 ade1Var = new ade1((krh0) obj);
                    boh0Var.f29180b = 1;
                    Object objEmit28 = this.f154258b.emit(ade1Var, boh0Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit28 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof jyh0) {
                    jyh0Var = (jyh0) fbkVar;
                    int i55 = jyh0Var.f117411b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        jyh0Var.f117411b = i55 - Integer.MIN_VALUE;
                    } else {
                        jyh0Var = new jyh0(this, fbkVar);
                    }
                } else {
                    jyh0Var = new jyh0(this, fbkVar);
                }
                Object obj29 = jyh0Var.f117410a;
                int i56 = jyh0Var.f117411b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    iyh0 iyh0Var = new iyh0((jcl0) obj);
                    jyh0Var.f117411b = 1;
                    Object objEmit29 = this.f154258b.emit(iyh0Var, jyh0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit29 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof mzh0) {
                    mzh0Var = (mzh0) fbkVar;
                    int i57 = mzh0Var.f148714b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        mzh0Var.f148714b = i57 - Integer.MIN_VALUE;
                    } else {
                        mzh0Var = new mzh0(this, fbkVar);
                    }
                } else {
                    mzh0Var = new mzh0(this, fbkVar);
                }
                Object obj30 = mzh0Var.f148713a;
                int i58 = mzh0Var.f148714b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    qho qhoVar9 = (qho) obj;
                    oho ohoVar8 = qhoVar9 instanceof oho ? (oho) qhoVar9 : null;
                    Set set = ohoVar8 != null ? (Set) ohoVar8.f165512a : null;
                    if (set != null) {
                        mzh0Var.f148714b = 1;
                        Object objEmit30 = this.f154258b.emit(set, mzh0Var);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit30 == yukVar29) {
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
        }
    }

    public /* synthetic */ nif0(niz nizVar, oge0 oge0Var, int i) {
        this.f154257a = i;
        this.f154258b = nizVar;
    }
}
