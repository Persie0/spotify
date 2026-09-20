package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class s5w0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final s5w0 f205915L0;

    /* JADX INFO: renamed from: M0 */
    public static final s5w0 f205916M0;

    /* JADX INFO: renamed from: N0 */
    public static final s5w0 f205917N0;

    /* JADX INFO: renamed from: O0 */
    public static final s5w0 f205918O0;

    /* JADX INFO: renamed from: P0 */
    public static final s5w0 f205919P0;

    /* JADX INFO: renamed from: Q0 */
    public static final s5w0 f205920Q0;

    /* JADX INFO: renamed from: R0 */
    public static final s5w0 f205921R0;

    /* JADX INFO: renamed from: S0 */
    public static final s5w0 f205922S0;

    /* JADX INFO: renamed from: T0 */
    public static final s5w0 f205923T0;

    /* JADX INFO: renamed from: U0 */
    public static final s5w0 f205924U0;

    /* JADX INFO: renamed from: V0 */
    public static final s5w0 f205925V0;

    /* JADX INFO: renamed from: W0 */
    public static final s5w0 f205926W0;

    /* JADX INFO: renamed from: X */
    public static final s5w0 f205927X;

    /* JADX INFO: renamed from: X0 */
    public static final s5w0 f205928X0;

    /* JADX INFO: renamed from: Y */
    public static final s5w0 f205929Y;

    /* JADX INFO: renamed from: Y0 */
    public static final s5w0 f205930Y0;

    /* JADX INFO: renamed from: Z */
    public static final s5w0 f205931Z;

    /* JADX INFO: renamed from: Z0 */
    public static final s5w0 f205932Z0;

    /* JADX INFO: renamed from: a1 */
    public static final s5w0 f205933a1;

    /* JADX INFO: renamed from: b */
    public static final s5w0 f205934b;

    /* JADX INFO: renamed from: b1 */
    public static final s5w0 f205935b1;

    /* JADX INFO: renamed from: c */
    public static final s5w0 f205936c;

    /* JADX INFO: renamed from: c1 */
    public static final s5w0 f205937c1;

    /* JADX INFO: renamed from: d */
    public static final s5w0 f205938d;

    /* JADX INFO: renamed from: e */
    public static final s5w0 f205939e;

    /* JADX INFO: renamed from: f */
    public static final s5w0 f205940f;

    /* JADX INFO: renamed from: g */
    public static final s5w0 f205941g;

    /* JADX INFO: renamed from: h */
    public static final s5w0 f205942h;

    /* JADX INFO: renamed from: i */
    public static final s5w0 f205943i;

    /* JADX INFO: renamed from: t */
    public static final s5w0 f205944t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205945a;

    static {
        int i = 1;
        f205934b = new s5w0(i, 0);
        f205936c = new s5w0(i, 1);
        f205938d = new s5w0(i, 2);
        f205939e = new s5w0(i, 3);
        f205940f = new s5w0(i, 4);
        f205941g = new s5w0(i, 5);
        f205942h = new s5w0(i, 6);
        f205943i = new s5w0(i, 7);
        f205944t = new s5w0(i, 8);
        f205927X = new s5w0(i, 9);
        f205929Y = new s5w0(i, 10);
        f205931Z = new s5w0(i, 11);
        f205915L0 = new s5w0(i, 12);
        f205916M0 = new s5w0(i, 13);
        f205917N0 = new s5w0(i, 14);
        f205918O0 = new s5w0(i, 15);
        f205919P0 = new s5w0(i, 16);
        f205920Q0 = new s5w0(i, 17);
        f205921R0 = new s5w0(i, 18);
        f205922S0 = new s5w0(i, 19);
        f205923T0 = new s5w0(i, 20);
        f205924U0 = new s5w0(i, 21);
        f205925V0 = new s5w0(i, 22);
        f205926W0 = new s5w0(i, 23);
        f205928X0 = new s5w0(i, 24);
        f205930Y0 = new s5w0(i, 25);
        f205932Z0 = new s5w0(i, 26);
        f205933a1 = new s5w0(i, 27);
        f205935b1 = new s5w0(i, 28);
        f205937c1 = new s5w0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5w0(int i, int i2) {
        super(i);
        this.f205945a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.f205945a;
        Set setSingleton = gbu.f78413a;
        int i2 = 27;
        w2a1 w2a1Var = w2a1.f247311a;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 0:
                return new v6w0(((n8w0) obj).f151648b, "", null, null, null, null, 60);
            case 1:
                return new o4w0(((n8w0) obj).f151648b);
            case 2:
                return ((b1w0) obj).f22429b.f33213b;
            case 3:
                Map map = ((m72) obj).f140629a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (v72) entry.getValue());
                }
                return linkedHashMap;
            case 4:
                return w2a1Var;
            case 5:
                return w2a1Var;
            case 6:
                return Boolean.valueOf(((pro0) obj) != pro0.f180654b);
            case 7:
                String str3 = ((n8w0) obj).f151648b;
                boolean zM29803n0 = bm51.m29803n0(str3, "spotify:album:", false);
                pqm0 pqm0Var = new pqm0(y7w0.f270140a, zM29803n0 ? Collections.singleton(str3) : setSingleton);
                if (!zM29803n0) {
                    setSingleton = Collections.singleton(str3);
                }
                return kkc0.m56695h0(pqm0Var, new pqm0(y7w0.f270141b, setSingleton));
            case 8:
                return Collections.singleton(((n8w0) obj).f151648b);
            case 9:
                return Collections.singleton(((n8w0) obj).f151648b);
            case 10:
                return setSingleton;
            case 11:
                return Collections.singleton(((o8w0) obj).f162885b);
            case 12:
                return setSingleton;
            case 13:
                Logger.m3974j((Throwable) obj, "No credits from createGeneration endpoint", new Object[0]);
                return eli.f60716a;
            case 14:
                st91 st91Var = st91.f213865b;
                return new y1h0(new xxg0(9, (byte) 0));
            case 15:
                yt91 yt91VarM96903c = ((y1h0) obj).f268274a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("keep_previous_quality_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
            case 16:
                yt91 yt91VarM96903c2 = ((y1h0) obj).f268274a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("enable_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
            case 17:
                k8a k8aVar = (k8a) obj;
                switch (k8aVar.f120273a) {
                    case 0:
                        str = k8aVar.f120275c;
                        break;
                    case 1:
                        str = k8aVar.f120275c;
                        break;
                    default:
                        str = k8aVar.f120275c;
                        break;
                }
                switch (k8aVar.f120273a) {
                    case 0:
                        str2 = k8aVar.f120274b;
                        break;
                    case 1:
                        str2 = k8aVar.f120274b;
                        break;
                    default:
                        str2 = k8aVar.f120274b;
                        break;
                }
                return klh.m56834f(str, ".", str2);
            case 18:
                return new ysk(((lji) obj).mo56606j(), i2);
            case 19:
                return new ysk(((lji) obj).mo56608l(), i2);
            case 20:
                return new ysk(((lji) obj).mo56603f(), i2);
            case 21:
                return new fkg0((slg0) obj);
            case 22:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), ((fkg0) obj).f70540a, st91.f213865b, System.currentTimeMillis());
            case 23:
                return pp91.m70529j(new pqm0("onboarding_model", (gkl0) obj));
            case 24:
                return pp91.m70529j(new pqm0("remote_downloads_model", (fdw0) obj));
            case 25:
                return w2a1Var;
            case 26:
                return ((lep0) obj).f132654b;
            case 27:
                return new pdh0(new vch0((st91) obj, 6));
            case 28:
                pdh0 pdh0Var = (pdh0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), pdh0Var.f176466a, pdh0Var.f176467b.f240134b, System.currentTimeMillis());
            default:
                odh0 odh0Var = (odh0) obj;
                yt91 yt91VarM96903c3 = odh0Var.f164191a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("confirm_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c3.m94607a(), odh0Var.f164192b.f176467b.f240134b, System.currentTimeMillis());
        }
    }
}
