package p204p;

import com.spotify.ads.esperanto.proto.AdSlotEvent;
import com.spotify.ads.esperanto.proto.SubSlotResponse;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class aq21 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f18064b;

    public /* synthetic */ aq21(niz nizVar, int i) {
        this.f18063a = i;
        this.f18064b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:141:0x0265  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:197:0x032b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0372  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:259:0x041d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:283:0x0471  */
    /* JADX WARN: Code duplicated, block: B:300:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:329:0x0535  */
    /* JADX WARN: Code duplicated, block: B:357:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:387:0x0633  */
    /* JADX WARN: Code duplicated, block: B:408:0x0680  */
    /* JADX WARN: Code duplicated, block: B:427:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:444:0x0715  */
    /* JADX WARN: Code duplicated, block: B:456:0x0755  */
    /* JADX WARN: Code duplicated, block: B:467:0x077c  */
    /* JADX WARN: Code duplicated, block: B:484:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:503:0x0811  */
    /* JADX WARN: Code duplicated, block: B:524:0x086f  */
    /* JADX WARN: Code duplicated, block: B:547:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:569:0x091e  */
    /* JADX WARN: Code duplicated, block: B:598:0x099a  */
    /* JADX WARN: Code duplicated, block: B:615:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:649:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        zp21 zp21Var;
        oq21 oq21Var;
        pr21 pr21Var;
        qr21 qr21Var;
        pt21 pt21Var;
        int i;
        cv21 cv21Var;
        bx21 bx21Var;
        ky21 ky21Var;
        jf31 jf31Var;
        s131 s131Var;
        w131 w131Var;
        z131 z131Var;
        boolean z;
        c231 c231Var;
        n831 n831Var;
        p831 p831Var;
        be31 be31Var;
        qla1 qla1Var;
        wj31 wj31Var;
        String str;
        hm31 hm31Var;
        s6x0 s6x0Var;
        br31 br31Var;
        fr31 fr31Var;
        py31 py31Var;
        a341 a341Var;
        f441 f441Var;
        h441 h441Var;
        d541 d541Var;
        f541 f541Var;
        v541 v541Var;
        o741 o741Var;
        t741 t741Var;
        u741 u741Var;
        a841 a841Var;
        fh0 fh0Var;
        d841 d841Var;
        switch (this.f18063a) {
            case 0:
                if (fbkVar instanceof zp21) {
                    zp21Var = (zp21) fbkVar;
                    int i2 = zp21Var.f284915b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zp21Var.f284915b = i2 - Integer.MIN_VALUE;
                    } else {
                        zp21Var = new zp21(this, fbkVar);
                    }
                } else {
                    zp21Var = new zp21(this, fbkVar);
                }
                Object obj2 = zp21Var.f284914a;
                int i3 = zp21Var.f284915b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    zp21Var.f284915b = 1;
                    Object objEmit = this.f18064b.emit(boolValueOf, zp21Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof oq21) {
                    oq21Var = (oq21) fbkVar;
                    int i4 = oq21Var.f168059b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        oq21Var.f168059b = i4 - Integer.MIN_VALUE;
                    } else {
                        oq21Var = new oq21(this, fbkVar);
                    }
                } else {
                    oq21Var = new oq21(this, fbkVar);
                }
                Object obj3 = oq21Var.f168058a;
                int i5 = oq21Var.f168059b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    Restrictions restrictions = ((PlayerState) obj).restrictions();
                    oq21Var.f168059b = 1;
                    Object objEmit2 = this.f18064b.emit(restrictions, oq21Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof pr21) {
                    pr21Var = (pr21) fbkVar;
                    int i6 = pr21Var.f180484b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        pr21Var.f180484b = i6 - Integer.MIN_VALUE;
                    } else {
                        pr21Var = new pr21(this, fbkVar);
                    }
                } else {
                    pr21Var = new pr21(this, fbkVar);
                }
                Object obj4 = pr21Var.f180483a;
                int i7 = pr21Var.f180484b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    ur21 ur21Var = new ur21((List) obj);
                    pr21Var.f180484b = 1;
                    Object objEmit3 = this.f18064b.emit(ur21Var, pr21Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof qr21) {
                    qr21Var = (qr21) fbkVar;
                    int i8 = qr21Var.f191716b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        qr21Var.f191716b = i8 - Integer.MIN_VALUE;
                    } else {
                        qr21Var = new qr21(this, fbkVar);
                    }
                } else {
                    qr21Var = new qr21(this, fbkVar);
                }
                Object obj5 = qr21Var.f191715a;
                int i9 = qr21Var.f191716b;
                if (i9 == 0) {
                    bga.m29073P(obj5);
                    vr21 vr21Var = new vr21((List) obj);
                    qr21Var.f191716b = 1;
                    Object objEmit4 = this.f18064b.emit(vr21Var, qr21Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof pt21) {
                    pt21Var = (pt21) fbkVar;
                    int i10 = pt21Var.f181031b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pt21Var.f181031b = i10 - Integer.MIN_VALUE;
                    } else {
                        pt21Var = new pt21(this, fbkVar);
                    }
                } else {
                    pt21Var = new pt21(this, fbkVar);
                }
                Object obj6 = pt21Var.f181030a;
                int i11 = pt21Var.f181031b;
                if (i11 == 0) {
                    bga.m29073P(obj6);
                    AdSlotEvent adSlotEventM2715n = ((SubSlotResponse) obj).m2715n();
                    int iOrdinal = adSlotEventM2715n.m2594p().ordinal();
                    if (iOrdinal != 0) {
                        i = 3;
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                i = 2;
                            } else {
                                if (iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = 5;
                            }
                        }
                    } else {
                        i = 1;
                    }
                    ov0 ov0Var = new ov0(i, ttg1.m81525t(adSlotEventM2715n.m2595q()), ttg1.m81524s(adSlotEventM2715n.m2593n()), adSlotEventM2715n.m2596r());
                    pt21Var.f181031b = 1;
                    Object objEmit5 = this.f18064b.emit(ov0Var, pt21Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof cv21) {
                    cv21Var = (cv21) fbkVar;
                    int i12 = cv21Var.f42276b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        cv21Var.f42276b = i12 - Integer.MIN_VALUE;
                    } else {
                        cv21Var = new cv21(this, fbkVar);
                    }
                } else {
                    cv21Var = new cv21(this, fbkVar);
                }
                Object obj7 = cv21Var.f42275a;
                int i13 = cv21Var.f42276b;
                if (i13 == 0) {
                    bga.m29073P(obj7);
                    byte[] bArr = (byte[]) obj;
                    try {
                        SubSlotResponse subSlotResponseM2714o = SubSlotResponse.m2714o(bArr);
                        cv21Var.f42276b = 1;
                        Object objEmit6 = this.f18064b.emit(subSlotResponseM2714o, cv21Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.SubSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof bx21) {
                    bx21Var = (bx21) fbkVar;
                    int i14 = bx21Var.f31771b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bx21Var.f31771b = i14 - Integer.MIN_VALUE;
                    } else {
                        bx21Var = new bx21(this, fbkVar);
                    }
                } else {
                    bx21Var = new bx21(this, fbkVar);
                }
                Object obj8 = bx21Var.f31770a;
                int i15 = bx21Var.f31771b;
                if (i15 == 0) {
                    bga.m29073P(obj8);
                    Boolean bool = (Boolean) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(bool == null || !bool.booleanValue());
                    bx21Var.f31771b = 1;
                    Object objEmit7 = this.f18064b.emit(boolValueOf2, bx21Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ky21) {
                    ky21Var = (ky21) fbkVar;
                    int i16 = ky21Var.f127638b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ky21Var.f127638b = i16 - Integer.MIN_VALUE;
                    } else {
                        ky21Var = new ky21(this, fbkVar);
                    }
                } else {
                    ky21Var = new ky21(this, fbkVar);
                }
                Object obj9 = ky21Var.f127637a;
                int i17 = ky21Var.f127638b;
                if (i17 == 0) {
                    bga.m29073P(obj9);
                    by50 by50Var = (by50) obj;
                    if (by50Var == null) {
                        Boolean bool2 = Boolean.FALSE;
                        jf31Var = new jf31(bool2, bool2);
                    } else {
                        jf31Var = new jf31(Boolean.TRUE, Boolean.valueOf(by50Var.f32082h.f287209b.f224569e));
                    }
                    ky21Var.f127638b = 1;
                    Object objEmit8 = this.f18064b.emit(jf31Var, ky21Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof s131) {
                    s131Var = (s131) fbkVar;
                    int i18 = s131Var.f204588b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        s131Var.f204588b = i18 - Integer.MIN_VALUE;
                    } else {
                        s131Var = new s131(this, fbkVar);
                    }
                } else {
                    s131Var = new s131(this, fbkVar);
                }
                Object obj10 = s131Var.f204587a;
                int i19 = s131Var.f204588b;
                if (i19 == 0) {
                    bga.m29073P(obj10);
                    if (!((s431) obj).f205436i.isEmpty()) {
                        s131Var.f204588b = 1;
                        Object objEmit9 = this.f18064b.emit(obj, s131Var);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof w131) {
                    w131Var = (w131) fbkVar;
                    int i20 = w131Var.f246936b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        w131Var.f246936b = i20 - Integer.MIN_VALUE;
                    } else {
                        w131Var = new w131(this, fbkVar);
                    }
                } else {
                    w131Var = new w131(this, fbkVar);
                }
                Object obj11 = w131Var.f246935a;
                int i21 = w131Var.f246936b;
                if (i21 == 0) {
                    bga.m29073P(obj11);
                    Boolean boolValueOf3 = Boolean.valueOf(((y131) obj).f268167a);
                    w131Var.f246936b = 1;
                    Object objEmit10 = this.f18064b.emit(boolValueOf3, w131Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof z131) {
                    z131Var = (z131) fbkVar;
                    int i22 = z131Var.f278221b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        z131Var.f278221b = i22 - Integer.MIN_VALUE;
                    } else {
                        z131Var = new z131(this, fbkVar);
                    }
                } else {
                    z131Var = new z131(this, fbkVar);
                }
                Object obj12 = z131Var.f278220a;
                int i23 = z131Var.f278221b;
                if (i23 == 0) {
                    bga.m29073P(obj12);
                    ty80 ty80Var = (ty80) obj;
                    if (ty80Var.m81955a()) {
                        z = false;
                    } else if (g0b1.m43270l(ty80Var.f224881j, (in80[]) Arrays.copyOf(new in80[]{in80.f103923d, in80.f103927h}, 2))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y131 y131Var = new y131(z);
                    z131Var.f278221b = 1;
                    Object objEmit11 = this.f18064b.emit(y131Var, z131Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof c231) {
                    c231Var = (c231) fbkVar;
                    int i24 = c231Var.f33286b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c231Var.f33286b = i24 - Integer.MIN_VALUE;
                    } else {
                        c231Var = new c231(this, fbkVar);
                    }
                } else {
                    c231Var = new c231(this, fbkVar);
                }
                Object obj13 = c231Var.f33285a;
                int i25 = c231Var.f33286b;
                if (i25 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf4 = Boolean.valueOf(wj50.m88271j(((m431) obj).f139804b, Boolean.TRUE));
                    c231Var.f33286b = 1;
                    Object objEmit12 = this.f18064b.emit(boolValueOf4, c231Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof n831) {
                    n831Var = (n831) fbkVar;
                    int i26 = n831Var.f151335b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        n831Var.f151335b = i26 - Integer.MIN_VALUE;
                    } else {
                        n831Var = new n831(this, fbkVar);
                    }
                } else {
                    n831Var = new n831(this, fbkVar);
                }
                Object obj14 = n831Var.f151334a;
                int i27 = n831Var.f151335b;
                if (i27 == 0) {
                    bga.m29073P(obj14);
                    if (((ta80) obj) == ta80.ON_PAUSE) {
                        n831Var.f151335b = 1;
                        Object objEmit13 = this.f18064b.emit(obj, n831Var);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit13 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof p831) {
                    p831Var = (p831) fbkVar;
                    int i28 = p831Var.f174856b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        p831Var.f174856b = i28 - Integer.MIN_VALUE;
                    } else {
                        p831Var = new p831(this, fbkVar);
                    }
                } else {
                    p831Var = new p831(this, fbkVar);
                }
                Object obj15 = p831Var.f174855a;
                int i29 = p831Var.f174856b;
                if (i29 == 0) {
                    bga.m29073P(obj15);
                    e0r0 e0r0Var = (e0r0) obj;
                    Object objSingletonList = e0r0Var != null ? Collections.singletonList(e0r0Var.f55025b) : lau.f131415a;
                    p831Var.f174856b = 1;
                    Object objEmit14 = this.f18064b.emit(objSingletonList, p831Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof be31) {
                    be31Var = (be31) fbkVar;
                    int i30 = be31Var.f26269b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        be31Var.f26269b = i30 - Integer.MIN_VALUE;
                    } else {
                        be31Var = new be31(this, fbkVar);
                    }
                } else {
                    be31Var = new be31(this, fbkVar);
                }
                Object obj16 = be31Var.f26268a;
                int i31 = be31Var.f26269b;
                if (i31 == 0) {
                    bga.m29073P(obj16);
                    ae31 ae31Var = (ae31) obj;
                    Object wd31Var = xd31.f260369a;
                    if (ae31Var != null && ae31Var.f14737a >= 2 && ae31Var.f14738b && (qla1Var = ae31Var.f14740d) != null) {
                        String str2 = qla1Var.f189803b;
                        String str3 = qla1Var.f189804c;
                        String str4 = qla1Var.f189806e;
                        if (str4 == null) {
                            str4 = qla1Var.f189807f;
                        }
                        wd31Var = new wd31(new vd31(str2, str3, qla1Var.f189808g, str4), ae31Var.f14739c, ae31Var.f14741e);
                    }
                    be31Var.f26269b = 1;
                    Object objEmit15 = this.f18064b.emit(wd31Var, be31Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof wj31) {
                    wj31Var = (wj31) fbkVar;
                    int i32 = wj31Var.f251838b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        wj31Var.f251838b = i32 - Integer.MIN_VALUE;
                    } else {
                        wj31Var = new wj31(this, fbkVar);
                    }
                } else {
                    wj31Var = new wj31(this, fbkVar);
                }
                Object obj17 = wj31Var.f251837a;
                int i33 = wj31Var.f251838b;
                if (i33 == 0) {
                    bga.m29073P(obj17);
                    Set<v860> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                    for (v860 v860Var : set) {
                        String str5 = v860Var.f238412a;
                        int iM38547C = edb.m38547C(v860Var.f238413b);
                        if (iM38547C == 0) {
                            str = "far";
                        } else {
                            if (iM38547C != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "close";
                        }
                        arrayList.add(new z660(str5, Collections.singletonMap("ble_range", str)));
                    }
                    w660 w660Var = new w660(g6f.m43736n1(arrayList), xw50.f266591c);
                    wj31Var.f251838b = 1;
                    Object objEmit16 = this.f18064b.emit(w660Var, wj31Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof hm31) {
                    hm31Var = (hm31) fbkVar;
                    int i34 = hm31Var.f92809b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hm31Var.f92809b = i34 - Integer.MIN_VALUE;
                    } else {
                        hm31Var = new hm31(this, fbkVar);
                    }
                } else {
                    hm31Var = new hm31(this, fbkVar);
                }
                Object obj18 = hm31Var.f92808a;
                int i35 = hm31Var.f92809b;
                if (i35 == 0) {
                    bga.m29073P(obj18);
                    qho qhoVar = (qho) obj;
                    if (qhoVar instanceof nho) {
                        s6x0Var = new s6x0(new c6x0(new Exception(((nho) qhoVar).f154041a.getMessage())));
                    } else if (qhoVar instanceof oho) {
                        s6x0Var = new s6x0(((oho) qhoVar).f165512a);
                    } else {
                        if (!wj50.m88271j(qhoVar, pho.f177693a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s6x0Var = null;
                    }
                    if (s6x0Var != null) {
                        hm31Var.f92809b = 1;
                        Object objEmit17 = this.f18064b.emit(s6x0Var, hm31Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof br31) {
                    br31Var = (br31) fbkVar;
                    int i36 = br31Var.f29960b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        br31Var.f29960b = i36 - Integer.MIN_VALUE;
                    } else {
                        br31Var = new br31(this, fbkVar);
                    }
                } else {
                    br31Var = new br31(this, fbkVar);
                }
                Object obj19 = br31Var.f29959a;
                int i37 = br31Var.f29960b;
                if (i37 == 0) {
                    bga.m29073P(obj19);
                    ar31 ar31Var = new ar31((i490) obj);
                    br31Var.f29960b = 1;
                    Object objEmit18 = this.f18064b.emit(ar31Var, br31Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof fr31) {
                    fr31Var = (fr31) fbkVar;
                    int i38 = fr31Var.f72348b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        fr31Var.f72348b = i38 - Integer.MIN_VALUE;
                    } else {
                        fr31Var = new fr31(this, fbkVar);
                    }
                } else {
                    fr31Var = new fr31(this, fbkVar);
                }
                Object obj20 = fr31Var.f72347a;
                int i39 = fr31Var.f72348b;
                if (i39 == 0) {
                    bga.m29073P(obj20);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    i490 i490Var = ohoVar != null ? (i490) ohoVar.f165512a : null;
                    if (i490Var != null) {
                        fr31Var.f72348b = 1;
                        Object objEmit19 = this.f18064b.emit(i490Var, fr31Var);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit19 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof py31) {
                    py31Var = (py31) fbkVar;
                    int i40 = py31Var.f183331b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        py31Var.f183331b = i40 - Integer.MIN_VALUE;
                    } else {
                        py31Var = new py31(this, fbkVar);
                    }
                } else {
                    py31Var = new py31(this, fbkVar);
                }
                Object obj21 = py31Var.f183330a;
                int i41 = py31Var.f183331b;
                if (i41 == 0) {
                    bga.m29073P(obj21);
                    oy31 oy31Var = (oy31) obj;
                    Object obj22 = wj50.m88271j(oy31Var, ky31.f127644a) ? y821.f270178a : wj50.m88271j(oy31Var, ly31.f137949a) ? m821.f140907a : null;
                    py31Var.f183331b = 1;
                    Object objEmit20 = this.f18064b.emit(obj22, py31Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof a341) {
                    a341Var = (a341) fbkVar;
                    int i42 = a341Var.f11866b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        a341Var.f11866b = i42 - Integer.MIN_VALUE;
                    } else {
                        a341Var = new a341(this, fbkVar);
                    }
                } else {
                    a341Var = new a341(this, fbkVar);
                }
                Object obj23 = a341Var.f11865a;
                int i43 = a341Var.f11866b;
                if (i43 == 0) {
                    bga.m29073P(obj23);
                    xxd1 xxd1Var2 = (xxd1) obj;
                    Boolean boolValueOf5 = Boolean.valueOf(wj50.m88271j(xxd1Var2 != null ? xxd1Var2.f266948b : null, qvd1.f192981b));
                    a341Var.f11866b = 1;
                    Object objEmit21 = this.f18064b.emit(boolValueOf5, a341Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof f441) {
                    f441Var = (f441) fbkVar;
                    int i44 = f441Var.f65673b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        f441Var.f65673b = i44 - Integer.MIN_VALUE;
                    } else {
                        f441Var = new f441(this, fbkVar);
                    }
                } else {
                    f441Var = new f441(this, fbkVar);
                }
                Object obj24 = f441Var.f65672a;
                int i45 = f441Var.f65673b;
                if (i45 == 0) {
                    bga.m29073P(obj24);
                    m141 m141Var = new m141((t541) obj);
                    f441Var.f65673b = 1;
                    Object objEmit22 = this.f18064b.emit(m141Var, f441Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof h441) {
                    h441Var = (h441) fbkVar;
                    int i46 = h441Var.f87426b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        h441Var.f87426b = i46 - Integer.MIN_VALUE;
                    } else {
                        h441Var = new h441(this, fbkVar);
                    }
                } else {
                    h441Var = new h441(this, fbkVar);
                }
                Object obj25 = h441Var.f87425a;
                int i47 = h441Var.f87426b;
                if (i47 == 0) {
                    bga.m29073P(obj25);
                    api apiVar = (api) ((xul0) obj).mo49283h();
                    i141 i141Var = new i141(apiVar == null || apiVar.mo26697m() || apiVar.getState() != 4 || apiVar.mo26705u());
                    h441Var.f87426b = 1;
                    Object objEmit23 = this.f18064b.emit(i141Var, h441Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof d541) {
                    d541Var = (d541) fbkVar;
                    int i48 = d541Var.f45337b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        d541Var.f45337b = i48 - Integer.MIN_VALUE;
                    } else {
                        d541Var = new d541(this, fbkVar);
                    }
                } else {
                    d541Var = new d541(this, fbkVar);
                }
                Object obj26 = d541Var.f45336a;
                int i49 = d541Var.f45337b;
                if (i49 == 0) {
                    bga.m29073P(obj26);
                    Boolean bool3 = (Boolean) obj;
                    if (bool3 == null || bool3.equals(Boolean.FALSE)) {
                        f541Var = f541.f65937b;
                    } else {
                        if (!bool3.equals(Boolean.TRUE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f541Var = f541.f65938c;
                    }
                    d541Var.f45337b = 1;
                    Object objEmit24 = this.f18064b.emit(f541Var, d541Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof v541) {
                    v541Var = (v541) fbkVar;
                    int i50 = v541Var.f237312b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        v541Var.f237312b = i50 - Integer.MIN_VALUE;
                    } else {
                        v541Var = new v541(this, fbkVar);
                    }
                } else {
                    v541Var = new v541(this, fbkVar);
                }
                Object obj27 = v541Var.f237311a;
                int i51 = v541Var.f237312b;
                if (i51 == 0) {
                    bga.m29073P(obj27);
                    EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = (EsContextPlayerState$ContextPlayerState) obj;
                    Object r541Var = (esContextPlayerState$ContextPlayerState.m17736x() && !esContextPlayerState$ContextPlayerState.m17737y() && Boolean.parseBoolean((String) esContextPlayerState$ContextPlayerState.m17720S().m17850q().getMetadataMap().get("is_transition_preview"))) ? q541.f185396a : (esContextPlayerState$ContextPlayerState.m17738z() && !esContextPlayerState$ContextPlayerState.m17737y() && Boolean.parseBoolean((String) esContextPlayerState$ContextPlayerState.m17720S().m17850q().getMetadataMap().get("is_transition_preview"))) ? new r541(esContextPlayerState$ContextPlayerState.m17720S().m17850q().getUri()) : s541.f205728a;
                    v541Var.f237312b = 1;
                    Object objEmit25 = this.f18064b.emit(r541Var, v541Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof o741) {
                    o741Var = (o741) fbkVar;
                    int i52 = o741Var.f162465b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        o741Var.f162465b = i52 - Integer.MIN_VALUE;
                    } else {
                        o741Var = new o741(this, fbkVar);
                    }
                } else {
                    o741Var = new o741(this, fbkVar);
                }
                Object obj28 = o741Var.f162464a;
                int i53 = o741Var.f162465b;
                if (i53 == 0) {
                    bga.m29073P(obj28);
                    String strContextUri = ((PlayerState) obj).contextUri();
                    o741Var.f162465b = 1;
                    Object objEmit26 = this.f18064b.emit(strContextUri, o741Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof t741) {
                    t741Var = (t741) fbkVar;
                    int i54 = t741Var.f217679b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        t741Var.f217679b = i54 - Integer.MIN_VALUE;
                    } else {
                        t741Var = new t741(this, fbkVar);
                    }
                } else {
                    t741Var = new t741(this, fbkVar);
                }
                Object obj29 = t741Var.f217678a;
                int i55 = t741Var.f217679b;
                if (i55 == 0) {
                    bga.m29073P(obj29);
                    if (((PlayerState) obj).track().mo49279c()) {
                        t741Var.f217679b = 1;
                        Object objEmit27 = this.f18064b.emit(obj, t741Var);
                        yuk yukVar27 = yuk.f276404a;
                        if (objEmit27 == yukVar27) {
                            return yukVar27;
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
                if (fbkVar instanceof u741) {
                    u741Var = (u741) fbkVar;
                    int i56 = u741Var.f227501b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        u741Var.f227501b = i56 - Integer.MIN_VALUE;
                    } else {
                        u741Var = new u741(this, fbkVar);
                    }
                } else {
                    u741Var = new u741(this, fbkVar);
                }
                Object obj30 = u741Var.f227500a;
                int i57 = u741Var.f227501b;
                if (i57 == 0) {
                    bga.m29073P(obj30);
                    pqm0 pqm0Var = (pqm0) obj;
                    if (wj50.m88271j(((fh0) pqm0Var.f180350a).f69506a, ((ContextTrack) ((PlayerState) pqm0Var.f180351b).track().mo49278b()).metadata().get(ContextTrack.Metadata.KEY_AD_ID))) {
                        u741Var.f227501b = 1;
                        Object objEmit28 = this.f18064b.emit(obj, u741Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
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
                if (fbkVar instanceof a841) {
                    a841Var = (a841) fbkVar;
                    int i58 = a841Var.f13192b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        a841Var.f13192b = i58 - Integer.MIN_VALUE;
                    } else {
                        a841Var = new a841(this, fbkVar);
                    }
                } else {
                    a841Var = new a841(this, fbkVar);
                }
                Object obj31 = a841Var.f13191a;
                int i59 = a841Var.f13192b;
                if (i59 == 0) {
                    bga.m29073P(obj31);
                    sv0 sv0Var = (sv0) obj;
                    if (sv0Var instanceof pv0) {
                        fh0Var = ((pv0) sv0Var).f181558a;
                    } else {
                        if (!(sv0Var instanceof qv0) && !wj50.m88271j(sv0Var, rv0.f202973a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fh0Var = null;
                    }
                    a841Var.f13192b = 1;
                    Object objEmit29 = this.f18064b.emit(fh0Var, a841Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof d841) {
                    d841Var = (d841) fbkVar;
                    int i60 = d841Var.f46365b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        d841Var.f46365b = i60 - Integer.MIN_VALUE;
                    } else {
                        d841Var = new d841(this, fbkVar);
                    }
                } else {
                    d841Var = new d841(this, fbkVar);
                }
                Object obj32 = d841Var.f46364a;
                int i61 = d841Var.f46365b;
                if (i61 == 0) {
                    bga.m29073P(obj32);
                    gi20 gi20VarM44766a = gi20.m44766a((gi20) obj, null, false, false, 0, null, false, 63);
                    d841Var.f46365b = 1;
                    Object objEmit30 = this.f18064b.emit(gi20VarM44766a, d841Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
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

    public /* synthetic */ aq21(niz nizVar, Object obj, int i) {
        this.f18063a = i;
        this.f18064b = nizVar;
    }
}
