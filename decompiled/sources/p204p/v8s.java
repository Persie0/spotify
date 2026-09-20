package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.music.R;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public final class v8s extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final v8s f238650L0;

    /* JADX INFO: renamed from: M0 */
    public static final v8s f238651M0;

    /* JADX INFO: renamed from: N0 */
    public static final v8s f238652N0;

    /* JADX INFO: renamed from: O0 */
    public static final v8s f238653O0;

    /* JADX INFO: renamed from: P0 */
    public static final v8s f238654P0;

    /* JADX INFO: renamed from: Q0 */
    public static final v8s f238655Q0;

    /* JADX INFO: renamed from: R0 */
    public static final v8s f238656R0;

    /* JADX INFO: renamed from: S0 */
    public static final v8s f238657S0;

    /* JADX INFO: renamed from: T0 */
    public static final v8s f238658T0;

    /* JADX INFO: renamed from: U0 */
    public static final v8s f238659U0;

    /* JADX INFO: renamed from: V0 */
    public static final v8s f238660V0;

    /* JADX INFO: renamed from: W0 */
    public static final v8s f238661W0;

    /* JADX INFO: renamed from: X */
    public static final v8s f238662X;

    /* JADX INFO: renamed from: X0 */
    public static final v8s f238663X0;

    /* JADX INFO: renamed from: Y */
    public static final v8s f238664Y;

    /* JADX INFO: renamed from: Y0 */
    public static final v8s f238665Y0;

    /* JADX INFO: renamed from: Z */
    public static final v8s f238666Z;

    /* JADX INFO: renamed from: Z0 */
    public static final v8s f238667Z0;

    /* JADX INFO: renamed from: a1 */
    public static final v8s f238668a1;

    /* JADX INFO: renamed from: b */
    public static final v8s f238669b;

    /* JADX INFO: renamed from: b1 */
    public static final v8s f238670b1;

    /* JADX INFO: renamed from: c */
    public static final v8s f238671c;

    /* JADX INFO: renamed from: c1 */
    public static final v8s f238672c1;

    /* JADX INFO: renamed from: d */
    public static final v8s f238673d;

    /* JADX INFO: renamed from: e */
    public static final v8s f238674e;

    /* JADX INFO: renamed from: f */
    public static final v8s f238675f;

    /* JADX INFO: renamed from: g */
    public static final v8s f238676g;

    /* JADX INFO: renamed from: h */
    public static final v8s f238677h;

    /* JADX INFO: renamed from: i */
    public static final v8s f238678i;

    /* JADX INFO: renamed from: t */
    public static final v8s f238679t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238680a;

    static {
        int i = 0;
        f238669b = new v8s(i, 0);
        f238671c = new v8s(i, 1);
        f238673d = new v8s(i, 2);
        f238674e = new v8s(i, 3);
        f238675f = new v8s(i, 4);
        f238676g = new v8s(i, 5);
        f238677h = new v8s(i, 6);
        f238678i = new v8s(i, 7);
        f238679t = new v8s(i, 8);
        f238662X = new v8s(i, 9);
        f238664Y = new v8s(i, 10);
        f238666Z = new v8s(i, 11);
        f238650L0 = new v8s(i, 12);
        f238651M0 = new v8s(i, 13);
        f238652N0 = new v8s(i, 14);
        f238653O0 = new v8s(i, 15);
        f238654P0 = new v8s(i, 16);
        f238655Q0 = new v8s(i, 17);
        f238656R0 = new v8s(i, 18);
        f238657S0 = new v8s(i, 19);
        f238658T0 = new v8s(i, 20);
        f238659U0 = new v8s(i, 21);
        f238660V0 = new v8s(i, 22);
        f238661W0 = new v8s(i, 23);
        f238663X0 = new v8s(i, 24);
        f238665Y0 = new v8s(i, 25);
        f238667Z0 = new v8s(i, 26);
        f238668a1 = new v8s(i, 27);
        f238670b1 = new v8s(i, 28);
        f238672c1 = new v8s(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8s(int i, int i2) {
        super(i);
        this.f238680a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f238680a) {
            case 0:
                Integer numValueOf = Integer.valueOf(R.string.settings_item_download_quality_very_high_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf, null, null, null, null, null, false);
            case 1:
                Integer numValueOf2 = Integer.valueOf(R.string.settings_item_download_quality_lossless_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf2);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf2, null, null, null, null, null, false);
            case 2:
                return new Handler(Looper.getMainLooper());
            case 3:
                return new mj5(ql51.f189738a, 0);
            case 4:
                return new mj5(e450.f55982a, 0);
            case 5:
                return w2a1.f247311a;
            case 6:
                return sam.m77645B(Boolean.FALSE);
            case 7:
                return sam.m77645B(new o971(0L, 7, (String) null));
            case 8:
                return sam.m77645B(Boolean.FALSE);
            case 9:
                return sam.m77645B(Boolean.FALSE);
            case 10:
                return w2a1.f247311a;
            case 11:
                return sam.m77645B(Boolean.FALSE);
            case 12:
                return w2a1.f247311a;
            case 13:
                return sam.m77645B(Boolean.FALSE);
            case 14:
                return sam.m77645B(Boolean.FALSE);
            case 15:
                return new mj5(ect.f58384a, 0);
            case 16:
                return w2a1.f247311a;
            case 17:
                return Boolean.FALSE;
            case 18:
                return null;
            case 19:
                return new mj5(ql51.f189738a, 0);
            case 20:
                return w2a1.f247311a;
            case 21:
                throw new IllegalStateException("No EncoreTheme provided");
            case 22:
                return Boolean.FALSE;
            case 23:
                return w2a1.f247311a;
            case 24:
                String[] availableIDs = TimeZone.getAvailableIDs();
                HashSet hashSet = new HashSet(c95.m31820L(availableIDs.length));
                bk5.m29608e1(availableIDs, hashSet);
                return hashSet;
            case 25:
                throw new IllegalStateException("No EncoreLayoutTheme provided");
            case 26:
                return new kyu(null, 0, null, null, 31);
            case 27:
                return Float.valueOf(Float.POSITIVE_INFINITY);
            case 28:
                return cku.f39087a;
            default:
                throw new IllegalStateException("Encore theme was not provided. Please wrap your content with ProvideEncoreTheme. For @Previews use com.spotify.encore.tooling.preview.EncorePreview()");
        }
    }
}
