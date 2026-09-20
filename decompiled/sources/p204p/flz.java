package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes11.dex */
public final class flz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f70892b;

    public /* synthetic */ flz(niz nizVar, int i) {
        this.f70891a = i;
        this.f70892b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0229  */
    /* JADX WARN: Code duplicated, block: B:146:0x0270  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0332  */
    /* JADX WARN: Code duplicated, block: B:214:0x037d  */
    /* JADX WARN: Code duplicated, block: B:233:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:258:0x0444  */
    /* JADX WARN: Code duplicated, block: B:275:0x048c  */
    /* JADX WARN: Code duplicated, block: B:299:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:316:0x0538  */
    /* JADX WARN: Code duplicated, block: B:342:0x0595  */
    /* JADX WARN: Code duplicated, block: B:361:0x05db  */
    /* JADX WARN: Code duplicated, block: B:378:0x061f  */
    /* JADX WARN: Code duplicated, block: B:403:0x0682  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:439:0x0712  */
    /* JADX WARN: Code duplicated, block: B:456:0x075d  */
    /* JADX WARN: Code duplicated, block: B:475:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:499:0x0811  */
    /* JADX WARN: Code duplicated, block: B:518:0x0855  */
    /* JADX WARN: Code duplicated, block: B:535:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:552:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:573:0x0937  */
    /* JADX WARN: Code duplicated, block: B:594:0x0984  */
    /* JADX WARN: Code duplicated, block: B:615:0x09de  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        elz elzVar;
        lmz lmzVar;
        jmz jmzVar;
        mmz mmzVar;
        nmz nmzVar;
        omz omzVar;
        uoz uozVar;
        bpz bpzVar;
        usz uszVar;
        ysz yszVar;
        juz juzVar;
        wuz wuzVar;
        fwz fwzVar;
        xd00 xd00Var;
        Object iciVar;
        yd00 yd00Var;
        bh00 bh00Var;
        en00 en00Var;
        zm00 zm00Var;
        gr00 gr00Var;
        hr00 hr00Var;
        gu00 gu00Var;
        lu00 lu00Var;
        yv00 yv00Var;
        p010 p010Var;
        j210 j210Var;
        zb10 zb10Var;
        pc10 pc10Var;
        qc10 qc10Var;
        bf10 bf10Var;
        Object objSingletonList;
        mf10 mf10Var;
        ck10 ck10Var;
        pz10 pz10Var;
        switch (this.f70891a) {
            case 0:
                if (fbkVar instanceof elz) {
                    elzVar = (elz) fbkVar;
                    int i = elzVar.f60778b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        elzVar.f60778b = i - Integer.MIN_VALUE;
                    } else {
                        elzVar = new elz(this, fbkVar);
                    }
                } else {
                    elzVar = new elz(this, fbkVar);
                }
                Object obj2 = elzVar.f60777a;
                int i2 = elzVar.f60778b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    if (obj != null) {
                        elzVar.f60778b = 1;
                        Object objEmit = this.f70892b.emit(obj, elzVar);
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
                if (fbkVar instanceof lmz) {
                    lmzVar = (lmz) fbkVar;
                    int i3 = lmzVar.f135052b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lmzVar.f135052b = i3 - Integer.MIN_VALUE;
                    } else {
                        lmzVar = new lmz(this, fbkVar);
                    }
                } else {
                    lmzVar = new lmz(this, fbkVar);
                }
                Object obj3 = lmzVar.f135051a;
                int i4 = lmzVar.f135052b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                    if (lowerCase.equals("premium")) {
                        jmzVar = jmz.f113964a;
                    } else {
                        lowerCase.equals("free");
                        jmzVar = jmz.f113965b;
                    }
                    lmzVar.f135052b = 1;
                    Object objEmit2 = this.f70892b.emit(jmzVar, lmzVar);
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
                if (fbkVar instanceof mmz) {
                    mmzVar = (mmz) fbkVar;
                    int i5 = mmzVar.f145285b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mmzVar.f145285b = i5 - Integer.MIN_VALUE;
                    } else {
                        mmzVar = new mmz(this, fbkVar);
                    }
                } else {
                    mmzVar = new mmz(this, fbkVar);
                }
                Object obj4 = mmzVar.f145284a;
                int i6 = mmzVar.f145285b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((jmz) obj) == jmz.f113964a);
                    mmzVar.f145285b = 1;
                    Object objEmit3 = this.f70892b.emit(boolValueOf, mmzVar);
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
                if (fbkVar instanceof nmz) {
                    nmzVar = (nmz) fbkVar;
                    int i7 = nmzVar.f156295b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nmzVar.f156295b = i7 - Integer.MIN_VALUE;
                    } else {
                        nmzVar = new nmz(this, fbkVar);
                    }
                } else {
                    nmzVar = new nmz(this, fbkVar);
                }
                Object obj5 = nmzVar.f156294a;
                int i8 = nmzVar.f156295b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(((jmz) obj) == jmz.f113965b);
                    nmzVar.f156295b = 1;
                    Object objEmit4 = this.f70892b.emit(boolValueOf2, nmzVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof omz) {
                    omzVar = (omz) fbkVar;
                    int i9 = omzVar.f167116b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        omzVar.f167116b = i9 - Integer.MIN_VALUE;
                    } else {
                        omzVar = new omz(this, fbkVar);
                    }
                } else {
                    omzVar = new omz(this, fbkVar);
                }
                Object obj6 = omzVar.f167115a;
                int i10 = omzVar.f167116b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf3 = Boolean.valueOf(dxf1.m37222K((Map) obj));
                    omzVar.f167116b = 1;
                    Object objEmit5 = this.f70892b.emit(boolValueOf3, omzVar);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof uoz) {
                    uozVar = (uoz) fbkVar;
                    int i11 = uozVar.f232542b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        uozVar.f232542b = i11 - Integer.MIN_VALUE;
                    } else {
                        uozVar = new uoz(this, fbkVar);
                    }
                } else {
                    uozVar = new uoz(this, fbkVar);
                }
                Object obj7 = uozVar.f232541a;
                int i12 = uozVar.f232542b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    da61 da61Var = new da61(((Boolean) obj).booleanValue());
                    uozVar.f232542b = 1;
                    Object objEmit6 = this.f70892b.emit(da61Var, uozVar);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof bpz) {
                    bpzVar = (bpz) fbkVar;
                    int i13 = bpzVar.f29627b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bpzVar.f29627b = i13 - Integer.MIN_VALUE;
                    } else {
                        bpzVar = new bpz(this, fbkVar);
                    }
                } else {
                    bpzVar = new bpz(this, fbkVar);
                }
                Object obj8 = bpzVar.f29626a;
                int i14 = bpzVar.f29627b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    if (obj instanceof ipz) {
                        bpzVar.f29627b = 1;
                        Object objEmit7 = this.f70892b.emit(obj, bpzVar);
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
                if (fbkVar instanceof usz) {
                    uszVar = (usz) fbkVar;
                    int i15 = uszVar.f233700b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        uszVar.f233700b = i15 - Integer.MIN_VALUE;
                    } else {
                        uszVar = new usz(this, fbkVar);
                    }
                } else {
                    uszVar = new usz(this, fbkVar);
                }
                Object obj9 = uszVar.f233699a;
                int i16 = uszVar.f233700b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) g6f.m43745s0(((YourLibraryDecorateResponse) obj).m98166o());
                    String uri = null;
                    if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity != null && yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasPlaylist() && yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98293C()) {
                        uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98296q().getUri();
                    }
                    uszVar.f233700b = 1;
                    Object objEmit8 = this.f70892b.emit(uri, uszVar);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof ysz) {
                    yszVar = (ysz) fbkVar;
                    int i17 = yszVar.f275903b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        yszVar.f275903b = i17 - Integer.MIN_VALUE;
                    } else {
                        yszVar = new ysz(this, fbkVar);
                    }
                } else {
                    yszVar = new ysz(this, fbkVar);
                }
                Object obj10 = yszVar.f275902a;
                int i18 = yszVar.f275903b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    if (((Boolean) obj).booleanValue()) {
                        yszVar.f275903b = 1;
                        Object objEmit9 = this.f70892b.emit(obj, yszVar);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof juz) {
                    juzVar = (juz) fbkVar;
                    int i19 = juzVar.f116197b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        juzVar.f116197b = i19 - Integer.MIN_VALUE;
                    } else {
                        juzVar = new juz(this, fbkVar);
                    }
                } else {
                    juzVar = new juz(this, fbkVar);
                }
                Object obj11 = juzVar.f116196a;
                int i20 = juzVar.f116197b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    ytz ytzVar = new ytz(((Boolean) obj).booleanValue());
                    juzVar.f116197b = 1;
                    Object objEmit10 = this.f70892b.emit(ytzVar, juzVar);
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
                if (fbkVar instanceof wuz) {
                    wuzVar = (wuz) fbkVar;
                    int i21 = wuzVar.f255301b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wuzVar.f255301b = i21 - Integer.MIN_VALUE;
                    } else {
                        wuzVar = new wuz(this, fbkVar);
                    }
                } else {
                    wuzVar = new wuz(this, fbkVar);
                }
                Object obj12 = wuzVar.f255300a;
                int i22 = wuzVar.f255301b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    ywz ywzVar = new ywz(((uu41) obj).f234106a);
                    wuzVar.f255301b = 1;
                    Object objEmit11 = this.f70892b.emit(ywzVar, wuzVar);
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
                if (fbkVar instanceof fwz) {
                    fwzVar = (fwz) fbkVar;
                    int i23 = fwzVar.f74200b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        fwzVar.f74200b = i23 - Integer.MIN_VALUE;
                    } else {
                        fwzVar = new fwz(this, fbkVar);
                    }
                } else {
                    fwzVar = new fwz(this, fbkVar);
                }
                Object obj13 = fwzVar.f74199a;
                int i24 = fwzVar.f74200b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    if (((wvz) obj).f255641a != null) {
                        fwzVar.f74200b = 1;
                        Object objEmit12 = this.f70892b.emit(obj, fwzVar);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof xd00) {
                    xd00Var = (xd00) fbkVar;
                    int i25 = xd00Var.f260341b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        xd00Var.f260341b = i25 - Integer.MIN_VALUE;
                    } else {
                        xd00Var = new xd00(this, fbkVar);
                    }
                } else {
                    xd00Var = new xd00(this, fbkVar);
                }
                Object obj14 = xd00Var.f260340a;
                int i26 = xd00Var.f260341b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    k261 k261Var = (k261) obj;
                    if (k261Var instanceof i261) {
                        iciVar = new gci(((i261) k261Var).f97757a);
                    } else {
                        if (!(k261Var instanceof j261)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iciVar = new ici(((j261) k261Var).f107937a);
                    }
                    xd00Var.f260341b = 1;
                    Object objEmit13 = this.f70892b.emit(iciVar, xd00Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof yd00) {
                    yd00Var = (yd00) fbkVar;
                    int i27 = yd00Var.f271606b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        yd00Var.f271606b = i27 - Integer.MIN_VALUE;
                    } else {
                        yd00Var = new yd00(this, fbkVar);
                    }
                } else {
                    yd00Var = new yd00(this, fbkVar);
                }
                Object obj15 = yd00Var.f271605a;
                int i28 = yd00Var.f271606b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    yd00Var.f271606b = 1;
                    Object objEmit14 = this.f70892b.emit(dci.f47566a, yd00Var);
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
                if (fbkVar instanceof bh00) {
                    bh00Var = (bh00) fbkVar;
                    int i29 = bh00Var.f27042b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        bh00Var.f27042b = i29 - Integer.MIN_VALUE;
                    } else {
                        bh00Var = new bh00(this, fbkVar);
                    }
                } else {
                    bh00Var = new bh00(this, fbkVar);
                }
                Object obj16 = bh00Var.f27041a;
                int i30 = bh00Var.f27042b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    Object obj17 = ((gv31) obj).f84602a;
                    if (obj17 != null) {
                        bh00Var.f27042b = 1;
                        Object objEmit15 = this.f70892b.emit(obj17, bh00Var);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit15 == yukVar15) {
                            return yukVar15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof en00) {
                    en00Var = (en00) fbkVar;
                    int i31 = en00Var.f61037b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        en00Var.f61037b = i31 - Integer.MIN_VALUE;
                    } else {
                        en00Var = new en00(this, fbkVar);
                    }
                } else {
                    en00Var = new en00(this, fbkVar);
                }
                Object obj18 = en00Var.f61036a;
                int i32 = en00Var.f61037b;
                if (i32 == 0) {
                    bga.m29073P(obj18);
                    fzt0 fzt0Var = (fzt0) obj;
                    if (fzt0Var instanceof ezt0) {
                        zm00Var = new zm00(((ezt0) fzt0Var).f64469a);
                    } else {
                        if (!(fzt0Var instanceof dzt0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zm00Var = null;
                    }
                    if (zm00Var != null) {
                        en00Var.f61037b = 1;
                        Object objEmit16 = this.f70892b.emit(zm00Var, en00Var);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof gr00) {
                    gr00Var = (gr00) fbkVar;
                    int i33 = gr00Var.f83590b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        gr00Var.f83590b = i33 - Integer.MIN_VALUE;
                    } else {
                        gr00Var = new gr00(this, fbkVar);
                    }
                } else {
                    gr00Var = new gr00(this, fbkVar);
                }
                Object obj19 = gr00Var.f83589a;
                int i34 = gr00Var.f83590b;
                if (i34 == 0) {
                    bga.m29073P(obj19);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ed01 ed01Var = new ed01(bool);
                    gr00Var.f83590b = 1;
                    Object objEmit17 = this.f70892b.emit(ed01Var, gr00Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof hr00) {
                    hr00Var = (hr00) fbkVar;
                    int i35 = hr00Var.f94279b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        hr00Var.f94279b = i35 - Integer.MIN_VALUE;
                    } else {
                        hr00Var = new hr00(this, fbkVar);
                    }
                } else {
                    hr00Var = new hr00(this, fbkVar);
                }
                Object obj20 = hr00Var.f94278a;
                int i36 = hr00Var.f94279b;
                if (i36 == 0) {
                    bga.m29073P(obj20);
                    PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                    Boolean boolValueOf4 = (playbackSettingsEsperantoService$StreamSettingChange.m17615p() && playbackSettingsEsperantoService$StreamSettingChange.m17614o().m17628w()) ? Boolean.valueOf(playbackSettingsEsperantoService$StreamSettingChange.m17614o().m17624s()) : null;
                    if (boolValueOf4 != null) {
                        hr00Var.f94279b = 1;
                        Object objEmit18 = this.f70892b.emit(boolValueOf4, hr00Var);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof gu00) {
                    gu00Var = (gu00) fbkVar;
                    int i37 = gu00Var.f84324b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        gu00Var.f84324b = i37 - Integer.MIN_VALUE;
                    } else {
                        gu00Var = new gu00(this, fbkVar);
                    }
                } else {
                    gu00Var = new gu00(this, fbkVar);
                }
                Object obj21 = gu00Var.f84323a;
                int i38 = gu00Var.f84324b;
                if (i38 == 0) {
                    bga.m29073P(obj21);
                    Boolean boolValueOf5 = Boolean.valueOf(((ho50) obj).f93460a);
                    gu00Var.f84324b = 1;
                    Object objEmit19 = this.f70892b.emit(boolValueOf5, gu00Var);
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
                if (fbkVar instanceof lu00) {
                    lu00Var = (lu00) fbkVar;
                    int i39 = lu00Var.f136944b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        lu00Var.f136944b = i39 - Integer.MIN_VALUE;
                    } else {
                        lu00Var = new lu00(this, fbkVar);
                    }
                } else {
                    lu00Var = new lu00(this, fbkVar);
                }
                Object obj22 = lu00Var.f136943a;
                int i40 = lu00Var.f136944b;
                if (i40 == 0) {
                    bga.m29073P(obj22);
                    Set<String> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                    for (String str : set) {
                        if (new gf41(str).f79270c != df41.SHOW) {
                            throw new IllegalArgumentException("ContextUri must be an show");
                        }
                        arrayList.add(new st00(str, null));
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    lu00Var.f136944b = 1;
                    Object objEmit20 = this.f70892b.emit(setM43736n1, lu00Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof yv00) {
                    yv00Var = (yv00) fbkVar;
                    int i41 = yv00Var.f276517b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        yv00Var.f276517b = i41 - Integer.MIN_VALUE;
                    } else {
                        yv00Var = new yv00(this, fbkVar);
                    }
                } else {
                    yv00Var = new yv00(this, fbkVar);
                }
                Object obj23 = yv00Var.f276516a;
                int i42 = yv00Var.f276517b;
                if (i42 == 0) {
                    bga.m29073P(obj23);
                    if (((ok11) obj).f166215c) {
                        yv00Var.f276517b = 1;
                        Object objEmit21 = this.f70892b.emit(obj, yv00Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof p010) {
                    p010Var = (p010) fbkVar;
                    int i43 = p010Var.f172425b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        p010Var.f172425b = i43 - Integer.MIN_VALUE;
                    } else {
                        p010Var = new p010(this, fbkVar);
                    }
                } else {
                    p010Var = new p010(this, fbkVar);
                }
                Object obj24 = p010Var.f172424a;
                int i44 = p010Var.f172425b;
                if (i44 == 0) {
                    bga.m29073P(obj24);
                    i010 i010Var = new i010(((Boolean) obj).booleanValue());
                    p010Var.f172425b = 1;
                    Object objEmit22 = this.f70892b.emit(i010Var, p010Var);
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
                if (fbkVar instanceof j210) {
                    j210Var = (j210) fbkVar;
                    int i45 = j210Var.f107901b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        j210Var.f107901b = i45 - Integer.MIN_VALUE;
                    } else {
                        j210Var = new j210(this, fbkVar);
                    }
                } else {
                    j210Var = new j210(this, fbkVar);
                }
                Object obj25 = j210Var.f107900a;
                int i46 = j210Var.f107901b;
                if (i46 == 0) {
                    bga.m29073P(obj25);
                    List<xm11> listMo33479a = ((fo11) obj).mo33479a();
                    ArrayList arrayList2 = new ArrayList();
                    for (xm11 xm11Var : listMo33479a) {
                        String str2 = xm11Var.f263269d;
                        String str3 = null;
                        if (str2 != null) {
                            if (wl51.m88460J0(str2)) {
                                str2 = null;
                            }
                            if (str2 != null && xm11Var.f263271f == 1) {
                                str3 = str2;
                            }
                        }
                        if (str3 != null) {
                            arrayList2.add(str3);
                        }
                    }
                    Set setM43736n2 = g6f.m43736n1(arrayList2);
                    j210Var.f107901b = 1;
                    Object objEmit23 = this.f70892b.emit(setM43736n2, j210Var);
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
                if (fbkVar instanceof zb10) {
                    zb10Var = (zb10) fbkVar;
                    int i47 = zb10Var.f281203b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        zb10Var.f281203b = i47 - Integer.MIN_VALUE;
                    } else {
                        zb10Var = new zb10(this, fbkVar);
                    }
                } else {
                    zb10Var = new zb10(this, fbkVar);
                }
                Object obj26 = zb10Var.f281202a;
                int i48 = zb10Var.f281203b;
                if (i48 == 0) {
                    bga.m29073P(obj26);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        zb10Var.f281203b = 1;
                        Object objEmit24 = this.f70892b.emit(obj, zb10Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof pc10) {
                    pc10Var = (pc10) fbkVar;
                    int i49 = pc10Var.f175932b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        pc10Var.f175932b = i49 - Integer.MIN_VALUE;
                    } else {
                        pc10Var = new pc10(this, fbkVar);
                    }
                } else {
                    pc10Var = new pc10(this, fbkVar);
                }
                Object obj27 = pc10Var.f175931a;
                int i50 = pc10Var.f175932b;
                if (i50 == 0) {
                    bga.m29073P(obj27);
                    if (((e301) obj).f55572b) {
                        pc10Var.f175932b = 1;
                        Object objEmit25 = this.f70892b.emit(obj, pc10Var);
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
                if (fbkVar instanceof qc10) {
                    qc10Var = (qc10) fbkVar;
                    int i51 = qc10Var.f187234b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        qc10Var.f187234b = i51 - Integer.MIN_VALUE;
                    } else {
                        qc10Var = new qc10(this, fbkVar);
                    }
                } else {
                    qc10Var = new qc10(this, fbkVar);
                }
                Object obj28 = qc10Var.f187233a;
                int i52 = qc10Var.f187234b;
                if (i52 == 0) {
                    bga.m29073P(obj28);
                    String str4 = ((e301) obj).f55571a;
                    qc10Var.f187234b = 1;
                    Object objEmit26 = this.f70892b.emit(str4, qc10Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof bf10) {
                    bf10Var = (bf10) fbkVar;
                    int i53 = bf10Var.f26514b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        bf10Var.f26514b = i53 - Integer.MIN_VALUE;
                    } else {
                        bf10Var = new bf10(this, fbkVar);
                    }
                } else {
                    bf10Var = new bf10(this, fbkVar);
                }
                Object obj29 = bf10Var.f26513a;
                int i54 = bf10Var.f26514b;
                if (i54 == 0) {
                    bga.m29073P(obj29);
                    mie1 mie1Var = (mie1) obj;
                    if (mie1Var instanceof kie1) {
                        objSingletonList = Collections.singletonList(C1742ci.m32822c(df10.f48215a, ((kie1) mie1Var).f122952a, null, null, null, Boolean.TRUE, null, null, 222));
                    } else {
                        if (!wj50.m88271j(mie1Var, lie1.f133783a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objSingletonList = lau.f131415a;
                    }
                    bf10Var.f26514b = 1;
                    Object objEmit27 = this.f70892b.emit(objSingletonList, bf10Var);
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
                if (fbkVar instanceof mf10) {
                    mf10Var = (mf10) fbkVar;
                    int i55 = mf10Var.f142928b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        mf10Var.f142928b = i55 - Integer.MIN_VALUE;
                    } else {
                        mf10Var = new mf10(this, fbkVar);
                    }
                } else {
                    mf10Var = new mf10(this, fbkVar);
                }
                Object obj30 = mf10Var.f142927a;
                int i56 = mf10Var.f142928b;
                if (i56 == 0) {
                    bga.m29073P(obj30);
                    if (obj instanceof kie1) {
                        mf10Var.f142928b = 1;
                        Object objEmit28 = this.f70892b.emit(obj, mf10Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof ck10) {
                    ck10Var = (ck10) fbkVar;
                    int i57 = ck10Var.f38737b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        ck10Var.f38737b = i57 - Integer.MIN_VALUE;
                    } else {
                        ck10Var = new ck10(this, fbkVar);
                    }
                } else {
                    ck10Var = new ck10(this, fbkVar);
                }
                Object obj31 = ck10Var.f38736a;
                int i58 = ck10Var.f38737b;
                if (i58 == 0) {
                    bga.m29073P(obj31);
                    Boolean bool2 = (Boolean) obj;
                    wj50.m88279p(bool2);
                    if (bool2.booleanValue()) {
                        ck10Var.f38737b = 1;
                        Object objEmit29 = this.f70892b.emit(obj, ck10Var);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit29 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof pz10) {
                    pz10Var = (pz10) fbkVar;
                    int i59 = pz10Var.f183571b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        pz10Var.f183571b = i59 - Integer.MIN_VALUE;
                    } else {
                        pz10Var = new pz10(this, fbkVar);
                    }
                } else {
                    pz10Var = new pz10(this, fbkVar);
                }
                Object obj32 = pz10Var.f183570a;
                int i60 = pz10Var.f183571b;
                if (i60 == 0) {
                    bga.m29073P(obj32);
                    oz10 oz10Var = (oz10) obj;
                    List<String> list = oz10Var.f171926a;
                    ArrayList arrayList3 = new ArrayList();
                    for (String str5 : list) {
                        List list2 = oz10Var.f171927b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj33 : list2) {
                            if (wj50.m88271j(((esf) obj33).f62351a, str5)) {
                                arrayList4.add(obj33);
                            }
                        }
                        j6f.m52564V(arrayList4, arrayList3);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        j6f.m52564V(((esf) it.next()).f62352b, arrayList5);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj34 : arrayList5) {
                        if (((pvf) obj34).f181734c instanceof c4a) {
                            arrayList7.add(obj34);
                        } else {
                            arrayList6.add(obj34);
                        }
                    }
                    nz10 nz10Var = new nz10(g6f.m43700N0(arrayList7, arrayList6));
                    pz10Var.f183571b = 1;
                    Object objEmit30 = this.f70892b.emit(nz10Var, pz10Var);
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
}
