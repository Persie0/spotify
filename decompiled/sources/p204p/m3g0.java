package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class m3g0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final m3g0 f139631L0;

    /* JADX INFO: renamed from: M0 */
    public static final m3g0 f139632M0;

    /* JADX INFO: renamed from: N0 */
    public static final m3g0 f139633N0;

    /* JADX INFO: renamed from: O0 */
    public static final m3g0 f139634O0;

    /* JADX INFO: renamed from: P0 */
    public static final m3g0 f139635P0;

    /* JADX INFO: renamed from: Q0 */
    public static final m3g0 f139636Q0;

    /* JADX INFO: renamed from: R0 */
    public static final m3g0 f139637R0;

    /* JADX INFO: renamed from: S0 */
    public static final m3g0 f139638S0;

    /* JADX INFO: renamed from: T0 */
    public static final m3g0 f139639T0;

    /* JADX INFO: renamed from: U0 */
    public static final m3g0 f139640U0;

    /* JADX INFO: renamed from: V0 */
    public static final m3g0 f139641V0;

    /* JADX INFO: renamed from: W0 */
    public static final m3g0 f139642W0;

    /* JADX INFO: renamed from: X */
    public static final m3g0 f139643X;

    /* JADX INFO: renamed from: X0 */
    public static final m3g0 f139644X0;

    /* JADX INFO: renamed from: Y */
    public static final m3g0 f139645Y;

    /* JADX INFO: renamed from: Y0 */
    public static final m3g0 f139646Y0;

    /* JADX INFO: renamed from: Z */
    public static final m3g0 f139647Z;

    /* JADX INFO: renamed from: Z0 */
    public static final m3g0 f139648Z0;

    /* JADX INFO: renamed from: a1 */
    public static final m3g0 f139649a1;

    /* JADX INFO: renamed from: b */
    public static final m3g0 f139650b;

    /* JADX INFO: renamed from: b1 */
    public static final m3g0 f139651b1;

    /* JADX INFO: renamed from: c */
    public static final m3g0 f139652c;

    /* JADX INFO: renamed from: c1 */
    public static final m3g0 f139653c1;

    /* JADX INFO: renamed from: d */
    public static final m3g0 f139654d;

    /* JADX INFO: renamed from: e */
    public static final m3g0 f139655e;

    /* JADX INFO: renamed from: f */
    public static final m3g0 f139656f;

    /* JADX INFO: renamed from: g */
    public static final m3g0 f139657g;

    /* JADX INFO: renamed from: h */
    public static final m3g0 f139658h;

    /* JADX INFO: renamed from: i */
    public static final m3g0 f139659i;

    /* JADX INFO: renamed from: t */
    public static final m3g0 f139660t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139661a;

    static {
        int i = 1;
        f139650b = new m3g0(i, 0);
        f139652c = new m3g0(i, 1);
        f139654d = new m3g0(i, 2);
        f139655e = new m3g0(i, 3);
        f139656f = new m3g0(i, 4);
        f139657g = new m3g0(i, 5);
        f139658h = new m3g0(i, 6);
        f139659i = new m3g0(i, 7);
        f139660t = new m3g0(i, 8);
        f139643X = new m3g0(i, 9);
        f139645Y = new m3g0(i, 10);
        f139647Z = new m3g0(i, 11);
        f139631L0 = new m3g0(i, 12);
        f139632M0 = new m3g0(i, 13);
        f139633N0 = new m3g0(i, 14);
        f139634O0 = new m3g0(i, 15);
        f139635P0 = new m3g0(i, 16);
        f139636Q0 = new m3g0(i, 17);
        f139637R0 = new m3g0(i, 18);
        f139638S0 = new m3g0(i, 19);
        f139639T0 = new m3g0(i, 20);
        f139640U0 = new m3g0(i, 21);
        f139641V0 = new m3g0(i, 22);
        f139642W0 = new m3g0(i, 23);
        f139644X0 = new m3g0(i, 24);
        f139646Y0 = new m3g0(i, 25);
        f139648Z0 = new m3g0(i, 26);
        f139649a1 = new m3g0(i, 27);
        f139651b1 = new m3g0(i, 28);
        f139653c1 = new m3g0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3g0(int i, int i2) {
        super(i);
        this.f139661a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        m340 m340Var;
        z240 z240VarM60640a;
        rfz rfzVar;
        switch (this.f139661a) {
            case 0:
                return new j590((String) obj);
            case 1:
                return (i490) obj;
            case 2:
                return Boolean.valueOf(obj instanceof i490);
            case 3:
                if (obj != null) {
                    return (i490) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
            case 4:
                return new s4g0((r4g0) obj, null, yjj0.f273379b);
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : v1r0.f236443L0) {
                    if (((v1r0) obj2) != v1r0.Unknown) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                Map map = (Map) obj;
                if (map == null) {
                    map = nau.f152117a;
                }
                return new u4g0(map);
            case 7:
                return Boolean.valueOf((obj instanceof Map) || (obj instanceof w2a1));
            case 8:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Map) obj;
            case 9:
                return edb.m38564m("mixing_style_picker_eq_", ((wbw) obj).name());
            case 10:
                return edb.m38564m("mixing_style_picker_filter_", ((f2z) obj).name());
            case 11:
                return edb.m38564m("mixing_style_picker_fx_", ((pk00) obj).name());
            case 12:
                return edb.m38564m("mixing_style_picker_jogwheel_", ((hg60) obj).name());
            case 13:
                return edb.m38564m("mixing_style_picker_looping_", ((h4b0) obj).name());
            case 14:
                long j = ((Offset) obj).f493a;
                return w2a1.f247311a;
            case 15:
                return edb.m38564m("mixing_style_picker_volume_", ((mzc1) obj).name());
            case 16:
                return new n5g0((m5g0) obj, null, null);
            case 17:
                return Boolean.valueOf(((m5g0) obj).f140227f);
            case 18:
                return ((m5g0) obj).f140222a;
            case 19:
                return ((m5g0) obj).f140222a;
            case 20:
                return Boolean.valueOf(obj instanceof v140);
            case 21:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 22:
                return Boolean.valueOf(obj instanceof erc1);
            case 23:
                if (obj != null) {
                    return (erc1) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
            case 24:
                return w2a1.f247311a;
            case 25:
                return new a6g0(((b6g0) obj).f23961a, t6g0.f217551a);
            case 26:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 27:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 28:
                return (String) obj;
            default:
                erc1 erc1Var = (erc1) obj;
                if (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11863d)) == null || (rfzVar = z240VarM60640a.f278475a) == null) {
                    return null;
                }
                return rfzVar.f198763a;
        }
    }
}
