package p204p;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.view.accessibility.AccessibilityManager;
import com.google.mlkit.common.MlKitException;
import com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass$LoudnessResponse;
import com.spotify.karaoke.esperanto.proto.KaraokeSubEventsResponse;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto$DuckResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.p134v1.proto.AuthMethod;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class cyx implements Function, ei20, com.spotify.mobius.functions.Function, Predicate, BiFunction, Init, frv, yh00, Function4, Function3, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43401a;

    /* JADX INFO: renamed from: b */
    public static final cyx f43392b = new cyx(0);

    /* JADX INFO: renamed from: c */
    public static final cyx f43393c = new cyx(1);

    /* JADX INFO: renamed from: d */
    public static final cyx f43394d = new cyx(2);

    /* JADX INFO: renamed from: e */
    public static final cyx f43395e = new cyx(3);

    /* JADX INFO: renamed from: f */
    public static final cyx f43396f = new cyx(4);

    /* JADX INFO: renamed from: g */
    public static final cyx f43397g = new cyx(6);

    /* JADX INFO: renamed from: h */
    public static final cyx f43398h = new cyx(7);

    /* JADX INFO: renamed from: i */
    public static final cyx f43399i = new cyx(8);

    /* JADX INFO: renamed from: t */
    public static final cyx f43400t = new cyx(9);

    /* JADX INFO: renamed from: X */
    public static final cyx f43386X = new cyx(10);

    /* JADX INFO: renamed from: Y */
    public static final cyx f43388Y = new cyx(12);

    /* JADX INFO: renamed from: Z */
    public static final cyx f43390Z = new cyx(13);

    /* JADX INFO: renamed from: L0 */
    public static final cyx f43374L0 = new cyx(14);

    /* JADX INFO: renamed from: M0 */
    public static final cyx f43375M0 = new cyx(15);

    /* JADX INFO: renamed from: N0 */
    public static final cyx f43376N0 = new cyx(17);

    /* JADX INFO: renamed from: O0 */
    public static final cyx f43377O0 = new cyx(18);

    /* JADX INFO: renamed from: P0 */
    public static final cyx f43378P0 = new cyx(19);

    /* JADX INFO: renamed from: Q0 */
    public static final cyx f43379Q0 = new cyx(20);

    /* JADX INFO: renamed from: R0 */
    public static final cyx f43380R0 = new cyx(21);

    /* JADX INFO: renamed from: S0 */
    public static final cyx f43381S0 = new cyx(22);

    /* JADX INFO: renamed from: T0 */
    public static final cyx f43382T0 = new cyx(23);

    /* JADX INFO: renamed from: U0 */
    public static final cyx f43383U0 = new cyx(24);

    /* JADX INFO: renamed from: V0 */
    public static final cyx f43384V0 = new cyx(25);

    /* JADX INFO: renamed from: W0 */
    public static final cyx f43385W0 = new cyx(26);

    /* JADX INFO: renamed from: X0 */
    public static final cyx f43387X0 = new cyx(27);

    /* JADX INFO: renamed from: Y0 */
    public static final cyx f43389Y0 = new cyx(28);

    /* JADX INFO: renamed from: Z0 */
    public static final cyx f43391Z0 = new cyx(29);

    public /* synthetic */ cyx(int i) {
        this.f43401a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final PendingIntent m34393b(Intent intent, AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, wet0 wet0Var) {
        iet0 iet0Var = (iet0) intent.getParcelableExtra("push_data");
        int iMo33720I0 = iet0Var != null ? iet0Var.mo33720I0() : UUID.randomUUID().hashCode();
        if (iet0Var != null) {
            intent.addCategory(xet0.m90442a(appLifecycleServicePendingIntent, iet0Var instanceof dpl0 ? ((dpl0) iet0Var).f51367e : false));
        }
        return wet0Var.m87913f(iMo33720I0, 2, intent);
    }

    /* JADX INFO: renamed from: c */
    public static imk0 m34394c(cw40 cw40Var) throws MlKitException {
        int i = cw40Var.f42640g;
        if (i == -1) {
            Bitmap bitmap = cw40Var.f42634a;
            ig31.m50506x(bitmap);
            return new imk0(bitmap);
        }
        if (i != 17) {
            if (i == 35) {
                return new imk0(cw40Var.f42636c == null ? null : (Image) cw40Var.f42636c.f112391b);
            }
            if (i != 842094169) {
                throw new MlKitException(s571.m77246e(cw40Var.f42640g, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = cw40Var.f42635b;
        ig31.m50506x(byteBuffer);
        return new imk0(byteBuffer);
    }

    /* JADX INFO: renamed from: d */
    public static final osv0 m34395d(pu9 pu9Var, vh7 vh7Var, osv0 osv0Var) {
        Object next;
        if (pu9Var != null) {
            Iterator<E> it = pu9Var.f181389b.m19948q().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AuthMethod) next).m19941q() != vh7Var);
            AuthMethod authMethod = (AuthMethod) next;
            if ((authMethod != null ? authMethod.m19942r() : null) == wh7.AUTH_PROVIDER_STATE_LOGIN_SIGNUP) {
                return osv0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m34396e(LoginActivity loginActivity) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) loginActivity.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new fxx(g6f.m43700N0((List) obj3, g6f.m43700N0((List) obj2, (List) obj)), null, null, null);
    }

    @Override // p204p.frv
    /* JADX INFO: renamed from: a */
    public Object mo34397a(String str, d850 d850Var, fbk fbkVar) {
        return Boolean.FALSE;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        LoudnessResponseOuterClass$LoudnessResponse loudnessResponseOuterClass$LoudnessResponse = (LoudnessResponseOuterClass$LoudnessResponse) obj2;
        String strM3253o = loudnessResponseOuterClass$LoudnessResponse.m3253o();
        Object linkedHashMap2 = linkedHashMap.get(strM3253o);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(strM3253o, linkedHashMap2);
        }
        ((Map) linkedHashMap2).put(Long.valueOf(loudnessResponseOuterClass$LoudnessResponse.m3254p()), Double.valueOf(((Number) g6f.m43741q0(loudnessResponseOuterClass$LoudnessResponse.m3252n())).doubleValue() / 100.0d));
        if (linkedHashMap.keySet().size() > 300) {
            linkedHashMap.remove(g6f.m43739p0(linkedHashMap.keySet()));
        }
        return linkedHashMap;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f43401a) {
            case 14:
                return First.m15574b((bbe0) obj);
            default:
                return First.m15574b((fwh0) obj);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        switch (this.f43401a) {
            case 23:
                String str3 = (String) linkedHashMap.get("preset_id");
                if (str3 == null) {
                    return null;
                }
                return new ttn0(mec0Var, str3, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 != null && str4.length() == 22) {
                    int length = str4.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str4.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new zup0(str4, mec0Var, str2, str);
                }
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f43401a) {
            case 10:
                return ((e301) obj).f55572b;
            default:
                ContextTrack contextTrack = (ContextTrack) obj;
                wj50.m88279p(contextTrack);
                return !Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_IS_ADVERTISEMENT));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f43401a) {
            case 19:
                return new epk0((nqa1) obj, (fyj) obj2, (f8t0) obj3, ((Boolean) obj4).booleanValue());
            default:
                return new xcp0((PlayerState) obj, (r431) obj2, (rhj) obj3, ((Boolean) obj4).booleanValue());
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str;
        switch (this.f43401a) {
            case 0:
                if (((s431) obj).f205428a == r431.f195647c) {
                    str = "RECOMMENDATION";
                } else {
                    str = "NONE";
                }
                return Collections.singletonMap("context_enhancement", str);
            case 1:
                return new j9a0((Boolean) obj);
            case 2:
                return new v1k(true, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, false, false, false, false, false, 56866);
            case 3:
                return Boolean.valueOf(!gwg1.m45947s((String) obj));
            case 6:
                return Boolean.valueOf(!((g0j) obj).f75383c);
            case 7:
                byte[] bArr = (byte[]) obj;
                try {
                    return KaraokeSubEventsResponse.m12069p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.karaoke.esperanto.proto.KaraokeSubEventsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 8:
                return new s6x0(new c6x0((Throwable) obj));
            case 9:
                return new ld3((br80) obj);
            case 13:
                int iOrdinal = ((jcj0) obj).ordinal();
                if (iOrdinal == 0) {
                    return udj0.f229261b;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return udj0.f229262c;
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                return new pot0(false);
            case 18:
                return ((bbk0) obj).f25613e;
            case 24:
                return ((q7k) obj).mo71860c();
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return PlaybackEsperanto$DuckResponse.m17557n(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_esperanto.proto.PlaybackEsperanto.DuckResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 27:
                List list = ((wb30) obj).f249683a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    URL url = new URL(edb.m38564m("https://", (String) it.next()));
                    int port = url.getPort();
                    Integer numValueOf = Integer.valueOf(port);
                    if (port == -1) {
                        numValueOf = null;
                    }
                    String host = url.getHost();
                    pqm0 pqm0Var = host != null ? new pqm0(host, numValueOf) : null;
                    if (pqm0Var != null) {
                        arrayList.add(pqm0Var);
                    }
                }
                return arrayList;
            default:
                return Boolean.valueOf(dxf1.m37216E((Map) obj));
        }
    }
}
