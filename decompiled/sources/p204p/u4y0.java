package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.scannables.scannables.ScannablesActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class u4y0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final u4y0 f226827L0;

    /* JADX INFO: renamed from: M0 */
    public static final u4y0 f226828M0;

    /* JADX INFO: renamed from: N0 */
    public static final u4y0 f226829N0;

    /* JADX INFO: renamed from: O0 */
    public static final u4y0 f226830O0;

    /* JADX INFO: renamed from: P0 */
    public static final u4y0 f226831P0;

    /* JADX INFO: renamed from: Q0 */
    public static final u4y0 f226832Q0;

    /* JADX INFO: renamed from: R0 */
    public static final u4y0 f226833R0;

    /* JADX INFO: renamed from: S0 */
    public static final u4y0 f226834S0;

    /* JADX INFO: renamed from: T0 */
    public static final u4y0 f226835T0;

    /* JADX INFO: renamed from: U0 */
    public static final u4y0 f226836U0;

    /* JADX INFO: renamed from: V0 */
    public static final u4y0 f226837V0;

    /* JADX INFO: renamed from: W0 */
    public static final u4y0 f226838W0;

    /* JADX INFO: renamed from: X */
    public static final u4y0 f226839X;

    /* JADX INFO: renamed from: X0 */
    public static final u4y0 f226840X0;

    /* JADX INFO: renamed from: Y */
    public static final u4y0 f226841Y;

    /* JADX INFO: renamed from: Y0 */
    public static final u4y0 f226842Y0;

    /* JADX INFO: renamed from: Z */
    public static final u4y0 f226843Z;

    /* JADX INFO: renamed from: Z0 */
    public static final u4y0 f226844Z0;

    /* JADX INFO: renamed from: a1 */
    public static final u4y0 f226845a1;

    /* JADX INFO: renamed from: b */
    public static final u4y0 f226846b;

    /* JADX INFO: renamed from: b1 */
    public static final u4y0 f226847b1;

    /* JADX INFO: renamed from: c */
    public static final u4y0 f226848c;

    /* JADX INFO: renamed from: c1 */
    public static final u4y0 f226849c1;

    /* JADX INFO: renamed from: d */
    public static final u4y0 f226850d;

    /* JADX INFO: renamed from: e */
    public static final u4y0 f226851e;

    /* JADX INFO: renamed from: f */
    public static final u4y0 f226852f;

    /* JADX INFO: renamed from: g */
    public static final u4y0 f226853g;

    /* JADX INFO: renamed from: h */
    public static final u4y0 f226854h;

    /* JADX INFO: renamed from: i */
    public static final u4y0 f226855i;

    /* JADX INFO: renamed from: t */
    public static final u4y0 f226856t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226857a;

    static {
        int i = 1;
        f226846b = new u4y0(i, 0);
        f226848c = new u4y0(i, 1);
        f226850d = new u4y0(i, 2);
        f226851e = new u4y0(i, 3);
        f226852f = new u4y0(i, 4);
        f226853g = new u4y0(i, 5);
        f226854h = new u4y0(i, 6);
        f226855i = new u4y0(i, 7);
        f226856t = new u4y0(i, 8);
        f226839X = new u4y0(i, 9);
        f226841Y = new u4y0(i, 10);
        f226843Z = new u4y0(i, 11);
        f226827L0 = new u4y0(i, 12);
        f226828M0 = new u4y0(i, 13);
        f226829N0 = new u4y0(i, 14);
        f226830O0 = new u4y0(i, 15);
        f226831P0 = new u4y0(i, 16);
        f226832Q0 = new u4y0(i, 17);
        f226833R0 = new u4y0(i, 18);
        f226834S0 = new u4y0(i, 19);
        f226835T0 = new u4y0(i, 20);
        f226836U0 = new u4y0(i, 21);
        f226837V0 = new u4y0(i, 22);
        f226838W0 = new u4y0(i, 23);
        f226840X0 = new u4y0(i, 24);
        f226842Y0 = new u4y0(i, 25);
        f226844Z0 = new u4y0(i, 26);
        f226845a1 = new u4y0(i, 27);
        f226847b1 = new u4y0(i, 28);
        f226849c1 = new u4y0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4y0(int i, int i2) {
        super(i);
        this.f226857a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f226857a;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 0:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 1:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 2:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 3:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 4:
                return Boolean.valueOf((obj instanceof hz80) || (obj instanceof w2a1));
            case 5:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (hz80) obj;
            case 6:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 7:
                return ((rch0) obj).m75308e();
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                return rkh0.m75734h("=", entry.getKey(), entry.getValue());
            case 9:
                Map.Entry entry2 = (Map.Entry) obj;
                return rkh0.m75734h("=", entry2.getKey(), entry2.getValue());
            case 10:
                return new rby0(false);
            case 11:
                return ((qby0) obj).f187214b;
            case 12:
                return new pby0((y6s0) obj);
            case 13:
                return Boolean.valueOf((obj instanceof y6s0) || (obj instanceof w2a1));
            case 14:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (y6s0) obj;
            case 15:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), ((qkg0) obj).f189555a, st91.f213865b, System.currentTimeMillis());
            case 16:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), ((y4h0) obj).f269146a, st91.f213865b, System.currentTimeMillis());
            case 17:
                int i2 = ScannablesActivity.f6629i1;
                return new Intent((Context) obj, (Class<?>) ScannablesActivity.class);
            case 18:
                return ((wcy0) obj).f250144a;
            case 19:
                return new ly4((Context) obj);
            case 20:
                return new mfy0(((afy0) obj).f15243a, null, false);
            case 21:
                return Boolean.valueOf((obj instanceof hz80) || (obj instanceof w2a1));
            case 22:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (hz80) obj;
            case 23:
                return new iz80(((afy0) obj).f15243a);
            case 24:
                return Boolean.valueOf(umg1.m83449q((hz80) obj));
            case 25:
                return Integer.valueOf(((iky0) obj).f103240b);
            case 26:
                return Integer.valueOf(((iky0) obj).f103241c.m31424b());
            case 27:
                return Integer.valueOf(((Number) obj).intValue());
            case 28:
                return Integer.valueOf(((Number) obj).intValue());
            default:
                return Integer.valueOf(((Number) obj).intValue());
        }
    }
}
