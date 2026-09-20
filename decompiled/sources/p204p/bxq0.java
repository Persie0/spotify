package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class bxq0 implements Predicate, Function3, Function, vja1, tn61, com.spotify.mobius.functions.Function, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31969a;

    /* JADX INFO: renamed from: b */
    public static final bxq0 f31960b = new bxq0(0);

    /* JADX INFO: renamed from: c */
    public static final bxq0 f31961c = new bxq0(1);

    /* JADX INFO: renamed from: d */
    public static final bxq0 f31962d = new bxq0(2);

    /* JADX INFO: renamed from: e */
    public static final bxq0 f31963e = new bxq0(3);

    /* JADX INFO: renamed from: f */
    public static final bxq0 f31964f = new bxq0(4);

    /* JADX INFO: renamed from: g */
    public static final bxq0 f31965g = new bxq0(5);

    /* JADX INFO: renamed from: h */
    public static final bxq0 f31966h = new bxq0(6);

    /* JADX INFO: renamed from: i */
    public static final bxq0 f31967i = new bxq0(8);

    /* JADX INFO: renamed from: t */
    public static final bxq0 f31968t = new bxq0(9);

    /* JADX INFO: renamed from: X */
    public static final bxq0 f31953X = new bxq0(10);

    /* JADX INFO: renamed from: Y */
    public static final bxq0 f31955Y = new bxq0(11);

    /* JADX INFO: renamed from: Z */
    public static final bxq0 f31957Z = new bxq0(12);

    /* JADX INFO: renamed from: L0 */
    public static final bxq0 f31941L0 = new bxq0(13);

    /* JADX INFO: renamed from: M0 */
    public static final bxq0 f31942M0 = new bxq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final bxq0 f31943N0 = new bxq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final bxq0 f31944O0 = new bxq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final bxq0 f31945P0 = new bxq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final bxq0 f31946Q0 = new bxq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final bxq0 f31947R0 = new bxq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final bxq0 f31948S0 = new bxq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final bxq0 f31949T0 = new bxq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final bxq0 f31950U0 = new bxq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final bxq0 f31951V0 = new bxq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final bxq0 f31952W0 = new bxq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final bxq0 f31954X0 = new bxq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final bxq0 f31956Y0 = new bxq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final bxq0 f31958Z0 = new bxq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final bxq0 f31959a1 = new bxq0(28);

    public /* synthetic */ bxq0(int i) {
        this.f31969a = i;
    }

    /* JADX INFO: renamed from: a */
    public static y0x0 m30851a(C2529wd c2529wd) {
        c2529wd.m87798o(new yul0(1));
        ((ArrayList) c2529wd.f250163d).add(new lwx0(null, false));
        return (y0x0) c2529wd.m87802t().m32329b(y0x0.class);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        htr0 htr0Var = (htr0) obj;
        String str = (String) obj3;
        wj50.m88279p(htr0Var);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (wl51.m88460J0(str)) {
            str = null;
        }
        return htr0.m48587c(htr0Var, 0, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, 0, false, false, false, null, null, false, zBooleanValue, str, -1, 127);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f31969a) {
            case 2:
                return j8t0.f109999a;
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 20:
            case 22:
            case 23:
            default:
                xul0 xul0Var = (xul0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (xul0Var.mo49279c()) {
                    builder2.onlyForPlaybackId((String) xul0Var.mo49278b());
                }
                return new a8p0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 4:
                return new x6k0((anu0) obj);
            case 8:
                Logger.m3967c((Throwable) obj, "Error while fetching Playlist metadata", new Object[0]);
                return new ybv(null, -1);
            case 11:
                return new o901(((Integer) obj).intValue());
            case 12:
                return C2244p5.f174033a;
            case 13:
                return ((k621) obj).f119627d;
            case 14:
                return ((PlayerState) obj).restrictions().disallowSkippingNextReasons();
            case 15:
                return Boolean.valueOf(dxf1.m37217F((Map) obj));
            case 16:
                return new kh31(edo.m38606e((Throwable) obj));
            case 17:
                return Boolean.valueOf(((k241) obj) instanceof j241);
            case 18:
                return (Long) ((xul0) obj).mo49278b();
            case 19:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport unavailable";
                }
                return new iz71(message);
            case 21:
                return new ab91();
            case 24:
                return Single.just(new l5d1((ky71) obj));
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((os11) obj);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4;
        switch (this.f31969a) {
            case 6:
                String str5 = (String) linkedHashMap.get("upsell_type");
                if (str5 != null && (str3 = (String) linkedHashMap.get("track_id")) != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str3.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new twv0(str5, str3, mec0Var, str2, str);
                }
                return null;
            default:
                String str6 = (String) linkedHashMap.get("account_id");
                if (str6 == null || !igg1.m50541t(str6) || (str4 = (String) linkedHashMap.get("social_handle")) == null) {
                    return null;
                }
                return new hya1(str6, str4, mec0Var, str2, str);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f31969a) {
            case 0:
                return !((iqx) ((gqx) obj)).f104863f;
            case 3:
                return !((Map) obj).isEmpty();
            case 5:
                ContextTrack contextTrack = (ContextTrack) obj;
                wj50.m88279p(contextTrack);
                return e72.m37994a0(contextTrack);
            case 9:
                CharSequence charSequence = (CharSequence) ((Map) obj).get("catalogue");
                return !(charSequence == null || charSequence.length() == 0);
            case 20:
                return ((Boolean) obj).booleanValue();
            default:
                return ((e301) obj).f55572b;
        }
    }

    public bxq0(vu0 vu0Var) {
        this.f31969a = 29;
    }
}
