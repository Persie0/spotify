package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class kqc implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f125249b;

    public /* synthetic */ kqc(niz nizVar, int i) {
        this.f125248a = i;
        this.f125249b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x0211  */
    /* JADX WARN: Code duplicated, block: B:136:0x025d  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02da  */
    /* JADX WARN: Code duplicated, block: B:172:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:183:0x0302  */
    /* JADX WARN: Code duplicated, block: B:204:0x034f  */
    /* JADX WARN: Code duplicated, block: B:225:0x039c  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:269:0x044c  */
    /* JADX WARN: Code duplicated, block: B:290:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:307:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:327:0x0532  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:348:0x0592  */
    /* JADX WARN: Code duplicated, block: B:365:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:389:0x063d  */
    /* JADX WARN: Code duplicated, block: B:406:0x0681  */
    /* JADX WARN: Code duplicated, block: B:423:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:440:0x0715  */
    /* JADX WARN: Code duplicated, block: B:459:0x075c  */
    /* JADX WARN: Code duplicated, block: B:487:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:504:0x080c  */
    /* JADX WARN: Code duplicated, block: B:523:0x0853  */
    /* JADX WARN: Code duplicated, block: B:546:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:569:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:588:0x093b  */
    /* JADX WARN: Code duplicated, block: B:607:0x0981  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jqc jqcVar;
        lqc lqcVar;
        irc ircVar;
        krc krcVar;
        itc itcVar;
        e0d e0dVar;
        f0d f0dVar;
        hgd hgdVar;
        Object dgdVar;
        pid pidVar;
        rld rldVar;
        fmd fmdVar;
        nmd nmdVar;
        omd omdVar;
        o8m o8mVar;
        npd npdVar;
        srd srdVar;
        hud hudVar;
        nxd nxdVar;
        uxd uxdVar;
        dyd dydVar;
        myd mydVar;
        ContextTrack contextTrack;
        m3e m3eVar;
        o3e o3eVar;
        p3e p3eVar;
        l3e l3eVar;
        f4e f4eVar;
        g4e g4eVar;
        g5e g5eVar;
        j5e j5eVar;
        m5e m5eVar;
        p5e p5eVar;
        qbe qbeVar;
        String uri;
        EsContextTrack$ContextTrack esContextTrack$ContextTrackM17850q;
        switch (this.f125248a) {
            case 0:
                if (fbkVar instanceof jqc) {
                    jqcVar = (jqc) fbkVar;
                    int i = jqcVar.f114877b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jqcVar.f114877b = i - Integer.MIN_VALUE;
                    } else {
                        jqcVar = new jqc(this, fbkVar);
                    }
                } else {
                    jqcVar = new jqc(this, fbkVar);
                }
                Object obj2 = jqcVar.f114876a;
                int i2 = jqcVar.f114877b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    if (obj instanceof oho) {
                        jqcVar.f114877b = 1;
                        Object objEmit = this.f125249b.emit(obj, jqcVar);
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
            case 1:
                if (fbkVar instanceof lqc) {
                    lqcVar = (lqc) fbkVar;
                    int i3 = lqcVar.f136005b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lqcVar.f136005b = i3 - Integer.MIN_VALUE;
                    } else {
                        lqcVar = new lqc(this, fbkVar);
                    }
                } else {
                    lqcVar = new lqc(this, fbkVar);
                }
                Object obj3 = lqcVar.f136004a;
                int i4 = lqcVar.f136005b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Object obj4 = ((oho) obj).f165512a;
                    if (obj4 != null) {
                        lqcVar.f136005b = 1;
                        Object objEmit2 = this.f125249b.emit(obj4, lqcVar);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof irc) {
                    ircVar = (irc) fbkVar;
                    int i5 = ircVar.f104948b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ircVar.f104948b = i5 - Integer.MIN_VALUE;
                    } else {
                        ircVar = new irc(this, fbkVar);
                    }
                } else {
                    ircVar = new irc(this, fbkVar);
                }
                Object obj5 = ircVar.f104947a;
                int i6 = ircVar.f104948b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    if (obj instanceof lbx0) {
                        ircVar.f104948b = 1;
                        Object objEmit3 = this.f125249b.emit(obj, ircVar);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof krc) {
                    krcVar = (krc) fbkVar;
                    int i7 = krcVar.f125608b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        krcVar.f125608b = i7 - Integer.MIN_VALUE;
                    } else {
                        krcVar = new krc(this, fbkVar);
                    }
                } else {
                    krcVar = new krc(this, fbkVar);
                }
                Object obj6 = krcVar.f125607a;
                int i8 = krcVar.f125608b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    y6s0 y6s0Var = ohoVar != null ? (y6s0) ohoVar.f165512a : null;
                    krcVar.f125608b = 1;
                    Object objEmit4 = this.f125249b.emit(y6s0Var, krcVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof itc) {
                    itcVar = (itc) fbkVar;
                    int i9 = itcVar.f105511b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        itcVar.f105511b = i9 - Integer.MIN_VALUE;
                    } else {
                        itcVar = new itc(this, fbkVar);
                    }
                } else {
                    itcVar = new itc(this, fbkVar);
                }
                Object obj7 = itcVar.f105510a;
                int i10 = itcVar.f105511b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    y6s0 y6s0Var2 = ohoVar2 != null ? (y6s0) ohoVar2.f165512a : null;
                    itcVar.f105511b = 1;
                    Object objEmit5 = this.f125249b.emit(y6s0Var2, itcVar);
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
                if (fbkVar instanceof e0d) {
                    e0dVar = (e0d) fbkVar;
                    int i11 = e0dVar.f54942b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        e0dVar.f54942b = i11 - Integer.MIN_VALUE;
                    } else {
                        e0dVar = new e0d(this, fbkVar);
                    }
                } else {
                    e0dVar = new e0d(this, fbkVar);
                }
                Object obj8 = e0dVar.f54941a;
                int i12 = e0dVar.f54942b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    if (((e301) obj).f55572b) {
                        e0dVar.f54942b = 1;
                        Object objEmit6 = this.f125249b.emit(obj, e0dVar);
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
                if (fbkVar instanceof f0d) {
                    f0dVar = (f0d) fbkVar;
                    int i13 = f0dVar.f64611b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        f0dVar.f64611b = i13 - Integer.MIN_VALUE;
                    } else {
                        f0dVar = new f0d(this, fbkVar);
                    }
                } else {
                    f0dVar = new f0d(this, fbkVar);
                }
                Object obj9 = f0dVar.f64610a;
                int i14 = f0dVar.f64611b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    String str = ((e301) obj).f55571a;
                    f0dVar.f64611b = 1;
                    Object objEmit7 = this.f125249b.emit(str, f0dVar);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof hgd) {
                    hgdVar = (hgd) fbkVar;
                    int i15 = hgdVar.f91132b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hgdVar.f91132b = i15 - Integer.MIN_VALUE;
                    } else {
                        hgdVar = new hgd(this, fbkVar);
                    }
                } else {
                    hgdVar = new hgd(this, fbkVar);
                }
                Object obj10 = hgdVar.f91131a;
                int i16 = hgdVar.f91132b;
                if (i16 == 0) {
                    bga.m29073P(obj10);
                    yjb yjbVar = (yjb) obj;
                    if (wj50.m88271j(yjbVar, xjb.f262083a)) {
                        dgdVar = bgd.f26918a;
                    } else if (wj50.m88271j(yjbVar, vjb.f241935a)) {
                        dgdVar = cgd.f37639a;
                    } else {
                        if (!(yjbVar instanceof wjb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dgdVar = new dgd(((wjb) yjbVar).f251924a);
                    }
                    hgdVar.f91132b = 1;
                    Object objEmit8 = this.f125249b.emit(dgdVar, hgdVar);
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
                if (fbkVar instanceof pid) {
                    pidVar = (pid) fbkVar;
                    int i17 = pidVar.f177921b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        pidVar.f177921b = i17 - Integer.MIN_VALUE;
                    } else {
                        pidVar = new pid(this, fbkVar);
                    }
                } else {
                    pidVar = new pid(this, fbkVar);
                }
                Object obj11 = pidVar.f177920a;
                int i18 = pidVar.f177921b;
                if (i18 == 0) {
                    bga.m29073P(obj11);
                    if (((q6n0) obj).f185865a != null) {
                        pidVar.f177921b = 1;
                        Object objEmit9 = this.f125249b.emit(obj, pidVar);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof rld) {
                    rldVar = (rld) fbkVar;
                    int i19 = rldVar.f200281b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        rldVar.f200281b = i19 - Integer.MIN_VALUE;
                    } else {
                        rldVar = new rld(this, fbkVar);
                    }
                } else {
                    rldVar = new rld(this, fbkVar);
                }
                Object obj12 = rldVar.f200280a;
                int i20 = rldVar.f200281b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    Boolean boolValueOf = Boolean.valueOf(dxf1.m37249y((Map) obj));
                    rldVar.f200281b = 1;
                    Object objEmit10 = this.f125249b.emit(boolValueOf, rldVar);
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
                if (fbkVar instanceof fmd) {
                    fmdVar = (fmd) fbkVar;
                    int i21 = fmdVar.f71026b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        fmdVar.f71026b = i21 - Integer.MIN_VALUE;
                    } else {
                        fmdVar = new fmd(this, fbkVar);
                    }
                } else {
                    fmdVar = new fmd(this, fbkVar);
                }
                Object obj13 = fmdVar.f71025a;
                int i22 = fmdVar.f71026b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf2 = Boolean.valueOf(dxf1.m37249y((Map) obj));
                    fmdVar.f71026b = 1;
                    Object objEmit11 = this.f125249b.emit(boolValueOf2, fmdVar);
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
                if (fbkVar instanceof nmd) {
                    nmdVar = (nmd) fbkVar;
                    int i23 = nmdVar.f155408b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        nmdVar.f155408b = i23 - Integer.MIN_VALUE;
                    } else {
                        nmdVar = new nmd(this, fbkVar);
                    }
                } else {
                    nmdVar = new nmd(this, fbkVar);
                }
                Object obj14 = nmdVar.f155407a;
                int i24 = nmdVar.f155408b;
                if (i24 == 0) {
                    bga.m29073P(obj14);
                    String str2 = ((e301) obj).f55571a;
                    nmdVar.f155408b = 1;
                    Object objEmit12 = this.f125249b.emit(str2, nmdVar);
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
                if (fbkVar instanceof omd) {
                    omdVar = (omd) fbkVar;
                    int i25 = omdVar.f167015b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        omdVar.f167015b = i25 - Integer.MIN_VALUE;
                    } else {
                        omdVar = new omd(this, fbkVar);
                    }
                } else {
                    omdVar = new omd(this, fbkVar);
                }
                Object obj15 = omdVar.f167014a;
                int i26 = omdVar.f167015b;
                if (i26 == 0) {
                    bga.m29073P(obj15);
                    gmr0 gmr0Var = (gmr0) ((xul0) obj).mo49283h();
                    if (gmr0Var == null) {
                        o8mVar = null;
                    } else {
                        String str3 = gmr0Var.f81455f;
                        if (str3 == null) {
                            str3 = (String) g6f.m43745s0(gmr0Var.f81454e);
                        }
                        o8mVar = new o8m(str3, gmr0Var.f81451b);
                    }
                    omdVar.f167015b = 1;
                    Object objEmit13 = this.f125249b.emit(o8mVar, omdVar);
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
                if (fbkVar instanceof npd) {
                    npdVar = (npd) fbkVar;
                    int i27 = npdVar.f156948b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        npdVar.f156948b = i27 - Integer.MIN_VALUE;
                    } else {
                        npdVar = new npd(this, fbkVar);
                    }
                } else {
                    npdVar = new npd(this, fbkVar);
                }
                Object obj16 = npdVar.f156947a;
                int i28 = npdVar.f156948b;
                if (i28 == 0) {
                    bga.m29073P(obj16);
                    fpd fpdVar = new fpd(((Boolean) obj).booleanValue());
                    npdVar.f156948b = 1;
                    Object objEmit14 = this.f125249b.emit(fpdVar, npdVar);
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
                if (fbkVar instanceof srd) {
                    srdVar = (srd) fbkVar;
                    int i29 = srdVar.f213302b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        srdVar.f213302b = i29 - Integer.MIN_VALUE;
                    } else {
                        srdVar = new srd(this, fbkVar);
                    }
                } else {
                    srdVar = new srd(this, fbkVar);
                }
                Object obj17 = srdVar.f213301a;
                int i30 = srdVar.f213302b;
                if (i30 == 0) {
                    bga.m29073P(obj17);
                    PlayerState playerState = (PlayerState) obj;
                    String strContextUri = playerState.contextUri();
                    wj50.m88279p(strContextUri);
                    if (!wl51.m88460J0(strContextUri) && !htc0.f94981a.contains(playerState.playOrigin().featureIdentifier())) {
                        srdVar.f213302b = 1;
                        Object objEmit15 = this.f125249b.emit(obj, srdVar);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit15 == yukVar15) {
                            return yukVar15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof hud) {
                    hudVar = (hud) fbkVar;
                    int i31 = hudVar.f95370b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        hudVar.f95370b = i31 - Integer.MIN_VALUE;
                    } else {
                        hudVar = new hud(this, fbkVar);
                    }
                } else {
                    hudVar = new hud(this, fbkVar);
                }
                Object obj18 = hudVar.f95369a;
                int i32 = hudVar.f95370b;
                if (i32 == 0) {
                    bga.m29073P(obj18);
                    Object obj19 = (Set) ((gv31) obj).f84602a;
                    if (obj19 == null) {
                        obj19 = gbu.f78413a;
                    }
                    hudVar.f95370b = 1;
                    Object objEmit16 = this.f125249b.emit(obj19, hudVar);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof nxd) {
                    nxdVar = (nxd) fbkVar;
                    int i33 = nxdVar.f159444b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        nxdVar.f159444b = i33 - Integer.MIN_VALUE;
                    } else {
                        nxdVar = new nxd(this, fbkVar);
                    }
                } else {
                    nxdVar = new nxd(this, fbkVar);
                }
                Object obj20 = nxdVar.f159443a;
                int i34 = nxdVar.f159444b;
                if (i34 == 0) {
                    bga.m29073P(obj20);
                    Boolean boolValueOf3 = Boolean.valueOf(((nx50) obj).f159369b);
                    nxdVar.f159444b = 1;
                    Object objEmit17 = this.f125249b.emit(boolValueOf3, nxdVar);
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
                if (fbkVar instanceof uxd) {
                    uxdVar = (uxd) fbkVar;
                    int i35 = uxdVar.f234891b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        uxdVar.f234891b = i35 - Integer.MIN_VALUE;
                    } else {
                        uxdVar = new uxd(this, fbkVar);
                    }
                } else {
                    uxdVar = new uxd(this, fbkVar);
                }
                Object obj21 = uxdVar.f234890a;
                int i36 = uxdVar.f234891b;
                if (i36 == 0) {
                    bga.m29073P(obj21);
                    Object obj22 = ((s6x0) obj).f206218a;
                    Object b8dVar = s6x0.m77348a(obj22) == null ? new b8d((rvc) obj22) : y7d.f270030a;
                    uxdVar.f234891b = 1;
                    Object objEmit18 = this.f125249b.emit(b8dVar, uxdVar);
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
                if (fbkVar instanceof dyd) {
                    dydVar = (dyd) fbkVar;
                    int i37 = dydVar.f54294b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        dydVar.f54294b = i37 - Integer.MIN_VALUE;
                    } else {
                        dydVar = new dyd(this, fbkVar);
                    }
                } else {
                    dydVar = new dyd(this, fbkVar);
                }
                Object obj23 = dydVar.f54293a;
                int i38 = dydVar.f54294b;
                if (i38 == 0) {
                    bga.m29073P(obj23);
                    ContextTrack contextTrackCreate = (ContextTrack) ((PlayerState) obj).track().mo49283h();
                    if (contextTrackCreate == null) {
                        contextTrackCreate = ContextTrack.create("");
                    }
                    dydVar.f54294b = 1;
                    Object objEmit19 = this.f125249b.emit(contextTrackCreate, dydVar);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof myd) {
                    mydVar = (myd) fbkVar;
                    int i39 = mydVar.f148427b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        mydVar.f148427b = i39 - Integer.MIN_VALUE;
                    } else {
                        mydVar = new myd(this, fbkVar);
                    }
                } else {
                    mydVar = new myd(this, fbkVar);
                }
                Object obj24 = mydVar.f148426a;
                int i40 = mydVar.f148427b;
                if (i40 == 0) {
                    bga.m29073P(obj24);
                    xul0 xul0VarTrack = ((PlayerState) obj).track();
                    boolean z = false;
                    if (xul0VarTrack != null && (contextTrack = (ContextTrack) xul0VarTrack.mo49283h()) != null && e72.m37994a0(contextTrack)) {
                        z = true;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    mydVar.f148427b = 1;
                    Object objEmit20 = this.f125249b.emit(boolValueOf4, mydVar);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof m3e) {
                    m3eVar = (m3e) fbkVar;
                    int i41 = m3eVar.f139619b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        m3eVar.f139619b = i41 - Integer.MIN_VALUE;
                    } else {
                        m3eVar = new m3e(this, fbkVar);
                    }
                } else {
                    m3eVar = new m3e(this, fbkVar);
                }
                Object obj25 = m3eVar.f139618a;
                int i42 = m3eVar.f139619b;
                if (i42 == 0) {
                    bga.m29073P(obj25);
                    Boolean boolValueOf5 = Boolean.valueOf(((l3e) obj) == l3e.f129304b);
                    m3eVar.f139619b = 1;
                    Object objEmit21 = this.f125249b.emit(boolValueOf5, m3eVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof o3e) {
                    o3eVar = (o3e) fbkVar;
                    int i43 = o3eVar.f161348b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        o3eVar.f161348b = i43 - Integer.MIN_VALUE;
                    } else {
                        o3eVar = new o3e(this, fbkVar);
                    }
                } else {
                    o3eVar = new o3e(this, fbkVar);
                }
                Object obj26 = o3eVar.f161347a;
                int i44 = o3eVar.f161348b;
                if (i44 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf6 = Boolean.valueOf(((l3e) obj) == l3e.f129303a);
                    o3eVar.f161348b = 1;
                    Object objEmit22 = this.f125249b.emit(boolValueOf6, o3eVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof p3e) {
                    p3eVar = (p3e) fbkVar;
                    int i45 = p3eVar.f173619b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        p3eVar.f173619b = i45 - Integer.MIN_VALUE;
                    } else {
                        p3eVar = new p3e(this, fbkVar);
                    }
                } else {
                    p3eVar = new p3e(this, fbkVar);
                }
                Object obj27 = p3eVar.f173618a;
                int i46 = p3eVar.f173619b;
                if (i46 == 0) {
                    bga.m29073P(obj27);
                    int iOrdinal = ((ru10) obj).ordinal();
                    if (iOrdinal == 1 || iOrdinal == 5) {
                        l3eVar = l3e.f129303a;
                    } else if (iOrdinal == 6) {
                        l3eVar = l3e.f129304b;
                    } else if (iOrdinal == 7) {
                        l3eVar = l3e.f129303a;
                    } else if (iOrdinal != 8) {
                        l3eVar = l3e.f129305c;
                    } else {
                        l3eVar = l3e.f129304b;
                    }
                    p3eVar.f173619b = 1;
                    Object objEmit23 = this.f125249b.emit(l3eVar, p3eVar);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof f4e) {
                    f4eVar = (f4e) fbkVar;
                    int i47 = f4eVar.f65766b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        f4eVar.f65766b = i47 - Integer.MIN_VALUE;
                    } else {
                        f4eVar = new f4e(this, fbkVar);
                    }
                } else {
                    f4eVar = new f4e(this, fbkVar);
                }
                Object obj28 = f4eVar.f65765a;
                int i48 = f4eVar.f65766b;
                if (i48 == 0) {
                    bga.m29073P(obj28);
                    Boolean boolValueOf7 = Boolean.valueOf(((knm0) obj) instanceof hnm0);
                    f4eVar.f65766b = 1;
                    Object objEmit24 = this.f125249b.emit(boolValueOf7, f4eVar);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof g4e) {
                    g4eVar = (g4e) fbkVar;
                    int i49 = g4eVar.f76397b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        g4eVar.f76397b = i49 - Integer.MIN_VALUE;
                    } else {
                        g4eVar = new g4e(this, fbkVar);
                    }
                } else {
                    g4eVar = new g4e(this, fbkVar);
                }
                Object obj29 = g4eVar.f76396a;
                int i50 = g4eVar.f76397b;
                if (i50 == 0) {
                    bga.m29073P(obj29);
                    Boolean boolValueOf8 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
                    g4eVar.f76397b = 1;
                    Object objEmit25 = this.f125249b.emit(boolValueOf8, g4eVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof g5e) {
                    g5eVar = (g5e) fbkVar;
                    int i51 = g5eVar.f76649b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        g5eVar.f76649b = i51 - Integer.MIN_VALUE;
                    } else {
                        g5eVar = new g5e(this, fbkVar);
                    }
                } else {
                    g5eVar = new g5e(this, fbkVar);
                }
                Object obj30 = g5eVar.f76648a;
                int i52 = g5eVar.f76649b;
                if (i52 == 0) {
                    bga.m29073P(obj30);
                    TreeMap treeMap = new TreeMap((Map) obj);
                    g5eVar.f76649b = 1;
                    Object objEmit26 = this.f125249b.emit(treeMap, g5eVar);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof j5e) {
                    j5eVar = (j5e) fbkVar;
                    int i53 = j5eVar.f108944b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        j5eVar.f108944b = i53 - Integer.MIN_VALUE;
                    } else {
                        j5eVar = new j5e(this, fbkVar);
                    }
                } else {
                    j5eVar = new j5e(this, fbkVar);
                }
                Object obj31 = j5eVar.f108943a;
                int i54 = j5eVar.f108944b;
                if (i54 == 0) {
                    bga.m29073P(obj31);
                    Boolean boolValueOf9 = Boolean.valueOf(!((SortedMap) obj).isEmpty());
                    j5eVar.f108944b = 1;
                    Object objEmit27 = this.f125249b.emit(boolValueOf9, j5eVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof m5e) {
                    m5eVar = (m5e) fbkVar;
                    int i55 = m5eVar.f140193b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        m5eVar.f140193b = i55 - Integer.MIN_VALUE;
                    } else {
                        m5eVar = new m5e(this, fbkVar);
                    }
                } else {
                    m5eVar = new m5e(this, fbkVar);
                }
                Object obj32 = m5eVar.f140192a;
                int i56 = m5eVar.f140193b;
                if (i56 == 0) {
                    bga.m29073P(obj32);
                    Collection<Boolean> collectionValues = ((SortedMap) obj).values();
                    boolean z2 = false;
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        for (Boolean bool : collectionValues) {
                            wj50.m88279p(bool);
                            if (bool.booleanValue()) {
                                z2 = true;
                            }
                        }
                    }
                    Boolean boolValueOf10 = Boolean.valueOf(z2);
                    m5eVar.f140193b = 1;
                    Object objEmit28 = this.f125249b.emit(boolValueOf10, m5eVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof p5e) {
                    p5eVar = (p5e) fbkVar;
                    int i57 = p5eVar.f174154b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        p5eVar.f174154b = i57 - Integer.MIN_VALUE;
                    } else {
                        p5eVar = new p5e(this, fbkVar);
                    }
                } else {
                    p5eVar = new p5e(this, fbkVar);
                }
                Object obj33 = p5eVar.f174153a;
                int i58 = p5eVar.f174154b;
                if (i58 == 0) {
                    bga.m29073P(obj33);
                    qho qhoVar3 = (qho) obj;
                    oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    Boolean boolValueOf11 = Boolean.valueOf(ohoVar3 != null ? ((Boolean) ohoVar3.f165512a).booleanValue() : false);
                    p5eVar.f174154b = 1;
                    Object objEmit29 = this.f125249b.emit(boolValueOf11, p5eVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof qbe) {
                    qbeVar = (qbe) fbkVar;
                    int i59 = qbeVar.f187075b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        qbeVar.f187075b = i59 - Integer.MIN_VALUE;
                    } else {
                        qbeVar = new qbe(this, fbkVar);
                    }
                } else {
                    qbeVar = new qbe(this, fbkVar);
                }
                Object obj34 = qbeVar.f187074a;
                int i60 = qbeVar.f187075b;
                if (i60 == 0) {
                    bga.m29073P(obj34);
                    EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = (EsContextPlayerState$ContextPlayerState) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrackM17720S = esContextPlayerState$ContextPlayerState.m17720S();
                    if (esProvidedTrack$ProvidedTrackM17720S == null || (esContextTrack$ContextTrackM17850q = esProvidedTrack$ProvidedTrackM17720S.m17850q()) == null || (uri = esContextTrack$ContextTrackM17850q.getUri()) == null) {
                        uri = "";
                    }
                    String string = new nl60(linkedHashMap).toString();
                    qbeVar.f187075b = 1;
                    Object objEmit30 = this.f125249b.emit(string, qbeVar);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
        }
    }
}
