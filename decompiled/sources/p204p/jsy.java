package p204p;

import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.profileconfig.proto.p131v1.AvatarsResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p196j$.util.Base64;
import spotify.socialgraph.esperanto.proto.FollowResponse;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jsy implements Function3, Function, vja1, BiFunction, Predicate, iuk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115630a;

    /* JADX INFO: renamed from: b */
    public static final jsy f115619b = new jsy(0);

    /* JADX INFO: renamed from: c */
    public static final jsy f115621c = new jsy(1);

    /* JADX INFO: renamed from: d */
    public static final jsy f115623d = new jsy(2);

    /* JADX INFO: renamed from: e */
    public static final jsy f115624e = new jsy(3);

    /* JADX INFO: renamed from: f */
    public static final jsy f115625f = new jsy(4);

    /* JADX INFO: renamed from: g */
    public static final jsy f115626g = new jsy(5);

    /* JADX INFO: renamed from: h */
    public static final jsy f115627h = new jsy(6);

    /* JADX INFO: renamed from: i */
    public static final jsy f115628i = new jsy(7);

    /* JADX INFO: renamed from: t */
    public static final jsy f115629t = new jsy(8);

    /* JADX INFO: renamed from: X */
    public static final jsy f115612X = new jsy(9);

    /* JADX INFO: renamed from: Y */
    public static final jsy f115614Y = new jsy(10);

    /* JADX INFO: renamed from: Z */
    public static final jsy f115616Z = new jsy(11);

    /* JADX INFO: renamed from: L0 */
    public static final jsy f115600L0 = new jsy(12);

    /* JADX INFO: renamed from: M0 */
    public static final jsy f115601M0 = new jsy(13);

    /* JADX INFO: renamed from: N0 */
    public static final jsy f115602N0 = new jsy(14);

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ jsy f115603O0 = new jsy(15);

    /* JADX INFO: renamed from: P0 */
    public static final jsy f115604P0 = new jsy(16);

    /* JADX INFO: renamed from: Q0 */
    public static final jsy f115605Q0 = new jsy(17);

    /* JADX INFO: renamed from: R0 */
    public static final jsy f115606R0 = new jsy(18);

    /* JADX INFO: renamed from: S0 */
    public static final jsy f115607S0 = new jsy(19);

    /* JADX INFO: renamed from: T0 */
    public static final jsy f115608T0 = new jsy(20);

    /* JADX INFO: renamed from: U0 */
    public static final jsy f115609U0 = new jsy(21);

    /* JADX INFO: renamed from: V0 */
    public static final jsy f115610V0 = new jsy(22);

    /* JADX INFO: renamed from: W0 */
    public static final jsy f115611W0 = new jsy(23);

    /* JADX INFO: renamed from: X0 */
    public static final jsy f115613X0 = new jsy(24);

    /* JADX INFO: renamed from: Y0 */
    public static final jsy f115615Y0 = new jsy(25);

    /* JADX INFO: renamed from: Z0 */
    public static final jsy f115617Z0 = new jsy(26);

    /* JADX INFO: renamed from: a1 */
    public static final jsy f115618a1 = new jsy(27);

    /* JADX INFO: renamed from: b1 */
    public static final jsy f115620b1 = new jsy(28);

    /* JADX INFO: renamed from: c1 */
    public static final jsy f115622c1 = new jsy(29);

    public /* synthetic */ jsy(int i) {
        this.f115630a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new gsy((String) obj, (PlayerState) obj2, (zsx) obj3);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ae50 ae50VarM19847n;
        String str;
        switch (this.f115630a) {
            case 1:
                return ((FollowResponse) obj).m97971n();
            case 2:
            case 6:
            case 9:
            case 13:
            case 15:
            case 21:
            case 24:
            case 25:
            default:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 3:
                return ((dz90) obj).f54588e;
            case 4:
                return mw30.f147707c;
            case 5:
                return new lz21(((Boolean) obj).booleanValue());
            case 7:
                AvatarsResponse avatarsResponse = (AvatarsResponse) ((o2x0) obj).f161172b;
                if (avatarsResponse == null || (ae50VarM19847n = avatarsResponse.m19847n()) == null) {
                    throw new IllegalStateException("No avatars found");
                }
                return g6f.m43711Y0(ae50VarM19847n, new kxy(13));
            case 8:
                return Boolean.valueOf(((fb80) obj).m41223a(fb80.f67753d));
            case 10:
                PlayOrigin playOrigin = iea0.f101355d;
                return Boolean.valueOf(!((PlayerState) obj).restrictions().disallowTogglingShuffleReasons().isEmpty());
            case 11:
                return new e7b0(((Boolean) obj).booleanValue());
            case 12:
                return t7f.m80217a((ColorLyricsResponse) obj);
            case 14:
                xaw xawVar = (xaw) g6f.m43745s0((List) obj);
                return Boolean.valueOf((xawVar == null || (str = xawVar.f259791r) == null || str.length() <= 0) ? false : true);
            case 16:
                return new tej0((gmr0) obj);
            case 17:
                return new v8k0((dwi) obj);
            case 18:
                return (Maybe) obj;
            case 19:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline$Progress.m16183K(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.Progress: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 20:
                return CompletableEmpty.f7437a;
            case 22:
                jjt jjtVar = (jjt) obj;
                Observable observableJust = Observable.just(jjtVar);
                jjtVar.getClass();
                return observableJust.delay(10000L, TimeUnit.MILLISECONDS).map(isy.f105342V0);
            case 23:
                zpe1 zpe1Var = (zpe1) obj;
                return zpe1Var instanceof vpe1 ? Maybe.m23363f(new uf3(((vpe1) zpe1Var).f243678a)) : MaybeEmpty.f8264a;
            case 26:
                return ((PlayerState) obj).playbackId();
            case 27:
                return new ybv(null, -1);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4;
        switch (this.f115630a) {
            case 2:
                return new cx00(mec0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("user_name");
                if (str5 == null || (str3 = (String) linkedHashMap.get("playlist_id")) == null || !igg1.m50543v(str3) || (str4 = (String) linkedHashMap.get("episode_id")) == null || !igg1.m50543v(str4)) {
                    return null;
                }
                return new kvp0(str5, str3, str4, str2, str, mec0Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f115630a) {
            case 13:
                return ((xul0) obj).mo49279c();
            case 24:
                return ((szo0) obj).f215623b == iq10.f104599a;
            default:
                return ((PlayerState) obj) != PlayerState.EMPTY;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return new pqm0((qp90) obj, bool);
    }
}
