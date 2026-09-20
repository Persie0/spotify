package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class df60 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final df60 f48468L0;

    /* JADX INFO: renamed from: M0 */
    public static final df60 f48469M0;

    /* JADX INFO: renamed from: N0 */
    public static final df60 f48470N0;

    /* JADX INFO: renamed from: O0 */
    public static final df60 f48471O0;

    /* JADX INFO: renamed from: P0 */
    public static final df60 f48472P0;

    /* JADX INFO: renamed from: Q0 */
    public static final df60 f48473Q0;

    /* JADX INFO: renamed from: R0 */
    public static final df60 f48474R0;

    /* JADX INFO: renamed from: S0 */
    public static final df60 f48475S0;

    /* JADX INFO: renamed from: T0 */
    public static final df60 f48476T0;

    /* JADX INFO: renamed from: U0 */
    public static final df60 f48477U0;

    /* JADX INFO: renamed from: V0 */
    public static final df60 f48478V0;

    /* JADX INFO: renamed from: W0 */
    public static final df60 f48479W0;

    /* JADX INFO: renamed from: X */
    public static final df60 f48480X;

    /* JADX INFO: renamed from: X0 */
    public static final df60 f48481X0;

    /* JADX INFO: renamed from: Y */
    public static final df60 f48482Y;

    /* JADX INFO: renamed from: Y0 */
    public static final df60 f48483Y0;

    /* JADX INFO: renamed from: Z */
    public static final df60 f48484Z;

    /* JADX INFO: renamed from: Z0 */
    public static final df60 f48485Z0;

    /* JADX INFO: renamed from: a1 */
    public static final df60 f48486a1;

    /* JADX INFO: renamed from: b */
    public static final df60 f48487b;

    /* JADX INFO: renamed from: b1 */
    public static final df60 f48488b1;

    /* JADX INFO: renamed from: c */
    public static final df60 f48489c;

    /* JADX INFO: renamed from: c1 */
    public static final df60 f48490c1;

    /* JADX INFO: renamed from: d */
    public static final df60 f48491d;

    /* JADX INFO: renamed from: e */
    public static final df60 f48492e;

    /* JADX INFO: renamed from: f */
    public static final df60 f48493f;

    /* JADX INFO: renamed from: g */
    public static final df60 f48494g;

    /* JADX INFO: renamed from: h */
    public static final df60 f48495h;

    /* JADX INFO: renamed from: i */
    public static final df60 f48496i;

    /* JADX INFO: renamed from: t */
    public static final df60 f48497t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48498a;

    static {
        int i = 1;
        f48487b = new df60(i, 0);
        f48489c = new df60(i, 1);
        f48491d = new df60(i, 2);
        f48492e = new df60(i, 3);
        f48493f = new df60(i, 4);
        f48494g = new df60(i, 5);
        f48495h = new df60(i, 6);
        f48496i = new df60(i, 7);
        f48497t = new df60(i, 8);
        f48480X = new df60(i, 9);
        f48482Y = new df60(i, 10);
        f48484Z = new df60(i, 11);
        f48468L0 = new df60(i, 12);
        f48469M0 = new df60(i, 13);
        f48470N0 = new df60(i, 14);
        f48471O0 = new df60(i, 15);
        f48472P0 = new df60(i, 16);
        f48473Q0 = new df60(i, 17);
        f48474R0 = new df60(i, 18);
        f48475S0 = new df60(i, 19);
        f48476T0 = new df60(i, 20);
        f48477U0 = new df60(i, 21);
        f48478V0 = new df60(i, 22);
        f48479W0 = new df60(i, 23);
        f48481X0 = new df60(i, 24);
        f48483Y0 = new df60(i, 25);
        f48485Z0 = new df60(i, 26);
        f48486a1 = new df60(i, 27);
        f48488b1 = new df60(i, 28);
        f48490c1 = new df60(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df60(int i, int i2) {
        super(i);
        this.f48498a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f48498a) {
            case 0:
                return new bf60(xe60.f260648d, kf60.f122067d, hf60.f90606a, 0.0f, false);
            case 1:
                jpz0.m53992f((mpz0) obj);
                return w2a1.f247311a;
            case 2:
                return vg60.f241148a;
            case 3:
                return ei60.f59798a;
            case 4:
                tch0 tch0Var = (tch0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), tch0Var.f219086a, tch0Var.f219087b.f195144b, System.currentTimeMillis());
            case 5:
                return aj60.f16178a;
            case 6:
                return fs60.f72776a;
            case 7:
                return new ls60();
            case 8:
                return ((ks60) obj).f125848a;
            case 9:
                return new ms60((v140) obj);
            case 10:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 11:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 12:
                s5a0 s5a0Var = ((vco) obj).f240176g;
                q5a0 q5a0Var = s5a0Var instanceof q5a0 ? (q5a0) s5a0Var : null;
                String str = q5a0Var != null ? q5a0Var.f185488b : null;
                if (str == null) {
                    str = "";
                }
                return new ks60(str);
            case 13:
                return new vs60((us60) obj, 3, false, false, false);
            case 14:
                return ((t140) obj).f216153a;
            case 15:
                return ((pu60) obj).f181373a;
            case 16:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 17:
                return ((View) obj).getContext();
            case 18:
                Context context = (Context) obj;
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 19:
                return Integer.valueOf(((Number) obj).intValue());
            case 20:
                return Integer.valueOf(((Number) obj).intValue());
            case 21:
                return new u070("", 1, inc1.f103951a);
            case 22:
                return pp91.m70529j(new pqm0("coppa_page_model", (crk) obj));
            case 23:
                return w2a1.f247311a;
            case 24:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 25:
                return pp91.m70529j(new pqm0("legal_page_model", (j580) obj));
            case 26:
                return pp91.m70529j(new pqm0("parental_controls_model_key", (k270) obj));
            case 27:
                return pp91.m70529j(new pqm0("model", (uym0) obj));
            case 28:
                return pp91.m70529j(new pqm0("kid_account_transition_consent_model", (p370) obj));
            default:
                return "kids-family-exclude-enabled";
        }
    }
}
