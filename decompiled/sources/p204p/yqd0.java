package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class yqd0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f275195b;

    public /* synthetic */ yqd0(niz nizVar, int i) {
        this.f275194a = i;
        this.f275195b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x021e  */
    /* JADX WARN: Code duplicated, block: B:150:0x026c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:193:0x0309  */
    /* JADX WARN: Code duplicated, block: B:214:0x035b  */
    /* JADX WARN: Code duplicated, block: B:233:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:250:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:279:0x0448  */
    /* JADX WARN: Code duplicated, block: B:300:0x049b  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:317:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:342:0x054e  */
    /* JADX WARN: Code duplicated, block: B:359:0x0597  */
    /* JADX WARN: Code duplicated, block: B:376:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:393:0x0624  */
    /* JADX WARN: Code duplicated, block: B:410:0x066a  */
    /* JADX WARN: Code duplicated, block: B:427:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:444:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:468:0x074b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:485:0x0791  */
    /* JADX WARN: Code duplicated, block: B:502:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:519:0x081e  */
    /* JADX WARN: Code duplicated, block: B:540:0x0892  */
    /* JADX WARN: Code duplicated, block: B:557:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:576:0x0923  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        xqd0 xqd0Var;
        gvd0 gvd0Var;
        fxd0 fxd0Var;
        kyd0 kyd0Var;
        vyd0 vyd0Var;
        a0e0 a0e0Var;
        r0e0 r0e0Var;
        s1e0 s1e0Var;
        z2e0 z2e0Var;
        t3e0 t3e0Var;
        j4e0 j4e0Var;
        r5e0 r5e0Var;
        g7e0 g7e0Var;
        r7e0 r7e0Var;
        t8e0 t8e0Var;
        Object r8e0Var;
        zde0 zde0Var;
        ate0 ate0Var;
        c9f0 c9f0Var;
        hz80 hz80Var;
        off0 off0Var;
        rff0 rff0Var;
        tff0 tff0Var;
        xff0 xff0Var;
        zff0 zff0Var;
        bgf0 bgf0Var;
        lgf0 lgf0Var;
        mgf0 mgf0Var;
        List list;
        dif0 dif0Var;
        iif0 iif0Var;
        kif0 kif0Var;
        lif0 lif0Var;
        switch (this.f275194a) {
            case 0:
                if (fbkVar instanceof xqd0) {
                    xqd0Var = (xqd0) fbkVar;
                    int i = xqd0Var.f264968b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xqd0Var.f264968b = i - Integer.MIN_VALUE;
                    } else {
                        xqd0Var = new xqd0(this, fbkVar);
                    }
                } else {
                    xqd0Var = new xqd0(this, fbkVar);
                }
                Object obj2 = xqd0Var.f264967a;
                int i2 = xqd0Var.f264968b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    qho qhoVar2 = ohoVar != null ? (qho) ohoVar.f165512a : null;
                    Object obj3 = mzw0.f148803a;
                    if (qhoVar2 != null && !(qhoVar2 instanceof pho)) {
                        boolean z = qhoVar2 instanceof nho;
                        Object nzw0Var = lzw0.f138465a;
                        if (!z) {
                            if (!(qhoVar2 instanceof oho)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            m340 m340Var = ((erc1) ((oho) qhoVar2).f165512a).f62079a;
                            if (!m340Var.f139524a.isEmpty()) {
                                nzw0Var = new nzw0(m340Var);
                            }
                        }
                        obj3 = nzw0Var;
                    }
                    xqd0Var.f264968b = 1;
                    Object objEmit = this.f275195b.emit(obj3, xqd0Var);
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
                if (fbkVar instanceof gvd0) {
                    gvd0Var = (gvd0) fbkVar;
                    int i3 = gvd0Var.f84724b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gvd0Var.f84724b = i3 - Integer.MIN_VALUE;
                    } else {
                        gvd0Var = new gvd0(this, fbkVar);
                    }
                } else {
                    gvd0Var = new gvd0(this, fbkVar);
                }
                Object obj4 = gvd0Var.f84723a;
                int i4 = gvd0Var.f84724b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    qho qhoVar3 = (qho) obj;
                    qhoVar3.getClass();
                    if (!(qhoVar3 instanceof pho)) {
                        gvd0Var.f84724b = 1;
                        Object objEmit2 = this.f275195b.emit(obj, gvd0Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof fxd0) {
                    fxd0Var = (fxd0) fbkVar;
                    int i5 = fxd0Var.f74347b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fxd0Var.f74347b = i5 - Integer.MIN_VALUE;
                    } else {
                        fxd0Var = new fxd0(this, fbkVar);
                    }
                } else {
                    fxd0Var = new fxd0(this, fbkVar);
                }
                Object obj5 = fxd0Var.f74346a;
                int i6 = fxd0Var.f74347b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    axd0 axd0Var = new axd0((jwd0) obj);
                    fxd0Var.f74347b = 1;
                    Object objEmit3 = this.f275195b.emit(axd0Var, fxd0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof kyd0) {
                    kyd0Var = (kyd0) fbkVar;
                    int i7 = kyd0Var.f127803b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kyd0Var.f127803b = i7 - Integer.MIN_VALUE;
                    } else {
                        kyd0Var = new kyd0(this, fbkVar);
                    }
                } else {
                    kyd0Var = new kyd0(this, fbkVar);
                }
                Object obj6 = kyd0Var.f127802a;
                int i8 = kyd0Var.f127803b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new kjk((String) entry.getKey(), (List) entry.getValue()));
                    }
                    kyd0Var.f127803b = 1;
                    Object objEmit4 = this.f275195b.emit(arrayList, kyd0Var);
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
                if (fbkVar instanceof vyd0) {
                    vyd0Var = (vyd0) fbkVar;
                    int i9 = vyd0Var.f246069b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vyd0Var.f246069b = i9 - Integer.MIN_VALUE;
                    } else {
                        vyd0Var = new vyd0(this, fbkVar);
                    }
                } else {
                    vyd0Var = new vyd0(this, fbkVar);
                }
                Object obj7 = vyd0Var.f246068a;
                int i10 = vyd0Var.f246069b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    gad gadVar = new gad((List) obj);
                    vyd0Var.f246069b = 1;
                    Object objEmit5 = this.f275195b.emit(gadVar, vyd0Var);
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
                if (fbkVar instanceof a0e0) {
                    a0e0Var = (a0e0) fbkVar;
                    int i11 = a0e0Var.f11066b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        a0e0Var.f11066b = i11 - Integer.MIN_VALUE;
                    } else {
                        a0e0Var = new a0e0(this, fbkVar);
                    }
                } else {
                    a0e0Var = new a0e0(this, fbkVar);
                }
                Object obj8 = a0e0Var.f11065a;
                int i12 = a0e0Var.f11066b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    Object objM85619a = vie1.m85619a((qho) obj);
                    a0e0Var.f11066b = 1;
                    Object objEmit6 = this.f275195b.emit(objM85619a, a0e0Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof r0e0) {
                    r0e0Var = (r0e0) fbkVar;
                    int i13 = r0e0Var.f194475b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        r0e0Var.f194475b = i13 - Integer.MIN_VALUE;
                    } else {
                        r0e0Var = new r0e0(this, fbkVar);
                    }
                } else {
                    r0e0Var = new r0e0(this, fbkVar);
                }
                Object obj9 = r0e0Var.f194474a;
                int i14 = r0e0Var.f194475b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    Object objM85619a2 = vie1.m85619a((qho) obj);
                    r0e0Var.f194475b = 1;
                    Object objEmit7 = this.f275195b.emit(objM85619a2, r0e0Var);
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
                if (fbkVar instanceof s1e0) {
                    s1e0Var = (s1e0) fbkVar;
                    int i15 = s1e0Var.f204695b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        s1e0Var.f204695b = i15 - Integer.MIN_VALUE;
                    } else {
                        s1e0Var = new s1e0(this, fbkVar);
                    }
                } else {
                    s1e0Var = new s1e0(this, fbkVar);
                }
                Object obj10 = s1e0Var.f204694a;
                int i16 = s1e0Var.f204695b;
                if (i16 == 0) {
                    bga.m29073P(obj10);
                    qho qhoVar4 = (qho) obj;
                    oho ohoVar2 = qhoVar4 instanceof oho ? (oho) qhoVar4 : null;
                    n1e0 n1e0Var = ohoVar2 != null ? (n1e0) ohoVar2.f165512a : null;
                    if (n1e0Var != null) {
                        s1e0Var.f204695b = 1;
                        Object objEmit8 = this.f275195b.emit(n1e0Var, s1e0Var);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof z2e0) {
                    z2e0Var = (z2e0) fbkVar;
                    int i17 = z2e0Var.f278556b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        z2e0Var.f278556b = i17 - Integer.MIN_VALUE;
                    } else {
                        z2e0Var = new z2e0(this, fbkVar);
                    }
                } else {
                    z2e0Var = new z2e0(this, fbkVar);
                }
                Object obj11 = z2e0Var.f278555a;
                int i18 = z2e0Var.f278556b;
                if (i18 == 0) {
                    bga.m29073P(obj11);
                    y2e0 y2e0Var = new y2e0((zbr) obj);
                    z2e0Var.f278556b = 1;
                    Object objEmit9 = this.f275195b.emit(y2e0Var, z2e0Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof t3e0) {
                    t3e0Var = (t3e0) fbkVar;
                    int i19 = t3e0Var.f216756b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        t3e0Var.f216756b = i19 - Integer.MIN_VALUE;
                    } else {
                        t3e0Var = new t3e0(this, fbkVar);
                    }
                } else {
                    t3e0Var = new t3e0(this, fbkVar);
                }
                Object obj12 = t3e0Var.f216755a;
                int i20 = t3e0Var.f216756b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    Object objM85619a3 = vie1.m85619a((qho) obj);
                    t3e0Var.f216756b = 1;
                    Object objEmit10 = this.f275195b.emit(objM85619a3, t3e0Var);
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
                if (fbkVar instanceof j4e0) {
                    j4e0Var = (j4e0) fbkVar;
                    int i21 = j4e0Var.f108677b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        j4e0Var.f108677b = i21 - Integer.MIN_VALUE;
                    } else {
                        j4e0Var = new j4e0(this, fbkVar);
                    }
                } else {
                    j4e0Var = new j4e0(this, fbkVar);
                }
                Object obj13 = j4e0Var.f108676a;
                int i22 = j4e0Var.f108677b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    Object objM85619a4 = vie1.m85619a((qho) obj);
                    j4e0Var.f108677b = 1;
                    Object objEmit11 = this.f275195b.emit(objM85619a4, j4e0Var);
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
                if (fbkVar instanceof r5e0) {
                    r5e0Var = (r5e0) fbkVar;
                    int i23 = r5e0Var.f196028b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        r5e0Var.f196028b = i23 - Integer.MIN_VALUE;
                    } else {
                        r5e0Var = new r5e0(this, fbkVar);
                    }
                } else {
                    r5e0Var = new r5e0(this, fbkVar);
                }
                Object obj14 = r5e0Var.f196027a;
                int i24 = r5e0Var.f196028b;
                if (i24 == 0) {
                    bga.m29073P(obj14);
                    k5e0 k5e0Var = new k5e0((ebf0) obj);
                    r5e0Var.f196028b = 1;
                    Object objEmit12 = this.f275195b.emit(k5e0Var, r5e0Var);
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
                if (fbkVar instanceof g7e0) {
                    g7e0Var = (g7e0) fbkVar;
                    int i25 = g7e0Var.f77252b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        g7e0Var.f77252b = i25 - Integer.MIN_VALUE;
                    } else {
                        g7e0Var = new g7e0(this, fbkVar);
                    }
                } else {
                    g7e0Var = new g7e0(this, fbkVar);
                }
                Object obj15 = g7e0Var.f77251a;
                int i26 = g7e0Var.f77252b;
                if (i26 == 0) {
                    bga.m29073P(obj15);
                    Object objM85619a5 = vie1.m85619a((qho) obj);
                    g7e0Var.f77252b = 1;
                    Object objEmit13 = this.f275195b.emit(objM85619a5, g7e0Var);
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
                if (fbkVar instanceof r7e0) {
                    r7e0Var = (r7e0) fbkVar;
                    int i27 = r7e0Var.f196505b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        r7e0Var.f196505b = i27 - Integer.MIN_VALUE;
                    } else {
                        r7e0Var = new r7e0(this, fbkVar);
                    }
                } else {
                    r7e0Var = new r7e0(this, fbkVar);
                }
                Object obj16 = r7e0Var.f196504a;
                int i28 = r7e0Var.f196505b;
                if (i28 == 0) {
                    bga.m29073P(obj16);
                    n7e0 n7e0Var = new n7e0((ebf0) obj, gbu.f78413a);
                    r7e0Var.f196505b = 1;
                    Object objEmit14 = this.f275195b.emit(n7e0Var, r7e0Var);
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
                if (fbkVar instanceof t8e0) {
                    t8e0Var = (t8e0) fbkVar;
                    int i29 = t8e0Var.f218072b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        t8e0Var.f218072b = i29 - Integer.MIN_VALUE;
                    } else {
                        t8e0Var = new t8e0(this, fbkVar);
                    }
                } else {
                    t8e0Var = new t8e0(this, fbkVar);
                }
                Object obj17 = t8e0Var.f218071a;
                int i30 = t8e0Var.f218072b;
                if (i30 == 0) {
                    bga.m29073P(obj17);
                    p2x0 p2x0Var = (p2x0) obj;
                    if (p2x0Var instanceof m2x0) {
                        r8e0Var = new r8e0(wj50.m88271j(((hz80) ((m2x0) p2x0Var).f139474a).f96822X.get("membership_badge_enabled"), "true"));
                    } else {
                        if (!(p2x0Var instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r8e0Var = q8e0.f186310a;
                    }
                    t8e0Var.f218072b = 1;
                    Object objEmit15 = this.f275195b.emit(r8e0Var, t8e0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof zde0) {
                    zde0Var = (zde0) fbkVar;
                    int i31 = zde0Var.f281705b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        zde0Var.f281705b = i31 - Integer.MIN_VALUE;
                    } else {
                        zde0Var = new zde0(this, fbkVar);
                    }
                } else {
                    zde0Var = new zde0(this, fbkVar);
                }
                Object obj18 = zde0Var.f281704a;
                int i32 = zde0Var.f281705b;
                if (i32 == 0) {
                    bga.m29073P(obj18);
                    qde0 qde0Var = new qde0((e0e) obj);
                    zde0Var.f281705b = 1;
                    Object objEmit16 = this.f275195b.emit(qde0Var, zde0Var);
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
                if (fbkVar instanceof ate0) {
                    ate0Var = (ate0) fbkVar;
                    int i33 = ate0Var.f19664b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ate0Var.f19664b = i33 - Integer.MIN_VALUE;
                    } else {
                        ate0Var = new ate0(this, fbkVar);
                    }
                } else {
                    ate0Var = new ate0(this, fbkVar);
                }
                Object obj19 = ate0Var.f19663a;
                int i34 = ate0Var.f19664b;
                if (i34 == 0) {
                    bga.m29073P(obj19);
                    zse0 zse0Var = (zse0) obj;
                    if (!zse0Var.f285932b.isEmpty() || !zse0Var.f285933c.isEmpty()) {
                        ate0Var.f19664b = 1;
                        Object objEmit17 = this.f275195b.emit(obj, ate0Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof c9f0) {
                    c9f0Var = (c9f0) fbkVar;
                    int i35 = c9f0Var.f35516b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        c9f0Var.f35516b = i35 - Integer.MIN_VALUE;
                    } else {
                        c9f0Var = new c9f0(this, fbkVar);
                    }
                } else {
                    c9f0Var = new c9f0(this, fbkVar);
                }
                Object obj20 = c9f0Var.f35515a;
                int i36 = c9f0Var.f35516b;
                if (i36 == 0) {
                    bga.m29073P(obj20);
                    qho qhoVar5 = (qho) obj;
                    lnn0 lnn0Var = null;
                    oho ohoVar3 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                    if (ohoVar3 != null && (hz80Var = (hz80) ohoVar3.f165512a) != null) {
                        lnn0Var = hz80Var.f96833i;
                    }
                    Boolean boolValueOf = Boolean.valueOf(lnn0Var == lnn0.f135184c);
                    c9f0Var.f35516b = 1;
                    Object objEmit18 = this.f275195b.emit(boolValueOf, c9f0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof off0) {
                    off0Var = (off0) fbkVar;
                    int i37 = off0Var.f164751b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        off0Var.f164751b = i37 - Integer.MIN_VALUE;
                    } else {
                        off0Var = new off0(this, fbkVar);
                    }
                } else {
                    off0Var = new off0(this, fbkVar);
                }
                Object obj21 = off0Var.f164750a;
                int i38 = off0Var.f164751b;
                if (i38 == 0) {
                    bga.m29073P(obj21);
                    Object obj22 = ((yk91) obj).f273652c;
                    off0Var.f164751b = 1;
                    Object objEmit19 = this.f275195b.emit(obj22, off0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof rff0) {
                    rff0Var = (rff0) fbkVar;
                    int i39 = rff0Var.f198643b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rff0Var.f198643b = i39 - Integer.MIN_VALUE;
                    } else {
                        rff0Var = new rff0(this, fbkVar);
                    }
                } else {
                    rff0Var = new rff0(this, fbkVar);
                }
                Object obj23 = rff0Var.f198642a;
                int i40 = rff0Var.f198643b;
                if (i40 == 0) {
                    bga.m29073P(obj23);
                    if (((xul0) obj).mo49279c()) {
                        rff0Var.f198643b = 1;
                        Object objEmit20 = this.f275195b.emit(obj, rff0Var);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof tff0) {
                    tff0Var = (tff0) fbkVar;
                    int i41 = tff0Var.f219950b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        tff0Var.f219950b = i41 - Integer.MIN_VALUE;
                    } else {
                        tff0Var = new tff0(this, fbkVar);
                    }
                } else {
                    tff0Var = new tff0(this, fbkVar);
                }
                Object obj24 = tff0Var.f219949a;
                int i42 = tff0Var.f219950b;
                if (i42 == 0) {
                    bga.m29073P(obj24);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    tff0Var.f219950b = 1;
                    Object objEmit21 = this.f275195b.emit(boolValueOf2, tff0Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof xff0) {
                    xff0Var = (xff0) fbkVar;
                    int i43 = xff0Var.f260954b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        xff0Var.f260954b = i43 - Integer.MIN_VALUE;
                    } else {
                        xff0Var = new xff0(this, fbkVar);
                    }
                } else {
                    xff0Var = new xff0(this, fbkVar);
                }
                Object obj25 = xff0Var.f260953a;
                int i44 = xff0Var.f260954b;
                if (i44 == 0) {
                    bga.m29073P(obj25);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        xff0Var.f260954b = 1;
                        Object objEmit22 = this.f275195b.emit(obj, xff0Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit22 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof zff0) {
                    zff0Var = (zff0) fbkVar;
                    int i45 = zff0Var.f282305b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        zff0Var.f282305b = i45 - Integer.MIN_VALUE;
                    } else {
                        zff0Var = new zff0(this, fbkVar);
                    }
                } else {
                    zff0Var = new zff0(this, fbkVar);
                }
                Object obj26 = zff0Var.f282304a;
                int i46 = zff0Var.f282305b;
                if (i46 == 0) {
                    bga.m29073P(obj26);
                    qho qhoVar6 = (qho) obj;
                    oho ohoVar4 = qhoVar6 instanceof oho ? (oho) qhoVar6 : null;
                    i490 i490Var = ohoVar4 != null ? (i490) ohoVar4.f165512a : null;
                    if (i490Var != null) {
                        zff0Var.f282305b = 1;
                        Object objEmit23 = this.f275195b.emit(i490Var, zff0Var);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit23 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof bgf0) {
                    bgf0Var = (bgf0) fbkVar;
                    int i47 = bgf0Var.f26936b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        bgf0Var.f26936b = i47 - Integer.MIN_VALUE;
                    } else {
                        bgf0Var = new bgf0(this, fbkVar);
                    }
                } else {
                    bgf0Var = new bgf0(this, fbkVar);
                }
                Object obj27 = bgf0Var.f26935a;
                int i48 = bgf0Var.f26936b;
                if (i48 == 0) {
                    bga.m29073P(obj27);
                    f5k f5kVarM71038d = !((uvf0) obj).m84056b() ? null : pu1.m71038d();
                    bgf0Var.f26936b = 1;
                    Object objEmit24 = this.f275195b.emit(f5kVarM71038d, bgf0Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof lgf0) {
                    lgf0Var = (lgf0) fbkVar;
                    int i49 = lgf0Var.f133214b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        lgf0Var.f133214b = i49 - Integer.MIN_VALUE;
                    } else {
                        lgf0Var = new lgf0(this, fbkVar);
                    }
                } else {
                    lgf0Var = new lgf0(this, fbkVar);
                }
                Object obj28 = lgf0Var.f133213a;
                int i50 = lgf0Var.f133214b;
                if (i50 == 0) {
                    bga.m29073P(obj28);
                    Boolean boolValueOf3 = Boolean.valueOf(((uvf0) obj).m84056b());
                    lgf0Var.f133214b = 1;
                    Object objEmit25 = this.f275195b.emit(boolValueOf3, lgf0Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof mgf0) {
                    mgf0Var = (mgf0) fbkVar;
                    int i51 = mgf0Var.f143462b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        mgf0Var.f143462b = i51 - Integer.MIN_VALUE;
                    } else {
                        mgf0Var = new mgf0(this, fbkVar);
                    }
                } else {
                    mgf0Var = new mgf0(this, fbkVar);
                }
                Object obj29 = mgf0Var.f143461a;
                int i52 = mgf0Var.f143462b;
                if (i52 == 0) {
                    bga.m29073P(obj29);
                    qho qhoVar7 = (qho) obj;
                    uzw uzwVar = null;
                    oho ohoVar5 = qhoVar7 instanceof oho ? (oho) qhoVar7 : null;
                    if (ohoVar5 != null && (list = (List) ohoVar5.f165512a) != null) {
                        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new cfv0("", ((dx80) it.next()).f53899c, false, lau.f131415a, null, false, false, true, false, aro0.f19114a, false, false));
                        }
                        uzwVar = new uzw(12, arrayList2);
                    }
                    if (uzwVar != null) {
                        mgf0Var.f143462b = 1;
                        Object objEmit26 = this.f275195b.emit(uzwVar, mgf0Var);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof dif0) {
                    dif0Var = (dif0) fbkVar;
                    int i53 = dif0Var.f49355b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        dif0Var.f49355b = i53 - Integer.MIN_VALUE;
                    } else {
                        dif0Var = new dif0(this, fbkVar);
                    }
                } else {
                    dif0Var = new dif0(this, fbkVar);
                }
                Object obj30 = dif0Var.f49354a;
                int i54 = dif0Var.f49355b;
                if (i54 == 0) {
                    bga.m29073P(obj30);
                    Map map2 = ((ty80) obj).f224877f.f271272q;
                    dif0Var.f49355b = 1;
                    Object objEmit27 = this.f275195b.emit(map2, dif0Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof iif0) {
                    iif0Var = (iif0) fbkVar;
                    int i55 = iif0Var.f102555b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        iif0Var.f102555b = i55 - Integer.MIN_VALUE;
                    } else {
                        iif0Var = new iif0(this, fbkVar);
                    }
                } else {
                    iif0Var = new iif0(this, fbkVar);
                }
                Object obj31 = iif0Var.f102554a;
                int i56 = iif0Var.f102555b;
                if (i56 == 0) {
                    bga.m29073P(obj31);
                    Map map3 = ((ty80) obj).f224877f.f271272q;
                    iif0Var.f102555b = 1;
                    Object objEmit28 = this.f275195b.emit(map3, iif0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof kif0) {
                    kif0Var = (kif0) fbkVar;
                    int i57 = kif0Var.f122960b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        kif0Var.f122960b = i57 - Integer.MIN_VALUE;
                    } else {
                        kif0Var = new kif0(this, fbkVar);
                    }
                } else {
                    kif0Var = new kif0(this, fbkVar);
                }
                Object obj32 = kif0Var.f122959a;
                int i58 = kif0Var.f122960b;
                if (i58 == 0) {
                    bga.m29073P(obj32);
                    Boolean boolValueOf4 = Boolean.valueOf(((bw7) obj).f31569a);
                    kif0Var.f122960b = 1;
                    Object objEmit29 = this.f275195b.emit(boolValueOf4, kif0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof lif0) {
                    lif0Var = (lif0) fbkVar;
                    int i59 = lif0Var.f133789b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        lif0Var.f133789b = i59 - Integer.MIN_VALUE;
                    } else {
                        lif0Var = new lif0(this, fbkVar);
                    }
                } else {
                    lif0Var = new lif0(this, fbkVar);
                }
                Object obj33 = lif0Var.f133788a;
                int i60 = lif0Var.f133789b;
                if (i60 == 0) {
                    bga.m29073P(obj33);
                    Boolean boolValueOf5 = Boolean.valueOf(((s431) obj).f205428a != r431.f195645a);
                    lif0Var.f133789b = 1;
                    Object objEmit30 = this.f275195b.emit(boolValueOf5, lif0Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ yqd0(niz nizVar, Object obj, int i) {
        this.f275194a = i;
        this.f275195b = nizVar;
    }
}
