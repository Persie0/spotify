package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pf0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final pf0 f176895L0;

    /* JADX INFO: renamed from: M0 */
    public static final pf0 f176896M0;

    /* JADX INFO: renamed from: N0 */
    public static final pf0 f176897N0;

    /* JADX INFO: renamed from: O0 */
    public static final pf0 f176898O0;

    /* JADX INFO: renamed from: P0 */
    public static final pf0 f176899P0;

    /* JADX INFO: renamed from: Q0 */
    public static final pf0 f176900Q0;

    /* JADX INFO: renamed from: R0 */
    public static final pf0 f176901R0;

    /* JADX INFO: renamed from: S0 */
    public static final pf0 f176902S0;

    /* JADX INFO: renamed from: T0 */
    public static final pf0 f176903T0;

    /* JADX INFO: renamed from: U0 */
    public static final pf0 f176904U0;

    /* JADX INFO: renamed from: V0 */
    public static final pf0 f176905V0;

    /* JADX INFO: renamed from: W0 */
    public static final pf0 f176906W0;

    /* JADX INFO: renamed from: X */
    public static final pf0 f176907X;

    /* JADX INFO: renamed from: X0 */
    public static final pf0 f176908X0;

    /* JADX INFO: renamed from: Y */
    public static final pf0 f176909Y;

    /* JADX INFO: renamed from: Y0 */
    public static final pf0 f176910Y0;

    /* JADX INFO: renamed from: Z */
    public static final pf0 f176911Z;

    /* JADX INFO: renamed from: Z0 */
    public static final pf0 f176912Z0;

    /* JADX INFO: renamed from: a1 */
    public static final pf0 f176913a1;

    /* JADX INFO: renamed from: b */
    public static final pf0 f176914b;

    /* JADX INFO: renamed from: b1 */
    public static final pf0 f176915b1;

    /* JADX INFO: renamed from: c */
    public static final pf0 f176916c;

    /* JADX INFO: renamed from: c1 */
    public static final pf0 f176917c1;

    /* JADX INFO: renamed from: d */
    public static final pf0 f176918d;

    /* JADX INFO: renamed from: e */
    public static final pf0 f176919e;

    /* JADX INFO: renamed from: f */
    public static final pf0 f176920f;

    /* JADX INFO: renamed from: g */
    public static final pf0 f176921g;

    /* JADX INFO: renamed from: h */
    public static final pf0 f176922h;

    /* JADX INFO: renamed from: i */
    public static final pf0 f176923i;

    /* JADX INFO: renamed from: t */
    public static final pf0 f176924t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176925a;

    static {
        int i = 1;
        f176914b = new pf0(i, 0);
        f176916c = new pf0(i, 1);
        f176918d = new pf0(i, 2);
        f176919e = new pf0(i, 3);
        f176920f = new pf0(i, 4);
        f176921g = new pf0(i, 5);
        f176922h = new pf0(i, 6);
        f176923i = new pf0(i, 7);
        f176924t = new pf0(i, 8);
        f176907X = new pf0(i, 9);
        f176909Y = new pf0(i, 10);
        f176911Z = new pf0(i, 11);
        f176895L0 = new pf0(i, 12);
        f176896M0 = new pf0(i, 13);
        f176897N0 = new pf0(i, 14);
        f176898O0 = new pf0(i, 15);
        f176899P0 = new pf0(i, 16);
        f176900Q0 = new pf0(i, 17);
        f176901R0 = new pf0(i, 18);
        f176902S0 = new pf0(i, 19);
        f176903T0 = new pf0(i, 20);
        f176904U0 = new pf0(i, 21);
        f176905V0 = new pf0(i, 22);
        f176906W0 = new pf0(i, 23);
        f176908X0 = new pf0(i, 24);
        f176910Y0 = new pf0(i, 25);
        f176912Z0 = new pf0(i, 26);
        f176913a1 = new pf0(i, 27);
        f176915b1 = new pf0(i, 28);
        f176917c1 = new pf0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(int i, int i2) {
        super(i);
        this.f176925a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        pqm0 pqm0Var;
        int i = this.f176925a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 60;
        gpo0 gpo0Var = null;
        String str = "";
        boolean z = false;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                return new v6w0(((hc7) obj).f89710a, "", null, null, null, null, 60);
            case 2:
                v6w0 v6w0Var = (v6w0) obj;
                return new v3m(v6w0Var.f237979a, v6w0Var.f237980b, (u3m) null, (p3m) null, (String) null, (eh00) null, 124);
            case 3:
                v6w0 v6w0Var2 = (v6w0) obj;
                return new t4s(v6w0Var2.f237979a, v6w0Var2.f237980b, 4);
            case 4:
                return new tq01(22, ((v6w0) obj).f237979a, (String) null, (String) null, "author-page-audiobook-row");
            case 5:
                return new yeo0(((v6w0) obj).f237979a, 1);
            case 6:
                jj0 jj0Var = (jj0) obj;
                return new lj0(jj0Var.f112850a, jj0Var.f112851b, jj0Var.f112852c, jj0Var.f112854e, new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null));
            case 7:
                List<rj0> list = ((c610) obj).f34332a;
                if (list == null) {
                    return new dd01(0, Integer.valueOf(R.string.settings_disabled_reason_failed_to_load));
                }
                ArrayList arrayList = new ArrayList();
                for (rj0 rj0Var : list) {
                    String str2 = rj0Var.f199671a;
                    if (str2 != null) {
                        String str3 = rj0Var.f199672b;
                        pqm0Var = new pqm0(str2, wj50.m88271j(str3, "INTEREST_LEVEL_SEE_MORE") ? vj0.f241842b : wj50.m88271j(str3, "INTEREST_LEVEL_SEE_LESS") ? vj0.f241843c : vj0.f241841a);
                    } else {
                        pqm0Var = null;
                    }
                    if (pqm0Var != null) {
                        arrayList.add(pqm0Var);
                    }
                }
                return new ed01(kkc0.m56705r0(arrayList));
            case 8:
                return Boolean.valueOf(wj50.m88271j(((c610) obj).f34333b, Boolean.TRUE));
            case 9:
                ik0 ik0Var = (ik0) obj;
                return new jk0(ik0Var.f102938a, ik0Var.f102939b, ik0Var.f102940c, null, null, qlk.m73227f(ik0Var.f102941d, new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null)));
            case 10:
                return new sk0(false);
            case 11:
                return new sk0(false);
            case 12:
                return al0.f16697a;
            case 13:
                return new il0(false, false);
            case 14:
                return new qo0("", false);
            case 15:
                return new gl0("");
            case 16:
                return (gl0) obj;
            case 17:
                return null;
            case 18:
                jpz0.m53989c((mpz0) obj);
                return w2a1Var;
            case 19:
                return new lp0(null, null, true, null, null, null);
            case 20:
                return new hl51(rkk.m75747E((PlayerState) obj, ContextTrack.Metadata.KEY_ADVERTISER));
            case 21:
                return rkk.m75747E((PlayerState) obj, ContextTrack.Metadata.KEY_CLICK_URL);
            case 22:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                DrawScope.m273U0(tgjVar, ms0.f146656a, 0L, 0L, 0.0f, null, null, 0, 126);
                return w2a1Var;
            case 23:
                return new cpo0(str, z, gpo0Var, i2);
            case 24:
                return new cpo0(str, z, gpo0Var, i2);
            case 25:
                return new ou0((nu0) obj, false);
            case 26:
                return new su0("", true);
            case 27:
                return new su0("", true);
            case 28:
                return new xu0("", true);
            default:
                return new xu0("", true);
        }
    }
}
