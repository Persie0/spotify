package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ContentSettingChange;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: classes10.dex */
public final class wli0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252564a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f252565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f252566c;

    public wli0(String str, niz nizVar) {
        this.f252564a = 29;
        this.f252566c = str;
        this.f252565b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m88519b(Object obj, fbk fbkVar) {
        nm81 nm81Var;
        if (fbkVar instanceof nm81) {
            nm81Var = (nm81) fbkVar;
            int i = nm81Var.f155325b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm81Var.f155325b = i - Integer.MIN_VALUE;
            } else {
                nm81Var = new nm81(this, fbkVar);
            }
        } else {
            nm81Var = new nm81(this, fbkVar);
        }
        Object obj2 = nm81Var.f155324a;
        int i2 = nm81Var.f155325b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nhl nhlVar = (nhl) obj;
            boolean z = nhlVar instanceof khl;
            pro0 pro0Var = pro0.f180654b;
            if (!z) {
                boolean z2 = nhlVar instanceof lhl;
                String str = this.f252566c;
                if (z2 && wj50.m88271j(((lhl) nhlVar).f133586a, str)) {
                    pro0Var = pro0.f180655c;
                } else if ((nhlVar instanceof mhl) && wj50.m88271j(((mhl) nhlVar).f143823a, str)) {
                    pro0Var = pro0.f180653a;
                }
            }
            nm81Var.f155325b = 1;
            Object objEmit = this.f252565b.emit(pro0Var, nm81Var);
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
    private final Object m88520c(Object obj, fbk fbkVar) {
        om81 om81Var;
        if (fbkVar instanceof om81) {
            om81Var = (om81) fbkVar;
            int i = om81Var.f166996b;
            if ((i & Integer.MIN_VALUE) != 0) {
                om81Var.f166996b = i - Integer.MIN_VALUE;
            } else {
                om81Var = new om81(this, fbkVar);
            }
        } else {
            om81Var = new om81(this, fbkVar);
        }
        Object obj2 = om81Var.f166995a;
        int i2 = om81Var.f166996b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Boolean boolValueOf = Boolean.valueOf(((z4m) obj).f279297b.contains(this.f252566c));
            om81Var.f166996b = 1;
            Object objEmit = this.f252565b.emit(boolValueOf, om81Var);
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

    /* JADX WARN: Code duplicated, block: B:111:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0213  */
    /* JADX WARN: Code duplicated, block: B:165:0x0288  */
    /* JADX WARN: Code duplicated, block: B:189:0x02da  */
    /* JADX WARN: Code duplicated, block: B:212:0x032b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0388  */
    /* JADX WARN: Code duplicated, block: B:258:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:277:0x042c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0451  */
    /* JADX WARN: Code duplicated, block: B:310:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0520  */
    /* JADX WARN: Code duplicated, block: B:364:0x0579  */
    /* JADX WARN: Code duplicated, block: B:401:0x0601  */
    /* JADX WARN: Code duplicated, block: B:423:0x065e  */
    /* JADX WARN: Code duplicated, block: B:444:0x06db  */
    /* JADX WARN: Code duplicated, block: B:465:0x0730  */
    /* JADX WARN: Code duplicated, block: B:482:0x077b  */
    /* JADX WARN: Code duplicated, block: B:506:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:526:0x0825  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:546:0x0873  */
    /* JADX WARN: Code duplicated, block: B:566:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:601:0x0943  */
    /* JADX WARN: Code duplicated, block: B:612:0x0968  */
    /* JADX WARN: Code duplicated, block: B:629:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:649:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:660:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:677:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        vli0 vli0Var;
        o8k0 o8k0Var;
        pok0 pok0Var;
        boolean z;
        tcm0 tcm0Var;
        vpm0 vpm0Var;
        Object zpm0Var;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        eso0 eso0Var;
        fso0 fso0Var;
        oto0 oto0Var;
        t0p0 t0p0Var;
        nip0 nip0Var;
        cas0 cas0Var;
        qtt0 qtt0Var;
        equ0 equ0Var;
        q8v0 q8v0Var;
        oxv0 oxv0Var;
        t5w0 t5w0Var;
        Object y82Var;
        vfw0 vfw0Var;
        ljy0 ljy0Var;
        String strM38000d0;
        ContextTrack contextTrack;
        t921 t921Var;
        u921 u921Var;
        vq41 vq41Var;
        s751 s751Var;
        jy51 jy51Var;
        aq71 aq71Var;
        zx71 zx71Var;
        b781 b781Var;
        rk81 rk81Var;
        Object pk81Var;
        m340 m340Var;
        z240 z240VarM60640a;
        String strM17560p;
        switch (this.f252564a) {
            case 0:
                if (fbkVar instanceof vli0) {
                    vli0Var = (vli0) fbkVar;
                    int i = vli0Var.f242532b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vli0Var.f242532b = i - Integer.MIN_VALUE;
                    } else {
                        vli0Var = new vli0(this, fbkVar);
                    }
                } else {
                    vli0Var = new vli0(this, fbkVar);
                }
                Object obj2 = vli0Var.f242531a;
                int i2 = vli0Var.f242532b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    fqx fqxVarMo45449a = ((gqx) obj).mo45449a(erc1.class, this.f252566c);
                    vli0Var.f242532b = 1;
                    Object objEmit = this.f252565b.emit(fqxVarMo45449a, vli0Var);
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
                if (fbkVar instanceof o8k0) {
                    o8k0Var = (o8k0) fbkVar;
                    int i3 = o8k0Var.f162826b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o8k0Var.f162826b = i3 - Integer.MIN_VALUE;
                    } else {
                        o8k0Var = new o8k0(this, fbkVar);
                    }
                } else {
                    o8k0Var = new o8k0(this, fbkVar);
                }
                Object obj3 = o8k0Var.f162825a;
                int i4 = o8k0Var.f162826b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    pqm0 pqm0Var = new pqm0(this.f252566c, obj);
                    o8k0Var.f162826b = 1;
                    Object objEmit2 = this.f252565b.emit(pqm0Var, o8k0Var);
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
                if (fbkVar instanceof pok0) {
                    pok0Var = (pok0) fbkVar;
                    int i5 = pok0Var.f179727b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pok0Var.f179727b = i5 - Integer.MIN_VALUE;
                    } else {
                        pok0Var = new pok0(this, fbkVar);
                    }
                } else {
                    pok0Var = new pok0(this, fbkVar);
                }
                Object obj4 = pok0Var.f179726a;
                int i6 = pok0Var.f179727b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    PlayerState playerState = (PlayerState) obj;
                    if (!playerState.isPlaying() || playerState.isPaused()) {
                        z = false;
                    } else {
                        String strContextUri = playerState.contextUri();
                        String str = this.f252566c;
                        if (!wj50.m88271j(strContextUri, str)) {
                            ContextTrack contextTrack2 = (ContextTrack) playerState.track().mo49283h();
                            if (!wj50.m88271j(contextTrack2 != null ? e72.m38000d0(contextTrack2, ContextTrack.Metadata.KEY_ALBUM_URI) : null, str)) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    pok0Var.f179727b = 1;
                    Object objEmit3 = this.f252565b.emit(boolValueOf, pok0Var);
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
                if (fbkVar instanceof tcm0) {
                    tcm0Var = (tcm0) fbkVar;
                    int i7 = tcm0Var.f219112b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tcm0Var.f219112b = i7 - Integer.MIN_VALUE;
                    } else {
                        tcm0Var = new tcm0(this, fbkVar);
                    }
                } else {
                    tcm0Var = new tcm0(this, fbkVar);
                }
                Object obj5 = tcm0Var.f219111a;
                int i8 = tcm0Var.f219112b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    ktx ktxVar = ((gqx) obj).mo45449a(m391.class, this.f252566c).f72301b;
                    tcm0Var.f219112b = 1;
                    Object objEmit4 = this.f252565b.emit(ktxVar, tcm0Var);
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
                if (fbkVar instanceof vpm0) {
                    vpm0Var = (vpm0) fbkVar;
                    int i9 = vpm0Var.f243728b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vpm0Var.f243728b = i9 - Integer.MIN_VALUE;
                    } else {
                        vpm0Var = new vpm0(this, fbkVar);
                    }
                } else {
                    vpm0Var = new vpm0(this, fbkVar);
                }
                Object obj6 = vpm0Var.f243727a;
                int i10 = vpm0Var.f243728b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    ebf0 ebf0Var = (ebf0) obj;
                    String str2 = this.f252566c;
                    dbf0 dbf0VarM38368c = ebf0Var.m38368c(ok11.class, str2);
                    upm0 upm0Var = null;
                    ok11 ok11Var = (dbf0VarM38368c == null || (cbf0VarM35556a2 = dbf0VarM38368c.m35556a()) == null) ? null : (ok11) cbf0VarM35556a2.f36107a;
                    dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(upm0.class, str2);
                    if (dbf0VarM38368c2 != null && (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) != null) {
                        upm0Var = (upm0) cbf0VarM35556a.f36107a;
                    }
                    if (upm0Var != null) {
                        int i11 = upm0Var.f232735f;
                        if (ok11Var != null && ok11Var.f166215c && i11 == 5) {
                            zpm0Var = ypm0.f274990a;
                        } else {
                            boolean z2 = i11 == 5;
                            String str3 = upm0Var.f232731b;
                            String str4 = upm0Var.f232736g;
                            if (str4.length() == 0) {
                                str4 = upm0Var.f232732c;
                            }
                            String str5 = str4;
                            String str6 = upm0Var.f232737h;
                            if (str6.length() == 0) {
                                str6 = upm0Var.f232733d;
                            }
                            zpm0Var = new zpm0(str3, str5, str6, upm0Var.f232730a, z2, upm0Var.f232738i.f84403b);
                        }
                    } else {
                        zpm0Var = ypm0.f274990a;
                    }
                    vpm0Var.f243728b = 1;
                    Object objEmit5 = this.f252565b.emit(zpm0Var, vpm0Var);
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
                if (fbkVar instanceof eso0) {
                    eso0Var = (eso0) fbkVar;
                    int i12 = eso0Var.f62435b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        eso0Var.f62435b = i12 - Integer.MIN_VALUE;
                    } else {
                        eso0Var = new eso0(this, fbkVar);
                    }
                } else {
                    eso0Var = new eso0(this, fbkVar);
                }
                Object obj7 = eso0Var.f62434a;
                int i13 = eso0Var.f62435b;
                if (i13 == 0) {
                    bga.m29073P(obj7);
                    wro0 wro0Var = (wro0) ((Map) obj).get(this.f252566c);
                    if (wro0Var == null) {
                        wro0Var = wro0.f254397b;
                    }
                    eso0Var.f62435b = 1;
                    Object objEmit6 = this.f252565b.emit(wro0Var, eso0Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof fso0) {
                    fso0Var = (fso0) fbkVar;
                    int i14 = fso0Var.f72912b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        fso0Var.f72912b = i14 - Integer.MIN_VALUE;
                    } else {
                        fso0Var = new fso0(this, fbkVar);
                    }
                } else {
                    fso0Var = new fso0(this, fbkVar);
                }
                Object obj8 = fso0Var.f72911a;
                int i15 = fso0Var.f72912b;
                if (i15 == 0) {
                    bga.m29073P(obj8);
                    wro0 wro0Var2 = (wro0) ((Map) obj).get(this.f252566c);
                    if (wro0Var2 == null) {
                        wro0Var2 = wro0.f254397b;
                    }
                    fso0Var.f72912b = 1;
                    Object objEmit7 = this.f252565b.emit(wro0Var2, fso0Var);
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
                if (fbkVar instanceof oto0) {
                    oto0Var = (oto0) fbkVar;
                    int i16 = oto0Var.f170049b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        oto0Var.f170049b = i16 - Integer.MIN_VALUE;
                    } else {
                        oto0Var = new oto0(this, fbkVar);
                    }
                } else {
                    oto0Var = new oto0(this, fbkVar);
                }
                Object obj9 = oto0Var.f170048a;
                int i17 = oto0Var.f170049b;
                if (i17 == 0) {
                    bga.m29073P(obj9);
                    Object obj10 = (tto0) ((Map) obj).get(this.f252566c);
                    if (obj10 == null) {
                        obj10 = rto0.f202622a;
                    }
                    oto0Var.f170049b = 1;
                    Object objEmit8 = this.f252565b.emit(obj10, oto0Var);
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
                if (fbkVar instanceof t0p0) {
                    t0p0Var = (t0p0) fbkVar;
                    int i18 = t0p0Var.f215954b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        t0p0Var.f215954b = i18 - Integer.MIN_VALUE;
                    } else {
                        t0p0Var = new t0p0(this, fbkVar);
                    }
                } else {
                    t0p0Var = new t0p0(this, fbkVar);
                }
                Object obj11 = t0p0Var.f215953a;
                int i19 = t0p0Var.f215954b;
                if (i19 == 0) {
                    bga.m29073P(obj11);
                    PlayerState playerState2 = (PlayerState) obj;
                    vrx vrxVar = hdi.m47210B(playerState2).equals(this.f252566c) ? playerState2.isPaused() ? vrx.f244274b : vrx.f244275c : vrx.f244273a;
                    t0p0Var.f215954b = 1;
                    Object objEmit9 = this.f252565b.emit(vrxVar, t0p0Var);
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
                if (fbkVar instanceof nip0) {
                    nip0Var = (nip0) fbkVar;
                    int i20 = nip0Var.f154299b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        nip0Var.f154299b = i20 - Integer.MIN_VALUE;
                    } else {
                        nip0Var = new nip0(this, fbkVar);
                    }
                } else {
                    nip0Var = new nip0(this, fbkVar);
                }
                Object obj12 = nip0Var.f154298a;
                int i21 = nip0Var.f154299b;
                if (i21 == 0) {
                    bga.m29073P(obj12);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    Map mapSingletonMap = Collections.singletonMap(this.f252566c, bool);
                    nip0Var.f154299b = 1;
                    Object objEmit10 = this.f252565b.emit(mapSingletonMap, nip0Var);
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
                if (fbkVar instanceof cas0) {
                    cas0Var = (cas0) fbkVar;
                    int i22 = cas0Var.f35925b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cas0Var.f35925b = i22 - Integer.MIN_VALUE;
                    } else {
                        cas0Var = new cas0(this, fbkVar);
                    }
                } else {
                    cas0Var = new cas0(this, fbkVar);
                }
                Object obj13 = cas0Var.f35924a;
                int i23 = cas0Var.f35925b;
                if (i23 == 0) {
                    bga.m29073P(obj13);
                    qho qhoVar = (qho) obj;
                    pqm0 pqm0Var2 = new pqm0(this.f252566c, qhoVar instanceof oho ? (y6s0) ((oho) qhoVar).f165512a : null);
                    cas0Var.f35925b = 1;
                    Object objEmit11 = this.f252565b.emit(pqm0Var2, cas0Var);
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
                if (fbkVar instanceof qtt0) {
                    qtt0Var = (qtt0) fbkVar;
                    int i24 = qtt0Var.f192482b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        qtt0Var.f192482b = i24 - Integer.MIN_VALUE;
                    } else {
                        qtt0Var = new qtt0(this, fbkVar);
                    }
                } else {
                    qtt0Var = new qtt0(this, fbkVar);
                }
                Object obj14 = qtt0Var.f192481a;
                int i25 = qtt0Var.f192482b;
                if (i25 == 0) {
                    bga.m29073P(obj14);
                    List<ra01> list = (List) obj;
                    String str7 = this.f252566c;
                    wj50.m88279p(str7);
                    be01 be01Var = new be01(str7);
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (ra01 ra01Var : list) {
                        arrayList.add(new ott0((na01) ra01Var.f197159e, ra01Var.f197158d.f207844a));
                    }
                    ptt0 ptt0Var = new ptt0(be01Var, arrayList);
                    qtt0Var.f192482b = 1;
                    Object objEmit12 = this.f252565b.emit(ptt0Var, qtt0Var);
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
                if (fbkVar instanceof equ0) {
                    equ0Var = (equ0) fbkVar;
                    int i26 = equ0Var.f61951b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        equ0Var.f61951b = i26 - Integer.MIN_VALUE;
                    } else {
                        equ0Var = new equ0(this, fbkVar);
                    }
                } else {
                    equ0Var = new equ0(this, fbkVar);
                }
                Object obj15 = equ0Var.f61950a;
                int i27 = equ0Var.f61951b;
                if (i27 == 0) {
                    bga.m29073P(obj15);
                    ok11 ok11Var2 = (ok11) ((gqx) obj).mo45449a(ok11.class, this.f252566c).f72301b;
                    boolean z3 = false;
                    if (ok11Var2 != null && (!ok11Var2.f166215c)) {
                        z3 = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(!z3);
                    equ0Var.f61951b = 1;
                    Object objEmit13 = this.f252565b.emit(boolValueOf2, equ0Var);
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
                if (fbkVar instanceof q8v0) {
                    q8v0Var = (q8v0) fbkVar;
                    int i28 = q8v0Var.f186410b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        q8v0Var.f186410b = i28 - Integer.MIN_VALUE;
                    } else {
                        q8v0Var = new q8v0(this, fbkVar);
                    }
                } else {
                    q8v0Var = new q8v0(this, fbkVar);
                }
                Object obj16 = q8v0Var.f186409a;
                int i29 = q8v0Var.f186410b;
                if (i29 == 0) {
                    bga.m29073P(obj16);
                    String str8 = this.f252566c;
                    y6s0 y6s0Var = (y6s0) ((Map) obj).get(str8);
                    boolean z4 = y6s0Var instanceof w6s0;
                    boolean z5 = z4 || ((y6s0Var instanceof x6s0) && ((x6s0) y6s0Var).f258745a);
                    Integer num = null;
                    w6s0 w6s0Var = z4 ? (w6s0) y6s0Var : null;
                    if (w6s0Var != null) {
                        long j = w6s0Var.f248465b;
                        if (j > 0) {
                            num = new Integer((int) ((w6s0Var.f248466c * ((long) 100)) / j));
                        }
                    }
                    r8v0 r8v0Var = new r8v0(num, str8, z5, y6s0Var != null ? y6s0Var.mo87307f() : false);
                    q8v0Var.f186410b = 1;
                    Object objEmit14 = this.f252565b.emit(r8v0Var, q8v0Var);
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
                if (fbkVar instanceof oxv0) {
                    oxv0Var = (oxv0) fbkVar;
                    int i30 = oxv0Var.f171605b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        oxv0Var.f171605b = i30 - Integer.MIN_VALUE;
                    } else {
                        oxv0Var = new oxv0(this, fbkVar);
                    }
                } else {
                    oxv0Var = new oxv0(this, fbkVar);
                }
                Object obj17 = oxv0Var.f171604a;
                int i31 = oxv0Var.f171605b;
                if (i31 == 0) {
                    bga.m29073P(obj17);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    pqm0 pqm0Var3 = new pqm0(this.f252566c, ohoVar != null ? (aln0) ohoVar.f165512a : null);
                    oxv0Var.f171605b = 1;
                    Object objEmit15 = this.f252565b.emit(pqm0Var3, oxv0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof t5w0) {
                    t5w0Var = (t5w0) fbkVar;
                    int i32 = t5w0Var.f217379b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        t5w0Var.f217379b = i32 - Integer.MIN_VALUE;
                    } else {
                        t5w0Var = new t5w0(this, fbkVar);
                    }
                } else {
                    t5w0Var = new t5w0(this, fbkVar);
                }
                Object obj18 = t5w0Var.f217378a;
                int i33 = t5w0Var.f217379b;
                if (i33 == 0) {
                    bga.m29073P(obj18);
                    v72 v72Var = (v72) ((m72) obj).f140629a.get(this.f252566c);
                    if (v72Var == null || (v72Var instanceof s72)) {
                        y82Var = v82.f238355a;
                    } else if (v72Var instanceof t72) {
                        t72 t72Var = (t72) v72Var;
                        y82Var = new y82(t72Var.f217662a, t72Var.f217663b);
                    } else {
                        if (!(v72Var instanceof u72)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y82Var = z82.f280344a;
                    }
                    t5w0Var.f217379b = 1;
                    Object objEmit16 = this.f252565b.emit(y82Var, t5w0Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof vfw0) {
                    vfw0Var = (vfw0) fbkVar;
                    int i34 = vfw0Var.f241044b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        vfw0Var.f241044b = i34 - Integer.MIN_VALUE;
                    } else {
                        vfw0Var = new vfw0(this, fbkVar);
                    }
                } else {
                    vfw0Var = new vfw0(this, fbkVar);
                }
                Object obj19 = vfw0Var.f241043a;
                int i35 = vfw0Var.f241044b;
                if (i35 == 0) {
                    bga.m29073P(obj19);
                    Object obj20 = ((s6x0) obj).f206218a;
                    if (!(obj20 instanceof c6x0) && (obj20 = (ncj) ((tfw0) obj20).f220062a.get(this.f252566c)) == null) {
                        obj20 = lcj.f131943a;
                    }
                    s6x0 s6x0Var = new s6x0(obj20);
                    vfw0Var.f241044b = 1;
                    Object objEmit17 = this.f252565b.emit(s6x0Var, vfw0Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ljy0) {
                    ljy0Var = (ljy0) fbkVar;
                    int i36 = ljy0Var.f134177b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ljy0Var.f134177b = i36 - Integer.MIN_VALUE;
                    } else {
                        ljy0Var = new ljy0(this, fbkVar);
                    }
                } else {
                    ljy0Var = new ljy0(this, fbkVar);
                }
                Object obj21 = ljy0Var.f134176a;
                int i37 = ljy0Var.f134177b;
                if (i37 == 0) {
                    bga.m29073P(obj21);
                    xul0 xul0VarTrack = ((PlayerState) obj).track();
                    if (xul0VarTrack == null || (contextTrack = (ContextTrack) xul0VarTrack.mo49283h()) == null) {
                        strM38000d0 = this.f252566c;
                    } else {
                        strM38000d0 = (e72.m37978L(contextTrack) || e72.m37985S(contextTrack)) ? e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI) : contextTrack.uri();
                        if (strM38000d0 == null) {
                            strM38000d0 = this.f252566c;
                        }
                    }
                    ljy0Var.f134177b = 1;
                    Object objEmit18 = this.f252565b.emit(strM38000d0, ljy0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof t921) {
                    t921Var = (t921) fbkVar;
                    int i38 = t921Var.f218178b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        t921Var.f218178b = i38 - Integer.MIN_VALUE;
                    } else {
                        t921Var = new t921(this, fbkVar);
                    }
                } else {
                    t921Var = new t921(this, fbkVar);
                }
                Object obj22 = t921Var.f218177a;
                int i39 = t921Var.f218178b;
                if (i39 == 0) {
                    bga.m29073P(obj22);
                    xul0 xul0Var = (xul0) obj;
                    Object obj23 = xul0Var.mo49279c() ? !wj50.m88271j(xul0Var.mo49278b(), this.f252566c) ? tb50.f218758a : null : vb50.f239421a;
                    if (obj23 != null) {
                        t921Var.f218178b = 1;
                        Object objEmit19 = this.f252565b.emit(obj23, t921Var);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit19 == yukVar19) {
                            return yukVar19;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof u921) {
                    u921Var = (u921) fbkVar;
                    int i40 = u921Var.f228061b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        u921Var.f228061b = i40 - Integer.MIN_VALUE;
                    } else {
                        u921Var = new u921(this, fbkVar);
                    }
                } else {
                    u921Var = new u921(this, fbkVar);
                }
                Object obj24 = u921Var.f228060a;
                int i41 = u921Var.f228061b;
                if (i41 == 0) {
                    bga.m29073P(obj24);
                    PlayerState playerState3 = (PlayerState) obj;
                    if (playerState3.playbackId().mo49279c() && !wj50.m88271j(playerState3.playbackId().mo49278b(), this.f252566c)) {
                        u921Var.f228061b = 1;
                        Object objEmit20 = this.f252565b.emit(obj, u921Var);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof vq41) {
                    vq41Var = (vq41) fbkVar;
                    int i42 = vq41Var.f243875b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        vq41Var.f243875b = i42 - Integer.MIN_VALUE;
                    } else {
                        vq41Var = new vq41(this, fbkVar);
                    }
                } else {
                    vq41Var = new vq41(this, fbkVar);
                }
                Object obj25 = vq41Var.f243874a;
                int i43 = vq41Var.f243875b;
                if (i43 == 0) {
                    bga.m29073P(obj25);
                    by50 by50Var = (by50) obj;
                    if (wj50.m88271j(this.f252566c, by50Var != null ? by50Var.f32075a : null)) {
                        vq41Var.f243875b = 1;
                        Object objEmit21 = this.f252565b.emit(obj, vq41Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof s751) {
                    s751Var = (s751) fbkVar;
                    int i44 = s751Var.f206283b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        s751Var.f206283b = i44 - Integer.MIN_VALUE;
                    } else {
                        s751Var = new s751(this, fbkVar);
                    }
                } else {
                    s751Var = new s751(this, fbkVar);
                }
                Object obj26 = s751Var.f206282a;
                int i45 = s751Var.f206283b;
                if (i45 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf3 = Boolean.valueOf((((z3i0) obj) == z3i0.f278964a && this.f252566c == null) ? false : true);
                    s751Var.f206283b = 1;
                    Object objEmit22 = this.f252565b.emit(boolValueOf3, s751Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof jy51) {
                    jy51Var = (jy51) fbkVar;
                    int i46 = jy51Var.f117304b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        jy51Var.f117304b = i46 - Integer.MIN_VALUE;
                    } else {
                        jy51Var = new jy51(this, fbkVar);
                    }
                } else {
                    jy51Var = new jy51(this, fbkVar);
                }
                Object obj27 = jy51Var.f117303a;
                int i47 = jy51Var.f117304b;
                if (i47 == 0) {
                    bga.m29073P(obj27);
                    ae50<YourLibraryContainsResponseEntity> ae50VarM98153o = ((YourLibraryContainsResponse) obj).m98153o();
                    boolean z6 = false;
                    if (!ae50VarM98153o.isEmpty()) {
                        for (YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity : ae50VarM98153o) {
                            if (yourLibraryContainsResponseEntity.m98156o() && wj50.m88271j(yourLibraryContainsResponseEntity.getUri(), this.f252566c)) {
                                z6 = true;
                            }
                        }
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z6);
                    jy51Var.f117304b = 1;
                    Object objEmit23 = this.f252565b.emit(boolValueOf4, jy51Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof aq71) {
                    aq71Var = (aq71) fbkVar;
                    int i48 = aq71Var.f18130b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        aq71Var.f18130b = i48 - Integer.MIN_VALUE;
                    } else {
                        aq71Var = new aq71(this, fbkVar);
                    }
                } else {
                    aq71Var = new aq71(this, fbkVar);
                }
                Object obj28 = aq71Var.f18129a;
                int i49 = aq71Var.f18130b;
                if (i49 == 0) {
                    bga.m29073P(obj28);
                    PlayerState playerState4 = (PlayerState) obj;
                    wj50.m88279p(playerState4);
                    ContextTrack contextTrack3 = (ContextTrack) playerState4.track().mo49283h();
                    String str9 = (contextTrack3 != null && wj50.m88271j(contextTrack3.uri(), this.f252566c)) ? (String) playerState4.playbackId().mo49283h() : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    aq71Var.f18130b = 1;
                    Object objEmit24 = this.f252565b.emit(str9, aq71Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof zx71) {
                    zx71Var = (zx71) fbkVar;
                    int i50 = zx71Var.f287235b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        zx71Var.f287235b = i50 - Integer.MIN_VALUE;
                    } else {
                        zx71Var = new zx71(this, fbkVar);
                    }
                } else {
                    zx71Var = new zx71(this, fbkVar);
                }
                Object obj29 = zx71Var.f287234a;
                int i51 = zx71Var.f287235b;
                if (i51 == 0) {
                    bga.m29073P(obj29);
                    ktx ktxVar2 = ((gqx) obj).mo45449a(xaw.class, this.f252566c).f72301b;
                    wj50.m88279p(ktxVar2);
                    zx71Var.f287235b = 1;
                    Object objEmit25 = this.f252565b.emit(ktxVar2, zx71Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof b781) {
                    b781Var = (b781) fbkVar;
                    int i52 = b781Var.f24185b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        b781Var.f24185b = i52 - Integer.MIN_VALUE;
                    } else {
                        b781Var = new b781(this, fbkVar);
                    }
                } else {
                    b781Var = new b781(this, fbkVar);
                }
                Object obj30 = b781Var.f24184a;
                int i53 = b781Var.f24185b;
                if (i53 == 0) {
                    bga.m29073P(obj30);
                    PlayerState playerState5 = (PlayerState) obj;
                    String str10 = this.f252566c;
                    boolean z7 = false;
                    if (str10 != null && playerState5.isPlaying()) {
                        if (wj50.m88271j(playerState5.contextUri(), str10)) {
                            z7 = true;
                        } else {
                            ContextTrack contextTrack4 = (ContextTrack) playerState5.track().mo49283h();
                            if (wj50.m88271j(contextTrack4 != null ? contextTrack4.uri() : null, str10)) {
                                z7 = true;
                            }
                        }
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z7);
                    b781Var.f24185b = 1;
                    Object objEmit26 = this.f252565b.emit(boolValueOf5, b781Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof rk81) {
                    rk81Var = (rk81) fbkVar;
                    int i54 = rk81Var.f200028b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        rk81Var.f200028b = i54 - Integer.MIN_VALUE;
                    } else {
                        rk81Var = new rk81(this, fbkVar);
                    }
                } else {
                    rk81Var = new rk81(this, fbkVar);
                }
                Object obj31 = rk81Var.f200027a;
                int i55 = rk81Var.f200028b;
                if (i55 == 0) {
                    bga.m29073P(obj31);
                    gqx gqxVar = (gqx) obj;
                    wj50.m88279p(gqxVar);
                    String str11 = this.f252566c;
                    erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str11).f72301b;
                    String str12 = (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a.f278475a.f198763a;
                    x430 x430Var = (x430) gqxVar.mo45449a(x430.class, str11).f72301b;
                    if (x430Var != null) {
                        String str13 = x430Var.f257968a;
                        if (wl51.m88460J0(str13)) {
                            pk81Var = new pk81(str12);
                        } else {
                            pk81Var = new ok81(str13, str12, x430Var.f257976i);
                        }
                    } else {
                        pk81Var = new pk81(str12);
                    }
                    rk81Var.f200028b = 1;
                    Object objEmit27 = this.f252565b.emit(pk81Var, rk81Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 27:
                return m88519b(obj, fbkVar);
            case 28:
                return m88520c(obj, fbkVar);
            default:
                PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                PlaybackSettingsEsperantoService$ContentSettingChange playbackSettingsEsperantoService$ContentSettingChangeM17613n = playbackSettingsEsperantoService$StreamSettingChange.m17613n();
                String str14 = null;
                if (wj50.m88271j(playbackSettingsEsperantoService$ContentSettingChangeM17613n != null ? playbackSettingsEsperantoService$ContentSettingChangeM17613n.m17559n() : null, this.f252566c)) {
                    PlaybackSettingsEsperantoService$ContentSettingChange playbackSettingsEsperantoService$ContentSettingChangeM17613n2 = playbackSettingsEsperantoService$StreamSettingChange.m17613n();
                    if (playbackSettingsEsperantoService$ContentSettingChangeM17613n2 != null && (strM17560p = playbackSettingsEsperantoService$ContentSettingChangeM17613n2.m17560p()) != null && strM17560p.length() != 0) {
                        str14 = strM17560p;
                    }
                    Object objEmit28 = this.f252565b.emit(str14, fbkVar);
                    if (objEmit28 == yuk.f276404a) {
                        return objEmit28;
                    }
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ wli0(niz nizVar, Object obj, String str, int i) {
        this.f252564a = i;
        this.f252565b = nizVar;
        this.f252566c = str;
    }

    public /* synthetic */ wli0(niz nizVar, String str, int i) {
        this.f252564a = i;
        this.f252565b = nizVar;
        this.f252566c = str;
    }
}
