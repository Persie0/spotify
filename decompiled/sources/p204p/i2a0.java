package p204p;

import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetTracksResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class i2a0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f97784b;

    public /* synthetic */ i2a0(niz nizVar, int i) {
        this.f97783a = i;
        this.f97784b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:129:0x022a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0282  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:186:0x0312  */
    /* JADX WARN: Code duplicated, block: B:203:0x035e  */
    /* JADX WARN: Code duplicated, block: B:220:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:250:0x0404  */
    /* JADX WARN: Code duplicated, block: B:267:0x0450  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:284:0x049d  */
    /* JADX WARN: Code duplicated, block: B:303:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:324:0x053c  */
    /* JADX WARN: Code duplicated, block: B:345:0x058a  */
    /* JADX WARN: Code duplicated, block: B:362:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:382:0x0616  */
    /* JADX WARN: Code duplicated, block: B:399:0x0664  */
    /* JADX WARN: Code duplicated, block: B:423:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:445:0x0715  */
    /* JADX WARN: Code duplicated, block: B:467:0x0772  */
    /* JADX WARN: Code duplicated, block: B:490:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:507:0x0803  */
    /* JADX WARN: Code duplicated, block: B:526:0x0847  */
    /* JADX WARN: Code duplicated, block: B:543:0x088b  */
    /* JADX WARN: Code duplicated, block: B:560:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:579:0x0918  */
    /* JADX WARN: Code duplicated, block: B:598:0x095c  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        h2a0 h2a0Var;
        j2a0 j2a0Var;
        f4a0 f4a0Var;
        g4a0 g4a0Var;
        m4a0 m4a0Var;
        p4a0 p4a0Var;
        q4a0 q4a0Var;
        r4a0 r4a0Var;
        gca0 gca0Var;
        hca0 hca0Var;
        wca0 wca0Var;
        eea0 eea0Var;
        hqa0 hqa0Var;
        iqa0 iqa0Var;
        pva0 pva0Var;
        lxa0 lxa0Var;
        yza0 yza0Var;
        b5b0 b5b0Var;
        d5b0 d5b0Var;
        e5b0 e5b0Var;
        int iIntValue;
        edb0 edb0Var;
        zhb0 zhb0Var;
        ulb0 ulb0Var;
        orb0 orb0Var;
        atb0 atb0Var;
        mwb0 mwb0Var;
        hxb0 hxb0Var;
        uzb0 uzb0Var;
        xzb0 xzb0Var;
        rqc0 rqc0Var;
        switch (this.f97783a) {
            case 0:
                if (fbkVar instanceof h2a0) {
                    h2a0Var = (h2a0) fbkVar;
                    int i = h2a0Var.f86937b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h2a0Var.f86937b = i - Integer.MIN_VALUE;
                    } else {
                        h2a0Var = new h2a0(this, fbkVar);
                    }
                } else {
                    h2a0Var = new h2a0(this, fbkVar);
                }
                Object obj2 = h2a0Var.f86936a;
                int i2 = h2a0Var.f86937b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object obj3 = ((oho) obj).f165512a;
                    h2a0Var.f86937b = 1;
                    Object objEmit = this.f97784b.emit(obj3, h2a0Var);
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
                if (fbkVar instanceof j2a0) {
                    j2a0Var = (j2a0) fbkVar;
                    int i3 = j2a0Var.f107989b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j2a0Var.f107989b = i3 - Integer.MIN_VALUE;
                    } else {
                        j2a0Var = new j2a0(this, fbkVar);
                    }
                } else {
                    j2a0Var = new j2a0(this, fbkVar);
                }
                Object obj4 = j2a0Var.f107988a;
                int i4 = j2a0Var.f107989b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    dhy dhyVar = (dhy) obj;
                    if (dhyVar != null) {
                        j2a0Var.f107989b = 1;
                        Object objEmit2 = this.f97784b.emit(dhyVar, j2a0Var);
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
                if (fbkVar instanceof f4a0) {
                    f4a0Var = (f4a0) fbkVar;
                    int i5 = f4a0Var.f65718b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        f4a0Var.f65718b = i5 - Integer.MIN_VALUE;
                    } else {
                        f4a0Var = new f4a0(this, fbkVar);
                    }
                } else {
                    f4a0Var = new f4a0(this, fbkVar);
                }
                Object obj5 = f4a0Var.f65717a;
                int i6 = f4a0Var.f65718b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    if (((y3r) obj) instanceof x3r) {
                        f4a0Var.f65718b = 1;
                        Object objEmit3 = this.f97784b.emit(obj, f4a0Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof g4a0) {
                    g4a0Var = (g4a0) fbkVar;
                    int i7 = g4a0Var.f76379b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        g4a0Var.f76379b = i7 - Integer.MIN_VALUE;
                    } else {
                        g4a0Var = new g4a0(this, fbkVar);
                    }
                } else {
                    g4a0Var = new g4a0(this, fbkVar);
                }
                Object obj6 = g4a0Var.f76378a;
                int i8 = g4a0Var.f76379b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    vy81 vy81Var = ((x3r) ((y3r) obj)).f257863a;
                    g4a0Var.f76379b = 1;
                    Object objEmit4 = this.f97784b.emit(vy81Var, g4a0Var);
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
                if (fbkVar instanceof m4a0) {
                    m4a0Var = (m4a0) fbkVar;
                    int i9 = m4a0Var.f139882b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        m4a0Var.f139882b = i9 - Integer.MIN_VALUE;
                    } else {
                        m4a0Var = new m4a0(this, fbkVar);
                    }
                } else {
                    m4a0Var = new m4a0(this, fbkVar);
                }
                Object obj7 = m4a0Var.f139881a;
                int i10 = m4a0Var.f139882b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    String str = ((e301) obj).f55571a;
                    m4a0Var.f139882b = 1;
                    Object objEmit5 = this.f97784b.emit(str, m4a0Var);
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
                if (fbkVar instanceof p4a0) {
                    p4a0Var = (p4a0) fbkVar;
                    int i11 = p4a0Var.f173884b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        p4a0Var.f173884b = i11 - Integer.MIN_VALUE;
                    } else {
                        p4a0Var = new p4a0(this, fbkVar);
                    }
                } else {
                    p4a0Var = new p4a0(this, fbkVar);
                }
                Object obj8 = p4a0Var.f173883a;
                int i12 = p4a0Var.f173884b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    if (obj instanceof oho) {
                        p4a0Var.f173884b = 1;
                        Object objEmit6 = this.f97784b.emit(obj, p4a0Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof q4a0) {
                    q4a0Var = (q4a0) fbkVar;
                    int i13 = q4a0Var.f185126b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        q4a0Var.f185126b = i13 - Integer.MIN_VALUE;
                    } else {
                        q4a0Var = new q4a0(this, fbkVar);
                    }
                } else {
                    q4a0Var = new q4a0(this, fbkVar);
                }
                Object obj9 = q4a0Var.f185125a;
                int i14 = q4a0Var.f185126b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    Object obj10 = ((oho) obj).f165512a;
                    q4a0Var.f185126b = 1;
                    Object objEmit7 = this.f97784b.emit(obj10, q4a0Var);
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
                if (fbkVar instanceof r4a0) {
                    r4a0Var = (r4a0) fbkVar;
                    int i15 = r4a0Var.f195712b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        r4a0Var.f195712b = i15 - Integer.MIN_VALUE;
                    } else {
                        r4a0Var = new r4a0(this, fbkVar);
                    }
                } else {
                    r4a0Var = new r4a0(this, fbkVar);
                }
                Object obj11 = r4a0Var.f195711a;
                int i16 = r4a0Var.f195712b;
                if (i16 == 0) {
                    bga.m29073P(obj11);
                    hs6 hs6Var = (hs6) obj;
                    if (hs6Var.f94616b == null && hs6Var.f94615a == null) {
                        hs6Var = null;
                    }
                    if (hs6Var != null) {
                        r4a0Var.f195712b = 1;
                        Object objEmit8 = this.f97784b.emit(hs6Var, r4a0Var);
                        yuk yukVar8 = yuk.f276404a;
                        if (objEmit8 == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof gca0) {
                    gca0Var = (gca0) fbkVar;
                    int i17 = gca0Var.f78527b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        gca0Var.f78527b = i17 - Integer.MIN_VALUE;
                    } else {
                        gca0Var = new gca0(this, fbkVar);
                    }
                } else {
                    gca0Var = new gca0(this, fbkVar);
                }
                Object obj12 = gca0Var.f78526a;
                int i18 = gca0Var.f78527b;
                if (i18 == 0) {
                    bga.m29073P(obj12);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsLocalFiles$GetSourcesResponse esLocalFiles$GetSourcesResponseM13149p = EsLocalFiles$GetSourcesResponse.m13149p(bArr);
                        gca0Var.f78527b = 1;
                        Object objEmit9 = this.f97784b.emit(esLocalFiles$GetSourcesResponseM13149p, gca0Var);
                        yuk yukVar9 = yuk.f276404a;
                        if (objEmit9 == yukVar9) {
                            return yukVar9;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetSourcesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof hca0) {
                    hca0Var = (hca0) fbkVar;
                    int i19 = hca0Var.f89740b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        hca0Var.f89740b = i19 - Integer.MIN_VALUE;
                    } else {
                        hca0Var = new hca0(this, fbkVar);
                    }
                } else {
                    hca0Var = new hca0(this, fbkVar);
                }
                Object obj13 = hca0Var.f89739a;
                int i20 = hca0Var.f89740b;
                if (i20 == 0) {
                    bga.m29073P(obj13);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        EsLocalFiles$GetTracksResponse esLocalFiles$GetTracksResponseM13155o = EsLocalFiles$GetTracksResponse.m13155o(bArr2);
                        hca0Var.f89740b = 1;
                        Object objEmit10 = this.f97784b.emit(esLocalFiles$GetTracksResponseM13155o, hca0Var);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit10 == yukVar10) {
                            return yukVar10;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetTracksResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof wca0) {
                    wca0Var = (wca0) fbkVar;
                    int i21 = wca0Var.f249985b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wca0Var.f249985b = i21 - Integer.MIN_VALUE;
                    } else {
                        wca0Var = new wca0(this, fbkVar);
                    }
                } else {
                    wca0Var = new wca0(this, fbkVar);
                }
                Object obj14 = wca0Var.f249984a;
                int i22 = wca0Var.f249985b;
                if (i22 == 0) {
                    bga.m29073P(obj14);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Set set = ohoVar != null ? (Set) ohoVar.f165512a : null;
                    if (set != null) {
                        wca0Var.f249985b = 1;
                        Object objEmit11 = this.f97784b.emit(set, wca0Var);
                        yuk yukVar11 = yuk.f276404a;
                        if (objEmit11 == yukVar11) {
                            return yukVar11;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof eea0) {
                    eea0Var = (eea0) fbkVar;
                    int i23 = eea0Var.f58728b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        eea0Var.f58728b = i23 - Integer.MIN_VALUE;
                    } else {
                        eea0Var = new eea0(this, fbkVar);
                    }
                } else {
                    eea0Var = new eea0(this, fbkVar);
                }
                Object obj15 = eea0Var.f58727a;
                int i24 = eea0Var.f58728b;
                if (i24 == 0) {
                    bga.m29073P(obj15);
                    Boolean bool = (Boolean) obj;
                    wj50.m88279p(bool);
                    xi50 xi50Var = new xi50(bool.booleanValue());
                    eea0Var.f58728b = 1;
                    Object objEmit12 = this.f97784b.emit(xi50Var, eea0Var);
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
                if (fbkVar instanceof hqa0) {
                    hqa0Var = (hqa0) fbkVar;
                    int i25 = hqa0Var.f94080b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        hqa0Var.f94080b = i25 - Integer.MIN_VALUE;
                    } else {
                        hqa0Var = new hqa0(this, fbkVar);
                    }
                } else {
                    hqa0Var = new hqa0(this, fbkVar);
                }
                Object obj16 = hqa0Var.f94079a;
                int i26 = hqa0Var.f94080b;
                if (i26 == 0) {
                    bga.m29073P(obj16);
                    String str2 = ((k1u) obj).f118434a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    hqa0Var.f94080b = 1;
                    Object objEmit13 = this.f97784b.emit(str2, hqa0Var);
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
                if (fbkVar instanceof iqa0) {
                    iqa0Var = (iqa0) fbkVar;
                    int i27 = iqa0Var.f104706b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        iqa0Var.f104706b = i27 - Integer.MIN_VALUE;
                    } else {
                        iqa0Var = new iqa0(this, fbkVar);
                    }
                } else {
                    iqa0Var = new iqa0(this, fbkVar);
                }
                Object obj17 = iqa0Var.f104705a;
                int i28 = iqa0Var.f104706b;
                if (i28 == 0) {
                    bga.m29073P(obj17);
                    String str3 = ((e301) obj).f55571a;
                    iqa0Var.f104706b = 1;
                    Object objEmit14 = this.f97784b.emit(str3, iqa0Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof pva0) {
                    pva0Var = (pva0) fbkVar;
                    int i29 = pva0Var.f181675b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        pva0Var.f181675b = i29 - Integer.MIN_VALUE;
                    } else {
                        pva0Var = new pva0(this, fbkVar);
                    }
                } else {
                    pva0Var = new pva0(this, fbkVar);
                }
                Object obj18 = pva0Var.f181674a;
                int i30 = pva0Var.f181675b;
                if (i30 == 0) {
                    bga.m29073P(obj18);
                    if (!(((nva0) obj) instanceof nva0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pva0Var.f181675b = 1;
                    Object objEmit15 = this.f97784b.emit(lva0.f137265a, pva0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof lxa0) {
                    lxa0Var = (lxa0) fbkVar;
                    int i31 = lxa0Var.f137768b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        lxa0Var.f137768b = i31 - Integer.MIN_VALUE;
                    } else {
                        lxa0Var = new lxa0(this, fbkVar);
                    }
                } else {
                    lxa0Var = new lxa0(this, fbkVar);
                }
                Object obj19 = lxa0Var.f137767a;
                int i32 = lxa0Var.f137768b;
                if (i32 == 0) {
                    bga.m29073P(obj19);
                    ehy0 ehy0Var = (ehy0) obj;
                    Object nxa0Var = ehy0Var instanceof chy0 ? new nxa0(((nj7) ((chy0) ehy0Var).f38149a).mo61933d()) : oxa0.f170942a;
                    lxa0Var.f137768b = 1;
                    Object objEmit16 = this.f97784b.emit(nxa0Var, lxa0Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof yza0) {
                    yza0Var = (yza0) fbkVar;
                    int i33 = yza0Var.f277742b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        yza0Var.f277742b = i33 - Integer.MIN_VALUE;
                    } else {
                        yza0Var = new yza0(this, fbkVar);
                    }
                } else {
                    yza0Var = new yza0(this, fbkVar);
                }
                Object obj20 = yza0Var.f277741a;
                int i34 = yza0Var.f277742b;
                if (i34 == 0) {
                    bga.m29073P(obj20);
                    if (((e301) obj).f55572b) {
                        yza0Var.f277742b = 1;
                        Object objEmit17 = this.f97784b.emit(obj, yza0Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof b5b0) {
                    b5b0Var = (b5b0) fbkVar;
                    int i35 = b5b0Var.f23544b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        b5b0Var.f23544b = i35 - Integer.MIN_VALUE;
                    } else {
                        b5b0Var = new b5b0(this, fbkVar);
                    }
                } else {
                    b5b0Var = new b5b0(this, fbkVar);
                }
                Object obj21 = b5b0Var.f23543a;
                int i36 = b5b0Var.f23544b;
                if (i36 == 0) {
                    bga.m29073P(obj21);
                    Boolean boolValueOf = Boolean.valueOf(!wj50.m88271j((Boolean) obj, Boolean.FALSE));
                    b5b0Var.f23544b = 1;
                    Object objEmit18 = this.f97784b.emit(boolValueOf, b5b0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof d5b0) {
                    d5b0Var = (d5b0) fbkVar;
                    int i37 = d5b0Var.f45388b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        d5b0Var.f45388b = i37 - Integer.MIN_VALUE;
                    } else {
                        d5b0Var = new d5b0(this, fbkVar);
                    }
                } else {
                    d5b0Var = new d5b0(this, fbkVar);
                }
                Object obj22 = d5b0Var.f45387a;
                int i38 = d5b0Var.f45388b;
                if (i38 == 0) {
                    bga.m29073P(obj22);
                    Boolean boolValueOf2 = Boolean.valueOf(wj50.m88271j((Boolean) obj, Boolean.TRUE));
                    d5b0Var.f45388b = 1;
                    Object objEmit19 = this.f97784b.emit(boolValueOf2, d5b0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof e5b0) {
                    e5b0Var = (e5b0) fbkVar;
                    int i39 = e5b0Var.f56334b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        e5b0Var.f56334b = i39 - Integer.MIN_VALUE;
                    } else {
                        e5b0Var = new e5b0(this, fbkVar);
                    }
                } else {
                    e5b0Var = new e5b0(this, fbkVar);
                }
                Object obj23 = e5b0Var.f56333a;
                int i40 = e5b0Var.f56334b;
                if (i40 == 0) {
                    bga.m29073P(obj23);
                    Object obj24 = ((s6x0) obj).f206218a;
                    Boolean boolValueOf3 = null;
                    if (obj24 instanceof c6x0) {
                        obj24 = null;
                    }
                    Integer num = (Integer) obj24;
                    if (num != null && (iIntValue = num.intValue()) != 0) {
                        boolValueOf3 = Boolean.valueOf(iIntValue == 5);
                    }
                    e5b0Var.f56334b = 1;
                    Object objEmit20 = this.f97784b.emit(boolValueOf3, e5b0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof edb0) {
                    edb0Var = (edb0) fbkVar;
                    int i41 = edb0Var.f58494b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        edb0Var.f58494b = i41 - Integer.MIN_VALUE;
                    } else {
                        edb0Var = new edb0(this, fbkVar);
                    }
                } else {
                    edb0Var = new edb0(this, fbkVar);
                }
                Object obj25 = edb0Var.f58493a;
                int i42 = edb0Var.f58494b;
                if (i42 == 0) {
                    bga.m29073P(obj25);
                    zcb0 zcb0Var = new zcb0((tav) obj);
                    edb0Var.f58494b = 1;
                    Object objEmit21 = this.f97784b.emit(zcb0Var, edb0Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof zhb0) {
                    zhb0Var = (zhb0) fbkVar;
                    int i43 = zhb0Var.f282868b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        zhb0Var.f282868b = i43 - Integer.MIN_VALUE;
                    } else {
                        zhb0Var = new zhb0(this, fbkVar);
                    }
                } else {
                    zhb0Var = new zhb0(this, fbkVar);
                }
                Object obj26 = zhb0Var.f282867a;
                int i44 = zhb0Var.f282868b;
                if (i44 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf4 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67753d));
                    zhb0Var.f282868b = 1;
                    Object objEmit22 = this.f97784b.emit(boolValueOf4, zhb0Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof ulb0) {
                    ulb0Var = (ulb0) fbkVar;
                    int i45 = ulb0Var.f231503b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ulb0Var.f231503b = i45 - Integer.MIN_VALUE;
                    } else {
                        ulb0Var = new ulb0(this, fbkVar);
                    }
                } else {
                    ulb0Var = new ulb0(this, fbkVar);
                }
                Object obj27 = ulb0Var.f231502a;
                int i46 = ulb0Var.f231503b;
                if (i46 == 0) {
                    bga.m29073P(obj27);
                    cmb0 cmb0Var = new cmb0((tav) obj);
                    ulb0Var.f231503b = 1;
                    Object objEmit23 = this.f97784b.emit(cmb0Var, ulb0Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof orb0) {
                    orb0Var = (orb0) fbkVar;
                    int i47 = orb0Var.f168525b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        orb0Var.f168525b = i47 - Integer.MIN_VALUE;
                    } else {
                        orb0Var = new orb0(this, fbkVar);
                    }
                } else {
                    orb0Var = new orb0(this, fbkVar);
                }
                Object obj28 = orb0Var.f168524a;
                int i48 = orb0Var.f168525b;
                if (i48 == 0) {
                    bga.m29073P(obj28);
                    if (((Boolean) obj).booleanValue()) {
                        orb0Var.f168525b = 1;
                        Object objEmit24 = this.f97784b.emit(obj, orb0Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof atb0) {
                    atb0Var = (atb0) fbkVar;
                    int i49 = atb0Var.f19644b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        atb0Var.f19644b = i49 - Integer.MIN_VALUE;
                    } else {
                        atb0Var = new atb0(this, fbkVar);
                    }
                } else {
                    atb0Var = new atb0(this, fbkVar);
                }
                Object obj29 = atb0Var.f19643a;
                int i50 = atb0Var.f19644b;
                if (i50 == 0) {
                    bga.m29073P(obj29);
                    ehy0 ehy0Var2 = (ehy0) obj;
                    Object ctb0Var = ehy0Var2 instanceof chy0 ? new ctb0(((nj7) ((chy0) ehy0Var2).f38149a).mo61933d()) : dtb0.f52758a;
                    atb0Var.f19644b = 1;
                    Object objEmit25 = this.f97784b.emit(ctb0Var, atb0Var);
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
                if (fbkVar instanceof mwb0) {
                    mwb0Var = (mwb0) fbkVar;
                    int i51 = mwb0Var.f147749b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        mwb0Var.f147749b = i51 - Integer.MIN_VALUE;
                    } else {
                        mwb0Var = new mwb0(this, fbkVar);
                    }
                } else {
                    mwb0Var = new mwb0(this, fbkVar);
                }
                Object obj30 = mwb0Var.f147748a;
                int i52 = mwb0Var.f147749b;
                if (i52 == 0) {
                    bga.m29073P(obj30);
                    Integer num2 = new Integer(((Number) obj).intValue());
                    if (num2.intValue() == 0) {
                        num2 = null;
                    }
                    mwb0Var.f147749b = 1;
                    Object objEmit26 = this.f97784b.emit(num2, mwb0Var);
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
                if (fbkVar instanceof hxb0) {
                    hxb0Var = (hxb0) fbkVar;
                    int i53 = hxb0Var.f96185b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hxb0Var.f96185b = i53 - Integer.MIN_VALUE;
                    } else {
                        hxb0Var = new hxb0(this, fbkVar);
                    }
                } else {
                    hxb0Var = new hxb0(this, fbkVar);
                }
                Object obj31 = hxb0Var.f96184a;
                int i54 = hxb0Var.f96185b;
                if (i54 == 0) {
                    bga.m29073P(obj31);
                    ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().mo49283h();
                    Object obj32 = (contextTrack != null ? e72.m38012j0(contextTrack) : null) == null ? pxb0.f182269b : oxb0.f170957b;
                    hxb0Var.f96185b = 1;
                    Object objEmit27 = this.f97784b.emit(obj32, hxb0Var);
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
                if (fbkVar instanceof uzb0) {
                    uzb0Var = (uzb0) fbkVar;
                    int i55 = uzb0Var.f235462b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        uzb0Var.f235462b = i55 - Integer.MIN_VALUE;
                    } else {
                        uzb0Var = new uzb0(this, fbkVar);
                    }
                } else {
                    uzb0Var = new uzb0(this, fbkVar);
                }
                Object obj33 = uzb0Var.f235461a;
                int i56 = uzb0Var.f235462b;
                if (i56 == 0) {
                    bga.m29073P(obj33);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj34 : (List) obj) {
                        if (!((c5r) obj34).f34248k) {
                            arrayList.add(obj34);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj35 : arrayList) {
                        if (((c5r) obj35).f34251n != 11) {
                            arrayList2.add(obj35);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj36 : arrayList2) {
                        if (((c5r) obj36).f34249l) {
                            arrayList3.add(obj36);
                        } else {
                            arrayList4.add(obj36);
                        }
                    }
                    ArrayList arrayListM43700N0 = g6f.m43700N0(arrayList4, g6f.m43714b1(arrayList3, 1));
                    uzb0Var.f235462b = 1;
                    Object objEmit28 = this.f97784b.emit(arrayListM43700N0, uzb0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof xzb0) {
                    xzb0Var = (xzb0) fbkVar;
                    int i57 = xzb0Var.f267571b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        xzb0Var.f267571b = i57 - Integer.MIN_VALUE;
                    } else {
                        xzb0Var = new xzb0(this, fbkVar);
                    }
                } else {
                    xzb0Var = new xzb0(this, fbkVar);
                }
                Object obj37 = xzb0Var.f267570a;
                int i58 = xzb0Var.f267571b;
                if (i58 == 0) {
                    bga.m29073P(obj37);
                    pqm0 pqm0Var = (pqm0) obj;
                    g4t0 g4t0Var = (g4t0) pqm0Var.f180350a;
                    List list = (List) pqm0Var.f180351b;
                    ArrayList arrayList5 = g4t0Var.f76525a;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj38 : arrayList5) {
                        if (((rmx0) obj38).f200647m) {
                            arrayList6.add(obj38);
                        }
                    }
                    pqm0 pqm0Var2 = new pqm0(arrayList6, list);
                    xzb0Var.f267571b = 1;
                    Object objEmit29 = this.f97784b.emit(pqm0Var2, xzb0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj37);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof rqc0) {
                    rqc0Var = (rqc0) fbkVar;
                    int i59 = rqc0Var.f201800b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        rqc0Var.f201800b = i59 - Integer.MIN_VALUE;
                    } else {
                        rqc0Var = new rqc0(this, fbkVar);
                    }
                } else {
                    rqc0Var = new rqc0(this, fbkVar);
                }
                Object obj39 = rqc0Var.f201799a;
                int i60 = rqc0Var.f201800b;
                if (i60 == 0) {
                    bga.m29073P(obj39);
                    hzq0 hzq0VarM92201d = xul0.m92201d((ov0) obj);
                    rqc0Var.f201800b = 1;
                    Object objEmit30 = this.f97784b.emit(hzq0VarM92201d, rqc0Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj39);
                }
                return w2a1.f247311a;
        }
    }

    public i2a0(niz nizVar, wzb0 wzb0Var) {
        this.f97783a = 27;
        this.f97784b = nizVar;
    }
}
