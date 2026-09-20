package p204p;

import android.os.Parcelable;
import android.view.View;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u6j0 implements Producer, Predicate, Function, a250, vem0, BiFunction, azz, ow6, zua, vd50, t6l0, zu30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227378a;

    /* JADX INFO: renamed from: b */
    public static final u6j0 f227369b = new u6j0(0);

    /* JADX INFO: renamed from: c */
    public static final u6j0 f227370c = new u6j0(1);

    /* JADX INFO: renamed from: d */
    public static final u6j0 f227371d = new u6j0(2);

    /* JADX INFO: renamed from: e */
    public static final u6j0 f227372e = new u6j0(3);

    /* JADX INFO: renamed from: f */
    public static final u6j0 f227373f = new u6j0(4);

    /* JADX INFO: renamed from: g */
    public static final u6j0 f227374g = new u6j0(5);

    /* JADX INFO: renamed from: h */
    public static final u6j0 f227375h = new u6j0(6);

    /* JADX INFO: renamed from: i */
    public static final u6j0 f227376i = new u6j0(7);

    /* JADX INFO: renamed from: t */
    public static final u6j0 f227377t = new u6j0(8);

    /* JADX INFO: renamed from: X */
    public static final u6j0 f227366X = new u6j0(9);

    /* JADX INFO: renamed from: Y */
    public static final u6j0 f227367Y = new u6j0(10);

    /* JADX INFO: renamed from: Z */
    public static final u6j0 f227368Z = new u6j0(11);

    /* JADX INFO: renamed from: L0 */
    public static final u6j0 f227358L0 = new u6j0(12);

    /* JADX INFO: renamed from: M0 */
    public static final u6j0 f227359M0 = new u6j0(13);

    /* JADX INFO: renamed from: N0 */
    public static final u6j0 f227360N0 = new u6j0(14);

    /* JADX INFO: renamed from: O0 */
    public static final u6j0 f227361O0 = new u6j0(15);

    /* JADX INFO: renamed from: P0 */
    public static final u6j0 f227362P0 = new u6j0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final u6j0 f227363Q0 = new u6j0(17);

    /* JADX INFO: renamed from: R0 */
    public static final u6j0 f227364R0 = new u6j0(18);

    /* JADX INFO: renamed from: S0 */
    public static final u6j0 f227365S0 = new u6j0(19);

    public /* synthetic */ u6j0(int i) {
        this.f227378a = i;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m82443g(String str) {
        Set set = dd41.f47702f;
        if (r46.m74726U(str).f47709c == gn80.PODCAST_CHAPTER) {
            return true;
        }
        Set set2 = dd41.f47702f;
        return r46.m74726U(str).f47709c == gn80.CLIP;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m82444i(String str) {
        Set set = dd41.f47702f;
        he41 he41Var = r46.m74726U(str).f47710d;
        if (wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e)) {
            return true;
        }
        return wj50.m88271j(he41Var != null ? he41Var.getType() : null, ivp0.f106258f);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m82445j(String str) {
        Set set = dd41.f47702f;
        return r46.m74726U(str).f47709c == gn80.SHOW_EPISODE;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m82446k(String str) {
        Set set = dd41.f47702f;
        return r46.m74726U(str).f47709c == gn80.TRACK;
    }

    /* JADX INFO: renamed from: l */
    public static final void m82447l(StringBuilder sb, List list) {
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(0, list.size()), 2);
        int i = z350VarM63411S.f278778a;
        int i2 = z350VarM63411S.f278779b;
        int i3 = z350VarM63411S.f278780c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m82448m(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        wj50.m88279p(bArrDigest);
        return bk5.m29591N0(bArrDigest, axl.f20895M0, 30);
    }

    @Override // p204p.zua
    /* JADX INFO: renamed from: a */
    public byte[] mo82449a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        switch (this.f227378a) {
            case 3:
                return Single.just(C2244p5.f174033a);
            case 6:
                return new fzp0(((Boolean) obj).booleanValue());
            case 10:
                hne1 hne1Var = (hne1) ((Map) hne1.f93320g.getValue()).get((String) obj);
                if (hne1Var == null) {
                    hne1Var = hne1.f93322i;
                }
                return hne1Var.f93326c;
            case 14:
                p2x0 p2x0Var = (p2x0) obj;
                o131 o131Var = o131.f160611i;
                if (p2x0Var instanceof k2x0) {
                    objInvoke = lau.f131415a;
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = o131Var.invoke(((m2x0) p2x0Var).f139474a);
                }
                return (List) objInvoke;
            case 15:
                return ((yc8) obj).m93334a();
            case 18:
                return x7d1.f258879a;
            default:
                return Single.just(gmg1.m45258t());
        }
    }

    @Override // p204p.ow6
    /* JADX INFO: renamed from: b */
    public void mo68155b() {
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            AudioDriver.startDuckingAudioSession(currentAudioSession.intValue());
        }
    }

    @Override // p204p.ow6
    /* JADX INFO: renamed from: c */
    public void mo68156c() {
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            AudioDriver.stopDuckingAudioSession(currentAudioSession.intValue());
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        y8x y8xVar;
        if (i == 0) {
            y8xVar = y8x.EVENT_TYPE_UNKNOWN;
        } else if (i == 1) {
            y8xVar = y8x.DISMISS;
        } else if (i != 2) {
            y8xVar = i != 3 ? null : y8x.CLICK;
        } else {
            y8xVar = y8x.VIEW;
        }
        return y8xVar == null ? y8x.UNRECOGNIZED : y8xVar;
    }

    @Override // p204p.vem0
    /* JADX INFO: renamed from: d */
    public Parcelable mo47851d(dd41 dd41Var, e301 e301Var) {
        return new yiq0(xoc1.f263952O1, R.string.available_plans);
    }

    @Override // p204p.zu30
    /* JADX INFO: renamed from: e */
    public xra0 mo47169e(String str) {
        return ati0.f19697b;
    }

    @Override // p204p.ow6
    /* JADX INFO: renamed from: f */
    public void mo68157f() {
        qse1 qse1Var = new qse1();
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            qse1Var.invoke(currentAudioSession);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }

    @Override // p204p.ow6
    /* JADX INFO: renamed from: h */
    public void mo68158h(int i, float f) {
        mw6 mw6Var = new mw6(i, 0, f);
        Integer currentAudioSession = AudioDriver.getCurrentAudioSession();
        if (currentAudioSession != null) {
            mw6Var.invoke(currentAudioSession);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f227378a) {
            case 2:
                return ((waw0) obj).equals(taw0.f218707a);
            case 5:
                return ((xul0) obj).mo49279c();
            case 11:
                dm7 dm7Var = (dm7) obj;
                return dm7Var.m36395a() || (dm7Var instanceof bm7);
            case 13:
                return ((fqx) obj).f72301b != null;
            default:
                return ((PlayerState) obj).track().mo49279c();
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        pwd1 pwd1Var = swd1Var.f214650a;
        view.setPadding(pwd1Var.mo51806g(647).f53848a, pwd1Var.mo51806g(647).f53849b, pwd1Var.mo51806g(647).f53850c, pwd1Var.mo51806g(647).f53851d);
        return swd1.f214649b;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f227378a) {
            case 8:
                return new pqm0(((pqm0) obj).f180351b, (String) obj2);
            default:
                return new pqm0((Boolean) obj, (k0x0) obj2);
        }
    }
}
