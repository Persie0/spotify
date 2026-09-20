package p204p;

import com.spotify.music.R;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetProgressResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class bvv0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f31450b;

    public /* synthetic */ bvv0(niz nizVar, int i) {
        this.f31449a = i;
        this.f31450b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:147:0x024e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0295  */
    /* JADX WARN: Code duplicated, block: B:183:0x02de  */
    /* JADX WARN: Code duplicated, block: B:202:0x0327  */
    /* JADX WARN: Code duplicated, block: B:219:0x036e  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:259:0x0409  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:283:0x045d  */
    /* JADX WARN: Code duplicated, block: B:307:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:324:0x0527  */
    /* JADX WARN: Code duplicated, block: B:341:0x056e  */
    /* JADX WARN: Code duplicated, block: B:372:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0626  */
    /* JADX WARN: Code duplicated, block: B:410:0x0698  */
    /* JADX WARN: Code duplicated, block: B:435:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:460:0x0742  */
    /* JADX WARN: Code duplicated, block: B:488:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:517:0x0827  */
    /* JADX WARN: Code duplicated, block: B:534:0x0871  */
    /* JADX WARN: Code duplicated, block: B:555:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:572:0x0907  */
    /* JADX WARN: Code duplicated, block: B:589:0x0952  */
    /* JADX WARN: Code duplicated, block: B:616:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        avv0 avv0Var;
        cvv0 cvv0Var;
        evv0 evv0Var;
        nzv0 nzv0Var;
        i1w0 i1w0Var;
        g2w0 g2w0Var;
        o2w0 o2w0Var;
        Object zglVar;
        Object xglVar;
        q3w0 q3w0Var;
        Object y82Var;
        g4w0 g4w0Var;
        m140 m140Var;
        h4w0 h4w0Var;
        m140 m140Var2;
        s7w0 s7w0Var;
        d8w0 d8w0Var;
        o9w0 o9w0Var;
        kcw0 kcw0Var;
        ufw0 ufw0Var;
        zfw0 zfw0Var;
        ohw0 ohw0Var;
        clw0 clw0Var;
        bmw0 bmw0Var;
        fsw0 fsw0Var;
        mxw0 mxw0Var;
        nxw0 nxw0Var;
        i9x0 i9x0Var;
        aax0 aax0Var;
        bax0 bax0Var;
        cax0 cax0Var;
        vfx0 vfx0Var;
        wfx0 wfx0Var;
        z0y0 z0y0Var;
        ycy0 ycy0Var;
        switch (this.f31449a) {
            case 0:
                if (fbkVar instanceof avv0) {
                    avv0Var = (avv0) fbkVar;
                    int i = avv0Var.f20286b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        avv0Var.f20286b = i - Integer.MIN_VALUE;
                    } else {
                        avv0Var = new avv0(this, fbkVar);
                    }
                } else {
                    avv0Var = new avv0(this, fbkVar);
                }
                Object obj2 = avv0Var.f20285a;
                int i2 = avv0Var.f20286b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ErrorType errorTypeError = ((PlayerError) obj).error();
                    if (errorTypeError == ErrorType.PICK_AND_SHUFFLE_CAPPED || errorTypeError == ErrorType.PICK_AND_SHUFFLE_CONNECT_RESTRICTED || errorTypeError == ErrorType.INTERRUPT_PLAYBACK_RESTRICTED || errorTypeError == ErrorType.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED) {
                        avv0Var.f20286b = 1;
                        Object objEmit = this.f31450b.emit(obj, avv0Var);
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
                if (fbkVar instanceof cvv0) {
                    cvv0Var = (cvv0) fbkVar;
                    int i3 = cvv0Var.f42553b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cvv0Var.f42553b = i3 - Integer.MIN_VALUE;
                    } else {
                        cvv0Var = new cvv0(this, fbkVar);
                    }
                } else {
                    cvv0Var = new cvv0(this, fbkVar);
                }
                Object obj3 = cvv0Var.f42552a;
                int i4 = cvv0Var.f42553b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    sui suiVar = (sui) obj;
                    if (suiVar.f214127a && suiVar.f214128b && suiVar.f214129c && suiVar.f214130d && suiVar.f214131e) {
                        cvv0Var.f42553b = 1;
                        Object objEmit2 = this.f31450b.emit(obj, cvv0Var);
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
                if (fbkVar instanceof evv0) {
                    evv0Var = (evv0) fbkVar;
                    int i5 = evv0Var.f63358b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        evv0Var.f63358b = i5 - Integer.MIN_VALUE;
                    } else {
                        evv0Var = new evv0(this, fbkVar);
                    }
                } else {
                    evv0Var = new evv0(this, fbkVar);
                }
                Object obj4 = evv0Var.f63357a;
                int i6 = evv0Var.f63358b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    sui suiVar2 = (sui) obj;
                    jew0 jew0Var = new jew0(suiVar2.f214133g, suiVar2.f214132f);
                    evv0Var.f63358b = 1;
                    Object objEmit3 = this.f31450b.emit(jew0Var, evv0Var);
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
                if (fbkVar instanceof nzv0) {
                    nzv0Var = (nzv0) fbkVar;
                    int i7 = nzv0Var.f160177b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nzv0Var.f160177b = i7 - Integer.MIN_VALUE;
                    } else {
                        nzv0Var = new nzv0(this, fbkVar);
                    }
                } else {
                    nzv0Var = new nzv0(this, fbkVar);
                }
                Object obj5 = nzv0Var.f160176a;
                int i8 = nzv0Var.f160177b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    jzv0 jzv0Var = new jzv0((ebf0) obj);
                    nzv0Var.f160177b = 1;
                    Object objEmit4 = this.f31450b.emit(jzv0Var, nzv0Var);
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
                if (fbkVar instanceof i1w0) {
                    i1w0Var = (i1w0) fbkVar;
                    int i9 = i1w0Var.f97613b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        i1w0Var.f97613b = i9 - Integer.MIN_VALUE;
                    } else {
                        i1w0Var = new i1w0(this, fbkVar);
                    }
                } else {
                    i1w0Var = new i1w0(this, fbkVar);
                }
                Object obj6 = i1w0Var.f97612a;
                int i10 = i1w0Var.f97613b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf = Boolean.valueOf(((f09) obj).f64569a == lnn0.f135184c);
                    i1w0Var.f97613b = 1;
                    Object objEmit5 = this.f31450b.emit(boolValueOf, i1w0Var);
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
                if (fbkVar instanceof g2w0) {
                    g2w0Var = (g2w0) fbkVar;
                    int i11 = g2w0Var.f76018b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        g2w0Var.f76018b = i11 - Integer.MIN_VALUE;
                    } else {
                        g2w0Var = new g2w0(this, fbkVar);
                    }
                } else {
                    g2w0Var = new g2w0(this, fbkVar);
                }
                Object obj7 = g2w0Var.f76017a;
                int i12 = g2w0Var.f76018b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    Map map = (Map) obj;
                    wj50.m88279p(map);
                    sgl sglVar = new sgl(map);
                    g2w0Var.f76018b = 1;
                    Object objEmit6 = this.f31450b.emit(sglVar, g2w0Var);
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
                if (fbkVar instanceof o2w0) {
                    o2w0Var = (o2w0) fbkVar;
                    int i13 = o2w0Var.f161169b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        o2w0Var.f161169b = i13 - Integer.MIN_VALUE;
                    } else {
                        o2w0Var = new o2w0(this, fbkVar);
                    }
                } else {
                    o2w0Var = new o2w0(this, fbkVar);
                }
                Object obj8 = o2w0Var.f161168a;
                int i14 = o2w0Var.f161169b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    y1w0 y1w0Var = (y1w0) obj;
                    if (y1w0Var instanceof v1w0) {
                        xglVar = new xgl(((v1w0) y1w0Var).f236490a);
                    } else {
                        if (y1w0Var instanceof w1w0) {
                            w1w0 w1w0Var = (w1w0) y1w0Var;
                            zglVar = new ygl(w1w0Var.f247192a, w1w0Var.f247194c, w1w0Var.f247195d, w1w0Var.f247193b);
                        } else {
                            if (!(y1w0Var instanceof x1w0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            x1w0 x1w0Var = (x1w0) y1w0Var;
                            zglVar = new zgl(x1w0Var.f257289a, x1w0Var.f257291c, x1w0Var.f257292d, x1w0Var.f257290b);
                        }
                        xglVar = zglVar;
                    }
                    o2w0Var.f161169b = 1;
                    Object objEmit7 = this.f31450b.emit(xglVar, o2w0Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof q3w0) {
                    q3w0Var = (q3w0) fbkVar;
                    int i15 = q3w0Var.f184977b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        q3w0Var.f184977b = i15 - Integer.MIN_VALUE;
                    } else {
                        q3w0Var = new q3w0(this, fbkVar);
                    }
                } else {
                    q3w0Var = new q3w0(this, fbkVar);
                }
                Object obj9 = q3w0Var.f184976a;
                int i16 = q3w0Var.f184977b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    enn0 enn0Var = (enn0) obj;
                    if (enn0Var instanceof cnn0) {
                        y82Var = v82.f238355a;
                    } else if (enn0Var instanceof bnn0) {
                        y82Var = z82.f280344a;
                    } else {
                        if (!(enn0Var instanceof dnn0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dnn0 dnn0Var = (dnn0) enn0Var;
                        y82Var = new y82(dnn0Var.f50859a, dnn0Var.f50860b);
                    }
                    q3w0Var.f184977b = 1;
                    Object objEmit8 = this.f31450b.emit(y82Var, q3w0Var);
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
                if (fbkVar instanceof g4w0) {
                    g4w0Var = (g4w0) fbkVar;
                    int i17 = g4w0Var.f76542b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        g4w0Var.f76542b = i17 - Integer.MIN_VALUE;
                    } else {
                        g4w0Var = new g4w0(this, fbkVar);
                    }
                } else {
                    g4w0Var = new g4w0(this, fbkVar);
                }
                Object obj10 = g4w0Var.f76541a;
                int i18 = g4w0Var.f76542b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    ex81 ex81Var = ((i2y) obj).f97929a;
                    String str = null;
                    bx81 bx81Var = ex81Var instanceof bx81 ? (bx81) ex81Var : null;
                    if (bx81Var != null && (m140Var = bx81Var.f31803a) != null) {
                        str = m140Var.f138843c;
                    }
                    g4w0Var.f76542b = 1;
                    Object objEmit9 = this.f31450b.emit(str, g4w0Var);
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
                if (fbkVar instanceof h4w0) {
                    h4w0Var = (h4w0) fbkVar;
                    int i19 = h4w0Var.f87670b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        h4w0Var.f87670b = i19 - Integer.MIN_VALUE;
                    } else {
                        h4w0Var = new h4w0(this, fbkVar);
                    }
                } else {
                    h4w0Var = new h4w0(this, fbkVar);
                }
                Object obj11 = h4w0Var.f87669a;
                int i20 = h4w0Var.f87670b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    ex81 ex81Var2 = ((i2y) obj).f97929a;
                    String str2 = null;
                    bx81 bx81Var2 = ex81Var2 instanceof bx81 ? (bx81) ex81Var2 : null;
                    if (bx81Var2 != null && (m140Var2 = bx81Var2.f31803a) != null) {
                        str2 = m140Var2.f138843c;
                    }
                    h4w0Var.f87670b = 1;
                    Object objEmit10 = this.f31450b.emit(str2, h4w0Var);
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
                if (fbkVar instanceof s7w0) {
                    s7w0Var = (s7w0) fbkVar;
                    int i21 = s7w0Var.f206489b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        s7w0Var.f206489b = i21 - Integer.MIN_VALUE;
                    } else {
                        s7w0Var = new s7w0(this, fbkVar);
                    }
                } else {
                    s7w0Var = new s7w0(this, fbkVar);
                }
                Object obj12 = s7w0Var.f206488a;
                int i22 = s7w0Var.f206489b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    List<r8w0> list = ((w7w0) obj).f248810c;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (r8w0 r8w0Var : list) {
                        arrayList.add(new sec1(r8w0Var, r8w0Var.getId()));
                    }
                    d320 d320Var = new d320(arrayList, null);
                    s7w0Var.f206489b = 1;
                    Object objEmit11 = this.f31450b.emit(d320Var, s7w0Var);
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
                if (fbkVar instanceof d8w0) {
                    d8w0Var = (d8w0) fbkVar;
                    int i23 = d8w0Var.f46544b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        d8w0Var.f46544b = i23 - Integer.MIN_VALUE;
                    } else {
                        d8w0Var = new d8w0(this, fbkVar);
                    }
                } else {
                    d8w0Var = new d8w0(this, fbkVar);
                }
                Object obj13 = d8w0Var.f46543a;
                int i24 = d8w0Var.f46544b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    Set setM43736n1 = g6f.m43736n1((List) obj);
                    d8w0Var.f46544b = 1;
                    Object objEmit12 = this.f31450b.emit(setM43736n1, d8w0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof o9w0) {
                    o9w0Var = (o9w0) fbkVar;
                    int i25 = o9w0Var.f163148b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        o9w0Var.f163148b = i25 - Integer.MIN_VALUE;
                    } else {
                        o9w0Var = new o9w0(this, fbkVar);
                    }
                } else {
                    o9w0Var = new o9w0(this, fbkVar);
                }
                Object obj14 = o9w0Var.f163147a;
                int i26 = o9w0Var.f163148b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    qui quiVar = (qui) obj;
                    boolean z = quiVar instanceof pui;
                    Object pduVar = rdu.f198207a;
                    if (!z) {
                        if (quiVar instanceof nui) {
                            pduVar = new pdu(null, null);
                        } else {
                            if (!(quiVar instanceof oui)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!((oui) quiVar).f170297b) {
                                pduVar = new pdu(new Integer(R.string.settings_disabled_reason_playing_other_core_device), null);
                            }
                        }
                    }
                    o9w0Var.f163148b = 1;
                    Object objEmit13 = this.f31450b.emit(pduVar, o9w0Var);
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
                if (fbkVar instanceof kcw0) {
                    kcw0Var = (kcw0) fbkVar;
                    int i27 = kcw0Var.f121557b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        kcw0Var.f121557b = i27 - Integer.MIN_VALUE;
                    } else {
                        kcw0Var = new kcw0(this, fbkVar);
                    }
                } else {
                    kcw0Var = new kcw0(this, fbkVar);
                }
                Object obj15 = kcw0Var.f121556a;
                int i28 = kcw0Var.f121557b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    bcw0 bcw0Var = new bcw0((rdw0) obj);
                    kcw0Var.f121557b = 1;
                    Object objEmit14 = this.f31450b.emit(bcw0Var, kcw0Var);
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
                if (fbkVar instanceof ufw0) {
                    ufw0Var = (ufw0) fbkVar;
                    int i29 = ufw0Var.f229887b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ufw0Var.f229887b = i29 - Integer.MIN_VALUE;
                    } else {
                        ufw0Var = new ufw0(this, fbkVar);
                    }
                } else {
                    ufw0Var = new ufw0(this, fbkVar);
                }
                Object obj16 = ufw0Var.f229886a;
                int i30 = ufw0Var.f229887b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    s6x0 s6x0Var = new s6x0((tfw0) obj);
                    ufw0Var.f229887b = 1;
                    Object objEmit15 = this.f31450b.emit(s6x0Var, ufw0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof zfw0) {
                    zfw0Var = (zfw0) fbkVar;
                    int i31 = zfw0Var.f282438b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        zfw0Var.f282438b = i31 - Integer.MIN_VALUE;
                    } else {
                        zfw0Var = new zfw0(this, fbkVar);
                    }
                } else {
                    zfw0Var = new zfw0(this, fbkVar);
                }
                Object obj17 = zfw0Var.f282437a;
                int i32 = zfw0Var.f282438b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    Set setKeySet = ((tfw0) obj).f220062a.keySet();
                    int iM31820L = c95.m31820L(i6f.m49804T(setKeySet, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj18 : setKeySet) {
                        linkedHashMap.put(obj18, new uql0(Collections.singleton(tql0.f222830b)));
                    }
                    yql0 yql0Var = new yql0(linkedHashMap);
                    zfw0Var.f282438b = 1;
                    Object objEmit16 = this.f31450b.emit(yql0Var, zfw0Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ohw0) {
                    ohw0Var = (ohw0) fbkVar;
                    int i33 = ohw0Var.f165556b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ohw0Var.f165556b = i33 - Integer.MIN_VALUE;
                    } else {
                        ohw0Var = new ohw0(this, fbkVar);
                    }
                } else {
                    ohw0Var = new ohw0(this, fbkVar);
                }
                Object obj19 = ohw0Var.f165555a;
                int i34 = ohw0Var.f165556b;
                if (i34 == 0) {
                    bga.m29073P(obj19);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    uu41 uu41Var = ohoVar != null ? (uu41) ohoVar.f165512a : null;
                    if (uu41Var != null) {
                        ohw0Var.f165556b = 1;
                        Object objEmit17 = this.f31450b.emit(uu41Var, ohw0Var);
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
                if (fbkVar instanceof clw0) {
                    clw0Var = (clw0) fbkVar;
                    int i35 = clw0Var.f39416b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        clw0Var.f39416b = i35 - Integer.MIN_VALUE;
                    } else {
                        clw0Var = new clw0(this, fbkVar);
                    }
                } else {
                    clw0Var = new clw0(this, fbkVar);
                }
                Object obj20 = clw0Var.f39415a;
                int i36 = clw0Var.f39416b;
                if (i36 == 0) {
                    bga.m29073P(obj20);
                    if (!((Boolean) obj).booleanValue()) {
                        clw0Var.f39416b = 1;
                        Object objEmit18 = this.f31450b.emit(obj, clw0Var);
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
                if (fbkVar instanceof bmw0) {
                    bmw0Var = (bmw0) fbkVar;
                    int i37 = bmw0Var.f28641b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        bmw0Var.f28641b = i37 - Integer.MIN_VALUE;
                    } else {
                        bmw0Var = new bmw0(this, fbkVar);
                    }
                } else {
                    bmw0Var = new bmw0(this, fbkVar);
                }
                Object obj21 = bmw0Var.f28640a;
                int i38 = bmw0Var.f28641b;
                if (i38 == 0) {
                    bga.m29073P(obj21);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    bmw0Var.f28641b = 1;
                    Object objEmit19 = this.f31450b.emit(boolValueOf2, bmw0Var);
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
                if (fbkVar instanceof fsw0) {
                    fsw0Var = (fsw0) fbkVar;
                    int i39 = fsw0Var.f72999b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        fsw0Var.f72999b = i39 - Integer.MIN_VALUE;
                    } else {
                        fsw0Var = new fsw0(this, fbkVar);
                    }
                } else {
                    fsw0Var = new fsw0(this, fbkVar);
                }
                Object obj22 = fsw0Var.f72998a;
                int i40 = fsw0Var.f72999b;
                if (i40 == 0) {
                    bga.m29073P(obj22);
                    j0l j0lVar = new j0l((String) obj);
                    fsw0Var.f72999b = 1;
                    Object objEmit20 = this.f31450b.emit(j0lVar, fsw0Var);
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
                if (fbkVar instanceof mxw0) {
                    mxw0Var = (mxw0) fbkVar;
                    int i41 = mxw0Var.f148210b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mxw0Var.f148210b = i41 - Integer.MIN_VALUE;
                    } else {
                        mxw0Var = new mxw0(this, fbkVar);
                    }
                } else {
                    mxw0Var = new mxw0(this, fbkVar);
                }
                Object obj23 = mxw0Var.f148209a;
                int i42 = mxw0Var.f148210b;
                if (i42 == 0) {
                    bga.m29073P(obj23);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        mxw0Var.f148210b = 1;
                        Object objEmit21 = this.f31450b.emit(obj, mxw0Var);
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
                if (fbkVar instanceof nxw0) {
                    nxw0Var = (nxw0) fbkVar;
                    int i43 = nxw0Var.f159627b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        nxw0Var.f159627b = i43 - Integer.MIN_VALUE;
                    } else {
                        nxw0Var = new nxw0(this, fbkVar);
                    }
                } else {
                    nxw0Var = new nxw0(this, fbkVar);
                }
                Object obj24 = nxw0Var.f159626a;
                int i44 = nxw0Var.f159627b;
                if (i44 == 0) {
                    bga.m29073P(obj24);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        nxw0Var.f159627b = 1;
                        Object objEmit22 = this.f31450b.emit(obj, nxw0Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit22 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof i9x0) {
                    i9x0Var = (i9x0) fbkVar;
                    int i45 = i9x0Var.f100098b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        i9x0Var.f100098b = i45 - Integer.MIN_VALUE;
                    } else {
                        i9x0Var = new i9x0(this, fbkVar);
                    }
                } else {
                    i9x0Var = new i9x0(this, fbkVar);
                }
                Object obj25 = i9x0Var.f100097a;
                int i46 = i9x0Var.f100098b;
                if (i46 == 0) {
                    bga.m29073P(obj25);
                    m9x0 m9x0Var = new m9x0((Map) obj);
                    i9x0Var.f100098b = 1;
                    Object objEmit23 = this.f31450b.emit(m9x0Var, i9x0Var);
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
                if (fbkVar instanceof aax0) {
                    aax0Var = (aax0) fbkVar;
                    int i47 = aax0Var.f13947b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        aax0Var.f13947b = i47 - Integer.MIN_VALUE;
                    } else {
                        aax0Var = new aax0(this, fbkVar);
                    }
                } else {
                    aax0Var = new aax0(this, fbkVar);
                }
                Object obj26 = aax0Var.f13946a;
                int i48 = aax0Var.f13947b;
                if (i48 == 0) {
                    bga.m29073P(obj26);
                    byte[] bArr = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetProgressResponse resumptionProgressEsperanto$GetProgressResponseM97873o = ResumptionProgressEsperanto$GetProgressResponse.m97873o(bArr);
                        aax0Var.f13947b = 1;
                        Object objEmit24 = this.f31450b.emit(resumptionProgressEsperanto$GetProgressResponseM97873o, aax0Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetProgressResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof bax0) {
                    bax0Var = (bax0) fbkVar;
                    int i49 = bax0Var.f25358b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        bax0Var.f25358b = i49 - Integer.MIN_VALUE;
                    } else {
                        bax0Var = new bax0(this, fbkVar);
                    }
                } else {
                    bax0Var = new bax0(this, fbkVar);
                }
                Object obj27 = bax0Var.f25357a;
                int i50 = bax0Var.f25358b;
                if (i50 == 0) {
                    bga.m29073P(obj27);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetProgressResponse resumptionProgressEsperanto$GetProgressResponseM97873o2 = ResumptionProgressEsperanto$GetProgressResponse.m97873o(bArr2);
                        bax0Var.f25358b = 1;
                        Object objEmit25 = this.f31450b.emit(resumptionProgressEsperanto$GetProgressResponseM97873o2, bax0Var);
                        yuk yukVar25 = yuk.f276404a;
                        if (objEmit25 == yukVar25) {
                            return yukVar25;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetProgressResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof cax0) {
                    cax0Var = (cax0) fbkVar;
                    int i51 = cax0Var.f35944b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        cax0Var.f35944b = i51 - Integer.MIN_VALUE;
                    } else {
                        cax0Var = new cax0(this, fbkVar);
                    }
                } else {
                    cax0Var = new cax0(this, fbkVar);
                }
                Object obj28 = cax0Var.f35943a;
                int i52 = cax0Var.f35944b;
                if (i52 == 0) {
                    bga.m29073P(obj28);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetResumePointResponse resumptionProgressEsperanto$GetResumePointResponseM97881o = ResumptionProgressEsperanto$GetResumePointResponse.m97881o(bArr3);
                        cax0Var.f35944b = 1;
                        Object objEmit26 = this.f31450b.emit(resumptionProgressEsperanto$GetResumePointResponseM97881o, cax0Var);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetResumePointResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof vfx0) {
                    vfx0Var = (vfx0) fbkVar;
                    int i53 = vfx0Var.f241066b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        vfx0Var.f241066b = i53 - Integer.MIN_VALUE;
                    } else {
                        vfx0Var = new vfx0(this, fbkVar);
                    }
                } else {
                    vfx0Var = new vfx0(this, fbkVar);
                }
                Object obj29 = vfx0Var.f241065a;
                int i54 = vfx0Var.f241066b;
                if (i54 == 0) {
                    bga.m29073P(obj29);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        vfx0Var.f241066b = 1;
                        Object objEmit27 = this.f31450b.emit(obj, vfx0Var);
                        yuk yukVar27 = yuk.f276404a;
                        if (objEmit27 == yukVar27) {
                            return yukVar27;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof wfx0) {
                    wfx0Var = (wfx0) fbkVar;
                    int i55 = wfx0Var.f250922b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        wfx0Var.f250922b = i55 - Integer.MIN_VALUE;
                    } else {
                        wfx0Var = new wfx0(this, fbkVar);
                    }
                } else {
                    wfx0Var = new wfx0(this, fbkVar);
                }
                Object obj30 = wfx0Var.f250921a;
                int i56 = wfx0Var.f250922b;
                if (i56 == 0) {
                    bga.m29073P(obj30);
                    List listMo45450b = ((gqx) obj).mo45450b(lqd.class);
                    wfx0Var.f250922b = 1;
                    Object objEmit28 = this.f31450b.emit(listMo45450b, wfx0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof z0y0) {
                    z0y0Var = (z0y0) fbkVar;
                    int i57 = z0y0Var.f278185b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        z0y0Var.f278185b = i57 - Integer.MIN_VALUE;
                    } else {
                        z0y0Var = new z0y0(this, fbkVar);
                    }
                } else {
                    z0y0Var = new z0y0(this, fbkVar);
                }
                Object obj31 = z0y0Var.f278184a;
                int i58 = z0y0Var.f278185b;
                if (i58 == 0) {
                    bga.m29073P(obj31);
                    if (obj instanceof oho) {
                        z0y0Var.f278185b = 1;
                        Object objEmit29 = this.f31450b.emit(obj, z0y0Var);
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
                if (fbkVar instanceof ycy0) {
                    ycy0Var = (ycy0) fbkVar;
                    int i59 = ycy0Var.f271597b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ycy0Var.f271597b = i59 - Integer.MIN_VALUE;
                    } else {
                        ycy0Var = new ycy0(this, fbkVar);
                    }
                } else {
                    ycy0Var = new ycy0(this, fbkVar);
                }
                Object obj32 = ycy0Var.f271596a;
                int i60 = ycy0Var.f271597b;
                if (i60 == 0) {
                    bga.m29073P(obj32);
                    tcy0 tcy0Var = new tcy0((ldy0) obj);
                    ycy0Var.f271597b = 1;
                    Object objEmit30 = this.f31450b.emit(tcy0Var, ycy0Var);
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

    public /* synthetic */ bvv0(niz nizVar, fvv0 fvv0Var, int i) {
        this.f31449a = i;
        this.f31450b = nizVar;
    }
}
