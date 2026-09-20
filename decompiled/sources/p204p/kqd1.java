package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken$EncryptedClientToken;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes11.dex */
public final class kqd1 implements Predicate, Function, Init, tpk, t6l0, yh00, BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125293a;

    /* JADX INFO: renamed from: b */
    public static final kqd1 f125282b = new kqd1(1);

    /* JADX INFO: renamed from: c */
    public static final kqd1 f125284c = new kqd1(2);

    /* JADX INFO: renamed from: d */
    public static final kqd1 f125286d = new kqd1(3);

    /* JADX INFO: renamed from: e */
    public static final kqd1 f125287e = new kqd1(4);

    /* JADX INFO: renamed from: f */
    public static final kqd1 f125288f = new kqd1(5);

    /* JADX INFO: renamed from: g */
    public static final kqd1 f125289g = new kqd1(6);

    /* JADX INFO: renamed from: h */
    public static final kqd1 f125290h = new kqd1(7);

    /* JADX INFO: renamed from: i */
    public static final kqd1 f125291i = new kqd1(8);

    /* JADX INFO: renamed from: t */
    public static final kqd1 f125292t = new kqd1(9);

    /* JADX INFO: renamed from: X */
    public static final kqd1 f125275X = new kqd1(10);

    /* JADX INFO: renamed from: Y */
    public static final kqd1 f125277Y = new kqd1(11);

    /* JADX INFO: renamed from: Z */
    public static final kqd1 f125279Z = new kqd1(12);

    /* JADX INFO: renamed from: L0 */
    public static final kqd1 f125263L0 = new kqd1(13);

    /* JADX INFO: renamed from: M0 */
    public static final kqd1 f125264M0 = new kqd1(14);

    /* JADX INFO: renamed from: N0 */
    public static final kqd1 f125265N0 = new kqd1(15);

    /* JADX INFO: renamed from: O0 */
    public static final kqd1 f125266O0 = new kqd1(16);

    /* JADX INFO: renamed from: P0 */
    public static final n04 f125267P0 = new n04(1);

    /* JADX INFO: renamed from: Q0 */
    public static final n04 f125268Q0 = new n04(2);

    /* JADX INFO: renamed from: R0 */
    public static final kqd1 f125269R0 = new kqd1(18);

    /* JADX INFO: renamed from: S0 */
    public static final kqd1 f125270S0 = new kqd1(19);

    /* JADX INFO: renamed from: T0 */
    public static final kqd1 f125271T0 = new kqd1(20);

    /* JADX INFO: renamed from: U0 */
    public static final kqd1 f125272U0 = new kqd1(21);

    /* JADX INFO: renamed from: V0 */
    public static final kqd1 f125273V0 = new kqd1(22);

    /* JADX INFO: renamed from: W0 */
    public static final kqd1 f125274W0 = new kqd1(23);

    /* JADX INFO: renamed from: X0 */
    public static final kqd1 f125276X0 = new kqd1(24);

    /* JADX INFO: renamed from: Y0 */
    public static final kqd1 f125278Y0 = new kqd1(25);

    /* JADX INFO: renamed from: Z0 */
    public static final kqd1 f125280Z0 = new kqd1(26);

    /* JADX INFO: renamed from: a1 */
    public static final kqd1 f125281a1 = new kqd1(27);

    /* JADX INFO: renamed from: b1 */
    public static final kqd1 f125283b1 = new kqd1(28);

    /* JADX INFO: renamed from: c1 */
    public static final kqd1 f125285c1 = new kqd1(29);

    public /* synthetic */ kqd1(int i) {
        this.f125293a = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Intent m57090a(Context context, int i) {
        Intent intent;
        try {
            if (i == 0) {
                throw new NullPointerException("WhatsApp application type must be defined.");
            }
            String strM79990e = t3d1.m79990e(i);
            intent = new Intent();
            intent.setPackage(strM79990e);
            intent.setAction("com.whatsapp.otp.OTP_REQUESTED");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 0);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putParcelable("_ci_", activity);
            Package r4 = kqd1.class.getPackage();
            String implementationVersion = r4 != null ? r4.getImplementationVersion() : null;
            if (implementationVersion == null) {
                implementationVersion = "1.0.0_not_from_manifest";
            }
            extras.putString("SDK_VERSION", implementationVersion);
            intent.putExtras(extras);
        } catch (Throwable th) {
            throw th;
        }
        return intent;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws Throwable {
        pqm0 pqm0Var;
        int i;
        String strUri;
        switch (this.f125293a) {
            case 2:
                return new vhj0((Throwable) obj, null);
            case 3:
                List<pob> list = (List) obj;
                int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (pob pobVar : list) {
                    boolean z = pobVar.f179664b;
                    String str = pobVar.f179663a;
                    if (z || (i = pobVar.f179665c) == 4) {
                        pqm0Var = new pqm0(str, u72.f227481a);
                    } else {
                        boolean z2 = i == 3;
                        wl6 wl6Var = pobVar.f179666d;
                        pqm0Var = new pqm0(str, new t72(z2, wl6Var != null ? wl6Var.f252474a : 0));
                    }
                    linkedHashMap.put(pqm0Var.f180350a, pqm0Var.f180351b);
                }
                return new g72(linkedHashMap);
            case 4:
            case 6:
            case 7:
            case 11:
            case 12:
            case 17:
            case 19:
            case 22:
            case 26:
            default:
                return nhg1.m64494n((EsResponseWithReasons$ResponseWithReasons) obj);
            case 5:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAuthStorageResult$AuthStorageResult.m7497p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 9:
                Logger.m3967c((Throwable) obj, "Failed to observe Session Server Time.", new Object[0]);
                return Observable.just(jv7.f116275b);
            case 10:
                return Integer.valueOf((int) ((Long) obj).longValue());
            case 13:
                return new mcc((List) obj);
            case 14:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsClientToken$EncryptedClientToken.m7476o(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken.EncryptedClientToken: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 15:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Status.m6850p(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 16:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
            case 18:
                byte[] bArr5 = (byte[]) obj;
                try {
                    return EsResponseWithReasons$ResponseWithReasons.m17861p(bArr5);
                } catch (Exception e5) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr5), "' (Base64)"), e5);
                }
            case 20:
                eyl0 eyl0Var = (eyl0) obj;
                if (eyl0Var instanceof dyl0) {
                    return ((tl11) ((dyl0) eyl0Var).f54411a).f221296a;
                }
                if (eyl0Var instanceof byl0) {
                    throw ((byl0) eyl0Var).f32271a;
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                c1w c1wVar = (c1w) obj;
                return new pqm0(c1wVar.f33206g, c1wVar.f33205f);
            case 23:
                return ((PlayerState) obj).track();
            case 24:
                return (List) obj;
            case 25:
                return Integer.valueOf(((EsOffline$GetContextsResponse) obj).m16144o());
            case 27:
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().mo49279c() || (strUri = ((ContextTrack) playerState.track().mo49278b()).uri()) == null) {
                    strUri = "";
                }
                return new u0w(strUri, playerState.isPlaying() && !playerState.isPaused());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((ux9) obj);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        ((p3x0) obj).close();
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f125293a) {
            case 1:
                return ((bjd1) obj).f27668a == 2;
            case 4:
                return ((e301) obj).f55572b;
            case 6:
                return ((String) obj).length() > 0;
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        view.setPadding(view.getPaddingLeft(), dx40VarMo51806g.f53849b, view.getPaddingRight(), dx40VarMo51806g.f53851d);
        return swd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f125293a) {
            case 22:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            default:
                return new pqm0((v1k) obj, (PlayerState) obj2);
        }
    }
}
