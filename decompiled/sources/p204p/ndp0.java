package p204p;

import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class ndp0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f152821b;

    public /* synthetic */ ndp0(niz nizVar, int i) {
        this.f152820a = i;
        this.f152821b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:134:0x0221  */
    /* JADX WARN: Code duplicated, block: B:151:0x026b  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:192:0x030f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0357  */
    /* JADX WARN: Code duplicated, block: B:226:0x039b  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:260:0x0425  */
    /* JADX WARN: Code duplicated, block: B:277:0x0469  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:315:0x0510  */
    /* JADX WARN: Code duplicated, block: B:332:0x055b  */
    /* JADX WARN: Code duplicated, block: B:349:0x059f  */
    /* JADX WARN: Code duplicated, block: B:366:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:388:0x0640  */
    /* JADX WARN: Code duplicated, block: B:411:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:428:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:447:0x073a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:469:0x0797  */
    /* JADX WARN: Code duplicated, block: B:486:0x07de  */
    /* JADX WARN: Code duplicated, block: B:512:0x0869  */
    /* JADX WARN: Code duplicated, block: B:529:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:546:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        mdp0 mdp0Var;
        yfp0 yfp0Var;
        lgp0 lgp0Var;
        ihp0 ihp0Var;
        thp0 thp0Var;
        oip0 oip0Var;
        zip0 zip0Var;
        wlp0 wlp0Var;
        xlp0 xlp0Var;
        snp0 snp0Var;
        crp0 crp0Var;
        ywp0 ywp0Var;
        bxp0 bxp0Var;
        cxp0 cxp0Var;
        dxp0 dxp0Var;
        kxp0 kxp0Var;
        lxp0 lxp0Var;
        oxp0 oxp0Var;
        pxp0 pxp0Var;
        qxp0 qxp0Var;
        m5q0 m5q0Var;
        x9q0 x9q0Var;
        faq0 faq0Var;
        deq0 deq0Var;
        eeq0 eeq0Var;
        yhq0 yhq0Var;
        piq0 piq0Var;
        qiq0 qiq0Var;
        n5r0 n5r0Var;
        o5r0 o5r0Var;
        bar0 bar0Var;
        switch (this.f152820a) {
            case 0:
                if (fbkVar instanceof mdp0) {
                    mdp0Var = (mdp0) fbkVar;
                    int i = mdp0Var.f142465b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mdp0Var.f142465b = i - Integer.MIN_VALUE;
                    } else {
                        mdp0Var = new mdp0(this, fbkVar);
                    }
                } else {
                    mdp0Var = new mdp0(this, fbkVar);
                }
                Object obj2 = mdp0Var.f142464a;
                int i2 = mdp0Var.f142465b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    if (((PlayerError) obj).error() == ErrorType.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED) {
                        mdp0Var.f142465b = 1;
                        Object objEmit = this.f152821b.emit(obj, mdp0Var);
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
                if (fbkVar instanceof yfp0) {
                    yfp0Var = (yfp0) fbkVar;
                    int i3 = yfp0Var.f272309b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yfp0Var.f272309b = i3 - Integer.MIN_VALUE;
                    } else {
                        yfp0Var = new yfp0(this, fbkVar);
                    }
                } else {
                    yfp0Var = new yfp0(this, fbkVar);
                }
                Object obj3 = yfp0Var.f272308a;
                int i4 = yfp0Var.f272309b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(!((String) obj).equals("DISABLED_CANNOT_ENABLE"));
                    yfp0Var.f272309b = 1;
                    Object objEmit2 = this.f152821b.emit(boolValueOf, yfp0Var);
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
                if (fbkVar instanceof lgp0) {
                    lgp0Var = (lgp0) fbkVar;
                    int i5 = lgp0Var.f133259b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lgp0Var.f133259b = i5 - Integer.MIN_VALUE;
                    } else {
                        lgp0Var = new lgp0(this, fbkVar);
                    }
                } else {
                    lgp0Var = new lgp0(this, fbkVar);
                }
                Object obj4 = lgp0Var.f133258a;
                int i6 = lgp0Var.f133259b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    ump0 ump0Var = new ump0(null, null, false, null);
                    lgp0Var.f133259b = 1;
                    Object objEmit3 = this.f152821b.emit(ump0Var, lgp0Var);
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
                if (fbkVar instanceof ihp0) {
                    ihp0Var = (ihp0) fbkVar;
                    int i7 = ihp0Var.f102343b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ihp0Var.f102343b = i7 - Integer.MIN_VALUE;
                    } else {
                        ihp0Var = new ihp0(this, fbkVar);
                    }
                } else {
                    ihp0Var = new ihp0(this, fbkVar);
                }
                Object obj5 = ihp0Var.f102342a;
                int i8 = ihp0Var.f102343b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    qho qhoVar = (qho) obj;
                    qhoVar.getClass();
                    if (qhoVar instanceof oho) {
                        vfe0 vfe0Var = (vfe0) vie1.m85619a(qhoVar);
                        List<dx80> list = vfe0Var.f240969a;
                        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                        for (dx80 dx80Var : list) {
                            arrayList.add(new cip0(dx80Var.f53899c, dx80Var.f53897a));
                        }
                        hz80 hz80Var = vfe0Var.f240970b;
                        thp0Var = new thp0(hz80Var.f96825a, arrayList, hz80Var.f96834t.f156638b);
                    } else {
                        thp0Var = null;
                    }
                    if (thp0Var != null) {
                        ihp0Var.f102343b = 1;
                        Object objEmit4 = this.f152821b.emit(thp0Var, ihp0Var);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit4 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof oip0) {
                    oip0Var = (oip0) fbkVar;
                    int i9 = oip0Var.f165858b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        oip0Var.f165858b = i9 - Integer.MIN_VALUE;
                    } else {
                        oip0Var = new oip0(this, fbkVar);
                    }
                } else {
                    oip0Var = new oip0(this, fbkVar);
                }
                Object obj6 = oip0Var.f165857a;
                int i10 = oip0Var.f165858b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    f4m f4mVar = new f4m((Map) obj);
                    oip0Var.f165858b = 1;
                    Object objEmit5 = this.f152821b.emit(f4mVar, oip0Var);
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
                if (fbkVar instanceof zip0) {
                    zip0Var = (zip0) fbkVar;
                    int i11 = zip0Var.f283220b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        zip0Var.f283220b = i11 - Integer.MIN_VALUE;
                    } else {
                        zip0Var = new zip0(this, fbkVar);
                    }
                } else {
                    zip0Var = new zip0(this, fbkVar);
                }
                Object obj7 = zip0Var.f283219a;
                int i12 = zip0Var.f283220b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PlaylistGetResponse playlistGetResponseM97672s = PlaylistGetResponse.m97672s(bArr);
                        zip0Var.f283220b = 1;
                        Object objEmit6 = this.f152821b.emit(playlistGetResponseM97672s, zip0Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistGetResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof wlp0) {
                    wlp0Var = (wlp0) fbkVar;
                    int i13 = wlp0Var.f252597b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wlp0Var.f252597b = i13 - Integer.MIN_VALUE;
                    } else {
                        wlp0Var = new wlp0(this, fbkVar);
                    }
                } else {
                    wlp0Var = new wlp0(this, fbkVar);
                }
                Object obj8 = wlp0Var.f252596a;
                int i14 = wlp0Var.f252597b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    if (((p2x0) obj).m68970c() != null) {
                        wlp0Var.f252597b = 1;
                        Object objEmit7 = this.f152821b.emit(obj, wlp0Var);
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
                if (fbkVar instanceof xlp0) {
                    xlp0Var = (xlp0) fbkVar;
                    int i15 = xlp0Var.f263221b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        xlp0Var.f263221b = i15 - Integer.MIN_VALUE;
                    } else {
                        xlp0Var = new xlp0(this, fbkVar);
                    }
                } else {
                    xlp0Var = new xlp0(this, fbkVar);
                }
                Object obj9 = xlp0Var.f263220a;
                int i16 = xlp0Var.f263221b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    vlp0 vlp0Var = new vlp0((nw80) ((p2x0) obj).m68970c());
                    xlp0Var.f263221b = 1;
                    Object objEmit8 = this.f152821b.emit(vlp0Var, xlp0Var);
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
                if (fbkVar instanceof snp0) {
                    snp0Var = (snp0) fbkVar;
                    int i17 = snp0Var.f210979b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        snp0Var.f210979b = i17 - Integer.MIN_VALUE;
                    } else {
                        snp0Var = new snp0(this, fbkVar);
                    }
                } else {
                    snp0Var = new snp0(this, fbkVar);
                }
                Object obj10 = snp0Var.f210978a;
                int i18 = snp0Var.f210979b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    List list2 = ((kfe0) obj).f122153f;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj11 : list2) {
                        if (((i8e0) obj11).f99769f == lnn0.f135187f) {
                            arrayList2.add(obj11);
                        }
                    }
                    snp0Var.f210979b = 1;
                    Object objEmit9 = this.f152821b.emit(arrayList2, snp0Var);
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
                if (fbkVar instanceof crp0) {
                    crp0Var = (crp0) fbkVar;
                    int i19 = crp0Var.f41340b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        crp0Var.f41340b = i19 - Integer.MIN_VALUE;
                    } else {
                        crp0Var = new crp0(this, fbkVar);
                    }
                } else {
                    crp0Var = new crp0(this, fbkVar);
                }
                Object obj12 = crp0Var.f41339a;
                int i20 = crp0Var.f41340b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        PlaylistMembersResponse playlistMembersResponseM97686p = PlaylistMembersResponse.m97686p(bArr2);
                        crp0Var.f41340b = 1;
                        Object objEmit10 = this.f152821b.emit(playlistMembersResponseM97686p, crp0Var);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit10 == yukVar10) {
                            return yukVar10;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistMembersResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof ywp0) {
                    ywp0Var = (ywp0) fbkVar;
                    int i21 = ywp0Var.f277023b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ywp0Var.f277023b = i21 - Integer.MIN_VALUE;
                    } else {
                        ywp0Var = new ywp0(this, fbkVar);
                    }
                } else {
                    ywp0Var = new ywp0(this, fbkVar);
                }
                Object obj13 = ywp0Var.f277022a;
                int i22 = ywp0Var.f277023b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    Integer num = ((y591) obj).f269379a;
                    ywp0Var.f277023b = 1;
                    Object objEmit11 = this.f152821b.emit(num, ywp0Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof bxp0) {
                    bxp0Var = (bxp0) fbkVar;
                    int i23 = bxp0Var.f31938b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        bxp0Var.f31938b = i23 - Integer.MIN_VALUE;
                    } else {
                        bxp0Var = new bxp0(this, fbkVar);
                    }
                } else {
                    bxp0Var = new bxp0(this, fbkVar);
                }
                Object obj14 = bxp0Var.f31937a;
                int i24 = bxp0Var.f31938b;
                if (i24 == 0) {
                    bga.m29073P(obj14);
                    ArrayList arrayList3 = ((y591) obj).f269380b;
                    bxp0Var.f31938b = 1;
                    Object objEmit12 = this.f152821b.emit(arrayList3, bxp0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof cxp0) {
                    cxp0Var = (cxp0) fbkVar;
                    int i25 = cxp0Var.f43077b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cxp0Var.f43077b = i25 - Integer.MIN_VALUE;
                    } else {
                        cxp0Var = new cxp0(this, fbkVar);
                    }
                } else {
                    cxp0Var = new cxp0(this, fbkVar);
                }
                Object obj15 = cxp0Var.f43076a;
                int i26 = cxp0Var.f43077b;
                if (i26 == 0) {
                    bga.m29073P(obj15);
                    Integer num2 = new Integer(((List) obj).size());
                    cxp0Var.f43077b = 1;
                    Object objEmit13 = this.f152821b.emit(num2, cxp0Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof dxp0) {
                    dxp0Var = (dxp0) fbkVar;
                    int i27 = dxp0Var.f54041b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        dxp0Var.f54041b = i27 - Integer.MIN_VALUE;
                    } else {
                        dxp0Var = new dxp0(this, fbkVar);
                    }
                } else {
                    dxp0Var = new dxp0(this, fbkVar);
                }
                Object obj16 = dxp0Var.f54040a;
                int i28 = dxp0Var.f54041b;
                if (i28 == 0) {
                    bga.m29073P(obj16);
                    List list3 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((vdf0) it.next()).f240405b);
                    }
                    dxp0Var.f54041b = 1;
                    Object objEmit14 = this.f152821b.emit(arrayList4, dxp0Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof kxp0) {
                    kxp0Var = (kxp0) fbkVar;
                    int i29 = kxp0Var.f127531b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        kxp0Var.f127531b = i29 - Integer.MIN_VALUE;
                    } else {
                        kxp0Var = new kxp0(this, fbkVar);
                    }
                } else {
                    kxp0Var = new kxp0(this, fbkVar);
                }
                Object obj17 = kxp0Var.f127530a;
                int i30 = kxp0Var.f127531b;
                if (i30 == 0) {
                    bga.m29073P(obj17);
                    Object obj18 = ((wwp0) obj).f255809b;
                    kxp0Var.f127531b = 1;
                    Object objEmit15 = this.f152821b.emit(obj18, kxp0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof lxp0) {
                    lxp0Var = (lxp0) fbkVar;
                    int i31 = lxp0Var.f137859b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        lxp0Var.f137859b = i31 - Integer.MIN_VALUE;
                    } else {
                        lxp0Var = new lxp0(this, fbkVar);
                    }
                } else {
                    lxp0Var = new lxp0(this, fbkVar);
                }
                Object obj19 = lxp0Var.f137858a;
                int i32 = lxp0Var.f137859b;
                if (i32 == 0) {
                    bga.m29073P(obj19);
                    Object obj20 = ((wwp0) obj).f255809b;
                    lxp0Var.f137859b = 1;
                    Object objEmit16 = this.f152821b.emit(obj20, lxp0Var);
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
                if (fbkVar instanceof oxp0) {
                    oxp0Var = (oxp0) fbkVar;
                    int i33 = oxp0Var.f171485b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        oxp0Var.f171485b = i33 - Integer.MIN_VALUE;
                    } else {
                        oxp0Var = new oxp0(this, fbkVar);
                    }
                } else {
                    oxp0Var = new oxp0(this, fbkVar);
                }
                Object obj21 = oxp0Var.f171484a;
                int i34 = oxp0Var.f171485b;
                if (i34 == 0) {
                    bga.m29073P(obj21);
                    Object obj22 = ((wwp0) obj).f255808a;
                    oxp0Var.f171485b = 1;
                    Object objEmit17 = this.f152821b.emit(obj22, oxp0Var);
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
                if (fbkVar instanceof pxp0) {
                    pxp0Var = (pxp0) fbkVar;
                    int i35 = pxp0Var.f183153b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        pxp0Var.f183153b = i35 - Integer.MIN_VALUE;
                    } else {
                        pxp0Var = new pxp0(this, fbkVar);
                    }
                } else {
                    pxp0Var = new pxp0(this, fbkVar);
                }
                Object obj23 = pxp0Var.f183152a;
                int i36 = pxp0Var.f183153b;
                if (i36 == 0) {
                    bga.m29073P(obj23);
                    Object objM43745s0 = g6f.m43745s0((List) obj);
                    pxp0Var.f183153b = 1;
                    Object objEmit18 = this.f152821b.emit(objM43745s0, pxp0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof qxp0) {
                    qxp0Var = (qxp0) fbkVar;
                    int i37 = qxp0Var.f193724b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        qxp0Var.f193724b = i37 - Integer.MIN_VALUE;
                    } else {
                        qxp0Var = new qxp0(this, fbkVar);
                    }
                } else {
                    qxp0Var = new qxp0(this, fbkVar);
                }
                Object obj24 = qxp0Var.f193723a;
                int i38 = qxp0Var.f193724b;
                if (i38 == 0) {
                    bga.m29073P(obj24);
                    Object obj25 = ((wwp0) obj).f255808a;
                    qxp0Var.f193724b = 1;
                    Object objEmit19 = this.f152821b.emit(obj25, qxp0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof m5q0) {
                    m5q0Var = (m5q0) fbkVar;
                    int i39 = m5q0Var.f140278b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        m5q0Var.f140278b = i39 - Integer.MIN_VALUE;
                    } else {
                        m5q0Var = new m5q0(this, fbkVar);
                    }
                } else {
                    m5q0Var = new m5q0(this, fbkVar);
                }
                Object obj26 = m5q0Var.f140277a;
                int i40 = m5q0Var.f140278b;
                if (i40 == 0) {
                    bga.m29073P(obj26);
                    yql0 yql0VarM63750b = n5q0.m63750b(((k5q0) obj).f119563a);
                    m5q0Var.f140278b = 1;
                    Object objEmit20 = this.f152821b.emit(yql0VarM63750b, m5q0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof x9q0) {
                    x9q0Var = (x9q0) fbkVar;
                    int i41 = x9q0Var.f259424b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        x9q0Var.f259424b = i41 - Integer.MIN_VALUE;
                    } else {
                        x9q0Var = new x9q0(this, fbkVar);
                    }
                } else {
                    x9q0Var = new x9q0(this, fbkVar);
                }
                Object obj27 = x9q0Var.f259423a;
                int i42 = x9q0Var.f259424b;
                if (i42 == 0) {
                    bga.m29073P(obj27);
                    bzv0 bzv0Var = (bzv0) ((ty80) obj).f224877f.f271279x.mo30169a(bzv0.class);
                    Boolean boolValueOf2 = Boolean.valueOf((bzv0Var != null ? bzv0Var.f32603a : null) != null);
                    x9q0Var.f259424b = 1;
                    Object objEmit21 = this.f152821b.emit(boolValueOf2, x9q0Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof faq0) {
                    faq0Var = (faq0) fbkVar;
                    int i43 = faq0Var.f67621b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        faq0Var.f67621b = i43 - Integer.MIN_VALUE;
                    } else {
                        faq0Var = new faq0(this, fbkVar);
                    }
                } else {
                    faq0Var = new faq0(this, fbkVar);
                }
                Object obj28 = faq0Var.f67620a;
                int i44 = faq0Var.f67621b;
                if (i44 == 0) {
                    bga.m29073P(obj28);
                    caq0 caq0Var = new caq0((String) obj);
                    faq0Var.f67621b = 1;
                    Object objEmit22 = this.f152821b.emit(caq0Var, faq0Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof deq0) {
                    deq0Var = (deq0) fbkVar;
                    int i45 = deq0Var.f48157b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        deq0Var.f48157b = i45 - Integer.MIN_VALUE;
                    } else {
                        deq0Var = new deq0(this, fbkVar);
                    }
                } else {
                    deq0Var = new deq0(this, fbkVar);
                }
                Object obj29 = deq0Var.f48156a;
                int i46 = deq0Var.f48157b;
                if (i46 == 0) {
                    bga.m29073P(obj29);
                    Map map = (Map) obj;
                    wj50.m88279p(map);
                    leq0 leq0Var = new leq0(map);
                    deq0Var.f48157b = 1;
                    Object objEmit23 = this.f152821b.emit(leq0Var, deq0Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof eeq0) {
                    eeq0Var = (eeq0) fbkVar;
                    int i47 = eeq0Var.f58838b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        eeq0Var.f58838b = i47 - Integer.MIN_VALUE;
                    } else {
                        eeq0Var = new eeq0(this, fbkVar);
                    }
                } else {
                    eeq0Var = new eeq0(this, fbkVar);
                }
                Object obj30 = eeq0Var.f58837a;
                int i48 = eeq0Var.f58838b;
                if (i48 == 0) {
                    bga.m29073P(obj30);
                    Map map2 = (Map) obj;
                    wj50.m88279p(map2);
                    meq0 meq0Var = new meq0(map2);
                    eeq0Var.f58838b = 1;
                    Object objEmit24 = this.f152821b.emit(meq0Var, eeq0Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit24 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof yhq0) {
                    yhq0Var = (yhq0) fbkVar;
                    int i49 = yhq0Var.f272951b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        yhq0Var.f272951b = i49 - Integer.MIN_VALUE;
                    } else {
                        yhq0Var = new yhq0(this, fbkVar);
                    }
                } else {
                    yhq0Var = new yhq0(this, fbkVar);
                }
                Object obj31 = yhq0Var.f272950a;
                int i50 = yhq0Var.f272951b;
                if (i50 == 0) {
                    bga.m29073P(obj31);
                    a1l a1lVar = new a1l(((Boolean) obj).booleanValue());
                    yhq0Var.f272951b = 1;
                    Object objEmit25 = this.f152821b.emit(a1lVar, yhq0Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof piq0) {
                    piq0Var = (piq0) fbkVar;
                    int i51 = piq0Var.f178004b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        piq0Var.f178004b = i51 - Integer.MIN_VALUE;
                    } else {
                        piq0Var = new piq0(this, fbkVar);
                    }
                } else {
                    piq0Var = new piq0(this, fbkVar);
                }
                Object obj32 = piq0Var.f178003a;
                int i52 = piq0Var.f178004b;
                if (i52 == 0) {
                    bga.m29073P(obj32);
                    Boolean boolValueOf3 = Boolean.valueOf(dxf1.m37249y((Map) obj));
                    piq0Var.f178004b = 1;
                    Object objEmit26 = this.f152821b.emit(boolValueOf3, piq0Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof qiq0) {
                    qiq0Var = (qiq0) fbkVar;
                    int i53 = qiq0Var.f189055b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        qiq0Var.f189055b = i53 - Integer.MIN_VALUE;
                    } else {
                        qiq0Var = new qiq0(this, fbkVar);
                    }
                } else {
                    qiq0Var = new qiq0(this, fbkVar);
                }
                Object obj33 = qiq0Var.f189054a;
                int i54 = qiq0Var.f189055b;
                if (i54 == 0) {
                    bga.m29073P(obj33);
                    Boolean boolValueOf4 = Boolean.valueOf(((mna0) obj) != null);
                    qiq0Var.f189055b = 1;
                    Object objEmit27 = this.f152821b.emit(boolValueOf4, qiq0Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof n5r0) {
                    n5r0Var = (n5r0) fbkVar;
                    int i55 = n5r0Var.f150605b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        n5r0Var.f150605b = i55 - Integer.MIN_VALUE;
                    } else {
                        n5r0Var = new n5r0(this, fbkVar);
                    }
                } else {
                    n5r0Var = new n5r0(this, fbkVar);
                }
                Object obj34 = n5r0Var.f150604a;
                int i56 = n5r0Var.f150605b;
                if (i56 == 0) {
                    bga.m29073P(obj34);
                    knm0 knm0VarM55913d = kaz.m55913d(((Boolean) obj).booleanValue());
                    n5r0Var.f150605b = 1;
                    Object objEmit28 = this.f152821b.emit(knm0VarM55913d, n5r0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof o5r0) {
                    o5r0Var = (o5r0) fbkVar;
                    int i57 = o5r0Var.f162057b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        o5r0Var.f162057b = i57 - Integer.MIN_VALUE;
                    } else {
                        o5r0Var = new o5r0(this, fbkVar);
                    }
                } else {
                    o5r0Var = new o5r0(this, fbkVar);
                }
                Object obj35 = o5r0Var.f162056a;
                int i58 = o5r0Var.f162057b;
                if (i58 == 0) {
                    bga.m29073P(obj35);
                    Boolean boolValueOf5 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67753d));
                    o5r0Var.f162057b = 1;
                    Object objEmit29 = this.f152821b.emit(boolValueOf5, o5r0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof bar0) {
                    bar0Var = (bar0) fbkVar;
                    int i59 = bar0Var.f25272b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        bar0Var.f25272b = i59 - Integer.MIN_VALUE;
                    } else {
                        bar0Var = new bar0(this, fbkVar);
                    }
                } else {
                    bar0Var = new bar0(this, fbkVar);
                }
                Object obj36 = bar0Var.f25271a;
                int i60 = bar0Var.f25272b;
                if (i60 == 0) {
                    bga.m29073P(obj36);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        bar0Var.f25272b = 1;
                        Object objEmit30 = this.f152821b.emit(obj, bar0Var);
                        yuk yukVar30 = yuk.f276404a;
                        if (objEmit30 == yukVar30) {
                            return yukVar30;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj36);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ ndp0(niz nizVar, Object obj, int i) {
        this.f152820a = i;
        this.f152821b = nizVar;
    }
}
