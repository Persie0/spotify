package p204p;

import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Size;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class jcu0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f111194b;

    public /* synthetic */ jcu0(niz nizVar, int i) {
        this.f111193a = i;
        this.f111194b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0290  */
    /* JADX WARN: Code duplicated, block: B:191:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:212:0x0318  */
    /* JADX WARN: Code duplicated, block: B:228:0x0351  */
    /* JADX WARN: Code duplicated, block: B:248:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:264:0x0401  */
    /* JADX WARN: Code duplicated, block: B:296:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:312:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:346:0x0580  */
    /* JADX WARN: Code duplicated, block: B:362:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:378:0x0602  */
    /* JADX WARN: Code duplicated, block: B:396:0x063e  */
    /* JADX WARN: Code duplicated, block: B:414:0x067c  */
    /* JADX WARN: Code duplicated, block: B:432:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:452:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:468:0x0734  */
    /* JADX WARN: Code duplicated, block: B:488:0x0792  */
    /* JADX WARN: Code duplicated, block: B:504:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:522:0x0807  */
    /* JADX WARN: Code duplicated, block: B:549:0x0866  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:593:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:617:0x0943  */
    /* JADX WARN: Code duplicated, block: B:78:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v124, types: [java.lang.Object, java.util.List] */
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
        icu0 icu0Var;
        kcu0 kcu0Var;
        idu0 idu0Var;
        jdu0 jdu0Var;
        vdu0 vdu0Var;
        wdu0 wdu0Var;
        eiu0 eiu0Var;
        wmu0 wmu0Var;
        xmu0 xmu0Var;
        snu0 snu0Var;
        tnu0 tnu0Var;
        unu0 unu0Var;
        vnu0 vnu0Var;
        wnu0 wnu0Var;
        xnu0 xnu0Var;
        Iterable iterable;
        ynu0 ynu0Var;
        dvu0 dvu0Var;
        tjr njrVar;
        kzu0 kzu0Var;
        pzu0 pzu0Var;
        e5v0 e5v0Var;
        i5v0 i5v0Var;
        ContextTrack contextTrack;
        b8v0 b8v0Var;
        y8v0 y8v0Var;
        m9v0 m9v0Var;
        ukv0 ukv0Var;
        vkv0 vkv0Var;
        ykv0 ykv0Var;
        glv0 glv0Var;
        cmv0 cmv0Var;
        juv0 juv0Var;
        int i = this.f111193a;
        pho phoVar = pho.f177693a;
        boolean z = false;
        boolean z2 = false;
        i = 0;
        int i2 = 0;
        z = false;
        z = false;
        Object num = null;
        fmv0Var = null;
        fmv0Var = null;
        Object fmv0Var = null;
        objUri = null;
        Object objUri = null;
        ci21Var = null;
        Object ci21Var = null;
        Object objValueOf = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f111194b;
        Object obj2 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof icu0) {
                    icu0Var = (icu0) fbkVar;
                    int i3 = icu0Var.f100891b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        icu0Var.f100891b = i3 - Integer.MIN_VALUE;
                    } else {
                        icu0Var = new icu0(this, fbkVar);
                    }
                } else {
                    icu0Var = new icu0(this, fbkVar);
                }
                Object obj3 = icu0Var.f100890a;
                int i4 = icu0Var.f100891b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                Object objValueOf2 = Boolean.valueOf(((acu0) obj) instanceof zbu0);
                icu0Var.f100891b = 1;
                return nizVar.emit(objValueOf2, icu0Var) == obj2 ? obj2 : w2a1Var;
            case 1:
                if (fbkVar instanceof kcu0) {
                    kcu0Var = (kcu0) fbkVar;
                    int i5 = kcu0Var.f121553b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kcu0Var.f121553b = i5 - Integer.MIN_VALUE;
                    } else {
                        kcu0Var = new kcu0(this, fbkVar);
                    }
                } else {
                    kcu0Var = new kcu0(this, fbkVar);
                }
                Object obj4 = kcu0Var.f121552a;
                int i6 = kcu0Var.f121553b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                acu0 acu0Var = (acu0) obj;
                if (acu0Var instanceof ybu0) {
                    nqj0 nqj0Var = ((ybu0) acu0Var).f271248a;
                    if ((nqj0Var instanceof mqj0) && ((mqj0) nqj0Var).f146303b) {
                        z = true;
                    }
                }
                Object objValueOf3 = Boolean.valueOf(z);
                kcu0Var.f121553b = 1;
                return nizVar.emit(objValueOf3, kcu0Var) == obj2 ? obj2 : w2a1Var;
            case 2:
                if (fbkVar instanceof idu0) {
                    idu0Var = (idu0) fbkVar;
                    int i7 = idu0Var.f101246b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        idu0Var.f101246b = i7 - Integer.MIN_VALUE;
                    } else {
                        idu0Var = new idu0(this, fbkVar);
                    }
                } else {
                    idu0Var = new idu0(this, fbkVar);
                }
                Object obj5 = idu0Var.f101245a;
                int i8 = idu0Var.f101246b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                qho qhoVar = (qho) obj;
                if (qhoVar instanceof nho) {
                    num = new Integer(-1);
                } else if (qhoVar instanceof oho) {
                    List list = ((ey80) ((oho) qhoVar).f165512a).f63989b;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            lnn0 lnn0Var = ((i8e0) it.next()).f99769f;
                            if (lnn0Var == lnn0.f135187f || lnn0Var == lnn0.f135182a) {
                                i2++;
                                if (i2 < 0) {
                                    h6f.m46721R();
                                    throw null;
                                }
                            }
                        }
                    }
                    num = new Integer(i2);
                } else if (!wj50.m88271j(qhoVar, phoVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (num == null) {
                    return w2a1Var;
                }
                idu0Var.f101246b = 1;
                return nizVar.emit(num, idu0Var) == obj2 ? obj2 : w2a1Var;
            case 3:
                if (fbkVar instanceof jdu0) {
                    jdu0Var = (jdu0) fbkVar;
                    int i9 = jdu0Var.f111398b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        jdu0Var.f111398b = i9 - Integer.MIN_VALUE;
                    } else {
                        jdu0Var = new jdu0(this, fbkVar);
                    }
                } else {
                    jdu0Var = new jdu0(this, fbkVar);
                }
                Object obj6 = jdu0Var.f111397a;
                int i10 = jdu0Var.f111398b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                qho qhoVar2 = (qho) obj;
                if (qhoVar2 instanceof nho) {
                    objValueOf = Boolean.FALSE;
                } else if (qhoVar2 instanceof oho) {
                    objValueOf = Boolean.valueOf(((hz80) ((oho) qhoVar2).f165512a).f96834t.f156638b);
                } else if (!wj50.m88271j(qhoVar2, phoVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (objValueOf == null) {
                    return w2a1Var;
                }
                jdu0Var.f111398b = 1;
                return nizVar.emit(objValueOf, jdu0Var) == obj2 ? obj2 : w2a1Var;
            case 4:
                if (fbkVar instanceof vdu0) {
                    vdu0Var = (vdu0) fbkVar;
                    int i11 = vdu0Var.f240492b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        vdu0Var.f240492b = i11 - Integer.MIN_VALUE;
                    } else {
                        vdu0Var = new vdu0(this, fbkVar);
                    }
                } else {
                    vdu0Var = new vdu0(this, fbkVar);
                }
                Object obj7 = vdu0Var.f240491a;
                int i12 = vdu0Var.f240492b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                if (!((e301) obj).f55572b) {
                    return w2a1Var;
                }
                vdu0Var.f240492b = 1;
                return nizVar.emit(obj, vdu0Var) == obj2 ? obj2 : w2a1Var;
            case 5:
                if (fbkVar instanceof wdu0) {
                    wdu0Var = (wdu0) fbkVar;
                    int i13 = wdu0Var.f250336b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wdu0Var.f250336b = i13 - Integer.MIN_VALUE;
                    } else {
                        wdu0Var = new wdu0(this, fbkVar);
                    }
                } else {
                    wdu0Var = new wdu0(this, fbkVar);
                }
                Object obj8 = wdu0Var.f250335a;
                int i14 = wdu0Var.f250336b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                Object obj9 = ((e301) obj).f55571a;
                wdu0Var.f250336b = 1;
                return nizVar.emit(obj9, wdu0Var) == obj2 ? obj2 : w2a1Var;
            case 6:
                if (fbkVar instanceof eiu0) {
                    eiu0Var = (eiu0) fbkVar;
                    int i15 = eiu0Var.f60015b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        eiu0Var.f60015b = i15 - Integer.MIN_VALUE;
                    } else {
                        eiu0Var = new eiu0(this, fbkVar);
                    }
                } else {
                    eiu0Var = new eiu0(this, fbkVar);
                }
                Object obj10 = eiu0Var.f60014a;
                int i16 = eiu0Var.f60015b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                List listM43714b1 = g6f.m43714b1((List) obj, 5);
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
                Iterator it2 = listM43714b1.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new whu0((String) it2.next()));
                }
                eiu0Var.f60015b = 1;
                return nizVar.emit(arrayList, eiu0Var) == obj2 ? obj2 : w2a1Var;
            case 7:
                if (fbkVar instanceof wmu0) {
                    wmu0Var = (wmu0) fbkVar;
                    int i17 = wmu0Var.f252980b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        wmu0Var.f252980b = i17 - Integer.MIN_VALUE;
                    } else {
                        wmu0Var = new wmu0(this, fbkVar);
                    }
                } else {
                    wmu0Var = new wmu0(this, fbkVar);
                }
                Object obj11 = wmu0Var.f252979a;
                int i18 = wmu0Var.f252980b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                Object zgd1Var = new zgd1();
                wmu0Var.f252980b = 1;
                return nizVar.emit(zgd1Var, wmu0Var) == obj2 ? obj2 : w2a1Var;
            case 8:
                if (fbkVar instanceof xmu0) {
                    xmu0Var = (xmu0) fbkVar;
                    int i19 = xmu0Var.f263451b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        xmu0Var.f263451b = i19 - Integer.MIN_VALUE;
                    } else {
                        xmu0Var = new xmu0(this, fbkVar);
                    }
                } else {
                    xmu0Var = new xmu0(this, fbkVar);
                }
                Object obj12 = xmu0Var.f263450a;
                int i20 = xmu0Var.f263451b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                i1p0 i1p0Var = (i1p0) obj;
                if (i1p0Var == null || !i1p0Var.f97560a) {
                    return w2a1Var;
                }
                xmu0Var.f263451b = 1;
                return nizVar.emit(obj, xmu0Var) == obj2 ? obj2 : w2a1Var;
            case 9:
                if (fbkVar instanceof snu0) {
                    snu0Var = (snu0) fbkVar;
                    int i21 = snu0Var.f211028b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        snu0Var.f211028b = i21 - Integer.MIN_VALUE;
                    } else {
                        snu0Var = new snu0(this, fbkVar);
                    }
                } else {
                    snu0Var = new snu0(this, fbkVar);
                }
                Object obj13 = snu0Var.f211027a;
                int i22 = snu0Var.f211028b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                if (((List) obj).isEmpty()) {
                    return w2a1Var;
                }
                snu0Var.f211028b = 1;
                return nizVar.emit(obj, snu0Var) == obj2 ? obj2 : w2a1Var;
            case 10:
                if (fbkVar instanceof tnu0) {
                    tnu0Var = (tnu0) fbkVar;
                    int i23 = tnu0Var.f222080b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        tnu0Var.f222080b = i23 - Integer.MIN_VALUE;
                    } else {
                        tnu0Var = new tnu0(this, fbkVar);
                    }
                } else {
                    tnu0Var = new tnu0(this, fbkVar);
                }
                Object obj14 = tnu0Var.f222079a;
                int i24 = tnu0Var.f222080b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                tnu0Var.f222080b = 1;
                return nizVar.emit(obj, tnu0Var) == obj2 ? obj2 : w2a1Var;
            case 11:
                if (fbkVar instanceof unu0) {
                    unu0Var = (unu0) fbkVar;
                    int i25 = unu0Var.f232266b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        unu0Var.f232266b = i25 - Integer.MIN_VALUE;
                    } else {
                        unu0Var = new unu0(this, fbkVar);
                    }
                } else {
                    unu0Var = new unu0(this, fbkVar);
                }
                Object obj15 = unu0Var.f232265a;
                int i26 = unu0Var.f232266b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                if (!(((zqx0) obj) instanceof tqx0)) {
                    return w2a1Var;
                }
                unu0Var.f232266b = 1;
                return nizVar.emit(obj, unu0Var) == obj2 ? obj2 : w2a1Var;
            case 12:
                if (fbkVar instanceof vnu0) {
                    vnu0Var = (vnu0) fbkVar;
                    int i27 = vnu0Var.f243251b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        vnu0Var.f243251b = i27 - Integer.MIN_VALUE;
                    } else {
                        vnu0Var = new vnu0(this, fbkVar);
                    }
                } else {
                    vnu0Var = new vnu0(this, fbkVar);
                }
                Object obj16 = vnu0Var.f243250a;
                int i28 = vnu0Var.f243251b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                ContextTrack contextTrack2 = (ContextTrack) obj;
                wj50.m88279p(contextTrack2);
                Object objValueOf4 = Boolean.valueOf(w9h1.m87513u(contextTrack2));
                vnu0Var.f243251b = 1;
                return nizVar.emit(objValueOf4, vnu0Var) == obj2 ? obj2 : w2a1Var;
            case 13:
                if (fbkVar instanceof wnu0) {
                    wnu0Var = (wnu0) fbkVar;
                    int i29 = wnu0Var.f253300b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        wnu0Var.f253300b = i29 - Integer.MIN_VALUE;
                    } else {
                        wnu0Var = new wnu0(this, fbkVar);
                    }
                } else {
                    wnu0Var = new wnu0(this, fbkVar);
                }
                Object obj17 = wnu0Var.f253299a;
                int i30 = wnu0Var.f253300b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                Object z191Var = new z191(((Number) obj).intValue());
                wnu0Var.f253300b = 1;
                return nizVar.emit(z191Var, wnu0Var) == obj2 ? obj2 : w2a1Var;
            case 14:
                if (fbkVar instanceof xnu0) {
                    xnu0Var = (xnu0) fbkVar;
                    int i31 = xnu0Var.f263712b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        xnu0Var.f263712b = i31 - Integer.MIN_VALUE;
                    } else {
                        xnu0Var = new xnu0(this, fbkVar);
                    }
                } else {
                    xnu0Var = new xnu0(this, fbkVar);
                }
                Object obj18 = xnu0Var.f263711a;
                int i32 = xnu0Var.f263712b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj19 : (List) obj) {
                    if (obj19 instanceof tqx0) {
                        arrayList2.add(obj19);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    ArrayList arrayList3 = new ArrayList();
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        arrayList3.add(new Integer(((tqx0) next2).f222907a - ((tqx0) next).f222907a));
                        next = next2;
                    }
                    iterable = arrayList3;
                } else {
                    iterable = lau.f131415a;
                }
                Integer num2 = (Integer) g6f.m43690D0(iterable);
                Object num3 = new Integer(num2 != null ? num2.intValue() : Alert.DURATION_SHOW_INDEFINITELY);
                xnu0Var.f263712b = 1;
                return nizVar.emit(num3, xnu0Var) == obj2 ? obj2 : w2a1Var;
            case 15:
                if (fbkVar instanceof ynu0) {
                    ynu0Var = (ynu0) fbkVar;
                    int i33 = ynu0Var.f274507b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ynu0Var.f274507b = i33 - Integer.MIN_VALUE;
                    } else {
                        ynu0Var = new ynu0(this, fbkVar);
                    }
                } else {
                    ynu0Var = new ynu0(this, fbkVar);
                }
                Object obj20 = ynu0Var.f274506a;
                int i34 = ynu0Var.f274507b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                ((Boolean) obj).getClass();
                ynu0Var.f274507b = 1;
                return nizVar.emit(w191.f247034a, ynu0Var) == obj2 ? obj2 : w2a1Var;
            case 16:
                if (fbkVar instanceof dvu0) {
                    dvu0Var = (dvu0) fbkVar;
                    int i35 = dvu0Var.f53542b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        dvu0Var.f53542b = i35 - Integer.MIN_VALUE;
                    } else {
                        dvu0Var = new dvu0(this, fbkVar);
                    }
                } else {
                    dvu0Var = new dvu0(this, fbkVar);
                }
                Object obj21 = dvu0Var.f53541a;
                int i36 = dvu0Var.f53542b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                long j = ((Size) obj).f494a;
                int i37 = e1b1.f55173b;
                if (j == 9205357640488583168L) {
                    ci21Var = ci21.f38193c;
                } else {
                    int i38 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i38) >= 0.5d) {
                        int i39 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i39) >= 0.5d) {
                            float fIntBitsToFloat = Float.intBitsToFloat(i38);
                            float fAbs = Math.abs(fIntBitsToFloat);
                            tjr njrVar2 = pjr.f178301a;
                            if (fAbs <= Float.MAX_VALUE) {
                                int iM72083N = q3d0.m72083N(fIntBitsToFloat);
                                wj50.m88254a(iM72083N);
                                njrVar = new njr(iM72083N);
                            } else {
                                njrVar = njrVar2;
                            }
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i39);
                            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                                int iM72083N2 = q3d0.m72083N(fIntBitsToFloat2);
                                wj50.m88254a(iM72083N2);
                                njrVar2 = new njr(iM72083N2);
                            }
                            ci21Var = new ci21(njrVar, njrVar2);
                        }
                    }
                }
                if (ci21Var == null) {
                    return w2a1Var;
                }
                dvu0Var.f53542b = 1;
                return nizVar.emit(ci21Var, dvu0Var) == obj2 ? obj2 : w2a1Var;
            case 17:
                if (fbkVar instanceof kzu0) {
                    kzu0Var = (kzu0) fbkVar;
                    int i40 = kzu0Var.f128223b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        kzu0Var.f128223b = i40 - Integer.MIN_VALUE;
                    } else {
                        kzu0Var = new kzu0(this, fbkVar);
                    }
                } else {
                    kzu0Var = new kzu0(this, fbkVar);
                }
                Object obj22 = kzu0Var.f128222a;
                int i41 = kzu0Var.f128223b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                Object objValueOf5 = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
                kzu0Var.f128223b = 1;
                return nizVar.emit(objValueOf5, kzu0Var) == obj2 ? obj2 : w2a1Var;
            case 18:
                if (fbkVar instanceof pzu0) {
                    pzu0Var = (pzu0) fbkVar;
                    int i42 = pzu0Var.f183817b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        pzu0Var.f183817b = i42 - Integer.MIN_VALUE;
                    } else {
                        pzu0Var = new pzu0(this, fbkVar);
                    }
                } else {
                    pzu0Var = new pzu0(this, fbkVar);
                }
                Object obj23 = pzu0Var.f183816a;
                int i43 = pzu0Var.f183817b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                Map map = (Map) obj;
                ArrayList arrayList4 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList4.add(new v860((String) entry.getKey(), ((ozu0) entry.getValue()).f172371b));
                }
                Object objM43736n1 = g6f.m43736n1(arrayList4);
                pzu0Var.f183817b = 1;
                return nizVar.emit(objM43736n1, pzu0Var) == obj2 ? obj2 : w2a1Var;
            case 19:
                if (fbkVar instanceof e5v0) {
                    e5v0Var = (e5v0) fbkVar;
                    int i44 = e5v0Var.f56479b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        e5v0Var.f56479b = i44 - Integer.MIN_VALUE;
                    } else {
                        e5v0Var = new e5v0(this, fbkVar);
                    }
                } else {
                    e5v0Var = new e5v0(this, fbkVar);
                }
                Object obj24 = e5v0Var.f56478a;
                int i45 = e5v0Var.f56479b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                Object obj25 = ((e301) obj).f55571a;
                e5v0Var.f56479b = 1;
                return nizVar.emit(obj25, e5v0Var) == obj2 ? obj2 : w2a1Var;
            case 20:
                if (fbkVar instanceof i5v0) {
                    i5v0Var = (i5v0) fbkVar;
                    int i46 = i5v0Var.f99031b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        i5v0Var.f99031b = i46 - Integer.MIN_VALUE;
                    } else {
                        i5v0Var = new i5v0(this, fbkVar);
                    }
                } else {
                    i5v0Var = new i5v0(this, fbkVar);
                }
                Object obj26 = i5v0Var.f99030a;
                int i47 = i5v0Var.f99031b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null) {
                    objUri = contextTrack.uri();
                }
                i5v0Var.f99031b = 1;
                return nizVar.emit(objUri, i5v0Var) == obj2 ? obj2 : w2a1Var;
            case 21:
                if (fbkVar instanceof b8v0) {
                    b8v0Var = (b8v0) fbkVar;
                    int i48 = b8v0Var.f24671b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        b8v0Var.f24671b = i48 - Integer.MIN_VALUE;
                    } else {
                        b8v0Var = new b8v0(this, fbkVar);
                    }
                } else {
                    b8v0Var = new b8v0(this, fbkVar);
                }
                Object obj27 = b8v0Var.f24670a;
                int i49 = b8v0Var.f24671b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Object objMo42569a = ((iso) obj).mo42569a();
                b8v0Var.f24671b = 1;
                return nizVar.emit(objMo42569a, b8v0Var) == obj2 ? obj2 : w2a1Var;
            case 22:
                if (fbkVar instanceof y8v0) {
                    y8v0Var = (y8v0) fbkVar;
                    int i50 = y8v0Var.f270392b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        y8v0Var.f270392b = i50 - Integer.MIN_VALUE;
                    } else {
                        y8v0Var = new y8v0(this, fbkVar);
                    }
                } else {
                    y8v0Var = new y8v0(this, fbkVar);
                }
                Object obj28 = y8v0Var.f270391a;
                int i51 = y8v0Var.f270392b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                fv31 fv31Var = z8v0.f280576b;
                Object objM78608l = so3.m78608l((String) ((gv31) obj).f84602a);
                y8v0Var.f270392b = 1;
                return nizVar.emit(objM78608l, y8v0Var) == obj2 ? obj2 : w2a1Var;
            case 23:
                if (fbkVar instanceof m9v0) {
                    m9v0Var = (m9v0) fbkVar;
                    int i52 = m9v0Var.f141393b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        m9v0Var.f141393b = i52 - Integer.MIN_VALUE;
                    } else {
                        m9v0Var = new m9v0(this, fbkVar);
                    }
                } else {
                    m9v0Var = new m9v0(this, fbkVar);
                }
                Object obj29 = m9v0Var.f141392a;
                int i53 = m9v0Var.f141393b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                u8v0 u8v0Var = (u8v0) obj;
                ArrayList arrayList5 = u8v0Var.f228020a;
                ?? r14 = u8v0Var.f228023d;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj30 : arrayList5) {
                    if (obj30 instanceof d7v0) {
                        arrayList6.add(obj30);
                    }
                }
                ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((d7v0) it4.next()).f46280a);
                }
                Object l9v0Var = new l9v0(arrayList7, r14.size() == 1 ? ((i6v0) g6f.m43741q0(r14)).f99337a : null);
                m9v0Var.f141393b = 1;
                return nizVar.emit(l9v0Var, m9v0Var) == obj2 ? obj2 : w2a1Var;
            case 24:
                if (fbkVar instanceof ukv0) {
                    ukv0Var = (ukv0) fbkVar;
                    int i54 = ukv0Var.f231375b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ukv0Var.f231375b = i54 - Integer.MIN_VALUE;
                    } else {
                        ukv0Var = new ukv0(this, fbkVar);
                    }
                } else {
                    ukv0Var = new ukv0(this, fbkVar);
                }
                Object obj31 = ukv0Var.f231374a;
                int i55 = ukv0Var.f231375b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                if (!((e301) obj).f55572b) {
                    return w2a1Var;
                }
                ukv0Var.f231375b = 1;
                return nizVar.emit(obj, ukv0Var) == obj2 ? obj2 : w2a1Var;
            case 25:
                if (fbkVar instanceof vkv0) {
                    vkv0Var = (vkv0) fbkVar;
                    int i56 = vkv0Var.f242297b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        vkv0Var.f242297b = i56 - Integer.MIN_VALUE;
                    } else {
                        vkv0Var = new vkv0(this, fbkVar);
                    }
                } else {
                    vkv0Var = new vkv0(this, fbkVar);
                }
                Object obj32 = vkv0Var.f242296a;
                int i57 = vkv0Var.f242297b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                Object obj33 = ((e301) obj).f55571a;
                vkv0Var.f242297b = 1;
                return nizVar.emit(obj33, vkv0Var) == obj2 ? obj2 : w2a1Var;
            case 26:
                if (fbkVar instanceof ykv0) {
                    ykv0Var = (ykv0) fbkVar;
                    int i58 = ykv0Var.f273846b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        ykv0Var.f273846b = i58 - Integer.MIN_VALUE;
                    } else {
                        ykv0Var = new ykv0(this, fbkVar);
                    }
                } else {
                    ykv0Var = new ykv0(this, fbkVar);
                }
                Object obj34 = ykv0Var.f273845a;
                int i59 = ykv0Var.f273846b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return w2a1Var;
                }
                bga.m29073P(obj34);
                if (((Map) obj).isEmpty()) {
                    return w2a1Var;
                }
                ykv0Var.f273846b = 1;
                return nizVar.emit(obj, ykv0Var) == obj2 ? obj2 : w2a1Var;
            case 27:
                if (fbkVar instanceof glv0) {
                    glv0Var = (glv0) fbkVar;
                    int i60 = glv0Var.f81188b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        glv0Var.f81188b = i60 - Integer.MIN_VALUE;
                    } else {
                        glv0Var = new glv0(this, fbkVar);
                    }
                } else {
                    glv0Var = new glv0(this, fbkVar);
                }
                Object obj35 = glv0Var.f81187a;
                int i61 = glv0Var.f81188b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                flv0 flv0Var = (flv0) obj;
                if (!wj50.m88271j(flv0Var, dlv0.f50371a)) {
                    if (!wj50.m88271j(flv0Var, elv0.f60762a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z2 = true;
                }
                Object objValueOf6 = Boolean.valueOf(z2);
                glv0Var.f81188b = 1;
                return nizVar.emit(objValueOf6, glv0Var) == obj2 ? obj2 : w2a1Var;
            case 28:
                if (fbkVar instanceof cmv0) {
                    cmv0Var = (cmv0) fbkVar;
                    int i62 = cmv0Var.f39806b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        cmv0Var.f39806b = i62 - Integer.MIN_VALUE;
                    } else {
                        cmv0Var = new cmv0(this, fbkVar);
                    }
                } else {
                    cmv0Var = new cmv0(this, fbkVar);
                }
                Object obj36 = cmv0Var.f39805a;
                int i63 = cmv0Var.f39806b;
                if (i63 != 0) {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj36);
                    return w2a1Var;
                }
                bga.m29073P(obj36);
                bmv0 bmv0Var = (bmv0) obj;
                by50 by50Var = bmv0Var.f28627a;
                by50 by50Var2 = bmv0Var.f28628b;
                if (by50Var == null && by50Var2 != null) {
                    fmv0Var = new dmv0(by50Var2);
                } else if (by50Var != null && by50Var2 == null) {
                    fmv0Var = emv0.f61006a;
                } else if (by50Var != null && by50Var2 != null && !by50Var.f32077c.equals(by50Var2.f32077c)) {
                    fmv0Var = new fmv0(by50Var2);
                }
                if (fmv0Var == null) {
                    return w2a1Var;
                }
                cmv0Var.f39806b = 1;
                return nizVar.emit(fmv0Var, cmv0Var) == obj2 ? obj2 : w2a1Var;
            default:
                if (fbkVar instanceof juv0) {
                    juv0Var = (juv0) fbkVar;
                    int i64 = juv0Var.f116181b;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        juv0Var.f116181b = i64 - Integer.MIN_VALUE;
                    } else {
                        juv0Var = new juv0(this, fbkVar);
                    }
                } else {
                    juv0Var = new juv0(this, fbkVar);
                }
                Object obj37 = juv0Var.f116180a;
                int i65 = juv0Var.f116181b;
                if (i65 != 0) {
                    if (i65 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj37);
                    return w2a1Var;
                }
                bga.m29073P(obj37);
                juv0Var.f116181b = 1;
                return nizVar.emit(auv0.f20034a, juv0Var) == obj2 ? obj2 : w2a1Var;
        }
    }

    public /* synthetic */ jcu0(niz nizVar, Object obj, int i) {
        this.f111193a = i;
        this.f111194b = nizVar;
    }
}
