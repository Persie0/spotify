package p204p;

import android.text.Html;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class b3t implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f23128b;

    public /* synthetic */ b3t(niz nizVar, int i) {
        this.f23127a = i;
        this.f23128b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x022e  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:195:0x033c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0385  */
    /* JADX WARN: Code duplicated, block: B:233:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:250:0x040e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0457  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:288:0x049e  */
    /* JADX WARN: Code duplicated, block: B:305:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:322:0x0526  */
    /* JADX WARN: Code duplicated, block: B:341:0x0573  */
    /* JADX WARN: Code duplicated, block: B:360:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:377:0x0603  */
    /* JADX WARN: Code duplicated, block: B:400:0x0663  */
    /* JADX WARN: Code duplicated, block: B:421:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:438:0x0701  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:455:0x074c  */
    /* JADX WARN: Code duplicated, block: B:487:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:519:0x0846  */
    /* JADX WARN: Code duplicated, block: B:540:0x0895  */
    /* JADX WARN: Code duplicated, block: B:561:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:582:0x094b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        a3t a3tVar;
        n3t n3tVar;
        i9t i9tVar;
        aat aatVar;
        hat hatVar;
        p3r p3rVar;
        String str;
        kat katVar;
        Object dbtVar;
        zpt zptVar;
        ost ostVar;
        jtt jttVar;
        q290 q290Var;
        ltt lttVar;
        ttt tttVar;
        a3u a3uVar;
        c3u c3uVar;
        d3u d3uVar;
        e3u e3uVar;
        g4u g4uVar;
        h4u h4uVar;
        i4u i4uVar;
        m4u m4uVar;
        n4u n4uVar;
        o4u o4uVar;
        t4u t4uVar;
        p5u p5uVar;
        PlayerState playerState;
        niz nizVar;
        int i;
        o6u o6uVar;
        b3v b3vVar;
        c3v c3vVar;
        nev nevVar;
        ybv ybvVar;
        qmv qmvVar;
        rmv rmvVar;
        smv smvVar;
        switch (this.f23127a) {
            case 0:
                if (fbkVar instanceof a3t) {
                    a3tVar = (a3t) fbkVar;
                    int i2 = a3tVar.f12069b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        a3tVar.f12069b = i2 - Integer.MIN_VALUE;
                    } else {
                        a3tVar = new a3t(this, fbkVar);
                    }
                } else {
                    a3tVar = new a3t(this, fbkVar);
                }
                Object obj2 = a3tVar.f12068a;
                int i3 = a3tVar.f12069b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    List list = (List) obj;
                    int iM46714K = h6f.m46714K(list);
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    int i4 = 0;
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        llp0 llp0Var = (llp0) obj3;
                        arrayList.add(new sec1(new u6t0(i4, llp0Var.f134680a, llp0Var.f134681b, llp0Var.f134684e, i4 == iM46714K, llp0Var.f134683d), "publishable_".concat(llp0Var.f134682c)));
                        i4 = i5;
                    }
                    a3tVar.f12069b = 1;
                    Object objEmit = this.f23128b.emit(arrayList, a3tVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof n3t) {
                    n3tVar = (n3t) fbkVar;
                    int i6 = n3tVar.f150121b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        n3tVar.f150121b = i6 - Integer.MIN_VALUE;
                    } else {
                        n3tVar = new n3t(this, fbkVar);
                    }
                } else {
                    n3tVar = new n3t(this, fbkVar);
                }
                Object obj4 = n3tVar.f150120a;
                int i7 = n3tVar.f150121b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((llp0) it.next()).f134680a);
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList2);
                    n3tVar.f150121b = 1;
                    Object objEmit2 = this.f23128b.emit(setM43736n1, n3tVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof i9t) {
                    i9tVar = (i9t) fbkVar;
                    int i8 = i9tVar.f100072b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        i9tVar.f100072b = i8 - Integer.MIN_VALUE;
                    } else {
                        i9tVar = new i9t(this, fbkVar);
                    }
                } else {
                    i9tVar = new i9t(this, fbkVar);
                }
                Object obj5 = i9tVar.f100071a;
                int i9 = i9tVar.f100072b;
                if (i9 == 0) {
                    bga.m29073P(obj5);
                    qho qhoVar = (qho) obj;
                    Object obj6 = qhoVar instanceof oho ? (List) ((oho) qhoVar).f165512a : lau.f131415a;
                    i9tVar.f100072b = 1;
                    Object objEmit3 = this.f23128b.emit(obj6, i9tVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof aat) {
                    aatVar = (aat) fbkVar;
                    int i10 = aatVar.f13919b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aatVar.f13919b = i10 - Integer.MIN_VALUE;
                    } else {
                        aatVar = new aat(this, fbkVar);
                    }
                } else {
                    aatVar = new aat(this, fbkVar);
                }
                Object obj7 = aatVar.f13918a;
                int i11 = aatVar.f13919b;
                if (i11 == 0) {
                    bga.m29073P(obj7);
                    qho qhoVar2 = (qho) obj;
                    Object obj8 = qhoVar2 instanceof oho ? (List) ((oho) qhoVar2).f165512a : lau.f131415a;
                    aatVar.f13919b = 1;
                    Object objEmit4 = this.f23128b.emit(obj8, aatVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof hat) {
                    hatVar = (hat) fbkVar;
                    int i12 = hatVar.f89275b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        hatVar.f89275b = i12 - Integer.MIN_VALUE;
                    } else {
                        hatVar = new hat(this, fbkVar);
                    }
                } else {
                    hatVar = new hat(this, fbkVar);
                }
                Object obj9 = hatVar.f89274a;
                int i13 = hatVar.f89275b;
                if (i13 == 0) {
                    bga.m29073P(obj9);
                    qho qhoVar3 = (qho) obj;
                    String string = null;
                    oho ohoVar = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    if (ohoVar != null && (p3rVar = (p3r) ohoVar.f165512a) != null && (str = p3rVar.f173690a) != null) {
                        if (wl51.m88460J0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            string = wl51.m88491o1(Html.fromHtml(str, 0).toString()).toString();
                        }
                    }
                    hatVar.f89275b = 1;
                    Object objEmit5 = this.f23128b.emit(string, hatVar);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof kat) {
                    katVar = (kat) fbkVar;
                    int i14 = katVar.f120960b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        katVar.f120960b = i14 - Integer.MIN_VALUE;
                    } else {
                        katVar = new kat(this, fbkVar);
                    }
                } else {
                    katVar = new kat(this, fbkVar);
                }
                Object obj10 = katVar.f120959a;
                int i15 = katVar.f120960b;
                if (i15 == 0) {
                    bga.m29073P(obj10);
                    qho qhoVar4 = (qho) obj;
                    if (qhoVar4 instanceof oho) {
                        dbtVar = new fbt(((byv) ((oho) qhoVar4).f165512a).f32324a == 14);
                    } else if (qhoVar4 instanceof pho) {
                        dbtVar = ebt.f58129a;
                    } else {
                        if (!(qhoVar4 instanceof nho)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dbtVar = new dbt(new RuntimeException("Editor detection failed: " + ((nho) qhoVar4).f154041a));
                    }
                    katVar.f120960b = 1;
                    Object objEmit6 = this.f23128b.emit(dbtVar, katVar);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof zpt) {
                    zptVar = (zpt) fbkVar;
                    int i16 = zptVar.f285218b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        zptVar.f285218b = i16 - Integer.MIN_VALUE;
                    } else {
                        zptVar = new zpt(this, fbkVar);
                    }
                } else {
                    zptVar = new zpt(this, fbkVar);
                }
                Object obj11 = zptVar.f285217a;
                int i17 = zptVar.f285218b;
                if (i17 == 0) {
                    bga.m29073P(obj11);
                    f4m f4mVar = (f4m) obj;
                    lp10 lp10Var = new lp10(f4mVar.f65800a, f4mVar.f65801b);
                    zptVar.f285218b = 1;
                    Object objEmit7 = this.f23128b.emit(lp10Var, zptVar);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ost) {
                    ostVar = (ost) fbkVar;
                    int i18 = ostVar.f168889b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ostVar.f168889b = i18 - Integer.MIN_VALUE;
                    } else {
                        ostVar = new ost(this, fbkVar);
                    }
                } else {
                    ostVar = new ost(this, fbkVar);
                }
                Object obj12 = ostVar.f168888a;
                int i19 = ostVar.f168889b;
                if (i19 == 0) {
                    bga.m29073P(obj12);
                    y6v y6vVar = new y6v(((fxx) obj).f74479a);
                    ostVar.f168889b = 1;
                    Object objEmit8 = this.f23128b.emit(y6vVar, ostVar);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof jtt) {
                    jttVar = (jtt) fbkVar;
                    int i20 = jttVar.f115968b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        jttVar.f115968b = i20 - Integer.MIN_VALUE;
                    } else {
                        jttVar = new jtt(this, fbkVar);
                    }
                } else {
                    jttVar = new jtt(this, fbkVar);
                }
                Object obj13 = jttVar.f115967a;
                int i21 = jttVar.f115968b;
                if (i21 == 0) {
                    bga.m29073P(obj13);
                    vu50 vu50Var = (vu50) obj;
                    if (vu50Var instanceof su50) {
                        xu50 xu50Var = ((su50) vu50Var).f214009a;
                        q290Var = new q290(xu50Var.f266006a, xu50Var.f266007b);
                    } else {
                        q290Var = null;
                    }
                    jttVar.f115968b = 1;
                    Object objEmit9 = this.f23128b.emit(q290Var, jttVar);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof ltt) {
                    lttVar = (ltt) fbkVar;
                    int i22 = lttVar.f136864b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        lttVar.f136864b = i22 - Integer.MIN_VALUE;
                    } else {
                        lttVar = new ltt(this, fbkVar);
                    }
                } else {
                    lttVar = new ltt(this, fbkVar);
                }
                Object obj14 = lttVar.f136863a;
                int i23 = lttVar.f136864b;
                if (i23 == 0) {
                    bga.m29073P(obj14);
                    PlayerState playerState2 = (PlayerState) obj;
                    wj50.m88279p(playerState2);
                    Boolean boolValueOf = Boolean.valueOf(playerState2.restrictions().disallowPeekingNextReasons().isEmpty() && !hdi.m47214F(playerState2));
                    lttVar.f136864b = 1;
                    Object objEmit10 = this.f23128b.emit(boolValueOf, lttVar);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof ttt) {
                    tttVar = (ttt) fbkVar;
                    int i24 = tttVar.f223674b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        tttVar.f223674b = i24 - Integer.MIN_VALUE;
                    } else {
                        tttVar = new ttt(this, fbkVar);
                    }
                } else {
                    tttVar = new ttt(this, fbkVar);
                }
                Object obj15 = tttVar.f223673a;
                int i25 = tttVar.f223674b;
                if (i25 == 0) {
                    bga.m29073P(obj15);
                    s6x0 s6x0Var = new s6x0((List) obj);
                    tttVar.f223674b = 1;
                    Object objEmit11 = this.f23128b.emit(s6x0Var, tttVar);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof a3u) {
                    a3uVar = (a3u) fbkVar;
                    int i26 = a3uVar.f12074b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        a3uVar.f12074b = i26 - Integer.MIN_VALUE;
                    } else {
                        a3uVar = new a3u(this, fbkVar);
                    }
                } else {
                    a3uVar = new a3u(this, fbkVar);
                }
                Object obj16 = a3uVar.f12073a;
                int i27 = a3uVar.f12074b;
                if (i27 == 0) {
                    bga.m29073P(obj16);
                    if (!((PlayerState) obj).isPaused()) {
                        a3uVar.f12074b = 1;
                        Object objEmit12 = this.f23128b.emit(obj, a3uVar);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof c3u) {
                    c3uVar = (c3u) fbkVar;
                    int i28 = c3uVar.f33762b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c3uVar.f33762b = i28 - Integer.MIN_VALUE;
                    } else {
                        c3uVar = new c3u(this, fbkVar);
                    }
                } else {
                    c3uVar = new c3u(this, fbkVar);
                }
                Object obj17 = c3uVar.f33761a;
                int i29 = c3uVar.f33762b;
                if (i29 == 0) {
                    bga.m29073P(obj17);
                    if (((PlayerState) obj).track().mo49279c()) {
                        c3uVar.f33762b = 1;
                        Object objEmit13 = this.f23128b.emit(obj, c3uVar);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit13 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof d3u) {
                    d3uVar = (d3u) fbkVar;
                    int i30 = d3uVar.f45001b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        d3uVar.f45001b = i30 - Integer.MIN_VALUE;
                    } else {
                        d3uVar = new d3u(this, fbkVar);
                    }
                } else {
                    d3uVar = new d3u(this, fbkVar);
                }
                Object obj18 = d3uVar.f45000a;
                int i31 = d3uVar.f45001b;
                if (i31 == 0) {
                    bga.m29073P(obj18);
                    d3uVar.f45001b = 1;
                    Object objEmit14 = this.f23128b.emit(fii0.f69894a, d3uVar);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof e3u) {
                    e3uVar = (e3u) fbkVar;
                    int i32 = e3uVar.f55886b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        e3uVar.f55886b = i32 - Integer.MIN_VALUE;
                    } else {
                        e3uVar = new e3u(this, fbkVar);
                    }
                } else {
                    e3uVar = new e3u(this, fbkVar);
                }
                Object obj19 = e3uVar.f55885a;
                int i33 = e3uVar.f55886b;
                if (i33 == 0) {
                    bga.m29073P(obj19);
                    e3uVar.f55886b = 1;
                    Object objEmit15 = this.f23128b.emit(gj50.f80373a, e3uVar);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof g4u) {
                    g4uVar = (g4u) fbkVar;
                    int i34 = g4uVar.f76529b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        g4uVar.f76529b = i34 - Integer.MIN_VALUE;
                    } else {
                        g4uVar = new g4u(this, fbkVar);
                    }
                } else {
                    g4uVar = new g4u(this, fbkVar);
                }
                Object obj20 = g4uVar.f76528a;
                int i35 = g4uVar.f76529b;
                if (i35 == 0) {
                    bga.m29073P(obj20);
                    if (((sv0) obj) instanceof rv0) {
                        g4uVar.f76529b = 1;
                        Object objEmit16 = this.f23128b.emit(obj, g4uVar);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof h4u) {
                    h4uVar = (h4u) fbkVar;
                    int i36 = h4uVar.f87647b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        h4uVar.f87647b = i36 - Integer.MIN_VALUE;
                    } else {
                        h4uVar = new h4u(this, fbkVar);
                    }
                } else {
                    h4uVar = new h4u(this, fbkVar);
                }
                Object obj21 = h4uVar.f87646a;
                int i37 = h4uVar.f87647b;
                if (i37 == 0) {
                    bga.m29073P(obj21);
                    if (((Boolean) obj).booleanValue()) {
                        h4uVar.f87647b = 1;
                        Object objEmit17 = this.f23128b.emit(obj, h4uVar);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof i4u) {
                    i4uVar = (i4u) fbkVar;
                    int i38 = i4uVar.f98588b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        i4uVar.f98588b = i38 - Integer.MIN_VALUE;
                    } else {
                        i4uVar = new i4u(this, fbkVar);
                    }
                } else {
                    i4uVar = new i4u(this, fbkVar);
                }
                Object obj22 = i4uVar.f98587a;
                int i39 = i4uVar.f98588b;
                if (i39 == 0) {
                    bga.m29073P(obj22);
                    Boolean bool = Boolean.FALSE;
                    i4uVar.f98588b = 1;
                    Object objEmit18 = this.f23128b.emit(bool, i4uVar);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof m4u) {
                    m4uVar = (m4u) fbkVar;
                    int i40 = m4uVar.f140024b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        m4uVar.f140024b = i40 - Integer.MIN_VALUE;
                    } else {
                        m4uVar = new m4u(this, fbkVar);
                    }
                } else {
                    m4uVar = new m4u(this, fbkVar);
                }
                Object obj23 = m4uVar.f140023a;
                int i41 = m4uVar.f140024b;
                if (i41 == 0) {
                    bga.m29073P(obj23);
                    if (((sv0) obj) instanceof rv0) {
                        m4uVar.f140024b = 1;
                        Object objEmit19 = this.f23128b.emit(obj, m4uVar);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit19 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof n4u) {
                    n4uVar = (n4u) fbkVar;
                    int i42 = n4uVar.f150420b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        n4uVar.f150420b = i42 - Integer.MIN_VALUE;
                    } else {
                        n4uVar = new n4u(this, fbkVar);
                    }
                } else {
                    n4uVar = new n4u(this, fbkVar);
                }
                Object obj24 = n4uVar.f150419a;
                int i43 = n4uVar.f150420b;
                if (i43 == 0) {
                    bga.m29073P(obj24);
                    if (((Boolean) obj).booleanValue()) {
                        n4uVar.f150420b = 1;
                        Object objEmit20 = this.f23128b.emit(obj, n4uVar);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof o4u) {
                    o4uVar = (o4u) fbkVar;
                    int i44 = o4uVar.f161754b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        o4uVar.f161754b = i44 - Integer.MIN_VALUE;
                    } else {
                        o4uVar = new o4u(this, fbkVar);
                    }
                } else {
                    o4uVar = new o4u(this, fbkVar);
                }
                Object obj25 = o4uVar.f161753a;
                int i45 = o4uVar.f161754b;
                if (i45 == 0) {
                    bga.m29073P(obj25);
                    Boolean bool2 = Boolean.FALSE;
                    o4uVar.f161754b = 1;
                    Object objEmit21 = this.f23128b.emit(bool2, o4uVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof t4u) {
                    t4uVar = (t4u) fbkVar;
                    int i46 = t4uVar.f217075b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        t4uVar.f217075b = i46 - Integer.MIN_VALUE;
                    } else {
                        t4uVar = new t4u(this, fbkVar);
                    }
                } else {
                    t4uVar = new t4u(this, fbkVar);
                }
                Object obj26 = t4uVar.f217074a;
                int i47 = t4uVar.f217075b;
                if (i47 == 0) {
                    bga.m29073P(obj26);
                    xul0 xul0VarTrack = ((PlayerState) obj).track();
                    t4uVar.f217075b = 1;
                    Object objEmit22 = this.f23128b.emit(xul0VarTrack, t4uVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof p5u) {
                    p5uVar = (p5u) fbkVar;
                    int i48 = p5uVar.f174228b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        p5uVar.f174228b = i48 - Integer.MIN_VALUE;
                    } else {
                        p5uVar = new p5u(this, fbkVar);
                    }
                } else {
                    p5uVar = new p5u(this, fbkVar);
                }
                Object obj27 = p5uVar.f174227a;
                int i49 = p5uVar.f174228b;
                yuk yukVar23 = yuk.f276404a;
                if (i49 != 0) {
                    if (i49 == 1) {
                        i = p5uVar.f174230d;
                        playerState = p5uVar.f174232f;
                        nizVar = p5uVar.f174229c;
                        bga.m29073P(obj27);
                    } else {
                        if (i49 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj27);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj27);
                pqm0 pqm0Var = (pqm0) obj;
                playerState = (PlayerState) pqm0Var.f180350a;
                ff81 ff81Var = (ff81) pqm0Var.f180351b;
                niz nizVar2 = this.f23128b;
                p5uVar.f174229c = nizVar2;
                p5uVar.f174232f = playerState;
                p5uVar.f174230d = 0;
                p5uVar.f174228b = 1;
                qsb qsbVar = ff81Var.f68948a;
                wj50.m88279p(qsbVar);
                yb81 yb81Var = ff81Var.f68949b;
                Object objM97187g = zxc.m97187g(playerState, qsbVar, (r741) yb81Var.f271103c, (gzb) yb81Var.f271104d, p5uVar);
                if (objM97187g == yukVar23) {
                    return yukVar23;
                }
                nizVar = nizVar2;
                obj27 = objM97187g;
                i = 0;
                pqm0 pqm0Var2 = new pqm0(obj27, playerState);
                p5uVar.f174229c = null;
                p5uVar.f174232f = null;
                p5uVar.f174230d = i;
                p5uVar.f174228b = 2;
                if (nizVar.emit(pqm0Var2, p5uVar) == yukVar23) {
                    return yukVar23;
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof o6u) {
                    o6uVar = (o6u) fbkVar;
                    int i50 = o6uVar.f162415b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        o6uVar.f162415b = i50 - Integer.MIN_VALUE;
                    } else {
                        o6uVar = new o6u(this, fbkVar);
                    }
                } else {
                    o6uVar = new o6u(this, fbkVar);
                }
                Object obj28 = o6uVar.f162414a;
                int i51 = o6uVar.f162415b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                o6uVar.f162415b = 1;
                Object objEmit23 = this.f23128b.emit(w2a1Var, o6uVar);
                yuk yukVar24 = yuk.f276404a;
                return objEmit23 == yukVar24 ? yukVar24 : w2a1Var;
            case 24:
                if (fbkVar instanceof b3v) {
                    b3vVar = (b3v) fbkVar;
                    int i52 = b3vVar.f23136b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        b3vVar.f23136b = i52 - Integer.MIN_VALUE;
                    } else {
                        b3vVar = new b3v(this, fbkVar);
                    }
                } else {
                    b3vVar = new b3v(this, fbkVar);
                }
                Object obj29 = b3vVar.f23135a;
                int i53 = b3vVar.f23136b;
                if (i53 == 0) {
                    bga.m29073P(obj29);
                    ehy0 ehy0Var = (ehy0) obj;
                    w850 w850VarMo48976j = ehy0Var instanceof chy0 ? ((ix70) ((chy0) ehy0Var).f38149a).mo48976j() : null;
                    b3vVar.f23136b = 1;
                    Object objEmit24 = this.f23128b.emit(w850VarMo48976j, b3vVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit24 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof c3v) {
                    c3vVar = (c3v) fbkVar;
                    int i54 = c3vVar.f33766b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        c3vVar.f33766b = i54 - Integer.MIN_VALUE;
                    } else {
                        c3vVar = new c3v(this, fbkVar);
                    }
                } else {
                    c3vVar = new c3v(this, fbkVar);
                }
                Object obj30 = c3vVar.f33765a;
                int i55 = c3vVar.f33766b;
                if (i55 == 0) {
                    bga.m29073P(obj30);
                    Boolean boolValueOf2 = Boolean.valueOf(!wj50.m88271j((v6g0) obj, t6g0.f217551a));
                    c3vVar.f33766b = 1;
                    Object objEmit25 = this.f23128b.emit(boolValueOf2, c3vVar);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit25 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof nev) {
                    nevVar = (nev) fbkVar;
                    int i56 = nevVar.f153116b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        nevVar.f153116b = i56 - Integer.MIN_VALUE;
                    } else {
                        nevVar = new nev(this, fbkVar);
                    }
                } else {
                    nevVar = new nev(this, fbkVar);
                }
                Object obj31 = nevVar.f153115a;
                int i57 = nevVar.f153116b;
                if (i57 == 0) {
                    bga.m29073P(obj31);
                    qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
                    boolean z = false;
                    if (qu80Var != null && (ybvVar = qu80Var.f192599e) != null && ybvVar.f271262g) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    nevVar.f153116b = 1;
                    Object objEmit26 = this.f23128b.emit(boolValueOf3, nevVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit26 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof qmv) {
                    qmvVar = (qmv) fbkVar;
                    int i58 = qmvVar.f190415b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        qmvVar.f190415b = i58 - Integer.MIN_VALUE;
                    } else {
                        qmvVar = new qmv(this, fbkVar);
                    }
                } else {
                    qmvVar = new qmv(this, fbkVar);
                }
                Object obj32 = qmvVar.f190414a;
                int i59 = qmvVar.f190415b;
                if (i59 == 0) {
                    bga.m29073P(obj32);
                    tfv tfvVar = new tfv(((Boolean) obj).booleanValue());
                    qmvVar.f190415b = 1;
                    Object objEmit27 = this.f23128b.emit(tfvVar, qmvVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit27 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof rmv) {
                    rmvVar = (rmv) fbkVar;
                    int i60 = rmvVar.f200619b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        rmvVar.f200619b = i60 - Integer.MIN_VALUE;
                    } else {
                        rmvVar = new rmv(this, fbkVar);
                    }
                } else {
                    rmvVar = new rmv(this, fbkVar);
                }
                Object obj33 = rmvVar.f200618a;
                int i61 = rmvVar.f200619b;
                if (i61 == 0) {
                    bga.m29073P(obj33);
                    ofv ofvVar = new ofv(((Boolean) obj).booleanValue());
                    rmvVar.f200619b = 1;
                    Object objEmit28 = this.f23128b.emit(ofvVar, rmvVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit28 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof smv) {
                    smvVar = (smv) fbkVar;
                    int i62 = smvVar.f210730b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        smvVar.f210730b = i62 - Integer.MIN_VALUE;
                    } else {
                        smvVar = new smv(this, fbkVar);
                    }
                } else {
                    smvVar = new smv(this, fbkVar);
                }
                Object obj34 = smvVar.f210729a;
                int i63 = smvVar.f210730b;
                if (i63 == 0) {
                    bga.m29073P(obj34);
                    vfv vfvVar = new vfv((vv11) obj);
                    smvVar.f210730b = 1;
                    Object objEmit29 = this.f23128b.emit(vfvVar, smvVar);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit29 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
        }
    }

    public b3t(niz nizVar, umn umnVar) {
        this.f23127a = 9;
        this.f23128b = nizVar;
    }
}
