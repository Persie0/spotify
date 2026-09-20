package p204p;

import com.spotify.music.R;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class ie91 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f101352b;

    public /* synthetic */ ie91(niz nizVar, int i) {
        this.f101351a = i;
        this.f101352b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0209  */
    /* JADX WARN: Code duplicated, block: B:153:0x0252  */
    /* JADX WARN: Code duplicated, block: B:170:0x0296  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:213:0x032f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0376  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0422  */
    /* JADX WARN: Code duplicated, block: B:289:0x046d  */
    /* JADX WARN: Code duplicated, block: B:306:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:325:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:346:0x054e  */
    /* JADX WARN: Code duplicated, block: B:363:0x0598  */
    /* JADX WARN: Code duplicated, block: B:380:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:397:0x0631  */
    /* JADX WARN: Code duplicated, block: B:426:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:448:0x0709  */
    /* JADX WARN: Code duplicated, block: B:465:0x0757  */
    /* JADX WARN: Code duplicated, block: B:494:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:513:0x0809  */
    /* JADX WARN: Code duplicated, block: B:530:0x0854  */
    /* JADX WARN: Code duplicated, block: B:547:0x089b  */
    /* JADX WARN: Code duplicated, block: B:566:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:590:0x0938  */
    /* JADX WARN: Code duplicated, block: B:611:0x098a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        he91 he91Var;
        ze91 ze91Var;
        lg91 lg91Var;
        xi91 xi91Var;
        yi91 yi91Var;
        sk91 sk91Var;
        zl91 zl91Var;
        am91 am91Var;
        xul0 xul0VarTrack;
        ContextTrack contextTrack;
        zw91 zw91Var;
        cx91 cx91Var;
        dx91 dx91Var;
        vd01 ud01Var;
        f6a1 f6a1Var;
        g6a1 g6a1Var;
        eaa1 eaa1Var;
        gaa1 gaa1Var;
        maa1 maa1Var;
        zca1 zca1Var;
        ada1 ada1Var;
        jfa1 jfa1Var;
        vyf1 ep6Var;
        vyf1 fp6Var;
        nha1 nha1Var;
        kna1 kna1Var;
        dqa1 dqa1Var;
        eqa1 eqa1Var;
        mta1 mta1Var;
        aua1 aua1Var;
        String strUri;
        String str;
        rua1 rua1Var;
        sua1 sua1Var;
        zya1 zya1Var;
        qib1 qib1Var;
        ejb1 ejb1Var;
        switch (this.f101351a) {
            case 0:
                if (fbkVar instanceof he91) {
                    he91Var = (he91) fbkVar;
                    int i = he91Var.f90387b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        he91Var.f90387b = i - Integer.MIN_VALUE;
                    } else {
                        he91Var = new he91(this, fbkVar);
                    }
                } else {
                    he91Var = new he91(this, fbkVar);
                }
                Object obj2 = he91Var.f90386a;
                int i2 = he91Var.f90387b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    gi20 gi20VarM44766a = gi20.m44766a((gi20) obj, di20.f49214b, true, false, 0, null, false, 124);
                    he91Var.f90387b = 1;
                    Object objEmit = this.f101352b.emit(gi20VarM44766a, he91Var);
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
                if (fbkVar instanceof ze91) {
                    ze91Var = (ze91) fbkVar;
                    int i3 = ze91Var.f281983b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ze91Var.f281983b = i3 - Integer.MIN_VALUE;
                    } else {
                        ze91Var = new ze91(this, fbkVar);
                    }
                } else {
                    ze91Var = new ze91(this, fbkVar);
                }
                Object obj3 = ze91Var.f281982a;
                int i4 = ze91Var.f281983b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    ze91Var.f281983b = 1;
                    Object objEmit2 = this.f101352b.emit(boolValueOf, ze91Var);
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
                if (fbkVar instanceof lg91) {
                    lg91Var = (lg91) fbkVar;
                    int i5 = lg91Var.f133179b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lg91Var.f133179b = i5 - Integer.MIN_VALUE;
                    } else {
                        lg91Var = new lg91(this, fbkVar);
                    }
                } else {
                    lg91Var = new lg91(this, fbkVar);
                }
                Object obj4 = lg91Var.f133178a;
                int i6 = lg91Var.f133179b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    pqm0 pqm0Var = ohoVar != null ? (pqm0) ohoVar.f165512a : null;
                    if (pqm0Var != null) {
                        lg91Var.f133179b = 1;
                        Object objEmit3 = this.f101352b.emit(pqm0Var, lg91Var);
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
                if (fbkVar instanceof xi91) {
                    xi91Var = (xi91) fbkVar;
                    int i7 = xi91Var.f261835b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xi91Var.f261835b = i7 - Integer.MIN_VALUE;
                    } else {
                        xi91Var = new xi91(this, fbkVar);
                    }
                } else {
                    xi91Var = new xi91(this, fbkVar);
                }
                Object obj5 = xi91Var.f261834a;
                int i8 = xi91Var.f261835b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    if (((Boolean) obj).booleanValue()) {
                        xi91Var.f261835b = 1;
                        Object objEmit4 = this.f101352b.emit(obj, xi91Var);
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
                if (fbkVar instanceof yi91) {
                    yi91Var = (yi91) fbkVar;
                    int i9 = yi91Var.f273068b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yi91Var.f273068b = i9 - Integer.MIN_VALUE;
                    } else {
                        yi91Var = new yi91(this, fbkVar);
                    }
                } else {
                    yi91Var = new yi91(this, fbkVar);
                }
                Object obj6 = yi91Var.f273067a;
                int i10 = yi91Var.f273068b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    ((Boolean) obj).getClass();
                    itw itwVar = itw.f105778a;
                    yi91Var.f273068b = 1;
                    Object objEmit5 = this.f101352b.emit(itwVar, yi91Var);
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
                if (fbkVar instanceof sk91) {
                    sk91Var = (sk91) fbkVar;
                    int i11 = sk91Var.f210064b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        sk91Var.f210064b = i11 - Integer.MIN_VALUE;
                    } else {
                        sk91Var = new sk91(this, fbkVar);
                    }
                } else {
                    sk91Var = new sk91(this, fbkVar);
                }
                Object obj7 = sk91Var.f210063a;
                int i12 = sk91Var.f210064b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    d2l d2lVar = new d2l(((Number) obj).intValue());
                    sk91Var.f210064b = 1;
                    Object objEmit6 = this.f101352b.emit(d2lVar, sk91Var);
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
                if (fbkVar instanceof zl91) {
                    zl91Var = (zl91) fbkVar;
                    int i13 = zl91Var.f283955b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zl91Var.f283955b = i13 - Integer.MIN_VALUE;
                    } else {
                        zl91Var = new zl91(this, fbkVar);
                    }
                } else {
                    zl91Var = new zl91(this, fbkVar);
                }
                Object obj8 = zl91Var.f283954a;
                int i14 = zl91Var.f283955b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    if (((Boolean) obj).booleanValue()) {
                        zl91Var.f283955b = 1;
                        Object objEmit7 = this.f101352b.emit(obj, zl91Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof am91) {
                    am91Var = (am91) fbkVar;
                    int i15 = am91Var.f17073b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        am91Var.f17073b = i15 - Integer.MIN_VALUE;
                    } else {
                        am91Var = new am91(this, fbkVar);
                    }
                } else {
                    am91Var = new am91(this, fbkVar);
                }
                Object obj9 = am91Var.f17072a;
                int i16 = am91Var.f17073b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    PlayerState playerState = (PlayerState) obj;
                    Boolean boolValueOf2 = Boolean.valueOf((!playerState.isPlaying() || playerState.isPaused() || (xul0VarTrack = playerState.track()) == null || (contextTrack = (ContextTrack) xul0VarTrack.mo49283h()) == null || !e72.m37994a0(contextTrack)) ? false : true);
                    am91Var.f17073b = 1;
                    Object objEmit8 = this.f101352b.emit(boolValueOf2, am91Var);
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
                if (fbkVar instanceof zw91) {
                    zw91Var = (zw91) fbkVar;
                    int i17 = zw91Var.f286951b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        zw91Var.f286951b = i17 - Integer.MIN_VALUE;
                    } else {
                        zw91Var = new zw91(this, fbkVar);
                    }
                } else {
                    zw91Var = new zw91(this, fbkVar);
                }
                Object obj10 = zw91Var.f286950a;
                int i18 = zw91Var.f286951b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    s6x0 s6x0Var = new s6x0(new Integer(((ww91) obj).f255736b));
                    zw91Var.f286951b = 1;
                    Object objEmit9 = this.f101352b.emit(s6x0Var, zw91Var);
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
                if (fbkVar instanceof cx91) {
                    cx91Var = (cx91) fbkVar;
                    int i19 = cx91Var.f42957b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        cx91Var.f42957b = i19 - Integer.MIN_VALUE;
                    } else {
                        cx91Var = new cx91(this, fbkVar);
                    }
                } else {
                    cx91Var = new cx91(this, fbkVar);
                }
                Object obj11 = cx91Var.f42956a;
                int i20 = cx91Var.f42957b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    api apiVar = (api) ((xul0) obj).mo49283h();
                    boolean z = false;
                    if (apiVar != null && !apiVar.mo26697m()) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(!z);
                    cx91Var.f42957b = 1;
                    Object objEmit10 = this.f101352b.emit(boolValueOf3, cx91Var);
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
                if (fbkVar instanceof dx91) {
                    dx91Var = (dx91) fbkVar;
                    int i21 = dx91Var.f53910b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        dx91Var.f53910b = i21 - Integer.MIN_VALUE;
                    } else {
                        dx91Var = new dx91(this, fbkVar);
                    }
                } else {
                    dx91Var = new dx91(this, fbkVar);
                }
                Object obj12 = dx91Var.f53909a;
                int i22 = dx91Var.f53910b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    gpu gpuVar = gpu.f83248c;
                    Integer num = new Integer(bif1.m29318B(xfr.f261081d));
                    Integer num2 = zBooleanValue ? new Integer(R.string.ubiquitysettings_subjects_changes_apply_to_device) : null;
                    if (zBooleanValue) {
                        ud01Var = new td01();
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ud01Var = new ud01();
                    }
                    wd01 wd01Var = new wd01(gpuVar, num, null, num2, ud01Var, 20);
                    dx91Var.f53910b = 1;
                    Object objEmit11 = this.f101352b.emit(wd01Var, dx91Var);
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
                if (fbkVar instanceof f6a1) {
                    f6a1Var = (f6a1) fbkVar;
                    int i23 = f6a1Var.f66346b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        f6a1Var.f66346b = i23 - Integer.MIN_VALUE;
                    } else {
                        f6a1Var = new f6a1(this, fbkVar);
                    }
                } else {
                    f6a1Var = new f6a1(this, fbkVar);
                }
                Object obj13 = f6a1Var.f66345a;
                int i24 = f6a1Var.f66346b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf4 = Boolean.valueOf(((PlayerState) obj).options().repeatingTrack());
                    f6a1Var.f66346b = 1;
                    Object objEmit12 = this.f101352b.emit(boolValueOf4, f6a1Var);
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
                if (fbkVar instanceof g6a1) {
                    g6a1Var = (g6a1) fbkVar;
                    int i25 = g6a1Var.f77005b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        g6a1Var.f77005b = i25 - Integer.MIN_VALUE;
                    } else {
                        g6a1Var = new g6a1(this, fbkVar);
                    }
                } else {
                    g6a1Var = new g6a1(this, fbkVar);
                }
                Object obj14 = g6a1Var.f77004a;
                int i26 = g6a1Var.f77005b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    dpt0 dpt0Var = new dpt0(((Boolean) obj).booleanValue());
                    g6a1Var.f77005b = 1;
                    Object objEmit13 = this.f101352b.emit(dpt0Var, g6a1Var);
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
                if (fbkVar instanceof eaa1) {
                    eaa1Var = (eaa1) fbkVar;
                    int i27 = eaa1Var.f57611b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        eaa1Var.f57611b = i27 - Integer.MIN_VALUE;
                    } else {
                        eaa1Var = new eaa1(this, fbkVar);
                    }
                } else {
                    eaa1Var = new eaa1(this, fbkVar);
                }
                Object obj15 = eaa1Var.f57610a;
                int i28 = eaa1Var.f57611b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    Boolean boolValueOf5 = Boolean.valueOf(((EsOffline$Progress) obj).m16198C());
                    eaa1Var.f57611b = 1;
                    Object objEmit14 = this.f101352b.emit(boolValueOf5, eaa1Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof gaa1) {
                    gaa1Var = (gaa1) fbkVar;
                    int i29 = gaa1Var.f78011b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        gaa1Var.f78011b = i29 - Integer.MIN_VALUE;
                    } else {
                        gaa1Var = new gaa1(this, fbkVar);
                    }
                } else {
                    gaa1Var = new gaa1(this, fbkVar);
                }
                Object obj16 = gaa1Var.f78010a;
                int i30 = gaa1Var.f78011b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    Boolean boolValueOf6 = Boolean.valueOf(((YourLibraryResponse) obj).m98195b() > 0);
                    gaa1Var.f78011b = 1;
                    Object objEmit15 = this.f101352b.emit(boolValueOf6, gaa1Var);
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
                if (fbkVar instanceof maa1) {
                    maa1Var = (maa1) fbkVar;
                    int i31 = maa1Var.f141547b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        maa1Var.f141547b = i31 - Integer.MIN_VALUE;
                    } else {
                        maa1Var = new maa1(this, fbkVar);
                    }
                } else {
                    maa1Var = new maa1(this, fbkVar);
                }
                Object obj17 = maa1Var.f141546a;
                int i32 = maa1Var.f141547b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    if (((fb80) obj) == fb80.f67754e) {
                        maa1Var.f141547b = 1;
                        Object objEmit16 = this.f101352b.emit(obj, maa1Var);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof zca1) {
                    zca1Var = (zca1) fbkVar;
                    int i33 = zca1Var.f281488b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        zca1Var.f281488b = i33 - Integer.MIN_VALUE;
                    } else {
                        zca1Var = new zca1(this, fbkVar);
                    }
                } else {
                    zca1Var = new zca1(this, fbkVar);
                }
                Object obj18 = zca1Var.f281487a;
                int i34 = zca1Var.f281488b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    pca1 pca1Var = new pca1(((Boolean) obj).booleanValue());
                    zca1Var.f281488b = 1;
                    Object objEmit17 = this.f101352b.emit(pca1Var, zca1Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ada1) {
                    ada1Var = (ada1) fbkVar;
                    int i35 = ada1Var.f14586b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ada1Var.f14586b = i35 - Integer.MIN_VALUE;
                    } else {
                        ada1Var = new ada1(this, fbkVar);
                    }
                } else {
                    ada1Var = new ada1(this, fbkVar);
                }
                Object obj19 = ada1Var.f14585a;
                int i36 = ada1Var.f14586b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    vca1 vca1Var = new vca1(((Boolean) obj).booleanValue());
                    ada1Var.f14586b = 1;
                    Object objEmit18 = this.f101352b.emit(vca1Var, ada1Var);
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
                if (fbkVar instanceof jfa1) {
                    jfa1Var = (jfa1) fbkVar;
                    int i37 = jfa1Var.f111871b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jfa1Var.f111871b = i37 - Integer.MIN_VALUE;
                    } else {
                        jfa1Var = new jfa1(this, fbkVar);
                    }
                } else {
                    jfa1Var = new jfa1(this, fbkVar);
                }
                Object obj20 = jfa1Var.f111870a;
                int i38 = jfa1Var.f111871b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    oga1 oga1Var = (oga1) obj;
                    if (oga1Var instanceof lga1) {
                        ep6Var = hp6.f93706d;
                    } else if (oga1Var instanceof nga1) {
                        ep6Var = new jp6(((nga1) oga1Var).f153626b);
                    } else if (oga1Var instanceof mga1) {
                        mga1 mga1Var = (mga1) oga1Var;
                        String str2 = mga1Var.f143425b;
                        String str3 = mga1Var.f143424a;
                        if (wl51.m88460J0(str3)) {
                            ep6Var = new ep6(str2);
                        } else {
                            fp6Var = new ip6(str3, str2);
                            ep6Var = fp6Var;
                        }
                    } else {
                        if (!(oga1Var instanceof kga1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kga1 kga1Var = (kga1) oga1Var;
                        String str4 = kga1Var.f122350b;
                        to6 to6Var = kga1Var.f122349a;
                        if (to6Var instanceof ro6) {
                            fp6Var = new fp6(str4, ((ro6) to6Var).f201086a);
                            ep6Var = fp6Var;
                        } else {
                            if (!wj50.m88271j(to6Var, so6.f211108a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ep6Var = new ep6(str4);
                        }
                    }
                    wea1 wea1Var = new wea1(ep6Var);
                    jfa1Var.f111871b = 1;
                    Object objEmit19 = this.f101352b.emit(wea1Var, jfa1Var);
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
                if (fbkVar instanceof nha1) {
                    nha1Var = (nha1) fbkVar;
                    int i39 = nha1Var.f153913b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        nha1Var.f153913b = i39 - Integer.MIN_VALUE;
                    } else {
                        nha1Var = new nha1(this, fbkVar);
                    }
                } else {
                    nha1Var = new nha1(this, fbkVar);
                }
                Object obj21 = nha1Var.f153912a;
                int i40 = nha1Var.f153913b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    ya00 ya00Var = new ya00((wga1) obj);
                    nha1Var.f153913b = 1;
                    Object objEmit20 = this.f101352b.emit(ya00Var, nha1Var);
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
                if (fbkVar instanceof kna1) {
                    kna1Var = (kna1) fbkVar;
                    int i41 = kna1Var.f124370b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        kna1Var.f124370b = i41 - Integer.MIN_VALUE;
                    } else {
                        kna1Var = new kna1(this, fbkVar);
                    }
                } else {
                    kna1Var = new kna1(this, fbkVar);
                }
                Object obj22 = kna1Var.f124369a;
                int i42 = kna1Var.f124370b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    q040 q040Var = (q040) obj;
                    afm0 afm0Var = q040Var != null ? q040Var.f183903c : null;
                    if (afm0Var != null) {
                        kna1Var.f124370b = 1;
                        Object objEmit21 = this.f101352b.emit(afm0Var, kna1Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof dqa1) {
                    dqa1Var = (dqa1) fbkVar;
                    int i43 = dqa1Var.f51939b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        dqa1Var.f51939b = i43 - Integer.MIN_VALUE;
                    } else {
                        dqa1Var = new dqa1(this, fbkVar);
                    }
                } else {
                    dqa1Var = new dqa1(this, fbkVar);
                }
                Object obj23 = dqa1Var.f51938a;
                int i44 = dqa1Var.f51939b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    e301 e301Var = (e301) obj;
                    if (e301Var.f55572b && e301Var.f55571a.length() > 0) {
                        dqa1Var.f51939b = 1;
                        Object objEmit22 = this.f101352b.emit(obj, dqa1Var);
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
                if (fbkVar instanceof eqa1) {
                    eqa1Var = (eqa1) fbkVar;
                    int i45 = eqa1Var.f61839b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        eqa1Var.f61839b = i45 - Integer.MIN_VALUE;
                    } else {
                        eqa1Var = new eqa1(this, fbkVar);
                    }
                } else {
                    eqa1Var = new eqa1(this, fbkVar);
                }
                Object obj24 = eqa1Var.f61838a;
                int i46 = eqa1Var.f61839b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    String str5 = ((e301) obj).f55571a;
                    eqa1Var.f61839b = 1;
                    Object objEmit23 = this.f101352b.emit(str5, eqa1Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof mta1) {
                    mta1Var = (mta1) fbkVar;
                    int i47 = mta1Var.f147008b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        mta1Var.f147008b = i47 - Integer.MIN_VALUE;
                    } else {
                        mta1Var = new mta1(this, fbkVar);
                    }
                } else {
                    mta1Var = new mta1(this, fbkVar);
                }
                Object obj25 = mta1Var.f147007a;
                int i48 = mta1Var.f147008b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        mta1Var.f147008b = 1;
                        Object objEmit24 = this.f101352b.emit(obj, mta1Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof aua1) {
                    aua1Var = (aua1) fbkVar;
                    int i49 = aua1Var.f19902b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        aua1Var.f19902b = i49 - Integer.MIN_VALUE;
                    } else {
                        aua1Var = new aua1(this, fbkVar);
                    }
                } else {
                    aua1Var = new aua1(this, fbkVar);
                }
                Object obj26 = aua1Var.f19901a;
                int i50 = aua1Var.f19902b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    PlayerState playerState2 = (PlayerState) obj;
                    wj50.m88279p(playerState2);
                    ContextTrack contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                    rta1 rta1Var = null;
                    if (contextTrack2 != null && (strUri = contextTrack2.uri()) != null && bm51.m29803n0(strUri, "spotify:episode:", false) && (str = (String) playerState2.playbackId().mo49283h()) != null) {
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            rta1Var = new rta1(strUri, str);
                        }
                    }
                    aua1Var.f19902b = 1;
                    Object objEmit25 = this.f101352b.emit(rta1Var, aua1Var);
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
                if (fbkVar instanceof rua1) {
                    rua1Var = (rua1) fbkVar;
                    int i51 = rua1Var.f202786b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        rua1Var.f202786b = i51 - Integer.MIN_VALUE;
                    } else {
                        rua1Var = new rua1(this, fbkVar);
                    }
                } else {
                    rua1Var = new rua1(this, fbkVar);
                }
                Object obj27 = rua1Var.f202785a;
                int i52 = rua1Var.f202786b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        rua1Var.f202786b = 1;
                        Object objEmit26 = this.f101352b.emit(obj, rua1Var);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof sua1) {
                    sua1Var = (sua1) fbkVar;
                    int i53 = sua1Var.f214043b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        sua1Var.f214043b = i53 - Integer.MIN_VALUE;
                    } else {
                        sua1Var = new sua1(this, fbkVar);
                    }
                } else {
                    sua1Var = new sua1(this, fbkVar);
                }
                Object obj28 = sua1Var.f214042a;
                int i54 = sua1Var.f214043b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    List listMo45450b = ((gqx) obj).mo45450b(eua1.class);
                    sua1Var.f214043b = 1;
                    Object objEmit27 = this.f101352b.emit(listMo45450b, sua1Var);
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
                if (fbkVar instanceof zya1) {
                    zya1Var = (zya1) fbkVar;
                    int i55 = zya1Var.f287541b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        zya1Var.f287541b = i55 - Integer.MIN_VALUE;
                    } else {
                        zya1Var = new zya1(this, fbkVar);
                    }
                } else {
                    zya1Var = new zya1(this, fbkVar);
                }
                Object obj29 = zya1Var.f287540a;
                int i56 = zya1Var.f287541b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    Boolean boolValueOf7 = Boolean.valueOf(((String) obj).length() > 0);
                    zya1Var.f287541b = 1;
                    Object objEmit28 = this.f101352b.emit(boolValueOf7, zya1Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof qib1) {
                    qib1Var = (qib1) fbkVar;
                    int i57 = qib1Var.f188978b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        qib1Var.f188978b = i57 - Integer.MIN_VALUE;
                    } else {
                        qib1Var = new qib1(this, fbkVar);
                    }
                } else {
                    qib1Var = new qib1(this, fbkVar);
                }
                Object obj30 = qib1Var.f188977a;
                int i58 = qib1Var.f188978b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    dib1 dib1Var = new dib1(((Boolean) obj).booleanValue());
                    qib1Var.f188978b = 1;
                    Object objEmit29 = this.f101352b.emit(dib1Var, qib1Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof ejb1) {
                    ejb1Var = (ejb1) fbkVar;
                    int i59 = ejb1Var.f60183b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ejb1Var.f60183b = i59 - Integer.MIN_VALUE;
                    } else {
                        ejb1Var = new ejb1(this, fbkVar);
                    }
                } else {
                    ejb1Var = new ejb1(this, fbkVar);
                }
                Object obj31 = ejb1Var.f60182a;
                int i60 = ejb1Var.f60183b;
                if (i60 == 0) {
                    bga.m29073P(obj31);
                    eib1 eib1Var = new eib1((yyo0) obj);
                    ejb1Var.f60183b = 1;
                    Object objEmit30 = this.f101352b.emit(eib1Var, ejb1Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
        }
    }

    public ie91(niz nizVar, bua1 bua1Var) {
        this.f101351a = 24;
        this.f101352b = nizVar;
    }
}
