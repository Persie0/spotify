package p204p;

import android.content.Context;
import android.widget.FrameLayout;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public final class rpb extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final rpb f201484L0;

    /* JADX INFO: renamed from: M0 */
    public static final rpb f201485M0;

    /* JADX INFO: renamed from: N0 */
    public static final rpb f201486N0;

    /* JADX INFO: renamed from: O0 */
    public static final rpb f201487O0;

    /* JADX INFO: renamed from: P0 */
    public static final rpb f201488P0;

    /* JADX INFO: renamed from: Q0 */
    public static final rpb f201489Q0;

    /* JADX INFO: renamed from: R0 */
    public static final rpb f201490R0;

    /* JADX INFO: renamed from: S0 */
    public static final rpb f201491S0;

    /* JADX INFO: renamed from: T0 */
    public static final rpb f201492T0;

    /* JADX INFO: renamed from: U0 */
    public static final rpb f201493U0;

    /* JADX INFO: renamed from: V0 */
    public static final rpb f201494V0;

    /* JADX INFO: renamed from: W0 */
    public static final rpb f201495W0;

    /* JADX INFO: renamed from: X */
    public static final rpb f201496X;

    /* JADX INFO: renamed from: X0 */
    public static final rpb f201497X0;

    /* JADX INFO: renamed from: Y */
    public static final rpb f201498Y;

    /* JADX INFO: renamed from: Y0 */
    public static final rpb f201499Y0;

    /* JADX INFO: renamed from: Z */
    public static final rpb f201500Z;

    /* JADX INFO: renamed from: Z0 */
    public static final rpb f201501Z0;

    /* JADX INFO: renamed from: a1 */
    public static final rpb f201502a1;

    /* JADX INFO: renamed from: b */
    public static final rpb f201503b;

    /* JADX INFO: renamed from: b1 */
    public static final rpb f201504b1;

    /* JADX INFO: renamed from: c */
    public static final rpb f201505c;

    /* JADX INFO: renamed from: c1 */
    public static final rpb f201506c1;

    /* JADX INFO: renamed from: d */
    public static final rpb f201507d;

    /* JADX INFO: renamed from: e */
    public static final rpb f201508e;

    /* JADX INFO: renamed from: f */
    public static final rpb f201509f;

    /* JADX INFO: renamed from: g */
    public static final rpb f201510g;

    /* JADX INFO: renamed from: h */
    public static final rpb f201511h;

    /* JADX INFO: renamed from: i */
    public static final rpb f201512i;

    /* JADX INFO: renamed from: t */
    public static final rpb f201513t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201514a;

    static {
        int i = 1;
        f201503b = new rpb(i, 0);
        f201505c = new rpb(i, 1);
        f201507d = new rpb(i, 2);
        f201508e = new rpb(i, 3);
        f201509f = new rpb(i, 4);
        f201510g = new rpb(i, 5);
        f201511h = new rpb(i, 6);
        f201512i = new rpb(i, 7);
        f201513t = new rpb(i, 8);
        f201496X = new rpb(i, 9);
        f201498Y = new rpb(i, 10);
        f201500Z = new rpb(i, 11);
        f201484L0 = new rpb(i, 12);
        f201485M0 = new rpb(i, 13);
        f201486N0 = new rpb(i, 14);
        f201487O0 = new rpb(i, 15);
        f201488P0 = new rpb(i, 16);
        f201489Q0 = new rpb(i, 17);
        f201490R0 = new rpb(i, 18);
        f201491S0 = new rpb(i, 19);
        f201492T0 = new rpb(i, 20);
        f201493U0 = new rpb(i, 21);
        f201494V0 = new rpb(i, 22);
        f201495W0 = new rpb(i, 23);
        f201497X0 = new rpb(i, 24);
        f201499Y0 = new rpb(i, 25);
        f201501Z0 = new rpb(i, 26);
        f201502a1 = new rpb(i, 27);
        f201504b1 = new rpb(i, 28);
        f201506c1 = new rpb(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpb(int i, int i2) {
        super(i);
        this.f201514a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f201514a) {
            case 0:
                return new ppb((xam) obj);
            case 1:
                return "canvas-disabled";
            case 2:
                return new zub((yub) obj, new j15(""));
            case 3:
                return gvb.f84713a;
            case 4:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 5:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                return videoSurfaceView;
            case 6:
                return w2a1.f247311a;
            case 7:
                return (i1c) obj;
            case 8:
                return ((i1c) obj).f97467d;
            case 9:
                ((Number) obj).intValue();
                return null;
            case 10:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return frameLayout;
            case 11:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 12:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 13:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 14:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 15:
                return Boolean.valueOf((obj instanceof eua1) || (obj instanceof w2a1));
            case 16:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (eua1) obj;
            case 17:
                return Boolean.valueOf(obj instanceof v140);
            case 18:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 19:
                return Boolean.valueOf(obj instanceof erc1);
            case 20:
                if (obj != null) {
                    return (erc1) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
            case 21:
                return (String) obj;
            case 22:
                return (String) obj;
            case 23:
                return ((t140) obj).f216153a;
            case 24:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return (String) obj;
            case 27:
                return w2a1.f247311a;
            case 28:
                jpz0.m53985C((mpz0) obj, true);
                return w2a1.f247311a;
            default:
                return g6f.m43736n1(((cjm0) obj).f38621d);
        }
    }
}
