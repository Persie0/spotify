package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ksq implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f125996b;

    public ksq(niz nizVar) {
        this.f125995a = 26;
        kf60 kf60Var = kf60.f122067d;
        this.f125996b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0246  */
    /* JADX WARN: Code duplicated, block: B:180:0x028b  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:223:0x032e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0370  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:275:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:291:0x042e  */
    /* JADX WARN: Code duplicated, block: B:307:0x046a  */
    /* JADX WARN: Code duplicated, block: B:323:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:339:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:355:0x0529  */
    /* JADX WARN: Code duplicated, block: B:387:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:403:0x060e  */
    /* JADX WARN: Code duplicated, block: B:437:0x0679  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:453:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:472:0x073b  */
    /* JADX WARN: Code duplicated, block: B:473:0x0741  */
    /* JADX WARN: Code duplicated, block: B:485:0x0767  */
    /* JADX WARN: Code duplicated, block: B:509:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:514:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:521:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:541:0x085d  */
    /* JADX WARN: Code duplicated, block: B:559:0x089b  */
    /* JADX WARN: Code duplicated, block: B:578:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:594:0x091f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:612:0x0961  */
    /* JADX WARN: Code duplicated, block: B:636:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x07c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[LOOP:5: B:507:0x07b4->B:648:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0168  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jsq jsqVar;
        i5r i5rVar;
        j5r j5rVar;
        t5r t5rVar;
        h8r h8rVar;
        y9r y9rVar;
        par parVar;
        api apiVar;
        Iterator it;
        Boolean boolValueOf;
        rar rarVar;
        Object next;
        uud1 uud1Var;
        gj9 gj9Var;
        String str;
        Locale locale;
        tar tarVar;
        xdr xdrVar;
        zdr zdrVar;
        aer aerVar;
        ber berVar;
        cer cerVar;
        der derVar;
        eer eerVar;
        skr skrVar;
        ylr ylrVar;
        pyr pyrVar;
        vyr vyrVar;
        wyr wyrVar;
        ContextTrack contextTrack;
        xyr xyrVar;
        fzr fzrVar;
        hzr hzrVar;
        Object obj2;
        ozr ozrVar;
        pzr pzrVar;
        rzr rzrVar;
        d0s d0sVar;
        v0s v0sVar;
        y0s y0sVar;
        int i = this.f125995a;
        Object rdrVar = null;
        boolean z = false;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f125996b;
        yuk yukVar = yuk.f276404a;
        int i2 = 1;
        switch (i) {
            case 0:
                if (fbkVar instanceof jsq) {
                    jsqVar = (jsq) fbkVar;
                    int i3 = jsqVar.f115537b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jsqVar.f115537b = i3 - Integer.MIN_VALUE;
                    } else {
                        jsqVar = new jsq(this, fbkVar);
                    }
                } else {
                    jsqVar = new jsq(this, fbkVar);
                }
                Object obj3 = jsqVar.f115536a;
                int i4 = jsqVar.f115537b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                nm20 nm20Var = ((eyp0) obj).f64149b;
                jsqVar.f115537b = 1;
                return nizVar.emit(nm20Var, jsqVar) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof i5r) {
                    i5rVar = (i5r) fbkVar;
                    int i5 = i5rVar.f99011b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        i5rVar.f99011b = i5 - Integer.MIN_VALUE;
                    } else {
                        i5rVar = new i5r(this, fbkVar);
                    }
                } else {
                    i5rVar = new i5r(this, fbkVar);
                }
                Object obj4 = i5rVar.f99010a;
                int i6 = i5rVar.f99011b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                if (!((PlayerState) obj).track().mo49279c()) {
                    return w2a1Var;
                }
                i5rVar.f99011b = 1;
                return nizVar.emit(obj, i5rVar) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof j5r) {
                    j5rVar = (j5r) fbkVar;
                    int i7 = j5rVar.f109071b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        j5rVar.f109071b = i7 - Integer.MIN_VALUE;
                    } else {
                        j5rVar = new j5r(this, fbkVar);
                    }
                } else {
                    j5rVar = new j5r(this, fbkVar);
                }
                Object obj5 = j5rVar.f109070a;
                int i8 = j5rVar.f109071b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                Object objMo49278b = ((PlayerState) obj).track().mo49278b();
                j5rVar.f109071b = 1;
                return nizVar.emit(objMo49278b, j5rVar) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof t5r) {
                    t5rVar = (t5r) fbkVar;
                    int i9 = t5rVar.f217338b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        t5rVar.f217338b = i9 - Integer.MIN_VALUE;
                    } else {
                        t5rVar = new t5r(this, fbkVar);
                    }
                } else {
                    t5rVar = new t5r(this, fbkVar);
                }
                Object obj6 = t5rVar.f217337a;
                int i10 = t5rVar.f217338b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                Boolean bool = (Boolean) ((gv31) obj).f84602a;
                Boolean boolValueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                t5rVar.f217338b = 1;
                return nizVar.emit(boolValueOf2, t5rVar) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof h8r) {
                    h8rVar = (h8r) fbkVar;
                    int i11 = h8rVar.f88776b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        h8rVar.f88776b = i11 - Integer.MIN_VALUE;
                    } else {
                        h8rVar = new h8r(this, fbkVar);
                    }
                } else {
                    h8rVar = new h8r(this, fbkVar);
                }
                Object obj7 = h8rVar.f88775a;
                int i12 = h8rVar.f88776b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                h8rVar.f88776b = 1;
                return nizVar.emit(obj, h8rVar) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof y9r) {
                    y9rVar = (y9r) fbkVar;
                    int i13 = y9rVar.f270634b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        y9rVar.f270634b = i13 - Integer.MIN_VALUE;
                    } else {
                        y9rVar = new y9r(this, fbkVar);
                    }
                } else {
                    y9rVar = new y9r(this, fbkVar);
                }
                Object obj8 = y9rVar.f270633a;
                int i14 = y9rVar.f270634b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    yc8 yc8Var = ((qi9) entry.getValue()).f188963a;
                    arrayList.add(new w9r(str2, yc8Var.f271426c, yc8Var.f271425b.f79568b, yc8Var.f271427d));
                }
                Set setM43736n1 = g6f.m43736n1(arrayList);
                y9rVar.f270634b = 1;
                return nizVar.emit(setM43736n1, y9rVar) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof par) {
                    parVar = (par) fbkVar;
                    int i15 = parVar.f175601b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        parVar.f175601b = i15 - Integer.MIN_VALUE;
                    } else {
                        parVar = new par(this, fbkVar);
                    }
                } else {
                    parVar = new par(this, fbkVar);
                }
                Object obj9 = parVar.f175600a;
                int i16 = parVar.f175601b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                List list = (List) obj;
                wj50.m88279p(list);
                for (Object obj10 : list) {
                    if (((api) obj10).mo26697m()) {
                        rdrVar = obj10;
                        apiVar = (api) rdrVar;
                        if ((apiVar != null || !apiVar.isActive()) && !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((api) it.next()).isActive()) {
                                    z = true;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z);
                        parVar.f175601b = 1;
                        if (nizVar.emit(boolValueOf, parVar) == yukVar) {
                            return yukVar;
                        }
                        return w2a1Var;
                    }
                }
                apiVar = (api) rdrVar;
                if (apiVar != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((api) it.next()).isActive()) {
                            z = true;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((api) it.next()).isActive()) {
                            z = true;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
                parVar.f175601b = 1;
                if (nizVar.emit(boolValueOf, parVar) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
            case 7:
                if (fbkVar instanceof rar) {
                    rarVar = (rar) fbkVar;
                    int i17 = rarVar.f197373b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        rarVar.f197373b = i17 - Integer.MIN_VALUE;
                    } else {
                        rarVar = new rar(this, fbkVar);
                    }
                } else {
                    rarVar = new rar(this, fbkVar);
                }
                Object obj11 = rarVar.f197372a;
                int i18 = rarVar.f197373b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                pqm0 pqm0Var = (pqm0) obj;
                Set<w9r> set = (Set) pqm0Var.f180350a;
                List list2 = (List) pqm0Var.f180351b;
                ArrayList arrayList2 = new ArrayList();
                for (w9r w9rVar : set) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            str = w9rVar.f249247a;
                            locale = Locale.ROOT;
                        } else {
                            next = null;
                        }
                        uud1Var = (uud1) next;
                        if (uud1Var != null) {
                            gj9Var = new gj9(w9rVar, uud1Var);
                        } else {
                            gj9Var = null;
                        }
                        if (gj9Var != null) {
                            arrayList2.add(gj9Var);
                        }
                    } while (!str.toLowerCase(locale).equals(((uud1) next).f234163a.toLowerCase(locale)));
                    uud1Var = (uud1) next;
                    if (uud1Var != null) {
                        gj9Var = new gj9(w9rVar, uud1Var);
                    } else {
                        gj9Var = null;
                    }
                    if (gj9Var != null) {
                        arrayList2.add(gj9Var);
                    }
                }
                Set setM43736n2 = g6f.m43736n1(arrayList2);
                rarVar.f197373b = 1;
                return nizVar.emit(setM43736n2, rarVar) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof tar) {
                    tarVar = (tar) fbkVar;
                    int i19 = tarVar.f218656b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        tarVar.f218656b = i19 - Integer.MIN_VALUE;
                    } else {
                        tarVar = new tar(this, fbkVar);
                    }
                } else {
                    tarVar = new tar(this, fbkVar);
                }
                Object obj12 = tarVar.f218655a;
                int i20 = tarVar.f218656b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                List listM30496T = btz0.m30496T(new j691(r2r.f195183L0, btz0.m30480D(r2r.f195199Z, btz0.m30480D(r2r.f195197Y, btz0.m30480D(r2r.f195195X, new ek5(((cwi) obj).f42762c, i2))))));
                tarVar.f218656b = 1;
                return nizVar.emit(listM30496T, tarVar) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof xdr) {
                    xdrVar = (xdr) fbkVar;
                    int i21 = xdrVar.f260525b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        xdrVar.f260525b = i21 - Integer.MIN_VALUE;
                    } else {
                        xdrVar = new xdr(this, fbkVar);
                    }
                } else {
                    xdrVar = new xdr(this, fbkVar);
                }
                Object obj13 = xdrVar.f260524a;
                int i22 = xdrVar.f260525b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                y5p y5pVar = (y5p) ((xul0) obj).mo49283h();
                if (y5pVar != null) {
                    int iOrdinal = y5pVar.f269498B.f239170a.f54889d.ordinal();
                    if (iOrdinal == 0) {
                        rdrVar = new rdr(false);
                    } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        rdrVar = new rdr(true);
                    } else if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (rdrVar == null) {
                    return w2a1Var;
                }
                xdrVar.f260525b = 1;
                return nizVar.emit(rdrVar, xdrVar) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof zdr) {
                    zdrVar = (zdr) fbkVar;
                    int i23 = zdrVar.f281783b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        zdrVar.f281783b = i23 - Integer.MIN_VALUE;
                    } else {
                        zdrVar = new zdr(this, fbkVar);
                    }
                } else {
                    zdrVar = new zdr(this, fbkVar);
                }
                Object obj14 = zdrVar.f281782a;
                int i24 = zdrVar.f281783b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                sdr sdrVar = new sdr((Set) obj);
                zdrVar.f281783b = 1;
                return nizVar.emit(sdrVar, zdrVar) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof aer) {
                    aerVar = (aer) fbkVar;
                    int i25 = aerVar.f14942b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        aerVar.f14942b = i25 - Integer.MIN_VALUE;
                    } else {
                        aerVar = new aer(this, fbkVar);
                    }
                } else {
                    aerVar = new aer(this, fbkVar);
                }
                Object obj15 = aerVar.f14941a;
                int i26 = aerVar.f14942b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                List list3 = (List) obj;
                wj50.m88279p(list3);
                ArrayList<api> arrayList3 = new ArrayList();
                for (Object obj16 : list3) {
                    api apiVar2 = (api) obj16;
                    if (!apiVar2.mo26697m() && !apiVar2.mo26700p() && apiVar2.mo26699o() && !wl51.m88460J0(apiVar2.mo26689e())) {
                        arrayList3.add(obj16);
                    }
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                for (api apiVar3 : arrayList3) {
                    arrayList4.add(new s78(apiVar3.mo26689e(), apiVar3.getName(), apiVar3.getType(), apiVar3.mo26691g()));
                }
                Set setM43736n3 = g6f.m43736n1(arrayList4);
                aerVar.f14942b = 1;
                return nizVar.emit(setM43736n3, aerVar) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof ber) {
                    berVar = (ber) fbkVar;
                    int i27 = berVar.f26421b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        berVar.f26421b = i27 - Integer.MIN_VALUE;
                    } else {
                        berVar = new ber(this, fbkVar);
                    }
                } else {
                    berVar = new ber(this, fbkVar);
                }
                Object obj17 = berVar.f26420a;
                int i28 = berVar.f26421b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                tdr tdrVar = new tdr((Set) obj);
                berVar.f26421b = 1;
                return nizVar.emit(tdrVar, berVar) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof cer) {
                    cerVar = (cer) fbkVar;
                    int i29 = cerVar.f37169b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        cerVar.f37169b = i29 - Integer.MIN_VALUE;
                    } else {
                        cerVar = new cer(this, fbkVar);
                    }
                } else {
                    cerVar = new cer(this, fbkVar);
                }
                Object obj18 = cerVar.f37168a;
                int i30 = cerVar.f37169b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Boolean bool2 = (Boolean) obj;
                wj50.m88279p(bool2);
                udr udrVar = new udr(bool2.booleanValue());
                cerVar.f37169b = 1;
                return nizVar.emit(udrVar, cerVar) == yukVar ? yukVar : w2a1Var;
            case 14:
                if (fbkVar instanceof der) {
                    derVar = (der) fbkVar;
                    int i31 = derVar.f48160b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        derVar.f48160b = i31 - Integer.MIN_VALUE;
                    } else {
                        derVar = new der(this, fbkVar);
                    }
                } else {
                    derVar = new der(this, fbkVar);
                }
                Object obj19 = derVar.f48159a;
                int i32 = derVar.f48160b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                b8g0 b8g0Var = (b8g0) obj;
                qdr qdrVar = new qdr(b8g0Var.f24585a, b8g0Var.f24586b);
                derVar.f48160b = 1;
                return nizVar.emit(qdrVar, derVar) == yukVar ? yukVar : w2a1Var;
            case 15:
                if (fbkVar instanceof eer) {
                    eerVar = (eer) fbkVar;
                    int i33 = eerVar.f58841b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eerVar.f58841b = i33 - Integer.MIN_VALUE;
                    } else {
                        eerVar = new eer(this, fbkVar);
                    }
                } else {
                    eerVar = new eer(this, fbkVar);
                }
                Object obj20 = eerVar.f58840a;
                int i34 = eerVar.f58841b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                vdr vdrVar = new vdr((w3p0) obj);
                eerVar.f58841b = 1;
                return nizVar.emit(vdrVar, eerVar) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof skr) {
                    skrVar = (skr) fbkVar;
                    int i35 = skrVar.f210184b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        skrVar.f210184b = i35 - Integer.MIN_VALUE;
                    } else {
                        skrVar = new skr(this, fbkVar);
                    }
                } else {
                    skrVar = new skr(this, fbkVar);
                }
                Object obj21 = skrVar.f210183a;
                int i36 = skrVar.f210184b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                Boolean boolValueOf3 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                skrVar.f210184b = 1;
                return nizVar.emit(boolValueOf3, skrVar) == yukVar ? yukVar : w2a1Var;
            case 17:
                if (fbkVar instanceof ylr) {
                    ylrVar = (ylr) fbkVar;
                    int i37 = ylrVar.f274078b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ylrVar.f274078b = i37 - Integer.MIN_VALUE;
                    } else {
                        ylrVar = new ylr(this, fbkVar);
                    }
                } else {
                    ylrVar = new ylr(this, fbkVar);
                }
                Object obj22 = ylrVar.f274077a;
                int i38 = ylrVar.f274078b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                if (!((e301) obj).f55572b) {
                    return w2a1Var;
                }
                ylrVar.f274078b = 1;
                return nizVar.emit(obj, ylrVar) == yukVar ? yukVar : w2a1Var;
            case 18:
                if (fbkVar instanceof pyr) {
                    pyrVar = (pyr) fbkVar;
                    int i39 = pyrVar.f183459b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        pyrVar.f183459b = i39 - Integer.MIN_VALUE;
                    } else {
                        pyrVar = new pyr(this, fbkVar);
                    }
                } else {
                    pyrVar = new pyr(this, fbkVar);
                }
                Object obj23 = pyrVar.f183458a;
                int i40 = pyrVar.f183459b;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                PlayerState playerState = (PlayerState) obj;
                wj50.m88279p(playerState);
                Boolean boolValueOf4 = Boolean.valueOf(hdi.m47214F(playerState));
                pyrVar.f183459b = 1;
                return nizVar.emit(boolValueOf4, pyrVar) == yukVar ? yukVar : w2a1Var;
            case 19:
                if (fbkVar instanceof vyr) {
                    vyrVar = (vyr) fbkVar;
                    int i41 = vyrVar.f246310b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        vyrVar.f246310b = i41 - Integer.MIN_VALUE;
                    } else {
                        vyrVar = new vyr(this, fbkVar);
                    }
                } else {
                    vyrVar = new vyr(this, fbkVar);
                }
                Object obj24 = vyrVar.f246309a;
                int i42 = vyrVar.f246310b;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                if (!((PlayerState) obj).track().mo49279c()) {
                    return w2a1Var;
                }
                vyrVar.f246310b = 1;
                return nizVar.emit(obj, vyrVar) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof wyr) {
                    wyrVar = (wyr) fbkVar;
                    int i43 = wyrVar.f256340b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        wyrVar.f256340b = i43 - Integer.MIN_VALUE;
                    } else {
                        wyrVar = new wyr(this, fbkVar);
                    }
                } else {
                    wyrVar = new wyr(this, fbkVar);
                }
                Object obj25 = wyrVar.f256339a;
                int i44 = wyrVar.f256340b;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                PlayerState playerState2 = (PlayerState) obj;
                wj50.m88279p(playerState2);
                Object obj26 = (hdi.m47223O(playerState2) && (contextTrack = (ContextTrack) playerState2.track().mo49283h()) != null && bm51.m29803n0(contextTrack.uri(), "spotify:media:", false)) ? hdi.m47221M(playerState2) ? tyr.f225022a : syr.f215325a : ryr.f203952a;
                wyrVar.f256340b = 1;
                return nizVar.emit(obj26, wyrVar) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof xyr) {
                    xyrVar = (xyr) fbkVar;
                    int i45 = xyrVar.f267407b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        xyrVar.f267407b = i45 - Integer.MIN_VALUE;
                    } else {
                        xyrVar = new xyr(this, fbkVar);
                    }
                } else {
                    xyrVar = new xyr(this, fbkVar);
                }
                Object obj27 = xyrVar.f267406a;
                int i46 = xyrVar.f267407b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Boolean boolValueOf5 = Boolean.valueOf(((uyr) obj) instanceof tyr);
                xyrVar.f267407b = 1;
                return nizVar.emit(boolValueOf5, xyrVar) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof fzr) {
                    fzrVar = (fzr) fbkVar;
                    int i47 = fzrVar.f75151b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        fzrVar.f75151b = i47 - Integer.MIN_VALUE;
                    } else {
                        fzrVar = new fzr(this, fbkVar);
                    }
                } else {
                    fzrVar = new fzr(this, fbkVar);
                }
                Object obj28 = fzrVar.f75150a;
                int i48 = fzrVar.f75151b;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                ehy0 ehy0Var = (ehy0) obj;
                rdrVar = ehy0Var instanceof chy0 ? ((ix70) ((chy0) ehy0Var).f38149a).mo48976j() : null;
                fzrVar.f75151b = 1;
                return nizVar.emit(rdrVar, fzrVar) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof hzr) {
                    hzrVar = (hzr) fbkVar;
                    int i49 = hzrVar.f96999b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        hzrVar.f96999b = i49 - Integer.MIN_VALUE;
                    } else {
                        hzrVar = new hzr(this, fbkVar);
                    }
                } else {
                    hzrVar = new hzr(this, fbkVar);
                }
                Object obj29 = hzrVar.f96998a;
                int i50 = hzrVar.f96999b;
                if (i50 != 0) {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                wb50 wb50Var = (wb50) obj;
                if (wb50Var instanceof rb50) {
                    obj2 = gf60.f79286a;
                } else if ((wb50Var instanceof sb50) || (wb50Var instanceof qb50) || (wb50Var instanceof tb50)) {
                    obj2 = hf60.f90606a;
                } else {
                    if (!(wb50Var instanceof ub50) && !(wb50Var instanceof vb50)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = if60.f101690a;
                }
                hzrVar.f96999b = 1;
                return nizVar.emit(obj2, hzrVar) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof ozr) {
                    ozrVar = (ozr) fbkVar;
                    int i51 = ozrVar.f172348b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        ozrVar.f172348b = i51 - Integer.MIN_VALUE;
                    } else {
                        ozrVar = new ozr(this, fbkVar);
                    }
                } else {
                    ozrVar = new ozr(this, fbkVar);
                }
                Object obj30 = ozrVar.f172347a;
                int i52 = ozrVar.f172348b;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                m950 m950Var = (m950) obj;
                rdrVar = m950Var instanceof l950 ? (l950) m950Var : null;
                ozrVar.f172348b = 1;
                return nizVar.emit(rdrVar, ozrVar) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof pzr) {
                    pzrVar = (pzr) fbkVar;
                    int i53 = pzrVar.f183789b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        pzrVar.f183789b = i53 - Integer.MIN_VALUE;
                    } else {
                        pzrVar = new pzr(this, fbkVar);
                    }
                } else {
                    pzrVar = new pzr(this, fbkVar);
                }
                Object obj31 = pzrVar.f183788a;
                int i54 = pzrVar.f183789b;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                Float f = new Float((float) ((Double) obj).doubleValue());
                pzrVar.f183789b = 1;
                return nizVar.emit(f, pzrVar) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof rzr) {
                    rzrVar = (rzr) fbkVar;
                    int i55 = rzrVar.f204206b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        rzrVar.f204206b = i55 - Integer.MIN_VALUE;
                    } else {
                        rzrVar = new rzr(this, fbkVar);
                    }
                } else {
                    rzrVar = new rzr(this, fbkVar);
                }
                Object obj32 = rzrVar.f204205a;
                int i56 = rzrVar.f204206b;
                if (i56 != 0) {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                d1s d1sVar = (d1s) obj;
                kf60 kf60Var = kf60.f122067d;
                Integer num = d1sVar.f44343c;
                long jM75432b = num != null ? rfg1.m75432b(num.intValue()) : kf60.f122067d.f122068a;
                Integer num2 = d1sVar.f44344d;
                long jM75432b2 = num2 != null ? rfg1.m75432b(num2.intValue()) : kf60.f122067d.f122069b;
                Integer num3 = d1sVar.f44345e;
                kf60 kf60Var2 = new kf60(jM75432b, jM75432b2, num3 != null ? rfg1.m75432b(num3.intValue()) : kf60.f122067d.f122070c);
                rzrVar.f204206b = 1;
                return nizVar.emit(kf60Var2, rzrVar) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof d0s) {
                    d0sVar = (d0s) fbkVar;
                    int i57 = d0sVar.f44031b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        d0sVar.f44031b = i57 - Integer.MIN_VALUE;
                    } else {
                        d0sVar = new d0s(this, fbkVar);
                    }
                } else {
                    d0sVar = new d0s(this, fbkVar);
                }
                Object obj33 = d0sVar.f44030a;
                int i58 = d0sVar.f44031b;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return w2a1Var;
                }
                bga.m29073P(obj33);
                PlayerState playerState3 = (PlayerState) obj;
                wj50.m88279p(playerState3);
                Boolean boolValueOf6 = Boolean.valueOf(hdi.m47223O(playerState3));
                d0sVar.f44031b = 1;
                return nizVar.emit(boolValueOf6, d0sVar) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof v0s) {
                    v0sVar = (v0s) fbkVar;
                    int i59 = v0sVar.f236115b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        v0sVar.f236115b = i59 - Integer.MIN_VALUE;
                    } else {
                        v0sVar = new v0s(this, fbkVar);
                    }
                } else {
                    v0sVar = new v0s(this, fbkVar);
                }
                Object obj34 = v0sVar.f236114a;
                int i60 = v0sVar.f236115b;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return w2a1Var;
                }
                bga.m29073P(obj34);
                p5v p5vVar = new p5v(h6v.m46749a(((PlayerState) obj).contextUri()) != null);
                v0sVar.f236115b = 1;
                return nizVar.emit(p5vVar, v0sVar) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof y0s) {
                    y0sVar = (y0s) fbkVar;
                    int i61 = y0sVar.f268049b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        y0sVar.f268049b = i61 - Integer.MIN_VALUE;
                    } else {
                        y0sVar = new y0s(this, fbkVar);
                    }
                } else {
                    y0sVar = new y0s(this, fbkVar);
                }
                Object obj35 = y0sVar.f268048a;
                int i62 = y0sVar.f268049b;
                if (i62 != 0) {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                PlayerState playerState4 = (PlayerState) obj;
                wj50.m88279p(playerState4);
                ContextTrack contextTrackM93279p = ybg1.m93279p(playerState4);
                y0sVar.f268049b = 1;
                return nizVar.emit(contextTrackM93279p, y0sVar) == yukVar ? yukVar : w2a1Var;
        }
    }

    public /* synthetic */ ksq(niz nizVar, int i) {
        this.f125995a = i;
        this.f125996b = nizVar;
    }

    public /* synthetic */ ksq(niz nizVar, Object obj, int i) {
        this.f125995a = i;
        this.f125996b = nizVar;
    }
}
