package p204p;

import com.spotify.yourupdates.badgingstate.models.BadgingState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.IsCuratedItem;
import spotify.your_library.esperanto.proto.IsCuratedResponse;
import spotify.your_library.esperanto.proto.TransferProgressResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class aae1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f13832b;

    public /* synthetic */ aae1(niz nizVar, int i) {
        this.f13831a = i;
        this.f13832b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0220  */
    /* JADX WARN: Code duplicated, block: B:160:0x029f  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0330  */
    /* JADX WARN: Code duplicated, block: B:211:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:228:0x040d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0454  */
    /* JADX WARN: Code duplicated, block: B:267:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:293:0x0504  */
    /* JADX WARN: Code duplicated, block: B:310:0x054c  */
    /* JADX WARN: Code duplicated, block: B:343:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        z9e1 z9e1Var;
        u9e1 u9e1Var;
        String str;
        List list;
        pae1 pae1Var;
        xae1 xae1Var;
        qu80 qu80Var;
        kce1 kce1Var;
        lce1 lce1Var;
        ahe1 ahe1Var;
        cie1 cie1Var;
        wke1 wke1Var;
        yke1 yke1Var;
        joe1 joe1Var;
        koe1 koe1Var;
        rre1 rre1Var;
        wre1 wre1Var;
        xre1 xre1Var;
        yre1 yre1Var;
        pwe1 pwe1Var;
        ty11 ty11Var;
        switch (this.f13831a) {
            case 0:
                if (fbkVar instanceof z9e1) {
                    z9e1Var = (z9e1) fbkVar;
                    int i = z9e1Var.f280759b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z9e1Var.f280759b = i - Integer.MIN_VALUE;
                    } else {
                        z9e1Var = new z9e1(this, fbkVar);
                    }
                } else {
                    z9e1Var = new z9e1(this, fbkVar);
                }
                Object obj2 = z9e1Var.f280758a;
                int i2 = z9e1Var.f280759b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Map map = ((ty80) obj).f224877f.f271272q;
                    String str2 = (String) map.get("prompt_with_markup");
                    if (str2 == null) {
                        str2 = (String) map.get("prompt");
                    }
                    if (str2 == null || wl51.m88460J0(str2)) {
                        u9e1Var = new u9e1((Integer) null, (String) null, (List) null, 15);
                    } else {
                        ro80 ro80VarM72506g = qbn0.m72506g(str2);
                        int iM31820L = c95.m31820L(i6f.m49804T(ro80VarM72506g, 10));
                        if (iM31820L < 16) {
                            iM31820L = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                        ListIterator listIterator = ro80VarM72506g.listIterator(0);
                        while (true) {
                            qo80 qo80Var = (qo80) listIterator;
                            if (qo80Var.hasNext()) {
                                Object next = qo80Var.next();
                                linkedHashMap.put(((bls0) next).f28278a, next);
                            } else {
                                bls0 bls0Var = (bls0) linkedHashMap.get("intensity");
                                if (bls0Var == null) {
                                    bls0Var = (bls0) linkedHashMap.get("target_bpm");
                                }
                                bls0 bls0Var2 = (bls0) linkedHashMap.get("duration");
                                Integer numM29807r0 = bls0Var2 != null ? bm51.m29807r0(bls0Var2.f28279b) : null;
                                if (bls0Var != null) {
                                    str = bls0Var.f28283f;
                                    if (wl51.m88460J0(str)) {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                bls0 bls0Var3 = (bls0) linkedHashMap.get("genre");
                                if (bls0Var3 == null) {
                                    list = lau.f131415a;
                                } else {
                                    String str3 = bls0Var3.f28281d;
                                    Map mapM51765d = str3 != null ? ivr.m51765d(str3) : null;
                                    if (mapM51765d == null) {
                                        mapM51765d = nau.f152117a;
                                    }
                                    List listM88477a1 = wl51.m88477a1(bls0Var3.f28279b, new String[]{","}, 0, 6);
                                    ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
                                    Iterator it = listM88477a1.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(wl51.m88491o1((String) it.next()).toString());
                                    }
                                    ArrayList<String> arrayList2 = new ArrayList();
                                    for (Object obj3 : arrayList) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                                    for (String str4 : arrayList2) {
                                        String str5 = (String) mapM51765d.get(str4);
                                        if (str5 != null) {
                                            str4 = str5;
                                        }
                                        arrayList3.add(str4);
                                    }
                                    list = arrayList3;
                                }
                                u9e1Var = new u9e1(numM29807r0, str, list, 4);
                            }
                        }
                    }
                    z9e1Var.f280759b = 1;
                    Object objEmit = this.f13832b.emit(u9e1Var, z9e1Var);
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
                if (fbkVar instanceof pae1) {
                    pae1Var = (pae1) fbkVar;
                    int i3 = pae1Var.f175514b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pae1Var.f175514b = i3 - Integer.MIN_VALUE;
                    } else {
                        pae1Var = new pae1(this, fbkVar);
                    }
                } else {
                    pae1Var = new pae1(this, fbkVar);
                }
                Object obj4 = pae1Var.f175513a;
                int i4 = pae1Var.f175514b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((u3e1) obj).f226366a);
                    pae1Var.f175514b = 1;
                    Object objEmit2 = this.f13832b.emit(boolValueOf, pae1Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof xae1) {
                    xae1Var = (xae1) fbkVar;
                    int i5 = xae1Var.f259669b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        xae1Var.f259669b = i5 - Integer.MIN_VALUE;
                    } else {
                        xae1Var = new xae1(this, fbkVar);
                    }
                } else {
                    xae1Var = new xae1(this, fbkVar);
                }
                Object obj5 = xae1Var.f259668a;
                int i6 = xae1Var.f259669b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    p2x0 p2x0Var = (p2x0) obj;
                    if (p2x0Var instanceof m2x0) {
                        qu80Var = (qu80) ((m2x0) p2x0Var).f139474a;
                    } else {
                        if (!(p2x0Var instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qu80Var = null;
                    }
                    if (qu80Var != null) {
                        xae1Var.f259669b = 1;
                        Object objEmit3 = this.f13832b.emit(qu80Var, xae1Var);
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
                Object objEmit4 = this.f13832b.emit((phx0) obj, fbkVar);
                return objEmit4 == yuk.f276404a ? objEmit4 : w2a1.f247311a;
            case 4:
                if (fbkVar instanceof kce1) {
                    kce1Var = (kce1) fbkVar;
                    int i7 = kce1Var.f121461b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kce1Var.f121461b = i7 - Integer.MIN_VALUE;
                    } else {
                        kce1Var = new kce1(this, fbkVar);
                    }
                } else {
                    kce1Var = new kce1(this, fbkVar);
                }
                Object obj6 = kce1Var.f121460a;
                int i8 = kce1Var.f121461b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    Object objMo49278b = ((xul0) obj).mo49278b();
                    kce1Var.f121461b = 1;
                    Object objEmit5 = this.f13832b.emit(objMo49278b, kce1Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit5 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof lce1) {
                    lce1Var = (lce1) fbkVar;
                    int i9 = lce1Var.f131915b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        lce1Var.f131915b = i9 - Integer.MIN_VALUE;
                    } else {
                        lce1Var = new lce1(this, fbkVar);
                    }
                } else {
                    lce1Var = new lce1(this, fbkVar);
                }
                Object obj7 = lce1Var.f131914a;
                int i10 = lce1Var.f131915b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    hce1 hce1Var = new hce1((gmr0) obj);
                    lce1Var.f131915b = 1;
                    Object objEmit6 = this.f13832b.emit(hce1Var, lce1Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit6 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof ahe1) {
                    ahe1Var = (ahe1) fbkVar;
                    int i11 = ahe1Var.f15683b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ahe1Var.f15683b = i11 - Integer.MIN_VALUE;
                    } else {
                        ahe1Var = new ahe1(this, fbkVar);
                    }
                } else {
                    ahe1Var = new ahe1(this, fbkVar);
                }
                Object obj8 = ahe1Var.f15682a;
                int i12 = ahe1Var.f15683b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    die1 die1Var = (die1) obj;
                    uge1 uge1Var = new uge1(die1Var.f49348n, die1Var.f49349o, die1Var.f49350p, die1Var.f49337c, die1Var.f49335a, die1Var.f49336b, die1Var.f49338d, die1Var.f49339e, die1Var.f49340f, die1Var.f49341g);
                    ahe1Var.f15683b = 1;
                    Object objEmit7 = this.f13832b.emit(uge1Var, ahe1Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit7 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof cie1) {
                    cie1Var = (cie1) fbkVar;
                    int i13 = cie1Var.f38302b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        cie1Var.f38302b = i13 - Integer.MIN_VALUE;
                    } else {
                        cie1Var = new cie1(this, fbkVar);
                    }
                } else {
                    cie1Var = new cie1(this, fbkVar);
                }
                Object obj9 = cie1Var.f38301a;
                int i14 = cie1Var.f38302b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    die1 die1Var2 = (die1) obj;
                    qhe1 qhe1Var = new qhe1(die1Var2.f49348n, die1Var2.f49335a, die1Var2.f49336b, die1Var2.f49342h, die1Var2.f49337c, die1Var2.f49343i, die1Var2.f49344j, die1Var2.f49338d, die1Var2.f49339e, die1Var2.f49340f, die1Var2.f49341g, die1Var2.f49345k, die1Var2.f49346l, die1Var2.f49347m, die1Var2.f49350p);
                    cie1Var.f38302b = 1;
                    Object objEmit8 = this.f13832b.emit(qhe1Var, cie1Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit8 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof wke1) {
                    wke1Var = (wke1) fbkVar;
                    int i15 = wke1Var.f252222b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        wke1Var.f252222b = i15 - Integer.MIN_VALUE;
                    } else {
                        wke1Var = new wke1(this, fbkVar);
                    }
                } else {
                    wke1Var = new wke1(this, fbkVar);
                }
                Object obj10 = wke1Var.f252221a;
                int i16 = wke1Var.f252222b;
                if (i16 == 0) {
                    bga.m29073P(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(!((pe01) obj).f176586c);
                    wke1Var.f252222b = 1;
                    Object objEmit9 = this.f13832b.emit(boolValueOf2, wke1Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit9 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof yke1) {
                    yke1Var = (yke1) fbkVar;
                    int i17 = yke1Var.f273683b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        yke1Var.f273683b = i17 - Integer.MIN_VALUE;
                    } else {
                        yke1Var = new yke1(this, fbkVar);
                    }
                } else {
                    yke1Var = new yke1(this, fbkVar);
                }
                Object obj11 = yke1Var.f273682a;
                int i18 = yke1Var.f273683b;
                if (i18 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf3 = Boolean.valueOf(((pe01) obj).f176586c);
                    yke1Var.f273683b = 1;
                    Object objEmit10 = this.f13832b.emit(boolValueOf3, yke1Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit10 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof joe1) {
                    joe1Var = (joe1) fbkVar;
                    int i19 = joe1Var.f114414b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        joe1Var.f114414b = i19 - Integer.MIN_VALUE;
                    } else {
                        joe1Var = new joe1(this, fbkVar);
                    }
                } else {
                    joe1Var = new joe1(this, fbkVar);
                }
                Object obj12 = joe1Var.f114413a;
                int i20 = joe1Var.f114414b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    ae50<IsCuratedItem> ae50VarM98130q = ((IsCuratedResponse) obj).m98130q();
                    int iM31820L2 = c95.m31820L(i6f.m49804T(ae50VarM98130q, 10));
                    if (iM31820L2 < 16) {
                        iM31820L2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2);
                    for (IsCuratedItem isCuratedItem : ae50VarM98130q) {
                        linkedHashMap2.put(isCuratedItem.getUri(), Boolean.valueOf(isCuratedItem.getIsInCollection() | isCuratedItem.getIsCurated()));
                    }
                    joe1Var.f114414b = 1;
                    Object objEmit11 = this.f13832b.emit(linkedHashMap2, joe1Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit11 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof koe1) {
                    koe1Var = (koe1) fbkVar;
                    int i21 = koe1Var.f124774b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        koe1Var.f124774b = i21 - Integer.MIN_VALUE;
                    } else {
                        koe1Var = new koe1(this, fbkVar);
                    }
                } else {
                    koe1Var = new koe1(this, fbkVar);
                }
                Object obj13 = koe1Var.f124773a;
                int i22 = koe1Var.f124774b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    f4m f4mVar = new f4m((Map) obj);
                    koe1Var.f124774b = 1;
                    Object objEmit12 = this.f13832b.emit(f4mVar, koe1Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit12 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof rre1) {
                    rre1Var = (rre1) fbkVar;
                    int i23 = rre1Var.f202037b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        rre1Var.f202037b = i23 - Integer.MIN_VALUE;
                    } else {
                        rre1Var = new rre1(this, fbkVar);
                    }
                } else {
                    rre1Var = new rre1(this, fbkVar);
                }
                Object obj14 = rre1Var.f202036a;
                int i24 = rre1Var.f202037b;
                if (i24 == 0) {
                    bga.m29073P(obj14);
                    if (!(((qre1) obj) instanceof pre1)) {
                        rre1Var.f202037b = 1;
                        Object objEmit13 = this.f13832b.emit(obj, rre1Var);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit13 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof wre1) {
                    wre1Var = (wre1) fbkVar;
                    int i25 = wre1Var.f254348b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        wre1Var.f254348b = i25 - Integer.MIN_VALUE;
                    } else {
                        wre1Var = new wre1(this, fbkVar);
                    }
                } else {
                    wre1Var = new wre1(this, fbkVar);
                }
                Object obj15 = wre1Var.f254347a;
                int i26 = wre1Var.f254348b;
                if (i26 == 0) {
                    bga.m29073P(obj15);
                    byte[] bArr = (byte[]) obj;
                    try {
                        YourLibraryResponse yourLibraryResponseM98194s = YourLibraryResponse.m98194s(bArr);
                        wre1Var.f254348b = 1;
                        Object objEmit14 = this.f13832b.emit(yourLibraryResponseM98194s, wre1Var);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit14 == yukVar13) {
                            return yukVar13;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof xre1) {
                    xre1Var = (xre1) fbkVar;
                    int i27 = xre1Var.f265334b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        xre1Var.f265334b = i27 - Integer.MIN_VALUE;
                    } else {
                        xre1Var = new xre1(this, fbkVar);
                    }
                } else {
                    xre1Var = new xre1(this, fbkVar);
                }
                Object obj16 = xre1Var.f265333a;
                int i28 = xre1Var.f265334b;
                if (i28 == 0) {
                    bga.m29073P(obj16);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        YourLibraryDecorateResponse yourLibraryDecorateResponseM98163q = YourLibraryDecorateResponse.m98163q(bArr2);
                        xre1Var.f265334b = 1;
                        Object objEmit15 = this.f13832b.emit(yourLibraryDecorateResponseM98163q, xre1Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit15 == yukVar14) {
                            return yukVar14;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryDecorateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof yre1) {
                    yre1Var = (yre1) fbkVar;
                    int i29 = yre1Var.f275466b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yre1Var.f275466b = i29 - Integer.MIN_VALUE;
                    } else {
                        yre1Var = new yre1(this, fbkVar);
                    }
                } else {
                    yre1Var = new yre1(this, fbkVar);
                }
                Object obj17 = yre1Var.f275465a;
                int i30 = yre1Var.f275466b;
                if (i30 == 0) {
                    bga.m29073P(obj17);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        TransferProgressResponse transferProgressResponseM98144p = TransferProgressResponse.m98144p(bArr3);
                        yre1Var.f275466b = 1;
                        Object objEmit16 = this.f13832b.emit(transferProgressResponseM98144p, yre1Var);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit16 == yukVar15) {
                            return yukVar15;
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.TransferProgressResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof pwe1) {
                    pwe1Var = (pwe1) fbkVar;
                    int i31 = pwe1Var.f182008b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        pwe1Var.f182008b = i31 - Integer.MIN_VALUE;
                    } else {
                        pwe1Var = new pwe1(this, fbkVar);
                    }
                } else {
                    pwe1Var = new pwe1(this, fbkVar);
                }
                Object obj18 = pwe1Var.f182007a;
                int i32 = pwe1Var.f182008b;
                if (i32 == 0) {
                    bga.m29073P(obj18);
                    int i33 = owe1.f170705a[((BadgingState) obj).ordinal()];
                    if (i33 == 1) {
                        ty11Var = ty11.f224801a;
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ty11Var = ty11.f224802b;
                    }
                    pwe1Var.f182008b = 1;
                    Object objEmit17 = this.f13832b.emit(ty11Var, pwe1Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit17 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
        }
    }

    public aae1(niz nizVar, bae1 bae1Var) {
        this.f13831a = 0;
        this.f13832b = nizVar;
    }
}
