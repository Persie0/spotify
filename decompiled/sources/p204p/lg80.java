package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class lg80 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final lg80 f133112L0;

    /* JADX INFO: renamed from: M0 */
    public static final lg80 f133113M0;

    /* JADX INFO: renamed from: N0 */
    public static final lg80 f133114N0;

    /* JADX INFO: renamed from: O0 */
    public static final lg80 f133115O0;

    /* JADX INFO: renamed from: P0 */
    public static final lg80 f133116P0;

    /* JADX INFO: renamed from: Q0 */
    public static final lg80 f133117Q0;

    /* JADX INFO: renamed from: R0 */
    public static final lg80 f133118R0;

    /* JADX INFO: renamed from: S0 */
    public static final lg80 f133119S0;

    /* JADX INFO: renamed from: T0 */
    public static final lg80 f133120T0;

    /* JADX INFO: renamed from: U0 */
    public static final lg80 f133121U0;

    /* JADX INFO: renamed from: V0 */
    public static final lg80 f133122V0;

    /* JADX INFO: renamed from: W0 */
    public static final lg80 f133123W0;

    /* JADX INFO: renamed from: X */
    public static final lg80 f133124X;

    /* JADX INFO: renamed from: X0 */
    public static final lg80 f133125X0;

    /* JADX INFO: renamed from: Y */
    public static final lg80 f133126Y;

    /* JADX INFO: renamed from: Y0 */
    public static final lg80 f133127Y0;

    /* JADX INFO: renamed from: Z */
    public static final lg80 f133128Z;

    /* JADX INFO: renamed from: Z0 */
    public static final lg80 f133129Z0;

    /* JADX INFO: renamed from: a1 */
    public static final lg80 f133130a1;

    /* JADX INFO: renamed from: b */
    public static final lg80 f133131b;

    /* JADX INFO: renamed from: b1 */
    public static final lg80 f133132b1;

    /* JADX INFO: renamed from: c */
    public static final lg80 f133133c;

    /* JADX INFO: renamed from: c1 */
    public static final lg80 f133134c1;

    /* JADX INFO: renamed from: d */
    public static final lg80 f133135d;

    /* JADX INFO: renamed from: e */
    public static final lg80 f133136e;

    /* JADX INFO: renamed from: f */
    public static final lg80 f133137f;

    /* JADX INFO: renamed from: g */
    public static final lg80 f133138g;

    /* JADX INFO: renamed from: h */
    public static final lg80 f133139h;

    /* JADX INFO: renamed from: i */
    public static final lg80 f133140i;

    /* JADX INFO: renamed from: t */
    public static final lg80 f133141t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133142a;

    static {
        int i = 1;
        f133131b = new lg80(i, 0);
        f133133c = new lg80(i, 1);
        f133135d = new lg80(i, 2);
        f133136e = new lg80(i, 3);
        f133137f = new lg80(i, 4);
        f133138g = new lg80(i, 5);
        f133139h = new lg80(i, 6);
        f133140i = new lg80(i, 7);
        f133141t = new lg80(i, 8);
        f133124X = new lg80(i, 9);
        f133126Y = new lg80(i, 10);
        f133128Z = new lg80(i, 11);
        f133112L0 = new lg80(i, 12);
        f133113M0 = new lg80(i, 13);
        f133114N0 = new lg80(i, 14);
        f133115O0 = new lg80(i, 15);
        f133116P0 = new lg80(i, 16);
        f133117Q0 = new lg80(i, 17);
        f133118R0 = new lg80(i, 18);
        f133119S0 = new lg80(i, 19);
        f133120T0 = new lg80(i, 20);
        f133121U0 = new lg80(i, 21);
        f133122V0 = new lg80(i, 22);
        f133123W0 = new lg80(i, 23);
        f133125X0 = new lg80(i, 24);
        f133127Y0 = new lg80(i, 25);
        f133129Z0 = new lg80(i, 26);
        f133130a1 = new lg80(i, 27);
        f133132b1 = new lg80(i, 28);
        f133134c1 = new lg80(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg80(int i, int i2) {
        super(i);
        this.f133142a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object eh80Var;
        int i = this.f133142a;
        gbu gbuVar = gbu.f78413a;
        w2a1 w2a1Var = w2a1.f247311a;
        ndl ndlVar = null;
        switch (i) {
            case 0:
                return new ig80(lau.f131415a, null);
            case 1:
                return hg80.f91060a;
            case 2:
                xg80 xg80Var = (xg80) obj;
                if (xg80Var instanceof rg80) {
                    return dh80.f49015a;
                }
                if (xg80Var instanceof wg80) {
                    return ih80.f102206a;
                }
                if (xg80Var instanceof ug80) {
                    eh80Var = new gh80(((ug80) xg80Var).f230015a);
                } else {
                    if (xg80Var instanceof tg80) {
                        return fh80.f69603a;
                    }
                    if (xg80Var instanceof vg80) {
                        eh80Var = new hh80(((vg80) xg80Var).f241179a);
                    } else {
                        if (!(xg80Var instanceof sg80)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eh80Var = new eh80(((sg80) xg80Var).f208768a);
                    }
                }
                return eh80Var;
            case 3:
                return new hi80(((gi80) obj).f80092a);
            case 4:
                switch (((fn81) obj).ordinal()) {
                    case 0:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return null;
                    case 1:
                        return ai80.f15908b;
                    case 2:
                        return ai80.f15907a;
                    case 8:
                        return bi80.f27351a;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 5:
                return gbuVar;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                gfp gfpVar = leu.f132721a;
                DrawScope.m275e0(drawScope, ((diu) iiu.f102631a.f258037b).f49476a, drawScope.mo35989Z0(12), 0L, 0.0f, null, 124);
                return w2a1Var;
            case 7:
                return w2a1Var;
            case 8:
                return new ti80((zle1) obj);
            case 9:
                return w2a1Var;
            case 10:
                return w2a1Var;
            case 11:
                return pp91.m70529j(new pqm0("parcelable", (Parcelable) obj));
            case 12:
                tm51 tm51Var = (tm51) obj;
                return new qt5(tm51Var.f221605a, tm51Var.f221606b, null);
            case 13:
                um51 um51Var = (um51) obj;
                return new cp81(um51Var.f231743a, um51Var.f231744b, um51Var.f231745c, null, um51Var.f231746d, 8);
            case 14:
                en51 en51Var = (en51) obj;
                return new vi81(en51Var.f61071a, en51Var.f61072b);
            case 15:
                return gbuVar;
            case 16:
                hs80 hs80Var = (hs80) obj;
                Bundle bundle = new Bundle();
                if (hs80Var instanceof xr80) {
                    bs80 bs80Var = ((xr80) hs80Var).f265289a;
                    if (bs80Var instanceof yr80) {
                        ndlVar = ((yr80) bs80Var).f275422a;
                    } else if (!wj50.m88271j(bs80Var, zr80.f285581a)) {
                        if (!(bs80Var instanceof as80)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ndlVar = ((as80) bs80Var).f19354a;
                    }
                    if (ndlVar != null) {
                        bundle.putParcelable("scrollIndex", ndlVar);
                    }
                } else if (hs80Var instanceof fs80) {
                    fs80 fs80Var = (fs80) hs80Var;
                    Object obj2 = ((sec1) fs80Var.f72802a.f212769b.get(fs80Var.f72803b)).f208275b;
                    if (obj2 instanceof ndl) {
                        bundle.putParcelable("scrollIndex", (Parcelable) obj2);
                    }
                }
                return bundle;
            case 17:
                Bundle bundle2 = (Bundle) obj;
                if (!bundle2.containsKey("scrollIndex")) {
                    return gs80.f83905a;
                }
                Parcelable parcelable = bundle2.getParcelable("scrollIndex");
                wj50.m88279p(parcelable);
                return new cs80(new as80((ndl) parcelable));
            case 18:
                Boolean bool = (Boolean) g6f.m43745s0((List) obj);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 19:
                return bw80.f31583b;
            case 20:
                return gbuVar;
            case 21:
                return Boolean.valueOf(obj instanceof Set);
            case 22:
                if (obj != null) {
                    return (Set) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<com.spotify.listplatform.endpoints.ListEndpoint.Configuration.Filter>");
            case 23:
                return new fw80((String) obj);
            case 24:
                return (Set) obj;
            case 25:
                return ((t140) obj).f216153a;
            case 26:
                return ru80.m76428d((qu80) obj);
            case 27:
                Set set = (Set) obj;
                int iM31820L = c95.m31820L(i6f.m49804T(set, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : set) {
                    linkedHashMap.put(obj3, njo.f154639a);
                }
                return linkedHashMap;
            case 28:
                return (List) obj;
            default:
                return Boolean.valueOf(((bpe1) obj).f29428e == jev.f111679t);
        }
    }
}
