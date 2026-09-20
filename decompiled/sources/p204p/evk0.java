package p204p;

import com.google.protobuf.Duration;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$PageMatchItemData;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.offline_esperanto.proto.EsOffline$ContextProgress;
import com.spotify.offline_esperanto.proto.EsOffline$ContextsProgressResponse;
import com.spotify.offline_esperanto.proto.EsOffline$GetOfflinePlaybackStatusResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class evk0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f63281b;

    public /* synthetic */ evk0(niz nizVar, int i) {
        this.f63280a = i;
        this.f63281b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:132:0x020c  */
    /* JADX WARN: Code duplicated, block: B:148:0x024f  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:199:0x0308  */
    /* JADX WARN: Code duplicated, block: B:219:0x034c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0390  */
    /* JADX WARN: Code duplicated, block: B:255:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:271:0x040c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:294:0x0459  */
    /* JADX WARN: Code duplicated, block: B:313:0x0497  */
    /* JADX WARN: Code duplicated, block: B:331:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:347:0x0516  */
    /* JADX WARN: Code duplicated, block: B:370:0x058e  */
    /* JADX WARN: Code duplicated, block: B:386:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:402:0x060a  */
    /* JADX WARN: Code duplicated, block: B:418:0x0647  */
    /* JADX WARN: Code duplicated, block: B:434:0x0680  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:450:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:473:0x0703  */
    /* JADX WARN: Code duplicated, block: B:492:0x074a  */
    /* JADX WARN: Code duplicated, block: B:516:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:532:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:551:0x0839  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        dvk0 dvk0Var;
        kvk0 kvk0Var;
        tvk0 tvk0Var;
        uvk0 uvk0Var;
        wvk0 wvk0Var;
        dwk0 dwk0Var;
        lzk0 lzk0Var;
        mzk0 mzk0Var;
        zzk0 zzk0Var;
        d0l0 d0l0Var;
        j0l0 j0l0Var;
        t3l0 t3l0Var;
        d9l0 d9l0Var;
        y9l0 y9l0Var;
        gal0 gal0Var;
        hal0 hal0Var;
        mjl0 mjl0Var;
        jwl0 jwl0Var;
        axl0 axl0Var;
        bxl0 bxl0Var;
        xam0 xam0Var;
        kdm0 kdm0Var;
        CollectionItemdata$ItemData collectionItemdata$ItemDataM6882q;
        CollectionItemdata$PageMatchItemData collectionItemdata$PageMatchItemDataM6824s;
        Duration durationM6830p;
        odm0 odm0Var;
        qdm0 qdm0Var;
        rdm0 rdm0Var;
        sdm0 sdm0Var;
        tdm0 tdm0Var;
        udm0 udm0Var;
        eem0 eem0Var;
        rem0 rem0Var;
        int i = this.f63280a;
        c9l0 c9l0Var = c9l0.f35585b;
        Object cksVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f63281b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof dvk0) {
                    dvk0Var = (dvk0) fbkVar;
                    int i2 = dvk0Var.f53477b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        dvk0Var.f53477b = i2 - Integer.MIN_VALUE;
                    } else {
                        dvk0Var = new dvk0(this, fbkVar);
                    }
                } else {
                    dvk0Var = new dvk0(this, fbkVar);
                }
                Object obj2 = dvk0Var.f53476a;
                int i3 = dvk0Var.f53477b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                cksVar = ohoVar != null ? (Set) ohoVar.f165512a : null;
                if (cksVar == null) {
                    return w2a1Var;
                }
                dvk0Var.f53477b = 1;
                return nizVar.emit(cksVar, dvk0Var) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof kvk0) {
                    kvk0Var = (kvk0) fbkVar;
                    int i4 = kvk0Var.f126872b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kvk0Var.f126872b = i4 - Integer.MIN_VALUE;
                    } else {
                        kvk0Var = new kvk0(this, fbkVar);
                    }
                } else {
                    kvk0Var = new kvk0(this, fbkVar);
                }
                Object obj3 = kvk0Var.f126871a;
                int i5 = kvk0Var.f126872b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                Boolean boolValueOf = Boolean.valueOf(((ty80) obj).f224877f.f271255G.isEmpty() ^ true);
                kvk0Var.f126872b = 1;
                return nizVar.emit(boolValueOf, kvk0Var) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof tvk0) {
                    tvk0Var = (tvk0) fbkVar;
                    int i6 = tvk0Var.f224187b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tvk0Var.f224187b = i6 - Integer.MIN_VALUE;
                    } else {
                        tvk0Var = new tvk0(this, fbkVar);
                    }
                } else {
                    tvk0Var = new tvk0(this, fbkVar);
                }
                Object obj4 = tvk0Var.f224186a;
                int i7 = tvk0Var.f224187b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                Object objM43745s0 = g6f.m43745s0(((y5b) obj).f269395c);
                tvk0Var.f224187b = 1;
                return nizVar.emit(objM43745s0, tvk0Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof uvk0) {
                    uvk0Var = (uvk0) fbkVar;
                    int i8 = uvk0Var.f234463b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        uvk0Var.f234463b = i8 - Integer.MIN_VALUE;
                    } else {
                        uvk0Var = new uvk0(this, fbkVar);
                    }
                } else {
                    uvk0Var = new uvk0(this, fbkVar);
                }
                Object obj5 = uvk0Var.f234462a;
                int i9 = uvk0Var.f234463b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                List list = ((ty80) obj).f224877f.f271255G;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                int i10 = 0;
                for (Object obj6 : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    sth sthVar = (sth) obj6;
                    arrayList.add(new d0z(sthVar.f213915b, sthVar.f213914a, false, i10));
                    i10 = i11;
                }
                uvk0Var.f234463b = 1;
                return nizVar.emit(arrayList, uvk0Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof wvk0) {
                    wvk0Var = (wvk0) fbkVar;
                    int i12 = wvk0Var.f255520b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        wvk0Var.f255520b = i12 - Integer.MIN_VALUE;
                    } else {
                        wvk0Var = new wvk0(this, fbkVar);
                    }
                } else {
                    wvk0Var = new wvk0(this, fbkVar);
                }
                Object obj7 = wvk0Var.f255519a;
                int i13 = wvk0Var.f255520b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                Boolean boolValueOf2 = Boolean.valueOf(((ty80) obj).f224877f.f271255G.isEmpty() ^ true);
                wvk0Var.f255520b = 1;
                return nizVar.emit(boolValueOf2, wvk0Var) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof dwk0) {
                    dwk0Var = (dwk0) fbkVar;
                    int i14 = dwk0Var.f53720b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        dwk0Var.f53720b = i14 - Integer.MIN_VALUE;
                    } else {
                        dwk0Var = new dwk0(this, fbkVar);
                    }
                } else {
                    dwk0Var = new dwk0(this, fbkVar);
                }
                Object obj8 = dwk0Var.f53719a;
                int i15 = dwk0Var.f53720b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                qho qhoVar2 = (qho) obj;
                oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                cksVar = ohoVar2 != null ? (i490) ohoVar2.f165512a : null;
                if (cksVar == null) {
                    return w2a1Var;
                }
                dwk0Var.f53720b = 1;
                return nizVar.emit(cksVar, dwk0Var) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof lzk0) {
                    lzk0Var = (lzk0) fbkVar;
                    int i16 = lzk0Var.f138380b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        lzk0Var.f138380b = i16 - Integer.MIN_VALUE;
                    } else {
                        lzk0Var = new lzk0(this, fbkVar);
                    }
                } else {
                    lzk0Var = new lzk0(this, fbkVar);
                }
                Object obj9 = lzk0Var.f138379a;
                int i17 = lzk0Var.f138380b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                jzk0 jzk0Var = (jzk0) ((pqm0) obj).f180351b;
                lzk0Var.f138380b = 1;
                return nizVar.emit(jzk0Var, lzk0Var) == yukVar ? yukVar : w2a1Var;
            case 7:
                if (fbkVar instanceof mzk0) {
                    mzk0Var = (mzk0) fbkVar;
                    int i18 = mzk0Var.f148724b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        mzk0Var.f148724b = i18 - Integer.MIN_VALUE;
                    } else {
                        mzk0Var = new mzk0(this, fbkVar);
                    }
                } else {
                    mzk0Var = new mzk0(this, fbkVar);
                }
                Object obj10 = mzk0Var.f148723a;
                int i19 = mzk0Var.f148724b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                gj80 gj80Var = ((jzk0) obj).f117747c;
                mzk0Var.f148724b = 1;
                return nizVar.emit(gj80Var, mzk0Var) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof zzk0) {
                    zzk0Var = (zzk0) fbkVar;
                    int i20 = zzk0Var.f288021b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        zzk0Var.f288021b = i20 - Integer.MIN_VALUE;
                    } else {
                        zzk0Var = new zzk0(this, fbkVar);
                    }
                } else {
                    zzk0Var = new zzk0(this, fbkVar);
                }
                Object obj11 = zzk0Var.f288020a;
                int i21 = zzk0Var.f288021b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                Boolean boolValueOf3 = Boolean.valueOf(((pe01) obj).f176584a);
                zzk0Var.f288021b = 1;
                return nizVar.emit(boolValueOf3, zzk0Var) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof d0l0) {
                    d0l0Var = (d0l0) fbkVar;
                    int i22 = d0l0Var.f43908b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        d0l0Var.f43908b = i22 - Integer.MIN_VALUE;
                    } else {
                        d0l0Var = new d0l0(this, fbkVar);
                    }
                } else {
                    d0l0Var = new d0l0(this, fbkVar);
                }
                Object obj12 = d0l0Var.f43907a;
                int i23 = d0l0Var.f43908b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                String str = ((ty80) obj).f224877f.f271259d.f235600a;
                d0l0Var.f43908b = 1;
                return nizVar.emit(str, d0l0Var) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof j0l0) {
                    j0l0Var = (j0l0) fbkVar;
                    int i24 = j0l0Var.f107481b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        j0l0Var.f107481b = i24 - Integer.MIN_VALUE;
                    } else {
                        j0l0Var = new j0l0(this, fbkVar);
                    }
                } else {
                    j0l0Var = new j0l0(this, fbkVar);
                }
                Object obj13 = j0l0Var.f107480a;
                int i25 = j0l0Var.f107481b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                Boolean boolValueOf4 = Boolean.valueOf(((EsOffline$GetOfflinePlaybackStatusResponse) obj).m16159n());
                j0l0Var.f107481b = 1;
                return nizVar.emit(boolValueOf4, j0l0Var) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof t3l0) {
                    t3l0Var = (t3l0) fbkVar;
                    int i26 = t3l0Var.f216800b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        t3l0Var.f216800b = i26 - Integer.MIN_VALUE;
                    } else {
                        t3l0Var = new t3l0(this, fbkVar);
                    }
                } else {
                    t3l0Var = new t3l0(this, fbkVar);
                }
                Object obj14 = t3l0Var.f216799a;
                int i27 = t3l0Var.f216800b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                ae50<EsOffline$ContextProgress> ae50VarM16102o = ((EsOffline$ContextsProgressResponse) obj).m16102o();
                int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM16102o, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (EsOffline$ContextProgress esOffline$ContextProgress : ae50VarM16102o) {
                    String uri = esOffline$ContextProgress.getUri();
                    EsOffline$Progress esOffline$ProgressM16099n = esOffline$ContextProgress.m16099n();
                    linkedHashMap.put(uri, new s3l0((int) esOffline$ProgressM16099n.m16197B(), (int) esOffline$ProgressM16099n.m16204I()));
                }
                t3l0Var.f216800b = 1;
                return nizVar.emit(linkedHashMap, t3l0Var) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof d9l0) {
                    d9l0Var = (d9l0) fbkVar;
                    int i28 = d9l0Var.f46854b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        d9l0Var.f46854b = i28 - Integer.MIN_VALUE;
                    } else {
                        d9l0Var = new d9l0(this, fbkVar);
                    }
                } else {
                    d9l0Var = new d9l0(this, fbkVar);
                }
                Object obj15 = d9l0Var.f46853a;
                int i29 = d9l0Var.f46854b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                Boolean boolValueOf5 = Boolean.valueOf(wj50.m88271j((String) obj, "enhanced_trial_active"));
                d9l0Var.f46854b = 1;
                return nizVar.emit(boolValueOf5, d9l0Var) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof y9l0) {
                    y9l0Var = (y9l0) fbkVar;
                    int i30 = y9l0Var.f270618b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        y9l0Var.f270618b = i30 - Integer.MIN_VALUE;
                    } else {
                        y9l0Var = new y9l0(this, fbkVar);
                    }
                } else {
                    y9l0Var = new y9l0(this, fbkVar);
                }
                Object obj16 = y9l0Var.f270617a;
                int i31 = y9l0Var.f270618b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                y9l0Var.f270618b = 1;
                return nizVar.emit(obj, y9l0Var) == yukVar ? yukVar : w2a1Var;
            case 14:
                if (fbkVar instanceof gal0) {
                    gal0Var = (gal0) fbkVar;
                    int i32 = gal0Var.f78069b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        gal0Var.f78069b = i32 - Integer.MIN_VALUE;
                    } else {
                        gal0Var = new gal0(this, fbkVar);
                    }
                } else {
                    gal0Var = new gal0(this, fbkVar);
                }
                Object obj17 = gal0Var.f78068a;
                int i33 = gal0Var.f78069b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                Boolean boolValueOf6 = Boolean.valueOf(((c9l0) obj) == c9l0Var);
                gal0Var.f78069b = 1;
                return nizVar.emit(boolValueOf6, gal0Var) == yukVar ? yukVar : w2a1Var;
            case 15:
                if (fbkVar instanceof hal0) {
                    hal0Var = (hal0) fbkVar;
                    int i34 = hal0Var.f89239b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hal0Var.f89239b = i34 - Integer.MIN_VALUE;
                    } else {
                        hal0Var = new hal0(this, fbkVar);
                    }
                } else {
                    hal0Var = new hal0(this, fbkVar);
                }
                Object obj18 = hal0Var.f89238a;
                int i35 = hal0Var.f89239b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                String str2 = (String) obj;
                if (!wj50.m88271j(str2, "1")) {
                    c9l0Var = wj50.m88271j(str2, "0") ? c9l0.f35586c : c9l0.f35584a;
                }
                hal0Var.f89239b = 1;
                return nizVar.emit(c9l0Var, hal0Var) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof mjl0) {
                    mjl0Var = (mjl0) fbkVar;
                    int i36 = mjl0Var.f144289b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mjl0Var.f144289b = i36 - Integer.MIN_VALUE;
                    } else {
                        mjl0Var = new mjl0(this, fbkVar);
                    }
                } else {
                    mjl0Var = new mjl0(this, fbkVar);
                }
                Object obj19 = mjl0Var.f144288a;
                int i37 = mjl0Var.f144289b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                wil0 wil0Var = new wil0((List) obj);
                mjl0Var.f144289b = 1;
                return nizVar.emit(wil0Var, mjl0Var) == yukVar ? yukVar : w2a1Var;
            case 17:
                if (fbkVar instanceof jwl0) {
                    jwl0Var = (jwl0) fbkVar;
                    int i38 = jwl0Var.f116655b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        jwl0Var.f116655b = i38 - Integer.MIN_VALUE;
                    } else {
                        jwl0Var = new jwl0(this, fbkVar);
                    }
                } else {
                    jwl0Var = new jwl0(this, fbkVar);
                }
                Object obj20 = jwl0Var.f116654a;
                int i39 = jwl0Var.f116655b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                Boolean boolValueOf7 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                jwl0Var.f116655b = 1;
                return nizVar.emit(boolValueOf7, jwl0Var) == yukVar ? yukVar : w2a1Var;
            case 18:
                if (fbkVar instanceof axl0) {
                    axl0Var = (axl0) fbkVar;
                    int i40 = axl0Var.f20926b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        axl0Var.f20926b = i40 - Integer.MIN_VALUE;
                    } else {
                        axl0Var = new axl0(this, fbkVar);
                    }
                } else {
                    axl0Var = new axl0(this, fbkVar);
                }
                Object obj21 = axl0Var.f20925a;
                int i41 = axl0Var.f20926b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                qho qhoVar3 = (qho) obj;
                cksVar = qhoVar3 instanceof oho ? (String) ((oho) qhoVar3).f165512a : null;
                if (cksVar == null) {
                    return w2a1Var;
                }
                axl0Var.f20926b = 1;
                return nizVar.emit(cksVar, axl0Var) == yukVar ? yukVar : w2a1Var;
            case 19:
                if (fbkVar instanceof bxl0) {
                    bxl0Var = (bxl0) fbkVar;
                    int i42 = bxl0Var.f31920b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        bxl0Var.f31920b = i42 - Integer.MIN_VALUE;
                    } else {
                        bxl0Var = new bxl0(this, fbkVar);
                    }
                } else {
                    bxl0Var = new bxl0(this, fbkVar);
                }
                Object obj22 = bxl0Var.f31919a;
                int i43 = bxl0Var.f31920b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                qho qhoVar4 = (qho) obj;
                cksVar = qhoVar4 instanceof oho ? (String) ((oho) qhoVar4).f165512a : null;
                if (cksVar == null) {
                    return w2a1Var;
                }
                bxl0Var.f31920b = 1;
                return nizVar.emit(cksVar, bxl0Var) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof xam0) {
                    xam0Var = (xam0) fbkVar;
                    int i44 = xam0Var.f259722b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        xam0Var.f259722b = i44 - Integer.MIN_VALUE;
                    } else {
                        xam0Var = new xam0(this, fbkVar);
                    }
                } else {
                    xam0Var = new xam0(this, fbkVar);
                }
                Object obj23 = xam0Var.f259721a;
                int i45 = xam0Var.f259722b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                knm0 knm0VarM55913d = kaz.m55913d(((Boolean) obj).booleanValue());
                xam0Var.f259722b = 1;
                return nizVar.emit(knm0VarM55913d, xam0Var) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof kdm0) {
                    kdm0Var = (kdm0) fbkVar;
                    int i46 = kdm0Var.f121698b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        kdm0Var.f121698b = i46 - Integer.MIN_VALUE;
                    } else {
                        kdm0Var = new kdm0(this, fbkVar);
                    }
                } else {
                    kdm0Var = new kdm0(this, fbkVar);
                }
                Object obj24 = kdm0Var.f121697a;
                int i47 = kdm0Var.f121698b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                CollectionPlatformItem collectionPlatformItem = (CollectionPlatformItem) g6f.m43745s0(((CollectionPlatformEsperantoItemsResponse) obj).getItemsList());
                if (collectionPlatformItem != null) {
                    if (!collectionPlatformItem.m6883r()) {
                        collectionPlatformItem = null;
                    }
                    if (collectionPlatformItem != null && (collectionItemdata$ItemDataM6882q = collectionPlatformItem.m6882q()) != null) {
                        if (!collectionItemdata$ItemDataM6882q.m6826u()) {
                            collectionItemdata$ItemDataM6882q = null;
                        }
                        if (collectionItemdata$ItemDataM6882q != null && (collectionItemdata$PageMatchItemDataM6824s = collectionItemdata$ItemDataM6882q.m6824s()) != null && (durationM6830p = collectionItemdata$PageMatchItemDataM6824s.m6830p()) != null) {
                            long jM1932r = durationM6830p.m1932r();
                            hvi0 hvi0Var = cks.f39079b;
                            cksVar = new cks(jwg1.m54450E(jM1932r, ils.SECONDS));
                        }
                    }
                }
                kdm0Var.f121698b = 1;
                return nizVar.emit(cksVar, kdm0Var) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof odm0) {
                    odm0Var = (odm0) fbkVar;
                    int i48 = odm0Var.f164221b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        odm0Var.f164221b = i48 - Integer.MIN_VALUE;
                    } else {
                        odm0Var = new odm0(this, fbkVar);
                    }
                } else {
                    odm0Var = new odm0(this, fbkVar);
                }
                Object obj25 = odm0Var.f164220a;
                int i49 = odm0Var.f164221b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                Boolean boolValueOf8 = Boolean.valueOf(wj50.m88271j(((gv31) obj).f84602a, Boolean.TRUE));
                odm0Var.f164221b = 1;
                return nizVar.emit(boolValueOf8, odm0Var) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof qdm0) {
                    qdm0Var = (qdm0) fbkVar;
                    int i50 = qdm0Var.f187722b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        qdm0Var.f187722b = i50 - Integer.MIN_VALUE;
                    } else {
                        qdm0Var = new qdm0(this, fbkVar);
                    }
                } else {
                    qdm0Var = new qdm0(this, fbkVar);
                }
                Object obj26 = qdm0Var.f187721a;
                int i51 = qdm0Var.f187722b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                Integer num = (Integer) ((gv31) obj).f84602a;
                Integer num2 = new Integer(num != null ? num.intValue() : -1);
                qdm0Var.f187722b = 1;
                return nizVar.emit(num2, qdm0Var) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof rdm0) {
                    rdm0Var = (rdm0) fbkVar;
                    int i52 = rdm0Var.f198169b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        rdm0Var.f198169b = i52 - Integer.MIN_VALUE;
                    } else {
                        rdm0Var = new rdm0(this, fbkVar);
                    }
                } else {
                    rdm0Var = new rdm0(this, fbkVar);
                }
                Object obj27 = rdm0Var.f198168a;
                int i53 = rdm0Var.f198169b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Long l = (Long) ((gv31) obj).f84602a;
                Long l2 = new Long(l != null ? l.longValue() : -1L);
                rdm0Var.f198169b = 1;
                return nizVar.emit(l2, rdm0Var) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof sdm0) {
                    sdm0Var = (sdm0) fbkVar;
                    int i54 = sdm0Var.f208042b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        sdm0Var.f208042b = i54 - Integer.MIN_VALUE;
                    } else {
                        sdm0Var = new sdm0(this, fbkVar);
                    }
                } else {
                    sdm0Var = new sdm0(this, fbkVar);
                }
                Object obj28 = sdm0Var.f208041a;
                int i55 = sdm0Var.f208042b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                Boolean boolValueOf9 = Boolean.valueOf(wj50.m88271j(((gv31) obj).f84602a, Boolean.TRUE));
                sdm0Var.f208042b = 1;
                return nizVar.emit(boolValueOf9, sdm0Var) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof tdm0) {
                    tdm0Var = (tdm0) fbkVar;
                    int i56 = tdm0Var.f219403b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        tdm0Var.f219403b = i56 - Integer.MIN_VALUE;
                    } else {
                        tdm0Var = new tdm0(this, fbkVar);
                    }
                } else {
                    tdm0Var = new tdm0(this, fbkVar);
                }
                Object obj29 = tdm0Var.f219402a;
                int i57 = tdm0Var.f219403b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Boolean boolValueOf10 = Boolean.valueOf(wj50.m88271j(((gv31) obj).f84602a, Boolean.TRUE));
                tdm0Var.f219403b = 1;
                return nizVar.emit(boolValueOf10, tdm0Var) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof udm0) {
                    udm0Var = (udm0) fbkVar;
                    int i58 = udm0Var.f229271b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        udm0Var.f229271b = i58 - Integer.MIN_VALUE;
                    } else {
                        udm0Var = new udm0(this, fbkVar);
                    }
                } else {
                    udm0Var = new udm0(this, fbkVar);
                }
                Object obj30 = udm0Var.f229270a;
                int i59 = udm0Var.f229271b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                Boolean boolValueOf11 = Boolean.valueOf(wj50.m88271j(((gv31) obj).f84602a, Boolean.TRUE));
                udm0Var.f229271b = 1;
                return nizVar.emit(boolValueOf11, udm0Var) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof eem0) {
                    eem0Var = (eem0) fbkVar;
                    int i60 = eem0Var.f58818b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        eem0Var.f58818b = i60 - Integer.MIN_VALUE;
                    } else {
                        eem0Var = new eem0(this, fbkVar);
                    }
                } else {
                    eem0Var = new eem0(this, fbkVar);
                }
                Object obj31 = eem0Var.f58817a;
                int i61 = eem0Var.f58818b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                ybv ybvVar = ((ty80) obj).f224877f;
                cem0 cem0Var = new cem0(ybvVar.f271256a, ybvVar.f271257b, ybvVar.f271259d.m84311c(2));
                eem0Var.f58818b = 1;
                return nizVar.emit(cem0Var, eem0Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof rem0) {
                    rem0Var = (rem0) fbkVar;
                    int i62 = rem0Var.f198387b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        rem0Var.f198387b = i62 - Integer.MIN_VALUE;
                    } else {
                        rem0Var = new rem0(this, fbkVar);
                    }
                } else {
                    rem0Var = new rem0(this, fbkVar);
                }
                Object obj32 = rem0Var.f198386a;
                int i63 = rem0Var.f198387b;
                if (i63 != 0) {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                Boolean boolValueOf12 = Boolean.valueOf(((Number) obj).intValue() > 0);
                rem0Var.f198387b = 1;
                return nizVar.emit(boolValueOf12, rem0Var) == yukVar ? yukVar : w2a1Var;
        }
    }
}
