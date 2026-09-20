package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.bm */
/* JADX INFO: loaded from: classes9.dex */
public final class C1710bm implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28342a;

    /* JADX INFO: renamed from: b */
    public static final C1710bm f28331b = new C1710bm(0);

    /* JADX INFO: renamed from: c */
    public static final C1710bm f28333c = new C1710bm(1);

    /* JADX INFO: renamed from: d */
    public static final C1710bm f28335d = new C1710bm(2);

    /* JADX INFO: renamed from: e */
    public static final C1710bm f28336e = new C1710bm(3);

    /* JADX INFO: renamed from: f */
    public static final C1710bm f28337f = new C1710bm(4);

    /* JADX INFO: renamed from: g */
    public static final C1710bm f28338g = new C1710bm(5);

    /* JADX INFO: renamed from: h */
    public static final C1710bm f28339h = new C1710bm(6);

    /* JADX INFO: renamed from: i */
    public static final C1710bm f28340i = new C1710bm(7);

    /* JADX INFO: renamed from: t */
    public static final C1710bm f28341t = new C1710bm(8);

    /* JADX INFO: renamed from: X */
    public static final C1710bm f28324X = new C1710bm(9);

    /* JADX INFO: renamed from: Y */
    public static final C1710bm f28326Y = new C1710bm(10);

    /* JADX INFO: renamed from: Z */
    public static final C1710bm f28328Z = new C1710bm(11);

    /* JADX INFO: renamed from: L0 */
    public static final C1710bm f28312L0 = new C1710bm(12);

    /* JADX INFO: renamed from: M0 */
    public static final C1710bm f28313M0 = new C1710bm(13);

    /* JADX INFO: renamed from: N0 */
    public static final C1710bm f28314N0 = new C1710bm(14);

    /* JADX INFO: renamed from: O0 */
    public static final C1710bm f28315O0 = new C1710bm(15);

    /* JADX INFO: renamed from: P0 */
    public static final C1710bm f28316P0 = new C1710bm(16);

    /* JADX INFO: renamed from: Q0 */
    public static final C1710bm f28317Q0 = new C1710bm(17);

    /* JADX INFO: renamed from: R0 */
    public static final C1710bm f28318R0 = new C1710bm(18);

    /* JADX INFO: renamed from: S0 */
    public static final C1710bm f28319S0 = new C1710bm(19);

    /* JADX INFO: renamed from: T0 */
    public static final C1710bm f28320T0 = new C1710bm(20);

    /* JADX INFO: renamed from: U0 */
    public static final C1710bm f28321U0 = new C1710bm(21);

    /* JADX INFO: renamed from: V0 */
    public static final C1710bm f28322V0 = new C1710bm(22);

    /* JADX INFO: renamed from: W0 */
    public static final C1710bm f28323W0 = new C1710bm(23);

    /* JADX INFO: renamed from: X0 */
    public static final C1710bm f28325X0 = new C1710bm(24);

    /* JADX INFO: renamed from: Y0 */
    public static final C1710bm f28327Y0 = new C1710bm(25);

    /* JADX INFO: renamed from: Z0 */
    public static final C1710bm f28329Z0 = new C1710bm(26);

    /* JADX INFO: renamed from: a1 */
    public static final C1710bm f28330a1 = new C1710bm(27);

    /* JADX INFO: renamed from: b1 */
    public static final C1710bm f28332b1 = new C1710bm(28);

    /* JADX INFO: renamed from: c1 */
    public static final C1710bm f28334c1 = new C1710bm(29);

    public /* synthetic */ C1710bm(int i) {
        this.f28342a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f28342a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, th.getMessage(), new Object[0]);
                return;
            case 1:
                ((gms) obj).toString();
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                y41 y41Var = (y41) obj;
                if (y41Var instanceof w41) {
                    ((w41) y41Var).f247673a.m82202b(sh7.f209135t, 0);
                    return;
                } else {
                    if (!y41Var.equals(x41.f257926a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Failed to retrieve logoutApi");
                }
            case 5:
                Logger.m3967c((Throwable) obj, "Error creating new session", new Object[0]);
                return;
            case 6:
                return;
            case 7:
                Logger.m3966b(edb.m38564m("Failed to add to queue: ", ((Throwable) obj).getMessage()), new Object[0]);
                return;
            case 8:
                na6.m63957e(((Throwable) obj).getMessage());
                return;
            case 9:
                Logger.m3967c((Throwable) obj, "Failed calling change list", new Object[0]);
                return;
            case 10:
                Logger.m3967c((Throwable) obj, "Failed changing a playlist", new Object[0]);
                return;
            case 11:
                Logger.m3967c((Throwable) obj, "Failed getting playlist image background", new Object[0]);
                return;
            case 12:
                return;
            case 13:
                return;
            case 14:
                na6.m63959g("Error in event source", (Throwable) obj);
                return;
            case 15:
                na6.m63959g("Error in event source", (Throwable) obj);
                return;
            case 16:
                na6.m63959g("Error in event source", (Throwable) obj);
                return;
            case 17:
                na6.m63959g("Error in also available offline event source", (Throwable) obj);
                return;
            case 18:
                Logger.m3967c((Throwable) obj, "App language sync failed", new Object[0]);
                return;
            case 19:
                return;
            case 20:
                d07 d07Var = (d07) obj;
                lv31 lv31VarEdit = d07Var.f43796a.edit();
                lv31VarEdit.m60048a(d07Var.f43797b.f267528a, true);
                lv31VarEdit.m60055h();
                return;
            case 21:
                na6.m63957e(((Throwable) obj).toString());
                return;
            case 22:
                na6.m63957e(((Throwable) obj).toString());
                return;
            case 23:
                na6.m63957e(((Throwable) obj).toString());
                return;
            case 24:
                ((Throwable) obj).getMessage();
                return;
            case 25:
                na6.m63972t("Failed to load author data for context menu", (Throwable) obj);
                return;
            case 26:
                na6.m63972t("Failed to load metadata for context menu", (Throwable) obj);
                return;
            case 27:
                na6.m63972t("Failed to load metadata for available releases", (Throwable) obj);
                return;
            case 28:
                na6.m63957e("[Puffin] Error applying filters: " + ((Throwable) obj));
                return;
            default:
                Logger.m3967c((Throwable) obj, "[Puffin] Error downloading filters", new Object[0]);
                return;
        }
    }
}
