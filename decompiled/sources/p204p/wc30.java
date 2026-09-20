package p204p;

import com.spotify.ads.esperanto.proto.SubBreakChangedResponse;
import com.spotify.ads.esperanto.proto.SubInStreamResponse;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$IsbnScanItemData;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.jam.internal.socialconnect.models.BroadcastStatusUpdate;
import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class wc30 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f249947b;

    public /* synthetic */ wc30(niz nizVar, int i) {
        this.f249946a = i;
        this.f249947b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x0227  */
    /* JADX WARN: Code duplicated, block: B:165:0x026b  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:200:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:223:0x034d  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:289:0x0440  */
    /* JADX WARN: Code duplicated, block: B:324:0x0504  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:347:0x055c  */
    /* JADX WARN: Code duplicated, block: B:364:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:381:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:403:0x0645  */
    /* JADX WARN: Code duplicated, block: B:429:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:446:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:463:0x0746  */
    /* JADX WARN: Code duplicated, block: B:485:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:507:0x0800  */
    /* JADX WARN: Code duplicated, block: B:528:0x0852  */
    /* JADX WARN: Code duplicated, block: B:558:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:579:0x0917  */
    /* JADX WARN: Code duplicated, block: B:596:0x0963  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        vc30 vc30Var;
        u740 u740Var;
        zg40 zg40Var;
        li40 li40Var;
        Object qi40Var;
        int i;
        mk40 mk40Var;
        il40 il40Var;
        jl40 jl40Var;
        ll40 ll40Var;
        ml40 ml40Var;
        xt40 xt40Var;
        c950 c950Var;
        mb50 mb50Var;
        xb50 xb50Var;
        nk50 nk50Var;
        cp50 cp50Var;
        Object ouiVar;
        Object nuiVar;
        lp50 lp50Var;
        CollectionItemdata$ItemData collectionItemdata$ItemDataM6882q;
        CollectionItemdata$IsbnScanItemData collectionItemdata$IsbnScanItemDataM6823r;
        pu50 pu50Var;
        int i2;
        int i3;
        bv50 bv50Var;
        ly50 ly50Var;
        my50 my50Var;
        yy50 yy50Var;
        zy50 zy50Var;
        fz50 fz50Var;
        gz50 gz50Var;
        hz50 hz50Var;
        m060 m060Var;
        v160 v160Var;
        tx50 tx50Var;
        d260 d260Var;
        switch (this.f249946a) {
            case 0:
                if (fbkVar instanceof vc30) {
                    vc30Var = (vc30) fbkVar;
                    int i4 = vc30Var.f239657b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vc30Var.f239657b = i4 - Integer.MIN_VALUE;
                    } else {
                        vc30Var = new vc30(this, fbkVar);
                    }
                } else {
                    vc30Var = new vc30(this, fbkVar);
                }
                Object obj2 = vc30Var.f239656a;
                int i5 = vc30Var.f239657b;
                if (i5 == 0) {
                    bga.m29073P(obj2);
                    nc30 nc30Var = new nc30((ByteBuffer) obj);
                    vc30Var.f239657b = 1;
                    Object objEmit = this.f249947b.emit(nc30Var, vc30Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof u740) {
                    u740Var = (u740) fbkVar;
                    int i6 = u740Var.f227498b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        u740Var.f227498b = i6 - Integer.MIN_VALUE;
                    } else {
                        u740Var = new u740(this, fbkVar);
                    }
                } else {
                    u740Var = new u740(this, fbkVar);
                }
                Object obj3 = u740Var.f227497a;
                int i7 = u740Var.f227498b;
                if (i7 == 0) {
                    bga.m29073P(obj3);
                    Set set = (Set) obj;
                    wj50.m88279p(set);
                    s740 s740Var = new s740(lau.f131415a, set);
                    u740Var.f227498b = 1;
                    Object objEmit2 = this.f249947b.emit(s740Var, u740Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof zg40) {
                    zg40Var = (zg40) fbkVar;
                    int i8 = zg40Var.f282478b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        zg40Var.f282478b = i8 - Integer.MIN_VALUE;
                    } else {
                        zg40Var = new zg40(this, fbkVar);
                    }
                } else {
                    zg40Var = new zg40(this, fbkVar);
                }
                Object obj4 = zg40Var.f282477a;
                int i9 = zg40Var.f282478b;
                if (i9 == 0) {
                    bga.m29073P(obj4);
                    wg40 wg40Var = (wg40) obj;
                    sg40 sg40VarM61776x = wg40Var != null ? mhf1.m61776x(wg40Var) : null;
                    zg40Var.f282478b = 1;
                    Object objEmit3 = this.f249947b.emit(sg40VarM61776x, zg40Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof li40) {
                    li40Var = (li40) fbkVar;
                    int i10 = li40Var.f133720b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        li40Var.f133720b = i10 - Integer.MIN_VALUE;
                    } else {
                        li40Var = new li40(this, fbkVar);
                    }
                } else {
                    li40Var = new li40(this, fbkVar);
                }
                Object obj5 = li40Var.f133719a;
                int i11 = li40Var.f133720b;
                if (i11 == 0) {
                    bga.m29073P(obj5);
                    rg40 rg40Var = (rg40) obj;
                    boolean z = rg40Var.f198825b;
                    float f = rg40Var.f198826c;
                    if (z) {
                        qi40Var = new oi40(rg40Var.f198829f);
                    } else {
                        boolean z2 = rg40Var.f198824a;
                        if (z2 || f < 1.0f) {
                            qi40Var = (!z2 || (i = rg40Var.f198828e) <= 0) ? pi40.f177828a : new qi40(rg40Var.f198827d, i, n0e1.m63437n(q3d0.m72083N(f * 100), 0, 100));
                        } else {
                            qi40Var = ni40.f154174a;
                        }
                    }
                    li40Var.f133720b = 1;
                    Object objEmit4 = this.f249947b.emit(qi40Var, li40Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof mk40) {
                    mk40Var = (mk40) fbkVar;
                    int i12 = mk40Var.f144489b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        mk40Var.f144489b = i12 - Integer.MIN_VALUE;
                    } else {
                        mk40Var = new mk40(this, fbkVar);
                    }
                } else {
                    mk40Var = new mk40(this, fbkVar);
                }
                Object obj6 = mk40Var.f144488a;
                int i13 = mk40Var.f144489b;
                if (i13 == 0) {
                    bga.m29073P(obj6);
                    Boolean bool = (Boolean) ((gv31) obj).f84602a;
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    mk40Var.f144489b = 1;
                    Object objEmit5 = this.f249947b.emit(boolValueOf, mk40Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof il40) {
                    il40Var = (il40) fbkVar;
                    int i14 = il40Var.f103284b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        il40Var.f103284b = i14 - Integer.MIN_VALUE;
                    } else {
                        il40Var = new il40(this, fbkVar);
                    }
                } else {
                    il40Var = new il40(this, fbkVar);
                }
                Object obj7 = il40Var.f103283a;
                int i15 = il40Var.f103284b;
                if (i15 == 0) {
                    bga.m29073P(obj7);
                    byte[] bArr = (byte[]) obj;
                    try {
                        SubBreakChangedResponse subBreakChangedResponseM2701o = SubBreakChangedResponse.m2701o(bArr);
                        il40Var.f103284b = 1;
                        Object objEmit6 = this.f249947b.emit(subBreakChangedResponseM2701o, il40Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.SubBreakChangedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof jl40) {
                    jl40Var = (jl40) fbkVar;
                    int i16 = jl40Var.f113483b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        jl40Var.f113483b = i16 - Integer.MIN_VALUE;
                    } else {
                        jl40Var = new jl40(this, fbkVar);
                    }
                } else {
                    jl40Var = new jl40(this, fbkVar);
                }
                Object obj8 = jl40Var.f113482a;
                int i17 = jl40Var.f113483b;
                if (i17 == 0) {
                    bga.m29073P(obj8);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        SubInStreamResponse subInStreamResponseM2710o = SubInStreamResponse.m2710o(bArr2);
                        jl40Var.f113483b = 1;
                        Object objEmit7 = this.f249947b.emit(subInStreamResponseM2710o, jl40Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.SubInStreamResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ll40) {
                    ll40Var = (ll40) fbkVar;
                    int i18 = ll40Var.f134527b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ll40Var.f134527b = i18 - Integer.MIN_VALUE;
                    } else {
                        ll40Var = new ll40(this, fbkVar);
                    }
                } else {
                    ll40Var = new ll40(this, fbkVar);
                }
                Object obj9 = ll40Var.f134526a;
                int i19 = ll40Var.f134527b;
                if (i19 == 0) {
                    bga.m29073P(obj9);
                    nl40 nl40Var = new nl40(ttg1.m81524s(((SubInStreamResponse) obj).m2711n()));
                    ll40Var.f134527b = 1;
                    Object objEmit8 = this.f249947b.emit(nl40Var, ll40Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof ml40) {
                    ml40Var = (ml40) fbkVar;
                    int i20 = ml40Var.f144753b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ml40Var.f144753b = i20 - Integer.MIN_VALUE;
                    } else {
                        ml40Var = new ml40(this, fbkVar);
                    }
                } else {
                    ml40Var = new ml40(this, fbkVar);
                }
                Object obj10 = ml40Var.f144752a;
                int i21 = ml40Var.f144753b;
                if (i21 == 0) {
                    bga.m29073P(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(((SubBreakChangedResponse) obj).m2702n());
                    ml40Var.f144753b = 1;
                    Object objEmit9 = this.f249947b.emit(boolValueOf2, ml40Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                Object objEmit10 = this.f249947b.emit(obj, fbkVar);
                return objEmit10 == yuk.f276404a ? objEmit10 : w2a1.f247311a;
            case 10:
                if (fbkVar instanceof xt40) {
                    xt40Var = (xt40) fbkVar;
                    int i22 = xt40Var.f265747b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        xt40Var.f265747b = i22 - Integer.MIN_VALUE;
                    } else {
                        xt40Var = new xt40(this, fbkVar);
                    }
                } else {
                    xt40Var = new xt40(this, fbkVar);
                }
                Object obj11 = xt40Var.f265746a;
                int i23 = xt40Var.f265747b;
                if (i23 == 0) {
                    bga.m29073P(obj11);
                    pad1 pad1Var = (pad1) ((ty80) obj).f224877f.f271279x.mo30169a(pad1.class);
                    Boolean boolValueOf3 = Boolean.valueOf((pad1Var != null ? pad1Var.f175509a : null) instanceof kad1);
                    xt40Var.f265747b = 1;
                    Object objEmit11 = this.f249947b.emit(boolValueOf3, xt40Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit11 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 11:
                Object objEmit12 = this.f249947b.emit((b250) obj, fbkVar);
                return objEmit12 == yuk.f276404a ? objEmit12 : w2a1.f247311a;
            case 12:
                if (fbkVar instanceof c950) {
                    c950Var = (c950) fbkVar;
                    int i24 = c950Var.f35403b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c950Var.f35403b = i24 - Integer.MIN_VALUE;
                    } else {
                        c950Var = new c950(this, fbkVar);
                    }
                } else {
                    c950Var = new c950(this, fbkVar);
                }
                Object obj12 = c950Var.f35402a;
                int i25 = c950Var.f35403b;
                if (i25 == 0) {
                    bga.m29073P(obj12);
                    d950 d950Var = new d950((wb50) obj);
                    c950Var.f35403b = 1;
                    Object objEmit13 = this.f249947b.emit(d950Var, c950Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit13 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof mb50) {
                    mb50Var = (mb50) fbkVar;
                    int i26 = mb50Var.f141801b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        mb50Var.f141801b = i26 - Integer.MIN_VALUE;
                    } else {
                        mb50Var = new mb50(this, fbkVar);
                    }
                } else {
                    mb50Var = new mb50(this, fbkVar);
                }
                Object obj13 = mb50Var.f141800a;
                int i27 = mb50Var.f141801b;
                if (i27 == 0) {
                    bga.m29073P(obj13);
                    o821 o821Var = new o821(((Boolean) obj).booleanValue());
                    mb50Var.f141801b = 1;
                    Object objEmit14 = this.f249947b.emit(o821Var, mb50Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit14 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof xb50) {
                    xb50Var = (xb50) fbkVar;
                    int i28 = xb50Var.f259842b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        xb50Var.f259842b = i28 - Integer.MIN_VALUE;
                    } else {
                        xb50Var = new xb50(this, fbkVar);
                    }
                } else {
                    xb50Var = new xb50(this, fbkVar);
                }
                Object obj14 = xb50Var.f259841a;
                int i29 = xb50Var.f259842b;
                if (i29 == 0) {
                    bga.m29073P(obj14);
                    p821 p821Var = new p821((wb50) obj);
                    xb50Var.f259842b = 1;
                    Object objEmit15 = this.f249947b.emit(p821Var, xb50Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit15 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof nk50) {
                    nk50Var = (nk50) fbkVar;
                    int i30 = nk50Var.f154793b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        nk50Var.f154793b = i30 - Integer.MIN_VALUE;
                    } else {
                        nk50Var = new nk50(this, fbkVar);
                    }
                } else {
                    nk50Var = new nk50(this, fbkVar);
                }
                Object obj15 = nk50Var.f154792a;
                int i31 = nk50Var.f154793b;
                if (i31 == 0) {
                    bga.m29073P(obj15);
                    gmr0 gmr0Var = (gmr0) g6f.m43745s0((List) obj);
                    gk50 gk50Var = new gk50(gmr0Var != null ? gmr0Var.f81451b : null, gmr0Var != null ? gmr0Var.f81455f : null);
                    nk50Var.f154793b = 1;
                    Object objEmit16 = this.f249947b.emit(gk50Var, nk50Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit16 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof cp50) {
                    cp50Var = (cp50) fbkVar;
                    int i32 = cp50Var.f40463b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        cp50Var.f40463b = i32 - Integer.MIN_VALUE;
                    } else {
                        cp50Var = new cp50(this, fbkVar);
                    }
                } else {
                    cp50Var = new cp50(this, fbkVar);
                }
                Object obj16 = cp50Var.f40462a;
                int i33 = cp50Var.f40463b;
                if (i33 == 0) {
                    bga.m29073P(obj16);
                    api apiVar = (api) ((xul0) obj).mo49283h();
                    if (apiVar == null) {
                        nuiVar = new nui(null);
                    } else {
                        if (apiVar.mo26697m()) {
                            ouiVar = new nui(apiVar.getName());
                        } else if (apiVar.mo26697m() || !wl51.m88496t0(apiVar.mo26702r(), "harmony:", false)) {
                            ouiVar = (apiVar.mo26697m() || !wl51.m88496t0(apiVar.mo26702r(), "esdk:", false)) ? new oui(apiVar.mo26695k(), apiVar.mo26690f(), apiVar.getType()) : new pui(apiVar.mo26695k(), 2, bvg1.m30600A(apiVar), apiVar.mo26683E().f52152a);
                        } else {
                            ouiVar = new pui(apiVar.mo26695k(), 1, bvg1.m30600A(apiVar), apiVar.mo26683E().f52152a);
                        }
                        nuiVar = ouiVar;
                    }
                    cp50Var.f40463b = 1;
                    Object objEmit17 = this.f249947b.emit(nuiVar, cp50Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit17 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof lp50) {
                    lp50Var = (lp50) fbkVar;
                    int i34 = lp50Var.f135630b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        lp50Var.f135630b = i34 - Integer.MIN_VALUE;
                    } else {
                        lp50Var = new lp50(this, fbkVar);
                    }
                } else {
                    lp50Var = new lp50(this, fbkVar);
                }
                Object obj17 = lp50Var.f135629a;
                int i35 = lp50Var.f135630b;
                if (i35 == 0) {
                    bga.m29073P(obj17);
                    CollectionPlatformItem collectionPlatformItem = (CollectionPlatformItem) g6f.m43745s0(((CollectionPlatformEsperantoItemsResponse) obj).getItemsList());
                    Object fp50Var = gp50.f83090a;
                    if (collectionPlatformItem != null) {
                        if (!collectionPlatformItem.m6883r()) {
                            collectionPlatformItem = null;
                        }
                        if (collectionPlatformItem != null && (collectionItemdata$ItemDataM6882q = collectionPlatformItem.m6882q()) != null) {
                            CollectionItemdata$ItemData collectionItemdata$ItemData = collectionItemdata$ItemDataM6882q.m6825t() ? collectionItemdata$ItemDataM6882q : null;
                            if (collectionItemdata$ItemData != null && (collectionItemdata$IsbnScanItemDataM6823r = collectionItemdata$ItemData.m6823r()) != null) {
                                int i36 = kp50.f124992a[collectionItemdata$IsbnScanItemDataM6823r.m6817p().ordinal()];
                                if (i36 != 1) {
                                    if (i36 == 2) {
                                        fp50Var = hp50.f93704a;
                                    }
                                } else if (collectionItemdata$IsbnScanItemDataM6823r.m6816o().length() > 0) {
                                    fp50Var = new fp50(collectionItemdata$IsbnScanItemDataM6823r.m6816o());
                                }
                            }
                        }
                    }
                    lp50Var.f135630b = 1;
                    Object objEmit18 = this.f249947b.emit(fp50Var, lp50Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit18 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof pu50) {
                    pu50Var = (pu50) fbkVar;
                    int i37 = pu50Var.f181369b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        pu50Var.f181369b = i37 - Integer.MIN_VALUE;
                    } else {
                        pu50Var = new pu50(this, fbkVar);
                    }
                } else {
                    pu50Var = new pu50(this, fbkVar);
                }
                Object obj18 = pu50Var.f181368a;
                int i38 = pu50Var.f181369b;
                if (i38 == 0) {
                    bga.m29073P(obj18);
                    xu50 xu50Var = (xu50) obj;
                    Object mu50Var = (xu50Var == null || (i2 = xu50Var.f266006a) <= 0 || (i3 = xu50Var.f266007b) <= 0) ? nu50.f158515a : new mu50(i2, i3, xu50Var.f266008c / 100.0f);
                    pu50Var.f181369b = 1;
                    Object objEmit19 = this.f249947b.emit(mu50Var, pu50Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit19 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof bv50) {
                    bv50Var = (bv50) fbkVar;
                    int i39 = bv50Var.f31281b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        bv50Var.f31281b = i39 - Integer.MIN_VALUE;
                    } else {
                        bv50Var = new bv50(this, fbkVar);
                    }
                } else {
                    bv50Var = new bv50(this, fbkVar);
                }
                Object obj19 = bv50Var.f31280a;
                int i40 = bv50Var.f31281b;
                if (i40 == 0) {
                    bga.m29073P(obj19);
                    xul0 xul0Var = (xul0) obj;
                    Boolean boolValueOf4 = Boolean.valueOf(xul0Var.mo49279c() && !((api) xul0Var.mo49278b()).mo26697m());
                    bv50Var.f31281b = 1;
                    Object objEmit20 = this.f249947b.emit(boolValueOf4, bv50Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit20 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof ly50) {
                    ly50Var = (ly50) fbkVar;
                    int i41 = ly50Var.f137960b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ly50Var.f137960b = i41 - Integer.MIN_VALUE;
                    } else {
                        ly50Var = new ly50(this, fbkVar);
                    }
                } else {
                    ly50Var = new ly50(this, fbkVar);
                }
                Object obj20 = ly50Var.f137959a;
                int i42 = ly50Var.f137960b;
                if (i42 == 0) {
                    bga.m29073P(obj20);
                    if (((by50) obj) == null) {
                        ly50Var.f137960b = 1;
                        Object objEmit21 = this.f249947b.emit(obj, ly50Var);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit21 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof my50) {
                    my50Var = (my50) fbkVar;
                    int i43 = my50Var.f148310b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        my50Var.f148310b = i43 - Integer.MIN_VALUE;
                    } else {
                        my50Var = new my50(this, fbkVar);
                    }
                } else {
                    my50Var = new my50(this, fbkVar);
                }
                Object obj21 = my50Var.f148309a;
                int i44 = my50Var.f148310b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                my50Var.f148310b = 1;
                Object objEmit22 = this.f249947b.emit(w2a1Var, my50Var);
                yuk yukVar20 = yuk.f276404a;
                return objEmit22 == yukVar20 ? yukVar20 : w2a1Var;
            case 22:
                if (fbkVar instanceof yy50) {
                    yy50Var = (yy50) fbkVar;
                    int i45 = yy50Var.f277408b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        yy50Var.f277408b = i45 - Integer.MIN_VALUE;
                    } else {
                        yy50Var = new yy50(this, fbkVar);
                    }
                } else {
                    yy50Var = new yy50(this, fbkVar);
                }
                Object obj22 = yy50Var.f277407a;
                int i46 = yy50Var.f277408b;
                if (i46 == 0) {
                    bga.m29073P(obj22);
                    DeviceBroadcastStatus deviceBroadcastStatus = ((ya60) obj).f270815a;
                    yy50Var.f277408b = 1;
                    Object objEmit23 = this.f249947b.emit(deviceBroadcastStatus, yy50Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit23 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof zy50) {
                    zy50Var = (zy50) fbkVar;
                    int i47 = zy50Var.f287495b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        zy50Var.f287495b = i47 - Integer.MIN_VALUE;
                    } else {
                        zy50Var = new zy50(this, fbkVar);
                    }
                } else {
                    zy50Var = new zy50(this, fbkVar);
                }
                Object obj23 = zy50Var.f287494a;
                int i48 = zy50Var.f287495b;
                if (i48 == 0) {
                    bga.m29073P(obj23);
                    DeviceBroadcastStatus deviceBroadcastStatus2 = ((BroadcastStatusUpdate) obj).deviceBroadcastStatus;
                    zy50Var.f287495b = 1;
                    Object objEmit24 = this.f249947b.emit(deviceBroadcastStatus2, zy50Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit24 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof fz50) {
                    fz50Var = (fz50) fbkVar;
                    int i49 = fz50Var.f74913b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        fz50Var.f74913b = i49 - Integer.MIN_VALUE;
                    } else {
                        fz50Var = new fz50(this, fbkVar);
                    }
                } else {
                    fz50Var = new fz50(this, fbkVar);
                }
                Object obj24 = fz50Var.f74912a;
                int i50 = fz50Var.f74913b;
                if (i50 == 0) {
                    bga.m29073P(obj24);
                    if (((Boolean) obj).booleanValue()) {
                        fz50Var.f74913b = 1;
                        Object objEmit25 = this.f249947b.emit(obj, fz50Var);
                        yuk yukVar23 = yuk.f276404a;
                        if (objEmit25 == yukVar23) {
                            return yukVar23;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof gz50) {
                    gz50Var = (gz50) fbkVar;
                    int i51 = gz50Var.f85846b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        gz50Var.f85846b = i51 - Integer.MIN_VALUE;
                    } else {
                        gz50Var = new gz50(this, fbkVar);
                    }
                } else {
                    gz50Var = new gz50(this, fbkVar);
                }
                Object obj25 = gz50Var.f85845a;
                int i52 = gz50Var.f85846b;
                if (i52 == 0) {
                    bga.m29073P(obj25);
                    by50 by50Var = (by50) obj;
                    boolean z3 = false;
                    if (by50Var != null && by50Var.f32082h.f287217j) {
                        z3 = true;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z3);
                    gz50Var.f85846b = 1;
                    Object objEmit26 = this.f249947b.emit(boolValueOf5, gz50Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit26 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof hz50) {
                    hz50Var = (hz50) fbkVar;
                    int i53 = hz50Var.f96795b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hz50Var.f96795b = i53 - Integer.MIN_VALUE;
                    } else {
                        hz50Var = new hz50(this, fbkVar);
                    }
                } else {
                    hz50Var = new hz50(this, fbkVar);
                }
                Object obj26 = hz50Var.f96794a;
                int i54 = hz50Var.f96795b;
                if (i54 == 0) {
                    bga.m29073P(obj26);
                    ((Boolean) obj).getClass();
                    hz50Var.f96795b = 1;
                    Object objEmit27 = this.f249947b.emit(xa00.f259493a, hz50Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit27 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof m060) {
                    m060Var = (m060) fbkVar;
                    int i55 = m060Var.f138543b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        m060Var.f138543b = i55 - Integer.MIN_VALUE;
                    } else {
                        m060Var = new m060(this, fbkVar);
                    }
                } else {
                    m060Var = new m060(this, fbkVar);
                }
                Object obj27 = m060Var.f138542a;
                int i56 = m060Var.f138543b;
                if (i56 == 0) {
                    bga.m29073P(obj27);
                    jx50 jx50Var = ((mx50) obj).f147961a.f127335a;
                    m060Var.f138543b = 1;
                    Object objEmit28 = this.f249947b.emit(jx50Var, m060Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit28 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof v160) {
                    v160Var = (v160) fbkVar;
                    int i57 = v160Var.f236264b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        v160Var.f236264b = i57 - Integer.MIN_VALUE;
                    } else {
                        v160Var = new v160(this, fbkVar);
                    }
                } else {
                    v160Var = new v160(this, fbkVar);
                }
                Object obj28 = v160Var.f236263a;
                int i58 = v160Var.f236264b;
                if (i58 == 0) {
                    bga.m29073P(obj28);
                    by50 by50Var2 = (by50) obj;
                    boolean z4 = false;
                    if (by50Var2 != null && (tx50Var = by50Var2.f32082h.f287209b) != null && tx50Var.f224570f) {
                        z4 = true;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z4);
                    v160Var.f236264b = 1;
                    Object objEmit29 = this.f249947b.emit(boolValueOf6, v160Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit29 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof d260) {
                    d260Var = (d260) fbkVar;
                    int i59 = d260Var.f44485b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        d260Var.f44485b = i59 - Integer.MIN_VALUE;
                    } else {
                        d260Var = new d260(this, fbkVar);
                    }
                } else {
                    d260Var = new d260(this, fbkVar);
                }
                Object obj29 = d260Var.f44484a;
                int i60 = d260Var.f44485b;
                if (i60 == 0) {
                    bga.m29073P(obj29);
                    nx50 nx50Var = (nx50) obj;
                    Boolean boolValueOf7 = Boolean.valueOf(nx50Var.f159369b && nx50Var.f159371d);
                    d260Var.f44485b = 1;
                    Object objEmit30 = this.f249947b.emit(boolValueOf7, d260Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit30 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
        }
    }

    public wc30(niz nizVar, ywo ywoVar) {
        this.f249946a = 16;
        this.f249947b = nizVar;
    }
}
