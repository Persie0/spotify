package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.jam.internal.socialconnect.models.BroadcastStatusUpdate;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin_esperanto.proto.C1256x6fa56467;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedResponse;
import com.spotify.show_esperanto.proto.GetShowResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wjr0 implements Function, nvt0, Predicate, BiFunction, u301, com.spotify.mobius.functions.Function, Function3, Init, tn61, ojn0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252037a;

    /* JADX INFO: renamed from: b */
    public static final wjr0 f252028b = new wjr0(0);

    /* JADX INFO: renamed from: c */
    public static final wjr0 f252029c = new wjr0(1);

    /* JADX INFO: renamed from: d */
    public static final wjr0 f252030d = new wjr0(2);

    /* JADX INFO: renamed from: e */
    public static final wjr0 f252031e = new wjr0(3);

    /* JADX INFO: renamed from: f */
    public static final wjr0 f252032f = new wjr0(4);

    /* JADX INFO: renamed from: g */
    public static final wjr0 f252033g = new wjr0(5);

    /* JADX INFO: renamed from: h */
    public static final wjr0 f252034h = new wjr0(7);

    /* JADX INFO: renamed from: i */
    public static final wjr0 f252035i = new wjr0(8);

    /* JADX INFO: renamed from: t */
    public static final wjr0 f252036t = new wjr0(9);

    /* JADX INFO: renamed from: X */
    public static final wjr0 f252021X = new wjr0(10);

    /* JADX INFO: renamed from: Y */
    public static final wjr0 f252023Y = new wjr0(11);

    /* JADX INFO: renamed from: Z */
    public static final wjr0 f252025Z = new wjr0(12);

    /* JADX INFO: renamed from: L0 */
    public static final wjr0 f252009L0 = new wjr0(13);

    /* JADX INFO: renamed from: M0 */
    public static final wjr0 f252010M0 = new wjr0(14);

    /* JADX INFO: renamed from: N0 */
    public static final wjr0 f252011N0 = new wjr0(15);

    /* JADX INFO: renamed from: O0 */
    public static final wjr0 f252012O0 = new wjr0(16);

    /* JADX INFO: renamed from: P0 */
    public static final wjr0 f252013P0 = new wjr0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final wjr0 f252014Q0 = new wjr0(18);

    /* JADX INFO: renamed from: R0 */
    public static final wjr0 f252015R0 = new wjr0(19);

    /* JADX INFO: renamed from: S0 */
    public static final wjr0 f252016S0 = new wjr0(20);

    /* JADX INFO: renamed from: T0 */
    public static final wjr0 f252017T0 = new wjr0(21);

    /* JADX INFO: renamed from: U0 */
    public static final wjr0 f252018U0 = new wjr0(22);

    /* JADX INFO: renamed from: V0 */
    public static final wjr0 f252019V0 = new wjr0(23);

    /* JADX INFO: renamed from: W0 */
    public static final wjr0 f252020W0 = new wjr0(24);

    /* JADX INFO: renamed from: X0 */
    public static final wjr0 f252022X0 = new wjr0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final /* synthetic */ wjr0 f252024Y0 = new wjr0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final wjr0 f252026Z0 = new wjr0(27);

    /* JADX INFO: renamed from: a1 */
    public static final wjr0 f252027a1 = new wjr0(28);

    public /* synthetic */ wjr0(int i) {
        this.f252037a = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88355a(fo4 fo4Var) {
        return fo4Var.m42264a();
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        List list = (List) obj2;
        return new o221(list.contains(new q121("plus")), ((Boolean) obj3).booleanValue(), list.contains(new q121("minus")), ((Boolean) obj).booleanValue());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f252037a) {
            case 0:
                return Boolean.valueOf(dxf1.m37217F((Map) obj));
            case 1:
                return new azr0((Throwable) obj);
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return C1256x6fa56467.m20014o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinLibraryVersionResponseOuterClass.PuffinLibraryVersionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 14:
            case 15:
            default:
                return t02.f215724h.get(obj);
            case 4:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetRecentlyPlayedResponse.m20229q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 5:
                return ew90.f63455a;
            case 8:
                return new h6y0(false);
            case 12:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return GetShowResponse.m21207o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.show_esperanto.proto.GetShowResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 13:
                return ((t521) obj).f217197a;
            case 16:
                return new rh31(((BroadcastStatusUpdate) obj).deviceBroadcastStatus);
            case 17:
                return Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
            case 18:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to get audiobook recommendations", new Object[0]);
                return nau.f152117a;
            case 19:
                return (Completable) obj;
            case 20:
                Metadata$Track metadata$Track = (Metadata$Track) obj;
                String strM60172a = lx8.m60172a(metadata$Track.m15452r().m45891s());
                String strM60172a2 = lx8.m60172a(metadata$Track.m15449n().m15426q().m45891s());
                Set set = dd41.f47702f;
                if (strM60172a2.length() != 22) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (strM60172a.length() != 22) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                return r46.m74726U("spotify:album:" + strM60172a2 + ":play:" + strM60172a);
            case 21:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    ozw0 ozw0Var = (ozw0) entry.getValue();
                    String str = null;
                    if (ozw0Var instanceof nzw0) {
                        z240 z240VarM60640a = ((nzw0) ozw0Var).f160180a.m60640a(a340.f11861b);
                        if (z240VarM60640a != null) {
                            str = z240VarM60640a.f278475a.f198763a;
                        }
                    } else if (!(ozw0Var instanceof lzw0) && !(ozw0Var instanceof mzw0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(key, str);
                }
                return new dot0(linkedHashMap);
        }
    }

    @Override // p204p.nvt0
    /* JADX INFO: renamed from: b */
    public String mo28348b(int i) {
        return null;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        jbb1 jbb1Var = (jbb1) obj;
        if (jbb1Var instanceof hbb1) {
            return First.m15575c(jbb1Var, Collections.singleton(rab1.f197251a));
        }
        if (jbb1Var instanceof ibb1) {
            return First.m15574b(jbb1Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.ojn0
    /* JADX INFO: renamed from: i */
    public Object mo24963i(d7x0 d7x0Var) {
        return (rfo) d7x0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f252037a) {
            case 7:
                return ((fqx) ((pqm0) obj).f180350a).f72301b != null;
            case 11:
                return !((iqx) ((gqx) obj)).f104863f;
            case 14:
                return ((nj11) obj).f154419a;
            case 23:
                return ((PlayerState) obj).track().mo49279c();
            default:
                return ((xul0) obj).mo49279c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((String) obj, (tny0) obj2);
    }
}
