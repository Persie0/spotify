package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class a1s implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f11467b;

    public /* synthetic */ a1s(niz nizVar, int i) {
        this.f11466a = i;
        this.f11467b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x021b  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:170:0x0335  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:212:0x0404  */
    /* JADX WARN: Code duplicated, block: B:229:0x044e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0495  */
    /* JADX WARN: Code duplicated, block: B:273:0x0540  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:302:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:319:0x0615  */
    /* JADX WARN: Code duplicated, block: B:343:0x0669  */
    /* JADX WARN: Code duplicated, block: B:367:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:390:0x0712  */
    /* JADX WARN: Code duplicated, block: B:414:0x0766  */
    /* JADX WARN: Code duplicated, block: B:438:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x0802  */
    /* JADX WARN: Code duplicated, block: B:474:0x084a  */
    /* JADX WARN: Code duplicated, block: B:495:0x0897  */
    /* JADX WARN: Code duplicated, block: B:516:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:535:0x0932  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:552:0x0981  */
    /* JADX WARN: Code duplicated, block: B:576:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:600:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:617:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:88:0x018a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        z0s z0sVar;
        e5s e5sVar;
        i5s i5sVar;
        m8s m8sVar;
        vbs vbsVar;
        bjs bjsVar;
        dls dlsVar;
        els elsVar;
        mms mmsVar;
        sms smsVar;
        cts ctsVar;
        ets etsVar;
        gts gtsVar;
        kts ktsVar;
        ots otsVar;
        xxs xxsVar;
        qys qysVar;
        Set setM43736n1;
        List list;
        w0t w0tVar;
        g1t g1tVar;
        h1t h1tVar;
        i1t i1tVar;
        n1t n1tVar;
        z1t z1tVar;
        e2t e2tVar;
        q2t q2tVar;
        r2t r2tVar;
        t2t t2tVar;
        u2t u2tVar;
        y2t y2tVar;
        z2t z2tVar;
        switch (this.f11466a) {
            case 0:
                if (fbkVar instanceof z0s) {
                    z0sVar = (z0s) fbkVar;
                    int i = z0sVar.f278160b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z0sVar.f278160b = i - Integer.MIN_VALUE;
                    } else {
                        z0sVar = new z0s(this, fbkVar);
                    }
                } else {
                    z0sVar = new z0s(this, fbkVar);
                }
                Object obj2 = z0sVar.f278159a;
                int i2 = z0sVar.f278160b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ContextTrack contextTrack = (ContextTrack) obj;
                    String str = (String) contextTrack.metadata().get("segment");
                    if (str == null) {
                        str = "";
                    }
                    String strUri = contextTrack.uri();
                    pqm0 pqm0Var = new pqm0(str, strUri != null ? strUri : "");
                    z0sVar.f278160b = 1;
                    Object objEmit = this.f11467b.emit(pqm0Var, z0sVar);
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
                if (fbkVar instanceof e5s) {
                    e5sVar = (e5s) fbkVar;
                    int i3 = e5sVar.f56460b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        e5sVar.f56460b = i3 - Integer.MIN_VALUE;
                    } else {
                        e5sVar = new e5s(this, fbkVar);
                    }
                } else {
                    e5sVar = new e5s(this, fbkVar);
                }
                Object obj3 = e5sVar.f56459a;
                int i4 = e5sVar.f56460b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((b97) obj).f24786a);
                    e5sVar.f56460b = 1;
                    Object objEmit2 = this.f11467b.emit(boolValueOf, e5sVar);
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
                if (fbkVar instanceof i5s) {
                    i5sVar = (i5s) fbkVar;
                    int i5 = i5sVar.f99015b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        i5sVar.f99015b = i5 - Integer.MIN_VALUE;
                    } else {
                        i5sVar = new i5s(this, fbkVar);
                    }
                } else {
                    i5sVar = new i5s(this, fbkVar);
                }
                Object obj4 = i5sVar.f99014a;
                int i6 = i5sVar.f99015b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    i490 i490Var = ohoVar != null ? (i490) ohoVar.f165512a : null;
                    if (i490Var != null) {
                        i5sVar.f99015b = 1;
                        Object objEmit3 = this.f11467b.emit(i490Var, i5sVar);
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
                if (fbkVar instanceof m8s) {
                    m8sVar = (m8s) fbkVar;
                    int i7 = m8sVar.f141120b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        m8sVar.f141120b = i7 - Integer.MIN_VALUE;
                    } else {
                        m8sVar = new m8s(this, fbkVar);
                    }
                } else {
                    m8sVar = new m8s(this, fbkVar);
                }
                Object obj5 = m8sVar.f141119a;
                int i8 = m8sVar.f141120b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    pqm0 pqm0Var2 = ohoVar2 != null ? (pqm0) ohoVar2.f165512a : null;
                    if (pqm0Var2 != null) {
                        m8sVar.f141120b = 1;
                        Object objEmit4 = this.f11467b.emit(pqm0Var2, m8sVar);
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
                if (fbkVar instanceof vbs) {
                    vbsVar = (vbs) fbkVar;
                    int i9 = vbsVar.f239569b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vbsVar.f239569b = i9 - Integer.MIN_VALUE;
                    } else {
                        vbsVar = new vbs(this, fbkVar);
                    }
                } else {
                    vbsVar = new vbs(this, fbkVar);
                }
                Object obj6 = vbsVar.f239568a;
                int i10 = vbsVar.f239569b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf2 = Boolean.valueOf(!((YourLibraryResponse) obj).m98196n().isEmpty());
                    vbsVar.f239569b = 1;
                    Object objEmit5 = this.f11467b.emit(boolValueOf2, vbsVar);
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
                if (fbkVar instanceof bjs) {
                    bjsVar = (bjs) fbkVar;
                    int i11 = bjsVar.f27761b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bjsVar.f27761b = i11 - Integer.MIN_VALUE;
                    } else {
                        bjsVar = new bjs(this, fbkVar);
                    }
                } else {
                    bjsVar = new bjs(this, fbkVar);
                }
                Object obj7 = bjsVar.f27760a;
                int i12 = bjsVar.f27761b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    if (((Boolean) obj).booleanValue()) {
                        bjsVar.f27761b = 1;
                        Object objEmit6 = this.f11467b.emit(obj, bjsVar);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof dls) {
                    dlsVar = (dls) fbkVar;
                    int i13 = dlsVar.f50350b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dlsVar.f50350b = i13 - Integer.MIN_VALUE;
                    } else {
                        dlsVar = new dls(this, fbkVar);
                    }
                } else {
                    dlsVar = new dls(this, fbkVar);
                }
                Object obj8 = dlsVar.f50349a;
                int i14 = dlsVar.f50350b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    Boolean bool = (Boolean) ((gv31) obj).f84602a;
                    Boolean boolValueOf3 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    dlsVar.f50350b = 1;
                    Object objEmit7 = this.f11467b.emit(boolValueOf3, dlsVar);
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
                if (fbkVar instanceof els) {
                    elsVar = (els) fbkVar;
                    int i15 = elsVar.f60749b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        elsVar.f60749b = i15 - Integer.MIN_VALUE;
                    } else {
                        elsVar = new els(this, fbkVar);
                    }
                } else {
                    elsVar = new els(this, fbkVar);
                }
                Object obj9 = elsVar.f60748a;
                int i16 = elsVar.f60749b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    uks uksVar = ((Boolean) obj).booleanValue() ? uks.f231358b : uks.f231357a;
                    elsVar.f60749b = 1;
                    Object objEmit8 = this.f11467b.emit(uksVar, elsVar);
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
                if (fbkVar instanceof mms) {
                    mmsVar = (mms) fbkVar;
                    int i17 = mmsVar.f145245b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mmsVar.f145245b = i17 - Integer.MIN_VALUE;
                    } else {
                        mmsVar = new mms(this, fbkVar);
                    }
                } else {
                    mmsVar = new mms(this, fbkVar);
                }
                Object obj10 = mmsVar.f145244a;
                int i18 = mmsVar.f145245b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    if (objMo49283h != null) {
                        mmsVar.f145245b = 1;
                        Object objEmit9 = this.f11467b.emit(objMo49283h, mmsVar);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof sms) {
                    smsVar = (sms) fbkVar;
                    int i19 = smsVar.f210725b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        smsVar.f210725b = i19 - Integer.MIN_VALUE;
                    } else {
                        smsVar = new sms(this, fbkVar);
                    }
                } else {
                    smsVar = new sms(this, fbkVar);
                }
                Object obj11 = smsVar.f210724a;
                int i20 = smsVar.f210725b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf4 = Boolean.valueOf(((pe01) obj).f176594k);
                    smsVar.f210725b = 1;
                    Object objEmit10 = this.f11467b.emit(boolValueOf4, smsVar);
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
                if (fbkVar instanceof cts) {
                    ctsVar = (cts) fbkVar;
                    int i21 = ctsVar.f41969b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ctsVar.f41969b = i21 - Integer.MIN_VALUE;
                    } else {
                        ctsVar = new cts(this, fbkVar);
                    }
                } else {
                    ctsVar = new cts(this, fbkVar);
                }
                Object obj12 = ctsVar.f41968a;
                int i22 = ctsVar.f41969b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    qho qhoVar3 = (qho) obj;
                    oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    i490 i490Var2 = ohoVar3 != null ? (i490) ohoVar3.f165512a : null;
                    if (i490Var2 != null) {
                        ctsVar.f41969b = 1;
                        Object objEmit11 = this.f11467b.emit(i490Var2, ctsVar);
                        yuk yukVar11 = yuk.f276404a;
                        if (objEmit11 == yukVar11) {
                            return yukVar11;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof ets) {
                    etsVar = (ets) fbkVar;
                    int i23 = etsVar.f62795b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        etsVar.f62795b = i23 - Integer.MIN_VALUE;
                    } else {
                        etsVar = new ets(this, fbkVar);
                    }
                } else {
                    etsVar = new ets(this, fbkVar);
                }
                Object obj13 = etsVar.f62794a;
                int i24 = etsVar.f62795b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    qho qhoVar4 = (qho) obj;
                    oho ohoVar4 = qhoVar4 instanceof oho ? (oho) qhoVar4 : null;
                    Set set = ohoVar4 != null ? (Set) ohoVar4.f165512a : null;
                    if (set != null) {
                        etsVar.f62795b = 1;
                        Object objEmit12 = this.f11467b.emit(set, etsVar);
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
                if (fbkVar instanceof gts) {
                    gtsVar = (gts) fbkVar;
                    int i25 = gtsVar.f84265b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        gtsVar.f84265b = i25 - Integer.MIN_VALUE;
                    } else {
                        gtsVar = new gts(this, fbkVar);
                    }
                } else {
                    gtsVar = new gts(this, fbkVar);
                }
                Object obj14 = gtsVar.f84264a;
                int i26 = gtsVar.f84265b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    ty80 ty80Var = (ty80) obj;
                    Boolean boolValueOf5 = Boolean.valueOf(ty80Var.f224877f.f271278w.f156638b && !ty80Var.f224879h);
                    gtsVar.f84265b = 1;
                    Object objEmit13 = this.f11467b.emit(boolValueOf5, gtsVar);
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
                if (fbkVar instanceof kts) {
                    ktsVar = (kts) fbkVar;
                    int i27 = ktsVar.f126389b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ktsVar.f126389b = i27 - Integer.MIN_VALUE;
                    } else {
                        ktsVar = new kts(this, fbkVar);
                    }
                } else {
                    ktsVar = new kts(this, fbkVar);
                }
                Object obj15 = ktsVar.f126388a;
                int i28 = ktsVar.f126389b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    qho qhoVar5 = (qho) obj;
                    oho ohoVar5 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                    Set set2 = ohoVar5 != null ? (Set) ohoVar5.f165512a : null;
                    if (set2 != null) {
                        ktsVar.f126389b = 1;
                        Object objEmit14 = this.f11467b.emit(set2, ktsVar);
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
                if (fbkVar instanceof ots) {
                    otsVar = (ots) fbkVar;
                    int i29 = otsVar.f170088b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        otsVar.f170088b = i29 - Integer.MIN_VALUE;
                    } else {
                        otsVar = new ots(this, fbkVar);
                    }
                } else {
                    otsVar = new ots(this, fbkVar);
                }
                Object obj16 = otsVar.f170087a;
                int i30 = otsVar.f170088b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    qho qhoVar6 = (qho) obj;
                    oho ohoVar6 = qhoVar6 instanceof oho ? (oho) qhoVar6 : null;
                    i490 i490Var3 = ohoVar6 != null ? (i490) ohoVar6.f165512a : null;
                    if (i490Var3 != null) {
                        otsVar.f170088b = 1;
                        Object objEmit15 = this.f11467b.emit(i490Var3, otsVar);
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
                if (fbkVar instanceof xxs) {
                    xxsVar = (xxs) fbkVar;
                    int i31 = xxsVar.f267057b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        xxsVar.f267057b = i31 - Integer.MIN_VALUE;
                    } else {
                        xxsVar = new xxs(this, fbkVar);
                    }
                } else {
                    xxsVar = new xxs(this, fbkVar);
                }
                Object obj17 = xxsVar.f267056a;
                int i32 = xxsVar.f267057b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    xvs xvsVar = (xvs) obj;
                    yws ywsVar = new yws(new l6a0((qu80) xvsVar.f266470a.m68971d(), xvsVar.f266471b, xvsVar.f266472c, xvsVar.f266473d));
                    xxsVar.f267057b = 1;
                    Object objEmit16 = this.f11467b.emit(ywsVar, xxsVar);
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
                if (fbkVar instanceof qys) {
                    qysVar = (qys) fbkVar;
                    int i33 = qysVar.f194023b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        qysVar.f194023b = i33 - Integer.MIN_VALUE;
                    } else {
                        qysVar = new qys(this, fbkVar);
                    }
                } else {
                    qysVar = new qys(this, fbkVar);
                }
                Object obj18 = qysVar.f194022a;
                int i34 = qysVar.f194023b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    qu80 qu80Var = (qu80) ((xvs) obj).f266470a.m68970c();
                    if (qu80Var == null || (list = qu80Var.f192598d) == null) {
                        setM43736n1 = null;
                    } else {
                        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((nw80) it.next()).f159047a);
                        }
                        setM43736n1 = g6f.m43736n1(arrayList);
                    }
                    if (setM43736n1 == null) {
                        setM43736n1 = gbu.f78413a;
                    }
                    qysVar.f194023b = 1;
                    Object objEmit17 = this.f11467b.emit(setM43736n1, qysVar);
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
                if (fbkVar instanceof w0t) {
                    w0tVar = (w0t) fbkVar;
                    int i35 = w0tVar.f246814b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        w0tVar.f246814b = i35 - Integer.MIN_VALUE;
                    } else {
                        w0tVar = new w0t(this, fbkVar);
                    }
                } else {
                    w0tVar = new w0t(this, fbkVar);
                }
                Object obj19 = w0tVar.f246813a;
                int i36 = w0tVar.f246814b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    ae50 ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
                    ArrayList<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> arrayList2 = new ArrayList();
                    for (Object obj20 : ae50VarM98196n) {
                        if (((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj20).hasPlaylist()) {
                            arrayList2.add(obj20);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                    for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : arrayList2) {
                        arrayList3.add(new klp0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getName(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98292B(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98299t()));
                    }
                    w0tVar.f246814b = 1;
                    Object objEmit18 = this.f11467b.emit(arrayList3, w0tVar);
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
                if (fbkVar instanceof g1t) {
                    g1tVar = (g1t) fbkVar;
                    int i37 = g1tVar.f75714b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        g1tVar.f75714b = i37 - Integer.MIN_VALUE;
                    } else {
                        g1tVar = new g1t(this, fbkVar);
                    }
                } else {
                    g1tVar = new g1t(this, fbkVar);
                }
                Object obj21 = g1tVar.f75713a;
                int i38 = g1tVar.f75714b;
                if (i38 == 0) {
                    bga.m29073P(obj21);
                    e1t e1tVar = new e1t((Set) obj);
                    g1tVar.f75714b = 1;
                    Object objEmit19 = this.f11467b.emit(e1tVar, g1tVar);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof h1t) {
                    h1tVar = (h1t) fbkVar;
                    int i39 = h1tVar.f86697b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        h1tVar.f86697b = i39 - Integer.MIN_VALUE;
                    } else {
                        h1tVar = new h1t(this, fbkVar);
                    }
                } else {
                    h1tVar = new h1t(this, fbkVar);
                }
                Object obj22 = h1tVar.f86696a;
                int i40 = h1tVar.f86697b;
                if (i40 == 0) {
                    bga.m29073P(obj22);
                    Boolean boolValueOf6 = Boolean.valueOf(((List) obj).isEmpty());
                    h1tVar.f86697b = 1;
                    Object objEmit20 = this.f11467b.emit(boolValueOf6, h1tVar);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof i1t) {
                    i1tVar = (i1t) fbkVar;
                    int i41 = i1tVar.f97588b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        i1tVar.f97588b = i41 - Integer.MIN_VALUE;
                    } else {
                        i1tVar = new i1t(this, fbkVar);
                    }
                } else {
                    i1tVar = new i1t(this, fbkVar);
                }
                Object obj23 = i1tVar.f97587a;
                int i42 = i1tVar.f97588b;
                if (i42 == 0) {
                    bga.m29073P(obj23);
                    d1t d1tVar = new d1t(((Boolean) obj).booleanValue());
                    i1tVar.f97588b = 1;
                    Object objEmit21 = this.f11467b.emit(d1tVar, i1tVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof n1t) {
                    n1tVar = (n1t) fbkVar;
                    int i43 = n1tVar.f149506b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n1tVar.f149506b = i43 - Integer.MIN_VALUE;
                    } else {
                        n1tVar = new n1t(this, fbkVar);
                    }
                } else {
                    n1tVar = new n1t(this, fbkVar);
                }
                Object obj24 = n1tVar.f149505a;
                int i44 = n1tVar.f149506b;
                if (i44 == 0) {
                    bga.m29073P(obj24);
                    List list2 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(list2, 10));
                    int i45 = 0;
                    for (Object obj25 : list2) {
                        int i46 = i45 + 1;
                        if (i45 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        klp0 klp0Var = (klp0) obj25;
                        arrayList4.add(new sec1(new tfr0(klp0Var.f123936a, i45, klp0Var.f123937b, klp0Var.f123939d), "privacy_".concat(klp0Var.f123938c)));
                        i45 = i46;
                    }
                    n1tVar.f149506b = 1;
                    Object objEmit22 = this.f11467b.emit(arrayList4, n1tVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof z1t) {
                    z1tVar = (z1t) fbkVar;
                    int i47 = z1tVar.f278414b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        z1tVar.f278414b = i47 - Integer.MIN_VALUE;
                    } else {
                        z1tVar = new z1t(this, fbkVar);
                    }
                } else {
                    z1tVar = new z1t(this, fbkVar);
                }
                Object obj26 = z1tVar.f278413a;
                int i48 = z1tVar.f278414b;
                if (i48 == 0) {
                    bga.m29073P(obj26);
                    List list3 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(i6f.m49804T(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((klp0) it2.next()).f123936a);
                    }
                    Set setM43736n2 = g6f.m43736n1(arrayList5);
                    z1tVar.f278414b = 1;
                    Object objEmit23 = this.f11467b.emit(setM43736n2, z1tVar);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof e2t) {
                    e2tVar = (e2t) fbkVar;
                    int i49 = e2tVar.f55516b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        e2tVar.f55516b = i49 - Integer.MIN_VALUE;
                    } else {
                        e2tVar = new e2t(this, fbkVar);
                    }
                } else {
                    e2tVar = new e2t(this, fbkVar);
                }
                Object obj27 = e2tVar.f55515a;
                int i50 = e2tVar.f55516b;
                if (i50 == 0) {
                    bga.m29073P(obj27);
                    ae50 ae50VarM98196n2 = ((YourLibraryResponse) obj).m98196n();
                    ArrayList<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> arrayList6 = new ArrayList();
                    for (Object obj28 : ae50VarM98196n2) {
                        if (((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj28).hasPlaylist()) {
                            arrayList6.add(obj28);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                    for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2 : arrayList6) {
                        arrayList7.add(new llp0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.mo78647e().getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.mo78647e().getName(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.m98267w().m98292B(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.m98267w().m98295o(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity2.m98267w().m98299t()));
                    }
                    e2tVar.f55516b = 1;
                    Object objEmit24 = this.f11467b.emit(arrayList7, e2tVar);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof q2t) {
                    q2tVar = (q2t) fbkVar;
                    int i51 = q2tVar.f184712b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        q2tVar.f184712b = i51 - Integer.MIN_VALUE;
                    } else {
                        q2tVar = new q2t(this, fbkVar);
                    }
                } else {
                    q2tVar = new q2t(this, fbkVar);
                }
                Object obj29 = q2tVar.f184711a;
                int i52 = q2tVar.f184712b;
                if (i52 == 0) {
                    bga.m29073P(obj29);
                    o2t o2tVar = new o2t((Set) obj);
                    q2tVar.f184712b = 1;
                    Object objEmit25 = this.f11467b.emit(o2tVar, q2tVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof r2t) {
                    r2tVar = (r2t) fbkVar;
                    int i53 = r2tVar.f195225b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        r2tVar.f195225b = i53 - Integer.MIN_VALUE;
                    } else {
                        r2tVar = new r2t(this, fbkVar);
                    }
                } else {
                    r2tVar = new r2t(this, fbkVar);
                }
                Object obj30 = r2tVar.f195224a;
                int i54 = r2tVar.f195225b;
                if (i54 == 0) {
                    bga.m29073P(obj30);
                    Boolean boolValueOf7 = Boolean.valueOf(((List) obj).isEmpty());
                    r2tVar.f195225b = 1;
                    Object objEmit26 = this.f11467b.emit(boolValueOf7, r2tVar);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof t2t) {
                    t2tVar = (t2t) fbkVar;
                    int i55 = t2tVar.f216621b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        t2tVar.f216621b = i55 - Integer.MIN_VALUE;
                    } else {
                        t2tVar = new t2t(this, fbkVar);
                    }
                } else {
                    t2tVar = new t2t(this, fbkVar);
                }
                Object obj31 = t2tVar.f216620a;
                int i56 = t2tVar.f216621b;
                if (i56 == 0) {
                    bga.m29073P(obj31);
                    Boolean boolValueOf8 = Boolean.valueOf(((List) obj).isEmpty());
                    t2tVar.f216621b = 1;
                    Object objEmit27 = this.f11467b.emit(boolValueOf8, t2tVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof u2t) {
                    u2tVar = (u2t) fbkVar;
                    int i57 = u2tVar.f226164b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        u2tVar.f226164b = i57 - Integer.MIN_VALUE;
                    } else {
                        u2tVar = new u2t(this, fbkVar);
                    }
                } else {
                    u2tVar = new u2t(this, fbkVar);
                }
                Object obj32 = u2tVar.f226163a;
                int i58 = u2tVar.f226164b;
                if (i58 == 0) {
                    bga.m29073P(obj32);
                    l2t l2tVar = new l2t(((Boolean) obj).booleanValue());
                    u2tVar.f226164b = 1;
                    Object objEmit28 = this.f11467b.emit(l2tVar, u2tVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof y2t) {
                    y2tVar = (y2t) fbkVar;
                    int i59 = y2tVar.f268676b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        y2tVar.f268676b = i59 - Integer.MIN_VALUE;
                    } else {
                        y2tVar = new y2t(this, fbkVar);
                    }
                } else {
                    y2tVar = new y2t(this, fbkVar);
                }
                Object obj33 = y2tVar.f268675a;
                int i60 = y2tVar.f268676b;
                if (i60 == 0) {
                    bga.m29073P(obj33);
                    List list4 = (List) obj;
                    ArrayList arrayList8 = new ArrayList(i6f.m49804T(list4, 10));
                    int i61 = 0;
                    for (Object obj34 : list4) {
                        int i62 = i61 + 1;
                        if (i61 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        llp0 llp0Var = (llp0) obj34;
                        arrayList8.add(new sec1(new d7t0(i61, llp0Var.f134680a, llp0Var.f134681b, llp0Var.f134683d, llp0Var.f134684e), "published_".concat(llp0Var.f134682c)));
                        i61 = i62;
                    }
                    y2tVar.f268676b = 1;
                    Object objEmit29 = this.f11467b.emit(arrayList8, y2tVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof z2t) {
                    z2tVar = (z2t) fbkVar;
                    int i63 = z2tVar.f278664b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        z2tVar.f278664b = i63 - Integer.MIN_VALUE;
                    } else {
                        z2tVar = new z2t(this, fbkVar);
                    }
                } else {
                    z2tVar = new z2t(this, fbkVar);
                }
                Object obj35 = z2tVar.f278663a;
                int i64 = z2tVar.f278664b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i64 != 0) {
                    if (i64 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                Object objSingletonList = ((List) obj).isEmpty() ? lau.f131415a : Collections.singletonList(new sec1(w2a1Var, "publishable_heading"));
                z2tVar.f278664b = 1;
                Object objEmit30 = this.f11467b.emit(objSingletonList, z2tVar);
                yuk yukVar30 = yuk.f276404a;
                return objEmit30 == yukVar30 ? yukVar30 : w2a1Var;
        }
    }
}
