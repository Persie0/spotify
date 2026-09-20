package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.deviceproxy.navigation.p059v1.NavigationCommand;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class c3i0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f33691b;

    public /* synthetic */ c3i0(niz nizVar, int i) {
        this.f33690a = i;
        this.f33691b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x022e  */
    /* JADX WARN: Code duplicated, block: B:172:0x027e  */
    /* JADX WARN: Code duplicated, block: B:188:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:222:0x033a  */
    /* JADX WARN: Code duplicated, block: B:240:0x037e  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:290:0x043a  */
    /* JADX WARN: Code duplicated, block: B:306:0x047a  */
    /* JADX WARN: Code duplicated, block: B:322:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:338:0x0502  */
    /* JADX WARN: Code duplicated, block: B:354:0x0543  */
    /* JADX WARN: Code duplicated, block: B:370:0x057f  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:414:0x0611  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:447:0x0686  */
    /* JADX WARN: Code duplicated, block: B:463:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:482:0x0700  */
    /* JADX WARN: Code duplicated, block: B:508:0x0756  */
    /* JADX WARN: Code duplicated, block: B:526:0x0792  */
    /* JADX WARN: Code duplicated, block: B:542:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        b3i0 b3i0Var;
        u7i0 u7i0Var;
        b8i0 b8i0Var;
        d8i0 d8i0Var;
        Object obj2;
        List list;
        z240 z240Var;
        uei0 uei0Var;
        dfi0 dfi0Var;
        chi0 chi0Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        uli0 uli0Var;
        xli0 xli0Var;
        List list2;
        z240 z240Var2;
        ani0 ani0Var;
        cni0 cni0Var;
        dni0 dni0Var;
        aoi0 aoi0Var;
        coi0 coi0Var;
        aqi0 aqi0Var;
        dri0 dri0Var;
        hsi0 hsi0Var;
        m4j0 m4j0Var;
        n4j0 n4j0Var;
        q5j0 q5j0Var;
        r5j0 r5j0Var;
        z5j0 z5j0Var;
        hej0 hej0Var;
        Object obj3;
        cpj0 cpj0Var;
        jpj0 jpj0Var;
        mpj0 mpj0Var;
        pyj0 pyj0Var;
        wyj0 wyj0Var;
        xyj0 xyj0Var;
        u3k0 u3k0Var;
        int i = this.f33690a;
        Object obj4 = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f33691b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof b3i0) {
                    b3i0Var = (b3i0) fbkVar;
                    int i2 = b3i0Var.f23058b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        b3i0Var.f23058b = i2 - Integer.MIN_VALUE;
                    } else {
                        b3i0Var = new b3i0(this, fbkVar);
                    }
                } else {
                    b3i0Var = new b3i0(this, fbkVar);
                }
                Object obj5 = b3i0Var.f23057a;
                int i3 = b3i0Var.f23058b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                obj4 = ohoVar != null ? (uu41) ohoVar.f165512a : null;
                if (obj4 == null) {
                    return w2a1Var;
                }
                b3i0Var.f23058b = 1;
                return nizVar.emit(obj4, b3i0Var) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof u7i0) {
                    u7i0Var = (u7i0) fbkVar;
                    int i4 = u7i0Var.f227708b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        u7i0Var.f227708b = i4 - Integer.MIN_VALUE;
                    } else {
                        u7i0Var = new u7i0(this, fbkVar);
                    }
                } else {
                    u7i0Var = new u7i0(this, fbkVar);
                }
                Object obj6 = u7i0Var.f227707a;
                int i5 = u7i0Var.f227708b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                Boolean boolValueOf = Boolean.valueOf(n5h1.m63740p((cg21) obj));
                u7i0Var.f227708b = 1;
                return nizVar.emit(boolValueOf, u7i0Var) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof b8i0) {
                    b8i0Var = (b8i0) fbkVar;
                    int i6 = b8i0Var.f24594b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        b8i0Var.f24594b = i6 - Integer.MIN_VALUE;
                    } else {
                        b8i0Var = new b8i0(this, fbkVar);
                    }
                } else {
                    b8i0Var = new b8i0(this, fbkVar);
                }
                Object obj7 = b8i0Var.f24593a;
                int i7 = b8i0Var.f24594b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                if (((fqx) obj).f72301b == null) {
                    return w2a1Var;
                }
                b8i0Var.f24594b = 1;
                return nizVar.emit(obj, b8i0Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof d8i0) {
                    d8i0Var = (d8i0) fbkVar;
                    int i8 = d8i0Var.f46467b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        d8i0Var.f46467b = i8 - Integer.MIN_VALUE;
                    } else {
                        d8i0Var = new d8i0(this, fbkVar);
                    }
                } else {
                    d8i0Var = new d8i0(this, fbkVar);
                }
                Object obj8 = d8i0Var.f46466a;
                int i9 = d8i0Var.f46467b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                ktx ktxVar = ((fqx) obj).f72301b;
                wj50.m88279p(ktxVar);
                m340 m340Var = ((erc1) ktxVar).f62080b;
                if (m340Var != null && (list = m340Var.f139524a) != null && (z240Var = (z240) g6f.m43745s0(list)) != null) {
                    obj4 = z240Var.f278475a.f198763a;
                }
                obj2 = obj4 != null ? obj4 : "";
                d8i0Var.f46467b = 1;
                return nizVar.emit(obj2, d8i0Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof uei0) {
                    uei0Var = (uei0) fbkVar;
                    int i10 = uei0Var.f229545b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        uei0Var.f229545b = i10 - Integer.MIN_VALUE;
                    } else {
                        uei0Var = new uei0(this, fbkVar);
                    }
                } else {
                    uei0Var = new uei0(this, fbkVar);
                }
                Object obj9 = uei0Var.f229544a;
                int i11 = uei0Var.f229545b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                v69 v69Var = (v69) obj;
                obj4 = v69Var != null ? v69Var.f237759a : null;
                uei0Var.f229545b = 1;
                return nizVar.emit(obj4, uei0Var) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof dfi0) {
                    dfi0Var = (dfi0) fbkVar;
                    int i12 = dfi0Var.f48607b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dfi0Var.f48607b = i12 - Integer.MIN_VALUE;
                    } else {
                        dfi0Var = new dfi0(this, fbkVar);
                    }
                } else {
                    dfi0Var = new dfi0(this, fbkVar);
                }
                Object obj10 = dfi0Var.f48606a;
                int i13 = dfi0Var.f48607b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                c4j0 c4j0Var = (c4j0) ((cfi0) obj).f37389h.getValue();
                dfi0Var.f48607b = 1;
                return nizVar.emit(c4j0Var, dfi0Var) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof chi0) {
                    chi0Var = (chi0) fbkVar;
                    int i14 = chi0Var.f38025b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        chi0Var.f38025b = i14 - Integer.MIN_VALUE;
                    } else {
                        chi0Var = new chi0(this, fbkVar);
                    }
                } else {
                    chi0Var = new chi0(this, fbkVar);
                }
                Object obj11 = chi0Var.f38024a;
                int i15 = chi0Var.f38025b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                Map map = ((ty80) obj).f224877f.f271272q;
                CharSequence charSequence3 = (CharSequence) map.get("entrypoint_title");
                Boolean boolValueOf2 = Boolean.valueOf((charSequence3 == null || charSequence3.length() == 0 || (charSequence = (CharSequence) map.get("entrypoint_cta_label")) == null || charSequence.length() == 0 || (charSequence2 = (CharSequence) map.get("entrypoint_redirect_uri")) == null || charSequence2.length() == 0) ? false : true);
                chi0Var.f38025b = 1;
                return nizVar.emit(boolValueOf2, chi0Var) == yukVar ? yukVar : w2a1Var;
            case 7:
                if (fbkVar instanceof uli0) {
                    uli0Var = (uli0) fbkVar;
                    int i16 = uli0Var.f231569b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        uli0Var.f231569b = i16 - Integer.MIN_VALUE;
                    } else {
                        uli0Var = new uli0(this, fbkVar);
                    }
                } else {
                    uli0Var = new uli0(this, fbkVar);
                }
                Object obj12 = uli0Var.f231568a;
                int i17 = uli0Var.f231569b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                if (((fqx) obj).f72301b == null) {
                    return w2a1Var;
                }
                uli0Var.f231569b = 1;
                return nizVar.emit(obj, uli0Var) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof xli0) {
                    xli0Var = (xli0) fbkVar;
                    int i18 = xli0Var.f263154b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        xli0Var.f263154b = i18 - Integer.MIN_VALUE;
                    } else {
                        xli0Var = new xli0(this, fbkVar);
                    }
                } else {
                    xli0Var = new xli0(this, fbkVar);
                }
                Object obj13 = xli0Var.f263153a;
                int i19 = xli0Var.f263154b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                ktx ktxVar2 = ((fqx) obj).f72301b;
                wj50.m88279p(ktxVar2);
                m340 m340Var2 = ((erc1) ktxVar2).f62080b;
                if (m340Var2 != null && (list2 = m340Var2.f139524a) != null && (z240Var2 = (z240) g6f.m43745s0(list2)) != null) {
                    obj4 = z240Var2.f278475a.f198763a;
                }
                obj2 = obj4 != null ? obj4 : "";
                xli0Var.f263154b = 1;
                return nizVar.emit(obj2, xli0Var) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof ani0) {
                    ani0Var = (ani0) fbkVar;
                    int i20 = ani0Var.f17448b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ani0Var.f17448b = i20 - Integer.MIN_VALUE;
                    } else {
                        ani0Var = new ani0(this, fbkVar);
                    }
                } else {
                    ani0Var = new ani0(this, fbkVar);
                }
                Object obj14 = ani0Var.f17447a;
                int i21 = ani0Var.f17448b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                qmi0 qmi0Var = new qmi0((v1p0) obj);
                ani0Var.f17448b = 1;
                return nizVar.emit(qmi0Var, ani0Var) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof cni0) {
                    cni0Var = (cni0) fbkVar;
                    int i22 = cni0Var.f40030b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cni0Var.f40030b = i22 - Integer.MIN_VALUE;
                    } else {
                        cni0Var = new cni0(this, fbkVar);
                    }
                } else {
                    cni0Var = new cni0(this, fbkVar);
                }
                Object obj15 = cni0Var.f40029a;
                int i23 = cni0Var.f40030b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                Boolean boolValueOf3 = Boolean.valueOf(((z190) obj).f278263a.m30586a());
                cni0Var.f40030b = 1;
                return nizVar.emit(boolValueOf3, cni0Var) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof dni0) {
                    dni0Var = (dni0) fbkVar;
                    int i24 = dni0Var.f50845b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        dni0Var.f50845b = i24 - Integer.MIN_VALUE;
                    } else {
                        dni0Var = new dni0(this, fbkVar);
                    }
                } else {
                    dni0Var = new dni0(this, fbkVar);
                }
                Object obj16 = dni0Var.f50844a;
                int i25 = dni0Var.f50845b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                Boolean boolValueOf4 = Boolean.valueOf(((z190) obj).f278263a.m30587b());
                dni0Var.f50845b = 1;
                return nizVar.emit(boolValueOf4, dni0Var) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof aoi0) {
                    aoi0Var = (aoi0) fbkVar;
                    int i26 = aoi0Var.f17698b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        aoi0Var.f17698b = i26 - Integer.MIN_VALUE;
                    } else {
                        aoi0Var = new aoi0(this, fbkVar);
                    }
                } else {
                    aoi0Var = new aoi0(this, fbkVar);
                }
                Object obj17 = aoi0Var.f17697a;
                int i27 = aoi0Var.f17698b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                gi20 gi20VarM44766a = gi20.m44766a((gi20) obj, null, true, false, 0, null, false, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND);
                aoi0Var.f17698b = 1;
                return nizVar.emit(gi20VarM44766a, aoi0Var) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof coi0) {
                    coi0Var = (coi0) fbkVar;
                    int i28 = coi0Var.f40275b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        coi0Var.f40275b = i28 - Integer.MIN_VALUE;
                    } else {
                        coi0Var = new coi0(this, fbkVar);
                    }
                } else {
                    coi0Var = new coi0(this, fbkVar);
                }
                Object obj18 = coi0Var.f40274a;
                int i29 = coi0Var.f40275b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                coi0Var.f40275b = 1;
                return nizVar.emit(boolValueOf5, coi0Var) == yukVar ? yukVar : w2a1Var;
            case 14:
                if (fbkVar instanceof aqi0) {
                    aqi0Var = (aqi0) fbkVar;
                    int i30 = aqi0Var.f18260b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        aqi0Var.f18260b = i30 - Integer.MIN_VALUE;
                    } else {
                        aqi0Var = new aqi0(this, fbkVar);
                    }
                } else {
                    aqi0Var = new aqi0(this, fbkVar);
                }
                Object obj19 = aqi0Var.f18259a;
                int i31 = aqi0Var.f18260b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                fv31 fv31Var = bqi0.f29819c;
                flv0 flv0VarM78607k = so3.m78607k((Integer) ((gv31) obj).f84602a);
                aqi0Var.f18260b = 1;
                return nizVar.emit(flv0VarM78607k, aqi0Var) == yukVar ? yukVar : w2a1Var;
            case 15:
                if (fbkVar instanceof dri0) {
                    dri0Var = (dri0) fbkVar;
                    int i32 = dri0Var.f52335b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        dri0Var.f52335b = i32 - Integer.MIN_VALUE;
                    } else {
                        dri0Var = new dri0(this, fbkVar);
                    }
                } else {
                    dri0Var = new dri0(this, fbkVar);
                }
                Object obj20 = dri0Var.f52334a;
                int i33 = dri0Var.f52335b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                dri0Var.f52335b = 1;
                return nizVar.emit(obj, dri0Var) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof hsi0) {
                    hsi0Var = (hsi0) fbkVar;
                    int i34 = hsi0Var.f94750b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hsi0Var.f94750b = i34 - Integer.MIN_VALUE;
                    } else {
                        hsi0Var = new hsi0(this, fbkVar);
                    }
                } else {
                    hsi0Var = new hsi0(this, fbkVar);
                }
                Object obj21 = hsi0Var.f94749a;
                int i35 = hsi0Var.f94750b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                Boolean boolValueOf6 = Boolean.valueOf(((gsi0) obj).f83976a);
                hsi0Var.f94750b = 1;
                return nizVar.emit(boolValueOf6, hsi0Var) == yukVar ? yukVar : w2a1Var;
            case 17:
                if (fbkVar instanceof m4j0) {
                    m4j0Var = (m4j0) fbkVar;
                    int i36 = m4j0Var.f139975b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        m4j0Var.f139975b = i36 - Integer.MIN_VALUE;
                    } else {
                        m4j0Var = new m4j0(this, fbkVar);
                    }
                } else {
                    m4j0Var = new m4j0(this, fbkVar);
                }
                Object obj22 = m4j0Var.f139974a;
                int i37 = m4j0Var.f139975b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                if (!wj50.m88271j(((NavigationCommand) obj).m9291n(), "open")) {
                    return w2a1Var;
                }
                m4j0Var.f139975b = 1;
                return nizVar.emit(obj, m4j0Var) == yukVar ? yukVar : w2a1Var;
            case 18:
                if (fbkVar instanceof n4j0) {
                    n4j0Var = (n4j0) fbkVar;
                    int i38 = n4j0Var.f150362b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        n4j0Var.f150362b = i38 - Integer.MIN_VALUE;
                    } else {
                        n4j0Var = new n4j0(this, fbkVar);
                    }
                } else {
                    n4j0Var = new n4j0(this, fbkVar);
                }
                Object obj23 = n4j0Var.f150361a;
                int i39 = n4j0Var.f150362b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                if (((NavigationCommand) obj).getUri().length() <= 0) {
                    return w2a1Var;
                }
                n4j0Var.f150362b = 1;
                return nizVar.emit(obj, n4j0Var) == yukVar ? yukVar : w2a1Var;
            case 19:
                if (fbkVar instanceof q5j0) {
                    q5j0Var = (q5j0) fbkVar;
                    int i40 = q5j0Var.f185545b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        q5j0Var.f185545b = i40 - Integer.MIN_VALUE;
                    } else {
                        q5j0Var = new q5j0(this, fbkVar);
                    }
                } else {
                    q5j0Var = new q5j0(this, fbkVar);
                }
                Object obj24 = q5j0Var.f185544a;
                int i41 = q5j0Var.f185545b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                afm0 afm0Var = ((q040) obj).f183903c;
                q5j0Var.f185545b = 1;
                return nizVar.emit(afm0Var, q5j0Var) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof r5j0) {
                    r5j0Var = (r5j0) fbkVar;
                    int i42 = r5j0Var.f196065b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        r5j0Var.f196065b = i42 - Integer.MIN_VALUE;
                    } else {
                        r5j0Var = new r5j0(this, fbkVar);
                    }
                } else {
                    r5j0Var = new r5j0(this, fbkVar);
                }
                Object obj25 = r5j0Var.f196064a;
                int i43 = r5j0Var.f196065b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                Boolean boolValueOf7 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
                r5j0Var.f196065b = 1;
                return nizVar.emit(boolValueOf7, r5j0Var) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof z5j0) {
                    z5j0Var = (z5j0) fbkVar;
                    int i44 = z5j0Var.f279584b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        z5j0Var.f279584b = i44 - Integer.MIN_VALUE;
                    } else {
                        z5j0Var = new z5j0(this, fbkVar);
                    }
                } else {
                    z5j0Var = new z5j0(this, fbkVar);
                }
                Object obj26 = z5j0Var.f279583a;
                int i45 = z5j0Var.f279584b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                ncd1 ncd1Var = (ncd1) obj;
                if (ncd1Var instanceof lcd1) {
                    obj4 = ((lcd1) ncd1Var).f131908a.f134516b;
                } else if (!wj50.m88271j(ncd1Var, mcd1.f142133a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z5j0Var.f279584b = 1;
                return nizVar.emit(obj4, z5j0Var) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof hej0) {
                    hej0Var = (hej0) fbkVar;
                    int i46 = hej0Var.f90445b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        hej0Var.f90445b = i46 - Integer.MIN_VALUE;
                    } else {
                        hej0Var = new hej0(this, fbkVar);
                    }
                } else {
                    hej0Var = new hej0(this, fbkVar);
                }
                Object obj27 = hej0Var.f90444a;
                int i47 = hej0Var.f90445b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Boolean bool = (Boolean) obj;
                if (wj50.m88271j(bool, Boolean.TRUE)) {
                    obj3 = wdj0.f250299a;
                } else {
                    if (!wj50.m88271j(bool, Boolean.FALSE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = xdj0.f260497a;
                }
                hej0Var.f90445b = 1;
                return nizVar.emit(obj3, hej0Var) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof cpj0) {
                    cpj0Var = (cpj0) fbkVar;
                    int i48 = cpj0Var.f40568b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        cpj0Var.f40568b = i48 - Integer.MIN_VALUE;
                    } else {
                        cpj0Var = new cpj0(this, fbkVar);
                    }
                } else {
                    cpj0Var = new cpj0(this, fbkVar);
                }
                Object obj28 = cpj0Var.f40567a;
                int i49 = cpj0Var.f40568b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                Boolean boolValueOf8 = Boolean.valueOf(((pe01) obj).f176594k);
                cpj0Var.f40568b = 1;
                return nizVar.emit(boolValueOf8, cpj0Var) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof jpj0) {
                    jpj0Var = (jpj0) fbkVar;
                    int i50 = jpj0Var.f114681b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        jpj0Var.f114681b = i50 - Integer.MIN_VALUE;
                    } else {
                        jpj0Var = new jpj0(this, fbkVar);
                    }
                } else {
                    jpj0Var = new jpj0(this, fbkVar);
                }
                Object obj29 = jpj0Var.f114680a;
                int i51 = jpj0Var.f114681b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Integer num = new Integer(((pe01) obj).f176595l);
                jpj0Var.f114681b = 1;
                return nizVar.emit(num, jpj0Var) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof mpj0) {
                    mpj0Var = (mpj0) fbkVar;
                    int i52 = mpj0Var.f146043b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        mpj0Var.f146043b = i52 - Integer.MIN_VALUE;
                    } else {
                        mpj0Var = new mpj0(this, fbkVar);
                    }
                } else {
                    mpj0Var = new mpj0(this, fbkVar);
                }
                Object obj30 = mpj0Var.f146042a;
                int i53 = mpj0Var.f146043b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                Boolean boolValueOf9 = Boolean.valueOf(((pe01) obj).f176594k);
                mpj0Var.f146043b = 1;
                return nizVar.emit(boolValueOf9, mpj0Var) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof pyj0) {
                    pyj0Var = (pyj0) fbkVar;
                    int i54 = pyj0Var.f183421b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        pyj0Var.f183421b = i54 - Integer.MIN_VALUE;
                    } else {
                        pyj0Var = new pyj0(this, fbkVar);
                    }
                } else {
                    pyj0Var = new pyj0(this, fbkVar);
                }
                Object obj31 = pyj0Var.f183420a;
                int i55 = pyj0Var.f183421b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                b9d b9dVar = new b9d(((Boolean) obj).booleanValue());
                pyj0Var.f183421b = 1;
                return nizVar.emit(b9dVar, pyj0Var) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof wyj0) {
                    wyj0Var = (wyj0) fbkVar;
                    int i56 = wyj0Var.f256305b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        wyj0Var.f256305b = i56 - Integer.MIN_VALUE;
                    } else {
                        wyj0Var = new wyj0(this, fbkVar);
                    }
                } else {
                    wyj0Var = new wyj0(this, fbkVar);
                }
                Object obj32 = wyj0Var.f256304a;
                int i57 = wyj0Var.f256305b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                lmc lmcVar = ((wrl0) obj).f254386b;
                if (lmcVar != lmc.f134854b && lmcVar != lmc.f134855c) {
                    return w2a1Var;
                }
                wyj0Var.f256305b = 1;
                return nizVar.emit(obj, wyj0Var) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof xyj0) {
                    xyj0Var = (xyj0) fbkVar;
                    int i58 = xyj0Var.f267327b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        xyj0Var.f267327b = i58 - Integer.MIN_VALUE;
                    } else {
                        xyj0Var = new xyj0(this, fbkVar);
                    }
                } else {
                    xyj0Var = new xyj0(this, fbkVar);
                }
                Object obj33 = xyj0Var.f267326a;
                int i59 = xyj0Var.f267327b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return w2a1Var;
                }
                bga.m29073P(obj33);
                Boolean boolValueOf10 = Boolean.valueOf(((wrl0) obj).f254387c);
                xyj0Var.f267327b = 1;
                return nizVar.emit(boolValueOf10, xyj0Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof u3k0) {
                    u3k0Var = (u3k0) fbkVar;
                    int i60 = u3k0Var.f226402b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        u3k0Var.f226402b = i60 - Integer.MIN_VALUE;
                    } else {
                        u3k0Var = new u3k0(this, fbkVar);
                    }
                } else {
                    u3k0Var = new u3k0(this, fbkVar);
                }
                Object obj34 = u3k0Var.f226401a;
                int i61 = u3k0Var.f226402b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return w2a1Var;
                }
                bga.m29073P(obj34);
                xul0 xul0VarM92200a = xul0.m92200a((by50) obj);
                u3k0Var.f226402b = 1;
                return nizVar.emit(xul0VarM92200a, u3k0Var) == yukVar ? yukVar : w2a1Var;
        }
    }

    public /* synthetic */ c3i0(niz nizVar, Object obj, int i) {
        this.f33690a = i;
        this.f33691b = nizVar;
    }
}
