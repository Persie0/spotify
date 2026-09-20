package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class hop implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f93587b;

    public /* synthetic */ hop(niz nizVar, int i) {
        this.f93586a = i;
        this.f93587b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0212  */
    /* JADX WARN: Code duplicated, block: B:162:0x0259  */
    /* JADX WARN: Code duplicated, block: B:183:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:221:0x033a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0381  */
    /* JADX WARN: Code duplicated, block: B:261:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:280:0x0414  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:315:0x049c  */
    /* JADX WARN: Code duplicated, block: B:340:0x0501  */
    /* JADX WARN: Code duplicated, block: B:361:0x0549  */
    /* JADX WARN: Code duplicated, block: B:380:0x0592  */
    /* JADX WARN: Code duplicated, block: B:397:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:414:0x0621  */
    /* JADX WARN: Code duplicated, block: B:433:0x066c  */
    /* JADX WARN: Code duplicated, block: B:450:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:471:0x0705  */
    /* JADX WARN: Code duplicated, block: B:495:0x0787  */
    /* JADX WARN: Code duplicated, block: B:514:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:531:0x081f  */
    /* JADX WARN: Code duplicated, block: B:550:0x0869  */
    /* JADX WARN: Code duplicated, block: B:591:0x0954  */
    /* JADX WARN: Code duplicated, block: B:614:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        gop gopVar;
        iop iopVar;
        int i;
        qop qopVar;
        String lowerCase;
        spp sppVar;
        tpp tppVar;
        ysp yspVar;
        qtp qtpVar;
        hxp hxpVar;
        l0q l0qVar;
        q0q q0qVar;
        r0q r0qVar;
        v2q v2qVar;
        r3q r3qVar;
        p8q p8qVar;
        qaq qaqVar;
        Object k001Var;
        raq raqVar;
        Object x001Var;
        Object obj2;
        afq afqVar;
        ihq ihqVar;
        jhq jhqVar;
        khq khqVar;
        eiq eiqVar;
        xiq xiqVar;
        rjq rjqVar;
        ujq ujqVar;
        hpq hpqVar;
        rpq rpqVar;
        spq spqVar;
        fsq fsqVar;
        gsq gsqVar;
        isq isqVar;
        switch (this.f93586a) {
            case 0:
                if (fbkVar instanceof gop) {
                    gopVar = (gop) fbkVar;
                    int i2 = gopVar.f82990b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gopVar.f82990b = i2 - Integer.MIN_VALUE;
                    } else {
                        gopVar = new gop(this, fbkVar);
                    }
                } else {
                    gopVar = new gop(this, fbkVar);
                }
                Object obj3 = gopVar.f82989a;
                int i3 = gopVar.f82990b;
                if (i3 == 0) {
                    bga.m29073P(obj3);
                    Collection collectionValues = ((Map) obj).values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : collectionValues) {
                        mb90 mb90Var = ((nb90) obj4).f152221b;
                        if (mb90Var != null && mb90Var.f141840c) {
                            arrayList.add(obj4);
                        }
                    }
                    List listM43711Y0 = g6f.m43711Y0(arrayList, new hwd(21));
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
                    Iterator it = listM43711Y0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((nb90) it.next()).f152220a);
                    }
                    gopVar.f82990b = 1;
                    Object objEmit = this.f93587b.emit(arrayList2, gopVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof iop) {
                    iopVar = (iop) fbkVar;
                    int i4 = iopVar.f104264b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        iopVar.f104264b = i4 - Integer.MIN_VALUE;
                    } else {
                        iopVar = new iop(this, fbkVar);
                    }
                } else {
                    iopVar = new iop(this, fbkVar);
                }
                Object obj5 = iopVar.f104263a;
                int i5 = iopVar.f104264b;
                yuk yukVar2 = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i = iopVar.f104266d;
                        bga.m29073P(obj5);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj5);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj5);
                iopVar.f104266d = 0;
                iopVar.f104264b = 1;
                if (this.f93587b.emit((List) obj, iopVar) == yukVar2) {
                    return yukVar2;
                }
                i = 0;
                iopVar.f104266d = i;
                iopVar.f104264b = 2;
                if (njg1.m64619l(500L, iopVar) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof qop) {
                    qopVar = (qop) fbkVar;
                    int i6 = qopVar.f191025b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qopVar.f191025b = i6 - Integer.MIN_VALUE;
                    } else {
                        qopVar = new qop(this, fbkVar);
                    }
                } else {
                    qopVar = new qop(this, fbkVar);
                }
                Object obj6 = qopVar.f191024a;
                int i7 = qopVar.f191025b;
                if (i7 == 0) {
                    bga.m29073P(obj6);
                    wd50 wd50VarM98215q = ((YourLibraryResponse) obj).m98199q().m98202n().m98215q();
                    ArrayList<boe1> arrayList3 = new ArrayList();
                    for (Object obj7 : wd50VarM98215q) {
                        boe1 boe1Var = (boe1) obj7;
                        wj50.m88279p(boe1Var);
                        switch (boe1Var) {
                            case ALBUM:
                            case ARTIST:
                            case PLAYLIST:
                            case SHOW:
                            case BOOK:
                            case EVENT:
                            case AUTHOR:
                            case DOWNLOADED:
                                arrayList3.add(obj7);
                                break;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                    for (boe1 boe1Var2 : arrayList3) {
                        String strName = boe1Var2.name();
                        switch (boe1Var2) {
                            case ALBUM:
                                lowerCase = "Albums";
                                break;
                            case ARTIST:
                                lowerCase = "Artists";
                                break;
                            case PLAYLIST:
                                lowerCase = "Playlists";
                                break;
                            case SHOW:
                                lowerCase = "Podcasts";
                                break;
                            case BOOK:
                                lowerCase = "Audiobooks";
                                break;
                            case EVENT:
                                lowerCase = "Events";
                                break;
                            case AUTHOR:
                                lowerCase = "Authors";
                                break;
                            case DOWNLOADED:
                                lowerCase = "Downloaded";
                                break;
                            default:
                                String strName2 = boe1Var2.name();
                                Locale locale = Locale.ROOT;
                                lowerCase = strName2.toLowerCase(locale);
                                if (lowerCase.length() > 0) {
                                    lowerCase = ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
                                }
                                break;
                        }
                        arrayList4.add(new klw0(strName, lowerCase));
                    }
                    qopVar.f191025b = 1;
                    Object objEmit2 = this.f93587b.emit(arrayList4, qopVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit2 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof spp) {
                    sppVar = (spp) fbkVar;
                    int i8 = sppVar.f212907b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        sppVar.f212907b = i8 - Integer.MIN_VALUE;
                    } else {
                        sppVar = new spp(this, fbkVar);
                    }
                } else {
                    sppVar = new spp(this, fbkVar);
                }
                Object obj8 = sppVar.f212906a;
                int i9 = sppVar.f212907b;
                if (i9 == 0) {
                    bga.m29073P(obj8);
                    Object objInvoke = jnx.f114216R0.invoke((yhk0) obj);
                    if (objInvoke != null) {
                        sppVar.f212907b = 1;
                        Object objEmit3 = this.f93587b.emit(objInvoke, sppVar);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit3 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof tpp) {
                    tppVar = (tpp) fbkVar;
                    int i10 = tppVar.f222572b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tppVar.f222572b = i10 - Integer.MIN_VALUE;
                    } else {
                        tppVar = new tpp(this, fbkVar);
                    }
                } else {
                    tppVar = new tpp(this, fbkVar);
                }
                Object obj9 = tppVar.f222571a;
                int i11 = tppVar.f222572b;
                if (i11 == 0) {
                    bga.m29073P(obj9);
                    List listM43727j0 = g6f.m43727j0(((Map) obj).values());
                    tppVar.f222572b = 1;
                    Object objEmit4 = this.f93587b.emit(listM43727j0, tppVar);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit4 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof ysp) {
                    yspVar = (ysp) fbkVar;
                    int i12 = yspVar.f275849b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        yspVar.f275849b = i12 - Integer.MIN_VALUE;
                    } else {
                        yspVar = new ysp(this, fbkVar);
                    }
                } else {
                    yspVar = new ysp(this, fbkVar);
                }
                Object obj10 = yspVar.f275848a;
                int i13 = yspVar.f275849b;
                if (i13 == 0) {
                    bga.m29073P(obj10);
                    if (((Number) obj).intValue() != Integer.MAX_VALUE) {
                        yspVar.f275849b = 1;
                        Object objEmit5 = this.f93587b.emit(obj, yspVar);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit5 == yukVar6) {
                            return yukVar6;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof qtp) {
                    qtpVar = (qtp) fbkVar;
                    int i14 = qtpVar.f192430b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        qtpVar.f192430b = i14 - Integer.MIN_VALUE;
                    } else {
                        qtpVar = new qtp(this, fbkVar);
                    }
                } else {
                    qtpVar = new qtp(this, fbkVar);
                }
                Object obj11 = qtpVar.f192429a;
                int i15 = qtpVar.f192430b;
                if (i15 == 0) {
                    bga.m29073P(obj11);
                    ae50<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> ae50VarM98166o = ((YourLibraryDecorateResponse) obj).m98166o();
                    int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM98166o, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : ae50VarM98166o) {
                        linkedHashMap.put(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri(), Boolean.valueOf(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().m98278u()));
                    }
                    qtpVar.f192430b = 1;
                    Object objEmit6 = this.f93587b.emit(linkedHashMap, qtpVar);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit6 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof hxp) {
                    hxpVar = (hxp) fbkVar;
                    int i16 = hxpVar.f96259b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        hxpVar.f96259b = i16 - Integer.MIN_VALUE;
                    } else {
                        hxpVar = new hxp(this, fbkVar);
                    }
                } else {
                    hxpVar = new hxp(this, fbkVar);
                }
                Object obj12 = hxpVar.f96258a;
                int i17 = hxpVar.f96259b;
                if (i17 == 0) {
                    bga.m29073P(obj12);
                    Integer num = (Integer) ((gv31) obj).f84602a;
                    Integer num2 = new Integer(num != null ? num.intValue() : 0);
                    hxpVar.f96259b = 1;
                    Object objEmit7 = this.f93587b.emit(num2, hxpVar);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit7 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof l0q) {
                    l0qVar = (l0q) fbkVar;
                    int i18 = l0qVar.f128496b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        l0qVar.f128496b = i18 - Integer.MIN_VALUE;
                    } else {
                        l0qVar = new l0q(this, fbkVar);
                    }
                } else {
                    l0qVar = new l0q(this, fbkVar);
                }
                Object obj13 = l0qVar.f128495a;
                int i19 = l0qVar.f128496b;
                if (i19 == 0) {
                    bga.m29073P(obj13);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    l0qVar.f128496b = 1;
                    Object objEmit8 = this.f93587b.emit(objMo49283h, l0qVar);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit8 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof q0q) {
                    q0qVar = (q0q) fbkVar;
                    int i20 = q0qVar.f184057b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        q0qVar.f184057b = i20 - Integer.MIN_VALUE;
                    } else {
                        q0qVar = new q0q(this, fbkVar);
                    }
                } else {
                    q0qVar = new q0q(this, fbkVar);
                }
                Object obj14 = q0qVar.f184056a;
                int i21 = q0qVar.f184057b;
                if (i21 == 0) {
                    bga.m29073P(obj14);
                    if (!((by50) obj).f32082h.f287209b.f224569e) {
                        q0qVar.f184057b = 1;
                        Object objEmit9 = this.f93587b.emit(obj, q0qVar);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit9 == yukVar10) {
                            return yukVar10;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof r0q) {
                    r0qVar = (r0q) fbkVar;
                    int i22 = r0qVar.f194539b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        r0qVar.f194539b = i22 - Integer.MIN_VALUE;
                    } else {
                        r0qVar = new r0q(this, fbkVar);
                    }
                } else {
                    r0qVar = new r0q(this, fbkVar);
                }
                Object obj15 = r0qVar.f194538a;
                int i23 = r0qVar.f194539b;
                if (i23 == 0) {
                    bga.m29073P(obj15);
                    sx50 sx50Var = new sx50(((by50) obj).f32076b);
                    r0qVar.f194539b = 1;
                    Object objEmit10 = this.f93587b.emit(sx50Var, r0qVar);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit10 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof v2q) {
                    v2qVar = (v2q) fbkVar;
                    int i24 = v2qVar.f236710b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        v2qVar.f236710b = i24 - Integer.MIN_VALUE;
                    } else {
                        v2qVar = new v2q(this, fbkVar);
                    }
                } else {
                    v2qVar = new v2q(this, fbkVar);
                }
                Object obj16 = v2qVar.f236709a;
                int i25 = v2qVar.f236710b;
                if (i25 == 0) {
                    bga.m29073P(obj16);
                    List listMo63979b = ((vab) obj).mo63979b();
                    v2qVar.f236710b = 1;
                    Object objEmit11 = this.f93587b.emit(listMo63979b, v2qVar);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit11 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof r3q) {
                    r3qVar = (r3q) fbkVar;
                    int i26 = r3qVar.f195539b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        r3qVar.f195539b = i26 - Integer.MIN_VALUE;
                    } else {
                        r3qVar = new r3q(this, fbkVar);
                    }
                } else {
                    r3qVar = new r3q(this, fbkVar);
                }
                Object obj17 = r3qVar.f195538a;
                int i27 = r3qVar.f195539b;
                if (i27 == 0) {
                    bga.m29073P(obj17);
                    if (((Boolean) obj).booleanValue()) {
                        r3qVar.f195539b = 1;
                        Object objEmit12 = this.f93587b.emit(obj, r3qVar);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit12 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof p8q) {
                    p8qVar = (p8q) fbkVar;
                    int i28 = p8qVar.f175018b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        p8qVar.f175018b = i28 - Integer.MIN_VALUE;
                    } else {
                        p8qVar = new p8q(this, fbkVar);
                    }
                } else {
                    p8qVar = new p8q(this, fbkVar);
                }
                Object obj18 = p8qVar.f175017a;
                int i29 = p8qVar.f175018b;
                if (i29 == 0) {
                    bga.m29073P(obj18);
                    xxd1 xxd1Var = (xxd1) obj;
                    byd1 byd1Var = xxd1Var != null ? xxd1Var.f266947a : null;
                    p8qVar.f175018b = 1;
                    Object objEmit13 = this.f93587b.emit(byd1Var, p8qVar);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit13 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof qaq) {
                    qaqVar = (qaq) fbkVar;
                    int i30 = qaqVar.f186915b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        qaqVar.f186915b = i30 - Integer.MIN_VALUE;
                    } else {
                        qaqVar = new qaq(this, fbkVar);
                    }
                } else {
                    qaqVar = new qaq(this, fbkVar);
                }
                Object obj19 = qaqVar.f186914a;
                int i31 = qaqVar.f186915b;
                if (i31 == 0) {
                    bga.m29073P(obj19);
                    e591 e591Var = (e591) obj;
                    if (e591Var instanceof d591) {
                        d591 d591Var = (d591) e591Var;
                        k001Var = new n001(d591Var.f45373b, d591Var.f45372a);
                    } else {
                        if (!(e591Var instanceof c591)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k001Var = new k001(((c591) e591Var).f34110a);
                    }
                    qaqVar.f186915b = 1;
                    Object objEmit14 = this.f93587b.emit(k001Var, qaqVar);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit14 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof raq) {
                    raqVar = (raq) fbkVar;
                    int i32 = raqVar.f197363b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        raqVar.f197363b = i32 - Integer.MIN_VALUE;
                    } else {
                        raqVar = new raq(this, fbkVar);
                    }
                } else {
                    raqVar = new raq(this, fbkVar);
                }
                Object obj20 = raqVar.f197362a;
                int i33 = raqVar.f197363b;
                if (i33 == 0) {
                    bga.m29073P(obj20);
                    iac iacVar = (iac) obj;
                    if (iacVar instanceof dac) {
                        obj2 = j001.f107323a;
                    } else {
                        if (iacVar instanceof gac) {
                            x001Var = new m001(((gac) iacVar).f78025a);
                        } else if (iacVar instanceof fac) {
                            x001Var = new l001(((fac) iacVar).f67508a);
                        } else if (iacVar instanceof hac) {
                            x001Var = new y001(((hac) iacVar).f89190a);
                        } else {
                            if (!(iacVar instanceof eac)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            x001Var = new x001(((eac) iacVar).f57619a);
                        }
                        obj2 = x001Var;
                    }
                    raqVar.f197363b = 1;
                    Object objEmit15 = this.f93587b.emit(obj2, raqVar);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit15 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof afq) {
                    afqVar = (afq) fbkVar;
                    int i34 = afqVar.f15199b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        afqVar.f15199b = i34 - Integer.MIN_VALUE;
                    } else {
                        afqVar = new afq(this, fbkVar);
                    }
                } else {
                    afqVar = new afq(this, fbkVar);
                }
                Object obj21 = afqVar.f15198a;
                int i35 = afqVar.f15199b;
                if (i35 == 0) {
                    bga.m29073P(obj21);
                    if (obj instanceof o001) {
                        afqVar.f15199b = 1;
                        Object objEmit16 = this.f93587b.emit(obj, afqVar);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit16 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ihq) {
                    ihqVar = (ihq) fbkVar;
                    int i36 = ihqVar.f102346b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ihqVar.f102346b = i36 - Integer.MIN_VALUE;
                    } else {
                        ihqVar = new ihq(this, fbkVar);
                    }
                } else {
                    ihqVar = new ihq(this, fbkVar);
                }
                Object obj22 = ihqVar.f102345a;
                int i37 = ihqVar.f102346b;
                if (i37 == 0) {
                    bga.m29073P(obj22);
                    a0r0 a0r0Var = (a0r0) obj;
                    Boolean boolValueOf = Boolean.valueOf(!((a0r0Var != null ? a0r0Var.f11158a : null) instanceof yzq0));
                    ihqVar.f102346b = 1;
                    Object objEmit17 = this.f93587b.emit(boolValueOf, ihqVar);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit17 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof jhq) {
                    jhqVar = (jhq) fbkVar;
                    int i38 = jhqVar.f112549b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        jhqVar.f112549b = i38 - Integer.MIN_VALUE;
                    } else {
                        jhqVar = new jhq(this, fbkVar);
                    }
                } else {
                    jhqVar = new jhq(this, fbkVar);
                }
                Object obj23 = jhqVar.f112548a;
                int i39 = jhqVar.f112549b;
                if (i39 == 0) {
                    bga.m29073P(obj23);
                    if (((ywi) obj).f276973c != null) {
                        jhqVar.f112549b = 1;
                        Object objEmit18 = this.f93587b.emit(obj, jhqVar);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit18 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof khq) {
                    khqVar = (khq) fbkVar;
                    int i40 = khqVar.f122705b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        khqVar.f122705b = i40 - Integer.MIN_VALUE;
                    } else {
                        khqVar = new khq(this, fbkVar);
                    }
                } else {
                    khqVar = new khq(this, fbkVar);
                }
                Object obj24 = khqVar.f122704a;
                int i41 = khqVar.f122705b;
                if (i41 == 0) {
                    bga.m29073P(obj24);
                    Double d = ((ywi) obj).f276973c;
                    wj50.m88279p(d);
                    khqVar.f122705b = 1;
                    Object objEmit19 = this.f93587b.emit(d, khqVar);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit19 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof eiq) {
                    eiqVar = (eiq) fbkVar;
                    int i42 = eiqVar.f59998b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        eiqVar.f59998b = i42 - Integer.MIN_VALUE;
                    } else {
                        eiqVar = new eiq(this, fbkVar);
                    }
                } else {
                    eiqVar = new eiq(this, fbkVar);
                }
                Object obj25 = eiqVar.f59997a;
                int i43 = eiqVar.f59998b;
                if (i43 == 0) {
                    bga.m29073P(obj25);
                    Boolean bool = (Boolean) ((gv31) obj).f84602a;
                    Boolean boolValueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    eiqVar.f59998b = 1;
                    Object objEmit20 = this.f93587b.emit(boolValueOf2, eiqVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit20 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof xiq) {
                    xiqVar = (xiq) fbkVar;
                    int i44 = xiqVar.f261929b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        xiqVar.f261929b = i44 - Integer.MIN_VALUE;
                    } else {
                        xiqVar = new xiq(this, fbkVar);
                    }
                } else {
                    xiqVar = new xiq(this, fbkVar);
                }
                Object obj26 = xiqVar.f261928a;
                int i45 = xiqVar.f261929b;
                if (i45 == 0) {
                    bga.m29073P(obj26);
                    xxd1 xxd1Var2 = (xxd1) obj;
                    byd1 byd1Var2 = xxd1Var2 != null ? xxd1Var2.f266947a : null;
                    xiqVar.f261929b = 1;
                    Object objEmit21 = this.f93587b.emit(byd1Var2, xiqVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit21 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof rjq) {
                    rjqVar = (rjq) fbkVar;
                    int i46 = rjqVar.f199883b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        rjqVar.f199883b = i46 - Integer.MIN_VALUE;
                    } else {
                        rjqVar = new rjq(this, fbkVar);
                    }
                } else {
                    rjqVar = new rjq(this, fbkVar);
                }
                Object obj27 = rjqVar.f199882a;
                int i47 = rjqVar.f199883b;
                if (i47 == 0) {
                    bga.m29073P(obj27);
                    if (((e301) obj).f55572b) {
                        rjqVar.f199883b = 1;
                        Object objEmit22 = this.f93587b.emit(obj, rjqVar);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit22 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof ujq) {
                    ujqVar = (ujq) fbkVar;
                    int i48 = ujqVar.f231078b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        ujqVar.f231078b = i48 - Integer.MIN_VALUE;
                    } else {
                        ujqVar = new ujq(this, fbkVar);
                    }
                } else {
                    ujqVar = new ujq(this, fbkVar);
                }
                Object obj28 = ujqVar.f231077a;
                int i49 = ujqVar.f231078b;
                if (i49 == 0) {
                    bga.m29073P(obj28);
                    if (((e301) obj).f55572b) {
                        ujqVar.f231078b = 1;
                        Object objEmit23 = this.f93587b.emit(obj, ujqVar);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit23 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof hpq) {
                    hpqVar = (hpq) fbkVar;
                    int i50 = hpqVar.f93826b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        hpqVar.f93826b = i50 - Integer.MIN_VALUE;
                    } else {
                        hpqVar = new hpq(this, fbkVar);
                    }
                } else {
                    hpqVar = new hpq(this, fbkVar);
                }
                Object obj29 = hpqVar.f93825a;
                int i51 = hpqVar.f93826b;
                if (i51 == 0) {
                    bga.m29073P(obj29);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    uu41 uu41Var = ohoVar != null ? (uu41) ohoVar.f165512a : null;
                    if (uu41Var != null) {
                        hpqVar.f93826b = 1;
                        Object objEmit24 = this.f93587b.emit(uu41Var, hpqVar);
                        yuk yukVar25 = yuk.f276404a;
                        if (objEmit24 == yukVar25) {
                            return yukVar25;
                        }
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof rpq) {
                    rpqVar = (rpq) fbkVar;
                    int i52 = rpqVar.f201624b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        rpqVar.f201624b = i52 - Integer.MIN_VALUE;
                    } else {
                        rpqVar = new rpq(this, fbkVar);
                    }
                } else {
                    rpqVar = new rpq(this, fbkVar);
                }
                Object obj30 = rpqVar.f201623a;
                int i53 = rpqVar.f201624b;
                if (i53 == 0) {
                    bga.m29073P(obj30);
                    if (((Boolean) obj).booleanValue()) {
                        rpqVar.f201624b = 1;
                        Object objEmit25 = this.f93587b.emit(obj, rpqVar);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit25 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof spq) {
                    spqVar = (spq) fbkVar;
                    int i54 = spqVar.f212914b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        spqVar.f212914b = i54 - Integer.MIN_VALUE;
                    } else {
                        spqVar = new spq(this, fbkVar);
                    }
                } else {
                    spqVar = new spq(this, fbkVar);
                }
                Object obj31 = spqVar.f212913a;
                int i55 = spqVar.f212914b;
                if (i55 == 0) {
                    bga.m29073P(obj31);
                    Boolean boolValueOf3 = Boolean.valueOf(((ty80) obj).f224877f.f271251C);
                    spqVar.f212914b = 1;
                    Object objEmit26 = this.f93587b.emit(boolValueOf3, spqVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit26 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof fsq) {
                    fsqVar = (fsq) fbkVar;
                    int i56 = fsqVar.f72919b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        fsqVar.f72919b = i56 - Integer.MIN_VALUE;
                    } else {
                        fsqVar = new fsq(this, fbkVar);
                    }
                } else {
                    fsqVar = new fsq(this, fbkVar);
                }
                Object obj32 = fsqVar.f72918a;
                int i57 = fsqVar.f72919b;
                if (i57 == 0) {
                    bga.m29073P(obj32);
                    if (obj instanceof v76) {
                        fsqVar.f72919b = 1;
                        Object objEmit27 = this.f93587b.emit(obj, fsqVar);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit27 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof gsq) {
                    gsqVar = (gsq) fbkVar;
                    int i58 = gsqVar.f84005b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        gsqVar.f84005b = i58 - Integer.MIN_VALUE;
                    } else {
                        gsqVar = new gsq(this, fbkVar);
                    }
                } else {
                    gsqVar = new gsq(this, fbkVar);
                }
                Object obj33 = gsqVar.f84004a;
                int i59 = gsqVar.f84005b;
                if (i59 == 0) {
                    bga.m29073P(obj33);
                    nm20 nm20Var = ((eyp0) obj).f64149b;
                    gsqVar.f84005b = 1;
                    Object objEmit28 = this.f93587b.emit(nm20Var, gsqVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit28 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof isq) {
                    isqVar = (isq) fbkVar;
                    int i60 = isqVar.f105294b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        isqVar.f105294b = i60 - Integer.MIN_VALUE;
                    } else {
                        isqVar = new isq(this, fbkVar);
                    }
                } else {
                    isqVar = new isq(this, fbkVar);
                }
                Object obj34 = isqVar.f105293a;
                int i61 = isqVar.f105294b;
                if (i61 == 0) {
                    bga.m29073P(obj34);
                    if (obj instanceof duq) {
                        isqVar.f105294b = 1;
                        Object objEmit29 = this.f93587b.emit(obj, isqVar);
                        yuk yukVar30 = yuk.f276404a;
                        if (objEmit29 == yukVar30) {
                            return yukVar30;
                        }
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
        }
    }
}
