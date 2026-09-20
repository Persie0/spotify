package p204p;

import com.spotify.connectivity.esperanto.proto.GetStateResponse;
import com.spotify.connectivity.quality.esperanto.proto.EsConnectionQualityService$ConnectionQualityEvent;
import com.spotify.music.R;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse;
import com.spotify.player.model.PlayerState;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ItemResumePoint;

/* JADX INFO: loaded from: classes4.dex */
public final class lxi implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f137819b;

    public /* synthetic */ lxi(niz nizVar, int i) {
        this.f137818a = i;
        this.f137819b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019a  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:152:0x0249  */
    /* JADX WARN: Code duplicated, block: B:173:0x029b  */
    /* JADX WARN: Code duplicated, block: B:213:0x034d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0398  */
    /* JADX WARN: Code duplicated, block: B:255:0x0420  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0473  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:324:0x0521  */
    /* JADX WARN: Code duplicated, block: B:345:0x057b  */
    /* JADX WARN: Code duplicated, block: B:366:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:385:0x060e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0656  */
    /* JADX WARN: Code duplicated, block: B:423:0x069e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:442:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:464:0x0745  */
    /* JADX WARN: Code duplicated, block: B:481:0x0796  */
    /* JADX WARN: Code duplicated, block: B:498:0x07de  */
    /* JADX WARN: Code duplicated, block: B:517:0x0825  */
    /* JADX WARN: Code duplicated, block: B:536:0x0869  */
    /* JADX WARN: Code duplicated, block: B:555:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:595:0x0952  */
    /* JADX WARN: Code duplicated, block: B:627:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:649:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:692:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        kxi kxiVar;
        hzi hziVar;
        a0j a0jVar;
        Object qziVar;
        b1j b1jVar;
        a3l0 a3l0Var;
        Object objEmit;
        yuk yukVar;
        g1j g1jVar;
        q7j q7jVar;
        glj gljVar;
        hlj hljVar;
        ilj iljVar;
        jlj jljVar;
        bvb bvbVar;
        kpj kpjVar;
        i9k i9kVar;
        j9k j9kVar;
        k9k k9kVar;
        wck wckVar;
        zfk zfkVar;
        kgk kgkVar;
        fdk fdkVar;
        ohk ohkVar;
        phk phkVar;
        xsk xskVar;
        hzk hzkVar;
        u4l u4lVar;
        Object pduVar;
        v4l v4lVar;
        rll rllVar;
        Object mllVar;
        sll sllVar;
        dol dolVar;
        gol golVar;
        qpl qplVar;
        tpl tplVar;
        eql eqlVar;
        switch (this.f137818a) {
            case 0:
                if (fbkVar instanceof kxi) {
                    kxiVar = (kxi) fbkVar;
                    int i = kxiVar.f127494b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kxiVar.f127494b = i - Integer.MIN_VALUE;
                    } else {
                        kxiVar = new kxi(this, fbkVar);
                    }
                } else {
                    kxiVar = new kxi(this, fbkVar);
                }
                Object obj2 = kxiVar.f127493a;
                int i2 = kxiVar.f127494b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object objMo49283h = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h != null) {
                        kxiVar.f127494b = 1;
                        Object objEmit2 = this.f137819b.emit(objMo49283h, kxiVar);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
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
                if (fbkVar instanceof hzi) {
                    hziVar = (hzi) fbkVar;
                    int i3 = hziVar.f96956b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hziVar.f96956b = i3 - Integer.MIN_VALUE;
                    } else {
                        hziVar = new hzi(this, fbkVar);
                    }
                } else {
                    hziVar = new hzi(this, fbkVar);
                }
                Object obj3 = hziVar.f96955a;
                int i4 = hziVar.f96956b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsConnectionQualityService$ConnectionQualityEvent esConnectionQualityService$ConnectionQualityEventM7546q = EsConnectionQualityService$ConnectionQualityEvent.m7546q(bArr);
                        hziVar.f96956b = 1;
                        Object objEmit3 = this.f137819b.emit(esConnectionQualityService$ConnectionQualityEventM7546q, hziVar);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.quality.esperanto.proto.EsConnectionQualityService.ConnectionQualityEvent: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof a0j) {
                    a0jVar = (a0j) fbkVar;
                    int i5 = a0jVar.f11093b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a0jVar.f11093b = i5 - Integer.MIN_VALUE;
                    } else {
                        a0jVar = new a0j(this, fbkVar);
                    }
                } else {
                    a0jVar = new a0j(this, fbkVar);
                }
                Object obj4 = a0jVar.f11092a;
                int i6 = a0jVar.f11093b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    acu0 acu0Var = (acu0) obj;
                    if (acu0Var instanceof zbu0) {
                        qziVar = szi.f215596a;
                    } else {
                        if (!(acu0Var instanceof ybu0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nqj0 nqj0Var = ((ybu0) acu0Var).f271248a;
                        if (nqj0Var.equals(lqj0.f136072a)) {
                            qziVar = new qzi(1);
                        } else {
                            if (!(nqj0Var instanceof mqj0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qziVar = new qzi(2);
                        }
                    }
                    a0jVar.f11093b = 1;
                    Object objEmit4 = this.f137819b.emit(qziVar, a0jVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof b1j) {
                    b1jVar = (b1j) fbkVar;
                    int i7 = b1jVar.f22366b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        b1jVar.f22366b = i7 - Integer.MIN_VALUE;
                    } else {
                        b1jVar = new b1j(this, fbkVar);
                    }
                } else {
                    b1jVar = new b1j(this, fbkVar);
                }
                Object obj5 = b1jVar.f22365a;
                int i8 = b1jVar.f22366b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    GetStateResponse getStateResponse = (GetStateResponse) obj;
                    if (getStateResponse.m7510p() != ob10.SUCCESS) {
                        throw new IllegalStateException(getStateResponse.m7509o());
                    }
                    String status = getStateResponse.getStatus();
                    if (status != null) {
                        int iHashCode = status.hashCode();
                        if (iHashCode != -1548612125) {
                            if (iHashCode != -1012222381) {
                                if (iHashCode == -424567171 && status.equals("forced_offline")) {
                                    a3l0Var = new a3l0(3);
                                    b1jVar.f22366b = 1;
                                    objEmit = this.f137819b.emit(a3l0Var, b1jVar);
                                    yukVar = yuk.f276404a;
                                    if (objEmit == yukVar) {
                                        return yukVar;
                                    }
                                }
                            } else if (status.equals("online")) {
                                a3l0Var = new a3l0(1);
                                b1jVar.f22366b = 1;
                                objEmit = this.f137819b.emit(a3l0Var, b1jVar);
                                yukVar = yuk.f276404a;
                                if (objEmit == yukVar) {
                                    return yukVar;
                                }
                            }
                        } else if (status.equals("offline")) {
                            a3l0Var = new a3l0(2);
                            b1jVar.f22366b = 1;
                            objEmit = this.f137819b.emit(a3l0Var, b1jVar);
                            yukVar = yuk.f276404a;
                            if (objEmit == yukVar) {
                                return yukVar;
                            }
                        }
                    }
                    throw new IllegalStateException(getStateResponse.getStatus());
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj5);
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof g1j) {
                    g1jVar = (g1j) fbkVar;
                    int i9 = g1jVar.f75637b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        g1jVar.f75637b = i9 - Integer.MIN_VALUE;
                    } else {
                        g1jVar = new g1j(this, fbkVar);
                    }
                } else {
                    g1jVar = new g1j(this, fbkVar);
                }
                Object obj6 = g1jVar.f75636a;
                int i10 = g1jVar.f75637b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    if (((e301) obj).f55572b) {
                        g1jVar.f75637b = 1;
                        Object objEmit5 = this.f137819b.emit(obj, g1jVar);
                        yuk yukVar5 = yuk.f276404a;
                        if (objEmit5 == yukVar5) {
                            return yukVar5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof q7j) {
                    q7jVar = (q7j) fbkVar;
                    int i11 = q7jVar.f186141b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        q7jVar.f186141b = i11 - Integer.MIN_VALUE;
                    } else {
                        q7jVar = new q7j(this, fbkVar);
                    }
                } else {
                    q7jVar = new q7j(this, fbkVar);
                }
                Object obj7 = q7jVar.f186140a;
                int i12 = q7jVar.f186141b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    if (obj instanceof i8j) {
                        q7jVar.f186141b = 1;
                        Object objEmit6 = this.f137819b.emit(obj, q7jVar);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof glj) {
                    gljVar = (glj) fbkVar;
                    int i13 = gljVar.f81100b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        gljVar.f81100b = i13 - Integer.MIN_VALUE;
                    } else {
                        gljVar = new glj(this, fbkVar);
                    }
                } else {
                    gljVar = new glj(this, fbkVar);
                }
                Object obj8 = gljVar.f81099a;
                int i14 = gljVar.f81100b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    if (((e4a0) obj) instanceof d4a0) {
                        gljVar.f81100b = 1;
                        Object objEmit7 = this.f137819b.emit(obj, gljVar);
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
                if (fbkVar instanceof hlj) {
                    hljVar = (hlj) fbkVar;
                    int i15 = hljVar.f92702b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hljVar.f92702b = i15 - Integer.MIN_VALUE;
                    } else {
                        hljVar = new hlj(this, fbkVar);
                    }
                } else {
                    hljVar = new hlj(this, fbkVar);
                }
                Object obj9 = hljVar.f92701a;
                int i16 = hljVar.f92702b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    Boolean boolValueOf = Boolean.valueOf(((e4a0) obj) instanceof b4a0);
                    hljVar.f92702b = 1;
                    Object objEmit8 = this.f137819b.emit(boolValueOf, hljVar);
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
                if (fbkVar instanceof ilj) {
                    iljVar = (ilj) fbkVar;
                    int i17 = iljVar.f103388b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        iljVar.f103388b = i17 - Integer.MIN_VALUE;
                    } else {
                        iljVar = new ilj(this, fbkVar);
                    }
                } else {
                    iljVar = new ilj(this, fbkVar);
                }
                Object obj10 = iljVar.f103387a;
                int i18 = iljVar.f103388b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    n6f n6fVar = new n6f(rfg1.m75432b(((d4a0) ((e4a0) obj)).f45121a.f246016h));
                    iljVar.f103388b = 1;
                    Object objEmit9 = this.f137819b.emit(n6fVar, iljVar);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof jlj) {
                    jljVar = (jlj) fbkVar;
                    int i19 = jljVar.f113633b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        jljVar.f113633b = i19 - Integer.MIN_VALUE;
                    } else {
                        jljVar = new jlj(this, fbkVar);
                    }
                } else {
                    jljVar = new jlj(this, fbkVar);
                }
                Object obj11 = jljVar.f113632a;
                int i20 = jljVar.f113633b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    j8m j8mVar = (j8m) obj;
                    if (j8mVar != null) {
                        int i21 = j8mVar.f109967b;
                        bvbVar = new bvb(j8mVar.f109966a, new b450(0, i21, 1), new b450(j8mVar.f109968c, i21, 1));
                    } else {
                        bvbVar = null;
                    }
                    if (bvbVar != null) {
                        jljVar.f113633b = 1;
                        Object objEmit10 = this.f137819b.emit(bvbVar, jljVar);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit10 == yukVar10) {
                            return yukVar10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof kpj) {
                    kpjVar = (kpj) fbkVar;
                    int i22 = kpjVar.f125077b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        kpjVar.f125077b = i22 - Integer.MIN_VALUE;
                    } else {
                        kpjVar = new kpj(this, fbkVar);
                    }
                } else {
                    kpjVar = new kpj(this, fbkVar);
                }
                Object obj12 = kpjVar.f125076a;
                int i23 = kpjVar.f125077b;
                if (i23 == 0) {
                    bga.m29073P(obj12);
                    if (((Boolean) obj).booleanValue()) {
                        kpjVar.f125077b = 1;
                        Object objEmit11 = this.f137819b.emit(obj, kpjVar);
                        yuk yukVar11 = yuk.f276404a;
                        if (objEmit11 == yukVar11) {
                            return yukVar11;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof i9k) {
                    i9kVar = (i9k) fbkVar;
                    int i24 = i9kVar.f100028b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        i9kVar.f100028b = i24 - Integer.MIN_VALUE;
                    } else {
                        i9kVar = new i9k(this, fbkVar);
                    }
                } else {
                    i9kVar = new i9k(this, fbkVar);
                }
                Object obj13 = i9kVar.f100027a;
                int i25 = i9kVar.f100028b;
                if (i25 == 0) {
                    bga.m29073P(obj13);
                    Object objMo49283h2 = ((xul0) obj).mo49283h();
                    if (objMo49283h2 != null) {
                        i9kVar.f100028b = 1;
                        Object objEmit12 = this.f137819b.emit(objMo49283h2, i9kVar);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof j9k) {
                    j9kVar = (j9k) fbkVar;
                    int i26 = j9kVar.f110189b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        j9kVar.f110189b = i26 - Integer.MIN_VALUE;
                    } else {
                        j9kVar = new j9k(this, fbkVar);
                    }
                } else {
                    j9kVar = new j9k(this, fbkVar);
                }
                Object obj14 = j9kVar.f110188a;
                int i27 = j9kVar.f110189b;
                if (i27 == 0) {
                    bga.m29073P(obj14);
                    Object objMo49283h3 = ((xul0) obj).mo49283h();
                    if (objMo49283h3 != null) {
                        j9kVar.f110189b = 1;
                        Object objEmit13 = this.f137819b.emit(objMo49283h3, j9kVar);
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
                if (fbkVar instanceof k9k) {
                    k9kVar = (k9k) fbkVar;
                    int i28 = k9kVar.f120598b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        k9kVar.f120598b = i28 - Integer.MIN_VALUE;
                    } else {
                        k9kVar = new k9k(this, fbkVar);
                    }
                } else {
                    k9kVar = new k9k(this, fbkVar);
                }
                Object obj15 = k9kVar.f120597a;
                int i29 = k9kVar.f120598b;
                if (i29 == 0) {
                    bga.m29073P(obj15);
                    Object objMo49283h4 = ((xul0) obj).mo49283h();
                    if (objMo49283h4 != null) {
                        k9kVar.f120598b = 1;
                        Object objEmit14 = this.f137819b.emit(objMo49283h4, k9kVar);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof wck) {
                    wckVar = (wck) fbkVar;
                    int i30 = wckVar.f250063b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        wckVar.f250063b = i30 - Integer.MIN_VALUE;
                    } else {
                        wckVar = new wck(this, fbkVar);
                    }
                } else {
                    wckVar = new wck(this, fbkVar);
                }
                Object obj16 = wckVar.f250062a;
                int i31 = wckVar.f250063b;
                if (i31 == 0) {
                    bga.m29073P(obj16);
                    hfk hfkVar = (hfk) obj;
                    if ((hfkVar instanceof efk) || (hfkVar instanceof ffk)) {
                        wckVar.f250063b = 1;
                        Object objEmit15 = this.f137819b.emit(obj, wckVar);
                        yuk yukVar15 = yuk.f276404a;
                        if (objEmit15 == yukVar15) {
                            return yukVar15;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof zfk) {
                    zfkVar = (zfk) fbkVar;
                    int i32 = zfkVar.f282333b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        zfkVar.f282333b = i32 - Integer.MIN_VALUE;
                    } else {
                        zfkVar = new zfk(this, fbkVar);
                    }
                } else {
                    zfkVar = new zfk(this, fbkVar);
                }
                Object obj17 = zfkVar.f282332a;
                int i33 = zfkVar.f282333b;
                if (i33 == 0) {
                    bga.m29073P(obj17);
                    qho qhoVar = (qho) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(qhoVar instanceof oho ? wj50.m88271j(((gd20) ((oho) qhoVar).f165512a).f78712a, Boolean.TRUE) : false);
                    zfkVar.f282333b = 1;
                    Object objEmit16 = this.f137819b.emit(boolValueOf2, zfkVar);
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
                if (fbkVar instanceof kgk) {
                    kgkVar = (kgk) fbkVar;
                    int i34 = kgkVar.f122411b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        kgkVar.f122411b = i34 - Integer.MIN_VALUE;
                    } else {
                        kgkVar = new kgk(this, fbkVar);
                    }
                } else {
                    kgkVar = new kgk(this, fbkVar);
                }
                Object obj18 = kgkVar.f122410a;
                int i35 = kgkVar.f122411b;
                if (i35 == 0) {
                    bga.m29073P(obj18);
                    qho qhoVar2 = (qho) obj;
                    boolean z = false;
                    if ((qhoVar2 instanceof oho) && (fdkVar = ((cek) ((oho) qhoVar2).f165512a).f37145a) != null && fdkVar.f68517b) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    kgkVar.f122411b = 1;
                    Object objEmit17 = this.f137819b.emit(boolValueOf3, kgkVar);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ohk) {
                    ohkVar = (ohk) fbkVar;
                    int i36 = ohkVar.f165474b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ohkVar.f165474b = i36 - Integer.MIN_VALUE;
                    } else {
                        ohkVar = new ohk(this, fbkVar);
                    }
                } else {
                    ohkVar = new ohk(this, fbkVar);
                }
                Object obj19 = ohkVar.f165473a;
                int i37 = ohkVar.f165474b;
                if (i37 == 0) {
                    bga.m29073P(obj19);
                    qho qhoVar3 = (qho) obj;
                    oho ohoVar = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                    Boolean bool = ohoVar != null ? (Boolean) ohoVar.f165512a : null;
                    if (bool != null) {
                        ohkVar.f165474b = 1;
                        Object objEmit18 = this.f137819b.emit(bool, ohkVar);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof phk) {
                    phkVar = (phk) fbkVar;
                    int i38 = phkVar.f177676b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        phkVar.f177676b = i38 - Integer.MIN_VALUE;
                    } else {
                        phkVar = new phk(this, fbkVar);
                    }
                } else {
                    phkVar = new phk(this, fbkVar);
                }
                Object obj20 = phkVar.f177675a;
                int i39 = phkVar.f177676b;
                if (i39 == 0) {
                    bga.m29073P(obj20);
                    qho qhoVar4 = (qho) obj;
                    hd20 hd20Var = qhoVar4 instanceof oho ? (hd20) ((oho) qhoVar4).f165512a : new hd20(null);
                    phkVar.f177676b = 1;
                    Object objEmit19 = this.f137819b.emit(hd20Var, phkVar);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof xsk) {
                    xskVar = (xsk) fbkVar;
                    int i40 = xskVar.f265602b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        xskVar.f265602b = i40 - Integer.MIN_VALUE;
                    } else {
                        xskVar = new xsk(this, fbkVar);
                    }
                } else {
                    xskVar = new xsk(this, fbkVar);
                }
                Object obj21 = xskVar.f265601a;
                int i41 = xskVar.f265602b;
                if (i41 == 0) {
                    bga.m29073P(obj21);
                    Map mapM97882n = ((ResumptionProgressEsperanto$GetResumePointResponse) obj).m97882n();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM97882n.size()));
                    for (Map.Entry entry : mapM97882n.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new Long(((ResumptionProgressEsperanto$ItemResumePoint) entry.getValue()).m97894p().m97919o().m1932r()));
                    }
                    xskVar.f265602b = 1;
                    Object objEmit20 = this.f137819b.emit(linkedHashMap, xskVar);
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
                if (fbkVar instanceof hzk) {
                    hzkVar = (hzk) fbkVar;
                    int i42 = hzkVar.f96962b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        hzkVar.f96962b = i42 - Integer.MIN_VALUE;
                    } else {
                        hzkVar = new hzk(this, fbkVar);
                    }
                } else {
                    hzkVar = new hzk(this, fbkVar);
                }
                Object obj22 = hzkVar.f96961a;
                int i43 = hzkVar.f96962b;
                if (i43 == 0) {
                    bga.m29073P(obj22);
                    Boolean boolValueOf4 = Boolean.valueOf(((g4a) obj) != null);
                    hzkVar.f96962b = 1;
                    Object objEmit21 = this.f137819b.emit(boolValueOf4, hzkVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof u4l) {
                    u4lVar = (u4l) fbkVar;
                    int i44 = u4lVar.f226769b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        u4lVar.f226769b = i44 - Integer.MIN_VALUE;
                    } else {
                        u4lVar = new u4l(this, fbkVar);
                    }
                } else {
                    u4lVar = new u4l(this, fbkVar);
                }
                Object obj23 = u4lVar.f226768a;
                int i45 = u4lVar.f226769b;
                if (i45 == 0) {
                    bga.m29073P(obj23);
                    i2n0 i2n0Var = (i2n0) obj;
                    if (i2n0Var instanceof h2n0) {
                        int iM38547C = edb.m38547C(((h2n0) i2n0Var).f87035b);
                        if (iM38547C == 0) {
                            pduVar = rdu.f198207a;
                        } else if (iM38547C == 1) {
                            pduVar = new pdu(new Integer(R.string.settings_item_create_account_disabled_error), null);
                        } else if (iM38547C == 2) {
                            pduVar = new pdu(new Integer(R.string.settings_item_create_account_disabled_limit_reached), null);
                        } else if (iM38547C == 3) {
                            pduVar = new pdu(new Integer(R.string.settings_item_create_account_disabled_parental_age), null);
                        } else {
                            if (iM38547C != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pduVar = new pdu(new Integer(R.string.settings_item_create_account_disabled_address_required), null);
                        }
                    } else {
                        if (!(i2n0Var instanceof g2n0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pduVar = new pdu(new Integer(R.string.settings_item_create_account_disabled_error), null);
                    }
                    u4lVar.f226769b = 1;
                    Object objEmit22 = this.f137819b.emit(pduVar, u4lVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof v4l) {
                    v4lVar = (v4l) fbkVar;
                    int i46 = v4lVar.f237199b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        v4lVar.f237199b = i46 - Integer.MIN_VALUE;
                    } else {
                        v4lVar = new v4l(this, fbkVar);
                    }
                } else {
                    v4lVar = new v4l(this, fbkVar);
                }
                Object obj24 = v4lVar.f237198a;
                int i47 = v4lVar.f237199b;
                if (i47 == 0) {
                    bga.m29073P(obj24);
                    Boolean bool2 = (Boolean) ((gv31) obj).f84602a;
                    Boolean boolValueOf5 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    v4lVar.f237199b = 1;
                    Object objEmit23 = this.f137819b.emit(boolValueOf5, v4lVar);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof rll) {
                    rllVar = (rll) fbkVar;
                    int i48 = rllVar.f200336b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        rllVar.f200336b = i48 - Integer.MIN_VALUE;
                    } else {
                        rllVar = new rll(this, fbkVar);
                    }
                } else {
                    rllVar = new rll(this, fbkVar);
                }
                Object obj25 = rllVar.f200335a;
                int i49 = rllVar.f200336b;
                if (i49 == 0) {
                    bga.m29073P(obj25);
                    lml lmlVar = (lml) obj;
                    if (lmlVar instanceof kml) {
                        mllVar = new nll(((kml) lmlVar).f124173a);
                    } else {
                        if (!(lmlVar instanceof jml)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jml jmlVar = (jml) lmlVar;
                        mllVar = new mll(jmlVar.f113902a, jmlVar.f113903b);
                    }
                    rllVar.f200336b = 1;
                    Object objEmit24 = this.f137819b.emit(mllVar, rllVar);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof sll) {
                    sllVar = (sll) fbkVar;
                    int i50 = sllVar.f210437b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        sllVar.f210437b = i50 - Integer.MIN_VALUE;
                    } else {
                        sllVar = new sll(this, fbkVar);
                    }
                } else {
                    sllVar = new sll(this, fbkVar);
                }
                Object obj26 = sllVar.f210436a;
                int i51 = sllVar.f210437b;
                if (i51 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf6 = Boolean.valueOf(((uvf0) obj).m84056b());
                    sllVar.f210437b = 1;
                    Object objEmit25 = this.f137819b.emit(boolValueOf6, sllVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof dol) {
                    dolVar = (dol) fbkVar;
                    int i52 = dolVar.f51066b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        dolVar.f51066b = i52 - Integer.MIN_VALUE;
                    } else {
                        dolVar = new dol(this, fbkVar);
                    }
                } else {
                    dolVar = new dol(this, fbkVar);
                }
                Object obj27 = dolVar.f51065a;
                int i53 = dolVar.f51066b;
                if (i53 == 0) {
                    bga.m29073P(obj27);
                    AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse = (AdDetectionOuterClass$SubscribeUserToCreatorTimestampResponse) obj;
                    Long l = adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse.m2305o() ? null : new Long(adDetectionOuterClass$SubscribeUserToCreatorTimestampResponse.m2304n().m2263n());
                    if (l != null) {
                        dolVar.f51066b = 1;
                        Object objEmit26 = this.f137819b.emit(l, dolVar);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof gol) {
                    golVar = (gol) fbkVar;
                    int i54 = golVar.f82975b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        golVar.f82975b = i54 - Integer.MIN_VALUE;
                    } else {
                        golVar = new gol(this, fbkVar);
                    }
                } else {
                    golVar = new gol(this, fbkVar);
                }
                Object obj28 = golVar.f82974a;
                int i55 = golVar.f82975b;
                if (i55 == 0) {
                    bga.m29073P(obj28);
                    wta1 wta1Var = (wta1) obj;
                    rta1 rta1Var = wta1Var != null ? wta1Var.f254902a : null;
                    golVar.f82975b = 1;
                    Object objEmit27 = this.f137819b.emit(rta1Var, golVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof qpl) {
                    qplVar = (qpl) fbkVar;
                    int i56 = qplVar.f191344b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        qplVar.f191344b = i56 - Integer.MIN_VALUE;
                    } else {
                        qplVar = new qpl(this, fbkVar);
                    }
                } else {
                    qplVar = new qpl(this, fbkVar);
                }
                Object obj29 = qplVar.f191343a;
                int i57 = qplVar.f191344b;
                if (i57 == 0) {
                    bga.m29073P(obj29);
                    qho qhoVar5 = (qho) obj;
                    oho ohoVar2 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                    ey80 ey80Var = ohoVar2 != null ? (ey80) ohoVar2.f165512a : null;
                    if (ey80Var != null) {
                        qplVar.f191344b = 1;
                        Object objEmit28 = this.f137819b.emit(ey80Var, qplVar);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof tpl) {
                    tplVar = (tpl) fbkVar;
                    int i58 = tplVar.f222562b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        tplVar.f222562b = i58 - Integer.MIN_VALUE;
                    } else {
                        tplVar = new tpl(this, fbkVar);
                    }
                } else {
                    tplVar = new tpl(this, fbkVar);
                }
                Object obj30 = tplVar.f222561a;
                int i59 = tplVar.f222562b;
                if (i59 == 0) {
                    bga.m29073P(obj30);
                    kml kmlVar = new kml((List) obj);
                    tplVar.f222562b = 1;
                    Object objEmit29 = this.f137819b.emit(kmlVar, tplVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof eql) {
                    eqlVar = (eql) fbkVar;
                    int i60 = eqlVar.f61915b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        eqlVar.f61915b = i60 - Integer.MIN_VALUE;
                    } else {
                        eqlVar = new eql(this, fbkVar);
                    }
                } else {
                    eqlVar = new eql(this, fbkVar);
                }
                Object obj31 = eqlVar.f61914a;
                int i61 = eqlVar.f61915b;
                if (i61 == 0) {
                    bga.m29073P(obj31);
                    String str = ((e301) obj).f55571a;
                    eqlVar.f61915b = 1;
                    Object objEmit30 = this.f137819b.emit(str, eqlVar);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
        }
    }

    public lxi(niz nizVar, p22 p22Var) {
        this.f137818a = 15;
        this.f137819b = nizVar;
    }
}
