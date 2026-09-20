package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.CommonMessages$StatusResponse;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class cz31 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43465a;

    /* JADX INFO: renamed from: b */
    public static final cz31 f43454b = new cz31(0);

    /* JADX INFO: renamed from: c */
    public static final cz31 f43456c = new cz31(1);

    /* JADX INFO: renamed from: d */
    public static final cz31 f43458d = new cz31(2);

    /* JADX INFO: renamed from: e */
    public static final cz31 f43459e = new cz31(3);

    /* JADX INFO: renamed from: f */
    public static final cz31 f43460f = new cz31(4);

    /* JADX INFO: renamed from: g */
    public static final cz31 f43461g = new cz31(5);

    /* JADX INFO: renamed from: h */
    public static final cz31 f43462h = new cz31(6);

    /* JADX INFO: renamed from: i */
    public static final cz31 f43463i = new cz31(7);

    /* JADX INFO: renamed from: t */
    public static final cz31 f43464t = new cz31(8);

    /* JADX INFO: renamed from: X */
    public static final cz31 f43447X = new cz31(9);

    /* JADX INFO: renamed from: Y */
    public static final cz31 f43449Y = new cz31(10);

    /* JADX INFO: renamed from: Z */
    public static final cz31 f43451Z = new cz31(11);

    /* JADX INFO: renamed from: L0 */
    public static final cz31 f43435L0 = new cz31(12);

    /* JADX INFO: renamed from: M0 */
    public static final cz31 f43436M0 = new cz31(13);

    /* JADX INFO: renamed from: N0 */
    public static final cz31 f43437N0 = new cz31(14);

    /* JADX INFO: renamed from: O0 */
    public static final cz31 f43438O0 = new cz31(15);

    /* JADX INFO: renamed from: P0 */
    public static final cz31 f43439P0 = new cz31(16);

    /* JADX INFO: renamed from: Q0 */
    public static final cz31 f43440Q0 = new cz31(17);

    /* JADX INFO: renamed from: R0 */
    public static final cz31 f43441R0 = new cz31(18);

    /* JADX INFO: renamed from: S0 */
    public static final cz31 f43442S0 = new cz31(19);

    /* JADX INFO: renamed from: T0 */
    public static final cz31 f43443T0 = new cz31(20);

    /* JADX INFO: renamed from: U0 */
    public static final cz31 f43444U0 = new cz31(21);

    /* JADX INFO: renamed from: V0 */
    public static final cz31 f43445V0 = new cz31(22);

    /* JADX INFO: renamed from: W0 */
    public static final cz31 f43446W0 = new cz31(23);

    /* JADX INFO: renamed from: X0 */
    public static final cz31 f43448X0 = new cz31(24);

    /* JADX INFO: renamed from: Y0 */
    public static final cz31 f43450Y0 = new cz31(25);

    /* JADX INFO: renamed from: Z0 */
    public static final cz31 f43452Z0 = new cz31(26);

    /* JADX INFO: renamed from: a1 */
    public static final cz31 f43453a1 = new cz31(27);

    /* JADX INFO: renamed from: b1 */
    public static final cz31 f43455b1 = new cz31(28);

    /* JADX INFO: renamed from: c1 */
    public static final cz31 f43457c1 = new cz31(29);

    public /* synthetic */ cz31(int i) {
        this.f43465a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f43465a) {
            case 0:
                Logger.m3974j((Throwable) obj, "Failed to fetch BPM for speed badge", new Object[0]);
                break;
            case 1:
                Logger.m3967c((Throwable) obj, "Error while handling action.", new Object[0]);
                break;
            case 2:
                break;
            case 3:
                Logger.m3967c((Throwable) obj, "Couldn't set Spotify cookies", new Object[0]);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                na6.m63957e("[Puffin] Error observing core errors: " + ((Throwable) obj));
                break;
            case 11:
                na6.m63957e("[Puffin] Error observing Processing Compatibility: " + ((Throwable) obj));
                break;
            case 12:
                break;
            case 13:
                Throwable th = (Throwable) obj;
                Logger.m3966b("ToggleNotificationPreferenceActionHandler", edb.m38564m("Error updating notification preferences: ", th.getMessage()), th);
                break;
            case 14:
                break;
            case 15:
                Logger.m3966b("Social playback attempt failed", new Object[0]);
                break;
            case 16:
                na6.m63971s("[Puffin] Error tracking PuffinFilter usage: " + ((Throwable) obj));
                break;
            case 17:
                Logger.m3967c((Throwable) obj, "Failure in Track Row Playback", new Object[0]);
                break;
            case 18:
                break;
            case 19:
                Logger.m3967c((Throwable) obj, "Failed updating chat message preferences", new Object[0]);
                break;
            case 20:
                na6.m63957e(((Throwable) obj).getMessage());
                break;
            case 21:
                Logger.m3967c((Throwable) obj, "Failed to create BetamaxPlayer", new Object[0]);
                break;
            case 22:
                mwc1 mwc1Var = (mwc1) obj;
                gh00 gh00Var = mwc1Var.f147766a.f54149d;
                if (gh00Var != null) {
                    gh00Var.invoke(Double.valueOf(mwc1Var.f147767b));
                }
                break;
            case 23:
                pwc1 pwc1Var = (pwc1) obj;
                gh00 gh00Var2 = pwc1Var.f181987a.f54149d;
                if (gh00Var2 != null) {
                    Double d = pwc1Var.f181988b;
                    gh00Var2.invoke(Double.valueOf(d != null ? d.doubleValue() : -1.0d));
                }
                break;
            case 24:
                gh00 gh00Var3 = ((qwc1) obj).f193328a.f150658d;
                if (gh00Var3 != null) {
                    gh00Var3.invoke(Boolean.FALSE);
                }
                break;
            case 25:
                CommonMessages$StatusResponse commonMessages$StatusResponse = (CommonMessages$StatusResponse) obj;
                if (commonMessages$StatusResponse.m7302n() != hpf.OK) {
                    Logger.m3966b("Down volume failure " + commonMessages$StatusResponse.m7302n(), new Object[0]);
                }
                break;
            case 26:
                Throwable th2 = (Throwable) obj;
                Logger.m3967c(th2, edb.m38564m("Down volume failure: ", th2.getMessage()), new Object[0]);
                break;
            case 27:
                CommonMessages$StatusResponse commonMessages$StatusResponse2 = (CommonMessages$StatusResponse) obj;
                if (commonMessages$StatusResponse2.m7302n() != hpf.OK) {
                    Logger.m3966b("Set volume failure " + commonMessages$StatusResponse2.m7302n(), new Object[0]);
                }
                break;
            case 28:
                Throwable th3 = (Throwable) obj;
                Logger.m3967c(th3, edb.m38564m("Set volume failure: ", th3.getMessage()), new Object[0]);
                break;
            default:
                CommonMessages$StatusResponse commonMessages$StatusResponse3 = (CommonMessages$StatusResponse) obj;
                if (commonMessages$StatusResponse3.m7302n() != hpf.OK) {
                    Logger.m3966b("Up volume failure " + commonMessages$StatusResponse3.m7302n(), new Object[0]);
                }
                break;
        }
    }
}
