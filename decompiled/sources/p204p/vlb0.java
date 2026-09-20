package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.WindowInsets;
import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes8.dex */
public final class vlb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final vlb0 f242419L0;

    /* JADX INFO: renamed from: M0 */
    public static final vlb0 f242420M0;

    /* JADX INFO: renamed from: N0 */
    public static final vlb0 f242421N0;

    /* JADX INFO: renamed from: O0 */
    public static final vlb0 f242422O0;

    /* JADX INFO: renamed from: P0 */
    public static final vlb0 f242423P0;

    /* JADX INFO: renamed from: Q0 */
    public static final vlb0 f242424Q0;

    /* JADX INFO: renamed from: R0 */
    public static final vlb0 f242425R0;

    /* JADX INFO: renamed from: S0 */
    public static final vlb0 f242426S0;

    /* JADX INFO: renamed from: T0 */
    public static final vlb0 f242427T0;

    /* JADX INFO: renamed from: U0 */
    public static final vlb0 f242428U0;

    /* JADX INFO: renamed from: V0 */
    public static final vlb0 f242429V0;

    /* JADX INFO: renamed from: W0 */
    public static final vlb0 f242430W0;

    /* JADX INFO: renamed from: X */
    public static final vlb0 f242431X;

    /* JADX INFO: renamed from: X0 */
    public static final vlb0 f242432X0;

    /* JADX INFO: renamed from: Y */
    public static final vlb0 f242433Y;

    /* JADX INFO: renamed from: Y0 */
    public static final vlb0 f242434Y0;

    /* JADX INFO: renamed from: Z */
    public static final vlb0 f242435Z;

    /* JADX INFO: renamed from: Z0 */
    public static final vlb0 f242436Z0;

    /* JADX INFO: renamed from: a1 */
    public static final vlb0 f242437a1;

    /* JADX INFO: renamed from: b */
    public static final vlb0 f242438b;

    /* JADX INFO: renamed from: b1 */
    public static final vlb0 f242439b1;

    /* JADX INFO: renamed from: c */
    public static final vlb0 f242440c;

    /* JADX INFO: renamed from: c1 */
    public static final vlb0 f242441c1;

    /* JADX INFO: renamed from: d */
    public static final vlb0 f242442d;

    /* JADX INFO: renamed from: e */
    public static final vlb0 f242443e;

    /* JADX INFO: renamed from: f */
    public static final vlb0 f242444f;

    /* JADX INFO: renamed from: g */
    public static final vlb0 f242445g;

    /* JADX INFO: renamed from: h */
    public static final vlb0 f242446h;

    /* JADX INFO: renamed from: i */
    public static final vlb0 f242447i;

    /* JADX INFO: renamed from: t */
    public static final vlb0 f242448t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242449a;

    static {
        int i = 1;
        f242438b = new vlb0(i, 0);
        f242440c = new vlb0(i, 1);
        f242442d = new vlb0(i, 2);
        f242443e = new vlb0(i, 3);
        f242444f = new vlb0(i, 4);
        f242445g = new vlb0(i, 5);
        f242446h = new vlb0(i, 6);
        f242447i = new vlb0(i, 7);
        f242448t = new vlb0(i, 8);
        f242431X = new vlb0(i, 9);
        f242433Y = new vlb0(i, 10);
        f242435Z = new vlb0(i, 11);
        f242419L0 = new vlb0(i, 12);
        f242420M0 = new vlb0(i, 13);
        f242421N0 = new vlb0(i, 14);
        f242422O0 = new vlb0(i, 15);
        f242423P0 = new vlb0(i, 16);
        f242424Q0 = new vlb0(i, 17);
        f242425R0 = new vlb0(i, 18);
        f242426S0 = new vlb0(i, 19);
        f242427T0 = new vlb0(i, 20);
        f242428U0 = new vlb0(i, 21);
        f242429V0 = new vlb0(i, 22);
        f242430W0 = new vlb0(i, 23);
        f242432X0 = new vlb0(i, 24);
        f242434Y0 = new vlb0(i, 25);
        f242436Z0 = new vlb0(i, 26);
        f242437a1 = new vlb0(i, 27);
        f242439b1 = new vlb0(i, 28);
        f242441c1 = new vlb0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlb0(int i, int i2) {
        super(i);
        this.f242449a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f242449a) {
            case 0:
                return (Parcelable) zn91.m96523K((Bundle) obj, "parcelable", tmb0.class);
            case 1:
                return w2a1.f247311a;
            case 2:
                return new qnb0();
            case 3:
                return pp91.m70529j(new pqm0("stickers-picker-element-state-key", (qnb0) obj));
            case 4:
                ((jtp) obj).m54301a(f242443e, hza0.f96853P0);
                return w2a1.f247311a;
            case 5:
                ((gnb0) obj).getClass();
                return new e551("MESSAGING_LYRICS");
            case 6:
                return "country_code";
            case 7:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof w2a1));
            case 8:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (String) obj;
            case 9:
                return Boolean.valueOf(obj instanceof f551);
            case 10:
                if (obj != null) {
                    return (f551) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
            case 11:
                return w2a1.f247311a;
            case 12:
                return w2a1.f247311a;
            case 13:
                return w2a1.f247311a;
            case 14:
                return w2a1.f247311a;
            case 15:
                jpz0.m53985C((mpz0) obj, false);
                return w2a1.f247311a;
            case 16:
                return w2a1.f247311a;
            case 17:
                long j = ((Offset) obj).f493a;
                return w2a1.f247311a;
            case 18:
                return w2a1.f247311a;
            case 19:
                Bundle bundle = new Bundle();
                bundle.putParcelable("magic_link_already_authenticated_model", (wsb0) obj);
                return bundle;
            case 20:
                return w2a1.f247311a;
            case 21:
                return rfg1.m75445o(0, 14);
            case 22:
                return rfg1.m75445o(0, 14);
            case 23:
                return ((qwb0) obj).mo30122b();
            case 24:
                return rfg1.m75445o(0, 14);
            case 25:
                return ((qwb0) obj).mo30123c();
            case 26:
                return new oek0((nek0) obj);
            case 27:
                return ((qwb0) obj).mo30124d();
            case 28:
                return (WindowInsets) obj;
            default:
                return Integer.valueOf(((Number) obj).intValue() / 4);
        }
    }
}
