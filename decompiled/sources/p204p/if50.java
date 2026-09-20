package p204p;

import android.view.Display;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class if50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final if50 f101651L0;

    /* JADX INFO: renamed from: M0 */
    public static final if50 f101652M0;

    /* JADX INFO: renamed from: N0 */
    public static final if50 f101653N0;

    /* JADX INFO: renamed from: O0 */
    public static final if50 f101654O0;

    /* JADX INFO: renamed from: P0 */
    public static final if50 f101655P0;

    /* JADX INFO: renamed from: Q0 */
    public static final if50 f101656Q0;

    /* JADX INFO: renamed from: R0 */
    public static final if50 f101657R0;

    /* JADX INFO: renamed from: S0 */
    public static final if50 f101658S0;

    /* JADX INFO: renamed from: T0 */
    public static final if50 f101659T0;

    /* JADX INFO: renamed from: U0 */
    public static final if50 f101660U0;

    /* JADX INFO: renamed from: V0 */
    public static final if50 f101661V0;

    /* JADX INFO: renamed from: W0 */
    public static final if50 f101662W0;

    /* JADX INFO: renamed from: X */
    public static final if50 f101663X;

    /* JADX INFO: renamed from: X0 */
    public static final if50 f101664X0;

    /* JADX INFO: renamed from: Y */
    public static final if50 f101665Y;

    /* JADX INFO: renamed from: Y0 */
    public static final if50 f101666Y0;

    /* JADX INFO: renamed from: Z */
    public static final if50 f101667Z;

    /* JADX INFO: renamed from: Z0 */
    public static final if50 f101668Z0;

    /* JADX INFO: renamed from: a1 */
    public static final if50 f101669a1;

    /* JADX INFO: renamed from: b */
    public static final if50 f101670b;

    /* JADX INFO: renamed from: b1 */
    public static final if50 f101671b1;

    /* JADX INFO: renamed from: c */
    public static final if50 f101672c;

    /* JADX INFO: renamed from: c1 */
    public static final if50 f101673c1;

    /* JADX INFO: renamed from: d */
    public static final if50 f101674d;

    /* JADX INFO: renamed from: e */
    public static final if50 f101675e;

    /* JADX INFO: renamed from: f */
    public static final if50 f101676f;

    /* JADX INFO: renamed from: g */
    public static final if50 f101677g;

    /* JADX INFO: renamed from: h */
    public static final if50 f101678h;

    /* JADX INFO: renamed from: i */
    public static final if50 f101679i;

    /* JADX INFO: renamed from: t */
    public static final if50 f101680t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101681a;

    static {
        int i = 1;
        f101670b = new if50(i, 0);
        f101672c = new if50(i, 1);
        f101674d = new if50(i, 2);
        f101675e = new if50(i, 3);
        f101676f = new if50(i, 4);
        f101677g = new if50(i, 5);
        f101678h = new if50(i, 6);
        f101679i = new if50(i, 7);
        f101680t = new if50(i, 8);
        f101663X = new if50(i, 9);
        f101665Y = new if50(i, 10);
        f101667Z = new if50(i, 11);
        f101651L0 = new if50(i, 12);
        f101652M0 = new if50(i, 13);
        f101653N0 = new if50(i, 14);
        f101654O0 = new if50(i, 15);
        f101655P0 = new if50(i, 16);
        f101656Q0 = new if50(i, 17);
        f101657R0 = new if50(i, 18);
        f101658S0 = new if50(i, 19);
        f101659T0 = new if50(i, 20);
        f101660U0 = new if50(i, 21);
        f101661V0 = new if50(i, 22);
        f101662W0 = new if50(i, 23);
        f101664X0 = new if50(i, 24);
        f101666Y0 = new if50(i, 25);
        f101668Z0 = new if50(i, 26);
        f101669a1 = new if50(i, 27);
        f101671b1 = new if50(i, 28);
        f101673c1 = new if50(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if50(int i, int i2) {
        super(i);
        this.f101681a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f101681a) {
            case 0:
                ((ExoPlayer) obj).mo43875b();
                return w2a1.f247311a;
            case 1:
                ((ExoPlayer) obj).stop();
                return w2a1.f247311a;
            case 2:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                exoPlayer.mo43898n(null);
                dv9.m37074w(exoPlayer, new di21(0, 0));
                return w2a1.f247311a;
            case 3:
                hk50 hk50Var = (hk50) obj;
                return new mk50(hk50Var.f92352a, hk50Var.f92353b, kk50.f123512a, opo.m67574x(hk50Var.f92355d), hk50Var.f92356e);
            case 4:
                return new cjg0((slg0) obj);
            case 5:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), ((cjg0) obj).f38582a, st91.f213865b, System.currentTimeMillis());
            case 6:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 7:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 8:
                return new oqg0(new hog0((st91) obj, 7));
            case 9:
                return new oqg0(new hog0(st91.f213865b, 7));
            case 10:
                yn50 yn50Var = (yn50) obj;
                return new ykn0(yn50Var.f274392b, yn50Var.f274393c, yn50Var.f274394d, yn50Var.f274395e, true, (pvg1) null, 96);
            case 11:
                return new xn50((wkn0) obj);
            case 12:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 13:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 14:
                return w2a1.f247311a;
            case 15:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 16:
                return nu50.f158515a;
            case 17:
                return ((lu50) obj).f137003a;
            case 18:
                return (xu50) obj;
            case 19:
                return Boolean.valueOf((obj instanceof xu50) || (obj instanceof w2a1));
            case 20:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (xu50) obj;
            case 21:
                return ((ylg0) obj).m94162a(null);
            case 22:
                return Long.valueOf(((DeviceBroadcastStatus) obj).timestamp);
            case 23:
                return l160.f128640a;
            case 24:
                return w260.f247243a;
            case 25:
                return s360.f205187a;
            case 26:
                return w2a1.f247311a;
            case 27:
                return p660.f174302a;
            case 28:
                return cb60.f36022a;
            default:
                Display display = ((View) obj).getDisplay();
                return Integer.valueOf(display != null ? display.getDisplayId() : 0);
        }
    }
}
