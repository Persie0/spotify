package p204p;

import android.content.Context;
import android.content.Intent;
import com.google.android.recaptcha.internal.zzagj;
import com.google.android.recaptcha.internal.zzagk;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.mainprofilesections.artists.ArtistlistResponse$RecentlyPlayedArtistsList;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class qgr0 implements Function, wh00, BiFunction, Predicate, com.spotify.mobius.functions.Function, ro21, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188549a;

    /* JADX INFO: renamed from: b */
    public static final qgr0 f188540b = new qgr0(0);

    /* JADX INFO: renamed from: c */
    public static final qgr0 f188541c = new qgr0(2);

    /* JADX INFO: renamed from: d */
    public static final qgr0 f188542d = new qgr0(3);

    /* JADX INFO: renamed from: e */
    public static final qgr0 f188543e = new qgr0(4);

    /* JADX INFO: renamed from: f */
    public static final qgr0 f188544f = new qgr0(5);

    /* JADX INFO: renamed from: g */
    public static final qgr0 f188545g = new qgr0(6);

    /* JADX INFO: renamed from: h */
    public static final qgr0 f188546h = new qgr0(7);

    /* JADX INFO: renamed from: i */
    public static final qgr0 f188547i = new qgr0(8);

    /* JADX INFO: renamed from: t */
    public static final qgr0 f188548t = new qgr0(9);

    /* JADX INFO: renamed from: X */
    public static final qgr0 f188535X = new qgr0(10);

    /* JADX INFO: renamed from: Y */
    public static final qgr0 f188537Y = new qgr0(11);

    /* JADX INFO: renamed from: Z */
    public static final qgr0 f188539Z = new qgr0(12);

    /* JADX INFO: renamed from: L0 */
    public static final qgr0 f188523L0 = new qgr0(13);

    /* JADX INFO: renamed from: M0 */
    public static final qgr0 f188524M0 = new qgr0(14);

    /* JADX INFO: renamed from: N0 */
    public static final qgr0 f188525N0 = new qgr0(15);

    /* JADX INFO: renamed from: O0 */
    public static final qgr0 f188526O0 = new qgr0(16);

    /* JADX INFO: renamed from: P0 */
    public static final qgr0 f188527P0 = new qgr0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final qgr0 f188528Q0 = new qgr0(18);

    /* JADX INFO: renamed from: R0 */
    public static final qgr0 f188529R0 = new qgr0(19);

    /* JADX INFO: renamed from: S0 */
    public static final qgr0 f188530S0 = new qgr0(20);

    /* JADX INFO: renamed from: T0 */
    public static final qgr0 f188531T0 = new qgr0(21);

    /* JADX INFO: renamed from: U0 */
    public static final qgr0 f188532U0 = new qgr0(22);

    /* JADX INFO: renamed from: V0 */
    public static final qgr0 f188533V0 = new qgr0(23);

    /* JADX INFO: renamed from: W0 */
    public static final qgr0 f188534W0 = new qgr0(24);

    /* JADX INFO: renamed from: X0 */
    public static final qgr0 f188536X0 = new qgr0(27);

    /* JADX INFO: renamed from: Y0 */
    public static final qgr0 f188538Y0 = new qgr0(28);

    public /* synthetic */ qgr0(int i) {
        this.f188549a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final void m72756c(Context context, swz0 swz0Var, nwz0 nwz0Var, String str) {
        Intent intentM65809b = nwz0Var.m65809b(context, str);
        if (str.equals("com.spotify.mobile.android.service.action.request.update.WIDGET")) {
            ((vwz0) swz0Var).m86627b(context, intentM65809b);
        } else {
            ((vwz0) swz0Var).m86626a(context, intentM65809b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134  */
    /* JADX INFO: renamed from: d */
    public static hwr0 m72757d(hwr0 hwr0Var) {
        hwr0 hwr0VarM48949c;
        boolean z;
        boolean z2;
        gtr0 gtr0Var;
        lic1 lic1Var = hwr0Var.f96025Y;
        lic1 lic1Var2 = lic1.f133766a;
        hwr0 hwr0VarM48949c2 = hwr0.m48949c(hwr0Var, null, lic1Var == lic1Var2 && !hwr0Var.f96027a.f95143g, false, false, false, null, null, false, false, false, 0, 2045);
        hwr0 hwr0VarM48949c3 = hwr0.m48949c(hwr0VarM48949c2, null, false, (hwr0VarM48949c2.f96025Y != lic1Var2 || (gtr0Var = hwr0VarM48949c2.f96027a.f95123V0) == null || gtr0Var.f84263d) ? false : true, false, false, null, null, false, false, false, 0, 2043);
        lic1 lic1Var3 = hwr0VarM48949c3.f96025Y;
        lic1 lic1Var4 = lic1.f133768c;
        lic1 lic1Var5 = lic1.f133767b;
        if (lic1Var3 == lic1Var4) {
            hwr0VarM48949c = hwr0.m48949c(hwr0VarM48949c3, null, false, false, true, false, null, null, false, false, false, 0, 1895);
        } else {
            htr0 htr0Var = hwr0VarM48949c3.f96027a;
            boolean z3 = htr0Var.f95124W0;
            xxz xxzVar = htr0Var.f95125X;
            boolean z4 = xxzVar.f267161a;
            hwr0VarM48949c = hwr0.m48949c(hwr0VarM48949c3, null, false, false, lic1Var3 == lic1Var5 && !xxzVar.f267162b && (htr0Var.f95141f || !htr0Var.f95132a1 || (htr0Var.f95142f1 && !htr0Var.f95140e1)), lic1Var3 == lic1Var5 && z4, null, null, lic1Var3 == lic1Var5 && z3 && !z4 && htr0Var.f95130Z0, false, false, 0, 1895);
        }
        hwr0 hwr0Var2 = hwr0VarM48949c;
        if (hwr0Var2.f96025Y == lic1Var5) {
            htr0 htr0Var2 = hwr0Var2.f96027a;
            if ((htr0Var2.f95132a1 && (!htr0Var2.f95142f1 || !htr0Var2.f95140e1)) || !htr0Var2.f95128Y0 || htr0Var2.f95125X.f267162b || htr0Var2.f95141f || htr0Var2.f95150k1) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        hwr0 hwr0VarM48949c4 = hwr0.m48949c(hwr0Var2, null, false, false, false, false, null, null, false, z, false, 0, 1791);
        if (hwr0VarM48949c4.f96025Y == lic1Var5) {
            htr0 htr0Var3 = hwr0VarM48949c4.f96027a;
            if (!htr0Var3.f95132a1 || !htr0Var3.f95142f1 || htr0Var3.f95140e1 || htr0Var3.f95125X.f267162b || htr0Var3.f95141f || htr0Var3.f95150k1) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        return hwr0.m48949c(hwr0VarM48949c4, null, false, false, false, false, null, null, false, false, z2, 0, 1535);
    }

    /* JADX INFO: renamed from: e */
    public static p3t m72758e(hwr0 hwr0Var) {
        htr0 htr0Var = hwr0Var.f96027a;
        return new p3t(htr0Var.f95131a, htr0Var.f95118Q0, htr0Var.f95135c, htr0Var.f95137d, htr0Var.f95139e, htr0Var.f95114M0, htr0Var.f95116O0, htr0Var.f95117P0, Boolean.valueOf(htr0Var.f95122U0));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m72759f(int i, Object obj, gx8 gx8Var) throws zzagk {
        v9f1 v9f1Var = (v9f1) gx8Var.f85221e;
        int i2 = gx8Var.f85218b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            gx8Var.m46018B(0);
            ((fcf1) obj).m41305d(i3 << 3, Long.valueOf(v9f1Var.mo80296m()));
            return true;
        }
        if (i4 == 1) {
            gx8Var.m46018B(1);
            ((fcf1) obj).m41305d((i3 << 3) | 1, Long.valueOf(v9f1Var.mo80298o()));
            return true;
        }
        if (i4 == 2) {
            gx8Var.m46018B(2);
            ((fcf1) obj).m41305d((i3 << 3) | 2, v9f1Var.mo80303t());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzagk("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new zzagj();
            }
            gx8Var.m46018B(5);
            ((fcf1) obj).m41305d(5 | (i3 << 3), Integer.valueOf(v9f1Var.mo80299p()));
            return true;
        }
        fcf1 fcf1VarM41302a = fcf1.m41302a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new zzagk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (gx8Var.m46022H() != Integer.MAX_VALUE && m72759f(i6, fcf1VarM41302a, gx8Var)) {
        }
        if ((i5 | 4) != gx8Var.f85218b) {
            throw new zzagk("Protocol message end-group tag did not match expected tag.");
        }
        if (fcf1VarM41302a.f68113e) {
            fcf1VarM41302a.f68113e = false;
        }
        ((fcf1) obj).m41305d(i5 | 3, fcf1VarM41302a);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final fcf1 m72760g(Object obj) {
        laf1 laf1Var = (laf1) obj;
        fcf1 fcf1Var = laf1Var.zzc;
        if (fcf1Var != fcf1.f68108f) {
            return fcf1Var;
        }
        fcf1 fcf1VarM41302a = fcf1.m41302a();
        laf1Var.zzc = fcf1VarM41302a;
        return fcf1VarM41302a;
    }

    /* JADX INFO: renamed from: a */
    public void m72761a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-1649051432);
        int i2 = (xq00Var.m91766g(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            quf1.m73912d(0, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pgr0(this, i);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws iff0 {
        Object objInvoke;
        switch (this.f188549a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 3:
                ydj.m93454m("Failed to queue track: ", ((hcf) obj).f89783a);
                return w2a1.f247311a;
            case 4:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (!n2x0Var.f149852O0) {
                    throw new iff0(String.format("Something went wrong while trying to load the Recently\n                Played Artist section in the profile platform. Status code: %s\n            ", Arrays.copyOf(new Object[]{Integer.valueOf(n2x0Var.f149860d)}, 1)));
                }
                Object obj2 = o2x0Var.f161172b;
                wj50.m88279p(obj2);
                return (ArtistlistResponse$RecentlyPlayedArtistsList) obj2;
            case 5:
                return new du2(((bxz0) obj).f32026c);
            case 6:
                return ((afq0) ((chy0) ((ehy0) obj)).f38149a).mo25829f().f120976a.getResolveClient();
            case 7:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return ResumptionProgressEsperanto$GetResumePointResponse.m97881o(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetResumePointResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 8:
                return new e6y0(false);
            case 9:
            case 10:
            case 11:
            case 14:
            case 20:
            default:
                return new m3a0((hs41) obj);
            case 12:
                return Boolean.valueOf(((jyj) obj).f117424a == 8);
            case 13:
                return ((k621) obj).f119628e;
            case 15:
                p2x0 p2x0Var = (p2x0) obj;
                o131 o131Var = o131.f160586O0;
                if (p2x0Var instanceof k2x0) {
                    objInvoke = lau.f131415a;
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = o131Var.invoke(((m2x0) p2x0Var).f139474a);
                }
                return (List) objInvoke;
            case 16:
                return new ph31((String) obj);
            case 17:
                List list = (List) obj;
                int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : list) {
                    linkedHashMap.put(((gmr0) obj3).f81450a, obj3);
                }
                return linkedHashMap;
            case 18:
                return ((Boolean) obj).booleanValue() ? new ak51(1) : new ak51(2);
            case 19:
                pqm0 pqm0Var = (pqm0) obj;
                return new gc81((PlayerState) pqm0Var.f180350a, ((Boolean) pqm0Var.f180351b).booleanValue(), true);
            case 21:
                CommitPendingEventResponse commitPendingEventResponse = (CommitPendingEventResponse) obj;
                return commitPendingEventResponse.m16970o() ? CompletableEmpty.f7437a : Completable.m23286j(new cw91("Can't commit pending event", commitPendingEventResponse.m16969n()));
            case 22:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new hf70((String) it.next()));
                }
                return new s6x0(arrayList);
            case 23:
                return Boolean.valueOf(!((List) obj).isEmpty());
        }
    }

    @Override // p204p.ro21
    /* JADX INFO: renamed from: b */
    public boolean mo43134b(int i) {
        return true;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((kf1) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f188549a) {
            case 10:
                return ((e301) obj).f55572b;
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f188549a) {
            case 9:
                return new pqm0((xul0) obj, (am81) obj2);
            default:
                return new pqm0((Boolean) obj, (Boolean) obj2);
        }
    }
}
