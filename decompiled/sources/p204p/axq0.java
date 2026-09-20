package p204p;

import com.spotify.jam.internal.socialconnect.models.Session;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.puffin_esperanto.proto.C1257xc49a5cdf;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class axq0 implements Function, Init, yh00, vja1, Function9, com.spotify.mobius.functions.Function, Function3, r241, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20978a;

    /* JADX INFO: renamed from: b */
    public static final axq0 f20968b = new axq0(0);

    /* JADX INFO: renamed from: c */
    public static final axq0 f20970c = new axq0(1);

    /* JADX INFO: renamed from: d */
    public static final axq0 f20971d = new axq0(2);

    /* JADX INFO: renamed from: e */
    public static final axq0 f20972e = new axq0(3);

    /* JADX INFO: renamed from: f */
    public static final axq0 f20973f = new axq0(4);

    /* JADX INFO: renamed from: g */
    public static final axq0 f20974g = new axq0(5);

    /* JADX INFO: renamed from: h */
    public static final axq0 f20975h = new axq0(6);

    /* JADX INFO: renamed from: i */
    public static final axq0 f20976i = new axq0(7);

    /* JADX INFO: renamed from: t */
    public static final axq0 f20977t = new axq0(8);

    /* JADX INFO: renamed from: X */
    public static final axq0 f20961X = new axq0(9);

    /* JADX INFO: renamed from: Y */
    public static final axq0 f20963Y = new axq0(10);

    /* JADX INFO: renamed from: Z */
    public static final axq0 f20965Z = new axq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final axq0 f20949L0 = new axq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final axq0 f20950M0 = new axq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final axq0 f20951N0 = new axq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final axq0 f20952O0 = new axq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final axq0 f20953P0 = new axq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final axq0 f20954Q0 = new axq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final axq0 f20955R0 = new axq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final axq0 f20956S0 = new axq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final axq0 f20957T0 = new axq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final axq0 f20958U0 = new axq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final axq0 f20959V0 = new axq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final axq0 f20960W0 = new axq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final axq0 f20962X0 = new axq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final axq0 f20964Y0 = new axq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final axq0 f20966Z0 = new axq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final axq0 f20967a1 = new axq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final axq0 f20969b1 = new axq0(28);

    public /* synthetic */ axq0(int i) {
        this.f20978a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((String) obj, (hg40) obj2, (am81) obj3);
    }

    /* JADX INFO: renamed from: a */
    public tco0 m27426a() {
        return new tco0();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f20978a) {
            case 0:
                yrq0 yrq0Var = (yrq0) obj;
                return new v6k0(yrq0Var.f275573a, yrq0Var);
            case 1:
            case 6:
            case 7:
            case 12:
            case 14:
            case 17:
            case 18:
            case 22:
            case 23:
            default:
                xul0 xul0Var = (xul0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(-15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (xul0Var.mo49279c()) {
                    builder2.onlyForPlaybackId((String) xul0Var.mo49278b());
                }
                return new a8p0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 2:
                return new f8t0(((C1257xc49a5cdf) obj).m20017n());
            case 3:
                return ((ho50) obj).f93460a ? nrt0.f157606a : nrt0.f157607b;
            case 4:
                you0 you0Var = (you0) obj;
                return new pqm0(Boolean.valueOf(you0Var.f274747l), Integer.valueOf(you0Var.f274743h));
            case 5:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 8:
                return ((qu80) obj).f192599e;
            case 9:
                return new wwy0((List) obj);
            case 10:
                return Observable.empty();
            case 11:
                return new u901((db01) obj);
            case 13:
                return ((g521) obj).f76569a;
            case 15:
                return new c7k0((m331) obj);
            case 16:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (n2x0Var.f149852O0) {
                    Object obj2 = o2x0Var.f161172b;
                    wj50.m88279p(obj2);
                    return new yh31((Session) obj2);
                }
                if (n2x0Var.f149860d == 404) {
                    Arrays.copyOf(new Object[0], 0);
                    return new yh31(Session.f4850A);
                }
                Arrays.copyOf(new Object[0], 0);
                return xh31.f261429a;
            case 19:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport unavailable";
                }
                return new iz71(message);
            case 20:
                return Integer.valueOf((int) ((Long) obj).longValue());
            case 21:
                a9c0 a9c0Var = (a9c0) obj;
                return new x791(a9c0Var.f13538a, a9c0Var.f13539b);
            case 24:
                return new y5d1((wpr0) obj);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((hwr0) obj);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        switch (this.f20978a) {
            case 6:
                String str4 = (String) linkedHashMap.get(ContextTrack.Metadata.KEY_ENTITY_URI);
                if (str4 == null) {
                    return null;
                }
                return new swv0(str4, mec0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("account_id");
                if (str5 == null || !igg1.m50541t(str5) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
                    return null;
                }
                return new gya1(str5, str3, mec0Var, str2, str);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f20978a) {
            case 18:
                return ((xul0) obj).mo49279c();
            case 23:
                return ((Boolean) obj).booleanValue();
            case 25:
                return mkg1.m62160v((e301) obj);
            default:
                return !((YourLibraryResponse) obj).m98199q().m98204q();
        }
    }

    public axq0(uu0 uu0Var) {
        this.f20978a = 29;
    }
}
