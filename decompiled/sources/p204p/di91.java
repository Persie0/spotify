package p204p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.pam.p118v2.GetYourPremiumBadgeResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class di91 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49288c;

    public /* synthetic */ di91(int i, Object obj, Object obj2) {
        this.f49286a = i;
        this.f49287b = obj;
        this.f49288c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m36071b(Object obj, fbk fbkVar) {
        rwe1 rwe1Var;
        xx11 xx11Var;
        if (fbkVar instanceof rwe1) {
            rwe1Var = (rwe1) fbkVar;
            int i = rwe1Var.f203335b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwe1Var.f203335b = i - Integer.MIN_VALUE;
            } else {
                rwe1Var = new rwe1(this, fbkVar);
            }
        } else {
            rwe1Var = new rwe1(this, fbkVar);
        }
        Object obj2 = rwe1Var.f203334a;
        int i2 = rwe1Var.f203335b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            niz nizVar = (niz) this.f49287b;
            if (((Boolean) obj).booleanValue()) {
                xx11Var = null;
            } else {
                eb90 eb90Var = (eb90) this.f49288c;
                oru oruVar = oru.f168656c;
                Integer numValueOf = Integer.valueOf(R.string.your_updates_side_drawer_link_title);
                String str = xoc1.f263897H2.f243453a;
                tfh0 tfh0Var = (tfh0) eb90Var.f57864b.get();
                tfh0Var.getClass();
                xx11Var = new xx11(oruVar, numValueOf, str, null, new wx11(new mfh0(tfh0Var), zme1.f284265g), (ay11) ((i4t0) eb90Var.f57865c).get(), 18);
            }
            rwe1Var.f203335b = 1;
            Object objEmit = nizVar.emit(xx11Var, rwe1Var);
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

    /* JADX WARN: Code duplicated, block: B:148:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:165:0x0345  */
    /* JADX WARN: Code duplicated, block: B:182:0x039d  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:219:0x044b  */
    /* JADX WARN: Code duplicated, block: B:239:0x049f  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0523  */
    /* JADX WARN: Code duplicated, block: B:295:0x0587  */
    /* JADX WARN: Code duplicated, block: B:358:0x066f  */
    /* JADX WARN: Code duplicated, block: B:381:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:406:0x0739  */
    /* JADX WARN: Code duplicated, block: B:418:0x075d  */
    /* JADX WARN: Code duplicated, block: B:445:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:465:0x081e  */
    /* JADX WARN: Code duplicated, block: B:476:0x0844  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:493:0x0890  */
    /* JADX WARN: Code duplicated, block: B:522:0x0904  */
    /* JADX WARN: Code duplicated, block: B:546:0x0994  */
    /* JADX WARN: Code duplicated, block: B:563:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:587:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:610:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:635:0x0b29  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, java.util.Collection] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Exception {
        ci91 ci91Var;
        xfa1 xfa1Var;
        yga1 yga1Var;
        yta1 yta1Var;
        p6b1 p6b1Var;
        fjb1 fjb1Var;
        xub1 xub1Var;
        h1c1 h1c1Var;
        pgc1 pgc1Var;
        boolean z;
        vgc1 vgc1Var;
        r6m0 r6m0Var;
        evc1 evc1Var;
        Object svc1Var;
        ewc1 ewc1Var;
        pb11 nb11Var;
        hyd1 hyd1Var;
        i4e1 i4e1Var;
        j4e1 j4e1Var;
        Object l4e1Var;
        n3e1 n3e1VarM80116f;
        k9e1 k9e1Var;
        m9e1 m9e1Var;
        dae1 dae1Var;
        rae1 rae1Var;
        lde1 lde1Var;
        eie1 eie1Var;
        int i;
        String string;
        boolean z2;
        String string2;
        String strUri;
        hte1 hte1Var;
        switch (this.f49286a) {
            case 0:
                if (fbkVar instanceof ci91) {
                    ci91Var = (ci91) fbkVar;
                    int i2 = ci91Var.f38259b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ci91Var.f38259b = i2 - Integer.MIN_VALUE;
                    } else {
                        ci91Var = new ci91(this, fbkVar);
                    }
                } else {
                    ci91Var = new ci91(this, fbkVar);
                }
                Object obj2 = ci91Var.f38258a;
                int i3 = ci91Var.f38259b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f49287b;
                    if (((ji91) obj) == ((ji91) this.f49288c)) {
                        ci91Var.f38259b = 1;
                        Object objEmit = nizVar.emit(obj, ci91Var);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                yfa1 yfa1Var = (yfa1) this.f49288c;
                if (fbkVar instanceof xfa1) {
                    xfa1Var = (xfa1) fbkVar;
                    int i4 = xfa1Var.f260887b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xfa1Var.f260887b = i4 - Integer.MIN_VALUE;
                    } else {
                        xfa1Var = new xfa1(this, fbkVar);
                    }
                } else {
                    xfa1Var = new xfa1(this, fbkVar);
                }
                Object obj3 = xfa1Var.f260886a;
                int i5 = xfa1Var.f260887b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar2 = (niz) this.f49287b;
                    kp5 kp5Var = (kp5) obj;
                    Boolean boolValueOf = Boolean.valueOf(yfa1Var.f272193b.f169004a.m37707A() && yfa1Var.f272195d.contains(kp5Var.f124979a) && kp5Var.f124980b == r6m0.f196325a);
                    xfa1Var.f260887b = 1;
                    Object objEmit2 = nizVar2.emit(boolValueOf, xfa1Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof yga1) {
                    yga1Var = (yga1) fbkVar;
                    int i6 = yga1Var.f272532b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        yga1Var.f272532b = i6 - Integer.MIN_VALUE;
                    } else {
                        yga1Var = new yga1(this, fbkVar);
                    }
                } else {
                    yga1Var = new yga1(this, fbkVar);
                }
                Object obj4 = yga1Var.f272531a;
                int i7 = yga1Var.f272532b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    niz nizVar3 = (niz) this.f49287b;
                    ty80 ty80Var = (ty80) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(m3l.m60707n(ty80Var.f224880i, in80.f103923d, in80.f103927h) && !((mm90) ((yk1) this.f49288c).f273535g).m62274a(ty80Var.f224877f.f271272q));
                    yga1Var.f272532b = 1;
                    Object objEmit3 = nizVar3.emit(boolValueOf2, yga1Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof yta1) {
                    yta1Var = (yta1) fbkVar;
                    int i8 = yta1Var.f276068b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yta1Var.f276068b = i8 - Integer.MIN_VALUE;
                    } else {
                        yta1Var = new yta1(this, fbkVar);
                    }
                } else {
                    yta1Var = new yta1(this, fbkVar);
                }
                Object obj5 = yta1Var.f276067a;
                int i9 = yta1Var.f276068b;
                if (i9 == 0) {
                    bga.m29073P(obj5);
                    niz nizVar4 = (niz) this.f49287b;
                    xta1 xta1Var = (xta1) obj;
                    Long l = xta1Var.f265814c;
                    wta1 wta1Var = new wta1((rta1) this.f49288c, l != null ? new sta1(l.longValue()) : xta1Var.f265813b ? uta1.f233862a : new tta1(xta1Var.f265812a));
                    yta1Var.f276068b = 1;
                    Object objEmit4 = nizVar4.emit(wta1Var, yta1Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof p6b1) {
                    p6b1Var = (p6b1) fbkVar;
                    int i10 = p6b1Var.f174341b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        p6b1Var.f174341b = i10 - Integer.MIN_VALUE;
                    } else {
                        p6b1Var = new p6b1(this, fbkVar);
                    }
                } else {
                    p6b1Var = new p6b1(this, fbkVar);
                }
                Object obj6 = p6b1Var.f174340a;
                int i11 = p6b1Var.f174341b;
                if (i11 == 0) {
                    bga.m29073P(obj6);
                    niz nizVar5 = (niz) this.f49287b;
                    q2y q2yVar = new q2y(((z4m) obj).f279296a.contains(((n6b1) this.f49288c).f150807a));
                    p6b1Var.f174341b = 1;
                    Object objEmit5 = nizVar5.emit(q2yVar, p6b1Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                if (((Boolean) ((kqi0) this.f49287b).getValue()).booleanValue()) {
                    ((vum0) this.f49288c).m86438w(iIntValue);
                }
                return w2a1.f247311a;
            case 6:
                ((gh00) this.f49287b).invoke(mgb1.m61697a((wgb1) this.f49288c, (s1y) obj));
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof fjb1) {
                    fjb1Var = (fjb1) fbkVar;
                    int i12 = fjb1Var.f70153b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        fjb1Var.f70153b = i12 - Integer.MIN_VALUE;
                    } else {
                        fjb1Var = new fjb1(this, fbkVar);
                    }
                } else {
                    fjb1Var = new fjb1(this, fbkVar);
                }
                Object obj7 = fjb1Var.f70152a;
                int i13 = fjb1Var.f70153b;
                if (i13 == 0) {
                    bga.m29073P(obj7);
                    niz nizVar6 = (niz) this.f49287b;
                    Boolean bool = (Boolean) obj;
                    wj50.m88279p(bool);
                    bib1 bib1Var = new bib1((VideoSurfaceView) ((u12) ((xzo) this.f49288c).f267728c).f225646Y, bool.booleanValue());
                    fjb1Var.f70153b = 1;
                    Object objEmit6 = nizVar6.emit(bib1Var, fjb1Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 8:
                f330 f330Var = (f330) obj;
                fh0 fh0Var = (fh0) ((wnl) this.f49287b).f253205c;
                if (fh0Var != null) {
                    ((hjb1) this.f49288c).f92024f.m86949y(f330Var, fh0Var);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof xub1) {
                    xub1Var = (xub1) fbkVar;
                    int i14 = xub1Var.f266045b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        xub1Var.f266045b = i14 - Integer.MIN_VALUE;
                    } else {
                        xub1Var = new xub1(this, fbkVar);
                    }
                } else {
                    xub1Var = new xub1(this, fbkVar);
                }
                Object obj8 = xub1Var.f266044a;
                int i15 = xub1Var.f266045b;
                if (i15 == 0) {
                    bga.m29073P(obj8);
                    niz nizVar7 = (niz) this.f49287b;
                    srb1 srb1Var = (srb1) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(((avb1) this.f49288c).f20149e.m71387e(srb1Var) || srb1Var.f213294a);
                    xub1Var.f266045b = 1;
                    Object objEmit7 = nizVar7.emit(boolValueOf3, xub1Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof h1c1) {
                    h1c1Var = (h1c1) fbkVar;
                    int i16 = h1c1Var.f86566b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        h1c1Var.f86566b = i16 - Integer.MIN_VALUE;
                    } else {
                        h1c1Var = new h1c1(this, fbkVar);
                    }
                } else {
                    h1c1Var = new h1c1(this, fbkVar);
                }
                Object obj9 = h1c1Var.f86565a;
                int i17 = h1c1Var.f86566b;
                if (i17 == 0) {
                    bga.m29073P(obj9);
                    niz nizVar8 = (niz) this.f49287b;
                    Object objInvoke = ((jq81) this.f49288c).invoke((PlayerState) obj);
                    h1c1Var.f86566b = 1;
                    Object objEmit8 = nizVar8.emit(objInvoke, h1c1Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof pgc1) {
                    pgc1Var = (pgc1) fbkVar;
                    int i18 = pgc1Var.f177289b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        pgc1Var.f177289b = i18 - Integer.MIN_VALUE;
                    } else {
                        pgc1Var = new pgc1(this, fbkVar);
                    }
                } else {
                    pgc1Var = new pgc1(this, fbkVar);
                }
                Object obj10 = pgc1Var.f177288a;
                int i19 = pgc1Var.f177289b;
                if (i19 == 0) {
                    bga.m29073P(obj10);
                    niz nizVar9 = (niz) this.f49287b;
                    kp5 kp5Var2 = (kp5) obj;
                    if (((qgc1) this.f49288c).f188441b.contains(kp5Var2.f124979a) && kp5Var2.f124980b == r6m0.f196325a) {
                        ?? r1 = kp5Var2.f124990l;
                        if (r1.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = r1.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                } else if (((tks0) it.next()) instanceof bu9) {
                                    z = true;
                                }
                            }
                        }
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    pgc1Var.f177289b = 1;
                    Object objEmit9 = nizVar9.emit(boolValueOf4, pgc1Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof vgc1) {
                    vgc1Var = (vgc1) fbkVar;
                    int i20 = vgc1Var.f241219b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        vgc1Var.f241219b = i20 - Integer.MIN_VALUE;
                    } else {
                        vgc1Var = new vgc1(this, fbkVar);
                    }
                } else {
                    vgc1Var = new vgc1(this, fbkVar);
                }
                Object obj11 = vgc1Var.f241218a;
                int i21 = vgc1Var.f241219b;
                if (i21 == 0) {
                    bga.m29073P(obj11);
                    niz nizVar10 = (niz) this.f49287b;
                    kp5 kp5Var3 = (kp5) obj;
                    Boolean boolValueOf5 = Boolean.valueOf(((g040) this.f49288c).f75262b.contains(kp5Var3.f124979a) && ((r6m0Var = kp5Var3.f124980b) == r6m0.f196325a || r6m0Var == r6m0.f196326b) && !kp5Var3.f124990l.isEmpty());
                    vgc1Var.f241219b = 1;
                    Object objEmit10 = nizVar10.emit(boolValueOf5, vgc1Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof evc1) {
                    evc1Var = (evc1) fbkVar;
                    int i22 = evc1Var.f63206b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        evc1Var.f63206b = i22 - Integer.MIN_VALUE;
                    } else {
                        evc1Var = new evc1(this, fbkVar);
                    }
                } else {
                    evc1Var = new evc1(this, fbkVar);
                }
                Object obj12 = evc1Var.f63205a;
                int i23 = evc1Var.f63206b;
                if (i23 == 0) {
                    bga.m29073P(obj12);
                    niz nizVar11 = (niz) this.f49287b;
                    long j = ((qdp0) this.f49288c).f187735c;
                    ig21 ig21Var = ((cg21) obj).f37544h;
                    if (ig21Var instanceof hg21) {
                        svc1Var = new rvc1(j);
                    } else if (ig21Var instanceof eg21) {
                        bg21 bg21Var = ((eg21) ig21Var).f59203a;
                        if (bg21Var.equals(zf21.f282196a)) {
                            svc1Var = null;
                        } else {
                            if (!bg21Var.equals(yf21.f272108a) && !bg21Var.equals(xf21.f260818a) && !bg21Var.equals(ag21.f15274a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            svc1Var = new svc1(j);
                        }
                    } else {
                        svc1Var = null;
                    }
                    if (svc1Var != null) {
                        evc1Var.f63206b = 1;
                        Object objEmit11 = nizVar11.emit(svc1Var, evc1Var);
                        yuk yukVar11 = yuk.f276404a;
                        if (objEmit11 == yukVar11) {
                            return yukVar11;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof ewc1) {
                    ewc1Var = (ewc1) fbkVar;
                    int i24 = ewc1Var.f63502b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ewc1Var.f63502b = i24 - Integer.MIN_VALUE;
                    } else {
                        ewc1Var = new ewc1(this, fbkVar);
                    }
                } else {
                    ewc1Var = new ewc1(this, fbkVar);
                }
                Object obj13 = ewc1Var.f63501a;
                int i25 = ewc1Var.f63502b;
                if (i25 == 0) {
                    bga.m29073P(obj13);
                    niz nizVar12 = (niz) this.f49287b;
                    kp5 kp5Var4 = (kp5) obj;
                    Boolean boolValueOf6 = Boolean.valueOf(((g040) this.f49288c).f75262b.contains(kp5Var4.f124979a) && kp5Var4.f124980b == r6m0.f196326b);
                    ewc1Var.f63502b = 1;
                    Object objEmit12 = nizVar12.emit(boolValueOf6, ewc1Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 15:
                cg21 cg21Var = (cg21) obj;
                ycd1 ycd1Var = (ycd1) this.f49287b;
                x811 x811Var = ycd1Var.f271473j;
                if (x811Var != null && ycd1Var.f271471h == ((lg21) this.f49288c)) {
                    k7i0 k7i0Var = cg21Var.f37537a;
                    if (wj50.m88271j(k7i0Var != null ? k7i0Var.f120135a : null, x811Var.f259029b)) {
                        ig21 ig21Var2 = cg21Var.f37544h;
                        if (wj50.m88271j(ig21Var2, dg21.f48708a) || wj50.m88271j(ig21Var2, hg21.f91006a)) {
                            nb11Var = new nb11(null);
                        } else if (wj50.m88271j(ig21Var2, gg21.f79519a)) {
                            nb11Var = new mb11(null);
                        } else if (ig21Var2 instanceof eg21) {
                            bg21 bg21Var2 = ((eg21) ig21Var2).f59203a;
                            if (!bg21Var2.equals(zf21.f282196a)) {
                                if (!bg21Var2.equals(yf21.f272108a) && !bg21Var2.equals(xf21.f260818a) && !bg21Var2.equals(ag21.f15274a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                nb11Var = ob11.f163514a;
                            }
                        } else if (!wj50.m88271j(ig21Var2, fg21.f69183a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ycd1Var.m93350c(nb11Var);
                    }
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof hyd1) {
                    hyd1Var = (hyd1) fbkVar;
                    int i26 = hyd1Var.f96572b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        hyd1Var.f96572b = i26 - Integer.MIN_VALUE;
                    } else {
                        hyd1Var = new hyd1(this, fbkVar);
                    }
                } else {
                    hyd1Var = new hyd1(this, fbkVar);
                }
                Object obj14 = hyd1Var.f96571a;
                int i27 = hyd1Var.f96572b;
                if (i27 == 0) {
                    bga.m29073P(obj14);
                    niz nizVar13 = (niz) this.f49287b;
                    if (((qkc1) this.f49288c).m73043b(((Number) obj).intValue())) {
                        hyd1Var.f96572b = 1;
                        Object objEmit13 = nizVar13.emit(obj, hyd1Var);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit13 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 17:
                ((t7l0) this.f49287b).mo40286c((i1e1) this.f49288c, (j8j) obj);
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof i4e1) {
                    i4e1Var = (i4e1) fbkVar;
                    int i28 = i4e1Var.f98517b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        i4e1Var.f98517b = i28 - Integer.MIN_VALUE;
                    } else {
                        i4e1Var = new i4e1(this, fbkVar);
                    }
                } else {
                    i4e1Var = new i4e1(this, fbkVar);
                }
                Object obj15 = i4e1Var.f98516a;
                int i29 = i4e1Var.f98517b;
                if (i29 == 0) {
                    bga.m29073P(obj15);
                    niz nizVar14 = (niz) this.f49287b;
                    Object d4rVar = ((u3e1) obj).f226366a ? new d4r((l4e1) this.f49288c) : e4r.f56167a;
                    i4e1Var.f98517b = 1;
                    Object objEmit14 = nizVar14.emit(d4rVar, i4e1Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof j4e1) {
                    j4e1Var = (j4e1) fbkVar;
                    int i30 = j4e1Var.f108680b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        j4e1Var.f108680b = i30 - Integer.MIN_VALUE;
                    } else {
                        j4e1Var = new j4e1(this, fbkVar);
                    }
                } else {
                    j4e1Var = new j4e1(this, fbkVar);
                }
                Object obj16 = j4e1Var.f108679a;
                int i31 = j4e1Var.f108680b;
                if (i31 == 0) {
                    bga.m29073P(obj16);
                    niz nizVar15 = (niz) this.f49287b;
                    PlayerState playerState = (PlayerState) obj;
                    k4e1 k4e1Var = (k4e1) this.f49288c;
                    wj50.m88279p(playerState);
                    String strContextUri = playerState.contextUri();
                    if (strContextUri == null) {
                        l4e1Var = null;
                    } else {
                        xf40 xf40VarContextMetadata = playerState.contextMetadata();
                        p3e1 p3e1Var = k4e1Var.f119207b;
                        wj50.m88279p(xf40VarContextMetadata);
                        if (p3e1Var.m69001a(xf40VarContextMetadata) && (n3e1VarM80116f = t5m0.m80116f(xf40VarContextMetadata)) != null) {
                            l4e1Var = new l4e1(new h4e1(strContextUri, n3e1VarM80116f), playerState, playerState.isPlaying() && !playerState.isPaused());
                        } else {
                            l4e1Var = null;
                        }
                    }
                    j4e1Var.f108680b = 1;
                    Object objEmit15 = nizVar15.emit(l4e1Var, j4e1Var);
                    Object obj17 = yuk.f276404a;
                    if (objEmit15 == obj17) {
                        return obj17;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof k9e1) {
                    k9e1Var = (k9e1) fbkVar;
                    int i32 = k9e1Var.f120576b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        k9e1Var.f120576b = i32 - Integer.MIN_VALUE;
                    } else {
                        k9e1Var = new k9e1(this, fbkVar);
                    }
                } else {
                    k9e1Var = new k9e1(this, fbkVar);
                }
                Object obj18 = k9e1Var.f120575a;
                int i33 = k9e1Var.f120576b;
                if (i33 == 0) {
                    bga.m29073P(obj18);
                    niz nizVar16 = (niz) this.f49287b;
                    mv81 mv81Var = (mv81) this.f49288c;
                    Object obj19 = (Set) ((gv31) obj).f84602a;
                    if (obj19 == null) {
                        obj19 = gbu.f78413a;
                    }
                    Object objInvoke2 = mv81Var.invoke(obj19);
                    k9e1Var.f120576b = 1;
                    Object objEmit16 = nizVar16.emit(objInvoke2, k9e1Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit16 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof m9e1) {
                    m9e1Var = (m9e1) fbkVar;
                    int i34 = m9e1Var.f141287b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        m9e1Var.f141287b = i34 - Integer.MIN_VALUE;
                    } else {
                        m9e1Var = new m9e1(this, fbkVar);
                    }
                } else {
                    m9e1Var = new m9e1(this, fbkVar);
                }
                Object obj20 = m9e1Var.f141286a;
                int i35 = m9e1Var.f141287b;
                if (i35 == 0) {
                    bga.m29073P(obj20);
                    niz nizVar17 = (niz) this.f49287b;
                    mv81 mv81Var2 = (mv81) this.f49288c;
                    Object obj21 = (Set) ((gv31) obj).f84602a;
                    if (obj21 == null) {
                        obj21 = gbu.f78413a;
                    }
                    Object objInvoke3 = mv81Var2.invoke(obj21);
                    m9e1Var.f141287b = 1;
                    Object objEmit17 = nizVar17.emit(objInvoke3, m9e1Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit17 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof dae1) {
                    dae1Var = (dae1) fbkVar;
                    int i36 = dae1Var.f47037b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        dae1Var.f47037b = i36 - Integer.MIN_VALUE;
                    } else {
                        dae1Var = new dae1(this, fbkVar);
                    }
                } else {
                    dae1Var = new dae1(this, fbkVar);
                }
                Object obj22 = dae1Var.f47036a;
                int i37 = dae1Var.f47037b;
                if (i37 == 0) {
                    bga.m29073P(obj22);
                    niz nizVar18 = (niz) this.f49287b;
                    Boolean boolValueOf7 = Boolean.valueOf(((p3e1) ((eae1) this.f49288c).f57647b.f230941c).m69001a(((ty80) obj).f224877f.f271272q));
                    dae1Var.f47037b = 1;
                    Object objEmit18 = nizVar18.emit(boolValueOf7, dae1Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit18 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof rae1) {
                    rae1Var = (rae1) fbkVar;
                    int i38 = rae1Var.f197296b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        rae1Var.f197296b = i38 - Integer.MIN_VALUE;
                    } else {
                        rae1Var = new rae1(this, fbkVar);
                    }
                } else {
                    rae1Var = new rae1(this, fbkVar);
                }
                Object obj23 = rae1Var.f197295a;
                int i39 = rae1Var.f197296b;
                if (i39 == 0) {
                    bga.m29073P(obj23);
                    niz nizVar19 = (niz) this.f49287b;
                    Boolean boolValueOf8 = Boolean.valueOf(((p3e1) ((nyz0) this.f49288c).f159964g).m69001a(((ty80) obj).f224877f.f271272q));
                    rae1Var.f197296b = 1;
                    Object objEmit19 = nizVar19.emit(boolValueOf8, rae1Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit19 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof lde1) {
                    lde1Var = (lde1) fbkVar;
                    int i40 = lde1Var.f132154b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        lde1Var.f132154b = i40 - Integer.MIN_VALUE;
                    } else {
                        lde1Var = new lde1(this, fbkVar);
                    }
                } else {
                    lde1Var = new lde1(this, fbkVar);
                }
                Object obj24 = lde1Var.f132153a;
                int i41 = lde1Var.f132154b;
                if (i41 == 0) {
                    bga.m29073P(obj24);
                    niz nizVar20 = (niz) this.f49287b;
                    u300 u300VarM87094a = ((w300) ((v300) ((y3d1) this.f49288c).f268898c)).m87094a(((ty80) obj).f224877f.f271271p);
                    lde1Var.f132154b = 1;
                    Object objEmit20 = nizVar20.emit(u300VarM87094a, lde1Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit20 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 25:
                Context context = (Context) ((yya1) this.f49288c).f277454c;
                if (fbkVar instanceof eie1) {
                    eie1Var = (eie1) fbkVar;
                    int i42 = eie1Var.f59872b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        eie1Var.f59872b = i42 - Integer.MIN_VALUE;
                    } else {
                        eie1Var = new eie1(this, fbkVar);
                    }
                } else {
                    eie1Var = new eie1(this, fbkVar);
                }
                Object obj25 = eie1Var.f59871a;
                int i43 = eie1Var.f59872b;
                boolean z3 = true;
                if (i43 == 0) {
                    bga.m29073P(obj25);
                    niz nizVar21 = (niz) this.f49287b;
                    PlayerState playerState2 = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState2.track().mo49283h();
                    xf40 xf40VarMetadata = contextTrack != null ? contextTrack.metadata() : null;
                    int i44 = 4;
                    if (contextTrack != null) {
                        if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_IS_ADVERTISEMENT))) {
                            i44 = 3;
                        } else if (bm51.m29803n0(contextTrack.uri(), "spotify:episode:", false)) {
                            i = 2;
                        } else if (bm51.m29803n0(contextTrack.uri(), "spotify:track:", false)) {
                            i = 1;
                        }
                        i = i44;
                    } else {
                        i = i44;
                    }
                    Restrictions restrictions = playerState2.restrictions();
                    if (vj81.f241921a[edb.m38547C(i)] == 1) {
                        if (xf40VarMetadata == null || (string = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_TITLE)) == null) {
                            string = context.getString(R.string.ad_title);
                        } else {
                            if (wl51.m88460J0(string)) {
                                string = null;
                            }
                            if (string == null) {
                                string = context.getString(R.string.ad_title);
                            }
                        }
                    } else if (xf40VarMetadata == null || (string = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_TITLE)) == null) {
                        string = "";
                    }
                    int iM38547C = edb.m38547C(i);
                    if (iM38547C == 1) {
                        z2 = true;
                        if (xf40VarMetadata == null || (string2 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ALBUM_TITLE)) == null) {
                            string2 = "";
                        }
                    } else if (iM38547C != 2) {
                        if (xf40VarMetadata != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : xf40VarMetadata.entrySet()) {
                                boolean z4 = z3;
                                if (bm51.m29803n0((String) entry.getKey(), ContextTrack.Metadata.KEY_ARTIST_NAME, false)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                                z3 = z4;
                            }
                            z2 = z3;
                            Collection collectionValues = new TreeMap(linkedHashMap).values();
                            if (collectionValues != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj26 : collectionValues) {
                                    String str = (String) obj26;
                                    wj50.m88279p(str);
                                    if (str.length() > 0) {
                                        arrayList.add(obj26);
                                    }
                                }
                                string2 = g6f.m43753y0(arrayList, null, null, null, null, 63);
                                if (string2 == null) {
                                }
                            }
                        } else {
                            z2 = true;
                        }
                        string2 = "";
                    } else {
                        z2 = true;
                        string2 = context.getString(R.string.ad_title);
                    }
                    boolean z5 = (!playerState2.isPlaying() || playerState2.isPaused()) ? false : z2;
                    long jLongValue = ((Number) playerState2.positionAsOfTimestamp().mo49280e(new Long(0L))).longValue();
                    long jLongValue2 = ((Number) playerState2.duration().mo49280e(new Long(0L))).longValue();
                    long jTimestamp = playerState2.timestamp();
                    double dDoubleValue = ((Number) playerState2.playbackSpeed().mo49280e(new Double(1.0d))).doubleValue();
                    boolean zIsPlaying = playerState2.isPlaying();
                    String str2 = xf40VarMetadata != null ? (String) xf40VarMetadata.get("image_url") : null;
                    boolean z6 = !restrictions.disallowSkippingPrevReasons().isEmpty();
                    boolean z7 = !restrictions.disallowSkippingNextReasons().isEmpty();
                    boolean z8 = !restrictions.disallowSeekingReasons().isEmpty();
                    String str3 = (contextTrack == null || (strUri = contextTrack.uri()) == null) ? "" : strUri;
                    String str4 = (String) playerState2.playbackId().mo49283h();
                    die1 die1Var = new die1(string, string2, z5, jLongValue, jLongValue2, jTimestamp, dDoubleValue, zIsPlaying, i, str2, z6, z7, z8, str3, str4 == null ? "" : str4, Boolean.parseBoolean(xf40VarMetadata != null ? (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_HAS_LYRICS) : null));
                    eie1Var.f59872b = z2 ? 1 : 0;
                    Object objEmit21 = nizVar21.emit(die1Var, eie1Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit21 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof hte1) {
                    hte1Var = (hte1) fbkVar;
                    int i45 = hte1Var.f95002b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        hte1Var.f95002b = i45 - Integer.MIN_VALUE;
                    } else {
                        hte1Var = new hte1(this, fbkVar);
                    }
                } else {
                    hte1Var = new hte1(this, fbkVar);
                }
                Object obj27 = hte1Var.f95001a;
                int i46 = hte1Var.f95002b;
                if (i46 == 0) {
                    bga.m29073P(obj27);
                    niz nizVar22 = (niz) this.f49287b;
                    GetYourPremiumBadgeResponse getYourPremiumBadgeResponse = (GetYourPremiumBadgeResponse) obj;
                    xx11 xx11VarM51630b = ite1.m51630b((ite1) this.f49288c, getYourPremiumBadgeResponse.m16520n(), getYourPremiumBadgeResponse.m16521o(), getYourPremiumBadgeResponse.m16522p() == mco0.PLAN_TIER_PREMIUM, false, 56);
                    hte1Var.f95002b = 1;
                    Object objEmit22 = nizVar22.emit(xx11VarM51630b, hte1Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit22 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 27:
                return m36071b(obj, fbkVar);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dxe1 dxe1Var = (dxe1) this.f49287b;
                if (zBooleanValue) {
                    w0k0 w0k0Var = (w0k0) g6f.m43689C0(dxe1Var.f53946d);
                    boolean z9 = (w0k0Var != null ? w0k0Var.f246751c : null) != null;
                    boolean zM88271j = wj50.m88271j(dxe1Var.f53945c, new v9a0(FetchMode.NEXT));
                    if (z9 && !zM88271j) {
                        ((gh00) this.f49288c).invoke(fwe1.f74051a);
                    }
                }
                return w2a1.f247311a;
        }
    }

    public di91(niz nizVar, hvc1 hvc1Var, qdp0 qdp0Var) {
        this.f49286a = 13;
        this.f49287b = nizVar;
        this.f49288c = qdp0Var;
    }
}
