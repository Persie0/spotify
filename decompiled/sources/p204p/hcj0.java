package p204p;

import android.content.Intent;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$Error;
import com.spotify.offline_esperanto.proto.EsOffline$GetDevicesResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p196j$.util.Base64;
import spotify.profile_esperanto.proto.ChangeDisplayNameResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class hcj0 implements Predicate, w1j0, Function, Init, tpk, fa31, oal0, v94, vd50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89827a;

    /* JADX INFO: renamed from: b */
    public static final hcj0 f89818b = new hcj0(0);

    /* JADX INFO: renamed from: c */
    public static final hcj0 f89819c = new hcj0(1);

    /* JADX INFO: renamed from: d */
    public static final hcj0 f89820d = new hcj0(2);

    /* JADX INFO: renamed from: e */
    public static final hcj0 f89821e = new hcj0(3);

    /* JADX INFO: renamed from: f */
    public static final hcj0 f89822f = new hcj0(4);

    /* JADX INFO: renamed from: g */
    public static final hcj0 f89823g = new hcj0(5);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hcj0 f89824h = new hcj0(6);

    /* JADX INFO: renamed from: i */
    public static final hcj0 f89825i = new hcj0(7);

    /* JADX INFO: renamed from: t */
    public static final hcj0 f89826t = new hcj0(8);

    /* JADX INFO: renamed from: X */
    public static final hcj0 f89815X = new hcj0(9);

    /* JADX INFO: renamed from: Y */
    public static final t7x0 f89816Y = new t7x0();

    /* JADX INFO: renamed from: Z */
    public static final hcj0 f89817Z = new hcj0(11);

    /* JADX INFO: renamed from: L0 */
    public static final hcj0 f89807L0 = new hcj0(12);

    /* JADX INFO: renamed from: M0 */
    public static final hcj0 f89808M0 = new hcj0(13);

    /* JADX INFO: renamed from: N0 */
    public static final hcj0 f89809N0 = new hcj0(14);

    /* JADX INFO: renamed from: O0 */
    public static final tm4 f89810O0 = new tm4(27);

    /* JADX INFO: renamed from: P0 */
    public static final hcj0 f89811P0 = new hcj0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final hcj0 f89812Q0 = new hcj0(17);

    /* JADX INFO: renamed from: R0 */
    public static final hcj0 f89813R0 = new hcj0(18);

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ hcj0 f89814S0 = new hcj0(19);

    public /* synthetic */ hcj0(int i) {
        this.f89827a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m47122b(kvu0 kvu0Var, ztw0 ztw0Var, String str, i4t0 i4t0Var) {
        String str2;
        if (kvu0Var.f126959e.f20039c.m78534b(str) != null || (str2 = (String) i4t0Var.get()) == null) {
            return;
        }
        ztw0Var.f286277c.m77929c(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static xxv m47123c(PlayerState playerState) {
        xxv xxvVarM47124d;
        xxv xxvVar;
        String str = (String) playerState.track().mo49284i(cx7.f42938i).mo49280e("");
        if ("queue".equals(str)) {
            xxvVarM47124d = xxv.f267077Q0;
        } else {
            String strM88469S0 = wl51.m88469S0(str, "mft-lens/");
            xxvVarM47124d = (!bm51.m29803n0(strM88469S0, "mft/", false) || strM88469S0.equals("mft/context_switch") || strM88469S0.equals("mft/inject_filler_tracks/future")) ? xxv.f267111o1 : xxv.f267089Z0;
        }
        xxv xxvVar2 = xxv.f267111o1;
        if (xxvVarM47124d == xxvVar2) {
            xul0 xul0VarTrack = playerState.track();
            boolean zContains = playerState.restrictions().disallowTogglingShuffleReasons().contains("mft_disallow");
            ContextTrack contextTrack = (ContextTrack) xul0VarTrack.mo49283h();
            if (contextTrack == null) {
                xxvVarM47124d = xxvVar2;
            } else {
                if (e72.m37976J(contextTrack)) {
                    xxvVarM47124d = xxv.f267096e;
                } else if (e72.m37991Y(contextTrack) || gbm.m44262x(contextTrack) || (zContains && e72.m37981O(contextTrack))) {
                    xxvVarM47124d = xxv.f267089Z0;
                } else if (e72.m37980N(contextTrack)) {
                    xxvVarM47124d = e72.m37986T(contextTrack) ? xxv.f267081U0 : xxv.f267076P0;
                } else {
                    xxvVarM47124d = xxvVar2;
                }
                if (xxvVarM47124d == null) {
                    xxvVarM47124d = xxvVar2;
                }
            }
            if (xxvVarM47124d == xxvVar2) {
                String strViewUri = playerState.playOrigin().viewUri();
                if (strViewUri != null) {
                    xxvVarM47124d = m47124d(strViewUri);
                }
                if (xxvVarM47124d == xxvVar2) {
                    if (hdi.m47215G(playerState)) {
                        xxvVarM47124d = xxv.f267088Z;
                    } else {
                        String strContextUri = playerState.contextUri();
                        xf40 xf40VarContextMetadata = playerState.contextMetadata();
                        gn80 gn80Var = gn80.TRACK;
                        Set set = dd41.f47702f;
                        if (gn80Var == r46.m74726U(strContextUri).f47709c) {
                            xxvVarM47124d = xxv.f267090a1;
                        } else {
                            dd41 dd41VarM74726U = r46.m74726U(strContextUri);
                            he41 he41Var = dd41VarM74726U.f47710d;
                            xtp0 xtp0Var = he41Var instanceof xtp0 ? (xtp0) he41Var : null;
                            if (xtp0Var != null) {
                                xxvVar = xtp0Var.f265907a.equals("listening-party") ? xxv.f267075O0 : xxv.f267078R0;
                            } else {
                                int iOrdinal = dd41VarM74726U.f47709c.ordinal();
                                if (iOrdinal == 191) {
                                    xxvVar = xxv.f267101g1;
                                } else if (iOrdinal == 192) {
                                    xxvVar = xxv.f267103h1;
                                } else if (iOrdinal == 194) {
                                    xxvVar = xxv.f267105i1;
                                } else if (iOrdinal == 286) {
                                    xxvVar = xxv.f267086Y;
                                } else if (iOrdinal == 485) {
                                    xxvVar = xxv.f267088Z;
                                } else if (iOrdinal == 502) {
                                    xxvVar = xxv.f267075O0;
                                } else if (iOrdinal == 760) {
                                    xxvVar = xxv.f267091b1;
                                } else if (iOrdinal == 845 || iOrdinal == 861) {
                                    if (Boolean.parseBoolean((String) xf40VarContextMetadata.get(Context.Metadata.KEY_IS_AUDIOBOOK))) {
                                        xxvVar = xxv.f267104i;
                                    } else {
                                        xxvVar = "video".equals(xf40VarContextMetadata.get("media.type")) ? xxv.f267087Y0 : xxv.f267085X0;
                                    }
                                } else if (iOrdinal != 901) {
                                    switch (iOrdinal) {
                                        case 755:
                                            xxvVar = xxv.f267100g;
                                            break;
                                        case 756:
                                            xxvVar = xxv.f267113t;
                                            break;
                                        case 757:
                                            xxvVar = xxv.f267073M0;
                                            break;
                                        case 758:
                                            xxvVar = xxv.f267080T0;
                                            break;
                                        default:
                                            xxvVar = xxvVar2;
                                            break;
                                    }
                                } else {
                                    xxvVar = xxv.f267082V0;
                                }
                            }
                            xxvVarM47124d = xxvVar != xxvVar2 ? xxvVar : m47124d(strContextUri);
                        }
                    }
                    if (xxvVarM47124d == xxvVar2) {
                        xxvVarM47124d = (xxv) xxv.f267094d.get(playerState.playOrigin().featureIdentifier().toLowerCase(Locale.US));
                        if (xxvVarM47124d == null) {
                            xxvVarM47124d = xxvVar2;
                        }
                    }
                }
            }
        }
        switch (xxvVarM47124d.ordinal()) {
            case 39:
                return xxv.f267095d1;
            case 40:
                return xxv.f267097e1;
            case 41:
                return xxv.f267099f1;
            case 42:
                return xxv.f267101g1;
            case 43:
                return xxv.f267106j1;
            case 44:
                return xxv.f267103h1;
            default:
                return xxvVarM47124d;
        }
    }

    /* JADX INFO: renamed from: d */
    public static xxv m47124d(String str) {
        if (xoc1.f263942N.m83613a(str)) {
            return xxv.f267098f;
        }
        if (xoc1.f263854C.m83613a(str)) {
            return xxv.f267073M0;
        }
        if (xoc1.f264238z.m83613a(str)) {
            return xxv.f267113t;
        }
        if (xoc1.f263838A.m83613a(str)) {
            return xxv.f267100g;
        }
        if (xoc1.f263846B.m83613a(str)) {
            return xxv.f267091b1;
        }
        if (xoc1.f263862D.m83613a(str)) {
            return xxv.f267080T0;
        }
        if (wj50.m88271j(xoc1.f264239z0.f243453a, str)) {
            return xxv.f267082V0;
        }
        if (xoc1.f264222x.m83613a(str)) {
            return xxv.f267073M0;
        }
        if (xoc1.f264198u.m83613a(str)) {
            return xxv.f267113t;
        }
        if (xoc1.f264206v.m83613a(str)) {
            return xxv.f267100g;
        }
        if (xoc1.f264214w.m83613a(str)) {
            return xxv.f267091b1;
        }
        if (xoc1.f264230y.m83613a(str)) {
            return xxv.f267080T0;
        }
        if (xoc1.f264190t.m83613a(str)) {
            return xxv.f267086Y;
        }
        if (xoc1.f264182s.m83613a(str)) {
            return xxv.f267082V0;
        }
        if (xoc1.f263950O.m83613a(str)) {
            return xxv.f267102h;
        }
        if (xoc1.f263878F.m83613a(str) || xoc1.f263926L.m83613a(str) || xoc1.f263918K.m83613a(str)) {
            return xxv.f267078R0;
        }
        if (xoc1.f263934M.m83613a(str)) {
            return xxv.f267079S0;
        }
        if (xoc1.f264166q.m83613a(str)) {
            return xxv.f267083W0;
        }
        if (xoc1.f263966Q.m83613a(str)) {
            return xxv.f267108l1;
        }
        if (wj50.m88271j(xoc1.f264129l2.f243453a, str) || xoc1.f263958P.m83613a(str)) {
            return xxv.f267107k1;
        }
        if (xoc1.f263974R.m83613a(str)) {
            return xxv.f267109m1;
        }
        if (wj50.m88271j(xoc1.f264153o2.f243453a, str)) {
            return xxv.f267110n1;
        }
        if (wj50.m88271j(xoc1.f264201u2.f243453a, str)) {
            return xxv.f267101g1;
        }
        if (wj50.m88271j(xoc1.f264193t2.f243453a, str)) {
            return xxv.f267103h1;
        }
        if (wj50.m88271j(xoc1.f264185s2.f243453a, str)) {
            return xxv.f267105i1;
        }
        if (wj50.m88271j(xoc1.f263839A0.f243453a, str)) {
            return xxv.f267074N0;
        }
        if (wj50.m88271j(xoc1.f263847B0.f243453a, str)) {
            return xxv.f267072L0;
        }
        return (wj50.m88271j(xoc1.f264161p2.f243453a, str) || xoc1.f263982S.m83613a(str)) ? xxv.f267093c1 : xxv.f267111o1;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ /* synthetic */ void mo24956K0(Object obj) {
    }

    @Override // p204p.fa31
    /* JADX INFO: renamed from: a */
    public int mo41135a(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f89827a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline$GetDevicesResponse.m16147o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetDevicesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 3:
                return new iyk0(new wyk0(((EsOffline$Error) obj).m16128n().getNumber()));
            case 4:
            case 6:
            case 10:
            case 11:
            case 12:
            default:
                return oxc1.f170960a;
            case 5:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService$GetSettingsResponse.m17590r(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.GetSettingsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 7:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return PutValuesResponse.m7526o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 8:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return ChangeDisplayNameResponse.m97818n(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.profile_esperanto.proto.ChangeDisplayNameResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
            case 9:
                return ((PlayerState) obj).track();
            case 13:
                return Boolean.valueOf(dxf1.m37217F((Map) obj));
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        xm7 xm7VarM91448a = xm7.m91448a(i);
        return xm7VarM91448a == null ? xm7.UNRECOGNIZED : xm7VarM91448a;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return zqg1.m96741p((gwh0) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        return new s1j0(null, tcc.class);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Byte.valueOf(((p3x0) obj).m69093g());
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        vih0.m85666c();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f89827a) {
            case 0:
                return ((ag31) obj) instanceof zf31;
            case 12:
                e301 e301Var = (e301) obj;
                return e301Var.f55572b && !e301Var.f55574d;
            default:
                return mkg1.m62160v((e301) obj);
        }
    }

    public String toString() {
        switch (this.f89827a) {
            case 14:
                return "Start";
            default:
                return super.toString();
        }
    }
}
