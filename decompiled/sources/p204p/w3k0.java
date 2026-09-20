package p204p;

import com.spotify.offline_esperanto.proto.EsOffline$GetOfflinePlaybackStatusResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class w3k0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f247605b;

    public /* synthetic */ w3k0(niz nizVar, int i) {
        this.f247604a = i;
        this.f247605b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:216:0x0372  */
    /* JADX WARN: Code duplicated, block: B:240:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:263:0x041d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:282:0x0466  */
    /* JADX WARN: Code duplicated, block: B:301:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:320:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:339:0x0549  */
    /* JADX WARN: Code duplicated, block: B:367:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:384:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:401:0x0649  */
    /* JADX WARN: Code duplicated, block: B:418:0x0690  */
    /* JADX WARN: Code duplicated, block: B:435:0x06db  */
    /* JADX WARN: Code duplicated, block: B:452:0x0722  */
    /* JADX WARN: Code duplicated, block: B:471:0x076b  */
    /* JADX WARN: Code duplicated, block: B:488:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:505:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:522:0x084a  */
    /* JADX WARN: Code duplicated, block: B:539:0x0895  */
    /* JADX WARN: Code duplicated, block: B:556:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:575:0x0932  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        v3k0 v3k0Var;
        i7k0 i7k0Var;
        j7k0 j7k0Var;
        g9k0 g9k0Var;
        h9k0 h9k0Var;
        i9k0 i9k0Var;
        bck0 bck0Var;
        yck0 yck0Var;
        zck0 zck0Var;
        bdk0 bdk0Var;
        cdk0 cdk0Var;
        ddk0 ddk0Var;
        vdk0 vdk0Var;
        sek0 sek0Var;
        boolean z;
        sgk0 sgk0Var;
        tgk0 tgk0Var;
        ehk0 ehk0Var;
        fhk0 fhk0Var;
        cok0 cok0Var;
        zam0 zam0Var;
        vok0 vok0Var;
        wok0 wok0Var;
        Object obj2;
        yok0 yok0Var;
        zok0 zok0Var;
        Iterator it;
        int i;
        niz nizVar;
        cpk0 cpk0Var;
        Object objInvoke;
        qpk0 qpk0Var;
        ark0 ark0Var;
        gsk0 gsk0Var;
        kuk0 kuk0Var;
        List list;
        avk0 avk0Var;
        switch (this.f247604a) {
            case 0:
                if (fbkVar instanceof v3k0) {
                    v3k0Var = (v3k0) fbkVar;
                    int i2 = v3k0Var.f236900b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        v3k0Var.f236900b = i2 - Integer.MIN_VALUE;
                    } else {
                        v3k0Var = new v3k0(this, fbkVar);
                    }
                } else {
                    v3k0Var = new v3k0(this, fbkVar);
                }
                Object obj3 = v3k0Var.f236899a;
                int i3 = v3k0Var.f236900b;
                if (i3 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((by50) obj) != null);
                    v3k0Var.f236900b = 1;
                    Object objEmit = this.f247605b.emit(boolValueOf, v3k0Var);
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
                if (fbkVar instanceof i7k0) {
                    i7k0Var = (i7k0) fbkVar;
                    int i4 = i7k0Var.f99574b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        i7k0Var.f99574b = i4 - Integer.MIN_VALUE;
                    } else {
                        i7k0Var = new i7k0(this, fbkVar);
                    }
                } else {
                    i7k0Var = new i7k0(this, fbkVar);
                }
                Object obj4 = i7k0Var.f99573a;
                int i5 = i7k0Var.f99574b;
                if (i5 == 0) {
                    bga.m29073P(obj4);
                    if (((PlayerState) obj).track().mo49279c()) {
                        i7k0Var.f99574b = 1;
                        Object objEmit2 = this.f247605b.emit(obj, i7k0Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof j7k0) {
                    j7k0Var = (j7k0) fbkVar;
                    int i6 = j7k0Var.f109623b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        j7k0Var.f109623b = i6 - Integer.MIN_VALUE;
                    } else {
                        j7k0Var = new j7k0(this, fbkVar);
                    }
                } else {
                    j7k0Var = new j7k0(this, fbkVar);
                }
                Object obj5 = j7k0Var.f109622a;
                int i7 = j7k0Var.f109623b;
                if (i7 == 0) {
                    bga.m29073P(obj5);
                    String strUri = ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
                    j7k0Var.f109623b = 1;
                    Object objEmit3 = this.f247605b.emit(strUri, j7k0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof g9k0) {
                    g9k0Var = (g9k0) fbkVar;
                    int i8 = g9k0Var.f77822b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        g9k0Var.f77822b = i8 - Integer.MIN_VALUE;
                    } else {
                        g9k0Var = new g9k0(this, fbkVar);
                    }
                } else {
                    g9k0Var = new g9k0(this, fbkVar);
                }
                Object obj6 = g9k0Var.f77821a;
                int i9 = g9k0Var.f77822b;
                if (i9 == 0) {
                    bga.m29073P(obj6);
                    z8k0 z8k0Var = new z8k0(((Boolean) obj).booleanValue());
                    g9k0Var.f77822b = 1;
                    Object objEmit4 = this.f247605b.emit(z8k0Var, g9k0Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof h9k0) {
                    h9k0Var = (h9k0) fbkVar;
                    int i10 = h9k0Var.f88996b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        h9k0Var.f88996b = i10 - Integer.MIN_VALUE;
                    } else {
                        h9k0Var = new h9k0(this, fbkVar);
                    }
                } else {
                    h9k0Var = new h9k0(this, fbkVar);
                }
                Object obj7 = h9k0Var.f88995a;
                int i11 = h9k0Var.f88996b;
                if (i11 == 0) {
                    bga.m29073P(obj7);
                    Boolean boolValueOf2 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
                    h9k0Var.f88996b = 1;
                    Object objEmit5 = this.f247605b.emit(boolValueOf2, h9k0Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof i9k0) {
                    i9k0Var = (i9k0) fbkVar;
                    int i12 = i9k0Var.f100031b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        i9k0Var.f100031b = i12 - Integer.MIN_VALUE;
                    } else {
                        i9k0Var = new i9k0(this, fbkVar);
                    }
                } else {
                    i9k0Var = new i9k0(this, fbkVar);
                }
                Object obj8 = i9k0Var.f100030a;
                int i13 = i9k0Var.f100031b;
                if (i13 == 0) {
                    bga.m29073P(obj8);
                    Boolean boolValueOf3 = Boolean.valueOf(mkg1.m62148j((knm0) obj, h6p0.f88213a));
                    i9k0Var.f100031b = 1;
                    Object objEmit6 = this.f247605b.emit(boolValueOf3, i9k0Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof bck0) {
                    bck0Var = (bck0) fbkVar;
                    int i14 = bck0Var.f25908b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bck0Var.f25908b = i14 - Integer.MIN_VALUE;
                    } else {
                        bck0Var = new bck0(this, fbkVar);
                    }
                } else {
                    bck0Var = new bck0(this, fbkVar);
                }
                Object obj9 = bck0Var.f25907a;
                int i15 = bck0Var.f25908b;
                if (i15 == 0) {
                    bga.m29073P(obj9);
                    hck0 hck0Var = new hck0((wb50) obj);
                    bck0Var.f25908b = 1;
                    Object objEmit7 = this.f247605b.emit(hck0Var, bck0Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof yck0) {
                    yck0Var = (yck0) fbkVar;
                    int i16 = yck0Var.f271511b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        yck0Var.f271511b = i16 - Integer.MIN_VALUE;
                    } else {
                        yck0Var = new yck0(this, fbkVar);
                    }
                } else {
                    yck0Var = new yck0(this, fbkVar);
                }
                Object obj10 = yck0Var.f271510a;
                int i17 = yck0Var.f271511b;
                if (i17 == 0) {
                    bga.m29073P(obj10);
                    if (((Boolean) obj).booleanValue()) {
                        yck0Var.f271511b = 1;
                        Object objEmit8 = this.f247605b.emit(obj, yck0Var);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
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
                if (fbkVar instanceof zck0) {
                    zck0Var = (zck0) fbkVar;
                    int i18 = zck0Var.f281535b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        zck0Var.f281535b = i18 - Integer.MIN_VALUE;
                    } else {
                        zck0Var = new zck0(this, fbkVar);
                    }
                } else {
                    zck0Var = new zck0(this, fbkVar);
                }
                Object obj11 = zck0Var.f281534a;
                int i19 = zck0Var.f281535b;
                if (i19 == 0) {
                    bga.m29073P(obj11);
                    ((Boolean) obj).getClass();
                    zck0Var.f281535b = 1;
                    Object objEmit9 = this.f247605b.emit(dck0.f47574a, zck0Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof bdk0) {
                    bdk0Var = (bdk0) fbkVar;
                    int i20 = bdk0Var.f26126b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        bdk0Var.f26126b = i20 - Integer.MIN_VALUE;
                    } else {
                        bdk0Var = new bdk0(this, fbkVar);
                    }
                } else {
                    bdk0Var = new bdk0(this, fbkVar);
                }
                Object obj12 = bdk0Var.f26125a;
                int i21 = bdk0Var.f26126b;
                if (i21 == 0) {
                    bga.m29073P(obj12);
                    jck0 jck0Var = new jck0(((Boolean) obj).booleanValue());
                    bdk0Var.f26126b = 1;
                    Object objEmit10 = this.f247605b.emit(jck0Var, bdk0Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof cdk0) {
                    cdk0Var = (cdk0) fbkVar;
                    int i22 = cdk0Var.f36906b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cdk0Var.f36906b = i22 - Integer.MIN_VALUE;
                    } else {
                        cdk0Var = new cdk0(this, fbkVar);
                    }
                } else {
                    cdk0Var = new cdk0(this, fbkVar);
                }
                Object obj13 = cdk0Var.f36905a;
                int i23 = cdk0Var.f36906b;
                if (i23 == 0) {
                    bga.m29073P(obj13);
                    eck0 eck0Var = new eck0((String) obj);
                    cdk0Var.f36906b = 1;
                    Object objEmit11 = this.f247605b.emit(eck0Var, cdk0Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof ddk0) {
                    ddk0Var = (ddk0) fbkVar;
                    int i24 = ddk0Var.f47840b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ddk0Var.f47840b = i24 - Integer.MIN_VALUE;
                    } else {
                        ddk0Var = new ddk0(this, fbkVar);
                    }
                } else {
                    ddk0Var = new ddk0(this, fbkVar);
                }
                Object obj14 = ddk0Var.f47839a;
                int i25 = ddk0Var.f47840b;
                if (i25 == 0) {
                    bga.m29073P(obj14);
                    ick0 ick0Var = new ick0(((Boolean) obj).booleanValue());
                    ddk0Var.f47840b = 1;
                    Object objEmit12 = this.f247605b.emit(ick0Var, ddk0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof vdk0) {
                    vdk0Var = (vdk0) fbkVar;
                    int i26 = vdk0Var.f240416b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        vdk0Var.f240416b = i26 - Integer.MIN_VALUE;
                    } else {
                        vdk0Var = new vdk0(this, fbkVar);
                    }
                } else {
                    vdk0Var = new vdk0(this, fbkVar);
                }
                Object obj15 = vdk0Var.f240415a;
                int i27 = vdk0Var.f240416b;
                if (i27 == 0) {
                    bga.m29073P(obj15);
                    Boolean boolValueOf4 = Boolean.valueOf(!wj50.m88271j((v6g0) obj, t6g0.f217551a));
                    vdk0Var.f240416b = 1;
                    Object objEmit13 = this.f247605b.emit(boolValueOf4, vdk0Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof sek0) {
                    sek0Var = (sek0) fbkVar;
                    int i28 = sek0Var.f208318b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        sek0Var.f208318b = i28 - Integer.MIN_VALUE;
                    } else {
                        sek0Var = new sek0(this, fbkVar);
                    }
                } else {
                    sek0Var = new sek0(this, fbkVar);
                }
                Object obj16 = sek0Var.f208317a;
                int i29 = sek0Var.f208318b;
                if (i29 == 0) {
                    bga.m29073P(obj16);
                    rxb0 rxb0Var = (rxb0) obj;
                    if (wj50.m88271j(rxb0Var, oxb0.f170957b)) {
                        z = true;
                    } else {
                        if (!wj50.m88271j(rxb0Var, pxb0.f182269b) && !wj50.m88271j(rxb0Var, qxb0.f193613b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    sek0Var.f208318b = 1;
                    Object objEmit14 = this.f247605b.emit(boolValueOf5, sek0Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof sgk0) {
                    sgk0Var = (sgk0) fbkVar;
                    int i30 = sgk0Var.f208886b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        sgk0Var.f208886b = i30 - Integer.MIN_VALUE;
                    } else {
                        sgk0Var = new sgk0(this, fbkVar);
                    }
                } else {
                    sgk0Var = new sgk0(this, fbkVar);
                }
                Object obj17 = sgk0Var.f208885a;
                int i31 = sgk0Var.f208886b;
                if (i31 == 0) {
                    bga.m29073P(obj17);
                    if (((Boolean) ((pqm0) obj).f180351b).booleanValue()) {
                        sgk0Var.f208886b = 1;
                        Object objEmit15 = this.f247605b.emit(obj, sgk0Var);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit15 == yukVar15) {
                            return yukVar15;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof tgk0) {
                    tgk0Var = (tgk0) fbkVar;
                    int i32 = tgk0Var.f220210b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        tgk0Var.f220210b = i32 - Integer.MIN_VALUE;
                    } else {
                        tgk0Var = new tgk0(this, fbkVar);
                    }
                } else {
                    tgk0Var = new tgk0(this, fbkVar);
                }
                Object obj18 = tgk0Var.f220209a;
                int i33 = tgk0Var.f220210b;
                if (i33 == 0) {
                    bga.m29073P(obj18);
                    if (((PlayerState) obj).isPlaying()) {
                        tgk0Var.f220210b = 1;
                        Object objEmit16 = this.f247605b.emit(obj, tgk0Var);
                        yuk yukVar16 = yuk.f276404a;
                        if (objEmit16 == yukVar16) {
                            return yukVar16;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ehk0) {
                    ehk0Var = (ehk0) fbkVar;
                    int i34 = ehk0Var.f59613b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ehk0Var.f59613b = i34 - Integer.MIN_VALUE;
                    } else {
                        ehk0Var = new ehk0(this, fbkVar);
                    }
                } else {
                    ehk0Var = new ehk0(this, fbkVar);
                }
                Object obj19 = ehk0Var.f59612a;
                int i35 = ehk0Var.f59613b;
                if (i35 == 0) {
                    bga.m29073P(obj19);
                    if (((PlayerState) obj).track().mo49279c()) {
                        ehk0Var.f59613b = 1;
                        Object objEmit17 = this.f247605b.emit(obj, ehk0Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof fhk0) {
                    fhk0Var = (fhk0) fbkVar;
                    int i36 = fhk0Var.f69680b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        fhk0Var.f69680b = i36 - Integer.MIN_VALUE;
                    } else {
                        fhk0Var = new fhk0(this, fbkVar);
                    }
                } else {
                    fhk0Var = new fhk0(this, fbkVar);
                }
                Object obj20 = fhk0Var.f69679a;
                int i37 = fhk0Var.f69680b;
                if (i37 == 0) {
                    bga.m29073P(obj20);
                    if (((qs0) ((yk91) obj).f273651b) != null) {
                        fhk0Var.f69680b = 1;
                        Object objEmit18 = this.f247605b.emit(obj, fhk0Var);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof cok0) {
                    cok0Var = (cok0) fbkVar;
                    int i38 = cok0Var.f40288b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        cok0Var.f40288b = i38 - Integer.MIN_VALUE;
                    } else {
                        cok0Var = new cok0(this, fbkVar);
                    }
                } else {
                    cok0Var = new cok0(this, fbkVar);
                }
                Object obj21 = cok0Var.f40287a;
                int i39 = cok0Var.f40288b;
                if (i39 == 0) {
                    bga.m29073P(obj21);
                    q040 q040Var = (q040) obj;
                    String strPath = (q040Var == null || (zam0Var = q040Var.f183901a) == null) ? null : zam0Var.path();
                    cok0Var.f40288b = 1;
                    Object objEmit19 = this.f247605b.emit(strPath, cok0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 19:
                Object objEmit20 = this.f247605b.emit((qja0) obj, fbkVar);
                return objEmit20 == yuk.f276404a ? objEmit20 : w2a1.f247311a;
            case 20:
                if (fbkVar instanceof vok0) {
                    vok0Var = (vok0) fbkVar;
                    int i40 = vok0Var.f243494b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        vok0Var.f243494b = i40 - Integer.MIN_VALUE;
                    } else {
                        vok0Var = new vok0(this, fbkVar);
                    }
                } else {
                    vok0Var = new vok0(this, fbkVar);
                }
                Object obj22 = vok0Var.f243493a;
                int i41 = vok0Var.f243494b;
                if (i41 == 0) {
                    bga.m29073P(obj22);
                    if (((PlayerState) obj).track().mo49279c()) {
                        vok0Var.f243494b = 1;
                        Object objEmit21 = this.f247605b.emit(obj, vok0Var);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit21 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof wok0) {
                    wok0Var = (wok0) fbkVar;
                    int i42 = wok0Var.f253493b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        wok0Var.f253493b = i42 - Integer.MIN_VALUE;
                    } else {
                        wok0Var = new wok0(this, fbkVar);
                    }
                } else {
                    wok0Var = new wok0(this, fbkVar);
                }
                Object obj23 = wok0Var.f253492a;
                int i43 = wok0Var.f253493b;
                if (i43 == 0) {
                    bga.m29073P(obj23);
                    PlayerState playerState = (PlayerState) obj;
                    wj50.m88279p(playerState);
                    if (hdi.m47223O(playerState) && bm51.m29803n0(((ContextTrack) playerState.track().mo49278b()).uri(), "spotify:media:", false)) {
                        obj2 = hdi.m47221M(playerState) ? wr81.f254294a : vr81.f244109a;
                    } else {
                        obj2 = sr81.f213257a;
                    }
                    wok0Var.f253493b = 1;
                    Object objEmit22 = this.f247605b.emit(obj2, wok0Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit22 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof yok0) {
                    yok0Var = (yok0) fbkVar;
                    int i44 = yok0Var.f274690b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        yok0Var.f274690b = i44 - Integer.MIN_VALUE;
                    } else {
                        yok0Var = new yok0(this, fbkVar);
                    }
                } else {
                    yok0Var = new yok0(this, fbkVar);
                }
                Object obj24 = yok0Var.f274689a;
                int i45 = yok0Var.f274690b;
                if (i45 == 0) {
                    bga.m29073P(obj24);
                    Object obj25 = ((s6x0) obj).f206218a;
                    if (obj25 instanceof c6x0) {
                        obj25 = null;
                    }
                    if (obj25 != null) {
                        yok0Var.f274690b = 1;
                        Object objEmit23 = this.f247605b.emit(obj25, yok0Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit23 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof zok0) {
                    zok0Var = (zok0) fbkVar;
                    int i46 = zok0Var.f284809b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        zok0Var.f284809b = i46 - Integer.MIN_VALUE;
                    } else {
                        zok0Var = new zok0(this, fbkVar);
                    }
                } else {
                    zok0Var = new zok0(this, fbkVar);
                }
                Object obj26 = zok0Var.f284808a;
                int i47 = zok0Var.f284809b;
                if (i47 == 0) {
                    bga.m29073P(obj26);
                    it = ((Map) obj).entrySet().iterator();
                    i = 0;
                    nizVar = this.f247605b;
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = zok0Var.f284813f;
                    it = zok0Var.f284812e;
                    nizVar = zok0Var.f284811d;
                    bga.m29073P(obj26);
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    a1x0 a1x0Var = (a1x0) entry.getValue();
                    int iM38547C = edb.m38547C(a1x0Var.f11488b);
                    ghl0 chl0Var = null;
                    if (iM38547C != 0) {
                        if (iM38547C == 1 || iM38547C == 2) {
                            chl0Var = fhl0.f69682a;
                        } else if (iM38547C == 3) {
                            float f = a1x0Var.f11487a / 100.0f;
                            chl0Var = new chl0(f > 0.0f ? Float.valueOf(f) : null);
                        } else if (iM38547C == 4) {
                            chl0Var = bhl0.f27215a;
                        } else {
                            if (iM38547C != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            chl0Var = dhl0.f49128a;
                        }
                    }
                    if (chl0Var != null) {
                        hjl0 hjl0Var = new hjl0(str, chl0Var);
                        zok0Var.getClass();
                        zok0Var.f284811d = nizVar;
                        zok0Var.f284812e = it;
                        zok0Var.f284813f = i;
                        zok0Var.f284809b = 1;
                        Object objEmit24 = nizVar.emit(hjl0Var, zok0Var);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit24 == yukVar23) {
                            return yukVar23;
                        }
                    }
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof cpk0) {
                    cpk0Var = (cpk0) fbkVar;
                    int i48 = cpk0Var.f40574b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        cpk0Var.f40574b = i48 - Integer.MIN_VALUE;
                    } else {
                        cpk0Var = new cpk0(this, fbkVar);
                    }
                } else {
                    cpk0Var = new cpk0(this, fbkVar);
                }
                Object obj27 = cpk0Var.f40573a;
                int i49 = cpk0Var.f40574b;
                if (i49 == 0) {
                    bga.m29073P(obj27);
                    p2x0 p2x0Var = (p2x0) obj;
                    uok0 uok0Var = uok0.f232478f;
                    p2x0Var.getClass();
                    if (p2x0Var instanceof k2x0) {
                        objInvoke = new apk0(lau.f131415a, null);
                    } else {
                        if (!(p2x0Var instanceof m2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objInvoke = uok0Var.invoke(((m2x0) p2x0Var).f139474a);
                    }
                    cpk0Var.f40574b = 1;
                    Object objEmit25 = this.f247605b.emit(objInvoke, cpk0Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit25 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof qpk0) {
                    qpk0Var = (qpk0) fbkVar;
                    int i50 = qpk0Var.f191341b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        qpk0Var.f191341b = i50 - Integer.MIN_VALUE;
                    } else {
                        qpk0Var = new qpk0(this, fbkVar);
                    }
                } else {
                    qpk0Var = new qpk0(this, fbkVar);
                }
                Object obj28 = qpk0Var.f191340a;
                int i51 = qpk0Var.f191341b;
                if (i51 == 0) {
                    bga.m29073P(obj28);
                    if (!((rp80) obj).f201461b.isEmpty()) {
                        qpk0Var.f191341b = 1;
                        Object objEmit26 = this.f247605b.emit(obj, qpk0Var);
                        yuk yukVar25 = yuk.f276404a;
                        if (objEmit26 == yukVar25) {
                            return yukVar25;
                        }
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof ark0) {
                    ark0Var = (ark0) fbkVar;
                    int i52 = ark0Var.f19091b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ark0Var.f19091b = i52 - Integer.MIN_VALUE;
                    } else {
                        ark0Var = new ark0(this, fbkVar);
                    }
                } else {
                    ark0Var = new ark0(this, fbkVar);
                }
                Object obj29 = ark0Var.f19090a;
                int i53 = ark0Var.f19091b;
                if (i53 == 0) {
                    bga.m29073P(obj29);
                    xul0 xul0VarM92200a = xul0.m92200a((by50) obj);
                    ark0Var.f19091b = 1;
                    Object objEmit27 = this.f247605b.emit(xul0VarM92200a, ark0Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit27 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof gsk0) {
                    gsk0Var = (gsk0) fbkVar;
                    int i54 = gsk0Var.f83982b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        gsk0Var.f83982b = i54 - Integer.MIN_VALUE;
                    } else {
                        gsk0Var = new gsk0(this, fbkVar);
                    }
                } else {
                    gsk0Var = new gsk0(this, fbkVar);
                }
                Object obj30 = gsk0Var.f83981a;
                int i55 = gsk0Var.f83982b;
                if (i55 == 0) {
                    bga.m29073P(obj30);
                    urk0 urk0Var = new urk0(((Boolean) obj).booleanValue());
                    gsk0Var.f83982b = 1;
                    Object objEmit28 = this.f247605b.emit(urk0Var, gsk0Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit28 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof kuk0) {
                    kuk0Var = (kuk0) fbkVar;
                    int i56 = kuk0Var.f126627b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        kuk0Var.f126627b = i56 - Integer.MIN_VALUE;
                    } else {
                        kuk0Var = new kuk0(this, fbkVar);
                    }
                } else {
                    kuk0Var = new kuk0(this, fbkVar);
                }
                Object obj31 = kuk0Var.f126626a;
                int i57 = kuk0Var.f126627b;
                if (i57 == 0) {
                    bga.m29073P(obj31);
                    qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
                    Integer num = new Integer((qu80Var == null || (list = qu80Var.f192598d) == null) ? 0 : list.size());
                    kuk0Var.f126627b = 1;
                    Object objEmit29 = this.f247605b.emit(num, kuk0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit29 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof avk0) {
                    avk0Var = (avk0) fbkVar;
                    int i58 = avk0Var.f20207b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        avk0Var.f20207b = i58 - Integer.MIN_VALUE;
                    } else {
                        avk0Var = new avk0(this, fbkVar);
                    }
                } else {
                    avk0Var = new avk0(this, fbkVar);
                }
                Object obj32 = avk0Var.f20206a;
                int i59 = avk0Var.f20207b;
                if (i59 == 0) {
                    bga.m29073P(obj32);
                    Boolean boolValueOf6 = Boolean.valueOf(((EsOffline$GetOfflinePlaybackStatusResponse) obj).m16159n());
                    avk0Var.f20207b = 1;
                    Object objEmit30 = this.f247605b.emit(boolValueOf6, avk0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit30 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
        }
    }

    public w3k0(niz nizVar, uob uobVar) {
        this.f247604a = 23;
        this.f247605b = nizVar;
    }
}
