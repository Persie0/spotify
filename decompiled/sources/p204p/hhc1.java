package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hhc1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final hhc1 f91328L0;

    /* JADX INFO: renamed from: M0 */
    public static final hhc1 f91329M0;

    /* JADX INFO: renamed from: N0 */
    public static final hhc1 f91330N0;

    /* JADX INFO: renamed from: O0 */
    public static final hhc1 f91331O0;

    /* JADX INFO: renamed from: P0 */
    public static final hhc1 f91332P0;

    /* JADX INFO: renamed from: Q0 */
    public static final hhc1 f91333Q0;

    /* JADX INFO: renamed from: R0 */
    public static final hhc1 f91334R0;

    /* JADX INFO: renamed from: S0 */
    public static final hhc1 f91335S0;

    /* JADX INFO: renamed from: T0 */
    public static final hhc1 f91336T0;

    /* JADX INFO: renamed from: U0 */
    public static final hhc1 f91337U0;

    /* JADX INFO: renamed from: V0 */
    public static final hhc1 f91338V0;

    /* JADX INFO: renamed from: W0 */
    public static final hhc1 f91339W0;

    /* JADX INFO: renamed from: X */
    public static final hhc1 f91340X;

    /* JADX INFO: renamed from: X0 */
    public static final hhc1 f91341X0;

    /* JADX INFO: renamed from: Y */
    public static final hhc1 f91342Y;

    /* JADX INFO: renamed from: Y0 */
    public static final hhc1 f91343Y0;

    /* JADX INFO: renamed from: Z */
    public static final hhc1 f91344Z;

    /* JADX INFO: renamed from: Z0 */
    public static final hhc1 f91345Z0;

    /* JADX INFO: renamed from: a1 */
    public static final hhc1 f91346a1;

    /* JADX INFO: renamed from: b */
    public static final hhc1 f91347b;

    /* JADX INFO: renamed from: b1 */
    public static final hhc1 f91348b1;

    /* JADX INFO: renamed from: c */
    public static final hhc1 f91349c;

    /* JADX INFO: renamed from: c1 */
    public static final hhc1 f91350c1;

    /* JADX INFO: renamed from: d */
    public static final hhc1 f91351d;

    /* JADX INFO: renamed from: e */
    public static final hhc1 f91352e;

    /* JADX INFO: renamed from: f */
    public static final hhc1 f91353f;

    /* JADX INFO: renamed from: g */
    public static final hhc1 f91354g;

    /* JADX INFO: renamed from: h */
    public static final hhc1 f91355h;

    /* JADX INFO: renamed from: i */
    public static final hhc1 f91356i;

    /* JADX INFO: renamed from: t */
    public static final hhc1 f91357t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91358a;

    static {
        int i = 1;
        f91347b = new hhc1(i, 0);
        f91349c = new hhc1(i, 1);
        f91351d = new hhc1(i, 2);
        f91352e = new hhc1(i, 3);
        f91353f = new hhc1(i, 4);
        f91354g = new hhc1(i, 5);
        f91355h = new hhc1(i, 6);
        f91356i = new hhc1(i, 7);
        f91357t = new hhc1(i, 8);
        f91340X = new hhc1(i, 9);
        f91342Y = new hhc1(i, 10);
        f91344Z = new hhc1(i, 11);
        f91328L0 = new hhc1(i, 12);
        f91329M0 = new hhc1(i, 13);
        f91330N0 = new hhc1(i, 14);
        f91331O0 = new hhc1(i, 15);
        f91332P0 = new hhc1(i, 16);
        f91333Q0 = new hhc1(i, 17);
        f91334R0 = new hhc1(i, 18);
        f91335S0 = new hhc1(i, 19);
        f91336T0 = new hhc1(i, 20);
        f91337U0 = new hhc1(i, 21);
        f91338V0 = new hhc1(i, 22);
        f91339W0 = new hhc1(i, 23);
        f91341X0 = new hhc1(i, 24);
        f91343Y0 = new hhc1(i, 25);
        f91345Z0 = new hhc1(i, 26);
        f91346a1 = new hhc1(i, 27);
        f91348b1 = new hhc1(i, 28);
        f91350c1 = new hhc1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhc1(int i, int i2) {
        super(i);
        this.f91358a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f91358a) {
            case 0:
                Object tag = ((View) obj).getTag(R.id.view_tree_attention_tracker);
                if (tag instanceof cq6) {
                    return (cq6) tag;
                }
                return null;
            case 1:
                jx41 jx41Var = (jx41) obj;
                return dq60.m36616p(g6f.m43753y0(jx41Var.f116802c, ",", null, null, null, 62), "]", edb.m38573v("0x", Integer.toHexString(jx41Var.f116800a), "@", jx41Var.f116801b, "["));
            case 2:
                ViewParent parent = ((ViewGroup) obj).getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
                return null;
            case 3:
                return "view-listening-activity";
            case 4:
                return ((rch0) obj).m75308e();
            case 5:
                return new ysk(w2a1.f247311a, 27);
            case 6:
                vkc1 vkc1Var = (vkc1) obj;
                return new wkc1(vkc1Var.f242205c, vkc1Var.f242203a, vkc1Var.f242204b, vkc1Var.f242206d, vkc1Var.f242207e);
            case 7:
                Context context = (Context) obj;
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 8:
                Object parent2 = ((View) obj).getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            case 9:
                Object tag2 = ((View) obj).getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof ijc1) {
                    return (ijc1) tag2;
                }
                return null;
            case 10:
                return w2a1.f247311a;
            case 11:
                return w2a1.f247311a;
            case 12:
                ((Number) obj).intValue();
                return w2a1.f247311a;
            case 13:
                ((Boolean) obj).booleanValue();
                return w2a1.f247311a;
            case 14:
                return "spotify:internal:bluejay:update-voice";
            case 15:
                return new mvc1(((lvc1) obj).f137279a);
            case 16:
                ((icp) obj).f100858d = new flp0(5, 17, (fbk) null);
                return w2a1.f247311a;
            case 17:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 18:
                return w2a1.f247311a;
            case 19:
                return r3d1.f195488a;
            case 20:
                return pp91.m70529j(new pqm0("voting-model-v2-key", (i1d1) obj));
            case 21:
                return pp91.m70529j(new pqm0("voting-model-key", (i1d1) obj));
            case 22:
                return w2a1.f247311a;
            case 23:
                return w2a1.f247311a;
            case 24:
                return ((dx80) g6f.m43741q0((List) obj)).f53902f;
            case 25:
                return Boolean.valueOf(obj instanceof List);
            case 26:
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
            case 27:
                return k8d1.f120310a;
            case 28:
                return l8d1.f130847a;
            default:
                fdx0 fdx0Var = (fdx0) obj;
                fdx0Var.m41392p(fdx0Var.mo24619j() * 24);
                fdx0Var.m41393r(hmx0.f93097a);
                fdx0Var.m41384f(true);
                return w2a1.f247311a;
        }
    }
}
