package p204p;

import com.spotify.socialprompting.p151v1.SocialPromptingPusherMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class s98 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f206883b;

    public /* synthetic */ s98(niz nizVar, int i) {
        this.f206882a = i;
        this.f206883b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01db  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:210:0x0341  */
    /* JADX WARN: Code duplicated, block: B:229:0x038d  */
    /* JADX WARN: Code duplicated, block: B:250:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:267:0x042e  */
    /* JADX WARN: Code duplicated, block: B:288:0x047b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:305:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:329:0x051b  */
    /* JADX WARN: Code duplicated, block: B:346:0x0566  */
    /* JADX WARN: Code duplicated, block: B:369:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:386:0x060d  */
    /* JADX WARN: Code duplicated, block: B:405:0x065a  */
    /* JADX WARN: Code duplicated, block: B:424:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:441:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:466:0x074b  */
    /* JADX WARN: Code duplicated, block: B:485:0x0792  */
    /* JADX WARN: Code duplicated, block: B:504:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:523:0x0820  */
    /* JADX WARN: Code duplicated, block: B:544:0x086d  */
    /* JADX WARN: Code duplicated, block: B:561:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:578:0x0905  */
    /* JADX WARN: Code duplicated, block: B:606:0x0967  */
    /* JADX WARN: Code duplicated, block: B:620:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        r98 r98Var;
        cc8 cc8Var;
        Object obj2;
        dc8 dc8Var;
        ec8 ec8Var;
        dv8 dv8Var;
        dw8 dw8Var;
        ew8 ew8Var;
        hw8 hw8Var;
        c09 c09Var;
        lnn0 lnn0Var;
        d09 d09Var;
        ri9 ri9Var;
        ti9 ti9Var;
        ui9 ui9Var;
        vi9 vi9Var;
        int i;
        zi9 zi9Var;
        kj9 kj9Var;
        xl9 xl9Var;
        zl9 zl9Var;
        sn9 sn9Var;
        ao9 ao9Var;
        ez9 ez9Var;
        qz9 qz9Var;
        vz9 vz9Var;
        s1a s1aVar;
        Object l1aVar;
        f6a f6aVar;
        e7a e7aVar;
        d7a d7aVar;
        ok11 ok11Var;
        bk11 bk11Var;
        oja ojaVar;
        rja rjaVar;
        fka fkaVar;
        Object objEmit;
        yuk yukVar;
        ima imaVar;
        switch (this.f206882a) {
            case 0:
                if (fbkVar instanceof r98) {
                    r98Var = (r98) fbkVar;
                    int i2 = r98Var.f196949b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        r98Var.f196949b = i2 - Integer.MIN_VALUE;
                    } else {
                        r98Var = new r98(this, fbkVar);
                    }
                } else {
                    r98Var = new r98(this, fbkVar);
                }
                Object obj3 = r98Var.f196948a;
                int i3 = r98Var.f196949b;
                if (i3 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                    r98Var.f196949b = 1;
                    Object objEmit2 = this.f206883b.emit(boolValueOf, r98Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof cc8) {
                    cc8Var = (cc8) fbkVar;
                    int i4 = cc8Var.f36339b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        cc8Var.f36339b = i4 - Integer.MIN_VALUE;
                    } else {
                        cc8Var = new cc8(this, fbkVar);
                    }
                } else {
                    cc8Var = new cc8(this, fbkVar);
                }
                Object obj4 = cc8Var.f36338a;
                int i5 = cc8Var.f36339b;
                if (i5 == 0) {
                    bga.m29073P(obj4);
                    n1a n1aVar = (n1a) obj;
                    if (wj50.m88271j(n1aVar, k1a.f118256a)) {
                        obj2 = vb8.f239435a;
                    } else {
                        if (!(n1aVar instanceof l1a) && !wj50.m88271j(n1aVar, m1a.f138909a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = wb8.f249704a;
                    }
                    cc8Var.f36339b = 1;
                    Object objEmit3 = this.f206883b.emit(obj2, cc8Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof dc8) {
                    dc8Var = (dc8) fbkVar;
                    int i6 = dc8Var.f47449b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        dc8Var.f47449b = i6 - Integer.MIN_VALUE;
                    } else {
                        dc8Var = new dc8(this, fbkVar);
                    }
                } else {
                    dc8Var = new dc8(this, fbkVar);
                }
                Object obj5 = dc8Var.f47448a;
                int i7 = dc8Var.f47449b;
                if (i7 == 0) {
                    bga.m29073P(obj5);
                    jc8 jc8Var = (jc8) obj;
                    xb8 xb8Var = new xb8(jc8Var.f111011a, jc8Var.f111012b);
                    dc8Var.f47449b = 1;
                    Object objEmit4 = this.f206883b.emit(xb8Var, dc8Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof ec8) {
                    ec8Var = (ec8) fbkVar;
                    int i8 = ec8Var.f58258b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ec8Var.f58258b = i8 - Integer.MIN_VALUE;
                    } else {
                        ec8Var = new ec8(this, fbkVar);
                    }
                } else {
                    ec8Var = new ec8(this, fbkVar);
                }
                Object obj6 = ec8Var.f58257a;
                int i9 = ec8Var.f58258b;
                if (i9 == 0) {
                    bga.m29073P(obj6);
                    o1a o1aVar = (o1a) obj;
                    yb8 yb8Var = new yb8(o1aVar.f160678a, o1aVar.f160679b, o1aVar.f160680c);
                    ec8Var.f58258b = 1;
                    Object objEmit5 = this.f206883b.emit(yb8Var, ec8Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof dv8) {
                    dv8Var = (dv8) fbkVar;
                    int i10 = dv8Var.f53390b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dv8Var.f53390b = i10 - Integer.MIN_VALUE;
                    } else {
                        dv8Var = new dv8(this, fbkVar);
                    }
                } else {
                    dv8Var = new dv8(this, fbkVar);
                }
                Object obj7 = dv8Var.f53389a;
                int i11 = dv8Var.f53390b;
                if (i11 == 0) {
                    bga.m29073P(obj7);
                    c0r0 c0r0Var = (c0r0) obj;
                    Object objSingletonList = c0r0Var != null ? Collections.singletonList(c0r0Var.f32851b) : lau.f131415a;
                    dv8Var.f53390b = 1;
                    Object objEmit6 = this.f206883b.emit(objSingletonList, dv8Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof dw8) {
                    dw8Var = (dw8) fbkVar;
                    int i12 = dw8Var.f53639b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dw8Var.f53639b = i12 - Integer.MIN_VALUE;
                    } else {
                        dw8Var = new dw8(this, fbkVar);
                    }
                } else {
                    dw8Var = new dw8(this, fbkVar);
                }
                Object obj8 = dw8Var.f53638a;
                int i13 = dw8Var.f53639b;
                if (i13 == 0) {
                    bga.m29073P(obj8);
                    if (((bw8) obj) == bw8.f31580d) {
                        dw8Var.f53639b = 1;
                        Object objEmit7 = this.f206883b.emit(obj, dw8Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof ew8) {
                    ew8Var = (ew8) fbkVar;
                    int i14 = ew8Var.f63452b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ew8Var.f63452b = i14 - Integer.MIN_VALUE;
                    } else {
                        ew8Var = new ew8(this, fbkVar);
                    }
                } else {
                    ew8Var = new ew8(this, fbkVar);
                }
                Object obj9 = ew8Var.f63451a;
                int i15 = ew8Var.f63452b;
                if (i15 == 0) {
                    bga.m29073P(obj9);
                    if (((bw8) obj) == bw8.f31579c) {
                        ew8Var.f63452b = 1;
                        Object objEmit8 = this.f206883b.emit(obj, ew8Var);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof hw8) {
                    hw8Var = (hw8) fbkVar;
                    int i16 = hw8Var.f95879b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        hw8Var.f95879b = i16 - Integer.MIN_VALUE;
                    } else {
                        hw8Var = new hw8(this, fbkVar);
                    }
                } else {
                    hw8Var = new hw8(this, fbkVar);
                }
                Object obj10 = hw8Var.f95878a;
                int i17 = hw8Var.f95879b;
                if (i17 == 0) {
                    bga.m29073P(obj10);
                    if (((bw8) obj) == bw8.f31578b) {
                        hw8Var.f95879b = 1;
                        Object objEmit9 = this.f206883b.emit(obj, hw8Var);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof c09) {
                    c09Var = (c09) fbkVar;
                    int i18 = c09Var.f32715b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c09Var.f32715b = i18 - Integer.MIN_VALUE;
                    } else {
                        c09Var = new c09(this, fbkVar);
                    }
                } else {
                    c09Var = new c09(this, fbkVar);
                }
                Object obj11 = c09Var.f32714a;
                int i19 = c09Var.f32715b;
                if (i19 == 0) {
                    bga.m29073P(obj11);
                    p2x0 p2x0Var = (p2x0) obj;
                    if (p2x0Var instanceof m2x0) {
                        lnn0Var = ((hz80) ((m2x0) p2x0Var).f139474a).f96833i;
                    } else {
                        if (!(p2x0Var instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lnn0Var = lnn0.f135183b;
                    }
                    c09Var.f32715b = 1;
                    Object objEmit10 = this.f206883b.emit(lnn0Var, c09Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof d09) {
                    d09Var = (d09) fbkVar;
                    int i20 = d09Var.f43814b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        d09Var.f43814b = i20 - Integer.MIN_VALUE;
                    } else {
                        d09Var = new d09(this, fbkVar);
                    }
                } else {
                    d09Var = new d09(this, fbkVar);
                }
                Object obj12 = d09Var.f43813a;
                int i21 = d09Var.f43814b;
                if (i21 == 0) {
                    bga.m29073P(obj12);
                    b09 b09Var = new b09((lnn0) obj);
                    d09Var.f43814b = 1;
                    Object objEmit11 = this.f206883b.emit(b09Var, d09Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof ri9) {
                    ri9Var = (ri9) fbkVar;
                    int i22 = ri9Var.f199460b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        ri9Var.f199460b = i22 - Integer.MIN_VALUE;
                    } else {
                        ri9Var = new ri9(this, fbkVar);
                    }
                } else {
                    ri9Var = new ri9(this, fbkVar);
                }
                Object obj13 = ri9Var.f199459a;
                int i23 = ri9Var.f199460b;
                if (i23 == 0) {
                    bga.m29073P(obj13);
                    if (wj50.m88271j(((sc8) obj).mo72524D(), l5j.f129959b)) {
                        ri9Var.f199460b = 1;
                        Object objEmit12 = this.f206883b.emit(obj, ri9Var);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof ti9) {
                    ti9Var = (ti9) fbkVar;
                    int i24 = ti9Var.f220579b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ti9Var.f220579b = i24 - Integer.MIN_VALUE;
                    } else {
                        ti9Var = new ti9(this, fbkVar);
                    }
                } else {
                    ti9Var = new ti9(this, fbkVar);
                }
                Object obj14 = ti9Var.f220578a;
                int i25 = ti9Var.f220579b;
                if (i25 == 0) {
                    bga.m29073P(obj14);
                    if (((yc8) obj).f271427d.contains(l5j.f129959b)) {
                        ti9Var.f220579b = 1;
                        Object objEmit13 = this.f206883b.emit(obj, ti9Var);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit13 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof ui9) {
                    ui9Var = (ui9) fbkVar;
                    int i26 = ui9Var.f230641b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ui9Var.f230641b = i26 - Integer.MIN_VALUE;
                    } else {
                        ui9Var = new ui9(this, fbkVar);
                    }
                } else {
                    ui9Var = new ui9(this, fbkVar);
                }
                Object obj15 = ui9Var.f230640a;
                int i27 = ui9Var.f230641b;
                if (i27 == 0) {
                    bga.m29073P(obj15);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Map) obj).isEmpty());
                    ui9Var.f230641b = 1;
                    Object objEmit14 = this.f206883b.emit(boolValueOf2, ui9Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof vi9) {
                    vi9Var = (vi9) fbkVar;
                    int i28 = vi9Var.f241647b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        vi9Var.f241647b = i28 - Integer.MIN_VALUE;
                    } else {
                        vi9Var = new vi9(this, fbkVar);
                    }
                } else {
                    vi9Var = new vi9(this, fbkVar);
                }
                Object obj16 = vi9Var.f241646a;
                int i29 = vi9Var.f241647b;
                yuk yukVar15 = yuk.f276404a;
                if (i29 != 0) {
                    if (i29 == 1) {
                        i = vi9Var.f241649d;
                        bga.m29073P(obj16);
                    } else {
                        if (i29 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj16);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj16);
                vi9Var.f241649d = 0;
                vi9Var.f241647b = 1;
                if (this.f206883b.emit((Map) obj, vi9Var) == yukVar15) {
                    return yukVar15;
                }
                i = 0;
                vi9Var.f241649d = i;
                vi9Var.f241647b = 2;
                if (njg1.m64619l(1000L, vi9Var) == yukVar15) {
                    return yukVar15;
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof zi9) {
                    zi9Var = (zi9) fbkVar;
                    int i30 = zi9Var.f283120b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        zi9Var.f283120b = i30 - Integer.MIN_VALUE;
                    } else {
                        zi9Var = new zi9(this, fbkVar);
                    }
                } else {
                    zi9Var = new zi9(this, fbkVar);
                }
                Object obj17 = zi9Var.f283119a;
                int i31 = zi9Var.f283120b;
                if (i31 == 0) {
                    bga.m29073P(obj17);
                    Boolean boolValueOf3 = Boolean.valueOf(!((Map) obj).isEmpty());
                    zi9Var.f283120b = 1;
                    Object objEmit15 = this.f206883b.emit(boolValueOf3, zi9Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit15 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof kj9) {
                    kj9Var = (kj9) fbkVar;
                    int i32 = kj9Var.f123269b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        kj9Var.f123269b = i32 - Integer.MIN_VALUE;
                    } else {
                        kj9Var = new kj9(this, fbkVar);
                    }
                } else {
                    kj9Var = new kj9(this, fbkVar);
                }
                Object obj18 = kj9Var.f123268a;
                int i33 = kj9Var.f123269b;
                if (i33 == 0) {
                    bga.m29073P(obj18);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Boolean boolValueOf4 = Boolean.valueOf(ohoVar != null ? ((Boolean) ohoVar.f165512a).booleanValue() : false);
                    kj9Var.f123269b = 1;
                    Object objEmit16 = this.f206883b.emit(boolValueOf4, kj9Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit16 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof xl9) {
                    xl9Var = (xl9) fbkVar;
                    int i34 = xl9Var.f263068b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        xl9Var.f263068b = i34 - Integer.MIN_VALUE;
                    } else {
                        xl9Var = new xl9(this, fbkVar);
                    }
                } else {
                    xl9Var = new xl9(this, fbkVar);
                }
                Object obj19 = xl9Var.f263067a;
                int i35 = xl9Var.f263068b;
                if (i35 == 0) {
                    bga.m29073P(obj19);
                    String str = ((ty80) obj).f224877f.f271271p;
                    xl9Var.f263068b = 1;
                    Object objEmit17 = this.f206883b.emit(str, xl9Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit17 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof zl9) {
                    zl9Var = (zl9) fbkVar;
                    int i36 = zl9Var.f283949b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        zl9Var.f283949b = i36 - Integer.MIN_VALUE;
                    } else {
                        zl9Var = new zl9(this, fbkVar);
                    }
                } else {
                    zl9Var = new zl9(this, fbkVar);
                }
                Object obj20 = zl9Var.f283948a;
                int i37 = zl9Var.f283949b;
                if (i37 == 0) {
                    bga.m29073P(obj20);
                    Boolean boolValueOf5 = Boolean.valueOf(((u300) obj) == u300.BLEND);
                    zl9Var.f283949b = 1;
                    Object objEmit18 = this.f206883b.emit(boolValueOf5, zl9Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit18 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof sn9) {
                    sn9Var = (sn9) fbkVar;
                    int i38 = sn9Var.f210855b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        sn9Var.f210855b = i38 - Integer.MIN_VALUE;
                    } else {
                        sn9Var = new sn9(this, fbkVar);
                    }
                } else {
                    sn9Var = new sn9(this, fbkVar);
                }
                Object obj21 = sn9Var.f210854a;
                int i39 = sn9Var.f210855b;
                if (i39 == 0) {
                    bga.m29073P(obj21);
                    Boolean boolValueOf6 = Boolean.valueOf(ttg1.m81517l(((ty80) obj).f224877f.f271272q));
                    sn9Var.f210855b = 1;
                    Object objEmit19 = this.f206883b.emit(boolValueOf6, sn9Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit19 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof ao9) {
                    ao9Var = (ao9) fbkVar;
                    int i40 = ao9Var.f17609b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        ao9Var.f17609b = i40 - Integer.MIN_VALUE;
                    } else {
                        ao9Var = new ao9(this, fbkVar);
                    }
                } else {
                    ao9Var = new ao9(this, fbkVar);
                }
                Object obj22 = ao9Var.f17608a;
                int i41 = ao9Var.f17609b;
                if (i41 == 0) {
                    bga.m29073P(obj22);
                    SocialPromptingPusherMessage socialPromptingPusherMessage = (SocialPromptingPusherMessage) obj;
                    if (socialPromptingPusherMessage.m21463n() == d310.GENERATION_STATUS_COMPLETE || socialPromptingPusherMessage.m21463n() == d310.GENERATION_STATUS_ERROR) {
                        ao9Var.f17609b = 1;
                        Object objEmit20 = this.f206883b.emit(obj, ao9Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit20 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof ez9) {
                    ez9Var = (ez9) fbkVar;
                    int i42 = ez9Var.f64307b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        ez9Var.f64307b = i42 - Integer.MIN_VALUE;
                    } else {
                        ez9Var = new ez9(this, fbkVar);
                    }
                } else {
                    ez9Var = new ez9(this, fbkVar);
                }
                Object obj23 = ez9Var.f64306a;
                int i43 = ez9Var.f64307b;
                if (i43 == 0) {
                    bga.m29073P(obj23);
                    Boolean bool = (Boolean) obj;
                    wj50.m88279p(bool);
                    if (bool.booleanValue()) {
                        ez9Var.f64307b = 1;
                        Object objEmit21 = this.f206883b.emit(obj, ez9Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit21 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof qz9) {
                    qz9Var = (qz9) fbkVar;
                    int i44 = qz9Var.f194148b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        qz9Var.f194148b = i44 - Integer.MIN_VALUE;
                    } else {
                        qz9Var = new qz9(this, fbkVar);
                    }
                } else {
                    qz9Var = new qz9(this, fbkVar);
                }
                Object obj24 = qz9Var.f194147a;
                int i45 = qz9Var.f194148b;
                if (i45 == 0) {
                    bga.m29073P(obj24);
                    if (((xul0) obj).mo49279c()) {
                        qz9Var.f194148b = 1;
                        Object objEmit22 = this.f206883b.emit(obj, qz9Var);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit22 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof vz9) {
                    vz9Var = (vz9) fbkVar;
                    int i46 = vz9Var.f246415b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        vz9Var.f246415b = i46 - Integer.MIN_VALUE;
                    } else {
                        vz9Var = new vz9(this, fbkVar);
                    }
                } else {
                    vz9Var = new vz9(this, fbkVar);
                }
                Object obj25 = vz9Var.f246414a;
                int i47 = vz9Var.f246415b;
                if (i47 == 0) {
                    bga.m29073P(obj25);
                    uz9 uz9Var = new uz9((o3a) obj);
                    vz9Var.f246415b = 1;
                    Object objEmit23 = this.f206883b.emit(uz9Var, vz9Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit23 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof s1a) {
                    s1aVar = (s1a) fbkVar;
                    int i48 = s1aVar.f204646b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        s1aVar.f204646b = i48 - Integer.MIN_VALUE;
                    } else {
                        s1aVar = new s1a(this, fbkVar);
                    }
                } else {
                    s1aVar = new s1a(this, fbkVar);
                }
                Object obj26 = s1aVar.f204645a;
                int i49 = s1aVar.f204646b;
                if (i49 == 0) {
                    bga.m29073P(obj26);
                    znj0 znj0Var = (znj0) obj;
                    if (znj0Var.equals(wnj0.f253196a)) {
                        l1aVar = k1a.f118256a;
                    } else if (znj0Var instanceof xnj0) {
                        l1aVar = new l1a(((xnj0) znj0Var).f263633a);
                    } else {
                        if (!znj0Var.equals(ynj0.f274464a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l1aVar = m1a.f138909a;
                    }
                    s1aVar.f204646b = 1;
                    Object objEmit24 = this.f206883b.emit(l1aVar, s1aVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit24 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof f6a) {
                    f6aVar = (f6a) fbkVar;
                    int i50 = f6aVar.f66342b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        f6aVar.f66342b = i50 - Integer.MIN_VALUE;
                    } else {
                        f6aVar = new f6a(this, fbkVar);
                    }
                } else {
                    f6aVar = new f6a(this, fbkVar);
                }
                Object obj27 = f6aVar.f66341a;
                int i51 = f6aVar.f66342b;
                if (i51 == 0) {
                    bga.m29073P(obj27);
                    qf40<q6a> qf40Var = (qf40) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                    for (q6a q6aVar : qf40Var) {
                        arrayList.add(new sec1(q6aVar, q6aVar.toString()));
                    }
                    f6aVar.f66342b = 1;
                    Object objEmit25 = this.f206883b.emit(arrayList, f6aVar);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit25 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof e7a) {
                    e7aVar = (e7a) fbkVar;
                    int i52 = e7aVar.f56875b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        e7aVar.f56875b = i52 - Integer.MIN_VALUE;
                    } else {
                        e7aVar = new e7a(this, fbkVar);
                    }
                } else {
                    e7aVar = new e7a(this, fbkVar);
                }
                Object obj28 = e7aVar.f56874a;
                int i53 = e7aVar.f56875b;
                if (i53 == 0) {
                    bga.m29073P(obj28);
                    qho qhoVar2 = (qho) obj;
                    if (!(qhoVar2 instanceof oho) || (ok11Var = (ok11) ((oho) qhoVar2).f165512a) == null || (bk11Var = ok11Var.f166218f) == null) {
                        d7aVar = new d7a();
                    } else {
                        kk11 kk11Var = bk11Var.f27810b;
                        String str2 = kk11Var.f123484c;
                        double d = kk11Var.f123482a;
                        kk11 kk11Var2 = bk11Var.f27809a;
                        if (d <= kk11Var2.f123482a) {
                            str2 = null;
                        }
                        d7aVar = new d7a(kk11Var2.f123484c, str2, true);
                    }
                    e7aVar.f56875b = 1;
                    Object objEmit26 = this.f206883b.emit(d7aVar, e7aVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit26 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof oja) {
                    ojaVar = (oja) fbkVar;
                    int i54 = ojaVar.f166022b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ojaVar.f166022b = i54 - Integer.MIN_VALUE;
                    } else {
                        ojaVar = new oja(this, fbkVar);
                    }
                } else {
                    ojaVar = new oja(this, fbkVar);
                }
                Object obj29 = ojaVar.f166021a;
                int i55 = ojaVar.f166022b;
                if (i55 == 0) {
                    bga.m29073P(obj29);
                    if (((Boolean) obj).booleanValue()) {
                        ojaVar.f166022b = 1;
                        Object objEmit27 = this.f206883b.emit(obj, ojaVar);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit27 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof rja) {
                    rjaVar = (rja) fbkVar;
                    int i56 = rjaVar.f199782b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        rjaVar.f199782b = i56 - Integer.MIN_VALUE;
                    } else {
                        rjaVar = new rja(this, fbkVar);
                    }
                } else {
                    rjaVar = new rja(this, fbkVar);
                }
                Object obj30 = rjaVar.f199781a;
                int i57 = rjaVar.f199782b;
                if (i57 == 0) {
                    bga.m29073P(obj30);
                    if (((Boolean) obj).booleanValue()) {
                        rjaVar.f199782b = 1;
                        Object objEmit28 = this.f206883b.emit(obj, rjaVar);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit28 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof fka) {
                    fkaVar = (fka) fbkVar;
                    int i58 = fkaVar.f70513b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        fkaVar.f70513b = i58 - Integer.MIN_VALUE;
                    } else {
                        fkaVar = new fka(this, fbkVar);
                    }
                } else {
                    fkaVar = new fka(this, fbkVar);
                }
                Object obj31 = fkaVar.f70512a;
                int i59 = fkaVar.f70513b;
                if (i59 == 0) {
                    bga.m29073P(obj31);
                    p2x0 p2x0Var2 = (p2x0) obj;
                    if (p2x0Var2 instanceof k2x0) {
                        fkaVar.f70513b = 1;
                        objEmit = this.f206883b.emit(obj, fkaVar);
                        yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (!(p2x0Var2 instanceof m2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qu80 qu80Var = (qu80) ((m2x0) p2x0Var2).f139474a;
                        if (wj50.m88271j(qu80Var.f192599e.f271272q.get("status_code"), "204") || !qu80Var.f192598d.isEmpty()) {
                            fkaVar.f70513b = 1;
                            objEmit = this.f206883b.emit(obj, fkaVar);
                            yukVar = yuk.f276404a;
                            if (objEmit == yukVar) {
                                return yukVar;
                            }
                        }
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof ima) {
                    imaVar = (ima) fbkVar;
                    int i60 = imaVar.f103651b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        imaVar.f103651b = i60 - Integer.MIN_VALUE;
                    } else {
                        imaVar = new ima(this, fbkVar);
                    }
                } else {
                    imaVar = new ima(this, fbkVar);
                }
                Object obj32 = imaVar.f103650a;
                int i61 = imaVar.f103651b;
                if (i61 == 0) {
                    bga.m29073P(obj32);
                    if (((Boolean) obj).booleanValue()) {
                        imaVar.f103651b = 1;
                        Object objEmit29 = this.f206883b.emit(obj, imaVar);
                        yuk yukVar30 = yuk.f276404a;
                        if (objEmit29 == yukVar30) {
                            return yukVar30;
                        }
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
        }
    }
}
