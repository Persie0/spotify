package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class efx implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f59137b;

    public /* synthetic */ efx(niz nizVar, int i) {
        this.f59136a = i;
        this.f59137b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m38747b(fiz fizVar, fbk fbkVar) {
        rkz rkzVar;
        if (fbkVar instanceof rkz) {
            rkzVar = (rkz) fbkVar;
            int i = rkzVar.f200182c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rkzVar.f200182c = i - Integer.MIN_VALUE;
            } else {
                rkzVar = new rkz(this, fbkVar);
            }
        } else {
            rkzVar = new rkz(this, fbkVar);
        }
        Object obj = rkzVar.f200180a;
        int i2 = rkzVar.f200182c;
        if (i2 == 0) {
            bga.m29073P(obj);
            rkzVar.f200182c = 1;
            Object objM89253j = wxf1.m89253j(this.f59137b, fizVar, rkzVar);
            yuk yukVar = yuk.f276404a;
            if (objM89253j == yukVar) {
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

    /* JADX WARN: Code duplicated, block: B:111:0x0177  */
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x0219  */
    /* JADX WARN: Code duplicated, block: B:169:0x0255  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0331  */
    /* JADX WARN: Code duplicated, block: B:235:0x0382  */
    /* JADX WARN: Code duplicated, block: B:257:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:279:0x0411  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:296:0x044e  */
    /* JADX WARN: Code duplicated, block: B:313:0x048b  */
    /* JADX WARN: Code duplicated, block: B:341:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:358:0x052b  */
    /* JADX WARN: Code duplicated, block: B:383:0x0595  */
    /* JADX WARN: Code duplicated, block: B:402:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:419:0x0627  */
    /* JADX WARN: Code duplicated, block: B:438:0x0667  */
    /* JADX WARN: Code duplicated, block: B:457:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:474:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:496:0x0737  */
    /* JADX WARN: Code duplicated, block: B:515:0x0776  */
    /* JADX WARN: Code duplicated, block: B:532:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:549:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:566:0x0836  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
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
        dfx dfxVar;
        imx imxVar;
        jmx jmxVar;
        mox moxVar;
        ypx ypxVar;
        atx atxVar;
        pux puxVar;
        rux ruxVar;
        tux tuxVar;
        wux wuxVar;
        ivx ivxVar;
        qwx qwxVar;
        Object w9dVar;
        g1y g1yVar;
        f7y f7yVar;
        Object m6yVar;
        g7y g7yVar;
        h7y h7yVar;
        e9y e9yVar;
        ybv ybvVar;
        g9y g9yVar;
        h9y h9yVar;
        any anyVar;
        Ctry ctry;
        w5z w5zVar;
        q6z q6zVar;
        f9z f9zVar;
        mbz mbzVar;
        String str;
        obz obzVar;
        int i;
        ydz ydzVar;
        hiz hizVar;
        iiz iizVar;
        int i2 = this.f59136a;
        obj = null;
        Object obj2 = null;
        String strM75187e = "pending";
        boolean z = false;
        niz nizVar = this.f59137b;
        Object obj3 = yuk.f276404a;
        Object obj4 = w2a1.f247311a;
        switch (i2) {
            case 0:
                if (fbkVar instanceof dfx) {
                    dfxVar = (dfx) fbkVar;
                    int i3 = dfxVar.f48673b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dfxVar.f48673b = i3 - Integer.MIN_VALUE;
                    } else {
                        dfxVar = new dfx(this, fbkVar);
                    }
                } else {
                    dfxVar = new dfx(this, fbkVar);
                }
                Object obj5 = dfxVar.f48672a;
                int i4 = dfxVar.f48673b;
                if (i4 == 0) {
                    bga.m29073P(obj5);
                    if (((soz) obj).f212700b == 1) {
                        dfxVar.f48673b = 1;
                        if (nizVar.emit(obj, dfxVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return obj4;
            case 1:
                if (fbkVar instanceof imx) {
                    imxVar = (imx) fbkVar;
                    int i5 = imxVar.f103787b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        imxVar.f103787b = i5 - Integer.MIN_VALUE;
                    } else {
                        imxVar = new imx(this, fbkVar);
                    }
                } else {
                    imxVar = new imx(this, fbkVar);
                }
                Object obj6 = imxVar.f103786a;
                int i6 = imxVar.f103787b;
                if (i6 == 0) {
                    bga.m29073P(obj6);
                    Object objValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    imxVar.f103787b = 1;
                    if (nizVar.emit(objValueOf, imxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return obj4;
            case 2:
                if (fbkVar instanceof jmx) {
                    jmxVar = (jmx) fbkVar;
                    int i7 = jmxVar.f113957b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jmxVar.f113957b = i7 - Integer.MIN_VALUE;
                    } else {
                        jmxVar = new jmx(this, fbkVar);
                    }
                } else {
                    jmxVar = new jmx(this, fbkVar);
                }
                Object obj7 = jmxVar.f113956a;
                int i8 = jmxVar.f113957b;
                if (i8 == 0) {
                    bga.m29073P(obj7);
                    Object objValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    jmxVar.f113957b = 1;
                    if (nizVar.emit(objValueOf2, jmxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return obj4;
            case 3:
                if (fbkVar instanceof mox) {
                    moxVar = (mox) fbkVar;
                    int i9 = moxVar.f145770b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        moxVar.f145770b = i9 - Integer.MIN_VALUE;
                    } else {
                        moxVar = new mox(this, fbkVar);
                    }
                } else {
                    moxVar = new mox(this, fbkVar);
                }
                Object obj8 = moxVar.f145769a;
                int i10 = moxVar.f145770b;
                if (i10 == 0) {
                    bga.m29073P(obj8);
                    Object objM43710X0 = g6f.m43710X0((Set) obj);
                    moxVar.f145770b = 1;
                    if (nizVar.emit(objM43710X0, moxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return obj4;
            case 4:
                if (fbkVar instanceof ypx) {
                    ypxVar = (ypx) fbkVar;
                    int i11 = ypxVar.f275088b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ypxVar.f275088b = i11 - Integer.MIN_VALUE;
                    } else {
                        ypxVar = new ypx(this, fbkVar);
                    }
                } else {
                    ypxVar = new ypx(this, fbkVar);
                }
                Object obj9 = ypxVar.f275087a;
                int i12 = ypxVar.f275088b;
                if (i12 == 0) {
                    bga.m29073P(obj9);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        ypxVar.f275088b = 1;
                        if (nizVar.emit(obj, ypxVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return obj4;
            case 5:
                if (fbkVar instanceof atx) {
                    atxVar = (atx) fbkVar;
                    int i13 = atxVar.f19756b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        atxVar.f19756b = i13 - Integer.MIN_VALUE;
                    } else {
                        atxVar = new atx(this, fbkVar);
                    }
                } else {
                    atxVar = new atx(this, fbkVar);
                }
                Object obj10 = atxVar.f19755a;
                int i14 = atxVar.f19756b;
                if (i14 == 0) {
                    bga.m29073P(obj10);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Object objValueOf3 = Boolean.valueOf(ohoVar != null ? ((Boolean) ohoVar.f165512a).booleanValue() : false);
                    atxVar.f19756b = 1;
                    if (nizVar.emit(objValueOf3, atxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return obj4;
            case 6:
                if (fbkVar instanceof pux) {
                    puxVar = (pux) fbkVar;
                    int i15 = puxVar.f181540b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        puxVar.f181540b = i15 - Integer.MIN_VALUE;
                    } else {
                        puxVar = new pux(this, fbkVar);
                    }
                } else {
                    puxVar = new pux(this, fbkVar);
                }
                Object obj11 = puxVar.f181539a;
                int i16 = puxVar.f181540b;
                if (i16 == 0) {
                    bga.m29073P(obj11);
                    Object obj12 = ((e301) obj).f55571a;
                    puxVar.f181540b = 1;
                    if (nizVar.emit(obj12, puxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return obj4;
            case 7:
                if (fbkVar instanceof rux) {
                    ruxVar = (rux) fbkVar;
                    int i17 = ruxVar.f202952b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ruxVar.f202952b = i17 - Integer.MIN_VALUE;
                    } else {
                        ruxVar = new rux(this, fbkVar);
                    }
                } else {
                    ruxVar = new rux(this, fbkVar);
                }
                Object obj13 = ruxVar.f202951a;
                int i18 = ruxVar.f202952b;
                if (i18 == 0) {
                    bga.m29073P(obj13);
                    pqm0 pqm0Var = (pqm0) obj;
                    if (((nzd1) pqm0Var.f180351b).f160070a > ((nzd1) pqm0Var.f180350a).f160070a) {
                        ruxVar.f202952b = 1;
                        if (nizVar.emit(obj, ruxVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return obj4;
            case 8:
                if (fbkVar instanceof tux) {
                    tuxVar = (tux) fbkVar;
                    int i19 = tuxVar.f223967b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        tuxVar.f223967b = i19 - Integer.MIN_VALUE;
                    } else {
                        tuxVar = new tux(this, fbkVar);
                    }
                } else {
                    tuxVar = new tux(this, fbkVar);
                }
                Object obj14 = tuxVar.f223966a;
                int i20 = tuxVar.f223967b;
                if (i20 == 0) {
                    bga.m29073P(obj14);
                    Object obj15 = ((nzd1) ((pqm0) obj).f180351b).f160071b;
                    if (obj15 != null) {
                        tuxVar.f223967b = 1;
                        if (nizVar.emit(obj15, tuxVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return obj4;
            case 9:
                if (fbkVar instanceof wux) {
                    wuxVar = (wux) fbkVar;
                    int i21 = wuxVar.f255290b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wuxVar.f255290b = i21 - Integer.MIN_VALUE;
                    } else {
                        wuxVar = new wux(this, fbkVar);
                    }
                } else {
                    wuxVar = new wux(this, fbkVar);
                }
                Object obj16 = wuxVar.f255289a;
                int i22 = wuxVar.f255290b;
                if (i22 == 0) {
                    bga.m29073P(obj16);
                    g0j g0jVar = (g0j) obj;
                    wj50.m88279p(g0jVar);
                    List list = tvx.f224267a;
                    Object objValueOf4 = Boolean.valueOf(h6f.m46715L(g0j.f75372X, g0j.f75373Y).contains(g0jVar));
                    wuxVar.f255290b = 1;
                    if (nizVar.emit(objValueOf4, wuxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return obj4;
            case 10:
                if (fbkVar instanceof ivx) {
                    ivxVar = (ivx) fbkVar;
                    int i23 = ivxVar.f106295b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ivxVar.f106295b = i23 - Integer.MIN_VALUE;
                    } else {
                        ivxVar = new ivx(this, fbkVar);
                    }
                } else {
                    ivxVar = new ivx(this, fbkVar);
                }
                Object obj17 = ivxVar.f106294a;
                int i24 = ivxVar.f106295b;
                if (i24 == 0) {
                    bga.m29073P(obj17);
                    if (((mab) obj).mo52807a().f76527c) {
                        ivxVar.f106295b = 1;
                        if (nizVar.emit(obj, ivxVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return obj4;
            case 11:
                if (fbkVar instanceof qwx) {
                    qwxVar = (qwx) fbkVar;
                    int i25 = qwxVar.f193433b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        qwxVar.f193433b = i25 - Integer.MIN_VALUE;
                    } else {
                        qwxVar = new qwx(this, fbkVar);
                    }
                } else {
                    qwxVar = new qwx(this, fbkVar);
                }
                Object obj18 = qwxVar.f193432a;
                int i26 = qwxVar.f193433b;
                if (i26 == 0) {
                    bga.m29073P(obj18);
                    mwx mwxVar = (mwx) obj;
                    pwx pwxVar = mwxVar.f147892a;
                    long j = mwxVar.f147893b;
                    if (pwxVar instanceof owx) {
                        w9dVar = new bad(q350.m72051f(((owx) pwxVar).f170797a), j);
                    } else {
                        if (!(pwxVar instanceof nwx)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nwx nwxVar = (nwx) pwxVar;
                        w9dVar = new w9d(nwxVar.f159298a.f111359a, q350.m72051f(nwxVar.f159299b), j);
                    }
                    qwxVar.f193433b = 1;
                    if (nizVar.emit(w9dVar, qwxVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return obj4;
            case 12:
                if (fbkVar instanceof g1y) {
                    g1yVar = (g1y) fbkVar;
                    int i27 = g1yVar.f75768b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        g1yVar.f75768b = i27 - Integer.MIN_VALUE;
                    } else {
                        g1yVar = new g1y(this, fbkVar);
                    }
                } else {
                    g1yVar = new g1y(this, fbkVar);
                }
                Object obj19 = g1yVar.f75767a;
                int i28 = g1yVar.f75768b;
                if (i28 == 0) {
                    bga.m29073P(obj19);
                    Object objValueOf5 = Boolean.valueOf(((f1y) obj).f65001a);
                    g1yVar.f75768b = 1;
                    if (nizVar.emit(objValueOf5, g1yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return obj4;
            case 13:
                if (fbkVar instanceof f7y) {
                    f7yVar = (f7y) fbkVar;
                    int i29 = f7yVar.f66810b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        f7yVar.f66810b = i29 - Integer.MIN_VALUE;
                    } else {
                        f7yVar = new f7y(this, fbkVar);
                    }
                } else {
                    f7yVar = new f7y(this, fbkVar);
                }
                Object obj20 = f7yVar.f66809a;
                int i30 = f7yVar.f66810b;
                if (i30 == 0) {
                    bga.m29073P(obj20);
                    jr8 jr8Var = (jr8) obj;
                    if (wj50.m88271j(jr8Var, gr8.f83683a)) {
                        m6yVar = o6y.f162437a;
                    } else if (wj50.m88271j(jr8Var, fr8.f72382a)) {
                        m6yVar = n6y.f150981a;
                    } else {
                        if (!(jr8Var instanceof er8)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m6yVar = new m6y(((er8) jr8Var).f62039a);
                    }
                    f7yVar.f66810b = 1;
                    if (nizVar.emit(m6yVar, f7yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return obj4;
            case 14:
                if (fbkVar instanceof g7y) {
                    g7yVar = (g7y) fbkVar;
                    int i31 = g7yVar.f77367b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        g7yVar.f77367b = i31 - Integer.MIN_VALUE;
                    } else {
                        g7yVar = new g7y(this, fbkVar);
                    }
                } else {
                    g7yVar = new g7y(this, fbkVar);
                }
                Object obj21 = g7yVar.f77366a;
                int i32 = g7yVar.f77367b;
                if (i32 == 0) {
                    bga.m29073P(obj21);
                    Object t6yVar = new t6y((p6y) obj);
                    g7yVar.f77367b = 1;
                    if (nizVar.emit(t6yVar, g7yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return obj4;
            case 15:
                if (fbkVar instanceof h7y) {
                    h7yVar = (h7y) fbkVar;
                    int i33 = h7yVar.f88563b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h7yVar.f88563b = i33 - Integer.MIN_VALUE;
                    } else {
                        h7yVar = new h7y(this, fbkVar);
                    }
                } else {
                    h7yVar = new h7y(this, fbkVar);
                }
                Object obj22 = h7yVar.f88562a;
                int i34 = h7yVar.f88563b;
                if (i34 == 0) {
                    bga.m29073P(obj22);
                    Object s6yVar = new s6y((List) obj);
                    h7yVar.f88563b = 1;
                    if (nizVar.emit(s6yVar, h7yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return obj4;
            case 16:
                if (fbkVar instanceof e9y) {
                    e9yVar = (e9y) fbkVar;
                    int i35 = e9yVar.f57552b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        e9yVar.f57552b = i35 - Integer.MIN_VALUE;
                    } else {
                        e9yVar = new e9y(this, fbkVar);
                    }
                } else {
                    e9yVar = new e9y(this, fbkVar);
                }
                Object obj23 = e9yVar.f57551a;
                int i36 = e9yVar.f57552b;
                if (i36 == 0) {
                    bga.m29073P(obj23);
                    qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
                    if (qu80Var != null && (ybvVar = qu80Var.f192599e) != null) {
                        obj2 = ybvVar.f271269n;
                    }
                    e9yVar.f57552b = 1;
                    if (nizVar.emit(obj2, e9yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return obj4;
            case 17:
                if (fbkVar instanceof g9y) {
                    g9yVar = (g9y) fbkVar;
                    int i37 = g9yVar.f77917b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        g9yVar.f77917b = i37 - Integer.MIN_VALUE;
                    } else {
                        g9yVar = new g9y(this, fbkVar);
                    }
                } else {
                    g9yVar = new g9y(this, fbkVar);
                }
                Object obj24 = g9yVar.f77916a;
                int i38 = g9yVar.f77917b;
                if (i38 == 0) {
                    bga.m29073P(obj24);
                    Map map = (Map) obj;
                    Object objValueOf6 = Boolean.valueOf(dxf1.m37217F(map) || dxf1.m37222K(map));
                    g9yVar.f77917b = 1;
                    if (nizVar.emit(objValueOf6, g9yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return obj4;
            case 18:
                if (fbkVar instanceof h9y) {
                    h9yVar = (h9y) fbkVar;
                    int i39 = h9yVar.f89073b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        h9yVar.f89073b = i39 - Integer.MIN_VALUE;
                    } else {
                        h9yVar = new h9y(this, fbkVar);
                    }
                } else {
                    h9yVar = new h9y(this, fbkVar);
                }
                Object obj25 = h9yVar.f89072a;
                int i40 = h9yVar.f89073b;
                if (i40 == 0) {
                    bga.m29073P(obj25);
                    Map map2 = (Map) obj;
                    if (!dxf1.m37222K(map2) && gwg1.m45947s((String) map2.get("pick-and-shuffle"))) {
                        z = true;
                    }
                    Object objValueOf7 = Boolean.valueOf(z);
                    h9yVar.f89073b = 1;
                    if (nizVar.emit(objValueOf7, h9yVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return obj4;
            case 19:
                if (fbkVar instanceof any) {
                    anyVar = (any) fbkVar;
                    int i41 = anyVar.f17520b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        anyVar.f17520b = i41 - Integer.MIN_VALUE;
                    } else {
                        anyVar = new any(this, fbkVar);
                    }
                } else {
                    anyVar = new any(this, fbkVar);
                }
                Object obj26 = anyVar.f17519a;
                int i42 = anyVar.f17520b;
                if (i42 == 0) {
                    bga.m29073P(obj26);
                    Object dnyVar = new dny((koy) obj);
                    anyVar.f17520b = 1;
                    if (nizVar.emit(dnyVar, anyVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return obj4;
            case 20:
                if (fbkVar instanceof Ctry) {
                    ctry = (Ctry) fbkVar;
                    int i43 = ctry.f223144b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ctry.f223144b = i43 - Integer.MIN_VALUE;
                    } else {
                        ctry = new Ctry(this, fbkVar);
                    }
                } else {
                    ctry = new Ctry(this, fbkVar);
                }
                Object obj27 = ctry.f223143a;
                int i44 = ctry.f223144b;
                if (i44 == 0) {
                    bga.m29073P(obj27);
                    ae50 ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
                    ArrayList<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> arrayList = new ArrayList();
                    for (Object obj28 : ae50VarM98196n) {
                        if (((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj28).hasPlaylist()) {
                            arrayList.add(obj28);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : arrayList) {
                        arrayList2.add(new mlp0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getName(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98295o(), yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().m98274q()));
                    }
                    ctry.f223144b = 1;
                    if (nizVar.emit(arrayList2, ctry) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return obj4;
            case 21:
                if (fbkVar instanceof w5z) {
                    w5zVar = (w5z) fbkVar;
                    int i45 = w5zVar.f248212b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        w5zVar.f248212b = i45 - Integer.MIN_VALUE;
                    } else {
                        w5zVar = new w5z(this, fbkVar);
                    }
                } else {
                    w5zVar = new w5z(this, fbkVar);
                }
                Object obj29 = w5zVar.f248211a;
                int i46 = w5zVar.f248212b;
                if (i46 == 0) {
                    bga.m29073P(obj29);
                    Object obj30 = (String) obj;
                    if (obj30 == null) {
                        obj30 = "";
                    }
                    w5zVar.f248212b = 1;
                    if (nizVar.emit(obj30, w5zVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return obj4;
            case 22:
                if (fbkVar instanceof q6z) {
                    q6zVar = (q6z) fbkVar;
                    int i47 = q6zVar.f185963b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        q6zVar.f185963b = i47 - Integer.MIN_VALUE;
                    } else {
                        q6zVar = new q6z(this, fbkVar);
                    }
                } else {
                    q6zVar = new q6z(this, fbkVar);
                }
                Object obj31 = q6zVar.f185962a;
                int i48 = q6zVar.f185963b;
                if (i48 == 0) {
                    bga.m29073P(obj31);
                    List<k6z> list2 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
                    for (k6z k6zVar : list2) {
                        arrayList3.add(new j6z(k6zVar.f119867a, k6zVar.f119869c, k6zVar.f119868b, k6zVar.f119870d));
                    }
                    q6zVar.f185963b = 1;
                    if (nizVar.emit(arrayList3, q6zVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return obj4;
            case 23:
                if (fbkVar instanceof f9z) {
                    f9zVar = (f9z) fbkVar;
                    int i49 = f9zVar.f67392b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        f9zVar.f67392b = i49 - Integer.MIN_VALUE;
                    } else {
                        f9zVar = new f9z(this, fbkVar);
                    }
                } else {
                    f9zVar = new f9z(this, fbkVar);
                }
                Object obj32 = f9zVar.f67391a;
                int i50 = f9zVar.f67392b;
                if (i50 == 0) {
                    bga.m29073P(obj32);
                    Object string = wl51.m88491o1((String) obj).toString();
                    f9zVar.f67392b = 1;
                    if (nizVar.emit(string, f9zVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return obj4;
            case 24:
                if (fbkVar instanceof mbz) {
                    mbzVar = (mbz) fbkVar;
                    int i51 = mbzVar.f141993b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        mbzVar.f141993b = i51 - Integer.MIN_VALUE;
                    } else {
                        mbzVar = new mbz(this, fbkVar);
                    }
                } else {
                    mbzVar = new mbz(this, fbkVar);
                }
                Object obj33 = mbzVar.f141992a;
                int i52 = mbzVar.f141993b;
                if (i52 == 0) {
                    bga.m29073P(obj33);
                    qbz qbzVar = (qbz) obj;
                    if (qbzVar != null && (str = qbzVar.f187216b) != null) {
                        strM75187e = str;
                    }
                    Object o0lVar = new o0l(strM75187e);
                    mbzVar.f141993b = 1;
                    if (nizVar.emit(o0lVar, mbzVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return obj4;
            case 25:
                if (fbkVar instanceof obz) {
                    obzVar = (obz) fbkVar;
                    int i53 = obzVar.f163773b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        obzVar.f163773b = i53 - Integer.MIN_VALUE;
                    } else {
                        obzVar = new obz(this, fbkVar);
                    }
                } else {
                    obzVar = new obz(this, fbkVar);
                }
                Object obj34 = obzVar.f163772a;
                int i54 = obzVar.f163773b;
                if (i54 == 0) {
                    bga.m29073P(obj34);
                    qbz qbzVar2 = (qbz) obj;
                    if (qbzVar2 != null && (i = qbzVar2.f187215a) != 0) {
                        strM75187e = rbz.m75187e(i);
                    }
                    Object p0lVar = new p0l(strM75187e);
                    obzVar.f163773b = 1;
                    if (nizVar.emit(p0lVar, obzVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return obj4;
            case 26:
                if (fbkVar instanceof ydz) {
                    ydzVar = (ydz) fbkVar;
                    int i55 = ydzVar.f271881b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ydzVar.f271881b = i55 - Integer.MIN_VALUE;
                    } else {
                        ydzVar = new ydz(this, fbkVar);
                    }
                } else {
                    ydzVar = new ydz(this, fbkVar);
                }
                Object obj35 = ydzVar.f271880a;
                int i56 = ydzVar.f271881b;
                if (i56 == 0) {
                    bga.m29073P(obj35);
                    Object objValueOf8 = Boolean.valueOf(((fx81) obj).f74291a.f215996d == 2);
                    ydzVar.f271881b = 1;
                    if (nizVar.emit(objValueOf8, ydzVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                }
                return obj4;
            case 27:
                if (fbkVar instanceof hiz) {
                    hizVar = (hiz) fbkVar;
                    int i57 = hizVar.f91912b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        hizVar.f91912b = i57 - Integer.MIN_VALUE;
                    } else {
                        hizVar = new hiz(this, fbkVar);
                    }
                } else {
                    hizVar = new hiz(this, fbkVar);
                }
                Object obj36 = hizVar.f91911a;
                int i58 = hizVar.f91912b;
                if (i58 == 0) {
                    bga.m29073P(obj36);
                    if (((Boolean) obj).booleanValue()) {
                        hizVar.f91912b = 1;
                        if (nizVar.emit(obj, hizVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj36);
                }
                return obj4;
            case 28:
                if (fbkVar instanceof iiz) {
                    iizVar = (iiz) fbkVar;
                    int i59 = iizVar.f102653b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        iizVar.f102653b = i59 - Integer.MIN_VALUE;
                    } else {
                        iizVar = new iiz(this, fbkVar);
                    }
                } else {
                    iizVar = new iiz(this, fbkVar);
                }
                Object obj37 = iizVar.f102652a;
                int i60 = iizVar.f102653b;
                if (i60 == 0) {
                    bga.m29073P(obj37);
                    ((Boolean) obj).getClass();
                    iizVar.f102653b = 1;
                    if (nizVar.emit(obj4, iizVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj37);
                }
                return obj4;
            default:
                return m38747b((fiz) obj, fbkVar);
        }
    }

    public /* synthetic */ efx(niz nizVar, Object obj, int i) {
        this.f59136a = i;
        this.f59137b = nizVar;
    }
}
