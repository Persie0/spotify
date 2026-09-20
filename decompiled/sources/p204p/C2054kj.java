package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p.kj */
/* JADX INFO: loaded from: classes2.dex */
public final class C2054kj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final C2054kj f123158L0;

    /* JADX INFO: renamed from: M0 */
    public static final C2054kj f123159M0;

    /* JADX INFO: renamed from: N0 */
    public static final C2054kj f123160N0;

    /* JADX INFO: renamed from: O0 */
    public static final C2054kj f123161O0;

    /* JADX INFO: renamed from: P0 */
    public static final C2054kj f123162P0;

    /* JADX INFO: renamed from: Q0 */
    public static final C2054kj f123163Q0;

    /* JADX INFO: renamed from: R0 */
    public static final C2054kj f123164R0;

    /* JADX INFO: renamed from: S0 */
    public static final C2054kj f123165S0;

    /* JADX INFO: renamed from: T0 */
    public static final C2054kj f123166T0;

    /* JADX INFO: renamed from: U0 */
    public static final C2054kj f123167U0;

    /* JADX INFO: renamed from: V0 */
    public static final C2054kj f123168V0;

    /* JADX INFO: renamed from: W0 */
    public static final C2054kj f123169W0;

    /* JADX INFO: renamed from: X */
    public static final C2054kj f123170X;

    /* JADX INFO: renamed from: X0 */
    public static final C2054kj f123171X0;

    /* JADX INFO: renamed from: Y */
    public static final C2054kj f123172Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C2054kj f123173Y0;

    /* JADX INFO: renamed from: Z */
    public static final C2054kj f123174Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C2054kj f123175Z0;

    /* JADX INFO: renamed from: a1 */
    public static final C2054kj f123176a1;

    /* JADX INFO: renamed from: b */
    public static final C2054kj f123177b;

    /* JADX INFO: renamed from: b1 */
    public static final C2054kj f123178b1;

    /* JADX INFO: renamed from: c */
    public static final C2054kj f123179c;

    /* JADX INFO: renamed from: c1 */
    public static final C2054kj f123180c1;

    /* JADX INFO: renamed from: d */
    public static final C2054kj f123181d;

    /* JADX INFO: renamed from: e */
    public static final C2054kj f123182e;

    /* JADX INFO: renamed from: f */
    public static final C2054kj f123183f;

    /* JADX INFO: renamed from: g */
    public static final C2054kj f123184g;

    /* JADX INFO: renamed from: h */
    public static final C2054kj f123185h;

    /* JADX INFO: renamed from: i */
    public static final C2054kj f123186i;

    /* JADX INFO: renamed from: t */
    public static final C2054kj f123187t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123188a;

    static {
        int i = 1;
        f123177b = new C2054kj(i, 0);
        f123179c = new C2054kj(i, 1);
        f123181d = new C2054kj(i, 2);
        f123182e = new C2054kj(i, 3);
        f123183f = new C2054kj(i, 4);
        f123184g = new C2054kj(i, 5);
        f123185h = new C2054kj(i, 6);
        f123186i = new C2054kj(i, 7);
        f123187t = new C2054kj(i, 8);
        f123170X = new C2054kj(i, 9);
        f123172Y = new C2054kj(i, 10);
        f123174Z = new C2054kj(i, 11);
        f123158L0 = new C2054kj(i, 12);
        f123159M0 = new C2054kj(i, 13);
        f123160N0 = new C2054kj(i, 14);
        f123161O0 = new C2054kj(i, 15);
        f123162P0 = new C2054kj(i, 16);
        f123163Q0 = new C2054kj(i, 17);
        f123164R0 = new C2054kj(i, 18);
        f123165S0 = new C2054kj(i, 19);
        f123166T0 = new C2054kj(i, 20);
        f123167U0 = new C2054kj(i, 21);
        f123168V0 = new C2054kj(i, 22);
        f123169W0 = new C2054kj(i, 23);
        f123171X0 = new C2054kj(i, 24);
        f123173Y0 = new C2054kj(i, 25);
        f123175Z0 = new C2054kj(i, 26);
        f123176a1 = new C2054kj(i, 27);
        f123178b1 = new C2054kj(i, 28);
        f123180c1 = new C2054kj(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2054kj(int i, int i2) {
        super(i);
        this.f123188a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f123188a) {
            case 0:
                String str = ((C1742ci) ((InterfaceC2415th) obj)).f38159b;
                if (str == null) {
                    str = "";
                }
                return kkc0.m56695h0(pft0.m69840u("action_id", "spy_tap"), pft0.m69840u("device_name", str));
            case 1:
                b30 b30Var = ((x20) obj).f257322c;
                qf40 qf40VarM27980c = b30Var.m27980c();
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40VarM27980c, 10));
                Iterator<E> it = qf40VarM27980c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((z20) it.next()).m95171a());
                }
                pqm0 pqm0VarM69840u = pft0.m69840u(1, g6f.m43736n1(arrayList));
                qf40 qf40VarM27980c2 = b30Var.m27980c();
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it2 = qf40VarM27980c2.iterator();
                while (it2.hasNext()) {
                    j6f.m52564V(((z20) it2.next()).m95172b(), arrayList2);
                }
                return kkc0.m56695h0(pqm0VarM69840u, pft0.m69840u(2, g6f.m43736n1(arrayList2)));
            case 2:
                return new j1x0(R.string.player_radio_advertisement_by);
            case 3:
                List listM86304a = ((ss3) obj).f213472a.m86304a();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(listM86304a, 10));
                Iterator it3 = ((ArrayList) listM86304a).iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((us3) it3.next()).m83877a());
                }
                return c95.m31821M(pft0.m69840u(1, g6f.m43736n1(arrayList3)));
            case 4:
                return Boolean.TRUE;
            case 5:
                return w2a1.f247311a;
            case 6:
                return ((r57) obj).m74809d();
            case 7:
                return jfg1.m53186i((nj7) obj);
            case 8:
                return jkg1.m53625j((zl8) obj);
            case 9:
                c0r0 c0r0Var = (c0r0) obj;
                if (c0r0Var != null) {
                    return c0r0Var.f32850a;
                }
                return null;
            case 10:
                return String.valueOf(((x1x) ((pqm0) obj).f180351b).f257293a);
            case 11:
                return nau.f152117a;
            case 12:
                return new xoi0(Boolean.TRUE);
            case 13:
                return ((zed0) obj).metadata();
            case 14:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                return Boolean.valueOf((messagePresentationStatus instanceof MessagePresentationStatus.Presented) || (messagePresentationStatus instanceof MessagePresentationStatus.PendingPresentation));
            case 15:
                return c95.m31821M(pft0.m69840u(1, g6f.m43736n1(((uhb) obj).f230404a.m96123b())));
            case 16:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 17:
                return ((fjh0) obj).m41847l();
            case 18:
                return Boolean.valueOf(wj50.m88271j(((k35) obj).f118762a, e8f.f57157L0));
            case 19:
                PlayerState playerState = (PlayerState) obj;
                return new ord(playerState.contextUri(), playerState.playOrigin().featureIdentifier());
            case 20:
                return w2a1.f247311a;
            case 21:
                return new ybs(((f4m0) obj).mo29188d());
            case 22:
                return Boolean.valueOf(!(((dxh0) obj) instanceof oph));
            case 23:
                return ((quh) obj).f192714a;
            case 24:
                return ((p1i) obj).m68813a();
            case 25:
                return ufi.m83021b(new b3y(null), (ggi) obj);
            case 26:
                return c95.m31821M(pft0.m69840u(1, g6f.m43736n1(((bl90) obj).f28133c.m44699a())));
            case 27:
                return eug1.m40064e((lji) obj);
            case 28:
                return ((ContextTrack) ((pqm0) obj).f180351b).uri();
            default:
                qf40 qf40Var = ((chj) obj).mo25988a().f133581c;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(qf40Var, 10));
                Iterator<E> it4 = qf40Var.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((v6w0) it4.next()).f237979a);
                }
                return c95.m31821M(pft0.m69840u(1, g6f.m43736n1(arrayList4)));
        }
    }
}
