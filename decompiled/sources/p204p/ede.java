package p204p;

import android.graphics.Color;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$ObserveCapStateChangedResponse;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class ede implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f58507b;

    public /* synthetic */ ede(niz nizVar, int i) {
        this.f58506a = i;
        this.f58507b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0252  */
    /* JADX WARN: Code duplicated, block: B:158:0x029a  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0347  */
    /* JADX WARN: Code duplicated, block: B:218:0x0396  */
    /* JADX WARN: Code duplicated, block: B:239:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:260:0x044e  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0494  */
    /* JADX WARN: Code duplicated, block: B:296:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:321:0x0596  */
    /* JADX WARN: Code duplicated, block: B:352:0x0612  */
    /* JADX WARN: Code duplicated, block: B:376:0x0666  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:444:0x0777  */
    /* JADX WARN: Code duplicated, block: B:461:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:478:0x080a  */
    /* JADX WARN: Code duplicated, block: B:495:0x0852  */
    /* JADX WARN: Code duplicated, block: B:519:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:543:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:567:0x094e  */
    /* JADX WARN: Code duplicated, block: B:591:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:613:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:651:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0192  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        dde ddeVar;
        lde ldeVar;
        bie bieVar;
        voe voeVar;
        kqe kqeVar;
        pqe pqeVar;
        qqe qqeVar;
        rqe rqeVar;
        ere ereVar;
        vve vveVar;
        wve wveVar;
        k0f k0fVar;
        PlayabilityRestriction playabilityRestriction;
        w9s w9sVar;
        l0f l0fVar;
        x1f x1fVar;
        x2f x2fVar;
        i7f i7fVar;
        j7f j7fVar;
        k7f k7fVar;
        int iM61221i;
        gff gffVar;
        qif qifVar;
        znf znfVar;
        eof eofVar;
        iof iofVar;
        akh akhVar;
        xmh xmhVar;
        uoh uohVar;
        ovh ovhVar;
        pvh pvhVar;
        e7i e7iVar;
        f7i f7iVar;
        switch (this.f58506a) {
            case 0:
                if (fbkVar instanceof dde) {
                    ddeVar = (dde) fbkVar;
                    int i = ddeVar.f47813b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ddeVar.f47813b = i - Integer.MIN_VALUE;
                    } else {
                        ddeVar = new dde(this, fbkVar);
                    }
                } else {
                    ddeVar = new dde(this, fbkVar);
                }
                Object obj2 = ddeVar.f47812a;
                int i2 = ddeVar.f47813b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        ddeVar.f47813b = 1;
                        Object objEmit = this.f58507b.emit(obj, ddeVar);
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
                if (fbkVar instanceof lde) {
                    ldeVar = (lde) fbkVar;
                    int i3 = ldeVar.f132149b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ldeVar.f132149b = i3 - Integer.MIN_VALUE;
                    } else {
                        ldeVar = new lde(this, fbkVar);
                    }
                } else {
                    ldeVar = new lde(this, fbkVar);
                }
                Object obj3 = ldeVar.f132148a;
                int i4 = ldeVar.f132149b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    xce xceVar = new xce(((Boolean) obj).booleanValue());
                    ldeVar.f132149b = 1;
                    Object objEmit2 = this.f58507b.emit(xceVar, ldeVar);
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
                if (fbkVar instanceof bie) {
                    bieVar = (bie) fbkVar;
                    int i5 = bieVar.f27417b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bieVar.f27417b = i5 - Integer.MIN_VALUE;
                    } else {
                        bieVar = new bie(this, fbkVar);
                    }
                } else {
                    bieVar = new bie(this, fbkVar);
                }
                Object obj4 = bieVar.f27416a;
                int i6 = bieVar.f27417b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((z190) obj).f278263a == bv41.f31274a);
                    bieVar.f27417b = 1;
                    Object objEmit3 = this.f58507b.emit(boolValueOf, bieVar);
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
                if (fbkVar instanceof voe) {
                    voeVar = (voe) fbkVar;
                    int i7 = voeVar.f243461b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        voeVar.f243461b = i7 - Integer.MIN_VALUE;
                    } else {
                        voeVar = new voe(this, fbkVar);
                    }
                } else {
                    voeVar = new voe(this, fbkVar);
                }
                Object obj5 = voeVar.f243460a;
                int i8 = voeVar.f243461b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    ty81 ty81Var = (ty81) obj;
                    if (!(ty81Var instanceof ry81) && !(ty81Var instanceof sy81)) {
                        voeVar.f243461b = 1;
                        Object objEmit4 = this.f58507b.emit(obj, voeVar);
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
                if (fbkVar instanceof kqe) {
                    kqeVar = (kqe) fbkVar;
                    int i9 = kqeVar.f125295b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        kqeVar.f125295b = i9 - Integer.MIN_VALUE;
                    } else {
                        kqeVar = new kqe(this, fbkVar);
                    }
                } else {
                    kqeVar = new kqe(this, fbkVar);
                }
                Object obj6 = kqeVar.f125294a;
                int i10 = kqeVar.f125295b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Set set = ohoVar != null ? (Set) ohoVar.f165512a : null;
                    if (set != null) {
                        kqeVar.f125295b = 1;
                        Object objEmit5 = this.f58507b.emit(set, kqeVar);
                        yuk yukVar5 = yuk.f276404a;
                        if (objEmit5 == yukVar5) {
                            return yukVar5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof pqe) {
                    pqeVar = (pqe) fbkVar;
                    int i11 = pqeVar.f180294b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pqeVar.f180294b = i11 - Integer.MIN_VALUE;
                    } else {
                        pqeVar = new pqe(this, fbkVar);
                    }
                } else {
                    pqeVar = new pqe(this, fbkVar);
                }
                Object obj7 = pqeVar.f180293a;
                int i12 = pqeVar.f180294b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    Set set2 = ohoVar2 != null ? (Set) ohoVar2.f165512a : null;
                    if (set2 != null) {
                        pqeVar.f180294b = 1;
                        Object objEmit6 = this.f58507b.emit(set2, pqeVar);
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
                if (fbkVar instanceof qqe) {
                    qqeVar = (qqe) fbkVar;
                    int i13 = qqeVar.f191549b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qqeVar.f191549b = i13 - Integer.MIN_VALUE;
                    } else {
                        qqeVar = new qqe(this, fbkVar);
                    }
                } else {
                    qqeVar = new qqe(this, fbkVar);
                }
                Object obj8 = qqeVar.f191548a;
                int i14 = qqeVar.f191549b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    qho qhoVar3 = (qho) obj;
                    oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    i490 i490Var = ohoVar3 != null ? (i490) ohoVar3.f165512a : null;
                    if (i490Var != null) {
                        qqeVar.f191549b = 1;
                        Object objEmit7 = this.f58507b.emit(i490Var, qqeVar);
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
                if (fbkVar instanceof rqe) {
                    rqeVar = (rqe) fbkVar;
                    int i15 = rqeVar.f201820b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        rqeVar.f201820b = i15 - Integer.MIN_VALUE;
                    } else {
                        rqeVar = new rqe(this, fbkVar);
                    }
                } else {
                    rqeVar = new rqe(this, fbkVar);
                }
                Object obj9 = rqeVar.f201819a;
                int i16 = rqeVar.f201820b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    qho qhoVar4 = (qho) obj;
                    oho ohoVar4 = qhoVar4 instanceof oho ? (oho) qhoVar4 : null;
                    Set set3 = ohoVar4 != null ? (Set) ohoVar4.f165512a : null;
                    if (set3 != null) {
                        rqeVar.f201820b = 1;
                        Object objEmit8 = this.f58507b.emit(set3, rqeVar);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof ere) {
                    ereVar = (ere) fbkVar;
                    int i17 = ereVar.f62109b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ereVar.f62109b = i17 - Integer.MIN_VALUE;
                    } else {
                        ereVar = new ere(this, fbkVar);
                    }
                } else {
                    ereVar = new ere(this, fbkVar);
                }
                Object obj10 = ereVar.f62108a;
                int i18 = ereVar.f62109b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    d320 d320Var = new d320((List) obj, null);
                    ereVar.f62109b = 1;
                    Object objEmit9 = this.f58507b.emit(d320Var, ereVar);
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
                if (fbkVar instanceof vve) {
                    vveVar = (vve) fbkVar;
                    int i19 = vveVar.f245219b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        vveVar.f245219b = i19 - Integer.MIN_VALUE;
                    } else {
                        vveVar = new vve(this, fbkVar);
                    }
                } else {
                    vveVar = new vve(this, fbkVar);
                }
                Object obj11 = vveVar.f245218a;
                int i20 = vveVar.f245219b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf2 = Boolean.valueOf(((u3e1) obj).f226367b);
                    vveVar.f245219b = 1;
                    Object objEmit10 = this.f58507b.emit(boolValueOf2, vveVar);
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
                if (fbkVar instanceof wve) {
                    wveVar = (wve) fbkVar;
                    int i21 = wveVar.f255480b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wveVar.f255480b = i21 - Integer.MIN_VALUE;
                    } else {
                        wveVar = new wve(this, fbkVar);
                    }
                } else {
                    wveVar = new wve(this, fbkVar);
                }
                Object obj12 = wveVar.f255479a;
                int i22 = wveVar.f255480b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    a6e1 a6e1Var = new a6e1(((Boolean) obj).booleanValue());
                    wveVar.f255480b = 1;
                    Object objEmit11 = this.f58507b.emit(a6e1Var, wveVar);
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
                if (fbkVar instanceof k0f) {
                    k0fVar = (k0f) fbkVar;
                    int i23 = k0fVar.f118072b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        k0fVar.f118072b = i23 - Integer.MIN_VALUE;
                    } else {
                        k0fVar = new k0f(this, fbkVar);
                    }
                } else {
                    k0fVar = new k0f(this, fbkVar);
                }
                Object obj13 = k0fVar.f118071a;
                int i24 = k0fVar.f118072b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    List<nw80> list = ((qu80) obj).f192598d;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (nw80 nw80Var : list) {
                        j7f0 j7f0Var = nw80Var.f159061o;
                        ib81 ib81Var = j7f0Var instanceof ib81 ? (ib81) j7f0Var : null;
                        String str = nw80Var.f159049c;
                        String str2 = nw80Var.f159047a;
                        String str3 = nw80Var.f159055i;
                        boolean z = nw80Var.f159057k;
                        boolean zM65753d = nw80Var.m65753d();
                        boolean zM65756g = nw80Var.m65756g();
                        switch (nw80Var.m65751b().ordinal()) {
                            case 0:
                                playabilityRestriction = PlayabilityRestriction.UNKNOWN;
                                break;
                            case 1:
                                playabilityRestriction = PlayabilityRestriction.NO_RESTRICTION;
                                break;
                            case 2:
                                playabilityRestriction = PlayabilityRestriction.EXPLICIT_CONTENT;
                                break;
                            case 3:
                                playabilityRestriction = PlayabilityRestriction.AGE_RESTRICTED;
                                break;
                            case 4:
                                playabilityRestriction = PlayabilityRestriction.NOT_IN_CATALOGUE;
                                break;
                            case 5:
                                playabilityRestriction = PlayabilityRestriction.NOT_AVAILABLE_OFFLINE;
                                break;
                            case 6:
                                playabilityRestriction = PlayabilityRestriction.PREMIUM_ONLY;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        PlayabilityRestriction playabilityRestriction2 = playabilityRestriction;
                        String str4 = ib81Var != null ? ib81Var.f100471a.f25472a : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = str4;
                        String strM65750a = nw80Var.m65750a(1);
                        ehf1 ehf1Var = nw80Var.f159060n;
                        if (ehf1Var.equals(u2l0.f226115b) || ehf1Var.equals(s2l0.f205029b)) {
                            w9sVar = w9s.f249255a;
                        } else if (ehf1Var.equals(k2l0.f118663b) || ehf1Var.equals(w2l0.f247380b)) {
                            w9sVar = w9s.f249258d;
                        } else if (ehf1Var instanceof m2l0) {
                            w9sVar = w9s.f249257c;
                        } else if ((ehf1Var instanceof y2l0) || ehf1Var.equals(q2l0.f184656b)) {
                            w9sVar = w9s.f249256b;
                        } else {
                            if (!ehf1Var.equals(o2l0.f161066b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w9sVar = w9s.f249259e;
                        }
                        arrayList.add(new j46(str, str2, str3, z, zM65753d, zM65756g, playabilityRestriction2, str5, strM65750a, w9sVar));
                    }
                    k0fVar.f118072b = 1;
                    Object objEmit12 = this.f58507b.emit(arrayList, k0fVar);
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
                if (fbkVar instanceof l0f) {
                    l0fVar = (l0f) fbkVar;
                    int i25 = l0fVar.f128415b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        l0fVar.f128415b = i25 - Integer.MIN_VALUE;
                    } else {
                        l0fVar = new l0f(this, fbkVar);
                    }
                } else {
                    l0fVar = new l0f(this, fbkVar);
                }
                Object obj14 = l0fVar.f128414a;
                int i26 = l0fVar.f128415b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    p2x0 p2x0Var = (p2x0) obj;
                    m2x0 m2x0Var = p2x0Var instanceof m2x0 ? (m2x0) p2x0Var : null;
                    qu80 qu80Var = m2x0Var != null ? (qu80) m2x0Var.f139474a : null;
                    if (qu80Var != null) {
                        l0fVar.f128415b = 1;
                        Object objEmit13 = this.f58507b.emit(qu80Var, l0fVar);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit13 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof x1f) {
                    x1fVar = (x1f) fbkVar;
                    int i27 = x1fVar.f257177b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        x1fVar.f257177b = i27 - Integer.MIN_VALUE;
                    } else {
                        x1fVar = new x1f(this, fbkVar);
                    }
                } else {
                    x1fVar = new x1f(this, fbkVar);
                }
                Object obj15 = x1fVar.f257176a;
                int i28 = x1fVar.f257177b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    z190 z190Var = (z190) obj;
                    y190 y190Var = z190Var.f278265c;
                    bv41 bv41Var = z190Var.f278263a;
                    s2f r2fVar = y190Var instanceof x190 ? new r2f(((x190) y190Var).f257107a) : y190Var instanceof v190 ? new q2f(((v190) y190Var).f236300a) : p2f.f173346a;
                    Object o2fVar = bv41Var.m30587b() ? new o2f(r2fVar) : bv41Var == bv41.f31275b ? new n2f(r2fVar) : m2f.f139329a;
                    x1fVar.f257177b = 1;
                    Object objEmit14 = this.f58507b.emit(o2fVar, x1fVar);
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
                if (fbkVar instanceof x2f) {
                    x2fVar = (x2f) fbkVar;
                    int i29 = x2fVar.f257460b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        x2fVar.f257460b = i29 - Integer.MIN_VALUE;
                    } else {
                        x2fVar = new x2f(this, fbkVar);
                    }
                } else {
                    x2fVar = new x2f(this, fbkVar);
                }
                Object obj16 = x2fVar.f257459a;
                int i30 = x2fVar.f257460b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    Map map = (Map) obj;
                    wj50.m88279p(map);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), Boolean.valueOf(((y5f) entry.getValue()).f269419c));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(((y5f) entry2.getValue()).f269418b));
                    }
                    f4m f4mVar = new f4m(linkedHashMap, linkedHashMap2);
                    x2fVar.f257460b = 1;
                    Object objEmit15 = this.f58507b.emit(f4mVar, x2fVar);
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
                if (fbkVar instanceof i7f) {
                    i7fVar = (i7f) fbkVar;
                    int i31 = i7fVar.f99544b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        i7fVar.f99544b = i31 - Integer.MIN_VALUE;
                    } else {
                        i7fVar = new i7f(this, fbkVar);
                    }
                } else {
                    i7fVar = new i7f(this, fbkVar);
                }
                Object obj17 = i7fVar.f99543a;
                int i32 = i7fVar.f99544b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    if (((xul0) obj).mo49279c()) {
                        i7fVar.f99544b = 1;
                        Object objEmit16 = this.f58507b.emit(obj, i7fVar);
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
                if (fbkVar instanceof j7f) {
                    j7fVar = (j7f) fbkVar;
                    int i33 = j7fVar.f109586b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        j7fVar.f109586b = i33 - Integer.MIN_VALUE;
                    } else {
                        j7fVar = new j7f(this, fbkVar);
                    }
                } else {
                    j7fVar = new j7f(this, fbkVar);
                }
                Object obj18 = j7fVar.f109585a;
                int i34 = j7fVar.f109586b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    xul0 xul0VarTrack = ((PlayerState) obj).track();
                    j7fVar.f109586b = 1;
                    Object objEmit17 = this.f58507b.emit(xul0VarTrack, j7fVar);
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
                if (fbkVar instanceof k7f) {
                    k7fVar = (k7f) fbkVar;
                    int i35 = k7fVar.f120079b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        k7fVar.f120079b = i35 - Integer.MIN_VALUE;
                    } else {
                        k7fVar = new k7f(this, fbkVar);
                    }
                } else {
                    k7fVar = new k7f(this, fbkVar);
                }
                Object obj19 = k7fVar.f120078a;
                int i36 = k7fVar.f120079b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    try {
                        iM61221i = m9f.m61221i(Color.argb(127, 0, 0, 0), Color.parseColor(e72.m37971E((ContextTrack) ((xul0) obj).mo49278b())));
                    } catch (Exception unused) {
                        iM61221i = f180.f64814a;
                    }
                    f7f f7fVar = new f7f(iM61221i);
                    k7fVar.f120079b = 1;
                    Object objEmit18 = this.f58507b.emit(f7fVar, k7fVar);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                    break;
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof gff) {
                    gffVar = (gff) fbkVar;
                    int i37 = gffVar.f79347b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        gffVar.f79347b = i37 - Integer.MIN_VALUE;
                    } else {
                        gffVar = new gff(this, fbkVar);
                    }
                } else {
                    gffVar = new gff(this, fbkVar);
                }
                Object obj20 = gffVar.f79346a;
                int i38 = gffVar.f79347b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    qho qhoVar5 = (qho) obj;
                    fff fffVar = qhoVar5 instanceof oho ? (fff) ((oho) qhoVar5).f165512a : new fff(lau.f131415a, null, null);
                    gffVar.f79347b = 1;
                    Object objEmit19 = this.f58507b.emit(fffVar, gffVar);
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
                if (fbkVar instanceof qif) {
                    qifVar = (qif) fbkVar;
                    int i39 = qifVar.f189007b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qifVar.f189007b = i39 - Integer.MIN_VALUE;
                    } else {
                        qifVar = new qif(this, fbkVar);
                    }
                } else {
                    qifVar = new qif(this, fbkVar);
                }
                Object obj21 = qifVar.f189006a;
                int i40 = qifVar.f189007b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    qho qhoVar6 = (qho) obj;
                    Object obj22 = qhoVar6 instanceof oho ? (List) ((oho) qhoVar6).f165512a : lau.f131415a;
                    qifVar.f189007b = 1;
                    Object objEmit20 = this.f58507b.emit(obj22, qifVar);
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
                if (fbkVar instanceof znf) {
                    znfVar = (znf) fbkVar;
                    int i41 = znfVar.f284485b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        znfVar.f284485b = i41 - Integer.MIN_VALUE;
                    } else {
                        znfVar = new znf(this, fbkVar);
                    }
                } else {
                    znfVar = new znf(this, fbkVar);
                }
                Object obj23 = znfVar.f284484a;
                int i42 = znfVar.f284485b;
                if (i42 == 0) {
                    bga.m29073P(obj23);
                    byte[] bArr = (byte[]) obj;
                    try {
                        CommonCappingOuterClass$ObserveCapStateChangedResponse commonCappingOuterClass$ObserveCapStateChangedResponseM6909q = CommonCappingOuterClass$ObserveCapStateChangedResponse.m6909q(bArr);
                        znfVar.f284485b = 1;
                        Object objEmit21 = this.f58507b.emit(commonCappingOuterClass$ObserveCapStateChangedResponseM6909q, znfVar);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass.ObserveCapStateChangedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof eof) {
                    eofVar = (eof) fbkVar;
                    int i43 = eofVar.f61416b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        eofVar.f61416b = i43 - Integer.MIN_VALUE;
                    } else {
                        eofVar = new eof(this, fbkVar);
                    }
                } else {
                    eofVar = new eof(this, fbkVar);
                }
                Object obj24 = eofVar.f61415a;
                int i44 = eofVar.f61416b;
                if (i44 == 0) {
                    bga.m29073P(obj24);
                    CommonCappingOuterClass$ObserveCapStateChangedResponse commonCappingOuterClass$ObserveCapStateChangedResponse = (CommonCappingOuterClass$ObserveCapStateChangedResponse) obj;
                    ho50 ho50Var = new ho50(commonCappingOuterClass$ObserveCapStateChangedResponse.m6910o(), commonCappingOuterClass$ObserveCapStateChangedResponse.m6911p());
                    eofVar.f61416b = 1;
                    Object objEmit22 = this.f58507b.emit(ho50Var, eofVar);
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
                if (fbkVar instanceof iof) {
                    iofVar = (iof) fbkVar;
                    int i45 = iofVar.f104219b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        iofVar.f104219b = i45 - Integer.MIN_VALUE;
                    } else {
                        iofVar = new iof(this, fbkVar);
                    }
                } else {
                    iofVar = new iof(this, fbkVar);
                }
                Object obj25 = iofVar.f104218a;
                int i46 = iofVar.f104219b;
                if (i46 == 0) {
                    bga.m29073P(obj25);
                    Boolean boolValueOf3 = Boolean.valueOf(((ho50) obj).f93460a);
                    iofVar.f104219b = 1;
                    Object objEmit23 = this.f58507b.emit(boolValueOf3, iofVar);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof akh) {
                    akhVar = (akh) fbkVar;
                    int i47 = akhVar.f16536b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        akhVar.f16536b = i47 - Integer.MIN_VALUE;
                    } else {
                        akhVar = new akh(this, fbkVar);
                    }
                } else {
                    akhVar = new akh(this, fbkVar);
                }
                Object obj26 = akhVar.f16535a;
                int i48 = akhVar.f16536b;
                if (i48 == 0) {
                    bga.m29073P(obj26);
                    List list2 = ((t5a0) obj).f217256b;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new uso(((s5a0) it.next()).mo72192a()));
                    }
                    akhVar.f16536b = 1;
                    Object objEmit24 = this.f58507b.emit(arrayList2, akhVar);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof xmh) {
                    xmhVar = (xmh) fbkVar;
                    int i49 = xmhVar.f263367b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        xmhVar.f263367b = i49 - Integer.MIN_VALUE;
                    } else {
                        xmhVar = new xmh(this, fbkVar);
                    }
                } else {
                    xmhVar = new xmh(this, fbkVar);
                }
                Object obj27 = xmhVar.f263366a;
                int i50 = xmhVar.f263367b;
                if (i50 == 0) {
                    bga.m29073P(obj27);
                    qho qhoVar7 = (qho) obj;
                    oho ohoVar5 = qhoVar7 instanceof oho ? (oho) qhoVar7 : null;
                    Boolean bool = ohoVar5 != null ? (Boolean) ohoVar5.f165512a : null;
                    if (bool != null) {
                        xmhVar.f263367b = 1;
                        Object objEmit25 = this.f58507b.emit(bool, xmhVar);
                        yuk yukVar25 = yuk.f276404a;
                        if (objEmit25 == yukVar25) {
                            return yukVar25;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof uoh) {
                    uohVar = (uoh) fbkVar;
                    int i51 = uohVar.f232431b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        uohVar.f232431b = i51 - Integer.MIN_VALUE;
                    } else {
                        uohVar = new uoh(this, fbkVar);
                    }
                } else {
                    uohVar = new uoh(this, fbkVar);
                }
                Object obj28 = uohVar.f232430a;
                int i52 = uohVar.f232431b;
                if (i52 == 0) {
                    bga.m29073P(obj28);
                    if (!((Boolean) obj).booleanValue()) {
                        uohVar.f232431b = 1;
                        Object objEmit26 = this.f58507b.emit(obj, uohVar);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof ovh) {
                    ovhVar = (ovh) fbkVar;
                    int i53 = ovhVar.f170500b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        ovhVar.f170500b = i53 - Integer.MIN_VALUE;
                    } else {
                        ovhVar = new ovh(this, fbkVar);
                    }
                } else {
                    ovhVar = new ovh(this, fbkVar);
                }
                Object obj29 = ovhVar.f170499a;
                int i54 = ovhVar.f170500b;
                if (i54 == 0) {
                    bga.m29073P(obj29);
                    uwh uwhVar = new uwh(((Boolean) obj).booleanValue());
                    ovhVar.f170500b = 1;
                    Object objEmit27 = this.f58507b.emit(uwhVar, ovhVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof pvh) {
                    pvhVar = (pvh) fbkVar;
                    int i55 = pvhVar.f181752b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        pvhVar.f181752b = i55 - Integer.MIN_VALUE;
                    } else {
                        pvhVar = new pvh(this, fbkVar);
                    }
                } else {
                    pvhVar = new pvh(this, fbkVar);
                }
                Object obj30 = pvhVar.f181751a;
                int i56 = pvhVar.f181752b;
                if (i56 == 0) {
                    bga.m29073P(obj30);
                    xwh xwhVar = new xwh(((Boolean) obj).booleanValue());
                    pvhVar.f181752b = 1;
                    Object objEmit28 = this.f58507b.emit(xwhVar, pvhVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof e7i) {
                    e7iVar = (e7i) fbkVar;
                    int i57 = e7iVar.f56940b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        e7iVar.f56940b = i57 - Integer.MIN_VALUE;
                    } else {
                        e7iVar = new e7i(this, fbkVar);
                    }
                } else {
                    e7iVar = new e7i(this, fbkVar);
                }
                Object obj31 = e7iVar.f56939a;
                int i58 = e7iVar.f56940b;
                if (i58 == 0) {
                    bga.m29073P(obj31);
                    dai daiVar = new dai((String) obj);
                    e7iVar.f56940b = 1;
                    Object objEmit29 = this.f58507b.emit(daiVar, e7iVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof f7i) {
                    f7iVar = (f7i) fbkVar;
                    int i59 = f7iVar.f66687b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        f7iVar.f66687b = i59 - Integer.MIN_VALUE;
                    } else {
                        f7iVar = new f7i(this, fbkVar);
                    }
                } else {
                    f7iVar = new f7i(this, fbkVar);
                }
                Object obj32 = f7iVar.f66686a;
                int i60 = f7iVar.f66687b;
                if (i60 == 0) {
                    bga.m29073P(obj32);
                    Boolean bool2 = (Boolean) obj;
                    wj50.m88279p(bool2);
                    fai faiVar = new fai(bool2.booleanValue());
                    f7iVar.f66687b = 1;
                    Object objEmit30 = this.f58507b.emit(faiVar, f7iVar);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
        }
    }

    public ede(niz nizVar, bxb bxbVar) {
        this.f58506a = 13;
        this.f58507b = nizVar;
    }
}
