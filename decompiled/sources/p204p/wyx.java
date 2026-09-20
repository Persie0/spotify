package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ShuffleState;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class wyx implements Predicate, Function, BiFunction, Function4, Init, tn61, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f256398a;

    /* JADX INFO: renamed from: b */
    public static final wyx f256387b = new wyx(0);

    /* JADX INFO: renamed from: c */
    public static final wyx f256389c = new wyx(1);

    /* JADX INFO: renamed from: d */
    public static final wyx f256391d = new wyx(2);

    /* JADX INFO: renamed from: e */
    public static final wyx f256392e = new wyx(3);

    /* JADX INFO: renamed from: f */
    public static final mn20 f256393f = new mn20();

    /* JADX INFO: renamed from: g */
    public static final wyx f256394g = new wyx(5);

    /* JADX INFO: renamed from: h */
    public static final wyx f256395h = new wyx(6);

    /* JADX INFO: renamed from: i */
    public static final wyx f256396i = new wyx(7);

    /* JADX INFO: renamed from: t */
    public static final wyx f256397t = new wyx(8);

    /* JADX INFO: renamed from: X */
    public static final wyx f256380X = new wyx(9);

    /* JADX INFO: renamed from: Y */
    public static final wyx f256382Y = new wyx(10);

    /* JADX INFO: renamed from: Z */
    public static final wyx f256384Z = new wyx(11);

    /* JADX INFO: renamed from: L0 */
    public static final wyx f256368L0 = new wyx(12);

    /* JADX INFO: renamed from: M0 */
    public static final wyx f256369M0 = new wyx(13);

    /* JADX INFO: renamed from: N0 */
    public static final wyx f256370N0 = new wyx(14);

    /* JADX INFO: renamed from: O0 */
    public static final wyx f256371O0 = new wyx(15);

    /* JADX INFO: renamed from: P0 */
    public static final wyx f256372P0 = new wyx(16);

    /* JADX INFO: renamed from: Q0 */
    public static final wyx f256373Q0 = new wyx(17);

    /* JADX INFO: renamed from: R0 */
    public static final wyx f256374R0 = new wyx(18);

    /* JADX INFO: renamed from: S0 */
    public static final wyx f256375S0 = new wyx(19);

    /* JADX INFO: renamed from: T0 */
    public static final wyx f256376T0 = new wyx(20);

    /* JADX INFO: renamed from: U0 */
    public static final wyx f256377U0 = new wyx(21);

    /* JADX INFO: renamed from: V0 */
    public static final wyx f256378V0 = new wyx(22);

    /* JADX INFO: renamed from: W0 */
    public static final wyx f256379W0 = new wyx(23);

    /* JADX INFO: renamed from: X0 */
    public static final wyx f256381X0 = new wyx(24);

    /* JADX INFO: renamed from: Y0 */
    public static final wyx f256383Y0 = new wyx(25);

    /* JADX INFO: renamed from: Z0 */
    public static final wyx f256385Z0 = new wyx(26);

    /* JADX INFO: renamed from: a1 */
    public static final wyx f256386a1 = new wyx(27);

    /* JADX INFO: renamed from: b1 */
    public static final wyx f256388b1 = new wyx(28);

    /* JADX INFO: renamed from: c1 */
    public static final wyx f256390c1 = new wyx(29);

    public /* synthetic */ wyx(int i) {
        this.f256398a = i;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f256398a) {
            case 2:
                return (ContextTrack) obj;
            default:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new pqm0((Boolean) obj, bool);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f256398a) {
            case 7:
                return First.m15574b((mdt) obj);
            case 11:
                return First.m15574b((uva0) obj);
            default:
                return First.m15574b((obe0) obj);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        switch (this.f256398a) {
            case 22:
                String str3 = (String) linkedHashMap.get("managed_account_id");
                if (str3 == null) {
                    return null;
                }
                return new gzm0(mec0Var, str3, str2, str);
            case 23:
                return new ntn0(mec0Var, str2, str);
            default:
                return new ytp0(mec0Var, str2, str);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f256398a) {
            case 0:
                return ((qtt) obj) instanceof ott;
            case 19:
                return !((List) obj).isEmpty();
            case 20:
                return !((YourLibraryResponse) obj).m98199q().m98204q();
            case 21:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                return (messagePresentationStatus instanceof MessagePresentationStatus.Presented) || (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) || (messagePresentationStatus instanceof MessagePresentationStatus.Discarded);
            default:
                return ((p2x0) obj).m68970c() != null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue() && ((Boolean) obj4).booleanValue());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f256398a) {
            case 1:
                return new j9a0((Boolean) obj);
            case 6:
                return new h960(((Boolean) obj).booleanValue());
            case 8:
                yd3 yd3Var = (yd3) obj;
                return new px20(yd3Var.f271626j > 0, yd3Var.f271627k, yd3Var.f271628l);
            case 10:
                return new fku0((Throwable) obj);
            case 12:
                return gbb0.f78257a;
            case 13:
                z5s z5sVar = (z5s) obj;
                if (z5sVar.equals(x5s.f258505a)) {
                    return Observable.just(gdc0.f78804a);
                }
                if (z5sVar instanceof y5s) {
                    return Observable.just(new hdc0(((y5s) z5sVar).f269540a));
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                return Boolean.valueOf(((yhi0) obj) == yhi0.f272910b);
            case 17:
                Boolean bool = (Boolean) ((gv31) obj).f84602a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            case 18:
                return Boolean.valueOf(dxf1.m37248x((Map) obj));
            case 25:
                byte[] bArr = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService$ShuffleState.m17605r(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.ShuffleState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 26:
                return ((PlayerState) obj).contextUri();
            default:
                return (eyd1) ((p2x0) obj).m68971d();
        }
    }
}
