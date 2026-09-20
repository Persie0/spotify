package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class fmb1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f71008b;

    public /* synthetic */ fmb1(niz nizVar, int i) {
        this.f71007a = i;
        this.f71008b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0236  */
    /* JADX WARN: Code duplicated, block: B:162:0x029f  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0322  */
    /* JADX WARN: Code duplicated, block: B:217:0x0366  */
    /* JADX WARN: Code duplicated, block: B:238:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:261:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:277:0x0440  */
    /* JADX WARN: Code duplicated, block: B:298:0x048c  */
    /* JADX WARN: Code duplicated, block: B:314:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:330:0x0511  */
    /* JADX WARN: Code duplicated, block: B:355:0x0560  */
    /* JADX WARN: Code duplicated, block: B:371:0x059d  */
    /* JADX WARN: Code duplicated, block: B:387:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:403:0x0622  */
    /* JADX WARN: Code duplicated, block: B:424:0x066e  */
    /* JADX WARN: Code duplicated, block: B:440:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:456:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:477:0x0730  */
    /* JADX WARN: Code duplicated, block: B:493:0x076c  */
    /* JADX WARN: Code duplicated, block: B:511:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:527:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:548:0x082e  */
    /* JADX WARN: Code duplicated, block: B:564:0x086a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        emb1 emb1Var;
        gmb1 gmb1Var;
        hmb1 hmb1Var;
        imb1 imb1Var;
        kmb1 kmb1Var;
        lmb1 lmb1Var;
        mmb1 mmb1Var;
        nmb1 nmb1Var;
        hob1 hob1Var;
        lrb1 lrb1Var;
        orb1 orb1Var;
        prb1 prb1Var;
        rrb1 rrb1Var;
        kub1 kub1Var;
        hz80 hz80Var;
        uub1 uub1Var;
        wub1 wub1Var;
        yub1 yub1Var;
        zub1 zub1Var;
        rvb1 rvb1Var;
        tvb1 tvb1Var;
        yvb1 yvb1Var;
        zvb1 zvb1Var;
        czb1 czb1Var;
        dzb1 dzb1Var;
        fzb1 fzb1Var;
        b1c1 b1c1Var;
        t6c1 t6c1Var;
        v9c1 v9c1Var;
        uac1 uac1Var;
        akc1 akc1Var;
        int i = this.f71007a;
        boolean z = false;
        Object p6c1Var = null;
        objValueOf = null;
        Object objValueOf = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f71008b;
        Object obj2 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof emb1) {
                    emb1Var = (emb1) fbkVar;
                    int i2 = emb1Var.f60869b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        emb1Var.f60869b = i2 - Integer.MIN_VALUE;
                    } else {
                        emb1Var = new emb1(this, fbkVar);
                    }
                } else {
                    emb1Var = new emb1(this, fbkVar);
                }
                Object obj3 = emb1Var.f60868a;
                int i3 = emb1Var.f60869b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                emb1Var.f60869b = 1;
                return nizVar.emit(obj, emb1Var) == obj2 ? obj2 : w2a1Var;
            case 1:
                if (fbkVar instanceof gmb1) {
                    gmb1Var = (gmb1) fbkVar;
                    int i4 = gmb1Var.f81361b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        gmb1Var.f81361b = i4 - Integer.MIN_VALUE;
                    } else {
                        gmb1Var = new gmb1(this, fbkVar);
                    }
                } else {
                    gmb1Var = new gmb1(this, fbkVar);
                }
                Object obj4 = gmb1Var.f81360a;
                int i5 = gmb1Var.f81361b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                Object w5p0Var = new w5p0((jt0) obj);
                gmb1Var.f81361b = 1;
                return nizVar.emit(w5p0Var, gmb1Var) == obj2 ? obj2 : w2a1Var;
            case 2:
                if (fbkVar instanceof hmb1) {
                    hmb1Var = (hmb1) fbkVar;
                    int i6 = hmb1Var.f92884b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        hmb1Var.f92884b = i6 - Integer.MIN_VALUE;
                    } else {
                        hmb1Var = new hmb1(this, fbkVar);
                    }
                } else {
                    hmb1Var = new hmb1(this, fbkVar);
                }
                Object obj5 = hmb1Var.f92883a;
                int i7 = hmb1Var.f92884b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Object objValueOf2 = Boolean.valueOf(z);
                hmb1Var.f92884b = 1;
                return nizVar.emit(objValueOf2, hmb1Var) == obj2 ? obj2 : w2a1Var;
            case 3:
                if (fbkVar instanceof imb1) {
                    imb1Var = (imb1) fbkVar;
                    int i8 = imb1Var.f103665b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        imb1Var.f103665b = i8 - Integer.MIN_VALUE;
                    } else {
                        imb1Var = new imb1(this, fbkVar);
                    }
                } else {
                    imb1Var = new imb1(this, fbkVar);
                }
                Object obj6 = imb1Var.f103664a;
                int i9 = imb1Var.f103665b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                ((Boolean) obj).getClass();
                imb1Var.f103665b = 1;
                return nizVar.emit(zx6.f287222a, imb1Var) == obj2 ? obj2 : w2a1Var;
            case 4:
                if (fbkVar instanceof kmb1) {
                    kmb1Var = (kmb1) fbkVar;
                    int i10 = kmb1Var.f124104b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        kmb1Var.f124104b = i10 - Integer.MIN_VALUE;
                    } else {
                        kmb1Var = new kmb1(this, fbkVar);
                    }
                } else {
                    kmb1Var = new kmb1(this, fbkVar);
                }
                Object obj7 = kmb1Var.f124103a;
                int i11 = kmb1Var.f124104b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                kmb1Var.f124104b = 1;
                return nizVar.emit(obj, kmb1Var) == obj2 ? obj2 : w2a1Var;
            case 5:
                if (fbkVar instanceof lmb1) {
                    lmb1Var = (lmb1) fbkVar;
                    int i12 = lmb1Var.f134851b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        lmb1Var.f134851b = i12 - Integer.MIN_VALUE;
                    } else {
                        lmb1Var = new lmb1(this, fbkVar);
                    }
                } else {
                    lmb1Var = new lmb1(this, fbkVar);
                }
                Object obj8 = lmb1Var.f134850a;
                int i13 = lmb1Var.f134851b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                Object x5p0Var = new x5p0((jt0) obj);
                lmb1Var.f134851b = 1;
                return nizVar.emit(x5p0Var, lmb1Var) == obj2 ? obj2 : w2a1Var;
            case 6:
                if (fbkVar instanceof mmb1) {
                    mmb1Var = (mmb1) fbkVar;
                    int i14 = mmb1Var.f145116b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        mmb1Var.f145116b = i14 - Integer.MIN_VALUE;
                    } else {
                        mmb1Var = new mmb1(this, fbkVar);
                    }
                } else {
                    mmb1Var = new mmb1(this, fbkVar);
                }
                Object obj9 = mmb1Var.f145115a;
                int i15 = mmb1Var.f145116b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Object objValueOf3 = Boolean.valueOf(z);
                mmb1Var.f145116b = 1;
                return nizVar.emit(objValueOf3, mmb1Var) == obj2 ? obj2 : w2a1Var;
            case 7:
                if (fbkVar instanceof nmb1) {
                    nmb1Var = (nmb1) fbkVar;
                    int i16 = nmb1Var.f155398b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        nmb1Var.f155398b = i16 - Integer.MIN_VALUE;
                    } else {
                        nmb1Var = new nmb1(this, fbkVar);
                    }
                } else {
                    nmb1Var = new nmb1(this, fbkVar);
                }
                Object obj10 = nmb1Var.f155397a;
                int i17 = nmb1Var.f155398b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                ((Boolean) obj).getClass();
                Object obj11 = ay6.f21111a;
                nmb1Var.f155398b = 1;
                return nizVar.emit(obj11, nmb1Var) == obj2 ? obj2 : w2a1Var;
            case 8:
                if (fbkVar instanceof hob1) {
                    hob1Var = (hob1) fbkVar;
                    int i18 = hob1Var.f93494b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        hob1Var.f93494b = i18 - Integer.MIN_VALUE;
                    } else {
                        hob1Var = new hob1(this, fbkVar);
                    }
                } else {
                    hob1Var = new hob1(this, fbkVar);
                }
                Object obj12 = hob1Var.f93493a;
                int i19 = hob1Var.f93494b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                Object l = new Long(((job1) obj).f114384a);
                hob1Var.f93494b = 1;
                return nizVar.emit(l, hob1Var) == obj2 ? obj2 : w2a1Var;
            case 9:
                if (fbkVar instanceof lrb1) {
                    lrb1Var = (lrb1) fbkVar;
                    int i20 = lrb1Var.f136255b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        lrb1Var.f136255b = i20 - Integer.MIN_VALUE;
                    } else {
                        lrb1Var = new lrb1(this, fbkVar);
                    }
                } else {
                    lrb1Var = new lrb1(this, fbkVar);
                }
                Object obj13 = lrb1Var.f136254a;
                int i21 = lrb1Var.f136255b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                Object objValueOf4 = Boolean.valueOf(ohoVar != null ? ((Boolean) ohoVar.f165512a).booleanValue() : false);
                lrb1Var.f136255b = 1;
                return nizVar.emit(objValueOf4, lrb1Var) == obj2 ? obj2 : w2a1Var;
            case 10:
                if (fbkVar instanceof orb1) {
                    orb1Var = (orb1) fbkVar;
                    int i22 = orb1Var.f168528b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        orb1Var.f168528b = i22 - Integer.MIN_VALUE;
                    } else {
                        orb1Var = new orb1(this, fbkVar);
                    }
                } else {
                    orb1Var = new orb1(this, fbkVar);
                }
                Object obj14 = orb1Var.f168527a;
                int i23 = orb1Var.f168528b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                Object objValueOf5 = Boolean.valueOf(qub1.m73895a((Map) obj));
                orb1Var.f168528b = 1;
                return nizVar.emit(objValueOf5, orb1Var) == obj2 ? obj2 : w2a1Var;
            case 11:
                if (fbkVar instanceof prb1) {
                    prb1Var = (prb1) fbkVar;
                    int i24 = prb1Var.f180547b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        prb1Var.f180547b = i24 - Integer.MIN_VALUE;
                    } else {
                        prb1Var = new prb1(this, fbkVar);
                    }
                } else {
                    prb1Var = new prb1(this, fbkVar);
                }
                Object obj15 = prb1Var.f180546a;
                int i25 = prb1Var.f180547b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                ybv ybvVar = ((ty80) obj).f224877f;
                Object srb1Var = new srb1(ybvVar.f271252D, ybvVar.f271281z, ybvVar.f271278w, ybvVar.f271272q);
                prb1Var.f180547b = 1;
                return nizVar.emit(srb1Var, prb1Var) == obj2 ? obj2 : w2a1Var;
            case 12:
                if (fbkVar instanceof rrb1) {
                    rrb1Var = (rrb1) fbkVar;
                    int i26 = rrb1Var.f202012b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        rrb1Var.f202012b = i26 - Integer.MIN_VALUE;
                    } else {
                        rrb1Var = new rrb1(this, fbkVar);
                    }
                } else {
                    rrb1Var = new rrb1(this, fbkVar);
                }
                Object obj16 = rrb1Var.f202011a;
                int i27 = rrb1Var.f202012b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                Object objValueOf6 = Boolean.valueOf(((ty80) obj).f224879h);
                rrb1Var.f202012b = 1;
                return nizVar.emit(objValueOf6, rrb1Var) == obj2 ? obj2 : w2a1Var;
            case 13:
                if (fbkVar instanceof kub1) {
                    kub1Var = (kub1) fbkVar;
                    int i28 = kub1Var.f126503b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        kub1Var.f126503b = i28 - Integer.MIN_VALUE;
                    } else {
                        kub1Var = new kub1(this, fbkVar);
                    }
                } else {
                    kub1Var = new kub1(this, fbkVar);
                }
                Object obj17 = kub1Var.f126502a;
                int i29 = kub1Var.f126503b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                qho qhoVar2 = (qho) obj;
                oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                if (ohoVar2 != null && (hz80Var = (hz80) ohoVar2.f165512a) != null) {
                    objValueOf = Boolean.valueOf(hz80Var.f96821V0);
                }
                if (objValueOf == null) {
                    return w2a1Var;
                }
                kub1Var.f126503b = 1;
                return nizVar.emit(objValueOf, kub1Var) == obj2 ? obj2 : w2a1Var;
            case 14:
                if (fbkVar instanceof uub1) {
                    uub1Var = (uub1) fbkVar;
                    int i30 = uub1Var.f234146b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        uub1Var.f234146b = i30 - Integer.MIN_VALUE;
                    } else {
                        uub1Var = new uub1(this, fbkVar);
                    }
                } else {
                    uub1Var = new uub1(this, fbkVar);
                }
                Object obj18 = uub1Var.f234145a;
                int i31 = uub1Var.f234146b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Object objValueOf7 = Boolean.valueOf(qub1.m73895a((Map) obj));
                uub1Var.f234146b = 1;
                return nizVar.emit(objValueOf7, uub1Var) == obj2 ? obj2 : w2a1Var;
            case 15:
                if (fbkVar instanceof wub1) {
                    wub1Var = (wub1) fbkVar;
                    int i32 = wub1Var.f255133b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        wub1Var.f255133b = i32 - Integer.MIN_VALUE;
                    } else {
                        wub1Var = new wub1(this, fbkVar);
                    }
                } else {
                    wub1Var = new wub1(this, fbkVar);
                }
                Object obj19 = wub1Var.f255132a;
                int i33 = wub1Var.f255133b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                ybv ybvVar2 = ((ty80) obj).f224877f;
                Object srb1Var2 = new srb1(ybvVar2.f271252D, ybvVar2.f271281z, ybvVar2.f271278w, ybvVar2.f271272q);
                wub1Var.f255133b = 1;
                return nizVar.emit(srb1Var2, wub1Var) == obj2 ? obj2 : w2a1Var;
            case 16:
                if (fbkVar instanceof yub1) {
                    yub1Var = (yub1) fbkVar;
                    int i34 = yub1Var.f276305b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        yub1Var.f276305b = i34 - Integer.MIN_VALUE;
                    } else {
                        yub1Var = new yub1(this, fbkVar);
                    }
                } else {
                    yub1Var = new yub1(this, fbkVar);
                }
                Object obj20 = yub1Var.f276304a;
                int i35 = yub1Var.f276305b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                qho qhoVar3 = (qho) obj;
                oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                Object objValueOf8 = Boolean.valueOf(ohoVar3 != null ? ((Boolean) ohoVar3.f165512a).booleanValue() : false);
                yub1Var.f276305b = 1;
                return nizVar.emit(objValueOf8, yub1Var) == obj2 ? obj2 : w2a1Var;
            case 17:
                if (fbkVar instanceof zub1) {
                    zub1Var = (zub1) fbkVar;
                    int i36 = zub1Var.f286403b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        zub1Var.f286403b = i36 - Integer.MIN_VALUE;
                    } else {
                        zub1Var = new zub1(this, fbkVar);
                    }
                } else {
                    zub1Var = new zub1(this, fbkVar);
                }
                Object obj21 = zub1Var.f286402a;
                int i37 = zub1Var.f286403b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                ty80 ty80Var = (ty80) obj;
                Object sub1Var = new sub1(wrf0.m88857a(ty80Var.f224877f.f271272q), ty80Var.f224879h);
                zub1Var.f286403b = 1;
                return nizVar.emit(sub1Var, zub1Var) == obj2 ? obj2 : w2a1Var;
            case 18:
                if (fbkVar instanceof rvb1) {
                    rvb1Var = (rvb1) fbkVar;
                    int i38 = rvb1Var.f203046b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        rvb1Var.f203046b = i38 - Integer.MIN_VALUE;
                    } else {
                        rvb1Var = new rvb1(this, fbkVar);
                    }
                } else {
                    rvb1Var = new rvb1(this, fbkVar);
                }
                Object obj22 = rvb1Var.f203045a;
                int i39 = rvb1Var.f203046b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                qho qhoVar4 = (qho) obj;
                oho ohoVar4 = qhoVar4 instanceof oho ? (oho) qhoVar4 : null;
                Object obj23 = ohoVar4 != null ? (Boolean) ohoVar4.f165512a : null;
                if (obj23 == null) {
                    return w2a1Var;
                }
                rvb1Var.f203046b = 1;
                return nizVar.emit(obj23, rvb1Var) == obj2 ? obj2 : w2a1Var;
            case 19:
                if (fbkVar instanceof tvb1) {
                    tvb1Var = (tvb1) fbkVar;
                    int i40 = tvb1Var.f224114b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        tvb1Var.f224114b = i40 - Integer.MIN_VALUE;
                    } else {
                        tvb1Var = new tvb1(this, fbkVar);
                    }
                } else {
                    tvb1Var = new tvb1(this, fbkVar);
                }
                Object obj24 = tvb1Var.f224113a;
                int i41 = tvb1Var.f224114b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                qho qhoVar5 = (qho) obj;
                oho ohoVar5 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                Object objValueOf9 = Boolean.valueOf(ohoVar5 != null ? ((Boolean) ohoVar5.f165512a).booleanValue() : false);
                tvb1Var.f224114b = 1;
                return nizVar.emit(objValueOf9, tvb1Var) == obj2 ? obj2 : w2a1Var;
            case 20:
                if (fbkVar instanceof yvb1) {
                    yvb1Var = (yvb1) fbkVar;
                    int i42 = yvb1Var.f276640b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        yvb1Var.f276640b = i42 - Integer.MIN_VALUE;
                    } else {
                        yvb1Var = new yvb1(this, fbkVar);
                    }
                } else {
                    yvb1Var = new yvb1(this, fbkVar);
                }
                Object obj25 = yvb1Var.f276639a;
                int i43 = yvb1Var.f276640b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                e301 e301Var = (e301) obj;
                if (!e301Var.f55572b || e301Var.f55571a.length() <= 0) {
                    return w2a1Var;
                }
                yvb1Var.f276640b = 1;
                return nizVar.emit(obj, yvb1Var) == obj2 ? obj2 : w2a1Var;
            case 21:
                if (fbkVar instanceof zvb1) {
                    zvb1Var = (zvb1) fbkVar;
                    int i44 = zvb1Var.f286680b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        zvb1Var.f286680b = i44 - Integer.MIN_VALUE;
                    } else {
                        zvb1Var = new zvb1(this, fbkVar);
                    }
                } else {
                    zvb1Var = new zvb1(this, fbkVar);
                }
                Object obj26 = zvb1Var.f286679a;
                int i45 = zvb1Var.f286680b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                Object obj27 = ((e301) obj).f55571a;
                zvb1Var.f286680b = 1;
                return nizVar.emit(obj27, zvb1Var) == obj2 ? obj2 : w2a1Var;
            case 22:
                if (fbkVar instanceof czb1) {
                    czb1Var = (czb1) fbkVar;
                    int i46 = czb1Var.f43521b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        czb1Var.f43521b = i46 - Integer.MIN_VALUE;
                    } else {
                        czb1Var = new czb1(this, fbkVar);
                    }
                } else {
                    czb1Var = new czb1(this, fbkVar);
                }
                Object obj28 = czb1Var.f43520a;
                int i47 = czb1Var.f43521b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                PlayerState playerState3 = (PlayerState) obj;
                wj50.m88279p(playerState3);
                ContextTrack contextTrack = (ContextTrack) playerState3.track().mo49283h();
                Object objUri = contextTrack != null ? contextTrack.uri() : null;
                czb1Var.f43521b = 1;
                return nizVar.emit(objUri, czb1Var) == obj2 ? obj2 : w2a1Var;
            case 23:
                if (fbkVar instanceof dzb1) {
                    dzb1Var = (dzb1) fbkVar;
                    int i48 = dzb1Var.f54613b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        dzb1Var.f54613b = i48 - Integer.MIN_VALUE;
                    } else {
                        dzb1Var = new dzb1(this, fbkVar);
                    }
                } else {
                    dzb1Var = new dzb1(this, fbkVar);
                }
                Object obj29 = dzb1Var.f54612a;
                int i49 = dzb1Var.f54613b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                yk91 yk91Var = (yk91) obj;
                PlayerState playerState4 = (PlayerState) yk91Var.f273650a;
                s77 s77Var = (s77) yk91Var.f273651b;
                if (!((Boolean) yk91Var.f273652c).booleanValue() || !(s77Var instanceof q77)) {
                    return w2a1Var;
                }
                ContextTrack contextTrack2 = (ContextTrack) playerState4.track().mo49283h();
                if ((contextTrack2 != null ? (String) contextTrack2.metadata().get(ContextTrack.Metadata.KEY_ASSOCIATED_VIDEO_MANIFEST_ID) : null) == null) {
                    return w2a1Var;
                }
                dzb1Var.f54613b = 1;
                return nizVar.emit(obj, dzb1Var) == obj2 ? obj2 : w2a1Var;
            case 24:
                if (fbkVar instanceof fzb1) {
                    fzb1Var = (fzb1) fbkVar;
                    int i50 = fzb1Var.f74963b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        fzb1Var.f74963b = i50 - Integer.MIN_VALUE;
                    } else {
                        fzb1Var = new fzb1(this, fbkVar);
                    }
                } else {
                    fzb1Var = new fzb1(this, fbkVar);
                }
                Object obj30 = fzb1Var.f74962a;
                int i51 = fzb1Var.f74963b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                Object objValueOf10 = Boolean.valueOf(dxf1.m37222K((Map) obj));
                fzb1Var.f74963b = 1;
                return nizVar.emit(objValueOf10, fzb1Var) == obj2 ? obj2 : w2a1Var;
            case 25:
                if (fbkVar instanceof b1c1) {
                    b1c1Var = (b1c1) fbkVar;
                    int i52 = b1c1Var.f22292b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        b1c1Var.f22292b = i52 - Integer.MIN_VALUE;
                    } else {
                        b1c1Var = new b1c1(this, fbkVar);
                    }
                } else {
                    b1c1Var = new b1c1(this, fbkVar);
                }
                Object obj31 = b1c1Var.f22291a;
                int i53 = b1c1Var.f22292b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                Object objValueOf11 = Boolean.valueOf(((pe01) obj).f176601r == 1);
                b1c1Var.f22292b = 1;
                return nizVar.emit(objValueOf11, b1c1Var) == obj2 ? obj2 : w2a1Var;
            case 26:
                if (fbkVar instanceof t6c1) {
                    t6c1Var = (t6c1) fbkVar;
                    int i54 = t6c1Var.f217535b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        t6c1Var.f217535b = i54 - Integer.MIN_VALUE;
                    } else {
                        t6c1Var = new t6c1(this, fbkVar);
                    }
                } else {
                    t6c1Var = new t6c1(this, fbkVar);
                }
                Object obj32 = t6c1Var.f217534a;
                int i55 = t6c1Var.f217535b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                qho qhoVar6 = (qho) obj;
                if (qhoVar6 instanceof oho) {
                    List list = (List) ((oho) qhoVar6).f165512a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj33 : list) {
                        Set set = dd41.f47702f;
                        if (r46.m74726U(((dx80) obj33).f53899c).f47709c == gn80.TRACK) {
                            arrayList.add(obj33);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList<dx80> arrayList2 = new ArrayList();
                    for (Object obj34 : arrayList) {
                        if (hashSet.add(((dx80) obj34).f53899c)) {
                            arrayList2.add(obj34);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                    for (dx80 dx80Var : arrayList2) {
                        arrayList3.add(new g7c1(dx80Var.f53897a, dx80Var.f53899c));
                    }
                    p6c1Var = new p6c1(opo.m67574x(arrayList3));
                } else if (qhoVar6 instanceof nho) {
                    p6c1Var = o6c1.f162322a;
                } else if (!wj50.m88271j(qhoVar6, pho.f177693a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (p6c1Var == null) {
                    return w2a1Var;
                }
                t6c1Var.f217535b = 1;
                return nizVar.emit(p6c1Var, t6c1Var) == obj2 ? obj2 : w2a1Var;
            case 27:
                if (fbkVar instanceof v9c1) {
                    v9c1Var = (v9c1) fbkVar;
                    int i56 = v9c1Var.f238913b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        v9c1Var.f238913b = i56 - Integer.MIN_VALUE;
                    } else {
                        v9c1Var = new v9c1(this, fbkVar);
                    }
                } else {
                    v9c1Var = new v9c1(this, fbkVar);
                }
                Object obj35 = v9c1Var.f238912a;
                int i57 = v9c1Var.f238913b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                Object num = new Integer(edb.m38547C(((q4c1) obj).f185144a));
                v9c1Var.f238913b = 1;
                return nizVar.emit(num, v9c1Var) == obj2 ? obj2 : w2a1Var;
            case 28:
                if (fbkVar instanceof uac1) {
                    uac1Var = (uac1) fbkVar;
                    int i58 = uac1Var.f228450b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        uac1Var.f228450b = i58 - Integer.MIN_VALUE;
                    } else {
                        uac1Var = new uac1(this, fbkVar);
                    }
                } else {
                    uac1Var = new uac1(this, fbkVar);
                }
                Object obj36 = uac1Var.f228449a;
                int i59 = uac1Var.f228450b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj36);
                    return w2a1Var;
                }
                bga.m29073P(obj36);
                Object obj37 = (String) obj;
                if (obj37 == null) {
                    obj37 = "";
                }
                uac1Var.f228450b = 1;
                return nizVar.emit(obj37, uac1Var) == obj2 ? obj2 : w2a1Var;
            default:
                if (fbkVar instanceof akc1) {
                    akc1Var = (akc1) fbkVar;
                    int i60 = akc1Var.f16487b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        akc1Var.f16487b = i60 - Integer.MIN_VALUE;
                    } else {
                        akc1Var = new akc1(this, fbkVar);
                    }
                } else {
                    akc1Var = new akc1(this, fbkVar);
                }
                Object obj38 = akc1Var.f16486a;
                int i61 = akc1Var.f16487b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj38);
                    return w2a1Var;
                }
                bga.m29073P(obj38);
                Object objValueOf12 = Boolean.valueOf(((q890) obj) instanceof o890);
                akc1Var.f16487b = 1;
                return nizVar.emit(objValueOf12, akc1Var) == obj2 ? obj2 : w2a1Var;
        }
    }

    public /* synthetic */ fmb1(niz nizVar, Object obj, int i) {
        this.f71007a = i;
        this.f71008b = nizVar;
    }
}
