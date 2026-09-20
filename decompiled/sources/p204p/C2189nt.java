package p204p;

import com.spotify.carapplibrary.androidauto.chapters.ChapterFetchException;
import com.spotify.socialprompting.p151v1.SocialPromptingPusherMessage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.nt */
/* JADX INFO: loaded from: classes4.dex */
public final class C2189nt implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f157940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f157941c;

    public /* synthetic */ C2189nt(niz nizVar, Object obj, String str, int i) {
        this.f157939a = i;
        this.f157940b = nizVar;
        this.f157941c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m65592b(Object obj, fbk fbkVar) {
        h4q h4qVar;
        if (fbkVar instanceof h4q) {
            h4qVar = (h4q) fbkVar;
            int i = h4qVar.f87625b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4qVar.f87625b = i - Integer.MIN_VALUE;
            } else {
                h4qVar = new h4q(this, fbkVar);
            }
        } else {
            h4qVar = new h4q(this, fbkVar);
        }
        Object obj2 = h4qVar.f87624a;
        int i2 = h4qVar.f87625b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            y5f y5fVar = (y5f) ((Map) obj).get(this.f157941c);
            Boolean boolValueOf = Boolean.valueOf(y5fVar != null ? y5fVar.f269419c : false);
            h4qVar.f87625b = 1;
            Object objEmit = this.f157940b.emit(boolValueOf, h4qVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    private final Object m65593c(Object obj, fbk fbkVar) {
        qar qarVar;
        Object next;
        if (fbkVar instanceof qar) {
            qarVar = (qar) fbkVar;
            int i = qarVar.f186918b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qarVar.f186918b = i - Integer.MIN_VALUE;
            } else {
                qarVar = new qar(this, fbkVar);
            }
        } else {
            qarVar = new qar(this, fbkVar);
        }
        Object obj2 = qarVar.f186917a;
        int i2 = qarVar.f186918b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Iterator it = ((Set) obj).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((gj9) next).f80400a.f249247a.toLowerCase(Locale.ROOT).equals(this.f157941c));
            qarVar.f186918b = 1;
            Object objEmit = this.f157940b.emit(next, qarVar);
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

    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:146:0x0232  */
    /* JADX WARN: Code duplicated, block: B:163:0x027f  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:217:0x0350  */
    /* JADX WARN: Code duplicated, block: B:240:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:268:0x0427  */
    /* JADX WARN: Code duplicated, block: B:289:0x047d  */
    /* JADX WARN: Code duplicated, block: B:310:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:327:0x0520  */
    /* JADX WARN: Code duplicated, block: B:359:0x0599  */
    /* JADX WARN: Code duplicated, block: B:381:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0642  */
    /* JADX WARN: Code duplicated, block: B:420:0x0690  */
    /* JADX WARN: Code duplicated, block: B:460:0x072c  */
    /* JADX WARN: Code duplicated, block: B:477:0x0778  */
    /* JADX WARN: Code duplicated, block: B:494:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:511:0x080a  */
    /* JADX WARN: Code duplicated, block: B:528:0x0853  */
    /* JADX WARN: Code duplicated, block: B:551:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:568:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:591:0x0958  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:610:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:627:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:646:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws ChapterFetchException {
        C2139mt c2139mt;
        zn0 zn0Var;
        sz2 sz2Var;
        e43 e43Var;
        f43 f43Var;
        ua3 ua3Var;
        aw3 aw3Var;
        String str;
        tg4 tg4Var;
        vg4 vg4Var;
        o87 o87Var;
        qv7 qv7Var;
        e78 e78Var;
        b78 b78Var;
        sf9 sf9Var;
        zn9 zn9Var;
        k6a k6aVar;
        l6a l6aVar;
        boolean z;
        pic picVar;
        z2f z2fVar;
        a3f a3fVar;
        dpf dpfVar;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        dyh dyhVar;
        q4i q4iVar;
        cbf0 cbf0VarM35556a3;
        cbf0 cbf0VarM35556a4;
        a5i a5iVar;
        thk thkVar;
        rpl rplVar;
        String str2;
        dil dilVar;
        m340 m340Var;
        z240 z240VarM60640a;
        String str3;
        cnp cnpVar;
        Object jd50Var;
        String str4;
        g4q g4qVar;
        ter terVar;
        boolean z2;
        boolean z3;
        Boolean boolValueOf;
        switch (this.f157939a) {
            case 0:
                if (fbkVar instanceof C2139mt) {
                    c2139mt = (C2139mt) fbkVar;
                    int i = c2139mt.f146912b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c2139mt.f146912b = i - Integer.MIN_VALUE;
                    } else {
                        c2139mt = new C2139mt(this, fbkVar);
                    }
                } else {
                    c2139mt = new C2139mt(this, fbkVar);
                }
                Object obj2 = c2139mt.f146911a;
                int i2 = c2139mt.f146912b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List list = (List) obj;
                    boolean z4 = false;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!wj50.m88271j(((C1681av) it.next()).f20052a, this.f157941c)) {
                                z4 = true;
                            }
                        }
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    c2139mt.f146912b = 1;
                    Object objEmit = this.f157940b.emit(boolValueOf2, c2139mt);
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
                if (fbkVar instanceof zn0) {
                    zn0Var = (zn0) fbkVar;
                    int i3 = zn0Var.f284382b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zn0Var.f284382b = i3 - Integer.MIN_VALUE;
                    } else {
                        zn0Var = new zn0(this, fbkVar);
                    }
                } else {
                    zn0Var = new zn0(this, fbkVar);
                }
                Object obj3 = zn0Var.f284381a;
                int i4 = zn0Var.f284382b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    if (wj50.m88271j(((kqy) obj).mo36688V(), this.f157941c)) {
                        zn0Var.f284382b = 1;
                        Object objEmit2 = this.f157940b.emit(obj, zn0Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof sz2) {
                    sz2Var = (sz2) fbkVar;
                    int i5 = sz2Var.f215368b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sz2Var.f215368b = i5 - Integer.MIN_VALUE;
                    } else {
                        sz2Var = new sz2(this, fbkVar);
                    }
                } else {
                    sz2Var = new sz2(this, fbkVar);
                }
                Object obj4 = sz2Var.f215367a;
                int i6 = sz2Var.f215368b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    Object obj5 = ((Map) obj).get(this.f157941c);
                    sz2Var.f215368b = 1;
                    Object objEmit3 = this.f157940b.emit(obj5, sz2Var);
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
                if (fbkVar instanceof e43) {
                    e43Var = (e43) fbkVar;
                    int i7 = e43Var.f55930b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e43Var.f55930b = i7 - Integer.MIN_VALUE;
                    } else {
                        e43Var = new e43(this, fbkVar);
                    }
                } else {
                    e43Var = new e43(this, fbkVar);
                }
                Object obj6 = e43Var.f55929a;
                int i8 = e43Var.f55930b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    gqx gqxVar = (gqx) obj;
                    wj50.m88279p(gqxVar);
                    if (gqxVar.mo45449a(y7t0.class, this.f157941c).f72301b != null) {
                        e43Var.f55930b = 1;
                        Object objEmit4 = this.f157940b.emit(obj, e43Var);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit4 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof f43) {
                    f43Var = (f43) fbkVar;
                    int i9 = f43Var.f65642b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        f43Var.f65642b = i9 - Integer.MIN_VALUE;
                    } else {
                        f43Var = new f43(this, fbkVar);
                    }
                } else {
                    f43Var = new f43(this, fbkVar);
                }
                Object obj7 = f43Var.f65641a;
                int i10 = f43Var.f65642b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    gqx gqxVar2 = (gqx) obj;
                    wj50.m88279p(gqxVar2);
                    y7t0 y7t0Var = (y7t0) gqxVar2.mo45449a(y7t0.class, this.f157941c).f72301b;
                    s6x0 s6x0Var = new s6x0(Boolean.valueOf(y7t0Var != null && wjg1.m88341w(y7t0Var)));
                    f43Var.f65642b = 1;
                    Object objEmit5 = this.f157940b.emit(s6x0Var, f43Var);
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
                if (fbkVar instanceof ua3) {
                    ua3Var = (ua3) fbkVar;
                    int i11 = ua3Var.f228344b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ua3Var.f228344b = i11 - Integer.MIN_VALUE;
                    } else {
                        ua3Var = new ua3(this, fbkVar);
                    }
                } else {
                    ua3Var = new ua3(this, fbkVar);
                }
                Object obj8 = ua3Var.f228343a;
                int i12 = ua3Var.f228344b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    Object obj9 = ((Map) obj).get(this.f157941c);
                    ua3Var.f228344b = 1;
                    Object objEmit6 = this.f157940b.emit(obj9, ua3Var);
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
                if (fbkVar instanceof aw3) {
                    aw3Var = (aw3) fbkVar;
                    int i13 = aw3Var.f20365b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        aw3Var.f20365b = i13 - Integer.MIN_VALUE;
                    } else {
                        aw3Var = new aw3(this, fbkVar);
                    }
                } else {
                    aw3Var = new aw3(this, fbkVar);
                }
                Object obj10 = aw3Var.f20364a;
                int i14 = aw3Var.f20365b;
                if (i14 == 0) {
                    bga.m29073P(obj10);
                    u140 u140Var = ((v140) obj).f236247e;
                    if (u140Var == null || (str = u140Var.f225679b) == null) {
                        throw new ChapterFetchException("No parent episode for ".concat(this.f157941c));
                    }
                    aw3Var.f20365b = 1;
                    Object objEmit7 = this.f157940b.emit(str, aw3Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof tg4) {
                    tg4Var = (tg4) fbkVar;
                    int i15 = tg4Var.f220121b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        tg4Var.f220121b = i15 - Integer.MIN_VALUE;
                    } else {
                        tg4Var = new tg4(this, fbkVar);
                    }
                } else {
                    tg4Var = new tg4(this, fbkVar);
                }
                Object obj11 = tg4Var.f220120a;
                int i16 = tg4Var.f220121b;
                if (i16 == 0) {
                    bga.m29073P(obj11);
                    pqm0 pqm0Var = new pqm0(this.f157941c, (v140) obj);
                    tg4Var.f220121b = 1;
                    Object objEmit8 = this.f157940b.emit(pqm0Var, tg4Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof vg4) {
                    vg4Var = (vg4) fbkVar;
                    int i17 = vg4Var.f241114b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vg4Var.f241114b = i17 - Integer.MIN_VALUE;
                    } else {
                        vg4Var = new vg4(this, fbkVar);
                    }
                } else {
                    vg4Var = new vg4(this, fbkVar);
                }
                Object obj12 = vg4Var.f241113a;
                int i18 = vg4Var.f241114b;
                if (i18 == 0) {
                    bga.m29073P(obj12);
                    pqm0 pqm0Var2 = new pqm0(this.f157941c, (v140) obj);
                    vg4Var.f241114b = 1;
                    Object objEmit9 = this.f157940b.emit(pqm0Var2, vg4Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof o87) {
                    o87Var = (o87) fbkVar;
                    int i19 = o87Var.f162727b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        o87Var.f162727b = i19 - Integer.MIN_VALUE;
                    } else {
                        o87Var = new o87(this, fbkVar);
                    }
                } else {
                    o87Var = new o87(this, fbkVar);
                }
                Object obj13 = o87Var.f162726a;
                int i20 = o87Var.f162727b;
                if (i20 == 0) {
                    bga.m29073P(obj13);
                    pqm0 pqm0Var3 = new pqm0(this.f157941c, (xr00) obj);
                    o87Var.f162727b = 1;
                    Object objEmit10 = this.f157940b.emit(pqm0Var3, o87Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof qv7) {
                    qv7Var = (qv7) fbkVar;
                    int i21 = qv7Var.f192924b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        qv7Var.f192924b = i21 - Integer.MIN_VALUE;
                    } else {
                        qv7Var = new qv7(this, fbkVar);
                    }
                } else {
                    qv7Var = new qv7(this, fbkVar);
                }
                Object obj14 = qv7Var.f192923a;
                int i22 = qv7Var.f192924b;
                if (i22 == 0) {
                    bga.m29073P(obj14);
                    ktx ktxVar = ((gqx) obj).mo45449a(ggf0.class, this.f157941c).f72301b;
                    qv7Var.f192924b = 1;
                    Object objEmit11 = this.f157940b.emit(ktxVar, qv7Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof e78) {
                    e78Var = (e78) fbkVar;
                    int i23 = e78Var.f56860b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        e78Var.f56860b = i23 - Integer.MIN_VALUE;
                    } else {
                        e78Var = new e78(this, fbkVar);
                    }
                } else {
                    e78Var = new e78(this, fbkVar);
                }
                Object obj15 = e78Var.f56859a;
                int i24 = e78Var.f56860b;
                if (i24 == 0) {
                    bga.m29073P(obj15);
                    p2x0 p2x0Var = (p2x0) obj;
                    String str5 = this.f157941c;
                    wj50.m88279p(str5);
                    if (p2x0Var instanceof m2x0) {
                        hz80 hz80Var = (hz80) ((m2x0) p2x0Var).f139474a;
                        List list2 = hz80Var.f96811L0;
                        boolean z5 = false;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (wj50.m88271j(((q121) it2.next()).f184163a, "mix-auto-toggle-off")) {
                                    z5 = true;
                                }
                            }
                        }
                        boolean z6 = hz80Var.f96832h;
                        gz80 gz80Var = hz80Var.f96827c;
                        b78Var = new b78(str5, z5, lhg1.m58994u(gz80Var != null ? gz80Var.f85864a : null, z6));
                    } else {
                        if (!(p2x0Var instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b78Var = new b78(str5);
                    }
                    e78Var.f56860b = 1;
                    Object objEmit12 = this.f157940b.emit(b78Var, e78Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof sf9) {
                    sf9Var = (sf9) fbkVar;
                    int i25 = sf9Var.f208505b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        sf9Var.f208505b = i25 - Integer.MIN_VALUE;
                    } else {
                        sf9Var = new sf9(this, fbkVar);
                    }
                } else {
                    sf9Var = new sf9(this, fbkVar);
                }
                Object obj16 = sf9Var.f208504a;
                int i26 = sf9Var.f208505b;
                if (i26 == 0) {
                    bga.m29073P(obj16);
                    Object obj17 = (vu50) ((Map) obj).get(this.f157941c);
                    if (obj17 == null) {
                        obj17 = uu50.f234109a;
                    }
                    sf9Var.f208505b = 1;
                    Object objEmit13 = this.f157940b.emit(obj17, sf9Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof zn9) {
                    zn9Var = (zn9) fbkVar;
                    int i27 = zn9Var.f284440b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        zn9Var.f284440b = i27 - Integer.MIN_VALUE;
                    } else {
                        zn9Var = new zn9(this, fbkVar);
                    }
                } else {
                    zn9Var = new zn9(this, fbkVar);
                }
                Object obj18 = zn9Var.f284439a;
                int i28 = zn9Var.f284440b;
                if (i28 == 0) {
                    bga.m29073P(obj18);
                    if (wj50.m88271j(((SocialPromptingPusherMessage) obj).getSessionId(), this.f157941c)) {
                        zn9Var.f284440b = 1;
                        Object objEmit14 = this.f157940b.emit(obj, zn9Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof k6a) {
                    k6aVar = (k6a) fbkVar;
                    int i29 = k6aVar.f119702b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        k6aVar.f119702b = i29 - Integer.MIN_VALUE;
                    } else {
                        k6aVar = new k6a(this, fbkVar);
                    }
                } else {
                    k6aVar = new k6a(this, fbkVar);
                }
                Object obj19 = k6aVar.f119701a;
                int i30 = k6aVar.f119702b;
                if (i30 == 0) {
                    bga.m29073P(obj19);
                    lwu0 lwu0Var = (lwu0) ((gqx) obj).mo45449a(lwu0.class, this.f157941c).f72301b;
                    boolean z7 = false;
                    if (lwu0Var != null && lwu0Var.f137638a) {
                        z7 = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z7);
                    k6aVar.f119702b = 1;
                    Object objEmit15 = this.f157940b.emit(boolValueOf3, k6aVar);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof l6a) {
                    l6aVar = (l6a) fbkVar;
                    int i31 = l6aVar.f130283b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        l6aVar.f130283b = i31 - Integer.MIN_VALUE;
                    } else {
                        l6aVar = new l6a(this, fbkVar);
                    }
                } else {
                    l6aVar = new l6a(this, fbkVar);
                }
                Object obj20 = l6aVar.f130282a;
                int i32 = l6aVar.f130283b;
                if (i32 == 0) {
                    bga.m29073P(obj20);
                    y6s0 y6s0Var = (y6s0) ((m6s0) obj).f140572a.get(this.f157941c);
                    boolean z8 = false;
                    if (y6s0Var != null) {
                        if (y6s0Var instanceof x6s0) {
                            z = ((x6s0) y6s0Var).f258745a;
                        } else {
                            if (!(y6s0Var instanceof w6s0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w6s0 w6s0Var = (w6s0) y6s0Var;
                            z = w6s0Var.f248466c >= w6s0Var.f248465b;
                        }
                        if (z) {
                            z8 = true;
                        }
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(!z8);
                    l6aVar.f130283b = 1;
                    Object objEmit16 = this.f157940b.emit(boolValueOf4, l6aVar);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof pic) {
                    picVar = (pic) fbkVar;
                    int i33 = picVar.f177916b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        picVar.f177916b = i33 - Integer.MIN_VALUE;
                    } else {
                        picVar = new pic(this, fbkVar);
                    }
                } else {
                    picVar = new pic(this, fbkVar);
                }
                Object obj21 = picVar.f177915a;
                int i34 = picVar.f177916b;
                if (i34 == 0) {
                    bga.m29073P(obj21);
                    lic licVar = new lic(this.f157941c, ((Boolean) obj).booleanValue());
                    picVar.f177916b = 1;
                    Object objEmit17 = this.f157940b.emit(licVar, picVar);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof z2f) {
                    z2fVar = (z2f) fbkVar;
                    int i35 = z2fVar.f278562b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        z2fVar.f278562b = i35 - Integer.MIN_VALUE;
                    } else {
                        z2fVar = new z2f(this, fbkVar);
                    }
                } else {
                    z2fVar = new z2f(this, fbkVar);
                }
                Object obj22 = z2fVar.f278561a;
                int i36 = z2fVar.f278562b;
                if (i36 == 0) {
                    bga.m29073P(obj22);
                    Boolean bool = (Boolean) ((Map) obj).get(this.f157941c);
                    Boolean boolValueOf5 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    z2fVar.f278562b = 1;
                    Object objEmit18 = this.f157940b.emit(boolValueOf5, z2fVar);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof a3f) {
                    a3fVar = (a3f) fbkVar;
                    int i37 = a3fVar.f11947b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        a3fVar.f11947b = i37 - Integer.MIN_VALUE;
                    } else {
                        a3fVar = new a3f(this, fbkVar);
                    }
                } else {
                    a3fVar = new a3f(this, fbkVar);
                }
                Object obj23 = a3fVar.f11946a;
                int i38 = a3fVar.f11947b;
                if (i38 == 0) {
                    bga.m29073P(obj23);
                    Boolean bool2 = (Boolean) ((Map) obj).get(this.f157941c);
                    Boolean boolValueOf6 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    a3fVar.f11947b = 1;
                    Object objEmit19 = this.f157940b.emit(boolValueOf6, a3fVar);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof dpf) {
                    dpfVar = (dpf) fbkVar;
                    int i39 = dpfVar.f51319b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dpfVar.f51319b = i39 - Integer.MIN_VALUE;
                    } else {
                        dpfVar = new dpf(this, fbkVar);
                    }
                } else {
                    dpfVar = new dpf(this, fbkVar);
                }
                Object obj24 = dpfVar.f51318a;
                int i40 = dpfVar.f51319b;
                if (i40 == 0) {
                    bga.m29073P(obj24);
                    ebf0 ebf0Var = (ebf0) obj;
                    String str6 = this.f157941c;
                    dbf0 dbf0VarM38368c = ebf0Var.m38368c(v140.class, str6);
                    ktx ktxVar2 = null;
                    v140 v140Var = (v140) ((dbf0VarM38368c == null || (cbf0VarM35556a2 = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a2.f36107a);
                    dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(thj.class, str6);
                    if (dbf0VarM38368c2 != null && (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) != null) {
                        ktxVar2 = (ktx) cbf0VarM35556a.f36107a;
                    }
                    String strM64626s = njg1.m64626s(str6, v140Var, (thj) ktxVar2);
                    dpfVar.f51319b = 1;
                    Object objEmit20 = this.f157940b.emit(strM64626s, dpfVar);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof dyh) {
                    dyhVar = (dyh) fbkVar;
                    int i41 = dyhVar.f54351b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        dyhVar.f54351b = i41 - Integer.MIN_VALUE;
                    } else {
                        dyhVar = new dyh(this, fbkVar);
                    }
                } else {
                    dyhVar = new dyh(this, fbkVar);
                }
                Object obj25 = dyhVar.f54350a;
                int i42 = dyhVar.f54351b;
                if (i42 == 0) {
                    bga.m29073P(obj25);
                    gqx gqxVar3 = (gqx) obj;
                    String str7 = this.f157941c;
                    if (gqxVar3.mo45449a(v140.class, str7).f72301b != null && gqxVar3.mo45449a(erc1.class, str7).f72301b != null && gqxVar3.mo45449a(puh.class, str7).f72301b != null) {
                        dyhVar.f54351b = 1;
                        Object objEmit21 = this.f157940b.emit(obj, dyhVar);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof q4i) {
                    q4iVar = (q4i) fbkVar;
                    int i43 = q4iVar.f185182b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        q4iVar.f185182b = i43 - Integer.MIN_VALUE;
                    } else {
                        q4iVar = new q4i(this, fbkVar);
                    }
                } else {
                    q4iVar = new q4i(this, fbkVar);
                }
                Object obj26 = q4iVar.f185181a;
                int i44 = q4iVar.f185182b;
                if (i44 == 0) {
                    bga.m29073P(obj26);
                    ebf0 ebf0Var2 = (ebf0) obj;
                    String str8 = this.f157941c;
                    dbf0 dbf0VarM38368c3 = ebf0Var2.m38368c(luh.class, str8);
                    i4i i4iVar = null;
                    luh luhVar = (dbf0VarM38368c3 == null || (cbf0VarM35556a4 = dbf0VarM38368c3.m35556a()) == null) ? null : (luh) cbf0VarM35556a4.f36107a;
                    dbf0 dbf0VarM38368c4 = ebf0Var2.m38368c(pfa0.class, str8);
                    pfa0 pfa0Var = (dbf0VarM38368c4 == null || (cbf0VarM35556a3 = dbf0VarM38368c4.m35556a()) == null) ? null : (pfa0) cbf0VarM35556a3.f36107a;
                    if (luhVar != null && pfa0Var != null) {
                        i4iVar = new i4i(luhVar, pfa0Var);
                    }
                    if (i4iVar != null) {
                        q4iVar.f185182b = 1;
                        Object objEmit22 = this.f157940b.emit(i4iVar, q4iVar);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit22 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof a5i) {
                    a5iVar = (a5i) fbkVar;
                    int i45 = a5iVar.f12522b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        a5iVar.f12522b = i45 - Integer.MIN_VALUE;
                    } else {
                        a5iVar = new a5i(this, fbkVar);
                    }
                } else {
                    a5iVar = new a5i(this, fbkVar);
                }
                Object obj27 = a5iVar.f12521a;
                int i46 = a5iVar.f12522b;
                if (i46 == 0) {
                    bga.m29073P(obj27);
                    gqx gqxVar4 = (gqx) obj;
                    String str9 = this.f157941c;
                    if (gqxVar4.mo45449a(i2i.class, str9).f72301b != null && gqxVar4.mo45449a(b2i.class, str9).f72301b != null) {
                        a5iVar.f12522b = 1;
                        Object objEmit23 = this.f157940b.emit(obj, a5iVar);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit23 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof thk) {
                    thkVar = (thk) fbkVar;
                    int i47 = thkVar.f220447b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        thkVar.f220447b = i47 - Integer.MIN_VALUE;
                    } else {
                        thkVar = new thk(this, fbkVar);
                    }
                } else {
                    thkVar = new thk(this, fbkVar);
                }
                Object obj28 = thkVar.f220446a;
                int i48 = thkVar.f220447b;
                if (i48 == 0) {
                    bga.m29073P(obj28);
                    Boolean boolValueOf7 = Boolean.valueOf(!((Set) obj).contains(this.f157941c));
                    thkVar.f220447b = 1;
                    Object objEmit24 = this.f157940b.emit(boolValueOf7, thkVar);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof rpl) {
                    rplVar = (rpl) fbkVar;
                    int i49 = rplVar.f201609b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        rplVar.f201609b = i49 - Integer.MIN_VALUE;
                    } else {
                        rplVar = new rpl(this, fbkVar);
                    }
                } else {
                    rplVar = new rpl(this, fbkVar);
                }
                Object obj29 = rplVar.f201608a;
                int i50 = rplVar.f201609b;
                if (i50 == 0) {
                    bga.m29073P(obj29);
                    s46 s46Var = (s46) obj;
                    v140 v140Var2 = s46Var.f205502a;
                    String str10 = "";
                    if (v140Var2 == null || (str2 = v140Var2.f236243a) == null) {
                        str2 = "";
                    }
                    if (str2.length() == 0) {
                        dilVar = null;
                    } else {
                        erc1 erc1Var = s46Var.f205503b;
                        if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (z240VarM60640a = m340Var.m60640a(a340.f11860a)) != null && (str3 = z240VarM60640a.f278475a.f198763a) != null) {
                            str10 = str3;
                        }
                        dilVar = new dil(this.f157941c, str2, 2, str10);
                    }
                    rplVar.f201609b = 1;
                    Object objEmit25 = this.f157940b.emit(dilVar, rplVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof cnp) {
                    cnpVar = (cnp) fbkVar;
                    int i51 = cnpVar.f40053b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        cnpVar.f40053b = i51 - Integer.MIN_VALUE;
                    } else {
                        cnpVar = new cnp(this, fbkVar);
                    }
                } else {
                    cnpVar = new cnp(this, fbkVar);
                }
                Object obj30 = cnpVar.f40052a;
                int i52 = cnpVar.f40053b;
                if (i52 == 0) {
                    bga.m29073P(obj30);
                    yk91 yk91Var = (yk91) obj;
                    by50 by50Var = (by50) yk91Var.f273650a;
                    boolean zBooleanValue = ((Boolean) yk91Var.f273651b).booleanValue();
                    s730 s730Var = (s730) yk91Var.f273652c;
                    if (by50Var != null && by50Var.f32082h.f287209b.f224569e) {
                        jd50Var = new jd50(new dh60(by50Var));
                    } else if (by50Var != null) {
                        jd50Var = new jd50(new fh60(by50Var));
                    } else if (s730Var != null) {
                        jd50Var = new jd50(new bh60(s730Var));
                    } else {
                        jd50Var = (!zBooleanValue || (str4 = this.f157941c) == null) ? new jd50(ch60.f37937a) : new id50(str4);
                    }
                    cnpVar.f40053b = 1;
                    Object objEmit26 = this.f157940b.emit(jd50Var, cnpVar);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof g4q) {
                    g4qVar = (g4q) fbkVar;
                    int i53 = g4qVar.f76501b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        g4qVar.f76501b = i53 - Integer.MIN_VALUE;
                    } else {
                        g4qVar = new g4q(this, fbkVar);
                    }
                } else {
                    g4qVar = new g4q(this, fbkVar);
                }
                Object obj31 = g4qVar.f76500a;
                int i54 = g4qVar.f76501b;
                if (i54 == 0) {
                    bga.m29073P(obj31);
                    y5f y5fVar = (y5f) ((Map) obj).get(this.f157941c);
                    Boolean boolValueOf8 = Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
                    g4qVar.f76501b = 1;
                    Object objEmit27 = this.f157940b.emit(boolValueOf8, g4qVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                return m65592b(obj, fbkVar);
            case 28:
                return m65593c(obj, fbkVar);
            default:
                if (fbkVar instanceof ter) {
                    terVar = (ter) fbkVar;
                    int i55 = terVar.f219784b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        terVar.f219784b = i55 - Integer.MIN_VALUE;
                    } else {
                        terVar = new ter(this, fbkVar);
                    }
                } else {
                    terVar = new ter(this, fbkVar);
                }
                Object obj32 = terVar.f219783a;
                int i56 = terVar.f219784b;
                if (i56 == 0) {
                    bga.m29073P(obj32);
                    ifr ifrVar = (ifr) obj;
                    if (ifrVar == null) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        Set set = ifrVar.f101811c.f69071a;
                        boolean z9 = set instanceof Collection;
                        String str11 = this.f157941c;
                        boolean z10 = false;
                        if (z9 && set.isEmpty()) {
                            z2 = false;
                        } else {
                            Iterator it3 = set.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z2 = false;
                                } else if (wj50.m88271j(((s78) it3.next()).f206291a, str11)) {
                                    z2 = true;
                                }
                            }
                        }
                        Set set2 = ifrVar.f101810b.f79444c;
                        if ((set2 instanceof Collection) && set2.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it4 = set2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z3 = false;
                                } else if (wj50.m88271j(((r78) it4.next()).f196459a, str11)) {
                                    z3 = true;
                                }
                            }
                        }
                        if (!z2 && !z3) {
                            z10 = true;
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    }
                    terVar.f219784b = 1;
                    Object objEmit28 = this.f157940b.emit(boolValueOf, terVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ C2189nt(niz nizVar, String str, int i) {
        this.f157939a = i;
        this.f157940b = nizVar;
        this.f157941c = str;
    }
}
