package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$ArchivePartyEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$ClosePartyEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$GoLiveEvent;
import com.spotify.liveroom.livestreampagefragment.p101v1.proto.LiveStreamStateMessage;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class gtt implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f84276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f84277c;

    public /* synthetic */ gtt(niz nizVar, String str, int i) {
        this.f84275a = i;
        this.f84276b = nizVar;
        this.f84277c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m45704b(Object obj, fbk fbkVar) {
        j1c0 j1c0Var;
        l2c0 l2c0Var;
        if (fbkVar instanceof j1c0) {
            j1c0Var = (j1c0) fbkVar;
            int i = j1c0Var.f107723b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j1c0Var.f107723b = i - Integer.MIN_VALUE;
            } else {
                j1c0Var = new j1c0(this, fbkVar);
            }
        } else {
            j1c0Var = new j1c0(this, fbkVar);
        }
        Object obj2 = j1c0Var.f107722a;
        int i2 = j1c0Var.f107723b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            r631 r631Var = (r631) obj;
            if (wj50.m88271j(r631Var, q631.f185661a)) {
                l2c0Var = new l2c0(this.f84277c);
            } else {
                if (!wj50.m88271j(r631Var, p631.f174278a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l2c0Var = null;
            }
            if (l2c0Var != null) {
                j1c0Var.f107723b = 1;
                Object objEmit = this.f84276b.emit(l2c0Var, j1c0Var);
                yuk yukVar = yuk.f276404a;
                if (objEmit == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    private final Object m45705c(Object obj, fbk fbkVar) {
        myd0 myd0Var;
        if (fbkVar instanceof myd0) {
            myd0Var = (myd0) fbkVar;
            int i = myd0Var.f148430b;
            if ((i & Integer.MIN_VALUE) != 0) {
                myd0Var.f148430b = i - Integer.MIN_VALUE;
            } else {
                myd0Var = new myd0(this, fbkVar);
            }
        } else {
            myd0Var = new myd0(this, fbkVar);
        }
        Object obj2 = myd0Var.f148429a;
        int i2 = myd0Var.f148430b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object obj3 = (List) ((Map) obj).get(this.f84277c);
            if (obj3 == null) {
                obj3 = lau.f131415a;
            }
            myd0Var.f148430b = 1;
            Object objEmit = this.f84276b.emit(obj3, myd0Var);
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    private final Object m45706d(Object obj, fbk fbkVar) {
        yff0 yff0Var;
        if (fbkVar instanceof yff0) {
            yff0Var = (yff0) fbkVar;
            int i = yff0Var.f272229b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yff0Var.f272229b = i - Integer.MIN_VALUE;
            } else {
                yff0Var = new yff0(this, fbkVar);
            }
        } else {
            yff0Var = new yff0(this, fbkVar);
        }
        Object obj2 = yff0Var.f272228a;
        int i2 = yff0Var.f272229b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ktx ktxVar = ((gqx) obj).mo45449a(ggf0.class, this.f84277c).f72301b;
            yff0Var.f272229b = 1;
            Object objEmit = this.f84276b.emit(ktxVar, yff0Var);
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
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:150:0x0242  */
    /* JADX WARN: Code duplicated, block: B:173:0x028a  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:227:0x0344  */
    /* JADX WARN: Code duplicated, block: B:243:0x0384  */
    /* JADX WARN: Code duplicated, block: B:315:0x0532  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:331:0x056d  */
    /* JADX WARN: Code duplicated, block: B:350:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:368:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:384:0x062a  */
    /* JADX WARN: Code duplicated, block: B:400:0x066b  */
    /* JADX WARN: Code duplicated, block: B:416:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:458:0x072f  */
    /* JADX WARN: Code duplicated, block: B:477:0x0776  */
    /* JADX WARN: Code duplicated, block: B:506:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:532:0x084e  */
    /* JADX WARN: Code duplicated, block: B:550:0x088c  */
    /* JADX WARN: Code duplicated, block: B:566:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:582:0x090f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:598:0x0955  */
    /* JADX WARN: Code duplicated, block: B:621:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x018b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
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
        ftt fttVar;
        htt httVar;
        itt ittVar;
        opv opvVar;
        wtv wtvVar;
        xtv xtvVar;
        w1w w1wVar;
        Object x6r0Var;
        w6w w6wVar;
        vlx vlxVar;
        zpx zpxVar;
        ps90 ps90Var;
        knd kndVar;
        String str;
        kmz kmzVar;
        smz smzVar;
        umz umzVar;
        zv00 zv00Var;
        a810 a810Var;
        p420 p420Var;
        av50 av50Var;
        Object objM46715L;
        n060 n060Var;
        f260 f260Var;
        hh60 hh60Var;
        ih60 ih60Var;
        s730 s730Var;
        kh60 kh60Var;
        Object objValueOf;
        mb90 mb90Var;
        sv60 sv60Var;
        sv80 sv80Var;
        rb90 rb90Var;
        sw90 sw90Var;
        LiveStreamStateMessage liveStreamStateMessage;
        c8i0 c8i0Var;
        int i = this.f84275a;
        obj = null;
        obj = null;
        Object obj2 = null;
        obj = null;
        obj = null;
        Object obj3 = null;
        str = null;
        str = null;
        String str2 = null;
        p6n0Var = null;
        Object p6n0Var = null;
        boolean z = false;
        w2a1 w2a1Var = w2a1.f247311a;
        String str3 = this.f84277c;
        niz nizVar = this.f84276b;
        Object obj4 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof ftt) {
                    fttVar = (ftt) fbkVar;
                    int i2 = fttVar.f73301b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fttVar.f73301b = i2 - Integer.MIN_VALUE;
                    } else {
                        fttVar = new ftt(this, fbkVar);
                    }
                } else {
                    fttVar = new ftt(this, fbkVar);
                }
                Object obj5 = fttVar.f73300a;
                int i3 = fttVar.f73301b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                Object objValueOf2 = Boolean.valueOf(cjc.m32944j(str3, ((PlayerState) obj).contextUri()));
                fttVar.f73301b = 1;
                return nizVar.emit(objValueOf2, fttVar) == obj4 ? obj4 : w2a1Var;
            case 1:
                if (fbkVar instanceof htt) {
                    httVar = (htt) fbkVar;
                    int i4 = httVar.f95165b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        httVar.f95165b = i4 - Integer.MIN_VALUE;
                    } else {
                        httVar = new htt(this, fbkVar);
                    }
                } else {
                    httVar = new htt(this, fbkVar);
                }
                Object obj6 = httVar.f95164a;
                int i5 = httVar.f95165b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused() && cjc.m32944j(str3, playerState.contextUri())) {
                    z = true;
                }
                Object objValueOf3 = Boolean.valueOf(z);
                httVar.f95165b = 1;
                return nizVar.emit(objValueOf3, httVar) == obj4 ? obj4 : w2a1Var;
            case 2:
                if (fbkVar instanceof itt) {
                    ittVar = (itt) fbkVar;
                    int i6 = ittVar.f105737b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ittVar.f105737b = i6 - Integer.MIN_VALUE;
                    } else {
                        ittVar = new itt(this, fbkVar);
                    }
                } else {
                    ittVar = new itt(this, fbkVar);
                }
                Object obj7 = ittVar.f105736a;
                int i7 = ittVar.f105737b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                PlayerState playerState2 = (PlayerState) obj;
                wj50.m88279p(playerState2);
                Object objValueOf4 = Boolean.valueOf(hdi.m47210B(playerState2).equals(str3));
                ittVar.f105737b = 1;
                return nizVar.emit(objValueOf4, ittVar) == obj4 ? obj4 : w2a1Var;
            case 3:
                if (fbkVar instanceof opv) {
                    opvVar = (opv) fbkVar;
                    int i8 = opvVar.f168028b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        opvVar.f168028b = i8 - Integer.MIN_VALUE;
                    } else {
                        opvVar = new opv(this, fbkVar);
                    }
                } else {
                    opvVar = new opv(this, fbkVar);
                }
                Object obj8 = opvVar.f168027a;
                int i9 = opvVar.f168028b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                C1727c3 c1727c3 = new C1727c3((String) obj, str3);
                Object objSingletonList = Collections.singletonList(new sec1(c1727c3, c1727c3));
                opvVar.f168028b = 1;
                return nizVar.emit(objSingletonList, opvVar) == obj4 ? obj4 : w2a1Var;
            case 4:
                if (fbkVar instanceof wtv) {
                    wtvVar = (wtv) fbkVar;
                    int i10 = wtvVar.f255021b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wtvVar.f255021b = i10 - Integer.MIN_VALUE;
                    } else {
                        wtvVar = new wtv(this, fbkVar);
                    }
                } else {
                    wtvVar = new wtv(this, fbkVar);
                }
                Object obj9 = wtvVar.f255020a;
                int i11 = wtvVar.f255021b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                Object pqm0Var = new pqm0(str3, ((e410) obj).f55926a);
                wtvVar.f255021b = 1;
                return nizVar.emit(pqm0Var, wtvVar) == obj4 ? obj4 : w2a1Var;
            case 5:
                if (fbkVar instanceof xtv) {
                    xtvVar = (xtv) fbkVar;
                    int i12 = xtvVar.f265932b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        xtvVar.f265932b = i12 - Integer.MIN_VALUE;
                    } else {
                        xtvVar = new xtv(this, fbkVar);
                    }
                } else {
                    xtvVar = new xtv(this, fbkVar);
                }
                Object obj10 = xtvVar.f265931a;
                int i13 = xtvVar.f265932b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                if (!wj50.m88271j((String) obj, str3)) {
                    return w2a1Var;
                }
                xtvVar.f265932b = 1;
                return nizVar.emit(obj, xtvVar) == obj4 ? obj4 : w2a1Var;
            case 6:
                if (fbkVar instanceof w1w) {
                    w1wVar = (w1w) fbkVar;
                    int i14 = w1wVar.f247190b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        w1wVar.f247190b = i14 - Integer.MIN_VALUE;
                    } else {
                        w1wVar = new w1w(this, fbkVar);
                    }
                } else {
                    w1wVar = new w1w(this, fbkVar);
                }
                Object obj11 = w1wVar.f247189a;
                int i15 = w1wVar.f247190b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                xaw xawVar = (xaw) ((gqx) obj).mo45449a(xaw.class, str3).f72301b;
                if (xawVar == null) {
                    Logger.m3966b("EpisodeV4 not found for preview uri ".concat(str3), new Object[0]);
                    x6r0Var = w6r0.f248448a;
                } else {
                    String str4 = xawVar.f259776c;
                    vaw vawVar = xawVar.f259777d;
                    String str5 = vawVar != null ? vawVar.f239335a : null;
                    x6r0Var = new x6r0(str4, str5 == null ? "" : str5, xawVar.f259778e.f256620a, xawVar.f259787n, xawVar.f259782i, bxg1.m30836m(xawVar));
                }
                w1wVar.f247190b = 1;
                return nizVar.emit(x6r0Var, w1wVar) == obj4 ? obj4 : w2a1Var;
            case 7:
                if (fbkVar instanceof w6w) {
                    w6wVar = (w6w) fbkVar;
                    int i16 = w6wVar.f248477b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        w6wVar.f248477b = i16 - Integer.MIN_VALUE;
                    } else {
                        w6wVar = new w6w(this, fbkVar);
                    }
                } else {
                    w6wVar = new w6w(this, fbkVar);
                }
                Object obj12 = w6wVar.f248476a;
                int i17 = w6wVar.f248477b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                nhl nhlVar = (nhl) obj;
                boolean z2 = nhlVar instanceof khl;
                Object obj13 = pro0.f180654b;
                if (!z2) {
                    if ((nhlVar instanceof lhl) && wj50.m88271j(((lhl) nhlVar).f133586a, str3)) {
                        obj13 = pro0.f180655c;
                    } else if ((nhlVar instanceof mhl) && wj50.m88271j(((mhl) nhlVar).f143823a, str3)) {
                        obj13 = pro0.f180653a;
                    }
                }
                w6wVar.f248477b = 1;
                return nizVar.emit(obj13, w6wVar) == obj4 ? obj4 : w2a1Var;
            case 8:
                if (fbkVar instanceof vlx) {
                    vlxVar = (vlx) fbkVar;
                    int i18 = vlxVar.f242614b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        vlxVar.f242614b = i18 - Integer.MIN_VALUE;
                    } else {
                        vlxVar = new vlx(this, fbkVar);
                    }
                } else {
                    vlxVar = new vlx(this, fbkVar);
                }
                Object obj14 = vlxVar.f242613a;
                int i19 = vlxVar.f242614b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                Boolean bool = (Boolean) ((Map) obj).get(str3);
                Object objValueOf5 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                vlxVar.f242614b = 1;
                return nizVar.emit(objValueOf5, vlxVar) == obj4 ? obj4 : w2a1Var;
            case 9:
                if (fbkVar instanceof zpx) {
                    zpxVar = (zpx) fbkVar;
                    int i20 = zpxVar.f285247b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        zpxVar.f285247b = i20 - Integer.MIN_VALUE;
                    } else {
                        zpxVar = new zpx(this, fbkVar);
                    }
                } else {
                    zpxVar = new zpx(this, fbkVar);
                }
                Object obj15 = zpxVar.f285246a;
                int i21 = zpxVar.f285247b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                ss90 ss90Var = (ss90) ((gqx) obj).mo45449a(ss90.class, str3).f72301b;
                if (ss90Var != null && (ps90Var = ss90Var.f213548a) != null) {
                    qs90 qs90Var = (qs90) g6f.m43745s0(ps90Var.f180781c);
                    if (qs90Var != null && (str = qs90Var.f192045a) != null && !wl51.m88460J0(str)) {
                        str2 = str;
                    }
                    int iM38547C = edb.m38547C(ps90Var.f180787i);
                    if (iM38547C == 0) {
                        kndVar = knd.f124385a;
                    } else if (iM38547C == 1) {
                        kndVar = knd.f124386b;
                    } else if (iM38547C == 2) {
                        kndVar = knd.f124387c;
                    } else {
                        if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kndVar = knd.f124388d;
                    }
                    p6n0Var = new p6n0(str2, kndVar);
                }
                if (p6n0Var == null) {
                    return w2a1Var;
                }
                zpxVar.f285247b = 1;
                return nizVar.emit(p6n0Var, zpxVar) == obj4 ? obj4 : w2a1Var;
            case 10:
                if (fbkVar instanceof kmz) {
                    kmzVar = (kmz) fbkVar;
                    int i22 = kmzVar.f124243b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        kmzVar.f124243b = i22 - Integer.MIN_VALUE;
                    } else {
                        kmzVar = new kmz(this, fbkVar);
                    }
                } else {
                    kmzVar = new kmz(this, fbkVar);
                }
                Object obj16 = kmzVar.f124242a;
                int i23 = kmzVar.f124243b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                Object objValueOf6 = Boolean.valueOf(bm51.m29797h0((String) obj, str3, true));
                kmzVar.f124243b = 1;
                return nizVar.emit(objValueOf6, kmzVar) == obj4 ? obj4 : w2a1Var;
            case 11:
                if (fbkVar instanceof smz) {
                    smzVar = (smz) fbkVar;
                    int i24 = smzVar.f210752b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        smzVar.f210752b = i24 - Integer.MIN_VALUE;
                    } else {
                        smzVar = new smz(this, fbkVar);
                    }
                } else {
                    smzVar = new smz(this, fbkVar);
                }
                Object obj17 = smzVar.f210751a;
                int i25 = smzVar.f210752b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                Object objM45949u = gwg1.m45949u((String) ((Map) obj).get(str3));
                smzVar.f210752b = 1;
                return nizVar.emit(objM45949u, smzVar) == obj4 ? obj4 : w2a1Var;
            case 12:
                if (fbkVar instanceof umz) {
                    umzVar = (umz) fbkVar;
                    int i26 = umzVar.f231979b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        umzVar.f231979b = i26 - Integer.MIN_VALUE;
                    } else {
                        umzVar = new umz(this, fbkVar);
                    }
                } else {
                    umzVar = new umz(this, fbkVar);
                }
                Object obj18 = umzVar.f231978a;
                int i27 = umzVar.f231979b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Object obj19 = ((Map) obj).get(str3);
                umzVar.f231979b = 1;
                return nizVar.emit(obj19, umzVar) == obj4 ? obj4 : w2a1Var;
            case 13:
                if (fbkVar instanceof zv00) {
                    zv00Var = (zv00) fbkVar;
                    int i28 = zv00Var.f286576b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        zv00Var.f286576b = i28 - Integer.MIN_VALUE;
                    } else {
                        zv00Var = new zv00(this, fbkVar);
                    }
                } else {
                    zv00Var = new zv00(this, fbkVar);
                }
                Object obj20 = zv00Var.f286575a;
                int i29 = zv00Var.f286576b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                Object obj21 = ((gqx) obj).mo45449a(ok11.class, str3).f72301b;
                if (obj21 == null) {
                    return w2a1Var;
                }
                zv00Var.f286576b = 1;
                return nizVar.emit(obj21, zv00Var) == obj4 ? obj4 : w2a1Var;
            case 14:
                if (fbkVar instanceof a810) {
                    a810Var = (a810) fbkVar;
                    int i30 = a810Var.f13168b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        a810Var.f13168b = i30 - Integer.MIN_VALUE;
                    } else {
                        a810Var = new a810(this, fbkVar);
                    }
                } else {
                    a810Var = new a810(this, fbkVar);
                }
                Object obj22 = a810Var.f13167a;
                int i31 = a810Var.f13168b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                Object obj23 = (y5f) ((Map) obj).get(str3);
                if (obj23 == null) {
                    obj23 = c810.f35072c;
                }
                a810Var.f13168b = 1;
                return nizVar.emit(obj23, a810Var) == obj4 ? obj4 : w2a1Var;
            case 15:
                if (fbkVar instanceof p420) {
                    p420Var = (p420) fbkVar;
                    int i32 = p420Var.f173784b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        p420Var.f173784b = i32 - Integer.MIN_VALUE;
                    } else {
                        p420Var = new p420(this, fbkVar);
                    }
                } else {
                    p420Var = new p420(this, fbkVar);
                }
                Object obj24 = p420Var.f173783a;
                int i33 = p420Var.f173784b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                Object obj25 = ((Map) obj).get(str3);
                p420Var.f173784b = 1;
                return nizVar.emit(obj25, p420Var) == obj4 ? obj4 : w2a1Var;
            case 16:
                if (fbkVar instanceof av50) {
                    av50Var = (av50) fbkVar;
                    int i34 = av50Var.f20105b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        av50Var.f20105b = i34 - Integer.MIN_VALUE;
                    } else {
                        av50Var = new av50(this, fbkVar);
                    }
                } else {
                    av50Var = new av50(this, fbkVar);
                }
                Object obj26 = av50Var.f20104a;
                int i35 = av50Var.f20105b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                i490 i490Var = (i490) obj;
                if (i490Var instanceof v390) {
                    objM46715L = lau.f131415a;
                } else {
                    boolean z3 = i490Var instanceof z390;
                    p490 p490Var = bif1.f27439a;
                    if (z3) {
                        objM46715L = h6f.m46715L(new p490("name", !((z390) i490Var).f278819a), p490Var);
                    } else if (i490Var instanceof a490) {
                        objM46715L = h6f.m46715L(new p490("name", true), p490Var);
                    } else if (i490Var instanceof r390) {
                        objM46715L = bif1.m29334o(!((r390) i490Var).f195452a);
                    } else if (i490Var instanceof s390) {
                        objM46715L = bif1.m29334o(true);
                    } else if (i490Var instanceof t390) {
                        objM46715L = bif1.m29335p(!((t390) i490Var).f216731a);
                    } else if (i490Var instanceof u390) {
                        objM46715L = bif1.m29335p(true);
                    } else if (i490Var instanceof n390) {
                        objM46715L = bif1.m29333n(!((n390) i490Var).f149980a);
                    } else if (i490Var instanceof o390) {
                        objM46715L = bif1.m29333n(false);
                    } else if (i490Var instanceof y390) {
                        objM46715L = h6f.m46715L(new p490("length", !((y390) i490Var).f268785a), p490Var);
                    } else if (i490Var instanceof w390) {
                        objM46715L = h6f.m46715L(new p490("discNumber", !((w390) i490Var).f247527a), new p490("trackNumber", true), p490Var);
                    } else if (i490Var instanceof h490) {
                        objM46715L = h6f.m46715L(new p490("trackNumber", !((h490) i490Var).f87472a), p490Var);
                    } else if (i490Var instanceof q390) {
                        objM46715L = h6f.m46715L(new p490("album.artist.name", !((q390) i490Var).f184821a), p490Var);
                    } else if (i490Var instanceof p390) {
                        boolean z4 = !((p390) i490Var).f173592a;
                        objM46715L = h6f.m46715L(new p490("addedByDisplayName", z4), new p490("addedBy", z4), p490Var);
                    } else if (i490Var instanceof g490) {
                        objM46715L = h6f.m46715L(new p490("show.name", !((g490) i490Var).f76376a), p490Var);
                    } else if (i490Var instanceof e490) {
                        objM46715L = h6f.m46715L(new p490("publishDate", !((e490) i490Var).f56031a), p490Var);
                    } else if (i490Var instanceof b490) {
                        objM46715L = h6f.m46715L(new p490("providedSort", !((b490) i490Var).f23274c), p490Var);
                    } else {
                        if (!(i490Var instanceof c490)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM46715L = h6f.m46715L(new p490("providedSort", true), p490Var);
                    }
                }
                Object pqm0Var2 = new pqm0(str3, objM46715L);
                av50Var.f20105b = 1;
                return nizVar.emit(pqm0Var2, av50Var) == obj4 ? obj4 : w2a1Var;
            case 17:
                if (fbkVar instanceof n060) {
                    n060Var = (n060) fbkVar;
                    int i36 = n060Var.f148917b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        n060Var.f148917b = i36 - Integer.MIN_VALUE;
                    } else {
                        n060Var = new n060(this, fbkVar);
                    }
                } else {
                    n060Var = new n060(this, fbkVar);
                }
                Object obj27 = n060Var.f148916a;
                int i37 = n060Var.f148917b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Object i060Var = new i060(str3, ((mx50) obj).f147961a.f127335a);
                n060Var.f148917b = 1;
                return nizVar.emit(i060Var, n060Var) == obj4 ? obj4 : w2a1Var;
            case 18:
                if (fbkVar instanceof f260) {
                    f260Var = (f260) fbkVar;
                    int i38 = f260Var.f65119b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        f260Var.f65119b = i38 - Integer.MIN_VALUE;
                    } else {
                        f260Var = new f260(this, fbkVar);
                    }
                } else {
                    f260Var = new f260(this, fbkVar);
                }
                Object obj28 = f260Var.f65118a;
                int i39 = f260Var.f65119b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                by50 by50Var = (by50) obj;
                if (by50Var != null) {
                    ArrayList arrayList = by50Var.f32077c;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (wj50.m88271j(((tx50) it.next()).f224567c, str3)) {
                                z = true;
                            }
                        }
                    }
                }
                Object objValueOf7 = Boolean.valueOf(z);
                f260Var.f65119b = 1;
                return nizVar.emit(objValueOf7, f260Var) == obj4 ? obj4 : w2a1Var;
            case 19:
                if (fbkVar instanceof hh60) {
                    hh60Var = (hh60) fbkVar;
                    int i40 = hh60Var.f91297b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        hh60Var.f91297b = i40 - Integer.MIN_VALUE;
                    } else {
                        hh60Var = new hh60(this, fbkVar);
                    }
                } else {
                    hh60Var = new hh60(this, fbkVar);
                }
                Object obj29 = hh60Var.f91296a;
                int i41 = hh60Var.f91297b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                by50 by50Var2 = (by50) obj;
                if (by50Var2 != null) {
                    ArrayList arrayList2 = by50Var2.f32077c;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (wj50.m88271j(((tx50) it2.next()).f224567c, str3)) {
                                obj3 = by50Var2;
                            }
                        }
                    }
                }
                hh60Var.f91297b = 1;
                return nizVar.emit(obj3, hh60Var) == obj4 ? obj4 : w2a1Var;
            case 20:
                if (fbkVar instanceof ih60) {
                    ih60Var = (ih60) fbkVar;
                    int i42 = ih60Var.f102176b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        ih60Var.f102176b = i42 - Integer.MIN_VALUE;
                    } else {
                        ih60Var = new ih60(this, fbkVar);
                    }
                } else {
                    ih60Var = new ih60(this, fbkVar);
                }
                Object obj30 = ih60Var.f102175a;
                int i43 = ih60Var.f102176b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                t730 t730Var = (t730) obj;
                if (t730Var != null && (s730Var = t730Var.f217667a) != null && wj50.m88271j(s730Var.f206267b.f227488a, str3)) {
                    obj2 = s730Var;
                }
                ih60Var.f102176b = 1;
                return nizVar.emit(obj2, ih60Var) == obj4 ? obj4 : w2a1Var;
            case 21:
                if (fbkVar instanceof kh60) {
                    kh60Var = (kh60) fbkVar;
                    int i44 = kh60Var.f122533b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        kh60Var.f122533b = i44 - Integer.MIN_VALUE;
                    } else {
                        kh60Var = new kh60(this, fbkVar);
                    }
                } else {
                    kh60Var = new kh60(this, fbkVar);
                }
                Object obj31 = kh60Var.f122532a;
                int i45 = kh60Var.f122533b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                Object obj32 = ((s6x0) obj).f206218a;
                if (s6x0.m77348a(obj32) == null) {
                    List<nb90> list = (List) obj32;
                    if (list == null || !list.isEmpty()) {
                        for (nb90 nb90Var : list) {
                            if (wj50.m88271j(nb90Var.f152220a, str3) && (mb90Var = nb90Var.f152221b) != null && mb90Var.f141840c) {
                                z = true;
                            }
                        }
                    }
                    objValueOf = Boolean.valueOf(z);
                } else {
                    objValueOf = Boolean.FALSE;
                }
                kh60Var.f122533b = 1;
                return nizVar.emit(objValueOf, kh60Var) == obj4 ? obj4 : w2a1Var;
            case 22:
                if (fbkVar instanceof sv60) {
                    sv60Var = (sv60) fbkVar;
                    int i46 = sv60Var.f214347b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        sv60Var.f214347b = i46 - Integer.MIN_VALUE;
                    } else {
                        sv60Var = new sv60(this, fbkVar);
                    }
                } else {
                    sv60Var = new sv60(this, fbkVar);
                }
                Object obj33 = sv60Var.f214346a;
                int i47 = sv60Var.f214347b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return w2a1Var;
                }
                bga.m29073P(obj33);
                d67 d67Var = wv60.f255420d;
                Object objMo48710e = ((hv31) obj).mo48710e(d67.m35058c(str3), "");
                Object obj34 = objMo48710e != null ? objMo48710e : "";
                sv60Var.f214347b = 1;
                return nizVar.emit(obj34, sv60Var) == obj4 ? obj4 : w2a1Var;
            case 23:
                if (fbkVar instanceof sv80) {
                    sv80Var = (sv80) fbkVar;
                    int i48 = sv80Var.f214360b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        sv80Var.f214360b = i48 - Integer.MIN_VALUE;
                    } else {
                        sv80Var = new sv80(this, fbkVar);
                    }
                } else {
                    sv80Var = new sv80(this, fbkVar);
                }
                Object obj35 = sv80Var.f214359a;
                int i49 = sv80Var.f214360b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                Map map = (Map) obj;
                Boolean boolValueOf = Boolean.valueOf(map.containsKey(str3));
                Object obj36 = (Set) map.get(str3);
                if (obj36 == null) {
                    obj36 = gbu.f78413a;
                }
                Object pqm0Var3 = new pqm0(boolValueOf, obj36);
                sv80Var.f214360b = 1;
                return nizVar.emit(pqm0Var3, sv80Var) == obj4 ? obj4 : w2a1Var;
            case 24:
                if (fbkVar instanceof rb90) {
                    rb90Var = (rb90) fbkVar;
                    int i50 = rb90Var.f197531b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        rb90Var.f197531b = i50 - Integer.MIN_VALUE;
                    } else {
                        rb90Var = new rb90(this, fbkVar);
                    }
                } else {
                    rb90Var = new rb90(this, fbkVar);
                }
                Object obj37 = rb90Var.f197530a;
                int i51 = rb90Var.f197531b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj37);
                    return w2a1Var;
                }
                bga.m29073P(obj37);
                if (!wj50.m88271j((String) obj, str3)) {
                    return w2a1Var;
                }
                rb90Var.f197531b = 1;
                return nizVar.emit(obj, rb90Var) == obj4 ? obj4 : w2a1Var;
            case 25:
                if (fbkVar instanceof sw90) {
                    sw90Var = (sw90) fbkVar;
                    int i52 = sw90Var.f214627b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        sw90Var.f214627b = i52 - Integer.MIN_VALUE;
                    } else {
                        sw90Var = new sw90(this, fbkVar);
                    }
                } else {
                    sw90Var = new sw90(this, fbkVar);
                }
                Object obj38 = sw90Var.f214626a;
                int i53 = sw90Var.f214627b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj38);
                    return w2a1Var;
                }
                bga.m29073P(obj38);
                pqm0 pqm0Var4 = (pqm0) obj;
                tb80 tb80Var = (tb80) pqm0Var4.f180350a;
                long jLongValue = ((Number) pqm0Var4.f180351b).longValue();
                if (tb80Var instanceof LifecycleChannelEvent$GoLiveEvent) {
                    kr90 kr90VarM13114s = LiveStreamStateMessage.m13114s();
                    kr90VarM13114s.m57144q(str3);
                    kr90VarM13114s.m57143m(jr90.LIVE);
                    kr90VarM13114s.m57145r(jLongValue);
                    liveStreamStateMessage = (LiveStreamStateMessage) kr90VarM13114s.build();
                } else {
                    if (!(tb80Var instanceof LifecycleChannelEvent$ClosePartyEvent) && !(tb80Var instanceof LifecycleChannelEvent$ArchivePartyEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kr90 kr90VarM13114s2 = LiveStreamStateMessage.m13114s();
                    kr90VarM13114s2.m57144q(str3);
                    kr90VarM13114s2.m57143m(jr90.ENDED);
                    liveStreamStateMessage = (LiveStreamStateMessage) kr90VarM13114s2.build();
                }
                wj50.m88279p(liveStreamStateMessage);
                Object uv90Var = new uv90(liveStreamStateMessage);
                sw90Var.f214627b = 1;
                return nizVar.emit(uv90Var, sw90Var) == obj4 ? obj4 : w2a1Var;
            case 26:
                return m45704b(obj, fbkVar);
            case 27:
                return m45705c(obj, fbkVar);
            case 28:
                return m45706d(obj, fbkVar);
            default:
                if (fbkVar instanceof c8i0) {
                    c8i0Var = (c8i0) fbkVar;
                    int i54 = c8i0Var.f35245b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        c8i0Var.f35245b = i54 - Integer.MIN_VALUE;
                    } else {
                        c8i0Var = new c8i0(this, fbkVar);
                    }
                } else {
                    c8i0Var = new c8i0(this, fbkVar);
                }
                Object obj39 = c8i0Var.f35244a;
                int i55 = c8i0Var.f35245b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj39);
                    return w2a1Var;
                }
                bga.m29073P(obj39);
                Object objMo45449a = ((gqx) obj).mo45449a(erc1.class, str3);
                c8i0Var.f35245b = 1;
                return nizVar.emit(objMo45449a, c8i0Var) == obj4 ? obj4 : w2a1Var;
        }
    }
}
