package p204p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.base.java.logging.Logger;
import com.spotify.decipher.agent.p057v1.AgentMessage;
import com.spotify.music.R;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$UserSettingChange;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class hql implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f94219b;

    public /* synthetic */ hql(niz nizVar, int i) {
        this.f94218a = i;
        this.f94219b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x0206  */
    /* JADX WARN: Code duplicated, block: B:172:0x02be  */
    /* JADX WARN: Code duplicated, block: B:189:0x030a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0368  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0436  */
    /* JADX WARN: Code duplicated, block: B:282:0x049a  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:329:0x0547  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:350:0x0593  */
    /* JADX WARN: Code duplicated, block: B:373:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:392:0x062c  */
    /* JADX WARN: Code duplicated, block: B:409:0x0673  */
    /* JADX WARN: Code duplicated, block: B:439:0x071b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:458:0x0764  */
    /* JADX WARN: Code duplicated, block: B:475:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:492:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:540:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:567:0x0942  */
    /* JADX WARN: Code duplicated, block: B:588:0x0993  */
    /* JADX WARN: Code duplicated, block: B:605:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:650:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        gql gqlVar;
        iql iqlVar;
        gvl gvlVar;
        yvl yvlVar;
        zvl zvlVar;
        awl awlVar;
        azl azlVar;
        czl czlVar;
        String str;
        String str2;
        h4m h4mVar;
        a6m a6mVar;
        h6m h6mVar;
        i6m i6mVar;
        n6m n6mVar;
        e7m e7mVar;
        r7m r7mVar;
        n8m n8mVar;
        r8m r8mVar;
        String strUri;
        rgo rgoVar;
        bio bioVar;
        yio yioVar;
        Object objEmit;
        moo mooVar;
        iqo iqoVar;
        wso wsoVar;
        yuo yuoVar;
        hvo hvoVar;
        ivo ivoVar;
        jvo jvoVar;
        nvo nvoVar;
        tvo tvoVar;
        uvo uvoVar;
        sck0 sck0Var;
        switch (this.f94218a) {
            case 0:
                if (fbkVar instanceof gql) {
                    gqlVar = (gql) fbkVar;
                    int i = gqlVar.f83491b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gqlVar.f83491b = i - Integer.MIN_VALUE;
                    } else {
                        gqlVar = new gql(this, fbkVar);
                    }
                } else {
                    gqlVar = new gql(this, fbkVar);
                }
                Object obj2 = gqlVar.f83490a;
                int i2 = gqlVar.f83491b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    String str3 = ((e301) obj).f55571a;
                    gqlVar.f83491b = 1;
                    Object objEmit2 = this.f94219b.emit(str3, gqlVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit2 == yukVar) {
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
                if (fbkVar instanceof iql) {
                    iqlVar = (iql) fbkVar;
                    int i3 = iqlVar.f104800b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iqlVar.f104800b = i3 - Integer.MIN_VALUE;
                    } else {
                        iqlVar = new iql(this, fbkVar);
                    }
                } else {
                    iqlVar = new iql(this, fbkVar);
                }
                Object obj3 = iqlVar.f104799a;
                int i4 = iqlVar.f104800b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    yjb yjbVar = (yjb) obj;
                    wjb wjbVar = yjbVar instanceof wjb ? (wjb) yjbVar : null;
                    Object obj4 = wjbVar != null ? wjbVar.f251924a : lau.f131415a;
                    iqlVar.f104800b = 1;
                    Object objEmit3 = this.f94219b.emit(obj4, iqlVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit3 == yukVar2) {
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
                if (fbkVar instanceof gvl) {
                    gvlVar = (gvl) fbkVar;
                    int i5 = gvlVar.f84778b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        gvlVar.f84778b = i5 - Integer.MIN_VALUE;
                    } else {
                        gvlVar = new gvl(this, fbkVar);
                    }
                } else {
                    gvlVar = new gvl(this, fbkVar);
                }
                Object obj5 = gvlVar.f84777a;
                int i6 = gvlVar.f84778b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    pe01 pe01Var = (pe01) obj;
                    Integer num = new Integer(pe01Var.f176596m ? pe01Var.f176597n : 0);
                    gvlVar.f84778b = 1;
                    Object objEmit4 = this.f94219b.emit(num, gvlVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit4 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof yvl) {
                    yvlVar = (yvl) fbkVar;
                    int i7 = yvlVar.f276696b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        yvlVar.f276696b = i7 - Integer.MIN_VALUE;
                    } else {
                        yvlVar = new yvl(this, fbkVar);
                    }
                } else {
                    yvlVar = new yvl(this, fbkVar);
                }
                Object obj6 = yvlVar.f276695a;
                int i8 = yvlVar.f276696b;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    ed01 ed01Var = new ed01(new Integer(((Number) obj).intValue()));
                    yvlVar.f276696b = 1;
                    Object objEmit5 = this.f94219b.emit(ed01Var, yvlVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit5 == yukVar4) {
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
                if (fbkVar instanceof zvl) {
                    zvlVar = (zvl) fbkVar;
                    int i9 = zvlVar.f286738b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zvlVar.f286738b = i9 - Integer.MIN_VALUE;
                    } else {
                        zvlVar = new zvl(this, fbkVar);
                    }
                } else {
                    zvlVar = new zvl(this, fbkVar);
                }
                Object obj7 = zvlVar.f286737a;
                int i10 = zvlVar.f286738b;
                if (i10 == 0) {
                    bga.m29073P(obj7);
                    wvl wvlVar = (wvl) obj;
                    Integer num2 = new Integer(wvlVar.f255522a ? wvlVar.f255523b / 1000 : 0);
                    zvlVar.f286738b = 1;
                    Object objEmit6 = this.f94219b.emit(num2, zvlVar);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit6 == yukVar5) {
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
                if (fbkVar instanceof awl) {
                    awlVar = (awl) fbkVar;
                    int i11 = awlVar.f20549b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        awlVar.f20549b = i11 - Integer.MIN_VALUE;
                    } else {
                        awlVar = new awl(this, fbkVar);
                    }
                } else {
                    awlVar = new awl(this, fbkVar);
                }
                Object obj8 = awlVar.f20548a;
                int i12 = awlVar.f20549b;
                if (i12 == 0) {
                    bga.m29073P(obj8);
                    PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                    Object uvlVar = null;
                    if (playbackSettingsEsperantoService$StreamSettingChange.m17615p()) {
                        PlaybackSettingsEsperantoService$UserSettingChange playbackSettingsEsperantoService$UserSettingChangeM17614o = playbackSettingsEsperantoService$StreamSettingChange.m17614o();
                        if (playbackSettingsEsperantoService$UserSettingChangeM17614o.m17625t()) {
                            uvlVar = new tvl(playbackSettingsEsperantoService$UserSettingChangeM17614o.m17621o());
                        } else if (playbackSettingsEsperantoService$UserSettingChangeM17614o.m17626u()) {
                            uvlVar = new uvl(playbackSettingsEsperantoService$UserSettingChangeM17614o.m17622p());
                        }
                    }
                    if (uvlVar != null) {
                        awlVar.f20549b = 1;
                        Object objEmit7 = this.f94219b.emit(uvlVar, awlVar);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit7 == yukVar6) {
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
                if (fbkVar instanceof azl) {
                    azlVar = (azl) fbkVar;
                    int i13 = azlVar.f21641b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        azlVar.f21641b = i13 - Integer.MIN_VALUE;
                    } else {
                        azlVar = new azl(this, fbkVar);
                    }
                } else {
                    azlVar = new azl(this, fbkVar);
                }
                Object obj9 = azlVar.f21640a;
                int i14 = azlVar.f21641b;
                if (i14 == 0) {
                    bga.m29073P(obj9);
                    ewi ewiVar = (ewi) obj;
                    if (ewiVar instanceof vvi) {
                        ContextTrack contextTrack = ((vvi) ewiVar).f245236a;
                        String str4 = (String) contextTrack.metadata().get("tagline");
                        String str5 = str4 == null ? "" : str4;
                        String str6 = (String) contextTrack.metadata().get("secondaryTag");
                        String str7 = str6 == null ? "" : str6;
                        String str8 = (Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled")) && (str2 = (String) contextTrack.metadata().get("buttonMessage")) != null) ? str2 : "";
                        String strM38028y = e72.m38028y(contextTrack);
                        if (Format.VIDEO == null) {
                            throw null;
                        }
                        czlVar = new czl(str5, str7, str8, strM38028y, exb.m40212j(contextTrack, null), uqe1.m83769h(contextTrack));
                    } else {
                        if (!(ewiVar instanceof zvi)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zvi zviVar = (zvi) ewiVar;
                        ContextTrack contextTrack2 = zviVar.f286712a;
                        fh0 fh0Var = zviVar.f286713b;
                        String str9 = fh0Var.f69493Q0;
                        String str10 = fh0Var.f69494R0;
                        String str11 = fh0Var.f69492P0;
                        String strM38028y2 = e72.m38028y(contextTrack2);
                        if (fh0Var.f69504Z != Format.VIDEO || (str = fh0Var.f69495S0) == null) {
                            str = strM38028y2;
                        }
                        czlVar = new czl(str9, str10, str11, str, exb.m40212j(contextTrack2, fh0Var), uqe1.m83770i(fh0Var));
                    }
                    azlVar.f21641b = 1;
                    Object objEmit8 = this.f94219b.emit(czlVar, azlVar);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit8 == yukVar7) {
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
                if (fbkVar instanceof h4m) {
                    h4mVar = (h4m) fbkVar;
                    int i15 = h4mVar.f87563b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        h4mVar.f87563b = i15 - Integer.MIN_VALUE;
                    } else {
                        h4mVar = new h4m(this, fbkVar);
                    }
                } else {
                    h4mVar = new h4m(this, fbkVar);
                }
                Object obj10 = h4mVar.f87562a;
                int i16 = h4mVar.f87563b;
                if (i16 == 0) {
                    bga.m29073P(obj10);
                    g4m g4mVar = new g4m(((Boolean) obj).booleanValue());
                    h4mVar.f87563b = 1;
                    Object objEmit9 = this.f94219b.emit(g4mVar, h4mVar);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit9 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof a6m) {
                    a6mVar = (a6m) fbkVar;
                    int i17 = a6mVar.f12822b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        a6mVar.f12822b = i17 - Integer.MIN_VALUE;
                    } else {
                        a6mVar = new a6m(this, fbkVar);
                    }
                } else {
                    a6mVar = new a6m(this, fbkVar);
                }
                Object obj11 = a6mVar.f12821a;
                int i18 = a6mVar.f12822b;
                if (i18 == 0) {
                    bga.m29073P(obj11);
                    np10 np10Var = new np10((Set) obj);
                    a6mVar.f12822b = 1;
                    Object objEmit10 = this.f94219b.emit(np10Var, a6mVar);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit10 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof h6m) {
                    h6mVar = (h6m) fbkVar;
                    int i19 = h6mVar.f88192b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        h6mVar.f88192b = i19 - Integer.MIN_VALUE;
                    } else {
                        h6mVar = new h6m(this, fbkVar);
                    }
                } else {
                    h6mVar = new h6m(this, fbkVar);
                }
                Object obj12 = h6mVar.f88191a;
                int i20 = h6mVar.f88192b;
                if (i20 == 0) {
                    bga.m29073P(obj12);
                    if (!((Map) obj).isEmpty()) {
                        h6mVar.f88192b = 1;
                        Object objEmit11 = this.f94219b.emit(obj, h6mVar);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit11 == yukVar10) {
                            return yukVar10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof i6m) {
                    i6mVar = (i6m) fbkVar;
                    int i21 = i6mVar.f99291b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        i6mVar.f99291b = i21 - Integer.MIN_VALUE;
                    } else {
                        i6mVar = new i6m(this, fbkVar);
                    }
                } else {
                    i6mVar = new i6m(this, fbkVar);
                }
                Object obj13 = i6mVar.f99290a;
                int i22 = i6mVar.f99291b;
                if (i22 == 0) {
                    bga.m29073P(obj13);
                    z4m z4mVar = (z4m) obj;
                    Set set = z4mVar.f279298c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj14 : set) {
                        if (z4mVar.f279299d.contains((String) obj14)) {
                            arrayList.add(obj14);
                        }
                    }
                    int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj15 : arrayList) {
                        String str12 = (String) obj15;
                        linkedHashMap.put(obj15, new ojo(new uu41(z4mVar.f279296a.contains(str12), z4mVar.f279297b.contains(str12))));
                    }
                    i6mVar.f99291b = 1;
                    Object objEmit12 = this.f94219b.emit(linkedHashMap, i6mVar);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit12 == yukVar11) {
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
                if (fbkVar instanceof n6m) {
                    n6mVar = (n6m) fbkVar;
                    int i23 = n6mVar.f150926b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        n6mVar.f150926b = i23 - Integer.MIN_VALUE;
                    } else {
                        n6mVar = new n6m(this, fbkVar);
                    }
                } else {
                    n6mVar = new n6m(this, fbkVar);
                }
                Object obj16 = n6mVar.f150925a;
                int i24 = n6mVar.f150926b;
                if (i24 == 0) {
                    bga.m29073P(obj16);
                    np10 np10Var2 = new np10((Set) obj);
                    n6mVar.f150926b = 1;
                    Object objEmit13 = this.f94219b.emit(np10Var2, n6mVar);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit13 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof e7m) {
                    e7mVar = (e7m) fbkVar;
                    int i25 = e7mVar.f56957b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        e7mVar.f56957b = i25 - Integer.MIN_VALUE;
                    } else {
                        e7mVar = new e7m(this, fbkVar);
                    }
                } else {
                    e7mVar = new e7m(this, fbkVar);
                }
                Object obj17 = e7mVar.f56956a;
                int i26 = e7mVar.f56957b;
                if (i26 == 0) {
                    bga.m29073P(obj17);
                    if (((String) obj).length() > 0) {
                        e7mVar.f56957b = 1;
                        Object objEmit14 = this.f94219b.emit(obj, e7mVar);
                        yuk yukVar13 = yuk.f276404a;
                        if (objEmit14 == yukVar13) {
                            return yukVar13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof r7m) {
                    r7mVar = (r7m) fbkVar;
                    int i27 = r7mVar.f196606b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        r7mVar.f196606b = i27 - Integer.MIN_VALUE;
                    } else {
                        r7mVar = new r7m(this, fbkVar);
                    }
                } else {
                    r7mVar = new r7m(this, fbkVar);
                }
                Object obj18 = r7mVar.f196605a;
                int i28 = r7mVar.f196606b;
                if (i28 == 0) {
                    bga.m29073P(obj18);
                    by50 by50Var = (by50) obj;
                    String str13 = by50Var != null ? by50Var.f32075a : null;
                    qx50 qx50Var = str13 != null ? new qx50(str13) : null;
                    r7mVar.f196606b = 1;
                    Object objEmit15 = this.f94219b.emit(qx50Var, r7mVar);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit15 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof n8m) {
                    n8mVar = (n8m) fbkVar;
                    int i29 = n8mVar.f151561b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        n8mVar.f151561b = i29 - Integer.MIN_VALUE;
                    } else {
                        n8mVar = new n8m(this, fbkVar);
                    }
                } else {
                    n8mVar = new n8m(this, fbkVar);
                }
                Object obj19 = n8mVar.f151560a;
                int i30 = n8mVar.f151561b;
                if (i30 == 0) {
                    bga.m29073P(obj19);
                    e4a0 e4a0Var = (e4a0) obj;
                    vy81 vy81Var = e4a0Var instanceof d4a0 ? ((d4a0) e4a0Var).f45121a : null;
                    n8mVar.f151561b = 1;
                    Object objEmit16 = this.f94219b.emit(vy81Var, n8mVar);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit16 == yukVar15) {
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
                if (fbkVar instanceof r8m) {
                    r8mVar = (r8m) fbkVar;
                    int i31 = r8mVar.f196810b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        r8mVar.f196810b = i31 - Integer.MIN_VALUE;
                    } else {
                        r8mVar = new r8m(this, fbkVar);
                    }
                } else {
                    r8mVar = new r8m(this, fbkVar);
                }
                Object obj20 = r8mVar.f196809a;
                int i32 = r8mVar.f196810b;
                if (i32 == 0) {
                    bga.m29073P(obj20);
                    PlayerState playerState = (PlayerState) obj;
                    wj50.m88279p(playerState);
                    ContextTrack contextTrack3 = (ContextTrack) playerState.track().mo49283h();
                    if (contextTrack3 == null || (strUri = contextTrack3.uri()) == null || !hyv.m49207g(strUri)) {
                        strUri = null;
                    }
                    r8mVar.f196810b = 1;
                    Object objEmit17 = this.f94219b.emit(strUri, r8mVar);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit17 == yukVar16) {
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
                if (fbkVar instanceof rgo) {
                    rgoVar = (rgo) fbkVar;
                    int i33 = rgoVar.f198987b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        rgoVar.f198987b = i33 - Integer.MIN_VALUE;
                    } else {
                        rgoVar = new rgo(this, fbkVar);
                    }
                } else {
                    rgoVar = new rgo(this, fbkVar);
                }
                Object obj21 = rgoVar.f198986a;
                int i34 = rgoVar.f198987b;
                if (i34 == 0) {
                    bga.m29073P(obj21);
                    qho qhoVar = (qho) obj;
                    Object obj22 = qhoVar instanceof oho ? ((oho) qhoVar).f165512a : null;
                    if (obj22 != null) {
                        rgoVar.f198987b = 1;
                        Object objEmit18 = this.f94219b.emit(obj22, rgoVar);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit18 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof bio) {
                    bioVar = (bio) fbkVar;
                    int i35 = bioVar.f27515b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        bioVar.f27515b = i35 - Integer.MIN_VALUE;
                    } else {
                        bioVar = new bio(this, fbkVar);
                    }
                } else {
                    bioVar = new bio(this, fbkVar);
                }
                Object obj23 = bioVar.f27514a;
                int i36 = bioVar.f27515b;
                if (i36 == 0) {
                    bga.m29073P(obj23);
                    pdu pduVar = ((Boolean) obj).booleanValue() ? new pdu(new Integer(R.string.settings_disabled_reason_data_saver_mode), null) : new pdu(new Integer(R.string.settings_disabled_reason_data_saver_mode_android), null);
                    bioVar.f27515b = 1;
                    Object objEmit19 = this.f94219b.emit(pduVar, bioVar);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit19 == yukVar18) {
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
                if (fbkVar instanceof yio) {
                    yioVar = (yio) fbkVar;
                    int i37 = yioVar.f273175b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        yioVar.f273175b = i37 - Integer.MIN_VALUE;
                    } else {
                        yioVar = new yio(this, fbkVar);
                    }
                } else {
                    yioVar = new yio(this, fbkVar);
                }
                Object obj24 = yioVar.f273174a;
                int i38 = yioVar.f273175b;
                if (i38 == 0) {
                    bga.m29073P(obj24);
                    yioVar.f273175b = 1;
                    Object objEmit20 = this.f94219b.emit((ktx) obj, yioVar);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit20 == yukVar19) {
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
                qho qhoVar2 = (qho) obj;
                if (qhoVar2 instanceof oho) {
                    Object obj25 = ((oho) qhoVar2).f165512a;
                    if (obj25 != null && (objEmit = this.f94219b.emit(obj25, fbkVar)) == yuk.f276404a) {
                        return objEmit;
                    }
                } else if (qhoVar2 instanceof nho) {
                    Logger.m3966b("DataStatementEventSource failed: %s", ((nho) qhoVar2).f154041a);
                } else if (!(qhoVar2 instanceof pho)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof moo) {
                    mooVar = (moo) fbkVar;
                    int i39 = mooVar.f145714b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        mooVar.f145714b = i39 - Integer.MIN_VALUE;
                    } else {
                        mooVar = new moo(this, fbkVar);
                    }
                } else {
                    mooVar = new moo(this, fbkVar);
                }
                Object obj26 = mooVar.f145713a;
                int i40 = mooVar.f145714b;
                if (i40 == 0) {
                    bga.m29073P(obj26);
                    Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean((String) ((ty80) obj).f224877f.f271272q.get("daylist-eligible")));
                    mooVar.f145714b = 1;
                    Object objEmit21 = this.f94219b.emit(boolValueOf, mooVar);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit21 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof iqo) {
                    iqoVar = (iqo) fbkVar;
                    int i41 = iqoVar.f104812b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        iqoVar.f104812b = i41 - Integer.MIN_VALUE;
                    } else {
                        iqoVar = new iqo(this, fbkVar);
                    }
                } else {
                    iqoVar = new iqo(this, fbkVar);
                }
                Object obj27 = iqoVar.f104811a;
                int i42 = iqoVar.f104812b;
                if (i42 == 0) {
                    bga.m29073P(obj27);
                    byte[] bArr = (byte[]) obj;
                    try {
                        AgentMessage agentMessageM9128o = AgentMessage.m9128o(bArr);
                        iqoVar.f104812b = 1;
                        Object objEmit22 = this.f94219b.emit(agentMessageM9128o, iqoVar);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit22 == yukVar21) {
                            return yukVar21;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.decipher.agent.v1.AgentMessage: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof wso) {
                    wsoVar = (wso) fbkVar;
                    int i43 = wsoVar.f254658b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        wsoVar.f254658b = i43 - Integer.MIN_VALUE;
                    } else {
                        wsoVar = new wso(this, fbkVar);
                    }
                } else {
                    wsoVar = new wso(this, fbkVar);
                }
                Object obj28 = wsoVar.f254657a;
                int i44 = wsoVar.f254658b;
                if (i44 == 0) {
                    bga.m29073P(obj28);
                    Boolean boolValueOf2 = Boolean.valueOf(((z190) obj).f278263a.m30586a());
                    wsoVar.f254658b = 1;
                    Object objEmit23 = this.f94219b.emit(boolValueOf2, wsoVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit23 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof yuo) {
                    yuoVar = (yuo) fbkVar;
                    int i45 = yuoVar.f276425b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        yuoVar.f276425b = i45 - Integer.MIN_VALUE;
                    } else {
                        yuoVar = new yuo(this, fbkVar);
                    }
                } else {
                    yuoVar = new yuo(this, fbkVar);
                }
                Object obj29 = yuoVar.f276424a;
                int i46 = yuoVar.f276425b;
                if (i46 == 0) {
                    bga.m29073P(obj29);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC2415th interfaceC2415th = (InterfaceC2415th) it.next();
                            r040 r040Var = ((C1742ci) interfaceC2415th).f38166i;
                            boolean zM74363b = r040Var.m74363b(EnumC2166nj.f154403d);
                            boolean z = r040Var.m74363b(EnumC2166nj.f154402c) || r040Var.m74363b(EnumC2166nj.f154400a) || r040Var.m74363b(EnumC2166nj.f154401b);
                            if (!zM74363b || z) {
                                arrayList3.add(interfaceC2415th);
                            } else {
                                arrayList2.add(interfaceC2415th);
                            }
                        } else {
                            if (!arrayList2.isEmpty()) {
                                Logger.m3966b("Removed " + arrayList2.size() + " stale accessories: " + arrayList2 + ".", new Object[0]);
                            }
                            yuoVar.f276425b = 1;
                            Object objEmit24 = this.f94219b.emit(arrayList3, yuoVar);
                            yuk yukVar23 = yuk.f276404a;
                            if (objEmit24 == yukVar23) {
                                return yukVar23;
                            }
                        }
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof hvo) {
                    hvoVar = (hvo) fbkVar;
                    int i47 = hvoVar.f95754b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        hvoVar.f95754b = i47 - Integer.MIN_VALUE;
                    } else {
                        hvoVar = new hvo(this, fbkVar);
                    }
                } else {
                    hvoVar = new hvo(this, fbkVar);
                }
                Object obj30 = hvoVar.f95753a;
                int i48 = hvoVar.f95754b;
                if (i48 == 0) {
                    bga.m29073P(obj30);
                    if (obj instanceof tab) {
                        hvoVar.f95754b = 1;
                        Object objEmit25 = this.f94219b.emit(obj, hvoVar);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit25 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof ivo) {
                    ivoVar = (ivo) fbkVar;
                    int i49 = ivoVar.f106249b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ivoVar.f106249b = i49 - Integer.MIN_VALUE;
                    } else {
                        ivoVar = new ivo(this, fbkVar);
                    }
                } else {
                    ivoVar = new ivo(this, fbkVar);
                }
                Object obj31 = ivoVar.f106248a;
                int i50 = ivoVar.f106249b;
                if (i50 == 0) {
                    bga.m29073P(obj31);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    ivoVar.f106249b = 1;
                    Object objEmit26 = this.f94219b.emit(objMo49283h, ivoVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit26 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof jvo) {
                    jvoVar = (jvo) fbkVar;
                    int i51 = jvoVar.f116372b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jvoVar.f116372b = i51 - Integer.MIN_VALUE;
                    } else {
                        jvoVar = new jvo(this, fbkVar);
                    }
                } else {
                    jvoVar = new jvo(this, fbkVar);
                }
                Object obj32 = jvoVar.f116371a;
                int i52 = jvoVar.f116372b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                jvoVar.f116372b = 1;
                Object objEmit27 = this.f94219b.emit(w2a1Var, jvoVar);
                yuk yukVar26 = yuk.f276404a;
                return objEmit27 == yukVar26 ? yukVar26 : w2a1Var;
            case 27:
                if (fbkVar instanceof nvo) {
                    nvoVar = (nvo) fbkVar;
                    int i53 = nvoVar.f158932b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        nvoVar.f158932b = i53 - Integer.MIN_VALUE;
                    } else {
                        nvoVar = new nvo(this, fbkVar);
                    }
                } else {
                    nvoVar = new nvo(this, fbkVar);
                }
                Object obj33 = nvoVar.f158931a;
                int i54 = nvoVar.f158932b;
                if (i54 == 0) {
                    bga.m29073P(obj33);
                    xxd1 xxd1Var = (xxd1) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1.f192981b));
                    nvoVar.f158932b = 1;
                    Object objEmit28 = this.f94219b.emit(boolValueOf3, nvoVar);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit28 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof tvo) {
                    tvoVar = (tvo) fbkVar;
                    int i55 = tvoVar.f224202b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        tvoVar.f224202b = i55 - Integer.MIN_VALUE;
                    } else {
                        tvoVar = new tvo(this, fbkVar);
                    }
                } else {
                    tvoVar = new tvo(this, fbkVar);
                }
                Object obj34 = tvoVar.f224201a;
                int i56 = tvoVar.f224202b;
                if (i56 == 0) {
                    bga.m29073P(obj34);
                    qvo qvoVar = (qvo) obj;
                    String str14 = qvoVar != null ? qvoVar.f193068b : null;
                    tvoVar.f224202b = 1;
                    Object objEmit29 = this.f94219b.emit(str14, tvoVar);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit29 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof uvo) {
                    uvoVar = (uvo) fbkVar;
                    int i57 = uvoVar.f234482b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        uvoVar.f234482b = i57 - Integer.MIN_VALUE;
                    } else {
                        uvoVar = new uvo(this, fbkVar);
                    }
                } else {
                    uvoVar = new uvo(this, fbkVar);
                }
                Object obj35 = uvoVar.f234481a;
                int i58 = uvoVar.f234482b;
                if (i58 == 0) {
                    bga.m29073P(obj35);
                    PlayerState playerState2 = (PlayerState) obj;
                    wj50.m88279p(playerState2);
                    elo0 elo0Var = (!playerState2.isPlaying() || playerState2.isPaused()) ? blo0.f28214a : clo0.f39325a;
                    ContextTrack contextTrack4 = (ContextTrack) playerState2.track().mo49283h();
                    if (contextTrack4 != null) {
                        String strM38012j0 = e72.m38012j0(contextTrack4);
                        if (strM38012j0 == null) {
                            strM38012j0 = "";
                        }
                        String strM38021r = e72.m38021r(contextTrack4);
                        if (strM38012j0.length() == 0 && strM38021r.length() == 0) {
                            sck0Var = null;
                        } else {
                            sck0Var = new sck0(strM38012j0, strM38021r);
                        }
                    } else {
                        sck0Var = null;
                    }
                    rvo rvoVar = new rvo(elo0Var, sck0Var);
                    uvoVar.f234482b = 1;
                    Object objEmit30 = this.f94219b.emit(rvoVar, uvoVar);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit30 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ hql(niz nizVar, Object obj, int i) {
        this.f94218a = i;
        this.f94219b = nizVar;
    }
}
