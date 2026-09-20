package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class kqs extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final kqs f125391L0;

    /* JADX INFO: renamed from: M0 */
    public static final kqs f125392M0;

    /* JADX INFO: renamed from: N0 */
    public static final kqs f125393N0;

    /* JADX INFO: renamed from: O0 */
    public static final kqs f125394O0;

    /* JADX INFO: renamed from: P0 */
    public static final kqs f125395P0;

    /* JADX INFO: renamed from: Q0 */
    public static final kqs f125396Q0;

    /* JADX INFO: renamed from: R0 */
    public static final kqs f125397R0;

    /* JADX INFO: renamed from: S0 */
    public static final kqs f125398S0;

    /* JADX INFO: renamed from: T0 */
    public static final kqs f125399T0;

    /* JADX INFO: renamed from: U0 */
    public static final kqs f125400U0;

    /* JADX INFO: renamed from: V0 */
    public static final kqs f125401V0;

    /* JADX INFO: renamed from: W0 */
    public static final kqs f125402W0;

    /* JADX INFO: renamed from: X */
    public static final kqs f125403X;

    /* JADX INFO: renamed from: X0 */
    public static final kqs f125404X0;

    /* JADX INFO: renamed from: Y */
    public static final kqs f125405Y;

    /* JADX INFO: renamed from: Y0 */
    public static final kqs f125406Y0;

    /* JADX INFO: renamed from: Z */
    public static final kqs f125407Z;

    /* JADX INFO: renamed from: Z0 */
    public static final kqs f125408Z0;

    /* JADX INFO: renamed from: a1 */
    public static final kqs f125409a1;

    /* JADX INFO: renamed from: b */
    public static final kqs f125410b;

    /* JADX INFO: renamed from: b1 */
    public static final kqs f125411b1;

    /* JADX INFO: renamed from: c */
    public static final kqs f125412c;

    /* JADX INFO: renamed from: c1 */
    public static final kqs f125413c1;

    /* JADX INFO: renamed from: d */
    public static final kqs f125414d;

    /* JADX INFO: renamed from: e */
    public static final kqs f125415e;

    /* JADX INFO: renamed from: f */
    public static final kqs f125416f;

    /* JADX INFO: renamed from: g */
    public static final kqs f125417g;

    /* JADX INFO: renamed from: h */
    public static final kqs f125418h;

    /* JADX INFO: renamed from: i */
    public static final kqs f125419i;

    /* JADX INFO: renamed from: t */
    public static final kqs f125420t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125421a;

    static {
        int i = 1;
        f125410b = new kqs(i, 0);
        f125412c = new kqs(i, 1);
        f125414d = new kqs(i, 2);
        f125415e = new kqs(i, 3);
        f125416f = new kqs(i, 4);
        f125417g = new kqs(i, 5);
        f125418h = new kqs(i, 6);
        f125419i = new kqs(i, 7);
        f125420t = new kqs(i, 8);
        f125403X = new kqs(i, 9);
        f125405Y = new kqs(i, 10);
        f125407Z = new kqs(i, 11);
        f125391L0 = new kqs(i, 12);
        f125392M0 = new kqs(i, 13);
        f125393N0 = new kqs(i, 14);
        f125394O0 = new kqs(i, 15);
        f125395P0 = new kqs(i, 16);
        f125396Q0 = new kqs(i, 17);
        f125397R0 = new kqs(i, 18);
        f125398S0 = new kqs(i, 19);
        f125399T0 = new kqs(i, 20);
        f125400U0 = new kqs(i, 21);
        f125401V0 = new kqs(i, 22);
        f125402W0 = new kqs(i, 23);
        f125404X0 = new kqs(i, 24);
        f125406Y0 = new kqs(i, 25);
        f125408Z0 = new kqs(i, 26);
        f125409a1 = new kqs(i, 27);
        f125411b1 = new kqs(i, 28);
        f125413c1 = new kqs(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqs(int i, int i2) {
        super(i);
        this.f125421a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f125421a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return new qq81(R.color.barbie_color, R.drawable.seekbar_thumb_default_barbie);
            case 1:
                return new qq81(R.color.black_panther_color, R.drawable.seekbar_thumb_default_vibranium);
            case 2:
                return new qq81(R.color.spiderman_color, R.drawable.seekbar_thumb_default_spiderman);
            case 3:
                if (((ac4) obj).m25423c()) {
                    return new qq81(R.color.pokemon_color, R.drawable.seekbar_thumb_default_pokemon);
                }
                return null;
            case 4:
                if (((ac4) obj).m25422b()) {
                    return new qq81(R.color.hello_kitty_color, R.drawable.seekbar_thumb_default_hello_kitty);
                }
                return null;
            case 5:
                if (((ac4) obj).m25429i()) {
                    return new qq81(R.color.wicked_color, R.drawable.seekbar_thumb_default_wicked);
                }
                return null;
            case 6:
                if (((ac4) obj).m25424d()) {
                    return new qq81(R.color.sanremo_color, R.drawable.seekbar_thumb_default_sanremo);
                }
                return null;
            case 7:
                if (((ac4) obj).m25428h()) {
                    return new qq81(R.color.wednesday_official_color, R.drawable.seekbar_thumb_default_wednesday_official);
                }
                return null;
            case 8:
                wrs wrsVar = (wrs) obj;
                String str = wrsVar.f254410a;
                cg9 cg9Var = wrsVar.f254411b;
                return new hss(str, str, cg9Var, cg9Var, wrsVar.f254412c, false, ess.f62460a);
            case 9:
                jpz0.m54004r((mpz0) obj, 0);
                return w2a1Var;
            case 10:
                jpz0.m54004r((mpz0) obj, 0);
                return w2a1Var;
            case 11:
                qr60[] qr60VarArr = jpz0.f114758a;
                ((mpz0) obj).mo62511a(hpz0.f93948e, w2a1Var);
                return w2a1Var;
            case 12:
                jpz0.m53989c((mpz0) obj);
                return w2a1Var;
            case 13:
                return new xss(gbu.f78413a, null);
            case 14:
                return new j590((String) obj);
            case 15:
                return (i490) obj;
            case 16:
                return Boolean.valueOf(obj instanceof i490);
            case 17:
                if (obj != null) {
                    return (i490) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
            case 18:
                return (hz80) obj;
            case 19:
                return wss.f254723a;
            case 20:
                return Boolean.valueOf(obj instanceof hz80);
            case 21:
                if (obj != null) {
                    return (hz80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
            case 22:
                return new zkg0((slg0) obj);
            case 23:
                return Boolean.valueOf(obj instanceof i490);
            case 24:
                if (obj != null) {
                    return (i490) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
            case 25:
                return new j590((String) obj);
            case 26:
                return (i490) obj;
            case 27:
                return new xts(((wts) obj).f255002b, false);
            case 28:
                return new uig0((slg0) obj);
            default:
                return Integer.valueOf(((Number) obj).intValue());
        }
    }
}
