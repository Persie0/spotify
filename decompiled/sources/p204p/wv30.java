package p204p;

import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes7.dex */
public final class wv30 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final wv30 f255358L0;

    /* JADX INFO: renamed from: M0 */
    public static final wv30 f255359M0;

    /* JADX INFO: renamed from: N0 */
    public static final wv30 f255360N0;

    /* JADX INFO: renamed from: O0 */
    public static final wv30 f255361O0;

    /* JADX INFO: renamed from: P0 */
    public static final wv30 f255362P0;

    /* JADX INFO: renamed from: Q0 */
    public static final wv30 f255363Q0;

    /* JADX INFO: renamed from: R0 */
    public static final wv30 f255364R0;

    /* JADX INFO: renamed from: S0 */
    public static final wv30 f255365S0;

    /* JADX INFO: renamed from: T0 */
    public static final wv30 f255366T0;

    /* JADX INFO: renamed from: U0 */
    public static final wv30 f255367U0;

    /* JADX INFO: renamed from: V0 */
    public static final wv30 f255368V0;

    /* JADX INFO: renamed from: W0 */
    public static final wv30 f255369W0;

    /* JADX INFO: renamed from: X */
    public static final wv30 f255370X;

    /* JADX INFO: renamed from: X0 */
    public static final wv30 f255371X0;

    /* JADX INFO: renamed from: Y */
    public static final wv30 f255372Y;

    /* JADX INFO: renamed from: Y0 */
    public static final wv30 f255373Y0;

    /* JADX INFO: renamed from: Z */
    public static final wv30 f255374Z;

    /* JADX INFO: renamed from: Z0 */
    public static final wv30 f255375Z0;

    /* JADX INFO: renamed from: a1 */
    public static final wv30 f255376a1;

    /* JADX INFO: renamed from: b */
    public static final wv30 f255377b;

    /* JADX INFO: renamed from: b1 */
    public static final wv30 f255378b1;

    /* JADX INFO: renamed from: c */
    public static final wv30 f255379c;

    /* JADX INFO: renamed from: c1 */
    public static final wv30 f255380c1;

    /* JADX INFO: renamed from: d */
    public static final wv30 f255381d;

    /* JADX INFO: renamed from: e */
    public static final wv30 f255382e;

    /* JADX INFO: renamed from: f */
    public static final wv30 f255383f;

    /* JADX INFO: renamed from: g */
    public static final wv30 f255384g;

    /* JADX INFO: renamed from: h */
    public static final wv30 f255385h;

    /* JADX INFO: renamed from: i */
    public static final wv30 f255386i;

    /* JADX INFO: renamed from: t */
    public static final wv30 f255387t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255388a;

    static {
        int i = 0;
        f255377b = new wv30(i, 0);
        f255379c = new wv30(i, 1);
        f255381d = new wv30(i, 2);
        f255382e = new wv30(i, 3);
        f255383f = new wv30(i, 4);
        f255384g = new wv30(i, 5);
        f255385h = new wv30(i, 6);
        f255386i = new wv30(i, 7);
        f255387t = new wv30(i, 8);
        f255370X = new wv30(i, 9);
        f255372Y = new wv30(i, 10);
        f255374Z = new wv30(i, 11);
        f255358L0 = new wv30(i, 12);
        f255359M0 = new wv30(i, 13);
        f255360N0 = new wv30(i, 14);
        f255361O0 = new wv30(i, 15);
        f255362P0 = new wv30(i, 16);
        f255363Q0 = new wv30(i, 17);
        f255364R0 = new wv30(i, 18);
        f255365S0 = new wv30(i, 19);
        f255366T0 = new wv30(i, 20);
        f255367U0 = new wv30(i, 21);
        f255368V0 = new wv30(i, 22);
        f255369W0 = new wv30(i, 23);
        f255371X0 = new wv30(i, 24);
        f255373Y0 = new wv30(i, 25);
        f255375Z0 = new wv30(i, 26);
        f255376a1 = new wv30(i, 27);
        f255378b1 = new wv30(i, 28);
        f255380c1 = new wv30(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv30(int i, int i2) {
        super(i);
        this.f255388a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f255388a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return w2a1Var;
            case 1:
                return new uum0(1.0f);
            case 2:
                return sam.m77645B(null);
            case 3:
                return sam.m77645B(null);
            case 4:
                return sam.m77645B(new o971(0L, 7, (String) null));
            case 5:
                return rmj.f200567a;
            case 6:
                return f255384g;
            case 7:
                return new mj5(l450.f129572a, 0);
            case 8:
                return Long.valueOf(System.nanoTime());
            case 9:
            case 10:
                return w2a1Var;
            case 11:
                BitrateLevel bitrateLevel = BitrateLevel.HIFI;
                o6k o6kVarM51370j = iqg1.m51370j(new BitrateLevel[0], bitrateLevel);
                o6k o6kVarM51369i = iqg1.m51369i();
                BitrateStrategy bitrateStrategy = BitrateStrategy.BEST_MATCHING;
                BitrateStrategy bitrateStrategy2 = BitrateStrategy.BACKEND_ADVISED;
                BitrateStrategy bitrateStrategy3 = BitrateStrategy.CACHED_FILE;
                o6k o6kVarM51370j2 = iqg1.m51370j(new BitrateStrategy[]{bitrateStrategy2, bitrateStrategy3}, bitrateStrategy);
                o6k o6kVarM51369i2 = iqg1.m51369i();
                Boolean bool = Boolean.TRUE;
                o6k o6kVarM51370j3 = iqg1.m51370j(new Boolean[0], bool);
                ngj0 ngj0Var = ngj0.f153722a;
                mi50 mi50Var = new mi50(o6kVarM51370j, o6kVarM51369i, o6kVarM51370j2, o6kVarM51369i2, o6kVarM51370j3, iqg1.m51370j(new ngj0[0], ngj0Var));
                ki50 ki50Var = ki50.f122819a;
                pqm0 pqm0Var = new pqm0(mi50Var, ki50Var);
                o6k o6kVar = li50.f133725a;
                pqm0 pqm0Var2 = new pqm0(new mi50(o6kVar, o6kVar, iqg1.m51370j(new BitrateStrategy[]{bitrateStrategy3}, bitrateStrategy), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new ngj0[0], ngj0Var)), ki50Var);
                mi50 mi50Var2 = new mi50(o6kVar, iqg1.m51370j(new BitrateLevel[0], bitrateLevel), iqg1.m51370j(new BitrateStrategy[]{bitrateStrategy2, bitrateStrategy3}, bitrateStrategy), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new ngj0[0], ngj0Var));
                ki50 ki50Var2 = ki50.f122820b;
                pqm0 pqm0Var3 = new pqm0(mi50Var2, ki50Var2);
                pqm0 pqm0Var4 = new pqm0(new mi50(o6kVar, o6kVar, iqg1.m51370j(new BitrateStrategy[0], bitrateStrategy2), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new ngj0[0], ngj0Var)), ki50Var2);
                o6k o6kVarM51370j4 = iqg1.m51370j(new BitrateLevel[0], bitrateLevel);
                o6k o6kVarM51369i3 = iqg1.m51369i();
                Boolean bool2 = Boolean.FALSE;
                pqm0 pqm0Var5 = new pqm0(new mi50(o6kVar, o6kVarM51370j4, o6kVarM51369i3, iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i()), ki50.f122822d);
                mi50 mi50Var3 = new mi50(iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new ngj0[0], ngj0.f153723b));
                ki50 ki50Var3 = ki50.f122821c;
                return new uw41(pqm0Var, pqm0Var2, pqm0Var3, pqm0Var4, pqm0Var5, new pqm0(mi50Var3, ki50Var3), new pqm0(new mi50(iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51369i()), ki50Var3), new pqm0(new mi50(iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new BitrateStrategy[0], BitrateStrategy.OFFLINED_FILE), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new ngj0[0], ngj0Var)), ki50Var3), new pqm0(new mi50(iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i()), ki50Var));
            case 12:
                return nlm0.Companion.serializer();
            case 13:
                return new mj5(rm9.f200479a, 0);
            case 14:
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.blend.tastematch.api.InvitationResponse", jqv0Var.mo54112b(im50.class), new up60[]{jqv0Var.mo54112b(qlx.class), jqv0Var.mo54112b(min0.class), jqv0Var.mo54112b(e2b1.class)}, new rr60[]{new hmk0("com.spotify.blend.tastematch.api.ExpiredInvitation", qlx.INSTANCE, new Annotation[0]), new hmk0("com.spotify.blend.tastematch.api.PendingInvitation", min0.INSTANCE, new Annotation[0]), c2b1.f33340a}, new Annotation[0]);
            case 15:
                return new mj5(wx8.f255964a, 0);
            case 16:
                return nau.f152117a;
            case 17:
            case 18:
                return w2a1Var;
            case 19:
                return kf60.f122067d;
            case 20:
                return new mj5(wx8.f255964a, 0);
            case 21:
                return new mj5(ql51.f189738a, 0);
            case 22:
            case 23:
            case 24:
                return w2a1Var;
            case 25:
                return new vum0(0);
            case 26:
                return new mj5(n180.f149336a, 0);
            case 27:
                return WorkRunners.m15651a();
            case 28:
                return new mj5(q1z.f184431a, 0);
            default:
                return new mj5(ql51.f189738a, 0);
        }
    }
}
